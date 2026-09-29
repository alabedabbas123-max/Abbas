package com.abbas.ide.editor

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Typeface
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.InputType
import android.text.Spanned
import android.text.TextWatcher
import android.text.style.ForegroundColorSpan
import android.util.AttributeSet
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import com.abbas.ide.editor.highlight.LanguageRegistry
import com.abbas.ide.editor.highlight.SyntaxHighlighter
import com.abbas.ide.editor.theme.EditorTheme
import kotlin.math.max

/**
 * A lightweight source code editor built on top of [AppCompatEditText].
 *
 * Reusing the platform text engine keeps IME, selection handles, accessibility
 * and RTL behaviour correct for free; this class adds the code-specific parts:
 * a line-number gutter, regex syntax highlighting, undo/redo, auto indent and
 * bracket completion.
 */
class CodeEditor @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.editTextStyle,
) : AppCompatEditText(context, attrs, defStyleAttr) {

    private val gutterPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val gutterBackgroundPaint = Paint()
    private val currentLinePaint = Paint()

    private val undoManager = UndoManager()
    private val highlightHandler = Handler(Looper.getMainLooper())
    private val highlightRunnable = Runnable { applyHighlighting() }

    private var gutterWidth = 0
    private var isHighlighting = false

    /** Listener invoked whenever the buffer content changes by user action. */
    var onContentChanged: (() -> Unit)? = null

    var theme: EditorTheme = EditorTheme.DARK
        set(value) {
            field = value
            applyTheme()
        }

    var highlighter: SyntaxHighlighter = LanguageRegistry.forExtension("")
        set(value) {
            field = value
            scheduleHighlight(immediate = true)
        }

    var showLineNumbers: Boolean = true
        set(value) {
            field = value
            updateGutterWidth()
            invalidate()
        }

    var wordWrap: Boolean = false
        set(value) {
            field = value
            setHorizontallyScrolling(!value)
            requestLayout()
        }

    var tabSize: Int = 4
        set(value) {
            field = value.coerceIn(1, 8)
        }

    var autoIndent: Boolean = true
    var autoCloseBrackets: Boolean = true

    val canUndo: Boolean get() = undoManager.canUndo
    val canRedo: Boolean get() = undoManager.canRedo

    init {
        setTypeface(Typeface.MONOSPACE)
        setTextSize(TypedValue.COMPLEX_UNIT_SP, DEFAULT_TEXT_SIZE_SP)
        gravity = Gravity.TOP or Gravity.START
        // textDirection LTR keeps code readable even inside an RTL (Arabic) UI.
        textDirection = View.TEXT_DIRECTION_LTR
        setHorizontallyScrolling(true)
        setSingleLine(false)
        inputType = InputType.TYPE_CLASS_TEXT or
            InputType.TYPE_TEXT_FLAG_MULTI_LINE or
            InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
        setBackgroundColor(theme.background)
        includeFontPadding = false

        addTextChangedListener(EditorTextWatcher())
        applyTheme()
    }

    /**
     * Sets the font size in scaled pixels and keeps the gutter in sync.
     * Use this instead of [setTextSize] so the line-number column is remeasured.
     */
    fun setFontSizeSp(sizeSp: Float) {
        setTextSize(TypedValue.COMPLEX_UNIT_SP, sizeSp.coerceIn(8f, 32f))
        gutterPaint.textSize = textSize * GUTTER_TEXT_SCALE
        gutterWidth = 0
        updateGutterWidth()
        invalidate()
    }

    /** Loads [content] into the editor, resetting history and picking a language. */
    fun setContent(content: String, fileName: String) {
        highlighter = LanguageRegistry.forFileName(fileName)
        undoManager.clear()
        isHighlighting = true
        setText(content)
        isHighlighting = false
        setSelection(0)
        updateGutterWidth()
        scheduleHighlight(immediate = true)
    }

    fun undo() {
        val editable = text ?: return
        val caret = undoManager.undo(editable)
        if (caret >= 0) {
            setSelection(caret.coerceIn(0, editable.length))
            scheduleHighlight(immediate = true)
        }
    }

    fun redo() {
        val editable = text ?: return
        val caret = undoManager.redo(editable)
        if (caret >= 0) {
            setSelection(caret.coerceIn(0, editable.length))
            scheduleHighlight(immediate = true)
        }
    }

    /** Inserts [snippet] at the caret, replacing any selection. */
    fun insertAtCursor(snippet: String) {
        val editable = text ?: return
        val start = max(selectionStart, 0)
        val end = max(selectionEnd, 0)
        editable.replace(minOf(start, end), maxOf(start, end), snippet)
    }

    /** 1-based line number of the caret. */
    fun currentLine(): Int {
        val layout = layout ?: return 1
        return layout.getLineForOffset(selectionStart.coerceAtLeast(0)) + 1
    }

    /** 1-based column of the caret. */
    fun currentColumn(): Int {
        val layout = layout ?: return 1
        val offset = selectionStart.coerceAtLeast(0)
        val line = layout.getLineForOffset(offset)
        return offset - layout.getLineStart(line) + 1
    }

    fun scrollToLine(line: Int) {
        val layout = layout ?: return
        val target = (line - 1).coerceIn(0, lineCount - 1)
        val offset = layout.getLineStart(target)
        setSelection(offset)
        scrollTo(0, layout.getLineTop(target))
    }

    // region rendering

    private fun applyTheme() {
        setBackgroundColor(theme.background)
        setTextColor(theme.text)
        setHintTextColor(theme.gutterText)
        highlightColor = theme.selection
        gutterPaint.color = theme.gutterText
        gutterPaint.typeface = Typeface.MONOSPACE
        gutterPaint.textSize = textSize * GUTTER_TEXT_SCALE
        gutterPaint.textAlign = Paint.Align.RIGHT
        gutterBackgroundPaint.color = theme.gutterBackground
        currentLinePaint.color = theme.currentLine
        updateGutterWidth()
        scheduleHighlight(immediate = true)
        invalidate()
    }

    private fun updateGutterWidth() {
        val newWidth = if (showLineNumbers) {
            val digits = max(lineCount.toString().length, MIN_GUTTER_DIGITS)
            (gutterPaint.measureText("0".repeat(digits)) + GUTTER_PADDING_PX * 2).toInt()
        } else {
            0
        }
        if (newWidth != gutterWidth) {
            gutterWidth = newWidth
            setPadding(gutterWidth + CONTENT_PADDING_PX, paddingTop, CONTENT_PADDING_PX, paddingBottom)
        }
    }

    override fun onDraw(canvas: Canvas) {
        val layout = layout
        if (layout != null) {
            val left = scrollX.toFloat()

            // Current line highlight, drawn under the text.
            if (selectionStart >= 0 && selectionStart == selectionEnd) {
                val line = layout.getLineForOffset(selectionStart)
                val top = (layout.getLineTop(line) + totalPaddingTop).toFloat()
                val bottom = (layout.getLineBottom(line) + totalPaddingTop).toFloat()
                canvas.drawRect(left, top, left + width, bottom, currentLinePaint)
            }

            if (showLineNumbers && gutterWidth > 0) {
                canvas.drawRect(
                    left,
                    scrollY.toFloat(),
                    left + gutterWidth,
                    (scrollY + height).toFloat(),
                    gutterBackgroundPaint,
                )

                val firstVisible = layout.getLineForVertical(scrollY)
                val lastVisible = layout.getLineForVertical(scrollY + height)
                val textX = left + gutterWidth - GUTTER_PADDING_PX

                for (line in firstVisible..lastVisible) {
                    if (line < 0 || line >= layout.lineCount) continue
                    // With word wrap on, only label the first visual row of a logical line.
                    if (wordWrap && line > 0 &&
                        layout.getLineStart(line) != 0 &&
                        text?.getOrNull(layout.getLineStart(line) - 1) != '\n'
                    ) {
                        continue
                    }
                    val baseline = (layout.getLineBaseline(line) + totalPaddingTop).toFloat()
                    canvas.drawText((line + 1).toString(), textX, baseline, gutterPaint)
                }
            }
        }
        super.onDraw(canvas)
    }

    // endregion

    // region highlighting

    private fun scheduleHighlight(immediate: Boolean = false) {
        highlightHandler.removeCallbacks(highlightRunnable)
        if (immediate) {
            applyHighlighting()
        } else {
            highlightHandler.postDelayed(highlightRunnable, HIGHLIGHT_DELAY_MS)
        }
    }

    private fun applyHighlighting() {
        val editable = text ?: return
        if (editable.length > MAX_HIGHLIGHT_LENGTH) return

        isHighlighting = true
        try {
            editable.getSpans(0, editable.length, ForegroundColorSpan::class.java)
                .forEach { editable.removeSpan(it) }

            for (token in highlighter.tokenize(editable)) {
                if (token.end > editable.length) continue
                editable.setSpan(
                    ForegroundColorSpan(theme.colorFor(token.type)),
                    token.start,
                    token.end,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE,
                )
            }
        } finally {
            isHighlighting = false
        }
    }

    // endregion

    private inner class EditorTextWatcher : TextWatcher {

        private var replacedText: CharSequence = ""
        private var pendingIndentAt = -1

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            if (isHighlighting) return
            replacedText = s.subSequence(start, start + count).toString()
        }

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            if (isHighlighting) return
            val inserted = s.subSequence(start, start + count)
            undoManager.record(start, replacedText, inserted)

            pendingIndentAt = if (
                autoIndent &&
                !undoManager.isApplying &&
                count == 1 &&
                before == 0 &&
                inserted.getOrNull(0) == '\n'
            ) {
                start
            } else {
                -1
            }

            if (autoCloseBrackets && !undoManager.isApplying && count == 1 && before == 0) {
                val closing = CLOSING_FOR[inserted[0]]
                if (closing != null) {
                    post { insertClosing(start + 1, closing) }
                }
            }
        }

        override fun afterTextChanged(s: Editable) {
            if (isHighlighting) return

            if (pendingIndentAt >= 0) {
                val at = pendingIndentAt
                pendingIndentAt = -1
                applyAutoIndent(s, at)
            }

            updateGutterWidth()
            scheduleHighlight()
            onContentChanged?.invoke()
        }
    }

    private fun insertClosing(position: Int, closing: Char) {
        val editable = text ?: return
        if (position > editable.length) return
        // Only auto-close when the caret sits at the end of line or before a space.
        val next = editable.getOrNull(position)
        if (next != null && next != '\n' && !next.isWhitespace()) return
        if (selectionStart != position) return

        isHighlighting = true
        editable.insert(position, closing.toString())
        isHighlighting = false
        setSelection(position)
    }

    private fun applyAutoIndent(editable: Editable, newlineIndex: Int) {
        val lineStart = editable.lastIndexOf('\n', (newlineIndex - 1).coerceAtLeast(0))
            .let { if (it < 0) 0 else it + 1 }
        if (lineStart > newlineIndex) return

        val previousLine = editable.subSequence(lineStart, newlineIndex).toString()
        val indent = previousLine.takeWhile { it == ' ' || it == '\t' }
        val extra = if (previousLine.trimEnd().endsWith("{")) " ".repeat(tabSize) else ""
        val insertion = indent + extra
        if (insertion.isEmpty()) return

        val at = newlineIndex + 1
        if (at > editable.length) return

        isHighlighting = true
        editable.insert(at, insertion)
        isHighlighting = false
        setSelection((at + insertion.length).coerceAtMost(editable.length))
    }

    override fun onDetachedFromWindow() {
        highlightHandler.removeCallbacks(highlightRunnable)
        super.onDetachedFromWindow()
    }

    private companion object {
        const val DEFAULT_TEXT_SIZE_SP = 14f
        const val GUTTER_TEXT_SCALE = 0.85f
        const val GUTTER_PADDING_PX = 12f
        const val CONTENT_PADDING_PX = 16
        const val MIN_GUTTER_DIGITS = 2
        const val HIGHLIGHT_DELAY_MS = 180L
        const val MAX_HIGHLIGHT_LENGTH = 200_000

        val CLOSING_FOR = mapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}',
        )
    }
}
