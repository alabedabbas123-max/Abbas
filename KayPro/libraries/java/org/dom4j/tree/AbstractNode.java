package org.dom4j.tree;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.NodeFilter;
import org.dom4j.XPath;
import org.dom4j.rule.Pattern;

public abstract class AbstractNode implements Node, Cloneable, Serializable {
    protected static final String[] NODE_TYPE_NAMES = {"Node", "Element", "Attribute", "Text", "CDATA", "Entity", "Entity", "ProcessingInstruction", "Comment", "Document", "DocumentType", "DocumentFragment", "Notation", "Namespace", "Unknown"};
    private static final DocumentFactory DOCUMENT_FACTORY = DocumentFactory.getInstance();

    @Override
    public Node asXPathResult(Element element) {
        return supportsParent() ? this : createXPathResult(element);
    }

    @Override
    public Object clone() {
        if (isReadOnly()) {
            return this;
        }
        try {
            Node node = (Node) super.clone();
            node.setParent(null);
            node.setDocument(null);
            return node;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(new StringBuffer().append("This should never happen. Caught: ").append(e).toString());
        }
    }

    public Pattern createPattern(String str) {
        return getDocumentFactory().createPattern(str);
    }

    @Override
    public XPath createXPath(String str) {
        return getDocumentFactory().createXPath(str);
    }

    public NodeFilter createXPathFilter(String str) {
        return getDocumentFactory().createXPathFilter(str);
    }

    protected Node createXPathResult(Element element) {
        throw new RuntimeException(new StringBuffer().append("asXPathResult() not yet implemented fully for: ").append(this).toString());
    }

    @Override
    public Node detach() {
        Element parent = getParent();
        if (parent != null) {
            parent.remove(this);
        } else {
            Document document = getDocument();
            if (document != null) {
                document.remove(this);
            }
        }
        setParent(null);
        setDocument(null);
        return this;
    }

    @Override
    public Document getDocument() {
        Element parent = getParent();
        if (parent != null) {
            return parent.getDocument();
        }
        return null;
    }

    protected DocumentFactory getDocumentFactory() {
        return DOCUMENT_FACTORY;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public short getNodeType() {
        return (short) 14;
    }

    @Override
    public String getNodeTypeName() {
        short nodeType = getNodeType();
        return (nodeType < 0 || nodeType >= NODE_TYPE_NAMES.length) ? "Unknown" : NODE_TYPE_NAMES[nodeType];
    }

    @Override
    public Element getParent() {
        return null;
    }

    @Override
    public String getPath() {
        return getPath(null);
    }

    @Override
    public String getStringValue() {
        return getText();
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public String getUniquePath() {
        return getUniquePath(null);
    }

    @Override
    public boolean hasContent() {
        return false;
    }

    @Override
    public boolean isReadOnly() {
        return true;
    }

    @Override
    public boolean matches(String str) {
        return createXPathFilter(str).matches(this);
    }

    @Override
    public Number numberValueOf(String str) {
        return createXPath(str).numberValueOf(this);
    }

    @Override
    public List selectNodes(String str) {
        return createXPath(str).selectNodes(this);
    }

    @Override
    public List selectNodes(String str, String str2) {
        return selectNodes(str, str2, false);
    }

    @Override
    public List selectNodes(String str, String str2, boolean z) {
        return createXPath(str).selectNodes(this, createXPath(str2), z);
    }

    @Override
    public Object selectObject(String str) {
        return createXPath(str).evaluate(this);
    }

    @Override
    public Node selectSingleNode(String str) {
        return createXPath(str).selectSingleNode(this);
    }

    @Override
    public void setDocument(Document document) {
    }

    @Override
    public void setName(String str) {
        throw new UnsupportedOperationException("This node cannot be modified");
    }

    @Override
    public void setParent(Element element) {
    }

    @Override
    public void setText(String str) {
        throw new UnsupportedOperationException("This node cannot be modified");
    }

    @Override
    public boolean supportsParent() {
        return false;
    }

    @Override
    public String valueOf(String str) {
        return createXPath(str).valueOf(this);
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write(asXML());
    }
}
