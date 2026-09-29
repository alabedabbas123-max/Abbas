package com.abbas.ide.editor.highlight

/** Semantic category of a highlighted range; mapped to a colour by the theme. */
enum class TokenType {
    KEYWORD,
    STRING,
    COMMENT,
    NUMBER,
    ANNOTATION,
    TYPE,
    MARKUP_TAG,
    MARKUP_ATTRIBUTE,
}

/** A coloured range of the document. [end] is exclusive. */
data class Token(val start: Int, val end: Int, val type: TokenType)

interface SyntaxHighlighter {
    val languageId: String

    /** Returns non-overlapping tokens, ordered by [Token.start]. */
    fun tokenize(text: CharSequence): List<Token>
}

/** Highlighter for languages with no rules yet: everything is plain text. */
object PlainTextHighlighter : SyntaxHighlighter {
    override val languageId: String = "text"
    override fun tokenize(text: CharSequence): List<Token> = emptyList()
}

/**
 * Applies an ordered list of regex rules and keeps the first match that claims
 * a character range, so earlier rules win over later ones.
 *
 * Order matters: comments and strings must come before keywords, otherwise a
 * keyword inside a comment would be coloured.
 */
abstract class RegexSyntaxHighlighter : SyntaxHighlighter {

    protected data class Rule(val pattern: Regex, val type: TokenType)

    protected abstract val rules: List<Rule>

    override fun tokenize(text: CharSequence): List<Token> {
        if (text.isEmpty()) return emptyList()

        val claimed = BooleanArray(text.length)
        val tokens = ArrayList<Token>()

        for (rule in rules) {
            for (match in rule.pattern.findAll(text)) {
                val range = match.range
                if (range.isEmpty()) continue
                val start = range.first
                val end = range.last + 1

                var free = true
                for (i in start until end) {
                    if (claimed[i]) {
                        free = false
                        break
                    }
                }
                if (!free) continue

                for (i in start until end) claimed[i] = true
                tokens += Token(start, end, rule.type)
            }
        }

        tokens.sortBy { it.start }
        return tokens
    }

    protected companion object {
        /** Matches a keyword only when it is a whole word. */
        fun keywordPattern(keywords: Set<String>): Regex =
            Regex("\\b(?:" + keywords.joinToString("|") { Regex.escape(it) } + ")\\b")

        val NUMBER_PATTERN = Regex("\\b(?:0[xX][0-9a-fA-F_]+|\\d[\\d_]*(?:\\.[\\d_]+)?(?:[eE][+-]?\\d+)?)[fFdDlLuU]*\\b")
        val LINE_COMMENT = Regex("//[^\\n]*")
        val BLOCK_COMMENT = Regex("/\\*[\\s\\S]*?\\*/")
        val DOUBLE_QUOTED = Regex("\"(?:\\\\.|[^\"\\\\\\n])*\"?")
        val SINGLE_QUOTED = Regex("'(?:\\\\.|[^'\\\\\\n])*'?")
        val ANNOTATION = Regex("@\\w+")
        val TYPE_NAME = Regex("\\b[A-Z][A-Za-z0-9_]*\\b")
    }
}
