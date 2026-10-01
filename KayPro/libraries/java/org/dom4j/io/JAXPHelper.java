package org.dom4j.io;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;
import org.w3c.dom.Document;
import org.xml.sax.XMLReader;

class JAXPHelper {
    protected JAXPHelper() {
    }

    public static Document createDocument(boolean z, boolean z2) throws Exception {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setValidating(z);
        documentBuilderFactoryNewInstance.setNamespaceAware(z2);
        return documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
    }

    public static XMLReader createXMLReader(boolean z, boolean z2) throws Exception {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setValidating(z);
        sAXParserFactoryNewInstance.setNamespaceAware(z2);
        return sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
    }
}
