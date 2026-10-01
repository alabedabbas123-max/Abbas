package org.dom4j.tree;

import org.dom4j.Element;
import org.dom4j.Namespace;

public class DefaultNamespace extends Namespace {
    private Element parent;

    public DefaultNamespace(String str, String str2) {
        super(str, str2);
    }

    public DefaultNamespace(Element element, String str, String str2) {
        super(str, str2);
        this.parent = element;
    }

    @Override
    protected int createHashCode() {
        int iCreateHashCode = super.createHashCode();
        return this.parent != null ? iCreateHashCode ^ this.parent.hashCode() : iCreateHashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof DefaultNamespace) && ((DefaultNamespace) obj).parent == this.parent) {
            return super.equals(obj);
        }
        return false;
    }

    @Override
    public Element getParent() {
        return this.parent;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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
    public boolean supportsParent() {
        return true;
    }
}
