package a.b.d;

public abstract class Abstracti extends Abstractc {

    public int f151b;

    public int[] f152d;

    @Override
    public String mo333b(int i) {
        return "[" + i + "] " + toString() + " (target=" + (this.f151b + i) + ")";
    }

    public String toString() {
        return m384d() + " (" + this.f152d.length + " offsets, default=" + this.f151b + ")";
    }
}
