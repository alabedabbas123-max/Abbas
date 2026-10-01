package com.sun.tools.javac.parser;

import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.util.Position;
import java.nio.CharBuffer;

public class DocCommentScanner extends Scanner {

    private int f472bp;

    private char[] f473buf;
    private int buflen;

    private char f474ch;

    private int f475col;
    private String docComment;
    private char[] docCommentBuffer;
    private int docCommentCount;

    private int f476pos;
    private int unicodeConversionBp;

    protected DocCommentScanner(ScannerFactory fac, CharBuffer buffer) {
        super(fac, buffer);
        this.unicodeConversionBp = 0;
        this.docCommentBuffer = new char[Flags.ABSTRACT];
        this.docComment = null;
    }

    protected DocCommentScanner(ScannerFactory fac, char[] input, int inputLength) {
        super(fac, input, inputLength);
        this.unicodeConversionBp = 0;
        this.docCommentBuffer = new char[Flags.ABSTRACT];
        this.docComment = null;
    }

    private void expandCommentBuffer() {
        char[] cArr = this.docCommentBuffer;
        char[] newBuffer = new char[cArr.length * 2];
        System.arraycopy(cArr, 0, newBuffer, 0, cArr.length);
        this.docCommentBuffer = newBuffer;
    }

    private int digit(int base) {
        char c = this.f474ch;
        int result = Character.digit(c, base);
        if (result >= 0 && c > 127) {
            this.f474ch = "0123456789abcdef".charAt(result);
        }
        return result;
    }

