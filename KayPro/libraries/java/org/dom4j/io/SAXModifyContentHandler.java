package org.dom4j.io;

import java.io.IOException;
import org.dom4j.DocumentFactory;
import org.dom4j.ElementHandler;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

class SAXModifyContentHandler extends SAXContentHandler {
    private XMLWriter xmlWriter;

    public SAXModifyContentHandler() {
    }

    public SAXModifyContentHandler(DocumentFactory documentFactory) {
        super(documentFactory);
    }

    public SAXModifyContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler) {
        super(documentFactory, elementHandler);
    }

    public SAXModifyContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler, ElementStack elementStack) {
        super(documentFactory, elementHandler, elementStack);
    }

    private boolean activeHandlers() {
        return getElementStack().getDispatchHandler().getActiveHandlerCount() > 0;
    }

    @Override
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        super.characters(cArr, i, i2);
        if (activeHandlers() || this.xmlWriter == null) {
            return;
        }
        this.xmlWriter.characters(cArr, i, i2);
    }

    @Override
    public void comment(char[] cArr, int i, int i2) throws SAXException {
        super.comment(cArr, i, i2);
        if (activeHandlers() || this.xmlWriter == null) {
            return;
        }
        this.xmlWriter.comment(cArr, i, i2);
    }

    @Override
    public void endCDATA() throws SAXException {
        super.endCDATA();
        if (activeHandlers() || this.xmlWriter == null) {
            return;
        }
        this.xmlWriter.endCDATA();
    }

    @Override
    public void endDTD() throws SAXException {
        super.endDTD();
        if (this.xmlWriter != null) {
            this.xmlWriter.endDTD();
        }
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        if (this.xmlWriter != null) {
            this.xmlWriter.endDocument();
        }
    }

    @Override
    public void endElement(String str, String str2, String str3) throws SAXException {
        ElementHandler handler = getElementStack().getDispatchHandler().getHandler(getElementStack().getPath());
        super.endElement(str, str2, str3);
        if (activeHandlers() || this.xmlWriter == null) {
            return;
        }
        if (handler == null) {
            this.xmlWriter.endElement(str, str2, str3);
        } else if (handler instanceof SAXModifyElementHandler) {
            try {
                this.xmlWriter.write(((SAXModifyElementHandler) handler).getModifiedElement());
            } catch (IOException e) {
                throw new SAXModifyException(e);
            }
        }
    }

    @Override
    public void endEntity(String str) throws SAXException {
        super.endEntity(str);
        if (this.xmlWriter != null) {
            this.xmlWriter.endEntity(str);
        }
    }

    @Override
    public void endPrefixMapping(String str) throws SAXException {
        super.endPrefixMapping(str);
        if (this.xmlWriter != null) {
            this.xmlWriter.endPrefixMapping(str);
        }
    }

    protected XMLWriter getXMLWriter() {
        return this.xmlWriter;
    }

    @Override
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        super.ignorableWhitespace(cArr, i, i2);
        if (activeHandlers() || this.xmlWriter == null) {
            return;
        }
        this.xmlWriter.ignorableWhitespace(cArr, i, i2);
    }

    @Override
    public void notationDecl(String str, String str2, String str3) throws SAXException {
        super.notationDecl(str, str2, str3);
        if (this.xmlWriter != null) {
            this.xmlWriter.notationDecl(str, str2, str3);
        }
    }

    @Override
    public void processingInstruction(String str, String str2) throws SAXException {
        super.processingInstruction(str, str2);
        if (activeHandlers() || this.xmlWriter == null) {
            return;
        }
        this.xmlWriter.processingInstruction(str, str2);
    }

    @Override
    public void setDocumentLocator(Locator locator) {
        super.setDocumentLocator(locator);
        if (this.xmlWriter != null) {
            this.xmlWriter.setDocumentLocator(locator);
        }
    }

    public void setXMLWriter(XMLWriter xMLWriter) {
        this.xmlWriter = xMLWriter;
    }

    @Override
    public void skippedEntity(String str) throws SAXException {
        super.skippedEntity(str);
        if (activeHandlers() || this.xmlWriter == null) {
            return;
        }
        this.xmlWriter.skippedEntity(str);
    }

    @Override
    public void startCDATA() throws SAXException {
        super.startCDATA();
        if (activeHandlers() || this.xmlWriter == null) {
            return;
        }
        this.xmlWriter.startCDATA();
    }

    @Override
    public void startDTD(String str, String str2, String str3) throws SAXException {
        super.startDTD(str, str2, str3);
        if (this.xmlWriter != null) {
            this.xmlWriter.startDTD(str, str2, str3);
        }
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        if (this.xmlWriter != null) {
            this.xmlWriter.startDocument();
        }
    }

    @Override
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        if (activeHandlers() || this.xmlWriter == null) {
            return;
        }
        this.xmlWriter.startElement(str, str2, str3, attributes);
    }

    @Override
    public void startEntity(String str) throws SAXException {
        super.startEntity(str);
        if (this.xmlWriter != null) {
            this.xmlWriter.startEntity(str);
        }
    }

    @Override
    public void startPrefixMapping(String str, String str2) throws SAXException {
        super.startPrefixMapping(str, str2);
        if (this.xmlWriter != null) {
            this.xmlWriter.startPrefixMapping(str, str2);
        }
    }

    @Override
    public void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException {
        super.unparsedEntityDecl(str, str2, str3, str4);
        if (activeHandlers() || this.xmlWriter == null) {
            return;
        }
        this.xmlWriter.unparsedEntityDecl(str, str2, str3, str4);
    }
}
