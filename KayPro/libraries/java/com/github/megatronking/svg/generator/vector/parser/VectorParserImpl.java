package com.github.megatronking.svg.generator.vector.parser;

public interface VectorParserImpl {
    public static final VectorAttributeParser VECTOR_ATTRIBUTE_PARSER = new VectorAttributeParser();
    public static final GroupAttributeParser GROUP_ATTRIBUTE_PARSER = new GroupAttributeParser();
    public static final PathAttributeParser PATH_ATTRIBUTE_PARSER = new PathAttributeParser();
    public static final ClipPathAttributeParser CLIP_PATH_ATTRIBUTE_PARSER = new ClipPathAttributeParser();
    public static final VectorElementParser VECTOR_ELEMENT_PARSER = new VectorElementParser();
    public static final GroupElementParser GROUP_ELEMENT_PARSER = new GroupElementParser();
}
