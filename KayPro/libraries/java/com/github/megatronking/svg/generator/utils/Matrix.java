package com.github.megatronking.svg.generator.utils;

import java.io.PrintWriter;

public class Matrix {
    public static final int MPERSP_0 = 6;
    public static final int MPERSP_1 = 7;
    public static final int MPERSP_2 = 8;
    public static final int MSCALE_X = 0;
    public static final int MSCALE_Y = 4;
    public static final int MSKEW_X = 1;
    public static final int MSKEW_Y = 3;
    public static final int MTRANS_X = 2;
    public static final int MTRANS_Y = 5;
    private final float[] MATRIX = {1, 0, 0, 0, 1, 0, 0, 0, 1};

    public void getValues(float[] fArr) {
        if (fArr.length < 9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        fArr[0] = this.MATRIX[0];
        fArr[1] = this.MATRIX[1];
        fArr[2] = this.MATRIX[2];
        fArr[3] = this.MATRIX[3];
        fArr[4] = this.MATRIX[4];
        fArr[5] = this.MATRIX[5];
        fArr[6] = this.MATRIX[6];
        fArr[7] = this.MATRIX[7];
        fArr[8] = this.MATRIX[8];
    }

    public float[] mapVector(float f, float f2) {
        float[] fArr = {f, f2};
        fArr[0] = (this.MATRIX[0] * f) + (this.MATRIX[1] * f2);
        fArr[1] = (this.MATRIX[3] * f) + (this.MATRIX[4] * f2);
        return fArr;
    }

    public void mapVectors(float[] fArr) {
        if (fArr == null || fArr.length % 2 != 0) {
            return;
        }
        for (int i = 0; i < fArr.length / 2; i++) {
            float[] fArrMapVector = mapVector(fArr[i * 2], fArr[(i * 2) + 1]);
            fArr[i * 2] = fArrMapVector[0];
            fArr[(i * 2) + 1] = fArrMapVector[1];
        }
    }

    public void postRotate(float f, float f2, float f3) {
        double radians = Math.toRadians(f);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{fCos, -fSin, ((-f2) * fCos) + (f3 * fSin) + f2, fSin, fCos, ((fSin * (-f2)) - (fCos * f3)) + f3, 0, 0, 1});
        Matrix matrix2 = new Matrix();
        matrix2.setValues(this.MATRIX);
        matrix.preConcat(matrix2);
        m7064set(matrix);
    }

    public void postScale(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{f, 0, 0, 0, f2, 0, 0, 0, 1});
        Matrix matrix2 = new Matrix();
        matrix2.setValues(this.MATRIX);
        matrix.preConcat(matrix2);
        m7064set(matrix);
    }

    public void postTranslate(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{1, 0, f, 0, 1, f2, 0, 0, 1});
        Matrix matrix2 = new Matrix();
        matrix2.setValues(this.MATRIX);
        matrix.preConcat(matrix2);
        m7064set(matrix);
    }

    public void preConcat(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        setValues(new float[]{(this.MATRIX[0] * fArr[0]) + (this.MATRIX[1] * fArr[3]) + (this.MATRIX[2] * fArr[6]), (this.MATRIX[0] * fArr[1]) + (this.MATRIX[1] * fArr[4]) + (this.MATRIX[2] * fArr[7]), (this.MATRIX[0] * fArr[2]) + (this.MATRIX[1] * fArr[5]) + (this.MATRIX[2] * fArr[8]), (this.MATRIX[3] * fArr[0]) + (this.MATRIX[4] * fArr[3]) + (this.MATRIX[5] * fArr[6]), (this.MATRIX[3] * fArr[1]) + (this.MATRIX[4] * fArr[4]) + (this.MATRIX[5] * fArr[7]), (this.MATRIX[3] * fArr[2]) + (this.MATRIX[4] * fArr[5]) + (this.MATRIX[5] * fArr[8]), (this.MATRIX[6] * fArr[0]) + (this.MATRIX[7] * fArr[3]) + (this.MATRIX[8] * fArr[6]), (this.MATRIX[6] * fArr[1]) + (this.MATRIX[7] * fArr[4]) + (this.MATRIX[8] * fArr[7]), (fArr[8] * this.MATRIX[8]) + (this.MATRIX[6] * fArr[2]) + (this.MATRIX[7] * fArr[5])});
    }

    public void printShortString(PrintWriter printWriter) {
        float[] fArr = new float[9];
        getValues(fArr);
        printWriter.print('[');
        printWriter.print(fArr[0]);
        printWriter.print(", ");
        printWriter.print(fArr[1]);
        printWriter.print(", ");
        printWriter.print(fArr[2]);
        printWriter.print("][");
        printWriter.print(fArr[3]);
        printWriter.print(", ");
        printWriter.print(fArr[4]);
        printWriter.print(", ");
        printWriter.print(fArr[5]);
        printWriter.print("][");
        printWriter.print(fArr[6]);
        printWriter.print(", ");
        printWriter.print(fArr[7]);
        printWriter.print(", ");
        printWriter.print(fArr[8]);
        printWriter.print(']');
    }

    public void reset() {
        this.MATRIX[0] = 1;
        this.MATRIX[1] = 0;
        this.MATRIX[2] = 0;
        this.MATRIX[3] = 1;
        this.MATRIX[4] = 0;
        this.MATRIX[5] = 0;
        this.MATRIX[6] = 0;
        this.MATRIX[7] = 0;
        this.MATRIX[8] = 1;
    }

    public void m7064set(Matrix matrix) {
        if (matrix == null) {
            reset();
            return;
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        setValues(fArr);
    }

    public void setRotate(float f, float f2, float f3) {
        Matrix matrix = new Matrix();
        double radians = Math.toRadians(f);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        matrix.setValues(new float[]{fCos, -fSin, ((-f2) * fCos) + (f3 * fSin) + f2, fSin, fCos, ((fSin * (-f2)) - (fCos * f3)) + f3, 0, 0, 1});
        matrix.getValues(this.MATRIX);
    }

    public void setScale(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{f, 0, 0, 0, f2, 0, 0, 0, 1});
        matrix.getValues(this.MATRIX);
    }

    public void setTranslate(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{1, 0, f, 0, 1, f2, 0, 0, 1});
        matrix.getValues(this.MATRIX);
    }

    public void setValues(float[] fArr) {
        if (fArr.length < 9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.MATRIX[0] = fArr[0];
        this.MATRIX[1] = fArr[1];
        this.MATRIX[2] = fArr[2];
        this.MATRIX[3] = fArr[3];
        this.MATRIX[4] = fArr[4];
        this.MATRIX[5] = fArr[5];
        this.MATRIX[6] = fArr[6];
        this.MATRIX[7] = fArr[7];
        this.MATRIX[8] = fArr[8];
    }

    public String toShortString() {
        StringBuilder sb = new StringBuilder(64);
        toShortString(sb);
        return sb.toString();
    }

    public void toShortString(StringBuilder sb) {
        float[] fArr = new float[9];
        getValues(fArr);
        sb.append('[');
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(", ");
        sb.append(fArr[2]);
        sb.append("][");
        sb.append(fArr[3]);
        sb.append(", ");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("][");
        sb.append(fArr[6]);
        sb.append(", ");
        sb.append(fArr[7]);
        sb.append(", ");
        sb.append(fArr[8]);
        sb.append(']');
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Matrix{");
        toShortString(sb);
        sb.append('}');
        return sb.toString();
    }
}
