package com.sun.tools.javac.file;

import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.tools.JavaFileObject;

public abstract class RelativePath implements Comparable<RelativePath> {
    protected final String path;

    public abstract String basename();

    public abstract RelativeDirectory dirname();

    protected RelativePath(String p) {
        this.path = p;
    }

    public File getFile(File directory) {
        if (this.path.length() == 0) {
            return directory;
        }
        return new File(directory, this.path.replace('/', File.separatorChar));
    }

    @Override
    public int compareTo(RelativePath other) {
        return this.path.compareTo(other.path);
    }

    public boolean equals(Object other) {
        if (!(other instanceof RelativePath)) {
            return false;
        }
        return this.path.equals(((RelativePath) other).path);
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public String toString() {
        return "RelPath[" + this.path + "]";
    }

    public String getPath() {
        return this.path;
    }

    public static class RelativeDirectory extends RelativePath {
        @Override
        public int compareTo(RelativePath relativePath) {
            return super.compareTo(relativePath);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeDirectory(String p) {
            String str;
            if (p.length() == 0 || p.endsWith("/")) {
                str = p;
            } else {
                str = p + "/";
            }
            super(str);
        }

        public RelativeDirectory(RelativeDirectory d, String p) {
            this(d.path + p);
        }

        static RelativeDirectory forPackage(CharSequence packageName) {
            return new RelativeDirectory(packageName.toString().replace('.', '/'));
        }

        @Override
        public RelativeDirectory dirname() {
            int l = this.path.length();
            if (l == 0) {
                return this;
            }
            int sep = this.path.lastIndexOf(47, l - 2);
            return new RelativeDirectory(this.path.substring(0, sep + 1));
        }

        @Override
        public String basename() {
            int l = this.path.length();
            if (l == 0) {
                return this.path;
            }
            int sep = this.path.lastIndexOf(47, l - 2);
            return this.path.substring(sep + 1, l - 1);
        }

        boolean contains(RelativePath other) {
            return other.path.length() > this.path.length() && other.path.startsWith(this.path);
        }

        @Override
        public String toString() {
            return "RelativeDirectory[" + this.path + "]";
        }
    }

    public static class RelativeFile extends RelativePath {
        @Override
        public int compareTo(RelativePath relativePath) {
            return super.compareTo(relativePath);
        }

        public RelativeFile(String p) {
            super(p);
            if (p.endsWith("/")) {
                throw new IllegalArgumentException(p);
            }
        }

        public RelativeFile(RelativeDirectory d, String p) {
            this(d.path + p);
        }

        RelativeFile(RelativeDirectory d, RelativePath p) {
            this(d, p.path);
        }

        static RelativeFile forClass(CharSequence className, JavaFileObject.Kind kind) {
            return new RelativeFile(className.toString().replace('.', '/') + kind.extension);
        }

        @Override
        public RelativeDirectory dirname() {
            int sep = this.path.lastIndexOf(47);
            return new RelativeDirectory(this.path.substring(0, sep + 1));
        }

        @Override
        public String basename() {
            int sep = this.path.lastIndexOf(47);
            return this.path.substring(sep + 1);
        }

        ZipEntry getZipEntry(ZipFile zip) {
            return zip.getEntry(this.path);
        }

        @Override
        public String toString() {
            return "RelativeFile[" + this.path + "]";
        }
    }
}
