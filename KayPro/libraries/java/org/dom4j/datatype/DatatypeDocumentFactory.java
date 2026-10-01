package org.dom4j.datatype;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.io.SAXReader;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

public class DatatypeDocumentFactory extends DocumentFactory {
    private static final boolean DO_INTERN_QNAME = false;
    protected static transient DatatypeDocumentFactory singleton = new DatatypeDocumentFactory();
    private static final Namespace XSI_NAMESPACE = Namespace.m8865get("xsi", "http://www.w3.org/2001/XMLSchema-instance");
    private static final QName XSI_SCHEMA_LOCATION = QName.m8869get("schemaLocation", XSI_NAMESPACE);
    private static final QName XSI_NO_SCHEMA_LOCATION = QName.m8869get("noNamespaceSchemaLocation", XSI_NAMESPACE);
    private SAXReader xmlSchemaReader = new SAXReader();
    private boolean autoLoadSchema = true;
    private SchemaParser schemaBuilder = new SchemaParser(this);

    public static DocumentFactory getInstance() {
        return singleton;
    }

    @Override
    public Attribute createAttribute(Element element, QName qName, String str) {
        if (this.autoLoadSchema && qName.equals(XSI_NO_SCHEMA_LOCATION)) {
            loadSchema(element != null ? element.getDocument() : null, str);
        } else if (this.autoLoadSchema && qName.equals(XSI_SCHEMA_LOCATION)) {
            loadSchema(element != null ? element.getDocument() : null, str.substring(str.indexOf(32) + 1), element.getNamespaceForURI(str.substring(0, str.indexOf(32))));
        }
        return super.createAttribute(element, qName, str);
    }

    public DatatypeElementFactory getElementFactory(QName qName) {
        DocumentFactory documentFactory = qName.getDocumentFactory();
        if (documentFactory instanceof DatatypeElementFactory) {
            return (DatatypeElementFactory) documentFactory;
        }
        return null;
    }

    public void loadSchema(Document document) {
        this.schemaBuilder.build(document);
    }

    protected void loadSchema(Document document, String str) {
        try {
            EntityResolver entityResolver = document.getEntityResolver();
            if (entityResolver == null) {
                throw new InvalidSchemaException(new StringBuffer().append("No EntityResolver available for resolving URI: ").append(str).toString());
            }
            InputSource inputSourceResolveEntity = entityResolver.resolveEntity(null, str);
            if (entityResolver == null) {
                throw new InvalidSchemaException(new StringBuffer().append("Could not resolve the URI: ").append(str).toString());
            }
            loadSchema(this.xmlSchemaReader.read(inputSourceResolveEntity));
        } catch (Exception e) {
            System.out.println(new StringBuffer().append("Failed to load schema: ").append(str).toString());
            System.out.println(new StringBuffer().append("Caught: ").append(e).toString());
            e.printStackTrace();
            throw new InvalidSchemaException(new StringBuffer().append("Failed to load schema: ").append(str).toString());
        }
    }

    protected void loadSchema(Document document, String str, Namespace namespace) {
        try {
            EntityResolver entityResolver = document.getEntityResolver();
            if (entityResolver == null) {
                throw new InvalidSchemaException(new StringBuffer().append("No EntityResolver available for resolving URI: ").append(str).toString());
            }
            InputSource inputSourceResolveEntity = entityResolver.resolveEntity(null, str);
            if (entityResolver == null) {
                throw new InvalidSchemaException(new StringBuffer().append("Could not resolve the URI: ").append(str).toString());
            }
            loadSchema(this.xmlSchemaReader.read(inputSourceResolveEntity), namespace);
        } catch (Exception e) {
            System.out.println(new StringBuffer().append("Failed to load schema: ").append(str).toString());
            System.out.println(new StringBuffer().append("Caught: ").append(e).toString());
            e.printStackTrace();
            throw new InvalidSchemaException(new StringBuffer().append("Failed to load schema: ").append(str).toString());
        }
    }

    public void loadSchema(Document document, Namespace namespace) {
        this.schemaBuilder.build(document, namespace);
    }
}
