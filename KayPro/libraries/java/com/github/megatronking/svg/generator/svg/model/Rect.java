package com.github.megatronking.svg.generator.svg.model;

import com.github.megatronking.svg.generator.svg.utils.PathBuilder;

public class Rect extends SvgNode {
    public float height;
    public float width;

    public float f4793x;

    public float f4794y;

    @Override
    public void toPath() {
        if (Float.isNaN(this.f4793x) || Float.isNaN(this.f4794y)) {
            return;
        }
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.absoluteMoveTo(this.f4793x, this.f4794y);
        pathBuilder.relativeHorizontalTo(this.width);
        pathBuilder.relativeVerticalTo(this.height);
        pathBuilder.relativeHorizontalTo(-this.width);
        pathBuilder.relativeClose();
        this.pathData = pathBuilder.toString();
    }
}
