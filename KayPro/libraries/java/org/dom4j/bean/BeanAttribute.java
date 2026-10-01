package org.dom4j.bean;

import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.tree.AbstractAttribute;

public class BeanAttribute extends AbstractAttribute {
    private final BeanAttributeList beanList;
    private final int index;

    public BeanAttribute(BeanAttributeList beanAttributeList, int i) {
        this.beanList = beanAttributeList;
        this.index = i;
    }

    @Override
    public Object getData() {
        return this.beanList.getData(this.index);
    }

    @Override
    public Element getParent() {
        return this.beanList.getParent();
    }

    @Override
    public QName getQName() {
        return this.beanList.getQName(this.index);
    }

    @Override
    public String getValue() {
        Object data = getData();
        if (data != null) {
            return data.toString();
        }
        return null;
    }

    @Override
    public void setData(Object obj) {
        this.beanList.setData(this.index, obj);
    }

    @Override
    public void setValue(String str) {
        this.beanList.setData(this.index, str);
    }
}
