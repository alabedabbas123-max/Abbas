package com.github.megatronking.svg.generator.vector.model;

public class Path {
    public float fillAlpha;
    public int fillColor;
    public String fillType;
    public String name;
    public Group parentGroup;
    public String pathData;
    public float strokeAlpha;
    public int strokeColor;
    public String strokeLineCap;
    public String strokeLineJoin;
    public float strokeMiterLimit;
    public float strokeWidth;
    public float trimPathEnd;
    public float trimPathOffset;
    public float trimPathStart;

    public Path(Group group) {
        this.parentGroup = group;
    }
}
