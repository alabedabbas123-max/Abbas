package com.sun.tools.javac.jvm;

import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.main.OptionName;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Options;
import java.util.HashMap;
import java.util.Map;

public enum Target {
    JDK1_1("1.1", 45, 3),
    JDK1_2("1.2", 46, 0),
    JDK1_3("1.3", 47, 0),
    JDK1_4("1.4", 48, 0),
    JSR14("jsr14", 48, 0),
    JDK1_4_1("1.4.1", 48, 0),
    JDK1_4_2("1.4.2", 48, 0),
    JDK1_5("1.5", 49, 0),
    JDK1_6("1.6", 50, 0),
    JDK1_7("1.7", 51, 0);

    public static final Target DEFAULT;

    private static Target f450MAX;

    private static Target f451MIN;
    public final int majorVersion;
    public final int minorVersion;
    public final String name;
    private static final Context.C0723Key<Target> targetKey = new Context.C0723Key<>();

    private static Map<String, Target> f452tab = new HashMap();

    static {
        for (Target t : values()) {
            if (f451MIN == null) {
                f451MIN = t;
            }
            f450MAX = t;
            f452tab.put(t.name, t);
        }
        f452tab.put("5", JDK1_5);
        f452tab.put("6", JDK1_6);
        f452tab.put("7", JDK1_7);
        DEFAULT = JDK1_7;
    }

    public static Target instance(Context context) {
        Target instance = (Target) context.m501get(targetKey);
        if (instance == null) {
            Options options = Options.instance(context);
            String targetString = options.m514get(OptionName.TARGET);
            if (targetString != null) {
                instance = lookup(targetString);
            }
            if (instance == null) {
                instance = DEFAULT;
            }
            context.m504put(targetKey, instance);
        }
        return instance;
    }

    public static Target m480MIN() {
        return f451MIN;
    }

    public static Target m479MAX() {
        return f450MAX;
    }

    Target(String name, int majorVersion, int minorVersion) {
        this.name = name;
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
    }

    public static Target lookup(String name) {
        return f452tab.get(name);
    }

    public boolean requiresIproxy() {
        return compareTo(JDK1_1) <= 0;
    }

    public boolean initializeFieldsBeforeSuper() {
        return compareTo(JDK1_4) >= 0;
    }

    public boolean obeyBinaryCompatibility() {
        return compareTo(JDK1_2) >= 0;
    }

    public boolean arrayBinaryCompatibility() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean interfaceFieldsBinaryCompatibility() {
        return compareTo(JDK1_2) > 0;
    }

    public boolean interfaceObjectOverridesBinaryCompatibility() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean usePrivateSyntheticFields() {
        return compareTo(JDK1_4_2) < 0;
    }

    public boolean useInnerCacheClass() {
        return compareTo(JDK1_4_2) >= 0;
    }

    public boolean generateCLDCStackmap() {
        return false;
    }

    public boolean generateStackMapTable() {
        return compareTo(JDK1_6) >= 0;
    }

    public boolean isPackageInfoSynthetic() {
        return compareTo(JDK1_6) >= 0;
    }

    public boolean generateEmptyAfterBig() {
        return false;
    }

    public boolean useStringBuilder() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean useSyntheticFlag() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean useEnumFlag() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean useAnnotationFlag() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean useVarargsFlag() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean useBridgeFlag() {
        return compareTo(JDK1_5) >= 0;
    }

    public char syntheticNameChar() {
        return '$';
    }

    public boolean hasClassLiterals() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean hasInvokedynamic() {
        return compareTo(JDK1_7) >= 0;
    }

    public boolean hasMethodHandles() {
        return hasInvokedynamic();
    }

    public boolean classLiteralsNoInit() {
        return compareTo(JDK1_4_2) >= 0;
    }

    public boolean hasInitCause() {
        return compareTo(JDK1_4) >= 0;
    }

    public boolean boxWithConstructors() {
        return compareTo(JDK1_5) < 0;
    }

    public boolean hasIterable() {
        return compareTo(JDK1_5) >= 0;
    }

    public boolean compilerBootstrap(Symbol c) {
        return this == JSR14 && (c.flags() & 16384) != 0 && c.flatName().toString().startsWith("com.sun.tools.");
    }

    public boolean hasEnclosingMethodAttribute() {
        return compareTo(JDK1_5) >= 0 || this == JSR14;
    }
}
