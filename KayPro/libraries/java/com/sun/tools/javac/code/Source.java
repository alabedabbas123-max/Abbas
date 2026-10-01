package com.sun.tools.javac.code;

import com.sun.tools.javac.main.OptionName;
import com.sun.tools.javac.jvm.Target;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Options;
import java.util.HashMap;
import java.util.Map;
import javax.lang.model.SourceVersion;

public enum Source {
    JDK1_2("1.2"),
    JDK1_3("1.3"),
    JDK1_4("1.4"),
    JDK1_5("1.5"),
    JDK1_6("1.6"),
    JDK1_7("1.7");

    public static final Source DEFAULT;
    private static final Context.C0723Key<Source> sourceKey = new Context.C0723Key<>();

    private static Map<String, Source> f339tab = new HashMap();
    public final String name;

    static {
        for (Source s : values()) {
            f339tab.put(s.name, s);
        }
        f339tab.put("5", JDK1_5);
        f339tab.put("6", JDK1_6);
        f339tab.put("7", JDK1_7);
        DEFAULT = JDK1_7;
    }

    public static Source instance(Context context) {
        Source instance = (Source) context.m501get(sourceKey);
        if (instance == null) {
            Options options = Options.instance(context);
            String sourceString = options.m514get(OptionName.SOURCE);
            if (sourceString != null) {
                instance = lookup(sourceString);
            }
            if (instance == null) {
                instance = DEFAULT;
            }
            context.m504put(sourceKey, instance);
        }
        return instance;
    }

    Source(String name) {
        this.name = name;
    }

    public static Source lookup(String name) {
        return f339tab.get(name);
    }

    public Target requiredTarget() {
        if (compareTo(JDK1_7) >= 0) {
            return Target.JDK1_7;
        }
        if (compareTo(JDK1_6) >= 0) {
            return Target.JDK1_6;
        }
        if (compareTo(JDK1_5) >= 0) {
            return Target.JDK1_5;
        }
        return compareTo(JDK1_4) >= 0 ? Target.JDK1_4 : Target.JDK1_1;
    }

    public boolean allowEncodingErrors() {
        return compareTo(JDK1_6) < 0;
    }

    public boolean allowAsserts() {
        return compareTo(JDK1_4) >= 0;
    }

    public boolean allowCovariantReturns() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean allowGenerics() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean allowDiamond() {
        return compareTo(JDK1_7) >= 0;
    }

    public boolean allowMulticatch() {
        return compareTo(JDK1_7) >= 0;
    }

    public boolean allowImprovedRethrowAnalysis() {
        return compareTo(JDK1_7) >= 0;
    }

    public boolean allowImprovedCatchAnalysis() {
        return compareTo(JDK1_7) >= 0;
    }

    public boolean allowEnums() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean allowForeach() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean allowStaticImport() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean allowBoxing() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean allowVarargs() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean allowAnnotations() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean allowHexFloats() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean allowAnonOuterThis() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean addBridges() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean enforceMandatoryWarnings() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean allowTryWithResources() {
        return compareTo(JDK1_7) >= 0;
    }

    public boolean allowTypeAnnotations() {
        return compareTo(JDK1_7) >= 0;
    }

    public boolean allowBinaryLiterals() {
        return compareTo(JDK1_7) >= 0;
    }

    public boolean allowUnderscoresInLiterals() {
        return compareTo(JDK1_7) >= 0;
    }

    public boolean allowStringsInSwitch() {
        return compareTo(JDK1_7) >= 0;
    }

    public boolean allowSimplifiedVarargs() {
        return compareTo(JDK1_7) >= 0;
    }

    public boolean allowObjectToPrimitiveCast() {
        return compareTo(JDK1_7) >= 0;
    }

    static class C05761 {
        static final int[] $SwitchMap$com$sun$tools$javac$code$Source;

        static {
            int[] iArr = new int[Source.values().length];
            $SwitchMap$com$sun$tools$javac$code$Source = iArr;
            try {
                iArr[Source.JDK1_2.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$Source[Source.JDK1_3.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$Source[Source.JDK1_4.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$Source[Source.JDK1_5.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$Source[Source.JDK1_6.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$Source[Source.JDK1_7.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    public static SourceVersion toSourceVersion(Source source) {
        switch (C05761.$SwitchMap$com$sun$tools$javac$code$Source[source.ordinal()]) {
            case 1:
                return SourceVersion.RELEASE_2;
            case 2:
                return SourceVersion.RELEASE_3;
            case 3:
                return SourceVersion.RELEASE_4;
            case 4:
                return SourceVersion.RELEASE_5;
            case 5:
                return SourceVersion.RELEASE_6;
            case 6:
                return SourceVersion.RELEASE_7;
            default:
                return null;
        }
    }
}