    private void convertUnicode() {
        int i;
        char c;
        if (this.f474ch == '\\') {
            int i2 = this.unicodeConversionBp;
            int i3 = this.f472bp;
            if (i2 != i3) {
                int i4 = i3 + 1;
                this.f472bp = i4;
                char c2 = this.f473buf[i4];
                this.f474ch = c2;
                int i5 = this.f475col + 1;
                this.f475col = i5;
                if (c2 == 'u') {
                    do {
                        i = this.f472bp + 1;
                        this.f472bp = i;
                        c = this.f473buf[i];
                        this.f474ch = c;
                        this.f475col++;
                    } while (c == 'u');
                    int limit = i + 3;
                    if (limit < this.buflen) {
                        int d = digit(16);
                        int code = d;
                        while (true) {
                            int i6 = this.f472bp;
                            if (i6 >= limit || d < 0) {
                                break;
                            }
                            int i7 = i6 + 1;
                            this.f472bp = i7;
                            this.f474ch = this.f473buf[i7];
                            this.f475col++;
                            d = digit(16);
                            code = (code << 4) + d;
                        }
                        if (d >= 0) {
                            this.f474ch = (char) code;
                            this.unicodeConversionBp = this.f472bp;
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f472bp = i4 - 1;
                this.f474ch = '\\';
                this.f475col = i5 - 1;
            }
        }
    }

    private void scanChar() {
        int i = this.f472bp + 1;
        this.f472bp = i;
        char[] cArr = this.f473buf;
        char c = cArr[i];
        this.f474ch = c;
        if (c == '\t') {
            this.f475col = ((this.f475col / 8) * 8) + 8;
            return;
        }
        if (c == '\n') {
            if (i == 0 || cArr[i - 1] != '\r') {
                this.f475col = 0;
                return;
            }
            return;
        }
        if (c == '\r') {
            this.f475col = 0;
        } else if (c == '\\') {
            this.f475col++;
            convertUnicode();
        } else {
            this.f475col++;
        }
    }

    private void scanDocCommentChar() {
        scanChar();
        if (this.f474ch == '\\') {
            char[] cArr = this.f473buf;
            int i = this.f472bp;
            if (cArr[i + 1] == '\\' && this.unicodeConversionBp != i) {
                if (this.docCommentCount == this.docCommentBuffer.length) {
                    expandCommentBuffer();
                }
                char[] cArr2 = this.docCommentBuffer;
                int i2 = this.docCommentCount;
                this.docCommentCount = i2 + 1;
                cArr2[i2] = this.f474ch;
                this.f472bp++;
                this.f475col++;
                return;
            }
            convertUnicode();
        }
    }

    @Override
    public void nextToken() {
        this.docComment = null;
        super.nextToken();
    }

    @Override
    public String docComment() {
        return this.docComment;
    }

    @Override
    protected void processComment(Scanner.CommentStyle style) {
        char c;
        if (style != Scanner.CommentStyle.JAVADOC) {
            return;
        }
        int iPos = mo487pos();
        this.f476pos = iPos;
        char[] rawCharacters = getRawCharacters(iPos, endPos());
        this.f473buf = rawCharacters;
        this.buflen = rawCharacters.length;
        this.f472bp = 0;
        this.f475col = 0;
        this.docCommentCount = 0;
        boolean firstLine = true;
        scanDocCommentChar();
        scanDocCommentChar();
        while (this.f472bp < this.buflen && this.f474ch == '*') {
            scanDocCommentChar();
        }
        if (this.f472bp < this.buflen && this.f474ch == '/') {
            this.docComment = "";
            return;
        }
        if (this.f472bp < this.buflen) {
            char c2 = this.f474ch;
            if (c2 == '\n') {
                scanDocCommentChar();
                firstLine = false;
            } else if (c2 == '\r') {
                scanDocCommentChar();
                if (this.f474ch == '\n') {
                    scanDocCommentChar();
                    firstLine = false;
                }
            }
        }
        loop1: while (this.f472bp < this.buflen) {
            while (this.f472bp < this.buflen) {
                char c3 = this.f474ch;
                if (c3 == '\t') {
                    this.f475col = (((this.f475col - 1) / 8) * 8) + 8;
                    scanDocCommentChar();
                } else if (c3 == '\f') {
                    this.f475col = 0;
                    scanDocCommentChar();
                } else if (c3 != ' ') {
                    break;
                } else {
                    scanDocCommentChar();
                }
            }
            if (this.f474ch == '*') {
                do {
                    scanDocCommentChar();
                    c = this.f474ch;
                } while (c == '*');
                if (c == '/') {
                    break;
                } else {
                    break;
                }
            }
            if (!firstLine) {
                for (int i = 1; i < this.f475col; i++) {
                    if (this.docCommentCount == this.docCommentBuffer.length) {
                        expandCommentBuffer();
                    }
                    char[] cArr = this.docCommentBuffer;
                    int i2 = this.docCommentCount;
                    this.docCommentCount = i2 + 1;
                    cArr[i2] = ' ';
                }
            }
            while (true) {
                if (this.f472bp < this.buflen) {
                    char c4 = this.f474ch;
                    if (c4 != '\t') {
                        if (c4 != '\n') {
                            if (c4 == '\f') {
                                scanDocCommentChar();
                            } else if (c4 == '\r') {
                                scanDocCommentChar();
                                if (this.f474ch != '\n') {
                                    if (this.docCommentCount == this.docCommentBuffer.length) {
                                        expandCommentBuffer();
                                    }
                                    char[] cArr2 = this.docCommentBuffer;
                                    int i3 = this.docCommentCount;
                                    this.docCommentCount = i3 + 1;
                                    cArr2[i3] = '\n';
                                }
                            } else if (c4 != ' ') {
                                if (c4 == '*') {
                                    scanDocCommentChar();
                                    if (this.f474ch == '/') {
                                        break loop1;
                                    }
                                    if (this.docCommentCount == this.docCommentBuffer.length) {
                                        expandCommentBuffer();
                                    }
                                    char[] cArr3 = this.docCommentBuffer;
                                    int i4 = this.docCommentCount;
                                    this.docCommentCount = i4 + 1;
                                    cArr3[i4] = '*';
                                } else {
                                    if (this.docCommentCount == this.docCommentBuffer.length) {
                                        expandCommentBuffer();
                                    }
                                    char[] cArr4 = this.docCommentBuffer;
                                    int i5 = this.docCommentCount;
                                    this.docCommentCount = i5 + 1;
                                    cArr4[i5] = this.f474ch;
                                    scanDocCommentChar();
                                }
                            }
                        }
                        if (this.docCommentCount == this.docCommentBuffer.length) {
                            expandCommentBuffer();
                        }
                        char[] cArr5 = this.docCommentBuffer;
                        int i6 = this.docCommentCount;
                        this.docCommentCount = i6 + 1;
                        cArr5[i6] = this.f474ch;
                        scanDocCommentChar();
                    }
                    if (this.docCommentCount == this.docCommentBuffer.length) {
                        expandCommentBuffer();
                    }
                    char[] cArr6 = this.docCommentBuffer;
                    int i7 = this.docCommentCount;
                    this.docCommentCount = i7 + 1;
                    cArr6[i7] = this.f474ch;
                    scanDocCommentChar();
                }
                firstLine = false;
            }
        }
        int i8 = this.docCommentCount;
        if (i8 > 0) {
            do {
                i8--;
                if (i8 <= -1) {
                    break;
                }
            } while (this.docCommentBuffer[i8] == '*');
            this.docCommentCount = i8 + 1;
            this.docComment = new String(this.docCommentBuffer, 0, this.docCommentCount);
            return;
        }
        this.docComment = "";
    }

    @Override
    public Position.LineMap getLineMap() {
        char[] buf = getRawCharacters();
        return Position.makeLineMap(buf, buf.length, true);
    }
}
