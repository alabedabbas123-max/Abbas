package org.dom4j.dom;

import java.util.ArrayList;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.DocumentFactory;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.tree.DefaultElement;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMElement extends DefaultElement implements Element {
    private static final DocumentFactory DOCUMENT_FACTORY = DOMDocumentFactory.getInstance();

    public DOMElement(String str) {
        super(str);
    }

    public DOMElement(String str, Namespace namespace) {
        super(str, namespace);
    }

    public DOMElement(QName qName) {
        super(qName);
    }

    public DOMElement(QName qName, int i) {
        super(qName, i);
    }

    private void checkNewChildNode(Node node) throws DOMException {
        short nodeType = node.getNodeType();
        if (nodeType != 1 && nodeType != 3 && nodeType != 8 && nodeType != 7 && nodeType != 4 && nodeType != 5) {
            throw new DOMException((short) 3, "Given node cannot be a child of element");
        }
    }

    @Override
    public Node appendChild(Node node) throws DOMException {
        checkNewChildNode(node);
        return DOMNodeHelper.appendChild(this, node);
    }

    protected Attribute attribute(String str, String str2) {
        List listAttributeList = attributeList();
        int size = listAttributeList.size();
        for (int i = 0; i < size; i++) {
            Attribute attribute = (Attribute) listAttributeList.get(i);
            if (str2.equals(attribute.getName())) {
                if ((str == null || str.length() == 0) && (attribute.getNamespaceURI() == null || attribute.getNamespaceURI().length() == 0)) {
                    return attribute;
                }
                if (str != null && str.equals(attribute.getNamespaceURI())) {
                    return attribute;
                }
            }
        }
        return null;
    }

    protected Attribute attribute(Attr attr) {
        return attribute(DOCUMENT_FACTORY.createQName(attr.getLocalName(), attr.getPrefix(), attr.getNamespaceURI()));
    }

    @Override
    public Node cloneNode(boolean z) {
        return DOMNodeHelper.cloneNode(this, z);
    }

    protected Attribute createAttribute(Attr attr) {
        QName qNameCreateQName;
        String localName = attr.getLocalName();
        if (localName != null) {
            qNameCreateQName = getDocumentFactory().createQName(localName, attr.getPrefix(), attr.getNamespaceURI());
        } else {
            qNameCreateQName = getDocumentFactory().createQName(attr.getName());
        }
        return new DOMAttribute(qNameCreateQName, attr.getValue());
    }

    @Override
    public String getAttribute(String str) {
        String strAttributeValue = attributeValue(str);
        return strAttributeValue != null ? strAttributeValue : "";
    }

    @Override
    public String getAttributeNS(String str, String str2) {
        String value;
        Attribute attribute = attribute(str, str2);
        return (attribute == null || (value = attribute.getValue()) == null) ? "" : value;
    }

    @Override
    public Attr getAttributeNode(String str) {
        return DOMNodeHelper.asDOMAttr(attribute(str));
    }

    @Override
    public Attr getAttributeNodeNS(String str, String str2) {
        Attribute attribute = attribute(str, str2);
        if (attribute == null) {
            return null;
        }
        DOMNodeHelper.asDOMAttr(attribute);
        return null;
    }

    @Override
    public NamedNodeMap getAttributes() {
        return new DOMAttributeNodeMap(this);
    }

    @Override
    public NodeList getChildNodes() {
        return DOMNodeHelper.createNodeList(content());
    }

    @Override
    protected DocumentFactory getDocumentFactory() {
        DocumentFactory documentFactory = getQName().getDocumentFactory();
        return documentFactory != null ? documentFactory : DOCUMENT_FACTORY;
    }

    @Override
    public NodeList getElementsByTagName(String str) {
        ArrayList arrayList = new ArrayList();
        DOMNodeHelper.appendElementsByTagName(arrayList, this, str);
        return DOMNodeHelper.createNodeList(arrayList);
    }

    @Override
    public NodeList getElementsByTagNameNS(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        DOMNodeHelper.appendElementsByTagNameNS(arrayList, this, str, str2);
        return DOMNodeHelper.createNodeList(arrayList);
    }

    @Override
    public Node getFirstChild() {
        return DOMNodeHelper.asDOMNode(node(0));
    }

    @Override
    public Node getLastChild() {
        return DOMNodeHelper.asDOMNode(node(nodeCount() - 1));
    }

    @Override
    public String getLocalName() {
        return getQName().getName();
    }

    @Override
    public String getNamespaceURI() {
        return getQName().getNamespaceURI();
    }

    @Override
    public Node getNextSibling() {
        return DOMNodeHelper.getNextSibling(this);
    }

    @Override
    public String getNodeName() {
        return getName();
    }

    @Override
    public String getNodeValue() throws DOMException {
        return null;
    }

    @Override
    public Document getOwnerDocument() {
        return DOMNodeHelper.getOwnerDocument(this);
    }

    @Override
    public Node getParentNode() {
        return DOMNodeHelper.getParentNode(this);
    }

    @Override
    public String getPrefix() {
        return getQName().getNamespacePrefix();
    }

    @Override
    public Node getPreviousSibling() {
        return DOMNodeHelper.getPreviousSibling(this);
    }

    protected QName getQName(String str, String str2) {
        int iIndexOf = str2.indexOf(58);
        String strSubstring = "";
        if (iIndexOf >= 0) {
            strSubstring = str2.substring(0, iIndexOf);
            str2 = str2.substring(iIndexOf + 1);
        }
        return getDocumentFactory().createQName(str2, strSubstring, str);
    }

    @Override
    public String getTagName() {
        return getName();
    }

    @Override
    public boolean hasAttribute(String str) {
        return attribute(str) != null;
    }

    @Override
    public boolean hasAttributeNS(String str, String str2) {
        return attribute(str, str2) != null;
    }

    @Override
    public boolean hasAttributes() {
        return DOMNodeHelper.hasAttributes(this);
    }

    @Override
    public boolean hasChildNodes() {
        return nodeCount() > 0;
    }

    @Override
    public Node insertBefore(Node node, Node node2) throws DOMException {
        checkNewChildNode(node);
        return DOMNodeHelper.insertBefore(this, node, node2);
    }

    @Override
    public boolean isSupported(String str, String str2) {
        return DOMNodeHelper.isSupported(this, str, str2);
    }

    @Override
    public void removeAttribute(String str) throws DOMException {
        Attribute attribute = attribute(str);
        if (attribute != null) {
            remove(attribute);
        }
    }

    @Override
    public void removeAttributeNS(String str, String str2) throws DOMException {
        Attribute attribute = attribute(str, str2);
        if (attribute != null) {
            remove(attribute);
        }
    }

    @Override
    public Attr removeAttributeNode(Attr attr) throws DOMException {
        Attribute attribute = attribute(attr);
        if (attribute == null) {
            throw new DOMException((short) 8, "No such attribute");
        }
        attribute.detach();
        return DOMNodeHelper.asDOMAttr(attribute);
    }

    @Override
    public Node removeChild(Node node) throws DOMException {
        return DOMNodeHelper.removeChild(this, node);
    }

    @Override
    public Node replaceChild(Node node, Node node2) throws DOMException {
        checkNewChildNode(node);
        return DOMNodeHelper.replaceChild(this, node, node2);
    }

    @Override
    public void setAttribute(String str, String str2) throws DOMException {
        addAttribute(str, str2);
    }

    @Override
    public void setAttributeNS(String str, String str2, String str3) throws DOMException {
        Attribute attribute = attribute(str, str2);
        if (attribute != null) {
            attribute.setValue(str3);
        } else {
            addAttribute(getQName(str, str2), str3);
        }
    }

    @Override
    public Attr setAttributeNode(Attr attr) throws DOMException {
        if (isReadOnly()) {
            throw new DOMException((short) 7, "No modification allowed");
        }
        Attribute attribute = attribute(attr);
        if (attribute != attr) {
            if (attr.getOwnerElement() != null) {
                throw new DOMException((short) 10, "Attribute is already in use");
            }
            Attribute attributeCreateAttribute = createAttribute(attr);
            if (attribute != null) {
                attribute.detach();
            }
            mo8859add(attributeCreateAttribute);
        }
        return DOMNodeHelper.asDOMAttr(attribute);
    }

    @Override
    public Attr setAttributeNodeNS(Attr attr) throws DOMException {
        Attribute attribute = attribute(attr.getNamespaceURI(), attr.getLocalName());
        if (attribute != null) {
            attribute.setValue(attr.getValue());
        } else {
            attribute = createAttribute(attr);
            mo8859add(attribute);
        }
        return DOMNodeHelper.asDOMAttr(attribute);
    }

    @Override
    public void setNodeValue(String str) throws DOMException {
    }

    @Override
    public void setPrefix(String str) throws DOMException {
        DOMNodeHelper.setPrefix(this, str);
    }

    public boolean supports(String str, String str2) {
        return DOMNodeHelper.supports(this, str, str2);
    }
}
