package abcd;

public final class Wm implements abcd.Rs {
    private final int j6;

    public Wm(int r2) {
        if (r2 < 0) goto L7;
        this.j6 = r2;
        return;
    L7:
        throw new java.lang.IllegalArgumentException("subroutineAddress < 0");
    }

    @Override
    public int Mr() {
        return abcd.Qs.we.Mr();
    }

    @Override
    public abcd.Rs U2() {
        return this;
    }

    @Override
    public boolean a8() {
        return false;
    }

    @Override
    public java.lang.String aM() {
        return toString();
    }

    public boolean equals(java.lang.Object r3) {
        if ((r3 instanceof abcd.Wm) == true) goto L6;
        return false;
    L6:
        if (this.j6 != ((abcd.Wm) r3).j6) goto L9;
        return true;
    L9:
        return false;
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.we;
    }

    public int hashCode() {
        return this.j6;
    }

    @Override
    public int j3() {
        return abcd.Qs.we.j3();
    }

    public int j6() {
        return this.j6;
    }

    public java.lang.String toString() {
        return "<addr:" + abcd.Yt.v5(this.j6) + ">";
    }
}
