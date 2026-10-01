package a.j;

import java.util.List;

public class ClassJ implements Interfaceu {

    private final Interfaceu f1333a;

    public ClassJ(Interfaceu interfaceC0516u) {
        this.f1333a = interfaceC0516u;
    }

    private Abstractt m3153b(String str) {
        return m3154c(str) ? new ClassP(this.f1333a.mo3150a(str.substring(1))) : this.f1333a.mo3150a(str);
    }

    private boolean m3154c(String str) {
        return str.length() > 0 && str.charAt(0) == '!';
    }

    @Override
    public Abstractt mo3150a(String str) {
        return m3155a(ClassK.m3158a(str));
    }

    public Abstractt m3155a(List list) {
        Abstractt c0496a;
        Abstractt abstractC0515t = null;
        int size = list.size() - 1;
        while (size >= 0) {
            String str = (String) list.get(size);
            Abstractt abstractC0515tM3153b = m3153b(str);
            if (abstractC0515t == null) {
                c0496a = abstractC0515tM3153b;
            } else {
                c0496a = m3154c(str) ? new ClassA(abstractC0515tM3153b, abstractC0515t) : new ClassQ(abstractC0515tM3153b, abstractC0515t);
            }
            size--;
            abstractC0515t = c0496a;
        }
        return abstractC0515t != null ? abstractC0515t : new ClassE(true);
    }
}
