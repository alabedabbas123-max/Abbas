package com.sun.tools.javac.api;

import java.util.Locale;
import java.util.MissingResourceException;

public interface Messages {
    void mo448add(String str) throws MissingResourceException;

    String getLocalizedString(Locale locale, String str, Object... objArr);
}
