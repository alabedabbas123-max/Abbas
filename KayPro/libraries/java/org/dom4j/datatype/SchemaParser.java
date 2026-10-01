package org.dom4j.datatype;

import com.baidu.mobstat.Config;
import com.sun.msv.datatype.xsd.DatatypeFactory;
import com.sun.msv.datatype.xsd.TypeIncubator;
import com.sun.msv.datatype.xsd.XSDatatype;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.io.SAXReader;
import org.dom4j.util.AttributeHelper;
import org.relaxng.datatype.DatatypeException;
import org.relaxng.datatype.ValidationContext;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

public class SchemaParser {
    private Map dataTypeCache;
    private DatatypeDocumentFactory documentFactory;
    private NamedTypeResolver namedTypeResolver;
    private Namespace targetNamespace;
    private static final Namespace XSD_NAMESPACE = Namespace.m8865get("xsd", "http://www.w3.org/2001/XMLSchema");
    private static final QName XSD_ELEMENT = QName.m8869get("element", XSD_NAMESPACE);
    private static final QName XSD_ATTRIBUTE = QName.m8869get(Config.EVENT_ATTR, XSD_NAMESPACE);
    private static final QName XSD_SIMPLETYPE = QName.m8869get("simpleType", XSD_NAMESPACE);
    private static final QName XSD_COMPLEXTYPE = QName.m8869get("complexType", XSD_NAMESPACE);
    private static final QName XSD_RESTRICTION = QName.m8869get("restriction", XSD_NAMESPACE);
    private static final QName XSD_SEQUENCE = QName.m8869get("sequence", XSD_NAMESPACE);
    private static final QName XSD_CHOICE = QName.m8869get("choice", XSD_NAMESPACE);
    private static final QName XSD_ALL = QName.m8869get("all", XSD_NAMESPACE);
    private static final QName XSD_INCLUDE = QName.m8869get("include", XSD_NAMESPACE);

    public SchemaParser() {
        this(DatatypeDocumentFactory.singleton);
    }

    public SchemaParser(DatatypeDocumentFactory datatypeDocumentFactory) {
        this.dataTypeCache = new HashMap();
        this.documentFactory = datatypeDocumentFactory;
        this.namedTypeResolver = new NamedTypeResolver(datatypeDocumentFactory);
    }

    private XSDatatype dataTypeForXsdAttribute(Element element) {
        String strAttributeValue = element.attributeValue("type");
        if (strAttributeValue != null) {
            return getTypeByName(strAttributeValue);
        }
        Element element2 = element.element(XSD_SIMPLETYPE);
        if (element2 != null) {
            return loadXSDatatypeFromSimpleType(element2);
        }
        throw new InvalidSchemaException(new StringBuffer().append("The attribute: ").append(element.attributeValue("name")).append(" has no type attribute and does not contain a ").append("<simpleType/> element").toString());
    }

    private XSDatatype deriveSimpleType(XSDatatype xSDatatype, Element element) {
        TypeIncubator typeIncubator = new TypeIncubator(xSDatatype);
        try {
            Iterator itElementIterator = element.elementIterator();
            while (itElementIterator.hasNext()) {
                Element element2 = (Element) itElementIterator.next();
                typeIncubator.addFacet(element2.getName(), element2.attributeValue("value"), AttributeHelper.booleanValue(element2, "fixed"), (ValidationContext) null);
            }
            return typeIncubator.derive("", (String) null);
        } catch (DatatypeException e) {
            onSchemaError(new StringBuffer().append("Invalid restriction: ").append(e.getMessage()).append(" when trying to build restriction: ").append(element).toString());
            return null;
        }
    }

    private DatatypeElementFactory getDatatypeElementFactory(QName qName) {
        DatatypeElementFactory elementFactory = this.documentFactory.getElementFactory(qName);
        if (elementFactory != null) {
            return elementFactory;
        }
        DatatypeElementFactory datatypeElementFactory = new DatatypeElementFactory(qName);
        qName.setDocumentFactory(datatypeElementFactory);
        return datatypeElementFactory;
    }

    private QName getQName(String str) {
        return this.targetNamespace == null ? this.documentFactory.createQName(str) : this.documentFactory.createQName(str, this.targetNamespace);
    }

