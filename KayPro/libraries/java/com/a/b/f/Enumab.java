package com.a.b.f;

public enum Enumab {
    MOVE_PARAM_COMBINER,
    SCCP,
    LITERAL_UPGRADE,
    CONST_COLLECTOR,
    ESCAPE_ANALYSIS;

    public static Enumab[] valuesCustom() {
        Enumab[] enumC1256abArrValuesCustom = values();
        int length = enumC1256abArrValuesCustom.length;
        Enumab[] enumC1256abArr = new Enumab[length];
        System.arraycopy(enumC1256abArrValuesCustom, 0, enumC1256abArr, 0, length);
        return enumC1256abArr;
    }
}
