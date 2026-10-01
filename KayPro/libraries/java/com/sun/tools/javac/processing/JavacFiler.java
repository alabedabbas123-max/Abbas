package com.sun.tools.javac.processing;

import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Filer;
import javax.annotation.processing.FilerException;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.tools.FileObject;
import javax.tools.ForwardingFileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;

public class JavacFiler implements Filer, Closeable {
    private static final String ALREADY_OPENED = "Output stream or writer has already been opened.";
    private static final String NOT_FOR_READING = "FileObject was not opened for reading.";
    private static final String NOT_FOR_WRITING = "FileObject was not opened for writing.";
    Context context;
    JavaFileManager fileManager;
    boolean lastRound;
    private final boolean lint;

    Log f505log;
    private final Set<FileObject> fileObjectHistory = Collections.synchronizedSet(new LinkedHashSet());
    private Set<String> generatedSourceNames = Collections.synchronizedSet(new LinkedHashSet());
    private Set<JavaFileObject> generatedSourceFileObjects = Collections.synchronizedSet(new LinkedHashSet());
    private final Map<String, JavaFileObject> generatedClasses = Collections.synchronizedMap(new LinkedHashMap());
    private final Set<String> openTypeNames = Collections.synchronizedSet(new LinkedHashSet());
    private final Set<String> aggregateGeneratedSourceNames = new LinkedHashSet();
    private final Set<String> aggregateGeneratedClassNames = new LinkedHashSet();

    private class FilerOutputFileObject extends ForwardingFileObject<FileObject> {
        private String name;
        private boolean opened;

        FilerOutputFileObject(String name, FileObject fileObject) {
            super(fileObject);
            this.opened = false;
            this.name = name;
        }

        @Override
        public synchronized OutputStream openOutputStream() throws IOException {
            if (this.opened) {
                throw new IOException(JavacFiler.ALREADY_OPENED);
            }
            this.opened = true;
            return JavacFiler.this.new FilerOutputStream(this.name, this.fileObject);
        }

        @Override
        public synchronized Writer openWriter() throws IOException {
            if (this.opened) {
                throw new IOException(JavacFiler.ALREADY_OPENED);
            }
            this.opened = true;
            return JavacFiler.this.new FilerWriter(this.name, this.fileObject);
        }

        @Override
        public InputStream openInputStream() throws IOException {
            throw new IllegalStateException(JavacFiler.NOT_FOR_READING);
        }

        @Override
        public Reader openReader(boolean ignoreEncodingErrors) throws IOException {
            throw new IllegalStateException(JavacFiler.NOT_FOR_READING);
        }

        @Override
        public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
            throw new IllegalStateException(JavacFiler.NOT_FOR_READING);
        }

