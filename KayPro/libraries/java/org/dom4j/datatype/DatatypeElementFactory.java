package org.dom4j.datatype;

import com.sun.msv.datatype.xsd.XSDatatype;
import java.util.HashMap;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.QName;

public class DatatypeElementFactory extends DocumentFactory {
    private Map attributeXSDatatypes = new HashMap();
    private Map childrenXSDatatypes = new HashMap();
    private QName elementQName;

    public DatatypeElementFactory(QName qName) {
        this.elementQName = qName;
    }

    @Override
    public Attribute createAttribute(Element element, QName qName, String str) {
        XSDatatype attributeXSDatatype = getAttributeXSDatatype(qName);
        return attributeXSDatatype == null ? super.createAttribute(element, qName, str) : new DatatypeAttribute(qName, attributeXSDatatype, str);
    }

    @Override
    public Element createElement(QName qName) {
        XSDatatype childElementXSDatatype;
        XSDatatype childElementXSDatatype2 = getChildElementXSDatatype(qName);
        if (childElementXSDatatype2 != null) {
            return new DatatypeElement(qName, childElementXSDatatype2);
        }
        DocumentFactory documentFactory = qName.getDocumentFactory();
        return (!(documentFactory instanceof DatatypeElementFactory) || (childElementXSDatatype = ((DatatypeElementFactory) documentFactory).getChildElementXSDatatype(qName)) == null) ? super.createElement(qName) : new DatatypeElement(qName, childElementXSDatatype);
    }

    public XSDatatype getAttributeXSDatatype(QName qName) {
        return (XSDatatype) this.attributeXSDatatypes.get(qName);
    }

    public XSDatatype getChildElementXSDatatype(QName qName) {
        return (XSDatatype) this.childrenXSDatatypes.get(qName);
    }

    public QName getQName() {
        return this.elementQName;
    }

    public void setAttributeXSDatatype(QName qName, XSDatatype xSDatatype) {
        this.attributeXSDatatypes.put(qName, xSDatatype);
    }

    public void setChildElementXSDatatype(QName qName, XSDatatype xSDatatype) {
        this.childrenXSDatatypes.put(qName, xSDatatype);
    }
}
