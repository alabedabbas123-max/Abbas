package com.sun.tools.javac.parser;

import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.jvm.ByteCodes;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Position;
import java.nio.CharBuffer;

public class Scanner implements Lexer {
    private boolean allowBinaryLiterals;
    private boolean allowHexFloats;
    private boolean allowUnderscoresInLiterals;

    private int f484bp;

    private char[] f485buf;
    private int buflen;

    private char f486ch;
    protected boolean deprecatedFlag;
    private int endPos;
    private int eofPos;
    private int errPos;
    private final Keywords keywords;

    private final Log f487log;
    private Name name;
    private final Names names;

    private int f488pos;
    private int prevEndPos;
    private int radix;
    private char[] sbuf;
    private Source source;

    private int f489sp;
    private Token token;
    private int unicodeConversionBp;
    private static boolean scannerDebug = false;
    private static final boolean hexFloatsWork = hexFloatsWork();
    static final boolean surrogatesSupported = surrogatesSupported();

    public enum CommentStyle {
        LINE,
        BLOCK,
        JAVADOC
    }

    private Scanner(ScannerFactory fac) {
        this.errPos = -1;
        this.deprecatedFlag = false;
        this.sbuf = new char[128];
        this.unicodeConversionBp = -1;
        this.f487log = fac.f490log;
        this.names = fac.names;
        this.keywords = fac.keywords;
        Source source = fac.source;
        this.source = source;
        this.allowBinaryLiterals = source.allowBinaryLiterals();
        this.allowHexFloats = this.source.allowHexFloats();
        this.allowUnderscoresInLiterals = this.source.allowUnderscoresInLiterals();
    }

