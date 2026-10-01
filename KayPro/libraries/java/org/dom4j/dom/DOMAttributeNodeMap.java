package org.dom4j.dom;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class DOMAttributeNodeMap implements NamedNodeMap {
    private DOMElement element;

    public DOMAttributeNodeMap(DOMElement dOMElement) {
        this.element = dOMElement;
    }

    public void m8872foo() throws DOMException {
        DOMNodeHelper.notSupported();
    }

    @Override
    public int getLength() {
        return this.element.attributeCount();
    }

    @Override
    public Node getNamedItem(String str) {
        return this.element.getAttributeNode(str);
    }

    @Override
    public Node getNamedItemNS(String str, String str2) {
        return this.element.getAttributeNodeNS(str, str2);
    }

    @Override
    public Node item(int i) {
        return DOMNodeHelper.asDOMAttr(this.element.attribute(i));
    }

    @Override
    public Node removeNamedItem(String str) throws DOMException {
        Attr attributeNode = this.element.getAttributeNode(str);
        if (attributeNode == null) {
            throw new DOMException((short) 8, new StringBuffer().append("No attribute named ").append(str).toString());
        }
        return this.element.removeAttributeNode(attributeNode);
    }

    @Override
    public Node removeNamedItemNS(String str, String str2) throws DOMException {
        Attr attributeNodeNS = this.element.getAttributeNodeNS(str, str2);
        return attributeNodeNS != null ? this.element.removeAttributeNode(attributeNodeNS) : attributeNodeNS;
    }

    @Override
    public Node setNamedItem(Node node) throws DOMException {
        if (node instanceof Attr) {
            return this.element.setAttributeNode((Attr) node);
        }
        throw new DOMException((short) 9, new StringBuffer().append("Node is not an Attr: ").append(node).toString());
    }

    @Override
    public Node setNamedItemNS(Node node) throws DOMException {
        if (node instanceof Attr) {
            return this.element.setAttributeNodeNS((Attr) node);
        }
        throw new DOMException((short) 9, new StringBuffer().append("Node is not an Attr: ").append(node).toString());
    }
}
