package com.github.megatronking.svg.generator.svg.parser.attribute;

import com.github.megatronking.svg.generator.svg.model.Rect;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.svg.parser.SvgNodeAbstractAttributeParser;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class RectAttributeParser extends SvgNodeAbstractAttributeParser<Rect> {
    public void parse(Element element, Rect rect) throws DocumentException {
        super.parse(element, rect);
        rect.f4793x = parseFloat(element, "x");
        rect.f4794y = parseFloat(element, "y");
        rect.width = parseFloat(element, "width");
        rect.height = parseFloat(element, "height");
        rect.toPath();
    }

    @Override
    public void parse(Element element, SvgNode svgNode) throws DocumentException {
        parse(element, (Rect) svgNode);
    }
}
