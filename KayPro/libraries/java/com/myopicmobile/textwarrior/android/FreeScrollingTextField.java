package com.myopicmobile.textwarrior.android;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.ClipboardManager;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.method.CharacterPickerDialog;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.Scroller;
import com.baidu.mobstat.Config;
import com.myopicmobile.textwarrior.common.AutoIndent;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.ColorSchemeLight;
import com.myopicmobile.textwarrior.common.Document;
import com.myopicmobile.textwarrior.common.DocumentProvider;
import com.myopicmobile.textwarrior.common.Language;
import com.myopicmobile.textwarrior.common.LanguageLua;
import com.myopicmobile.textwarrior.common.Lexer;
import com.myopicmobile.textwarrior.common.Pair;
import com.myopicmobile.textwarrior.common.RowListener;
import com.myopicmobile.textwarrior.common.TextWarriorException;
import com.almlkaide.kaypro.android.dx.io.Opcodes;
import java.util.List;

public class FreeScrollingTextField extends View implements Document.TextFieldMetrics {
    public static final int SCROLL_DOWN = 1;
    public static final int SCROLL_LEFT = 2;
    public static final int SCROLL_RIGHT = 3;
    public static final int SCROLL_UP = 0;
    private int _alphaWidth;
    protected AutoCompletePanel _autoCompletePanel;
    protected int _autoIndentWidth;
    private Typeface _boldTypeface;
    private Paint _brush;
    private Paint _brushLine;
    protected int _caretPosition;
    private int _caretRow;
    private Pair _caretSpan;
    private int _caretX;
    private int _caretY;
    private ClipboardManager _clipboardManager;
    private ClipboardPanel _clipboardPanel;
    protected ColorScheme _colorScheme;
    private Typeface _defTypeface;
    private char _emoji;
    private TextFieldController _fieldController;
    protected DocumentProvider _hDoc;
    private TextFieldInputConnection _inputConnection;
    protected boolean _isAutoIndent;
    protected boolean _isEdited;
    protected boolean _isHighlightRow;
    private boolean _isLayout;
    protected boolean _isLongPressCaps;
    private Typeface _italicTypeface;
    private int _leftOffset;
    protected TouchNavigationMethod _navMethod;
    private RowListener _rowLis;
    private final Runnable _scrollCaretDownTask;
    private final Runnable _scrollCaretLeftTask;
    private final Runnable _scrollCaretRightTask;
    private final Runnable _scrollCaretUpTask;
    private final Scroller _scroller;
    private OnSelectionChangedListener _selModeLis;
    protected int _selectionAnchor;
    protected int _selectionEdge;
    private boolean _showLineNumbers;
    protected boolean _showNonPrinting;
    private int _spaceWidth;
    protected int _tabLength;
    private TextChangeListener _textLis;
    private int _topOffset;
    private int _xExtent;
    private float _zoomFactor;
    private long mLastScroll;
    protected static float EMPTY_CARET_WIDTH_SCALE = 0.75f;
    protected static float SEL_CARET_HEIGHT_SCALE = 0.5f;
    protected static int DEFAULT_TAB_LENGTH_SPACES = 4;
    protected static int BASE_TEXT_SIZE_PIXELS = 16;
    protected static long SCROLL_PERIOD = Opcodes.INVOKE_POLYMORPHIC;
    private static SparseArray<String> PICKER_SETS = new SparseArray<>();

    private class TextFieldController implements Lexer.LexCallback {
        private boolean _isInSelectionMode2;
        private final FreeScrollingTextField this$0;
        private boolean _isInSelectionMode = false;
        private final Lexer _lexer = new Lexer(this);

        public TextFieldController(FreeScrollingTextField freeScrollingTextField) {
            this.this$0 = freeScrollingTextField;
        }

        private char[] createAutoIndent() {
            char next;
            int lineOffset = this.this$0._hDoc.getLineOffset(this.this$0._hDoc.findLineNumber(this.this$0._caretPosition));
            this.this$0._hDoc.seekChar(lineOffset);
            int i = 0;
            while (this.this$0._hDoc.hasNext() && (((next = this.this$0._hDoc.next()) == ' ' || next == '\t') && lineOffset + i < this.this$0._caretPosition)) {
                i++;
            }
            int iCreateAutoIndent = (this.this$0._autoIndentWidth * AutoIndent.createAutoIndent(this.this$0._hDoc.subSequence(lineOffset, this.this$0._caretPosition - lineOffset))) + i;
            if (iCreateAutoIndent < 0) {
                return new char[]{'\n'};
            }
            char[] cArr = new char[iCreateAutoIndent + 1];
            cArr[0] = '\n';
            this.this$0._hDoc.seekChar(lineOffset);
            for (int i2 = 0; i2 < iCreateAutoIndent; i2++) {
                cArr[i2 + 1] = ' ';
            }
            return cArr;
        }

        private void updateAfterCaretJump() {
            int i = this.this$0._caretRow;
            updateCaretRow();
            if (!this.this$0.makeCharVisible(this.this$0._caretPosition)) {
                this.this$0.invalidateRows(i, i + 1);
                this.this$0.invalidateCaretRow();
            }
            stopTextComposing();
        }

        private void updateSelectionRange(int i, int i2) {
            if (this._isInSelectionMode) {
                if (i < this.this$0._selectionEdge) {
                    if (i2 <= this.this$0._selectionEdge) {
                        this.this$0._selectionAnchor = i2;
                        return;
                    }
                    this.this$0._selectionAnchor = this.this$0._selectionEdge;
                    this.this$0._selectionEdge = i2;
                    return;
                }
                if (i2 >= this.this$0._selectionAnchor) {
                    this.this$0._selectionEdge = i2;
                    return;
                }
                this.this$0._selectionEdge = this.this$0._selectionAnchor;
                this.this$0._selectionAnchor = i2;
            }
        }

        public void cancelSpanning() {
            this._lexer.cancelTokenize();
        }

        public void copy(ClipboardManager clipboardManager) {
            if (!this._isInSelectionMode || this.this$0._selectionAnchor >= this.this$0._selectionEdge) {
                return;
            }
            clipboardManager.setText(this.this$0._hDoc.subSequence(this.this$0._selectionAnchor, this.this$0._selectionEdge - this.this$0._selectionAnchor));
        }

        public void m7095cut(ClipboardManager clipboardManager) {
            copy(clipboardManager);
            selectionDelete();
        }

        void deleteAroundComposingText(int i, int i2) {
            int i3 = this.this$0._caretPosition - i;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = this.this$0._caretPosition + i2;
            int iDocLength = this.this$0._hDoc.docLength();
            if (i4 > iDocLength - 1) {
                i4 = iDocLength - 1;
            }
            replaceComposingText(i3, i4 - i3, "");
        }

        public void determineSpans() {
            this._lexer.tokenize(this.this$0._hDoc);
        }

        public void focusSelection(boolean z) {
            if (this._isInSelectionMode) {
                if (z && this.this$0._caretPosition != this.this$0._selectionAnchor) {
                    this.this$0._caretPosition = this.this$0._selectionAnchor;
                    updateAfterCaretJump();
                } else {
                    if (z || this.this$0._caretPosition == this.this$0._selectionEdge) {
                        return;
                    }
                    this.this$0._caretPosition = this.this$0._selectionEdge;
                    updateAfterCaretJump();
                }
            }
        }

        String getTextAfterCursor(int i) {
            int iDocLength = this.this$0._hDoc.docLength();
            return this.this$0._caretPosition + i > iDocLength + (-1) ? this.this$0._hDoc.subSequence(this.this$0._caretPosition, (iDocLength - this.this$0._caretPosition) - 1).toString() : this.this$0._hDoc.subSequence(this.this$0._caretPosition, i).toString();
        }

        String getTextBeforeCursor(int i) {
            int i2 = this.this$0._caretPosition - i;
            if (i2 < 0) {
                i2 = 0;
            }
            return this.this$0._hDoc.subSequence(i2, this.this$0._caretPosition - i2).toString();
        }

        public boolean inSelectionRange(int i) {
            return this.this$0._selectionAnchor >= 0 && this.this$0._selectionAnchor <= i && i < this.this$0._selectionEdge;
        }

        public final boolean isSelectText() {
            return this._isInSelectionMode;
        }

        public final boolean isSelectText2() {
            return this._isInSelectionMode2;
        }

        @Override
        public void lexDone(List<Pair> list) {
            this.this$0.post(new Runnable(this, list) {
                private final TextFieldController this$0;
                private final List val$results;

                {
                    this.this$0 = this;
                    this.val$results = list;
                }

                @Override
                public void run() {
                    this.this$0.this$0._hDoc.setSpans(this.val$results);
                    this.this$0.this$0.invalidate();
                }
            });
        }

        public void moveCaret(int i) {
            if (i < 0 || i >= this.this$0._hDoc.docLength()) {
                TextWarriorException.fail("Invalid caret position");
                return;
            }
            updateSelectionRange(this.this$0._caretPosition, i);
            this.this$0._caretPosition = i;
            updateAfterCaretJump();
        }

        public void moveCaretDown() {
            if (this.this$0.caretOnLastRowOfFile()) {
                return;
            }
            int i = this.this$0._caretPosition;
            int i2 = this.this$0._caretRow;
            int i3 = i2 + 1;
            int column = this.this$0.getColumn(i);
            int rowSize = this.this$0._hDoc.getRowSize(i2);
            int rowSize2 = this.this$0._hDoc.getRowSize(i3);
            if (column < rowSize2) {
                FreeScrollingTextField freeScrollingTextField = this.this$0;
                freeScrollingTextField._caretPosition = rowSize + freeScrollingTextField._caretPosition;
            } else {
                FreeScrollingTextField freeScrollingTextField2 = this.this$0;
                freeScrollingTextField2._caretPosition = (((rowSize - column) + rowSize2) - 1) + freeScrollingTextField2._caretPosition;
            }
            this.this$0._caretRow++;
            updateSelectionRange(i, this.this$0._caretPosition);
            if (!this.this$0.makeCharVisible(this.this$0._caretPosition)) {
                this.this$0.invalidateRows(i2, i3 + 1);
            }
            this.this$0._rowLis.onRowChange(i3);
            stopTextComposing();
        }

        public void moveCaretLeft(boolean z) {
            if (this.this$0._caretPosition > 0) {
                int i = this.this$0._caretRow;
                this.this$0._caretPosition--;
                updateCaretRow();
                updateSelectionRange(this.this$0._caretPosition + 1, this.this$0._caretPosition);
                if (!this.this$0.makeCharVisible(this.this$0._caretPosition)) {
                    this.this$0.invalidateRows(this.this$0._caretRow, i + 1);
                }
                if (z) {
                    return;
                }
                stopTextComposing();
            }
        }

