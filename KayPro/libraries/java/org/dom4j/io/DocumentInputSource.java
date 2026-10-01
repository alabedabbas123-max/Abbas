package org.dom4j.io;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import org.dom4j.Document;
import org.xml.sax.InputSource;

class DocumentInputSource extends InputSource {
    private Document document;

    public DocumentInputSource() {
    }

    public DocumentInputSource(Document document) {
        this.document = document;
        setSystemId(document.getName());
    }

    @Override
    public Reader getCharacterStream() {
        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xMLWriter = new XMLWriter(stringWriter);
            xMLWriter.write(this.document);
            xMLWriter.flush();
            return new StringReader(stringWriter.toString());
        } catch (IOException e) {
            return new Reader(this, e) {
                private final DocumentInputSource this$0;
                private final IOException val$e;

                {
                    this.this$0 = this;
                    this.val$e = e;
                }

                @Override
                public void close() throws IOException {
                }

                @Override
                public int read(char[] cArr, int i, int i2) throws IOException {
                    throw this.val$e;
                }
            };
        }
    }

    public Document getDocument() {
        return this.document;
    }

    @Override
    public void setCharacterStream(Reader reader) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public void setDocument(Document document) {
        this.document = document;
        setSystemId(document.getName());
    }
}
