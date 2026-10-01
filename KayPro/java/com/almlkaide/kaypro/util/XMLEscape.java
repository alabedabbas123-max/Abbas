package com.almlkaide.kaypro.util;

public class XMLEscape extends EscapeUtils {
    String[][] escapes = {new String[]{"&", "&amp;"}, new String[]{"<", "&lt;"}, new String[]{">", "&gt;"}, new String[]{"\"", "&quot;"}, new String[]{"'", "&apos;"}};

    @Override
    public String escapeText(String str) {
        for (int i = 0; i < this.escapes.length; i++) {
            str = str.replace(this.escapes[i][0], this.escapes[i][1]);
        }
        return str;
    }

    @Override
    public String unEscapeText(String str) {
        for (int i = 0; i < this.escapes.length; i++) {
            str = str.replace(this.escapes[i][1], this.escapes[i][0]);
        }
        return str;
    }
}
