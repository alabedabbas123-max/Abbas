package org.dom4j.io;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.Branch;
import org.dom4j.CDATA;
import org.dom4j.CharacterData;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.Text;
import org.dom4j.tree.NamespaceStack;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;

public class SAXWriter implements XMLReader {
    protected static final String FEATURE_NAMESPACES = "http://xml.org/sax/features/namespaces";
    protected static final String FEATURE_NAMESPACE_PREFIXES = "http://xml.org/sax/features/namespace-prefixes";
    protected static final String[] LEXICAL_HANDLER_NAMES = {"http://xml.org/sax/properties/lexical-handler", "http://xml.org/sax/handlers/LexicalHandler"};
    private AttributesImpl attributes;
    private ContentHandler contentHandler;
    private boolean declareNamespaceAttributes;
    private DTDHandler dtdHandler;
    private EntityResolver entityResolver;
    private ErrorHandler errorHandler;
    private Map features;
    private LexicalHandler lexicalHandler;
    private Map properties;

    public SAXWriter() {
        this.attributes = new AttributesImpl();
        this.features = new HashMap();
        this.properties = new HashMap();
        this.properties.put(FEATURE_NAMESPACE_PREFIXES, Boolean.FALSE);
        this.properties.put(FEATURE_NAMESPACE_PREFIXES, Boolean.TRUE);
    }

    public SAXWriter(ContentHandler contentHandler) {
        this();
        this.contentHandler = contentHandler;
    }

    public SAXWriter(ContentHandler contentHandler, LexicalHandler lexicalHandler) {
        this();
        this.contentHandler = contentHandler;
        this.lexicalHandler = lexicalHandler;
    }

    public SAXWriter(ContentHandler contentHandler, LexicalHandler lexicalHandler, EntityResolver entityResolver) {
        this();
        this.contentHandler = contentHandler;
        this.lexicalHandler = lexicalHandler;
        this.entityResolver = entityResolver;
    }

    protected AttributesImpl addNamespaceAttribute(AttributesImpl attributesImpl, Namespace namespace) {
        if (!this.declareNamespaceAttributes) {
            return attributesImpl;
        }
        AttributesImpl attributesImpl2 = attributesImpl == null ? new AttributesImpl() : attributesImpl;
        String prefix = namespace.getPrefix();
        String string = "xmlns";
        if (prefix != null && prefix.length() > 0) {
            string = new StringBuffer().append("xmlns:").append(prefix).toString();
        }
        attributesImpl2.addAttribute("", prefix, string, "CDATA", namespace.getURI());
        return attributesImpl2;
    }

    protected void checkForNullHandlers() {
    }

    protected Attributes createAttributes(Element element, Attributes attributes) throws SAXException {
        this.attributes.clear();
        if (attributes != null) {
            this.attributes.setAttributes(attributes);
        }
        Iterator itAttributeIterator = element.attributeIterator();
        while (itAttributeIterator.hasNext()) {
            Attribute attribute = (Attribute) itAttributeIterator.next();
            this.attributes.addAttribute(attribute.getNamespaceURI(), attribute.getName(), attribute.getQualifiedName(), "CDATA", attribute.getValue());
        }
        return this.attributes;
    }

    protected void documentLocator(Document document) throws SAXException {
        String systemID;
        String str;
        LocatorImpl locatorImpl = new LocatorImpl();
        DocumentType docType = document.getDocType();
        if (docType != null) {
            String publicID = docType.getPublicID();
            systemID = docType.getSystemID();
            str = publicID;
        } else {
            systemID = null;
            str = null;
        }
        if (str != null) {
            locatorImpl.setPublicId(str);
        }
        if (systemID != null) {
            locatorImpl.setSystemId(systemID);
        }
        locatorImpl.setLineNumber(-1);
        locatorImpl.setColumnNumber(-1);
        this.contentHandler.setDocumentLocator(locatorImpl);
    }

    protected void dtdHandler(Document document) throws SAXException {
    }

    protected void endDocument() throws SAXException {
        this.contentHandler.endDocument();
    }

    protected void endElement(Element element) throws SAXException {
        this.contentHandler.endElement(element.getNamespaceURI(), element.getName(), element.getQualifiedName());
    }

    protected void endPrefixMapping(NamespaceStack namespaceStack, int i) throws SAXException {
        while (namespaceStack.size() > i) {
            Namespace namespaceM8883pop = namespaceStack.m8883pop();
            if (namespaceM8883pop != null) {
                this.contentHandler.endPrefixMapping(namespaceM8883pop.getPrefix());
            }
        }
    }

