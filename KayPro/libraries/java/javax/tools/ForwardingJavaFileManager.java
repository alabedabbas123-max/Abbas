package javax.tools;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import javax.tools.JavaFileManager;

public class ForwardingJavaFileManager<M extends JavaFileManager> implements JavaFileManager {
    protected final M fileManager;

    protected ForwardingJavaFileManager(M fileManager) {
        fileManager.getClass();
        this.fileManager = fileManager;
    }

    @Override
    public ClassLoader getClassLoader(JavaFileManager.Location location) {
        return this.fileManager.getClassLoader(location);
    }

    @Override
    public Iterable<JavaFileObject> list(JavaFileManager.Location location, String packageName, Set<JavaFileObject.Kind> kinds, boolean recurse) throws IOException {
        return this.fileManager.list(location, packageName, kinds, recurse);
    }

    @Override
    public String inferBinaryName(JavaFileManager.Location location, JavaFileObject file) {
        return this.fileManager.inferBinaryName(location, file);
    }

    @Override
    public boolean isSameFile(FileObject a, FileObject b) {
        return this.fileManager.isSameFile(a, b);
    }

    @Override
    public boolean handleOption(String current, Iterator<String> remaining) {
        return this.fileManager.handleOption(current, remaining);
    }

    @Override
    public boolean hasLocation(JavaFileManager.Location location) {
        return this.fileManager.hasLocation(location);
    }

    @Override
    public int isSupportedOption(String option) {
        return this.fileManager.isSupportedOption(option);
    }

    @Override
    public JavaFileObject getJavaFileForInput(JavaFileManager.Location location, String className, JavaFileObject.Kind kind) throws IOException {
        return this.fileManager.getJavaFileForInput(location, className, kind);
    }

    @Override
    public JavaFileObject getJavaFileForOutput(JavaFileManager.Location location, String className, JavaFileObject.Kind kind, FileObject sibling) throws IOException {
        return this.fileManager.getJavaFileForOutput(location, className, kind, sibling);
    }

    @Override
    public FileObject getFileForInput(JavaFileManager.Location location, String packageName, String relativeName) throws IOException {
        return this.fileManager.getFileForInput(location, packageName, relativeName);
    }

    @Override
    public FileObject getFileForOutput(JavaFileManager.Location location, String packageName, String relativeName, FileObject sibling) throws IOException {
        return this.fileManager.getFileForOutput(location, packageName, relativeName, sibling);
    }

    @Override
    public void flush() throws IOException {
        this.fileManager.flush();
    }

    @Override
    public void close() throws IOException {
        this.fileManager.close();
    }
}
