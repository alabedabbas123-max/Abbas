package org.dom4j.tree;

import com.baidu.mobstat.Config;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.CDATA;
import org.dom4j.CharacterData;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.IllegalAddException;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;
import org.dom4j.Text;
import org.dom4j.Visitor;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.xml.sax.Attributes;

public abstract class AbstractElement extends AbstractBranch implements Element {
    protected static final boolean USE_STRINGVALUE_SEPARATOR = false;
    protected static final boolean VERBOSE_TOSTRING = false;
    private static final DocumentFactory DOCUMENT_FACTORY = DocumentFactory.getInstance();
    protected static final List EMPTY_LIST = Collections.EMPTY_LIST;
    protected static final Iterator EMPTY_ITERATOR = EMPTY_LIST.iterator();

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        int iAttributeCount = attributeCount();
        for (int i = 0; i < iAttributeCount; i++) {
            visitor.visit(attribute(i));
        }
        int iNodeCount = nodeCount();
        for (int i2 = 0; i2 < iNodeCount; i2++) {
            node(i2).accept(visitor);
        }
    }

    @Override
    public void mo8859add(Attribute attribute) {
        if (attribute.getParent() != null) {
            throw new IllegalAddException((Element) this, (Node) attribute, new StringBuffer().append("The Attribute already has an existing parent \"").append(attribute.getParent().getQualifiedName()).append("\"").toString());
        }
        if (attribute.getValue() != null) {
            attributeList().add(attribute);
            childAdded(attribute);
        } else {
            Attribute attribute2 = attribute(attribute.getQName());
            if (attribute2 != null) {
                remove(attribute2);
            }
        }
    }

    @Override
    public void mo8860add(CDATA cdata) {
        addNode(cdata);
    }

    @Override
    public void mo8855add(Comment comment) {
        addNode(comment);
    }

    @Override
    public void mo8856add(Element element) {
        addNode(element);
    }

    @Override
    public void mo8861add(Entity entity) {
        addNode(entity);
    }

    @Override
    public void mo8862add(Namespace namespace) {
        addNode(namespace);
    }

    @Override
    public void mo8857add(Node node) {
        switch (node.getNodeType()) {
            case 1:
                mo8856add((Element) node);
                break;
            case 2:
                mo8859add((Attribute) node);
                break;
            case 3:
                mo8863add((Text) node);
                break;
            case 4:
                mo8860add((CDATA) node);
                break;
            case 5:
                mo8861add((Entity) node);
                break;
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                invalidNodeTypeAddException(node);
                break;
            case 7:
                mo8858add((ProcessingInstruction) node);
                break;
            case 8:
                mo8855add((Comment) node);
                break;
            case 13:
                mo8862add((Namespace) node);
                break;
        }
    }

    @Override
    public void mo8858add(ProcessingInstruction processingInstruction) {
        addNode(processingInstruction);
    }

    @Override
    public void mo8863add(Text text) {
        addNode(text);
    }

    public Element addAttribute(String str, String str2) {
        Attribute attribute = attribute(str);
        if (str2 != null) {
            if (attribute == null) {
                mo8859add(getDocumentFactory().createAttribute(this, str, str2));
            } else if (attribute.isReadOnly()) {
                remove(attribute);
                mo8859add(getDocumentFactory().createAttribute(this, str, str2));
            } else {
                attribute.setValue(str2);
            }
        } else if (attribute != null) {
            remove(attribute);
        }
        return this;
    }

    public Element addAttribute(QName qName, String str) {
        Attribute attribute = attribute(qName);
        if (str != null) {
            if (attribute == null) {
                mo8859add(getDocumentFactory().createAttribute(this, qName, str));
            } else if (attribute.isReadOnly()) {
                remove(attribute);
                mo8859add(getDocumentFactory().createAttribute(this, qName, str));
            } else {
                attribute.setValue(str);
            }
        } else if (attribute != null) {
            remove(attribute);
        }
        return this;
    }

    @Override
    public Element addCDATA(String str) {
        addNewNode(getDocumentFactory().createCDATA(str));
        return this;
    }

    @Override
    public Element addComment(String str) {
        addNewNode(getDocumentFactory().createComment(str));
        return this;
    }

    @Override
    public Element addElement(String str) {
        Namespace namespaceForPrefix;
        String strSubstring;
        DocumentFactory documentFactory = getDocumentFactory();
        int iIndexOf = str.indexOf(Config.TRACE_TODAY_VISIT_SPLIT);
        if (iIndexOf > 0) {
            String strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = str.substring(iIndexOf + 1);
            namespaceForPrefix = getNamespaceForPrefix(strSubstring2);
            if (namespaceForPrefix == null) {
                throw new IllegalAddException(new StringBuffer().append("No such namespace prefix: ").append(strSubstring2).append(" is in scope on: ").append(this).append(" so cannot add element: ").append(str).toString());
            }
        } else {
            namespaceForPrefix = getNamespaceForPrefix("");
            strSubstring = str;
        }
        Element elementCreateElement = namespaceForPrefix != null ? documentFactory.createElement(documentFactory.createQName(strSubstring, namespaceForPrefix)) : documentFactory.createElement(str);
        addNewNode(elementCreateElement);
        return elementCreateElement;
    }

    @Override
    public Element addEntity(String str, String str2) {
        addNewNode(getDocumentFactory().createEntity(str, str2));
        return this;
    }

    @Override
    public Element addNamespace(String str, String str2) {
        addNewNode(getDocumentFactory().createNamespace(str, str2));
        return this;
    }

    protected void addNewNode(int i, Node node) {
        contentList().add(i, node);
        childAdded(node);
    }

    protected void addNewNode(Node node) {
        contentList().add(node);
        childAdded(node);
    }

    @Override
    protected void addNode(int i, Node node) {
        if (node.getParent() != null) {
            throw new IllegalAddException((Element) this, node, new StringBuffer().append("The Node already has an existing parent of \"").append(node.getParent().getQualifiedName()).append("\"").toString());
        }
        addNewNode(i, node);
    }

    @Override
    protected void addNode(Node node) {
        if (node.getParent() != null) {
            throw new IllegalAddException((Element) this, node, new StringBuffer().append("The Node already has an existing parent of \"").append(node.getParent().getQualifiedName()).append("\"").toString());
        }
        addNewNode(node);
    }

    @Override
    public Element addProcessingInstruction(String str, String str2) {
        addNewNode(getDocumentFactory().createProcessingInstruction(str, str2));
        return this;
    }

    @Override
    public Element addProcessingInstruction(String str, Map map) {
        addNewNode(getDocumentFactory().createProcessingInstruction(str, map));
        return this;
    }

    public Element addText(String str) {
        addNewNode(getDocumentFactory().createText(str));
        return this;
    }

    @Override
    public List additionalNamespaces() {
        List listContentList = contentList();
        int size = listContentList.size();
        BackedList backedListCreateResultList = createResultList();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof Namespace) {
                Namespace namespace = (Namespace) obj;
                if (!namespace.equals(getNamespace())) {
                    backedListCreateResultList.addLocal(namespace);
                }
            }
        }
        return backedListCreateResultList;
    }

    public List additionalNamespaces(String str) {
        List listContentList = contentList();
        BackedList backedListCreateResultList = createResultList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof Namespace) {
                Namespace namespace = (Namespace) obj;
                if (!str.equals(namespace.getURI())) {
                    backedListCreateResultList.addLocal(namespace);
                }
            }
        }
        return backedListCreateResultList;
    }

    @Override
    public void appendAttributes(Element element) {
        int iAttributeCount = element.attributeCount();
        for (int i = 0; i < iAttributeCount; i++) {
            Attribute attribute = element.attribute(i);
            if (attribute.supportsParent()) {
                addAttribute(attribute.getQName(), attribute.getValue());
            } else {
                mo8859add(attribute);
            }
        }
    }

    @Override
    public String asXML() {
        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xMLWriter = new XMLWriter(stringWriter, new OutputFormat());
            xMLWriter.write((Element) this);
            xMLWriter.flush();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(new StringBuffer().append("IOException while generating textual representation: ").append(e.getMessage()).toString());
        }
    }

    @Override
    public Attribute attribute(int i) {
        return (Attribute) attributeList().get(i);
    }

    public Attribute attribute(String str) {
        List listAttributeList = attributeList();
        int size = listAttributeList.size();
        for (int i = 0; i < size; i++) {
            Attribute attribute = (Attribute) listAttributeList.get(i);
            if (str.equals(attribute.getName())) {
                return attribute;
            }
        }
        return null;
    }

    public Attribute attribute(String str, Namespace namespace) {
        return attribute(getDocumentFactory().createQName(str, namespace));
    }

    public Attribute attribute(QName qName) {
        List listAttributeList = attributeList();
        int size = listAttributeList.size();
        for (int i = 0; i < size; i++) {
            Attribute attribute = (Attribute) listAttributeList.get(i);
            if (qName.equals(attribute.getQName())) {
                return attribute;
            }
        }
        return null;
    }

    @Override
    public int attributeCount() {
        return attributeList().size();
    }

    @Override
    public Iterator attributeIterator() {
        return attributeList().iterator();
    }

    protected abstract List attributeList();

    protected abstract List attributeList(int i);

    @Override
    public String attributeValue(String str) {
        Attribute attribute = attribute(str);
        if (attribute == null) {
            return null;
        }
        return attribute.getValue();
    }

    @Override
    public String attributeValue(String str, String str2) {
        String strAttributeValue = attributeValue(str);
        return strAttributeValue != null ? strAttributeValue : str2;
    }

    @Override
    public String attributeValue(QName qName) {
        Attribute attribute = attribute(qName);
        if (attribute == null) {
            return null;
        }
        return attribute.getValue();
    }

    @Override
    public String attributeValue(QName qName, String str) {
        String strAttributeValue = attributeValue(qName);
        return strAttributeValue != null ? strAttributeValue : str;
    }

    @Override
    public List attributes() {
        return new ContentListFacade(this, attributeList());
    }

    @Override
    protected void childAdded(Node node) {
        if (node != null) {
            node.setParent(this);
        }
    }

    @Override
    protected void childRemoved(Node node) {
        if (node != null) {
            node.setParent(null);
            node.setDocument(null);
        }
    }

    protected List createAttributeList() {
        return createAttributeList(5);
    }

    protected List createAttributeList(int i) {
        return new ArrayList(i);
    }

    @Override
    public Element createCopy() {
        Element elementCreateElement = createElement(getQName());
        elementCreateElement.appendAttributes(this);
        elementCreateElement.appendContent(this);
        return elementCreateElement;
    }

    @Override
    public Element createCopy(String str) {
        Element elementCreateElement = createElement(str);
        elementCreateElement.appendAttributes(this);
        elementCreateElement.appendContent(this);
        return elementCreateElement;
    }

    @Override
    public Element createCopy(QName qName) {
        Element elementCreateElement = createElement(qName);
        elementCreateElement.appendAttributes(this);
        elementCreateElement.appendContent(this);
        return elementCreateElement;
    }

    protected Element createElement(String str) {
        return getDocumentFactory().createElement(str);
    }

    protected Element createElement(QName qName) {
        return getDocumentFactory().createElement(qName);
    }

    protected Iterator createSingleIterator(Object obj) {
        return new SingleIterator(obj);
    }

    @Override
    public List declaredNamespaces() {
        BackedList backedListCreateResultList = createResultList();
        List listContentList = contentList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof Namespace) {
                backedListCreateResultList.addLocal(obj);
            }
        }
        return backedListCreateResultList;
    }

    @Override
    public Element element(String str) {
        List listContentList = contentList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof Element) {
                Element element = (Element) obj;
                if (str.equals(element.getName())) {
                    return element;
                }
            }
        }
        return null;
    }

    public Element element(String str, Namespace namespace) {
        return element(getDocumentFactory().createQName(str, namespace));
    }

    @Override
    public Element element(QName qName) {
        List listContentList = contentList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof Element) {
                Element element = (Element) obj;
                if (qName.equals(element.getQName())) {
                    return element;
                }
            }
        }
        return null;
    }

    @Override
    public Iterator elementIterator() {
        return elements().iterator();
    }

    @Override
    public Iterator elementIterator(String str) {
        return elements(str).iterator();
    }

    public Iterator elementIterator(String str, Namespace namespace) {
        return elementIterator(getDocumentFactory().createQName(str, namespace));
    }

    @Override
    public Iterator elementIterator(QName qName) {
        return elements(qName).iterator();
    }

    @Override
    public String elementText(String str) {
        Element element = element(str);
        if (element != null) {
            return element.getText();
        }
        return null;
    }

    @Override
    public String elementText(QName qName) {
        Element element = element(qName);
        if (element != null) {
            return element.getText();
        }
        return null;
    }

    @Override
    public String elementTextTrim(String str) {
        Element element = element(str);
        if (element != null) {
            return element.getTextTrim();
        }
        return null;
    }

    @Override
    public String elementTextTrim(QName qName) {
        Element element = element(qName);
        if (element != null) {
            return element.getTextTrim();
        }
        return null;
    }

    @Override
    public List elements() {
        List listContentList = contentList();
        BackedList backedListCreateResultList = createResultList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof Element) {
                backedListCreateResultList.addLocal(obj);
            }
        }
        return backedListCreateResultList;
    }

    @Override
    public List elements(String str) {
        List listContentList = contentList();
        BackedList backedListCreateResultList = createResultList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof Element) {
                Element element = (Element) obj;
                if (str.equals(element.getName())) {
                    backedListCreateResultList.addLocal(element);
                }
            }
        }
        return backedListCreateResultList;
    }

    public List elements(String str, Namespace namespace) {
        return elements(getDocumentFactory().createQName(str, namespace));
    }

    @Override
    public List elements(QName qName) {
        List listContentList = contentList();
        BackedList backedListCreateResultList = createResultList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof Element) {
                Element element = (Element) obj;
                if (qName.equals(element.getQName())) {
                    backedListCreateResultList.addLocal(element);
                }
            }
        }
        return backedListCreateResultList;
    }

    public void ensureAttributesCapacity(int i) {
        if (i > 1) {
            List listAttributeList = attributeList();
            if (listAttributeList instanceof ArrayList) {
                ((ArrayList) listAttributeList).ensureCapacity(i);
            }
        }
    }

    public Object getData() {
        return getText();
    }

    @Override
    protected DocumentFactory getDocumentFactory() {
        DocumentFactory documentFactory;
        QName qName = getQName();
        return (qName == null || (documentFactory = qName.getDocumentFactory()) == null) ? DOCUMENT_FACTORY : documentFactory;
    }

    @Override
    public String getName() {
        return getQName().getName();
    }

    @Override
    public Namespace getNamespace() {
        return getQName().getNamespace();
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
        List listContentList = contentList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof Namespace) {
                Namespace namespace = (Namespace) obj;
                if (str.equals(namespace.getPrefix())) {
                    return namespace;
                }
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
        List listContentList = contentList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof Namespace) {
                Namespace namespace = (Namespace) obj;
                if (str.equals(namespace.getURI())) {
                    return namespace;
                }
            }
        }
        return null;
    }

    @Override
    public String getNamespacePrefix() {
        return getQName().getNamespacePrefix();
    }

    public String getNamespaceURI() {
        return getQName().getNamespaceURI();
    }

    @Override
    public List getNamespacesForURI(String str) {
        BackedList backedListCreateResultList = createResultList();
        List listContentList = contentList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if ((obj instanceof Namespace) && ((Namespace) obj).getURI().equals(str)) {
                backedListCreateResultList.addLocal(obj);
            }
        }
        return backedListCreateResultList;
    }

    @Override
    public short getNodeType() {
        return (short) 1;
    }

    @Override
    public String getPath(Element element) {
        if (this == element) {
            return ".";
        }
        Element parent = getParent();
        if (parent == null) {
            return new StringBuffer().append("/").append(getXPathNameStep()).toString();
        }
        return parent == element ? getXPathNameStep() : new StringBuffer().append(parent.getPath(element)).append("/").append(getXPathNameStep()).toString();
    }

    @Override
    public QName getQName(String str) {
        String strSubstring = "";
        int iIndexOf = str.indexOf(Config.TRACE_TODAY_VISIT_SPLIT);
        if (iIndexOf > 0) {
            strSubstring = str.substring(0, iIndexOf);
            str = str.substring(iIndexOf + 1);
        }
        Namespace namespaceForPrefix = getNamespaceForPrefix(strSubstring);
        return namespaceForPrefix != null ? getDocumentFactory().createQName(str, namespaceForPrefix) : getDocumentFactory().createQName(str);
    }

    @Override
    public String getQualifiedName() {
        return getQName().getQualifiedName();
    }

    @Override
    public String getStringValue() {
        List listContentList = contentList();
        int size = listContentList.size();
        if (size <= 0) {
            return "";
        }
        if (size == 1) {
            return getContentAsStringValue(listContentList.get(0));
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; i++) {
            String contentAsStringValue = getContentAsStringValue(listContentList.get(i));
            if (contentAsStringValue.length() > 0) {
                stringBuffer.append(contentAsStringValue);
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public String getUniquePath(Element element) {
        int iIndexOf;
        Element parent = getParent();
        if (parent == null) {
            return new StringBuffer().append("/").append(getXPathNameStep()).toString();
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (parent != element) {
            stringBuffer.append(parent.getUniquePath(element));
            stringBuffer.append("/");
        }
        stringBuffer.append(getXPathNameStep());
        List listElements = parent.elements(getQName());
        if (listElements.size() > 1 && (iIndexOf = listElements.indexOf(this)) >= 0) {
            stringBuffer.append("[");
            stringBuffer.append(Integer.toString(iIndexOf + 1));
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }

    public String getXPathNameStep() {
        String namespaceURI = getNamespaceURI();
        if (namespaceURI == null || namespaceURI.length() == 0) {
            return getName();
        }
        String namespacePrefix = getNamespacePrefix();
        return (namespacePrefix == null || namespacePrefix.length() == 0) ? new StringBuffer().append("*[name()='").append(getName()).append("']").toString() : getQualifiedName();
    }

    @Override
    public Node getXPathResult(int i) {
        Node node = node(i);
        return (node == null || node.supportsParent()) ? node : node.asXPathResult(this);
    }

    @Override
    public boolean hasMixedContent() {
        List listContentList = contentList();
        if (listContentList == null || listContentList.isEmpty() || listContentList.size() < 2) {
            return false;
        }
        Class<?> cls = null;
        Iterator it = listContentList.iterator();
        while (it.hasNext()) {
            Class<?> cls2 = it.next().getClass();
            if (cls2 == cls) {
                cls2 = cls;
            } else if (cls != null) {
                return true;
            }
            cls = cls2;
        }
        return false;
    }

    @Override
    public int indexOf(Node node) {
        return contentList().indexOf(node);
    }

    @Override
    public boolean isRootElement() {
        Document document = getDocument();
        return document != null && document.getRootElement() == this;
    }

    @Override
    public boolean isTextOnly() {
        List listContentList = contentList();
        if (listContentList == null || listContentList.isEmpty()) {
            return true;
        }
        for (Object obj : listContentList) {
            if (!(obj instanceof CharacterData) && !(obj instanceof String)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Node node(int i) {
        if (i >= 0) {
            List listContentList = contentList();
            if (i >= listContentList.size()) {
                return null;
            }
            Object obj = listContentList.get(i);
            if (obj != null) {
                return obj instanceof Node ? (Node) obj : getDocumentFactory().createText(obj.toString());
            }
        }
        return null;
    }

    @Override
    public int nodeCount() {
        return contentList().size();
    }

    @Override
    public Iterator nodeIterator() {
        return contentList().iterator();
    }

    @Override
    public void normalize() {
        Text text;
        List listContentList = contentList();
        int i = 0;
        Text text2 = null;
        while (i < listContentList.size()) {
            Node node = (Node) listContentList.get(i);
            if (node instanceof Text) {
                text = (Text) node;
                if (text2 != null) {
                    text2.appendText(text.getText());
                    remove(text);
                    text = text2;
                } else {
                    String text3 = text.getText();
                    if (text3 == null || text3.length() <= 0) {
                        remove(text);
                        text = text2;
                    } else {
                        i++;
                    }
                }
            } else {
                if (node instanceof Element) {
                    ((Element) node).normalize();
                }
                i++;
                text = null;
            }
            text2 = text;
        }
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
                backedListCreateResultList.addLocal(obj);
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
                    backedListCreateResultList.addLocal(processingInstruction);
                }
            }
        }
        return backedListCreateResultList;
    }

    @Override
    public boolean remove(Attribute attribute) {
        List listAttributeList = attributeList();
        boolean zRemove = listAttributeList.remove(attribute);
        if (zRemove) {
            childRemoved(attribute);
            return zRemove;
        }
        Attribute attribute2 = attribute(attribute.getQName());
        if (attribute2 == null) {
            return zRemove;
        }
        listAttributeList.remove(attribute2);
        return true;
    }

    @Override
    public boolean remove(CDATA cdata) {
        return removeNode(cdata);
    }

    @Override
    public boolean remove(Comment comment) {
        return removeNode(comment);
    }

    @Override
    public boolean remove(Element element) {
        return removeNode(element);
    }

    @Override
    public boolean remove(Entity entity) {
        return removeNode(entity);
    }

    @Override
    public boolean remove(Namespace namespace) {
        return removeNode(namespace);
    }

    @Override
    public boolean remove(Node node) {
        switch (node.getNodeType()) {
            case 1:
                return remove((Element) node);
            case 2:
                return remove((Attribute) node);
            case 3:
                return remove((Text) node);
            case 4:
                return remove((CDATA) node);
            case 5:
                return remove((Entity) node);
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                return false;
            case 7:
                return remove((ProcessingInstruction) node);
            case 8:
                return remove((Comment) node);
            case 13:
                return remove((Namespace) node);
        }
    }

    @Override
    public boolean remove(ProcessingInstruction processingInstruction) {
        return removeNode(processingInstruction);
    }

    @Override
    public boolean remove(Text text) {
        return removeNode(text);
    }

    @Override
    protected boolean removeNode(Node node) {
        boolean zRemove = contentList().remove(node);
        if (zRemove) {
            childRemoved(node);
        }
        return zRemove;
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
    public void setAttributeValue(String str, String str2) {
        addAttribute(str, str2);
    }

    @Override
    public void setAttributeValue(QName qName, String str) {
        addAttribute(qName, str);
    }

    public void setAttributes(Attributes attributes, NamespaceStack namespaceStack, boolean z) {
        int length = attributes.getLength();
        if (length > 0) {
            DocumentFactory documentFactory = getDocumentFactory();
            if (length == 1) {
                String qName = attributes.getQName(0);
                if (z || !qName.startsWith("xmlns")) {
                    String uri = attributes.getURI(0);
                    String localName = attributes.getLocalName(0);
                    mo8859add(documentFactory.createAttribute(this, namespaceStack.getAttributeQName(uri, localName, qName), attributes.getValue(0)));
                    return;
                }
                return;
            }
            List listAttributeList = attributeList(length);
            listAttributeList.clear();
            for (int i = 0; i < length; i++) {
                String qName2 = attributes.getQName(i);
                if (z || !qName2.startsWith("xmlns")) {
                    String uri2 = attributes.getURI(i);
                    String localName2 = attributes.getLocalName(i);
                    Attribute attributeCreateAttribute = documentFactory.createAttribute(this, namespaceStack.getAttributeQName(uri2, localName2, qName2), attributes.getValue(i));
                    listAttributeList.add(attributeCreateAttribute);
                    childAdded(attributeCreateAttribute);
                }
            }
        }
    }

    public void setData(Object obj) {
    }

    @Override
    public void setName(String str) {
        setQName(getDocumentFactory().createQName(str));
    }

    public void setNamespace(Namespace namespace) {
        setQName(getDocumentFactory().createQName(getName(), namespace));
    }

    @Override
    public void setText(String str) {
        List listContentList = contentList();
        if (listContentList != null) {
            Iterator it = listContentList.iterator();
            while (it.hasNext()) {
                switch (((Node) it.next()).getNodeType()) {
                    case 3:
                    case 4:
                    case 5:
                        it.remove();
                        break;
                }
            }
        }
        addText(str);
    }

    public String toString() {
        String namespaceURI = getNamespaceURI();
        return (namespaceURI == null || namespaceURI.length() <= 0) ? new StringBuffer().append(super.toString()).append(" [Element: <").append(getQualifiedName()).append(" attributes: ").append(attributeList()).append("/>]").toString() : new StringBuffer().append(super.toString()).append(" [Element: <").append(getQualifiedName()).append(" uri: ").append(namespaceURI).append(" attributes: ").append(attributeList()).append("/>]").toString();
    }

    @Override
    public void write(Writer writer) throws IOException {
        new XMLWriter(writer, new OutputFormat()).write((Element) this);
    }
}
