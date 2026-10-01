package abcd;

public class ow {
    private static long DW;
    private static android.os.Handler EQ;
    private static java.lang.String FH;
    private static java.lang.String Hw;
    private static java.lang.Object VH;
    private static java.lang.Object Zo;
    private static java.lang.Object gn;
    private static final java.util.List<abcd.lw> j6 = null;
    private static boolean tp;
    private static boolean u7;
    private static java.lang.Object v5;

    static {
        j6 = new java.util.ArrayList();
        v5 = new java.lang.Object();
        Zo = new java.lang.Object();
        VH = new java.lang.Object();
        gn = new java.lang.Object();
    }

    static java.io.File DW() {
        return tp();
    }

    private static void DW(java.io.File r4) {
        if (r4.isDirectory() == false) goto L8;
        java.io.File[] r0 = r4.listFiles();
        int r1 = r0.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        DW(r0[r2]);
        r2 = r2 + 1;
        goto L5
    L7:
        r4.delete();
        return;
    L8:
        r4.delete();
    }

    private static void DW(java.lang.ClassLoader r1, java.util.List<java.lang.String> r2) {
        java.util.ArrayList r0 = new java.util.ArrayList();
        j6(r1, r0, r2);
        java.util.Iterator r3 = r0.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        j6((java.lang.Class) r3.next());
        goto L4
    }

    private static void DW(java.lang.ClassLoader r4, boolean r5) {
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L4
        java.util.ArrayList r1 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L4
        abcd.Mv.XL().j6(new abcd.nw(r4, r1), r0);     // Catch: java.lang.Throwable -> L4
        j6(r0, r1, r5);     // Catch: java.lang.Throwable -> L4
        return;
    L4:
        th = move-exception;
        abcd.yw.j6("Probe loading", th);
    }

    static java.io.File FH() {
        return u7();
    }

    private static java.lang.ClassLoader FH(java.io.File r9) {
        java.io.File r0 = new java.io.File(r9.getParentFile(), r9.getName() + ".dex");     // Catch: java.io.IOException -> L8
        java.util.zip.ZipFile r1 = new java.util.zip.ZipFile(r9);     // Catch: java.io.IOException -> L8
        java.io.InputStream r2 = r1.getInputStream(r1.getEntry("classes.dex"));     // Catch: java.io.IOException -> L8
        java.io.FileOutputStream r3 = new java.io.FileOutputStream(r0);     // Catch: java.io.IOException -> L8
        byte[] r4 = new byte[16000];     // Catch: java.io.IOException -> L8
    L3:
        int r5 = r2.read(r4);     // Catch: java.io.IOException -> L8
        if (r5 == (-1)) goto L6;
        r3.write(r4, 0, r5);     // Catch: java.io.IOException -> L8
        goto L3
    L6:
        r1.close();     // Catch: java.io.IOException -> L8
        r3.close();     // Catch: java.io.IOException -> L8
        java.io.File r6 = new java.io.File(r9.getParentFile(), r9.getName() + ".opt");     // Catch: java.io.IOException -> L8
        DW(r6);     // Catch: java.io.IOException -> L8
        r6.mkdirs();     // Catch: java.io.IOException -> L8
        return new abcd.kw(r0.getPath(), r6.getPath(), null, abcd.wu.j6().getClassLoader(), true);
    L8:
        e = move-exception;
        abcd.yw.j6("Error loading probes", e);
        return null;
    }

    static boolean Hw() {
        return u7;
    }

