package com.a.b.g;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.io.IOUtils;

public final class ClassX {

    private final Writer f3506a;

    private final int f3507b;

    private final StringBuffer f3508c;

    private final StringBuffer f3509d;

    private final ClassL f3510e;

    private final ClassL f3511f;

    public ClassX(Writer writer, int i, int i2, String str) {
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        if (i < 1) {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("rightWidth < 1");
        }
        if (str == null) {
            throw new NullPointerException("spacer == null");
        }
        StringWriter stringWriter = new StringWriter(1000);
        StringWriter stringWriter2 = new StringWriter(1000);
        this.f3506a = writer;
        this.f3507b = i;
        this.f3508c = stringWriter.getBuffer();
        this.f3509d = stringWriter2.getBuffer();
        this.f3510e = new ClassL(stringWriter, i);
        this.f3511f = new ClassL(stringWriter2, i2, str);
    }

    public static String m5520a(String str, int i, String str2, String str3, int i2) {
        StringWriter stringWriter = new StringWriter((str.length() + str3.length()) * 3);
        ClassX c1326x = new ClassX(stringWriter, i, i2, str2);
        try {
            c1326x.m5526a().write(str);
            c1326x.m5527b().write(str3);
            c1326x.m5528c();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    private static void m5521a(Writer writer, int i) throws IOException {
        while (i > 0) {
            writer.write(32);
            i--;
        }
    }

    private static void m5522a(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    private void m5523d() throws IOException {
        int iIndexOf;
        while (true) {
            int iIndexOf2 = this.f3508c.indexOf(IOUtils.LINE_SEPARATOR_UNIX);
            if (iIndexOf2 < 0 || (iIndexOf = this.f3509d.indexOf(IOUtils.LINE_SEPARATOR_UNIX)) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                this.f3506a.write(this.f3508c.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                m5521a(this.f3506a, this.f3507b - iIndexOf2);
                this.f3506a.write(this.f3509d.substring(0, iIndexOf));
            }
            this.f3506a.write(10);
            this.f3508c.delete(0, iIndexOf2 + 1);
            this.f3509d.delete(0, iIndexOf + 1);
        }
    }

    private void m5524e() throws IOException {
        m5522a(this.f3508c, this.f3510e);
        while (this.f3508c.length() != 0) {
            this.f3511f.write(10);
            m5523d();
        }
    }

    private void m5525f() throws IOException {
        m5522a(this.f3509d, this.f3511f);
        while (this.f3509d.length() != 0) {
            this.f3510e.write(10);
            m5523d();
        }
    }

    public Writer m5526a() {
        return this.f3510e;
    }

    public Writer m5527b() {
        return this.f3511f;
    }

    public void m5528c() {
        try {
            m5522a(this.f3508c, this.f3510e);
            m5522a(this.f3509d, this.f3511f);
            m5523d();
            m5524e();
            m5525f();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
