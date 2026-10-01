package com.github.megatronking.svg.generator.svg.parser;

import com.github.megatronking.svg.generator.xml.CommonAbstractAttributeParser;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class EmptyAttributeParser<T> extends CommonAbstractAttributeParser<T> {
    @Override
    public void parse(Element element, T t) throws DocumentException {
    }
}
