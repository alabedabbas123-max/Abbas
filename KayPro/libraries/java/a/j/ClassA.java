package a.j;

public class ClassA extends Abstractt {

    private final Abstractt f1324a;

    private final Abstractt f1325b;

    public ClassA(Abstractt abstractC0515t, Abstractt abstractC0515t2) {
        this.f1324a = abstractC0515t;
        this.f1325b = abstractC0515t2;
    }

    @Override
    protected boolean mo3119a(String str, int i, int i2) {
        return this.f1324a.mo3119a(str, i, i2) && this.f1325b.mo3119a(str, i, i2);
    }
}
