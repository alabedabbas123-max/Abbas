package org.dom4j.swing;

import java.io.Serializable;
import org.dom4j.DocumentHelper;
import org.dom4j.XPath;

public class XMLTableColumnDefinition implements Serializable {
    public static final int NODE_TYPE = 3;
    public static final int NUMBER_TYPE = 2;
    public static final int OBJECT_TYPE = 0;
    public static final int STRING_TYPE = 1;
    static Class class$java$lang$Number;
    static Class class$java$lang$Object;
    static Class class$java$lang$String;
    static Class class$org$dom4j$Node;
    private XPath columnNameXPath;
    private String name;
    private int type;
    private XPath xpath;

    public XMLTableColumnDefinition() {
    }

    public XMLTableColumnDefinition(String str, String str2, int i) {
        this.name = str;
        this.type = i;
        this.xpath = createXPath(str2);
    }

    public XMLTableColumnDefinition(String str, XPath xPath, int i) {
        this.name = str;
        this.xpath = xPath;
        this.type = i;
    }

    public XMLTableColumnDefinition(XPath xPath, XPath xPath2, int i) {
        this.xpath = xPath2;
        this.columnNameXPath = xPath;
        this.type = i;
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static int parseType(String str) {
        if (str != null && str.length() > 0) {
            if (str.equals("string")) {
                return 1;
            }
            if (str.equals("number")) {
                return 2;
            }
            if (str.equals("node")) {
                return 3;
            }
        }
        return 0;
    }

    protected XPath createXPath(String str) {
        return DocumentHelper.createXPath(str);
    }

    public Class getColumnClass() {
        switch (this.type) {
            case 1:
                if (class$java$lang$String != null) {
                    return class$java$lang$String;
                }
                Class clsClass$ = class$("java.lang.String");
                class$java$lang$String = clsClass$;
                return clsClass$;
            case 2:
                if (class$java$lang$Number != null) {
                    return class$java$lang$Number;
                }
                Class clsClass$2 = class$("java.lang.Number");
                class$java$lang$Number = clsClass$2;
                return clsClass$2;
            case 3:
                if (class$org$dom4j$Node != null) {
                    return class$org$dom4j$Node;
                }
                Class clsClass$3 = class$("org.dom4j.Node");
                class$org$dom4j$Node = clsClass$3;
                return clsClass$3;
            default:
                if (class$java$lang$Object != null) {
                    return class$java$lang$Object;
                }
                Class clsClass$4 = class$("java.lang.Object");
                class$java$lang$Object = clsClass$4;
                return clsClass$4;
        }
    }

    public XPath getColumnNameXPath() {
        return this.columnNameXPath;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public Object getValue(Object obj) {
        switch (this.type) {
            case 1:
                return this.xpath.valueOf(obj);
            case 2:
                return this.xpath.numberValueOf(obj);
            case 3:
                return this.xpath.selectSingleNode(obj);
            default:
                return this.xpath.evaluate(obj);
        }
    }

    public XPath getXPath() {
        return this.xpath;
    }

    protected void handleException(Exception exc) {
        System.out.println(new StringBuffer().append("Caught: ").append(exc).toString());
    }

    public void setColumnNameXPath(XPath xPath) {
        this.columnNameXPath = xPath;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setXPath(XPath xPath) {
        this.xpath = xPath;
    }
}
