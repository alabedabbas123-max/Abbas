package com.google.googlejavaformat.java.javadoc;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Ordering;
import com.google.googlejavaformat.java.JavaFormatterOptions;

final class JavadocWriter {
    private static final ImmutableSet<Token.Type> START_OF_LINE_TOKENS = ImmutableSet.m214of(Token.Type.LIST_ITEM_OPEN_TAG, Token.Type.PARAGRAPH_OPEN_TAG, Token.Type.HEADER_OPEN_TAG);
    private boolean atStartOfLine;
    private final int blockIndent;
    private boolean continuingFooterTag;
    private boolean continuingListItemOfInnermostList;
    private int indentForMoeEndStripComment;
    private final JavaFormatterOptions options;
    private int remainingOnLine;
    private Token requestedMoeBeginStripComment;
    private boolean wroteAnythingSignificant;
    private final StringBuilder output = new StringBuilder();
    private final NestingCounter continuingListItemCount = new NestingCounter();
    private final NestingCounter continuingListCount = new NestingCounter();
    private final NestingCounter postWriteModifiedContinuingListCount = new NestingCounter();
    private RequestedWhitespace requestedWhitespace = RequestedWhitespace.NONE;

    enum AutoIndent {
        AUTO_INDENT,
        NO_AUTO_INDENT
    }

    enum RequestedWhitespace {
        NONE,
        WHITESPACE,
        NEWLINE,
        BLANK_LINE
    }

    JavadocWriter(int blockIndent, JavaFormatterOptions options) {
        this.blockIndent = blockIndent;
        this.options = (JavaFormatterOptions) Preconditions.checkNotNull(options);
    }

    void requestWhitespace() {
        requestWhitespace(RequestedWhitespace.WHITESPACE);
    }

    void requestMoeBeginStripComment(Token token) {
        this.requestedMoeBeginStripComment = (Token) Preconditions.checkNotNull(token);
    }

    void writeBeginJavadoc() {
        this.output.append("/**");
        writeNewline();
    }

    void writeEndJavadoc() {
        this.output.append("\n");
        appendSpaces(this.blockIndent + 1);
        this.output.append("*/");
    }

    void writeFooterJavadocTagStart(Token token) {
        this.continuingListItemOfInnermostList = false;
        this.continuingListItemCount.reset();
        this.continuingListCount.reset();
        this.postWriteModifiedContinuingListCount.reset();
        if (this.wroteAnythingSignificant) {
            if (!this.continuingFooterTag) {
                requestBlankLine();
            } else {
                this.continuingFooterTag = false;
                requestNewline();
            }
        }
        writeToken(token);
        this.continuingFooterTag = true;
    }

    void writeListOpen(Token token) {
        requestBlankLine();
        writeToken(token);
        this.continuingListItemOfInnermostList = false;
        this.continuingListCount.increment();
        this.postWriteModifiedContinuingListCount.increment();
        requestNewline();
    }

    void writeListClose(Token token) {
        requestNewline();
        this.continuingListItemCount.decrementIfPositive();
        this.continuingListCount.decrementIfPositive();
        writeToken(token);
        this.postWriteModifiedContinuingListCount.decrementIfPositive();
        requestBlankLine();
    }

    void writeListItemOpen(Token token) {
        requestNewline();
        if (this.continuingListItemOfInnermostList) {
            this.continuingListItemOfInnermostList = false;
            this.continuingListItemCount.decrementIfPositive();
        }
        writeToken(token);
        this.continuingListItemOfInnermostList = true;
        this.continuingListItemCount.increment();
    }

    void writeHeaderOpen(Token token) {
        requestBlankLine();
        writeToken(token);
    }

    void writeHeaderClose(Token token) {
        writeToken(token);
        requestBlankLine();
    }

    void writeParagraphOpen(Token token) {
        if (!this.wroteAnythingSignificant) {
            return;
        }
        requestBlankLine();
        writeToken(token);
    }

    void writeBlockquoteOpenOrClose(Token token) {
        requestBlankLine();
        writeToken(token);
        requestBlankLine();
    }

    void writePreOpen(Token token) {
        requestBlankLine();
        writeToken(token);
    }

    void writePreClose(Token token) {
        writeToken(token);
        requestBlankLine();
    }

