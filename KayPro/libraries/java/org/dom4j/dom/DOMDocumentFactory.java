package org.dom4j.dom;

import com.baidu.android.common.util.BuildConfig;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.CDATA;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;
import org.dom4j.Text;
import org.dom4j.util.SingletonStrategy;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DocumentType;

public class DOMDocumentFactory extends DocumentFactory implements DOMImplementation {
    static Class class$org$dom4j$dom$DOMDocumentFactory;
    private static SingletonStrategy singleton;

    static {
        Class clsClass$;
        Class<?> cls = null;
        singleton = null;
        try {
            cls = Class.forName(System.getProperty("org.dom4j.dom.DOMDocumentFactory.singleton.strategy", "org.dom4j.util.SimpleSingleton"));
        } catch (Exception e) {
            try {
                cls = Class.forName("org.dom4j.util.SimpleSingleton");
            } catch (Exception e2) {
            }
        }
        try {
            singleton = (SingletonStrategy) cls.newInstance();
            SingletonStrategy singletonStrategy = singleton;
            if (class$org$dom4j$dom$DOMDocumentFactory == null) {
                clsClass$ = class$("org.dom4j.dom.DOMDocumentFactory");
                class$org$dom4j$dom$DOMDocumentFactory = clsClass$;
            } else {
                clsClass$ = class$org$dom4j$dom$DOMDocumentFactory;
            }
            singletonStrategy.setSingletonClassName(clsClass$.getName());
        } catch (Exception e3) {
        }
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static DocumentFactory getInstance() {
        return (DOMDocumentFactory) singleton.instance();
    }

    protected DOMDocumentType asDocumentType(DocumentType documentType) {
        return documentType instanceof DOMDocumentType ? (DOMDocumentType) documentType : new DOMDocumentType(documentType.getName(), documentType.getPublicId(), documentType.getSystemId());
    }

    @Override
    public Attribute createAttribute(Element element, QName qName, String str) {
        return new DOMAttribute(qName, str);
    }

    @Override
    public CDATA createCDATA(String str) {
        return new DOMCDATA(str);
    }

    @Override
    public Comment createComment(String str) {
        return new DOMComment(str);
    }

    @Override
    public org.dom4j.DocumentType createDocType(String str, String str2, String str3) {
        return new DOMDocumentType(str, str2, str3);
    }

    @Override
    public Document createDocument() {
        DOMDocument dOMDocument = new DOMDocument();
        dOMDocument.setDocumentFactory(this);
        return dOMDocument;
    }

    @Override
    public org.w3c.dom.Document createDocument(String str, String str2, DocumentType documentType) throws DOMException {
        DOMDocument dOMDocument = documentType != null ? new DOMDocument(asDocumentType(documentType)) : new DOMDocument();
        dOMDocument.addElement(createQName(str2, str));
        return dOMDocument;
    }

    @Override
    public DocumentType createDocumentType(String str, String str2, String str3) throws DOMException {
        return new DOMDocumentType(str, str2, str3);
    }

    @Override
    public Element createElement(QName qName) {
        return new DOMElement(qName);
    }

    public Element createElement(QName qName, int i) {
        return new DOMElement(qName, i);
    }

    public Entity createEntity(String str) {
        return new DOMEntityReference(str);
    }

    @Override
    public Entity createEntity(String str, String str2) {
        return new DOMEntityReference(str, str2);
    }

    @Override
    public Namespace createNamespace(String str, String str2) {
        return new DOMNamespace(str, str2);
    }

    @Override
    public ProcessingInstruction createProcessingInstruction(String str, String str2) {
        return new DOMProcessingInstruction(str, str2);
    }

    @Override
    public ProcessingInstruction createProcessingInstruction(String str, Map map) {
        return new DOMProcessingInstruction(str, map);
    }

    @Override
    public Text createText(String str) {
        return new DOMText(str);
    }

    @Override
    public boolean hasFeature(String str, String str2) {
        if ("XML".equalsIgnoreCase(str) || "Core".equalsIgnoreCase(str)) {
            return str2 == null || str2.length() == 0 || BuildConfig.VERSION_NAME.equals(str2) || "2.0".equals(str2);
        }
        return false;
    }
}
