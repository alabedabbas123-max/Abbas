package org.dom4j.tree;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.IllegalAddException;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.xml.sax.EntityResolver;

public class DefaultDocument extends AbstractDocument {
    private List content;
    private DocumentType docType;
    private DocumentFactory documentFactory = DocumentFactory.getInstance();
    private transient EntityResolver entityResolver;
    private String name;
    private Element rootElement;
    protected static final List EMPTY_LIST = Collections.EMPTY_LIST;
    protected static final Iterator EMPTY_ITERATOR = EMPTY_LIST.iterator();

    public DefaultDocument() {
    }

    public DefaultDocument(String str) {
        this.name = str;
    }

    public DefaultDocument(String str, Element element, DocumentType documentType) {
        this.name = str;
        this.rootElement = element;
        this.docType = documentType;
    }

    public DefaultDocument(DocumentType documentType) {
        this.docType = documentType;
    }

    public DefaultDocument(Element element) {
        this.rootElement = element;
    }

    public DefaultDocument(Element element, DocumentType documentType) {
        this.rootElement = element;
        this.docType = documentType;
    }

    @Override
    public Document addDocType(String str, String str2, String str3) {
        setDocType(getDocumentFactory().createDocType(str, str2, str3));
        return this;
    }

    @Override
    protected void addNode(int i, Node node) {
        if (node != null) {
            Document document = node.getDocument();
            if (document != null && document != this) {
                throw new IllegalAddException(this, node, new StringBuffer().append("The Node already has an existing document: ").append(document).toString());
            }
            contentList().add(i, node);
            childAdded(node);
        }
    }

    @Override
    protected void addNode(Node node) {
        if (node != null) {
            Document document = node.getDocument();
            if (document != null && document != this) {
                throw new IllegalAddException(this, node, new StringBuffer().append("The Node already has an existing document: ").append(document).toString());
            }
            contentList().add(node);
            childAdded(node);
        }
    }

    @Override
    public void clearContent() {
        contentRemoved();
        this.content = null;
        this.rootElement = null;
    }

    @Override
    public Object clone() {
        DefaultDocument defaultDocument = (DefaultDocument) super.clone();
        defaultDocument.rootElement = null;
        defaultDocument.content = null;
        defaultDocument.appendContent(this);
        return defaultDocument;
    }

    @Override
    protected List contentList() {
        if (this.content == null) {
            this.content = createContentList();
            if (this.rootElement != null) {
                this.content.add(this.rootElement);
            }
        }
        return this.content;
    }

    @Override
    public DocumentType getDocType() {
        return this.docType;
    }

    @Override
    protected DocumentFactory getDocumentFactory() {
        return this.documentFactory;
    }

    @Override
    public EntityResolver getEntityResolver() {
        return this.entityResolver;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Element getRootElement() {
        return this.rootElement;
    }

    @Override
    public String getXMLEncoding() {
        return this.encoding;
    }

    @Override
    public ProcessingInstruction processingInstruction(String str) {
        List listContentList = contentList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof ProcessingInstruction) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) obj;
                if (str.equals(processingInstruction.getName())) {
                    return processingInstruction;
                }
            }
        }
        return null;
    }

    @Override
    public List processingInstructions() {
        List listContentList = contentList();
        BackedList backedListCreateResultList = createResultList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof ProcessingInstruction) {
                backedListCreateResultList.add(obj);
            }
        }
        return backedListCreateResultList;
    }

    @Override
    public List processingInstructions(String str) {
        List listContentList = contentList();
        BackedList backedListCreateResultList = createResultList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof ProcessingInstruction) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) obj;
                if (str.equals(processingInstruction.getName())) {
                    backedListCreateResultList.add(processingInstruction);
                }
            }
        }
        return backedListCreateResultList;
    }

    @Override
    protected boolean removeNode(Node node) {
        if (node == this.rootElement) {
            this.rootElement = null;
        }
        if (!contentList().remove(node)) {
            return false;
        }
        childRemoved(node);
        return true;
    }

    @Override
    public boolean removeProcessingInstruction(String str) {
        Iterator it = contentList().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof ProcessingInstruction) && str.equals(((ProcessingInstruction) next).getName())) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    protected void rootElementAdded(Element element) {
        this.rootElement = element;
        element.setDocument(this);
    }

    @Override
    public void setContent(List list) {
        this.rootElement = null;
        contentRemoved();
        if (list instanceof ContentListFacade) {
            list = ((ContentListFacade) list).getBackingList();
        }
        if (list == null) {
            this.content = null;
            return;
        }
        int size = list.size();
        List listCreateContentList = createContentList(size);
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj instanceof Node) {
                Node node = (Node) obj;
                Document document = node.getDocument();
                Node node2 = (document == null || document == this) ? node : (Node) node.clone();
                if (node2 instanceof Element) {
                    if (this.rootElement != null) {
                        throw new IllegalAddException(new StringBuffer().append("A document may only contain one root element: ").append(list).toString());
                    }
                    this.rootElement = (Element) node2;
                }
                listCreateContentList.add(node2);
                childAdded(node2);
            }
        }
        this.content = listCreateContentList;
    }

    @Override
    public void setDocType(DocumentType documentType) {
        this.docType = documentType;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    @Override
    public void setEntityResolver(EntityResolver entityResolver) {
        this.entityResolver = entityResolver;
    }

    @Override
    public void setName(String str) {
        this.name = str;
    }
}
