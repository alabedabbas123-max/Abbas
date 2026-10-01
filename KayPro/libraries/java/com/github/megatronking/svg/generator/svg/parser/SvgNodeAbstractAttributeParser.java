package com.github.megatronking.svg.generator.svg.parser;

import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.svg.utils.StyleUtils;
import com.github.megatronking.svg.generator.svg.utils.TransformUtils;
import com.github.megatronking.svg.generator.xml.CommonAbstractAttributeParser;
import com.github.megatronking.svg.generator.utils.SCU;
import java.util.HashMap;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public abstract class SvgNodeAbstractAttributeParser<T extends SvgNode> extends CommonAbstractAttributeParser<T> {
    private void handleCommonAttributes(Element element, SvgNode svgNode) {
        svgNode.f4797id = parseString(element, "id");
        svgNode.clazz = parseString(element, SvgConstants.ATTR_CLASS);
        String string = parseString(element, SvgConstants.ATTR_TRANSFORM);
        if (string != null) {
            if (string.startsWith("matrix")) {
                svgNode.matrix = new float[6];
                svgNode.matrix[0] = 1.0f;
                svgNode.matrix[3] = 1.0f;
                String[] strArrSplit = string.substring("matrix(".length(), string.length() - 1).split(",");
                for (int i = 0; i < strArrSplit.length; i++) {
                    svgNode.matrix[i] = SCU.parseFloat(strArrSplit[i].trim(), svgNode.matrix[i]);
                }
            } else {
                svgNode.matrix = TransformUtils.formatTransform(string);
            }
        }
        svgNode.styleMaps = StyleUtils.convertStyleString2Map(parseString(element, SvgConstants.ATTR_STYLE));
        if (svgNode.styleMaps == null) {
            svgNode.styleMaps = new HashMap();
        }
        String string2 = parseString(element, SvgConstants.ATTR_DISPLAY);
        if (string2 != null) {
            svgNode.styleMaps.put(SvgConstants.ATTR_DISPLAY, string2.trim());
        }
        String string3 = parseString(element, SvgConstants.ATTR_STROKE_WIDTH);
        if (string3 != null) {
            svgNode.styleMaps.put(SvgConstants.ATTR_STROKE_WIDTH, string3);
        }
        String string4 = parseString(element, SvgConstants.ATTR_STROKE);
        if (string4 != null) {
            svgNode.styleMaps.put(SvgConstants.ATTR_STROKE, string4);
        }
        String string5 = parseString(element, SvgConstants.ATTR_STROKE_LINEJOINE);
        if (string5 != null) {
            svgNode.styleMaps.put(SvgConstants.ATTR_STROKE_LINEJOINE, string5.trim());
        }
        String string6 = parseString(element, SvgConstants.ATTR_STROKE_LINECAP);
        if (string6 != null) {
            svgNode.styleMaps.put(SvgConstants.ATTR_STROKE_LINECAP, string6.trim());
        }
        String string7 = parseString(element, SvgConstants.ATTR_STROKE_MITERLIMIT);
        if (string7 != null) {
            svgNode.styleMaps.put(SvgConstants.ATTR_STROKE_MITERLIMIT, string7);
        }
        String string8 = parseString(element, SvgConstants.ATTR_STROKE_OPACITY);
        if (string8 != null) {
            svgNode.styleMaps.put(SvgConstants.ATTR_STROKE_OPACITY, string8);
        }
        String string9 = parseString(element, SvgConstants.ATTR_FILL);
        if (string9 != null) {
            svgNode.styleMaps.put(SvgConstants.ATTR_FILL, string9);
        }
        String string10 = parseString(element, SvgConstants.ATTR_FILL_OPACITY);
        if (string10 != null) {
            svgNode.styleMaps.put(SvgConstants.ATTR_FILL_OPACITY, string10);
        }
        String string11 = parseString(element, SvgConstants.ATTR_FILL_RULE);
        if (string11 != null) {
            svgNode.styleMaps.put(SvgConstants.ATTR_FILL_RULE, string11.trim());
        }
    }

    public void parse(Element element, T t) throws DocumentException {
        handleCommonAttributes(element, t);
    }

    @Override
    public void parse(Element element, Object obj) throws DocumentException {
        parse(element, (SvgNode) obj);
    }
}
