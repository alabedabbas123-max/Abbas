package com.myopicmobile.textwarrior.common;

public class LanguageNonProg extends Language {
    private static Language _theOne = (Language) null;
    private static final String[] keywords = new String[0];
    private static final char[] operators = new char[0];

    LanguageNonProg() {
        super.setKeywords(keywords);
        super.setOperators(operators);
    }

    public static Language getInstance() {
        if (_theOne == null) {
            _theOne = new LanguageNonProg();
        }
        return _theOne;
    }

    @Override
    public boolean isDelimiterA(char c) {
        return false;
    }

    @Override
    public boolean isDelimiterB(char c) {
        return false;
    }

    @Override
    public boolean isEscapeChar(char c) {
        return false;
    }

    @Override
    public boolean isLineAStart(char c) {
        return false;
    }

    @Override
    public boolean isLineStart(char c, char c2) {
        return false;
    }

    @Override
    public boolean isMultilineEndDelimiter(char c, char c2) {
        return false;
    }

    @Override
    public boolean isMultilineStartDelimiter(char c, char c2) {
        return false;
    }

    @Override
    public boolean isProgLang() {
        return false;
    }
}
