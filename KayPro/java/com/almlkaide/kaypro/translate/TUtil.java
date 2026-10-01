package com.almlkaide.kaypro.translate;

public class TUtil {
    public static String wordSegmentation(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            if (c == '(') {
                z = true;
            } else if (z && c == ')') {
                z = false;
            }
            if (i > 0 && Character.isLowerCase(charArray[i - 1]) && Character.isLetter(c) && Character.isUpperCase(c)) {
                stringBuffer.append(' ');
            }
            if (!Character.isLetter(c) && c != ' ') {
                if (i > 0) {
                    char c2 = charArray[i - 1];
                    if (c2 != '.' && c != '.' && c2 != ' ') {
                        if (!Character.isDigit(c2)) {
                            if (c2 != ',') {
                                stringBuffer.append(' ');
                            }
                        } else if (!Character.isLetter(c) && !Character.isDigit(c)) {
                            stringBuffer.append(' ');
                        }
                    }
                    if (c == '.' && (i + 1 >= length || !Character.isDigit(charArray[i + 1]))) {
                        stringBuffer.append(' ');
                    }
                }
                stringBuffer.append(c);
                if (z && c == ',' && i > 0 && i + 1 < length && charArray[i - 1] != ' ' && charArray[i + 1] != ' ') {
                    stringBuffer.append(' ');
                } else if (i + 1 < length && Character.isLetter(charArray[i + 1])) {
                    stringBuffer.append(' ');
                }
            } else {
                stringBuffer.append(c);
                if (z && c == ' ' && i > 0 && i + 1 < length) {
                    char c3 = charArray[i - 1];
                    char c4 = charArray[i + 1];
                    if (c3 == '>' || c3 == ']' || (Character.isLetter(c3) && Character.isLetter(c4))) {
                        stringBuffer.append(':');
                        stringBuffer.append(' ');
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
