package com.abbas.ide.editor

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Pure-logic checks that do not need the Android text engine.
 * Buffer-level behaviour is covered by instrumentation tests.
 */
class UndoManagerTest {

    @Test
    fun `starts with empty history`() {
        val manager = UndoManager()
        assertFalse(manager.canUndo)
        assertFalse(manager.canRedo)
    }

    @Test
    fun `records an edit`() {
        val manager = UndoManager()
        manager.record(0, "", "a")
        assertTrue(manager.canUndo)
    }

    @Test
    fun `ignores a no-op edit`() {
        val manager = UndoManager()
        manager.record(0, "", "")
        assertFalse(manager.canUndo)
    }

    @Test
    fun `clear empties the history`() {
        val manager = UndoManager()
        manager.record(0, "", "abc")
        manager.clear()
        assertFalse(manager.canUndo)
    }
}
