package com.google.googlejavaformat.java;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.googlejavaformat.java.javac.parser.JavaTokenizer;
import com.google.googlejavaformat.java.javac.parser.Scanner;
import com.google.googlejavaformat.java.javac.parser.ScannerFactory;
import com.google.googlejavaformat.java.javac.parser.Tokens;
import com.google.googlejavaformat.java.javac.parser.UnicodeReader;
import com.sun.tools.javac.util.Context;
import java.util.Set;

public class JavacTokens {
    private static final CharSequence EOF_COMMENT = "\n//EOF";

    public static ImmutableList<RawTok> getTokens(String source, Context context, Set<Tokens.TokenKind> stopTokens) {
        if (source == null) {
            return ImmutableList.m160of();
        }
        ScannerFactory fac = ScannerFactory.instance(context);
        char[] buffer = (source + ((Object) EOF_COMMENT)).toCharArray();
        Scanner scanner = new AccessibleScanner(fac, new CommentSavingTokenizer(fac, buffer, buffer.length));
        ImmutableList.Builder<RawTok> tokens = ImmutableList.builder();
        int last = 0;
        do {
            scanner.nextToken();
            Tokens.Token t = scanner.token();
            if (t.comments != null) {
                for (Tokens.Comment c : Lists.reverse(t.comments)) {
                    if (last < c.getSourcePos(0)) {
                        tokens.mo158add(new RawTok(null, null, last, c.getSourcePos(0)));
                    }
                    tokens.mo158add(new RawTok(null, null, c.getSourcePos(0), c.getSourcePos(0) + c.getText().length()));
                    last = c.getSourcePos(0) + c.getText().length();
                }
            }
            if (stopTokens.contains(t.kind)) {
                break;
            }
            if (last < t.f287pos) {
                tokens.mo158add(new RawTok(null, null, last, t.f287pos));
            }
            tokens.mo158add(new RawTok(t.kind == Tokens.TokenKind.STRINGLITERAL ? "\"" + t.stringVal() + "\"" : null, t.kind, t.f287pos, t.endPos));
            last = t.endPos;
        } while (scanner.token().kind != Tokens.TokenKind.EOF);
        if (last < source.length()) {
            tokens.mo158add(new RawTok(null, null, last, source.length()));
        }
        return tokens.build();
    }

    static class RawTok {
        private final int endPos;
        private final Tokens.TokenKind kind;

        private final int f273pos;
        private final String stringVal;

        RawTok(String stringVal, Tokens.TokenKind kind, int pos, int endPos) {
            this.stringVal = stringVal;
            this.kind = kind;
            this.f273pos = pos;
            this.endPos = endPos;
        }

        public Tokens.TokenKind kind() {
            return this.kind;
        }

        public int m444pos() {
            return this.f273pos;
        }

        public int endPos() {
            return this.endPos;
        }

        public String stringVal() {
            return this.stringVal;
        }
    }

    static class CommentSavingTokenizer extends JavaTokenizer {
        CommentSavingTokenizer(ScannerFactory fac, char[] buffer, int length) {
            super(fac, buffer, length);
        }

        @Override
        protected Tokens.Comment processComment(int pos, int endPos, Tokens.Comment.CommentStyle style) {
            char[] buf = this.reader.getRawCharacters(pos, endPos);
            return new CommentWithTextAndPosition(pos, endPos, new AccessibleReader(this.f277fac, buf, buf.length), style);
        }
    }

    static class CommentWithTextAndPosition implements Tokens.Comment {
        private final int endPos;

        private final int f272pos;
        private final AccessibleReader reader;
        private final Tokens.Comment.CommentStyle style;
        private String text = null;

        public CommentWithTextAndPosition(int pos, int endPos, AccessibleReader reader, Tokens.Comment.CommentStyle style) {
            this.f272pos = pos;
            this.endPos = endPos;
            this.reader = reader;
            this.style = style;
        }

        @Override
        public int getSourcePos(int index) {
            Preconditions.checkArgument(index >= 0 && index < this.endPos - this.f272pos, "Expected %s in the range [0, %s)", index, this.endPos - this.f272pos);
            return this.f272pos + index;
        }

        @Override
        public Tokens.Comment.CommentStyle getStyle() {
            return this.style;
        }

        @Override
        public String getText() {
            String text = this.text;
            if (text == null) {
                String text2 = new String(this.reader.getRawCharacters());
                this.text = text2;
                return text2;
            }
            return text;
        }

        @Override
        public boolean isDeprecated() {
            return false;
        }

        public String toString() {
            return String.format("Comment: '%s'", getText());
        }
    }

    static class AccessibleScanner extends Scanner {
        protected AccessibleScanner(ScannerFactory fac, JavaTokenizer tokenizer) {
            super(fac, tokenizer);
        }
    }

    static class AccessibleReader extends UnicodeReader {
        protected AccessibleReader(ScannerFactory fac, char[] buffer, int length) {
            super(fac, buffer, length);
        }
    }
}
