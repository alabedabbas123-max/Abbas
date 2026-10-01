package org.dom4j.dom;

import java.util.ArrayList;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.tree.DefaultDocument;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.EntityReference;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public class DOMDocument extends DefaultDocument implements Document {
    private static final DOMDocumentFactory DOCUMENT_FACTORY = (DOMDocumentFactory) DOMDocumentFactory.getInstance();

    public DOMDocument() {
        init();
    }

    public DOMDocument(String str) {
        super(str);
        init();
    }

    public DOMDocument(String str, DOMElement dOMElement, DOMDocumentType dOMDocumentType) {
        super(str, dOMElement, dOMDocumentType);
        init();
    }

    public DOMDocument(DOMDocumentType dOMDocumentType) {
        super(dOMDocumentType);
        init();
    }

    public DOMDocument(DOMElement dOMElement) {
        super(dOMElement);
        init();
    }

    public DOMDocument(DOMElement dOMElement, DOMDocumentType dOMDocumentType) {
        super(dOMElement, dOMDocumentType);
        init();
    }

    private void checkNewChildNode(Node node) throws DOMException {
        short nodeType = node.getNodeType();
        if (nodeType != 1 && nodeType != 8 && nodeType != 7 && nodeType != 10) {
            throw new DOMException((short) 3, "Given node cannot be a child of document");
        }
    }

    private void init() {
        setDocumentFactory(DOCUMENT_FACTORY);
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
    public Attr createAttribute(String str) throws DOMException {
        return (Attr) getDocumentFactory().createAttribute((Element) null, getDocumentFactory().createQName(str), "");
    }

    @Override
    public Attr createAttributeNS(String str, String str2) throws DOMException {
        return (Attr) getDocumentFactory().createAttribute((Element) null, getDocumentFactory().createQName(str2, str), (String) null);
    }

    @Override
    public CDATASection createCDATASection(String str) throws DOMException {
        return (CDATASection) getDocumentFactory().createCDATA(str);
    }

    @Override
    public Comment createComment(String str) {
        return (Comment) getDocumentFactory().createComment(str);
    }

    @Override
    public DocumentFragment createDocumentFragment() {
        DOMNodeHelper.notSupported();
        return null;
    }

    @Override
    public org.w3c.dom.Element createElement(String str) throws DOMException {
        return (org.w3c.dom.Element) getDocumentFactory().createElement(str);
    }

    @Override
    public org.w3c.dom.Element createElementNS(String str, String str2) throws DOMException {
        return (org.w3c.dom.Element) getDocumentFactory().createElement(getDocumentFactory().createQName(str2, str));
    }

    @Override
    public EntityReference createEntityReference(String str) throws DOMException {
        return (EntityReference) getDocumentFactory().createEntity(str, null);
    }

    @Override
    public ProcessingInstruction createProcessingInstruction(String str, String str2) throws DOMException {
        return (ProcessingInstruction) getDocumentFactory().createProcessingInstruction(str, str2);
    }

    @Override
    public Text createTextNode(String str) {
        return (Text) getDocumentFactory().createText(str);
    }

    @Override
    public NamedNodeMap getAttributes() {
        return null;
    }

    @Override
    public NodeList getChildNodes() {
        return DOMNodeHelper.createNodeList(content());
    }

    @Override
    public DocumentType getDoctype() {
        return DOMNodeHelper.asDOMDocumentType(getDocType());
    }

    @Override
    public org.w3c.dom.Element getDocumentElement() {
        return DOMNodeHelper.asDOMElement(getRootElement());
    }

    @Override
    protected DocumentFactory getDocumentFactory() {
        return super.getDocumentFactory() == null ? DOCUMENT_FACTORY : super.getDocumentFactory();
    }

    @Override
    public org.w3c.dom.Element getElementById(String str) {
        return DOMNodeHelper.asDOMElement(elementByID(str));
    }

    @Override
    public NodeList getElementsByTagName(String str) {
        ArrayList arrayList = new ArrayList();
        DOMNodeHelper.appendElementsByTagName(arrayList, this, str);
        return DOMNodeHelper.createNodeList(arrayList);
    }

    @Override
    public NodeList getElementsByTagNameNS(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        DOMNodeHelper.appendElementsByTagNameNS(arrayList, this, str, str2);
        return DOMNodeHelper.createNodeList(arrayList);
    }

    @Override
    public Node getFirstChild() {
        return DOMNodeHelper.asDOMNode(node(0));
    }

    @Override
    public DOMImplementation getImplementation() {
        return getDocumentFactory() instanceof DOMImplementation ? (DOMImplementation) getDocumentFactory() : DOCUMENT_FACTORY;
    }

    @Override
    public Node getLastChild() {
        return DOMNodeHelper.asDOMNode(node(nodeCount() - 1));
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
        return "#document";
    }

    @Override
    public String getNodeValue() throws DOMException {
        return null;
    }

    @Override
    public Document getOwnerDocument() {
        return null;
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
        return nodeCount() > 0;
    }

    @Override
    public Node importNode(Node node, boolean z) throws DOMException {
        DOMNodeHelper.notSupported();
        return null;
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
