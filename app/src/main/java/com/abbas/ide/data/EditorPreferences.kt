package com.abbas.ide.data

import android.content.Context
import androidx.preference.PreferenceManager
import com.abbas.ide.editor.theme.EditorTheme

/** Typed accessor over the shared preferences edited by the settings screen. */
class EditorPreferences(context: Context) {

    private val prefs = PreferenceManager.getDefaultSharedPreferences(context.applicationContext)

    val theme: EditorTheme
        get() = EditorTheme.byId(prefs.getString(KEY_THEME, EditorTheme.DARK.id))

    val fontSizeSp: Float
        get() = prefs.getString(KEY_FONT_SIZE, DEFAULT_FONT_SIZE)?.toFloatOrNull()
            ?: DEFAULT_FONT_SIZE.toFloat()

    val tabSize: Int
        get() = prefs.getString(KEY_TAB_SIZE, DEFAULT_TAB_SIZE)?.toIntOrNull()
            ?: DEFAULT_TAB_SIZE.toInt()

    val showLineNumbers: Boolean
        get() = prefs.getBoolean(KEY_LINE_NUMBERS, true)

    val wordWrap: Boolean
        get() = prefs.getBoolean(KEY_WORD_WRAP, false)

    val autoIndent: Boolean
        get() = prefs.getBoolean(KEY_AUTO_INDENT, true)

    val autoCloseBrackets: Boolean
        get() = prefs.getBoolean(KEY_AUTO_CLOSE, true)

    val autoSave: Boolean
        get() = prefs.getBoolean(KEY_AUTO_SAVE, true)

    companion object {
        const val KEY_THEME = "editor_theme"
        const val KEY_FONT_SIZE = "editor_font_size"
        const val KEY_TAB_SIZE = "editor_tab_size"
        const val KEY_LINE_NUMBERS = "editor_line_numbers"
        const val KEY_WORD_WRAP = "editor_word_wrap"
        const val KEY_AUTO_INDENT = "editor_auto_indent"
        const val KEY_AUTO_CLOSE = "editor_auto_close_brackets"
        const val KEY_AUTO_SAVE = "editor_auto_save"

        private const val DEFAULT_FONT_SIZE = "14"
        private const val DEFAULT_TAB_SIZE = "4"
    }
}
