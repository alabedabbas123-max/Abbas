package com.github.megatronking.svg.generator.vector.parser;

import com.github.megatronking.svg.generator.xml.CommonAbstractAttributeParser;
import com.github.megatronking.svg.generator.vector.model.Group;
import com.github.megatronking.svg.generator.vector.model.VectorConstants;
import org.dom4j.Element;

public class GroupAttributeParser extends CommonAbstractAttributeParser<Group> {
    public void parse(Element element, Group group) {
        group.name = parseString(element, "name");
        group.pivotX = parseFloat(element, VectorConstants.ATTR_PIVOTX);
        group.pivotY = parseFloat(element, VectorConstants.ATTR_PIVOTY);
        group.scaleX = parseFloat(element, VectorConstants.ATTR_SCALEX, 1.0f);
        group.scaleY = parseFloat(element, VectorConstants.ATTR_SCALEY, 1.0f);
        group.rotation = parseFloat(element, VectorConstants.ATTR_ROTATION);
        group.translateX = parseFloat(element, VectorConstants.ATTR_TRANSLATEX);
        group.translateY = parseFloat(element, VectorConstants.ATTR_TRANSLATEY);
    }

    @Override
    public void parse(Element element, Object obj) {
        parse(element, (Group) obj);
    }
}
