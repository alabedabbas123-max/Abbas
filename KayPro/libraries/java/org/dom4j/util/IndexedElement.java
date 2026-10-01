package org.dom4j.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.QName;
import org.dom4j.tree.BackedList;
import org.dom4j.tree.DefaultElement;

public class IndexedElement extends DefaultElement {
    private Map attributeIndex;
    private Map elementIndex;

    public IndexedElement(String str) {
        super(str);
    }

    public IndexedElement(QName qName) {
        super(qName);
    }

    public IndexedElement(QName qName, int i) {
        super(qName, i);
    }

    @Override
    protected void addNode(Node node) {
        super.addNode(node);
        if (this.elementIndex != null && (node instanceof Element)) {
            addToElementIndex((Element) node);
        } else {
            if (this.attributeIndex == null || !(node instanceof Attribute)) {
                return;
            }
            addToAttributeIndex((Attribute) node);
        }
    }

    protected void addToAttributeIndex(Object obj, Attribute attribute) {
        if (this.attributeIndex.get(obj) != null) {
            this.attributeIndex.put(obj, attribute);
        }
    }

    protected void addToAttributeIndex(Attribute attribute) {
        QName qName = attribute.getQName();
        String name = qName.getName();
        addToAttributeIndex(qName, attribute);
        addToAttributeIndex(name, attribute);
    }

    protected void addToElementIndex(Object obj, Element element) {
        Object obj2 = this.elementIndex.get(obj);
        if (obj2 == null) {
            this.elementIndex.put(obj, element);
            return;
        }
        if (obj2 instanceof List) {
            ((List) obj2).add(element);
            return;
        }
        List listCreateList = createList();
        listCreateList.add(obj2);
        listCreateList.add(element);
        this.elementIndex.put(obj, listCreateList);
    }

    protected void addToElementIndex(Element element) {
        QName qName = element.getQName();
        String name = qName.getName();
        addToElementIndex(qName, element);
        addToElementIndex(name, element);
    }

    protected Element asElement(Object obj) {
        if (obj instanceof Element) {
            return (Element) obj;
        }
        if (obj != null) {
            List list = (List) obj;
            if (list.size() >= 1) {
                return (Element) list.get(0);
            }
        }
        return null;
    }

    protected Iterator asElementIterator(Object obj) {
        return asElementList(obj).iterator();
    }

    protected List asElementList(Object obj) {
        if (obj instanceof Element) {
            return createSingleResultList(obj);
        }
        if (obj == null) {
            return createEmptyList();
        }
        List list = (List) obj;
        BackedList backedListCreateResultList = createResultList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            backedListCreateResultList.addLocal(list.get(i));
        }
        return backedListCreateResultList;
    }

    @Override
    public Attribute attribute(String str) {
        return (Attribute) attributeIndex().get(str);
    }

    @Override
    public Attribute attribute(QName qName) {
        return (Attribute) attributeIndex().get(qName);
    }

    protected Map attributeIndex() {
        if (this.attributeIndex == null) {
            this.attributeIndex = createAttributeIndex();
            Iterator itAttributeIterator = attributeIterator();
            while (itAttributeIterator.hasNext()) {
                addToAttributeIndex((Attribute) itAttributeIterator.next());
            }
        }
        return this.attributeIndex;
    }

    protected Map createAttributeIndex() {
        return createIndex();
    }

    protected Map createElementIndex() {
        return createIndex();
    }

    protected Map createIndex() {
        return new HashMap();
    }

    protected List createList() {
        return new ArrayList();
    }

    @Override
    public Element element(String str) {
        return asElement(elementIndex().get(str));
    }

    @Override
    public Element element(QName qName) {
        return asElement(elementIndex().get(qName));
    }

    protected Map elementIndex() {
        if (this.elementIndex == null) {
            this.elementIndex = createElementIndex();
            Iterator itElementIterator = elementIterator();
            while (itElementIterator.hasNext()) {
                addToElementIndex((Element) itElementIterator.next());
            }
        }
        return this.elementIndex;
    }

    @Override
    public List elements(String str) {
        return asElementList(elementIndex().get(str));
    }

    @Override
    public List elements(QName qName) {
        return asElementList(elementIndex().get(qName));
    }

    protected void removeFromAttributeIndex(Object obj, Attribute attribute) {
        Object obj2 = this.attributeIndex.get(obj);
        if (obj2 == null || !obj2.equals(attribute)) {
            return;
        }
        this.attributeIndex.remove(obj);
    }

    protected void removeFromAttributeIndex(Attribute attribute) {
        QName qName = attribute.getQName();
        String name = qName.getName();
        removeFromAttributeIndex(qName, attribute);
        removeFromAttributeIndex(name, attribute);
    }

    protected void removeFromElementIndex(Object obj, Element element) {
        Object obj2 = this.elementIndex.get(obj);
        if (obj2 instanceof List) {
            ((List) obj2).remove(element);
        } else {
            this.elementIndex.remove(obj);
        }
    }

    protected void removeFromElementIndex(Element element) {
        QName qName = element.getQName();
        String name = qName.getName();
        removeFromElementIndex(qName, element);
        removeFromElementIndex(name, element);
    }

    @Override
    protected boolean removeNode(Node node) {
        if (!super.removeNode(node)) {
            return false;
        }
        if (this.elementIndex != null && (node instanceof Element)) {
            removeFromElementIndex((Element) node);
        } else if (this.attributeIndex != null && (node instanceof Attribute)) {
            removeFromAttributeIndex((Attribute) node);
        }
        return true;
    }
}
