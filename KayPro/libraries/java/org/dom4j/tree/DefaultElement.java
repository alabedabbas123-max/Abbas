package org.dom4j.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.Branch;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.IllegalAddException;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;
import org.dom4j.Text;

public class DefaultElement extends AbstractElement {
    private static final transient DocumentFactory DOCUMENT_FACTORY = DocumentFactory.getInstance();
    private Object attributes;
    private Object content;
    private Branch parentBranch;
    private QName qname;

    public DefaultElement(String str) {
        this.qname = DOCUMENT_FACTORY.createQName(str);
    }

    public DefaultElement(String str, Namespace namespace) {
        this.qname = DOCUMENT_FACTORY.createQName(str, namespace);
    }

    public DefaultElement(QName qName) {
        this.qname = qName;
    }

    public DefaultElement(QName qName, int i) {
        this.qname = qName;
        if (i > 1) {
            this.attributes = new ArrayList(i);
        }
    }

    @Override
    public void mo8859add(Attribute attribute) {
        if (attribute.getParent() != null) {
            throw new IllegalAddException((Element) this, (Node) attribute, new StringBuffer().append("The Attribute already has an existing parent \"").append(attribute.getParent().getQualifiedName()).append("\"").toString());
        }
        if (attribute.getValue() == null) {
            Attribute attribute2 = attribute(attribute.getQName());
            if (attribute2 != null) {
                remove(attribute2);
                return;
            }
            return;
        }
        if (this.attributes == null) {
            this.attributes = attribute;
        } else {
            attributeList().add(attribute);
        }
        childAdded(attribute);
    }

    @Override
    protected void addNewNode(Node node) {
        Object obj = this.content;
        if (obj == null) {
            this.content = node;
        } else if (obj instanceof List) {
            ((List) obj).add(node);
        } else {
            List listCreateContentList = createContentList();
            listCreateContentList.add(obj);
            listCreateContentList.add(node);
            this.content = listCreateContentList;
        }
        childAdded(node);
    }

