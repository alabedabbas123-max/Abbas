package com.github.megatronking.svg.generator.vector.parser;

import com.github.megatronking.svg.generator.xml.CommonAbstractAttributeParser;
import com.github.megatronking.svg.generator.vector.model.Vector;
import com.github.megatronking.svg.generator.vector.model.VectorConstants;
import org.dom4j.Element;

public class VectorAttributeParser extends CommonAbstractAttributeParser<Vector> {
    public void parse(Element element, Vector vector) {
        vector.name = parseString(element, "name");
        vector.alpha = parseFloat(element, VectorConstants.ATTR_ALPHA, 1.0f);
        vector.width = parseString(element, "width");
        vector.height = parseString(element, "height");
        vector.viewportWidth = parseFloat(element, VectorConstants.ATTR_VIEWPORT_WIDTH);
        vector.viewportHeight = parseFloat(element, VectorConstants.ATTR_VIEWPORT_HEIGHT);
        vector.autoMirrored = parseBoolean(element, VectorConstants.ATTR_AUTO_MIRRORED);
        vector.tint = parseColor(element, VectorConstants.ATTR_TINT);
        vector.tintMode = parseString(element, VectorConstants.ATTR_TINT_MODE);
    }

    @Override
    public void parse(Element element, Object obj) {
        parse(element, (Vector) obj);
    }
}
