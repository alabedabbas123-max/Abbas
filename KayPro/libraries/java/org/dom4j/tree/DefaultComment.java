package org.dom4j.tree;

import org.dom4j.Element;

public class DefaultComment extends FlyweightComment {
    private Element parent;

    public DefaultComment(String str) {
        super(str);
    }

    public DefaultComment(Element element, String str) {
        super(str);
        this.parent = element;
    }

    @Override
    public Element getParent() {
        return this.parent;
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }

    @Override
    public void setParent(Element element) {
        this.parent = element;
    }

    @Override
    public void setText(String str) {
        this.text = str;
    }

    @Override
    public boolean supportsParent() {
        return true;
    }
}