    private static boolean hexFloatsWork() {
        try {
            Float.valueOf("0x1.0p1");
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    protected Scanner(ScannerFactory fac, CharBuffer buffer) {
        this(fac, JavacFileManager.toArray(buffer), buffer.limit());
    }

    protected Scanner(ScannerFactory fac, char[] input, int inputLength) {
        this(fac);
        this.eofPos = inputLength;
        if (inputLength == input.length) {
            if (input.length > 0 && Character.isWhitespace(input[input.length - 1])) {
                inputLength--;
            } else {
                char[] newInput = new char[inputLength + 1];
                System.arraycopy(input, 0, newInput, 0, input.length);
                input = newInput;
            }
        }
        this.f485buf = input;
        this.buflen = inputLength;
        input[inputLength] = 26;
        this.f484bp = -1;
        scanChar();
    }

    private void lexError(int pos, String key, Object... args) {
        this.f487log.error(pos, key, args);
        this.token = Token.ERROR;
        this.errPos = pos;
    }

    private void lexError(String key, Object... args) {
        lexError(this.f488pos, key, args);
    }

    private int digit(int base) {
        char c = this.f486ch;
        int result = Character.digit(c, base);
        if (result >= 0 && c > 127) {
            lexError(this.f488pos + 1, "illegal.nonascii.digit", new Object[0]);
            this.f486ch = "0123456789abcdef".charAt(result);
        }
        return result;
    }

    private void convertUnicode() {
        int i;
        char c;
        if (this.f486ch == '\\') {
            int i2 = this.unicodeConversionBp;
            int i3 = this.f484bp;
            if (i2 != i3) {
                int i4 = i3 + 1;
                this.f484bp = i4;
                char c2 = this.f485buf[i4];
                this.f486ch = c2;
                if (c2 == 'u') {
                    do {
                        i = this.f484bp + 1;
                        this.f484bp = i;
                        c = this.f485buf[i];
                        this.f486ch = c;
                    } while (c == 'u');
                    int limit = i + 3;
                    if (limit < this.buflen) {
                        int d = digit(16);
                        int code = d;
                        while (true) {
                            int i5 = this.f484bp;
                            if (i5 >= limit || d < 0) {
                                break;
                            }
                            int i6 = i5 + 1;
                            this.f484bp = i6;
                            this.f486ch = this.f485buf[i6];
                            d = digit(16);
                            code = (code << 4) + d;
                        }
                        if (d >= 0) {
                            this.f486ch = (char) code;
                            this.unicodeConversionBp = this.f484bp;
                            return;
                        }
                    }
                    lexError(this.f484bp, "illegal.unicode.esc", new Object[0]);
                    return;
                }
                this.f484bp = i4 - 1;
                this.f486ch = '\\';
            }
        }
    }

    private void scanChar() {
        char[] cArr = this.f485buf;
        int i = this.f484bp + 1;
        this.f484bp = i;
        char c = cArr[i];
        this.f486ch = c;
        if (c == '\\') {
            convertUnicode();
        }
    }

    private void scanCommentChar() {
        scanChar();
        if (this.f486ch == '\\') {
            char[] cArr = this.f485buf;
            int i = this.f484bp;
            if (cArr[i + 1] == '\\' && this.unicodeConversionBp != i) {
                this.f484bp = i + 1;
            } else {
                convertUnicode();
            }
        }
    }

    private void putChar(char ch) {
        int i = this.f489sp;
        char[] cArr = this.sbuf;
        if (i == cArr.length) {
            char[] newsbuf = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, newsbuf, 0, cArr.length);
            this.sbuf = newsbuf;
        }
        char[] newsbuf2 = this.sbuf;
        int i2 = this.f489sp;
        this.f489sp = i2 + 1;
        newsbuf2[i2] = ch;
    }

    private void scanLitChar() {
        char c;
        char c2 = this.f486ch;
        if (c2 == '\\') {
            char[] cArr = this.f485buf;
            int i = this.f484bp;
            if (cArr[i + 1] == '\\' && this.unicodeConversionBp != i) {
                this.f484bp = i + 1;
                putChar('\\');
                scanChar();
                return;
            }
            scanChar();
            char c3 = this.f486ch;
            if (c3 == '\"') {
                putChar('\"');
                scanChar();
                return;
            }
            if (c3 == '\'') {
                putChar('\'');
                scanChar();
                return;
            }
            if (c3 == '\\') {
                putChar('\\');
                scanChar();
                return;
            }
            if (c3 == 'b') {
                putChar('\b');
                scanChar();
                return;
            }
            if (c3 == 'f') {
                putChar('\f');
                scanChar();
                return;
            }
            if (c3 == 'n') {
                putChar('\n');
                scanChar();
                return;
            }
            if (c3 == 'r') {
                putChar('\r');
                scanChar();
                return;
            }
            if (c3 != 't') {
                switch (c3) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        char leadch = this.f486ch;
                        int oct = digit(8);
                        scanChar();
                        char c4 = this.f486ch;
                        if ('0' <= c4 && c4 <= '7') {
                            oct = (oct * 8) + digit(8);
                            scanChar();
                            if (leadch <= '3' && '0' <= (c = this.f486ch) && c <= '7') {
                                oct = (oct * 8) + digit(8);
                                scanChar();
                            }
                        }
                        putChar((char) oct);
                        break;
                    default:
                        lexError(this.f484bp, "illegal.esc.char", new Object[0]);
                        break;
                }
            }
            putChar('\t');
            scanChar();
            return;
        }
        if (this.f484bp != this.buflen) {
            putChar(c2);
            scanChar();
        }
    }

    private void scanDigits(int digitRadix) {
        char saveCh;
        int savePos;
        while (true) {
            char c = this.f486ch;
            if (c != '_') {
                putChar(c);
            } else if (!this.allowUnderscoresInLiterals) {
                lexError("unsupported.underscore.lit", this.source.name);
                this.allowUnderscoresInLiterals = true;
            }
            saveCh = this.f486ch;
            savePos = this.f484bp;
            scanChar();
            if (digit(digitRadix) < 0 && this.f486ch != '_') {
                break;
            }
        }
        if (saveCh == '_') {
            lexError(savePos, "illegal.underscore", new Object[0]);
        }
    }

    private void scanHexExponentAndSuffix() {
        char c = this.f486ch;
        if (c == 'p' || c == 'P') {
            putChar(this.f486ch);
            scanChar();
            skipIllegalUnderscores();
            char c2 = this.f486ch;
            if (c2 == '+' || c2 == '-') {
                putChar(this.f486ch);
                scanChar();
            }
            skipIllegalUnderscores();
            char c3 = this.f486ch;
            if ('0' <= c3 && c3 <= '9') {
                scanDigits(10);
                if (!this.allowHexFloats) {
                    lexError("unsupported.fp.lit", this.source.name);
                    this.allowHexFloats = true;
                } else if (!hexFloatsWork) {
                    lexError("unsupported.cross.fp.lit", new Object[0]);
                }
            } else {
                lexError("malformed.fp.lit", new Object[0]);
            }
        } else {
            lexError("malformed.fp.lit", new Object[0]);
        }
        char c4 = this.f486ch;
        if (c4 == 'f' || c4 == 'F') {
            putChar(this.f486ch);
            scanChar();
            this.token = Token.FLOATLITERAL;
        } else {
            if (c4 == 'd' || c4 == 'D') {
                putChar(this.f486ch);
                scanChar();
            }
            this.token = Token.DOUBLELITERAL;
        }
    }

