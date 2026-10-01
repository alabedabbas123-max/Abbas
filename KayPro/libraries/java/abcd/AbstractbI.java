package abcd;

abstract class AbstractbI extends abcd.AbstractaI implements abcd.InterfacenI {
    AbstractbI() {
    }

    protected abstract void DW(abcd.LE r1, java.util.Collection<abcd.ME> r2, java.util.Set<abcd.yE> r3);

    @Override
    public boolean Zo() {
        return false;
    }

    @Override
    public final void j6(abcd.LE r1, java.util.Collection<abcd.ME> r2, java.util.Set<abcd.yE> r3) {
        gn();
        DW(r1, r2, r3);
    }
}
