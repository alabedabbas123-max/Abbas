package org.dom4j;

import org.dom4j.tree.AbstractNode;
import org.dom4j.tree.DefaultNamespace;
import org.dom4j.tree.NamespaceCache;

public class Namespace extends AbstractNode {
    private int hashCode;
    private String prefix;

    private String f6424uri;
    protected static final NamespaceCache CACHE = new NamespaceCache();
    public static final Namespace XML_NAMESPACE = CACHE.m8882get("xml", "http://www.w3.org/XML/1998/namespace");
    public static final Namespace NO_NAMESPACE = CACHE.m8882get("", "");

    public Namespace(String str, String str2) {
        this.prefix = str == null ? "" : str;
        this.f6424uri = str2 == null ? "" : str2;
    }

    public static Namespace m8864get(String str) {
        return CACHE.m8881get(str);
    }

    public static Namespace m8865get(String str, String str2) {
        return CACHE.m8882get(str, str2);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String asXML() {
        StringBuffer stringBuffer = new StringBuffer(10);
        String prefix = getPrefix();
        if (prefix == null || prefix.length() <= 0) {
            stringBuffer.append("xmlns=\"");
        } else {
            stringBuffer.append("xmlns:");
            stringBuffer.append(prefix);
            stringBuffer.append("=\"");
        }
        stringBuffer.append(getURI());
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    protected int createHashCode() {
        int iHashCode = this.f6424uri.hashCode() ^ this.prefix.hashCode();
        if (iHashCode == 0) {
            return 47806;
        }
        return iHashCode;
    }

    @Override
    protected Node createXPathResult(Element element) {
        return new DefaultNamespace(element, getPrefix(), getURI());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Namespace) {
            Namespace namespace = (Namespace) obj;
            if (hashCode() == namespace.hashCode()) {
                return this.f6424uri.equals(namespace.getURI()) && this.prefix.equals(namespace.getPrefix());
            }
        }
        return false;
    }

    @Override
    public short getNodeType() {
        return (short) 13;
    }

    @Override
    public String getPath(Element element) {
        StringBuffer stringBuffer = new StringBuffer(10);
        Element parent = getParent();
        if (parent != null && parent != element) {
            stringBuffer.append(parent.getPath(element));
            stringBuffer.append('/');
        }
        stringBuffer.append(getXPathNameStep());
        return stringBuffer.toString();
    }

    public String getPrefix() {
        return this.prefix;
    }

    @Override
    public String getStringValue() {
        return this.f6424uri;
    }

    @Override
    public String getText() {
        return this.f6424uri;
    }

    public String getURI() {
        return this.f6424uri;
    }

    @Override
    public String getUniquePath(Element element) {
        StringBuffer stringBuffer = new StringBuffer(10);
        Element parent = getParent();
        if (parent != null && parent != element) {
            stringBuffer.append(parent.getUniquePath(element));
            stringBuffer.append('/');
        }
        stringBuffer.append(getXPathNameStep());
        return stringBuffer.toString();
    }

    public String getXPathNameStep() {
        return (this.prefix == null || "".equals(this.prefix)) ? "namespace::*[name()='']" : new StringBuffer().append("namespace::").append(this.prefix).toString();
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = createHashCode();
        }
        return this.hashCode;
    }

    public String toString() {
        return new StringBuffer().append(super.toString()).append(" [Namespace: prefix ").append(getPrefix()).append(" mapped to URI \"").append(getURI()).append("\"]").toString();
    }
}
