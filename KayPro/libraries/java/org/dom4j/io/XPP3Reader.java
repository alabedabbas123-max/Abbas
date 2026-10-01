package org.dom4j.io;

import java.io.BufferedReader;
import java.io.CharArrayReader;
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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class XPP3Reader {
    private DispatchHandler dispatchHandler;
    private DocumentFactory factory;
    private XmlPullParserFactory xppFactory;
    private XmlPullParser xppParser;

    public XPP3Reader() {
    }

    public XPP3Reader(DocumentFactory documentFactory) {
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
        this.xppFactory.setNamespaceAware(true);
        return this.xppFactory;
    }

    public XmlPullParser getXPPParser() throws XmlPullParserException {
        if (this.xppParser == null) {
            this.xppParser = getXPPFactory().newPullParser();
        }
        return this.xppParser;
    }

    protected Document parseDocument() throws XmlPullParserException, DocumentException, IOException {
        DocumentFactory documentFactory = getDocumentFactory();
        Document documentCreateDocument = documentFactory.createDocument();
        Element parent = null;
        XmlPullParser xPPParser = getXPPParser();
        xPPParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        while (true) {
            switch (xPPParser.nextToken()) {
                case 1:
                    return documentCreateDocument;
                case 2:
                    Element elementCreateElement = documentFactory.createElement(xPPParser.getPrefix() == null ? documentFactory.createQName(xPPParser.getName(), xPPParser.getNamespace()) : documentFactory.createQName(xPPParser.getName(), xPPParser.getPrefix(), xPPParser.getNamespace()));
                    int namespaceCount = xPPParser.getNamespaceCount(xPPParser.getDepth());
                    for (int namespaceCount2 = xPPParser.getNamespaceCount(xPPParser.getDepth() - 1); namespaceCount2 < namespaceCount; namespaceCount2++) {
                        if (xPPParser.getNamespacePrefix(namespaceCount2) != null) {
                            elementCreateElement.addNamespace(xPPParser.getNamespacePrefix(namespaceCount2), xPPParser.getNamespaceUri(namespaceCount2));
                        }
                    }
                    for (int i = 0; i < xPPParser.getAttributeCount(); i++) {
                        elementCreateElement.addAttribute(xPPParser.getAttributePrefix(i) == null ? documentFactory.createQName(xPPParser.getAttributeName(i)) : documentFactory.createQName(xPPParser.getAttributeName(i), xPPParser.getAttributePrefix(i), xPPParser.getAttributeNamespace(i)), xPPParser.getAttributeValue(i));
                    }
                    if (parent != null) {
                        parent.mo8856add(elementCreateElement);
                    } else {
                        documentCreateDocument.mo8856add(elementCreateElement);
                    }
                    parent = elementCreateElement;
                    break;
                case 3:
                    if (parent != null) {
                        parent = parent.getParent();
                    }
                    break;
                case 4:
                    String text = xPPParser.getText();
                    if (parent == null) {
                        throw new DocumentException("Cannot have text content outside of the root document");
                    }
                    parent.addText(text);
                    break;
                    break;
                case 5:
                    if (parent == null) {
                        throw new DocumentException("Cannot have text content outside of the root document");
                    }
                    parent.addCDATA(xPPParser.getText());
                    break;
                    break;
                case 8:
                    String text2 = xPPParser.getText();
                    int iIndexOf = text2.indexOf(" ");
                    if (iIndexOf >= 0) {
                        documentCreateDocument.addProcessingInstruction(text2.substring(0, iIndexOf), text2.substring(iIndexOf + 1));
                    } else {
                        documentCreateDocument.addProcessingInstruction(text2, "");
                    }
                    break;
                case 9:
                    if (parent != null) {
                        parent.addComment(xPPParser.getText());
                    } else {
                        documentCreateDocument.addComment(xPPParser.getText());
                    }
                    break;
            }
        }
    }

    public Document read(File file) throws XmlPullParserException, DocumentException, IOException {
        return read(new BufferedReader(new FileReader(file)), file.getAbsolutePath());
    }

    public Document read(InputStream inputStream) throws XmlPullParserException, DocumentException, IOException {
        return read(createReader(inputStream));
    }

    public Document read(InputStream inputStream, String str) throws XmlPullParserException, DocumentException, IOException {
        return read(createReader(inputStream), str);
    }

    public Document read(Reader reader) throws XmlPullParserException, DocumentException, IOException {
        getXPPParser().setInput(reader);
        return parseDocument();
    }

    public Document read(Reader reader, String str) throws XmlPullParserException, DocumentException, IOException {
        Document document = read(reader);
        document.setName(str);
        return document;
    }

    public Document read(String str) throws XmlPullParserException, DocumentException, IOException {
        return str.indexOf(58) >= 0 ? read(new URL(str)) : read(new File(str));
    }

    public Document read(URL url) throws XmlPullParserException, DocumentException, IOException {
        return read(createReader(url.openStream()), url.toExternalForm());
    }

    public Document read(char[] cArr) throws XmlPullParserException, DocumentException, IOException {
        getXPPParser().setInput(new CharArrayReader(cArr));
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
