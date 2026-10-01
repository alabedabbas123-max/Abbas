package org.dom4j.tree;

import com.baidu.mobstat.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.dom4j.DocumentFactory;
import org.dom4j.Namespace;
import org.dom4j.QName;

public class NamespaceStack {
    private Map currentNamespaceCache;
    private Namespace defaultNamespace;
    private DocumentFactory documentFactory;
    private ArrayList namespaceCacheList;
    private ArrayList namespaceStack;
    private Map rootNamespaceCache;

    public NamespaceStack() {
        this.namespaceStack = new ArrayList();
        this.namespaceCacheList = new ArrayList();
        this.rootNamespaceCache = new HashMap();
        this.documentFactory = DocumentFactory.getInstance();
    }

    public NamespaceStack(DocumentFactory documentFactory) {
        this.namespaceStack = new ArrayList();
        this.namespaceCacheList = new ArrayList();
        this.rootNamespaceCache = new HashMap();
        this.documentFactory = documentFactory;
    }

    public Namespace addNamespace(String str, String str2) {
        Namespace namespaceCreateNamespace = createNamespace(str, str2);
        push(namespaceCreateNamespace);
        return namespaceCreateNamespace;
    }

    public void clear() {
        this.namespaceStack.clear();
        this.namespaceCacheList.clear();
        this.rootNamespaceCache.clear();
        this.currentNamespaceCache = null;
    }

    public boolean contains(Namespace namespace) {
        String prefix = namespace.getPrefix();
        Namespace defaultNamespace = (prefix == null || prefix.length() == 0) ? getDefaultNamespace() : getNamespaceForPrefix(prefix);
        if (defaultNamespace == null) {
            return false;
        }
        if (defaultNamespace == namespace) {
            return true;
        }
        return namespace.getURI().equals(defaultNamespace.getURI());
    }

    protected Namespace createNamespace(String str, String str2) {
        return this.documentFactory.createNamespace(str, str2);
    }

    protected QName createQName(String str, String str2, Namespace namespace) {
        return this.documentFactory.createQName(str, namespace);
    }

    protected Namespace findDefaultNamespace() {
        for (int size = this.namespaceStack.size() - 1; size >= 0; size--) {
            Namespace namespace = (Namespace) this.namespaceStack.get(size);
            if (namespace != null && (namespace.getPrefix() == null || namespace.getPrefix().length() == 0)) {
                return namespace;
            }
        }
        return null;
    }

    public QName getAttributeQName(String str, String str2, String str3) {
        Namespace namespaceCreateNamespace;
        if (str3 == null) {
            str3 = str2;
        }
        Map namespaceCache = getNamespaceCache();
        QName qName = (QName) namespaceCache.get(str3);
        if (qName != null) {
            return qName;
        }
        String strSubstring = str2 == null ? str3 : str2;
        if (str == null) {
            str = "";
        }
        String strSubstring2 = "";
        int iIndexOf = str3.indexOf(Config.TRACE_TODAY_VISIT_SPLIT);
        if (iIndexOf > 0) {
            strSubstring2 = str3.substring(0, iIndexOf);
            namespaceCreateNamespace = createNamespace(strSubstring2, str);
            if (strSubstring.trim().length() == 0) {
                strSubstring = str3.substring(iIndexOf + 1);
            }
        } else {
            namespaceCreateNamespace = Namespace.NO_NAMESPACE;
            if (strSubstring.trim().length() == 0) {
                strSubstring = str3;
            }
        }
        QName qNamePushQName = pushQName(strSubstring, str3, namespaceCreateNamespace, strSubstring2);
        namespaceCache.put(str3, qNamePushQName);
        return qNamePushQName;
    }

    public Namespace getDefaultNamespace() {
        if (this.defaultNamespace == null) {
            this.defaultNamespace = findDefaultNamespace();
        }
        return this.defaultNamespace;
    }

    public DocumentFactory getDocumentFactory() {
        return this.documentFactory;
    }

