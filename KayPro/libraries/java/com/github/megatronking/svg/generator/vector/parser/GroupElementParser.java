package com.github.megatronking.svg.generator.vector.parser;

import com.github.megatronking.svg.generator.xml.ChildrenElementParser;
import com.github.megatronking.svg.generator.vector.model.Group;
import com.github.megatronking.svg.generator.vector.model.Path;
import com.github.megatronking.svg.generator.vector.model.VectorConstants;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class GroupElementParser extends ChildrenElementParser<Group> {
    public GroupElementParser() {
        super(VectorParserImpl.GROUP_ATTRIBUTE_PARSER);
    }

    protected void parseChild2(Element element, Group group) throws DocumentException {
        if (VectorConstants.TAG_GROUP.equals(element.getName())) {
            Group group2 = new Group(group);
            group.children.add(group2);
            VectorParserImpl.GROUP_ELEMENT_PARSER.parse(element, group2);
        }
        if (VectorConstants.TAG_PATH.equals(element.getName())) {
            Path path = new Path(group);
            group.children.add(path);
            VectorParserImpl.PATH_ATTRIBUTE_PARSER.parse(element, path);
        }
        if (VectorConstants.TAG_CLIP_PATH.equals(element.getName())) {
            Path path2 = new Path(group);
            group.children.add(path2);
            VectorParserImpl.CLIP_PATH_ATTRIBUTE_PARSER.parse(element, path2);
        }
    }

    @Override
    protected void parseChild(Element element, Group group) throws DocumentException {
        parseChild2(element, group);
    }
}