    @Override
    public List additionalNamespaces() {
        Object obj = this.content;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Namespace)) {
                return createEmptyList();
            }
            Namespace namespace = (Namespace) obj;
            return namespace.equals(getNamespace()) ? createEmptyList() : createSingleResultList(namespace);
        }
        List list = (List) obj;
        int size = list.size();
        BackedList backedListCreateResultList = createResultList();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof Namespace) {
                Namespace namespace2 = (Namespace) obj2;
                if (!namespace2.equals(getNamespace())) {
                    backedListCreateResultList.addLocal(namespace2);
                }
            }
        }
        return backedListCreateResultList;
    }

    @Override
    public List additionalNamespaces(String str) {
        Object obj = this.content;
        if (!(obj instanceof List)) {
            if (obj instanceof Namespace) {
                Namespace namespace = (Namespace) obj;
                if (!str.equals(namespace.getURI())) {
                    return createSingleResultList(namespace);
                }
            }
            return createEmptyList();
        }
        List list = (List) obj;
        BackedList backedListCreateResultList = createResultList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof Namespace) {
                Namespace namespace2 = (Namespace) obj2;
                if (!str.equals(namespace2.getURI())) {
                    backedListCreateResultList.addLocal(namespace2);
                }
            }
        }
        return backedListCreateResultList;
    }

    @Override
    public Attribute attribute(int i) {
        Object obj = this.attributes;
        if (obj instanceof List) {
            return (Attribute) ((List) obj).get(i);
        }
        if (obj == null || i != 0) {
            return null;
        }
        return (Attribute) obj;
    }

    @Override
    public Attribute attribute(String str) {
        Object obj = this.attributes;
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Attribute attribute = (Attribute) list.get(i);
                if (str.equals(attribute.getName())) {
                    return attribute;
                }
            }
        } else if (obj != null) {
            Attribute attribute2 = (Attribute) obj;
            if (str.equals(attribute2.getName())) {
                return attribute2;
            }
        }
        return null;
    }

    @Override
    public Attribute attribute(String str, Namespace namespace) {
        return attribute(getDocumentFactory().createQName(str, namespace));
    }

    @Override
    public Attribute attribute(QName qName) {
        Object obj = this.attributes;
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Attribute attribute = (Attribute) list.get(i);
                if (qName.equals(attribute.getQName())) {
                    return attribute;
                }
            }
        } else if (obj != null) {
            Attribute attribute2 = (Attribute) obj;
            if (qName.equals(attribute2.getQName())) {
                return attribute2;
            }
        }
        return null;
    }

    @Override
    public int attributeCount() {
        Object obj = this.attributes;
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        return obj != null ? 1 : 0;
    }

    @Override
    public Iterator attributeIterator() {
        Object obj = this.attributes;
        if (obj instanceof List) {
            return ((List) obj).iterator();
        }
        return obj != null ? createSingleIterator(obj) : EMPTY_ITERATOR;
    }

    @Override
    protected List attributeList() {
        Object obj = this.attributes;
        if (obj instanceof List) {
            return (List) obj;
        }
        if (obj == null) {
            List listCreateAttributeList = createAttributeList();
            this.attributes = listCreateAttributeList;
            return listCreateAttributeList;
        }
        List listCreateAttributeList2 = createAttributeList();
        listCreateAttributeList2.add(obj);
        this.attributes = listCreateAttributeList2;
        return listCreateAttributeList2;
    }

    @Override
    protected List attributeList(int i) {
        Object obj = this.attributes;
        if (obj instanceof List) {
            return (List) obj;
        }
        if (obj == null) {
            List listCreateAttributeList = createAttributeList(i);
            this.attributes = listCreateAttributeList;
            return listCreateAttributeList;
        }
        List listCreateAttributeList2 = createAttributeList(i);
        listCreateAttributeList2.add(obj);
        this.attributes = listCreateAttributeList2;
        return listCreateAttributeList2;
    }

    @Override
    public List attributes() {
        return new ContentListFacade(this, attributeList());
    }

    @Override
    public void clearContent() {
        if (this.content != null) {
            contentRemoved();
            this.content = null;
        }
    }

    @Override
    public Object clone() {
        DefaultElement defaultElement = (DefaultElement) super.clone();
        if (defaultElement != this) {
            defaultElement.content = null;
            defaultElement.attributes = null;
            defaultElement.appendAttributes(this);
            defaultElement.appendContent(this);
        }
        return defaultElement;
    }

    @Override
    protected List contentList() {
        Object obj = this.content;
        if (obj instanceof List) {
            return (List) obj;
        }
        List listCreateContentList = createContentList();
        if (obj != null) {
            listCreateContentList.add(obj);
        }
        this.content = listCreateContentList;
        return listCreateContentList;
    }

    @Override
    public List declaredNamespaces() {
        BackedList backedListCreateResultList = createResultList();
        Object obj = this.content;
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 instanceof Namespace) {
                    backedListCreateResultList.addLocal(obj2);
                }
            }
        } else if (obj instanceof Namespace) {
            backedListCreateResultList.addLocal(obj);
        }
        return backedListCreateResultList;
    }

    @Override
    public Element element(String str) {
        Object obj = this.content;
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 instanceof Element) {
                    Element element = (Element) obj2;
                    if (str.equals(element.getName())) {
                        return element;
                    }
                }
            }
        } else if (obj instanceof Element) {
            Element element2 = (Element) obj;
            if (str.equals(element2.getName())) {
                return element2;
            }
        }
        return null;
    }

    @Override
    public Element element(String str, Namespace namespace) {
        return element(getDocumentFactory().createQName(str, namespace));
    }

    @Override
    public Element element(QName qName) {
        Object obj = this.content;
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 instanceof Element) {
                    Element element = (Element) obj2;
                    if (qName.equals(element.getQName())) {
                        return element;
                    }
                }
            }
        } else if (obj instanceof Element) {
            Element element2 = (Element) obj;
            if (qName.equals(element2.getQName())) {
                return element2;
            }
        }
        return null;
    }

    @Override
    public Document getDocument() {
        if (this.parentBranch instanceof Document) {
            return (Document) this.parentBranch;
        }
        if (this.parentBranch instanceof Element) {
            return ((Element) this.parentBranch).getDocument();
        }
        return null;
    }

    @Override
    protected DocumentFactory getDocumentFactory() {
        DocumentFactory documentFactory = this.qname.getDocumentFactory();
        return documentFactory != null ? documentFactory : DOCUMENT_FACTORY;
    }

    @Override
    public Namespace getNamespaceForPrefix(String str) {
        Namespace namespaceForPrefix;
        if (str == null) {
            str = "";
        }
        if (str.equals(getNamespacePrefix())) {
            return getNamespace();
        }
        if (str.equals("xml")) {
            return Namespace.XML_NAMESPACE;
        }
        Object obj = this.content;
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 instanceof Namespace) {
                    Namespace namespace = (Namespace) obj2;
                    if (str.equals(namespace.getPrefix())) {
                        return namespace;
                    }
                }
            }
        } else if (obj instanceof Namespace) {
            Namespace namespace2 = (Namespace) obj;
            if (str.equals(namespace2.getPrefix())) {
                return namespace2;
            }
        }
        Element parent = getParent();
        if (parent != null && (namespaceForPrefix = parent.getNamespaceForPrefix(str)) != null) {
            return namespaceForPrefix;
        }
        if (str == null || str.length() <= 0) {
            return Namespace.NO_NAMESPACE;
        }
        return null;
    }

    @Override
    public Namespace getNamespaceForURI(String str) {
        if (str == null || str.length() <= 0) {
            return Namespace.NO_NAMESPACE;
        }
        if (str.equals(getNamespaceURI())) {
            return getNamespace();
        }
        Object obj = this.content;
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 instanceof Namespace) {
                    Namespace namespace = (Namespace) obj2;
                    if (str.equals(namespace.getURI())) {
                        return namespace;
                    }
                }
            }
        } else if (obj instanceof Namespace) {
            Namespace namespace2 = (Namespace) obj;
            if (str.equals(namespace2.getURI())) {
                return namespace2;
            }
        }
        Element parent = getParent();
        if (parent != null) {
            return parent.getNamespaceForURI(str);
        }
        return null;
    }

    @Override
    public Element getParent() {
        if (this.parentBranch instanceof Element) {
            return (Element) this.parentBranch;
        }
        return null;
    }

    @Override
    public QName getQName() {
        return this.qname;
    }

    @Override
    public String getStringValue() {
        Object obj = this.content;
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            if (size > 0) {
                if (size == 1) {
                    return getContentAsStringValue(list.get(0));
                }
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < size; i++) {
                    String contentAsStringValue = getContentAsStringValue(list.get(i));
                    if (contentAsStringValue.length() > 0) {
                        stringBuffer.append(contentAsStringValue);
                    }
                }
                return stringBuffer.toString();
            }
        } else if (obj != null) {
            return getContentAsStringValue(obj);
        }
        return "";
    }

    @Override
    public String getText() {
        Object obj = this.content;
        if (obj instanceof List) {
            return super.getText();
        }
        return obj != null ? getContentAsText(obj) : "";
    }

    @Override
    public int indexOf(Node node) {
        Object obj = this.content;
        if (obj instanceof List) {
            return ((List) obj).indexOf(node);
        }
        return (obj == null || !obj.equals(node)) ? -1 : 0;
    }

    @Override
    public Node node(int i) {
        if (i < 0) {
            return null;
        }
        Object obj = this.content;
        if (obj instanceof List) {
            List list = (List) obj;
            if (i >= list.size()) {
                return null;
            }
            obj = list.get(i);
        } else if (i != 0) {
            obj = null;
        }
        if (obj != null) {
            return obj instanceof Node ? (Node) obj : new DefaultText(obj.toString());
        }
        return null;
    }

    @Override
    public int nodeCount() {
        Object obj = this.content;
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        return obj != null ? 1 : 0;
    }

    @Override
    public Iterator nodeIterator() {
        Object obj = this.content;
        if (obj instanceof List) {
            return ((List) obj).iterator();
        }
        return obj != null ? createSingleIterator(obj) : EMPTY_ITERATOR;
    }

    @Override
    public ProcessingInstruction processingInstruction(String str) {
        Object obj = this.content;
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 instanceof ProcessingInstruction) {
                    ProcessingInstruction processingInstruction = (ProcessingInstruction) obj2;
                    if (str.equals(processingInstruction.getName())) {
                        return processingInstruction;
                    }
                }
            }
        } else if (obj instanceof ProcessingInstruction) {
            ProcessingInstruction processingInstruction2 = (ProcessingInstruction) obj;
            if (str.equals(processingInstruction2.getName())) {
                return processingInstruction2;
            }
        }
        return null;
    }

    @Override
    public List processingInstructions() {
        Object obj = this.content;
        if (!(obj instanceof List)) {
            return obj instanceof ProcessingInstruction ? createSingleResultList(obj) : createEmptyList();
        }
        List list = (List) obj;
        BackedList backedListCreateResultList = createResultList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof ProcessingInstruction) {
                backedListCreateResultList.addLocal(obj2);
            }
        }
        return backedListCreateResultList;
    }

    @Override
    public List processingInstructions(String str) {
        Object obj = this.content;
        if (!(obj instanceof List)) {
            if (obj instanceof ProcessingInstruction) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) obj;
                if (str.equals(processingInstruction.getName())) {
                    return createSingleResultList(processingInstruction);
                }
            }
            return createEmptyList();
        }
        List list = (List) obj;
        BackedList backedListCreateResultList = createResultList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof ProcessingInstruction) {
                ProcessingInstruction processingInstruction2 = (ProcessingInstruction) obj2;
                if (str.equals(processingInstruction2.getName())) {
                    backedListCreateResultList.addLocal(processingInstruction2);
                }
            }
        }
        return backedListCreateResultList;
    }

    @Override
    public boolean remove(Attribute attribute) {
        boolean z;
        Attribute attribute2;
        boolean z2 = true;
        Object obj = this.attributes;
        if (obj instanceof List) {
            List list = (List) obj;
            boolean zRemove = list.remove(attribute);
            if (zRemove || (attribute2 = attribute(attribute.getQName())) == null) {
                z = zRemove;
            } else {
                list.remove(attribute2);
                z = true;
            }
            z2 = z;
        } else if (obj == null || !(attribute.equals(obj) || attribute.getQName().equals(((Attribute) obj).getQName()))) {
            z2 = false;
        } else {
            this.attributes = null;
        }
        if (z2) {
            childRemoved(attribute);
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    @Override
    protected boolean removeNode(Node node) {
        boolean zRemove;
        Object obj = this.content;
        if (obj == null) {
            zRemove = false;
        } else if (obj == node) {
            this.content = null;
            zRemove = true;
        } else if (obj instanceof List) {
            zRemove = ((List) obj).remove(node);
        } else {
            zRemove = false;
        }
        if (zRemove) {
            childRemoved(node);
        }
        return zRemove;
    }

    @Override
    public boolean removeProcessingInstruction(String str) {
        Object obj = this.content;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof ProcessingInstruction) && str.equals(((ProcessingInstruction) next).getName())) {
                    it.remove();
                    return true;
                }
            }
        } else if ((obj instanceof ProcessingInstruction) && str.equals(((ProcessingInstruction) obj).getName())) {
            this.content = null;
            return true;
        }
        return false;
    }

    protected void setAttributeList(List list) {
        this.attributes = list;
    }

    public void setAttributes(List list) {
        if (list instanceof ContentListFacade) {
            list = ((ContentListFacade) list).getBackingList();
        }
        this.attributes = list;
    }

    @Override
    public void setContent(List list) {
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
                Element parent = node.getParent();
                if (parent != null && parent != this) {
                    node = (Node) node.clone();
                }
                listCreateContentList.add(node);
                childAdded(node);
            } else if (obj != null) {
                Text textCreateText = getDocumentFactory().createText(obj.toString());
                listCreateContentList.add(textCreateText);
                childAdded(textCreateText);
            }
        }
        this.content = listCreateContentList;
    }

    @Override
    public void setDocument(Document document) {
        if ((this.parentBranch instanceof Document) || document != null) {
            this.parentBranch = document;
        }
    }

    @Override
    public void setParent(Element element) {
        if ((this.parentBranch instanceof Element) || element != null) {
            this.parentBranch = element;
        }
    }

    @Override
    public void setQName(QName qName) {
        this.qname = qName;
    }

    @Override
    public boolean supportsParent() {
        return true;
    }
}
