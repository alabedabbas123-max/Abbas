package com.github.megatronking.svg.generator.svg.parser.attribute;

import com.github.megatronking.svg.generator.svg.model.Polyline;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.svg.parser.SvgNodeAbstractAttributeParser;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class PolylineAttributeParser extends SvgNodeAbstractAttributeParser<Polyline> {
    public void parse(Element element, Polyline polyline) throws DocumentException {
        super.parse(element, polyline);
        polyline.points = parseString(element, SvgConstants.ATTR_POINTS);
        polyline.toPath();
    }

    @Override
    public void parse(Element element, SvgNode svgNode) throws DocumentException {
        parse(element, (Polyline) svgNode);
    }
}