    void writeCodeOpen(Token token) {
        writeToken(token);
    }

    void writeCodeClose(Token token) {
        writeToken(token);
    }

    void writeTableOpen(Token token) {
        requestBlankLine();
        writeToken(token);
    }

    void writeTableClose(Token token) {
        writeToken(token);
        requestBlankLine();
    }

    void writeMoeEndStripComment(Token token) {
        writeLineBreakNoAutoIndent();
        appendSpaces(this.indentForMoeEndStripComment);
        writeToken(token);
        requestNewline();
    }

    void writeHtmlComment(Token token) {
        requestNewline();
        writeToken(token);
        requestNewline();
    }

    void writeBr(Token token) {
        writeToken(token);
        requestNewline();
    }

    void writeLineBreakNoAutoIndent() {
        writeNewline(AutoIndent.NO_AUTO_INDENT);
    }

    void writeLiteral(Token token) {
        writeToken(token);
    }

    public String toString() {
        return this.output.toString();
    }

    private void requestBlankLine() {
        requestWhitespace(RequestedWhitespace.BLANK_LINE);
    }

    private void requestNewline() {
        requestWhitespace(RequestedWhitespace.NEWLINE);
    }

    private void requestWhitespace(RequestedWhitespace requestedWhitespace) {
        this.requestedWhitespace = (RequestedWhitespace) Ordering.natural().mo286max(requestedWhitespace, this.requestedWhitespace);
    }

    private void writeToken(Token token) {
        if (this.requestedMoeBeginStripComment != null) {
            requestNewline();
        }
        if (this.requestedWhitespace == RequestedWhitespace.BLANK_LINE && (this.postWriteModifiedContinuingListCount.isPositive() || this.continuingFooterTag)) {
            this.requestedWhitespace = RequestedWhitespace.NEWLINE;
        }
        if (this.requestedWhitespace == RequestedWhitespace.BLANK_LINE) {
            writeBlankLine();
            this.requestedWhitespace = RequestedWhitespace.NONE;
        } else if (this.requestedWhitespace == RequestedWhitespace.NEWLINE) {
            writeNewline();
            this.requestedWhitespace = RequestedWhitespace.NONE;
        }
        boolean needWhitespace = this.requestedWhitespace == RequestedWhitespace.WHITESPACE;
        if (!this.atStartOfLine) {
            if (token.length() + (needWhitespace ? 1 : 0) > this.remainingOnLine) {
                writeNewline();
            }
        }
        if (!this.atStartOfLine && needWhitespace) {
            this.output.append(" ");
            this.remainingOnLine--;
        }
        Token token2 = this.requestedMoeBeginStripComment;
        if (token2 != null) {
            this.output.append(token2.getValue());
            this.requestedMoeBeginStripComment = null;
            this.indentForMoeEndStripComment = innerIndent();
            requestNewline();
            writeToken(token);
            return;
        }
        this.output.append(token.getValue());
        if (!START_OF_LINE_TOKENS.contains(token.getType())) {
            this.atStartOfLine = false;
        }
        this.remainingOnLine -= token.length();
        this.requestedWhitespace = RequestedWhitespace.NONE;
        this.wroteAnythingSignificant = true;
    }

    private void writeBlankLine() {
        this.output.append("\n");
        appendSpaces(this.blockIndent + 1);
        this.output.append("*");
        writeNewline();
    }

    private void writeNewline() {
        writeNewline(AutoIndent.AUTO_INDENT);
    }

    private void writeNewline(AutoIndent autoIndent) {
        this.output.append("\n");
        appendSpaces(this.blockIndent + 1);
        this.output.append("*");
        appendSpaces(1);
        this.remainingOnLine = (this.options.maxLineLength() - this.blockIndent) - 3;
        if (autoIndent == AutoIndent.AUTO_INDENT) {
            appendSpaces(innerIndent());
            this.remainingOnLine -= innerIndent();
        }
        this.atStartOfLine = true;
    }

    private int innerIndent() {
        int innerIndent = (this.continuingListItemCount.value() * 4) + (this.continuingListCount.value() * 2);
        if (this.continuingFooterTag) {
            return innerIndent + 4;
        }
        return innerIndent;
    }

    private void appendSpaces(int count) {
        this.output.append(Strings.repeat(" ", count));
    }
}
