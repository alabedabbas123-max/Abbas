package com.sun.tools.javac.file;

import com.sun.tools.javac.util.List;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.tools.JavaFileObject;

public class ZipArchive implements JavacFileManager.Archive {
    protected Reference<File> absFileRef;
    protected JavacFileManager fileManager;

    protected final Map<RelativePath.RelativeDirectory, List<String>> f398map;
    protected final ZipFile zfile;

    public ZipArchive(JavacFileManager fm, ZipFile zfile) throws IOException {
        this(fm, zfile, true);
    }

    protected ZipArchive(JavacFileManager fm, ZipFile zfile, boolean initMap) throws IOException {
        this.fileManager = fm;
        this.zfile = zfile;
        this.f398map = new HashMap();
        if (initMap) {
            initMap();
        }
    }

    protected void initMap() throws IOException {
        Enumeration<? extends ZipEntry> e = this.zfile.entries();
        while (e.hasMoreElements()) {
            try {
                ZipEntry entry = e.nextElement();
                addZipEntry(entry);
            } catch (InternalError ex) {
                IOException io = new IOException();
                io.initCause(ex);
                throw io;
            }
        }
    }

    void addZipEntry(ZipEntry entry) {
        String name = entry.getName();
        int i = name.lastIndexOf(47);
        RelativePath.RelativeDirectory dirname = new RelativePath.RelativeDirectory(name.substring(0, i + 1));
        String basename = name.substring(i + 1);
        if (basename.length() == 0) {
            return;
        }
        List<String> list = this.f398map.get(dirname);
        if (list == null) {
            list = List.m507nil();
        }
        this.f398map.put(dirname, list.prepend(basename));
    }

    @Override
    public boolean contains(RelativePath name) {
        List<String> list;
        RelativePath.RelativeDirectory dirname = name.dirname();
        String basename = name.basename();
        return (basename.length() == 0 || (list = this.f398map.get(dirname)) == null || !list.contains(basename)) ? false : true;
    }

    @Override
    public List<String> getFiles(RelativePath.RelativeDirectory subdirectory) {
        return this.f398map.get(subdirectory);
    }

    @Override
    public JavaFileObject getFileObject(RelativePath.RelativeDirectory subdirectory, String file) {
        ZipEntry ze = new RelativePath.RelativeFile(subdirectory, file).getZipEntry(this.zfile);
        return new ZipFileObject(this, file, ze);
    }

    @Override
    public Set<RelativePath.RelativeDirectory> getSubdirectories() {
        return this.f398map.keySet();
    }

    @Override
    public void close() throws IOException {
        this.zfile.close();
    }

    public String toString() {
        return "ZipArchive[" + this.zfile.getName() + "]";
    }

    public File getAbsoluteFile() {
        Reference<File> reference = this.absFileRef;
        File absFile = reference == null ? null : reference.get();
        if (absFile == null) {
            File absFile2 = new File(this.zfile.getName()).getAbsoluteFile();
            this.absFileRef = new SoftReference(absFile2);
            return absFile2;
        }
        return absFile;
    }

    public static class ZipFileObject extends BaseFileObject {
        ZipEntry entry;
        private String name;
        ZipArchive zarch;

        protected ZipFileObject(ZipArchive zarch, String name, ZipEntry entry) {
            super(zarch.fileManager);
            this.zarch = zarch;
            this.name = name;
            this.entry = entry;
        }

        @Override
        public URI toUri() {
            File zipFile = new File(this.zarch.zfile.getName());
            return createJarUri(zipFile, this.entry.getName());
        }

        @Override
        public String getName() {
            return this.zarch.zfile.getName() + "(" + this.entry.getName() + ")";
        }

        @Override
        public String getShortName() {
            return new File(this.zarch.zfile.getName()).getName() + "(" + this.entry + ")";
        }

        @Override
        public JavaFileObject.Kind getKind() {
            return getKind(this.entry.getName());
        }

        @Override
        public InputStream openInputStream() throws IOException {
            return this.zarch.zfile.getInputStream(this.entry);
        }

        @Override
        public OutputStream openOutputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override
        public CharBuffer getCharContent(boolean ignoreEncodingErrors) throws IOException {
            CharBuffer cb = this.fileManager.getCachedContent(this);
            if (cb == null) {
                InputStream in = this.zarch.zfile.getInputStream(this.entry);
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
            throw new UnsupportedOperationException();
        }

        @Override
        public long getLastModified() {
            return this.entry.getTime();
        }

        @Override
        public boolean delete() {
            throw new UnsupportedOperationException();
        }

        @Override
        protected CharsetDecoder getDecoder(boolean ignoreEncodingErrors) {
            return this.fileManager.getDecoder(this.fileManager.getEncodingName(), ignoreEncodingErrors);
        }

        @Override
        protected String inferBinaryName(Iterable<? extends File> path) {
            String entryName = this.entry.getName();
            return removeExtension(entryName).replace('/', '.');
        }

        @Override
        public boolean isNameCompatible(String cn, JavaFileObject.Kind k) {
            cn.getClass();
            if (k == JavaFileObject.Kind.OTHER && getKind() != k) {
                return false;
            }
            return this.name.equals(cn + k.extension);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ZipFileObject)) {
                return false;
            }
            ZipFileObject o = (ZipFileObject) other;
            return this.zarch.getAbsoluteFile().equals(o.zarch.getAbsoluteFile()) && this.name.equals(o.name);
        }

        @Override
        public int hashCode() {
            return this.zarch.getAbsoluteFile().hashCode() + this.name.hashCode();
        }
    }
}
