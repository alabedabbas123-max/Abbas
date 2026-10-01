package com.github.megatronking.svg.generator.utils;

import java.io.Serializable;

public class AffineTransform implements Cloneable, Serializable {
    private static final int APPLY_IDENTITY = 0;
    private static final int APPLY_SCALE = 2;
    private static final int APPLY_SHEAR = 4;
    private static final int APPLY_TRANSLATE = 1;
    public static final int TYPE_FLIP = 64;
    public static final int TYPE_GENERAL_ROTATION = 16;
    public static final int TYPE_GENERAL_SCALE = 4;
    public static final int TYPE_GENERAL_TRANSFORM = 32;
    public static final int TYPE_IDENTITY = 0;
    public static final int TYPE_MASK_ROTATION = 24;
    public static final int TYPE_MASK_SCALE = 6;
    public static final int TYPE_QUADRANT_ROTATION = 8;
    public static final int TYPE_TRANSLATION = 1;
    public static final int TYPE_UNIFORM_SCALE = 2;
    private static final int TYPE_UNKNOWN = -1;

    private float f4801m00;

    private float f4802m01;

    private float f4803m02;

    private float f4804m10;

    private float f4805m11;

    private float f4806m12;
    private transient int state;
    private transient int type;

    public AffineTransform(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f4801m00 = f;
        this.f4804m10 = f2;
        this.f4802m01 = f3;
        this.f4805m11 = f4;
        this.f4803m02 = f5;
        this.f4806m12 = f6;
        updateState();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    private void calculateType() {
        int i;
        int i2;
        int i3;
        double d;
        boolean z;
        double d2;
        boolean z2;
        double d3;
        boolean z3;
        double d4;
        boolean z4;
        int i4 = 0;
        updateState();
        switch (this.state) {
            case 0:
                i3 = 0;
                this.type = i3;
                break;
            case 1:
                i3 = 1;
                this.type = i3;
                break;
            case 2:
                i = 0;
                d = this.f4801m00;
                if (d < 0.0d) {
                    z = false;
                } else {
                    z = true;
                }
                d2 = this.f4805m11;
                if (d2 < 0.0d) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z ? z2 : !z2) {
                    if (z) {
                        if (d == d2) {
                            i3 = i | 2;
                        } else {
                            i3 = i | 4;
                        }
                    } else if (d != d2) {
                        i3 = i | 12;
                    } else if (d != -1.0d) {
                        i3 = i | 10;
                    } else {
                        i3 = i | 8;
                    }
                } else if (d == (-d2)) {
                    i3 = (d == 1.0d || d == -1.0d) ? i | 64 : i | 66;
                } else {
                    i3 = i | 68;
                }
                this.type = i3;
                break;
            case 3:
                i = 1;
                d = this.f4801m00;
                if (d < 0.0d) {
                    z = false;
                } else {
                    z = true;
                }
                d2 = this.f4805m11;
                if (d2 < 0.0d) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z) {
                    if (z) {
                        if (d == d2) {
                            i3 = i | 2;
                        } else {
                            i3 = i | 4;
                        }
                    } else if (d != d2) {
                        i3 = i | 12;
                    } else if (d != -1.0d) {
                        i3 = i | 10;
                    } else {
                        i3 = i | 8;
                    }
                } else if (z) {
                    if (d == d2) {
                        i3 = i | 2;
                    } else {
                        i3 = i | 4;
                    }
                } else if (d != d2) {
                    i3 = i | 12;
                } else if (d != -1.0d) {
                    i3 = i | 10;
                } else {
                    i3 = i | 8;
                }
                this.type = i3;
                break;
            case 4:
                i2 = 0;
                d3 = this.f4802m01;
                if (d3 < 0.0d) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                d4 = this.f4804m10;
                if (d4 < 0.0d) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 ? z4 : !z4) {
                    i3 = d3 == d4 ? i2 | 74 : i2 | 76;
                } else if (d3 != (-d4)) {
                    i3 = i2 | 12;
                } else if (d3 != 1.0d || d3 == -1.0d) {
                    i3 = i2 | 8;
                } else {
                    i3 = i2 | 10;
                }
                this.type = i3;
                break;
            case 5:
                i2 = 1;
                d3 = this.f4802m01;
                if (d3 < 0.0d) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                d4 = this.f4804m10;
                if (d4 < 0.0d) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z3) {
                    if (d3 != (-d4)) {
                        i3 = i2 | 12;
                    } else if (d3 != 1.0d) {
                        i3 = i2 | 8;
                    } else {
                        i3 = i2 | 8;
                    }
                } else if (d3 != (-d4)) {
                    i3 = i2 | 12;
                } else if (d3 != 1.0d) {
                    i3 = i2 | 8;
                } else {
                    i3 = i2 | 8;
                }
                this.type = i3;
                break;
            default:
                stateError();
            case 7:
                i4 = 1;
            case 6:
                double d5 = this.f4801m00;
                double d6 = this.f4802m01;
                double d7 = this.f4804m10;
                double d8 = this.f4805m11;
                if ((d5 * d6) + (d7 * d8) == 0) {
                    boolean z5 = d5 >= 0.0d;
                    boolean z6 = d8 >= 0.0d;
                    if (z5 ? z6 : !z6) {
                        i3 = (d5 == d8 && d6 == (-d7)) ? (d5 * d8) - (d6 * d7) != 1.0d ? i4 | 18 : i4 | 16 : i4 | 20;
                    } else if (d5 == (-d8) && d6 == d7) {
                        i3 = (d5 * d8) - (d6 * d7) != 1.0d ? i4 | 82 : i4 | 80;
                    } else {
                        i3 = i4 | 84;
                    }
                    this.type = i3;
                } else {
                    this.type = 32;
                }
                break;
        }
    }

    private void stateError() {
        throw new RuntimeException("missing case in transform state switch");
    }

    public void deltaTransform(float[] fArr, int i, float[] fArr2, int i2, int i3) {
        if (fArr2 == fArr && i2 > i && i2 < (i3 * 2) + i) {
            System.arraycopy(fArr, i, fArr2, i2, i3 * 2);
            i = i2;
        }
        switch (this.state) {
            case 0:
            case 1:
                if (fArr == fArr2 && i == i2) {
                    return;
                }
                System.arraycopy(fArr, i, fArr2, i2, i3 * 2);
                return;
            case 2:
            case 3:
                float f = this.f4801m00;
                float f2 = this.f4805m11;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        return;
                    }
                    int i4 = i2 + 1;
                    int i5 = i + 1;
                    fArr2[i2] = fArr[i] * f;
                    i2 = i4 + 1;
                    i = i5 + 1;
                    fArr2[i4] = fArr[i5] * f2;
                }
                break;
            case 4:
            case 5:
                float f3 = this.f4802m01;
                float f4 = this.f4804m10;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        return;
                    }
                    int i6 = i + 1;
                    float f5 = fArr[i];
                    int i7 = i2 + 1;
                    i = i6 + 1;
                    fArr2[i2] = fArr[i6] * f3;
                    i2 = i7 + 1;
                    fArr2[i7] = f5 * f4;
                }
                break;
            case 6:
            case 7:
                break;
            default:
                stateError();
                break;
        }
        float f6 = this.f4801m00;
        float f7 = this.f4802m01;
        float f8 = this.f4804m10;
        float f9 = this.f4805m11;
        while (true) {
            i3--;
            if (i3 < 0) {
                return;
            }
            int i8 = i + 1;
            float f10 = fArr[i];
            i = i8 + 1;
            float f11 = fArr[i8];
            int i9 = i2 + 1;
            fArr2[i2] = (f10 * f6) + (f11 * f7);
            i2 = i9 + 1;
            fArr2[i9] = (f11 * f9) + (f10 * f8);
        }
    }

    public int getType() {
        if (this.type == -1) {
            calculateType();
        }
        return this.type;
    }

    public Point transform(Point point, Point point2) {
        if (point2 == null) {
            point2 = new Point();
        }
        float x = point.getX();
        float y = point.getY();
        switch (this.state) {
            case 0:
                point2.m7065set(x, y);
                return point2;
            case 1:
                point2.m7065set(x + this.f4803m02, y + this.f4806m12);
                return point2;
            case 2:
                point2.m7065set(x * this.f4801m00, y * this.f4805m11);
                return point2;
            case 3:
                point2.m7065set((x * this.f4801m00) + this.f4803m02, (y * this.f4805m11) + this.f4806m12);
                return point2;
            case 4:
                point2.m7065set(y * this.f4802m01, x * this.f4804m10);
                return point2;
            case 5:
                point2.m7065set((y * this.f4802m01) + this.f4803m02, (x * this.f4804m10) + this.f4806m12);
                return point2;
            case 6:
                point2.m7065set((this.f4801m00 * x) + (this.f4802m01 * y), (x * this.f4804m10) + (y * this.f4805m11));
                return point2;
            default:
                stateError();
            case 7:
                point2.m7065set((this.f4801m00 * x) + (this.f4802m01 * y) + this.f4803m02, (x * this.f4804m10) + (y * this.f4805m11) + this.f4806m12);
                return point2;
        }
    }

    public void transform(float[] fArr, int i, float[] fArr2, int i2, int i3) {
        if (fArr2 == fArr && i2 > i && i2 < (i3 * 2) + i) {
            System.arraycopy(fArr, i, fArr2, i2, i3 * 2);
            i = i2;
        }
        switch (this.state) {
            case 0:
                if (fArr == fArr2 && i == i2) {
                    return;
                }
                System.arraycopy(fArr, i, fArr2, i2, i3 * 2);
                return;
            case 1:
                double d = this.f4803m02;
                double d2 = this.f4806m12;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        return;
                    }
                    int i4 = i2 + 1;
                    int i5 = i + 1;
                    fArr2[i2] = (float) (((double) fArr[i]) + d);
                    i2 = i4 + 1;
                    i = i5 + 1;
                    fArr2[i4] = (float) (((double) fArr[i5]) + d2);
                }
                break;
            case 2:
                double d3 = this.f4801m00;
                double d4 = this.f4805m11;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        return;
                    }
                    int i6 = i2 + 1;
                    int i7 = i + 1;
                    fArr2[i2] = (float) (((double) fArr[i]) * d3);
                    i2 = i6 + 1;
                    i = i7 + 1;
                    fArr2[i6] = (float) (((double) fArr[i7]) * d4);
                }
                break;
            case 3:
                double d5 = this.f4801m00;
                double d6 = this.f4803m02;
                double d7 = this.f4805m11;
                double d8 = this.f4806m12;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        return;
                    }
                    int i8 = i2 + 1;
                    int i9 = i + 1;
                    fArr2[i2] = (float) ((((double) fArr[i]) * d5) + d6);
                    i2 = i8 + 1;
                    i = i9 + 1;
                    fArr2[i8] = (float) ((((double) fArr[i9]) * d7) + d8);
                }
                break;
            case 4:
                double d9 = this.f4802m01;
                double d10 = this.f4804m10;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        return;
                    }
                    int i10 = i + 1;
                    double d11 = fArr[i];
                    int i11 = i2 + 1;
                    i = i10 + 1;
                    fArr2[i2] = (float) (((double) fArr[i10]) * d9);
                    i2 = i11 + 1;
                    fArr2[i11] = (float) (d11 * d10);
                }
                break;
            case 5:
                double d12 = this.f4802m01;
                double d13 = this.f4803m02;
                double d14 = this.f4804m10;
                double d15 = this.f4806m12;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        return;
                    }
                    int i12 = i + 1;
                    double d16 = fArr[i];
                    int i13 = i2 + 1;
                    i = i12 + 1;
                    fArr2[i2] = (float) ((((double) fArr[i12]) * d12) + d13);
                    i2 = i13 + 1;
                    fArr2[i13] = (float) ((d16 * d14) + d15);
                }
                break;
            case 6:
                double d17 = this.f4801m00;
                double d18 = this.f4802m01;
                double d19 = this.f4804m10;
                double d20 = this.f4805m11;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        return;
                    }
                    int i14 = i + 1;
                    double d21 = fArr[i];
                    i = i14 + 1;
                    double d22 = fArr[i14];
                    int i15 = i2 + 1;
                    fArr2[i2] = (float) ((d17 * d21) + (d18 * d22));
                    i2 = i15 + 1;
                    fArr2[i15] = (float) ((d22 * d20) + (d21 * d19));
                }
                break;
            case 7:
                break;
            default:
                stateError();
                break;
        }
        double d23 = this.f4801m00;
        double d24 = this.f4802m01;
        double d25 = this.f4803m02;
        double d26 = this.f4804m10;
        double d27 = this.f4805m11;
        double d28 = this.f4806m12;
        while (true) {
            i3--;
            if (i3 < 0) {
                return;
            }
            int i16 = i + 1;
            double d29 = fArr[i];
            i = i16 + 1;
            double d30 = fArr[i16];
            int i17 = i2 + 1;
            fArr2[i2] = (float) ((d23 * d29) + (d24 * d30) + d25);
            i2 = i17 + 1;
            fArr2[i17] = (float) ((d30 * d27) + (d29 * d26) + d28);
        }
    }

    void updateState() {
        if (this.f4802m01 == 0.0d && this.f4804m10 == 0.0d) {
            if (this.f4801m00 == 1.0d && this.f4805m11 == 1.0d) {
                if (this.f4803m02 == 0.0d && this.f4806m12 == 0.0d) {
                    this.state = 0;
                    this.type = 0;
                    return;
                } else {
                    this.state = 1;
                    this.type = 1;
                    return;
                }
            }
            if (this.f4803m02 == 0.0d && this.f4806m12 == 0.0d) {
                this.state = 2;
                this.type = -1;
                return;
            } else {
                this.state = 3;
                this.type = -1;
                return;
            }
        }
        if (this.f4801m00 == 0.0d && this.f4805m11 == 0.0d) {
            if (this.f4803m02 == 0.0d && this.f4806m12 == 0.0d) {
                this.state = 4;
                this.type = -1;
                return;
            } else {
                this.state = 5;
                this.type = -1;
                return;
            }
        }
        if (this.f4803m02 == 0.0d && this.f4806m12 == 0.0d) {
            this.state = 6;
            this.type = -1;
        } else {
            this.state = 7;
            this.type = -1;
        }
    }
}
