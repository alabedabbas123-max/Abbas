package javax.tools;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public interface JavaFileManager extends Closeable, Flushable, OptionChecker {

    public interface Location {
        String getName();

        boolean isOutputLocation();
    }

    @Override
    void close() throws IOException;

    void flush() throws IOException;

    ClassLoader getClassLoader(Location location);

    FileObject getFileForInput(Location location, String str, String str2) throws IOException;

    FileObject getFileForOutput(Location location, String str, String str2, FileObject fileObject) throws IOException;

    JavaFileObject getJavaFileForInput(Location location, String str, JavaFileObject.Kind kind) throws IOException;

    JavaFileObject getJavaFileForOutput(Location location, String str, JavaFileObject.Kind kind, FileObject fileObject) throws IOException;

    boolean handleOption(String str, Iterator<String> it);

    boolean hasLocation(Location location);

    String inferBinaryName(Location location, JavaFileObject javaFileObject);

    boolean isSameFile(FileObject fileObject, FileObject fileObject2);

    Iterable<JavaFileObject> list(Location location, String str, Set<JavaFileObject.Kind> set, boolean z) throws IOException;
}
