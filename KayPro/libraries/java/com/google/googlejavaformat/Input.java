package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableRangeMap;

public abstract class Input extends InputOutput {

    public interface InterfaceC0532Tok {
        int getColumn();

        int getIndex();

        String getOriginalText();

        int getPosition();

        String getText();

        boolean isComment();

        boolean isJavadocComment();

        boolean isNewline();

        boolean isSlashSlashComment();

        boolean isSlashStarComment();

        int length();
    }

    public interface Token {
        InterfaceC0532Tok getTok();

        ImmutableList<? extends InterfaceC0532Tok> getToksAfter();

        ImmutableList<? extends InterfaceC0532Tok> getToksBefore();
    }

    public abstract int getColumnNumber(int i);

    public abstract int getLineNumber(int i);

    public abstract ImmutableMap<Integer, Integer> getPositionToColumnMap();

    public abstract ImmutableRangeMap<Integer, ? extends Token> getPositionTokenMap();

    public abstract String getText();

    public abstract ImmutableList<? extends Token> getTokens();

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).m93add("super", super.toString()).toString();
    }

    public FormatterDiagnostic createDiagnostic(int inputPosition, String message) {
        return FormatterDiagnostic.create(getLineNumber(inputPosition), getColumnNumber(inputPosition), message);
    }
}
