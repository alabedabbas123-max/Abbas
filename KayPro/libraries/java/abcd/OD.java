package abcd;

public class OD {
    private static final java.util.regex.Pattern DW = null;
    static final java.util.List<abcd.QD> j6 = null;
    private java.util.List<abcd.QD> FH;
    private java.util.List<abcd.QD> Hw;
    private java.util.List<abcd.QD> v5;

    static {
        j6 = java.util.Collections.emptyList();
        DW = java.util.regex.Pattern.compile("\\[[.:=]");
    }

    public OD(java.lang.String r1, java.lang.Character r2) {
        this(j6(r1, r2));
    }

    private OD(java.util.List<abcd.QD> r1) {
        this(r1, r1);
    }

    private OD(java.util.List<abcd.QD> r2, java.util.List<abcd.QD> r3) {
        this.FH = r2;
        this.Hw = new java.util.ArrayList(r3.size());
        this.Hw.addAll(r3);
        this.v5 = new java.util.ArrayList(r3.size());
    }

    private static java.util.List<abcd.MD> DW(java.lang.String r5, java.lang.Character r6) {
        java.util.ArrayList r0 = new java.util.ArrayList(r5.length());
        int r2 = 0;
    L4:
        if (r2 >= r5.length()) goto L5;
        char r3 = r5.charAt(r2);
        if (r3 != '*') goto L9;
        r0.add(j6(r6, true));
    L13:
        r2 = r2 + 1;
        goto L4
    L9:
        if (r3 == '?') goto L11;
        r0.add(new abcd.ND(r3));
        goto L13
    L11:
        r0.add(j6(r6, false));
        goto L13
    L5:
        return r0;
    }

    private static java.util.List<abcd.MD> FH(java.lang.String r4, java.lang.Character r5) {
        java.util.ArrayList r0 = new java.util.ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L5;
        int r2 = r4.indexOf(91, r1);
        if (r2 == (-1)) goto L8;
        r0.addAll(DW(r4.substring(r1, r2), r5));
        int r3 = j6(r2, r4);
        r0.add(new abcd.PD(r4.substring(r2 + 1, r3), r4));
        r1 = r3 + 1;
        goto L4
    L8:
        r0.addAll(DW(r4.substring(r1), r5));
        r1 = r4.length();
        goto L4
    L5:
        return r0;
    }

    private static int j6(int r9, java.lang.String r10) {
        int r0 = r9 + 1;
        int r1 = r9 + 2;
        if (r0 >= r10.length()) goto L25;
        if (r10.charAt(r0) != '!') goto L7;
        r0 = r0 + 1;
        r1 = r1 + 1;
    L7:
        java.util.regex.Matcher r2 = DW.matcher(r10);
        int r6 = r0;
        int r3 = -1;
    L8:
        if (r3 != (-1)) goto L9;
        int r7 = r10.indexOf(93, r1);
        if (r7 == (-1)) goto L23;
        if (r2.find(r6) == false) goto L21;
        if (r2.start() >= r7) goto L21;
        java.lang.String r4 = r2.group(0);
        java.lang.String r8 = java.lang.String.valueOf(r4.charAt(1)) + "]";
        int r11 = r2.start();
        int r12 = r10.indexOf(r8, r11 + 2);
        if (r12 == (-1)) goto L20;
        r6 = r12 + 2;
        r1 = r6;
        goto L8
    L20:
        throw new abcd.gD(r11, r4, r8, r10);
    L21:
        r3 = r7;
        goto L8
    L23:
        throw new abcd.gD(r9, "[", "]", r10);
    L9:
        return r3;
    L25:
        throw new abcd.gD(r9, "[", "]", r10);
    }

    private static abcd.MD j6(java.lang.Character r1, boolean r2) {
        if (r1 == null) goto L6;
        return new abcd.SD(r1.charValue(), r2);
    L6:
        return new abcd.TD(r2);
    }

    private static java.util.List<abcd.QD> j6(java.lang.String r4, java.lang.Character r5) {
        java.util.List<abcd.MD> r6 = FH(r4, r5);
        java.util.ArrayList r7 = new java.util.ArrayList(2);
        r7.add(abcd.RD.j6);
        int r1 = r6.size() - 1;
    L3:
        if (r1 < 0) goto L4;
        abcd.MD r2 = r6.get(r1);
        if (r2.j6() == false) goto L8;
        r7.add(r2);
        r2.j6(r7);
    L9:
        r1 = r1 - 1;
        goto L3
    L8:
        r2.j6(r7);
        r7 = new java.util.ArrayList(2);
        r7.add(r2);
        goto L9
    L4:
        return r7;
    }

    private void j6(char r5) {
        java.util.List<abcd.QD> r0 = this.v5;
        r0.clear();
        java.util.List<abcd.QD> r1 = null;
        int r2 = 0;
    L4:
        if (r2 >= this.Hw.size()) goto L5;
        java.util.List<abcd.QD> r3 = this.Hw.get(r2).j6(r5);
        if (r3 == r1) goto L10;
        r0.addAll(r3);
        r1 = r3;
    L10:
        r2 = r2 + 1;
        goto L4
    L5:
        this.v5 = this.Hw;
        this.Hw = r0;
    }

    public void DW() {
        this.Hw.clear();
        this.Hw.addAll(this.FH);
    }

    public void j6(java.lang.String r3) {
        int r0 = 0;
    L4:
        if (r0 >= r3.length()) goto L5;
        j6(r3.charAt(r0));
        r0 = r0 + 1;
        goto L4
    }

    public boolean j6() {
        java.util.List<abcd.QD> r0 = this.Hw;
        java.util.ListIterator<abcd.QD> r1 = r0.listIterator(r0.size());
    L4:
        if (r1.hasPrevious() == false) goto L5;
        if (r1.previous() != abcd.RD.j6) goto L4;
        return true;
    L5:
        return false;
    }
}