    public static void VH() {
        java.lang.Object r0 = VH;
        monitor-enter(r0);
        VH.notifyAll();     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    static java.lang.Object Zo() {
        return VH;
    }

    private static java.io.File gn() {
        java.io.File r2 = abcd.rw.FH();     // Catch: java.io.IOException -> L28
        if (abcd.sw.j6() == false) goto L6;
        java.lang.String r3 = "dev.builtin.apk";
    L7:
        java.io.File r1 = new java.io.File(r2, r3);     // Catch: java.io.IOException -> L28
        if (r1.exists() == true) goto L10;
    L12:
        r1.delete();     // Catch: java.io.IOException -> L28
        if (abcd.sw.j6() == false) goto L15;
        java.lang.String r4 = "dev.probes";
    L16:
        java.io.InputStream r5 = abcd.wu.j6().getClassLoader().getResourceAsStream(r4);     // Catch: java.io.IOException -> L28
        if (r5 != null) goto L19;
        return null;
    L19:
        java.io.FileOutputStream r6 = new java.io.FileOutputStream(r1);     // Catch: java.io.IOException -> L28
        byte[] r7 = new byte[16000];     // Catch: java.io.IOException -> L28
    L20:
        int r8 = r5.read(r7);     // Catch: java.io.IOException -> L28
        if (r8 == (-1)) goto L23;
        r6.write(r7, 0, r8);     // Catch: java.io.IOException -> L28
        goto L20
    L23:
        r6.close();     // Catch: java.io.IOException -> L28
        if (r1.exists() == false) goto L27;
        r1.setLastModified(DW);     // Catch: java.io.IOException -> L28
        return r1;
    L15:
        r4 = "public.probes";
        goto L16
    L10:
        if (r1.lastModified() != DW) goto L12;
        return r1;
    L6:
        r3 = "public.builtin.apk";
    L27:
        return null;
    }

    static java.lang.ClassLoader j6(java.io.File r0) {
        return FH(r0);
    }

    static java.lang.Object j6() {
        return gn;
    }

    public static void j6(abcd.lw r2, long r3, java.lang.Throwable r5) {
        abcd.iw.j6(r2, r3, r5);
        if (abcd.sw.j6() == false) goto L6;
        abcd.xw.j6(r2.DW().hashCode() + 346546, 17301624, "backbone probes event error: " + r2.DW() + ": " + r5);
        return;
    }

    private static void j6(java.lang.Class<?> r8) {
        abcd.yw.j6("Probes", "Opening " + r8);
        java.lang.reflect.Constructor<?> r5 = r8.getDeclaredConstructor(new java.lang.Class[0]);     // Catch: java.lang.Exception -> L21
        if (r5 == null) goto L7;
        r5.setAccessible(true);     // Catch: java.lang.Exception -> L21
        java.lang.Object r6 = r5.newInstance(new java.lang.Object[0]);     // Catch: java.lang.Exception -> L21
    L22:
        java.lang.reflect.Method r9 = r8.getDeclaredMethod("define", new java.lang.Class[0]);     // Catch: java.lang.Exception -> L20
        if (r9.getParameterTypes().length == 0) goto L11;
        return;
    L11:
        if ("void".equals(r9.getReturnType().getSimpleName()) == true) goto L13;
        return;
    L13:
        if (r9.isSynthetic() == false) goto L15;
        return;
    L15:
        if ((r9.getModifiers() & 8) != 0) goto L18;
        if (r6 == null) goto L28;
        abcd.yw.j6("Probes", "Opening " + r9);     // Catch: java.lang.Exception -> L20
        r9.setAccessible(true);     // Catch: java.lang.Exception -> L20
        r9.invoke(r6, new java.lang.Object[0]);     // Catch: java.lang.Exception -> L20
        return;
    L28:
        return;
    L18:
        abcd.yw.j6("Probes", "Opening " + r9);     // Catch: java.lang.Exception -> L20
        r9.setAccessible(true);     // Catch: java.lang.Exception -> L20
        r9.invoke(null, new java.lang.Object[0]);     // Catch: java.lang.Exception -> L20
        return;
    L30:
        return;
    L7:
        r6 = null;
        goto L22
    }

    static void j6(java.lang.ClassLoader r0, java.util.List r1) {
        DW(r0, r1);
    }

    private static void j6(java.lang.ClassLoader r11, java.util.List<java.lang.Class<?>> r12, java.util.List<java.lang.String> r13) {
        if (r11 != null) goto L23;
        return;
    L23:
        java.lang.Class<?> r1 = r11.loadClass("probes");     // Catch: java.lang.ClassNotFoundException -> L21
        java.lang.String[] r2 = (java.lang.String[]) r1.getDeclaredField("classes").get(null);
        int r4 = r2.length;
        int r5 = 0;
        int r6 = 0;
    L8:
        if (r6 >= r4) goto L13;
        java.lang.String r9 = r2[r6];
        if ("DefaultProbes".equals(r9) == true) goto L12;
        r12.add(r11.loadClass(r9.replace('/', '.')));
    L12:
        r6 = r6 + 1;
        goto L8
    L13:
        int r7 = r2.length;
    L14:
        if (r5 >= r7) goto L19;
        java.lang.String r8 = r2[r5];
        if ("DefaultProbes".equals(r8) == false) goto L18;
        r12.add(r11.loadClass(r8.replace('/', '.')));
    L18:
        r5 = r5 + 1;
        goto L14
    L19:
        r13.addAll(java.util.Arrays.asList((java.lang.String[]) r1.getDeclaredField("strings").get(null)));
        return;
    L21:
        r12.add(r11.loadClass("DefaultProbes"));
    }

    static void j6(java.lang.ClassLoader r0, boolean r1) {
        DW(r0, r1);
    }

    private static void j6(java.util.List<abcd.lw> r11, java.util.List<java.lang.String> r12, boolean r13) {
        java.lang.Object r0 = v5;
        monitor-enter(r0);
        abcd.yw.j6("Probes", "Opening probes " + r11.size());     // Catch: java.lang.Throwable -> L37
        abcd.Mv.XL().j6(r12);     // Catch: java.lang.Throwable -> L37
        java.util.Iterator<abcd.lw> r14 = j6.iterator();     // Catch: java.lang.Throwable -> L37
    L6:
        if (r14.hasNext() == false) goto L8;
        abcd.kv.DW(r14.next().j6());     // Catch: java.lang.Throwable -> L37
        goto L6
    L8:
        j6.clear();     // Catch: java.lang.Throwable -> L37
        if (r13 == true) goto L11;
    L13:
        long r1 = com.appfour.backbone.api.Api.getLastUpdateTime();     // Catch: java.lang.Throwable -> L37
    L14:
        long r3 = abcd.kv.DW();     // Catch: java.lang.Throwable -> L37
        if (r13 == true) goto L17;
        abcd.kv.j6();     // Catch: java.lang.Throwable -> L37
    L17:
        java.util.Iterator<abcd.lw> r15 = r11.iterator();     // Catch: java.lang.Throwable -> L37
    L19:
        if (r15.hasNext() == false) goto L29;
        abcd.lw r5 = r15.next();     // Catch: java.lang.Throwable -> L37
        j6.add(r5);     // Catch: java.lang.Throwable -> L37
        if (abcd.rw.DW(r5) == true) goto L19;
        if (r13 == true) goto L27;
        java.util.Iterator<abcd.lw.a> r6 = r5.j6().iterator();     // Catch: java.lang.Throwable -> L37
        long r7 = r1;
    L25:
        if (r6.hasNext() == false) goto L28;
        r7 = java.lang.Math.max(abcd.kv.j6(r6.next(), r3, r1), r7);     // Catch: java.lang.Throwable -> L37
    L28:
        abcd.rw.j6(r5);     // Catch: java.lang.Throwable -> L37
        abcd.iw.j6(r5, r3, r7);     // Catch: java.lang.Throwable -> L37
        goto L19
    L27:
        r7 = r1;
        goto L28
    L29:
        java.util.Iterator<abcd.lw> r16 = r11.iterator();     // Catch: java.lang.Throwable -> L37
    L31:
        if (r16.hasNext() == false) goto L35;
        abcd.lw r17 = r16.next();     // Catch: java.lang.Throwable -> L37
        if (r17.FH() == false) goto L31;
        abcd.kv.j6(r17.j6());     // Catch: java.lang.Throwable -> L37
        goto L31
    L35:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L37
        return;
    L11:
        if (com.appfour.backbone.api.Api.hasBeenUpdated() == true) goto L13;
        r1 = 0;
    L37:
        th = move-exception;
        throw th;
    }

    public static void j6(boolean r6, long r7, java.lang.String r9, java.lang.String r10) {
        EQ = new android.os.Handler();
        DW = r7;
        Hw = r9;
        FH = r10;
        java.lang.Object r0 = gn;
        monitor-enter(r0);
        new java.lang.Thread(new abcd.Runnablemw(r9, r10, r7)).start();     // Catch: java.lang.Throwable -> L28
        if (r6 == false) goto L18;
        long r11 = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L28
        u7 = true;     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L13
        gn.wait(1000);     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L13
        com.appfour.backbone.api.runtime.RuntimeDebug.initialProbeLoadAttempted = true;     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L13
        com.appfour.backbone.api.runtime.RuntimeDebug.initialProbeLoadTime = java.lang.System.currentTimeMillis() - r11;     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L13
        com.appfour.backbone.api.runtime.RuntimeDebug.initialProbeLoadSuccess = tp;     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L13
        abcd.yw.j6("Probes", "Waited for load " + com.appfour.backbone.api.runtime.RuntimeDebug.initialProbeLoadTime + "ms");     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L13
    L9:
        u7 = false;     // Catch: java.lang.Throwable -> L28
        goto L18
    L13:
        e = move-exception;
        abcd.yw.j6("Probes", "Unexpected InterruptedException", e);     // Catch: java.lang.Throwable -> L11
    L11:
        th = move-exception;
        u7 = false;     // Catch: java.lang.Throwable -> L28
        throw th;     // Catch: java.lang.Throwable -> L28
    L18:
        java.io.File r12 = u7();     // Catch: java.lang.Throwable -> L28
        java.io.File r13 = gn();     // Catch: java.lang.Throwable -> L28
        if (r12.exists() == true) goto L21;
    L23:
        if (r13 == null) goto L25;
        abcd.yw.j6("Probes", "Opening built-in probes " + r13.getName());     // Catch: java.lang.Throwable -> L28
        DW(FH(r13), r6);     // Catch: java.lang.Throwable -> L28
    L26:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L28
        return;
    L25:
        abcd.yw.j6("Probes", "Opening no probes");     // Catch: java.lang.Throwable -> L28
        DW(null, r6);     // Catch: java.lang.Throwable -> L28
        goto L26
    L21:
        if (r12.lastModified() <= r7) goto L23;
        abcd.yw.j6("Probes", "Opening downloaded probes " + r12);     // Catch: java.lang.Throwable -> L28
        DW(FH(r12), r6);     // Catch: java.lang.Throwable -> L28
    L28:
        th = move-exception;
        throw th;
    }

    public static boolean j6(java.lang.String r2) {
        java.util.Iterator<abcd.lw> r0 = j6.iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        if (r0.next().DW().equals(r2) == false) goto L4;
        return true;
    L9:
        return false;
    }

    static boolean j6(boolean r0) {
        tp = r0;
        return r0;
    }

    private static java.io.File tp() {
        java.io.File r1 = abcd.rw.FH();
        if (abcd.sw.j6() == false) goto L5;
        java.lang.String r2 = "dev.download.apk";
    L7:
        return new java.io.File(r1, r2);
    L5:
        r2 = "public.download.apk";
        goto L7
    }

    private static java.io.File u7() {
        java.io.File r1 = abcd.rw.FH();
        if (abcd.sw.j6() == false) goto L5;
        java.lang.String r2 = "dev.current.apk";
    L7:
        return new java.io.File(r1, r2);
    L5:
        r2 = "public.current.apk";
        goto L7
    }

    static java.lang.Object v5() {
        return Zo;
    }
}
