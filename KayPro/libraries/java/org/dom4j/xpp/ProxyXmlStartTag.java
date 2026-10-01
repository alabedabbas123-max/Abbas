package org.dom4j.xpp;

import java.util.ArrayList;
import java.util.Iterator;
import org.dom4j.Attribute;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.tree.AbstractElement;
import org.gjt.xpp.XmlPullParserException;
import org.gjt.xpp.XmlStartTag;

public class ProxyXmlStartTag implements XmlStartTag {
    private Element element;
    private DocumentFactory factory = DocumentFactory.getInstance();

    public ProxyXmlStartTag() {
    }

    public ProxyXmlStartTag(Element element) {
        this.element = element;
    }

    public void addAttribute(String str, String str2, String str3, String str4) throws XmlPullParserException {
        this.element.addAttribute(QName.m8867get(str3, str), str4);
    }

    public void addAttribute(String str, String str2, String str3, String str4, boolean z) throws XmlPullParserException {
        if (!z) {
            this.element.addAttribute(QName.m8867get(str3, str), str4);
        } else {
            int iIndexOf = str3.indexOf(58);
            this.element.addNamespace(iIndexOf > 0 ? str3.substring(0, iIndexOf) : "", str);
        }
    }

    public void ensureAttributesCapacity(int i) throws XmlPullParserException {
        if (this.element instanceof AbstractElement) {
            ((AbstractElement) this.element).ensureAttributesCapacity(i);
        }
    }

    public int getAttributeCount() {
        if (this.element != null) {
            return this.element.attributeCount();
        }
        return 0;
    }

    public String getAttributeLocalName(int i) {
        Attribute attribute;
        if (this.element == null || (attribute = this.element.attribute(i)) == null) {
            return null;
        }
        return attribute.getName();
    }

    public String getAttributeNamespaceUri(int i) {
        Attribute attribute;
        if (this.element == null || (attribute = this.element.attribute(i)) == null) {
            return null;
        }
        return attribute.getNamespaceURI();
    }

    public String getAttributePrefix(int i) {
        Attribute attribute;
        String namespacePrefix;
        if (this.element == null || (attribute = this.element.attribute(i)) == null || (namespacePrefix = attribute.getNamespacePrefix()) == null || namespacePrefix.length() <= 0) {
            return null;
        }
        return namespacePrefix;
    }

    public String getAttributeRawName(int i) {
        Attribute attribute;
        if (this.element == null || (attribute = this.element.attribute(i)) == null) {
            return null;
        }
        return attribute.getQualifiedName();
    }

    public String getAttributeValue(int i) {
        Attribute attribute;
        if (this.element == null || (attribute = this.element.attribute(i)) == null) {
            return null;
        }
        return attribute.getValue();
    }

    public String getAttributeValueFromName(String str, String str2) {
        if (this.element != null) {
            Iterator itAttributeIterator = this.element.attributeIterator();
            while (itAttributeIterator.hasNext()) {
                Attribute attribute = (Attribute) itAttributeIterator.next();
                if (str.equals(attribute.getNamespaceURI()) && str2.equals(attribute.getName())) {
                    return attribute.getValue();
                }
            }
        }
        return null;
    }

    public String getAttributeValueFromRawName(String str) {
        if (this.element != null) {
            Iterator itAttributeIterator = this.element.attributeIterator();
            while (itAttributeIterator.hasNext()) {
                Attribute attribute = (Attribute) itAttributeIterator.next();
                if (str.equals(attribute.getQualifiedName())) {
                    return attribute.getValue();
                }
            }
        }
        return null;
    }

    public DocumentFactory getDocumentFactory() {
        return this.factory;
    }

    public Element getElement() {
        return this.element;
    }

    public String getLocalName() {
        return this.element.getName();
    }

    public String getNamespaceUri() {
        return this.element.getNamespaceURI();
    }

    public String getPrefix() {
        return this.element.getNamespacePrefix();
    }

    public String getRawName() {
        return this.element.getQualifiedName();
    }

    public boolean isAttributeNamespaceDeclaration(int i) {
        Attribute attribute;
        if (this.element == null || (attribute = this.element.attribute(i)) == null) {
            return false;
        }
        return "xmlns".equals(attribute.getNamespacePrefix());
    }

    public void modifyTag(String str, String str2, String str3) {
        this.element = this.factory.createElement(str3, str);
    }

    public boolean removeAttributeByName(String str, String str2) throws XmlPullParserException {
        if (this.element == null) {
            return false;
        }
        return this.element.remove(this.element.attribute(QName.m8867get(str2, str)));
    }

    public boolean removeAttributeByRawName(String str) throws XmlPullParserException {
        Attribute attribute;
        if (this.element == null) {
            return false;
        }
        Iterator itAttributeIterator = this.element.attributeIterator();
        while (itAttributeIterator.hasNext()) {
            attribute = (Attribute) itAttributeIterator.next();
            if (attribute.getQualifiedName().equals(str)) {
                return this.element.remove(attribute);
            }
        }
        attribute = null;
        return this.element.remove(attribute);
    }

    public void removeAttributes() throws XmlPullParserException {
        if (this.element != null) {
            this.element.setAttributes(new ArrayList());
        }
    }

    public void removeAtttributes() throws XmlPullParserException {
        removeAttributes();
    }

    public void resetStartTag() {
        this.element = null;
    }

    public void resetTag() {
        this.element = null;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.factory = documentFactory;
    }
}
