package com.github.megatronking.svg.generator.svg.model;

import com.github.megatronking.svg.generator.svg.utils.PathBuilder;

public class Line extends SvgNode {

    public float f4788x1;

    public float f4789x2;

    public float f4790y1;

    public float f4791y2;

    @Override
    public void toPath() {
        if (Float.isNaN(this.f4788x1) || Float.isNaN(this.f4790y1) || Float.isNaN(this.f4789x2) || Float.isNaN(this.f4791y2)) {
            return;
        }
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.absoluteMoveTo(this.f4788x1, this.f4790y1);
        pathBuilder.absoluteLineTo(this.f4789x2, this.f4791y2);
        this.pathData = pathBuilder.toString();
    }
}
