package com.myopicmobile.textwarrior.android;

public interface TextChangeListener {
    void onAdd(CharSequence charSequence, int i, int i2);

    void onDel(CharSequence charSequence, int i, int i2);

    void onNewLine(String str, int i, int i2);
}
