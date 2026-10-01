package org.dom4j.datatype;

import com.sun.msv.datatype.DatabindableDatatype;
import com.sun.msv.datatype.SerializationContext;
import com.sun.msv.datatype.xsd.XSDatatype;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.tree.AbstractAttribute;
import org.relaxng.datatype.DatatypeException;
import org.relaxng.datatype.ValidationContext;

public class DatatypeAttribute extends AbstractAttribute implements SerializationContext, ValidationContext {
    private Object data;
    private XSDatatype datatype;
    private Element parent;
    private QName qname;
    private String text;

    public DatatypeAttribute(QName qName, XSDatatype xSDatatype) {
        this.qname = qName;
        this.datatype = xSDatatype;
    }

    public DatatypeAttribute(QName qName, XSDatatype xSDatatype, String str) {
        this.qname = qName;
        this.datatype = xSDatatype;
        this.text = str;
        this.data = convertToValue(str);
    }

    protected Object convertToValue(String str) {
        return this.datatype instanceof DatabindableDatatype ? this.datatype.createJavaObject(str, this) : this.datatype.createValue(str, this);
    }

    public String getBaseUri() {
        return null;
    }

    @Override
    public Object getData() {
        return this.data;
    }

    public String getNamespacePrefix(String str) {
        Namespace namespaceForURI;
        Element parent = getParent();
        if (parent == null || (namespaceForURI = parent.getNamespaceForURI(str)) == null) {
            return null;
        }
        return namespaceForURI.getPrefix();
    }

    @Override
    public Element getParent() {
        return this.parent;
    }

    @Override
    public QName getQName() {
        return this.qname;
    }

    @Override
    public String getValue() {
        return this.text;
    }

    public XSDatatype getXSDatatype() {
        return this.datatype;
    }

    public boolean isNotation(String str) {
        return false;
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }

    public boolean isUnparsedEntity(String str) {
        return true;
    }

    public String resolveNamespacePrefix(String str) {
        Namespace namespaceForPrefix;
        if (str.equals(getNamespacePrefix())) {
            return getNamespaceURI();
        }
        Element parent = getParent();
        if (parent == null || (namespaceForPrefix = parent.getNamespaceForPrefix(str)) == null) {
            return null;
        }
        return namespaceForPrefix.getURI();
    }

    @Override
    public void setData(Object obj) {
        String strConvertToLexicalValue = this.datatype.convertToLexicalValue(obj, this);
        validate(strConvertToLexicalValue);
        this.text = strConvertToLexicalValue;
        this.data = obj;
    }

    @Override
    public void setParent(Element element) {
        this.parent = element;
    }

    @Override
    public void setValue(String str) {
        validate(str);
        this.text = str;
        this.data = convertToValue(str);
    }

    @Override
    public boolean supportsParent() {
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer().append(getClass().getName()).append(hashCode()).append(" [Attribute: name ").append(getQualifiedName()).append(" value \"").append(getValue()).append("\" data: ").append(getData()).append("]").toString();
    }

    protected void validate(String str) throws IllegalArgumentException {
        try {
            this.datatype.checkValid(str, this);
        } catch (DatatypeException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
