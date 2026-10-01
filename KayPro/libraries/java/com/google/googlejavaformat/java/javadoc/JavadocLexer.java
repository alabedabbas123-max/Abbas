package com.google.googlejavaformat.java.javadoc;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.regex.Pattern;

final class JavadocLexer {
    private final CharStream input;
    private boolean somethingSinceNewline;
    private static final Pattern NON_UNIX_LINE_ENDING = Pattern.compile("\r\n?");
    private static final CharMatcher NEWLINE = CharMatcher.m81is('\n');
    private static final Pattern NEWLINE_PATTERN = Pattern.compile("^[ \t]*\n[ \t]*[*]?[ \t]?");
    private static final Pattern FOOTER_TAG_PATTERN = Pattern.compile("^@(param\\s+<\\w+>|[a-z]\\w*)");
    private static final Pattern MOE_BEGIN_STRIP_COMMENT_PATTERN = Pattern.compile("^<!--\\s*MOE:begin_intracomment_strip\\s*-->");
    private static final Pattern MOE_END_STRIP_COMMENT_PATTERN = Pattern.compile("^<!--\\s*MOE:end_intracomment_strip\\s*-->");
    private static final Pattern HTML_COMMENT_PATTERN = fullCommentPattern();
    private static final Pattern PRE_OPEN_PATTERN = openTagPattern("pre");
    private static final Pattern PRE_CLOSE_PATTERN = closeTagPattern("pre");
    private static final Pattern CODE_OPEN_PATTERN = openTagPattern("code");
    private static final Pattern CODE_CLOSE_PATTERN = closeTagPattern("code");
    private static final Pattern TABLE_OPEN_PATTERN = openTagPattern("table");
    private static final Pattern TABLE_CLOSE_PATTERN = closeTagPattern("table");
    private static final Pattern LIST_OPEN_PATTERN = openTagPattern("ul|ol|dl");
    private static final Pattern LIST_CLOSE_PATTERN = closeTagPattern("ul|ol|dl");
    private static final Pattern LIST_ITEM_OPEN_PATTERN = openTagPattern("li|dt|dd");
    private static final Pattern LIST_ITEM_CLOSE_PATTERN = closeTagPattern("li|dt|dd");
    private static final Pattern HEADER_OPEN_PATTERN = openTagPattern("h[1-6]");
    private static final Pattern HEADER_CLOSE_PATTERN = closeTagPattern("h[1-6]");
    private static final Pattern PARAGRAPH_OPEN_PATTERN = openTagPattern("p");
    private static final Pattern PARAGRAPH_CLOSE_PATTERN = closeTagPattern("p");
    private static final Pattern BLOCKQUOTE_OPEN_PATTERN = openTagPattern("blockquote");
    private static final Pattern BLOCKQUOTE_CLOSE_PATTERN = closeTagPattern("blockquote");
    private static final Pattern BR_PATTERN = openTagPattern("br");
    private static final Pattern INLINE_TAG_OPEN_PATTERN = Pattern.compile("^[{]@\\w*");
    private static final Pattern LITERAL_PATTERN = Pattern.compile("^.[^ \t\n@<{}*]*");
    private final NestingCounter braceDepth = new NestingCounter();
    private final NestingCounter preDepth = new NestingCounter();
    private final NestingCounter codeDepth = new NestingCounter();
    private final NestingCounter tableDepth = new NestingCounter();

    private JavadocLexer(CharStream input) {
        this.input = (CharStream) Preconditions.checkNotNull(input);
    }

    static ImmutableList<Token> m445lex(String input) throws LexException {
        return new JavadocLexer(new CharStream(normalizeLineEndings(stripJavadocBeginAndEnd(input)))).generateTokens();
    }

    private static String normalizeLineEndings(String input) {
        return NON_UNIX_LINE_ENDING.matcher(input).replaceAll("\n");
    }

    private static String stripJavadocBeginAndEnd(String input) {
        Preconditions.checkArgument(input.startsWith("/**"), "Missing /**: %s", input);
        Preconditions.checkArgument(input.endsWith("*/") && input.length() > 4, "Missing */: %s", input);
        return input.substring("/**".length(), input.length() - "*/".length());
    }

