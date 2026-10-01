package org.dom4j.io;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.dom4j.Branch;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.QName;
import org.dom4j.dtd.AttributeDecl;
import org.dom4j.dtd.ElementDecl;
import org.dom4j.dtd.ExternalEntityDecl;
import org.dom4j.dtd.InternalEntityDecl;
import org.dom4j.tree.AbstractElement;
import org.dom4j.tree.NamespaceStack;
import org.xml.sax.Attributes;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.DeclHandler;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

public class SAXContentHandler extends DefaultHandler implements LexicalHandler, DeclHandler, DTDHandler {
    private Map availableNamespaceMap;
    private StringBuffer cdataText;
    private Element currentElement;
    private int declaredNamespaceIndex;
    private List declaredNamespaceList;
    private Document document;
    private DocumentFactory documentFactory;
    private ElementHandler elementHandler;
    private ElementStack elementStack;
    private String entity;
    private int entityLevel;
    private EntityResolver entityResolver;
    private List externalDTDDeclarations;
    private boolean ignoreComments;
    private boolean includeExternalDTDDeclarations;
    private boolean includeInternalDTDDeclarations;
    private InputSource inputSource;
    private boolean insideCDATASection;
    private boolean insideDTDSection;
    private List internalDTDDeclarations;
    private boolean internalDTDsubset;
    private Locator locator;
    private boolean mergeAdjacentText;
    private NamespaceStack namespaceStack;
    private boolean stripWhitespaceText;
    private StringBuffer textBuffer;
    private boolean textInTextBuffer;

    public SAXContentHandler() {
        this(DocumentFactory.getInstance());
    }

    public SAXContentHandler(DocumentFactory documentFactory) {
        this(documentFactory, null);
    }

