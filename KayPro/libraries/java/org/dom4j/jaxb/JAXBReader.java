package org.dom4j.jaxb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;

public class JAXBReader extends JAXBSupport {
    private boolean pruneElements;
    private SAXReader reader;

    private class PruningElementHandler implements ElementHandler {
        private final JAXBReader this$0;

        public PruningElementHandler(JAXBReader jAXBReader) {
            this.this$0 = jAXBReader;
        }

        @Override
        public void onEnd(ElementPath elementPath) {
            elementPath.getCurrent().detach();
        }

        @Override
        public void onStart(ElementPath elementPath) {
        }
    }

    private class UnmarshalElementHandler implements ElementHandler {
        private JAXBObjectHandler handler;
        private JAXBReader jaxbReader;
        private final JAXBReader this$0;

        public UnmarshalElementHandler(JAXBReader jAXBReader, JAXBReader jAXBReader2, JAXBObjectHandler jAXBObjectHandler) {
            this.this$0 = jAXBReader;
            this.jaxbReader = jAXBReader2;
            this.handler = jAXBObjectHandler;
        }

        @Override
        public void onEnd(ElementPath elementPath) {
            try {
                Element current = elementPath.getCurrent();
                javax.xml.bind.Element elementUnmarshal = this.jaxbReader.unmarshal(current);
                if (this.jaxbReader.isPruneElements()) {
                    current.detach();
                }
                this.handler.handleObject(elementUnmarshal);
            } catch (Exception e) {
                throw new JAXBRuntimeException(e);
            }
        }

        @Override
        public void onStart(ElementPath elementPath) {
        }
    }

    public JAXBReader(String str) {
        super(str);
    }

    public JAXBReader(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    private SAXReader getReader() {
        if (this.reader == null) {
            this.reader = new SAXReader();
        }
        return this.reader;
    }

    public void addHandler(String str, ElementHandler elementHandler) {
        getReader().addHandler(str, elementHandler);
    }

    public void addObjectHandler(String str, JAXBObjectHandler jAXBObjectHandler) {
        getReader().addHandler(str, new UnmarshalElementHandler(this, this, jAXBObjectHandler));
    }

    public boolean isPruneElements() {
        return this.pruneElements;
    }

    public Document read(File file) throws DocumentException {
        return getReader().read(file);
    }

    public Document read(File file, Charset charset) throws DocumentException {
        try {
            return getReader().read(new InputStreamReader(new FileInputStream(file), charset));
        } catch (FileNotFoundException e) {
            throw new DocumentException(e.getMessage(), e);
        } catch (JAXBRuntimeException e2) {
            Throwable cause = e2.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(InputStream inputStream) throws DocumentException {
        try {
            return getReader().read(inputStream);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(InputStream inputStream, String str) throws DocumentException {
        try {
            return getReader().read(inputStream);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(Reader reader) throws DocumentException {
        try {
            return getReader().read(reader);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(Reader reader, String str) throws DocumentException {
        try {
            return getReader().read(reader);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(String str) throws DocumentException {
        try {
            return getReader().read(str);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(URL url) throws DocumentException {
        try {
            return getReader().read(url);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(InputSource inputSource) throws DocumentException {
        try {
            return getReader().read(inputSource);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public void removeHandler(String str) {
        getReader().removeHandler(str);
    }

    public void removeObjectHandler(String str) {
        getReader().removeHandler(str);
    }

    public void resetHandlers() {
        getReader().resetHandlers();
    }

    public void setPruneElements(boolean z) {
        this.pruneElements = z;
        if (z) {
            getReader().setDefaultHandler(new PruningElementHandler(this));
        }
    }
}
