package com.a.b.f.a;

enum Enumk {
    LIVE_IN_AT_STATEMENT,
    LIVE_OUT_AT_STATEMENT,
    LIVE_OUT_AT_BLOCK,
    DONE;

    public static Enumk[] valuesCustom() {
        Enumk[] enumC1250kArrValuesCustom = values();
        int length = enumC1250kArrValuesCustom.length;
        Enumk[] enumC1250kArr = new Enumk[length];
        System.arraycopy(enumC1250kArrValuesCustom, 0, enumC1250kArr, 0, length);
        return enumC1250kArr;
    }
}
