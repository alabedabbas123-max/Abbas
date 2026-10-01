package org.dom4j.bean;

import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import org.dom4j.Attribute;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.tree.DefaultAttribute;
import org.xml.sax.Attributes;

public class BeanDocumentFactory extends DocumentFactory {
    static Class class$org$dom4j$bean$BeanDocumentFactory;
    private static BeanDocumentFactory singleton = new BeanDocumentFactory();

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static DocumentFactory getInstance() {
        return singleton;
    }

    @Override
    public Attribute createAttribute(Element element, QName qName, String str) {
        return new DefaultAttribute(qName, str);
    }

    protected Object createBean(QName qName) {
        return null;
    }

    protected Object createBean(QName qName, Attributes attributes) {
        Class clsClass$;
        String value = attributes.getValue(SvgConstants.ATTR_CLASS);
        if (value != null) {
            try {
                if (class$org$dom4j$bean$BeanDocumentFactory == null) {
                    clsClass$ = class$("org.dom4j.bean.BeanDocumentFactory");
                    class$org$dom4j$bean$BeanDocumentFactory = clsClass$;
                } else {
                    clsClass$ = class$org$dom4j$bean$BeanDocumentFactory;
                }
                return Class.forName(value, true, clsClass$.getClassLoader()).newInstance();
            } catch (Exception e) {
                handleException(e);
            }
        }
        return null;
    }

    @Override
    public Element createElement(QName qName) {
        Object objCreateBean = createBean(qName);
        return objCreateBean == null ? new BeanElement(qName) : new BeanElement(qName, objCreateBean);
    }

    public Element createElement(QName qName, Attributes attributes) {
        Object objCreateBean = createBean(qName, attributes);
        return objCreateBean == null ? new BeanElement(qName) : new BeanElement(qName, objCreateBean);
    }

    protected void handleException(Exception exc) {
        System.out.println(new StringBuffer().append("#### Warning: couldn't create bean: ").append(exc).toString());
    }
}
