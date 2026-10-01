package javax.tools;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.net.URI;
import java.nio.CharBuffer;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;

public class SimpleJavaFileObject implements JavaFileObject {
    protected final JavaFileObject.Kind kind;

    protected final URI f584uri;

    protected SimpleJavaFileObject(URI uri, JavaFileObject.Kind kind) {
        uri.getClass();
        kind.getClass();
        if (uri.getPath() == null) {
            throw new IllegalArgumentException("URI must have a path: " + uri);
        }
        this.f584uri = uri;
        this.kind = kind;
    }

    @Override
    public URI toUri() {
        return this.f584uri;
    }

    @Override
    public String getName() {
        return toUri().getPath();
    }

    @Override
    public InputStream openInputStream() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public OutputStream openOutputStream() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Reader openReader(boolean ignoreEncodingErrors) throws IOException {
        CharSequence charContent = getCharContent(ignoreEncodingErrors);
        if (charContent == null) {
            throw new UnsupportedOperationException();
        }
        if (charContent instanceof CharBuffer) {
            CharBuffer buffer = (CharBuffer) charContent;
            if (buffer.hasArray()) {
                return new CharArrayReader(buffer.array());
            }
        }
        return new StringReader(charContent.toString());
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Writer openWriter() throws IOException {
        return new OutputStreamWriter(openOutputStream());
    }

    @Override
    public long getLastModified() {
        return 0L;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public JavaFileObject.Kind getKind() {
        return this.kind;
    }

    @Override
    public boolean isNameCompatible(String simpleName, JavaFileObject.Kind kind) {
        String baseName = simpleName + kind.extension;
        if (kind.equals(getKind())) {
            if (!baseName.equals(toUri().getPath())) {
                if (toUri().getPath().endsWith("/" + baseName)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public NestingKind getNestingKind() {
        return null;
    }

    @Override
    public Modifier getAccessLevel() {
        return null;
    }

    public String toString() {
        return getClass().getName() + "[" + toUri() + "]";
    }
}