        @Override
        public boolean delete() {
            return false;
        }
    }

    private class FilerOutputJavaFileObject extends FilerOutputFileObject implements JavaFileObject {
        private final JavaFileObject javaFileObject;

        FilerOutputJavaFileObject(String name, JavaFileObject javaFileObject) {
            super(name, javaFileObject);
            this.javaFileObject = javaFileObject;
        }

        @Override
        public JavaFileObject.Kind getKind() {
            return this.javaFileObject.getKind();
        }

        @Override
        public boolean isNameCompatible(String simpleName, JavaFileObject.Kind kind) {
            return this.javaFileObject.isNameCompatible(simpleName, kind);
        }

        @Override
        public NestingKind getNestingKind() {
            return this.javaFileObject.getNestingKind();
        }

        @Override
        public Modifier getAccessLevel() {
            return this.javaFileObject.getAccessLevel();
        }
    }

    private class FilerInputFileObject extends ForwardingFileObject<FileObject> {
        FilerInputFileObject(FileObject fileObject) {
            super(fileObject);
        }

        @Override
        public OutputStream openOutputStream() throws IOException {
            throw new IllegalStateException(JavacFiler.NOT_FOR_WRITING);
        }

        @Override
        public Writer openWriter() throws IOException {
            throw new IllegalStateException(JavacFiler.NOT_FOR_WRITING);
        }

        @Override
        public boolean delete() {
            return false;
        }
    }

    private class FilerInputJavaFileObject extends FilerInputFileObject implements JavaFileObject {
        private final JavaFileObject javaFileObject;

        FilerInputJavaFileObject(JavaFileObject javaFileObject) {
            super(javaFileObject);
            this.javaFileObject = javaFileObject;
        }

        @Override
        public JavaFileObject.Kind getKind() {
            return this.javaFileObject.getKind();
        }

        @Override
        public boolean isNameCompatible(String simpleName, JavaFileObject.Kind kind) {
            return this.javaFileObject.isNameCompatible(simpleName, kind);
        }

        @Override
        public NestingKind getNestingKind() {
            return this.javaFileObject.getNestingKind();
        }

        @Override
        public Modifier getAccessLevel() {
            return this.javaFileObject.getAccessLevel();
        }
    }

    private class FilerOutputStream extends FilterOutputStream {
        boolean closed;
        FileObject fileObject;
        String typeName;

        FilerOutputStream(String typeName, FileObject fileObject) throws IOException {
            super(fileObject.openOutputStream());
            this.closed = false;
            this.typeName = typeName;
            this.fileObject = fileObject;
        }

        @Override
        public synchronized void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                JavacFiler.this.closeFileObject(this.typeName, this.fileObject);
                this.out.close();
            }
        }
    }

    private class FilerWriter extends FilterWriter {
        boolean closed;
        FileObject fileObject;
        String typeName;

        FilerWriter(String typeName, FileObject fileObject) throws IOException {
            super(fileObject.openWriter());
            this.closed = false;
            this.typeName = typeName;
            this.fileObject = fileObject;
        }

        @Override
        public synchronized void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                JavacFiler.this.closeFileObject(this.typeName, this.fileObject);
                this.out.close();
            }
        }
    }

    JavacFiler(Context context) {
        this.context = context;
        this.fileManager = (JavaFileManager) context.m502get(JavaFileManager.class);
        this.f505log = Log.instance(context);
        this.lint = Lint.instance(context).isEnabled(Lint.LintCategory.PROCESSING);
    }

    @Override
    public JavaFileObject createSourceFile(CharSequence name, Element... originatingElements) throws IOException {
        return createSourceOrClassFile(true, name.toString());
    }

    @Override
    public JavaFileObject createClassFile(CharSequence name, Element... originatingElements) throws IOException {
        return createSourceOrClassFile(false, name.toString());
    }

    private JavaFileObject createSourceOrClassFile(boolean isSourceFile, String name) throws IOException {
        JavaFileObject.Kind kind;
        int periodIndex;
        if (this.lint && (periodIndex = name.lastIndexOf(".")) != -1) {
            String base = name.substring(periodIndex);
            String extn = isSourceFile ? ".java" : ".class";
            if (base.equals(extn)) {
                this.f505log.warning("proc.suspicious.class.name", name, extn);
            }
        }
        checkNameAndExistence(name, isSourceFile);
        JavaFileManager.Location loc = isSourceFile ? StandardLocation.SOURCE_OUTPUT : StandardLocation.CLASS_OUTPUT;
        if (isSourceFile) {
            kind = JavaFileObject.Kind.SOURCE;
        } else {
            kind = JavaFileObject.Kind.CLASS;
        }
        JavaFileObject fileObject = this.fileManager.getJavaFileForOutput(loc, name, kind, null);
        checkFileReopening(fileObject, true);
        if (this.lastRound) {
            this.f505log.warning("proc.file.create.last.round", name);
        }
        if (isSourceFile) {
            this.aggregateGeneratedSourceNames.add(name);
        } else {
            this.aggregateGeneratedClassNames.add(name);
        }
        this.openTypeNames.add(name);
        return new FilerOutputJavaFileObject(name, fileObject);
    }

    @Override
    public FileObject createResource(JavaFileManager.Location location, CharSequence pkg, CharSequence relativeName, Element... originatingElements) throws IOException {
        locationCheck(location);
        String strPkg = pkg.toString();
        if (strPkg.length() > 0) {
            checkName(strPkg);
        }
        FileObject fileObject = this.fileManager.getFileForOutput(location, strPkg, relativeName.toString(), null);
        checkFileReopening(fileObject, true);
        if (fileObject instanceof JavaFileObject) {
            return new FilerOutputJavaFileObject(null, (JavaFileObject) fileObject);
        }
        return new FilerOutputFileObject(null, fileObject);
    }

    private void locationCheck(JavaFileManager.Location location) {
        if (location instanceof StandardLocation) {
            StandardLocation stdLoc = (StandardLocation) location;
            if (!stdLoc.isOutputLocation()) {
                throw new IllegalArgumentException("Resource creation not supported in location " + stdLoc);
            }
        }
    }

    @Override
    public FileObject getResource(JavaFileManager.Location location, CharSequence pkg, CharSequence relativeName) throws IOException {
        FileObject fileObject;
        String name;
        String strPkg = pkg.toString();
        if (strPkg.length() > 0) {
            checkName(strPkg);
        }
        if (location.isOutputLocation()) {
            fileObject = this.fileManager.getFileForOutput(location, pkg.toString(), relativeName.toString(), null);
        } else {
            fileObject = this.fileManager.getFileForInput(location, pkg.toString(), relativeName.toString());
        }
        if (fileObject == null) {
            if (pkg.length() == 0) {
                name = relativeName.toString();
            } else {
                name = ((Object) pkg) + "/" + ((Object) relativeName);
            }
            throw new FileNotFoundException(name);
        }
        checkFileReopening(fileObject, false);
        return new FilerInputFileObject(fileObject);
    }

    private void checkName(String name) throws FilerException {
        checkName(name, false);
    }

    private void checkName(String name, boolean allowUnnamedPackageInfo) throws FilerException {
        if (!SourceVersion.isName(name) && !isPackageInfo(name, allowUnnamedPackageInfo)) {
            if (this.lint) {
                this.f505log.warning("proc.illegal.file.name", name);
            }
            throw new FilerException("Illegal name " + name);
        }
    }

    private boolean isPackageInfo(String name, boolean allowUnnamedPackageInfo) {
        int periodIndex = name.lastIndexOf(".");
        if (periodIndex == -1) {
            if (allowUnnamedPackageInfo) {
                return name.equals("package-info");
            }
            return false;
        }
        String prefix = name.substring(0, periodIndex);
        String simple = name.substring(periodIndex + 1);
        return SourceVersion.isName(prefix) && simple.equals("package-info");
    }

    private void checkNameAndExistence(String typename, boolean allowUnnamedPackageInfo) throws FilerException {
        checkName(typename, allowUnnamedPackageInfo);
        if (this.aggregateGeneratedSourceNames.contains(typename) || this.aggregateGeneratedClassNames.contains(typename)) {
            if (this.lint) {
                this.f505log.warning("proc.type.recreate", typename);
            }
            throw new FilerException("Attempt to recreate a file for type " + typename);
        }
    }

    private void checkFileReopening(FileObject fileObject, boolean addToHistory) throws FilerException {
        for (FileObject veteran : this.fileObjectHistory) {
            if (this.fileManager.isSameFile(veteran, fileObject)) {
                if (this.lint) {
                    this.f505log.warning("proc.file.reopening", fileObject.getName());
                }
                throw new FilerException("Attempt to reopen a file for path " + fileObject.getName());
            }
        }
        if (addToHistory) {
            this.fileObjectHistory.add(fileObject);
        }
    }

    public boolean newFiles() {
        return (this.generatedSourceNames.isEmpty() && this.generatedClasses.isEmpty()) ? false : true;
    }

    public Set<String> getGeneratedSourceNames() {
        return this.generatedSourceNames;
    }

    public Set<JavaFileObject> getGeneratedSourceFileObjects() {
        return this.generatedSourceFileObjects;
    }

    public Map<String, JavaFileObject> getGeneratedClasses() {
        return this.generatedClasses;
    }

    public void warnIfUnclosedFiles() {
        if (!this.openTypeNames.isEmpty()) {
            this.f505log.warning("proc.unclosed.type.files", this.openTypeNames.toString());
        }
    }

    public void newRound(Context context) {
        this.context = context;
        this.f505log = Log.instance(context);
        clearRoundState();
    }

    void setLastRound(boolean lastRound) {
        this.lastRound = lastRound;
    }

    @Override
    public void close() {
        clearRoundState();
        this.fileObjectHistory.clear();
        this.openTypeNames.clear();
        this.aggregateGeneratedSourceNames.clear();
        this.aggregateGeneratedClassNames.clear();
    }

    private void clearRoundState() {
        this.generatedSourceNames.clear();
        this.generatedSourceFileObjects.clear();
        this.generatedClasses.clear();
    }

    public void displayState() {
        PrintWriter xout = (PrintWriter) this.context.m501get(Log.outKey);
        xout.println("File Object History : " + this.fileObjectHistory);
        xout.println("Open Type Names     : " + this.openTypeNames);
        xout.println("Gen. Src Names      : " + this.generatedSourceNames);
        xout.println("Gen. Cls Names      : " + this.generatedClasses.keySet());
        xout.println("Agg. Gen. Src Names : " + this.aggregateGeneratedSourceNames);
        xout.println("Agg. Gen. Cls Names : " + this.aggregateGeneratedClassNames);
    }

    public String toString() {
        return "javac Filer";
    }

    public void closeFileObject(String typeName, FileObject fileObject) {
        if (typeName != null) {
            if (!(fileObject instanceof JavaFileObject)) {
                throw new AssertionError("JavaFileOject not found for " + fileObject);
            }
            JavaFileObject javaFileObject = (JavaFileObject) fileObject;
            int i = C07111.$SwitchMap$javax$tools$JavaFileObject$Kind[javaFileObject.getKind().ordinal()];
            if (i == 1) {
                this.generatedSourceNames.add(typeName);
                this.generatedSourceFileObjects.add(javaFileObject);
                this.openTypeNames.remove(typeName);
            } else if (i == 2) {
                this.generatedClasses.put(typeName, javaFileObject);
                this.openTypeNames.remove(typeName);
            }
        }
    }

    static class C07111 {
        static final int[] $SwitchMap$javax$tools$JavaFileObject$Kind;

        static {
            int[] iArr = new int[JavaFileObject.Kind.values().length];
            $SwitchMap$javax$tools$JavaFileObject$Kind = iArr;
            try {
                iArr[JavaFileObject.Kind.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$javax$tools$JavaFileObject$Kind[JavaFileObject.Kind.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }
}
