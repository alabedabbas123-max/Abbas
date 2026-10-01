package a.e;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

public class ClassY implements Interfaceo {

    private final byte[] f674a;

    private final int f675b;

    private final Interfaceo f676c;

    private Interfaceg f677d;

    private am f678e;

    public ClassY(byte[] bArr, int i, Interfaceo interfaceC0275o) {
        this.f674a = bArr;
        this.f675b = i;
        this.f676c = interfaceC0275o;
    }

    public ClassY(byte[] bArr, Interfaceo interfaceC0275o) {
        this(bArr, m1764c(), interfaceC0275o);
    }

    private static int m1764c() {
        Date date = new Date();
        return (date.getSeconds() >> 1) | ((date.getYear() - 80) << 25) | ((date.getMonth() + 1) << 21) | (date.getDate() << 16) | (date.getHours() << 11) | (date.getMinutes() << 5);
    }

    private void m1765d(Interfaceg interfaceC0267g) throws IOException {
        if (this.f677d == null || this.f676c.mo1717a(this.f677d, interfaceC0267g.mo1726e())) {
            return;
        }
        m1766b();
    }

    @Override
    public void mo1715a() throws IOException {
        m1766b();
        this.f676c.mo1715a();
    }

    @Override
    public boolean mo1716a(Interfaceg interfaceC0267g) throws IOException {
        m1765d(interfaceC0267g);
        m1767c(interfaceC0267g);
        if (this.f678e == null) {
            return false;
        }
        this.f678e.m1736a(interfaceC0267g.mo1721a() + '/', false, this.f675b).close();
        return true;
    }

    @Override
    public boolean mo1717a(Interfaceg interfaceC0267g, Interfaceg interfaceC0267g2) {
        return interfaceC0267g != null && interfaceC0267g2 != null && interfaceC0267g.mo1721a().equals(interfaceC0267g2.mo1721a()) && this.f676c.mo1717a(interfaceC0267g.mo1726e(), interfaceC0267g2.mo1726e());
    }

    @Override
    public OutputStream mo1718b(Interfaceg interfaceC0267g) throws IOException {
        m1765d(interfaceC0267g);
        m1767c(interfaceC0267g);
        if (this.f678e == null) {
            return null;
        }
        return this.f678e.m1736a(interfaceC0267g.mo1721a(), true, this.f675b);
    }

    protected void m1766b() throws IOException {
        if (this.f678e != null) {
            this.f678e.m1738a();
            this.f677d = null;
            this.f678e = null;
        }
    }

    protected void m1767c(Interfaceg interfaceC0267g) {
        if (this.f678e == null) {
            this.f677d = interfaceC0267g.mo1726e();
            this.f678e = new am(this.f676c.mo1718b(this.f677d), this.f674a, null, 1);
        }
    }
}
