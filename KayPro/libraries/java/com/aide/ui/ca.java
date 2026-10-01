package com.aide.ui;

@abcd.Interfacexu
public class ca {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.ca.class, 739089724870199160L, 739089724870199160L);
    }

    public ca() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -3402724870379377312L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-3402724870379377312L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(java.lang.String r6) {
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 53: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 57; continue $sw1; }
                    abcd.wu.j6(th, -3831686743028331456L, null, r6);
                    $pc1 = 57; continue $sw1;
                }
                case 57: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-3831686743028331456L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 53; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r3 = "";
                    if (r6.contains(".") == false) { $pc1 = 10; continue $sw1; }
                    try {
                        r3 = r6.substring(r6.lastIndexOf(46) + 1).toLowerCase();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 53; continue $sw1;
                    }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if ("java".equals(r3) == false) { $pc1 = 14; continue $sw1; }
                    return com.almlkaide.kaypro.R.drawable.file_type_java;
                }
                case 14: {
                    if ("xml".equals(r3) == false) { $pc1 = 18; continue $sw1; }
                    return com.almlkaide.kaypro.R.drawable.file_type_xml;
                }
                case 18: {
                    if ("cpp".equals(r3) == false) { $pc1 = 22; continue $sw1; }
                    return com.almlkaide.kaypro.R.drawable.file_type_cpp;
                }
                case 22: {
                    if ("c".equals(r3) == false) { $pc1 = 26; continue $sw1; }
                    return com.almlkaide.kaypro.R.drawable.file_type_c;
                }
                case 26: {
                    if ("css".equals(r3) == false) { $pc1 = 30; continue $sw1; }
                    return com.almlkaide.kaypro.R.drawable.file_type_css;
                }
                case 30: {
                    if ("h".equals(r3) == false) { $pc1 = 33; continue $sw1; }
                    return com.almlkaide.kaypro.R.drawable.file_type_h;
                }
                case 33: {
                    if ("hpp".equals(r3) == false) { $pc1 = 36; continue $sw1; }
                    return com.almlkaide.kaypro.R.drawable.file_type_h;
                }
                case 36: {
                    if ("html".equals(r3) == false) { $pc1 = 40; continue $sw1; }
                    return com.almlkaide.kaypro.R.drawable.file_type_html;
                }
                case 40: {
                    if ("js".equals(r3) == false) { $pc1 = 44; continue $sw1; }
                    return com.almlkaide.kaypro.R.drawable.file_type_js;
                }
                case 44: {
                    if ("txt".equals(r3) == false) { $pc1 = 47; continue $sw1; }
                    return com.almlkaide.kaypro.R.drawable.file_type_txt;
                }
                case 47: {
                    if ("gradle".equals(r3) == false) { $pc1 = 51; continue $sw1; }
                    return com.almlkaide.kaypro.R.drawable.project_properties;
                }
                case 51: {
                    return com.almlkaide.kaypro.R.drawable.file_type_unknown;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