    public Namespace getNamespace(int i) {
        return (Namespace) this.namespaceStack.get(i);
    }

    protected Map getNamespaceCache() {
        if (this.currentNamespaceCache == null) {
            int size = this.namespaceStack.size() - 1;
            if (size < 0) {
                this.currentNamespaceCache = this.rootNamespaceCache;
            } else {
                this.currentNamespaceCache = (Map) this.namespaceCacheList.get(size);
                if (this.currentNamespaceCache == null) {
                    this.currentNamespaceCache = new HashMap();
                    this.namespaceCacheList.set(size, this.currentNamespaceCache);
                }
            }
        }
        return this.currentNamespaceCache;
    }

    public Namespace getNamespaceForPrefix(String str) {
        if (str == null) {
            str = "";
        }
        for (int size = this.namespaceStack.size() - 1; size >= 0; size--) {
            Namespace namespace = (Namespace) this.namespaceStack.get(size);
            if (str.equals(namespace.getPrefix())) {
                return namespace;
            }
        }
        return null;
    }

    public QName getQName(String str, String str2, String str3) {
        String str4;
        String strSubstring;
        if (str2 == null) {
            str4 = str3;
            strSubstring = str3;
        } else if (str3 == null) {
            str4 = str2;
            strSubstring = str2;
        } else {
            str4 = str3;
            strSubstring = str2;
        }
        if (str == null) {
            str = "";
        }
        String strSubstring2 = "";
        int iIndexOf = str4.indexOf(Config.TRACE_TODAY_VISIT_SPLIT);
        if (iIndexOf > 0) {
            strSubstring2 = str4.substring(0, iIndexOf);
            if (strSubstring.trim().length() == 0) {
                strSubstring = str4.substring(iIndexOf + 1);
            }
        } else if (strSubstring.trim().length() == 0) {
            strSubstring = str4;
        }
        return pushQName(strSubstring, str4, createNamespace(strSubstring2, str), strSubstring2);
    }

    public String getURI(String str) {
        Namespace namespaceForPrefix = getNamespaceForPrefix(str);
        if (namespaceForPrefix != null) {
            return namespaceForPrefix.getURI();
        }
        return null;
    }

    public Namespace m8883pop() {
        return remove(this.namespaceStack.size() - 1);
    }

    public Namespace m8884pop(String str) {
        Namespace namespace;
        if (str == null) {
            str = "";
        }
        int size = this.namespaceStack.size() - 1;
        while (true) {
            if (size < 0) {
                namespace = null;
                break;
            }
            namespace = (Namespace) this.namespaceStack.get(size);
            if (str.equals(namespace.getPrefix())) {
                remove(size);
                break;
            }
            size--;
        }
        if (namespace == null) {
            System.out.println(new StringBuffer().append("Warning: missing namespace prefix ignored: ").append(str).toString());
        }
        return namespace;
    }

    public void push(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        push(createNamespace(str, str2));
    }

    public void push(Namespace namespace) {
        this.namespaceStack.add(namespace);
        this.namespaceCacheList.add(null);
        this.currentNamespaceCache = null;
        String prefix = namespace.getPrefix();
        if (prefix == null || prefix.length() == 0) {
            this.defaultNamespace = namespace;
        }
    }

    protected QName pushQName(String str, String str2, Namespace namespace, String str3) {
        if (str3 == null || str3.length() == 0) {
            this.defaultNamespace = null;
        }
        return createQName(str, str2, namespace);
    }

    protected Namespace remove(int i) {
        Namespace namespace = (Namespace) this.namespaceStack.remove(i);
        this.namespaceCacheList.remove(i);
        this.defaultNamespace = null;
        this.currentNamespaceCache = null;
        return namespace;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    public int size() {
        return this.namespaceStack.size();
    }

    public String toString() {
        return new StringBuffer().append(super.toString()).append(" Stack: ").append(this.namespaceStack.toString()).toString();
    }
}
