package abcd;

public final class yn extends abcd.Xt implements abcd.Interfacepn {
    public yn(int r1) {
        super(r1);
    }

    @Override
    public int Hw() {
        int r0 = size();
        int r1 = 2;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1 = r1 + get(r2).Hw();
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public abcd.Interfaceon get(int r1) {
        return (abcd.Interfaceon) DW(r1);
    }

    @Override
    public abcd.Interfaceon j6(abcd.Interfaceon r6) {
        int r0 = size();
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L15;
        if (get(r1) == r6) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        java.lang.String r7 = r6.getName();
    L8:
        r1 = r1 + 1;
        if (r1 >= r0) goto L13;
        abcd.Interfaceon r3 = get(r1);
        if (r3.getName().equals(r7) == false) goto L8;
        return r3;
    L13:
        return null;
    L15:
        return null;
    }

    @Override
    public abcd.Interfaceon j6(java.lang.String r5) {
        int r0 = size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        abcd.Interfaceon r2 = get(r1);
        if (r2.getName().equals(r5) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r2;
    L8:
        return null;
    }

    public void j6(int r1, abcd.Interfaceon r2) {
        j6(r1, r2);
    }
}
