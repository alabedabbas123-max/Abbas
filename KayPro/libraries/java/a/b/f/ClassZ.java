package a.b.f;

import java.util.List;
import a.j.Abstractt;
import a.j.ClassC;
import a.j.ClassJ;
import a.j.ClassL;

public class ClassZ {

    private final Abstractt f311a;

    private int f312b;

    public ClassZ() {
        this.f312b = 0;
        this.f311a = null;
    }

    public ClassZ(List list) {
        this.f312b = 0;
        this.f311a = list == null ? null : new ClassJ(new ClassC()).m3155a(list);
    }

    private void m939b(String str) {
        ClassL.m3161a(str);
        this.f312b++;
    }

    public int m940a() {
        return this.f312b;
    }

    public void m941a(String str, String str2) {
        if (m943a(str)) {
            m939b(str2);
        }
    }

    public void m942a(String str, String str2, String str3) {
        if (m944b(str, str2)) {
            m939b(str3);
        }
    }

    public boolean m943a(String str) {
        return this.f311a == null || !this.f311a.mo3151a(str);
    }

    public boolean m944b(String str, String str2) {
        return this.f311a == null || !(this.f311a.mo3151a(str) || this.f311a.mo3151a(str2));
    }
}
