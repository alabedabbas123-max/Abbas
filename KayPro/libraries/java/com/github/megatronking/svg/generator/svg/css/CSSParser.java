package com.github.megatronking.svg.generator.svg.css;

import java.lang.reflect.Field;

public class CSSParser {
    private static final int BRACE_CLOSE = 5;
    private static final int BRACE_OPEN = 4;
    private static final int BRACKET_CLOSE = 3;
    private static final int BRACKET_OPEN = 2;

    private static final int f4780END = -1;
    private static final int IDENTIFIER = 1;
    private static final int PAREN_CLOSE = 7;
    private static final int PAREN_OPEN = 6;
    private static final char[] charMapping = {(char) 0, (char) 0, '[', ']', '{', '}', '(', ')', (char) 0};
    private CSSParserCallback callback;
    private char[] chars;
    private boolean didPushChar;
    private boolean encounteredRuleSet;
    private int iterateIndex;
    private int pushedChar;
    private boolean readWS;
    private int stackCount;
    private int tokenBufferLength;
    private int[] unitStack = new int[2];
    private char[] tokenBuffer = new char[80];
    private StringBuffer unitBuffer = new StringBuffer();

    private void append(char c) {
        if (this.tokenBufferLength == this.tokenBuffer.length) {
            char[] cArr = new char[this.tokenBuffer.length * 2];
            System.arraycopy(this.tokenBuffer, 0, cArr, 0, this.tokenBuffer.length);
            this.tokenBuffer = cArr;
        }
        char[] cArr2 = this.tokenBuffer;
        int i = this.tokenBufferLength;
        this.tokenBufferLength = i + 1;
        cArr2[i] = c;
    }

    private void endBlock(int i) {
        int i2;
        switch (i) {
            case 3:
                i2 = 2;
                break;
            case 4:
            case 6:
            default:
                i2 = -1;
                break;
            case 5:
                i2 = 4;
                break;
            case 7:
                i2 = 6;
                break;
        }
        if (this.stackCount <= 0 || this.unitStack[this.stackCount - 1] != i2) {
            throw new CSSException("Unmatched block");
        }
        this.stackCount--;
    }

    private boolean getIdentifier(char c) {
        short s;
        this.tokenBufferLength = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (!z2) {
            int i4 = readChar();
            switch (i4) {
                case -1:
                    s = (short) 0;
                    z2 = true;
                    break;
                case 9:
                case 10:
                case 13:
                case 32:
                case 34:
                case 39:
                case 40:
                case 41:
                case 91:
                case 93:
                case 123:
                case 125:
                    s = (short) 3;
                    break;
                case 47:
                    s = (short) 4;
                    break;
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    s = (short) 2;
                    i3 = i4 - 48;
                    break;
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                    s = (short) 2;
                    i3 = (i4 - 65) + 10;
                    break;
                case 92:
                    s = (short) 1;
                    break;
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                    s = (short) 2;
                    i3 = (i4 - 97) + 10;
                    break;
                default:
                    s = (short) 0;
                    break;
            }
            if (z) {
                if (s == 2) {
                    i2 = (i2 * 16) + i3;
                    i++;
                    if (i == 4) {
                        append((char) i2);
                        z = false;
                    }
                } else if (i > 0) {
                    append((char) i2);
                    pushChar(i4);
                    z = false;
                } else {
                    if (!z2) {
                        append((char) i4);
                    }
                    z = false;
                }
            } else if (!z2) {
                if (s == 1) {
                    z = true;
                    i = 0;
                    i2 = 0;
                } else if (s == 3) {
                    pushChar(i4);
                    z2 = true;
                } else if (s == 4) {
                    int i5 = readChar();
                    if (i5 == 42) {
                        readComment();
                        this.readWS = true;
                        z2 = true;
                    } else {
                        append('/');
                        if (i5 == -1) {
                            z2 = true;
                        } else {
                            pushChar(i5);
                        }
                    }
                } else {
                    append((char) i4);
                    if (i4 == c) {
                        z2 = true;
                    }
                }
            }
        }
        return this.tokenBufferLength > 0;
    }

