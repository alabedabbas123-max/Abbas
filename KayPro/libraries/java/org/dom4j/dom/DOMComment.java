package org.dom4j.dom;

import org.dom4j.Element;
import org.dom4j.tree.DefaultComment;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMComment extends DefaultComment implements Comment {
    public DOMComment(String str) {
        super(str);
    }

    public DOMComment(Element element, String str) {
        super(element, str);
    }

    private void checkNewChildNode(Node node) throws DOMException {
        throw new DOMException((short) 3, "Comment nodes cannot have children");
    }

    @Override
    public Node appendChild(Node node) throws DOMException {
        checkNewChildNode(node);
        return DOMNodeHelper.appendChild(this, node);
    }

    @Override
    public void appendData(String str) throws DOMException {
        DOMNodeHelper.appendData(this, str);
    }

    @Override
    public Node cloneNode(boolean z) {
        return DOMNodeHelper.cloneNode(this, z);
    }

    @Override
    public void deleteData(int i, int i2) throws DOMException {
        DOMNodeHelper.deleteData(this, i, i2);
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
    public String getData() throws DOMException {
        return DOMNodeHelper.getData(this);
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
    public int getLength() {
        return DOMNodeHelper.getLength(this);
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
        return "#comment";
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
    public void insertData(int i, String str) throws DOMException {
        DOMNodeHelper.insertData(this, i, str);
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
    public void replaceData(int i, int i2, String str) throws DOMException {
        DOMNodeHelper.replaceData(this, i, i2, str);
    }

    @Override
    public void setData(String str) throws DOMException {
        DOMNodeHelper.setData(this, str);
    }

    @Override
    public void setNodeValue(String str) throws DOMException {
        DOMNodeHelper.setNodeValue(this, str);
    }

    @Override
    public void setPrefix(String str) throws DOMException {
        DOMNodeHelper.setPrefix(this, str);
    }

    @Override
    public String substringData(int i, int i2) throws DOMException {
        return DOMNodeHelper.substringData(this, i, i2);
    }

    public boolean supports(String str, String str2) {
        return DOMNodeHelper.supports(this, str, str2);
    }
}
