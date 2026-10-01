package org.dom4j.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.dom4j.Branch;
import org.dom4j.Comment;
import org.dom4j.Element;
import org.dom4j.IllegalAddException;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;

public abstract class AbstractBranch extends AbstractNode implements Branch {
    protected static final int DEFAULT_CONTENT_LIST_SIZE = 5;

    @Override
    public void mo8855add(Comment comment) {
        addNode(comment);
    }

    @Override
    public void mo8856add(Element element) {
        addNode(element);
    }

    @Override
    public void mo8857add(Node node) {
        switch (node.getNodeType()) {
            case 1:
                mo8856add((Element) node);
                break;
            case 7:
                mo8858add((ProcessingInstruction) node);
                break;
            case 8:
                mo8855add((Comment) node);
                break;
            default:
                invalidNodeTypeAddException(node);
                break;
        }
    }

    @Override
    public void mo8858add(ProcessingInstruction processingInstruction) {
        addNode(processingInstruction);
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

    public Element addElement(String str, String str2, String str3) {
        return addElement(getDocumentFactory().createQName(str, Namespace.m8865get(str2, str3)));
    }

    @Override
    public Element addElement(QName qName) {
        Element elementCreateElement = getDocumentFactory().createElement(qName);
        mo8856add(elementCreateElement);
        return elementCreateElement;
    }

    protected abstract void addNode(int i, Node node);

    protected abstract void addNode(Node node);

    @Override
    public void appendContent(Branch branch) {
        int iNodeCount = branch.nodeCount();
        for (int i = 0; i < iNodeCount; i++) {
            mo8857add((Node) branch.node(i).clone());
        }
    }

    protected abstract void childAdded(Node node);

    protected abstract void childRemoved(Node node);

    @Override
    public List content() {
        return new ContentListFacade(this, contentList());
    }

    protected abstract List contentList();

    protected void contentRemoved() {
        List listContentList = contentList();
        int size = listContentList.size();
        for (int i = 0; i < size; i++) {
            Object obj = listContentList.get(i);
            if (obj instanceof Node) {
                childRemoved((Node) obj);
            }
        }
    }

    protected List createContentList() {
        return new ArrayList(5);
    }

    protected List createContentList(int i) {
        return new ArrayList(i);
    }

    protected List createEmptyList() {
        return new BackedList(this, contentList(), 0);
    }

    protected BackedList createResultList() {
        return new BackedList(this, contentList());
    }

    protected List createSingleResultList(Object obj) {
        BackedList backedList = new BackedList(this, contentList(), 1);
        backedList.addLocal(obj);
        return backedList;
    }

    @Override
    public Element elementByID(String str) {
        int iNodeCount = nodeCount();
        for (int i = 0; i < iNodeCount; i++) {
            Node node = node(i);
            if (node instanceof Element) {
                Element element = (Element) node;
                String strElementID = elementID(element);
                if (strElementID != null && strElementID.equals(str)) {
                    return element;
                }
                Element elementElementByID = element.elementByID(str);
                if (elementElementByID != null) {
                    return elementElementByID;
                }
            }
        }
        return null;
    }

    protected String elementID(Element element) {
        return element.attributeValue("ID");
    }

    protected String getContentAsStringValue(Object obj) {
        if (obj instanceof Node) {
            Node node = (Node) obj;
            switch (node.getNodeType()) {
                case 1:
                case 3:
                case 4:
                case 5:
                    return node.getStringValue();
            }
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return "";
    }

    protected String getContentAsText(Object obj) {
        if (obj instanceof Node) {
            Node node = (Node) obj;
            switch (node.getNodeType()) {
                case 3:
                case 4:
                case 5:
                    return node.getText();
            }
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return "";
    }

    @Override
    public String getText() {
        int size;
        List listContentList = contentList();
        if (listContentList == null || (size = listContentList.size()) < 1) {
            return "";
        }
        String contentAsText = getContentAsText(listContentList.get(0));
        if (size == 1) {
            return contentAsText;
        }
        StringBuffer stringBuffer = new StringBuffer(contentAsText);
        for (int i = 1; i < size; i++) {
            stringBuffer.append(getContentAsText(listContentList.get(i)));
        }
        return stringBuffer.toString();
    }

    public String getTextTrim() {
        String text = getText();
        StringBuffer stringBuffer = new StringBuffer();
        StringTokenizer stringTokenizer = new StringTokenizer(text);
        while (stringTokenizer.hasMoreTokens()) {
            stringBuffer.append(stringTokenizer.nextToken());
            if (stringTokenizer.hasMoreTokens()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public boolean hasContent() {
        return nodeCount() > 0;
    }

    @Override
    public int indexOf(Node node) {
        return contentList().indexOf(node);
    }

    protected void invalidNodeTypeAddException(Node node) {
        throw new IllegalAddException(new StringBuffer().append("Invalid node type. Cannot add node: ").append(node).append(" to this branch: ").append(this).toString());
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }

    @Override
    public Node node(int i) {
        Object obj = contentList().get(i);
        if (obj instanceof Node) {
            return (Node) obj;
        }
        if (obj instanceof String) {
            return getDocumentFactory().createText(obj.toString());
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
    public boolean remove(Comment comment) {
        return removeNode(comment);
    }

    @Override
    public boolean remove(Element element) {
        return removeNode(element);
    }

    @Override
    public boolean remove(Node node) {
        switch (node.getNodeType()) {
            case 1:
                return remove((Element) node);
            case 7:
                return remove((ProcessingInstruction) node);
            case 8:
                return remove((Comment) node);
            default:
                invalidNodeTypeAddException(node);
                return false;
        }
    }

    @Override
    public boolean remove(ProcessingInstruction processingInstruction) {
        return removeNode(processingInstruction);
    }

    protected abstract boolean removeNode(Node node);

    @Override
    public void setProcessingInstructions(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            addNode((ProcessingInstruction) it.next());
        }
    }
}