    public SAXContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler) {
        this(documentFactory, elementHandler, null);
        this.elementStack = createElementStack();
    }

    public SAXContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler, ElementStack elementStack) {
        this.availableNamespaceMap = new HashMap();
        this.declaredNamespaceList = new ArrayList();
        this.includeInternalDTDDeclarations = false;
        this.includeExternalDTDDeclarations = false;
        this.internalDTDsubset = false;
        this.mergeAdjacentText = false;
        this.textInTextBuffer = false;
        this.ignoreComments = false;
        this.stripWhitespaceText = false;
        this.documentFactory = documentFactory;
        this.elementHandler = elementHandler;
        this.elementStack = elementStack;
        this.namespaceStack = new NamespaceStack(documentFactory);
    }

    private String getEncoding() {
        if (this.locator == null) {
            return null;
        }
        try {
            Method method = this.locator.getClass().getMethod("getEncoding", new Class[0]);
            if (method != null) {
                return (String) method.invoke(this.locator, null);
            }
        } catch (Exception e) {
        }
        return null;
    }

    protected void addAttributes(Element element, Attributes attributes) {
        if (element instanceof AbstractElement) {
            ((AbstractElement) element).setAttributes(attributes, this.namespaceStack, false);
            return;
        }
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            String qName = attributes.getQName(i);
            if (!qName.startsWith("xmlns")) {
                String uri = attributes.getURI(i);
                String localName = attributes.getLocalName(i);
                element.addAttribute(this.namespaceStack.getAttributeQName(uri, localName, qName), attributes.getValue(i));
            }
        }
    }

    protected void addDTDDeclaration(Object obj) {
        if (this.internalDTDDeclarations == null) {
            this.internalDTDDeclarations = new ArrayList();
        }
        this.internalDTDDeclarations.add(obj);
    }

    protected void addDeclaredNamespaces(Element element) {
        element.getNamespace();
        int size = this.namespaceStack.size();
        while (this.declaredNamespaceIndex < size) {
            element.mo8862add(this.namespaceStack.getNamespace(this.declaredNamespaceIndex));
            this.declaredNamespaceIndex++;
        }
    }

    protected void addExternalDTDDeclaration(Object obj) {
        if (this.externalDTDDeclarations == null) {
            this.externalDTDDeclarations = new ArrayList();
        }
        this.externalDTDDeclarations.add(obj);
    }

    @Override
    public void attributeDecl(String str, String str2, String str3, String str4, String str5) throws SAXException {
        if (this.internalDTDsubset) {
            if (this.includeInternalDTDDeclarations) {
                addDTDDeclaration(new AttributeDecl(str, str2, str3, str4, str5));
            }
        } else if (this.includeExternalDTDDeclarations) {
            addExternalDTDDeclaration(new AttributeDecl(str, str2, str3, str4, str5));
        }
    }

    @Override
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        if (i2 == 0 || this.currentElement == null) {
            return;
        }
        if (this.entity != null) {
            if (this.mergeAdjacentText && this.textInTextBuffer) {
                completeCurrentTextNode();
            }
            this.currentElement.addEntity(this.entity, new String(cArr, i, i2));
            this.entity = null;
            return;
        }
        if (this.insideCDATASection) {
            if (this.mergeAdjacentText && this.textInTextBuffer) {
                completeCurrentTextNode();
            }
            this.cdataText.append(new String(cArr, i, i2));
            return;
        }
        if (!this.mergeAdjacentText) {
            this.currentElement.addText(new String(cArr, i, i2));
        } else {
            this.textBuffer.append(cArr, i, i2);
            this.textInTextBuffer = true;
        }
    }

    @Override
    public void comment(char[] cArr, int i, int i2) throws SAXException {
        if (this.ignoreComments) {
            return;
        }
        if (this.mergeAdjacentText && this.textInTextBuffer) {
            completeCurrentTextNode();
        }
        String str = new String(cArr, i, i2);
        if (this.insideDTDSection || str.length() <= 0) {
            return;
        }
        if (this.currentElement != null) {
            this.currentElement.addComment(str);
        } else {
            getDocument().addComment(str);
        }
    }

    protected void completeCurrentTextNode() {
        if (this.stripWhitespaceText) {
            boolean z = true;
            int length = this.textBuffer.length();
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(this.textBuffer.charAt(i))) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                this.currentElement.addText(this.textBuffer.toString());
            }
        } else {
            this.currentElement.addText(this.textBuffer.toString());
        }
        this.textBuffer.setLength(0);
        this.textInTextBuffer = false;
    }

    protected Document createDocument() {
        Document documentCreateDocument = this.documentFactory.createDocument(getEncoding());
        documentCreateDocument.setEntityResolver(this.entityResolver);
        if (this.inputSource != null) {
            documentCreateDocument.setName(this.inputSource.getSystemId());
        }
        return documentCreateDocument;
    }

    protected ElementStack createElementStack() {
        return new ElementStack();
    }

    @Override
    public void elementDecl(String str, String str2) throws SAXException {
        if (this.internalDTDsubset) {
            if (this.includeInternalDTDDeclarations) {
                addDTDDeclaration(new ElementDecl(str, str2));
            }
        } else if (this.includeExternalDTDDeclarations) {
            addExternalDTDDeclaration(new ElementDecl(str, str2));
        }
    }

    @Override
    public void endCDATA() throws SAXException {
        this.insideCDATASection = false;
        this.currentElement.addCDATA(this.cdataText.toString());
    }

    @Override
    public void endDTD() throws SAXException {
        this.insideDTDSection = false;
        DocumentType docType = getDocument().getDocType();
        if (docType != null) {
            if (this.internalDTDDeclarations != null) {
                docType.setInternalDeclarations(this.internalDTDDeclarations);
            }
            if (this.externalDTDDeclarations != null) {
                docType.setExternalDeclarations(this.externalDTDDeclarations);
            }
        }
        this.internalDTDDeclarations = null;
        this.externalDTDDeclarations = null;
    }

    @Override
    public void endDocument() throws SAXException {
        this.namespaceStack.clear();
        this.elementStack.clear();
        this.currentElement = null;
        this.textBuffer = null;
    }

    @Override
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (this.mergeAdjacentText && this.textInTextBuffer) {
            completeCurrentTextNode();
        }
        if (this.elementHandler != null && this.currentElement != null) {
            this.elementHandler.onEnd(this.elementStack);
        }
        this.elementStack.popElement();
        this.currentElement = this.elementStack.peekElement();
    }

    @Override
    public void endEntity(String str) throws SAXException {
        this.entityLevel--;
        this.entity = null;
        if (this.entityLevel == 0) {
            this.internalDTDsubset = true;
        }
    }

    @Override
    public void endPrefixMapping(String str) throws SAXException {
        this.namespaceStack.m8884pop(str);
        this.declaredNamespaceIndex = this.namespaceStack.size();
    }

    @Override
    public void error(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    @Override
    public void externalEntityDecl(String str, String str2, String str3) throws SAXException {
        ExternalEntityDecl externalEntityDecl = new ExternalEntityDecl(str, str2, str3);
        if (this.internalDTDsubset) {
            if (this.includeInternalDTDDeclarations) {
                addDTDDeclaration(externalEntityDecl);
            }
        } else if (this.includeExternalDTDDeclarations) {
            addExternalDTDDeclaration(externalEntityDecl);
        }
    }

    @Override
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    public Document getDocument() {
        if (this.document == null) {
            this.document = createDocument();
        }
        return this.document;
    }

    public ElementStack getElementStack() {
        return this.elementStack;
    }

    public EntityResolver getEntityResolver() {
        return this.entityResolver;
    }

    public InputSource getInputSource() {
        return this.inputSource;
    }

    @Override
    public void internalEntityDecl(String str, String str2) throws SAXException {
        if (this.internalDTDsubset) {
            if (this.includeInternalDTDDeclarations) {
                addDTDDeclaration(new InternalEntityDecl(str, str2));
            }
        } else if (this.includeExternalDTDDeclarations) {
            addExternalDTDDeclaration(new InternalEntityDecl(str, str2));
        }
    }

    protected boolean isIgnorableEntity(String str) {
        return "amp".equals(str) || "apos".equals(str) || "gt".equals(str) || "lt".equals(str) || "quot".equals(str);
    }

    public boolean isIgnoreComments() {
        return this.ignoreComments;
    }

    public boolean isIncludeExternalDTDDeclarations() {
        return this.includeExternalDTDDeclarations;
    }

    public boolean isIncludeInternalDTDDeclarations() {
        return this.includeInternalDTDDeclarations;
    }

    public boolean isMergeAdjacentText() {
        return this.mergeAdjacentText;
    }

    public boolean isStripWhitespaceText() {
        return this.stripWhitespaceText;
    }

    @Override
    public void notationDecl(String str, String str2, String str3) throws SAXException {
    }

    @Override
    public void processingInstruction(String str, String str2) throws SAXException {
        if (this.mergeAdjacentText && this.textInTextBuffer) {
            completeCurrentTextNode();
        }
        if (this.currentElement != null) {
            this.currentElement.addProcessingInstruction(str, str2);
        } else {
            getDocument().addProcessingInstruction(str, str2);
        }
    }

    @Override
    public void setDocumentLocator(Locator locator) {
        this.locator = locator;
    }

    public void setElementStack(ElementStack elementStack) {
        this.elementStack = elementStack;
    }

    public void setEntityResolver(EntityResolver entityResolver) {
        this.entityResolver = entityResolver;
    }

    public void setIgnoreComments(boolean z) {
        this.ignoreComments = z;
    }

    public void setIncludeExternalDTDDeclarations(boolean z) {
        this.includeExternalDTDDeclarations = z;
    }

    public void setIncludeInternalDTDDeclarations(boolean z) {
        this.includeInternalDTDDeclarations = z;
    }

    public void setInputSource(InputSource inputSource) {
        this.inputSource = inputSource;
    }

    public void setMergeAdjacentText(boolean z) {
        this.mergeAdjacentText = z;
    }

    public void setStripWhitespaceText(boolean z) {
        this.stripWhitespaceText = z;
    }

    @Override
    public void startCDATA() throws SAXException {
        this.insideCDATASection = true;
        this.cdataText = new StringBuffer();
    }

    @Override
    public void startDTD(String str, String str2, String str3) throws SAXException {
        getDocument().addDocType(str, str2, str3);
        this.insideDTDSection = true;
        this.internalDTDsubset = true;
    }

    @Override
    public void startDocument() throws SAXException {
        this.document = null;
        this.currentElement = null;
        this.elementStack.clear();
        if (this.elementHandler != null && (this.elementHandler instanceof DispatchHandler)) {
            this.elementStack.setDispatchHandler((DispatchHandler) this.elementHandler);
        }
        this.namespaceStack.clear();
        this.declaredNamespaceIndex = 0;
        if (this.mergeAdjacentText && this.textBuffer == null) {
            this.textBuffer = new StringBuffer();
        }
        this.textInTextBuffer = false;
    }

    @Override
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (this.mergeAdjacentText && this.textInTextBuffer) {
            completeCurrentTextNode();
        }
        QName qName = this.namespaceStack.getQName(str, str2, str3);
        Branch document = this.currentElement;
        if (document == null) {
            document = getDocument();
        }
        Element elementAddElement = document.addElement(qName);
        addDeclaredNamespaces(elementAddElement);
        addAttributes(elementAddElement, attributes);
        this.elementStack.pushElement(elementAddElement);
        this.currentElement = elementAddElement;
        this.entity = null;
        if (this.elementHandler != null) {
            this.elementHandler.onStart(this.elementStack);
        }
    }

    @Override
    public void startEntity(String str) throws SAXException {
        this.entityLevel++;
        this.entity = null;
        if (!this.insideDTDSection && !isIgnorableEntity(str)) {
            this.entity = str;
        }
        this.internalDTDsubset = false;
    }

    @Override
    public void startPrefixMapping(String str, String str2) throws SAXException {
        this.namespaceStack.push(str, str2);
    }

    @Override
    public void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException {
    }

    @Override
    public void warning(SAXParseException sAXParseException) throws SAXException {
    }
}