    private void scanFraction() {
        skipIllegalUnderscores();
        char c = this.f486ch;
        if ('0' <= c && c <= '9') {
            scanDigits(10);
        }
        int sp1 = this.f489sp;
        char c2 = this.f486ch;
        if (c2 == 'e' || c2 == 'E') {
            putChar(this.f486ch);
            scanChar();
            skipIllegalUnderscores();
            char c3 = this.f486ch;
            if (c3 == '+' || c3 == '-') {
                putChar(this.f486ch);
                scanChar();
            }
            skipIllegalUnderscores();
            char c4 = this.f486ch;
            if ('0' <= c4 && c4 <= '9') {
                scanDigits(10);
            } else {
                lexError("malformed.fp.lit", new Object[0]);
                this.f489sp = sp1;
            }
        }
    }

    private void scanFractionAndSuffix() {
        this.radix = 10;
        scanFraction();
        char c = this.f486ch;
        if (c == 'f' || c == 'F') {
            putChar(this.f486ch);
            scanChar();
            this.token = Token.FLOATLITERAL;
        } else {
            if (c == 'd' || c == 'D') {
                putChar(this.f486ch);
                scanChar();
            }
            this.token = Token.DOUBLELITERAL;
        }
    }

    private void scanHexFractionAndSuffix(boolean seendigit) {
        this.radix = 16;
        Assert.check(this.f486ch == '.');
        putChar(this.f486ch);
        scanChar();
        skipIllegalUnderscores();
        if (digit(16) >= 0) {
            seendigit = true;
            scanDigits(16);
        }
        if (!seendigit) {
            lexError("invalid.hex.number", new Object[0]);
        } else {
            scanHexExponentAndSuffix();
        }
    }

    private void skipIllegalUnderscores() {
        if (this.f486ch == '_') {
            lexError(this.f484bp, "illegal.underscore", new Object[0]);
            while (this.f486ch == '_') {
                scanChar();
            }
        }
    }

    private void scanNumber(int radix) {
        char c;
        char c2;
        char c3;
        this.radix = radix;
        int digitRadix = radix == 8 ? 10 : radix;
        boolean seendigit = false;
        if (digit(digitRadix) >= 0) {
            seendigit = true;
            scanDigits(digitRadix);
        }
        if (radix == 16 && this.f486ch == '.') {
            scanHexFractionAndSuffix(seendigit);
            return;
        }
        if (seendigit && radix == 16 && ((c3 = this.f486ch) == 'p' || c3 == 'P')) {
            scanHexExponentAndSuffix();
            return;
        }
        if (digitRadix == 10 && (c2 = this.f486ch) == '.') {
            putChar(c2);
            scanChar();
            scanFractionAndSuffix();
            return;
        }
        if (digitRadix == 10 && ((c = this.f486ch) == 'e' || c == 'E' || c == 'f' || c == 'F' || c == 'd' || c == 'D')) {
            scanFractionAndSuffix();
            return;
        }
        char c4 = this.f486ch;
        if (c4 == 'l' || c4 == 'L') {
            scanChar();
            this.token = Token.LONGLITERAL;
        } else {
            this.token = Token.INTLITERAL;
        }
    }

