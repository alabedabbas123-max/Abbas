package abcd;

public final class HC<S extends abcd.CC> extends DC<GC<S>> {
    private final DC<? super S> j6;

    public HC(DC<? super S> r1) {
        this.j6 = r1;
    }

    public int j6(abcd.CC r1, int r2) {
        return j6((abcd.GC) r1, r2);
    }

    public int j6(GC<S> r3, int r4) {
        return this.j6.j6(r3.j6, r4 + r3.DW);
    }

    public boolean j6(abcd.CC r1, int r2, abcd.CC r3, int r4) {
        return j6((abcd.GC) r1, r2, (abcd.GC) r3, r4);
    }

    public boolean j6(GC<S> r3, int r4, GC<S> r5, int r6) {
        return this.j6.j6(r3.j6, r4 + r3.DW, r5.j6, r6 + r5.DW);
    }
}
