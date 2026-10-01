package abcd;

@abcd.Interfacexu
public class Ke {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.Ke.class, 923036074386573539L, 923036074386573539L);
    }

    public Ke() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -4224916339600595499L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-4224916339600595499L, null);
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

    public static java.lang.String j6(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 1517005023151267440L, null, r5);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(1517005023151267440L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return r5 + "/raw/wearable_app.apk";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        java.lang.String r0 = null;
        java.io.OutputStreamWriter r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 13: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 17; continue $sw2; }
                    abcd.wu.j6(th, -437176524350347264L, null, r9, r10, r11, r12);
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-437176524350347264L, null, r9, r10, r11, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r0 = (((("<wearableApp package=\"" + r10 + "\">\n") + "\t<versionCode>" + r11 + "</versionCode>\n") + "\t<versionName>" + r12 + "</versionName>\n") + "\t<rawPathResId>wearable_app</rawPathResId>\n") + "</wearableApp>";
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    try {
                        r2 = new java.io.OutputStreamWriter(new com.aide.common.na(r9 + "/xml/wearable_app_desc.xml"));
                        r2.write(r0);
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 9; continue $sw2; }
                        $pc2 = 13; continue $sw2;
                    }
                    return true;
                }
                case 9: {
                    e = $ex2;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
