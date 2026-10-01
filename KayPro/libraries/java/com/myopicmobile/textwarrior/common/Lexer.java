package com.myopicmobile.textwarrior.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lexer {
    public static final int DOUBLE_SYMBOL_DELIMITED_MULTILINE = 40;
    public static final int DOUBLE_SYMBOL_LINE = 30;
    public static final int KEYWORD = 1;
    public static final int LITERAL = 4;
    private static final int MAX_KEYWORD_LENGTH = 127;
    public static final int NAME = 3;
    public static final int NORMAL = 0;
    public static final int OPERATOR = 2;
    public static final int SINGLE_SYMBOL_DELIMITED_A = 50;
    public static final int SINGLE_SYMBOL_DELIMITED_B = 51;
    public static final int SINGLE_SYMBOL_LINE_A = 20;
    public static final int SINGLE_SYMBOL_LINE_B = 21;
    public static final int SINGLE_SYMBOL_WORD = 10;
    public static final int UNKNOWN = -1;
    private static Language _globalLanguage = LanguageNonProg.getInstance();
    LexCallback _callback;
    private DocumentProvider _hDoc;
    private LexThread _workerThread = (LexThread) null;

    public interface LexCallback {
        void lexDone(List<Pair> list);
    }

    private class LexThread extends Thread {
        private final Lexer _lexManager;
        private ArrayList<Pair> _tokens;
        private final Lexer this$0;
        private boolean rescan = false;
        private final Flag _abort = new Flag();

        public LexThread(Lexer lexer, Lexer lexer2) {
            this.this$0 = lexer;
            this._lexManager = lexer2;
        }

        private void tokenize() {
            Pair pair;
            DocumentProvider document = this.this$0.getDocument();
            ArrayList<Pair> arrayList = new ArrayList<>(8196);
            LuaLexer luaLexer = new LuaLexer(document);
            Language language = Lexer.getLanguage();
            language.clearUserWord();
            try {
                String str = "";
                Pair pair2 = (Pair) null;
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                LuaTokenTypes luaTokenTypes = (LuaTokenTypes) null;
                LuaTokenTypes luaTokenTypes2 = (LuaTokenTypes) null;
                int i = 0;
                while (!this._abort.isSet()) {
                    Pair pair3 = (Pair) null;
                    LuaTokenTypes luaTokenTypesAdvance = luaLexer.advance();
                    if (luaTokenTypesAdvance == null) {
                        break;
                    }
                    int iYylength = luaLexer.yylength();
                    if (z && luaTokenTypes2 == LuaTokenTypes.STRING && luaTokenTypesAdvance != LuaTokenTypes.STRING) {
                        String string = sb.toString();
                        if (sb.length() > 2) {
                            language.addUserWord(string.substring(1, string.length() - 1));
                        }
                        z = false;
                        sb = new StringBuilder();
                    }
                    if (luaTokenTypes == luaTokenTypesAdvance && pair2 != null) {
                        pair2.setFirst(pair2.getFirst() + iYylength);
                    } else if (Lexer.isKeyword(luaTokenTypesAdvance)) {
                        arrayList.add(new Pair(iYylength, 1));
                    } else if (luaTokenTypesAdvance == LuaTokenTypes.LPAREN || luaTokenTypesAdvance == LuaTokenTypes.RPAREN || luaTokenTypesAdvance == LuaTokenTypes.LBRACK || luaTokenTypesAdvance == LuaTokenTypes.RBRACK || luaTokenTypesAdvance == LuaTokenTypes.LCURLY || luaTokenTypesAdvance == LuaTokenTypes.RCURLY || luaTokenTypesAdvance == LuaTokenTypes.COMMA || luaTokenTypesAdvance == LuaTokenTypes.DOT) {
                        pair3 = new Pair(iYylength, 2);
                        arrayList.add(pair3);
                    } else if (luaTokenTypesAdvance == LuaTokenTypes.STRING || luaTokenTypesAdvance == LuaTokenTypes.LONGSTRING) {
                        if (luaTokenTypes2 != luaTokenTypesAdvance) {
                            pair = new Pair(iYylength, 50);
                            arrayList.add(pair);
                            z = str.equals("require") ? true : z;
                        } else {
                            pair2.setFirst(pair2.getFirst() + iYylength);
                            pair = pair3;
                        }
                        if (z) {
                            sb.append(luaLexer.yytext());
                        }
                        pair3 = pair;
                    } else if (luaTokenTypesAdvance == LuaTokenTypes.NAME) {
                        String strYytext = luaLexer.yytext();
                        if (luaTokenTypes2 == LuaTokenTypes.FUNCTION) {
                            arrayList.add(new Pair(iYylength, 4));
                            language.addUserWord(strYytext);
                        } else if (language.isUserWord(strYytext)) {
                            arrayList.add(new Pair(iYylength, 4));
                        } else if (language.isBasePackage(strYytext)) {
                            arrayList.add(new Pair(iYylength, 3));
                        } else if ((luaTokenTypes2 == LuaTokenTypes.DOT && language.isBasePackage(str) && language.isBaseWord(str, strYytext)) || language.isName(strYytext)) {
                            arrayList.add(new Pair(iYylength, 3));
                        } else {
                            arrayList.add(new Pair(iYylength, 0));
                        }
                        if (luaTokenTypes2 == LuaTokenTypes.ASSIGN && strYytext.equals("require")) {
                            language.addUserWord(str);
                            if (arrayList.size() >= 3) {
                                arrayList.get(arrayList.size() - 3).setSecond(3);
                            }
                        }
                        str = strYytext;
                    } else if (luaTokenTypesAdvance == LuaTokenTypes.SHORTCOMMENT || luaTokenTypesAdvance == LuaTokenTypes.LONGCOMMENT) {
                        if (luaTokenTypes2 != luaTokenTypesAdvance) {
                            pair3 = new Pair(iYylength, 30);
                            arrayList.add(pair3);
                        } else {
                            pair2.setFirst(pair2.getFirst() + iYylength);
                        }
                    } else if (luaTokenTypesAdvance == LuaTokenTypes.NUMBER) {
                        arrayList.add(new Pair(iYylength, 4));
                    } else {
                        pair3 = new Pair(iYylength, 0);
                        arrayList.add(pair3);
                    }
                    LuaTokenTypes luaTokenTypes3 = (luaTokenTypesAdvance == LuaTokenTypes.WS || luaTokenTypesAdvance == LuaTokenTypes.NL_BEFORE_LONGSTRING) ? luaTokenTypes2 : luaTokenTypesAdvance;
                    if (pair3 == null) {
                        pair3 = pair2;
                    }
                    i += iYylength;
                    pair2 = pair3;
                    luaTokenTypes = luaTokenTypesAdvance;
                    luaTokenTypes2 = luaTokenTypes3;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new Pair(0, 0));
            }
            language.updateUserWord();
            this._tokens = arrayList;
        }

        public void abort() {
            this._abort.m7096set();
        }

        public void restart() {
            this.rescan = true;
            this._abort.m7096set();
        }

        @Override
        public void run() {
            do {
                this.rescan = false;
                this._abort.clear();
                tokenize();
            } while (this.rescan);
            if (this._abort.isSet()) {
                return;
            }
            this._lexManager.tokenizeDone(this._tokens);
        }

        public void tokenize2() {
            boolean z;
            int i;
            int i2;
            int i3;
            DocumentProvider document = this.this$0.getDocument();
            Language language = Lexer.getLanguage();
            ArrayList<Pair> arrayList = new ArrayList<>();
            if (!language.isProgLang()) {
                arrayList.add(new Pair(0, 0));
                this._tokens = arrayList;
                return;
            }
            char[] cArr = new char[127];
            int i4 = 0;
            int i5 = 0;
            int i6 = -1;
            char c = (char) 0;
            document.seekChar(0);
            while (document.hasNext() && !this._abort.isSet()) {
                char next = document.next();
                switch (i6) {
                    case -1:
                    case 0:
                    case 1:
                    case 3:
                    case 10:
                        if (language.isLineStart(c, next)) {
                            i = 30;
                            z = true;
                        } else if (language.isMultilineStartDelimiter(c, next)) {
                            i = 40;
                            z = true;
                        } else if (language.isDelimiterA(next)) {
                            i = 50;
                            z = true;
                        } else if (language.isDelimiterB(next)) {
                            i = 51;
                            z = true;
                        } else if (language.isLineAStart(next)) {
                            i = 20;
                            z = true;
                        } else if (language.isLineBStart(next)) {
                            i = 21;
                            z = true;
                        } else {
                            z = false;
                            i = i6;
                        }
                        if (z) {
                            if (i == 30 || i == 40) {
                                int i7 = i5 - 1;
                                if (arrayList.get(arrayList.size() - 1).getFirst() == i7) {
                                    arrayList.remove(arrayList.size() - 1);
                                }
                                i3 = i7;
                            } else {
                                i3 = i5;
                            }
                            if (i4 > 0 && i6 != 0) {
                                arrayList.add(new Pair(i5 - i4, 0));
                            }
                            arrayList.add(new Pair(i3, i));
                            i4 = 0;
                            i6 = i;
                        } else if (language.isWhitespace(next) || language.isOperator(next)) {
                            if (i4 > 0) {
                                if (language.isWordStart(cArr[0])) {
                                    i6 = 10;
                                    arrayList.add(new Pair(i5 - i4, 10));
                                } else if (language.isKeyword(new String(cArr, 0, i4))) {
                                    i6 = 1;
                                    arrayList.add(new Pair(i5 - i4, 1));
                                } else if (language.isName(new String(cArr, 0, i4))) {
                                    i6 = 3;
                                    arrayList.add(new Pair(i5 - i4, 3));
                                } else if (i6 != 0) {
                                    i6 = 0;
                                    arrayList.add(new Pair(i5 - i4, 0));
                                }
                                i4 = 0;
                                i2 = i6;
                            } else {
                                i2 = i6;
                            }
                            if (i2 != 0 && language.isOperator(next)) {
                                i2 = 0;
                                arrayList.add(new Pair(i5, 0));
                            }
                            i6 = i2;
                        } else if (i4 < 127) {
                            cArr[i4] = next;
                            i4++;
                        }
                        c = next;
                        break;
                    case 20:
                    case 21:
                    case 30:
                        if (language.isMultilineStartDelimiter(c, next)) {
                            i6 = 40;
                        } else if (next == '\n') {
                            i6 = -1;
                        }
                        c = next;
                        break;
                    case 40:
                        if (language.isMultilineEndDelimiter(c, next)) {
                            i6 = -1;
                        }
                        c = next;
                        break;
                    case 50:
                        if (!(language.isDelimiterA(next) || next == '\n') || language.isEscapeChar(c)) {
                            c = (!language.isEscapeChar(next) || !language.isEscapeChar(c)) ? next : ' ';
                        } else {
                            i6 = -1;
                            c = next;
                        }
                        break;
                    case 51:
                        if ((language.isDelimiterB(next) || next == '\n') && !language.isEscapeChar(c)) {
                            i6 = -1;
                        } else if (language.isEscapeChar(next) && language.isEscapeChar(c)) {
                            next = ' ';
                        }
                        c = next;
                        break;
                    default:
                        TextWarriorException.fail("Invalid state in TokenScanner");
                        c = next;
                        break;
                }
                i5++;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new Pair(0, 0));
            }
            this._tokens = arrayList;
        }
    }

    public Lexer(LexCallback lexCallback) {
        this._callback = (LexCallback) null;
        this._callback = lexCallback;
    }

    public static synchronized Language getLanguage() {
        return _globalLanguage;
    }

    public static boolean isKeyword(LuaTokenTypes luaTokenTypes) {
        return luaTokenTypes == LuaTokenTypes.TRUE || luaTokenTypes == LuaTokenTypes.FALSE || luaTokenTypes == LuaTokenTypes.DO || luaTokenTypes == LuaTokenTypes.FUNCTION || luaTokenTypes == LuaTokenTypes.NOT || luaTokenTypes == LuaTokenTypes.AND || luaTokenTypes == LuaTokenTypes.OR || luaTokenTypes == LuaTokenTypes.WITH || luaTokenTypes == LuaTokenTypes.IF || luaTokenTypes == LuaTokenTypes.THEN || luaTokenTypes == LuaTokenTypes.ELSEIF || luaTokenTypes == LuaTokenTypes.ELSE || luaTokenTypes == LuaTokenTypes.WHILE || luaTokenTypes == LuaTokenTypes.FOR || luaTokenTypes == LuaTokenTypes.IN || luaTokenTypes == LuaTokenTypes.RETURN || luaTokenTypes == LuaTokenTypes.BREAK || luaTokenTypes == LuaTokenTypes.CONTINUE || luaTokenTypes == LuaTokenTypes.LOCAL || luaTokenTypes == LuaTokenTypes.REPEAT || luaTokenTypes == LuaTokenTypes.UNTIL || luaTokenTypes == LuaTokenTypes.END || luaTokenTypes == LuaTokenTypes.NIL;
    }

    public static synchronized void setLanguage(Language language) {
        _globalLanguage = language;
    }

    public void cancelTokenize() {
        if (this._workerThread != null) {
            this._workerThread.abort();
            this._workerThread = (LexThread) null;
        }
    }

    public synchronized DocumentProvider getDocument() {
        return this._hDoc;
    }

    public synchronized void setDocument(DocumentProvider documentProvider) {
        this._hDoc = documentProvider;
    }

    public void tokenize(DocumentProvider documentProvider) {
        if (getLanguage().isProgLang()) {
            setDocument(new DocumentProvider(documentProvider));
            if (this._workerThread != null) {
                this._workerThread.restart();
            } else {
                this._workerThread = new LexThread(this, this);
                this._workerThread.start();
            }
        }
    }

    void tokenizeDone(List<Pair> list) {
        if (this._callback != null) {
            this._callback.lexDone(list);
        }
        this._workerThread = (LexThread) null;
    }
}
