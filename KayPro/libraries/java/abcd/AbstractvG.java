package abcd;

public abstract class AbstractvG extends abcd.AbstractyG {

    private static class a extends abcd.AbstractvG {
        private final boolean VH;
        private final abcd.AbstractyG Zo;
        private final abcd.AbstractyG v5;

        a(abcd.AbstractyG r1, abcd.AbstractyG r2) {
            this.v5 = r1;
            this.Zo = r2;
            if (this.v5.j6() == false) goto L5;
        L7:
            boolean r3 = true;
        L8:
            this.VH = r3;
            return;
        L5:
            if (this.Zo.j6() == true) goto L7;
            r3 = false;
            goto L8
        }

        @Override
        public abcd.AbstractyG clone() {
            return new abcd.AbstractvG.a(this.v5.clone(), this.Zo.clone());
        }

        @Override
        public boolean j6() {
            return this.VH;
        }

        @Override
        public boolean j6(abcd.qG r2, abcd.dG r3) {
            if (this.v5.j6(r2, r3) == true) goto L5;
            return false;
        L5:
            if (this.Zo.j6(r2, r3) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override
        public java.lang.String toString() {
            return "(" + this.v5.toString() + " AND " + this.Zo.toString() + ")";
        }
    }

    public AbstractvG() {
    }

    public static abcd.AbstractyG j6(abcd.AbstractyG r1, abcd.AbstractyG r2) {
        abcd.AbstractyG r0 = abcd.AbstractyG.j6;
        if (r1 != r0) goto L5;
        return r2;
    L5:
        if (r2 != r0) goto L8;
        return r1;
    L8:
        return new abcd.AbstractvG.a(r1, r2);
    }
}
