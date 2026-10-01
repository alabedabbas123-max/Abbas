package com.github.megatronking.svg.generator.svg.model;

import com.github.megatronking.svg.generator.svg.utils.PathBuilder;

public class Circle extends SvgNode {

    public float f4781cx;

    public float f4782cy;

    public float f4783r;

    @Override
    public void toPath() {
        if (Float.isNaN(this.f4781cx) || Float.isNaN(this.f4781cx) || this.f4783r <= 0) {
            return;
        }
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.absoluteMoveTo(this.f4781cx, this.f4782cy);
        pathBuilder.relativeMoveTo(-this.f4783r, 0);
        pathBuilder.relativeArcTo(this.f4783r, this.f4783r, false, true, true, this.f4783r * 2, 0);
        pathBuilder.relativeArcTo(this.f4783r, this.f4783r, false, true, true, this.f4783r * (-2), 0);
        this.pathData = pathBuilder.toString();
    }
}
