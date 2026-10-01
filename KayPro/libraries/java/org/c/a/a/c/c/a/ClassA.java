package org.c.a.a.c.c.a;

import org.c.a.a.a.a.Interfacea;
import org.c.a.a.b.c.ClassH;
import org.c.a.a.b.d.ClassB;
import org.c.a.a.b.e.ClassA;
import org.c.a.a.c.c.a.b.ClassA;
import org.c.a.a.c.c.a.b.ClassG;

public class ClassA {
    public void m8719a(ClassA c2066a) {
        Interfacea interfaceC1817a = (Interfacea) c2066a.m8168a("loader");
        String str = (String) c2066a.m8168a("mainInternalTypeName");
        int iIntValue = ((Integer) c2066a.m8168a("majorVersion")).intValue();
        ClassB c1951b = (ClassB) c2066a.m8167a();
        ClassG c2219g = new ClassG(str);
        c2219g.mo7819a(c1951b);
        ClassH c1895hM8777a = c2219g.m8777a();
        c2066a.m8171b("maxLineNumber", Integer.valueOf(c2219g.m8778b()));
        ClassA c2213a = new ClassA(interfaceC1817a, str, iIntValue, c1895hM8777a);
        c2213a.mo7819a(c1951b);
        c2066a.m8170a(c2213a.m8769a());
    }
}
