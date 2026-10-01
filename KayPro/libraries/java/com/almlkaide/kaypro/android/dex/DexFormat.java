package com.almlkaide.kaypro.android.dex;

public final class DexFormat {
    public static final int API_CONST_METHOD_HANDLE = 28;
    public static final int API_CURRENT = 28;
    public static final int API_DEFINE_INTERFACE_METHODS = 24;
    public static final int API_INVOKE_INTERFACE_METHODS = 24;
    public static final int API_INVOKE_STATIC_INTERFACE_METHODS = 21;
    public static final int API_METHOD_HANDLES = 26;
    public static final int API_NO_EXTENDED_OPCODES = 13;
    public static final String DEX_IN_JAR_NAME = "classes.dex";
    public static final int ENDIAN_TAG = 305419896;
    public static final String MAGIC_PREFIX = "dex\n";
    public static final String MAGIC_SUFFIX = "\u0000";
    public static final int MAX_MEMBER_IDX = 65535;
    public static final int MAX_TYPE_IDX = 65535;
    public static final String VERSION_CURRENT = "039";
    public static final String VERSION_FOR_API_13 = "035";
    public static final String VERSION_FOR_API_24 = "037";
    public static final String VERSION_FOR_API_26 = "038";
    public static final String VERSION_FOR_API_28 = "039";

    DexFormat() {
    }

    public static int magicToApi(byte[] bArr) {
        if (bArr.length != 8 || bArr[0] != 100 || bArr[1] != 101 || bArr[2] != 120 || bArr[3] != 10 || bArr[7] != 0) {
            return -1;
        }
        String string = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("").append((char) bArr[4]).toString()).append((char) bArr[5]).toString()).append((char) bArr[6]).toString();
        if (string.equals(VERSION_FOR_API_13)) {
            return 13;
        }
        if (string.equals(VERSION_FOR_API_24)) {
            return 24;
        }
        if (string.equals(VERSION_FOR_API_26)) {
            return 26;
        }
        return (string.equals("039") || string.equals("039")) ? 28 : -1;
    }

    public static String apiToMagic(int i) {
        String str;
        if (i >= 28 || i >= 28) {
            str = "039";
        } else if (i >= 26) {
            str = VERSION_FOR_API_26;
        } else if (i >= 24) {
            str = VERSION_FOR_API_24;
        } else {
            str = VERSION_FOR_API_13;
        }
        return new StringBuffer().append(new StringBuffer().append(MAGIC_PREFIX).append(str).toString()).append(MAGIC_SUFFIX).toString();
    }

    public static boolean isSupportedDexMagic(byte[] bArr) {
        return magicToApi(bArr) > 0;
    }
}
