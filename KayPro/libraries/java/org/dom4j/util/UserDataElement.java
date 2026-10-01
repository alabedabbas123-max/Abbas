package org.dom4j.util;

import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.tree.DefaultElement;

public class UserDataElement extends DefaultElement {
    private Object data;

    public UserDataElement(String str) {
        super(str);
    }

    public UserDataElement(QName qName) {
        super(qName);
    }

    @Override
    public Object clone() {
        UserDataElement userDataElement = (UserDataElement) super.clone();
        if (userDataElement != this) {
            userDataElement.data = getCopyOfUserData();
        }
        return userDataElement;
    }

    @Override
    protected Element createElement(String str) {
        Element elementCreateElement = getDocumentFactory().createElement(str);
        elementCreateElement.setData(getCopyOfUserData());
        return elementCreateElement;
    }

    @Override
    protected Element createElement(QName qName) {
        Element elementCreateElement = getDocumentFactory().createElement(qName);
        elementCreateElement.setData(getCopyOfUserData());
        return elementCreateElement;
    }

    protected Object getCopyOfUserData() {
        return this.data;
    }

    @Override
    public Object getData() {
        return this.data;
    }

    @Override
    public void setData(Object obj) {
        this.data = obj;
    }

    @Override
    public String toString() {
        return new StringBuffer().append(super.toString()).append(" userData: ").append(this.data).toString();
    }
}
