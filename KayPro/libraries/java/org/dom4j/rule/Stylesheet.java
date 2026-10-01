package org.dom4j.rule;

import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.XPath;

public class Stylesheet {
    private String modeName;
    private RuleManager ruleManager = new RuleManager();

    public void addRule(Rule rule) {
        this.ruleManager.addRule(rule);
    }

    public void applyTemplates(Object obj) throws Exception {
        applyTemplates(obj, this.modeName);
    }

    public void applyTemplates(Object obj, String str) throws Exception {
        int i = 0;
        Mode mode = this.ruleManager.getMode(str);
        if (obj instanceof Element) {
            Element element = (Element) obj;
            int iNodeCount = element.nodeCount();
            while (i < iNodeCount) {
                mode.fireRule(element.node(i));
                i++;
            }
            return;
        }
        if (obj instanceof Document) {
            Document document = (Document) obj;
            int iNodeCount2 = document.nodeCount();
            while (i < iNodeCount2) {
                mode.fireRule(document.node(i));
                i++;
            }
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                if (obj2 instanceof Element) {
                    applyTemplates((Element) obj2, str);
                } else if (obj2 instanceof Document) {
                    applyTemplates((Document) obj2, str);
                }
            }
        }
    }

    public void applyTemplates(Object obj, XPath xPath) throws Exception {
        applyTemplates(obj, xPath, this.modeName);
    }

    public void applyTemplates(Object obj, XPath xPath, String str) throws Exception {
        Mode mode = this.ruleManager.getMode(str);
        Iterator it = xPath.selectNodes(obj).iterator();
        while (it.hasNext()) {
            mode.fireRule((Node) it.next());
        }
    }

    public void applyTemplates(Object obj, org.jaxen.XPath xPath) throws Exception {
        applyTemplates(obj, xPath, this.modeName);
    }

    public void applyTemplates(Object obj, org.jaxen.XPath xPath, String str) throws Exception {
        Mode mode = this.ruleManager.getMode(str);
        Iterator it = xPath.selectNodes(obj).iterator();
        while (it.hasNext()) {
            mode.fireRule((Node) it.next());
        }
    }

    public void clear() {
        this.ruleManager.clear();
    }

    public String getModeName() {
        return this.modeName;
    }

    public Action getValueOfAction() {
        return this.ruleManager.getValueOfAction();
    }

    public void removeRule(Rule rule) {
        this.ruleManager.removeRule(rule);
    }

    public void m8874run(Object obj) throws Exception {
        m8875run(obj, this.modeName);
    }

    public void m8875run(Object obj, String str) throws Exception {
        if (obj instanceof Node) {
            m8879run((Node) obj, str);
        } else if (obj instanceof List) {
            m8877run((List) obj, str);
        }
    }

    public void m8876run(List list) throws Exception {
        m8877run(list, this.modeName);
    }

    public void m8877run(List list, String str) throws Exception {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj instanceof Node) {
                m8879run((Node) obj, str);
            }
        }
    }

    public void m8878run(Node node) throws Exception {
        m8879run(node, this.modeName);
    }

    public void m8879run(Node node, String str) throws Exception {
        this.ruleManager.getMode(str).fireRule(node);
    }

    public void setModeName(String str) {
        this.modeName = str;
    }

    public void setValueOfAction(Action action) {
        this.ruleManager.setValueOfAction(action);
    }
}