    private boolean getNextStatement() {
        this.unitBuffer.setLength(0);
        int iNextToken = nextToken((char) 0);
        switch (iNextToken) {
            case -1:
                return false;
            case 0:
            default:
                return true;
            case 1:
                if (this.tokenBufferLength <= 0) {
                    return true;
                }
                if (this.tokenBuffer[0] == '@') {
                    parseAtRule();
                    return true;
                }
                this.encounteredRuleSet = true;
                parseRuleSet();
                return true;
            case 2:
            case 4:
            case 6:
                parseTillClosed(iNextToken);
                return true;
            case 3:
            case 5:
            case 7:
                throw new CSSException("Unexpected top level block close");
        }
    }

    private boolean inBlock() {
        return this.stackCount > 0;
    }

    private int nextToken(char c) {
        this.readWS = false;
        int ws = readWS();
        switch (ws) {
            case -1:
                return -1;
            case 34:
                readTill('\"');
                if (this.tokenBufferLength <= 0) {
                    return 1;
                }
                this.tokenBufferLength--;
                return 1;
            case 39:
                readTill('\'');
                if (this.tokenBufferLength <= 0) {
                    return 1;
                }
                this.tokenBufferLength--;
                return 1;
            case 40:
                return 6;
            case 41:
                return 7;
            case 91:
                return 2;
            case 93:
                return 3;
            case 123:
                return 4;
            case 125:
                return 5;
            default:
                pushChar(ws);
                getIdentifier(c);
                return 1;
        }
    }

    private void parseAtRule() {
        boolean z = this.tokenBufferLength == 7 && this.tokenBuffer[0] == '@' && this.tokenBuffer[1] == 'i' && this.tokenBuffer[2] == 'm' && this.tokenBuffer[3] == 'p' && this.tokenBuffer[4] == 'o' && this.tokenBuffer[5] == 'r' && this.tokenBuffer[6] == 't';
        this.unitBuffer.setLength(0);
        boolean z2 = false;
        while (!z2) {
            int iNextToken = nextToken(';');
            switch (iNextToken) {
                case -1:
                    z2 = true;
                    break;
                case 1:
                    if (this.tokenBufferLength > 0 && this.tokenBuffer[this.tokenBufferLength - 1] == ';') {
                        this.tokenBufferLength--;
                        z2 = true;
                    }
                    if (this.tokenBufferLength > 0) {
                        if (this.unitBuffer.length() > 0 && this.readWS) {
                            this.unitBuffer.append(' ');
                        }
                        this.unitBuffer.append(this.tokenBuffer, 0, this.tokenBufferLength);
                    }
                    break;
                case 2:
                case 6:
                    this.unitBuffer.append(charMapping[iNextToken]);
                    parseTillClosed(iNextToken);
                    break;
                case 3:
                case 5:
                case 7:
                    throw new CSSException("Unexpected close in @ rule");
                case 4:
                    if (this.unitBuffer.length() > 0 && this.readWS) {
                        this.unitBuffer.append(' ');
                    }
                    this.unitBuffer.append(charMapping[iNextToken]);
                    parseTillClosed(iNextToken);
                    int ws = readWS();
                    if (ws != -1 && ws != 59) {
                        pushChar(ws);
                    }
                    z2 = true;
                    break;
            }
        }
        if (!z || this.encounteredRuleSet) {
            return;
        }
        this.callback.handleImport(this.unitBuffer.toString());
    }

