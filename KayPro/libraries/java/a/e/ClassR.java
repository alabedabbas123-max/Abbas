package a.e;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ClassR implements Interfaceo {

    private final File f655a;

    private final boolean f656b;

    public ClassR(File file, boolean z) {
        this.f655a = file;
        this.f656b = z;
    }

    private File m1760c(Interfaceg interfaceC0267g) {
        return this.f656b ? this.f655a : new File(this.f655a, interfaceC0267g.mo1721a().replace('/', File.separatorChar));
    }

    @Override
    public void mo1715a() {
    }

    @Override
    public boolean mo1716a(Interfaceg interfaceC0267g) throws IOException {
        File fileM1760c = m1760c(interfaceC0267g);
        if (fileM1760c.exists() || fileM1760c.mkdirs()) {
            return true;
        }
        throw new IOException("Can't create directory [" + fileM1760c.getPath() + "]");
    }

    @Override
    public boolean mo1717a(Interfaceg interfaceC0267g, Interfaceg interfaceC0267g2) {
        return m1760c(interfaceC0267g).equals(m1760c(interfaceC0267g2));
    }

    @Override
    public OutputStream mo1718b(Interfaceg interfaceC0267g) throws IOException {
        File fileM1760c = m1760c(interfaceC0267g);
        File parentFile = fileM1760c.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            return new BufferedOutputStream(new FileOutputStream(fileM1760c));
        }
        throw new IOException("Can't create directory [" + parentFile.getPath() + "]");
    }
}
