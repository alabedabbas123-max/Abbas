package abcd;

public abstract class AbstractqC extends abcd.AbstracteC {
    public AbstractqC() {
    }

    @Override
    public <S extends abcd.CC> abcd.kC DW(DC<? super S> r8, S r9, S r10) {
        abcd.nC r0 = new abcd.nC(r8, r9, r10);
        abcd.mC r3 = r0.FH();
        abcd.lC r4 = r0.j6();
        abcd.lC r5 = r0.DW();
        abcd.kC r11 = new abcd.kC();
        j6(r11, r3, r4, r5, new abcd.jC(0, r9.j6(), 0, r10.j6()));
        return r11;
    }

    public abstract <S extends abcd.CC> void j6(abcd.kC r1, mC<S> r2, lC<S> r3, lC<S> r4, abcd.jC r5);
}
