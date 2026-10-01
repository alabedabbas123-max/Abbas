package org.dom4j.io;

import java.io.InputStream;
import java.io.Reader;
import java.util.Iterator;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.EntityReference;
import javax.xml.stream.events.Namespace;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import org.dom4j.Attribute;
import org.dom4j.CharacterData;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;

public class STAXEventReader {
    private DocumentFactory factory;
    private XMLInputFactory inputFactory;

    public STAXEventReader() {
        this.inputFactory = XMLInputFactory.newInstance();
        this.factory = DocumentFactory.getInstance();
    }

    public STAXEventReader(DocumentFactory documentFactory) {
        this.inputFactory = XMLInputFactory.newInstance();
        if (documentFactory != null) {
            this.factory = documentFactory;
        } else {
            this.factory = DocumentFactory.getInstance();
        }
    }

    public Attribute createAttribute(Element element, javax.xml.stream.events.Attribute attribute) {
        return this.factory.createAttribute(element, createQName(attribute.getName()), attribute.getValue());
    }

    public CharacterData createCharacterData(Characters characters) {
        String data = characters.getData();
        return characters.isCData() ? this.factory.createCDATA(data) : this.factory.createText(data);
    }

    public Comment createComment(javax.xml.stream.events.Comment comment) {
        return this.factory.createComment(comment.getText());
    }

    public Element createElement(StartElement startElement) {
        Element elementCreateElement = this.factory.createElement(createQName(startElement.getName()));
        Iterator attributes = startElement.getAttributes();
        while (attributes.hasNext()) {
            javax.xml.stream.events.Attribute attribute = (javax.xml.stream.events.Attribute) attributes.next();
            elementCreateElement.addAttribute(createQName(attribute.getName()), attribute.getValue());
        }
        Iterator namespaces = startElement.getNamespaces();
        while (namespaces.hasNext()) {
            Namespace namespace = (Namespace) namespaces.next();
            elementCreateElement.addNamespace(namespace.getPrefix(), namespace.getNamespaceURI());
        }
        return elementCreateElement;
    }

    public Entity createEntity(EntityReference entityReference) {
        return this.factory.createEntity(entityReference.getName(), entityReference.getDeclaration().getReplacementText());
    }

    public org.dom4j.Namespace createNamespace(Namespace namespace) {
        return this.factory.createNamespace(namespace.getPrefix(), namespace.getNamespaceURI());
    }

    public ProcessingInstruction createProcessingInstruction(javax.xml.stream.events.ProcessingInstruction processingInstruction) {
        return this.factory.createProcessingInstruction(processingInstruction.getTarget(), processingInstruction.getData());
    }

    public QName createQName(javax.xml.namespace.QName qName) {
        return this.factory.createQName(qName.getLocalPart(), qName.getPrefix(), qName.getNamespaceURI());
    }

    public Attribute readAttribute(XMLEventReader xMLEventReader) throws XMLStreamException {
        XMLEvent xMLEventPeek = xMLEventReader.peek();
        if (xMLEventPeek.isAttribute()) {
            return createAttribute(null, (javax.xml.stream.events.Attribute) xMLEventReader.nextEvent());
        }
        throw new XMLStreamException(new StringBuffer().append("Expected Attribute event, found: ").append(xMLEventPeek).toString());
    }

    public CharacterData readCharacters(XMLEventReader xMLEventReader) throws XMLStreamException {
        XMLEvent xMLEventPeek = xMLEventReader.peek();
        if (xMLEventPeek.isCharacters()) {
            return createCharacterData(xMLEventReader.nextEvent().asCharacters());
        }
        throw new XMLStreamException(new StringBuffer().append("Expected Characters event, found: ").append(xMLEventPeek).toString());
    }

    public Comment readComment(XMLEventReader xMLEventReader) throws XMLStreamException {
        XMLEvent xMLEventPeek = xMLEventReader.peek();
        if (xMLEventPeek instanceof javax.xml.stream.events.Comment) {
            return createComment((javax.xml.stream.events.Comment) xMLEventReader.nextEvent());
        }
        throw new XMLStreamException(new StringBuffer().append("Expected Comment event, found: ").append(xMLEventPeek).toString());
    }

    public Document readDocument(InputStream inputStream) throws XMLStreamException {
        return readDocument(inputStream, (String) null);
    }

    public Document readDocument(InputStream inputStream, String str) throws XMLStreamException {
        XMLEventReader xMLEventReaderCreateXMLEventReader = this.inputFactory.createXMLEventReader(str, inputStream);
        try {
            return readDocument(xMLEventReaderCreateXMLEventReader);
        } finally {
            xMLEventReaderCreateXMLEventReader.close();
        }
    }

    public Document readDocument(Reader reader) throws XMLStreamException {
        return readDocument(reader, (String) null);
    }

    public Document readDocument(Reader reader, String str) throws XMLStreamException {
        XMLEventReader xMLEventReaderCreateXMLEventReader = this.inputFactory.createXMLEventReader(str, reader);
        try {
            return readDocument(xMLEventReaderCreateXMLEventReader);
        } finally {
            xMLEventReaderCreateXMLEventReader.close();
        }
    }

