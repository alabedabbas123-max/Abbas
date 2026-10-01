package com.a.b.c.c;

import com.a.b.g.Interfacew;

public enum Enumah implements Interfacew {
    TYPE_HEADER_ITEM(0, "header_item"),
    TYPE_STRING_ID_ITEM(1, "string_id_item"),
    TYPE_TYPE_ID_ITEM(2, "type_id_item"),
    TYPE_PROTO_ID_ITEM(3, "proto_id_item"),
    TYPE_FIELD_ID_ITEM(4, "field_id_item"),
    TYPE_METHOD_ID_ITEM(5, "method_id_item"),
    TYPE_CLASS_DEF_ITEM(6, "class_def_item"),
    TYPE_CALL_SITE_ID_ITEM(7, "call_site_id_item"),
    TYPE_METHOD_HANDLE_ITEM(8, "method_handle_item"),
    TYPE_MAP_LIST(4096, "map_list"),
    TYPE_TYPE_LIST(4097, "type_list"),
    TYPE_ANNOTATION_SET_REF_LIST(4098, "annotation_set_ref_list"),
    TYPE_ANNOTATION_SET_ITEM(4099, "annotation_set_item"),
    TYPE_CLASS_DATA_ITEM(8192, "class_data_item"),
    TYPE_CODE_ITEM(8193, "code_item"),
    TYPE_STRING_DATA_ITEM(8194, "string_data_item"),
    TYPE_DEBUG_INFO_ITEM(8195, "debug_info_item"),
    TYPE_ANNOTATION_ITEM(8196, "annotation_item"),
    TYPE_ENCODED_ARRAY_ITEM(8197, "encoded_array_item"),
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(8198, "annotations_directory_item"),
    TYPE_MAP_ITEM(-1, "map_item"),
    TYPE_TYPE_ITEM(-1, "type_item"),
    TYPE_EXCEPTION_HANDLER_ITEM(-1, "exception_handler_item"),
    TYPE_ANNOTATION_SET_REF_ITEM(-1, "annotation_set_ref_item");


    private final String f2371A;

    private final int f2372y;

    private final String f2373z;

    Enumah(int i, String str) {
        this.f2372y = i;
        this.f2373z = str;
        this.f2371A = (str.endsWith("_item") ? str.substring(0, str.length() - 5) : str).replace('_', ' ');
    }

    public static Enumah[] valuesCustom() {
        Enumah[] enumC1067ahArrValuesCustom = values();
        int length = enumC1067ahArrValuesCustom.length;
        Enumah[] enumC1067ahArr = new Enumah[length];
        System.arraycopy(enumC1067ahArrValuesCustom, 0, enumC1067ahArr, 0, length);
        return enumC1067ahArr;
    }

    public int m4492a() {
        return this.f2372y;
    }

    public String m4493b() {
        return this.f2373z;
    }

    @Override
    public String mo3828d() {
        return this.f2371A;
    }
}
