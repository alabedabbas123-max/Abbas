package com.github.megatronking.svg.generator.xml;

import org.dom4j.DocumentException;
import org.dom4j.Element;

public interface IElementParser<T> {
    void parse(Element element, T t) throws DocumentException;
}
