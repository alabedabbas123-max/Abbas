package com.abbas.ide.editor

import com.abbas.ide.editor.highlight.JavaHighlighter
import com.abbas.ide.editor.highlight.JsonHighlighter
import com.abbas.ide.editor.highlight.KotlinHighlighter
import com.abbas.ide.editor.highlight.LanguageRegistry
import com.abbas.ide.editor.highlight.TokenType
import com.abbas.ide.editor.highlight.XmlHighlighter
import org.junit.Assert.assertEquals
import org.junit.Assert.assertSame
import org.junit.Assert.assertTrue
import org.junit.Test

class HighlighterTest {

    @Test
    fun `resolves highlighter from extension`() {
        assertSame(KotlinHighlighter, LanguageRegistry.forFileName("Main.kt"))
        assertSame(JavaHighlighter, LanguageRegistry.forFileName("Main.java"))
        assertSame(XmlHighlighter, LanguageRegistry.forFileName("layout.xml"))
        assertSame(JsonHighlighter, LanguageRegistry.forFileName("data.json"))
    }

    @Test
    fun `tokens never overlap and stay ordered`() {
        val source = """
            // a comment with the keyword class
            public class Demo {
                private String name = "value";
                private int count = 42;
            }
        """.trimIndent()

        val tokens = JavaHighlighter.tokenize(source)
        assertTrue(tokens.isNotEmpty())

        var previousEnd = 0
        for (token in tokens) {
            assertTrue("tokens must be ordered", token.start >= previousEnd)
            assertTrue("token must be non-empty", token.end > token.start)
            previousEnd = token.end
        }
    }

    @Test
    fun `keyword inside a comment is not highlighted as a keyword`() {
        val source = "// class\n"
        val tokens = JavaHighlighter.tokenize(source)
        assertEquals(1, tokens.size)
        assertEquals(TokenType.COMMENT, tokens.first().type)
    }

    @Test
    fun `empty input yields no tokens`() {
        assertTrue(JavaHighlighter.tokenize("").isEmpty())
    }
}
