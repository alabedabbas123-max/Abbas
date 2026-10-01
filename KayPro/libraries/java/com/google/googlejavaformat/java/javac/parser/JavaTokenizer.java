package com.google.googlejavaformat.java.javac.parser;

import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.jvm.ByteCodes;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Position;
import java.nio.CharBuffer;

public class JavaTokenizer {
    private static final boolean hexFloatsWork = hexFloatsWork();
    private static final boolean scannerDebug = false;
    private boolean allowBinaryLiterals;
    private boolean allowHexFloats;
    private boolean allowUnderscoresInLiterals;
    protected int errPos;

    protected ScannerFactory f277fac;

    private final Log f278log;
    protected Name name;
    protected int radix;
    protected UnicodeReader reader;
    private Source source;

    protected Tokens.TokenKind f279tk;
    private final Tokens tokens;

    protected JavaTokenizer(ScannerFactory fac, CharBuffer buf) {
        this(fac, new UnicodeReader(fac, buf));
    }

    protected JavaTokenizer(ScannerFactory fac, char[] buf, int inputLength) {
        this(fac, new UnicodeReader(fac, buf, inputLength));
    }

    protected JavaTokenizer(ScannerFactory fac, UnicodeReader reader) {
        this.errPos = -1;
        this.f277fac = fac;
        this.f278log = fac.f284log;
        this.tokens = fac.tokens;
        Source source = fac.source;
        this.source = source;
        this.reader = reader;
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

    protected void lexError(int pos, String key, Object... args) {
        this.f278log.error(pos, key, args);
        this.f279tk = Tokens.TokenKind.ERROR;
        this.errPos = pos;
    }

    private void scanLitChar(int pos) {
        if (this.reader.f305ch == '\\') {
            if (this.reader.peekChar() == '\\' && !this.reader.isUnicode()) {
                this.reader.skipChar();
                this.reader.putChar('\\', true);
                return;
            }
            this.reader.scanChar();
            char c = this.reader.f305ch;
            if (c == '\"') {
                this.reader.putChar('\"', true);
                return;
            }
            if (c == '\'') {
                this.reader.putChar('\'', true);
                return;
            }
            if (c == '\\') {
                this.reader.putChar('\\', true);
                return;
            }
            if (c == 'b') {
                this.reader.putChar('\b', true);
                return;
            }
            if (c == 'f') {
                this.reader.putChar('\f', true);
                return;
            }
            if (c == 'n') {
                this.reader.putChar('\n', true);
                return;
            }
            if (c == 'r') {
                this.reader.putChar('\r', true);
                return;
            }
            if (c != 't') {
                switch (c) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        char leadch = this.reader.f305ch;
                        int oct = this.reader.digit(pos, 8);
                        this.reader.scanChar();
                        if ('0' <= this.reader.f305ch && this.reader.f305ch <= '7') {
                            oct = (oct * 8) + this.reader.digit(pos, 8);
                            this.reader.scanChar();
                            if (leadch <= '3' && '0' <= this.reader.f305ch && this.reader.f305ch <= '7') {
                                oct = (oct * 8) + this.reader.digit(pos, 8);
                                this.reader.scanChar();
                            }
                        }
                        this.reader.putChar((char) oct);
                        break;
                    default:
                        lexError(this.reader.f303bp, "illegal.esc.char", new Object[0]);
                        break;
                }
            }
            this.reader.putChar('\t', true);
            return;
        }
        if (this.reader.f303bp != this.reader.buflen) {
            this.reader.putChar(true);
        }
    }

    private void scanDigits(int pos, int digitRadix) {
        char saveCh;
        int savePos;
        while (true) {
            if (this.reader.f305ch != '_') {
                this.reader.putChar(false);
            } else if (!this.allowUnderscoresInLiterals) {
                lexError(pos, "unsupported.underscore.lit", this.source.name);
                this.allowUnderscoresInLiterals = true;
            }
            saveCh = this.reader.f305ch;
            savePos = this.reader.f303bp;
            this.reader.scanChar();
            if (this.reader.digit(pos, digitRadix) < 0 && this.reader.f305ch != '_') {
                break;
            }
        }
        if (saveCh == '_') {
            lexError(savePos, "illegal.underscore", new Object[0]);
        }
    }

