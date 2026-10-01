package org.dom4j.bean;

import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.tree.DefaultElement;
import org.dom4j.tree.NamespaceStack;
import org.xml.sax.Attributes;

public class BeanElement extends DefaultElement {
    private static final DocumentFactory DOCUMENT_FACTORY = BeanDocumentFactory.getInstance();
    static Class class$org$dom4j$bean$BeanElement;
    private Object bean;

    public BeanElement(String str, Object obj) {
        this(DOCUMENT_FACTORY.createQName(str), obj);
    }

    public BeanElement(String str, Namespace namespace, Object obj) {
        this(DOCUMENT_FACTORY.createQName(str, namespace), obj);
    }

    public BeanElement(QName qName) {
        super(qName);
    }

    public BeanElement(QName qName, Object obj) {
        super(qName);
        this.bean = obj;
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    @Override
    public Element addAttribute(String str, String str2) {
        Attribute attribute = attribute(str);
        if (attribute != null) {
            attribute.setValue(str2);
        }
        return this;
    }

    @Override
    public Element addAttribute(QName qName, String str) {
        Attribute attribute = attribute(qName);
        if (attribute != null) {
            attribute.setValue(str);
        }
        return this;
    }

    @Override
    public Attribute attribute(String str) {
        return getBeanAttributeList().attribute(str);
    }

    @Override
    public Attribute attribute(QName qName) {
        return getBeanAttributeList().attribute(qName);
    }

    @Override
    protected List createAttributeList() {
        return new BeanAttributeList(this);
    }

    @Override
    protected List createAttributeList(int i) {
        return new BeanAttributeList(this);
    }

    protected BeanAttributeList getBeanAttributeList() {
        return (BeanAttributeList) attributeList();
    }

    @Override
    public Object getData() {
        return this.bean;
    }

    @Override
    protected DocumentFactory getDocumentFactory() {
        return DOCUMENT_FACTORY;
    }

    @Override
    public void setAttributes(List list) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void setAttributes(Attributes attributes, NamespaceStack namespaceStack, boolean z) {
        Class clsClass$;
        String value = attributes.getValue(SvgConstants.ATTR_CLASS);
        if (value == null) {
            super.setAttributes(attributes, namespaceStack, z);
            return;
        }
        try {
            if (class$org$dom4j$bean$BeanElement == null) {
                clsClass$ = class$("org.dom4j.bean.BeanElement");
                class$org$dom4j$bean$BeanElement = clsClass$;
            } else {
                clsClass$ = class$org$dom4j$bean$BeanElement;
            }
            setData(Class.forName(value, true, clsClass$.getClassLoader()).newInstance());
            for (int i = 0; i < attributes.getLength(); i++) {
                String localName = attributes.getLocalName(i);
                if (!SvgConstants.ATTR_CLASS.equalsIgnoreCase(localName)) {
                    addAttribute(localName, attributes.getValue(i));
                }
            }
        } catch (Exception e) {
            ((BeanDocumentFactory) getDocumentFactory()).handleException(e);
        }
    }

    @Override
    public void setData(Object obj) {
        this.bean = obj;
        setAttributeList(null);
    }
}
