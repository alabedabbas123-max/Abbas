package org.dom4j.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.Comment;
import javax.xml.stream.events.DTD;
import javax.xml.stream.events.EndDocument;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.EntityDeclaration;
import javax.xml.stream.events.EntityReference;
import javax.xml.stream.events.ProcessingInstruction;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.util.XMLEventConsumer;
import org.dom4j.Attribute;
import org.dom4j.Branch;
import org.dom4j.CDATA;
import org.dom4j.Document;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.Text;

public class STAXEventWriter {
    private XMLEventConsumer consumer;
    private XMLEventFactory factory = XMLEventFactory.newInstance();
    private XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();

    private class AttributeIterator implements Iterator {
        private Iterator iter;
        private final STAXEventWriter this$0;

        public AttributeIterator(STAXEventWriter sTAXEventWriter, Iterator it) {
            this.this$0 = sTAXEventWriter;
            this.iter = it;
        }

        @Override
        public boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override
        public Object next() {
            Attribute attribute = (Attribute) this.iter.next();
            return this.this$0.factory.createAttribute(this.this$0.createQName(attribute.getQName()), attribute.getValue());
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class NamespaceIterator implements Iterator {
        private Iterator iter;
        private final STAXEventWriter this$0;

        public NamespaceIterator(STAXEventWriter sTAXEventWriter, Iterator it) {
            this.this$0 = sTAXEventWriter;
            this.iter = it;
        }

        @Override
        public boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override
        public Object next() {
            Namespace namespace = (Namespace) this.iter.next();
            return this.this$0.factory.createNamespace(namespace.getPrefix(), namespace.getURI());
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public STAXEventWriter() {
    }

    public STAXEventWriter(File file) throws XMLStreamException, IOException {
        this.consumer = this.outputFactory.createXMLEventWriter(new FileWriter(file));
    }

    public STAXEventWriter(OutputStream outputStream) throws XMLStreamException {
        this.consumer = this.outputFactory.createXMLEventWriter(outputStream);
    }

    public STAXEventWriter(Writer writer) throws XMLStreamException {
        this.consumer = this.outputFactory.createXMLEventWriter(writer);
    }

    public STAXEventWriter(XMLEventConsumer xMLEventConsumer) {
        this.consumer = xMLEventConsumer;
    }

    private EntityReference createEntityReference(Entity entity) {
        return this.factory.createEntityReference(entity.getName(), (EntityDeclaration) null);
    }

    public javax.xml.stream.events.Attribute createAttribute(Attribute attribute) {
        return this.factory.createAttribute(createQName(attribute.getQName()), attribute.getValue());
    }

    public Characters createCharacters(CDATA cdata) {
        return this.factory.createCData(cdata.getText());
    }

    public Characters createCharacters(Text text) {
        return this.factory.createCharacters(text.getText());
    }

    public Comment createComment(org.dom4j.Comment comment) {
        return this.factory.createComment(comment.getText());
    }

    public DTD createDTD(DocumentType documentType) {
        StringWriter stringWriter = new StringWriter();
        try {
            documentType.write(stringWriter);
            return this.factory.createDTD(stringWriter.toString());
        } catch (IOException e) {
            throw new RuntimeException("Error writing DTD", e);
        }
    }

    public EndDocument createEndDocument(Document document) {
        return this.factory.createEndDocument();
    }

    public EndElement createEndElement(Element element) {
        return this.factory.createEndElement(createQName(element.getQName()), new NamespaceIterator(this, element.declaredNamespaces().iterator()));
    }

    public javax.xml.stream.events.Namespace createNamespace(Namespace namespace) {
        return this.factory.createNamespace(namespace.getPrefix(), namespace.getURI());
    }

    public ProcessingInstruction createProcessingInstruction(org.dom4j.ProcessingInstruction processingInstruction) {
        return this.factory.createProcessingInstruction(processingInstruction.getTarget(), processingInstruction.getText());
    }

    public QName createQName(org.dom4j.QName qName) {
        return new QName(qName.getNamespaceURI(), qName.getName(), qName.getNamespacePrefix());
    }

    public StartDocument createStartDocument(Document document) {
        String xMLEncoding = document.getXMLEncoding();
        return xMLEncoding != null ? this.factory.createStartDocument(xMLEncoding) : this.factory.createStartDocument();
    }

    public StartElement createStartElement(Element element) {
        return this.factory.createStartElement(createQName(element.getQName()), new AttributeIterator(this, element.attributeIterator()), new NamespaceIterator(this, element.declaredNamespaces().iterator()));
    }

    public XMLEventConsumer getConsumer() {
        return this.consumer;
    }

    public XMLEventFactory getEventFactory() {
        return this.factory;
    }

    public void setConsumer(XMLEventConsumer xMLEventConsumer) {
        this.consumer = xMLEventConsumer;
    }

    public void setEventFactory(XMLEventFactory xMLEventFactory) {
        this.factory = xMLEventFactory;
    }

    public void writeAttribute(Attribute attribute) throws XMLStreamException {
        this.consumer.add(createAttribute(attribute));
    }

    public void writeCDATA(CDATA cdata) throws XMLStreamException {
        this.consumer.add(createCharacters(cdata));
    }

    public void writeChildNodes(Branch branch) throws XMLStreamException {
        int iNodeCount = branch.nodeCount();
        for (int i = 0; i < iNodeCount; i++) {
            writeNode(branch.node(i));
        }
    }

    public void writeComment(org.dom4j.Comment comment) throws XMLStreamException {
        this.consumer.add(createComment(comment));
    }

    public void writeDocument(Document document) throws XMLStreamException {
        this.consumer.add(createStartDocument(document));
        writeChildNodes(document);
        this.consumer.add(createEndDocument(document));
    }

    public void writeDocumentType(DocumentType documentType) throws XMLStreamException {
        this.consumer.add(createDTD(documentType));
    }

    public void writeElement(Element element) throws XMLStreamException {
        this.consumer.add(createStartElement(element));
        writeChildNodes(element);
        this.consumer.add(createEndElement(element));
    }

    public void writeEntity(Entity entity) throws XMLStreamException {
        this.consumer.add(createEntityReference(entity));
    }

    public void writeNamespace(Namespace namespace) throws XMLStreamException {
        this.consumer.add(createNamespace(namespace));
    }

    public void writeNode(Node node) throws XMLStreamException {
        switch (node.getNodeType()) {
            case 1:
                writeElement((Element) node);
                return;
            case 2:
                writeAttribute((Attribute) node);
                return;
            case 3:
                writeText((Text) node);
                return;
            case 4:
                writeCDATA((CDATA) node);
                return;
            case 5:
                writeEntity((Entity) node);
                return;
            case 6:
            case 11:
            case 12:
            default:
                throw new XMLStreamException(new StringBuffer().append("Unsupported DOM4J Node: ").append(node).toString());
            case 7:
                writeProcessingInstruction((org.dom4j.ProcessingInstruction) node);
                return;
            case 8:
                writeComment((org.dom4j.Comment) node);
                return;
            case 9:
                writeDocument((Document) node);
                return;
            case 10:
                writeDocumentType((DocumentType) node);
                return;
            case 13:
                writeNamespace((Namespace) node);
                return;
        }
    }

    public void writeProcessingInstruction(org.dom4j.ProcessingInstruction processingInstruction) throws XMLStreamException {
        this.consumer.add(createProcessingInstruction(processingInstruction));
    }

    public void writeText(Text text) throws XMLStreamException {
        this.consumer.add(createCharacters(text));
    }
}
