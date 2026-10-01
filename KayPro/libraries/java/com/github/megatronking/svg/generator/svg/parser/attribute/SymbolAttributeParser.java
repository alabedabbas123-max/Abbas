package com.github.megatronking.svg.generator.svg.parser.attribute;

import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.svg.model.Symbol;
import com.github.megatronking.svg.generator.svg.parser.SvgNodeAbstractAttributeParser;
import com.github.megatronking.svg.generator.utils.SCU;
import com.github.megatronking.svg.generator.utils.TextUtils;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class SymbolAttributeParser extends SvgNodeAbstractAttributeParser<Symbol> {
    @Override
    public void parse(Element element, SvgNode svgNode) throws DocumentException {
        parse(element, (Symbol) svgNode);
    }

    public void parse(Element element, Symbol symbol) throws DocumentException {
        super.parse(element, symbol);
        String string = parseString(element, SvgConstants.ATTR_VIEW_BOX1, (String) null);
        if (string == null) {
            string = parseString(element, SvgConstants.ATTR_VIEW_BOX2, (String) null);
        }
        if (string == null) {
            string = parseString(element, SvgConstants.ATTR_VIEW_PORT1, (String) null);
        }
        if (string == null) {
            string = parseString(element, SvgConstants.ATTR_VIEW_PORT2, (String) null);
        }
        if (string == null) {
            symbol.viewBox = new float[4];
            return;
        }
        String[] strArrSplit = TextUtils.removeMultiSpace(string).trim().split(" ");
        symbol.viewBox = new float[4];
        for (int i = 0; i < strArrSplit.length; i++) {
            symbol.viewBox[i] = SCU.parseFloat(strArrSplit[i], 0.0f);
        }
    }
}
