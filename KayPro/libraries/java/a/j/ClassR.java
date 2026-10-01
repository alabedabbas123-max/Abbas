package a.j;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import a.ClassH;

public class ClassR {
    public static PrintWriter m3171a(File file) {
        return m3173a(file, false);
    }

    public static PrintWriter m3172a(File file, PrintWriter printWriter, boolean z) {
        return file == ClassH.f1204a ? printWriter : new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, z), "UTF-8")));
    }

    public static PrintWriter m3173a(File file, boolean z) {
        return m3172a(file, new PrintWriter((OutputStream) System.out, true), z);
    }

    public static void m3174a(File file, PrintWriter printWriter) {
        if (file == ClassH.f1204a) {
            printWriter.flush();
        } else {
            printWriter.close();
        }
    }

    public static String m3175b(File file) {
        if (file == ClassH.f1204a) {
            return "standard output";
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            return file.getPath();
        }
    }
}