    protected void entityResolver(Document document) throws SAXException {
        DocumentType docType;
        if (this.entityResolver == null || (docType = document.getDocType()) == null) {
            return;
        }
        String publicID = docType.getPublicID();
        String systemID = docType.getSystemID();
        if (publicID == null && systemID == null) {
            return;
        }
        try {
            this.entityResolver.resolveEntity(publicID, systemID);
        } catch (IOException e) {
            throw new SAXException(new StringBuffer().append("Could not resolve publicID: ").append(publicID).append(" systemID: ").append(systemID).toString(), e);
        }
    }

    @Override
    public ContentHandler getContentHandler() {
        return this.contentHandler;
    }

    @Override
    public DTDHandler getDTDHandler() {
        return this.dtdHandler;
    }

    @Override
    public EntityResolver getEntityResolver() {
        return this.entityResolver;
    }

    @Override
    public ErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    @Override
    public boolean getFeature(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        Boolean bool = (Boolean) this.features.get(str);
        return bool != null && bool.booleanValue();
    }

    public LexicalHandler getLexicalHandler() {
        return this.lexicalHandler;
    }

    @Override
    public Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        for (int i = 0; i < LEXICAL_HANDLER_NAMES.length; i++) {
            if (LEXICAL_HANDLER_NAMES[i].equals(str)) {
                return getLexicalHandler();
            }
        }
        return this.properties.get(str);
    }

    public boolean isDeclareNamespaceAttributes() {
        return this.declareNamespaceAttributes;
    }

    protected boolean isIgnoreableNamespace(Namespace namespace, NamespaceStack namespaceStack) {
        String uri;
        if (namespace.equals(Namespace.NO_NAMESPACE) || namespace.equals(Namespace.XML_NAMESPACE) || (uri = namespace.getURI()) == null || uri.length() <= 0) {
            return true;
        }
        return namespaceStack.contains(namespace);
    }

    @Override
    public void parse(String str) throws SAXNotSupportedException {
        throw new SAXNotSupportedException("This XMLReader can only accept <dom4j> InputSource objects");
    }

    @Override
    public void parse(InputSource inputSource) throws SAXException {
        if (!(inputSource instanceof DocumentInputSource)) {
            throw new SAXNotSupportedException("This XMLReader can only accept <dom4j> InputSource objects");
        }
        write(((DocumentInputSource) inputSource).getDocument());
    }

    @Override
    public void setContentHandler(ContentHandler contentHandler) {
        this.contentHandler = contentHandler;
    }

    @Override
    public void setDTDHandler(DTDHandler dTDHandler) {
        this.dtdHandler = dTDHandler;
    }

    public void setDeclareNamespaceAttributes(boolean z) {
        this.declareNamespaceAttributes = z;
    }

    @Override
    public void setEntityResolver(EntityResolver entityResolver) {
        this.entityResolver = entityResolver;
    }

    @Override
    public void setErrorHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    @Override
    public void setFeature(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (FEATURE_NAMESPACE_PREFIXES.equals(str)) {
            setDeclareNamespaceAttributes(z);
        } else if (FEATURE_NAMESPACE_PREFIXES.equals(str) && !z) {
            throw new SAXNotSupportedException("Namespace feature is always supported in dom4j");
        }
        this.features.put(str, z ? Boolean.TRUE : Boolean.FALSE);
    }

    public void setLexicalHandler(LexicalHandler lexicalHandler) {
        this.lexicalHandler = lexicalHandler;
    }

    @Override
    public void setProperty(String str, Object obj) {
        for (int i = 0; i < LEXICAL_HANDLER_NAMES.length; i++) {
            if (LEXICAL_HANDLER_NAMES[i].equals(str)) {
                setLexicalHandler((LexicalHandler) obj);
                return;
            }
        }
        this.properties.put(str, obj);
    }

    public void setXMLReader(XMLReader xMLReader) {
        setContentHandler(xMLReader.getContentHandler());
        setDTDHandler(xMLReader.getDTDHandler());
        setEntityResolver(xMLReader.getEntityResolver());
        setErrorHandler(xMLReader.getErrorHandler());
    }

    protected void startDocument() throws SAXException {
        this.contentHandler.startDocument();
    }

    protected void startElement(Element element, AttributesImpl attributesImpl) throws SAXException {
        this.contentHandler.startElement(element.getNamespaceURI(), element.getName(), element.getQualifiedName(), createAttributes(element, attributesImpl));
    }

    protected AttributesImpl startPrefixMapping(Element element, NamespaceStack namespaceStack) throws SAXException {
        AttributesImpl attributesImplAddNamespaceAttribute;
        AttributesImpl attributesImplAddNamespaceAttribute2 = null;
        Namespace namespace = element.getNamespace();
        if (namespace != null && !isIgnoreableNamespace(namespace, namespaceStack)) {
            namespaceStack.push(namespace);
            this.contentHandler.startPrefixMapping(namespace.getPrefix(), namespace.getURI());
            attributesImplAddNamespaceAttribute2 = addNamespaceAttribute(null, namespace);
        }
        List listDeclaredNamespaces = element.declaredNamespaces();
        int i = 0;
        int size = listDeclaredNamespaces.size();
        AttributesImpl attributesImpl = attributesImplAddNamespaceAttribute2;
        while (i < size) {
            Namespace namespace2 = (Namespace) listDeclaredNamespaces.get(i);
            if (isIgnoreableNamespace(namespace2, namespaceStack)) {
                attributesImplAddNamespaceAttribute = attributesImpl;
            } else {
                namespaceStack.push(namespace2);
                this.contentHandler.startPrefixMapping(namespace2.getPrefix(), namespace2.getURI());
                attributesImplAddNamespaceAttribute = addNamespaceAttribute(attributesImpl, namespace2);
            }
            i++;
            attributesImpl = attributesImplAddNamespaceAttribute;
        }
        return attributesImpl;
    }

    public void write(String str) throws SAXException {
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.contentHandler.characters(charArray, 0, charArray.length);
        }
    }

    public void write(CDATA cdata) throws SAXException {
        String text = cdata.getText();
        if (this.lexicalHandler == null) {
            write(text);
            return;
        }
        this.lexicalHandler.startCDATA();
        write(text);
        this.lexicalHandler.endCDATA();
    }

    public void write(Comment comment) throws SAXException {
        if (this.lexicalHandler != null) {
            char[] charArray = comment.getText().toCharArray();
            this.lexicalHandler.comment(charArray, 0, charArray.length);
        }
    }

    public void write(Document document) throws SAXException {
        if (document != null) {
            checkForNullHandlers();
            documentLocator(document);
            startDocument();
            entityResolver(document);
            dtdHandler(document);
            writeContent(document, new NamespaceStack());
            endDocument();
        }
    }

    public void write(Element element) throws SAXException {
        write(element, new NamespaceStack());
    }

    protected void write(Element element, NamespaceStack namespaceStack) throws SAXException {
        int size = namespaceStack.size();
        startElement(element, startPrefixMapping(element, namespaceStack));
        writeContent(element, namespaceStack);
        endElement(element);
        endPrefixMapping(namespaceStack, size);
    }

    public void write(Entity entity) throws SAXException {
        String text = entity.getText();
        if (this.lexicalHandler == null) {
            write(text);
            return;
        }
        String name = entity.getName();
        this.lexicalHandler.startEntity(name);
        write(text);
        this.lexicalHandler.endEntity(name);
    }

    public void write(Node node) throws SAXException {
        switch (node.getNodeType()) {
            case 1:
                write((Element) node);
                return;
            case 2:
                write((Attribute) node);
                return;
            case 3:
                write(node.getText());
                return;
            case 4:
                write((CDATA) node);
                return;
            case 5:
                write((Entity) node);
                return;
            case 6:
            case 11:
            case 12:
            default:
                throw new SAXException(new StringBuffer().append("Invalid node type: ").append(node).toString());
            case 7:
                write((ProcessingInstruction) node);
                return;
            case 8:
                write((Comment) node);
                return;
            case 9:
                write((Document) node);
                return;
            case 10:
                write((DocumentType) node);
                return;
            case 13:
                return;
        }
    }

    public void write(ProcessingInstruction processingInstruction) throws SAXException {
        this.contentHandler.processingInstruction(processingInstruction.getTarget(), processingInstruction.getText());
    }

    public void writeClose(Element element) throws SAXException {
        endElement(element);
    }

    protected void writeContent(Branch branch, NamespaceStack namespaceStack) throws SAXException {
        Iterator itNodeIterator = branch.nodeIterator();
        while (itNodeIterator.hasNext()) {
            Object next = itNodeIterator.next();
            if (next instanceof Element) {
                write((Element) next, namespaceStack);
            } else if (next instanceof CharacterData) {
                if (next instanceof Text) {
                    write(((Text) next).getText());
                } else if (next instanceof CDATA) {
                    write((CDATA) next);
                } else {
                    if (!(next instanceof Comment)) {
                        throw new SAXException(new StringBuffer().append("Invalid Node in DOM4J content: ").append(next).append(" of type: ").append(next.getClass()).toString());
                    }
                    write((Comment) next);
                }
            } else if (next instanceof String) {
                write((String) next);
            } else if (next instanceof Entity) {
                write((Entity) next);
            } else if (next instanceof ProcessingInstruction) {
                write((ProcessingInstruction) next);
            } else {
                if (!(next instanceof Namespace)) {
                    throw new SAXException(new StringBuffer().append("Invalid Node in DOM4J content: ").append(next).toString());
                }
                write((Namespace) next);
            }
        }
    }

    public void writeOpen(Element element) throws SAXException {
        startElement(element, null);
    }
}
