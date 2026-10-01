package com.sun.tools.javac.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import javax.tools.JavaFileObject;

class RegularFileObject extends BaseFileObject {
    private Reference<File> absFileRef;
    final File file;
    private boolean hasParents;
    private String name;

    public RegularFileObject(JavacFileManager fileManager, File f) {
        this(fileManager, f.getName(), f);
    }

    public RegularFileObject(JavacFileManager fileManager, String name, File f) {
        super(fileManager);
        this.hasParents = false;
        if (f.isDirectory()) {
            throw new IllegalArgumentException("directories not supported");
        }
        this.name = name;
        this.file = f;
    }

    @Override
    public URI toUri() {
        return this.file.toURI().normalize();
    }

    @Override
    public String getName() {
        return this.file.getPath();
    }

    @Override
    public String getShortName() {
        return this.name;
    }

    @Override
    public JavaFileObject.Kind getKind() {
        return getKind(this.name);
    }

    @Override
    public InputStream openInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

    @Override
    public OutputStream openOutputStream() throws IOException {
        ensureParentDirectoriesExist();
        return new FileOutputStream(this.file);
    }

    @Override
    public CharBuffer getCharContent(boolean ignoreEncodingErrors) throws IOException {
        CharBuffer cb = this.fileManager.getCachedContent(this);
        if (cb == null) {
            InputStream in = new FileInputStream(this.file);
            try {
                ByteBuffer bb = this.fileManager.makeByteBuffer(in);
                JavaFileObject prev = this.fileManager.f553log.useSource(this);
                try {
                    cb = this.fileManager.decode(bb, ignoreEncodingErrors);
                    this.fileManager.f553log.useSource(prev);
                    this.fileManager.recycleByteBuffer(bb);
                    if (!ignoreEncodingErrors) {
                        this.fileManager.cache(this, cb);
                    }
                    in.close();
                } catch (Throwable th) {
                    this.fileManager.f553log.useSource(prev);
                    throw th;
                }
            } catch (Throwable th2) {
                in.close();
                throw th2;
            }
        }
        return cb;
    }

    @Override
    public Writer openWriter() throws IOException {
        ensureParentDirectoriesExist();
        return new OutputStreamWriter(new FileOutputStream(this.file), this.fileManager.getEncodingName());
    }

    @Override
    public long getLastModified() {
        return this.file.lastModified();
    }

    @Override
    public boolean delete() {
        return this.file.delete();
    }

    @Override
    protected CharsetDecoder getDecoder(boolean ignoreEncodingErrors) {
        return this.fileManager.getDecoder(this.fileManager.getEncodingName(), ignoreEncodingErrors);
    }

    @Override
    protected String inferBinaryName(Iterable<? extends File> path) {
        String fPath = this.file.getPath();
        for (File dir : path) {
            String dPath = dir.getPath();
            if (dPath.length() == 0) {
                dPath = System.getProperty("user.dir");
            }
            String dPath2 = dPath.endsWith(File.separator) ? dPath : dPath + File.separator;
            if (fPath.regionMatches(true, 0, dPath2, 0, dPath2.length()) && new File(fPath.substring(0, dPath2.length())).equals(new File(dPath2))) {
                String relativeName = fPath.substring(dPath2.length());
                return removeExtension(relativeName).replace(File.separatorChar, '.');
            }
        }
        return null;
    }

    @Override
    public boolean isNameCompatible(String cn, JavaFileObject.Kind kind) {
        cn.getClass();
        if (kind == JavaFileObject.Kind.OTHER && getKind() != kind) {
            return false;
        }
        String n = cn + kind.extension;
        if (this.name.equals(n)) {
            return true;
        }
        if (this.name.equalsIgnoreCase(n)) {
            try {
                return this.file.getCanonicalFile().getName().equals(n);
            } catch (IOException e) {
            }
        }
        return false;
    }

    private void ensureParentDirectoriesExist() throws IOException {
        if (!this.hasParents) {
            File parent = this.file.getParentFile();
            if (parent != null && !parent.exists() && !parent.mkdirs() && (!parent.exists() || !parent.isDirectory())) {
                throw new IOException("could not create parent directories");
            }
            this.hasParents = true;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegularFileObject)) {
            return false;
        }
        RegularFileObject o = (RegularFileObject) other;
        return getAbsoluteFile().equals(o.getAbsoluteFile());
    }

    @Override
    public int hashCode() {
        return getAbsoluteFile().hashCode();
    }

    private File getAbsoluteFile() {
        Reference<File> reference = this.absFileRef;
        File absFile = reference == null ? null : reference.get();
        if (absFile == null) {
            File absFile2 = this.file.getAbsoluteFile();
            this.absFileRef = new SoftReference(absFile2);
            return absFile2;
        }
        return absFile;
    }
}
