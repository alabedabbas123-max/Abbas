package com.github.megatronking.svg.generator.vector.parser;

import com.github.megatronking.svg.generator.xml.CommonAbstractAttributeParser;
import com.github.megatronking.svg.generator.vector.model.Path;
import com.github.megatronking.svg.generator.vector.model.VectorConstants;
import org.dom4j.Element;

public class PathAttributeParser extends CommonAbstractAttributeParser<Path> {
    public void parse(Element element, Path path) {
        path.name = parseString(element, "name");
        path.fillColor = parseColor(element, VectorConstants.ATTR_FILL_COLOR);
        path.pathData = parseString(element, VectorConstants.ATTR_PATH_DATA);
        path.fillAlpha = parseFloat(element, VectorConstants.ATTR_FILL_ALPHA, 1.0f);
        path.fillType = parseString(element, VectorConstants.ATTR_FILL_TYPE);
        path.strokeLineCap = parseString(element, VectorConstants.ATTR_STROKE_LINE_CAP, "butt");
        path.strokeLineJoin = parseString(element, VectorConstants.ATTR_STROKE_LINE_JOIN, "miter");
        path.strokeMiterLimit = parseFloat(element, VectorConstants.ATTR_STROKE_MITER_LIMIT, 4);
        path.strokeColor = parseColor(element, VectorConstants.ATTR_STROKE_COLOR);
        path.strokeAlpha = parseFloat(element, VectorConstants.ATTR_STROKE_ALPHA, 1.0f);
        path.strokeWidth = parseFloat(element, VectorConstants.ATTR_STROKE_WIDTH);
        path.trimPathEnd = parseFloat(element, VectorConstants.ATTR_TRIM_PATH_END, 1);
        path.trimPathOffset = parseFloat(element, VectorConstants.ATTR_TRIM_PATH_OFFSET);
        path.trimPathStart = parseFloat(element, VectorConstants.ATTR_TRIM_PATH_START);
    }

    @Override
    public void parse(Element element, Object obj) {
        parse(element, (Path) obj);
    }
}
