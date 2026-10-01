package org.dom4j.dom;

import org.dom4j.tree.DefaultDocumentType;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMDocumentType extends DefaultDocumentType implements DocumentType {
    public DOMDocumentType() {
    }

    public DOMDocumentType(String str, String str2) {
        super(str, str2);
    }

    public DOMDocumentType(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    private void checkNewChildNode(Node node) throws DOMException {
        throw new DOMException((short) 3, "DocumentType nodes cannot have children");
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
    public NamedNodeMap getEntities() {
        return null;
    }

    @Override
    public Node getFirstChild() {
        return DOMNodeHelper.getFirstChild(this);
    }

    @Override
    public String getInternalSubset() {
        return getElementName();
    }

    @Override
    public Node getLastChild() {
        return DOMNodeHelper.getLastChild(this);
    }

    @Override
    public String getLocalName() {
        return DOMNodeHelper.getLocalName(this);
    }

    @Override
    public String getNamespaceURI() {
        return DOMNodeHelper.getNamespaceURI(this);
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
    public NamedNodeMap getNotations() {
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
        return DOMNodeHelper.getPrefix(this);
    }

    @Override
    public Node getPreviousSibling() {
        return DOMNodeHelper.getPreviousSibling(this);
    }

    @Override
    public String getPublicId() {
        return getPublicID();
    }

    @Override
    public String getSystemId() {
        return getSystemID();
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
    }

    @Override
    public void setPrefix(String str) throws DOMException {
        DOMNodeHelper.setPrefix(this, str);
    }

    public boolean supports(String str, String str2) {
        return DOMNodeHelper.supports(this, str, str2);
    }
}
