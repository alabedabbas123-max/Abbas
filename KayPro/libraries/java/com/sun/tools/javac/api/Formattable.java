package com.sun.tools.javac.api;

import java.util.Locale;

public interface Formattable {
    String getKind();

    String toString(Locale locale, Messages messages);

    public static class LocalizedString implements Formattable {

        String f322key;

        public LocalizedString(String key) {
            this.f322key = key;
        }

        @Override
        public String toString(Locale l, Messages messages) {
            return messages.getLocalizedString(l, this.f322key, new Object[0]);
        }

        @Override
        public String getKind() {
            return "LocalizedString";
        }

        public String toString() {
            return this.f322key;
        }
    }
}
