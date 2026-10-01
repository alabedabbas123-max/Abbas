package com.a.b.c.c;

enum Enumas {
    NONE,
    TYPE,
    INSTANCE;

    public static Enumas[] valuesCustom() {
        Enumas[] enumC1078asArrValuesCustom = values();
        int length = enumC1078asArrValuesCustom.length;
        Enumas[] enumC1078asArr = new Enumas[length];
        System.arraycopy(enumC1078asArrValuesCustom, 0, enumC1078asArr, 0, length);
        return enumC1078asArr;
    }
}
