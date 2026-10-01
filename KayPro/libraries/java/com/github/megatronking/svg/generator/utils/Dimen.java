package com.github.megatronking.svg.generator.utils;

public class Dimen {
    private static final float DEFAULT_VALUE = 0.0f;
    private static final String UNIT1 = "dp";
    private static final String UNIT2 = "dip";
    private static final String UNIT3 = "px";

    public static float convert(String str) {
        if (str != null) {
            float f = SCU.parseFloat(str, -1.0f);
            if (f != -1.0f) {
                return f;
            }
            if (str.endsWith(UNIT1)) {
                return SCU.parseFloat(str.substring(0, str.indexOf(UNIT1)), 0.0f);
            }
            if (str.endsWith(UNIT2)) {
                return SCU.parseFloat(str.substring(0, str.indexOf(UNIT2)), 0.0f);
            }
            if (str.endsWith(UNIT3)) {
                return SCU.parseFloat(str.substring(0, str.indexOf(UNIT3)), 0.0f);
            }
        }
        return 0.0f;
    }

    public static boolean isDip(String str) {
        return str != null && (str.endsWith(UNIT1) || str.endsWith(UNIT2));
    }

    public static boolean isPx(String str) {
        return str != null && str.endsWith(UNIT3);
    }
}
