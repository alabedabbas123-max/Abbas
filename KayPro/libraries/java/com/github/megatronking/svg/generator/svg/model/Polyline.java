package com.github.megatronking.svg.generator.svg.model;

import com.github.megatronking.svg.generator.svg.utils.PathBuilder;

public class Polyline extends SvgNode {
    public String points;

    @Override
    public void toPath() {
        if (this.points == null || this.points.length() == 0) {
            return;
        }
        PathBuilder pathBuilder = new PathBuilder();
        String[] strArrSplit = this.points.split("[\\s,]+");
        float f = Float.parseFloat(strArrSplit[0]);
        float f2 = Float.parseFloat(strArrSplit[1]);
        pathBuilder.absoluteMoveTo(f, f2);
        int i = 2;
        float f3 = f;
        while (i < strArrSplit.length) {
            float f4 = Float.parseFloat(strArrSplit[i]);
            float f5 = Float.parseFloat(strArrSplit[i + 1]);
            pathBuilder.relativeLineTo(f4 - f3, f5 - f2);
            i += 2;
            f2 = f5;
            f3 = f4;
        }
        this.pathData = pathBuilder.toString();
    }
}