    private XSDatatype getTypeByName(String str) {
        XSDatatype typeByName = (XSDatatype) this.dataTypeCache.get(str);
        if (typeByName == null) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                try {
                    typeByName = DatatypeFactory.getTypeByName(str.substring(iIndexOf + 1));
                } catch (DatatypeException e) {
                }
            }
            if (typeByName == null) {
                try {
                    typeByName = DatatypeFactory.getTypeByName(str);
                } catch (DatatypeException e2) {
                }
            }
            if (typeByName == null) {
                typeByName = (XSDatatype) this.namedTypeResolver.simpleTypeMap.get(getQName(str));
            }
            if (typeByName != null) {
                this.dataTypeCache.put(str, typeByName);
            }
        }
        return typeByName;
    }

    private synchronized void internalBuild(Document document) {
        Element rootElement = document.getRootElement();
        if (rootElement != null) {
            Iterator itElementIterator = rootElement.elementIterator(XSD_INCLUDE);
            while (itElementIterator.hasNext()) {
                String strAttributeValue = ((Element) itElementIterator.next()).attributeValue("schemaLocation");
                EntityResolver entityResolver = document.getEntityResolver();
                if (entityResolver == null) {
                    throw new InvalidSchemaException("No EntityResolver available");
                }
                try {
                    InputSource inputSourceResolveEntity = entityResolver.resolveEntity(null, strAttributeValue);
                    if (inputSourceResolveEntity == null) {
                        throw new InvalidSchemaException(new StringBuffer().append("Could not resolve the schema URI: ").append(strAttributeValue).toString());
                    }
                    build(new SAXReader().read(inputSourceResolveEntity));
                } catch (Exception e) {
                    System.out.println(new StringBuffer().append("Failed to load schema: ").append(strAttributeValue).toString());
                    System.out.println(new StringBuffer().append("Caught: ").append(e).toString());
                    e.printStackTrace();
                    throw new InvalidSchemaException(new StringBuffer().append("Failed to load schema: ").append(strAttributeValue).toString());
                }
            }
            Iterator itElementIterator2 = rootElement.elementIterator(XSD_ELEMENT);
            while (itElementIterator2.hasNext()) {
                onDatatypeElement((Element) itElementIterator2.next(), this.documentFactory);
            }
            Iterator itElementIterator3 = rootElement.elementIterator(XSD_SIMPLETYPE);
            while (itElementIterator3.hasNext()) {
                onNamedSchemaSimpleType((Element) itElementIterator3.next());
            }
            Iterator itElementIterator4 = rootElement.elementIterator(XSD_COMPLEXTYPE);
            while (itElementIterator4.hasNext()) {
                onNamedSchemaComplexType((Element) itElementIterator4.next());
            }
            this.namedTypeResolver.resolveNamedTypes();
        }
    }

    private XSDatatype loadXSDatatypeFromSimpleType(Element element) {
        Element element2 = element.element(XSD_RESTRICTION);
        if (element2 != null) {
            String strAttributeValue = element2.attributeValue("base");
            if (strAttributeValue != null) {
                XSDatatype typeByName = getTypeByName(strAttributeValue);
                if (typeByName != null) {
                    return deriveSimpleType(typeByName, element2);
                }
                onSchemaError(new StringBuffer().append("Invalid base type: ").append(strAttributeValue).append(" when trying to build restriction: ").append(element2).toString());
            } else {
                Element element3 = element.element(XSD_SIMPLETYPE);
                if (element3 != null) {
                    return loadXSDatatypeFromSimpleType(element3);
                }
                onSchemaError(new StringBuffer().append("The simpleType element: ").append(element).append(" must contain a base attribute or simpleType").append(" element").toString());
            }
        } else {
            onSchemaError(new StringBuffer().append("No <restriction>. Could not create XSDatatype for simpleType: ").append(element).toString());
        }
        return null;
    }

    private void onChildElements(Element element, DatatypeElementFactory datatypeElementFactory) {
        Iterator itElementIterator = element.elementIterator(XSD_ELEMENT);
        while (itElementIterator.hasNext()) {
            onDatatypeElement((Element) itElementIterator.next(), datatypeElementFactory);
        }
    }

    private void onDatatypeAttribute(Element element, DatatypeElementFactory datatypeElementFactory, Element element2) {
        String strAttributeValue = element2.attributeValue("name");
        QName qName = getQName(strAttributeValue);
        XSDatatype xSDatatypeDataTypeForXsdAttribute = dataTypeForXsdAttribute(element2);
        if (xSDatatypeDataTypeForXsdAttribute != null) {
            datatypeElementFactory.setAttributeXSDatatype(qName, xSDatatypeDataTypeForXsdAttribute);
        } else {
            System.out.println(new StringBuffer().append("Warning: Couldn't find XSDatatype for type: ").append(element2.attributeValue("type")).append(" attribute: ").append(strAttributeValue).toString());
        }
    }

    private void onDatatypeElement(Element element, DocumentFactory documentFactory) {
        XSDatatype xSDatatypeLoadXSDatatypeFromSimpleType;
        String strAttributeValue = element.attributeValue("name");
        String strAttributeValue2 = element.attributeValue("type");
        QName qName = getQName(strAttributeValue);
        DatatypeElementFactory datatypeElementFactory = getDatatypeElementFactory(qName);
        if (strAttributeValue2 != null) {
            XSDatatype typeByName = getTypeByName(strAttributeValue2);
            if (typeByName != null) {
                datatypeElementFactory.setChildElementXSDatatype(qName, typeByName);
                return;
            } else {
                this.namedTypeResolver.registerTypedElement(element, getQName(strAttributeValue2), documentFactory);
                return;
            }
        }
        Element element2 = element.element(XSD_SIMPLETYPE);
        if (element2 != null && (xSDatatypeLoadXSDatatypeFromSimpleType = loadXSDatatypeFromSimpleType(element2)) != null) {
            datatypeElementFactory.setChildElementXSDatatype(qName, xSDatatypeLoadXSDatatypeFromSimpleType);
        }
        Element element3 = element.element(XSD_COMPLEXTYPE);
        if (element3 != null) {
            onSchemaComplexType(element3, datatypeElementFactory);
        }
        Iterator itElementIterator = element.elementIterator(XSD_ATTRIBUTE);
        if (itElementIterator.hasNext()) {
            do {
                onDatatypeAttribute(element, datatypeElementFactory, (Element) itElementIterator.next());
            } while (itElementIterator.hasNext());
        }
    }

    private void onNamedSchemaComplexType(Element element) {
        Attribute attribute = element.attribute("name");
        if (attribute == null) {
            return;
        }
        QName qName = getQName(attribute.getText());
        DatatypeElementFactory datatypeElementFactory = getDatatypeElementFactory(qName);
        onSchemaComplexType(element, datatypeElementFactory);
        this.namedTypeResolver.registerComplexType(qName, datatypeElementFactory);
    }

    private void onNamedSchemaSimpleType(Element element) {
        Attribute attribute = element.attribute("name");
        if (attribute == null) {
            return;
        }
        this.namedTypeResolver.registerSimpleType(getQName(attribute.getText()), loadXSDatatypeFromSimpleType(element));
    }

    private void onSchemaComplexType(Element element, DatatypeElementFactory datatypeElementFactory) {
        Iterator itElementIterator = element.elementIterator(XSD_ATTRIBUTE);
        while (itElementIterator.hasNext()) {
            Element element2 = (Element) itElementIterator.next();
            QName qName = getQName(element2.attributeValue("name"));
            XSDatatype xSDatatypeDataTypeForXsdAttribute = dataTypeForXsdAttribute(element2);
            if (xSDatatypeDataTypeForXsdAttribute != null) {
                datatypeElementFactory.setAttributeXSDatatype(qName, xSDatatypeDataTypeForXsdAttribute);
            }
        }
        Element element3 = element.element(XSD_SEQUENCE);
        if (element3 != null) {
            onChildElements(element3, datatypeElementFactory);
        }
        Element element4 = element.element(XSD_CHOICE);
        if (element4 != null) {
            onChildElements(element4, datatypeElementFactory);
        }
        Element element5 = element.element(XSD_ALL);
        if (element5 != null) {
            onChildElements(element5, datatypeElementFactory);
        }
    }

    private void onSchemaError(String str) {
        throw new InvalidSchemaException(str);
    }

    public void build(Document document) {
        this.targetNamespace = null;
        internalBuild(document);
    }

    public void build(Document document, Namespace namespace) {
        this.targetNamespace = namespace;
        internalBuild(document);
    }
}
