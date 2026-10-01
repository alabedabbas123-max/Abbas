package org.dom4j.io;

import java.util.ArrayList;
import org.dom4j.Branch;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.tree.NamespaceStack;
import org.w3c.dom.DocumentType;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMReader {
    private DocumentFactory factory;
    private NamespaceStack namespaceStack;

    public DOMReader() {
        this.factory = DocumentFactory.getInstance();
        this.namespaceStack = new NamespaceStack(this.factory);
    }

    public DOMReader(DocumentFactory documentFactory) {
        this.factory = documentFactory;
        this.namespaceStack = new NamespaceStack(documentFactory);
    }

    private String getPrefix(String str) {
        int iIndexOf = str.indexOf(58, 5);
        return iIndexOf != -1 ? str.substring(iIndexOf + 1) : "";
    }

    protected void clearNamespaceStack() {
        this.namespaceStack.clear();
        if (this.namespaceStack.contains(Namespace.XML_NAMESPACE)) {
            return;
        }
        this.namespaceStack.push(Namespace.XML_NAMESPACE);
    }

    protected Document createDocument() {
        return getDocumentFactory().createDocument();
    }

    public DocumentFactory getDocumentFactory() {
        return this.factory;
    }

    protected Namespace getNamespace(String str, String str2) {
        return getDocumentFactory().createNamespace(str, str2);
    }

    public Document read(org.w3c.dom.Document document) {
        if (document instanceof Document) {
            return (Document) document;
        }
        Document documentCreateDocument = createDocument();
        clearNamespaceStack();
        NodeList childNodes = document.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            readTree(childNodes.item(i), documentCreateDocument);
        }
        return documentCreateDocument;
    }

    protected void readElement(Node node, Branch branch) {
        Node namedItem;
        int size = this.namespaceStack.size();
        String namespaceURI = node.getNamespaceURI();
        if (node.getPrefix() == null) {
        }
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null && namespaceURI == null && (namedItem = attributes.getNamedItem("xmlns")) != null) {
            namespaceURI = namedItem.getNodeValue();
        }
        Element elementAddElement = branch.addElement(this.namespaceStack.getQName(namespaceURI, node.getLocalName(), node.getNodeName()));
        if (attributes != null) {
            int length = attributes.getLength();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                Node nodeItem = attributes.item(i);
                String nodeName = nodeItem.getNodeName();
                if (nodeName.startsWith("xmlns")) {
                    elementAddElement.mo8862add(this.namespaceStack.addNamespace(getPrefix(nodeName), nodeItem.getNodeValue()));
                } else {
                    arrayList.add(nodeItem);
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Node node2 = (Node) arrayList.get(i2);
                elementAddElement.addAttribute(this.namespaceStack.getQName(node2.getNamespaceURI(), node2.getLocalName(), node2.getNodeName()), node2.getNodeValue());
            }
        }
        NodeList childNodes = node.getChildNodes();
        int length2 = childNodes.getLength();
        for (int i3 = 0; i3 < length2; i3++) {
            readTree(childNodes.item(i3), elementAddElement);
        }
        while (this.namespaceStack.size() > size) {
            this.namespaceStack.m8883pop();
        }
    }

    protected void readTree(Node node, Branch branch) {
        Document document;
        Element element;
        if (branch instanceof Element) {
            document = null;
            element = (Element) branch;
        } else {
            document = (Document) branch;
            element = null;
        }
        switch (node.getNodeType()) {
            case 1:
                readElement(node, branch);
                break;
            case 2:
            case 9:
            default:
                System.out.println(new StringBuffer().append("WARNING: Unknown DOM node type: ").append((int) node.getNodeType()).toString());
                break;
            case 3:
                element.addText(node.getNodeValue());
                break;
            case 4:
                element.addCDATA(node.getNodeValue());
                break;
            case 5:
                Node firstChild = node.getFirstChild();
                if (firstChild == null) {
                    element.addEntity(node.getNodeName(), "");
                } else {
                    element.addEntity(node.getNodeName(), firstChild.getNodeValue());
                }
                break;
            case 6:
                element.addEntity(node.getNodeName(), node.getNodeValue());
                break;
            case 7:
                if (!(branch instanceof Element)) {
                    ((Document) branch).addProcessingInstruction(node.getNodeName(), node.getNodeValue());
                } else {
                    ((Element) branch).addProcessingInstruction(node.getNodeName(), node.getNodeValue());
                }
                break;
            case 8:
                if (!(branch instanceof Element)) {
                    ((Document) branch).addComment(node.getNodeValue());
                } else {
                    ((Element) branch).addComment(node.getNodeValue());
                }
                break;
            case 10:
                DocumentType documentType = (DocumentType) node;
                document.addDocType(documentType.getName(), documentType.getPublicId(), documentType.getSystemId());
                break;
        }
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.factory = documentFactory;
        this.namespaceStack.setDocumentFactory(this.factory);
    }
}
