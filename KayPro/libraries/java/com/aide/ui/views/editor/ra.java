package com.aide.ui.views.editor;

@abcd.Interfacexu
public abstract class ra {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    public interface a {
        void DW(int r1, char[] r2, int r3, int r4);

        void j6(java.lang.String r1);

        boolean j6(int r1, char[] r2, int r3, int r4);
    }

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ra.class, 3836745710645965440L, 3836745710645965440L);
    }

    public ra() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -953159144135997120L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-953159144135997120L, null);
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

    public static char[] j6(java.io.Reader r12, com.aide.ui.views.editor.ra.a r13, char[] r14) {
        char[] r7 = null;
        int r1 = 0;
        int r2 = 0;
        boolean r3 = false;
        boolean r4 = false;
        int r5 = 0;
        int r6 = 0;
        boolean r8 = false;
        int r9 = 0;
        boolean r10 = false;
        int r11 = 0;
        int r15 = 0;
        char r16 = 0;
        char[] r17 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 46: {
                    th = $ex1;
                    r7 = r14;
                    if (DW == false) { $pc1 = 51; continue $sw1; }
                    abcd.wu.j6(th, -754261635788803180L, null, r12, r13, r7);
                    $pc1 = 51; continue $sw1;
                }
                case 51: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-754261635788803180L, null, r12, r13, r14);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r1 = 0;
                    r2 = 0;
                    r3 = false;
                    r4 = false;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r5 = r12.read(r14, r1, r14.length - r1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    if (r5 == (-1)) { $pc1 = 43; continue $sw1; }
                    r6 = r2;
                    r8 = r4;
                    r9 = r1;
                    r10 = r3;
                    r11 = 0;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    try {
                        r15 = r1 + r5;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    if (r9 >= r15) { $pc1 = 34; continue $sw1; }
                    try {
                        r16 = r14[r9];
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    if (r16 != '\n') { $pc1 = 14; continue $sw1; }
                    if (r10 == false) { $pc1 = 27; continue $sw1; }
                    try {
                        r11 = r11 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    if (r8 == false) { $pc1 = 26; continue $sw1; }
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    r10 = false;
                    $pc1 = 33; continue $sw1;
                }
                case 33: {
                    try {
                        r9 = r9 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    { $pc1 = 9; continue $sw1; }
                }
                case 26: {
                    try {
                        r13.j6("\r\n");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    r10 = false;
                    r8 = true;
                    { $pc1 = 33; continue $sw1; }
                }
                case 27: {
                    if (r8 == true) { $pc1 = 30; continue $sw1; }
                    try {
                        r13.j6("\n");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    r8 = true;
                    $pc1 = 30; continue $sw1;
                }
                case 30: {
                    if (r13.j6(r6, r14, r11, r9 - r11) == false) { $pc1 = 31; continue $sw1; }
                    try {
                        r6 = r6 + 1;
                        r11 = r9 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    { $pc1 = 33; continue $sw1; }
                }
                case 31: {
                    return r14;
                }
                case 14: {
                    if (r16 == '\r') { $pc1 = 20; continue $sw1; }
                    if (r10 == false) { $pc1 = 18; continue $sw1; }
                    if (r8 == true) { $pc1 = 18; continue $sw1; }
                    try {
                        r13.j6("\r");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    r8 = true;
                    { $pc1 = 18; continue $sw1; }
                }
                case 20: {
                    if (r13.j6(r6, r14, r11, r9 - r11) == false) { $pc1 = 21; continue $sw1; }
                    try {
                        r6 = r6 + 1;
                        r11 = r9 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    r10 = true;
                    { $pc1 = 33; continue $sw1; }
                }
                case 21: {
                    return r14;
                }
                case 34: {
                    if (r11 == 0) { $pc1 = 36; continue $sw1; }
                    if (r11 >= r15) { $pc1 = 41; continue $sw1; }
                    try {
                        r15 = r15 - r11;
                        java.lang.System.arraycopy(r14, r11, r14, 0, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    $pc1 = 40; continue $sw1;
                }
                case 40: {
                    r1 = r15;
                    $pc1 = 42; continue $sw1;
                }
                case 42: {
                    r3 = r10;
                    r2 = r6;
                    r4 = r8;
                    { $pc1 = 6; continue $sw1; }
                }
                case 41: {
                    r1 = 0;
                    { $pc1 = 42; continue $sw1; }
                }
                case 36: {
                    if (r15 != r14.length) { $pc1 = 40; continue $sw1; }
                    try {
                        r17 = new char[r14.length * 2];
                        java.lang.System.arraycopy(r14, 0, r17, 0, r14.length);
                        r1 = r14.length;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    r14 = r17;
                    { $pc1 = 42; continue $sw1; }
                }
                case 43: {
                    if (r1 == 0) { $pc1 = 45; continue $sw1; }
                    try {
                        r13.DW(r2, r14, 0, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 46; continue $sw1;
                    }
                    $pc1 = 45; continue $sw1;
                }
                case 45: {
                    return r14;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
