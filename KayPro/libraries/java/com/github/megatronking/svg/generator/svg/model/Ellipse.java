package com.github.megatronking.svg.generator.svg.model;

import com.github.megatronking.svg.generator.svg.utils.PathBuilder;

public class Ellipse extends SvgNode {

    public float f4784cx;

    public float f4785cy;

    public float f4786rx;

    public float f4787ry;

    @Override
    public void toPath() {
        if (Float.isNaN(this.f4784cx) || Float.isNaN(this.f4784cx) || this.f4786rx <= 0 || this.f4787ry <= 0) {
            return;
        }
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.absoluteMoveTo(this.f4784cx, this.f4785cy);
        pathBuilder.relativeMoveTo(-this.f4786rx, 0);
        pathBuilder.relativeArcTo(this.f4786rx, this.f4787ry, false, true, true, this.f4786rx * 2, 0);
        pathBuilder.relativeArcTo(this.f4786rx, this.f4787ry, false, true, true, this.f4786rx * (-2), 0);
        this.pathData = pathBuilder.toString();
    }
}
