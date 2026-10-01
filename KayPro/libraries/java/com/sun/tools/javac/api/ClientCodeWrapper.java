package com.sun.tools.javac.api;

import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.util.ClientCodeException;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;

public class ClientCodeWrapper {
    Map<Class<?>, Boolean> trustedClasses = new HashMap();

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Trusted {
    }

    public static ClientCodeWrapper instance(Context context) {
        ClientCodeWrapper instance = (ClientCodeWrapper) context.m502get(ClientCodeWrapper.class);
        if (instance == null) {
            return new ClientCodeWrapper(context);
        }
        return instance;
    }

    protected ClientCodeWrapper(Context context) {
    }

    public JavaFileManager wrap(JavaFileManager fm) {
        if (isTrusted(fm)) {
            return fm;
        }
        return new WrappedJavaFileManager(fm);
    }

    public FileObject wrap(FileObject fo) {
        if (isTrusted(fo)) {
            return fo;
        }
        return new WrappedFileObject(fo);
    }

    FileObject unwrap(FileObject fo) {
        if (fo instanceof WrappedFileObject) {
            return ((WrappedFileObject) fo).clientFileObject;
        }
        return fo;
    }

    public JavaFileObject wrap(JavaFileObject fo) {
        if (isTrusted(fo)) {
            return fo;
        }
        return new WrappedJavaFileObject(fo);
    }

    public Iterable<JavaFileObject> wrapJavaFileObjects(Iterable<? extends JavaFileObject> list) {
        List<JavaFileObject> wrapped = new ArrayList<>();
        for (JavaFileObject fo : list) {
            wrapped.add(wrap(fo));
        }
        return Collections.unmodifiableList(wrapped);
    }

    JavaFileObject unwrap(JavaFileObject fo) {
        if (fo instanceof WrappedJavaFileObject) {
            return (JavaFileObject) ((WrappedJavaFileObject) fo).clientFileObject;
        }
        return fo;
    }

    <T> DiagnosticListener<T> wrap(DiagnosticListener<T> dl) {
        if (isTrusted(dl)) {
            return dl;
        }
        return new WrappedDiagnosticListener(dl);
    }

    TaskListener wrap(TaskListener tl) {
        if (isTrusted(tl)) {
            return tl;
        }
        return new WrappedTaskListener(tl);
    }

    public <T> Diagnostic<T> unwrap(Diagnostic<T> diagnostic) {
        if (diagnostic instanceof JCDiagnostic) {
            JCDiagnostic d = (JCDiagnostic) diagnostic;
            return new DiagnosticSourceUnwrapper(d);
        }
        return diagnostic;
    }

    protected boolean isTrusted(Object o) {
        Class<?> c = o.getClass();
        Boolean trusted = this.trustedClasses.get(c);
        if (trusted == null) {
            trusted = Boolean.valueOf(c.getName().startsWith("com.sun.tools.javac.") || c.isAnnotationPresent(Trusted.class));
            this.trustedClasses.put(c, trusted);
        }
        return trusted.booleanValue();
    }

    protected class WrappedJavaFileManager implements JavaFileManager {
        protected JavaFileManager clientJavaFileManager;

        WrappedJavaFileManager(JavaFileManager clientJavaFileManager) {
            clientJavaFileManager.getClass();
            this.clientJavaFileManager = clientJavaFileManager;
        }

