package abcd;

class LK extends java.util.AbstractSet<java.util.Map.Entry<java.lang.String, abcd.ME>> {
    final abcd.MK j6;

    LK(abcd.MK r1) {
        this.j6 = r1;
    }

    @Override
    public void clear() {
        abcd.MK.j6(this.j6, abcd.KK.DW());
        abcd.MK.DW(this.j6, abcd.KK.DW());
        abcd.MK.FH(this.j6, abcd.KK.DW());
        abcd.MK.j6(this.j6, 0);
        abcd.MK.j6(this.j6, true);
    }

    @Override
    public boolean isEmpty() {
        if (abcd.MK.Zo(this.j6) == false) goto L10;
        if (abcd.MK.j6(this.j6) != 0) goto L7;
        return true;
    L7:
        return false;
    L10:
        return !iterator().hasNext();
    }

    @Override
    public java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.ME>> iterator() {
        return new abcd.MK.b(this.j6);
    }

    @Override
    public int size() {
        if (abcd.MK.Zo(this.j6) == true) goto L10;
        abcd.MK.j6(this.j6, 0);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.ME>> r0 = this.j6.entrySet().iterator();
    L6:
        if (r0.hasNext() == false) goto L7;
        abcd.MK r1 = this.j6;
        abcd.MK.j6(r1, abcd.MK.j6(r1) + 1);
        r0.next();
        goto L6
    L7:
        abcd.MK.j6(this.j6, true);
    L10:
        return abcd.MK.j6(this.j6);
    }
}