    public Document readDocument(XMLEventReader xMLEventReader) throws XMLStreamException {
        Document documentCreateDocument = null;
        while (xMLEventReader.hasNext()) {
            switch (xMLEventReader.peek().getEventType()) {
                case 4:
                case 6:
                case 8:
                    xMLEventReader.nextEvent();
                    break;
                case 5:
                default:
                    Document documentCreateDocument2 = documentCreateDocument == null ? this.factory.createDocument() : documentCreateDocument;
                    documentCreateDocument2.mo8857add(readNode(xMLEventReader));
                    documentCreateDocument = documentCreateDocument2;
                    break;
                case 7:
                    StartDocument startDocumentNextEvent = xMLEventReader.nextEvent();
                    if (documentCreateDocument != null) {
                        throw new XMLStreamException("Unexpected StartDocument event", startDocumentNextEvent.getLocation());
                    }
                    documentCreateDocument = !startDocumentNextEvent.encodingSet() ? this.factory.createDocument() : this.factory.createDocument(startDocumentNextEvent.getCharacterEncodingScheme());
                    break;
                    break;
            }
        }
        return documentCreateDocument;
    }

    public Element readElement(XMLEventReader xMLEventReader) throws XMLStreamException {
        XMLEvent xMLEventPeek = xMLEventReader.peek();
        if (!xMLEventPeek.isStartElement()) {
            throw new XMLStreamException(new StringBuffer().append("Expected Element event, found: ").append(xMLEventPeek).toString());
        }
        StartElement startElementAsStartElement = xMLEventReader.nextEvent().asStartElement();
        Element elementCreateElement = createElement(startElementAsStartElement);
        while (xMLEventReader.hasNext()) {
            if (xMLEventReader.peek().isEndElement()) {
                EndElement endElementAsEndElement = xMLEventReader.nextEvent().asEndElement();
                if (endElementAsEndElement.getName().equals(startElementAsStartElement.getName())) {
                    return elementCreateElement;
                }
                throw new XMLStreamException(new StringBuffer().append("Expected ").append(startElementAsStartElement.getName()).append(" end-tag, but found").append(endElementAsEndElement.getName()).toString());
            }
            elementCreateElement.mo8857add(readNode(xMLEventReader));
        }
        throw new XMLStreamException("Unexpected end of stream while reading element content");
    }

    public Entity readEntityReference(XMLEventReader xMLEventReader) throws XMLStreamException {
        XMLEvent xMLEventPeek = xMLEventReader.peek();
        if (xMLEventPeek.isEntityReference()) {
            return createEntity((EntityReference) xMLEventReader.nextEvent());
        }
        throw new XMLStreamException(new StringBuffer().append("Expected EntityRef event, found: ").append(xMLEventPeek).toString());
    }

    public org.dom4j.Namespace readNamespace(XMLEventReader xMLEventReader) throws XMLStreamException {
        XMLEvent xMLEventPeek = xMLEventReader.peek();
        if (xMLEventPeek.isNamespace()) {
            return createNamespace((Namespace) xMLEventReader.nextEvent());
        }
        throw new XMLStreamException(new StringBuffer().append("Expected Namespace event, found: ").append(xMLEventPeek).toString());
    }

    public Node readNode(XMLEventReader xMLEventReader) throws XMLStreamException {
        XMLEvent xMLEventPeek = xMLEventReader.peek();
        if (xMLEventPeek.isStartElement()) {
            return readElement(xMLEventReader);
        }
        if (xMLEventPeek.isCharacters()) {
            return readCharacters(xMLEventReader);
        }
        if (xMLEventPeek.isStartDocument()) {
            return readDocument(xMLEventReader);
        }
        if (xMLEventPeek.isProcessingInstruction()) {
            return readProcessingInstruction(xMLEventReader);
        }
        if (xMLEventPeek.isEntityReference()) {
            return readEntityReference(xMLEventReader);
        }
        if (xMLEventPeek.isAttribute()) {
            return readAttribute(xMLEventReader);
        }
        if (xMLEventPeek.isNamespace()) {
            return readNamespace(xMLEventReader);
        }
        throw new XMLStreamException(new StringBuffer().append("Unsupported event: ").append(xMLEventPeek).toString());
    }

    public ProcessingInstruction readProcessingInstruction(XMLEventReader xMLEventReader) throws XMLStreamException {
        XMLEvent xMLEventPeek = xMLEventReader.peek();
        if (xMLEventPeek.isProcessingInstruction()) {
            return createProcessingInstruction((javax.xml.stream.events.ProcessingInstruction) xMLEventReader.nextEvent());
        }
        throw new XMLStreamException(new StringBuffer().append("Expected PI event, found: ").append(xMLEventPeek).toString());
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        if (documentFactory != null) {
            this.factory = documentFactory;
        } else {
            this.factory = DocumentFactory.getInstance();
        }
    }
}
