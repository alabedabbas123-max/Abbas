package com.github.megatronking.svg.generator.vector.parser;

import com.github.megatronking.svg.generator.xml.ChildrenElementParser;
import com.github.megatronking.svg.generator.vector.model.Group;
import com.github.megatronking.svg.generator.vector.model.Path;
import com.github.megatronking.svg.generator.vector.model.Vector;
import com.github.megatronking.svg.generator.vector.model.VectorConstants;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class VectorElementParser extends ChildrenElementParser<Vector> {
    public VectorElementParser() {
        super(VectorParserImpl.VECTOR_ATTRIBUTE_PARSER);
    }

    protected void parseChild2(Element element, Vector vector) throws DocumentException {
        Group group = new Group((Group) null);
        if (VectorConstants.TAG_GROUP.equals(element.getName())) {
            Group group2 = new Group(group);
            vector.children.add(group2);
            VectorParserImpl.GROUP_ELEMENT_PARSER.parse(element, group2);
        }
        if (VectorConstants.TAG_PATH.equals(element.getName())) {
            Path path = new Path(group);
            vector.children.add(path);
            VectorParserImpl.PATH_ATTRIBUTE_PARSER.parse(element, path);
        }
        if (VectorConstants.TAG_CLIP_PATH.equals(element.getName())) {
            Path path2 = new Path(group);
            vector.children.add(path2);
            VectorParserImpl.CLIP_PATH_ATTRIBUTE_PARSER.parse(element, path2);
        }
    }

    @Override
    protected void parseChild(Element element, Vector vector) throws DocumentException {
        parseChild2(element, vector);
    }
}
