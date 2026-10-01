package org.dom4j.io;

import javax.xml.transform.sax.SAXSource;
import org.dom4j.Document;
import org.dom4j.Node;
import org.xml.sax.InputSource;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

public class DocumentSource extends SAXSource {
    public static final String DOM4J_FEATURE = "http://org.dom4j.io.DoucmentSource/feature";
    private XMLReader xmlReader = new SAXWriter();

    public DocumentSource(Document document) {
        setDocument(document);
    }

    public DocumentSource(Node node) {
        setDocument(node.getDocument());
    }

    public Document getDocument() {
        return ((DocumentInputSource) getInputSource()).getDocument();
    }

    @Override
    public XMLReader getXMLReader() {
        return this.xmlReader;
    }

    public void setDocument(Document document) {
        super.setInputSource(new DocumentInputSource(document));
    }

    @Override
    public void setInputSource(InputSource inputSource) throws UnsupportedOperationException {
        if (!(inputSource instanceof DocumentInputSource)) {
            throw new UnsupportedOperationException();
        }
        super.setInputSource((DocumentInputSource) inputSource);
    }

    @Override
    public void setXMLReader(XMLReader xMLReader) throws UnsupportedOperationException {
        if (xMLReader instanceof SAXWriter) {
            this.xmlReader = (SAXWriter) xMLReader;
            return;
        }
        if (!(xMLReader instanceof XMLFilter)) {
            throw new UnsupportedOperationException();
        }
        XMLFilter xMLFilter = (XMLFilter) xMLReader;
        while (true) {
            XMLReader parent = xMLFilter.getParent();
            if (!(parent instanceof XMLFilter)) {
                xMLFilter.setParent(this.xmlReader);
                this.xmlReader = xMLFilter;
                return;
            }
            xMLFilter = (XMLFilter) parent;
        }
    }
}
