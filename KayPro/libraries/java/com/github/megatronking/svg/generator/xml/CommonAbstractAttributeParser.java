package com.github.megatronking.svg.generator.xml;

import com.github.megatronking.svg.generator.utils.SCU;
import com.github.megatronking.svg.generator.utils.Color;
import com.github.megatronking.svg.generator.utils.Dimen;
import org.dom4j.Attribute;
import org.dom4j.Element;

public abstract class CommonAbstractAttributeParser<T> implements IAttributeParser<T> {
    protected boolean parseBoolean(Element element, String str) {
        return parseBoolean(element, str, false);
    }

    protected boolean parseBoolean(Element element, String str, boolean z) {
        return SCU.parseBoolean(parseString(element, str), z);
    }

    protected int parseColor(Element element, String str) {
        return Color.convert(parseString(element, str));
    }

    protected int parseColor(Element element, String str, int i) {
        return Color.convert(parseString(element, str), i);
    }

    protected float parseDimen(Element element, String str) {
        return Dimen.convert(parseString(element, str));
    }

    protected float parseFloat(Element element, String str) {
        return parseFloat(element, str, 0.0f);
    }

    protected float parseFloat(Element element, String str, float f) {
        return SCU.parseFloat(parseString(element, str), f);
    }

    protected String parseString(Element element, String str) {
        Attribute attribute = element.attribute(str);
        return attribute == null ? (String) null : attribute.getValue();
    }

    protected String parseString(Element element, String str, String str2) {
        Attribute attribute = element.attribute(str);
        String value = attribute == null ? (String) null : attribute.getValue();
        return (value == null || value.trim().length() == 0) ? str2 : value;
    }
}
