package abcd;

public final class Enumwp extends com.almlkaide.kaypro.internal.EnumBase implements abcd.Interfacelu {
    public static final abcd.Enumwp DW = null;
    public static final abcd.Enumwp EQ = null;
    public static final abcd.Enumwp FH = null;
    public static final abcd.Enumwp Hw = null;
    public static final abcd.Enumwp J0 = null;
    public static final abcd.Enumwp J8 = null;
    public static final abcd.Enumwp Mr = null;
    public static final abcd.Enumwp QX = null;
    public static final abcd.Enumwp U2 = null;
    public static final abcd.Enumwp VH = null;
    public static final abcd.Enumwp Ws = null;
    public static final abcd.Enumwp XL = null;
    public static final abcd.Enumwp Zo = null;
    public static final abcd.Enumwp a8 = null;
    public static final abcd.Enumwp aM = null;
    public static final abcd.Enumwp gn = null;
    public static final abcd.Enumwp j3 = null;
    public static final abcd.Enumwp j6 = null;
    private static final abcd.Enumwp[] lg = null;
    public static final abcd.Enumwp tp = null;
    public static final abcd.Enumwp u7 = null;
    public static final abcd.Enumwp v5 = null;
    public static final abcd.Enumwp we = null;
    private final java.lang.String er;
    private final int rN;
    private final java.lang.String yS;

    static {
        j6 = new abcd.Enumwp("TYPE_HEADER_ITEM", 0, 0, "header_item");
        DW = new abcd.Enumwp("TYPE_STRING_ID_ITEM", 1, 1, "string_id_item");
        FH = new abcd.Enumwp("TYPE_TYPE_ID_ITEM", 2, 2, "type_id_item");
        Hw = new abcd.Enumwp("TYPE_PROTO_ID_ITEM", 3, 3, "proto_id_item");
        v5 = new abcd.Enumwp("TYPE_FIELD_ID_ITEM", 4, 4, "field_id_item");
        Zo = new abcd.Enumwp("TYPE_METHOD_ID_ITEM", 5, 5, "method_id_item");
        VH = new abcd.Enumwp("TYPE_CLASS_DEF_ITEM", 6, 6, "class_def_item");
        gn = new abcd.Enumwp("TYPE_MAP_LIST", 7, 4096, "map_list");
        u7 = new abcd.Enumwp("TYPE_TYPE_LIST", 8, 4097, "type_list");
        tp = new abcd.Enumwp("TYPE_ANNOTATION_SET_REF_LIST", 9, 4098, "annotation_set_ref_list");
        EQ = new abcd.Enumwp("TYPE_ANNOTATION_SET_ITEM", 10, 4099, "annotation_set_item");
        we = new abcd.Enumwp("TYPE_CLASS_DATA_ITEM", 11, 8192, "class_data_item");
        J0 = new abcd.Enumwp("TYPE_CODE_ITEM", 12, 8193, "code_item");
        J8 = new abcd.Enumwp("TYPE_STRING_DATA_ITEM", 13, 8194, "string_data_item");
        Ws = new abcd.Enumwp("TYPE_DEBUG_INFO_ITEM", 14, 8195, "debug_info_item");
        QX = new abcd.Enumwp("TYPE_ANNOTATION_ITEM", 15, 8196, "annotation_item");
        XL = new abcd.Enumwp("TYPE_ENCODED_ARRAY_ITEM", 16, 8197, "encoded_array_item");
        aM = new abcd.Enumwp("TYPE_ANNOTATIONS_DIRECTORY_ITEM", 17, 8198, "annotations_directory_item");
        j3 = new abcd.Enumwp("TYPE_MAP_ITEM", 18, -1, "map_item");
        Mr = new abcd.Enumwp("TYPE_TYPE_ITEM", 19, -1, "type_item");
        U2 = new abcd.Enumwp("TYPE_EXCEPTION_HANDLER_ITEM", 20, -1, "exception_handler_item");
        a8 = new abcd.Enumwp("TYPE_ANNOTATION_SET_REF_ITEM", 21, -1, "annotation_set_ref_item");
        lg = new abcd.Enumwp[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7, tp, EQ, we, J0, J8, Ws, QX, XL, aM, j3, Mr, U2, a8};
    }

    private Enumwp(java.lang.String r1, int r2, int r3, java.lang.String r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1, r2);
                    this.rN = r3;
                    this.er = r4;
                    if (r4.endsWith("_item") == false) { $pc0 = 5; continue $sw0; }
                    r4 = r4.substring(0, r4.length() - 5);
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.yS = r4.replace('_', ' ');
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Enumwp valueOf(java.lang.String r1) {
        return (abcd.Enumwp) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Enumwp.values(), r1);
    }

    public static abcd.Enumwp[] values() {
        return (abcd.Enumwp[]) lg.clone();
    }

    public int Hw() {
        return this.rN;
    }

    public java.lang.String Zo() {
        return this.er;
    }

    @Override
    public java.lang.String aM() {
        return this.yS;
    }
}
