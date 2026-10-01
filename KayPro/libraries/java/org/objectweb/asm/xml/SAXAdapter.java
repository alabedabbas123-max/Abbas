package org.objectweb.asm.xml;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public class SAXAdapter {

    private final ContentHandler f6715h;

    protected SAXAdapter(ContentHandler contentHandler) {
        this.f6715h = contentHandler;
    }

    protected void addDocumentEnd() {
        try {
            this.f6715h.endDocument();
        } catch (SAXException e) {
            throw new RuntimeException(e.getMessage(), e.getException());
        }
    }

    protected void addDocumentStart() {
        try {
            this.f6715h.startDocument();
        } catch (SAXException e) {
            throw new RuntimeException(e.getMessage(), e.getException());
        }
    }

    protected final void addElement(String str, Attributes attributes) {
        addStart(str, attributes);
        addEnd(str);
    }

    protected final void addEnd(String str) {
        try {
            this.f6715h.endElement("", str, str);
        } catch (SAXException e) {
            throw new RuntimeException(e.getMessage(), e.getException());
        }
    }

    protected final void addStart(String str, Attributes attributes) {
        try {
            this.f6715h.startElement("", str, str, attributes);
        } catch (SAXException e) {
            throw new RuntimeException(e.getMessage(), e.getException());
        }
    }

    protected ContentHandler getContentHandler() {
        return this.f6715h;
    }
}
