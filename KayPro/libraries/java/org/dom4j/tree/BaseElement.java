package org.dom4j.tree;

import java.util.List;
import org.dom4j.Branch;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;

public class BaseElement extends AbstractElement {
    protected List attributes;
    protected List content;
    private Branch parentBranch;
    private QName qname;

    public BaseElement(String str) {
        this.qname = getDocumentFactory().createQName(str);
    }

    public BaseElement(String str, Namespace namespace) {
        this.qname = getDocumentFactory().createQName(str, namespace);
    }

    public BaseElement(QName qName) {
        this.qname = qName;
    }

    @Override
    protected List attributeList() {
        if (this.attributes == null) {
            this.attributes = createAttributeList();
        }
        return this.attributes;
    }

    @Override
    protected List attributeList(int i) {
        if (this.attributes == null) {
            this.attributes = createAttributeList(i);
        }
        return this.attributes;
    }

    @Override
    public void clearContent() {
        contentList().clear();
    }

    @Override
    protected List contentList() {
        if (this.content == null) {
            this.content = createContentList();
        }
        return this.content;
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

    protected void setAttributeList(List list) {
        this.attributes = list;
    }

    @Override
    public void setAttributes(List list) {
        this.attributes = list;
        if (list instanceof ContentListFacade) {
            this.attributes = ((ContentListFacade) list).getBackingList();
        }
    }

    @Override
    public void setContent(List list) {
        this.content = list;
        if (list instanceof ContentListFacade) {
            this.content = ((ContentListFacade) list).getBackingList();
        }
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
