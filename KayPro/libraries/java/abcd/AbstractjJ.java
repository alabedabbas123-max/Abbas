package abcd;

public abstract class AbstractjJ {
    public static final abcd.WI DW = null;
    public static final abcd.WI FH = null;
    private static int[] Hw;
    private static final java.util.List<java.lang.ref.WeakReference<abcd.DJ>> j6 = null;
    private java.lang.String EQ;
    private boolean J0;
    private boolean J8;
    private boolean QX;
    private java.lang.String VH;
    private boolean Ws;
    private int XL;
    protected final abcd.HJ Zo;
    private abcd.NH aM;
    private java.util.List<abcd.WI> gn;
    private abcd.AbstractkI j3;
    private boolean tp;
    private abcd.EnumeJ u7;
    protected final abcd.UE v5;
    private java.util.List<abcd.WI> we;

    public static final enum a extends java.lang.Enum<abcd.AbstractjJ.a> {
        public static final abcd.AbstractjJ.a DW = null;
        private static final abcd.AbstractjJ.a[] FH = null;
        public static final abcd.AbstractjJ.a j6 = null;

        static {
            j6 = new abcd.AbstractjJ.a("FETCH", 0);
            DW = new abcd.AbstractjJ.a("PUSH", 1);
            FH = new abcd.AbstractjJ.a[]{j6, DW};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.AbstractjJ.a valueOf(java.lang.String r1) {
            return (abcd.AbstractjJ.a) java.lang.Enum.valueOf(abcd.AbstractjJ.a.class, r1);
        }

        public static abcd.AbstractjJ.a[] values() {
            abcd.AbstractjJ.a[] r0 = FH;
            int r1 = r0.length;
            abcd.AbstractjJ.a[] r2 = new abcd.AbstractjJ.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    static {
        j6 = new java.util.concurrent.CopyOnWriteArrayList();
        j6(abcd.zJ.Mr);
        j6(abcd.C1119oJ.Mr);
        j6(abcd.C0990lJ.Mr);
        j6(abcd.C1204qJ.Mr);
        j6(abcd.GJ.a8);
        j6(abcd.xJ.a8);
        j6(abcd.xJ.U2);
        j6(abcd.tJ.a8);
        aM();
        DW = new abcd.WI("refs/tags/*:refs/tags/*");
        FH = new abcd.WI("refs/heads/*:refs/heads/*");
    }

    protected AbstractjJ(abcd.UE r3, abcd.HJ r4) {
        this.VH = "git-upload-pack";
        this.gn = java.util.Collections.emptyList();
        this.u7 = abcd.EnumeJ.DW;
        this.tp = true;
        this.EQ = "git-receive-pack";
        this.we = java.util.Collections.emptyList();
        this.J0 = false;
        abcd.iJ r0 = (abcd.iJ) r3.Zo().j6(abcd.iJ.j6);
        this.v5 = r3;
        this.Zo = r4;
        this.Ws = r0.j6();
        this.j3 = abcd.AbstractkI.j6();
    }

    public static java.util.List<abcd.AbstractjJ> DW(abcd.UE r3, abcd.XI r4, abcd.AbstractjJ.a r5) {
        java.util.List<abcd.HJ> r6 = j6(r4, r5);
        java.util.ArrayList r0 = new java.util.ArrayList(r6.size());
        java.util.Iterator<abcd.HJ> r7 = r6.iterator();
    L4:
        if (r7.hasNext() == false) goto L5;
        abcd.AbstractjJ r1 = j6(r3, r7.next(), r4.DW());
        r1.j6(r4);
        r0.add(r1);
        goto L4
    L5:
        return r0;
    }

    public static java.util.List<abcd.AbstractjJ> DW(abcd.UE r2, java.lang.String r3, abcd.AbstractjJ.a r4) {
        abcd.XI r0 = new abcd.XI(r2.Zo(), r3);
        if (DW(r0) == false) goto L7;
        java.util.ArrayList r5 = new java.util.ArrayList(1);
        r5.add(j6(r2, new abcd.HJ(r3), null));
        return r5;
    L7:
        return DW(r2, r0, r4);
    }

    private static boolean DW(abcd.XI r1) {
        if (r1.gn().isEmpty() == true) goto L5;
        return false;
    L5:
        if (r1.Hw().isEmpty() == false) goto L10;
        return true;
    L10:
        return false;
    }

    private static void aM() {
        java.lang.ClassLoader r0 = java.lang.Thread.currentThread().getContextClassLoader();
        if (r0 != null) goto L5;
        r0 = abcd.AbstractjJ.class.getClassLoader();
    L5:
        java.util.Enumeration<java.net.URL> r1 = j6(r0);
    L7:
        if (r1.hasMoreElements() == false) goto L8;
        j6(r0, r1.nextElement());
        goto L7
    }

    public static abcd.AbstractjJ j6(abcd.UE r3, abcd.HJ r4, java.lang.String r5) {
        java.util.Iterator<java.lang.ref.WeakReference<abcd.DJ>> r0 = j6.iterator();
    L4:
        if (r0.hasNext() == false) goto L13;
        java.lang.ref.WeakReference<abcd.DJ> r1 = r0.next();
        abcd.DJ r2 = r1.get();
        if (r2 == null) goto L7;
        if (r2.j6(r4, r3, r5) == false) goto L4;
        return r2.DW(r4, r3, r5);
    L7:
        j6.remove(r1);
        goto L4
    L13:
        throw new abcd.jD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().URINotSupported, new java.lang.Object[]{r4}));
    }

