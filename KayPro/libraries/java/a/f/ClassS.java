package a.f;

public class ClassS implements Interfacek {

    private final Interfacek[] f725a;

    public ClassS(Interfacek[] interfaceC0301kArr) {
        this.f725a = interfaceC0301kArr;
    }

    @Override
    public void mo1820a(String str, int i, int i2, String str2, String str3, String str4, String str5, int i3, int i4, String str6) {
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= this.f725a.length) {
                return;
            }
            this.f725a[i6].mo1820a(str, i, i2, str2, str3, str4, str5, i3, i4, str6);
            i5 = i6 + 1;
        }
    }

    @Override
    public void mo1821a(String str, String str2, String str3, String str4, String str5) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f725a.length) {
                return;
            }
            this.f725a[i2].mo1821a(str, str2, str3, str4, str5);
            i = i2 + 1;
        }
    }

    @Override
    public boolean mo1822a(String str, String str2) {
        boolean zMo1822a = false;
        for (int i = 0; i < this.f725a.length; i++) {
            zMo1822a |= this.f725a[i].mo1822a(str, str2);
        }
        return zMo1822a;
    }
}
