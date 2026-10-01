package com.a.b.b.a;

import com.a.b.c.a.ClassE;
import com.a.b.c.a.ClassF;
import java.io.OutputStream;
import java.io.PrintStream;

public class ClassA {

    public static final ClassA f1953a = new ClassA();

    public final ClassE f1954b;

    public final ClassF f1955c;

    public final PrintStream f1956d;

    public final PrintStream f1957e;

    final PrintStream f1958f;

    private ClassA() {
        this(System.out, System.err);
    }

    public ClassA(OutputStream outputStream, OutputStream outputStream2) {
        this.f1954b = new ClassE();
        this.f1955c = new ClassF();
        this.f1958f = new PrintStream(new ClassB(this));
        this.f1956d = new PrintStream(outputStream);
        this.f1957e = new PrintStream(outputStream2);
    }
}
