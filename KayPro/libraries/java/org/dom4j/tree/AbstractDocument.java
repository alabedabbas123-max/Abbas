package org.dom4j.tree;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.IllegalAddException;
import org.dom4j.Node;
import org.dom4j.QName;
import org.dom4j.Visitor;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public abstract class AbstractDocument extends AbstractBranch implements Document {
    protected String encoding;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        DocumentType docType = getDocType();
        if (docType != null) {
            visitor.visit(docType);
        }
        List listContent = content();
        if (listContent != null) {
            for (Object obj : listContent) {
                if (obj instanceof String) {
                    visitor.visit(getDocumentFactory().createText((String) obj));
                } else {
                    ((Node) obj).accept(visitor);
                }
            }
        }
    }

    @Override
    public void mo8856add(Element element) {
        checkAddElementAllowed(element);
        super.mo8856add(element);
        rootElementAdded(element);
    }

    @Override
    public Document addComment(String str) {
        mo8855add(getDocumentFactory().createComment(str));
        return this;
    }

    @Override
    public Element addElement(String str) {
        Element elementCreateElement = getDocumentFactory().createElement(str);
        mo8856add(elementCreateElement);
        return elementCreateElement;
    }

    @Override
    public Element addElement(String str, String str2) {
        Element elementCreateElement = getDocumentFactory().createElement(str, str2);
        mo8856add(elementCreateElement);
        return elementCreateElement;
    }

    @Override
    public Element addElement(QName qName) {
        Element elementCreateElement = getDocumentFactory().createElement(qName);
        mo8856add(elementCreateElement);
        return elementCreateElement;
    }

    @Override
    public Document addProcessingInstruction(String str, String str2) {
        mo8858add(getDocumentFactory().createProcessingInstruction(str, str2));
        return this;
    }

    @Override
    public Document addProcessingInstruction(String str, Map map) {
        mo8858add(getDocumentFactory().createProcessingInstruction(str, map));
        return this;
    }

    @Override
    public String asXML() {
        OutputFormat outputFormat = new OutputFormat();
        outputFormat.setEncoding(this.encoding);
        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xMLWriter = new XMLWriter(stringWriter, outputFormat);
            xMLWriter.write((Document) this);
            xMLWriter.flush();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(new StringBuffer().append("IOException while generating textual representation: ").append(e.getMessage()).toString());
        }
    }

    @Override
    public Node asXPathResult(Element element) {
        return this;
    }

    protected void checkAddElementAllowed(Element element) {
        Element rootElement = getRootElement();
        if (rootElement != null) {
            throw new IllegalAddException(this, element, new StringBuffer().append("Cannot add another element to this Document as it already has a root element of: ").append(rootElement.getQualifiedName()).toString());
        }
    }

    @Override
    protected void childAdded(Node node) {
        if (node != null) {
            node.setDocument(this);
        }
    }

    @Override
    protected void childRemoved(Node node) {
        if (node != null) {
            node.setDocument(null);
        }
    }

    @Override
    public Document getDocument() {
        return this;
    }

    @Override
    public short getNodeType() {
        return (short) 9;
    }

    @Override
    public String getPath(Element element) {
        return "/";
    }

    @Override
    public String getStringValue() {
        Element rootElement = getRootElement();
        return rootElement != null ? rootElement.getStringValue() : "";
    }

    @Override
    public String getUniquePath(Element element) {
        return "/";
    }

    @Override
    public String getXMLEncoding() {
        return null;
    }

    @Override
    public void normalize() {
        Element rootElement = getRootElement();
        if (rootElement != null) {
            rootElement.normalize();
        }
    }

    @Override
    public boolean remove(Element element) {
        boolean zRemove = super.remove(element);
        if (getRootElement() != null && zRemove) {
            setRootElement(null);
        }
        element.setDocument(null);
        return zRemove;
    }

    protected abstract void rootElementAdded(Element element);

    @Override
    public void setRootElement(Element element) {
        clearContent();
        if (element != null) {
            super.mo8856add(element);
            rootElementAdded(element);
        }
    }

    @Override
    public void setXMLEncoding(String str) {
        this.encoding = str;
    }

    public String toString() {
        return new StringBuffer().append(super.toString()).append(" [Document: name ").append(getName()).append("]").toString();
    }

    @Override
    public void write(Writer writer) throws IOException {
        OutputFormat outputFormat = new OutputFormat();
        outputFormat.setEncoding(this.encoding);
        new XMLWriter(writer, outputFormat).write((Document) this);
    }
}
