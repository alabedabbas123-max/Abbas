package com.abbas.ide.editor.theme

import android.graphics.Color
import androidx.annotation.ColorInt
import com.abbas.ide.editor.highlight.TokenType

/** Colour set used by the code editor. */
data class EditorTheme(
    val id: String,
    val displayName: String,
    @ColorInt val background: Int,
    @ColorInt val text: Int,
    @ColorInt val gutterBackground: Int,
    @ColorInt val gutterText: Int,
    @ColorInt val currentLine: Int,
    @ColorInt val cursor: Int,
    @ColorInt val selection: Int,
    private val tokenColors: Map<TokenType, Int>,
) {
    @ColorInt
    fun colorFor(type: TokenType): Int = tokenColors[type] ?: text

    companion object {

        val DARK = EditorTheme(
            id = "dark",
            displayName = "Dark",
            background = Color.parseColor("#1E1F22"),
            text = Color.parseColor("#DCDCDC"),
            gutterBackground = Color.parseColor("#26282C"),
            gutterText = Color.parseColor("#6C7079"),
            currentLine = Color.parseColor("#2B2D31"),
            cursor = Color.parseColor("#4FC3F7"),
            selection = Color.parseColor("#3B5070"),
            tokenColors = mapOf(
                TokenType.KEYWORD to Color.parseColor("#CF8E6D"),
                TokenType.STRING to Color.parseColor("#6AAB73"),
                TokenType.COMMENT to Color.parseColor("#7A7E85"),
                TokenType.NUMBER to Color.parseColor("#2AACB8"),
                TokenType.ANNOTATION to Color.parseColor("#B3AE60"),
                TokenType.TYPE to Color.parseColor("#B5B6E3"),
                TokenType.MARKUP_TAG to Color.parseColor("#E8BF6A"),
                TokenType.MARKUP_ATTRIBUTE to Color.parseColor("#BABABA"),
            ),
        )

        val LIGHT = EditorTheme(
            id = "light",
            displayName = "Light",
            background = Color.parseColor("#FFFFFF"),
            text = Color.parseColor("#1F1F1F"),
            gutterBackground = Color.parseColor("#F2F2F2"),
            gutterText = Color.parseColor("#9AA0A6"),
            currentLine = Color.parseColor("#F5F8FF"),
            cursor = Color.parseColor("#0B57D0"),
            selection = Color.parseColor("#BBD6FB"),
            tokenColors = mapOf(
                TokenType.KEYWORD to Color.parseColor("#0033B3"),
                TokenType.STRING to Color.parseColor("#067D17"),
                TokenType.COMMENT to Color.parseColor("#8C8C8C"),
                TokenType.NUMBER to Color.parseColor("#1750EB"),
                TokenType.ANNOTATION to Color.parseColor("#9E880D"),
                TokenType.TYPE to Color.parseColor("#20999D"),
                TokenType.MARKUP_TAG to Color.parseColor("#0033B3"),
                TokenType.MARKUP_ATTRIBUTE to Color.parseColor("#174AD4"),
            ),
        )

        val all: List<EditorTheme> = listOf(DARK, LIGHT)

        fun byId(id: String?): EditorTheme = all.firstOrNull { it.id == id } ?: DARK
    }
}
