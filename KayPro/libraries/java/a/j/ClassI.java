package a.j;

public class ClassI extends Abstractt {

    private final String f1331a;

    private final Abstractt f1332b;

    public ClassI(String str) {
        this(str, null);
    }

    public ClassI(String str, Abstractt abstractC0515t) {
        this.f1331a = str;
        this.f1332b = abstractC0515t;
    }

    @Override
    protected boolean mo3119a(String str, int i, int i2) {
        int i3 = i2 - i;
        int length = this.f1331a.length();
        return i3 >= length && str.startsWith(this.f1331a, i) && ((this.f1332b == null && i3 == length) || this.f1332b.mo3119a(str, length + i, i2));
    }
}
