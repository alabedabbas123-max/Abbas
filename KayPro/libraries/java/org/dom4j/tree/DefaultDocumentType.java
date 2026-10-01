package org.dom4j.tree;

import java.util.List;

public class DefaultDocumentType extends AbstractDocumentType {
    protected String elementName;
    private List externalDeclarations;
    private List internalDeclarations;
    private String publicID;
    private String systemID;

    public DefaultDocumentType() {
    }

    public DefaultDocumentType(String str, String str2) {
        this.elementName = str;
        this.systemID = str2;
    }

    public DefaultDocumentType(String str, String str2, String str3) {
        this.elementName = str;
        this.publicID = str2;
        this.systemID = str3;
    }

    @Override
    public String getElementName() {
        return this.elementName;
    }

    @Override
    public List getExternalDeclarations() {
        return this.externalDeclarations;
    }

    @Override
    public List getInternalDeclarations() {
        return this.internalDeclarations;
    }

    @Override
    public String getPublicID() {
        return this.publicID;
    }

    @Override
    public String getSystemID() {
        return this.systemID;
    }

    @Override
    public void setElementName(String str) {
        this.elementName = str;
    }

    @Override
    public void setExternalDeclarations(List list) {
        this.externalDeclarations = list;
    }

    @Override
    public void setInternalDeclarations(List list) {
        this.internalDeclarations = list;
    }

    @Override
    public void setPublicID(String str) {
        this.publicID = str;
    }

    @Override
    public void setSystemID(String str) {
        this.systemID = str;
    }
}
