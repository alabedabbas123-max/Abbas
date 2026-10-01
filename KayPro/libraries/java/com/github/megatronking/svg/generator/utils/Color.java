package com.github.megatronking.svg.generator.utils;

import java.lang.reflect.Field;
import java.util.HashMap;

public class Color {
    public static final int BLACK = -16777216;
    public static final int BLUE = -16776961;
    public static final int CYAN = -16711681;
    private static final int DEFAULT_COLOR = 0;
    public static final int DKGRAY = -12303292;
    public static final int GRAY = -7829368;
    public static final int GREEN = -16711936;
    public static final int LTGRAY = -3355444;
    public static final int MAGENTA = -65281;
    private static final String PREFIX = "#";

    public static final int f4807RED = -65536;
    private static final String REFERENCE_APP = "@color/";
    private static final String REFERENCE_RGB = "rgb";
    private static final String REFERENCE_SYSTEM = "@android:color/";
    public static final int SHADOW = -870178270;
    public static final int TRANSPARENT = 0;
    public static final int WHITE = -1;
    public static final int YELLOW = -256;
    public static HashMap<String, Integer> appColorMaps = new HashMap<>();
    public static HashMap<String, Integer> systemColorMaps = new HashMap<>();
    public static HashMap<String, Integer> keywordColorMaps = new HashMap<>();

    static {
        int i = 0;
        systemColorMaps.put("white", new Integer(-1));
        systemColorMaps.put("black", new Integer(-16777216));
        systemColorMaps.put("dkgray", new Integer(DKGRAY));
        systemColorMaps.put("gray", new Integer(GRAY));
        systemColorMaps.put("ltgray", new Integer(LTGRAY));
        systemColorMaps.put("red", new Integer(-65536));
        systemColorMaps.put("green", new Integer(-16711936));
        systemColorMaps.put("blue", new Integer(-16776961));
        systemColorMaps.put("yellow", new Integer(-256));
        systemColorMaps.put("cyan", new Integer(-16711681));
        systemColorMaps.put("magenta", new Integer(-65281));
        systemColorMaps.put("transparent", new Integer(0));
        systemColorMaps.put("shadow", new Integer(SHADOW));
        systemColorMaps.put("none", new Integer(0));
        try {
            try {
                Field[] declaredFields = Class.forName("com.github.megatronking.svg.generator.utils.KeywordColors").getDeclaredFields();
                while (true) {
                    int i2 = i;
                    if (i2 >= declaredFields.length) {
                        return;
                    }
                    Field field = declaredFields[i2];
                    field.setAccessible(true);
                    keywordColorMaps.put(field.getName(), (Integer) field.get((Object) null));
                    i = i2 + 1;
                }
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        } catch (Exception e2) {
        }
    }

    private static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static int convert(String str) {
        return convert(str, 0);
    }

    public static int convert(String str, int i) {
        if (str == null) {
            return i;
        }
        if (str.startsWith(PREFIX)) {
            return parseColor(str, i);
        }
        if (str.startsWith("@android:color/")) {
            return referenceSystem(str);
        }
        if (str.startsWith("@color/")) {
            return referenceApp(str);
        }
        if (str.startsWith(REFERENCE_RGB)) {
            return convertRGBToInteger(str);
        }
        return keywordColorMaps.containsKey(str) ? keywordColorMaps.get(str).intValue() : i;
    }

    private static int convertRGBToInteger(String str) {
        String[] strArrSplit = str.substring(4, str.trim().length() - 1).split(",");
        if (strArrSplit.length != 3) {
            return -16777216;
        }
        int[] iArr = new int[3];
        for (int i = 0; i < 3; i++) {
            String strTrim = strArrSplit[i].trim();
            if (strTrim.endsWith("%")) {
                iArr[i] = clamp((int) ((Float.parseFloat(strTrim.substring(0, strTrim.length() - 1)) * 255.0f) / 100.0f), 0, 255);
            } else {
                iArr[i] = clamp(Integer.parseInt(strTrim), 0, 255);
            }
        }
        StringBuilder sb = new StringBuilder("FF");
        for (int i2 = 0; i2 < 3; i2++) {
            sb.append(String.format("%02X", new Integer(iArr[i2])));
        }
        return parseUnsignedInt(sb.toString(), 16);
    }

    private static int parseColor(String str, int i) {
        long j = Long.parseLong(str.substring(1), 16);
        if (str.length() == 7) {
            j |= (long) (-16777216);
        } else if (str.length() == 4) {
            String string = "0xff";
            for (int i2 = 0; i2 < str.length() - 1; i2++) {
                string = new StringBuffer().append(new StringBuffer().append(string).append(str.charAt(i2)).toString()).append(str.charAt(i2)).toString();
            }
            j = Long.parseLong(string, 16);
        } else if (str.length() != 9) {
            return i;
        }
        return (int) j;
    }

    public static int parseUnsignedInt(String str, int i) {
        if (str == null) {
            throw new NumberFormatException("null");
        }
        int length = str.length();
        if (length <= 0) {
            throw new NumberFormatException();
        }
        if (str.charAt(0) == '-') {
            throw new NumberFormatException(String.format(new StringBuffer().append("Illegal leading minus sign ").append("on unsigned string %s.").toString(), str));
        }
        if (length <= 5 || (i == 10 && length <= 9)) {
            return Integer.parseInt(str, i);
        }
        long j = Long.parseLong(str, i);
        if (((-4294967296L) & j) == 0) {
            return (int) j;
        }
        throw new NumberFormatException(String.format(new StringBuffer().append("String value %s exceeds ").append("range of unsigned int.").toString(), str));
    }

    private static int referenceApp(String str) {
        String strSubstring = str.substring(REFERENCE_APP.length());
        if (appColorMaps.containsKey(strSubstring)) {
            return appColorMaps.get(strSubstring).intValue();
        }
        return 0;
    }

    private static int referenceSystem(String str) {
        String strSubstring = str.substring(REFERENCE_SYSTEM.length());
        if (systemColorMaps.containsKey(strSubstring)) {
            return systemColorMaps.get(strSubstring).intValue();
        }
        return 0;
    }
}
