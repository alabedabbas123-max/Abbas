package com.a.a.a;

import java.io.PrintStream;
import java.io.PrintWriter;
import org.apache.commons.io.IOUtils;

public class ClassB extends RuntimeException {

    private StringBuffer f1734a;

    public ClassB(String str) {
        this(str, null);
    }

    public ClassB(String str, Throwable th) {
        super(str == null ? th != null ? th.getMessage() : null : str, th);
        if (!(th instanceof ClassB)) {
            this.f1734a = new StringBuffer(200);
            return;
        }
        String string = ((ClassB) th).f1734a.toString();
        this.f1734a = new StringBuffer(string.length() + 200);
        this.f1734a.append(string);
    }

    public ClassB(Throwable th) {
        this(null, th);
    }

    public static ClassB m3756a(Throwable th, String str) {
        ClassB c0882b = th instanceof ClassB ? (ClassB) th : new ClassB(th);
        c0882b.m3757a(str);
        return c0882b;
    }

    public void m3757a(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        this.f1734a.append(str);
        if (str.endsWith(IOUtils.LINE_SEPARATOR_UNIX)) {
            return;
        }
        this.f1734a.append('\n');
    }

    @Override
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f1734a);
    }

    @Override
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f1734a);
    }
}
