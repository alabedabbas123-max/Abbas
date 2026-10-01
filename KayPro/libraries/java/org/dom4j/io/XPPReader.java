package org.dom4j.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.xpp.ProxyXmlStartTag;
import org.gjt.xpp.XmlEndTag;
import org.gjt.xpp.XmlPullParser;
import org.gjt.xpp.XmlPullParserException;
import org.gjt.xpp.XmlPullParserFactory;

public class XPPReader {
    private DispatchHandler dispatchHandler;
    private DocumentFactory factory;
    private XmlPullParserFactory xppFactory;
    private XmlPullParser xppParser;

    public XPPReader() {
    }

    public XPPReader(DocumentFactory documentFactory) {
        this.factory = documentFactory;
    }

    public void addHandler(String str, ElementHandler elementHandler) {
        getDispatchHandler().addHandler(str, elementHandler);
    }

    protected Reader createReader(InputStream inputStream) throws IOException {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    protected DispatchHandler getDispatchHandler() {
        if (this.dispatchHandler == null) {
            this.dispatchHandler = new DispatchHandler();
        }
        return this.dispatchHandler;
    }

    public DocumentFactory getDocumentFactory() {
        if (this.factory == null) {
            this.factory = DocumentFactory.getInstance();
        }
        return this.factory;
    }

    public XmlPullParserFactory getXPPFactory() throws XmlPullParserException {
        if (this.xppFactory == null) {
            this.xppFactory = XmlPullParserFactory.newInstance();
        }
        return this.xppFactory;
    }

    public XmlPullParser getXPPParser() throws XmlPullParserException {
        if (this.xppParser == null) {
            this.xppParser = getXPPFactory().newPullParser();
        }
        return this.xppParser;
    }

    protected Document parseDocument() throws XmlPullParserException, DocumentException, IOException {
        Element parent;
        Document documentCreateDocument = getDocumentFactory().createDocument();
        Element element = null;
        XmlPullParser xPPParser = getXPPParser();
        xPPParser.setNamespaceAware(true);
        ProxyXmlStartTag proxyXmlStartTag = new ProxyXmlStartTag();
        XmlEndTag xmlEndTagNewEndTag = this.xppFactory.newEndTag();
        while (true) {
            byte next = xPPParser.next();
            switch (next) {
                case 1:
                    return documentCreateDocument;
                case 2:
                    xPPParser.readStartTag(proxyXmlStartTag);
                    parent = proxyXmlStartTag.getElement();
                    if (element == null) {
                        documentCreateDocument.mo8856add(parent);
                    } else {
                        element.mo8856add(parent);
                    }
                    break;
                case 3:
                    xPPParser.readEndTag(xmlEndTagNewEndTag);
                    parent = element == null ? element : element.getParent();
                    break;
                case 4:
                    String content = xPPParser.readContent();
                    if (element == null) {
                        throw new DocumentException("Cannot have text content outside of the root document");
                    }
                    element.addText(content);
                    parent = element;
                    break;
                    break;
                default:
                    throw new DocumentException(new StringBuffer().append("Error: unknown type: ").append((int) next).toString());
            }
            element = parent;
        }
    }

    public Document read(File file) throws DocumentException, XmlPullParserException, IOException {
        return read(new BufferedReader(new FileReader(file)), file.getAbsolutePath());
    }

    public Document read(InputStream inputStream) throws DocumentException, XmlPullParserException, IOException {
        return read(createReader(inputStream));
    }

    public Document read(InputStream inputStream, String str) throws DocumentException, XmlPullParserException, IOException {
        return read(createReader(inputStream), str);
    }

    public Document read(Reader reader) throws DocumentException, XmlPullParserException, IOException {
        getXPPParser().setInput(reader);
        return parseDocument();
    }

    public Document read(Reader reader, String str) throws DocumentException, XmlPullParserException, IOException {
        Document document = read(reader);
        document.setName(str);
        return document;
    }

    public Document read(String str) throws DocumentException, XmlPullParserException, IOException {
        return str.indexOf(58) >= 0 ? read(new URL(str)) : read(new File(str));
    }

    public Document read(URL url) throws DocumentException, XmlPullParserException, IOException {
        return read(createReader(url.openStream()), url.toExternalForm());
    }

    public Document read(char[] cArr) throws DocumentException, XmlPullParserException, IOException {
        getXPPParser().setInput(cArr);
        return parseDocument();
    }

    public void removeHandler(String str) {
        getDispatchHandler().removeHandler(str);
    }

    public void setDefaultHandler(ElementHandler elementHandler) {
        getDispatchHandler().setDefaultHandler(elementHandler);
    }

    protected void setDispatchHandler(DispatchHandler dispatchHandler) {
        this.dispatchHandler = dispatchHandler;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.factory = documentFactory;
    }

    public void setXPPFactory(XmlPullParserFactory xmlPullParserFactory) {
        this.xppFactory = xmlPullParserFactory;
    }
}
