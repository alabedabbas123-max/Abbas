package a.j;

public class ClassQ extends Abstractt {

    private final Abstractt f1341a;

    private final Abstractt f1342b;

    public ClassQ(Abstractt abstractC0515t, Abstractt abstractC0515t2) {
        this.f1341a = abstractC0515t;
        this.f1342b = abstractC0515t2;
    }

    @Override
    protected boolean mo3119a(String str, int i, int i2) {
        return this.f1341a.mo3119a(str, i, i2) || this.f1342b.mo3119a(str, i, i2);
    }
}
