package com.a.b.e.a;

import com.a.b.g.Interfacew;

public enum Enumb implements Interfacew {
    RUNTIME("runtime"),
    BUILD("build"),
    SYSTEM("system"),
    EMBEDDED("embedded");


    private final String f2825e;

    Enumb(String str) {
        this.f2825e = str;
    }

    public static Enumb[] valuesCustom() {
        Enumb[] enumC1162bArrValuesCustom = values();
        int length = enumC1162bArrValuesCustom.length;
        Enumb[] enumC1162bArr = new Enumb[length];
        System.arraycopy(enumC1162bArrValuesCustom, 0, enumC1162bArr, 0, length);
        return enumC1162bArr;
    }

    @Override
    public String mo3828d() {
        return this.f2825e;
    }
}
