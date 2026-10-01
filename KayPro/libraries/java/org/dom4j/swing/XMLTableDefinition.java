package org.dom4j.swing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.jaxen.VariableContext;

public class XMLTableDefinition implements Serializable, VariableContext {
    private XMLTableColumnDefinition[] columnArray;
    private Map columnNameIndex;
    private List columns = new ArrayList();
    private Object rowValue;
    private XPath rowXPath;
    private VariableContext variableContext;

    public static XMLTableDefinition load(Document document) {
        return load(document.getRootElement());
    }

    public static XMLTableDefinition load(Element element) {
        XMLTableDefinition xMLTableDefinition = new XMLTableDefinition();
        xMLTableDefinition.setRowExpression(element.attributeValue("select"));
        Iterator itElementIterator = element.elementIterator("column");
        while (itElementIterator.hasNext()) {
            Element element2 = (Element) itElementIterator.next();
            String strAttributeValue = element2.attributeValue("select");
            String text = element2.getText();
            String strAttributeValue2 = element2.attributeValue("type", "string");
            String strAttributeValue3 = element2.attributeValue("columnNameXPath");
            int type = XMLTableColumnDefinition.parseType(strAttributeValue2);
            if (strAttributeValue3 != null) {
                xMLTableDefinition.addColumnWithXPathName(strAttributeValue3, strAttributeValue, type);
            } else {
                xMLTableDefinition.addColumn(text, strAttributeValue, type);
            }
        }
        return xMLTableDefinition;
    }

    public void addColumn(String str, String str2) {
        addColumn(str, str2, 0);
    }

    public void addColumn(String str, String str2, int i) {
        addColumn(new XMLTableColumnDefinition(str, createColumnXPath(str2), i));
    }

    public void addColumn(XMLTableColumnDefinition xMLTableColumnDefinition) {
        clearCaches();
        this.columns.add(xMLTableColumnDefinition);
    }

    public void addColumnWithXPathName(String str, String str2, int i) {
        addColumn(new XMLTableColumnDefinition(createColumnXPath(str), createColumnXPath(str2), i));
    }

    public void addNumberColumn(String str, String str2) {
        addColumn(str, str2, 2);
    }

    public void addStringColumn(String str, String str2) {
        addColumn(str, str2, 1);
    }

    public void clear() {
        clearCaches();
        this.columns.clear();
    }

    protected void clearCaches() {
        this.columnArray = null;
        this.columnNameIndex = null;
    }

    protected XPath createColumnXPath(String str) {
        XPath xPathCreateXPath = createXPath(str);
        xPathCreateXPath.setVariableContext(this);
        return xPathCreateXPath;
    }

    protected XPath createXPath(String str) {
        return DocumentHelper.createXPath(str);
    }

    public XMLTableColumnDefinition getColumn(int i) {
        if (this.columnArray == null) {
            this.columnArray = new XMLTableColumnDefinition[this.columns.size()];
            this.columns.toArray(this.columnArray);
        }
        return this.columnArray[i];
    }

    public XMLTableColumnDefinition getColumn(String str) {
        if (this.columnNameIndex == null) {
            this.columnNameIndex = new HashMap();
            for (XMLTableColumnDefinition xMLTableColumnDefinition : this.columns) {
                this.columnNameIndex.put(xMLTableColumnDefinition.getName(), xMLTableColumnDefinition);
            }
        }
        return (XMLTableColumnDefinition) this.columnNameIndex.get(str);
    }

    public Class getColumnClass(int i) {
        return getColumn(i).getColumnClass();
    }

    public int getColumnCount() {
        return this.columns.size();
    }

    public String getColumnName(int i) {
        return getColumn(i).getName();
    }

    public XPath getColumnNameXPath(int i) {
        return getColumn(i).getColumnNameXPath();
    }

    public XPath getColumnXPath(int i) {
        return getColumn(i).getXPath();
    }

    public XPath getRowXPath() {
        return this.rowXPath;
    }

    public synchronized Object getValueAt(Object obj, int i) {
        Object value;
        XMLTableColumnDefinition column = getColumn(i);
        synchronized (this) {
            this.rowValue = obj;
            value = column.getValue(obj);
            this.rowValue = null;
        }
        return value;
        return value;
    }

    public Object getVariableValue(String str, String str2, String str3) {
        XMLTableColumnDefinition column = getColumn(str3);
        if (column != null) {
            return column.getValue(this.rowValue);
        }
        return null;
    }

    protected void handleException(Exception exc) {
        System.out.println(new StringBuffer().append("Caught: ").append(exc).toString());
    }

    public void removeColumn(XMLTableColumnDefinition xMLTableColumnDefinition) {
        clearCaches();
        this.columns.remove(xMLTableColumnDefinition);
    }

    public void setRowExpression(String str) {
        setRowXPath(createXPath(str));
    }

    public void setRowXPath(XPath xPath) {
        this.rowXPath = xPath;
    }
}