    public static abcd.AbstractjJ j6(abcd.UE r2, abcd.XI r3, abcd.AbstractjJ.a r4) {
        java.util.List<abcd.HJ> r5 = j6(r3, r4);
        if (r5.isEmpty() == true) goto L7;
        abcd.AbstractjJ r6 = j6(r2, r5.get(0), r3.DW());
        r6.j6(r3);
        return r6;
    L7:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().remoteConfigHasNoURIAssociated, new java.lang.Object[]{r3.DW()}));
    }

    public static abcd.AbstractjJ j6(abcd.UE r1, java.lang.String r2) {
        return j6(r1, r2, abcd.AbstractjJ.a.j6);
    }

    public static abcd.AbstractjJ j6(abcd.UE r2, java.lang.String r3, abcd.AbstractjJ.a r4) {
        abcd.XI r0 = new abcd.XI(r2.Zo(), r3);
        if (DW(r0) == false) goto L7;
        return j6(r2, new abcd.HJ(r3), null);
    L7:
        return j6(r2, r0, r4);
    }

    private static java.lang.String j6(java.lang.String r2, java.util.Collection<abcd.WI> r3) {
        java.util.Iterator<abcd.WI> r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L5;
        abcd.WI r0 = r4.next();
        if (r0.v5(r2) == false) goto L4;
        if (r0.Hw() == false) goto L14;
        return r0.DW(r2).j6();
    L14:
        return r0.j6();
    L5:
        return null;
    }

    private static java.util.Collection<abcd.WI> j6(abcd.UE r5, java.util.Collection<abcd.WI> r6) {
        java.util.Map<java.lang.String, abcd.ME> r7 = r5.v5();
        java.util.HashSet r0 = new java.util.HashSet();
        java.util.Iterator<abcd.WI> r8 = r6.iterator();
    L4:
        if (r8.hasNext() == false) goto L5;
        abcd.WI r1 = r8.next();
        if (r1.Hw() == true) goto L8;
        r0.add(r1);
        goto L4
    L8:
        java.util.Iterator<abcd.ME> r2 = r7.values().iterator();
    L10:
        if (r2.hasNext() == false) goto L4;
        abcd.ME r3 = r2.next();
        if (r1.DW(r3) == false) goto L10;
        r0.add(r1.j6(r3));
        goto L10
    L5:
        return r0;
    }

    public static java.util.Collection<abcd.YI> j6(abcd.UE r11, java.util.Collection<abcd.WI> r12, java.util.Collection<abcd.WI> r13) {
        if (r13 != null) goto L4;
        r13 = java.util.Collections.emptyList();
    L4:
        java.util.LinkedList r0 = new java.util.LinkedList();
        java.util.Iterator<abcd.WI> r14 = j6(r11, r12).iterator();
    L6:
        if (r14.hasNext() == false) goto L7;
        abcd.WI r1 = r14.next();
        java.lang.String r2 = r1.DW();
        abcd.ME r3 = r11.j6(r2);
        if (r3 == null) goto L11;
        r2 = r3.getName();
    L11:
        java.lang.String r6 = r2;
        java.lang.String r4 = r1.j6();
        if (r4 != null) goto L14;
        r4 = r6;
    L14:
        if (r3 == null) goto L18;
        if (r4.startsWith("refs/") == true) goto L18;
        java.lang.String r5 = r3.getName();
        r4 = java.lang.String.valueOf(r5.substring(0, r5.indexOf(47, 5) + 1)) + r4;
    L18:
        java.lang.String r7 = r4;
        r0.add(new abcd.YI(r11, r6, r7, r1.FH(), j6(r7, r13), null));
        goto L6
    L7:
        return r0;
    }

    private static java.util.Enumeration<java.net.URL> j6(java.lang.ClassLoader r2) {
        return r2.getResources("META-INF/services/" + abcd.AbstractjJ.class.getName());
    L5:
        return new java.util.Vector().elements();
    }

    private static java.util.List<abcd.HJ> j6(abcd.XI r2, abcd.AbstractjJ.a r3) {
        int r0 = j6()[r3.ordinal()];
        if (r0 == 1) goto L13;
        if (r0 != 2) goto L11;
        java.util.List<abcd.HJ> r4 = r2.Hw();
        if (r4.isEmpty() == true) goto L9;
        return r4;
    L9:
        return r2.gn();
    L11:
        throw new java.lang.IllegalArgumentException(r3.toString());
    L13:
        return r2.gn();
    }

    public static void j6(abcd.DJ r2) {
        j6.add(0, new java.lang.ref.WeakReference(r2));
    }

    private static void j6(java.lang.ClassLoader r4, java.lang.String r5) {
        int r0 = 0;
        java.lang.reflect.Field[] r6 = java.lang.Class.forName(r5, false, r4).getDeclaredFields();
        int r7 = r6.length;
    L5:
        if (r0 >= r7) goto L6;
        java.lang.reflect.Field r1 = r6[r0];
        if ((r1.getModifiers() & 8) != 8) goto L15;
        if (abcd.DJ.class.isAssignableFrom(r1.getType()) == false) goto L15;
        abcd.DJ r2 = (abcd.DJ) r1.get(null);     // Catch: java.lang.Throwable -> L17
        if (r2 == null) goto L15;
        j6(r2);
    L15:
        r0 = r0 + 1;
        goto L5
    L6:
        return;
    }

    private static void j6(java.lang.ClassLoader r3, java.net.URL r4) {
        java.io.BufferedReader r0 = new java.io.BufferedReader(new java.io.InputStreamReader(r4.openStream(), "UTF-8"));     // Catch: java.io.IOException -> L19
    L24:
        java.lang.String r5 = r0.readLine();     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L13
        if (r5 == null) goto L5;
        if (r5.length() <= 0) goto L24;
        if (r5.startsWith("#") == true) goto L24;
        j6(r3, r5);     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L13
    L13:
        th = move-exception;
        r0.close();     // Catch: java.io.IOException -> L18
    L15:
        throw th;
    L5:
        r0.close();     // Catch: java.io.IOException -> L19
        return;
    }

    static int[] j6() {
        int[] r0 = Hw;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.AbstractjJ.a.values().length];
        r1[abcd.AbstractjJ.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L10
    L12:
        r1[abcd.AbstractjJ.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L11
    L8:
        Hw = r1;
        return r1;
    }

    public static java.util.List<abcd.DJ> u7() {
        java.util.ArrayList r1 = new java.util.ArrayList(j6.size());
        java.util.Iterator<java.lang.ref.WeakReference<abcd.DJ>> r0 = j6.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        java.lang.ref.WeakReference<abcd.DJ> r2 = r0.next();
        abcd.DJ r3 = r2.get();
        if (r3 != null) goto L9;
        j6.remove(r2);
        goto L4
    L9:
        r1.add(r3);
        goto L4
    L6:
        return java.util.Collections.unmodifiableList(r1);
    }

    public abcd.NI DW(abcd.LE r5, java.util.Collection<abcd.YI> r6) {
        if (r6 != null) goto L4;
    L15:
        r6 = j6(this.we);     // Catch: java.io.IOException -> L12
        if (r6.isEmpty() == true) goto L11;
    L9:
        return new abcd.MI(this, r6).j6(r5);
    L11:
        throw new abcd.yD(org.eclipse.jgit.JGitText.j6().nothingToPush);
    L12:
        e = move-exception;
        throw new abcd.yD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().problemWithResolvingPushRefSpecsLocally, new java.lang.Object[]{e.getMessage()}), e);
    L4:
        if (r6.isEmpty() == false) goto L9;
        goto L15
    }

    public abstract void DW();

    public void DW(java.lang.String r2) {
        if (r2 != null) goto L4;
    L6:
        this.VH = "git-upload-pack";
        return;
    L4:
        if (r2.length() <= 0) goto L6;
        this.VH = r2;
    }

    public void DW(boolean r1) {
        this.J8 = r1;
    }

    public boolean EQ() {
        return this.Ws;
    }

    public abcd.AbstractkI FH() {
        return this.j3;
    }

    public void FH(boolean r1) {
        this.tp = r1;
    }

    public java.lang.String Hw() {
        return this.EQ;
    }

    public void Hw(boolean r1) {
        this.J0 = r1;
    }

    public boolean J0() {
        return this.tp;
    }

    public boolean J8() {
        return this.J0;
    }

    public abstract abcd.InterfacenI QX();

    public abcd.EnumeJ VH() {
        return this.u7;
    }

    public boolean Ws() {
        return this.QX;
    }

    public abstract abcd.LI XL();

    public abcd.NH Zo() {
        if (this.aM != null) goto L6;
        this.aM = new abcd.NH(this.v5);
    L6:
        return this.aM;
    }

    public int gn() {
        return this.XL;
    }

    public abcd.qI j6(abcd.LE r7, java.util.Collection<abcd.WI> r8) {
        if (r8 == null) goto L21;
        if (r8.isEmpty() == true) goto L21;
        if (this.gn.isEmpty() == true) goto L23;
        java.util.ArrayList r0 = new java.util.ArrayList(r8);
        java.util.Iterator<abcd.WI> r1 = r8.iterator();
    L10:
        if (r1.hasNext() == false) goto L11;
        java.lang.String r2 = r1.next().DW();
        java.util.Iterator<abcd.WI> r3 = this.gn.iterator();
    L14:
        if (r3.hasNext() == false) goto L10;
        abcd.WI r9 = r3.next();
        java.lang.String r4 = r9.DW();
        java.lang.String r5 = r9.j6();
        if (r4.equals(r2) == false) goto L14;
        if (r5 == null) goto L14;
        r0.add(r9);
        goto L10
    L11:
        r8 = r0;
    L23:
        abcd.qI r6 = new abcd.qI();
        new abcd.C1161pI(this, r8).j6(r7, r6);
        return r6;
    L21:
        if (this.gn.isEmpty() == true) goto L26;
        r8 = this.gn;
        goto L23
    L26:
        throw new abcd.yD(org.eclipse.jgit.JGitText.j6().nothingToFetch);
    }

    public java.util.Collection<abcd.YI> j6(java.util.Collection<abcd.WI> r3) {
        return j6(this.v5, r3, this.gn);
    }

    public void j6(int r1) {
        this.XL = r1;
    }

    public void j6(abcd.XI r2) {
        DW(r2.u7());
        j6(r2.v5());
        j6(r2.Zo());
        this.gn = r2.j6();
        this.we = r2.FH();
        this.XL = r2.VH();
    }

    public void j6(abcd.EnumeJ r1) {
        if (r1 != null) goto L5;
        r1 = abcd.EnumeJ.j6;
    L5:
        this.u7 = r1;
    }

    public void j6(abcd.AbstractkI r1) {
        this.j3 = r1;
    }

    public void j6(java.lang.String r2) {
        if (r2 != null) goto L4;
    L6:
        this.EQ = "git-receive-pack";
        return;
    L4:
        if (r2.length() <= 0) goto L6;
        this.EQ = r2;
    }

    public void j6(boolean r1) {
        this.Ws = r1;
    }

    public abcd.HJ tp() {
        return this.Zo;
    }

    public java.lang.String v5() {
        return this.VH;
    }

    public void v5(boolean r1) {
        this.QX = r1;
    }

    public boolean we() {
        return this.J8;
    }
}
