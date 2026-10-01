package a.e;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ClassX implements Interfacem {

    private final Interfacem f672a;

    private final boolean f673b;

    public ClassX(Interfacem interfaceC0273m, boolean z) {
        this.f672a = interfaceC0273m;
        this.f673b = z;
    }

    @Override
    public void mo1720a(Interfaceg interfaceC0267g) throws IOException {
        if (this.f673b) {
            interfaceC0267g.mo1724c().read(new byte[4]);
        }
        ZipInputStream zipInputStream = new ZipInputStream(interfaceC0267g.mo1724c());
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    interfaceC0267g.mo1725d();
                    return;
                }
                this.f672a.mo1720a(new al(interfaceC0267g, nextEntry, zipInputStream));
            } catch (Throwable th) {
                interfaceC0267g.mo1725d();
                throw th;
            }
        }
    }
}
