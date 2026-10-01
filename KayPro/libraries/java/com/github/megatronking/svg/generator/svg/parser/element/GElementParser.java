package com.github.megatronking.svg.generator.svg.parser.element;

import com.github.megatronking.svg.generator.svg.model.G;
import com.github.megatronking.svg.generator.svg.parser.SvgGroupNodeAbstractElementParser;
import com.github.megatronking.svg.generator.svg.parser.SvgParserImpl;

public class GElementParser extends SvgGroupNodeAbstractElementParser<G> {
    public GElementParser() {
        super(SvgParserImpl.G_ATTRIBUTE_PARSER);
    }
}
