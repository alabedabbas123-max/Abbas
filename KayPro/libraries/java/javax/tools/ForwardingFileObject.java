package javax.tools;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import javax.tools.FileObject;

public class ForwardingFileObject<F extends FileObject> implements FileObject {
    protected final F fileObject;

    protected ForwardingFileObject(F fileObject) {
        fileObject.getClass();
        this.fileObject = fileObject;
    }

    @Override
    public URI toUri() {
        return this.fileObject.toUri();
    }

    @Override
    public String getName() {
        return this.fileObject.getName();
    }

    @Override
    public InputStream openInputStream() throws IOException {
        return this.fileObject.openInputStream();
    }

    @Override
    public OutputStream openOutputStream() throws IOException {
        return this.fileObject.openOutputStream();
    }

    @Override
    public Reader openReader(boolean ignoreEncodingErrors) throws IOException {
        return this.fileObject.openReader(ignoreEncodingErrors);
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
        return this.fileObject.getCharContent(ignoreEncodingErrors);
    }

    @Override
    public Writer openWriter() throws IOException {
        return this.fileObject.openWriter();
    }

    @Override
    public long getLastModified() {
        return this.fileObject.getLastModified();
    }

    @Override
    public boolean delete() {
        return this.fileObject.delete();
    }
}
