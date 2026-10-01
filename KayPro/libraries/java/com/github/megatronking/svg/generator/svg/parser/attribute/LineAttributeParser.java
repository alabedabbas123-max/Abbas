package com.github.megatronking.svg.generator.svg.parser.attribute;

import com.github.megatronking.svg.generator.svg.model.Line;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.svg.parser.SvgNodeAbstractAttributeParser;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class LineAttributeParser extends SvgNodeAbstractAttributeParser<Line> {
    public void parse(Element element, Line line) throws DocumentException {
        super.parse(element, line);
        line.f4788x1 = parseFloat(element, SvgConstants.ATTR_X1);
        line.f4790y1 = parseFloat(element, SvgConstants.ATTR_Y1);
        line.f4789x2 = parseFloat(element, SvgConstants.ATTR_X2);
        line.f4791y2 = parseFloat(element, SvgConstants.ATTR_Y2);
        line.toPath();
    }

    @Override
    public void parse(Element element, SvgNode svgNode) throws DocumentException {
        parse(element, (Line) svgNode);
    }
}
