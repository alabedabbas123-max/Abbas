package abcd;

public abstract class EL extends abcd.AbstractyL {
    EL() {
    }

    public static abcd.EL j6(byte[] r1) {
        return new abcd.C1419vL(r1).Hw();
    L6:
        throw new java.io.IOException("cannot recognise object in stream");
    }

    @Override
    public abcd.EL DW() {
        return this;
    }

    abcd.EL VH() {
        return this;
    }

    abstract boolean Zo();

    @Override
    public final boolean equals(java.lang.Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof abcd.InterfaceqL) == true) goto L8;
        return false;
    L8:
        if (j6(((abcd.InterfaceqL) r3).DW()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    abcd.EL gn() {
        return this;
    }

    abstract void j6(abcd.CL r1);

    abstract boolean j6(abcd.EL r1);

    abstract int v5();
}
