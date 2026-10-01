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
        abcd.jG.a r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Object[] r4 = null;
        java.lang.Object[] r5 = null;
        java.lang.Object r8 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r1 = r0.DW;
                    if ((r6 >> r1) < 256) { $pc0 = 5; continue $sw0; }
                    r0 = new abcd.jG.a(r1 + 8);
                    r0.j6[0] = this.j6;
                    this.j6 = r0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r2 = r0.DW;
                    if (r2 <= 0) { $pc0 = 7; continue $sw0; }
                    r3 = r6 >> r2;
                    r6 = r6 - (r3 << r2);
                    r4 = r0.j6;
                    if (r4[r3] != null) { $pc0 = 12; continue $sw0; }
                    r4[r3] = new abcd.jG.a(r2 - 8);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r0 = (abcd.jG.a) r0.j6[r3];
                    { $pc0 = 5; continue $sw0; }
                }
                case 7: {
                    r5 = r0.j6;
                    r8 = r5[r6];
                    r5[r6] = r7;
                    return (E) r8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        abcd.jG.a r0 = null;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6;
                    if ((r5 >> r0.DW) < 1024) { $pc1 = 5; continue $sw1; }
                    return null;
                }
                case 5: {
                    if (r0 == null) { $pc1 = 10; continue $sw1; }
                    r1 = r0.DW;
                    if (r1 <= 0) { $pc1 = 10; continue $sw1; }
                    r3 = r5 >> r1;
                    r5 = r5 - (r3 << r1);
                    r0 = (abcd.jG.a) r0.j6[r3];
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (r0 != null) { $pc1 = 12; continue $sw1; }
                    return null;
                }
                case 12: {
                    return (E) r0.j6[r5];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object get(int r1) {
        return get(r1);
    }

    public void j6(int r4, E r5) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r4 != this.DW) { $pc2 = 7; continue $sw2; }
                    DW(r4, r5);
                    this.DW++;
                    return;
                }
                case 7: {
                    throw new java.lang.UnsupportedOperationException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unsupportedOperationNotAddAtEnd, new java.lang.Object[]{java.lang.Integer.valueOf(r4)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
