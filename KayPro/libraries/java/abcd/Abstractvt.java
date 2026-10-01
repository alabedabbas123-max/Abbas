package abcd;

public abstract class Abstractvt implements abcd.Interfacelu, java.lang.Cloneable {
    private abcd.bs DW;
    private final abcd.tt j6;

    public interface a {
        void DW(abcd.mt r1);

        void j6(abcd.mt r1);

        void j6(abcd.ot r1);
    }

    protected Abstractvt(abcd.bs r1, abcd.tt r2) {
        if (r2 == null) goto L7;
        this.j6 = r2;
        this.DW = r1;
        return;
    L7:
        throw new java.lang.NullPointerException("block == null");
    }

    public static abcd.Abstractvt j6(abcd.Tr r1, abcd.tt r2) {
        return new abcd.mt(r1, r2);
    }

    public abcd.tt DW() {
        return this.j6;
    }

    public abstract void DW(abcd.Abstractqt r1);

    public boolean DW(int r2) {
        abcd.bs r0 = this.DW;
        if (r0 != null) goto L5;
    L7:
        return false;
    L5:
        if (r0.we() != r2) goto L7;
        return true;
    }

    public abstract boolean EQ();

    public abcd.bs FH() {
        abcd.bs r0 = this.DW;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.Zo() != null) goto L7;
        return null;
    L7:
        return this.DW;
    }

    public boolean J0() {
        return false;
    }

    public boolean QX() {
        return false;
    }

    public abstract boolean XL();

    public abcd.Abstractvt clone() {
        return (abcd.Abstractvt) super.clone();
    L4:
        e = move-exception;
        throw new java.lang.RuntimeException("unexpected", e);
    }

    public java.lang.Object mo30clone() {
        return clone();
    }

    public abstract abcd.Tr gn();

    public void j6(int r2) {
        abcd.bs r0 = this.DW;
        if (r0 == null) goto L6;
        this.DW = r0.FH(r2);
        return;
    }

    public final void j6(abcd.Vr r3) {
        if (r3 == this.DW.Zo()) goto L9;
        if (r3 != null) goto L6;
    L7:
        this.DW = abcd.bs.FH(this.DW.we(), this.DW.getType(), r3);
        return;
    L6:
        if (r3.equals(this.DW.Zo()) == false) goto L7;
        return;
    }

    protected void j6(abcd.bs r2) {
        if (r2 == null) goto L6;
        this.DW = r2;
        return;
    L6:
        throw new java.lang.NullPointerException("result == null");
    }

    public final void j6(abcd.Abstractqt r3) {
        abcd.bs r0 = this.DW;
        this.DW = r3.j6(r0);
        this.j6.v5().j6(this, r0);
        DW(r3);
    }

    public abstract void j6(abcd.Abstractvt.a r1);

    public abstract boolean j6();

    public abstract abcd.Tr lg();

    public abstract abcd.cs tp();

    public abcd.bs u7() {
        return this.DW;
    }

    public abstract abcd.es v5();
}
