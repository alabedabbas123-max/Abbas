package com.google.googlejavaformat.java.javac.parser;

import com.sun.tools.javac.util.Position;
import java.nio.CharBuffer;

public class JavadocTokenizer extends JavaTokenizer {
    protected JavadocTokenizer(ScannerFactory fac, CharBuffer buffer) {
        super(fac, buffer);
    }

    protected JavadocTokenizer(ScannerFactory fac, char[] input, int inputLength) {
        super(fac, input, inputLength);
    }

    @Override
    protected Tokens.Comment processComment(int pos, int endPos, Tokens.Comment.CommentStyle style) {
        char[] buf = this.reader.getRawCharacters(pos, endPos);
        return new JavadocComment(new DocReader(this.f277fac, buf, buf.length, pos), style);
    }

    static class DocReader extends UnicodeReader {

        int f282col;
        int[] pbuf;

        int f283pp;
        int startPos;

        DocReader(ScannerFactory fac, char[] input, int inputLength, int startPos) {
            super(fac, input, inputLength);
            this.pbuf = new int[128];
            this.f283pp = 0;
            this.startPos = startPos;
        }

        @Override
        protected void convertUnicode() {
            if (this.f305ch == '\\' && this.unicodeConversionBp != this.f303bp) {
                this.f303bp++;
                this.f305ch = this.f304buf[this.f303bp];
                this.f282col++;
                if (this.f305ch == 'u') {
                    do {
                        this.f303bp++;
                        this.f305ch = this.f304buf[this.f303bp];
                        this.f282col++;
                    } while (this.f305ch == 'u');
                    int limit = this.f303bp + 3;
                    if (limit < this.buflen) {
                        int d = digit(this.f303bp, 16);
                        int code = d;
                        while (this.f303bp < limit && d >= 0) {
                            this.f303bp++;
                            this.f305ch = this.f304buf[this.f303bp];
                            this.f282col++;
                            d = digit(this.f303bp, 16);
                            code = (code << 4) + d;
                        }
                        if (d >= 0) {
                            this.f305ch = (char) code;
                            this.unicodeConversionBp = this.f303bp;
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f303bp--;
                this.f305ch = '\\';
                this.f282col--;
            }
        }

        @Override
        protected void scanCommentChar() {
            scanChar();
            if (this.f305ch == '\\') {
                if (peekChar() == '\\' && !isUnicode()) {
                    putChar(this.f305ch, false);
                    this.f303bp++;
                    this.f282col++;
                    return;
                }
                convertUnicode();
            }
        }

        @Override
        protected void scanChar() {
            this.f303bp++;
            this.f305ch = this.f304buf[this.f303bp];
            char c = this.f305ch;
            if (c == '\t') {
                this.f282col = ((this.f282col / 8) * 8) + 8;
                return;
            }
            if (c == '\n') {
                if (this.f303bp == 0 || this.f304buf[this.f303bp - 1] != '\r') {
                    this.f282col = 0;
                    return;
                }
                return;
            }
            if (c == '\r') {
                this.f282col = 0;
            } else if (c == '\\') {
                this.f282col++;
                convertUnicode();
            } else {
                this.f282col++;
            }
        }

        @Override
        public void putChar(char ch, boolean scan) {
            if (this.f283pp == 0 || this.f307sp - this.pbuf[this.f283pp - 2] != (this.startPos + this.f303bp) - this.pbuf[this.f283pp - 1]) {
                int i = this.f283pp + 1;
                int[] iArr = this.pbuf;
                if (i >= iArr.length) {
                    int[] new_pbuf = new int[iArr.length * 2];
                    System.arraycopy(iArr, 0, new_pbuf, 0, iArr.length);
                    this.pbuf = new_pbuf;
                }
                this.pbuf[this.f283pp] = this.f307sp;
                this.pbuf[this.f283pp + 1] = this.startPos + this.f303bp;
                this.f283pp += 2;
            }
            super.putChar(ch, scan);
        }
    }

    protected static class JavadocComment extends JavaTokenizer.BasicComment<DocReader> {
        private String docComment;
        private int[] docPosns;

        JavadocComment(DocReader reader, Tokens.Comment.CommentStyle cs) {
            super(reader, cs);
            this.docComment = null;
            this.docPosns = null;
        }

        @Override
        public String getText() {
            if (!this.scanned && this.f281cs == Tokens.Comment.CommentStyle.JAVADOC) {
                scanDocComment();
            }
            return this.docComment;
        }

        @Override
        public int getSourcePos(int pos) {
            if (pos == -1) {
                return -1;
            }
            if (pos < 0 || pos > this.docComment.length()) {
                throw new StringIndexOutOfBoundsException(String.valueOf(pos));
            }
            int[] iArr = this.docPosns;
            if (iArr == null) {
                return -1;
            }
            int start = 0;
            int end = iArr.length;
            while (start < end - 2) {
                int index = ((start + end) / 4) * 2;
                int[] iArr2 = this.docPosns;
                if (iArr2[index] < pos) {
                    start = index;
                } else {
                    if (iArr2[index] == pos) {
                        return iArr2[index + 1];
                    }
                    end = index;
                }
            }
            int[] iArr3 = this.docPosns;
            return iArr3[start + 1] + (pos - iArr3[start]);
        }

        @Override
        protected void scanDocComment() {
            char c;
            boolean firstLine = true;
            try {
                ((DocReader) this.comment_reader).scanCommentChar();
                ((DocReader) this.comment_reader).scanCommentChar();
                while (((DocReader) this.comment_reader).f303bp < ((DocReader) this.comment_reader).buflen && ((DocReader) this.comment_reader).f305ch == '*') {
                    ((DocReader) this.comment_reader).scanCommentChar();
                }
                if (((DocReader) this.comment_reader).f303bp >= ((DocReader) this.comment_reader).buflen || ((DocReader) this.comment_reader).f305ch != '/') {
                    if (((DocReader) this.comment_reader).f303bp < ((DocReader) this.comment_reader).buflen) {
                        if (((DocReader) this.comment_reader).f305ch == '\n') {
                            ((DocReader) this.comment_reader).scanCommentChar();
                            firstLine = false;
                        } else if (((DocReader) this.comment_reader).f305ch == '\r') {
                            ((DocReader) this.comment_reader).scanCommentChar();
                            if (((DocReader) this.comment_reader).f305ch == '\n') {
                                ((DocReader) this.comment_reader).scanCommentChar();
                                firstLine = false;
                            }
                        }
                    }
                    loop1: while (((DocReader) this.comment_reader).f303bp < ((DocReader) this.comment_reader).buflen) {
                        int begin_bp = ((DocReader) this.comment_reader).f303bp;
                        char begin_ch = ((DocReader) this.comment_reader).f305ch;
                        while (true) {
                            c = '\f';
                            if (((DocReader) this.comment_reader).f303bp >= ((DocReader) this.comment_reader).buflen) {
                                break;
                            }
                            char c2 = ((DocReader) this.comment_reader).f305ch;
                            if (c2 == '\t') {
                                ((DocReader) this.comment_reader).f282col = (((((DocReader) this.comment_reader).f282col - 1) / 8) * 8) + 8;
                                ((DocReader) this.comment_reader).scanCommentChar();
                            } else if (c2 == '\f') {
                                ((DocReader) this.comment_reader).f282col = 0;
                                ((DocReader) this.comment_reader).scanCommentChar();
                            } else if (c2 != ' ') {
                                break;
                            } else {
                                ((DocReader) this.comment_reader).scanCommentChar();
                            }
                        }
                        if (((DocReader) this.comment_reader).f305ch == '*') {
                            do {
                                ((DocReader) this.comment_reader).scanCommentChar();
                            } while (((DocReader) this.comment_reader).f305ch == '*');
                            if (((DocReader) this.comment_reader).f305ch != '/') {
                                break;
                            } else {
                                break;
                            }
                        }
                        if (!firstLine) {
                            ((DocReader) this.comment_reader).f303bp = begin_bp;
                            ((DocReader) this.comment_reader).f305ch = begin_ch;
                        }
                        while (((DocReader) this.comment_reader).f303bp < ((DocReader) this.comment_reader).buflen) {
                            char c3 = ((DocReader) this.comment_reader).f305ch;
                            if (c3 != '\t') {
                                if (c3 != '\n') {
                                    if (c3 == c) {
                                        ((DocReader) this.comment_reader).scanCommentChar();
                                        break;
                                    }
                                    if (c3 == '\r') {
                                        ((DocReader) this.comment_reader).scanCommentChar();
                                        if (((DocReader) this.comment_reader).f305ch != '\n') {
                                            ((DocReader) this.comment_reader).putChar('\n', false);
                                            break;
                                        }
                                    } else if (c3 != ' ') {
                                        if (c3 != '*') {
                                            ((DocReader) this.comment_reader).putChar(((DocReader) this.comment_reader).f305ch, false);
                                            ((DocReader) this.comment_reader).scanCommentChar();
                                            c = '\f';
                                        } else {
                                            ((DocReader) this.comment_reader).scanCommentChar();
                                            if (((DocReader) this.comment_reader).f305ch == '/') {
                                                break loop1;
                                            }
                                            ((DocReader) this.comment_reader).putChar('*', false);
                                            c = '\f';
                                        }
                                    }
                                }
                                ((DocReader) this.comment_reader).putChar(((DocReader) this.comment_reader).f305ch, false);
                                ((DocReader) this.comment_reader).scanCommentChar();
                                break;
                            }
                            ((DocReader) this.comment_reader).putChar(((DocReader) this.comment_reader).f305ch, false);
                            ((DocReader) this.comment_reader).scanCommentChar();
                            c = '\f';
                        }
                        firstLine = false;
                    }
                    if (((DocReader) this.comment_reader).f307sp > 0) {
                        int i = ((DocReader) this.comment_reader).f307sp - 1;
                        while (i > -1 && ((DocReader) this.comment_reader).sbuf[i] == '*') {
                            i--;
                        }
                        ((DocReader) this.comment_reader).f307sp = i + 1;
                        this.docComment = ((DocReader) this.comment_reader).chars();
                        this.docPosns = new int[((DocReader) this.comment_reader).f283pp];
                        System.arraycopy(((DocReader) this.comment_reader).pbuf, 0, this.docPosns, 0, this.docPosns.length);
                    } else {
                        this.docComment = "";
                    }
                    this.scanned = true;
                    this.comment_reader = null;
                    String str = this.docComment;
                    if (str != null && str.matches("(?sm).*^\\s*@deprecated( |$).*")) {
                        this.deprecatedFlag = true;
                        return;
                    }
                    return;
                }
                this.docComment = "";
                this.scanned = true;
                this.comment_reader = null;
                String str2 = this.docComment;
                if (str2 == null || !str2.matches("(?sm).*^\\s*@deprecated( |$).*")) {
                    return;
                }
                this.deprecatedFlag = true;
            } catch (Throwable th) {
                this.scanned = true;
                this.comment_reader = null;
                String str3 = this.docComment;
                if (str3 != null && str3.matches("(?sm).*^\\s*@deprecated( |$).*")) {
                    this.deprecatedFlag = true;
                }
                throw th;
            }
        }
    }

    @Override
    public Position.LineMap getLineMap() {
        char[] buf = this.reader.getRawCharacters();
        return Position.makeLineMap(buf, buf.length, true);
    }
}
