package abcd;

public class kF implements abcd.ME {
    private final abcd.ME DW;
    private final java.lang.String j6;

    public kF(java.lang.String r1, abcd.ME r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public abcd.yE DW() {
        return v5().DW();
    }

    @Override
    public abcd.yE FH() {
        return v5().FH();
    }

    @Override
    public boolean Hw() {
        return v5().Hw();
    }

    @Override
    public boolean Zo() {
        return true;
    }

    @Override
    public java.lang.String getName() {
        return this.j6;
    }

    @Override
    public abcd.ME getTarget() {
        return this.DW;
    }

    @Override
    public abcd.ME.a j6() {
        return abcd.ME.a.DW;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("SymbolicRef[");
        abcd.ME r1 = this;
    L4:
        if (r1.Zo() == false) goto L5;
        r0.append(r1.getName());
        r0.append(" -> ");
        r1 = r1.getTarget();
        goto L4
    L5:
        r0.append(r1.getName());
        r0.append('=');
        r0.append(abcd.yE.j6(r1.DW()));
        r0.append("]");
        return r0.toString();
    }

    @Override
    public abcd.ME v5() {
        abcd.ME r0 = getTarget();
    L4:
        if (r0.Zo() == false) goto L5;
        r0 = r0.getTarget();
        goto L4
    L5:
        return r0;
    }
}
