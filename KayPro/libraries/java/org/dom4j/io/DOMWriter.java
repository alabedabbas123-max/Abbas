package org.dom4j.io;

import com.baidu.mobstat.Config;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.CDATA;
import org.dom4j.Comment;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.ProcessingInstruction;
import org.dom4j.Text;
import org.dom4j.tree.NamespaceStack;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class DOMWriter {
    static Class class$org$dom4j$io$DOMWriter;
    private Class domDocumentClass;
    private NamespaceStack namespaceStack = new NamespaceStack();
    private static boolean loggedWarning = false;
    private static final String[] DEFAULT_DOM_DOCUMENT_CLASSES = {"org.apache.xerces.dom.DocumentImpl", "gnu.xml.dom.DomDocument", "org.apache.crimson.tree.XmlDocument", "com.sun.xml.tree.XmlDocument", "oracle.xml.parser.v2.XMLDocument", "oracle.xml.parser.XMLDocument", "org.dom4j.dom.DOMDocument"};

    public DOMWriter() {
    }

    public DOMWriter(Class cls) {
        this.domDocumentClass = cls;
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    protected void appendDOMTree(Document document, Node node, String str) {
        node.appendChild(document.createTextNode(str));
    }

    protected void appendDOMTree(Document document, Node node, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj instanceof Element) {
                appendDOMTree(document, node, (Element) obj);
            } else if (obj instanceof String) {
                appendDOMTree(document, node, (String) obj);
            } else if (obj instanceof Text) {
                appendDOMTree(document, node, ((Text) obj).getText());
            } else if (obj instanceof CDATA) {
                appendDOMTree(document, node, (CDATA) obj);
            } else if (obj instanceof Comment) {
                appendDOMTree(document, node, (Comment) obj);
            } else if (obj instanceof Entity) {
                appendDOMTree(document, node, (Entity) obj);
            } else if (obj instanceof ProcessingInstruction) {
                appendDOMTree(document, node, (ProcessingInstruction) obj);
            }
        }
    }

    protected void appendDOMTree(Document document, Node node, CDATA cdata) {
        node.appendChild(document.createCDATASection(cdata.getText()));
    }

    protected void appendDOMTree(Document document, Node node, Comment comment) {
        node.appendChild(document.createComment(comment.getText()));
    }

    protected void appendDOMTree(Document document, Node node, Element element) {
        org.w3c.dom.Element elementCreateElementNS = document.createElementNS(element.getNamespaceURI(), element.getQualifiedName());
        int size = this.namespaceStack.size();
        Namespace namespace = element.getNamespace();
        if (isNamespaceDeclaration(namespace)) {
            this.namespaceStack.push(namespace);
            writeNamespace(elementCreateElementNS, namespace);
        }
        List listDeclaredNamespaces = element.declaredNamespaces();
        int size2 = listDeclaredNamespaces.size();
        for (int i = 0; i < size2; i++) {
            Namespace namespace2 = (Namespace) listDeclaredNamespaces.get(i);
            if (isNamespaceDeclaration(namespace2)) {
                this.namespaceStack.push(namespace2);
                writeNamespace(elementCreateElementNS, namespace2);
            }
        }
        int iAttributeCount = element.attributeCount();
        for (int i2 = 0; i2 < iAttributeCount; i2++) {
            Attribute attribute = element.attribute(i2);
            elementCreateElementNS.setAttributeNS(attribute.getNamespaceURI(), attribute.getQualifiedName(), attribute.getValue());
        }
        appendDOMTree(document, elementCreateElementNS, element.content());
        node.appendChild(elementCreateElementNS);
        while (this.namespaceStack.size() > size) {
            this.namespaceStack.m8883pop();
        }
    }

    protected void appendDOMTree(Document document, Node node, Entity entity) {
        node.appendChild(document.createEntityReference(entity.getName()));
    }

    protected void appendDOMTree(Document document, Node node, ProcessingInstruction processingInstruction) {
        node.appendChild(document.createProcessingInstruction(processingInstruction.getTarget(), processingInstruction.getText()));
    }

    protected String attributeNameForNamespace(Namespace namespace) {
        String prefix = namespace.getPrefix();
        return prefix.length() > 0 ? new StringBuffer().append("xmlns").append(Config.TRACE_TODAY_VISIT_SPLIT).append(prefix).toString() : "xmlns";
    }

    protected Document createDomDocument(org.dom4j.Document document) throws DocumentException {
        if (this.domDocumentClass != null) {
            try {
                return (Document) this.domDocumentClass.newInstance();
            } catch (Exception e) {
                throw new DocumentException(new StringBuffer().append("Could not instantiate an instance of DOM Document with class: ").append(this.domDocumentClass.getName()).toString(), e);
            }
        }
        Document documentCreateDomDocumentViaJAXP = createDomDocumentViaJAXP();
        if (documentCreateDomDocumentViaJAXP != null) {
            return documentCreateDomDocumentViaJAXP;
        }
        Class domDocumentClass = getDomDocumentClass();
        try {
            return (Document) domDocumentClass.newInstance();
        } catch (Exception e2) {
            throw new DocumentException(new StringBuffer().append("Could not instantiate an instance of DOM Document with class: ").append(domDocumentClass.getName()).toString(), e2);
        }
    }

    protected Document createDomDocument(org.dom4j.Document document, DOMImplementation dOMImplementation) throws DocumentException {
        return dOMImplementation.createDocument(null, null, null);
    }

    protected Document createDomDocumentViaJAXP() throws DocumentException {
        try {
            return JAXPHelper.createDocument(false, true);
        } catch (Throwable th) {
            if (!loggedWarning) {
                loggedWarning = true;
                if (SAXHelper.isVerboseErrorReporting()) {
                    System.out.println("Warning: Caught exception attempting to use JAXP to create a W3C DOM document");
                    System.out.println(new StringBuffer().append("Warning: Exception was: ").append(th).toString());
                    th.printStackTrace();
                } else {
                    System.out.println("Warning: Error occurred using JAXP to create a DOM document.");
                }
            }
            return null;
        }
    }

    public Class getDomDocumentClass() throws DocumentException {
        Class clsClass$;
        Class<?> cls = this.domDocumentClass;
        if (cls == null) {
            int length = DEFAULT_DOM_DOCUMENT_CLASSES.length;
            for (int i = 0; i < length; i++) {
                try {
                    String str = DEFAULT_DOM_DOCUMENT_CLASSES[i];
                    if (class$org$dom4j$io$DOMWriter == null) {
                        clsClass$ = class$("org.dom4j.io.DOMWriter");
                        class$org$dom4j$io$DOMWriter = clsClass$;
                    } else {
                        clsClass$ = class$org$dom4j$io$DOMWriter;
                    }
                    cls = Class.forName(str, true, clsClass$.getClassLoader());
                    if (cls != null) {
                        break;
                    }
                } catch (Exception e) {
                }
            }
        }
        return cls;
    }

    protected boolean isNamespaceDeclaration(Namespace namespace) {
        String uri;
        return (namespace == null || namespace == Namespace.NO_NAMESPACE || namespace == Namespace.XML_NAMESPACE || (uri = namespace.getURI()) == null || uri.length() <= 0 || this.namespaceStack.contains(namespace)) ? false : true;
    }

    protected void resetNamespaceStack() {
        this.namespaceStack.clear();
        this.namespaceStack.push(Namespace.XML_NAMESPACE);
    }

    public void setDomDocumentClass(Class cls) {
        this.domDocumentClass = cls;
    }

    public void setDomDocumentClassName(String str) throws DocumentException {
        Class clsClass$;
        try {
            if (class$org$dom4j$io$DOMWriter == null) {
                clsClass$ = class$("org.dom4j.io.DOMWriter");
                class$org$dom4j$io$DOMWriter = clsClass$;
            } else {
                clsClass$ = class$org$dom4j$io$DOMWriter;
            }
            this.domDocumentClass = Class.forName(str, true, clsClass$.getClassLoader());
        } catch (Exception e) {
            throw new DocumentException(new StringBuffer().append("Could not load the DOM Document class: ").append(str).toString(), e);
        }
    }

    public Document write(org.dom4j.Document document) throws DocumentException {
        if (document instanceof Document) {
            return (Document) document;
        }
        resetNamespaceStack();
        Document documentCreateDomDocument = createDomDocument(document);
        appendDOMTree(documentCreateDomDocument, documentCreateDomDocument, document.content());
        this.namespaceStack.clear();
        return documentCreateDomDocument;
    }

    public Document write(org.dom4j.Document document, DOMImplementation dOMImplementation) throws DocumentException {
        if (document instanceof Document) {
            return (Document) document;
        }
        resetNamespaceStack();
        Document documentCreateDomDocument = createDomDocument(document, dOMImplementation);
        appendDOMTree(documentCreateDomDocument, documentCreateDomDocument, document.content());
        this.namespaceStack.clear();
        return documentCreateDomDocument;
    }

    protected void writeNamespace(org.w3c.dom.Element element, Namespace namespace) {
        element.setAttribute(attributeNameForNamespace(namespace), namespace.getURI());
    }
}
