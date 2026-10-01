package org.dom4j.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.dom4j.DocumentFactory;
import org.dom4j.Namespace;
import org.dom4j.QName;

public class QNameCache {
    private DocumentFactory documentFactory;
    protected Map noNamespaceCache = Collections.synchronizedMap(new WeakHashMap());
    protected Map namespaceCache = Collections.synchronizedMap(new WeakHashMap());

    public QNameCache() {
    }

    public QNameCache(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    protected Map createMap() {
        return Collections.synchronizedMap(new HashMap());
    }

    protected QName createQName(String str) {
        return new QName(str);
    }

    protected QName createQName(String str, Namespace namespace) {
        return new QName(str, namespace);
    }

    protected QName createQName(String str, Namespace namespace, String str2) {
        return new QName(str, namespace, str2);
    }

    public QName m8885get(String str) {
        QName qName = null;
        if (str != null) {
            qName = (QName) this.noNamespaceCache.get(str);
        } else {
            str = "";
        }
        if (qName != null) {
            return qName;
        }
        QName qNameCreateQName = createQName(str);
        qNameCreateQName.setDocumentFactory(this.documentFactory);
        this.noNamespaceCache.put(str, qNameCreateQName);
        return qNameCreateQName;
    }

    public QName m8886get(String str, String str2) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf < 0 ? m8887get(str, Namespace.m8864get(str2)) : m8887get(str.substring(iIndexOf + 1), Namespace.m8865get(str.substring(0, iIndexOf), str2));
    }

    public QName m8887get(String str, Namespace namespace) {
        Map namespaceCache = getNamespaceCache(namespace);
        QName qName = null;
        if (str != null) {
            qName = (QName) namespaceCache.get(str);
        } else {
            str = "";
        }
        if (qName != null) {
            return qName;
        }
        QName qNameCreateQName = createQName(str, namespace);
        qNameCreateQName.setDocumentFactory(this.documentFactory);
        namespaceCache.put(str, qNameCreateQName);
        return qNameCreateQName;
    }

    public QName m8888get(String str, Namespace namespace, String str2) {
        Map namespaceCache = getNamespaceCache(namespace);
        QName qName = null;
        if (str != null) {
            qName = (QName) namespaceCache.get(str);
        } else {
            str = "";
        }
        if (qName != null) {
            return qName;
        }
        QName qNameCreateQName = createQName(str, namespace, str2);
        qNameCreateQName.setDocumentFactory(this.documentFactory);
        namespaceCache.put(str, qNameCreateQName);
        return qNameCreateQName;
    }

    protected Map getNamespaceCache(Namespace namespace) {
        if (namespace == Namespace.NO_NAMESPACE) {
            return this.noNamespaceCache;
        }
        Map map = namespace != null ? (Map) this.namespaceCache.get(namespace) : null;
        if (map != null) {
            return map;
        }
        Map mapCreateMap = createMap();
        this.namespaceCache.put(namespace, mapCreateMap);
        return mapCreateMap;
    }

    public List getQNames() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.noNamespaceCache.values());
        Iterator it = this.namespaceCache.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Map) it.next()).values());
        }
        return arrayList;
    }

    public QName intern(QName qName) {
        return m8888get(qName.getName(), qName.getNamespace(), qName.getQualifiedName());
    }
}