    private void scanHexExponentAndSuffix(int pos) {
        if (this.reader.f305ch == 'p' || this.reader.f305ch == 'P') {
            this.reader.putChar(true);
            skipIllegalUnderscores();
            if (this.reader.f305ch == '+' || this.reader.f305ch == '-') {
                this.reader.putChar(true);
            }
            skipIllegalUnderscores();
            if ('0' <= this.reader.f305ch && this.reader.f305ch <= '9') {
                scanDigits(pos, 10);
                if (!this.allowHexFloats) {
                    lexError(pos, "unsupported.fp.lit", this.source.name);
                    this.allowHexFloats = true;
                } else if (!hexFloatsWork) {
                    lexError(pos, "unsupported.cross.fp.lit", new Object[0]);
                }
            } else {
                lexError(pos, "malformed.fp.lit", new Object[0]);
            }
        } else {
            lexError(pos, "malformed.fp.lit", new Object[0]);
        }
        if (this.reader.f305ch == 'f' || this.reader.f305ch == 'F') {
            this.reader.putChar(true);
            this.f279tk = Tokens.TokenKind.FLOATLITERAL;
            this.radix = 16;
        } else {
            if (this.reader.f305ch == 'd' || this.reader.f305ch == 'D') {
                this.reader.putChar(true);
            }
            this.f279tk = Tokens.TokenKind.DOUBLELITERAL;
            this.radix = 16;
        }
    }

    private void scanFraction(int pos) {
        skipIllegalUnderscores();
        if ('0' <= this.reader.f305ch && this.reader.f305ch <= '9') {
            scanDigits(pos, 10);
        }
        int sp1 = this.reader.f307sp;
        if (this.reader.f305ch == 'e' || this.reader.f305ch == 'E') {
            this.reader.putChar(true);
            skipIllegalUnderscores();
            if (this.reader.f305ch == '+' || this.reader.f305ch == '-') {
                this.reader.putChar(true);
            }
            skipIllegalUnderscores();
            if ('0' <= this.reader.f305ch && this.reader.f305ch <= '9') {
                scanDigits(pos, 10);
            } else {
                lexError(pos, "malformed.fp.lit", new Object[0]);
                this.reader.f307sp = sp1;
            }
        }
    }

    private void scanFractionAndSuffix(int pos) {
        this.radix = 10;
        scanFraction(pos);
        if (this.reader.f305ch == 'f' || this.reader.f305ch == 'F') {
            this.reader.putChar(true);
            this.f279tk = Tokens.TokenKind.FLOATLITERAL;
        } else {
            if (this.reader.f305ch == 'd' || this.reader.f305ch == 'D') {
                this.reader.putChar(true);
            }
            this.f279tk = Tokens.TokenKind.DOUBLELITERAL;
        }
    }

    private void scanHexFractionAndSuffix(int pos, boolean seendigit) {
        this.radix = 16;
        Assert.check(this.reader.f305ch == '.');
        this.reader.putChar(true);
        skipIllegalUnderscores();
        if (this.reader.digit(pos, 16) >= 0) {
            seendigit = true;
            scanDigits(pos, 16);
        }
        if (!seendigit) {
            lexError(pos, "invalid.hex.number", new Object[0]);
        } else {
            scanHexExponentAndSuffix(pos);
        }
    }

    private void skipIllegalUnderscores() {
        if (this.reader.f305ch == '_') {
            lexError(this.reader.f303bp, "illegal.underscore", new Object[0]);
            while (this.reader.f305ch == '_') {
                this.reader.scanChar();
            }
        }
    }

