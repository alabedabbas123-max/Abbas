package com.google.googlejavaformat.java.javadoc;

final class Token {
    private final Type type;
    private final String value;

    public enum Type {
        BEGIN_JAVADOC,
        END_JAVADOC,
        FOOTER_JAVADOC_TAG_START,
        LIST_OPEN_TAG,
        LIST_CLOSE_TAG,
        LIST_ITEM_OPEN_TAG,
        LIST_ITEM_CLOSE_TAG,
        HEADER_OPEN_TAG,
        HEADER_CLOSE_TAG,
        PARAGRAPH_OPEN_TAG,
        PARAGRAPH_CLOSE_TAG,
        BLOCKQUOTE_OPEN_TAG,
        BLOCKQUOTE_CLOSE_TAG,
        PRE_OPEN_TAG,
        PRE_CLOSE_TAG,
        CODE_OPEN_TAG,
        CODE_CLOSE_TAG,
        TABLE_OPEN_TAG,
        TABLE_CLOSE_TAG,
        MOE_BEGIN_STRIP_COMMENT,
        MOE_END_STRIP_COMMENT,
        HTML_COMMENT,
        BR_TAG,
        WHITESPACE,
        FORCED_NEWLINE,
        OPTIONAL_LINE_BREAK,
        LITERAL
    }

    Token(Type type, String value) {
        this.type = type;
        this.value = value;
    }

    Type getType() {
        return this.type;
    }

    String getValue() {
        return this.value;
    }

    int length() {
        return this.value.length();
    }

    public String toString() {
        return "\n" + getType() + ": " + getValue();
    }
}
