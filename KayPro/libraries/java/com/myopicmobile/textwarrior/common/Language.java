package com.myopicmobile.textwarrior.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.commons.io.FilenameUtils;
import org.objectweb.asm.signature.SignatureVisitor;

public abstract class Language {
    public static final char BACKSPACE = '\b';
    private static final char[] BASIC_C_OPERATORS = {'(', ')', '{', '}', FilenameUtils.EXTENSION_SEPARATOR, ',', ';', SignatureVisitor.INSTANCEOF, SignatureVisitor.EXTENDS, SignatureVisitor.SUPER, '/', '*', '&', '!', '|', ':', '[', ']', '<', '>', '?', '~', '%', '^'};

    public static final char f4831EOF = 65535;
    public static final String GLYPH_NEWLINE = "↵";
    public static final String GLYPH_SPACE = "·";
    public static final String GLYPH_TAB = "»";
    public static final char NEWLINE = '\n';
    public static final char NULL_CHAR = 0;

    public static final char f4832TAB = '\t';
    private String[] _keyword;
    private String[] _name;
    protected HashMap<String, Integer> _keywords = new HashMap<>(0);
    protected HashMap<String, Integer> _names = new HashMap<>(0);
    protected HashMap<String, String[]> _bases = new HashMap<>(0);
    protected HashMap<String, Integer> _users = new HashMap<>(0);
    protected HashMap<Character, Integer> _operators = generateOperators(BASIC_C_OPERATORS);
    private ArrayList<String> _ueserCache = new ArrayList<>();
    private String[] _userWords = new String[0];

    private boolean contains(ArrayList<String> arrayList, String str) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean contains(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private HashMap<Character, Integer> generateOperators(char[] cArr) {
        HashMap<Character, Integer> map = new HashMap<>(cArr.length);
        for (char c : cArr) {
            map.put(new Character(c), new Integer(2));
        }
        return map;
    }

    public void addBasePackage(String str, String[] strArr) {
        this._bases.put(str, strArr);
    }

    public void addUserWord(String str) {
        if (!this._ueserCache.contains(str) && !this._names.containsKey(str)) {
            this._ueserCache.add(str);
        }
        this._users.put(str, new Integer(3));
    }

    public void clearUserWord() {
        this._ueserCache.clear();
        this._users.clear();
    }

    public String[] getBasePackage(String str) {
        return this._bases.get(str);
    }

    public String[] getKeywords() {
        return this._keyword;
    }

    public String[] getNames() {
        return this._name;
    }

    public String[] getUserWord() {
        return this._userWords;
    }

    public final boolean isBasePackage(String str) {
        return this._bases.containsKey(str);
    }

    public final boolean isBaseWord(String str, String str2) {
        for (String str3 : this._bases.get(str)) {
            if (str3.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDelimiterA(char c) {
        return c == '\"';
    }

    public boolean isDelimiterB(char c) {
        return c == '\'';
    }

    public boolean isEscapeChar(char c) {
        return c == '\\';
    }

    public final boolean isKeyword(String str) {
        return this._keywords.containsKey(str);
    }

    public boolean isLineAStart(char c) {
        return c == '#';
    }

    public boolean isLineBStart(char c) {
        return false;
    }

    public boolean isLineStart(char c, char c2) {
        return c == '/' && c2 == '/';
    }

    public boolean isMultilineEndDelimiter(char c, char c2) {
        return c == '*' && c2 == '/';
    }

    public boolean isMultilineStartDelimiter(char c, char c2) {
        return c == '/' && c2 == '*';
    }

    public final boolean isName(String str) {
        return this._names.containsKey(str);
    }

    public final boolean isOperator(char c) {
        return this._operators.containsKey(Character.valueOf(c));
    }

    public boolean isProgLang() {
        return true;
    }

    public boolean isSentenceTerminator(char c) {
        return c == '.';
    }

    public final boolean isUserWord(String str) {
        return this._users.containsKey(str);
    }

    public boolean isWhitespace(char c) {
        return c == ' ' || c == '\n' || c == '\t' || c == '\r' || c == '\f' || c == 65535;
    }

    public boolean isWordStart(char c) {
        return false;
    }

    public void setKeywords(String[] strArr) {
        this._keyword = strArr;
        this._keywords = new HashMap<>(strArr.length);
        for (String str : strArr) {
            this._keywords.put(str, new Integer(1));
        }
    }

    public void setNames(String[] strArr) {
        this._name = strArr;
        ArrayList arrayList = new ArrayList();
        this._names = new HashMap<>(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            if (!arrayList.contains(strArr[i])) {
                arrayList.add(strArr[i]);
            }
            this._names.put(strArr[i], new Integer(3));
        }
        this._name = new String[arrayList.size()];
        arrayList.toArray(this._name);
    }

    protected void setOperators(char[] cArr) {
        this._operators = generateOperators(cArr);
    }

    public void updateUserWord() {
        this._userWords = (String[]) this._ueserCache.toArray(new String[this._ueserCache.size()]);
    }
}
