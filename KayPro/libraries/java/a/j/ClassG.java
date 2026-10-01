package a.j;

public class ClassG extends Abstractt {

    private final String f1330a;

    public ClassG(String str) {
        this.f1330a = str;
    }

    private static boolean m3152a(String str, int i, int i2, String str2) {
        int length = str2.length();
        return str.regionMatches(true, i2 - length, str2, 0, length);
    }

    @Override
    protected boolean mo3119a(String str, int i, int i2) {
        return m3152a(str, i, i2, this.f1330a);
    }
}
