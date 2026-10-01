package com.sun.tools.javac.util;

import com.sun.tools.javac.main.OptionName;
import java.util.LinkedHashMap;
import java.util.Set;

public class Options {
    public static final Context.C0723Key<Options> optionsKey = new Context.C0723Key<>();
    private static final long serialVersionUID = 0;
    private LinkedHashMap<String, String> values = new LinkedHashMap<>();

    public static Options instance(Context context) {
        Options instance = (Options) context.m501get(optionsKey);
        if (instance == null) {
            return new Options(context);
        }
        return instance;
    }

    protected Options(Context context) {
        context.m504put(optionsKey, this);
    }

    public String m515get(String name) {
        return this.values.get(name);
    }

    public String m514get(OptionName name) {
        return this.values.get(name.optionName);
    }

    public boolean getBoolean(String name) {
        return getBoolean(name, false);
    }

    public boolean getBoolean(String name, boolean defaultValue) {
        String value = m515get(name);
        return value == null ? defaultValue : Boolean.parseBoolean(value);
    }

    public boolean isSet(String name) {
        return this.values.get(name) != null;
    }

    public boolean isSet(OptionName name) {
        return this.values.get(name.optionName) != null;
    }

    public boolean isSet(OptionName name, String value) {
        LinkedHashMap<String, String> linkedHashMap = this.values;
        StringBuilder sb = new StringBuilder();
        sb.append(name.optionName);
        sb.append(value);
        return linkedHashMap.get(sb.toString()) != null;
    }

    public boolean isUnset(String name) {
        return this.values.get(name) == null;
    }

    public boolean isUnset(OptionName name) {
        return this.values.get(name.optionName) == null;
    }

    public boolean isUnset(OptionName name, String value) {
        LinkedHashMap<String, String> linkedHashMap = this.values;
        StringBuilder sb = new StringBuilder();
        sb.append(name.optionName);
        sb.append(value);
        return linkedHashMap.get(sb.toString()) == null;
    }

    public void m517put(String name, String value) {
        this.values.put(name, value);
    }

    public void m516put(OptionName name, String value) {
        this.values.put(name.optionName, value);
    }

    public void putAll(Options options) {
        this.values.putAll(options.values);
    }

    public void remove(String name) {
        this.values.remove(name);
    }

    public Set<String> keySet() {
        return this.values.keySet();
    }

    public int size() {
        return this.values.size();
    }

    public boolean lint(String s) {
        if (!isSet(OptionName.XLINT_CUSTOM, s)) {
            if (isSet(OptionName.XLINT) || isSet(OptionName.XLINT_CUSTOM, "all")) {
                if (isUnset(OptionName.XLINT_CUSTOM, "-" + s)) {
                }
            }
            return false;
        }
        return true;
    }
}
