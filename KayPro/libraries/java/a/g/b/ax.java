package a.g.b;

import a.b.c;
import a.b.Interfacei;
import a.b.Interfacej;
import a.b.g.Interfacebg;

public class ax implements Interfacebg {

    private final Interfacebg f967a;

    private final Interfacebg f968b;

    public ax(Interfacebg interfaceC0129bg, Interfacebg interfaceC0129bg2) {
        this.f967a = interfaceC0129bg;
        this.f968b = interfaceC0129bg2;
    }

    @Override
    public void mo1032a(c cVar, Interfacei interfaceC0161i, int i, int i2, int i3, int i4, String str, c cVar2) {
        Interfacebg interfaceC0129bg = ad.m2294b((Interfacej) interfaceC0161i, i3) ? this.f967a : this.f968b;
        if (interfaceC0129bg != null) {
            interfaceC0129bg.mo1032a(cVar, interfaceC0161i, i, i2, i3, i4, str, cVar2);
        }
    }
}
