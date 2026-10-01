package abcd;

public abstract class Abstractqt {
    public Abstractqt() {
    }

    public abstract int j6();

    public abstract abcd.bs j6(abcd.bs r1);

    public final abcd.cs j6(abcd.cs r5) {
        int r0 = r5.size();
        abcd.cs r1 = new abcd.cs(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1.j6(r2, j6(r5.get(r2)));
        r2 = r2 + 1;
        goto L3
    L5:
        r1.we();
        if (r1.equals(r5) == false) goto L9;
        return r5;
    L9:
        return r1;
    }
}
