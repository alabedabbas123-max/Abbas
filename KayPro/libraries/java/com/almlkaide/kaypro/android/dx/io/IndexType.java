package com.almlkaide.kaypro.android.dx.io;

public enum IndexType {
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

    public static IndexType valueOf(String str) {
        for (IndexType indexType : values()) {
            if (indexType.name().equals(str)) {
                return indexType;
            }
        }
        throw new IllegalArgumentException();
    }
}
