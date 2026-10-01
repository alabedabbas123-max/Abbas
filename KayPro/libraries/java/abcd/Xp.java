package abcd;

public class Xp {
    private final int[] j6;

    public Xp(int[] r1) {
        this.j6 = r1;
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if (abcd.Xp.class == r5.getClass()) goto L12;
        return false;
    L12:
        if (java.util.Arrays.equals(this.j6, ((abcd.Xp) r5).j6) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return 31 + java.util.Arrays.hashCode(this.j6);
    }

    public void j6(abcd.hr.a r4) {
        r4.writeInt(this.j6.length);
        int r0 = 0;
    L3:
        int[] r1 = this.j6;
        if (r0 >= r1.length) goto L6;
        r4.writeInt(r1[r0]);
        r0 = r0 + 1;
        goto L3
    }

    public int[] j6() {
        return this.j6;
    }
}
