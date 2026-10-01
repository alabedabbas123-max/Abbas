package a.e;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import a.j.ClassL;

public class ClassH implements Interfacem {

    private final Interfaceo f648a;

    private final byte[] f649b = new byte[1024];

    public ClassH(Interfaceo interfaceC0275o) {
        this.f648a = interfaceC0275o;
    }

    @Override
    public void mo1720a(Interfaceg interfaceC0267g) throws IOException {
        try {
            if (interfaceC0267g.mo1723b()) {
                this.f648a.mo1716a(interfaceC0267g);
                return;
            }
            OutputStream outputStreamMo1718b = this.f648a.mo1718b(interfaceC0267g);
            if (outputStreamMo1718b != null) {
                try {
                    try {
                        mo1754a(interfaceC0267g.mo1724c(), outputStreamMo1718b);
                        outputStreamMo1718b.flush();
                        interfaceC0267g.mo1725d();
                        outputStreamMo1718b.close();
                    } catch (Throwable th) {
                        interfaceC0267g.mo1725d();
                        throw th;
                    }
                } catch (Throwable th2) {
                    outputStreamMo1718b.close();
                    throw th2;
                }
            }
        } catch (IOException e) {
            ClassL.m3161a("Warning: can't write resource [" + interfaceC0267g.mo1721a() + "] (" + e.getMessage() + ")");
        } catch (Exception e2) {
            throw ((IOException) new IOException("Can't write resource [" + interfaceC0267g.mo1721a() + "] (" + e2.getMessage() + ")").initCause(e2));
        }
    }

    protected void mo1754a(InputStream inputStream, OutputStream outputStream) throws IOException {
        while (true) {
            int i = inputStream.read(this.f649b);
            if (i < 0) {
                return;
            } else {
                outputStream.write(this.f649b, 0, i);
            }
        }
    }
}
