package com.almlkaide.kaypro.util;

public class KeyText implements CharSequence {

    private String f5094key;
    private final CharSequence source;

    public KeyText(String str, CharSequence charSequence) {
        this.source = charSequence;
        this.f5094key = str;
    }

    public void setKey(String str) {
        this.f5094key = str;
    }

    public String getKey() {
        return this.f5094key;
    }

    @Override
    public int length() {
        return this.source.length();
    }

    @Override
    public char charAt(int i) {
        return this.source.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i2) {
        return this.source.subSequence(i, i2);
    }

    @Override
    public String toString() {
        return this.source.toString();
    }
}
