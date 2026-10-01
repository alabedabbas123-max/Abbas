package com.github.megatronking.svg.generator.vector.model;

import com.github.megatronking.svg.generator.utils.Matrix;
import java.util.ArrayList;
import java.util.List;

public class Group {
    public String name;
    public Group parentGroup;
    public float pivotX;
    public float pivotY;
    public float rotation;
    public float translateX;
    public float translateY;
    public float scaleX = 1.0f;
    public float scaleY = 1.0f;
    public List<Object> children = new ArrayList();

    public Group(Group group) {
        this.parentGroup = group;
    }

    public Matrix getMatrix() {
        Matrix matrix = new Matrix();
        matrix.postTranslate(-this.pivotX, -this.pivotY);
        matrix.postScale(this.scaleX, this.scaleY);
        matrix.postRotate(this.rotation, 0, 0);
        matrix.postTranslate(this.translateX + this.pivotX, this.translateY + this.pivotY);
        if (this.parentGroup == null) {
            return matrix;
        }
        Matrix matrix2 = this.parentGroup.getMatrix();
        matrix2.preConcat(matrix);
        return matrix2;
    }
}
