package a.e;

import java.io.File;
import java.io.IOException;

public class ClassQ {

    private final File f654a;

    public ClassQ(File file) {
        this.f654a = file;
    }

    private void m1758a(File file, Interfacem interfaceC0273m) throws IOException {
        interfaceC0273m.mo1720a(new ClassT(this.f654a, file));
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                try {
                    m1758a(file2, interfaceC0273m);
                } catch (IOException e) {
                    throw new IOException("Can't read [" + file2.getName() + "] (" + e.getMessage() + ")", e);
                }
            }
        }
    }

    public void m1759a(Interfacem interfaceC0273m) throws IOException {
        if (!this.f654a.exists()) {
            throw new IOException("No such file or directory: " + this.f654a);
        }
        m1758a(this.f654a, interfaceC0273m);
    }
}
