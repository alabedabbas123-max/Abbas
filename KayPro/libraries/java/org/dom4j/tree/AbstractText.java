package org.dom4j.tree;

import java.io.IOException;
import java.io.Writer;
import org.dom4j.Text;
import org.dom4j.Visitor;

public abstract class AbstractText extends AbstractCharacterData implements Text {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String asXML() {
        return getText();
    }

    @Override
    public short getNodeType() {
        return (short) 3;
    }

    public String toString() {
        return new StringBuffer().append(super.toString()).append(" [Text: \"").append(getText()).append("\"]").toString();
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write(getText());
    }
}
