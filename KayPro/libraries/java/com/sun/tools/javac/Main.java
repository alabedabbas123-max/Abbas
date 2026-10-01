package com.sun.tools.javac;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import javax.tools.DiagnosticListener;

public class Main {
    static {
        ClassLoader loader = Main.class.getClassLoader();
        if (loader != null) {
            loader.setPackageAssertionStatus("com.sun.tools.javac", true);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length > 0 && args[0].equals("-Xjdb")) {
            String[] newargs = new String[args.length + 2];
            Class<?> c = Class.forName("com.sun.tools.example.debug.tty.TTY");
            Method method = c.getDeclaredMethod("main", args.getClass());
            method.setAccessible(true);
            System.arraycopy(args, 1, newargs, 3, args.length - 1);
            newargs[0] = "-connect";
            newargs[1] = "com.sun.jdi.CommandLineLaunch:options=-esa -ea:com.sun.tools...";
            newargs[2] = "com.sun.tools.javac.Main";
            method.invoke(null, newargs);
        }
    }

    public static int compile(String[] args) {
        com.sun.tools.javac.main.Main compiler = new com.sun.tools.javac.main.Main("javac");
        return compiler.compile(args);
    }

    public static int compile(String[] args, PrintWriter out) {
        com.sun.tools.javac.main.Main compiler = new com.sun.tools.javac.main.Main("javac", out);
        return compiler.compile(args);
    }

    public static int compile(String[] args, PrintStream out, DiagnosticListener listener) {
        com.sun.tools.javac.main.Main compiler = new com.sun.tools.javac.main.Main("javac", new PrintWriter(out));
        compiler.setDiagnosticListener(listener);
        return compiler.compile(args);
    }

    public static int compile(String[] args, DiagnosticListener listener) {
        com.sun.tools.javac.main.Main compiler = new com.sun.tools.javac.main.Main("javac");
        compiler.setDiagnosticListener(listener);
        return compiler.compile(args);
    }
}