    private static ImmutableList<Token> joinAdjacentLiteralsAndAdjacentWhitespace(List<Token> input) {
        ImmutableList.Builder builder = ImmutableList.builder();
        StringBuilder accumulated = new StringBuilder();
        PeekingIterator<Token> tokens = Iterators.peekingIterator(input.iterator());
        while (tokens.hasNext()) {
            if (tokens.peek().getType() == Token.Type.LITERAL) {
                accumulated.append(tokens.peek().getValue());
                tokens.next();
            } else if (accumulated.length() == 0) {
                builder.mo158add(tokens.peek());
                tokens.next();
            } else {
                StringBuilder seenWhitespace = new StringBuilder();
                while (tokens.peek().getType() == Token.Type.WHITESPACE) {
                    seenWhitespace.append(tokens.next().getValue());
                }
                if (tokens.peek().getType() == Token.Type.LITERAL && tokens.peek().getValue().startsWith("@")) {
                    accumulated.append(" ");
                    accumulated.append(tokens.peek().getValue());
                    tokens.next();
                } else {
                    builder.mo158add(new Token(Token.Type.LITERAL, accumulated.toString()));
                    accumulated.setLength(0);
                    if (seenWhitespace.length() > 0) {
                        builder.mo158add(new Token(Token.Type.WHITESPACE, seenWhitespace.toString()));
                    }
                }
            }
        }
        return builder.build();
    }

    private static ImmutableList<Token> inferParagraphTags(List<Token> input) {
        ImmutableList.Builder builder = ImmutableList.builder();
        PeekingIterator<Token> tokens = Iterators.peekingIterator(input.iterator());
        while (tokens.hasNext()) {
            if (tokens.peek().getType() == Token.Type.LITERAL) {
                builder.mo158add(tokens.next());
                if (tokens.peek().getType() == Token.Type.WHITESPACE && hasMultipleNewlines(tokens.peek().getValue())) {
                    builder.mo158add(tokens.next());
                    if (tokens.peek().getType() == Token.Type.LITERAL) {
                        builder.mo158add(new Token(Token.Type.PARAGRAPH_OPEN_TAG, "<p>"));
                    }
                }
            } else {
                builder.mo158add(tokens.next());
            }
        }
        return builder.build();
    }

    private static ImmutableList<Token> optionalizeSpacesAfterLinks(List<Token> input) {
        ImmutableList.Builder builder = ImmutableList.builder();
        PeekingIterator<Token> tokens = Iterators.peekingIterator(input.iterator());
        while (tokens.hasNext()) {
            if (tokens.peek().getType() == Token.Type.LITERAL && tokens.peek().getValue().matches("^href=[^>]*>")) {
                builder.mo158add(tokens.next());
                if (tokens.peek().getType() == Token.Type.WHITESPACE) {
                    builder.mo158add(new Token(Token.Type.OPTIONAL_LINE_BREAK, tokens.next().getValue()));
                }
            } else {
                builder.mo158add(tokens.next());
            }
        }
        return builder.build();
    }

    private static ImmutableList<Token> deindentPreCodeBlocks(List<Token> input) {
        ImmutableList.Builder builder = ImmutableList.builder();
        PeekingIterator<Token> tokens = Iterators.peekingIterator(input.iterator());
        while (tokens.hasNext()) {
            if (tokens.peek().getType() != Token.Type.PRE_OPEN_TAG) {
                builder.mo158add(tokens.next());
            } else {
                builder.mo158add(tokens.next());
                ArrayList arrayList = new ArrayList();
                while (tokens.hasNext() && tokens.peek().getType() == Token.Type.FORCED_NEWLINE) {
                    arrayList.add(tokens.next());
                }
                if (tokens.peek().getType() != Token.Type.LITERAL || !tokens.peek().getValue().matches("[ \t]*[{]@code")) {
                    builder.addAll((Iterable) arrayList);
                    builder.mo158add(tokens.next());
                } else {
                    deindentPreCodeBlock(builder, tokens);
                }
            }
        }
        return builder.build();
    }

