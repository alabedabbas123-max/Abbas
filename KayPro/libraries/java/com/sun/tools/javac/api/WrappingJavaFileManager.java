package com.sun.tools.javac.api;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;

public class WrappingJavaFileManager<M extends JavaFileManager> extends ForwardingJavaFileManager<M> {
    protected WrappingJavaFileManager(M fileManager) {
        super(fileManager);
    }

    protected FileObject wrap(FileObject fileObject) {
        return fileObject;
    }

    protected JavaFileObject wrap(JavaFileObject fileObject) {
        return (JavaFileObject) wrap((FileObject) fileObject);
    }

    protected FileObject unwrap(FileObject fileObject) {
        return fileObject;
    }

    protected JavaFileObject unwrap(JavaFileObject fileObject) {
        return (JavaFileObject) unwrap((FileObject) fileObject);
    }

    protected Iterable<JavaFileObject> wrap(Iterable<JavaFileObject> fileObjects) {
        List<JavaFileObject> mapped = new ArrayList<>();
        for (JavaFileObject fileObject : fileObjects) {
            mapped.add(wrap(fileObject));
        }
        return Collections.unmodifiableList(mapped);
    }

    protected URI unwrap(URI uri) {
        return uri;
    }

    @Override
    public Iterable<JavaFileObject> list(JavaFileManager.Location location, String packageName, Set<JavaFileObject.Kind> kinds, boolean recurse) throws IOException {
        return wrap(super.list(location, packageName, kinds, recurse));
    }

    @Override
    public String inferBinaryName(JavaFileManager.Location location, JavaFileObject file) {
        return super.inferBinaryName(location, unwrap(file));
    }

    @Override
    public JavaFileObject getJavaFileForInput(JavaFileManager.Location location, String className, JavaFileObject.Kind kind) throws IOException {
        return wrap(super.getJavaFileForInput(location, className, kind));
    }

    @Override
    public JavaFileObject getJavaFileForOutput(JavaFileManager.Location location, String className, JavaFileObject.Kind kind, FileObject sibling) throws IOException {
        return wrap(super.getJavaFileForOutput(location, className, kind, unwrap(sibling)));
    }

    @Override
    public FileObject getFileForInput(JavaFileManager.Location location, String packageName, String relativeName) throws IOException {
        return wrap(super.getFileForInput(location, packageName, relativeName));
    }

    @Override
    public FileObject getFileForOutput(JavaFileManager.Location location, String packageName, String relativeName, FileObject sibling) throws IOException {
        return wrap(super.getFileForOutput(location, packageName, relativeName, unwrap(sibling)));
    }
}
