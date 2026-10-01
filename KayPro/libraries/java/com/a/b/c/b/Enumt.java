package com.a.b.c.b;

public enum Enumt {
    START,
    END_SIMPLY,
    END_REPLACED,
    END_MOVED,
    END_CLOBBERED_BY_PREV,
    END_CLOBBERED_BY_NEXT;

    public static Enumt[] valuesCustom() {
        Enumt[] enumC1052tArrValuesCustom = values();
        int length = enumC1052tArrValuesCustom.length;
        Enumt[] enumC1052tArr = new Enumt[length];
        System.arraycopy(enumC1052tArrValuesCustom, 0, enumC1052tArr, 0, length);
        return enumC1052tArr;
    }
}
