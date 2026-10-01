package a.e;

public class ClassU implements Interfacem {

    private final Interfacej f665a;

    private final Interfacem f666b;

    private final Interfacem f667c;

    public ClassU(Interfacej interfaceC0270j, Interfacem interfaceC0273m) {
        this(interfaceC0270j, interfaceC0273m, null);
    }

    public ClassU(Interfacej interfaceC0270j, Interfacem interfaceC0273m, Interfacem interfaceC0273m2) {
        this.f665a = interfaceC0270j;
        this.f666b = interfaceC0273m;
        this.f667c = interfaceC0273m2;
    }

    @Override
    public void mo1720a(Interfaceg interfaceC0267g) {
        Interfacem interfaceC0273m = this.f665a.mo1755a(interfaceC0267g) ? this.f666b : this.f667c;
        if (interfaceC0273m != null) {
            interfaceC0273m.mo1720a(interfaceC0267g);
        }
    }
}
