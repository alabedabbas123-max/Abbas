package abcd;

public final class Lp {
    private final java.util.HashMap<java.lang.String, abcd.Lp.a> j6;

    private static class a {
        private int DW;
        private int FH;
        private int Hw;
        private final java.lang.String j6;
        private int v5;

        public a(abcd.Abstractvp r1, java.lang.String r2) {
            int r3 = r1.VH();
            this.j6 = r2;
            this.DW = 1;
            this.FH = r3;
            this.Hw = r3;
            this.v5 = r3;
        }

        static java.lang.String j6(abcd.Lp.a r0) {
            return r0.j6;
        }

        public java.lang.String j6() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder();
            java.lang.StringBuilder r1 = new java.lang.StringBuilder();
            r1.append("  ");
            r1.append(this.j6);
            r1.append(": ");
            r1.append(this.DW);
            r1.append(" item");
            if (this.DW != 1) goto L5;
            java.lang.String r2 = "";
        L6:
            r1.append(r2);
            r1.append("; ");
            r1.append(this.FH);
            r1.append(" bytes total\n");
            r0.append(r1.toString());
            if (this.v5 != this.Hw) goto L9;
            r0.append("    " + this.v5 + " bytes/item\n");
        L11:
            return r0.toString();
        L9:
            r0.append("    " + this.v5 + ".." + this.Hw + " bytes/item; average " + (this.FH / this.DW) + "\n");
            goto L11
        L5:
            r2 = "s";
            goto L6
        }

        public void j6(abcd.Lt r2) {
            r2.j6(j6());
        }

        public void j6(abcd.Abstractvp r2) {
            int r3 = r2.VH();
            this.DW++;
            this.FH += r3;
            if (r3 <= this.Hw) goto L6;
            this.Hw = r3;
        L6:
            if (r3 >= this.v5) goto L9;
            this.v5 = r3;
            return;
        }
    }

    public Lp() {
        this.j6 = new java.util.HashMap(50);
    }

    public void j6(abcd.AbstractKp r2) {
        java.util.Iterator<? extends abcd.Abstractvp> r3 = r2.Hw().iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        j6(r3.next());
        goto L4
    }

    public final void j6(abcd.Lt r5) {
        if (this.j6.size() != 0) goto L5;
        return;
    L5:
        r5.j6(0, "\nstatistics:\n");
        java.util.TreeMap r0 = new java.util.TreeMap();
        java.util.Iterator<abcd.Lp.a> r1 = this.j6.values().iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        abcd.Lp.a r2 = r1.next();
        r0.put(abcd.Lp.a.j6(r2), r2);
        goto L7
    L9:
        java.util.Iterator r3 = r0.values().iterator();
    L11:
        if (r3.hasNext() == false) goto L13;
        ((abcd.Lp.a) r3.next()).j6(r5);
        goto L11
    }

    public void j6(abcd.Abstractvp r4) {
        java.lang.String r0 = r4.Zo();
        abcd.Lp.a r1 = this.j6.get(r0);
        if (r1 != null) goto L5;
        this.j6.put(r0, new abcd.Lp.a(r4, r0));
        return;
    L5:
        r1.j6(r4);
    }
}
