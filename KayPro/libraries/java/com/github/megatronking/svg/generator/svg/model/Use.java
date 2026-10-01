package com.github.megatronking.svg.generator.svg.model;

import com.github.megatronking.svg.generator.svg.utils.TransformUtils;

public class Use extends G {
    public float height;
    public String href;
    public float width;

    public float f4798x;

    public float f4799y;

    @Override
    public void transform(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f4798x != 0 || this.f4799y != 0) {
            if (this.matrix == null) {
                this.matrix = new float[]{1, 0, 0, 1, this.f4798x, this.f4799y};
            } else {
                this.matrix = TransformUtils.preConcat(this.matrix, new float[]{1, 0, 0, 1, this.f4798x, this.f4799y});
            }
        }
        super.transform(f, f2, f3, f4, f5, f6);
    }
}
