package javax.tools;

import java.io.File;
import java.io.IOException;

public interface StandardJavaFileManager extends JavaFileManager {
    Iterable<? extends JavaFileObject> getJavaFileObjects(File... fileArr);

    Iterable<? extends JavaFileObject> getJavaFileObjects(String... strArr);

    Iterable<? extends JavaFileObject> getJavaFileObjectsFromFiles(Iterable<? extends File> iterable);

    Iterable<? extends JavaFileObject> getJavaFileObjectsFromStrings(Iterable<String> iterable);

    Iterable<? extends File> getLocation(JavaFileManager.Location location);

    @Override
    boolean isSameFile(FileObject fileObject, FileObject fileObject2);

    void setLocation(JavaFileManager.Location location, Iterable<? extends File> iterable) throws IOException;
}
