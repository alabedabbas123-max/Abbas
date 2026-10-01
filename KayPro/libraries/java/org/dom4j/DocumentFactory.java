package org.dom4j;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.dom4j.rule.Pattern;
import org.dom4j.tree.AbstractDocument;
import org.dom4j.tree.DefaultAttribute;
import org.dom4j.tree.DefaultCDATA;
import org.dom4j.tree.DefaultComment;
import org.dom4j.tree.DefaultDocument;
import org.dom4j.tree.DefaultDocumentType;
import org.dom4j.tree.DefaultElement;
import org.dom4j.tree.DefaultEntity;
import org.dom4j.tree.DefaultProcessingInstruction;
import org.dom4j.tree.DefaultText;
import org.dom4j.tree.QNameCache;
import org.dom4j.util.SimpleSingleton;
import org.dom4j.util.SingletonStrategy;
import org.dom4j.xpath.DefaultXPath;
import org.dom4j.xpath.XPathPattern;
import org.jaxen.VariableContext;

public class DocumentFactory implements Serializable {
    static Class class$org$dom4j$DocumentFactory;
    private static SingletonStrategy singleton = null;
    protected transient QNameCache cache;
    private Map xpathNamespaceURIs;

    public DocumentFactory() {
        init();
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    protected static DocumentFactory createSingleton(String str) {
        Class clsClass$;
        try {
            if (class$org$dom4j$DocumentFactory == null) {
                clsClass$ = class$("org.dom4j.DocumentFactory");
                class$org$dom4j$DocumentFactory = clsClass$;
            } else {
                clsClass$ = class$org$dom4j$DocumentFactory;
            }
            return (DocumentFactory) Class.forName(str, true, clsClass$.getClassLoader()).newInstance();
        } catch (Throwable th) {
            System.out.println(new StringBuffer().append("WARNING: Cannot load DocumentFactory: ").append(str).toString());
            return new DocumentFactory();
        }
    }

    private static SingletonStrategy createSingleton() {
        String property;
        SingletonStrategy simpleSingleton;
        try {
            property = System.getProperty("org.dom4j.factory", "org.dom4j.DocumentFactory");
        } catch (Exception e) {
            property = "org.dom4j.DocumentFactory";
        }
        try {
            simpleSingleton = (SingletonStrategy) Class.forName(System.getProperty("org.dom4j.DocumentFactory.singleton.strategy", "org.dom4j.util.SimpleSingleton")).newInstance();
        } catch (Exception e2) {
            simpleSingleton = new SimpleSingleton();
        }
        simpleSingleton.setSingletonClassName(property);
        return simpleSingleton;
    }

    public static synchronized DocumentFactory getInstance() {
        if (singleton == null) {
            singleton = createSingleton();
        }
        return (DocumentFactory) singleton.instance();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init();
    }

    public Attribute createAttribute(Element element, String str, String str2) {
        return createAttribute(element, createQName(str), str2);
    }

    public Attribute createAttribute(Element element, QName qName, String str) {
        return new DefaultAttribute(qName, str);
    }

    public CDATA createCDATA(String str) {
        return new DefaultCDATA(str);
    }

    public Comment createComment(String str) {
        return new DefaultComment(str);
    }

    public DocumentType createDocType(String str, String str2, String str3) {
        return new DefaultDocumentType(str, str2, str3);
    }

    public Document createDocument() {
        DefaultDocument defaultDocument = new DefaultDocument();
        defaultDocument.setDocumentFactory(this);
        return defaultDocument;
    }

    public Document createDocument(String str) {
        Document documentCreateDocument = createDocument();
        if (documentCreateDocument instanceof AbstractDocument) {
            ((AbstractDocument) documentCreateDocument).setXMLEncoding(str);
        }
        return documentCreateDocument;
    }

    public Document createDocument(Element element) {
        Document documentCreateDocument = createDocument();
        documentCreateDocument.setRootElement(element);
        return documentCreateDocument;
    }

    public Element createElement(String str) {
        return createElement(createQName(str));
    }

    public Element createElement(String str, String str2) {
        return createElement(createQName(str, str2));
    }

    public Element createElement(QName qName) {
        return new DefaultElement(qName);
    }

    public Entity createEntity(String str, String str2) {
        return new DefaultEntity(str, str2);
    }

    public Namespace createNamespace(String str, String str2) {
        return Namespace.m8865get(str, str2);
    }

    public Pattern createPattern(String str) {
        return new XPathPattern(str);
    }

    public ProcessingInstruction createProcessingInstruction(String str, String str2) {
        return new DefaultProcessingInstruction(str, str2);
    }

    public ProcessingInstruction createProcessingInstruction(String str, Map map) {
        return new DefaultProcessingInstruction(str, map);
    }

    public QName createQName(String str) {
        return this.cache.m8885get(str);
    }

    public QName createQName(String str, String str2) {
        return this.cache.m8886get(str, str2);
    }

    public QName createQName(String str, String str2, String str3) {
        return this.cache.m8887get(str, Namespace.m8865get(str2, str3));
    }

    public QName createQName(String str, Namespace namespace) {
        return this.cache.m8887get(str, namespace);
    }

    protected QNameCache createQNameCache() {
        return new QNameCache(this);
    }

    public Text createText(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Adding text to an XML document must not be null");
        }
        return new DefaultText(str);
    }

    public XPath createXPath(String str) throws InvalidXPathException {
        DefaultXPath defaultXPath = new DefaultXPath(str);
        if (this.xpathNamespaceURIs != null) {
            defaultXPath.setNamespaceURIs(this.xpathNamespaceURIs);
        }
        return defaultXPath;
    }

    public XPath createXPath(String str, VariableContext variableContext) {
        XPath xPathCreateXPath = createXPath(str);
        xPathCreateXPath.setVariableContext(variableContext);
        return xPathCreateXPath;
    }

    public NodeFilter createXPathFilter(String str) {
        return createXPath(str);
    }

    public NodeFilter createXPathFilter(String str, VariableContext variableContext) {
        XPath xPathCreateXPath = createXPath(str);
        xPathCreateXPath.setVariableContext(variableContext);
        return xPathCreateXPath;
    }

    public List getQNames() {
        return this.cache.getQNames();
    }

    public Map getXPathNamespaceURIs() {
        return this.xpathNamespaceURIs;
    }

    protected void init() {
        this.cache = createQNameCache();
    }

    protected QName intern(QName qName) {
        return this.cache.intern(qName);
    }

    public void setXPathNamespaceURIs(Map map) {
        this.xpathNamespaceURIs = map;
    }
}
