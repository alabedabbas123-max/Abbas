package com.abbas.ide.editor

import android.text.Editable

/**
 * Bounded undo/redo history for a single editor buffer.
 *
 * Consecutive single-character insertions are merged into one entry so that an
 * undo removes a word rather than one letter at a time.
 */
class UndoManager(private val maxEntries: Int = 200) {

    private data class Edit(
        val start: Int,
        val before: CharSequence,
        val after: CharSequence,
        val timestamp: Long,
    )

    private val undoStack = ArrayDeque<Edit>()
    private val redoStack = ArrayDeque<Edit>()

    /** True while an undo/redo is being applied, so the watcher can ignore it. */
    var isApplying: Boolean = false
        private set

    val canUndo: Boolean get() = undoStack.isNotEmpty()
    val canRedo: Boolean get() = redoStack.isNotEmpty()

    fun clear() {
        undoStack.clear()
        redoStack.clear()
    }

    fun record(start: Int, before: CharSequence, after: CharSequence) {
        if (isApplying) return
        if (before.isEmpty() && after.isEmpty()) return

        val now = System.currentTimeMillis()
        val last = undoStack.lastOrNull()

        val mergeable = last != null &&
            now - last.timestamp < MERGE_WINDOW_MS &&
            last.before.isEmpty() &&
            before.isEmpty() &&
            after.length == 1 &&
            !after[0].isWhitespace() &&
            last.start + last.after.length == start

        if (mergeable && last != null) {
            undoStack.removeLast()
            undoStack.addLast(
                last.copy(
                    after = last.after.toString() + after.toString(),
                    timestamp = now,
                )
            )
        } else {
            undoStack.addLast(
                Edit(
                    start = start,
                    before = before.toString(),
                    after = after.toString(),
                    timestamp = now,
                )
            )
            while (undoStack.size > maxEntries) undoStack.removeFirst()
        }

        redoStack.clear()
    }

    /** Returns the caret position after the undo, or -1 when there is nothing to undo. */
    fun undo(editable: Editable): Int {
        val edit = undoStack.removeLastOrNull() ?: return -1
        isApplying = true
        try {
            val end = (edit.start + edit.after.length).coerceAtMost(editable.length)
            editable.replace(edit.start, end, edit.before)
            redoStack.addLast(edit)
            return edit.start + edit.before.length
        } finally {
            isApplying = false
        }
    }

    /** Returns the caret position after the redo, or -1 when there is nothing to redo. */
    fun redo(editable: Editable): Int {
        val edit = redoStack.removeLastOrNull() ?: return -1
        isApplying = true
        try {
            val end = (edit.start + edit.before.length).coerceAtMost(editable.length)
            editable.replace(edit.start, end, edit.after)
            undoStack.addLast(edit)
            return edit.start + edit.after.length
        } finally {
            isApplying = false
        }
    }

    private companion object {
        const val MERGE_WINDOW_MS = 700L
    }
}
