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
        java.util.ArrayList r0 = new java.util.ArrayList();
        java.io.File[] r1 = DW().listFiles();
        if (r1 == null) goto L17;
        int r2 = r1.length;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L17;
        java.io.File r4 = r1[r3];
        if (r4.getName().endsWith(".ser") == false) goto L16;
        java.io.DataInputStream r5 = new java.io.DataInputStream(new java.io.FileInputStream(r4));     // Catch: java.lang.Throwable -> L14
        java.lang.String r8 = r5.readUTF();     // Catch: java.lang.Throwable -> L11
        java.lang.String r9 = r5.readUTF();     // Catch: java.lang.Throwable -> L11
        long r11 = r5.readLong();     // Catch: java.lang.Throwable -> L11
        r0.add(new abcd.Wv.a(r8, r9, new abcd.Xv(r5), r11));     // Catch: java.lang.Throwable -> L11
        r5.close();     // Catch: java.lang.Throwable -> L14
        goto L16
    L11:
        th = move-exception;
        r5.close();     // Catch: java.lang.Throwable -> L14
        throw th;     // Catch: java.lang.Throwable -> L14
    L14:
        th = move-exception;
        abcd.yw.j6("Property error", th);
    L16:
        r3 = r3 + 1;
    L17:
        java.util.Collections.sort(r0, new abcd.Vv());
        return r0;
    }

    public static void j6(java.lang.String r4, java.lang.String r5, abcd.Xv r6, long r7) {
        if (r6.tp == false) goto L16;
        java.io.DataOutputStream r1 = new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(DW(), r5 + ".ser")));     // Catch: java.lang.Throwable -> L10
        r1.writeUTF(r4);     // Catch: java.lang.Throwable -> L7
        r1.writeUTF(r5);     // Catch: java.lang.Throwable -> L7
        r1.writeLong(r7);     // Catch: java.lang.Throwable -> L7
        r6.j6(r1);     // Catch: java.lang.Throwable -> L7
        r1.close();     // Catch: java.lang.Throwable -> L10
        return;
    L7:
        th = move-exception;
        r1.close();     // Catch: java.lang.Throwable -> L10
        throw th;     // Catch: java.lang.Throwable -> L10
    L10:
        th = move-exception;
        abcd.yw.j6("Property error", th);
        return;
    }
}
