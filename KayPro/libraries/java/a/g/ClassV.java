package a.g;

import a.b.b;
import a.b.g.s;
import org.apache.commons.io.FilenameUtils;
import a.b.g.ClassA;
import a.b.g.Interfacen;
import a.j.ClassL;

class ClassV implements Interfacen {

    final ClassM f1191a;

    private final String f1192b;

    private final Interfacen f1193c;

    public ClassV(ClassM c0453m, String str, Interfacen interfaceC0148n) {
        this.f1191a = c0453m;
        this.f1192b = str;
        this.f1193c = interfaceC0148n;
    }

    public ClassV(ClassM c0453m, String str, s sVar) {
        this(c0453m, str, new ClassA(sVar));
    }

    private String m2902a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        while (i < i2) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            i++;
        }
        return sb.toString();
    }

    @Override
    public void mo951a(b bVar) {
        long jCurrentTimeMillis = 0;
        if (ClassM.f1130a) {
            System.out.print(this.f1192b);
            System.out.print(m2902a(this.f1192b.length(), 48));
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        bVar.a(this.f1193c);
        if (ClassM.f1130a) {
            ClassL.m3161a(String.format(" took: %6d ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        }
    }
}
