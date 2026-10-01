package a.d.a;

public class ac {

    private final Interfacebe f478a;

    public ac(Interfacebe interfaceC0207be) {
        this.f478a = interfaceC0207be;
    }

    public Abstractbd m1316a(String str) {
        switch (str.charAt(0)) {
            case 'B':
            case 'C':
            case 'I':
            case 'S':
            case 'Z':
                return this.f478a.mo1528a(0);
            case 'D':
                return this.f478a.mo1531a(0.0d);
            case 'F':
                return this.f478a.mo1532a(0.0f);
            case 'J':
                return this.f478a.mo1529a(0L);
            case 'L':
            case '[':
                return this.f478a.mo1534f();
            default:
                throw new IllegalArgumentException("Invalid type [" + str + "]");
        }
    }
}
