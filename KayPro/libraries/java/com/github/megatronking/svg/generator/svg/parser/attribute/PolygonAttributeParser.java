package com.github.megatronking.svg.generator.svg.parser.attribute;

import com.github.megatronking.svg.generator.svg.model.Polygon;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.svg.parser.SvgNodeAbstractAttributeParser;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class PolygonAttributeParser extends SvgNodeAbstractAttributeParser<Polygon> {
    public void parse(Element element, Polygon polygon) throws DocumentException {
        super.parse(element, polygon);
        polygon.points = parseString(element, SvgConstants.ATTR_POINTS);
        polygon.toPath();
    }

    @Override
    public void parse(Element element, SvgNode svgNode) throws DocumentException {
        parse(element, (Polygon) svgNode);
    }
}
