package org.dom4j.tree;

import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.Text;

public class FlyweightText extends AbstractText implements Text {
    protected String text;

    public FlyweightText(String str) {
        this.text = str;
    }

    @Override
    protected Node createXPathResult(Element element) {
        return new DefaultText(element, getText());
    }

    @Override
    public String getText() {
        return this.text;
    }
}
