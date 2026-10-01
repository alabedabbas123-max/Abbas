package org.c.a.a.c.f;

import java.util.Iterator;
import java.util.List;
import org.c.a.a.a.b.Interfacea;
import org.c.a.a.b.e.ClassA;
import org.c.a.a.b.f.Interfacep;
import org.c.a.a.c.f.a.ClassA;

public class ClassA {
    public void m8835a(ClassA c2066a) {
        Interfacea interfaceC1819a = (Interfacea) c2066a.m8168a("printer");
        List list = (List) c2066a.m8167a();
        ClassA c2243a = new ClassA();
        interfaceC1819a.mo7564a(((Integer) c2066a.m8168a("maxLineNumber")).intValue(), ((Integer) c2066a.m8168a("majorVersion")).intValue(), ((Integer) c2066a.m8168a("minorVersion")).intValue());
        c2243a.m8837a(interfaceC1819a, list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Interfacep) it.next()).mo8184a(c2243a);
        }
        c2243a.m8836a();
        interfaceC1819a.mo7562a();
    }
}
