package abcd;

public class XI implements java.io.Serializable {
    private java.util.List<abcd.HJ> DW;
    private java.util.List<abcd.HJ> FH;
    private java.util.List<abcd.WI> Hw;
    private java.lang.String VH;
    private java.lang.String Zo;
    private abcd.EnumeJ gn;
    private java.lang.String j6;
    private int tp;
    private boolean u7;
    private java.util.List<abcd.WI> v5;

    public XI(abcd.gE r8, java.lang.String r9) {
        this.j6 = r9;
        java.lang.String[] r10 = r8.DW("remote", this.j6, "url");
        this.DW = new java.util.ArrayList(r10.length);
        int r1 = r10.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L4;
        java.lang.String r4 = r10[r3];
        this.DW.add(new abcd.HJ(r4));
        r3 = r3 + 1;
        goto L3
    L4:
        java.lang.String[] r5 = r8.DW("remote", this.j6, "pushurl");
        this.FH = new java.util.ArrayList(r5.length);
        int r6 = r5.length;
        int r11 = 0;
    L5:
        if (r11 >= r6) goto L6;
        java.lang.String r2 = r5[r11];
        this.FH.add(new abcd.HJ(r2));
        r11 = r11 + 1;
        goto L5
    L6:
        java.lang.String[] r7 = r8.DW("remote", this.j6, "fetch");
        this.Hw = new java.util.ArrayList(r7.length);
        int r12 = r7.length;
        int r13 = 0;
    L7:
        if (r13 >= r12) goto L8;
        java.lang.String r14 = r7[r13];
        this.Hw.add(new abcd.WI(r14));
        r13 = r13 + 1;
        goto L7
    L8:
        java.lang.String[] r15 = r8.DW("remote", this.j6, "push");
        this.v5 = new java.util.ArrayList(r15.length);
        int r16 = r15.length;
        int r17 = 0;
    L9:
        if (r17 >= r16) goto L10;
        java.lang.String r18 = r15[r17];
        this.v5.add(new abcd.WI(r18));
        r17 = r17 + 1;
        goto L9
    L10:
        java.lang.String r19 = r8.j6("remote", this.j6, "uploadpack");
        if (r19 != null) goto L13;
        r19 = "git-upload-pack";
    L13:
        this.Zo = r19;
        java.lang.String r20 = r8.j6("remote", this.j6, "receivepack");
        if (r20 != null) goto L16;
        r20 = "git-receive-pack";
    L16:
        this.VH = r20;
        this.gn = abcd.EnumeJ.j6(r8.j6("remote", this.j6, "tagopt"));
        this.u7 = r8.j6("remote", this.j6, "mirror", false);
        this.tp = r8.j6("remote", this.j6, "timeout", 0);
    }

    private void j6(abcd.gE r3, java.lang.String r4) {
        r3.FH("remote", DW(), r4);
    }

    private void j6(abcd.gE r2, java.lang.String r3, int r4, int r5) {
        if (r5 != r4) goto L4;
        j6(r2, r3);
        return;
    L4:
        r2.DW("remote", DW(), r3, r4);
    }

    private void j6(abcd.gE r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        if (r5.equals(r4) == false) goto L5;
        j6(r2, r3);
        return;
    L5:
        r2.j6("remote", DW(), r3, r4);
    }

    private void j6(abcd.gE r2, java.lang.String r3, boolean r4, boolean r5) {
        if (r5 != r4) goto L4;
        j6(r2, r3);
        return;
    L4:
        r2.DW("remote", DW(), r3, r4);
    }

    public java.lang.String DW() {
        return this.j6;
    }

    public java.util.List<abcd.WI> FH() {
        return java.util.Collections.unmodifiableList(this.v5);
    }

    public java.util.List<abcd.HJ> Hw() {
        return java.util.Collections.unmodifiableList(this.FH);
    }

    public int VH() {
        return this.tp;
    }

    public abcd.EnumeJ Zo() {
        return this.gn;
    }

    public java.util.List<abcd.HJ> gn() {
        return java.util.Collections.unmodifiableList(this.DW);
    }

    public java.util.List<abcd.WI> j6() {
        return java.util.Collections.unmodifiableList(this.Hw);
    }

    public void j6(abcd.gE r5) {
        java.util.ArrayList r0 = new java.util.ArrayList();
        r0.clear();
        java.util.Iterator<abcd.HJ> r1 = gn().iterator();
    L4:
        if (r1.hasNext() == false) goto L5;
        r0.add(r1.next().u7());
        goto L4
    L5:
        r5.j6("remote", DW(), "url", r0);
        r0.clear();
        java.util.Iterator<abcd.HJ> r3 = Hw().iterator();
    L7:
        if (r3.hasNext() == false) goto L8;
        r0.add(r3.next().u7());
        goto L7
    L8:
        r5.j6("remote", DW(), "pushurl", r0);
        r0.clear();
        java.util.Iterator<abcd.WI> r2 = j6().iterator();
    L10:
        if (r2.hasNext() == false) goto L11;
        r0.add(r2.next().toString());
        goto L10
    L11:
        r5.j6("remote", DW(), "fetch", r0);
        r0.clear();
        java.util.Iterator<abcd.WI> r4 = FH().iterator();
    L13:
        if (r4.hasNext() == false) goto L14;
        r0.add(r4.next().toString());
        goto L13
    L14:
        r5.j6("remote", DW(), "push", r0);
        j6(r5, "uploadpack", u7(), "git-upload-pack");
        j6(r5, "receivepack", v5(), "git-receive-pack");
        j6(r5, "tagopt", Zo().Hw(), abcd.EnumeJ.j6.Hw());
        j6(r5, "mirror", this.u7, false);
        j6(r5, "timeout", this.tp, 0);
    }

    public boolean j6(abcd.HJ r2) {
        if (this.DW.contains(r2) == false) goto L7;
        return false;
    L7:
        return this.DW.add(r2);
    }

    public boolean j6(abcd.WI r2) {
        if (this.Hw.contains(r2) == false) goto L7;
        return false;
    L7:
        return this.Hw.add(r2);
    }

    public java.lang.String u7() {
        return this.Zo;
    }

    public java.lang.String v5() {
        return this.VH;
    }
}
