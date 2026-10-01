package com.github.megatronking.svg.generator.svg.parser.element;

import com.github.megatronking.svg.generator.svg.model.Symbol;
import com.github.megatronking.svg.generator.svg.parser.SvgGroupNodeAbstractElementParser;
import com.github.megatronking.svg.generator.svg.parser.attribute.SymbolAttributeParser;

public class SymbolElementParser extends SvgGroupNodeAbstractElementParser<Symbol> {
    public SymbolElementParser() {
        super(new SymbolAttributeParser());
    }
}
