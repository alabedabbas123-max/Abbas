package com.myopicmobile.textwarrior.common;

public class LanguageC extends Language {
    private static Language _theOne = (Language) null;
    private static final String[] keywords = {"char", "double", "float", "int", "long", "short", "void", "auto", "const", "extern", "register", "static", "volatile", "signed", "unsigned", "sizeof", "typedef", "enum", "struct", "union", "break", "case", "continue", "default", "do", "else", "for", "goto", "if", "return", "switch", "while"};

    LanguageC() {
        super.setKeywords(keywords);
    }

    public static Language getInstance() {
        if (_theOne == null) {
            _theOne = new LanguageC();
        }
        return _theOne;
    }
}
