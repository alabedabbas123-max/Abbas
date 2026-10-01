package com.github.megatronking.svg.generator.svg.parser.element;

import com.github.megatronking.svg.generator.svg.model.Defs;
import com.github.megatronking.svg.generator.svg.parser.EmptyAttributeParser;
import com.github.megatronking.svg.generator.svg.parser.SvgGroupNodeAbstractElementParser;

public class DefsElementParser extends SvgGroupNodeAbstractElementParser<Defs> {
    public DefsElementParser() {
        super(new EmptyAttributeParser());
    }
}
