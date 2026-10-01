package com.google.googlejavaformat.java.javadoc;

import com.google.common.collect.ImmutableList;
import com.google.googlejavaformat.java.JavaFormatterOptions;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class JavadocFormatter {
    private static final Token STANDARD_BR_TOKEN = new Token(Token.Type.BR_TAG, "<br>");
    private static final Token STANDARD_P_TOKEN = new Token(Token.Type.PARAGRAPH_OPEN_TAG, "<p>");
    private static final Pattern SIMPLE_TAG_PATTERN = Pattern.compile("^<\\w+\\s*/?\\s*>", 2);
    private static final Pattern ONE_CONTENT_LINE_PATTERN = Pattern.compile(" */[*][*]\n *[*] (.*)\n *[*]/");

    private JavadocFormatter() {
    }

    public static String formatJavadoc(String input, int blockIndent, JavaFormatterOptions options) {
        try {
            ImmutableList<Token> tokens = JavadocLexer.m445lex(input);
            String result = render(tokens, blockIndent, options);
            return makeSingleLineIfPossible(blockIndent, result, options);
        } catch (JavadocLexer.LexException e) {
            return input;
        }
    }

    private static String render(List<Token> input, int blockIndent, JavaFormatterOptions options) {
        JavadocWriter output = new JavadocWriter(blockIndent, options);
        for (Token token : input) {
            switch (C05581.f308x780db18b[token.getType().ordinal()]) {
                case 1:
                    output.writeBeginJavadoc();
                    break;
                case 2:
                    output.writeEndJavadoc();
                    return output.toString();
                case 3:
                    output.writeFooterJavadocTagStart(token);
                    break;
                case 4:
                    output.writeListOpen(token);
                    break;
                case 5:
                    output.writeListClose(token);
                    break;
                case 6:
                    output.writeListItemOpen(token);
                    break;
                case 7:
                    output.writeHeaderOpen(token);
                    break;
                case 8:
                    output.writeHeaderClose(token);
                    break;
                case 9:
                    output.writeParagraphOpen(standardizePToken(token));
                    break;
                case 10:
                case 11:
                    output.writeBlockquoteOpenOrClose(token);
                    break;
                case 12:
                    output.writePreOpen(token);
                    break;
                case 13:
                    output.writePreClose(token);
                    break;
                case 14:
                    output.writeCodeOpen(token);
                    break;
                case 15:
                    output.writeCodeClose(token);
                    break;
                case 16:
                    output.writeTableOpen(token);
                    break;
                case 17:
                    output.writeTableClose(token);
                    break;
                case 18:
                    output.requestMoeBeginStripComment(token);
                    break;
                case 19:
                    output.writeMoeEndStripComment(token);
                    break;
                case 20:
                    output.writeHtmlComment(token);
                    break;
                case 21:
                    output.writeBr(standardizeBrToken(token));
                    break;
                case 22:
                    output.requestWhitespace();
                    break;
                case 23:
                    output.writeLineBreakNoAutoIndent();
                    break;
                case 24:
                    output.writeLiteral(token);
                    break;
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    throw new AssertionError(token.getType());
            }
        }
        throw new AssertionError();
    }

    static class C05581 {

        static final int[] f308x780db18b;

        static {
            int[] iArr = new int[Token.Type.values().length];
            f308x780db18b = iArr;
            try {
                iArr[Token.Type.BEGIN_JAVADOC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f308x780db18b[Token.Type.END_JAVADOC.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f308x780db18b[Token.Type.FOOTER_JAVADOC_TAG_START.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f308x780db18b[Token.Type.LIST_OPEN_TAG.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f308x780db18b[Token.Type.LIST_CLOSE_TAG.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f308x780db18b[Token.Type.LIST_ITEM_OPEN_TAG.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f308x780db18b[Token.Type.HEADER_OPEN_TAG.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f308x780db18b[Token.Type.HEADER_CLOSE_TAG.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f308x780db18b[Token.Type.PARAGRAPH_OPEN_TAG.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f308x780db18b[Token.Type.BLOCKQUOTE_OPEN_TAG.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f308x780db18b[Token.Type.BLOCKQUOTE_CLOSE_TAG.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f308x780db18b[Token.Type.PRE_OPEN_TAG.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                f308x780db18b[Token.Type.PRE_CLOSE_TAG.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                f308x780db18b[Token.Type.CODE_OPEN_TAG.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                f308x780db18b[Token.Type.CODE_CLOSE_TAG.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                f308x780db18b[Token.Type.TABLE_OPEN_TAG.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                f308x780db18b[Token.Type.TABLE_CLOSE_TAG.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                f308x780db18b[Token.Type.MOE_BEGIN_STRIP_COMMENT.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
            try {
                f308x780db18b[Token.Type.MOE_END_STRIP_COMMENT.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
            }
            try {
                f308x780db18b[Token.Type.HTML_COMMENT.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
            }
            try {
                f308x780db18b[Token.Type.BR_TAG.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
            }
            try {
                f308x780db18b[Token.Type.WHITESPACE.ordinal()] = 22;
            } catch (NoSuchFieldError e22) {
            }
            try {
                f308x780db18b[Token.Type.FORCED_NEWLINE.ordinal()] = 23;
            } catch (NoSuchFieldError e23) {
            }
            try {
                f308x780db18b[Token.Type.LITERAL.ordinal()] = 24;
            } catch (NoSuchFieldError e24) {
            }
            try {
                f308x780db18b[Token.Type.PARAGRAPH_CLOSE_TAG.ordinal()] = 25;
            } catch (NoSuchFieldError e25) {
            }
            try {
                f308x780db18b[Token.Type.LIST_ITEM_CLOSE_TAG.ordinal()] = 26;
            } catch (NoSuchFieldError e26) {
            }
            try {
                f308x780db18b[Token.Type.OPTIONAL_LINE_BREAK.ordinal()] = 27;
            } catch (NoSuchFieldError e27) {
            }
        }
    }

    private static Token standardizeBrToken(Token token) {
        return standardize(token, STANDARD_BR_TOKEN);
    }

    private static Token standardizePToken(Token token) {
        return standardize(token, STANDARD_P_TOKEN);
    }

    private static Token standardize(Token token, Token standardToken) {
        return SIMPLE_TAG_PATTERN.matcher(token.getValue()).matches() ? standardToken : token;
    }

    private static String makeSingleLineIfPossible(int blockIndent, String input, JavaFormatterOptions options) {
        int oneLinerContentLength = (options.maxLineLength() - "/**  */".length()) - blockIndent;
        Matcher matcher = ONE_CONTENT_LINE_PATTERN.matcher(input);
        if (matcher.matches() && matcher.group(1).isEmpty()) {
            return "/** */";
        }
        if (matcher.matches() && matcher.group(1).length() <= oneLinerContentLength) {
            return "/** " + matcher.group(1) + " */";
        }
        return input;
    }
}
