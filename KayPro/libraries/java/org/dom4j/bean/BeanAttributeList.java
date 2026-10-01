package org.dom4j.bean;

import java.util.AbstractList;
import org.dom4j.Attribute;
import org.dom4j.QName;

public class BeanAttributeList extends AbstractList {
    private BeanAttribute[] attributes;
    private BeanMetaData beanMetaData;
    private BeanElement parent;

    public BeanAttributeList(BeanElement beanElement) {
        this.parent = beanElement;
        Object data = beanElement.getData();
        this.beanMetaData = BeanMetaData.m8871get(data != null ? data.getClass() : null);
        this.attributes = new BeanAttribute[this.beanMetaData.attributeCount()];
    }

    public BeanAttributeList(BeanElement beanElement, BeanMetaData beanMetaData) {
        this.parent = beanElement;
        this.beanMetaData = beanMetaData;
        this.attributes = new BeanAttribute[beanMetaData.attributeCount()];
    }

    @Override
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("add(int,Object) unsupported");
    }

    @Override
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("add(Object) unsupported");
    }

    public Attribute attribute(String str) {
        return attribute(this.beanMetaData.getIndex(str));
    }

    public Attribute attribute(QName qName) {
        return attribute(this.beanMetaData.getIndex(qName));
    }

    public BeanAttribute attribute(int i) {
        if (i < 0 || i > this.attributes.length) {
            return null;
        }
        BeanAttribute beanAttribute = this.attributes[i];
        if (beanAttribute != null) {
            return beanAttribute;
        }
        BeanAttribute beanAttributeCreateAttribute = createAttribute(this.parent, i);
        this.attributes[i] = beanAttributeCreateAttribute;
        return beanAttributeCreateAttribute;
    }

    @Override
    public void clear() {
        int length = this.attributes.length;
        for (int i = 0; i < length; i++) {
            BeanAttribute beanAttribute = this.attributes[i];
            if (beanAttribute != null) {
                beanAttribute.setValue(null);
            }
        }
    }

    protected BeanAttribute createAttribute(BeanElement beanElement, int i) {
        return new BeanAttribute(this, i);
    }

    @Override
    public Object get(int i) {
        BeanAttribute beanAttribute = this.attributes[i];
        if (beanAttribute != null) {
            return beanAttribute;
        }
        BeanAttribute beanAttributeCreateAttribute = createAttribute(this.parent, i);
        this.attributes[i] = beanAttributeCreateAttribute;
        return beanAttributeCreateAttribute;
    }

    public Object getData(int i) {
        return this.beanMetaData.getData(i, this.parent.getData());
    }

    public BeanElement getParent() {
        return this.parent;
    }

    public QName getQName(int i) {
        return this.beanMetaData.getQName(i);
    }

    @Override
    public Object remove(int i) {
        BeanAttribute beanAttribute = (BeanAttribute) get(i);
        String value = beanAttribute.getValue();
        beanAttribute.setValue(null);
        return value;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("set(int,Object) unsupported");
    }

    public void setData(int i, Object obj) {
        this.beanMetaData.setData(i, this.parent.getData(), obj);
    }

    @Override
    public int size() {
        return this.attributes.length;
    }
}