        public void moveCaretRight(boolean z) {
            if (this.this$0.caretOnEOF()) {
                return;
            }
            int i = this.this$0._caretRow;
            this.this$0._caretPosition++;
            updateCaretRow();
            updateSelectionRange(this.this$0._caretPosition - 1, this.this$0._caretPosition);
            if (!this.this$0.makeCharVisible(this.this$0._caretPosition)) {
                this.this$0.invalidateRows(i, this.this$0._caretRow + 1);
            }
            if (z) {
                return;
            }
            stopTextComposing();
        }

        public void moveCaretUp() {
            if (this.this$0.caretOnFirstRowOfFile()) {
                return;
            }
            int i = this.this$0._caretPosition;
            int i2 = this.this$0._caretRow;
            int i3 = i2 - 1;
            int column = this.this$0.getColumn(i);
            int rowSize = this.this$0._hDoc.getRowSize(i3);
            if (column < rowSize) {
                this.this$0._caretPosition -= rowSize;
            } else {
                this.this$0._caretPosition -= column + 1;
            }
            this.this$0._caretRow--;
            updateSelectionRange(i, this.this$0._caretPosition);
            if (!this.this$0.makeCharVisible(this.this$0._caretPosition)) {
                this.this$0.invalidateRows(i3, i2 + 1);
            }
            this.this$0._rowLis.onRowChange(i3);
            stopTextComposing();
        }

        public void onPrintableChar(char c) {
            boolean z = false;
            if (this._isInSelectionMode) {
                selectionDelete();
                z = true;
            }
            int i = this.this$0._caretRow;
            int rowOffset = this.this$0._hDoc.getRowOffset(i);
            switch (c) {
                case '\b':
                    if (!z && this.this$0._caretPosition > 0) {
                        this.this$0._hDoc.deleteAt(this.this$0._caretPosition - 1, System.nanoTime());
                        if (this.this$0._hDoc.charAt(this.this$0._caretPosition - 2) == 55357 || this.this$0._hDoc.charAt(this.this$0._caretPosition - 2) == 55356) {
                            this.this$0._hDoc.deleteAt(this.this$0._caretPosition - 2, System.nanoTime());
                            moveCaretLeft(true);
                        }
                        this.this$0._textLis.onDel(new StringBuffer().append(c).append("").toString(), this.this$0._caretPosition, 1);
                        moveCaretLeft(true);
                        if (this.this$0._caretRow < i) {
                            this.this$0.invalidateFromRow(this.this$0._caretRow);
                        } else if (this.this$0._hDoc.isWordWrap()) {
                            this.this$0.invalidateFromRow(rowOffset != this.this$0._hDoc.getRowOffset(i) ? i - 1 : i);
                        }
                    }
                    break;
                case '\t':
                default:
                    this.this$0._hDoc.insertBefore(c, this.this$0._caretPosition, System.nanoTime());
                    moveCaretRight(true);
                    this.this$0._textLis.onAdd(new StringBuffer().append(c).append("").toString(), this.this$0._caretPosition, 1);
                    if (this.this$0._hDoc.isWordWrap()) {
                        if (rowOffset != this.this$0._hDoc.getRowOffset(i)) {
                            i--;
                        }
                        this.this$0.invalidateFromRow(i);
                    }
                    break;
                case '\n':
                    if (this.this$0._isAutoIndent) {
                        char[] cArrCreateAutoIndent = createAutoIndent();
                        this.this$0._hDoc.insertBefore(cArrCreateAutoIndent, this.this$0._caretPosition, System.nanoTime());
                        moveCaret(cArrCreateAutoIndent.length + this.this$0._caretPosition);
                    } else {
                        this.this$0._hDoc.insertBefore(c, this.this$0._caretPosition, System.nanoTime());
                        moveCaretRight(true);
                    }
                    if (this.this$0._hDoc.isWordWrap() && rowOffset != this.this$0._hDoc.getRowOffset(i)) {
                        i--;
                    }
                    this.this$0._textLis.onNewLine(new StringBuffer().append(c).append("").toString(), this.this$0._caretPosition, 1);
                    this.this$0.invalidateFromRow(i);
                    break;
            }
            this.this$0.setEdited(true);
            determineSpans();
        }

        public void paste(String str) {
            if (str == null) {
                return;
            }
            this.this$0._hDoc.beginBatchEdit();
            selectionDelete();
            int i = this.this$0._caretRow;
            int rowOffset = this.this$0._hDoc.getRowOffset(i);
            this.this$0._hDoc.insertBefore(str.toCharArray(), this.this$0._caretPosition, System.nanoTime());
            this.this$0._textLis.onAdd(str, this.this$0._caretPosition, str.length());
            this.this$0._hDoc.endBatchEdit();
            this.this$0._caretPosition += str.length();
            updateCaretRow();
            this.this$0.setEdited(true);
            determineSpans();
            stopTextComposing();
            if (this.this$0.makeCharVisible(this.this$0._caretPosition)) {
                return;
            }
            int i2 = (!this.this$0._hDoc.isWordWrap() || rowOffset == this.this$0._hDoc.getRowOffset(i)) ? i : i - 1;
            if (i != this.this$0._caretRow || this.this$0._hDoc.isWordWrap()) {
                this.this$0.invalidateFromRow(i2);
            } else {
                this.this$0.invalidateRows(i2, i2 + 1);
            }
        }

        void replaceComposingText(int i, int i2, String str) {
            int iFindRowNumber;
            int rowOffset;
            boolean z;
            boolean z2;
            int rowOffset2;
            boolean z3;
            boolean z4;
            boolean z5;
            if (this._isInSelectionMode) {
                iFindRowNumber = this.this$0._hDoc.findRowNumber(this.this$0._selectionAnchor);
                rowOffset = this.this$0._hDoc.getRowOffset(iFindRowNumber);
                int i3 = this.this$0._selectionEdge - this.this$0._selectionAnchor;
                if (i3 > 0) {
                    this.this$0._caretPosition = this.this$0._selectionAnchor;
                    this.this$0._hDoc.deleteAt(this.this$0._selectionAnchor, i3, System.nanoTime());
                    z5 = iFindRowNumber == this.this$0._caretRow;
                    z4 = true;
                } else {
                    z4 = false;
                    z5 = true;
                }
                setSelectText(false);
                z = z4;
                z2 = z5;
            } else {
                iFindRowNumber = this.this$0._caretRow;
                rowOffset = this.this$0._hDoc.getRowOffset(this.this$0._caretRow);
                z = false;
                z2 = true;
            }
            if (i2 > 0) {
                int iFindRowNumber2 = this.this$0._hDoc.findRowNumber(i);
                if (iFindRowNumber2 < iFindRowNumber) {
                    rowOffset2 = this.this$0._hDoc.getRowOffset(iFindRowNumber2);
                } else {
                    rowOffset2 = rowOffset;
                    iFindRowNumber2 = iFindRowNumber;
                }
                boolean z6 = iFindRowNumber2 != this.this$0._caretRow ? false : z2;
                this.this$0._caretPosition = i;
                this.this$0._hDoc.deleteAt(i, i2, System.nanoTime());
                z = true;
                z2 = z6;
                iFindRowNumber = iFindRowNumber2;
            } else {
                rowOffset2 = rowOffset;
            }
            if (str == null || str.length() <= 0) {
                z3 = z;
            } else {
                int iFindRowNumber3 = this.this$0._hDoc.findRowNumber(i);
                if (iFindRowNumber3 < iFindRowNumber) {
                    rowOffset2 = this.this$0._hDoc.getRowOffset(iFindRowNumber3);
                } else {
                    iFindRowNumber3 = iFindRowNumber;
                }
                this.this$0._hDoc.insertBefore(str.toCharArray(), this.this$0._caretPosition, System.nanoTime());
                this.this$0._caretPosition += str.length();
                z3 = true;
                iFindRowNumber = iFindRowNumber3;
            }
            this.this$0._textLis.onAdd(str, this.this$0._caretPosition, str.length() - i2);
            if (z3) {
                this.this$0.setEdited(true);
                determineSpans();
            }
            int i4 = this.this$0._caretRow;
            updateCaretRow();
            boolean z7 = i4 == this.this$0._caretRow ? z2 : false;
            if (this.this$0.makeCharVisible(this.this$0._caretPosition)) {
                return;
            }
            if (this.this$0._hDoc.isWordWrap() && rowOffset2 != this.this$0._hDoc.getRowOffset(iFindRowNumber)) {
                iFindRowNumber--;
            }
            if (!z7 || this.this$0._hDoc.isWordWrap()) {
                this.this$0.invalidateFromRow(iFindRowNumber);
            } else {
                this.this$0.invalidateRows(this.this$0._caretRow, this.this$0._caretRow + 1);
            }
        }

        void replaceText(int i, int i2, String str) {
            int iFindRowNumber;
            int rowOffset;
            boolean z;
            boolean z2;
            int rowOffset2;
            boolean z3;
            int iFindRowNumber2;
            boolean z4;
            boolean z5;
            if (this._isInSelectionMode) {
                iFindRowNumber = this.this$0._hDoc.findRowNumber(this.this$0._selectionAnchor);
                rowOffset = this.this$0._hDoc.getRowOffset(iFindRowNumber);
                int i3 = this.this$0._selectionEdge - this.this$0._selectionAnchor;
                if (i3 > 0) {
                    this.this$0._caretPosition = this.this$0._selectionAnchor;
                    this.this$0._hDoc.deleteAt(this.this$0._selectionAnchor, i3, System.nanoTime());
                    z5 = iFindRowNumber == this.this$0._caretRow;
                    z4 = true;
                } else {
                    z4 = false;
                    z5 = true;
                }
                setSelectText(false);
                z = z4;
                z2 = z5;
            } else {
                iFindRowNumber = this.this$0._caretRow;
                rowOffset = this.this$0._hDoc.getRowOffset(this.this$0._caretRow);
                z = false;
                z2 = true;
            }
            if (i2 > 0) {
                int iFindRowNumber3 = this.this$0._hDoc.findRowNumber(i);
                if (iFindRowNumber3 < iFindRowNumber) {
                    rowOffset2 = this.this$0._hDoc.getRowOffset(iFindRowNumber3);
                } else {
                    rowOffset2 = rowOffset;
                    iFindRowNumber3 = iFindRowNumber;
                }
                boolean z6 = iFindRowNumber3 != this.this$0._caretRow ? false : z2;
                this.this$0._caretPosition = i;
                this.this$0._hDoc.deleteAt(i, i2, System.nanoTime());
                z = true;
                z2 = z6;
                iFindRowNumber = iFindRowNumber3;
            } else {
                rowOffset2 = rowOffset;
            }
            if (str == null || str.length() <= 0) {
                z3 = z;
                iFindRowNumber2 = iFindRowNumber;
            } else {
                iFindRowNumber2 = this.this$0._hDoc.findRowNumber(i);
                if (iFindRowNumber2 < iFindRowNumber) {
                    rowOffset2 = this.this$0._hDoc.getRowOffset(iFindRowNumber2);
                } else {
                    iFindRowNumber2 = iFindRowNumber;
                }
                this.this$0._hDoc.insertBefore(str.toCharArray(), this.this$0._caretPosition, System.nanoTime());
                this.this$0._caretPosition += str.length();
                z3 = true;
            }
            if (z3) {
                this.this$0.setEdited(true);
                determineSpans();
            }
            int i4 = this.this$0._caretRow;
            updateCaretRow();
            boolean z7 = i4 == this.this$0._caretRow ? z2 : false;
            if (this.this$0.makeCharVisible(this.this$0._caretPosition)) {
                return;
            }
            int i5 = (!this.this$0._hDoc.isWordWrap() || rowOffset2 == this.this$0._hDoc.getRowOffset(iFindRowNumber2)) ? iFindRowNumber2 : iFindRowNumber2 - 1;
            if (!z7 || this.this$0._hDoc.isWordWrap()) {
                this.this$0.invalidateFromRow(i5);
            } else {
                this.this$0.invalidateRows(this.this$0._caretRow, this.this$0._caretRow + 1);
            }
        }

