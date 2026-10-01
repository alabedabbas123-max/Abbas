package com.google.googlejavaformat.java.javac.parser;

import com.google.googlejavaformat.java.javac.util.ArrayUtils;
import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import java.nio.CharBuffer;
import java.util.Arrays;

public class UnicodeReader {
    static final boolean surrogatesSupported = surrogatesSupported();

    protected int f303bp;

    protected char[] f304buf;
    protected final int buflen;

    protected char f305ch;

    protected Log f306log;
    protected Names names;
    protected char[] sbuf;

    protected int f307sp;
    protected int unicodeConversionBp;

    protected UnicodeReader(ScannerFactory sf, CharBuffer buffer) {
        this(sf, JavacFileManager.toArray(buffer), buffer.limit());
    }

    protected UnicodeReader(ScannerFactory sf, char[] input, int inputLength) {
        this.unicodeConversionBp = -1;
        this.sbuf = new char[128];
        this.f306log = sf.f284log;
        this.names = sf.names;
        if (inputLength == input.length) {
            if (input.length > 0 && Character.isWhitespace(input[input.length - 1])) {
                inputLength--;
            } else {
                input = Arrays.copyOf(input, inputLength + 1);
            }
        }
        this.f304buf = input;
        this.buflen = inputLength;
        input[inputLength] = 26;
        this.f303bp = -1;
        scanChar();
    }

    protected void scanChar() {
        int i = this.f303bp;
        if (i < this.buflen) {
            char[] cArr = this.f304buf;
            int i2 = i + 1;
            this.f303bp = i2;
            char c = cArr[i2];
            this.f305ch = c;
            if (c == '\\') {
                convertUnicode();
            }
        }
    }

    protected void scanCommentChar() {
        scanChar();
        if (this.f305ch == '\\') {
            if (peekChar() == '\\' && !isUnicode()) {
                skipChar();
            } else {
                convertUnicode();
            }
        }
    }

    protected void putChar(char ch, boolean scan) {
        char[] cArrEnsureCapacity = ArrayUtils.ensureCapacity(this.sbuf, this.f307sp);
        this.sbuf = cArrEnsureCapacity;
        int i = this.f307sp;
        this.f307sp = i + 1;
        cArrEnsureCapacity[i] = ch;
        if (scan) {
            scanChar();
        }
    }

    protected void putChar(char ch) {
        putChar(ch, false);
    }

    protected void putChar(boolean scan) {
        putChar(this.f305ch, scan);
    }

    Name name() {
        return this.names.fromChars(this.sbuf, 0, this.f307sp);
    }

    String chars() {
        return new String(this.sbuf, 0, this.f307sp);
    }

    protected void convertUnicode() {
        int i;
        char c;
        if (this.f305ch == '\\') {
            int i2 = this.unicodeConversionBp;
            int i3 = this.f303bp;
            if (i2 != i3) {
                int i4 = i3 + 1;
                this.f303bp = i4;
                char c2 = this.f304buf[i4];
                this.f305ch = c2;
                if (c2 == 'u') {
                    do {
                        i = this.f303bp + 1;
                        this.f303bp = i;
                        c = this.f304buf[i];
                        this.f305ch = c;
                    } while (c == 'u');
                    int limit = i + 3;
                    if (limit < this.buflen) {
                        int d = digit(i, 16);
                        int code = d;
                        while (true) {
                            int i5 = this.f303bp;
                            if (i5 >= limit || d < 0) {
                                break;
                            }
                            int i6 = i5 + 1;
                            this.f303bp = i6;
                            this.f305ch = this.f304buf[i6];
                            d = digit(i6, 16);
                            code = (code << 4) + d;
                        }
                        if (d >= 0) {
                            this.f305ch = (char) code;
                            this.unicodeConversionBp = this.f303bp;
                            return;
                        }
                    }
                    this.f306log.error(this.f303bp, "illegal.unicode.esc", new Object[0]);
                    return;
                }
                this.f303bp = i4 - 1;
                this.f305ch = '\\';
            }
        }
    }

    private static boolean surrogatesSupported() {
        try {
            Character.isHighSurrogate('a');
            return true;
        } catch (NoSuchMethodError e) {
            return false;
        }
    }

    protected char scanSurrogates() {
        if (surrogatesSupported && Character.isHighSurrogate(this.f305ch)) {
            char high = this.f305ch;
            scanChar();
            if (Character.isLowSurrogate(this.f305ch)) {
                return high;
            }
            this.f305ch = high;
            return (char) 0;
        }
        return (char) 0;
    }

    protected int digit(int pos, int base) {
        char c = this.f305ch;
        int result = Character.digit(c, base);
        if (result >= 0 && c > 127) {
            this.f306log.error(pos + 1, "illegal.nonascii.digit", new Object[0]);
            this.f305ch = "0123456789abcdef".charAt(result);
        }
        return result;
    }

    protected boolean isUnicode() {
        return this.unicodeConversionBp == this.f303bp;
    }

    protected void skipChar() {
        this.f303bp++;
    }

    protected char peekChar() {
        return this.f304buf[this.f303bp + 1];
    }

    public char[] getRawCharacters() {
        int i = this.buflen;
        char[] chars = new char[i];
        System.arraycopy(this.f304buf, 0, chars, 0, i);
        return chars;
    }

    public char[] getRawCharacters(int beginIndex, int endIndex) {
        int length = endIndex - beginIndex;
        char[] chars = new char[length];
        System.arraycopy(this.f304buf, beginIndex, chars, 0, length);
        return chars;
    }
}
