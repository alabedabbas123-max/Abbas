package com.github.megatronking.svg.generator.svg.model;

import com.github.megatronking.svg.generator.svg.utils.TransformUtils;

public class G extends SvgGroupNode {
    @Override
    public void transform(float f, float f2, float f3, float f4, float f5, float f6) {
        for (SvgNode svgNode : this.children) {
            if (this.matrix == null) {
                svgNode.transform(f, f2, f3, f4, f5, f6);
            } else {
                this.matrix = TransformUtils.preConcat(this.matrix, new float[]{f, f2, f3, f4, f5, f6});
                svgNode.transform(this.matrix[0], this.matrix[1], this.matrix[2], this.matrix[3], this.matrix[4], this.matrix[5]);
            }
        }
    }
}
