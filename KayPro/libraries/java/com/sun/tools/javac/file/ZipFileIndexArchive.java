package com.sun.tools.javac.file;

import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.List;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.util.Set;
import javax.tools.JavaFileObject;

public class ZipFileIndexArchive implements JavacFileManager.Archive {
    private JavacFileManager fileManager;
    private final ZipFileIndex zfIndex;

    public ZipFileIndexArchive(JavacFileManager fileManager, ZipFileIndex zdir) throws IOException {
        this.fileManager = fileManager;
        this.zfIndex = zdir;
    }

    @Override
    public boolean contains(RelativePath name) {
        return this.zfIndex.contains(name);
    }

    @Override
    public List<String> getFiles(RelativePath.RelativeDirectory subdirectory) {
        return this.zfIndex.getFiles(subdirectory);
    }

    @Override
    public JavaFileObject getFileObject(RelativePath.RelativeDirectory subdirectory, String file) {
        RelativePath.RelativeFile fullZipFileName = new RelativePath.RelativeFile(subdirectory, file);
        ZipFileIndex.Entry entry = this.zfIndex.getZipIndexEntry(fullZipFileName);
        JavacFileManager javacFileManager = this.fileManager;
        ZipFileIndex zipFileIndex = this.zfIndex;
        JavaFileObject ret = new ZipFileIndexFileObject(javacFileManager, zipFileIndex, entry, zipFileIndex.getZipFile());
        return ret;
    }

    @Override
    public Set<RelativePath.RelativeDirectory> getSubdirectories() {
        return this.zfIndex.getAllDirectories();
    }

    @Override
    public void close() throws IOException {
        this.zfIndex.close();
    }

    public String toString() {
        return "ZipFileIndexArchive[" + this.zfIndex + "]";
    }

    public static class ZipFileIndexFileObject extends BaseFileObject {
        ZipFileIndex.Entry entry;
        InputStream inputStream;
        private String name;
        ZipFileIndex zfIndex;
        File zipName;

        ZipFileIndexFileObject(JavacFileManager fileManager, ZipFileIndex zfIndex, ZipFileIndex.Entry entry, File zipFileName) {
            super(fileManager);
            this.inputStream = null;
            this.name = entry.getFileName();
            this.zfIndex = zfIndex;
            this.entry = entry;
            this.zipName = zipFileName;
        }

        @Override
        public URI toUri() {
            return createJarUri(this.zipName, getPrefixedEntryName());
        }

        @Override
        public String getName() {
            return this.zipName + "(" + getPrefixedEntryName() + ")";
        }

        @Override
        public String getShortName() {
            return this.zipName.getName() + "(" + this.entry.getName() + ")";
        }

        @Override
        public JavaFileObject.Kind getKind() {
            return getKind(this.entry.getName());
        }

        @Override
        public InputStream openInputStream() throws IOException {
            if (this.inputStream == null) {
                Assert.checkNonNull(this.entry);
                this.inputStream = new ByteArrayInputStream(this.zfIndex.read(this.entry));
            }
            return this.inputStream;
        }

        @Override
        public OutputStream openOutputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override
        public CharBuffer getCharContent(boolean ignoreEncodingErrors) throws IOException {
            CharBuffer cb = this.fileManager.getCachedContent(this);
            if (cb == null) {
                InputStream in = new ByteArrayInputStream(this.zfIndex.read(this.entry));
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
            return this.entry.getLastModified();
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
            if (this.zfIndex.symbolFilePrefix != null) {
                String prefix = this.zfIndex.symbolFilePrefix.path;
                if (entryName.startsWith(prefix)) {
                    entryName = entryName.substring(prefix.length());
                }
            }
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
            if (!(other instanceof ZipFileIndexFileObject)) {
                return false;
            }
            ZipFileIndexFileObject o = (ZipFileIndexFileObject) other;
            return this.zfIndex.getAbsoluteFile().equals(o.zfIndex.getAbsoluteFile()) && this.name.equals(o.name);
        }

        @Override
        public int hashCode() {
            return this.zfIndex.getAbsoluteFile().hashCode() + this.name.hashCode();
        }

        private String getPrefixedEntryName() {
            if (this.zfIndex.symbolFilePrefix != null) {
                return this.zfIndex.symbolFilePrefix.path + this.entry.getName();
            }
            return this.entry.getName();
        }
    }
}