    private void scanNumber(int pos, int radix) {
        this.radix = radix;
        int digitRadix = radix == 8 ? 10 : radix;
        boolean seendigit = false;
        if (this.reader.digit(pos, digitRadix) >= 0) {
            seendigit = true;
            scanDigits(pos, digitRadix);
        }
        if (radix == 16 && this.reader.f305ch == '.') {
            scanHexFractionAndSuffix(pos, seendigit);
            return;
        }
        if (seendigit && radix == 16 && (this.reader.f305ch == 'p' || this.reader.f305ch == 'P')) {
            scanHexExponentAndSuffix(pos);
            return;
        }
        if (digitRadix == 10 && this.reader.f305ch == '.') {
            this.reader.putChar(true);
            scanFractionAndSuffix(pos);
            return;
        }
        if (digitRadix == 10 && (this.reader.f305ch == 'e' || this.reader.f305ch == 'E' || this.reader.f305ch == 'f' || this.reader.f305ch == 'F' || this.reader.f305ch == 'd' || this.reader.f305ch == 'D')) {
            scanFractionAndSuffix(pos);
        } else if (this.reader.f305ch == 'l' || this.reader.f305ch == 'L') {
            this.reader.scanChar();
            this.f279tk = Tokens.TokenKind.LONGLITERAL;
        } else {
            this.f279tk = Tokens.TokenKind.INTLITERAL;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0016. Please report as an issue. */
    private void scanIdent() {
        boolean isJavaIdentifierPart;
        this.reader.putChar(true);
        while (true) {
            char c = this.reader.f305ch;
            if (c != '$' && c != '_') {
                if (c != 127) {
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
                            break;
                    }
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
                            break;
                        case 26:
                            if (this.reader.f303bp >= this.reader.buflen) {
                                Name name = this.reader.name();
                                this.name = name;
                                this.f279tk = this.tokens.lookupKind(name);
                            } else {
                                this.reader.scanChar();
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
                                    break;
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
                                                default:
                                                    if (this.reader.f305ch < 128) {
                                                        isJavaIdentifierPart = false;
                                                    } else if (Character.isIdentifierIgnorable(this.reader.f305ch)) {
                                                        this.reader.scanChar();
                                                    } else {
                                                        char high = this.reader.scanSurrogates();
                                                        if (high != 0) {
                                                            this.reader.putChar(high);
                                                            isJavaIdentifierPart = Character.isJavaIdentifierPart(Character.toCodePoint(high, this.reader.f305ch));
                                                        } else {
                                                            isJavaIdentifierPart = Character.isJavaIdentifierPart(this.reader.f305ch);
                                                        }
                                                    }
                                                    if (!isJavaIdentifierPart) {
                                                        Name name2 = this.reader.name();
                                                        this.name = name2;
                                                        this.f279tk = this.tokens.lookupKind(name2);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    return;
                }
                this.reader.scanChar();
            }
            this.reader.putChar(true);
        }
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
            this.reader.putChar(false);
            Name newname = this.reader.name();
            Tokens.TokenKind tk1 = this.tokens.lookupKind(newname);
            if (tk1 == Tokens.TokenKind.IDENTIFIER) {
                this.reader.f307sp--;
                return;
            } else {
                this.f279tk = tk1;
                this.reader.scanChar();
            }
        } while (isSpecial(this.reader.f305ch));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x0269 A[Catch: all -> 0x045f, TryCatch #0 {, blocks: (B:3:0x000e, B:25:0x0049, B:27:0x0050, B:28:0x0053, B:29:0x0056, B:30:0x0059, B:32:0x0063, B:177:0x03bb, B:184:0x03d6, B:186:0x03ea, B:187:0x03ef, B:188:0x03f0, B:190:0x0402, B:192:0x0410, B:33:0x0068, B:41:0x0098, B:42:0x009c, B:44:0x00a6, B:46:0x00ae, B:49:0x00ba, B:51:0x00c0, B:53:0x00c8, B:55:0x00ed, B:54:0x00db, B:56:0x00fd, B:36:0x0072, B:38:0x007a, B:39:0x008d, B:58:0x0108, B:59:0x0113, B:60:0x011e, B:61:0x0123, B:63:0x0130, B:66:0x013a, B:68:0x0142, B:71:0x014b, B:73:0x0156, B:74:0x015a, B:76:0x0165, B:78:0x016d, B:79:0x0174, B:80:0x017b, B:82:0x017f, B:83:0x018e, B:85:0x019e, B:86:0x01a7, B:87:0x01ac, B:89:0x01ba, B:90:0x01bf, B:92:0x01c9, B:93:0x01d2, B:94:0x01d7, B:96:0x01e4, B:98:0x01ef, B:100:0x01f5, B:102:0x01ff, B:104:0x0209, B:105:0x021a, B:107:0x0222, B:109:0x022e, B:114:0x0241, B:116:0x024b, B:118:0x0251, B:121:0x025d, B:122:0x0263, B:124:0x0269, B:125:0x027d, B:112:0x023d, B:126:0x0286, B:128:0x028e, B:129:0x0299, B:130:0x029f, B:132:0x02aa, B:134:0x02b2, B:135:0x02bc, B:137:0x02c2, B:139:0x02d6, B:140:0x02e5, B:142:0x02ee, B:143:0x02f4, B:144:0x02ff, B:145:0x030a, B:147:0x0317, B:148:0x0320, B:150:0x0326, B:153:0x0333, B:155:0x0340, B:156:0x034a, B:152:0x032c, B:158:0x0352, B:159:0x035c, B:160:0x0366, B:161:0x0370, B:162:0x037a, B:163:0x037e, B:164:0x0383, B:166:0x0389, B:168:0x038f, B:170:0x0395, B:172:0x039f, B:173:0x03a3, B:175:0x03a9, B:176:0x03b3, B:194:0x0418, B:196:0x0423, B:197:0x0428, B:198:0x0431, B:199:0x043f, B:201:0x044a, B:203:0x0450, B:205:0x0456), top: B:211:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:232:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x000e A[SYNTHETIC] */
    public Tokens.Token readToken() {
        int pos;
        boolean isJavaIdentifierStart;
        String arg;
        Tokens.Comment.CommentStyle style;
        this.reader.f307sp = 0;
        this.name = null;
        this.radix = 0;
        List<Tokens.Comment> comments = null;
        while (true) {
            pos = this.reader.f303bp;
            char c = this.reader.f305ch;
            if (c != '\t') {
                if (c == '\n') {
                    this.reader.scanChar();
                    processLineTerminator(pos, this.reader.f303bp);
                } else if (c != '\f') {
                    if (c == '\r') {
                        this.reader.scanChar();
                        if (this.reader.f305ch == '\n') {
                            this.reader.scanChar();
                        }
                        processLineTerminator(pos, this.reader.f303bp);
                    } else if (c != ' ') {
                        if (c != '\"') {
                            if (c != '$') {
                                if (c == ',') {
                                    this.reader.scanChar();
                                    this.f279tk = Tokens.TokenKind.COMMA;
                                } else if (c == ';') {
                                    this.reader.scanChar();
                                    this.f279tk = Tokens.TokenKind.SEMI;
                                } else if (c == ']') {
                                    this.reader.scanChar();
                                    this.f279tk = Tokens.TokenKind.RBRACKET;
                                } else if (c != '_') {
                                    if (c == '}') {
                                        this.reader.scanChar();
                                        this.f279tk = Tokens.TokenKind.RBRACE;
                                    } else {
                                        switch (c) {
                                            case '\'':
                                                this.reader.scanChar();
                                                if (this.reader.f305ch == '\'') {
                                                    lexError(pos, "empty.char.lit", new Object[0]);
                                                } else {
                                                    if (this.reader.f305ch == '\r' || this.reader.f305ch == '\n') {
                                                        lexError(pos, "illegal.line.end.in.char.lit", new Object[0]);
                                                    }
                                                    scanLitChar(pos);
                                                    char c2 = this.reader.f305ch;
                                                    if (this.reader.f305ch == '\'') {
                                                        this.reader.scanChar();
                                                        this.f279tk = Tokens.TokenKind.CHARLITERAL;
                                                    } else {
                                                        lexError(pos, "unclosed.char.lit", new Object[0]);
                                                    }
                                                }
                                                break;
                                            case '(':
                                                this.reader.scanChar();
                                                this.f279tk = Tokens.TokenKind.LPAREN;
                                                break;
                                            case ')':
                                                this.reader.scanChar();
                                                this.f279tk = Tokens.TokenKind.RPAREN;
                                                break;
                                            default:
                                                switch (c) {
                                                    case '.':
                                                        this.reader.scanChar();
                                                        if ('0' <= this.reader.f305ch && this.reader.f305ch <= '9') {
                                                            this.reader.putChar('.');
                                                            scanFractionAndSuffix(pos);
                                                        } else if (this.reader.f305ch == '.') {
                                                            int savePos = this.reader.f303bp;
                                                            this.reader.putChar('.');
                                                            this.reader.putChar('.', true);
                                                            if (this.reader.f305ch == '.') {
                                                                this.reader.scanChar();
                                                                this.reader.putChar('.');
                                                                this.f279tk = Tokens.TokenKind.ELLIPSIS;
                                                            } else {
                                                                lexError(savePos, "illegal.dot", new Object[0]);
                                                            }
                                                        } else {
                                                            this.f279tk = Tokens.TokenKind.DOT;
                                                        }
                                                        break;
                                                    case '/':
                                                        this.reader.scanChar();
                                                        if (this.reader.f305ch == '/') {
                                                            do {
                                                                this.reader.scanCommentChar();
                                                                if (this.reader.f305ch == '\r' || this.reader.f305ch == '\n') {
                                                                }
                                                                if (this.reader.f303bp < this.reader.buflen) {
                                                                    comments = addComment(comments, processComment(pos, this.reader.f303bp, Tokens.Comment.CommentStyle.LINE));
                                                                }
                                                                break;
                                                            } while (this.reader.f303bp < this.reader.buflen);
                                                            if (this.reader.f303bp < this.reader.buflen) {
                                                                comments = addComment(comments, processComment(pos, this.reader.f303bp, Tokens.Comment.CommentStyle.LINE));
                                                            }
                                                        } else if (this.reader.f305ch == '*') {
                                                            boolean isEmpty = false;
                                                            this.reader.scanChar();
                                                            if (this.reader.f305ch == '*') {
                                                                style = Tokens.Comment.CommentStyle.JAVADOC;
                                                                this.reader.scanCommentChar();
                                                                if (this.reader.f305ch == '/') {
                                                                    isEmpty = true;
                                                                }
                                                            } else {
                                                                style = Tokens.Comment.CommentStyle.BLOCK;
                                                            }
                                                            while (!isEmpty && this.reader.f303bp < this.reader.buflen) {
                                                                if (this.reader.f305ch == '*') {
                                                                    this.reader.scanChar();
                                                                    if (this.reader.f305ch == '/') {
                                                                        if (this.reader.f305ch == '/') {
                                                                            this.reader.scanChar();
                                                                            comments = addComment(comments, processComment(pos, this.reader.f303bp, style));
                                                                        } else {
                                                                            lexError(pos, "unclosed.comment", new Object[0]);
                                                                        }
                                                                        break;
                                                                    }
                                                                } else {
                                                                    this.reader.scanCommentChar();
                                                                }
                                                            }
                                                            if (this.reader.f305ch == '/') {
                                                                this.reader.scanChar();
                                                                comments = addComment(comments, processComment(pos, this.reader.f303bp, style));
                                                            } else {
                                                                lexError(pos, "unclosed.comment", new Object[0]);
                                                            }
                                                        } else if (this.reader.f305ch == '=') {
                                                            this.f279tk = Tokens.TokenKind.SLASHEQ;
                                                            this.reader.scanChar();
                                                        } else {
                                                            this.f279tk = Tokens.TokenKind.SLASH;
                                                        }
                                                        break;
                                                    case '0':
                                                        this.reader.scanChar();
                                                        if (this.reader.f305ch == 'x' || this.reader.f305ch == 'X') {
                                                            this.reader.scanChar();
                                                            skipIllegalUnderscores();
                                                            if (this.reader.f305ch == '.') {
                                                                scanHexFractionAndSuffix(pos, false);
                                                            } else if (this.reader.digit(pos, 16) < 0) {
                                                                lexError(pos, "invalid.hex.number", new Object[0]);
                                                            } else {
                                                                scanNumber(pos, 16);
                                                            }
                                                        } else if (this.reader.f305ch == 'b' || this.reader.f305ch == 'B') {
                                                            if (!this.allowBinaryLiterals) {
                                                                lexError(pos, "unsupported.binary.lit", this.source.name);
                                                                this.allowBinaryLiterals = true;
                                                            }
                                                            this.reader.scanChar();
                                                            skipIllegalUnderscores();
                                                            if (this.reader.digit(pos, 2) < 0) {
                                                                lexError(pos, "invalid.binary.number", new Object[0]);
                                                            } else {
                                                                scanNumber(pos, 2);
                                                            }
                                                        } else {
                                                            this.reader.putChar('0');
                                                            if (this.reader.f305ch == '_') {
                                                                int savePos2 = this.reader.f303bp;
                                                                do {
                                                                    this.reader.scanChar();
                                                                } while (this.reader.f305ch == '_');
                                                                if (this.reader.digit(pos, 10) < 0) {
                                                                    lexError(savePos2, "illegal.underscore", new Object[0]);
                                                                }
                                                            }
                                                            scanNumber(pos, 8);
                                                        }
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        scanNumber(pos, 10);
                                                        break;
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
                                                                this.reader.scanChar();
                                                                this.f279tk = Tokens.TokenKind.LBRACKET;
                                                                break;
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
                                                                        this.reader.scanChar();
                                                                        this.f279tk = Tokens.TokenKind.LBRACE;
                                                                        break;
                                                                    default:
                                                                        if (isSpecial(this.reader.f305ch)) {
                                                                            scanOperator();
                                                                        } else {
                                                                            if (this.reader.f305ch < 128) {
                                                                                isJavaIdentifierStart = false;
                                                                            } else {
                                                                                char high = this.reader.scanSurrogates();
                                                                                if (high != 0) {
                                                                                    this.reader.putChar(high);
                                                                                    isJavaIdentifierStart = Character.isJavaIdentifierStart(Character.toCodePoint(high, this.reader.f305ch));
                                                                                } else {
                                                                                    isJavaIdentifierStart = Character.isJavaIdentifierStart(this.reader.f305ch);
                                                                                }
                                                                            }
                                                                            if (isJavaIdentifierStart) {
                                                                                scanIdent();
                                                                            } else if (this.reader.f303bp == this.reader.buflen || (this.reader.f305ch == 26 && this.reader.f303bp + 1 == this.reader.buflen)) {
                                                                                this.f279tk = Tokens.TokenKind.EOF;
                                                                                pos = this.reader.buflen;
                                                                            } else {
                                                                                if (' ' < this.reader.f305ch && this.reader.f305ch < 127) {
                                                                                    arg = String.format("%s", Character.valueOf(this.reader.f305ch));
                                                                                } else {
                                                                                    arg = String.format("\\u%04x", Integer.valueOf(this.reader.f305ch));
                                                                                }
                                                                                lexError(pos, "illegal.char", arg);
                                                                                this.reader.scanChar();
                                                                            }
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
                            scanIdent();
                        } else {
                            this.reader.scanChar();
                            while (this.reader.f305ch != '\"' && this.reader.f305ch != '\r' && this.reader.f305ch != '\n' && this.reader.f303bp < this.reader.buflen) {
                                scanLitChar(pos);
                            }
                            if (this.reader.f305ch == '\"') {
                                this.f279tk = Tokens.TokenKind.STRINGLITERAL;
                                this.reader.scanChar();
                            } else {
                                lexError(pos, "unclosed.str.lit", new Object[0]);
                            }
                        }
                    }
                }
            }
            while (true) {
                this.reader.scanChar();
                if (this.reader.f305ch != ' ' && this.reader.f305ch != '\t' && this.reader.f305ch != '\f') {
                    processWhiteSpace(pos, this.reader.f303bp);
                }
            }
        }
        int endPos = this.reader.f303bp;
        int i = C05551.f280x86f514cf[this.f279tk.f302tag.ordinal()];
        if (i == 1) {
            return new Tokens.Token(this.f279tk, pos, endPos, comments);
        }
        if (i == 2) {
            return new Tokens.NamedToken(this.f279tk, pos, endPos, this.name, comments);
        }
        if (i == 3) {
            return new Tokens.StringToken(this.f279tk, pos, endPos, this.reader.chars(), comments);
        }
        if (i == 4) {
            return new Tokens.NumericToken(this.f279tk, pos, endPos, this.reader.chars(), this.radix, comments);
        }
        throw new AssertionError();
    }

    static class C05551 {

        static final int[] f280x86f514cf;

        static {
            int[] iArr = new int[Tokens.Token.EnumC0557Tag.values().length];
            f280x86f514cf = iArr;
            try {
                iArr[Tokens.Token.EnumC0557Tag.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f280x86f514cf[Tokens.Token.EnumC0557Tag.NAMED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f280x86f514cf[Tokens.Token.EnumC0557Tag.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f280x86f514cf[Tokens.Token.EnumC0557Tag.NUMERIC.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    List<Tokens.Comment> addComment(List<Tokens.Comment> comments, Tokens.Comment comment) {
        if (comments == null) {
            return List.m508of(comment);
        }
        return comments.prepend(comment);
    }

    public int errPos() {
        return this.errPos;
    }

    public void errPos(int pos) {
        this.errPos = pos;
    }

    protected Tokens.Comment processComment(int pos, int endPos, Tokens.Comment.CommentStyle style) {
        char[] buf = this.reader.getRawCharacters(pos, endPos);
        return new BasicComment(new UnicodeReader(this.f277fac, buf, buf.length), style);
    }

    protected void processWhiteSpace(int pos, int endPos) {
    }

    protected void processLineTerminator(int pos, int endPos) {
    }

    public Position.LineMap getLineMap() {
        return Position.makeLineMap(this.reader.getRawCharacters(), this.reader.buflen, false);
    }

    protected static class BasicComment<U extends UnicodeReader> implements Tokens.Comment {
        U comment_reader;

        Tokens.Comment.CommentStyle f281cs;
        protected boolean deprecatedFlag = false;
        protected boolean scanned = false;

        protected BasicComment(U comment_reader, Tokens.Comment.CommentStyle cs) {
            this.comment_reader = comment_reader;
            this.f281cs = cs;
        }

        @Override
        public String getText() {
            return null;
        }

        @Override
        public int getSourcePos(int pos) {
            return -1;
        }

        @Override
        public Tokens.Comment.CommentStyle getStyle() {
            return this.f281cs;
        }

        @Override
        public boolean isDeprecated() {
            if (!this.scanned && this.f281cs == Tokens.Comment.CommentStyle.JAVADOC) {
                scanDocComment();
            }
            return this.deprecatedFlag;
        }

        protected void scanDocComment() {
            try {
                this.comment_reader.f303bp += 3;
                this.comment_reader.f305ch = this.comment_reader.f304buf[this.comment_reader.f303bp];
                while (this.comment_reader.f303bp < this.comment_reader.buflen) {
                    while (this.comment_reader.f303bp < this.comment_reader.buflen && (this.comment_reader.f305ch == ' ' || this.comment_reader.f305ch == '\t' || this.comment_reader.f305ch == '\f')) {
                        this.comment_reader.scanCommentChar();
                    }
                    while (this.comment_reader.f303bp < this.comment_reader.buflen && this.comment_reader.f305ch == '*') {
                        this.comment_reader.scanCommentChar();
                        if (this.comment_reader.f305ch == '/') {
                            return;
                        }
                    }
                    while (this.comment_reader.f303bp < this.comment_reader.buflen && (this.comment_reader.f305ch == ' ' || this.comment_reader.f305ch == '\t' || this.comment_reader.f305ch == '\f')) {
                        this.comment_reader.scanCommentChar();
                    }
                    boolean deprecatedPrefix = false;
                    if (!this.deprecatedFlag) {
                        int i = 0;
                        while (this.comment_reader.f303bp < this.comment_reader.buflen && this.comment_reader.f305ch == "@deprecated".charAt(i)) {
                            this.comment_reader.scanCommentChar();
                            i++;
                            if (i == "@deprecated".length()) {
                                deprecatedPrefix = true;
                                break;
                            }
                        }
                    }
                    if (deprecatedPrefix && this.comment_reader.f303bp < this.comment_reader.buflen) {
                        if (Character.isWhitespace(this.comment_reader.f305ch)) {
                            this.deprecatedFlag = true;
                        } else if (this.comment_reader.f305ch == '*') {
                            this.comment_reader.scanCommentChar();
                            if (this.comment_reader.f305ch == '/') {
                                this.deprecatedFlag = true;
                                return;
                            }
                        }
                    }
                    while (this.comment_reader.f303bp < this.comment_reader.buflen) {
                        char c = this.comment_reader.f305ch;
                        if (c != '\n') {
                            if (c == '\r') {
                                this.comment_reader.scanCommentChar();
                                if (this.comment_reader.f305ch != '\n') {
                                    break;
                                }
                            } else if (c != '*') {
                                this.comment_reader.scanCommentChar();
                            } else {
                                this.comment_reader.scanCommentChar();
                                if (this.comment_reader.f305ch == '/') {
                                    return;
                                }
                            }
                        }
                        this.comment_reader.scanCommentChar();
                    }
                }
            } finally {
                this.scanned = true;
            }
        }
    }
}
