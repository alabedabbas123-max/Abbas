package org.dom4j.tree;

import java.util.Map;
import org.dom4j.Element;

public class DefaultProcessingInstruction extends FlyweightProcessingInstruction {
    private Element parent;

    public DefaultProcessingInstruction(String str, String str2) {
        super(str, str2);
    }

    public DefaultProcessingInstruction(String str, Map map) {
        super(str, map);
    }

    public DefaultProcessingInstruction(Element element, String str, String str2) {
        super(str, str2);
        this.parent = element;
    }

    @Override
    public Element getParent() {
        return this.parent;
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }

    @Override
    public void setParent(Element element) {
        this.parent = element;
    }

    @Override
    public void setTarget(String str) {
        this.target = str;
    }

    @Override
    public void setText(String str) {
        this.text = str;
        this.values = parseValues(str);
    }

    @Override
    public void setValue(String str, String str2) {
        this.values.put(str, str2);
    }

    @Override
    public void setValues(Map map) {
        this.values = map;
        this.text = toString(map);
    }

    @Override
    public boolean supportsParent() {
        return true;
    }
}