    private void scanIdent() {
        boolean isJavaIdentifierPart;
        while (true) {
            int i = this.f489sp;
            char[] cArr = this.sbuf;
            if (i == cArr.length) {
                putChar(this.f486ch);
            } else {
                this.f489sp = i + 1;
                cArr[i] = this.f486ch;
            }
            scanChar();
            char c = this.f486ch;
            if (c != '$' && c != '_' && c != 127) {
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                        continue;
                    default:
                        switch (c) {
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 27:
                                continue;
                            case 26:
                                if (this.f484bp >= this.buflen) {
                                    Name nameFromChars = this.names.fromChars(this.sbuf, 0, this.f489sp);
                                    this.name = nameFromChars;
                                    this.token = this.keywords.m486key(nameFromChars);
                                    return;
                                }
                                break;
                            default:
                                switch (c) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        continue;
                                    default:
                                        switch (c) {
                                            case 'A':
                                            case 'B':
                                            case 'C':
                                            case 'D':
                                            case 'E':
                                            case 'F':
                                            case 'G':
                                            case 'H':
                                            case 'I':
                                            case 'J':
                                            case 'K':
                                            case 'L':
                                            case 'M':
                                            case 'N':
                                            case ByteCodes.iastore:
                                            case ByteCodes.lastore:
                                            case ByteCodes.fastore:
                                            case ByteCodes.dastore:
                                            case ByteCodes.aastore:
                                            case ByteCodes.bastore:
                                            case 'U':
                                            case 'V':
                                            case 'W':
                                            case 'X':
                                            case 'Y':
                                            case 'Z':
                                                continue;
                                            default:
                                                switch (c) {
                                                    case ByteCodes.ladd:
                                                    case ByteCodes.fadd:
                                                    case ByteCodes.dadd:
                                                    case ByteCodes.isub:
                                                    case ByteCodes.lsub:
                                                    case ByteCodes.fsub:
                                                    case ByteCodes.dsub:
                                                    case ByteCodes.imul:
                                                    case ByteCodes.lmul:
                                                    case ByteCodes.fmul:
                                                    case ByteCodes.dmul:
                                                    case ByteCodes.idiv:
                                                    case ByteCodes.ldiv:
                                                    case ByteCodes.fdiv:
                                                    case ByteCodes.ddiv:
                                                    case ByteCodes.imod:
                                                    case ByteCodes.lmod:
                                                    case ByteCodes.fmod:
                                                    case ByteCodes.dmod:
                                                    case ByteCodes.ineg:
                                                    case ByteCodes.lneg:
                                                    case ByteCodes.fneg:
                                                    case ByteCodes.dneg:
                                                    case ByteCodes.ishl:
                                                    case ByteCodes.lshl:
                                                    case ByteCodes.ishr:
                                                        continue;
                                                    default:
                                                        if (c < 128) {
                                                            isJavaIdentifierPart = false;
                                                        } else {
                                                            char high = scanSurrogates();
                                                            if (high != 0) {
                                                                int i2 = this.f489sp;
                                                                char[] cArr2 = this.sbuf;
                                                                if (i2 == cArr2.length) {
                                                                    putChar(high);
                                                                } else {
                                                                    this.f489sp = i2 + 1;
                                                                    cArr2[i2] = high;
                                                                }
                                                                isJavaIdentifierPart = Character.isJavaIdentifierPart(Character.toCodePoint(high, this.f486ch));
                                                            } else {
                                                                isJavaIdentifierPart = Character.isJavaIdentifierPart(this.f486ch);
                                                            }
                                                        }
                                                        if (!isJavaIdentifierPart) {
                                                            Name nameFromChars2 = this.names.fromChars(this.sbuf, 0, this.f489sp);
                                                            this.name = nameFromChars2;
                                                            this.token = this.keywords.m486key(nameFromChars2);
                                                            return;
                                                        }
                                                        break;
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
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

    private char scanSurrogates() {
        if (surrogatesSupported && Character.isHighSurrogate(this.f486ch)) {
            char high = this.f486ch;
            scanChar();
            if (Character.isLowSurrogate(this.f486ch)) {
                return high;
            }
            this.f486ch = high;
            return (char) 0;
        }
        return (char) 0;
    }

    private boolean isSpecial(char ch) {
        if (ch == '!' || ch == '-' || ch == ':' || ch == '^' || ch == '|' || ch == '~' || ch == '%' || ch == '&' || ch == '*' || ch == '+') {
            return true;
        }
        switch (ch) {
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
                return true;
            default:
                return false;
        }
    }

    private void scanOperator() {
        do {
            putChar(this.f486ch);
            Name newname = this.names.fromChars(this.sbuf, 0, this.f489sp);
            if (this.keywords.m486key(newname) == Token.IDENTIFIER) {
                this.f489sp--;
                return;
            } else {
                this.name = newname;
                this.token = this.keywords.m486key(newname);
                scanChar();
            }
        } while (isSpecial(this.f486ch));
    }

    private void scanDocComment() {
        char c;
        char c2;
        while (this.f484bp < this.buflen) {
            while (this.f484bp < this.buflen && ((c2 = this.f486ch) == ' ' || c2 == '\t' || c2 == '\f')) {
                scanCommentChar();
            }
            while (this.f484bp < this.buflen && this.f486ch == '*') {
                scanCommentChar();
                if (this.f486ch == '/') {
                    return;
                }
            }
            while (this.f484bp < this.buflen && ((c = this.f486ch) == ' ' || c == '\t' || c == '\f')) {
                scanCommentChar();
            }
            boolean deprecatedPrefix = false;
            if (this.f484bp < this.buflen && this.f486ch == '@' && !this.deprecatedFlag) {
                scanCommentChar();
                if (this.f484bp < this.buflen && this.f486ch == 'd') {
                    scanCommentChar();
                    if (this.f484bp < this.buflen && this.f486ch == 'e') {
                        scanCommentChar();
                        if (this.f484bp < this.buflen && this.f486ch == 'p') {
                            scanCommentChar();
                            if (this.f484bp < this.buflen && this.f486ch == 'r') {
                                scanCommentChar();
                                if (this.f484bp < this.buflen && this.f486ch == 'e') {
                                    scanCommentChar();
                                    if (this.f484bp < this.buflen && this.f486ch == 'c') {
                                        scanCommentChar();
                                        if (this.f484bp < this.buflen && this.f486ch == 'a') {
                                            scanCommentChar();
                                            if (this.f484bp < this.buflen && this.f486ch == 't') {
                                                scanCommentChar();
                                                if (this.f484bp < this.buflen && this.f486ch == 'e') {
                                                    scanCommentChar();
                                                    if (this.f484bp < this.buflen && this.f486ch == 'd') {
                                                        deprecatedPrefix = true;
                                                        scanCommentChar();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (deprecatedPrefix && this.f484bp < this.buflen) {
                if (Character.isWhitespace(this.f486ch)) {
                    this.deprecatedFlag = true;
                } else if (this.f486ch == '*') {
                    scanCommentChar();
                    if (this.f486ch == '/') {
                        this.deprecatedFlag = true;
                        return;
                    }
                }
            }
            while (this.f484bp < this.buflen) {
                char c3 = this.f486ch;
                if (c3 != '\n') {
                    if (c3 == '\r') {
                        scanCommentChar();
                        if (this.f486ch != '\n') {
                            break;
                        }
                    } else if (c3 == '*') {
                        scanCommentChar();
                        if (this.f486ch == '/') {
                            return;
                        }
                    } else {
                        scanCommentChar();
                    }
                }
                scanCommentChar();
            }
        }
    }

    @Override
    public String stringVal() {
        return new String(this.sbuf, 0, this.f489sp);
    }

    /* JADX WARN: Code duplicated, block: B:279:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x000f A[SYNTHETIC] */
    @Override
    public void nextToken() {
        boolean isJavaIdentifierStart;
        CommentStyle style;
        try {
            this.prevEndPos = this.endPos;
            this.f489sp = 0;
            while (true) {
                this.f488pos = this.f484bp;
                char c = this.f486ch;
                if (c != '\t') {
                    if (c == '\n') {
                        scanChar();
                        this.endPos = this.f484bp;
                        processLineTerminator();
                    } else if (c != '\f') {
                        if (c == '\r') {
                            scanChar();
                            if (this.f486ch == '\n') {
                                scanChar();
                            }
                            this.endPos = this.f484bp;
                            processLineTerminator();
                        } else if (c != ' ') {
                            if (c == '\"') {
                                scanChar();
                                while (this.f486ch != '\"' && this.f486ch != '\r' && this.f486ch != '\n' && this.f484bp < this.buflen) {
                                    scanLitChar();
                                }
                                if (this.f486ch == '\"') {
                                    this.token = Token.STRINGLITERAL;
                                    scanChar();
                                } else {
                                    lexError(this.f488pos, "unclosed.str.lit", new Object[0]);
                                }
                                this.endPos = this.f484bp;
                                if (scannerDebug) {
                                    System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                    return;
                                }
                                return;
                            }
                            if (c != '$') {
                                if (c == ',') {
                                    scanChar();
                                    this.token = Token.COMMA;
                                    this.endPos = this.f484bp;
                                    if (scannerDebug) {
                                        System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                        return;
                                    }
                                    return;
                                }
                                if (c == ';') {
                                    scanChar();
                                    this.token = Token.SEMI;
                                    this.endPos = this.f484bp;
                                    if (scannerDebug) {
                                        System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                        return;
                                    }
                                    return;
                                }
                                if (c == ']') {
                                    scanChar();
                                    this.token = Token.RBRACKET;
                                    this.endPos = this.f484bp;
                                    if (scannerDebug) {
                                        System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                        return;
                                    }
                                    return;
                                }
                                if (c != '_') {
                                    if (c == '}') {
                                        scanChar();
                                        this.token = Token.RBRACE;
                                        this.endPos = this.f484bp;
                                        if (scannerDebug) {
                                            System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                            return;
                                        }
                                        return;
                                    }
                                    switch (c) {
                                        case '\'':
                                            scanChar();
                                            if (this.f486ch == '\'') {
                                                lexError("empty.char.lit", new Object[0]);
                                            } else {
                                                if (this.f486ch == '\r' || this.f486ch == '\n') {
                                                    lexError(this.f488pos, "illegal.line.end.in.char.lit", new Object[0]);
                                                }
                                                scanLitChar();
                                                if (this.f486ch == '\'') {
                                                    scanChar();
                                                    this.token = Token.CHARLITERAL;
                                                } else {
                                                    lexError(this.f488pos, "unclosed.char.lit", new Object[0]);
                                                }
                                            }
                                            this.endPos = this.f484bp;
                                            if (scannerDebug) {
                                                System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                                return;
                                            }
                                            return;
                                        case '(':
                                            scanChar();
                                            this.token = Token.LPAREN;
                                            this.endPos = this.f484bp;
                                            if (scannerDebug) {
                                                System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                                return;
                                            }
                                            return;
                                        case ')':
                                            scanChar();
                                            this.token = Token.RPAREN;
                                            this.endPos = this.f484bp;
                                            if (scannerDebug) {
                                                System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                                return;
                                            }
                                            return;
                                        default:
                                            switch (c) {
                                                case '.':
                                                    scanChar();
                                                    if ('0' <= this.f486ch && this.f486ch <= '9') {
                                                        putChar('.');
                                                        scanFractionAndSuffix();
                                                    } else if (this.f486ch == '.') {
                                                        putChar('.');
                                                        putChar('.');
                                                        scanChar();
                                                        if (this.f486ch == '.') {
                                                            scanChar();
                                                            putChar('.');
                                                            this.token = Token.ELLIPSIS;
                                                        } else {
                                                            lexError("malformed.fp.lit", new Object[0]);
                                                        }
                                                    } else {
                                                        this.token = Token.DOT;
                                                    }
                                                    this.endPos = this.f484bp;
                                                    if (scannerDebug) {
                                                        System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                                        return;
                                                    }
                                                    return;
                                                case '/':
                                                    scanChar();
                                                    if (this.f486ch == '/') {
                                                        do {
                                                            scanCommentChar();
                                                            if (this.f486ch == '\r' || this.f486ch == '\n') {
                                                            }
                                                            if (this.f484bp < this.buflen) {
                                                                this.endPos = this.f484bp;
                                                                processComment(CommentStyle.LINE);
                                                            }
                                                            break;
                                                        } while (this.f484bp < this.buflen);
                                                        if (this.f484bp < this.buflen) {
                                                            this.endPos = this.f484bp;
                                                            processComment(CommentStyle.LINE);
                                                        }
                                                    } else {
                                                        if (this.f486ch != '*') {
                                                            if (this.f486ch == '=') {
                                                                this.name = this.names.slashequals;
                                                                this.token = Token.SLASHEQ;
                                                                scanChar();
                                                            } else {
                                                                this.name = this.names.slash;
                                                                this.token = Token.SLASH;
                                                            }
                                                            this.endPos = this.f484bp;
                                                            if (scannerDebug) {
                                                                System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        scanChar();
                                                        if (this.f486ch == '*') {
                                                            style = CommentStyle.JAVADOC;
                                                            scanDocComment();
                                                        } else {
                                                            style = CommentStyle.BLOCK;
                                                            while (this.f484bp < this.buflen) {
                                                                if (this.f486ch == '*') {
                                                                    scanChar();
                                                                    if (this.f486ch == '/') {
                                                                    }
                                                                } else {
                                                                    scanCommentChar();
                                                                }
                                                            }
                                                        }
                                                        if (this.f486ch != '/') {
                                                            lexError("unclosed.comment", new Object[0]);
                                                            this.endPos = this.f484bp;
                                                            if (scannerDebug) {
                                                                System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        scanChar();
                                                        this.endPos = this.f484bp;
                                                        processComment(style);
                                                        continue;
                                                    }
                                                    break;
                                                case '0':
                                                    scanChar();
                                                    if (this.f486ch == 'x' || this.f486ch == 'X') {
                                                        scanChar();
                                                        skipIllegalUnderscores();
                                                        if (this.f486ch == '.') {
                                                            scanHexFractionAndSuffix(false);
                                                        } else if (digit(16) < 0) {
                                                            lexError("invalid.hex.number", new Object[0]);
                                                        } else {
                                                            scanNumber(16);
                                                        }
                                                    } else if (this.f486ch == 'b' || this.f486ch == 'B') {
                                                        if (!this.allowBinaryLiterals) {
                                                            lexError("unsupported.binary.lit", this.source.name);
                                                            this.allowBinaryLiterals = true;
                                                        }
                                                        scanChar();
                                                        skipIllegalUnderscores();
                                                        if (digit(2) < 0) {
                                                            lexError("invalid.binary.number", new Object[0]);
                                                        } else {
                                                            scanNumber(2);
                                                        }
                                                    } else {
                                                        putChar('0');
                                                        if (this.f486ch == '_') {
                                                            int savePos = this.f484bp;
                                                            do {
                                                                scanChar();
                                                            } while (this.f486ch == '_');
                                                            if (digit(10) < 0) {
                                                                lexError(savePos, "illegal.underscore", new Object[0]);
                                                            }
                                                        }
                                                        scanNumber(8);
                                                    }
                                                    this.endPos = this.f484bp;
                                                    if (scannerDebug) {
                                                        System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                                        return;
                                                    }
                                                    return;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    scanNumber(10);
                                                    this.endPos = this.f484bp;
                                                    if (scannerDebug) {
                                                        System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    switch (c) {
                                                        case 'A':
                                                        case 'B':
                                                        case 'C':
                                                        case 'D':
                                                        case 'E':
                                                        case 'F':
                                                        case 'G':
                                                        case 'H':
                                                        case 'I':
                                                        case 'J':
                                                        case 'K':
                                                        case 'L':
                                                        case 'M':
                                                        case 'N':
                                                        case ByteCodes.iastore:
                                                        case ByteCodes.lastore:
                                                        case ByteCodes.fastore:
                                                        case ByteCodes.dastore:
                                                        case ByteCodes.aastore:
                                                        case ByteCodes.bastore:
                                                        case 'U':
                                                        case 'V':
                                                        case 'W':
                                                        case 'X':
                                                        case 'Y':
                                                        case 'Z':
                                                            break;
                                                        case '[':
                                                            scanChar();
                                                            this.token = Token.LBRACKET;
                                                            this.endPos = this.f484bp;
                                                            if (scannerDebug) {
                                                                System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            switch (c) {
                                                                case ByteCodes.ladd:
                                                                case ByteCodes.fadd:
                                                                case ByteCodes.dadd:
                                                                case ByteCodes.isub:
                                                                case ByteCodes.lsub:
                                                                case ByteCodes.fsub:
                                                                case ByteCodes.dsub:
                                                                case ByteCodes.imul:
                                                                case ByteCodes.lmul:
                                                                case ByteCodes.fmul:
                                                                case ByteCodes.dmul:
                                                                case ByteCodes.idiv:
                                                                case ByteCodes.ldiv:
                                                                case ByteCodes.fdiv:
                                                                case ByteCodes.ddiv:
                                                                case ByteCodes.imod:
                                                                case ByteCodes.lmod:
                                                                case ByteCodes.fmod:
                                                                case ByteCodes.dmod:
                                                                case ByteCodes.ineg:
                                                                case ByteCodes.lneg:
                                                                case ByteCodes.fneg:
                                                                case ByteCodes.dneg:
                                                                case ByteCodes.ishl:
                                                                case ByteCodes.lshl:
                                                                case ByteCodes.ishr:
                                                                    break;
                                                                case ByteCodes.lshr:
                                                                    scanChar();
                                                                    this.token = Token.LBRACE;
                                                                    this.endPos = this.f484bp;
                                                                    if (scannerDebug) {
                                                                        System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                                                        return;
                                                                    }
                                                                    return;
                                                                default:
                                                                    if (isSpecial(this.f486ch)) {
                                                                        scanOperator();
                                                                    } else {
                                                                        if (this.f486ch < 128) {
                                                                            isJavaIdentifierStart = false;
                                                                        } else {
                                                                            char high = scanSurrogates();
                                                                            if (high != 0) {
                                                                                if (this.f489sp == this.sbuf.length) {
                                                                                    putChar(high);
                                                                                } else {
                                                                                    char[] cArr = this.sbuf;
                                                                                    int i = this.f489sp;
                                                                                    this.f489sp = i + 1;
                                                                                    cArr[i] = high;
                                                                                }
                                                                                isJavaIdentifierStart = Character.isJavaIdentifierStart(Character.toCodePoint(high, this.f486ch));
                                                                            } else {
                                                                                isJavaIdentifierStart = Character.isJavaIdentifierStart(this.f486ch);
                                                                            }
                                                                        }
                                                                        if (isJavaIdentifierStart) {
                                                                            scanIdent();
                                                                        } else if (this.f484bp == this.buflen || (this.f486ch == 26 && this.f484bp + 1 == this.buflen)) {
                                                                            this.token = Token.EOF;
                                                                            int i2 = this.eofPos;
                                                                            this.f484bp = i2;
                                                                            this.f488pos = i2;
                                                                        } else {
                                                                            lexError("illegal.char", String.valueOf((int) this.f486ch));
                                                                            scanChar();
                                                                        }
                                                                    }
                                                                    this.endPos = this.f484bp;
                                                                    if (scannerDebug) {
                                                                        System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    scanChar();
                    if (this.f486ch != ' ' && this.f486ch != '\t' && this.f486ch != '\f') {
                        this.endPos = this.f484bp;
                        processWhiteSpace();
                    }
                }
            }
            scanIdent();
            this.endPos = this.f484bp;
            if (scannerDebug) {
                System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
            }
        } catch (Throwable th) {
            this.endPos = this.f484bp;
            if (scannerDebug) {
                System.out.println("nextToken(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
            }
            throw th;
        }
    }

    @Override
    public Token token() {
        return this.token;
    }

    @Override
    public void token(Token token) {
        int length = this.f488pos + (this.token.name.length() - token.name.length());
        this.f488pos = length;
        this.prevEndPos = length;
        this.token = token;
    }

    @Override
    public int mo487pos() {
        return this.f488pos;
    }

    @Override
    public int endPos() {
        return this.endPos;
    }

    @Override
    public int prevEndPos() {
        return this.prevEndPos;
    }

    @Override
    public int errPos() {
        return this.errPos;
    }

    @Override
    public void errPos(int pos) {
        this.errPos = pos;
    }

    @Override
    public Name name() {
        return this.name;
    }

    @Override
    public int radix() {
        return this.radix;
    }

    @Override
    public boolean deprecatedFlag() {
        return this.deprecatedFlag;
    }

    @Override
    public void resetDeprecatedFlag() {
        this.deprecatedFlag = false;
    }

    @Override
    public String docComment() {
        return null;
    }

    @Override
    public char[] getRawCharacters() {
        int i = this.buflen;
        char[] chars = new char[i];
        System.arraycopy(this.f485buf, 0, chars, 0, i);
        return chars;
    }

    @Override
    public char[] getRawCharacters(int beginIndex, int endIndex) {
        int length = endIndex - beginIndex;
        char[] chars = new char[length];
        System.arraycopy(this.f485buf, beginIndex, chars, 0, length);
        return chars;
    }

    protected void processComment(CommentStyle style) {
        if (scannerDebug) {
            System.out.println("processComment(" + this.f488pos + "," + this.endPos + "," + style + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
        }
    }

    protected void processWhiteSpace() {
        if (scannerDebug) {
            System.out.println("processWhitespace(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
        }
    }

    protected void processLineTerminator() {
        if (scannerDebug) {
            System.out.println("processTerminator(" + this.f488pos + "," + this.endPos + ")=|" + new String(getRawCharacters(this.f488pos, this.endPos)) + "|");
        }
    }

    @Override
    public Position.LineMap getLineMap() {
        return Position.makeLineMap(this.f485buf, this.buflen, false);
    }
}
