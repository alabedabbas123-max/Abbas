package org.dom4j;

import java.io.StringReader;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.dom4j.io.SAXReader;
import org.dom4j.rule.Pattern;
import org.jaxen.VariableContext;
import org.xml.sax.InputSource;

public final class DocumentHelper {
    private DocumentHelper() {
    }

    public static Attribute createAttribute(Element element, String str, String str2) {
        return getDocumentFactory().createAttribute(element, str, str2);
    }

    public static Attribute createAttribute(Element element, QName qName, String str) {
        return getDocumentFactory().createAttribute(element, qName, str);
    }

    public static CDATA createCDATA(String str) {
        return DocumentFactory.getInstance().createCDATA(str);
    }

    public static Comment createComment(String str) {
        return DocumentFactory.getInstance().createComment(str);
    }

    public static Document createDocument() {
        return getDocumentFactory().createDocument();
    }

    public static Document createDocument(Element element) {
        return getDocumentFactory().createDocument(element);
    }

    public static Element createElement(String str) {
        return getDocumentFactory().createElement(str);
    }

    public static Element createElement(QName qName) {
        return getDocumentFactory().createElement(qName);
    }

    public static Entity createEntity(String str, String str2) {
        return DocumentFactory.getInstance().createEntity(str, str2);
    }

    public static Namespace createNamespace(String str, String str2) {
        return DocumentFactory.getInstance().createNamespace(str, str2);
    }

    public static Pattern createPattern(String str) {
        return getDocumentFactory().createPattern(str);
    }

    public static ProcessingInstruction createProcessingInstruction(String str, String str2) {
        return getDocumentFactory().createProcessingInstruction(str, str2);
    }

    public static ProcessingInstruction createProcessingInstruction(String str, Map map) {
        return getDocumentFactory().createProcessingInstruction(str, map);
    }

    public static QName createQName(String str) {
        return getDocumentFactory().createQName(str);
    }

    public static QName createQName(String str, Namespace namespace) {
        return getDocumentFactory().createQName(str, namespace);
    }

    public static Text createText(String str) {
        return DocumentFactory.getInstance().createText(str);
    }

    public static XPath createXPath(String str) throws InvalidXPathException {
        return getDocumentFactory().createXPath(str);
    }

    public static XPath createXPath(String str, VariableContext variableContext) throws InvalidXPathException {
        return getDocumentFactory().createXPath(str, variableContext);
    }

    public static NodeFilter createXPathFilter(String str) {
        return getDocumentFactory().createXPathFilter(str);
    }

    private static DocumentFactory getDocumentFactory() {
        return DocumentFactory.getInstance();
    }

    private static String getEncoding(String str) {
        String strTrim = str.trim();
        if (!strTrim.startsWith("<?xml")) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(strTrim.substring(0, strTrim.indexOf("?>")), " =\"'");
        while (stringTokenizer.hasMoreTokens()) {
            if ("encoding".equals(stringTokenizer.nextToken())) {
                if (stringTokenizer.hasMoreTokens()) {
                    return stringTokenizer.nextToken();
                }
                return null;
            }
        }
        return null;
    }

    public static Element makeElement(Branch branch, String str) {
        Element element;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "/");
        if (branch instanceof Document) {
            Document document = (Document) branch;
            element = document.getRootElement();
            String strNextToken = stringTokenizer.nextToken();
            if (element == null) {
                element = document.addElement(strNextToken);
            }
        } else {
            element = (Element) branch;
        }
        Element element2 = null;
        while (true) {
            Element element3 = element;
            if (!stringTokenizer.hasMoreTokens()) {
                return element2;
            }
            String strNextToken2 = stringTokenizer.nextToken();
            element = strNextToken2.indexOf(58) > 0 ? element3.element(element3.getQName(strNextToken2)) : element3.element(strNextToken2);
            if (element == null) {
                element = element3.addElement(strNextToken2);
            }
            element2 = element;
        }
    }

    public static Document parseText(String str) throws DocumentException {
        SAXReader sAXReader = new SAXReader();
        String encoding = getEncoding(str);
        InputSource inputSource = new InputSource(new StringReader(str));
        inputSource.setEncoding(encoding);
        Document document = sAXReader.read(inputSource);
        if (document.getXMLEncoding() == null) {
            document.setXMLEncoding(encoding);
        }
        return document;
    }

    public static List selectNodes(String str, List list) {
        return createXPath(str).selectNodes(list);
    }

    public static List selectNodes(String str, Node node) {
        return createXPath(str).selectNodes(node);
    }

    public static void sort(List list, String str) {
        createXPath(str).sort(list);
    }

    public static void sort(List list, String str, boolean z) {
        createXPath(str).sort(list, z);
    }
}
