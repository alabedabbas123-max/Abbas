package com.github.megatronking.svg.generator.svg.parser.element;

import com.github.megatronking.svg.generator.svg.model.Svg;
import com.github.megatronking.svg.generator.svg.parser.SvgGroupNodeAbstractElementParser;
import com.github.megatronking.svg.generator.svg.parser.SvgParserImpl;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class SvgElementParser extends SvgGroupNodeAbstractElementParser<Svg> {
    public SvgElementParser() {
        super(SvgParserImpl.SVG_ATTRIBUTE_PARSER);
    }

    public void parse(Element element, Svg c1584Svg) throws DocumentException {
        super.parse(element, c1584Svg);
        c1584Svg.parseEnd();
    }

    @Override
    public void parse(Element element, Object obj) throws DocumentException {
        parse(element, (Svg) obj);
    }
}
