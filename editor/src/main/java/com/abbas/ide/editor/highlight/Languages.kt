package com.abbas.ide.editor.highlight

object JavaHighlighter : RegexSyntaxHighlighter() {
    override val languageId = "java"

    private val KEYWORDS = setOf(
        "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
        "class", "const", "continue", "default", "do", "double", "else", "enum",
        "extends", "final", "finally", "float", "for", "goto", "if", "implements",
        "import", "instanceof", "int", "interface", "long", "native", "new",
        "package", "private", "protected", "public", "return", "short", "static",
        "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
        "transient", "try", "void", "volatile", "while", "var", "record", "sealed",
        "true", "false", "null",
    )

    override val rules: List<Rule> = listOf(
        Rule(BLOCK_COMMENT, TokenType.COMMENT),
        Rule(LINE_COMMENT, TokenType.COMMENT),
        Rule(DOUBLE_QUOTED, TokenType.STRING),
        Rule(SINGLE_QUOTED, TokenType.STRING),
        Rule(ANNOTATION, TokenType.ANNOTATION),
        Rule(keywordPattern(KEYWORDS), TokenType.KEYWORD),
        Rule(NUMBER_PATTERN, TokenType.NUMBER),
        Rule(TYPE_NAME, TokenType.TYPE),
    )
}

object KotlinHighlighter : RegexSyntaxHighlighter() {
    override val languageId = "kotlin"

    private val KEYWORDS = setOf(
        "as", "break", "class", "continue", "do", "else", "false", "for", "fun",
        "if", "in", "interface", "is", "null", "object", "package", "return",
        "super", "this", "throw", "true", "try", "typealias", "typeof", "val",
        "var", "when", "while", "by", "catch", "constructor", "delegate",
        "dynamic", "field", "file", "finally", "get", "import", "init", "param",
        "property", "receiver", "set", "setparam", "where", "actual", "abstract",
        "annotation", "companion", "const", "crossinline", "data", "enum",
        "expect", "external", "final", "infix", "inline", "inner", "internal",
        "lateinit", "noinline", "open", "operator", "out", "override", "private",
        "protected", "public", "reified", "sealed", "suspend", "tailrec", "vararg",
    )

    private val TRIPLE_QUOTED = Regex("\"\"\"[\\s\\S]*?\"\"\"")

    override val rules: List<Rule> = listOf(
        Rule(BLOCK_COMMENT, TokenType.COMMENT),
        Rule(LINE_COMMENT, TokenType.COMMENT),
        Rule(TRIPLE_QUOTED, TokenType.STRING),
        Rule(DOUBLE_QUOTED, TokenType.STRING),
        Rule(SINGLE_QUOTED, TokenType.STRING),
        Rule(ANNOTATION, TokenType.ANNOTATION),
        Rule(keywordPattern(KEYWORDS), TokenType.KEYWORD),
        Rule(NUMBER_PATTERN, TokenType.NUMBER),
        Rule(TYPE_NAME, TokenType.TYPE),
    )
}

object XmlHighlighter : RegexSyntaxHighlighter() {
    override val languageId = "xml"

    private val XML_COMMENT = Regex("<!--[\\s\\S]*?-->")
    private val TAG = Regex("</?\\s*[A-Za-z_][\\w.:-]*|/?>")
    private val ATTRIBUTE = Regex("[A-Za-z_][\\w.:-]*(?=\\s*=)")

    override val rules: List<Rule> = listOf(
        Rule(XML_COMMENT, TokenType.COMMENT),
        Rule(DOUBLE_QUOTED, TokenType.STRING),
        Rule(SINGLE_QUOTED, TokenType.STRING),
        Rule(TAG, TokenType.MARKUP_TAG),
        Rule(ATTRIBUTE, TokenType.MARKUP_ATTRIBUTE),
    )
}

object JsonHighlighter : RegexSyntaxHighlighter() {
    override val languageId = "json"

    private val KEY = Regex("\"(?:\\\\.|[^\"\\\\\\n])*\"(?=\\s*:)")
    private val LITERAL = keywordPattern(setOf("true", "false", "null"))

    override val rules: List<Rule> = listOf(
        Rule(KEY, TokenType.MARKUP_ATTRIBUTE),
        Rule(DOUBLE_QUOTED, TokenType.STRING),
        Rule(LITERAL, TokenType.KEYWORD),
        Rule(NUMBER_PATTERN, TokenType.NUMBER),
    )
}

object GradleHighlighter : RegexSyntaxHighlighter() {
    override val languageId = "gradle"

    private val KEYWORDS = setOf(
        "plugins", "id", "apply", "dependencies", "implementation", "api",
        "testImplementation", "androidTestImplementation", "android", "defaultConfig",
        "buildTypes", "compileOptions", "kotlinOptions", "repositories", "google",
        "mavenCentral", "def", "task", "ext", "project", "rootProject", "true", "false",
        "version", "namespace", "compileSdk", "minSdk", "targetSdk",
    )

    override val rules: List<Rule> = listOf(
        Rule(BLOCK_COMMENT, TokenType.COMMENT),
        Rule(LINE_COMMENT, TokenType.COMMENT),
        Rule(DOUBLE_QUOTED, TokenType.STRING),
        Rule(SINGLE_QUOTED, TokenType.STRING),
        Rule(keywordPattern(KEYWORDS), TokenType.KEYWORD),
        Rule(NUMBER_PATTERN, TokenType.NUMBER),
    )
}

object PropertiesHighlighter : RegexSyntaxHighlighter() {
    override val languageId = "properties"

    private val COMMENT = Regex("(?m)^[ \\t]*[#!][^\\n]*")
    private val KEY = Regex("(?m)^[ \\t]*[\\w.\\-]+(?=[ \\t]*[=:])")

    override val rules: List<Rule> = listOf(
        Rule(COMMENT, TokenType.COMMENT),
        Rule(KEY, TokenType.MARKUP_ATTRIBUTE),
        Rule(NUMBER_PATTERN, TokenType.NUMBER),
    )
}

/** Resolves a highlighter from a file extension. */
object LanguageRegistry {

    private val byExtension: Map<String, SyntaxHighlighter> = mapOf(
        "java" to JavaHighlighter,
        "kt" to KotlinHighlighter,
        "kts" to KotlinHighlighter,
        "xml" to XmlHighlighter,
        "json" to JsonHighlighter,
        "gradle" to GradleHighlighter,
        "properties" to PropertiesHighlighter,
        "toml" to PropertiesHighlighter,
        "pro" to PropertiesHighlighter,
    )

    fun forExtension(extension: String): SyntaxHighlighter =
        byExtension[extension.lowercase()] ?: PlainTextHighlighter

    fun forFileName(fileName: String): SyntaxHighlighter =
        forExtension(fileName.substringAfterLast('.', ""))
}