    private int parseDeclaration() {
        int identifiers = parseIdentifiers(':', false);
        if (identifiers != 1) {
            return identifiers;
        }
        for (int length = this.unitBuffer.length() - 1; length >= 0; length--) {
            this.unitBuffer.setCharAt(length, Character.toLowerCase(this.unitBuffer.charAt(length)));
        }
        this.callback.handleProperty(this.unitBuffer.toString());
        int identifiers2 = parseIdentifiers(';', true);
        this.callback.handleValue(this.unitBuffer.toString());
        return identifiers2;
    }

    private void parseDeclarationBlock() {
        while (true) {
            switch (parseDeclaration()) {
                case -1:
                case 5:
                    return;
                case 0:
                case 1:
                case 2:
                case 4:
                case 6:
                default:
                    break;
                case 3:
                case 7:
                    throw new CSSException("Unexpected close in declaration block");
            }
        }
    }

    private int parseIdentifiers(char c, boolean z) {
        this.unitBuffer.setLength(0);
        while (true) {
            int iNextToken = nextToken(c);
            switch (iNextToken) {
                case -1:
                case 3:
                case 5:
                case 7:
                    return iNextToken;
                case 1:
                    if (this.tokenBufferLength <= 0) {
                        continue;
                    } else {
                        if (this.tokenBuffer[this.tokenBufferLength - 1] == c) {
                            int i = this.tokenBufferLength - 1;
                            this.tokenBufferLength = i;
                            if (i > 0) {
                                if (this.readWS && this.unitBuffer.length() > 0) {
                                    this.unitBuffer.append(' ');
                                }
                                this.unitBuffer.append(this.tokenBuffer, 0, this.tokenBufferLength);
                            }
                            return 1;
                        }
                        if (this.readWS && this.unitBuffer.length() > 0) {
                            this.unitBuffer.append(' ');
                        }
                        this.unitBuffer.append(this.tokenBuffer, 0, this.tokenBufferLength);
                    }
                    break;
                case 2:
                case 4:
                case 6:
                    int length = this.unitBuffer.length();
                    if (z) {
                        this.unitBuffer.append(charMapping[iNextToken]);
                    }
                    parseTillClosed(iNextToken);
                    if (!z) {
                        this.unitBuffer.setLength(length);
                    }
                    break;
            }
        }
    }

    private void parseRuleSet() {
        if (parseSelectors()) {
            this.callback.startRule();
            parseDeclarationBlock();
            this.callback.endRule();
        }
    }

    private boolean parseSelectors() {
        if (this.tokenBufferLength > 0) {
            this.callback.handleSelector(new String(this.tokenBuffer, 0, this.tokenBufferLength));
        }
        this.unitBuffer.setLength(0);
        while (true) {
            int iNextToken = nextToken((char) 0);
            if (iNextToken != 1) {
                switch (iNextToken) {
                    case -1:
                        return false;
                    case 2:
                    case 6:
                        parseTillClosed(iNextToken);
                        this.unitBuffer.setLength(0);
                        break;
                    case 3:
                    case 5:
                    case 7:
                        throw new CSSException("Unexpected block close in selector");
                    case 4:
                        return true;
                }
            } else if (this.tokenBufferLength > 0) {
                this.callback.handleSelector(new String(this.tokenBuffer, 0, this.tokenBufferLength));
            }
        }
    }

    private void parseTillClosed(int i) {
        startBlock(i);
        boolean z = false;
        while (!z) {
            int iNextToken = nextToken((char) 0);
            switch (iNextToken) {
                case -1:
                    throw new CSSException("Unclosed block");
                case 1:
                    if (this.unitBuffer.length() > 0 && this.readWS) {
                        this.unitBuffer.append(' ');
                    }
                    if (this.tokenBufferLength > 0) {
                        this.unitBuffer.append(this.tokenBuffer, 0, this.tokenBufferLength);
                    }
                    break;
                case 2:
                case 4:
                case 6:
                    if (this.unitBuffer.length() > 0 && this.readWS) {
                        this.unitBuffer.append(' ');
                    }
                    this.unitBuffer.append(charMapping[iNextToken]);
                    startBlock(iNextToken);
                    break;
                case 3:
                case 5:
                case 7:
                    if (this.unitBuffer.length() > 0 && this.readWS) {
                        this.unitBuffer.append(' ');
                    }
                    this.unitBuffer.append(charMapping[iNextToken]);
                    endBlock(iNextToken);
                    if (!inBlock()) {
                        z = true;
                    }
                    break;
            }
        }
    }