        @Override
        public ClassLoader getClassLoader(JavaFileManager.Location location) {
            try {
                return this.clientJavaFileManager.getClassLoader(location);
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public Iterable<JavaFileObject> list(JavaFileManager.Location location, String packageName, Set<JavaFileObject.Kind> kinds, boolean recurse) throws IOException {
            try {
                return ClientCodeWrapper.this.wrapJavaFileObjects(this.clientJavaFileManager.list(location, packageName, kinds, recurse));
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public String inferBinaryName(JavaFileManager.Location location, JavaFileObject file) {
            try {
                return this.clientJavaFileManager.inferBinaryName(location, ClientCodeWrapper.this.unwrap(file));
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public boolean isSameFile(FileObject a, FileObject b) {
            try {
                return this.clientJavaFileManager.isSameFile(ClientCodeWrapper.this.unwrap(a), ClientCodeWrapper.this.unwrap(b));
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public boolean handleOption(String current, Iterator<String> remaining) {
            try {
                return this.clientJavaFileManager.handleOption(current, remaining);
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public boolean hasLocation(JavaFileManager.Location location) {
            try {
                return this.clientJavaFileManager.hasLocation(location);
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public JavaFileObject getJavaFileForInput(JavaFileManager.Location location, String className, JavaFileObject.Kind kind) throws IOException {
            try {
                return ClientCodeWrapper.this.wrap(this.clientJavaFileManager.getJavaFileForInput(location, className, kind));
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public JavaFileObject getJavaFileForOutput(JavaFileManager.Location location, String className, JavaFileObject.Kind kind, FileObject sibling) throws IOException {
            try {
                return ClientCodeWrapper.this.wrap(this.clientJavaFileManager.getJavaFileForOutput(location, className, kind, ClientCodeWrapper.this.unwrap(sibling)));
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public FileObject getFileForInput(JavaFileManager.Location location, String packageName, String relativeName) throws IOException {
            try {
                return ClientCodeWrapper.this.wrap(this.clientJavaFileManager.getFileForInput(location, packageName, relativeName));
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public FileObject getFileForOutput(JavaFileManager.Location location, String packageName, String relativeName, FileObject sibling) throws IOException {
            try {
                return ClientCodeWrapper.this.wrap(this.clientJavaFileManager.getFileForOutput(location, packageName, relativeName, ClientCodeWrapper.this.unwrap(sibling)));
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public void flush() throws IOException {
            try {
                this.clientJavaFileManager.flush();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public void close() throws IOException {
            try {
                this.clientJavaFileManager.close();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public int isSupportedOption(String option) {
            try {
                return this.clientJavaFileManager.isSupportedOption(option);
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }
    }

    protected class WrappedFileObject implements FileObject {
        protected FileObject clientFileObject;

        WrappedFileObject(FileObject clientFileObject) {
            clientFileObject.getClass();
            this.clientFileObject = clientFileObject;
        }

        @Override
        public URI toUri() {
            try {
                return this.clientFileObject.toUri();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public String getName() {
            try {
                return this.clientFileObject.getName();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public InputStream openInputStream() throws IOException {
            try {
                return this.clientFileObject.openInputStream();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public OutputStream openOutputStream() throws IOException {
            try {
                return this.clientFileObject.openOutputStream();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public Reader openReader(boolean ignoreEncodingErrors) throws IOException {
            try {
                return this.clientFileObject.openReader(ignoreEncodingErrors);
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
            try {
                return this.clientFileObject.getCharContent(ignoreEncodingErrors);
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public Writer openWriter() throws IOException {
            try {
                return this.clientFileObject.openWriter();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public long getLastModified() {
            try {
                return this.clientFileObject.getLastModified();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public boolean delete() {
            try {
                return this.clientFileObject.delete();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }
    }

    protected class WrappedJavaFileObject extends WrappedFileObject implements JavaFileObject {
        WrappedJavaFileObject(JavaFileObject clientJavaFileObject) {
            super(clientJavaFileObject);
        }

        @Override
        public JavaFileObject.Kind getKind() {
            try {
                return ((JavaFileObject) this.clientFileObject).getKind();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public boolean isNameCompatible(String simpleName, JavaFileObject.Kind kind) {
            try {
                return ((JavaFileObject) this.clientFileObject).isNameCompatible(simpleName, kind);
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public NestingKind getNestingKind() {
            try {
                return ((JavaFileObject) this.clientFileObject).getNestingKind();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public Modifier getAccessLevel() {
            try {
                return ((JavaFileObject) this.clientFileObject).getAccessLevel();
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }
    }

    protected class WrappedDiagnosticListener<T> implements DiagnosticListener<T> {
        protected DiagnosticListener<T> clientDiagnosticListener;

        WrappedDiagnosticListener(DiagnosticListener<T> clientDiagnosticListener) {
            clientDiagnosticListener.getClass();
            this.clientDiagnosticListener = clientDiagnosticListener;
        }

        @Override
        public void report(Diagnostic<? extends T> diagnostic) {
            try {
                this.clientDiagnosticListener.report(ClientCodeWrapper.this.unwrap(diagnostic));
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }
    }

    public class DiagnosticSourceUnwrapper implements Diagnostic<JavaFileObject> {

        public final JCDiagnostic f319d;

        DiagnosticSourceUnwrapper(JCDiagnostic d) {
            this.f319d = d;
        }

        @Override
        public Diagnostic.Kind getKind() {
            return this.f319d.getKind();
        }

        @Override
        public JavaFileObject getSource() {
            return ClientCodeWrapper.this.unwrap(this.f319d.getSource());
        }

        @Override
        public long getPosition() {
            return this.f319d.getPosition();
        }

        @Override
        public long getStartPosition() {
            return this.f319d.getStartPosition();
        }

        @Override
        public long getEndPosition() {
            return this.f319d.getEndPosition();
        }

        @Override
        public long getLineNumber() {
            return this.f319d.getLineNumber();
        }

        @Override
        public long getColumnNumber() {
            return this.f319d.getColumnNumber();
        }

        @Override
        public String getCode() {
            return this.f319d.getCode();
        }

        @Override
        public String getMessage(Locale locale) {
            return this.f319d.getMessage(locale);
        }

        public String toString() {
            return this.f319d.toString();
        }
    }

    protected class WrappedTaskListener implements TaskListener {
        protected TaskListener clientTaskListener;

        WrappedTaskListener(TaskListener clientTaskListener) {
            clientTaskListener.getClass();
            this.clientTaskListener = clientTaskListener;
        }

        @Override
        public void started(TaskEvent ev) {
            try {
                this.clientTaskListener.started(ev);
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }

        @Override
        public void finished(TaskEvent ev) {
            try {
                this.clientTaskListener.finished(ev);
            } catch (ClientCodeException e) {
                throw e;
            } catch (Error e2) {
                throw new ClientCodeException(e2);
            } catch (RuntimeException e3) {
                throw new ClientCodeException(e3);
            }
        }
    }
}
