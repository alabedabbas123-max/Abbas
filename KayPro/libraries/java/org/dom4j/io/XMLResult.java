package org.dom4j.io;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import javax.xml.transform.sax.SAXResult;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.LexicalHandler;

public class XMLResult extends SAXResult {
    private XMLWriter xmlWriter;

    public XMLResult() {
        this(new XMLWriter());
    }

    public XMLResult(OutputStream outputStream) throws UnsupportedEncodingException {
        this(new XMLWriter(outputStream));
    }

    public XMLResult(OutputStream outputStream, OutputFormat outputFormat) throws UnsupportedEncodingException {
        this(new XMLWriter(outputStream, outputFormat));
    }

    public XMLResult(Writer writer) {
        this(new XMLWriter(writer));
    }

    public XMLResult(Writer writer, OutputFormat outputFormat) {
        this(new XMLWriter(writer, outputFormat));
    }

    public XMLResult(XMLWriter xMLWriter) {
        super(xMLWriter);
        this.xmlWriter = xMLWriter;
        setLexicalHandler(xMLWriter);
    }

    @Override
    public ContentHandler getHandler() {
        return this.xmlWriter;
    }

    @Override
    public LexicalHandler getLexicalHandler() {
        return this.xmlWriter;
    }

    public XMLWriter getXMLWriter() {
        return this.xmlWriter;
    }

    public void setXMLWriter(XMLWriter xMLWriter) {
        this.xmlWriter = xMLWriter;
        setHandler(this.xmlWriter);
        setLexicalHandler(this.xmlWriter);
    }
}