    private static void deindentPreCodeBlock(ImmutableList.Builder<Token> output, PeekingIterator<Token> tokens) {
        String value;
        int idx;
        Deque<Token> saved = new ArrayDeque<>();
        output.mo158add(new Token(Token.Type.LITERAL, tokens.next().getValue().trim()));
        while (tokens.hasNext() && tokens.peek().getType() != Token.Type.PRE_CLOSE_TAG) {
            saved.addLast(tokens.next());
        }
        while (!saved.isEmpty() && saved.peekFirst().getType() == Token.Type.FORCED_NEWLINE) {
            saved.removeFirst();
        }
        while (!saved.isEmpty() && saved.peekLast().getType() == Token.Type.FORCED_NEWLINE) {
            saved.removeLast();
        }
        if (saved.isEmpty()) {
            return;
        }
        Token last = saved.peekLast();
        boolean trailingBrace = false;
        if (last.getType() == Token.Type.LITERAL && last.getValue().endsWith("}")) {
            saved.removeLast();
            if (last.length() > 1) {
                saved.addLast(new Token(Token.Type.LITERAL, last.getValue().substring(0, last.getValue().length() - 1)));
                saved.addLast(new Token(Token.Type.FORCED_NEWLINE, null));
            }
            trailingBrace = true;
        }
        int trim = -1;
        for (Token token : saved) {
            if (token.getType() == Token.Type.LITERAL && (idx = CharMatcher.isNot(' ').indexIn(token.getValue())) != -1 && (trim == -1 || idx < trim)) {
                trim = idx;
            }
        }
        output.mo158add(new Token(Token.Type.FORCED_NEWLINE, "\n"));
        for (Token token2 : saved) {
            if (token2.getType() == Token.Type.LITERAL) {
                Token.Type type = Token.Type.LITERAL;
                if (trim > 0 && token2.length() > trim) {
                    value = token2.getValue().substring(trim);
                } else {
                    value = token2.getValue();
                }
                output.mo158add(new Token(type, value));
            } else {
                output.mo158add(token2);
            }
        }
        if (trailingBrace) {
            output.mo158add(new Token(Token.Type.LITERAL, "}"));
        } else {
            output.mo158add(new Token(Token.Type.FORCED_NEWLINE, "\n"));
        }
    }

    private static boolean hasMultipleNewlines(String s) {
        return NEWLINE.countIn(s) > 1;
    }

    private static Pattern fullCommentPattern() {
        return Pattern.compile("^<!--.*?-->", 32);
    }

    private static Pattern openTagPattern(String namePattern) {
        return Pattern.compile(String.format("^<(?:%s)\\b[^>]*>", namePattern), 2);
    }

    private static Pattern closeTagPattern(String namePattern) {
        return Pattern.compile(String.format("^</(?:%s)\\b[^>]*>", namePattern), 2);
    }

    private ImmutableList<Token> generateTokens() throws LexException {
        ImmutableList.Builder<Token> tokens = ImmutableList.builder();
        Token token = new Token(Token.Type.BEGIN_JAVADOC, "/**");
        tokens.mo158add(token);
        while (!this.input.isExhausted()) {
            Token token2 = readToken();
            tokens.mo158add(token2);
        }
        checkMatchingTags();
        Token token3 = new Token(Token.Type.END_JAVADOC, "*/");
        tokens.mo158add(token3);
        ImmutableList<Token> result = tokens.build();
        return deindentPreCodeBlocks(optionalizeSpacesAfterLinks(inferParagraphTags(joinAdjacentLiteralsAndAdjacentWhitespace(result))));
    }

    private Token readToken() throws LexException {
        Token.Type type = consumeToken();
        String value = this.input.readAndResetRecorded();
        return new Token(type, value);
    }

