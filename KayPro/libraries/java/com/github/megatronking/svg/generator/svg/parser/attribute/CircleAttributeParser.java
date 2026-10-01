package com.github.megatronking.svg.generator.svg.parser.attribute;

import com.github.megatronking.svg.generator.svg.model.Circle;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.svg.parser.SvgNodeAbstractAttributeParser;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class CircleAttributeParser extends SvgNodeAbstractAttributeParser<Circle> {
    public void parse(Element element, Circle circle) throws DocumentException {
        super.parse(element, circle);
        circle.f4781cx = parseFloat(element, SvgConstants.ATTR_CX);
        circle.f4782cy = parseFloat(element, SvgConstants.ATTR_CY);
        circle.f4783r = parseFloat(element, "r");
        circle.toPath();
    }

    @Override
    public void parse(Element element, SvgNode svgNode) throws DocumentException {
        parse(element, (Circle) svgNode);
    }
}