        public void selectionDelete() {
            if (this._isInSelectionMode) {
                int i = this.this$0._selectionEdge - this.this$0._selectionAnchor;
                if (i <= 0) {
                    setSelectText(false);
                    this.this$0.invalidateCaretRow();
                    return;
                }
                int iFindRowNumber = this.this$0._hDoc.findRowNumber(this.this$0._selectionAnchor);
                int rowOffset = this.this$0._hDoc.getRowOffset(iFindRowNumber);
                boolean z = this.this$0._hDoc.findRowNumber(this.this$0._selectionEdge) == iFindRowNumber;
                this.this$0._hDoc.deleteAt(this.this$0._selectionAnchor, i, System.nanoTime());
                this.this$0._textLis.onDel("", this.this$0._caretPosition, i);
                this.this$0._caretPosition = this.this$0._selectionAnchor;
                updateCaretRow();
                this.this$0.setEdited(true);
                determineSpans();
                setSelectText(false);
                stopTextComposing();
                if (this.this$0.makeCharVisible(this.this$0._caretPosition)) {
                    return;
                }
                int i2 = (!this.this$0._hDoc.isWordWrap() || rowOffset == this.this$0._hDoc.getRowOffset(iFindRowNumber)) ? iFindRowNumber : iFindRowNumber - 1;
                if (!z || this.this$0._hDoc.isWordWrap()) {
                    this.this$0.invalidateFromRow(i2);
                } else {
                    this.this$0.invalidateRows(i2, i2 + 1);
                }
            }
        }

        public void setSelectText(boolean z) {
            if (this._isInSelectionMode ^ z) {
                if (z) {
                    this.this$0._selectionAnchor = this.this$0._caretPosition;
                    this.this$0._selectionEdge = this.this$0._caretPosition;
                } else {
                    this.this$0._selectionAnchor = -1;
                    this.this$0._selectionEdge = -1;
                }
                this._isInSelectionMode = z;
                this._isInSelectionMode2 = z;
                this.this$0._selModeLis.onSelectionChanged(z, this.this$0.getSelectionStart(), this.this$0.getSelectionEnd());
            }
        }

        public void setSelectionRange(int i, int i2, boolean z, boolean z2) {
            TextWarriorException.assertVerbose(i >= 0 && i2 <= this.this$0._hDoc.docLength() + (-1) && i2 >= 0, "Invalid range to select");
            if (this._isInSelectionMode) {
                this.this$0.invalidateSelectionRows();
            } else {
                this.this$0.invalidateCaretRow();
                if (z2) {
                    setSelectText(true);
                } else {
                    this._isInSelectionMode = true;
                }
            }
            this.this$0._selectionAnchor = i;
            this.this$0._selectionEdge = this.this$0._selectionAnchor + i2;
            this.this$0._caretPosition = this.this$0._selectionEdge;
            stopTextComposing();
            updateCaretRow();
            if (z2) {
                this.this$0._selModeLis.onSelectionChanged(isSelectText(), this.this$0._selectionAnchor, this.this$0._selectionEdge);
            }
            boolean zMakeCharVisible = this.this$0.makeCharVisible(this.this$0._selectionEdge);
            if (z) {
                zMakeCharVisible = this.this$0.makeCharVisible(this.this$0._selectionAnchor);
            }
            if (zMakeCharVisible) {
                return;
            }
            this.this$0.invalidateSelectionRows();
        }

        public void stopTextComposing() {
            ((InputMethodManager) this.this$0.getContext().getSystemService("input_method")).restartInput(this.this$0);
            if (this.this$0._inputConnection == null || !this.this$0._inputConnection.isComposingStarted()) {
                return;
            }
            this.this$0._inputConnection.resetComposingState();
        }

        void updateCaretRow() {
            int iFindRowNumber = this.this$0._hDoc.findRowNumber(this.this$0._caretPosition);
            if (this.this$0._caretRow != iFindRowNumber) {
                this.this$0._caretRow = iFindRowNumber;
                this.this$0._rowLis.onRowChange(iFindRowNumber);
            }
        }
    }

    private class TextFieldInputConnection extends BaseInputConnection {
        private int _composingCharCount;
        private boolean _isComposing;
        private final FreeScrollingTextField this$0;

        public TextFieldInputConnection(FreeScrollingTextField freeScrollingTextField, FreeScrollingTextField freeScrollingTextField2) {
            super(freeScrollingTextField2, true);
            this.this$0 = freeScrollingTextField;
            this._isComposing = false;
            this._composingCharCount = 0;
        }

        @Override
        public boolean commitText(CharSequence charSequence, int i) {
            this.this$0._fieldController.replaceComposingText(this.this$0.getCaretPosition() - this._composingCharCount, this._composingCharCount, charSequence.toString());
            this._composingCharCount = 0;
            this.this$0._hDoc.endBatchEdit();
            if (i > 1) {
                this.this$0._fieldController.moveCaret((this.this$0._caretPosition + i) - 1);
            } else if (i <= 0) {
                this.this$0._fieldController.moveCaret((this.this$0._caretPosition - charSequence.length()) - i);
            }
            this._isComposing = false;
            return true;
        }

        @Override
        public boolean deleteSurroundingText(int i, int i2) {
            if (this._composingCharCount != 0) {
                Log.d("lua", new StringBuffer().append("Warning: Implmentation of InputConnection.deleteSurroundingText").append(" will not skip composing text").toString());
            }
            this.this$0._fieldController.deleteAroundComposingText(i, i2);
            return true;
        }

        @Override
        public boolean finishComposingText() {
            resetComposingState();
            return true;
        }

        @Override
        public int getCursorCapsMode(int i) {
            if ((i & 8192) == 8192) {
                int i2 = this.this$0._caretPosition - 1;
                if (i2 < 0 || Lexer.getLanguage().isWhitespace(this.this$0._hDoc.charAt(i2))) {
                    return (i & 16384) == 16384 ? 24576 : 8192;
                }
                return 0;
            }
            Language language = Lexer.getLanguage();
            boolean z = true;
            int i3 = 0;
            for (int i4 = this.this$0._caretPosition - 1; i4 >= 0; i4--) {
                char cCharAt = this.this$0._hDoc.charAt(i4);
                if (cCharAt == '\n') {
                    break;
                }
                if (!language.isWhitespace(cCharAt)) {
                    if (i3 != 0 && language.isSentenceTerminator(cCharAt)) {
                        break;
                    }
                    z = false;
                    break;
                }
                i3++;
            }
            return z ? 16384 : 0;
        }

        @Override
        public CharSequence getTextAfterCursor(int i, int i2) {
            return this.this$0._fieldController.getTextAfterCursor(i);
        }

        @Override
        public CharSequence getTextBeforeCursor(int i, int i2) {
            return this.this$0._fieldController.getTextBeforeCursor(i);
        }

        public boolean isComposingStarted() {
            return this._isComposing;
        }

        @Override
        public boolean performContextMenuAction(int i) {
            switch (i) {
                case R.id.selectAll:
                case R.id.startSelectingText:
                case R.id.stopSelectingText:
                    this.this$0.selectAll();
                    break;
                case R.id.cut:
                    this.this$0.m7093cut();
                    break;
                case R.id.copy:
                    this.this$0.copy();
                    break;
                case R.id.paste:
                    this.this$0.paste();
                    break;
            }
            return false;
        }

        public void resetComposingState() {
            this._composingCharCount = 0;
            this._isComposing = false;
            this.this$0._hDoc.endBatchEdit();
        }

        @Override
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            switch (keyEvent.getKeyCode()) {
                case 19:
                    this.this$0.moveCaretUp();
                    return true;
                case 20:
                    this.this$0.moveCaretDown();
                    return true;
                case 21:
                    this.this$0.moveCaretLeft();
                    return true;
                case 22:
                    this.this$0.moveCaretRight();
                    return true;
                case 59:
                    if (this.this$0.isSelectText()) {
                        this.this$0.selectText(false);
                        return true;
                    }
                    this.this$0.selectText(true);
                    return true;
                case 122:
                    this.this$0.moveCaret(0);
                    return true;
                case 123:
                    this.this$0.moveCaret(this.this$0._hDoc.length() - 1);
                    return true;
                default:
                    return super.sendKeyEvent(keyEvent);
            }
        }

        @Override
        public boolean setComposingText(CharSequence charSequence, int i) {
            this._isComposing = true;
            if (!this.this$0._hDoc.isBatchEdit()) {
                this.this$0._hDoc.beginBatchEdit();
            }
            this.this$0._fieldController.replaceComposingText(this.this$0.getCaretPosition() - this._composingCharCount, this._composingCharCount, charSequence.toString());
            this._composingCharCount = charSequence.length();
            if (i > 1) {
                this.this$0._fieldController.moveCaret((this.this$0._caretPosition + i) - 1);
            } else if (i <= 0) {
                this.this$0._fieldController.moveCaret((this.this$0._caretPosition - charSequence.length()) - i);
            }
            return true;
        }

