package abcd;

@abcd.Interfacexu
public class Nk {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 3341818493184479973L)
    private java.util.Map<java.lang.String, abcd.Nk.a> FH;

    @abcd.Interfaceru(field = -1878127403064568543L)
    private java.util.Map<java.lang.String, java.lang.Long> Hw;

    @abcd.Interfaceru(field = 4284879620496039600L)
    private java.util.List<abcd.Nk.c> VH;

    @abcd.Interfaceru(field = -4058998535535812919L)
    private java.lang.String Zo;

    @abcd.Interfaceru(field = -1689585117634895104L)
    private abcd.Nk.b v5;

    public interface a {
        void DW(int r1, int r2, int r3, int r4, int r5, int r6);

        void DW(com.aide.engine.FileHighlightings r1);

        boolean Hw();

        boolean J0();

        java.util.List<java.lang.String> VH();

        java.lang.String Ws();

        void close();

        long getVersion();

        void gn();

        void j6();

        void j6(int r1, int r2);

        void j6(int r1, int r2, int r3, int r4, int r5, int r6);

        void j6(int r1, int r2, int r3, int r4, java.lang.String r5, boolean r6, boolean r7);

        void j6(com.aide.engine.FileHighlightings r1);

        void j6(com.aide.engine.I r1);

        void j6(java.lang.String r1);

        boolean we();
    }

    public interface b {
        void DW(java.lang.String r1);

        abcd.Nk.a FH(java.lang.String r1);

        java.lang.String getVisibleFile();

        void j6(java.lang.String r1);
    }

    public interface c {
        void j6(com.aide.engine.FileHighlightings r1);
    }

    static {
        abcd.wu.j6(abcd.Nk.class, -87904726456966265L, -87904726456966265L);
    }

    public Nk() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1338968642929473196L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1338968642929473196L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.LinkedHashMap();     // Catch: java.lang.Throwable -> L8
        this.Hw = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        this.VH = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 1778526216650971260L)
    private void DW(java.lang.String r8, abcd.Nk.a r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1352180520473043677L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1352180520473043677L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.U.EQ().j6(r8, new abcd.BinderMk(this, r9));     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -7147144284661230064L)
    private void EQ(java.lang.String r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -197953105390214241L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-197953105390214241L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (FH(r5) == true) goto L17;
        j6(r5, this.v5.FH(r5));     // Catch: java.lang.Throwable -> L10
        return;
    }

    @abcd.Interfacesu(method = 922088855067616243L)
    private abcd.Nk.a J8() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2756931129524890112L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2756931129524890112L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.get(this.v5.getVisibleFile());
    }

    @abcd.Interfacesu(method = 1494067517719136712L)
    private void Ws() {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 4002116798050869483L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4002116798050869483L, this);     // Catch: java.lang.Throwable -> L15
    L6:
        java.lang.String r2 = "";
        java.util.Iterator<java.lang.String> r3 = this.FH.keySet().iterator();     // Catch: java.lang.Throwable -> L15
    L8:
        if (r3.hasNext() == false) goto L13;
        java.lang.String r4 = r3.next();     // Catch: java.lang.Throwable -> L15
        if (r2.length() <= 0) goto L12;
        r2 = r2 + ";";     // Catch: java.lang.Throwable -> L15
    L12:
        r2 = r2 + r4;     // Catch: java.lang.Throwable -> L15
        goto L8
    L13:
        android.content.SharedPreferences.Editor r5 = com.aide.ui.U.Zo().getSharedPreferences("OpenFileService", 0).edit();     // Catch: java.lang.Throwable -> L15
        r5.putString("CurrentFiles", r2);     // Catch: java.lang.Throwable -> L15
        r5.commit();     // Catch: java.lang.Throwable -> L15
    }

    @abcd.Interfacesu(method = 82251575639683184L)
    private boolean gn(java.lang.String r11) {
    L37:
        th = move-exception;
        if (DW == false) goto L42;
        abcd.wu.j6(th, 6381402056394372825L, this, r11);
    L42:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6381402056394372825L, this, r11);     // Catch: java.lang.Throwable -> L37
    L6:
        java.lang.String r2 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r3 = this.FH.entrySet().iterator();     // Catch: java.lang.Throwable -> L37
    L8:
        if (r3.hasNext() == false) goto L19;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r4 = r3.next();     // Catch: java.lang.Throwable -> L37
        java.lang.String r5 = r4.getKey();     // Catch: java.lang.Throwable -> L37
        abcd.Nk.a r6 = r4.getValue();     // Catch: java.lang.Throwable -> L37
        if (r5.equals(r11) == true) goto L8;
        if (r6.J0() == true) goto L8;
        if (r6.Hw() == true) goto L8;
        if (r2 == null) goto L18;
        if (u7(r2) <= u7(r5)) goto L8;
    L18:
        r2 = r5;
        goto L8
    L19:
        if (r2 != null) goto L31;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r7 = this.FH.entrySet().iterator();     // Catch: java.lang.Throwable -> L37
    L22:
        if (r7.hasNext() == false) goto L31;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r8 = r7.next();     // Catch: java.lang.Throwable -> L37
        java.lang.String r9 = r8.getKey();     // Catch: java.lang.Throwable -> L37
        abcd.Nk.a r10 = r8.getValue();     // Catch: java.lang.Throwable -> L37
        if (r9.equals(r11) == true) goto L22;
        if (r10.J0() == true) goto L22;
        if (r2 == null) goto L30;
        if (u7(r2) <= u7(r9)) goto L22;
    L30:
        r2 = r9;
    L31:
        if (r2 == null) goto L35;
        j6(r2);     // Catch: java.lang.Throwable -> L37
        return true;
    L35:
        return false;
    }

    static java.util.List j6(abcd.Nk r0) {
        return r0.VH;
    }

    @abcd.Interfacesu(method = -21142779532829293L)
    private void j6(java.lang.String r8, abcd.Nk.a r9) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 5124669159317979600L, this, r8, r9);
    L17:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(5124669159317979600L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
    L5:
        this.FH.put(r8, r9);     // Catch: java.lang.Throwable -> L12
        DW(r8, r9);     // Catch: java.lang.Throwable -> L12
    L6:
        if (this.FH.size() <= 10) goto L11;
        if (gn(r8) == true) goto L6;
        return;
    }

    @abcd.Interfacesu(method = -1203837560873770563L)
    private boolean tp(java.lang.String r5) {
    L36:
        th = move-exception;
        if (DW == false) goto L40;
        abcd.wu.j6(th, 5085031610605026512L, this, r5);
    L40:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5085031610605026512L, this, r5);     // Catch: java.lang.Throwable -> L36
    L6:
        java.lang.String r6 = r5.toLowerCase();     // Catch: java.lang.Throwable -> L36
        if (r6.endsWith(".java") == false) goto L9;
    L34:
        return true;
    L9:
        if (r6.endsWith(".class") == true) goto L34;
        if (r6.endsWith(".xml") == true) goto L34;
        if (r6.endsWith(".c") == true) goto L34;
        if (r6.endsWith(".cpp") == true) goto L34;
        if (r6.endsWith(".cc") == true) goto L34;
        if (r6.endsWith(".h") == true) goto L34;
        if (r6.endsWith(".hh") == true) goto L34;
        if (r6.endsWith(".hpp") == true) goto L34;
        if (r6.endsWith(".html") == true) goto L34;
        if (r6.endsWith(".htm") == true) goto L34;
        if (r6.endsWith(".css") == true) goto L34;
        if (r6.endsWith(".js") == true) goto L34;
        return false;
    }

    @abcd.Interfacesu(method = -1576652306346077805L)
    private long u7(java.lang.String r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -382766286572144000L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-382766286572144000L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.Hw.containsKey(r5) == false) goto L10;
        return this.Hw.get(r5).longValue();
    L10:
        return 0;
    }

    public abcd.Nk.a DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2839078665596249356L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2839078665596249356L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.get(r5);
    }

    public java.lang.String DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2053160169550986925L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2053160169550986925L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.v5.getVisibleFile();
    }

    public void DW(abcd.Nk.c r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 125863297883366576L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(125863297883366576L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.VH.remove(r5);     // Catch: java.lang.Throwable -> L8
    }

    public boolean DW(boolean r8, boolean r9) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, 5473762685545180000L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
    L24:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(5473762685545180000L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L19
    L5:
        boolean r0 = com.aide.ui.U.vy().Mr();     // Catch: java.lang.Throwable -> L19
        boolean r1 = true;
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L19
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r3 = this.FH.entrySet().iterator();     // Catch: java.lang.Throwable -> L19
    L7:
        if (r3.hasNext() == false) goto L16;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r4 = r3.next();     // Catch: java.lang.Throwable -> L19
        java.lang.String r5 = r4.getKey();     // Catch: java.lang.Throwable -> L19
        abcd.Nk.a r6 = r4.getValue();     // Catch: java.lang.Throwable -> L19
        if (r6.J0() == false) goto L7;
        if (r0 == false) goto L11;
        r1 = false;
        goto L7
    L11:
        if (r8 == false) goto L13;
        r2.add(r5);     // Catch: java.lang.Throwable -> L19
    L13:
        r6.gn();     // Catch: java.lang.Throwable -> L19
        goto L7
    L16:
        if (r2.isEmpty() == true) goto L18;
        com.aide.ui.U.vy().j6(r2, r9);     // Catch: java.lang.Throwable -> L19
    L18:
        return r1;
    }

    public boolean EQ() {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, 5859948262588820232L, this);
    L22:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(5859948262588820232L, this);     // Catch: java.lang.Throwable -> L17
    L7:
        if (com.aide.ui.U.vy().Mr() == true) goto L9;
        return false;
    L9:
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r2 = this.FH.entrySet().iterator();     // Catch: java.lang.Throwable -> L17
    L10:
        if (r2.hasNext() == false) goto L16;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r4 = r2.next();     // Catch: java.lang.Throwable -> L17
        java.lang.String r5 = r4.getKey();     // Catch: java.lang.Throwable -> L17
        if (r4.getValue().J0() == false) goto L10;
        return true;
    L16:
        return false;
    }

    public long FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4887642519519075669L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4887642519519075669L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return J8().getVersion();
    }

    public boolean FH(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1947299949793172135L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1947299949793172135L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.containsKey(r5);
    }

    public void Hw() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2115440843655470981L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-2115440843655470981L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    public void Hw(java.lang.String r12) {
    L31:
        th = move-exception;
        if (DW == false) goto L36;
        abcd.wu.j6(th, -5779111451015901571L, this, r12);
    L36:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-5779111451015901571L, this, r12);     // Catch: java.lang.Throwable -> L31
    L7:
        if (com.aide.ui.U.dx() == false) goto L10;
        return;
    L10:
        if (com.aide.ui.U.lg().FH("android.permission.WRITE_EXTERNAL_STORAGE") == true) goto L13;
        return;
    L13:
        if (r12 != null) goto L38;
        int r6 = 0;
        java.lang.String r4 = com.aide.ui.U.Zo().getSharedPreferences("OpenFileService", 0).getString("CurrentFiles", null);     // Catch: java.lang.Throwable -> L31
        if (r4 == null) goto L49;
        java.lang.String[] r5 = r4.split(";");     // Catch: java.lang.Throwable -> L31
        java.util.HashSet r7 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L31
        int r8 = r5.length;     // Catch: java.lang.Throwable -> L31
    L20:
        if (r6 >= r8) goto L51;
        java.lang.String r9 = r5[r6];     // Catch: java.lang.Throwable -> L31
        if (abcd.Vl.Hw(r9) == false) goto L29;
        if (r7.contains(r9) == true) goto L29;
        r7.add(r9);     // Catch: java.lang.Throwable -> L31
        EQ(r9);     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L31
    L28:
        com.almlkaide.kaypro.util.Toasty.toast(com.aide.ui.U.Zo(), r9 + " could not be loaded!", 1).show();     // Catch: java.lang.Throwable -> L31
    L29:
        r6 = r6 + 1;
        goto L20
    L51:
        return;
    L49:
        return;
    L38:
        EQ(r12);     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L31
    L50:
        return;
    L16:
        com.almlkaide.kaypro.util.Toasty.toast(com.aide.ui.U.Zo(), r12 + " could not be loaded!", 1).show();     // Catch: java.lang.Throwable -> L31
    }

    public void J0() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2613001169087778920L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2613001169087778920L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.Zo == null) goto L17;
        this.FH.get(this.Zo).gn();     // Catch: java.lang.Throwable -> L10
        this.Zo = null;     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void VH(java.lang.String r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2253935147280698560L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2253935147280698560L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (FH(r5) == false) goto L17;
        this.v5.j6(r5);     // Catch: java.lang.Throwable -> L10
        return;
    }

    public boolean VH() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -31092515674709195L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-31092515674709195L, this);     // Catch: java.lang.Throwable -> L15
    L7:
        if (tp() == true) goto L9;
    L13:
        return false;
    L9:
        if (DW().toLowerCase().endsWith(".java") == false) goto L13;
        if (com.aide.ui.U.vy().j3() == false) goto L13;
        return true;
    }

    public void Zo(java.lang.String r7) {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -5343616341563854331L, this, r7);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5343616341563854331L, this, r7);     // Catch: java.lang.Throwable -> L18
    L6:
        java.util.HashSet r2 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L18
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r3 = this.FH.entrySet().iterator();     // Catch: java.lang.Throwable -> L18
    L8:
        if (r3.hasNext() == false) goto L12;
        java.lang.String r4 = r3.next().getKey();     // Catch: java.lang.Throwable -> L18
        if (abcd.Vl.Hw(r7, r4) == false) goto L8;
        r2.add(r4);     // Catch: java.lang.Throwable -> L18
        goto L8
    L12:
        java.util.Iterator r5 = r2.iterator();     // Catch: java.lang.Throwable -> L18
    L13:
        if (r5.hasNext() == false) goto L17;
        j6((java.lang.String) r5.next());     // Catch: java.lang.Throwable -> L18
        goto L13
    }

    public boolean Zo() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -601302454056802264L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-601302454056802264L, this);     // Catch: java.lang.Throwable -> L15
    L7:
        if (tp() == true) goto L9;
    L13:
        return false;
    L9:
        if (tp(DW()) == false) goto L13;
        if (com.aide.ui.U.vy().j3() == false) goto L13;
        return true;
    }

    public boolean gn() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 4036160922200731011L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(4036160922200731011L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (DW() == null) goto L11;
        if (abcd.Vl.QX(DW()) == true) goto L11;
        return true;
    L11:
        return false;
    }

    public void j6() {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 2373430768077397904L, this);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2373430768077397904L, this);     // Catch: java.lang.Throwable -> L18
    L6:
        java.util.HashSet r2 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L18
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r3 = this.FH.entrySet().iterator();     // Catch: java.lang.Throwable -> L18
    L8:
        if (r3.hasNext() == false) goto L12;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r4 = r3.next();     // Catch: java.lang.Throwable -> L18
        if (r4.getValue().J0() == true) goto L8;
        r2.add(r4.getKey());     // Catch: java.lang.Throwable -> L18
        goto L8
    L12:
        java.util.Iterator r5 = r2.iterator();     // Catch: java.lang.Throwable -> L18
    L13:
        if (r5.hasNext() == false) goto L17;
        j6((java.lang.String) r5.next());     // Catch: java.lang.Throwable -> L18
        goto L13
    }

    public void j6(abcd.Nk.b r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -392602682715779349L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-392602682715779349L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5 = r5;     // Catch: java.lang.Throwable -> L8
    }

    public void j6(abcd.Nk.c r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -6231401113002562809L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6231401113002562809L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.VH.add(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -6692914938708381609L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6692914938708381609L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.get(r5).close();     // Catch: java.lang.Throwable -> L8
        this.FH.remove(r5);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.EQ().FH(r5);     // Catch: java.lang.Throwable -> L8
        this.v5.DW(r5);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.EQ().VH();     // Catch: java.lang.Throwable -> L8
        Ws();     // Catch: java.lang.Throwable -> L8
    }

    public void j6(java.lang.String r8, java.lang.String r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -1216992331299820640L, this, r8, r9);
    L22:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1216992331299820640L, this, r8, r9);     // Catch: java.lang.Throwable -> L17
    L5:
        java.util.HashMap r0 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L17
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r1 = this.FH.entrySet().iterator();     // Catch: java.lang.Throwable -> L17
    L7:
        if (r1.hasNext() == false) goto L11;
        java.lang.String r2 = r1.next().getKey();     // Catch: java.lang.Throwable -> L17
        if (abcd.Vl.Hw(r8, r2) == false) goto L7;
        r0.put(r2, abcd.Vl.j6(r2, r8, r9));     // Catch: java.lang.Throwable -> L17
        goto L7
    L11:
        java.util.Iterator r3 = r0.entrySet().iterator();     // Catch: java.lang.Throwable -> L17
    L12:
        if (r3.hasNext() == false) goto L16;
        java.util.Map.Entry r4 = (java.util.Map.Entry) r3.next();     // Catch: java.lang.Throwable -> L17
        java.lang.String r5 = (java.lang.String) r4.getKey();     // Catch: java.lang.Throwable -> L17
        java.lang.String r6 = (java.lang.String) r4.getValue();     // Catch: java.lang.Throwable -> L17
        com.aide.ui.U.EQ().FH(r5, r6);     // Catch: java.lang.Throwable -> L17
        this.FH.get(r5).j6(r6);     // Catch: java.lang.Throwable -> L17
        this.FH.put(r6, this.FH.get(r5));     // Catch: java.lang.Throwable -> L17
        this.FH.remove(r5);     // Catch: java.lang.Throwable -> L17
        goto L12
    }

    public void j6(java.lang.String r8, boolean r9) {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -106975686406521920L, this, r8, new java.lang.Boolean(r9));
    L20:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-106975686406521920L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L16
    L6:
        if (r8.equals(DW()) == true) goto L23;
        boolean r0 = FH(r8);     // Catch: java.lang.Throwable -> L16
        EQ(r8);     // Catch: java.lang.Throwable -> L16
        if (FH(r8) == true) goto L10;
        return;
    L10:
        if (r0 == true) goto L12;
        com.aide.ui.U.tp().Hw(r8);     // Catch: java.lang.Throwable -> L16
    L12:
        if (r9 == false) goto L14;
        this.v5.j6(r8);     // Catch: java.lang.Throwable -> L16
    L14:
        this.Hw.put(r8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));     // Catch: java.lang.Throwable -> L16
        Ws();     // Catch: java.lang.Throwable -> L16
        return;
    }

    public void j6(java.util.List<java.lang.String> r9) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -581308408511950144L, this, r9);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-581308408511950144L, this, r9);     // Catch: java.lang.Throwable -> L19
    L6:
        int r3 = 0;
    L7:
        if (r3 >= r9.size()) goto L18;
        java.lang.String r5 = r9.get(r3);     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L19
        if (r3 != 0) goto L13;
        boolean r6 = true;
    L14:
        j6(r5, r6);     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L19
    L17:
        r3 = r3 + 1;
        goto L7
    L13:
        r6 = false;
    L16:
        com.almlkaide.kaypro.util.Toasty.toast(com.aide.ui.U.Zo(), r9.get(r3) + " could not be loaded!", 1).show();     // Catch: java.lang.Throwable -> L19
        goto L17
    }

    public void j6(boolean r8) {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -510165287874117215L, this, new java.lang.Boolean(r8));
    L22:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-510165287874117215L, this, r8);     // Catch: java.lang.Throwable -> L17
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L17
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r3 = this.FH.entrySet().iterator();     // Catch: java.lang.Throwable -> L17
    L8:
        if (r3.hasNext() == false) goto L13;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r4 = r3.next();     // Catch: java.lang.Throwable -> L17
        java.lang.String r5 = r4.getKey();     // Catch: java.lang.Throwable -> L17
        abcd.Nk.a r6 = r4.getValue();     // Catch: java.lang.Throwable -> L17
        if (r6.we() == false) goto L8;
        r6.j6();     // Catch: java.lang.Throwable -> L17
        r2.add(r5);     // Catch: java.lang.Throwable -> L17
        goto L8
    L13:
        if (r2.isEmpty() == true) goto L31;
        if (r8 == false) goto L32;
        com.aide.ui.U.vy().j6(r2, false);     // Catch: java.lang.Throwable -> L17
        return;
    L32:
        return;
    }

    public void j6(boolean r8, boolean r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1984351752503026935L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1984351752503026935L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        DW(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public boolean tp() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 4231070054278013269L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4231070054278013269L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (DW() == null) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean u7() {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 2841200173454170325L, this);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2841200173454170325L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return !this.FH.isEmpty();
    }

    public abcd.Nk.a v5(java.lang.String r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 5049133857911600640L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5049133857911600640L, this, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        abcd.Nk.a r2 = DW(r5);     // Catch: java.lang.Throwable -> L11
        if (r2 == null) goto L9;
        return r2;
    L9:
        J0();     // Catch: java.lang.Throwable -> L11
        this.Zo = r5;     // Catch: java.lang.Throwable -> L11
        abcd.Nk.a r3 = this.v5.FH(r5);     // Catch: java.lang.Throwable -> L11
        j6(r5, r3);     // Catch: java.lang.Throwable -> L11
        return r3;
    }

    public void v5() {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 2627275423547542415L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2627275423547542415L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.Nk.a>> r2 = this.FH.entrySet().iterator();     // Catch: java.lang.Throwable -> L12
    L8:
        if (r2.hasNext() == false) goto L10;
        java.util.Map.Entry<java.lang.String, abcd.Nk.a> r3 = r2.next();     // Catch: java.lang.Throwable -> L12
        DW(r3.getKey(), r3.getValue());     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        com.aide.ui.U.EQ().j6(new abcd.BinderLk(this));     // Catch: java.lang.Throwable -> L12
    }

    public boolean we() {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -1302760480657514416L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1302760480657514416L, this);     // Catch: java.lang.Throwable -> L15
    L6:
        java.util.Iterator<abcd.Nk.a> r2 = this.FH.values().iterator();     // Catch: java.lang.Throwable -> L15
    L7:
        if (r2.hasNext() == false) goto L13;
        if (r2.next().J0() == false) goto L7;
        return true;
    L13:
        return false;
    }
}
