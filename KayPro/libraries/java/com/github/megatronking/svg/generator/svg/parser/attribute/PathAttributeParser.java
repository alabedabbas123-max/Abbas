package com.github.megatronking.svg.generator.svg.parser.attribute;

import com.github.megatronking.svg.generator.svg.model.Path;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.svg.parser.SvgNodeAbstractAttributeParser;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class PathAttributeParser extends SvgNodeAbstractAttributeParser<Path> {
    public void parse(Element element, Path path) throws DocumentException {
        super.parse(element, path);
        path.f4792d = parseString(element, "d");
        path.toPath();
    }

    @Override
    public void parse(Element element, SvgNode svgNode) throws DocumentException {
        parse(element, (Path) svgNode);
    }
}
