package com.almlkaide.kaypro.manifesteditor.colorpicker.widgets;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;

public class ClassD extends NumberKeyListener implements TextWatcher {

    private final ClassB f3620a;

    private final String f3621b = "0123456789abcdefABCDEF#";

    public ClassD(ClassB c1348b) {
        this.f3620a = c1348b;
    }

    @Override
    public void afterTextChanged(Editable editable) {
        String lowerCase = editable.toString().toLowerCase();
        int length = lowerCase.length();
        if (!lowerCase.startsWith("#")) {
            editable.insert(0, "#");
        } else if (length == 7 || length == 9) {
            this.f3620a.m5747a(lowerCase);
        }
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    protected char[] getAcceptedChars() {
        return "0123456789abcdefABCDEF#".toCharArray();
    }

    @Override
    public int getInputType() {
        return 2;
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
