package a.j;

public class ClassM extends Abstractt {

    private final ClassY f1335a;

    private final Abstractt f1336b;

    public ClassM(ClassY c0519y, Abstractt abstractC0515t) {
        this.f1335a = c0519y;
        this.f1336b = abstractC0515t;
    }

    @Override
    protected boolean mo3119a(String str, int i, int i2) {
        int i3;
        int length;
        String strM3184a = this.f1335a.m3184a();
        if (strM3184a != null && (i3 = i2 - i) >= (length = strM3184a.length()) && str.startsWith(strM3184a, i)) {
            return (this.f1336b == null && i3 == length) || this.f1336b.mo3119a(str, i + length, i2);
        }
        return false;
    }
}
