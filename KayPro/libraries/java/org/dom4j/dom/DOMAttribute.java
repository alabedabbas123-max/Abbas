package org.dom4j.dom;

import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.tree.DefaultAttribute;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMAttribute extends DefaultAttribute implements Attr {
    public DOMAttribute(Element element, QName qName, String str) {
        super(element, qName, str);
    }

    public DOMAttribute(QName qName) {
        super(qName);
    }

    public DOMAttribute(QName qName, String str) {
        super(qName, str);
    }

    private void checkNewChildNode(Node node) throws DOMException {
        short nodeType = node.getNodeType();
        if (nodeType != 3 && nodeType != 5) {
            throw new DOMException((short) 3, "The node cannot be a child of attribute");
        }
    }

    @Override
    public Node appendChild(Node node) throws DOMException {
        checkNewChildNode(node);
        return DOMNodeHelper.appendChild(this, node);
    }

    @Override
    public Node cloneNode(boolean z) {
        return DOMNodeHelper.cloneNode(this, z);
    }

    @Override
    public NamedNodeMap getAttributes() {
        return null;
    }

    @Override
    public NodeList getChildNodes() {
        return DOMNodeHelper.getChildNodes(this);
    }

    @Override
    public Node getFirstChild() {
        return DOMNodeHelper.getFirstChild(this);
    }

    @Override
    public Node getLastChild() {
        return DOMNodeHelper.getLastChild(this);
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
        return DOMNodeHelper.getNodeValue(this);
    }

    @Override
    public Document getOwnerDocument() {
        return DOMNodeHelper.getOwnerDocument(this);
    }

    @Override
    public org.w3c.dom.Element getOwnerElement() {
        return DOMNodeHelper.asDOMElement(getParent());
    }

    @Override
    public Node getParentNode() {
        return null;
    }

    @Override
    public String getPrefix() {
        return getQName().getNamespacePrefix();
    }

    @Override
    public Node getPreviousSibling() {
        return DOMNodeHelper.getPreviousSibling(this);
    }

    @Override
    public boolean getSpecified() {
        return true;
    }

    @Override
    public boolean hasAttributes() {
        return DOMNodeHelper.hasAttributes(this);
    }

    @Override
    public boolean hasChildNodes() {
        return DOMNodeHelper.hasChildNodes(this);
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
    public void normalize() {
        DOMNodeHelper.normalize(this);
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
    public void setNodeValue(String str) throws DOMException {
        DOMNodeHelper.setNodeValue(this, str);
    }

    @Override
    public void setPrefix(String str) throws DOMException {
        DOMNodeHelper.setPrefix(this, str);
    }

    public boolean supports(String str, String str2) {
        return DOMNodeHelper.supports(this, str, str2);
    }
}
