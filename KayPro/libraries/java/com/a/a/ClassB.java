package com.a.a;

import com.almlkaide.kaypro.android.dex.DexFormat;

public final class ClassB {
    public static String m3758a(int i) {
        String str;
        if (i >= 28 || i >= 28) {
            str = "039";
        } else if (i >= 26) {
            str = DexFormat.VERSION_FOR_API_26;
        } else {
            str = i >= 24 ? DexFormat.VERSION_FOR_API_24 : DexFormat.VERSION_FOR_API_13;
        }
        return DexFormat.MAGIC_PREFIX + str + DexFormat.MAGIC_SUFFIX;
    }
}
