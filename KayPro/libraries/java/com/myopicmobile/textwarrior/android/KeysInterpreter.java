package com.myopicmobile.textwarrior.android;

import android.view.KeyEvent;

public class KeysInterpreter {
    private static boolean isBackspace(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 67;
    }

    public static boolean isNavigationKey(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 20 || keyCode == 19 || keyCode == 22 || keyCode == 21;
    }

    private static boolean isNewline(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 66;
    }

    private static boolean isSpace(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 62;
    }

    public static boolean isSwitchPanel(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed() && keyEvent.getKeyCode() == 66;
    }

    private static boolean isTab(KeyEvent keyEvent) {
        return (keyEvent.isShiftPressed() && keyEvent.getKeyCode() == 62) || keyEvent.getKeyCode() == 61;
    }

    public static char keyEventToPrintableChar(KeyEvent keyEvent) {
        if (isNewline(keyEvent)) {
            return '\n';
        }
        if (isBackspace(keyEvent)) {
            return '\b';
        }
        if (isTab(keyEvent)) {
            return '\t';
        }
        if (isSpace(keyEvent)) {
            return ' ';
        }
        if (keyEvent.isPrintingKey()) {
            return (char) keyEvent.getUnicodeChar(keyEvent.getMetaState());
        }
        return (char) 0;
    }
}
