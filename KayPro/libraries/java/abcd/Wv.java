package abcd;

public class Wv {

    public static class a {
        public java.lang.String DW;
        public abcd.Xv FH;
        public long Hw;
        public java.lang.String j6;

        public a(java.lang.String r1, java.lang.String r2, abcd.Xv r3, long r4) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
            this.Hw = r4;
        }
    }

    private static java.io.File DW() {
        return abcd.uw.j6(abcd.wu.j6(), "properties");
    }

    public static java.util.List<abcd.Wv.a> j6() {
        java.util.ArrayList r0 = null;
        java.io.File[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.io.File r4 = null;
        java.io.DataInputStream r5 = null;
        java.lang.String r8 = null;
        java.lang.String r9 = null;
        long r11 = 0L;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    r1 = DW().listFiles();
                    if (r1 == null) { $pc0 = 17; continue $sw0; }
                    r2 = r1.length;
                    r3 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (r3 >= r2) { $pc0 = 17; continue $sw0; }
                    r4 = r1[r3];
                    if (r4.getName().endsWith(".ser") == false) { $pc0 = 16; continue $sw0; }
                    try {
                        r5 = new java.io.DataInputStream(new java.io.FileInputStream(r4));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    try {
                        r8 = r5.readUTF();
                        r9 = r5.readUTF();
                        r11 = r5.readLong();
                        r0.add(new abcd.Wv.a(r8, r9, new abcd.Xv(r5), r11));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    try {
                        r5.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    { $pc0 = 16; continue $sw0; }
                }
                case 11: {
                    th = $ex0;
                    try {
                        r5.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                }
                case 14: {
                    th = $ex0;
                    abcd.yw.j6("Property error", th);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    r3 = r3 + 1;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    java.util.Collections.sort(r0, new abcd.Vv());
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.String r4, java.lang.String r5, abcd.Xv r6, long r7) {
        java.io.DataOutputStream r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r6.tp == false) { $pc1 = 16; continue $sw1; }
                    try {
                        r1 = new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(DW(), r5 + ".ser")));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    try {
                        r1.writeUTF(r4);
                        r1.writeUTF(r5);
                        r1.writeLong(r7);
                        r6.j6(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    try {
                        r1.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    return;
                }
                case 7: {
                    th = $ex1;
                    try {
                        r1.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                }
                case 10: {
                    th = $ex1;
                    abcd.yw.j6("Property error", th);
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
