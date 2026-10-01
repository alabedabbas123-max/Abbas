package com.github.megatronking.svg.generator.svg.parser.attribute;

import com.github.megatronking.svg.generator.svg.model.Ellipse;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.svg.parser.SvgNodeAbstractAttributeParser;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class EllipseAttributeParser extends SvgNodeAbstractAttributeParser<Ellipse> {
    public void parse(Element element, Ellipse ellipse) throws DocumentException {
        super.parse(element, ellipse);
        ellipse.f4784cx = parseFloat(element, SvgConstants.ATTR_CX);
        ellipse.f4785cy = parseFloat(element, SvgConstants.ATTR_CY);
        ellipse.f4786rx = parseFloat(element, SvgConstants.ATTR_RX);
        ellipse.f4787ry = parseFloat(element, SvgConstants.ATTR_RY);
        ellipse.toPath();
    }

    @Override
    public void parse(Element element, SvgNode svgNode) throws DocumentException {
        parse(element, (Ellipse) svgNode);
    }
}