    private Token.Type consumeToken() throws LexException {
        boolean preserveExistingFormatting = preserveExistingFormatting();
        if (this.input.tryConsumeRegex(NEWLINE_PATTERN)) {
            this.somethingSinceNewline = false;
            return preserveExistingFormatting ? Token.Type.FORCED_NEWLINE : Token.Type.WHITESPACE;
        }
        if (this.input.tryConsume(" ") || this.input.tryConsume("\t")) {
            return preserveExistingFormatting ? Token.Type.LITERAL : Token.Type.WHITESPACE;
        }
        if (!this.somethingSinceNewline && this.input.tryConsumeRegex(FOOTER_TAG_PATTERN)) {
            checkMatchingTags();
            this.somethingSinceNewline = true;
            return Token.Type.FOOTER_JAVADOC_TAG_START;
        }
        this.somethingSinceNewline = true;
        if (this.input.tryConsumeRegex(INLINE_TAG_OPEN_PATTERN)) {
            this.braceDepth.increment();
            return Token.Type.LITERAL;
        }
        if (this.input.tryConsume("{")) {
            this.braceDepth.incrementIfPositive();
            return Token.Type.LITERAL;
        }
        if (this.input.tryConsume("}")) {
            this.braceDepth.decrementIfPositive();
            return Token.Type.LITERAL;
        }
        if (this.braceDepth.isPositive()) {
            Verify.verify(this.input.tryConsumeRegex(LITERAL_PATTERN));
            return Token.Type.LITERAL;
        }
        if (this.input.tryConsumeRegex(PRE_OPEN_PATTERN)) {
            this.preDepth.increment();
            return preserveExistingFormatting ? Token.Type.LITERAL : Token.Type.PRE_OPEN_TAG;
        }
        if (this.input.tryConsumeRegex(PRE_CLOSE_PATTERN)) {
            this.preDepth.decrementIfPositive();
            return preserveExistingFormatting() ? Token.Type.LITERAL : Token.Type.PRE_CLOSE_TAG;
        }
        if (this.input.tryConsumeRegex(CODE_OPEN_PATTERN)) {
            this.codeDepth.increment();
            return preserveExistingFormatting ? Token.Type.LITERAL : Token.Type.CODE_OPEN_TAG;
        }
        if (this.input.tryConsumeRegex(CODE_CLOSE_PATTERN)) {
            this.codeDepth.decrementIfPositive();
            return preserveExistingFormatting() ? Token.Type.LITERAL : Token.Type.CODE_CLOSE_TAG;
        }
        if (this.input.tryConsumeRegex(TABLE_OPEN_PATTERN)) {
            this.tableDepth.increment();
            return preserveExistingFormatting ? Token.Type.LITERAL : Token.Type.TABLE_OPEN_TAG;
        }
        if (this.input.tryConsumeRegex(TABLE_CLOSE_PATTERN)) {
            this.tableDepth.decrementIfPositive();
            return preserveExistingFormatting() ? Token.Type.LITERAL : Token.Type.TABLE_CLOSE_TAG;
        }
        if (preserveExistingFormatting) {
            Verify.verify(this.input.tryConsumeRegex(LITERAL_PATTERN));
            return Token.Type.LITERAL;
        }
        if (this.input.tryConsumeRegex(PARAGRAPH_OPEN_PATTERN)) {
            return Token.Type.PARAGRAPH_OPEN_TAG;
        }
        if (this.input.tryConsumeRegex(PARAGRAPH_CLOSE_PATTERN)) {
            return Token.Type.PARAGRAPH_CLOSE_TAG;
        }
        if (this.input.tryConsumeRegex(LIST_OPEN_PATTERN)) {
            return Token.Type.LIST_OPEN_TAG;
        }
        if (this.input.tryConsumeRegex(LIST_CLOSE_PATTERN)) {
            return Token.Type.LIST_CLOSE_TAG;
        }
        if (this.input.tryConsumeRegex(LIST_ITEM_OPEN_PATTERN)) {
            return Token.Type.LIST_ITEM_OPEN_TAG;
        }
        if (this.input.tryConsumeRegex(LIST_ITEM_CLOSE_PATTERN)) {
            return Token.Type.LIST_ITEM_CLOSE_TAG;
        }
        if (this.input.tryConsumeRegex(BLOCKQUOTE_OPEN_PATTERN)) {
            return Token.Type.BLOCKQUOTE_OPEN_TAG;
        }
        if (this.input.tryConsumeRegex(BLOCKQUOTE_CLOSE_PATTERN)) {
            return Token.Type.BLOCKQUOTE_CLOSE_TAG;
        }
        if (this.input.tryConsumeRegex(HEADER_OPEN_PATTERN)) {
            return Token.Type.HEADER_OPEN_TAG;
        }
        if (this.input.tryConsumeRegex(HEADER_CLOSE_PATTERN)) {
            return Token.Type.HEADER_CLOSE_TAG;
        }
        if (this.input.tryConsumeRegex(BR_PATTERN)) {
            return Token.Type.BR_TAG;
        }
        if (this.input.tryConsumeRegex(MOE_BEGIN_STRIP_COMMENT_PATTERN)) {
            return Token.Type.MOE_BEGIN_STRIP_COMMENT;
        }
        if (this.input.tryConsumeRegex(MOE_END_STRIP_COMMENT_PATTERN)) {
            return Token.Type.MOE_END_STRIP_COMMENT;
        }
        if (this.input.tryConsumeRegex(HTML_COMMENT_PATTERN)) {
            return Token.Type.HTML_COMMENT;
        }
        if (this.input.tryConsumeRegex(LITERAL_PATTERN)) {
            return Token.Type.LITERAL;
        }
        throw new AssertionError();
    }

    private boolean preserveExistingFormatting() {
        return this.preDepth.isPositive() || this.tableDepth.isPositive() || this.codeDepth.isPositive();
    }

    private void checkMatchingTags() throws LexException {
        if (this.braceDepth.isPositive() || this.preDepth.isPositive() || this.tableDepth.isPositive() || this.codeDepth.isPositive()) {
            throw new LexException();
        }
    }

    static class LexException extends Exception {
        LexException() {
        }
    }
}