    private void pushChar(int i) {
        if (this.didPushChar) {
            throw new CSSException("Can not handle look ahead of more than one character");
        }
        this.didPushChar = true;
        this.pushedChar = i;
    }

    private int readChar() {
        if (this.didPushChar) {
            this.didPushChar = false;
            return this.pushedChar;
        }
        if (this.iterateIndex > this.chars.length - 1) {
            return -1;
        }
        char c = this.chars[this.iterateIndex];
        this.iterateIndex++;
        return c;
    }

    private void readComment() {
        while (true) {
            switch (readChar()) {
                case -1:
                    throw new CSSException("Unclosed comment");
                case 42:
                    int i = readChar();
                    if (i == 47) {
                        return;
                    }
                    if (i == -1) {
                        throw new CSSException("Unclosed comment");
                    }
                    pushChar(i);
                    break;
            }
        }
    }

    private void readTill(char c) {
        short s;
        this.tokenBufferLength = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            int i4 = readChar();
            switch (i4) {
                case -1:
                    throw new CSSException(new StringBuffer().append("Unclosed ").append(c).toString());
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    s = (short) 2;
                    i3 = i4 - 48;
                    break;
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                    s = (short) 2;
                    i3 = (i4 - 65) + 10;
                    break;
                case 92:
                    s = (short) 1;
                    break;
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                    s = (short) 2;
                    i3 = (i4 - 97) + 10;
                    break;
                default:
                    s = (short) 0;
                    break;
            }
            if (z) {
                if (s == 2) {
                    i2 = (i2 * 16) + i3;
                    i++;
                    if (i == 4) {
                        append((char) i2);
                        z = false;
                    }
                } else if (i > 0) {
                    append((char) i2);
                    if (s == 1) {
                        z = true;
                        i = 0;
                        i2 = 0;
                    } else {
                        if (i4 == c) {
                            z2 = true;
                        }
                        append((char) i4);
                        z = false;
                    }
                } else {
                    append((char) i4);
                    z = false;
                }
            } else if (s == 1) {
                z = true;
                i = 0;
                i2 = 0;
            } else {
                if (i4 == c) {
                    z2 = true;
                }
                append((char) i4);
            }
        }
    }

    private int readWS() {
        int i;
        while (true) {
            i = readChar();
            if (i == -1 || !Character.isWhitespace((char) i)) {
                break;
            }
            this.readWS = true;
        }
        return i;
    }

    private void startBlock(int i) {
        if (this.stackCount == this.unitStack.length) {
            int[] iArr = new int[this.stackCount * 2];
            System.arraycopy(this.unitStack, 0, iArr, 0, this.stackCount);
            this.unitStack = iArr;
        }
        int[] iArr2 = this.unitStack;
        int i2 = this.stackCount;
        this.stackCount = i2 + 1;
        iArr2[i2] = i;
    }

    private char[] string2chars(String str) {
        try {
            try {
                Field declaredField = Class.forName("java.lang.String").getDeclaredField("value");
                declaredField.setAccessible(true);
                return (char[]) declaredField.get(str);
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        } catch (Exception e2) {
            return (char[]) null;
        }
    }

    public void parse(String str, CSSParserCallback cSSParserCallback, boolean z) {
        this.callback = cSSParserCallback;
        this.chars = string2chars(str);
        this.tokenBufferLength = 0;
        this.stackCount = 0;
        this.encounteredRuleSet = false;
        if (z) {
            parseDeclarationBlock();
        } else {
            while (getNextStatement()) {
            }
        }
    }
}
