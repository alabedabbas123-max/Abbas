package com.sun.tools.javac.main;

import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Options;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public interface JavacOption {

    public enum ChoiceKind {
        ONEOF,
        ANYOF
    }

    public enum OptionKind {
        NORMAL,
        EXTENDED,
        HIDDEN
    }

    OptionKind getKind();

    OptionName getName();

    boolean hasArg();

    boolean matches(String str);

    boolean process(Options options, String str);

    boolean process(Options options, String str, String str2);

    public static class Option implements JavacOption {
        String argsNameKey;
        ChoiceKind choiceKind;
        Map<String, Boolean> choices;
        String descrKey;
        boolean hasSuffix;
        OptionName name;

        Option(OptionName name, String argsNameKey, String descrKey) {
            this.name = name;
            this.argsNameKey = argsNameKey;
            this.descrKey = descrKey;
            boolean z = true;
            char lastChar = name.optionName.charAt(name.optionName.length() - 1);
            if (lastChar != ':' && lastChar != '=') {
                z = false;
            }
            this.hasSuffix = z;
        }

        Option(OptionName name, String descrKey) {
            this(name, null, descrKey);
        }

        Option(OptionName name, String descrKey, ChoiceKind choiceKind, String... choices) {
            this(name, descrKey, choiceKind, createChoices(choices));
        }

        private static Map<String, Boolean> createChoices(String... choices) {
            Map<String, Boolean> map = new LinkedHashMap<>();
            for (String c : choices) {
                map.put(c, false);
            }
            return map;
        }

        Option(OptionName name, String descrKey, ChoiceKind choiceKind, Map<String, Boolean> choices) {
            this(name, null, descrKey);
            if (choiceKind == null || choices == null) {
                throw null;
            }
            this.choiceKind = choiceKind;
            this.choices = choices;
        }

        public String toString() {
            return this.name.optionName;
        }

        @Override
        public boolean hasArg() {
            return (this.argsNameKey == null || this.hasSuffix) ? false : true;
        }

        @Override
        public boolean matches(String option) {
            if (!this.hasSuffix) {
                return option.equals(this.name.optionName);
            }
            if (!option.startsWith(this.name.optionName)) {
                return false;
            }
            if (this.choices != null) {
                String arg = option.substring(this.name.optionName.length());
                if (this.choiceKind == ChoiceKind.ONEOF) {
                    return this.choices.keySet().contains(arg);
                }
                for (String a : arg.split(",+")) {
                    if (!this.choices.keySet().contains(a)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }

        void help(PrintWriter out) {
            String s = "  " + helpSynopsis();
            out.print(s);
            for (int j = Math.min(s.length(), 28); j < 29; j++) {
                out.print(" ");
            }
            Log.printLines(out, Main.getLocalizedString(this.descrKey, new Object[0]));
        }

        String helpSynopsis() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.name);
            if (this.argsNameKey == null) {
                Map<String, Boolean> map = this.choices;
                if (map != null) {
                    String sep = "{";
                    for (Map.Entry<String, Boolean> e : map.entrySet()) {
                        if (!e.getValue().booleanValue()) {
                            sb.append(sep);
                            sb.append(e.getKey());
                            sep = ",";
                        }
                    }
                    sb.append("}");
                }
            } else {
                if (!this.hasSuffix) {
                    sb.append(" ");
                }
                sb.append(Main.getLocalizedString(this.argsNameKey, new Object[0]));
            }
            return sb.toString();
        }

        void xhelp(PrintWriter out) {
        }

        @Override
        public boolean process(Options options, String option, String arg) {
            if (options != null) {
                if (this.choices != null) {
                    if (this.choiceKind == ChoiceKind.ONEOF) {
                        for (String s : this.choices.keySet()) {
                            options.remove(option + s);
                        }
                        String opt = option + arg;
                        options.m517put(opt, opt);
                        String nm = option.substring(0, option.length() - 1);
                        options.m517put(nm, arg);
                    } else {
                        for (String a : arg.split(",+")) {
                            String opt2 = option + a;
                            options.m517put(opt2, opt2);
                        }
                    }
                }
                options.m517put(option, arg);
            }
            return false;
        }

        @Override
        public boolean process(Options options, String option) {
            if (this.hasSuffix) {
                return process(options, this.name.optionName, option.substring(this.name.optionName.length()));
            }
            return process(options, option, option);
        }

        @Override
        public OptionKind getKind() {
            return OptionKind.NORMAL;
        }

        @Override
        public OptionName getName() {
            return this.name;
        }
    }

    public static class XOption extends Option {
        XOption(OptionName name, String argsNameKey, String descrKey) {
            super(name, argsNameKey, descrKey);
        }

        XOption(OptionName name, String descrKey) {
            this(name, null, descrKey);
        }

        XOption(OptionName name, String descrKey, ChoiceKind kind, String... choices) {
            super(name, descrKey, kind, choices);
        }

        XOption(OptionName name, String descrKey, ChoiceKind kind, Map<String, Boolean> choices) {
            super(name, descrKey, kind, choices);
        }

        @Override
        void help(PrintWriter out) {
        }

        @Override
        void xhelp(PrintWriter out) {
            super.help(out);
        }

        @Override
        public OptionKind getKind() {
            return OptionKind.EXTENDED;
        }
    }

    public static class HiddenOption extends Option {
        HiddenOption(OptionName name) {
            super(name, null, null);
        }

        HiddenOption(OptionName name, String argsNameKey) {
            super(name, argsNameKey, null);
        }

        @Override
        void help(PrintWriter out) {
        }

        @Override
        void xhelp(PrintWriter out) {
        }

        @Override
        public OptionKind getKind() {
            return OptionKind.HIDDEN;
        }
    }
}
