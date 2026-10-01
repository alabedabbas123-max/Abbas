package com.github.megatronking.svg.generator.svg.parser.attribute;

import com.github.megatronking.svg.generator.svg.model.Svg;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.svg.parser.SvgNodeAbstractAttributeParser;
import com.github.megatronking.svg.generator.utils.SCU;
import com.github.megatronking.svg.generator.utils.TextUtils;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class SvgAttributeParser extends SvgNodeAbstractAttributeParser<Svg> {
    public void parse(Element element, Svg c1584Svg) throws DocumentException {
        super.parse(element, c1584Svg);
        c1584Svg.f4796w = parseDimen(element, "width");
        c1584Svg.f4795h = parseDimen(element, "height");
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
        if (string != null) {
            String[] strArrSplit = TextUtils.removeMultiSpace(string).trim().split(" ");
            c1584Svg.viewBox = new float[4];
            for (int i = 0; i < strArrSplit.length; i++) {
                c1584Svg.viewBox[i] = SCU.parseFloat(strArrSplit[i], 0.0f);
            }
        } else {
            c1584Svg.viewBox = new float[4];
        }
        if (c1584Svg.f4796w == 0) {
            c1584Svg.f4796w = c1584Svg.viewBox[2];
        }
        if (c1584Svg.f4795h == 0) {
            c1584Svg.f4795h = c1584Svg.viewBox[3];
        }
    }

    @Override
    public void parse(Element element, SvgNode svgNode) throws DocumentException {
        parse(element, (Svg) svgNode);
    }
}
