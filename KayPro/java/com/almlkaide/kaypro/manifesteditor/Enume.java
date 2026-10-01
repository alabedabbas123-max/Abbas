package com.almlkaide.kaypro.manifesteditor;

enum Enume {
    SAVE,
    DELETE,
    READ,
    UNKNOWN;

    public static Enume[] valuesCustom() {
        Enume[] enumC1363eArrValuesCustom = values();
        int length = enumC1363eArrValuesCustom.length;
        Enume[] enumC1363eArr = new Enume[length];
        System.arraycopy(enumC1363eArrValuesCustom, 0, enumC1363eArr, 0, length);
        return enumC1363eArr;
    }
}
