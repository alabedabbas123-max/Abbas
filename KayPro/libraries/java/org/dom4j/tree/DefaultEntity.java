package org.dom4j.tree;

import org.dom4j.Element;

public class DefaultEntity extends FlyweightEntity {
    private Element parent;

    public DefaultEntity(String str) {
        super(str);
    }

    public DefaultEntity(String str, String str2) {
        super(str, str2);
    }

    public DefaultEntity(Element element, String str, String str2) {
        super(str, str2);
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
    public void setName(String str) {
        this.name = str;
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
