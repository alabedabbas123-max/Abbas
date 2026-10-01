package a.e;

import java.io.IOException;
import java.io.InputStream;
import a.b.f.ClassI;

public class ClassE implements Interfaceg {

    private final String f641a;

    private InputStream f642b;

    public ClassE(Class cls) {
        this(ClassI.m760b(cls.getName()) + ".class");
    }

    public ClassE(String str) {
        this.f641a = str;
    }

    @Override
    public String mo1721a() {
        return this.f641a;
    }

    @Override
    public boolean mo1723b() {
        return false;
    }

    @Override
    public InputStream mo1724c() {
        if (this.f642b == null) {
            this.f642b = getClass().getClassLoader().getResourceAsStream(this.f641a);
        }
        return this.f642b;
    }

    @Override
    public void mo1725d() throws IOException {
        this.f642b.close();
        this.f642b = null;
    }

    @Override
    public Interfaceg mo1726e() {
        return null;
    }

    public String toString() {
        return mo1721a();
    }
}
