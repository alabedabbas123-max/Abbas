package abcd;

public class BB {
    private final boolean DW;
    private final abcd.sE j6;

    public BB(abcd.sE r2) {
        this.j6 = r2;
        if (r2.DW().isEmpty() == true) goto L5;
    L17:
        boolean r3 = false;
    L18:
        this.DW = r3;
        return;
    L5:
        if (r2.FH().isEmpty() == false) goto L17;
        if (r2.VH().isEmpty() == false) goto L17;
        if (r2.v5().isEmpty() == false) goto L17;
        if (r2.Zo().isEmpty() == false) goto L17;
        if (r2.gn().isEmpty() == false) goto L17;
        if (r2.Hw().isEmpty() == false) goto L17;
        r3 = true;
        goto L18
    }

    public java.util.Set<java.lang.String> DW() {
        return java.util.Collections.unmodifiableSet(this.j6.FH());
    }

    public java.util.Set<java.lang.String> FH() {
        return java.util.Collections.unmodifiableSet(this.j6.Hw());
    }

    public java.util.Set<java.lang.String> Hw() {
        return java.util.Collections.unmodifiableSet(this.j6.v5());
    }

    public java.util.Set<java.lang.String> VH() {
        return java.util.Collections.unmodifiableSet(this.j6.gn());
    }

    public java.util.Set<java.lang.String> Zo() {
        return java.util.Collections.unmodifiableSet(this.j6.VH());
    }

    public java.util.Set<java.lang.String> j6() {
        return java.util.Collections.unmodifiableSet(this.j6.DW());
    }

    public java.util.Set<java.lang.String> v5() {
        return java.util.Collections.unmodifiableSet(this.j6.Zo());
    }
}
