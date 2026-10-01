package abcd;

public class hu {
    private boolean j6;

    public hu() {
        this.j6 = true;
    }

    public hu(boolean r1) {
        this.j6 = r1;
    }

    public final void J8() {
        if (this.j6 == false) goto L6;
        return;
    L6:
        throw new abcd.iu("immutable instance");
    }

    public final boolean VH() {
        return !this.j6;
    }

    public final void Ws() {
        if (this.j6 == true) goto L6;
        return;
    L6:
        throw new abcd.iu("mutable instance");
    }

    public final boolean Zo() {
        return this.j6;
    }

    public void we() {
        this.j6 = false;
    }
}
