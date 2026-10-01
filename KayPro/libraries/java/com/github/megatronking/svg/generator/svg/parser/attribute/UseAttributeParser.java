package com.github.megatronking.svg.generator.svg.parser.attribute;

import com.github.megatronking.svg.generator.svg.model.Use;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.svg.parser.SvgNodeAbstractAttributeParser;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class UseAttributeParser extends SvgNodeAbstractAttributeParser<Use> {
    @Override
    public void parse(Element element, SvgNode svgNode) throws DocumentException {
        parse(element, (Use) svgNode);
    }

    public void parse(Element element, Use c1585Use) throws DocumentException {
        super.parse(element, c1585Use);
        c1585Use.f4798x = parseFloat(element, "x");
        c1585Use.f4799y = parseFloat(element, "y");
        c1585Use.width = parseFloat(element, "width");
        c1585Use.height = parseFloat(element, "height");
        c1585Use.href = parseString(element, "href");
    }
}
