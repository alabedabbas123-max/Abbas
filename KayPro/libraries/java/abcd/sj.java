package abcd;

@abcd.Interfacexu
public class sj {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.sj.class, 1337701946479526635L, 1337701946479526635L);
    }

    public sj() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3395792030015222540L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3395792030015222540L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static boolean DW(java.lang.String r5) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 1378245637672252941L, null, r5);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1378245637672252941L, null, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (r5.toLowerCase().endsWith(".html") == true) goto L12;
        if (r5.toLowerCase().endsWith(".htm") == true) goto L12;
        return false;
    L12:
        return true;
    }

    public static boolean FH(java.lang.String r5) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 5938096640218703043L, null, r5);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(5938096640218703043L, null, r5);     // Catch: java.lang.Throwable -> L15
    L7:
        if (j6(r5) != null) goto L9;
    L13:
        return false;
    L9:
        if (Zo(r5) == true) goto L13;
        if (Hw(r5) == true) goto L13;
        return true;
    }

    @abcd.Interfacesu(method = 6829803446617169119L)
    private static boolean Hw(java.lang.String r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -893919017838884040L, null, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-893919017838884040L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if ("www".equals(abcd.Vl.tp(r5)) == false) goto L11;
        if ("assets".equals(abcd.Vl.tp(abcd.Vl.EQ(r5))) == false) goto L11;
        return true;
    L11:
        return false;
    }

    @abcd.Interfacesu(method = 5922068630664778300L)
    private static boolean Zo(java.lang.String r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1668961171743419983L, null, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1668961171743419983L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if ("www".equals(abcd.Vl.tp(r5)) == false) goto L11;
        if (v5(abcd.Vl.EQ(r5)) == false) goto L11;
        return true;
    L11:
        return false;
    }

    public static java.lang.String j6(java.lang.String r6) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -4522687914940484133L, null, r6);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-4522687914940484133L, null, r6);     // Catch: java.lang.Throwable -> L15
    L7:
        if (abcd.Vl.Hw(r6 + "/index.html") == false) goto L11;
        return r6 + "/index.html";
    L11:
        if (abcd.Vl.Hw(r6 + "/index.htm") == true) goto L13;
        return null;
    L13:
        return r6 + "/index.htm";
    }

    @abcd.Interfacesu(method = 6853681783156293560L)
    private static boolean v5(java.lang.String r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -5396024280364239711L, null, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-5396024280364239711L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (abcd.Vl.Hw(r5 + "/www") == false) goto L11;
        if (abcd.Vl.Hw(r5 + "/.cordova") == false) goto L11;
        return true;
    L11:
        return false;
    }
}