        @Override
        public boolean setSelection(int i, int i2) {
            if (i == i2) {
                this.this$0._fieldController.moveCaret(i);
            } else {
                this.this$0._fieldController.setSelectionRange(i, i2 - i, false, true);
            }
            return true;
        }
    }

    public static class TextFieldUiState implements Parcelable {
        public static final Parcelable.Creator<TextFieldUiState> CREATOR = new Parcelable.Creator<TextFieldUiState>() {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public TextFieldUiState createFromParcel(Parcel parcel) {
                return new TextFieldUiState(parcel);
            }

            @Override
            public TextFieldUiState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public TextFieldUiState[] newArray(int i) {
                return new TextFieldUiState[i];
            }

            @Override
            public TextFieldUiState[] newArray(int i) {
                return newArray(i);
            }
        };
        final int _caretPosition;
        final int _scrollX;
        final int _scrollY;
        final int _selectBegin;
        final int _selectEnd;
        final boolean _selectMode;

        TextFieldUiState(Parcel parcel) {
            this._caretPosition = parcel.readInt();
            this._scrollX = parcel.readInt();
            this._scrollY = parcel.readInt();
            this._selectMode = parcel.readInt() != 0;
            this._selectBegin = parcel.readInt();
            this._selectEnd = parcel.readInt();
        }

        public TextFieldUiState(FreeScrollingTextField freeScrollingTextField) {
            this._caretPosition = freeScrollingTextField.getCaretPosition();
            this._scrollX = freeScrollingTextField.getScrollX();
            this._scrollY = freeScrollingTextField.getScrollY();
            this._selectMode = freeScrollingTextField.isSelectText();
            this._selectBegin = freeScrollingTextField.getSelectionStart();
            this._selectEnd = freeScrollingTextField.getSelectionEnd();
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this._caretPosition);
            parcel.writeInt(this._scrollX);
            parcel.writeInt(this._scrollY);
            parcel.writeInt(this._selectMode ? 1 : 0);
            parcel.writeInt(this._selectBegin);
            parcel.writeInt(this._selectEnd);
        }
    }

    static {
        PICKER_SETS.put(65, "ÀÁÂÄÆÃÅĄĀ");
        PICKER_SETS.put(67, "ÇĆČ");
        PICKER_SETS.put(68, "Ď");
        PICKER_SETS.put(69, "ÈÉÊËĘĚĒ");
        PICKER_SETS.put(71, "Ğ");
        PICKER_SETS.put(76, "Ł");
        PICKER_SETS.put(73, "ÌÍÎÏĪİ");
        PICKER_SETS.put(78, "ÑŃŇ");
        PICKER_SETS.put(79, "ØŒÕÒÓÔÖŌ");
        PICKER_SETS.put(82, "Ř");
        PICKER_SETS.put(83, "ŚŠŞ");
        PICKER_SETS.put(84, "Ť");
        PICKER_SETS.put(85, "ÙÚÛÜŮŪ");
        PICKER_SETS.put(89, "ÝŸ");
        PICKER_SETS.put(90, "ŹŻŽ");
        PICKER_SETS.put(97, "àáâäæãåąā");
        PICKER_SETS.put(99, "çćč");
        PICKER_SETS.put(100, "ď");
        PICKER_SETS.put(101, "èéêëęěē");
        PICKER_SETS.put(103, "ğ");
        PICKER_SETS.put(105, "ìíîïīı");
        PICKER_SETS.put(108, "ł");
        PICKER_SETS.put(110, "ñńň");
        PICKER_SETS.put(111, "øœõòóôöō");
        PICKER_SETS.put(114, "ř");
        PICKER_SETS.put(115, "§ßśšş");
        PICKER_SETS.put(116, "ť");
        PICKER_SETS.put(117, "ùúûüůū");
        PICKER_SETS.put(121, "ýÿ");
        PICKER_SETS.put(122, "źżž");
        PICKER_SETS.put(61185, "…¥•®©±[]{}\\|");
        PICKER_SETS.put(47, "\\");
        PICKER_SETS.put(49, "¹½⅓¼⅛");
        PICKER_SETS.put(50, "²⅔");
        PICKER_SETS.put(51, "³¾⅜");
        PICKER_SETS.put(52, "⁴");
        PICKER_SETS.put(53, "⅝");
        PICKER_SETS.put(55, "⅞");
        PICKER_SETS.put(48, "ⁿ∅");
        PICKER_SETS.put(36, "¢£€¥₣₤₱");
        PICKER_SETS.put(37, "‰");
        PICKER_SETS.put(42, "†‡");
        PICKER_SETS.put(45, "–—");
        PICKER_SETS.put(43, "±");
        PICKER_SETS.put(40, "[{<");
        PICKER_SETS.put(41, "]}>");
        PICKER_SETS.put(33, "¡");
        PICKER_SETS.put(34, "“”«»˝");
        PICKER_SETS.put(63, "¿");
        PICKER_SETS.put(44, "‚„");
        PICKER_SETS.put(61, "≠≈∞");
        PICKER_SETS.put(60, "≤«‹");
        PICKER_SETS.put(62, "≥»›");
    }

    public FreeScrollingTextField(Context context) {
        super(context);
        this._isEdited = false;
        this._caretPosition = 0;
        this._caretRow = 0;
        this._selectionAnchor = -1;
        this._selectionEdge = -1;
        this._xExtent = 0;
        this._tabLength = DEFAULT_TAB_LENGTH_SPACES;
        this._colorScheme = new ColorSchemeLight();
        this._isHighlightRow = false;
        this._showNonPrinting = false;
        this._isAutoIndent = true;
        this._autoIndentWidth = 4;
        this._isLongPressCaps = false;
        this._leftOffset = 0;
        this._showLineNumbers = false;
        this._zoomFactor = 1;
        this._defTypeface = Typeface.DEFAULT;
        this._boldTypeface = Typeface.DEFAULT_BOLD;
        this._italicTypeface = Typeface.create(Typeface.DEFAULT, 2);
        this._caretSpan = new Pair(0, 0);
        this._scrollCaretDownTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretDown();
                if (this.this$0.caretOnLastRowOfFile()) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretDownTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._scrollCaretUpTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretUp();
                if (this.this$0.caretOnFirstRowOfFile()) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretUpTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._scrollCaretLeftTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretLeft(false);
                if (this.this$0._caretPosition <= 0 || this.this$0._caretRow != this.this$0._hDoc.findRowNumber(this.this$0._caretPosition - 1)) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretLeftTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._scrollCaretRightTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretRight(false);
                if (this.this$0.caretOnEOF() || this.this$0._caretRow != this.this$0._hDoc.findRowNumber(this.this$0._caretPosition + 1)) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretRightTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._hDoc = new DocumentProvider(this);
        this._navMethod = new TouchNavigationMethod(this);
        this._scroller = new Scroller(context);
        initView();
    }

    public FreeScrollingTextField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._isEdited = false;
        this._caretPosition = 0;
        this._caretRow = 0;
        this._selectionAnchor = -1;
        this._selectionEdge = -1;
        this._xExtent = 0;
        this._tabLength = DEFAULT_TAB_LENGTH_SPACES;
        this._colorScheme = new ColorSchemeLight();
        this._isHighlightRow = false;
        this._showNonPrinting = false;
        this._isAutoIndent = true;
        this._autoIndentWidth = 4;
        this._isLongPressCaps = false;
        this._leftOffset = 0;
        this._showLineNumbers = false;
        this._zoomFactor = 1;
        this._defTypeface = Typeface.DEFAULT;
        this._boldTypeface = Typeface.DEFAULT_BOLD;
        this._italicTypeface = Typeface.create(Typeface.DEFAULT, 2);
        this._caretSpan = new Pair(0, 0);
        this._scrollCaretDownTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretDown();
                if (this.this$0.caretOnLastRowOfFile()) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretDownTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._scrollCaretUpTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretUp();
                if (this.this$0.caretOnFirstRowOfFile()) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretUpTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._scrollCaretLeftTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretLeft(false);
                if (this.this$0._caretPosition <= 0 || this.this$0._caretRow != this.this$0._hDoc.findRowNumber(this.this$0._caretPosition - 1)) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretLeftTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._scrollCaretRightTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretRight(false);
                if (this.this$0.caretOnEOF() || this.this$0._caretRow != this.this$0._hDoc.findRowNumber(this.this$0._caretPosition + 1)) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretRightTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._hDoc = new DocumentProvider(this);
        this._navMethod = new TouchNavigationMethod(this);
        this._scroller = new Scroller(context);
        initView();
    }

    public FreeScrollingTextField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._isEdited = false;
        this._caretPosition = 0;
        this._caretRow = 0;
        this._selectionAnchor = -1;
        this._selectionEdge = -1;
        this._xExtent = 0;
        this._tabLength = DEFAULT_TAB_LENGTH_SPACES;
        this._colorScheme = new ColorSchemeLight();
        this._isHighlightRow = false;
        this._showNonPrinting = false;
        this._isAutoIndent = true;
        this._autoIndentWidth = 4;
        this._isLongPressCaps = false;
        this._leftOffset = 0;
        this._showLineNumbers = false;
        this._zoomFactor = 1;
        this._defTypeface = Typeface.DEFAULT;
        this._boldTypeface = Typeface.DEFAULT_BOLD;
        this._italicTypeface = Typeface.create(Typeface.DEFAULT, 2);
        this._caretSpan = new Pair(0, 0);
        this._scrollCaretDownTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretDown();
                if (this.this$0.caretOnLastRowOfFile()) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretDownTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._scrollCaretUpTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretUp();
                if (this.this$0.caretOnFirstRowOfFile()) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretUpTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._scrollCaretLeftTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretLeft(false);
                if (this.this$0._caretPosition <= 0 || this.this$0._caretRow != this.this$0._hDoc.findRowNumber(this.this$0._caretPosition - 1)) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretLeftTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._scrollCaretRightTask = new Runnable(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                this.this$0._fieldController.moveCaretRight(false);
                if (this.this$0.caretOnEOF() || this.this$0._caretRow != this.this$0._hDoc.findRowNumber(this.this$0._caretPosition + 1)) {
                    return;
                }
                this.this$0.postDelayed(this.this$0._scrollCaretRightTask, FreeScrollingTextField.SCROLL_PERIOD);
            }
        };
        this._hDoc = new DocumentProvider(this);
        this._navMethod = new TouchNavigationMethod(this);
        this._scroller = new Scroller(context);
        initView();
    }

    private void doOptionHighlightRow(Canvas canvas) {
        if (this._isHighlightRow) {
            getPaintBaseline(this._caretRow);
            int color = this._brush.getColor();
            this._brush.setColor(this._colorScheme.getColor(ColorScheme.Colorable.LINE_HIGHLIGHT));
            drawTextBackground(canvas, 0, this._caretY, Math.max(this._xExtent, getContentWidth()));
            this._brush.setColor(-2013265920);
            this._brush.setColor(color);
        }
    }

    private void drawCaret(Canvas canvas, int i, int i2) {
        int color = this._brush.getColor();
        this._caretX = i;
        this._caretY = i2;
        this._brush.setColor(this._colorScheme.getColor(ColorScheme.Colorable.CARET_DISABLED));
        drawTextBackground(canvas, i - 1, i2, 2);
        this._brush.setColor(color);
    }

    private int drawChar(Canvas canvas, char c, int i, int i2) {
        int color = this._brush.getColor();
        int advance = getAdvance(c, i);
        if (i > getScrollX() || i < getScrollX() + getContentWidth()) {
            switch (c) {
                case '\t':
                    if (this._showNonPrinting) {
                        this._brush.setColor(this._colorScheme.getColor(ColorScheme.Colorable.NON_PRINTING_GLYPH));
                        canvas.drawText(Language.GLYPH_TAB, 0, 1, i, i2, this._brush);
                        this._brush.setColor(color);
                    }
                    break;
                case '\n':
                case 65535:
                    if (this._showNonPrinting) {
                        this._brush.setColor(this._colorScheme.getColor(ColorScheme.Colorable.NON_PRINTING_GLYPH));
                        canvas.drawText("↵", 0, 1, i, i2, this._brush);
                        this._brush.setColor(color);
                    }
                    break;
                case ' ':
                    if (!this._showNonPrinting) {
                        canvas.drawText(" ", 0, 1, i, i2, this._brush);
                    } else {
                        this._brush.setColor(this._colorScheme.getColor(ColorScheme.Colorable.NON_PRINTING_GLYPH));
                        canvas.drawText("·", 0, 1, i, i2, this._brush);
                        this._brush.setColor(color);
                    }
                    break;
                case 55356:
                case 55357:
                    this._emoji = c;
                    break;
                default:
                    if (this._emoji == 0) {
                        canvas.drawText(new char[]{c}, 0, 1, i, i2, this._brush);
                    } else {
                        canvas.drawText(new char[]{this._emoji, c}, 0, 2, i, i2, this._brush);
                        this._emoji = (char) 0;
                    }
                    break;
            }
        }
        return advance;
    }

    private int drawLineNum(Canvas canvas, String str, int i, int i2) {
        canvas.drawText(str, i, i2, this._brushLine);
        return 0;
    }

    private int drawSelectedText(Canvas canvas, char c, int i, int i2) {
        int color = this._brush.getColor();
        int advance = getAdvance(c);
        this._brush.setColor(this._colorScheme.getColor(ColorScheme.Colorable.SELECTION_BACKGROUND));
        drawTextBackground(canvas, i, i2, advance);
        this._brush.setColor(this._colorScheme.getColor(ColorScheme.Colorable.SELECTION_FOREGROUND));
        drawChar(canvas, c, i, i2);
        this._brush.setColor(color);
        return advance;
    }

    private void drawTextBackground(Canvas canvas, int i, int i2, int i3) {
        Paint.FontMetricsInt fontMetricsInt = this._brush.getFontMetricsInt();
        canvas.drawRect(i, fontMetricsInt.ascent + i2, i + i3, fontMetricsInt.descent + i2, this._brush);
    }

    private int getBeginPaintRow(Canvas canvas) {
        return canvas.getClipBounds().top / rowHeight();
    }

    private int getEndPaintRow(Canvas canvas) {
        return (canvas.getClipBounds().bottom - 1) / rowHeight();
    }

    private void handleLongPressCaps(char c) {
        if (!Character.isLowerCase(c) || c != this._hDoc.charAt(this._caretPosition - 1)) {
            this._fieldController.onPrintableChar(c);
        } else {
            this._fieldController.onPrintableChar('\b');
            this._fieldController.onPrintableChar(Character.toUpperCase(c));
        }
    }

    private void handleLongPressDialogDisplay(char c) {
        String str = PICKER_SETS.get(Character.isUpperCase(this._hDoc.charAt(this._caretPosition + (-1))) ? Character.toUpperCase(c) : c);
        if (str == null) {
            this._fieldController.onPrintableChar(c);
        } else {
            this._fieldController.stopTextComposing();
            showCharacterPicker(str, true);
        }
    }

    private void handleNavigationKey(int i, KeyEvent keyEvent) {
        if (keyEvent.isShiftPressed() && !isSelectText()) {
            invalidateCaretRow();
            this._fieldController.setSelectText(true);
        } else if (!keyEvent.isShiftPressed() && isSelectText()) {
            invalidateSelectionRows();
            this._fieldController.setSelectText(false);
        }
        switch (i) {
            case 19:
                this._fieldController.moveCaretUp();
                break;
            case 20:
                this._fieldController.moveCaretDown();
                break;
            case 21:
                this._fieldController.moveCaretLeft(false);
                break;
            case 22:
                this._fieldController.moveCaretRight(false);
                break;
        }
    }

    private void initView() {
        this._fieldController = new TextFieldController(this);
        this._clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        this._brush = new Paint();
        this._brush.setAntiAlias(true);
        this._brush.setTextSize(BASE_TEXT_SIZE_PIXELS);
        this._brushLine = new Paint();
        this._brushLine.setAntiAlias(true);
        this._brushLine.setTextSize(BASE_TEXT_SIZE_PIXELS);
        setLongClickable(true);
        setFocusableInTouchMode(true);
        setHapticFeedbackEnabled(true);
        this._rowLis = new RowListener(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onRowChange(int i) {
            }
        };
        this._selModeLis = new OnSelectionChangedListener(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onSelectionChanged(boolean z, int i, int i2) {
                if (z) {
                    this.this$0._clipboardPanel.show();
                } else {
                    this.this$0._clipboardPanel.hide();
                }
            }
        };
        this._textLis = new TextChangeListener(this) {
            private final FreeScrollingTextField this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onAdd(CharSequence charSequence, int i, int i2) {
                this.this$0._caretSpan.setFirst(this.this$0._caretSpan.getFirst() + i2);
                int i3 = this.this$0._caretPosition;
                while (i3 >= 0) {
                    char cCharAt = this.this$0._hDoc.charAt(i3 - 1);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_' && cCharAt != '.') {
                        break;
                    } else {
                        i3--;
                    }
                }
                if (this.this$0._caretPosition - i3 > 0) {
                    this.this$0._autoCompletePanel.update(this.this$0._hDoc.subSequence(i3, this.this$0._caretPosition - i3));
                } else {
                    this.this$0._autoCompletePanel.dismiss();
                }
            }

            @Override
            public void onDel(CharSequence charSequence, int i, int i2) {
                if (i2 <= this.this$0._caretSpan.getFirst()) {
                    this.this$0._caretSpan.setFirst(this.this$0._caretSpan.getFirst() - 1);
                }
                this.this$0._autoCompletePanel.dismiss();
            }

            @Override
            public void onNewLine(String str, int i, int i2) {
                this.this$0._caretSpan.setFirst(this.this$0._caretSpan.getFirst() + 1);
                this.this$0._autoCompletePanel.dismiss();
            }
        };
        resetView();
        this._clipboardPanel = new ClipboardPanel(this);
        this._autoCompletePanel = new AutoCompletePanel(this);
        AutoCompletePanel.setLanguage(LanguageLua.getInstance());
        invalidate();
    }

    public void invalidateCaretRow() {
        invalidateRows(this._caretRow, this._caretRow + 1);
    }

    public void invalidateFromRow(int i) {
        TextWarriorException.assertVerbose(i >= 0, "Invalid startRow");
        super.invalidate(0, Math.max(0, ((rowHeight() * i) + getPaddingTop()) - Math.max(this._navMethod.getCaretBloat().top, this._brush.getFontMetricsInt().descent)), getScrollX() + getWidth(), getScrollY() + getHeight());
    }

    public void invalidateRows(int i, int i2) {
        TextWarriorException.assertVerbose(i <= i2 && i >= 0, "Invalid startRow and/or endRow");
        Rect caretBloat = this._navMethod.getCaretBloat();
        super.invalidate(0, Math.max(0, ((rowHeight() * i) + getPaddingTop()) - Math.max(caretBloat.top, this._brush.getFontMetricsInt().descent)), getScrollX() + getWidth(), caretBloat.bottom + (rowHeight() * i2) + getPaddingTop());
    }

    public void invalidateSelectionRows() {
        invalidateRows(this._hDoc.findRowNumber(this._selectionAnchor), this._hDoc.findRowNumber(this._selectionEdge) + 1);
    }

    private final boolean isPointInView(int i, int i2) {
        return i >= 0 && i < getWidth() && i2 >= 0 && i2 < getHeight();
    }

    private int makeCharColumnVisible(int i) {
        Pair charExtent = getCharExtent(i);
        int first = charExtent.getFirst();
        int second = charExtent.getSecond();
        return first < getScrollX() + this._alphaWidth ? (first - getScrollX()) - this._alphaWidth : second > getScrollX() + getContentWidth() ? (second - getScrollX()) - getContentWidth() : 0;
    }

    private int makeCharRowVisible(int i) {
        int iFindRowNumber = this._hDoc.findRowNumber(i) * rowHeight();
        int iRowHeight = rowHeight() + iFindRowNumber;
        if (iFindRowNumber < getScrollY()) {
            return iFindRowNumber - getScrollY();
        }
        if (iRowHeight > getScrollY() + getContentHeight()) {
            return (iRowHeight - getScrollY()) - getContentHeight();
        }
        return 0;
    }

    public boolean makeCharVisible(int i) {
        TextWarriorException.assertVerbose(i >= 0 && i < this._hDoc.docLength(), "Invalid charOffset given");
        int iMakeCharRowVisible = makeCharRowVisible(i);
        int iMakeCharColumnVisible = makeCharColumnVisible(i);
        if (iMakeCharRowVisible == 0 && iMakeCharColumnVisible == 0) {
            return false;
        }
        scrollBy(iMakeCharColumnVisible, iMakeCharRowVisible);
        return true;
    }

    private boolean reachedNextSpan(int i, Pair pair) {
        return pair != null && i == pair.getFirst();
    }

    private void realDraw(Canvas canvas) {
        int first;
        Pair pair;
        int i;
        int i2;
        int second;
        Pair pair2;
        int beginPaintRow = getBeginPaintRow(canvas);
        int rowOffset = this._hDoc.getRowOffset(beginPaintRow);
        if (rowOffset < 0) {
            return;
        }
        int iFindLineNumber = isWordWrap() ? this._hDoc.findLineNumber(rowOffset) + 1 : beginPaintRow + 1;
        if (this._showLineNumbers) {
            this._leftOffset = (int) this._brushLine.measureText(new StringBuffer().append(this._hDoc.getRowCount()).append(" ").toString());
        }
        int endPaintRow = getEndPaintRow(canvas);
        int paintBaseline = getPaintBaseline(beginPaintRow);
        List<Pair> spans = this._hDoc.getSpans();
        TextWarriorException.assertVerbose(!spans.isEmpty(), "No spans to paint in TextWarrior.paint()");
        int i3 = 1;
        Pair pair3 = spans.get(0);
        int i4 = 0;
        int size = spans.size();
        Pair pair4 = pair3;
        while (true) {
            first = i4 + pair4.getFirst();
            if (i3 < size) {
                i = i3 + 1;
                pair = spans.get(i3);
            } else {
                pair = (Pair) null;
                i = i3;
            }
            if (pair == null || first > rowOffset) {
                break;
            }
            i4 = first;
            pair4 = pair;
            i3 = i;
        }
        int second2 = pair4.getSecond();
        switch (pair4.getSecond()) {
            case 1:
                this._brush.setTypeface(this._boldTypeface);
                break;
            case 30:
                this._brush.setTypeface(this._italicTypeface);
                break;
            default:
                this._brush.setTypeface(this._defTypeface);
                break;
        }
        this._brush.setColor(this._colorScheme.getTokenColor(pair4.getSecond()));
        int rowCount = this._hDoc.getRowCount();
        if (this._showLineNumbers) {
            this._brushLine.setColor(this._colorScheme.getColor(ColorScheme.Colorable.NON_PRINTING_GLYPH));
            canvas.drawLine(this._leftOffset - (this._spaceWidth / 2), getScrollY(), this._leftOffset - (this._spaceWidth / 2), getScrollY() + getHeight(), this._brushLine);
        }
        int i5 = second2;
        int first2 = first;
        Pair pair5 = pair4;
        int i6 = i;
        int i7 = 0;
        int i8 = iFindLineNumber;
        while (beginPaintRow <= endPaintRow) {
            this._hDoc.getRow(beginPaintRow);
            int rowSize = this._hDoc.getRowSize(beginPaintRow);
            if (beginPaintRow > rowCount) {
                doOptionHighlightRow(canvas);
            }
            if (!this._showLineNumbers || i8 == i7) {
                i2 = i7;
            } else {
                drawLineNum(canvas, String.valueOf(i8), 0, paintBaseline);
                i2 = i8;
            }
            int i9 = this._leftOffset;
            int i10 = 0;
            Pair pair6 = pair5;
            Pair pair7 = pair;
            int i11 = i6;
            while (i10 < rowSize) {
                if (pair7 == null || rowOffset < first2) {
                    second = i5;
                    pair2 = pair7;
                } else {
                    first2 += pair7.getFirst();
                    second = pair7.getSecond();
                    if (i5 != second) {
                        switch (pair7.getSecond()) {
                            case 1:
                                this._brush.setTypeface(this._boldTypeface);
                                break;
                            case 30:
                                this._brush.setTypeface(this._italicTypeface);
                                break;
                            default:
                                this._brush.setTypeface(this._defTypeface);
                                break;
                        }
                        this._brush.setColor(this._colorScheme.getTokenColor(pair7.getSecond()));
                    }
                    if (i11 < size) {
                        pair2 = spans.get(i11);
                        pair6 = pair7;
                        i11++;
                    } else {
                        pair2 = (Pair) null;
                        pair6 = pair7;
                    }
                }
                if (rowOffset + 1 == this._caretPosition) {
                    this._caretSpan = pair6;
                } else if (rowOffset == this._caretPosition) {
                    drawCaret(canvas, i9, paintBaseline);
                }
                char cCharAt = this._hDoc.charAt(rowOffset);
                int iDrawSelectedText = (this._fieldController.inSelectionRange(rowOffset) ? drawSelectedText(canvas, cCharAt, i9, paintBaseline) : drawChar(canvas, cCharAt, i9, paintBaseline)) + i9;
                i10++;
                i5 = second;
                pair7 = pair2;
                i9 = iDrawSelectedText;
                rowOffset++;
            }
            if (this._hDoc.charAt(rowOffset - 1) == '\n') {
                i8++;
            }
            int iRowHeight = paintBaseline + rowHeight();
            if (i9 > this._xExtent) {
                this._xExtent = i9;
            }
            pair5 = pair6;
            pair = pair7;
            i6 = i11;
            paintBaseline = iRowHeight;
            i7 = i2;
            beginPaintRow++;
        }
        doOptionHighlightRow(canvas);
    }

    private void resetView() {
        this._caretPosition = 0;
        this._caretRow = 0;
        this._xExtent = 0;
        this._fieldController.setSelectText(false);
        this._fieldController.stopTextComposing();
        this._hDoc.clearSpans();
        if (getContentWidth() > 0 || !this._hDoc.isWordWrap()) {
            this._hDoc.analyzeWordWrap();
        }
        this._rowLis.onRowChange(0);
        scrollTo(0, 0);
    }

    private void showCharacterPicker(String str, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Selection.setSelection(spannableStringBuilder, 0);
        CharacterPickerDialog characterPickerDialog = new CharacterPickerDialog(getContext(), this, spannableStringBuilder, str, true);
        characterPickerDialog.setOnDismissListener(new DialogInterface.OnDismissListener(this, spannableStringBuilder, z) {
            private final FreeScrollingTextField this$0;
            private final SpannableStringBuilder val$dummyString;
            private final boolean val$shouldReplace;

            {
                this.this$0 = this;
                this.val$dummyString = spannableStringBuilder;
                this.val$shouldReplace = z;
            }

            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                if (this.val$dummyString.length() > 0) {
                    if (this.val$shouldReplace) {
                        this.this$0._fieldController.onPrintableChar('\b');
                    }
                    this.this$0._fieldController.onPrintableChar(this.val$dummyString.charAt(0));
                }
            }
        });
        characterPickerDialog.show();
    }

    private int useAllDimensions(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            return size;
        }
        TextWarriorException.fail("MeasureSpec cannot be UNSPECIFIED. Setting dimensions to max.");
        return Integer.MAX_VALUE;
    }

    boolean autoScrollCaret(int i) {
        boolean z = true;
        switch (i) {
            case 0:
                removeCallbacks(this._scrollCaretUpTask);
                if (caretOnFirstRowOfFile()) {
                    z = false;
                } else {
                    post(this._scrollCaretUpTask);
                }
                return z;
            case 1:
                removeCallbacks(this._scrollCaretDownTask);
                if (caretOnLastRowOfFile()) {
                    z = false;
                } else {
                    post(this._scrollCaretDownTask);
                }
                return z;
            case 2:
                removeCallbacks(this._scrollCaretLeftTask);
                if (this._caretPosition <= 0 || this._caretRow != this._hDoc.findRowNumber(this._caretPosition - 1)) {
                    return false;
                }
                post(this._scrollCaretLeftTask);
                return true;
            case 3:
                removeCallbacks(this._scrollCaretRightTask);
                if (caretOnEOF() || this._caretRow != this._hDoc.findRowNumber(this._caretPosition + 1)) {
                    return false;
                }
                post(this._scrollCaretRightTask);
                return true;
            default:
                TextWarriorException.fail("Invalid scroll direction");
                return false;
        }
    }

    public void cancelSpanning() {
        this._fieldController.cancelSpanning();
    }

    protected boolean caretOnEOF() {
        return this._caretPosition == this._hDoc.docLength() + (-1);
    }

    protected boolean caretOnFirstRowOfFile() {
        return this._caretRow == 0;
    }

    protected boolean caretOnLastRowOfFile() {
        return this._caretRow == this._hDoc.getRowCount() + (-1);
    }

    @Override
    public void computeScroll() {
        if (this._scroller.computeScrollOffset()) {
            scrollTo(this._scroller.getCurrX(), this._scroller.getCurrY());
            postInvalidate();
        }
    }

    @Override
    protected int computeVerticalScrollOffset() {
        return getScrollY();
    }

    @Override
    protected int computeVerticalScrollRange() {
        return (this._hDoc.getRowCount() * rowHeight()) + getPaddingTop() + getPaddingBottom();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    int coordToCharIndex(int i, int i2) {
        int iRowHeight = i2 / rowHeight();
        if (iRowHeight > this._hDoc.getRowCount()) {
            return this._hDoc.docLength() - 1;
        }
        int rowOffset = this._hDoc.getRowOffset(iRowHeight);
        if (rowOffset < 0) {
            return -1;
        }
        if (i < 0) {
            return rowOffset;
        }
        String row = this._hDoc.getRow(iRowHeight);
        int tabAdvance = this._leftOffset;
        int length = row.length();
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = row.charAt(i3);
            switch (cCharAt) {
                case '\t':
                    tabAdvance += getTabAdvance(tabAdvance);
                    break;
                case '\n':
                case 65535:
                    tabAdvance += getEOLAdvance();
                    break;
                case ' ':
                    tabAdvance += getSpaceAdvance();
                    break;
                case 55356:
                case 55357:
                    tabAdvance += (int) this._brush.measureText(new char[]{cCharAt, row.charAt(i3 + 1)}, 0, 2);
                    z = true;
                    break;
                default:
                    if (!z) {
                        tabAdvance += getCharAdvance(cCharAt);
                    } else {
                        z = false;
                    }
                    break;
            }
            if (tabAdvance >= i) {
                return i3 < row.length() ? rowOffset + i3 : (rowOffset + i3) - 1;
            }
            i3++;
        }
        if (i3 < row.length()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    int coordToCharIndexStrict(int i, int i2) {
        int iRowHeight = i2 / rowHeight();
        int rowOffset = this._hDoc.getRowOffset(iRowHeight);
        if (rowOffset < 0 || i < 0) {
            return -1;
        }
        String row = this._hDoc.getRow(iRowHeight);
        int length = row.length();
        boolean z = false;
        int tabAdvance = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = row.charAt(i3);
            switch (cCharAt) {
                case '\t':
                    tabAdvance += getTabAdvance(tabAdvance);
                    break;
                case '\n':
                case 65535:
                    tabAdvance += getEOLAdvance();
                    break;
                case ' ':
                    tabAdvance += getSpaceAdvance();
                    break;
                case 55356:
                case 55357:
                    tabAdvance += (int) this._brush.measureText(new char[]{cCharAt, row.charAt(i3 + 1)}, 0, 2);
                    z = true;
                    break;
                default:
                    if (z) {
                        z = false;
                    } else {
                        tabAdvance += getCharAdvance(cCharAt);
                    }
                    break;
            }
            if (tabAdvance >= i) {
                if (i3 < row.length()) {
                    return rowOffset + i3;
                }
                return -1;
            }
        }
        if (i3 < row.length()) {
            return rowOffset + i3;
        }
        return -1;
    }

    public void copy() {
        if (this._selectionAnchor != this._selectionEdge) {
            this._fieldController.copy(this._clipboardManager);
        }
        selectText(false);
    }

    public void copy(ClipboardManager clipboardManager) {
        this._fieldController.copy(clipboardManager);
    }

    public DocumentProvider createDocumentProvider() {
        return new DocumentProvider(this._hDoc);
    }

    public void m7093cut() {
        if (this._selectionAnchor != this._selectionEdge) {
            this._fieldController.m7095cut(this._clipboardManager);
        }
    }

    public void m7094cut(ClipboardManager clipboardManager) {
        this._fieldController.m7095cut(clipboardManager);
    }

    void flingScroll(int i, int i2) {
        this._scroller.fling(getScrollX(), getScrollY(), i, i2, 0, getMaxScrollX(), 0, getMaxScrollY());
        postInvalidate();
    }

    public void focusCaret() {
        makeCharVisible(this._caretPosition);
    }

    public void focusSelectionEnd() {
        this._fieldController.focusSelection(false);
    }

    public void focusSelectionStart() {
        this._fieldController.focusSelection(true);
    }

    public void format() {
        selectText(false);
        CharSequence charSequence = AutoIndent.format(createDocumentProvider().toString(), this._autoIndentWidth);
        this._hDoc.beginBatchEdit();
        this._hDoc.deleteAt(0, this._hDoc.docLength() - 1, System.nanoTime());
        this._hDoc.insertBefore(charSequence.toString().toCharArray(), 0, System.nanoTime());
        this._hDoc.endBatchEdit();
        respan();
        invalidate();
    }

    @Override
    public int getAdvance(char c) {
        switch (c) {
            case '\t':
                return getTabAdvance();
            case '\n':
            case 65535:
                return getEOLAdvance();
            case ' ':
                return getSpaceAdvance();
            case 55356:
            case 55357:
                return 0;
            default:
                return this._emoji != 0 ? (int) this._brush.measureText(new char[]{this._emoji, c}, 0, 2) : (int) this._brush.measureText(new char[]{c}, 0, 1);
        }
    }

    public int getAdvance(char c, int i) {
        switch (c) {
            case '\t':
                return getTabAdvance(i);
            case '\n':
            case 65535:
                return getEOLAdvance();
            case ' ':
                return getSpaceAdvance();
            case 55356:
            case 55357:
                return 0;
            default:
                return this._emoji != 0 ? (int) this._brush.measureText(new char[]{this._emoji, c}, 0, 2) : (int) this._brush.measureText(new char[]{c}, 0, 1);
        }
    }

    public int getAutoIndentWidth() {
        return this._autoIndentWidth;
    }

    Rect getBoundingBox(int i) {
        if (i < 0 || i >= this._hDoc.docLength()) {
            return new Rect(-1, -1, -1, -1);
        }
        int iRowHeight = rowHeight() * this._hDoc.findRowNumber(i);
        int iRowHeight2 = iRowHeight + rowHeight();
        Pair charExtent = getCharExtent(i);
        return new Rect(charExtent.getFirst(), iRowHeight, charExtent.getSecond(), iRowHeight2);
    }

    public int getCaretPosition() {
        return this._caretPosition;
    }

    public int getCaretRow() {
        return this._caretRow;
    }

    public int getCaretX() {
        return this._caretX;
    }

    public int getCaretY() {
        return this._caretY;
    }

    public int getCharAdvance(char c) {
        return (int) this._brush.measureText(new char[]{c}, 0, 1);
    }

    protected Pair getCharExtent(int i) {
        int tabAdvance;
        int iFindRowNumber = this._hDoc.findRowNumber(i);
        int rowOffset = this._hDoc.getRowOffset(iFindRowNumber);
        int i2 = this._leftOffset;
        int i3 = this._leftOffset;
        String row = this._hDoc.getRow(iFindRowNumber);
        int length = row.length();
        int i4 = 0;
        boolean z = false;
        int i5 = i2;
        while (rowOffset + i4 <= i && i4 < length) {
            char cCharAt = row.charAt(i4);
            switch (cCharAt) {
                case '\t':
                    tabAdvance = getTabAdvance(i3) + i3;
                    break;
                case '\n':
                case 65535:
                    tabAdvance = getEOLAdvance() + i3;
                    break;
                case ' ':
                    tabAdvance = getSpaceAdvance() + i3;
                    break;
                case 55356:
                case 55357:
                    tabAdvance = i3 + ((int) this._brush.measureText(new char[]{cCharAt, row.charAt(i4 + 1)}, 0, 2));
                    z = true;
                    break;
                default:
                    if (!z) {
                        tabAdvance = getCharAdvance(cCharAt) + i3;
                    } else {
                        z = false;
                        tabAdvance = i3;
                    }
                    break;
            }
            i4++;
            i5 = i3;
            i3 = tabAdvance;
        }
        return new Pair(i5, i3);
    }

    public ColorScheme getColorScheme() {
        return this._colorScheme;
    }

    protected int getColumn(int i) {
        int iFindRowNumber = this._hDoc.findRowNumber(i);
        TextWarriorException.assertVerbose(iFindRowNumber >= 0, "Invalid char offset given to getColumn");
        return i - this._hDoc.getRowOffset(iFindRowNumber);
    }

    protected int getContentHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    protected int getContentWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    protected int getEOLAdvance() {
        return this._showNonPrinting ? (int) this._brush.measureText("↵", 0, Language.GLYPH_NEWLINE.length()) : (int) (EMPTY_CARET_WIDTH_SCALE * this._brush.measureText(" ", 0, 1));
    }

    public int getLeftOffset() {
        return this._leftOffset;
    }

    public int getLength() {
        return this._hDoc.docLength();
    }

    int getMaxScrollX() {
        return isWordWrap() ? this._leftOffset : Math.max(0, (this._xExtent - getContentWidth()) + this._navMethod.getCaretBloat().right + this._alphaWidth);
    }

    int getMaxScrollY() {
        return Math.max(0, ((this._hDoc.getRowCount() * rowHeight()) - (getContentHeight() / 2)) + this._navMethod.getCaretBloat().bottom);
    }

    protected int getNumVisibleRows() {
        return (int) Math.ceil(((double) getContentHeight()) / ((double) rowHeight()));
    }

    public int getPaintBaseline(int i) {
        return ((i + 1) * rowHeight()) - this._brush.getFontMetricsInt().descent;
    }

    @Override
    public final int getRowWidth() {
        return getContentWidth() - this._leftOffset;
    }

    public int getSelectionEnd() {
        return this._selectionEdge < 0 ? this._caretPosition : this._selectionEdge;
    }

    public int getSelectionStart() {
        return this._selectionAnchor < 0 ? this._caretPosition : this._selectionAnchor;
    }

    protected int getSpaceAdvance() {
        return this._showNonPrinting ? (int) this._brush.measureText("·", 0, Language.GLYPH_SPACE.length()) : this._spaceWidth;
    }

    protected int getTabAdvance() {
        return this._showNonPrinting ? this._tabLength * ((int) this._brush.measureText("·", 0, Language.GLYPH_SPACE.length())) : this._tabLength * this._spaceWidth;
    }

    protected int getTabAdvance(int i) {
        if (this._showNonPrinting) {
            return this._tabLength * ((int) this._brush.measureText("·", 0, Language.GLYPH_SPACE.length()));
        }
        return (this._tabLength - (((i - this._leftOffset) / this._spaceWidth) % this._tabLength)) * this._spaceWidth;
    }

    public float getTextSize() {
        return this._brush.getTextSize();
    }

    public int getTopOffset() {
        return this._topOffset;
    }

    public Parcelable getUiState() {
        return new TextFieldUiState(this);
    }

    public float getZoom() {
        return this._zoomFactor;
    }

    public boolean hasLayout() {
        return getWidth() == 0;
    }

    public boolean inSelectionRange(int i) {
        return this._fieldController.inSelectionRange(i);
    }

    public boolean isEdited() {
        return this._isEdited;
    }

    public boolean isFlingScrolling() {
        return !this._scroller.isFinished();
    }

    @Override
    public boolean isSaveEnabled() {
        return true;
    }

    public final boolean isSelectText() {
        return this._fieldController.isSelectText();
    }

    public final boolean isSelectText2() {
        return this._fieldController.isSelectText2();
    }

    public boolean isShowLineNumbers() {
        return this._showLineNumbers;
    }

    public boolean isWordWrap() {
        return this._hDoc.isWordWrap();
    }

    public void moveCaret(int i) {
        this._fieldController.moveCaret(i);
    }

    public void moveCaretDown() {
        this._fieldController.moveCaretDown();
    }

    public void moveCaretLeft() {
        this._fieldController.moveCaretLeft(false);
    }

    public void moveCaretRight() {
        this._fieldController.moveCaretRight(false);
    }

    public void moveCaretUp() {
        this._fieldController.moveCaretUp();
    }

    @Override
    public boolean onCheckIsTextEditor() {
        return true;
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.inputType = 131073;
        editorInfo.imeOptions = 1342177286;
        if (this._inputConnection == null) {
            this._inputConnection = new TextFieldInputConnection(this, this);
        } else {
            this._inputConnection.resetComposingState();
        }
        return this._inputConnection;
    }

    void onDestroy() {
        this._fieldController.cancelSpanning();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getScrollX() + getPaddingLeft(), getScrollY() + getPaddingTop(), (getScrollX() + getWidth()) - getPaddingRight(), (getScrollY() + getHeight()) - getPaddingBottom());
        canvas.translate(getPaddingLeft(), getPaddingTop());
        realDraw(canvas);
        canvas.restore();
        this._navMethod.onTextDrawComplete(canvas);
    }

    @Override
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        invalidateCaretRow();
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this._navMethod.onKeyDown(i, keyEvent)) {
            return true;
        }
        if (KeysInterpreter.isNavigationKey(keyEvent)) {
            handleNavigationKey(i, keyEvent);
            return true;
        }
        if (i == 63 || i == 61185) {
            showCharacterPicker(PICKER_SETS.get(61185), false);
            return true;
        }
        char cKeyEventToPrintableChar = KeysInterpreter.keyEventToPrintableChar(keyEvent);
        if (cKeyEventToPrintableChar == 0) {
            return super.onKeyDown(i, keyEvent);
        }
        int repeatCount = keyEvent.getRepeatCount();
        if (repeatCount == 1) {
            if (this._isLongPressCaps) {
                handleLongPressCaps(cKeyEventToPrintableChar);
            } else {
                handleLongPressDialogDisplay(cKeyEventToPrintableChar);
            }
        } else if (repeatCount == 0 || ((this._isLongPressCaps && !Character.isLowerCase(cKeyEventToPrintableChar)) || (!this._isLongPressCaps && PICKER_SETS.get(cKeyEventToPrintableChar) == null))) {
            this._fieldController.onPrintableChar(cKeyEventToPrintableChar);
        }
        return true;
    }

    @Override
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this._isLongPressCaps && keyEvent.getRepeatCount() == 1 && keyEvent.getAction() == 0) {
            char cKeyEventToPrintableChar = KeysInterpreter.keyEventToPrintableChar(keyEvent);
            if (Character.isLowerCase(cKeyEventToPrintableChar) && cKeyEventToPrintableChar == Character.toLowerCase(this._hDoc.charAt(this._caretPosition - 1))) {
                this._fieldController.onPrintableChar('\b');
                this._fieldController.onPrintableChar(Character.toUpperCase(cKeyEventToPrintableChar));
                return true;
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this._navMethod.onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            Rect rect = new Rect();
            getWindowVisibleDisplayFrame(rect);
            this._topOffset = (rect.height() + rect.top) - getHeight();
            if (!this._isLayout) {
                respan();
            }
            this._isLayout = i3 > 0;
            invalidate();
            this._autoCompletePanel.setWidth(getWidth() / 2);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(useAllDimensions(i), useAllDimensions(i2));
    }

    void onPause() {
        this._navMethod.onPause();
    }

    void onResume() {
        this._navMethod.onResume();
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this._hDoc.isWordWrap() && i3 != i) {
            this._hDoc.analyzeWordWrap();
        }
        this._fieldController.updateCaretRow();
        if (i2 < i4) {
            makeCharVisible(this._caretPosition);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isFocused()) {
            this._navMethod.onTouchEvent(motionEvent);
        } else if ((motionEvent.getAction() & 255) == 1 && isPointInView((int) motionEvent.getX(), (int) motionEvent.getY())) {
            requestFocus();
        }
        return true;
    }

    @Override
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        int iRound = Math.round(motionEvent.getX());
        int iRound2 = Math.round(motionEvent.getY());
        while (iRound > 0) {
            this._fieldController.moveCaretRight(false);
            iRound--;
        }
        while (iRound < 0) {
            this._fieldController.moveCaretLeft(false);
            iRound++;
        }
        while (iRound2 > 0) {
            this._fieldController.moveCaretDown();
            iRound2--;
        }
        while (iRound2 < 0) {
            this._fieldController.moveCaretUp();
            iRound2++;
        }
        return true;
    }

    public void paste() {
        CharSequence text = this._clipboardManager.getText();
        if (text != null) {
            this._fieldController.paste(text.toString());
        }
    }

    public void paste(String str) {
        this._fieldController.paste(str);
    }

    public void replaceText(int i, int i2, String str) {
        this._hDoc.beginBatchEdit();
        this._fieldController.replaceText(i, i2, str);
        this._fieldController.stopTextComposing();
        this._hDoc.endBatchEdit();
    }

    public void respan() {
        this._fieldController.determineSpans();
    }

    public void restoreUiState(Parcelable parcelable) {
        TextFieldUiState textFieldUiState = (TextFieldUiState) parcelable;
        int i = textFieldUiState._caretPosition;
        if (textFieldUiState._selectMode) {
            post(new Runnable(this, textFieldUiState._selectBegin, textFieldUiState._selectEnd, i) {
                private final FreeScrollingTextField this$0;
                private final int val$caretPosition;
                private final int val$selEnd;
                private final int val$selStart;

                {
                    this.this$0 = this;
                    this.val$selStart = i;
                    this.val$selEnd = i;
                    this.val$caretPosition = i;
                }

                @Override
                public void run() {
                    this.this$0.setSelectionRange(this.val$selStart, this.val$selEnd - this.val$selStart);
                    if (this.val$caretPosition < this.val$selEnd) {
                        this.this$0.focusSelectionStart();
                    }
                }
            });
        } else {
            post(new Runnable(this, i) {
                private final FreeScrollingTextField this$0;
                private final int val$caretPosition;

                {
                    this.this$0 = this;
                    this.val$caretPosition = i;
                }

                @Override
                public void run() {
                    this.this$0.moveCaret(this.val$caretPosition);
                }
            });
        }
    }

    protected int rowHeight() {
        Paint.FontMetricsInt fontMetricsInt = this._brush.getFontMetricsInt();
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }

    public void selectAll() {
        this._fieldController.setSelectionRange(0, this._hDoc.docLength() - 1, false, true);
    }

    public void selectText(boolean z) {
        if (this._fieldController.isSelectText() && !z) {
            invalidateSelectionRows();
            this._fieldController.setSelectText(false);
        } else {
            if (this._fieldController.isSelectText() || !z) {
                return;
            }
            invalidateCaretRow();
            this._fieldController.setSelectText(true);
        }
    }

    public void setAutoIndent(boolean z) {
        this._isAutoIndent = z;
    }

    public void setAutoIndentWidth(int i) {
        this._autoIndentWidth = i;
    }

    public void setBoldTypeface(Typeface typeface) {
        this._boldTypeface = typeface;
    }

    public void setChirality(boolean z) {
        this._navMethod.onChiralityChanged(z);
    }

    public void setColorScheme(ColorScheme colorScheme) {
        this._colorScheme = colorScheme;
        this._navMethod.onColorSchemeChanged(colorScheme);
        setBackgroundColor(colorScheme.getColor(ColorScheme.Colorable.BACKGROUND));
    }

    public void setDocumentProvider(DocumentProvider documentProvider) {
        this._hDoc = documentProvider;
        resetView();
        this._fieldController.cancelSpanning();
        this._fieldController.determineSpans();
        invalidate();
    }

    public void setEdited(boolean z) {
        this._isEdited = z;
    }

    public void setHighlightCurrentRow(boolean z) {
        this._isHighlightRow = z;
        invalidateCaretRow();
    }

    public void setItalicTypeface(Typeface typeface) {
        this._italicTypeface = typeface;
    }

    public void setLongPressCaps(boolean z) {
        this._isLongPressCaps = z;
    }

    public void setNavigationMethod(TouchNavigationMethod touchNavigationMethod) {
        this._navMethod = touchNavigationMethod;
    }

    public void setNonPrintingCharVisibility(boolean z) {
        if (this._showNonPrinting ^ z) {
            this._showNonPrinting = z;
            if (this._hDoc.isWordWrap()) {
                this._hDoc.analyzeWordWrap();
            }
            this._fieldController.updateCaretRow();
            if (makeCharVisible(this._caretPosition)) {
                return;
            }
            invalidate();
        }
    }

    public void setOnSelectionChangedListener(OnSelectionChangedListener onSelectionChangedListener) {
        this._selModeLis = onSelectionChangedListener;
    }

    public void setRowListener(RowListener rowListener) {
        this._rowLis = rowListener;
    }

    public void setSelection(int i, int i2) {
        this._fieldController.setSelectionRange(i, i2, true, false);
    }

    public void setSelectionRange(int i, int i2) {
        this._fieldController.setSelectionRange(i, i2, true, true);
    }

    public void setShowLineNumbers(boolean z) {
        this._showLineNumbers = z;
    }

    public void setTabSpaces(int i) {
        if (i < 0) {
            return;
        }
        this._tabLength = i;
        if (this._hDoc.isWordWrap()) {
            this._hDoc.analyzeWordWrap();
        }
        this._fieldController.updateCaretRow();
        if (makeCharVisible(this._caretPosition)) {
            return;
        }
        invalidate();
    }

    public void setTextSize(int i) {
        if (i <= 8 || i >= 80 || i == this._brush.getTextSize()) {
            return;
        }
        double dRowHeight = rowHeight();
        double advance = getAdvance('a');
        this._zoomFactor = i / BASE_TEXT_SIZE_PIXELS;
        this._brush.setTextSize(i);
        this._brushLine.setTextSize(i);
        if (this._hDoc.isWordWrap()) {
            this._hDoc.analyzeWordWrap();
        }
        this._fieldController.updateCaretRow();
        scrollTo((int) ((((double) getAdvance('a')) / advance) * ((double) getScrollX())), (int) ((((double) rowHeight()) / dRowHeight) * ((double) getScrollY())));
        this._alphaWidth = (int) this._brush.measureText(Config.APP_VERSION_CODE);
        this._spaceWidth = (int) this._brush.measureText(" ");
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this._defTypeface = typeface;
        this._boldTypeface = Typeface.create(typeface, 1);
        this._italicTypeface = Typeface.create(typeface, 2);
        this._brush.setTypeface(typeface);
        this._brushLine.setTypeface(typeface);
        if (this._hDoc.isWordWrap()) {
            this._hDoc.analyzeWordWrap();
        }
        this._fieldController.updateCaretRow();
        if (makeCharVisible(this._caretPosition)) {
            return;
        }
        invalidate();
    }

    public void setWordWrap(boolean z) {
        this._hDoc.setWordWrap(z);
        if (z) {
            this._xExtent = 0;
            scrollTo(0, 0);
        }
        this._fieldController.updateCaretRow();
        if (makeCharVisible(this._caretPosition)) {
            return;
        }
        invalidate();
    }

    public void setZoom(float f) {
        if (f <= 0.5d || f >= 5 || f == this._zoomFactor) {
            return;
        }
        this._zoomFactor = f;
        int i = (int) (BASE_TEXT_SIZE_PIXELS * f);
        this._brush.setTextSize(i);
        this._brushLine.setTextSize(i);
        if (this._hDoc.isWordWrap()) {
            this._hDoc.analyzeWordWrap();
        }
        this._fieldController.updateCaretRow();
        this._alphaWidth = (int) this._brush.measureText(Config.APP_VERSION_CODE);
        invalidate();
    }

    void showIME(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(this, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public final void smoothScrollBy(int i, int i2) {
        if (getHeight() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll > Opcodes.INVOKE_POLYMORPHIC) {
            this._scroller.startScroll(getScrollX(), getScrollY(), i, i2);
            postInvalidate();
        } else {
            if (!this._scroller.isFinished()) {
                this._scroller.abortAnimation();
            }
            scrollBy(i, i2);
        }
        this.mLastScroll = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void smoothScrollTo(int i, int i2) {
        smoothScrollBy(i - getScrollX(), i2 - getScrollY());
    }

    void stopAutoScrollCaret() {
        removeCallbacks(this._scrollCaretDownTask);
        removeCallbacks(this._scrollCaretUpTask);
        removeCallbacks(this._scrollCaretLeftTask);
        removeCallbacks(this._scrollCaretRightTask);
    }

    void stopAutoScrollCaret(int i) {
        switch (i) {
            case 0:
                removeCallbacks(this._scrollCaretUpTask);
                break;
            case 1:
                removeCallbacks(this._scrollCaretDownTask);
                break;
            case 2:
                removeCallbacks(this._scrollCaretLeftTask);
                break;
            case 3:
                removeCallbacks(this._scrollCaretRightTask);
                break;
            default:
                TextWarriorException.fail("Invalid scroll direction");
                break;
        }
    }

    public void stopFlingScrolling() {
        this._scroller.forceFinished(true);
    }
}
