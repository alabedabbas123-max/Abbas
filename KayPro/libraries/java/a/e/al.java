package a.e;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class al implements Interfaceg {

    private final Interfaceg f611a;

    private final ZipEntry f612b;

    private ZipInputStream f613c;

    private InputStream f614d;

    public al(Interfaceg interfaceC0267g, ZipEntry zipEntry, ZipInputStream zipInputStream) {
        this.f611a = interfaceC0267g;
        this.f612b = zipEntry;
        this.f613c = zipInputStream;
    }

    @Override
    public String mo1721a() {
        String strReplace = this.f612b.getName().replace(File.separatorChar, '/');
        int length = strReplace.length();
        return (length <= 0 || strReplace.charAt(length + (-1)) != '/') ? strReplace : strReplace.substring(0, length - 1);
    }

    @Override
    public boolean mo1723b() {
        return this.f612b.isDirectory();
    }

    @Override
    public InputStream mo1724c() {
        if (this.f614d == null) {
            this.f614d = new BufferedInputStream(this.f613c);
        }
        return this.f614d;
    }

    @Override
    public void mo1725d() throws IOException {
        this.f613c.closeEntry();
        this.f613c = null;
        this.f614d = null;
    }

    @Override
    public Interfaceg mo1726e() {
        return this.f611a;
    }

    public String toString() {
        return this.f611a.toString() + ':' + mo1721a();
    }
}
