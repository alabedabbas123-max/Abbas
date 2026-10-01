package org.dom4j.tree;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.dom4j.CDATA;
import org.dom4j.Visitor;

public abstract class AbstractCDATA extends AbstractCharacterData implements CDATA {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String asXML() {
        StringWriter stringWriter = new StringWriter();
        try {
            write(stringWriter);
        } catch (IOException e) {
        }
        return stringWriter.toString();
    }

    @Override
    public short getNodeType() {
        return (short) 4;
    }

    public String toString() {
        return new StringBuffer().append(super.toString()).append(" [CDATA: \"").append(getText()).append("\"]").toString();
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write("<![CDATA[");
        if (getText() != null) {
            writer.write(getText());
        }
        writer.write("]]>");
    }
}
