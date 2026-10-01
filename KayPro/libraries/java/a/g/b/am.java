package a.g.b;

import a.b.c;
import java.util.HashSet;
import java.util.Set;
import a.b.Interfacei;
import a.b.g.ClassH;

public class am {
    private static Set m2440a(c cVar) {
        HashSet hashSet = new HashSet();
        cVar.a(true, true, true, false, new an(new ClassH(hashSet)));
        return hashSet;
    }

    public static boolean m2441a(c cVar, c cVar2) {
        return (ClassV.m2590b(cVar2) || cVar.c(cVar2) || m2440a(cVar).containsAll(m2440a(cVar2))) ? false : true;
    }

    public static boolean m2442a(c cVar, c cVar2, Interfacei interfaceC0161i) {
        return ((interfaceC0161i.mo945a() & 8) != 0 || interfaceC0161i.mo946a(cVar2).equals("<init>")) && m2441a(cVar, cVar2);
    }
}
