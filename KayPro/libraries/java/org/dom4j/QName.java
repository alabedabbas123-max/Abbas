package org.dom4j;

import com.baidu.mobstat.Config;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.dom4j.tree.QNameCache;
import org.dom4j.util.SingletonStrategy;

public class QName implements Serializable {
    static Class class$org$dom4j$tree$QNameCache;
    private static SingletonStrategy singleton;
    private DocumentFactory documentFactory;
    private int hashCode;
    private String name;
    private transient Namespace namespace;
    private String qualifiedName;

    static {
        Class clsClass$;
        Class<?> cls = null;
        singleton = null;
        try {
            cls = Class.forName(System.getProperty("org.dom4j.QName.singleton.strategy", "org.dom4j.util.SimpleSingleton"));
        } catch (Exception e) {
            try {
                cls = Class.forName("org.dom4j.util.SimpleSingleton");
            } catch (Exception e2) {
            }
        }
        try {
            singleton = (SingletonStrategy) cls.newInstance();
            SingletonStrategy singletonStrategy = singleton;
            if (class$org$dom4j$tree$QNameCache == null) {
                clsClass$ = class$("org.dom4j.tree.QNameCache");
                class$org$dom4j$tree$QNameCache = clsClass$;
            } else {
                clsClass$ = class$org$dom4j$tree$QNameCache;
            }
            singletonStrategy.setSingletonClassName(clsClass$.getName());
        } catch (Exception e3) {
        }
    }

    public QName(String str) {
        this(str, Namespace.NO_NAMESPACE);
    }

    public QName(String str, Namespace namespace) {
        this.name = str == null ? "" : str;
        this.namespace = namespace == null ? Namespace.NO_NAMESPACE : namespace;
    }

    public QName(String str, Namespace namespace, String str2) {
        this.name = str == null ? "" : str;
        this.qualifiedName = str2;
        this.namespace = namespace == null ? Namespace.NO_NAMESPACE : namespace;
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static QName m8866get(String str) {
        return getCache().m8885get(str);
    }

    public static QName m8867get(String str, String str2) {
        return str2 == null ? getCache().m8885get(str) : getCache().m8886get(str, str2);
    }

    public static QName m8868get(String str, String str2, String str3) {
        if ((str2 == null || str2.length() == 0) && str3 == null) {
            return m8866get(str);
        }
        if (str2 == null || str2.length() == 0) {
            return getCache().m8887get(str, Namespace.m8864get(str3));
        }
        return str3 == null ? m8866get(str) : getCache().m8887get(str, Namespace.m8865get(str2, str3));
    }

    public static QName m8869get(String str, Namespace namespace) {
        return getCache().m8887get(str, namespace);
    }

    public static QName m8870get(String str, Namespace namespace, String str2) {
        return getCache().m8888get(str, namespace, str2);
    }

    private static QNameCache getCache() {
        return (QNameCache) singleton.instance();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        String str = (String) objectInputStream.readObject();
        String str2 = (String) objectInputStream.readObject();
        objectInputStream.defaultReadObject();
        this.namespace = Namespace.m8865get(str, str2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.namespace.getPrefix());
        objectOutputStream.writeObject(this.namespace.getURI());
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QName) {
            QName qName = (QName) obj;
            if (hashCode() == qName.hashCode()) {
                return getName().equals(qName.getName()) && getNamespaceURI().equals(qName.getNamespaceURI());
            }
        }
        return false;
    }

    public DocumentFactory getDocumentFactory() {
        return this.documentFactory;
    }

    public String getName() {
        return this.name;
    }

    public Namespace getNamespace() {
        return this.namespace;
    }

    public String getNamespacePrefix() {
        return this.namespace == null ? "" : this.namespace.getPrefix();
    }

    public String getNamespaceURI() {
        return this.namespace == null ? "" : this.namespace.getURI();
    }

    public String getQualifiedName() {
        if (this.qualifiedName == null) {
            String namespacePrefix = getNamespacePrefix();
            if (namespacePrefix == null || namespacePrefix.length() <= 0) {
                this.qualifiedName = this.name;
            } else {
                this.qualifiedName = new StringBuffer().append(namespacePrefix).append(Config.TRACE_TODAY_VISIT_SPLIT).append(this.name).toString();
            }
        }
        return this.qualifiedName;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = getName().hashCode() ^ getNamespaceURI().hashCode();
            if (this.hashCode == 0) {
                this.hashCode = 47806;
            }
        }
        return this.hashCode;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    public String toString() {
        return new StringBuffer().append(super.toString()).append(" [name: ").append(getName()).append(" namespace: \"").append(getNamespace()).append("\"]").toString();
    }
}
