package com.aide.uidesigner;

@abcd.Interfacexu
class ua implements com.aide.uidesigner.Ka.c {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.ua.class, -6184905212679667120L, 70703781400572432L);
    }

    ua() {
    }

    @Override
    @abcd.Interfacesu(method = -644629021659866913L)
    public android.view.View j6(android.content.Context r7) {
        com.aide.uidesigner.ta r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -1306362575487484920L, this, r7);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1306362575487484920L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new com.aide.uidesigner.ta(this, r7, r7);
                        r2.setBackgroundDrawable(r7.obtainStyledAttributes(new int[]{16843530}).getDrawable(0));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
