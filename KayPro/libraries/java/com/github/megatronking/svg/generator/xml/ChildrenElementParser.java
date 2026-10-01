package com.github.megatronking.svg.generator.xml;

import java.util.Iterator;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public abstract class ChildrenElementParser<T> implements IElementParser<T> {
    private IAttributeParser<T> mAttributeParser;

    public ChildrenElementParser(IAttributeParser<T> iAttributeParser) {
        this.mAttributeParser = iAttributeParser;
    }

    @Override
    public void parse(Element element, T t) throws DocumentException {
        this.mAttributeParser.parse(element, t);
        Iterator it = element.elements().iterator();
        while (it.hasNext()) {
            parseChild((Element) it.next(), t);
        }
    }

    protected abstract void parseChild(Element element, T t) throws DocumentException;
}
