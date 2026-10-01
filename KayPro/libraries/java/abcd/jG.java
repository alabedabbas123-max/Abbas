package abcd;

public class jG<E extends abcd.AbstractiG> extends java.util.AbstractList<E> {
    protected int DW;
    protected abcd.jG.a j6;

    protected static class a {
        final int DW;
        final java.lang.Object[] j6;

        a(int r2) {
            this.j6 = new java.lang.Object[256];
            this.DW = r2;
        }
    }

    public jG() {
        this.j6 = new abcd.jG.a(0);
        this.DW = 0;
    }

    public E DW(int r6, E r7) {
        abcd.jG.a r0 = this.j6;
    L3:
        int r1 = r0.DW;
        if ((r6 >> r1) < 256) goto L5;
        r0 = new abcd.jG.a(r1 + 8);
        r0.j6[0] = this.j6;
        this.j6 = r0;
    L5:
        int r2 = r0.DW;
        if (r2 <= 0) goto L7;
        int r3 = r6 >> r2;
        r6 = r6 - (r3 << r2);
        java.lang.Object[] r4 = r0.j6;
        if (r4[r3] != null) goto L12;
        r4[r3] = new abcd.jG.a(r2 - 8);
    L12:
        r0 = (abcd.jG.a) r0.j6[r3];
        goto L5
    L7:
        java.lang.Object[] r5 = r0.j6;
        java.lang.Object r8 = r5[r6];
        r5[r6] = r7;
        return (E) r8;
    }

    @Override
    public void add(int r1, java.lang.Object r2) {
        j6(r1, (abcd.AbstractiG) r2);
    }

    @Override
    public void clear() {
        this.j6 = new abcd.jG.a(0);
        this.DW = 0;
    }

    @Override
    public E get(int r5) {
        abcd.jG.a r0 = this.j6;
        if ((r5 >> r0.DW) < 1024) goto L5;
        return null;
    L5:
        if (r0 == null) goto L10;
        int r1 = r0.DW;
        if (r1 <= 0) goto L10;
        int r3 = r5 >> r1;
        r5 = r5 - (r3 << r1);
        r0 = (abcd.jG.a) r0.j6[r3];
    L10:
        if (r0 != null) goto L12;
        return null;
    L12:
        return (E) r0.j6[r5];
    }

    @Override
    public java.lang.Object get(int r1) {
        return get(r1);
    }

    public void j6(int r4, E r5) {
        if (r4 != this.DW) goto L7;
        DW(r4, r5);
        this.DW++;
        return;
    L7:
        throw new java.lang.UnsupportedOperationException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unsupportedOperationNotAddAtEnd, new java.lang.Object[]{java.lang.Integer.valueOf(r4)}));
    }

    @Override
    public java.lang.Object set(int r1, java.lang.Object r2) {
        return DW(r1, (abcd.AbstractiG) r2);
    }

    @Override
    public int size() {
        return this.DW;
    }
}
