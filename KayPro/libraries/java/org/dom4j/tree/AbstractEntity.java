package org.dom4j.tree;

import java.io.IOException;
import java.io.Writer;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Visitor;

public abstract class AbstractEntity extends AbstractNode implements Entity {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String asXML() {
        return new StringBuffer().append("&").append(getName()).append(";").toString();
    }

    @Override
    public short getNodeType() {
        return (short) 5;
    }

    @Override
    public String getPath(Element element) {
        Element parent = getParent();
        return (parent == null || parent == element) ? "text()" : new StringBuffer().append(parent.getPath(element)).append("/text()").toString();
    }

    @Override
    public String getStringValue() {
        return new StringBuffer().append("&").append(getName()).append(";").toString();
    }

    @Override
    public String getUniquePath(Element element) {
        Element parent = getParent();
        return (parent == null || parent == element) ? "text()" : new StringBuffer().append(parent.getUniquePath(element)).append("/text()").toString();
    }

    public String toString() {
        return new StringBuffer().append(super.toString()).append(" [Entity: &").append(getName()).append(";]").toString();
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write("&");
        writer.write(getName());
        writer.write(";");
    }
}
