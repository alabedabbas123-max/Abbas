package com.a.b.f;

public enum Enumq {
    TOP,
    NONE,
    METHOD,
    INTER,
    GLOBAL;

    public static Enumq[] valuesCustom() {
        Enumq[] enumC1293qArrValuesCustom = values();
        int length = enumC1293qArrValuesCustom.length;
        Enumq[] enumC1293qArr = new Enumq[length];
        System.arraycopy(enumC1293qArrValuesCustom, 0, enumC1293qArr, 0, length);
        return enumC1293qArr;
    }
}
