package abcd;

@abcd.Interfacexu
public class Ak {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -1236040073591652185L)
    private java.util.Stack<abcd.Tl> FH;

    @abcd.Interfaceru(field = 3534759705357691235L)
    private java.util.Stack<abcd.Tl> Hw;

    @abcd.Interfaceru(field = -2325963860177649055L)
    private boolean v5;

    static {
        abcd.wu.j6(abcd.Ak.class, -2568124978831063665L, -2568124978831063665L);
    }

    public Ak() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4401915393407250160L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4401915393407250160L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.Stack();     // Catch: java.lang.Throwable -> L8
        this.Hw = new java.util.Stack();     // Catch: java.lang.Throwable -> L8
        this.v5 = true;     // Catch: java.lang.Throwable -> L8
    }

    public boolean DW() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -2611220453372752936L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2611220453372752936L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if (this.FH.size() < 2) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean FH() {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -3097916653371787260L, this);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3097916653371787260L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return !this.Hw.isEmpty();
    }

    public void Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1800355439682497736L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1800355439682497736L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.clear();     // Catch: java.lang.Throwable -> L8
        this.Hw.clear();     // Catch: java.lang.Throwable -> L8
    }

    public boolean Zo() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 169832627728397583L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(169832627728397583L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.v5;
    }

    public abcd.Tl j6() {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 393906118658419184L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(393906118658419184L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.FH.size() < 2) goto L8;
        abcd.Tl r2 = this.FH.pop();     // Catch: java.lang.Throwable -> L14
        abcd.Tl r3 = this.FH.peek();     // Catch: java.lang.Throwable -> L14
        if (abcd.Vl.Hw(r3.FH) == false) goto L7;
        this.Hw.push(r2);     // Catch: java.lang.Throwable -> L14
        return r3;
    L8:
        return null;
    }

    public void j6(abcd.Tl r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1231903758917089272L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1231903758917089272L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r5, false);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(abcd.Tl r8, boolean r9) {
    L18:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -671066657445355075L, this, r8, new java.lang.Boolean(r9));
    L22:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-671066657445355075L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L18
    L6:
        if (this.v5 == true) goto L8;
        return;
    L8:
        if (r8.FH == null) goto L26;
        if (r9 == false) goto L11;
    L15:
        this.Hw.clear();     // Catch: java.lang.Throwable -> L18
    L16:
        this.FH.add(r8);     // Catch: java.lang.Throwable -> L18
        return;
    L11:
        if (this.FH.empty() == true) goto L15;
        if (this.FH.peek().j6(r8) == false) goto L15;
        this.FH.pop();     // Catch: java.lang.Throwable -> L18
        goto L16
    }

    public void j6(boolean r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -59908897401973256L, this, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-59908897401973256L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5 = r5;     // Catch: java.lang.Throwable -> L8
    }

    public abcd.Tl v5() {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 157743917670144492L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(157743917670144492L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.Hw.isEmpty() == true) goto L8;
        abcd.Tl r2 = this.Hw.pop();     // Catch: java.lang.Throwable -> L14
        if (abcd.Vl.Hw(r2.FH) == false) goto L7;
        this.FH.add(r2);     // Catch: java.lang.Throwable -> L14
        return r2;
    L8:
        return null;
    }
}
