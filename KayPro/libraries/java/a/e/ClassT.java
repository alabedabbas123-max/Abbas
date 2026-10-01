package a.e;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ClassT implements Interfaceg {

    private final File f662a;

    private final File f663b;

    private InputStream f664c;

    public ClassT(File file, File file2) {
        this.f662a = file;
        this.f663b = file2;
    }

    private String m1763f() {
        return this.f663b.equals(this.f662a) ? "" : this.f663b.getPath().substring(this.f662a.getPath().length() + File.separator.length()).replace(File.separatorChar, '/');
    }

    @Override
    public String mo1721a() {
        return this.f663b.equals(this.f662a) ? this.f663b.getName() : m1763f();
    }

    @Override
    public boolean mo1723b() {
        return this.f663b.isDirectory();
    }

    @Override
    public InputStream mo1724c() {
        if (this.f664c == null) {
            this.f664c = new BufferedInputStream(new FileInputStream(this.f663b));
        }
        return this.f664c;
    }

    @Override
    public void mo1725d() throws IOException {
        this.f664c.close();
        this.f664c = null;
    }

    @Override
    public Interfaceg mo1726e() {
        return null;
    }

    public String toString() {
        return mo1721a();
    }
}
