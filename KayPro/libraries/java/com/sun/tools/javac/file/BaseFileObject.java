package com.sun.tools.javac.file;

import com.sun.tools.javac.util.BaseFileManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.CharsetDecoder;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.tools.FileObject;
import javax.tools.JavaFileObject;

public abstract class BaseFileObject implements JavaFileObject {
    protected final JavacFileManager fileManager;

    public abstract boolean equals(Object obj);

    public abstract String getShortName();

    public abstract int hashCode();

    protected abstract String inferBinaryName(Iterable<? extends File> iterable);

    protected BaseFileObject(JavacFileManager fileManager) {
        this.fileManager = fileManager;
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + getName() + "]";
    }

    @Override
    public NestingKind getNestingKind() {
        return null;
    }

    @Override
    public Modifier getAccessLevel() {
        return null;
    }

    @Override
    public Reader openReader(boolean ignoreEncodingErrors) throws IOException {
        return new InputStreamReader(openInputStream(), getDecoder(ignoreEncodingErrors));
    }

    protected CharsetDecoder getDecoder(boolean ignoreEncodingErrors) {
        throw new UnsupportedOperationException();
    }

    protected static JavaFileObject.Kind getKind(String filename) {
        return BaseFileManager.getKind(filename);
    }

    protected static String removeExtension(String fileName) {
        int lastDot = fileName.lastIndexOf(".");
        return lastDot == -1 ? fileName : fileName.substring(0, lastDot);
    }

    protected static URI createJarUri(File jarFile, String entryName) {
        URI jarURI = jarFile.toURI().normalize();
        String separator = entryName.startsWith("/") ? "!" : "!/";
        try {
            return new URI("jar:" + jarURI + separator + entryName);
        } catch (URISyntaxException e) {
            throw new CannotCreateUriError(jarURI + separator + entryName, e);
        }
    }

    public static class CannotCreateUriError extends Error {
        private static final long serialVersionUID = 9101708840997613546L;

        public CannotCreateUriError(String value, Throwable cause) {
            super(value, cause);
        }
    }

    public static String getSimpleName(FileObject fo) {
        URI uri = fo.toUri();
        String s = uri.getSchemeSpecificPart();
        return s.substring(s.lastIndexOf("/") + 1);
    }
}
