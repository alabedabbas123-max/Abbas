package abcd;

public abstract class Abstractup extends abcd.Abstractvp {
    private int j6;

    public Abstractup() {
        this.j6 = -1;
    }

    public final boolean J8() {
        if (this.j6 < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final java.lang.String Ws() {
        return '[' + java.lang.Integer.toHexString(this.j6) + ']';
    }

    public final void j6(int r3) {
        if (this.j6 != (-1)) goto L7;
        this.j6 = r3;
        return;
    L7:
        throw new java.lang.RuntimeException("index already set");
    }

    public final int we() {
        int r0 = this.j6;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new java.lang.RuntimeException("index not yet set");
    }
}
