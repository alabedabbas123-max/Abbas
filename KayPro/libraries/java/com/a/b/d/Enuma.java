package com.a.b.d;

public enum Enuma {
    UNKNOWN,
    NONE,
    VARIES,
    TYPE_REF,
    STRING_REF,
    METHOD_REF,
    FIELD_REF,
    METHOD_AND_PROTO_REF,
    CALL_SITE_REF,
    INLINE_METHOD,
    VTABLE_OFFSET,
    FIELD_OFFSET,
    METHOD_HANDLE_REF,
    PROTO_REF;

    public static Enuma[] valuesCustom() {
        Enuma[] enumC1120aArrValuesCustom = values();
        int length = enumC1120aArrValuesCustom.length;
        Enuma[] enumC1120aArr = new Enuma[length];
        System.arraycopy(enumC1120aArrValuesCustom, 0, enumC1120aArr, 0, length);
        return enumC1120aArr;
    }
}
