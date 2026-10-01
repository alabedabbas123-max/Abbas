package com.github.megatronking.svg.generator.render;

import com.github.megatronking.svg.generator.utils.Matrix;
import com.github.megatronking.svg.generator.utils.PathDataNode;
import com.github.megatronking.svg.generator.vector.model.ClipPath;
import com.github.megatronking.svg.generator.vector.model.Path;
import org.apache.commons.io.IOUtils;

public class VectorPathRenderer extends NotifyVectorRenderer<Path> {
    private boolean isFillPaintInited;
    private boolean isStrokePaintInited;

    private void addCommand(float[] fArr, char c, char c2, float[] fArr2) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        switch (c2) {
            case 'A':
            case 'a':
                i = 7;
                f = f10;
                f2 = f9;
                break;
            case 'C':
            case 'c':
                i = 6;
                f = f10;
                f2 = f9;
                break;
            case 'H':
            case 'V':
            case 'h':
            case 'v':
                i = 1;
                f = f10;
                f2 = f9;
                break;
            case 'L':
            case 'M':
            case 'T':
            case 'l':
            case 'm':
            case 't':
                i = 2;
                f = f10;
                f2 = f9;
                break;
            case 'Q':
            case 'S':
            case 'q':
            case 's':
                i = 4;
                f = f10;
                f2 = f9;
                break;
            case 'Z':
            case 'z':
                notifyResult("mPath.close();");
                notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.moveTo(").append(f11).toString()).append("f, ").toString()).append(f12).toString()).append("f);").toString());
                i = 2;
                f = f12;
                f2 = f11;
                f8 = f12;
                f7 = f11;
                break;
            default:
                i = 2;
                f = f10;
                f2 = f9;
                break;
        }
        int i2 = 0;
        float f13 = f12;
        float f14 = f11;
        float f15 = f8;
        float f16 = f7;
        while (i2 < fArr2.length) {
            switch (c2) {
                case 'A':
                    drawArc(f16, f15, fArr2[i2 + 5], fArr2[i2 + 6], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != ((float) 0), fArr2[i2 + 4] != ((float) 0));
                    float f17 = fArr2[i2 + 5];
                    float f18 = fArr2[i2 + 6];
                    f3 = f14;
                    f = f18;
                    f2 = f17;
                    f4 = f13;
                    f15 = f18;
                    f16 = f17;
                    break;
                case 'C':
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.cubicTo(").append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f, ").toString()).append(fArr2[i2 + 2]).toString()).append("f, ").toString()).append(fArr2[i2 + 3]).toString()).append("f, ").toString()).append(fArr2[i2 + 4]).toString()).append("f, ").toString()).append(fArr2[i2 + 5]).toString()).append("f);").toString());
                    f16 = fArr2[i2 + 4];
                    f15 = fArr2[i2 + 5];
                    f2 = fArr2[i2 + 2];
                    f = fArr2[i2 + 3];
                    f3 = f14;
                    f4 = f13;
                    break;
                case 'H':
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.lineTo(").append(fArr2[i2]).toString()).append("f, ").toString()).append(f15).toString()).append("f);").toString());
                    f16 = fArr2[i2];
                    f3 = f14;
                    f4 = f13;
                    break;
                case 'L':
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.lineTo(").append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f);").toString());
                    f16 = fArr2[i2];
                    f15 = fArr2[i2 + 1];
                    f3 = f14;
                    f4 = f13;
                    break;
                case 'M':
                    f16 = fArr2[i2];
                    f15 = fArr2[i2 + 1];
                    if (i2 > 0) {
                        notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.lineTo(").append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f);").toString());
                    } else {
                        notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.moveTo(").append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f);").toString());
                        f13 = f15;
                        f14 = f16;
                    }
                    f3 = f14;
                    f4 = f13;
                    break;
                case 'Q':
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.quadTo(").append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f, ").toString()).append(fArr2[i2 + 2]).toString()).append("f, ").toString()).append(fArr2[i2 + 3]).toString()).append("f);").toString());
                    f2 = fArr2[i2];
                    f = fArr2[i2 + 1];
                    f16 = fArr2[i2 + 2];
                    f15 = fArr2[i2 + 3];
                    f3 = f14;
                    f4 = f13;
                    break;
                case 'S':
                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                        f16 = (2 * f16) - f2;
                        f15 = (2 * f15) - f;
                    }
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.cubicTo(").append(f16).toString()).append("f, ").toString()).append(f15).toString()).append("f, ").toString()).append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f, ").toString()).append(fArr2[i2 + 2]).toString()).append("f, ").toString()).append(fArr2[i2 + 3]).toString()).append("f);").toString());
                    f2 = fArr2[i2];
                    f = fArr2[i2 + 1];
                    f16 = fArr2[i2 + 2];
                    f15 = fArr2[i2 + 3];
                    f3 = f14;
                    f4 = f13;
                    break;
                case 'T':
                    if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                        f = (f15 * 2) - f;
                        f2 = (2 * f16) - f2;
                    } else {
                        f = f15;
                        f2 = f16;
                    }
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.quadTo(").append(f2).toString()).append("f, ").toString()).append(f).toString()).append("f, ").toString()).append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f);").toString());
                    f16 = fArr2[i2];
                    f15 = fArr2[i2 + 1];
                    f3 = f14;
                    f4 = f13;
                    break;
                case 'V':
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.lineTo(").append(f16).toString()).append("f, ").toString()).append(fArr2[i2]).toString()).append("f);").toString());
                    f15 = fArr2[i2];
                    f3 = f14;
                    f4 = f13;
                    break;
                case 'a':
                    drawArc(f16, f15, fArr2[i2 + 5] + f16, fArr2[i2 + 6] + f15, fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != ((float) 0), fArr2[i2 + 4] != ((float) 0));
                    float f19 = f16 + fArr2[i2 + 5];
                    float f20 = fArr2[i2 + 6] + f15;
                    f3 = f14;
                    f = f20;
                    f2 = f19;
                    f4 = f13;
                    f15 = f20;
                    f16 = f19;
                    break;
                case 'c':
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.rCubicTo(").append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f, ").toString()).append(fArr2[i2 + 2]).toString()).append("f, ").toString()).append(fArr2[i2 + 3]).toString()).append("f, ").toString()).append(fArr2[i2 + 4]).toString()).append("f, ").toString()).append(fArr2[i2 + 5]).toString()).append("f);").toString());
                    float f21 = fArr2[i2 + 2];
                    float f22 = fArr2[i2 + 3];
                    float f23 = f16 + fArr2[i2 + 4];
                    f = f22 + f15;
                    f2 = f16 + f21;
                    f3 = f14;
                    f4 = f13;
                    f15 = fArr2[i2 + 5] + f15;
                    f16 = f23;
                    break;
                case 'h':
                    notifyResult(new StringBuffer().append(new StringBuffer().append("mPath.rLineTo(").append(fArr2[i2]).toString()).append("f, 0f);").toString());
                    f16 += fArr2[i2];
                    f3 = f14;
                    f4 = f13;
                    break;
                case 'l':
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.rLineTo(").append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f);").toString());
                    f16 += fArr2[i2];
                    f15 += fArr2[i2 + 1];
                    f3 = f14;
                    f4 = f13;
                    break;
                case 'm':
                    f16 += fArr2[i2];
                    f15 += fArr2[i2 + 1];
                    if (i2 > 0) {
                        notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.rLineTo(").append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f);").toString());
                    } else {
                        notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.rMoveTo(").append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f);").toString());
                        f13 = f15;
                        f14 = f16;
                    }
                    f3 = f14;
                    f4 = f13;
                    break;
                case 'q':
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.rQuadTo(").append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f, ").toString()).append(fArr2[i2 + 2]).toString()).append("f, ").toString()).append(fArr2[i2 + 3]).toString()).append("f);").toString());
                    float f24 = fArr2[i2];
                    float f25 = fArr2[i2 + 1];
                    float f26 = f16 + fArr2[i2 + 2];
                    f = f25 + f15;
                    f2 = f16 + f24;
                    f3 = f14;
                    f4 = f13;
                    f15 = fArr2[i2 + 3] + f15;
                    f16 = f26;
                    break;
                case 's':
                    float f27 = 0;
                    float f28 = 0;
                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                        f27 = f16 - f2;
                        f6 = f15 - f;
                    } else {
                        f6 = f28;
                    }
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.rCubicTo(").append(f27).toString()).append("f, ").toString()).append(f6).toString()).append("f, ").toString()).append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f, ").toString()).append(fArr2[i2 + 2]).toString()).append("f, ").toString()).append(fArr2[i2 + 3]).toString()).append("f);").toString());
                    float f29 = fArr2[i2];
                    float f30 = fArr2[i2 + 1];
                    float f31 = f16 + fArr2[i2 + 2];
                    f = f30 + f15;
                    f2 = f16 + f29;
                    f3 = f14;
                    f4 = f13;
                    f15 = fArr2[i2 + 3] + f15;
                    f16 = f31;
                    break;
                case 't':
                    float f32 = 0;
                    float f33 = 0;
                    if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                        f32 = f16 - f2;
                        f5 = f15 - f;
                    } else {
                        f5 = f33;
                    }
                    notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.rQuadTo(").append(f32).toString()).append("f, ").toString()).append(f5).toString()).append("f, ").toString()).append(fArr2[i2]).toString()).append("f, ").toString()).append(fArr2[i2 + 1]).toString()).append("f);").toString());
                    float f34 = f16 + fArr2[i2];
                    f = f5 + f15;
                    f2 = f16 + f32;
                    f3 = f14;
                    f4 = f13;
                    f15 = fArr2[i2 + 1] + f15;
                    f16 = f34;
                    break;
                case 'v':
                    notifyResult(new StringBuffer().append(new StringBuffer().append("mPath.rLineTo(0f, ").append(fArr2[i2]).toString()).append("f);").toString());
                    f15 += fArr2[i2];
                    f3 = f14;
                    f4 = f13;
                    break;
                default:
                    f3 = f14;
                    f4 = f13;
                    break;
            }
            i2 += i;
            f13 = f4;
            f14 = f3;
            c = c2;
        }
        fArr[0] = f16;
        fArr[1] = f15;
        fArr[2] = f2;
        fArr[3] = f;
        fArr[4] = f14;
        fArr[5] = f13;
    }

    private void arcToBezier(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        int iCeil = (int) Math.ceil(Math.abs((((double) 4) * d9) / 3.141592653589793d));
        double dCos = Math.cos(d7);
        double dSin = Math.sin(d7);
        double dCos2 = Math.cos(d8);
        double dSin2 = Math.sin(d8);
        double d10 = d9 / ((double) iCeil);
        int i = 0;
        double d11 = (dSin2 * ((-d3) * dCos)) - (dCos2 * (d4 * dSin));
        double d12 = (d4 * dCos * dCos2) + ((-d3) * dSin * dSin2);
        while (i < iCeil) {
            double d13 = d8 + d10;
            double dSin3 = Math.sin(d13);
            double dCos3 = Math.cos(d13);
            double d14 = (((d3 * dCos) * dCos3) + d) - ((d4 * dSin) * dSin3);
            double d15 = (d4 * dCos * dSin3) + (d3 * dSin * dCos3) + d2;
            double d16 = (((-d3) * dCos) * dSin3) - ((d4 * dSin) * dCos3);
            double d17 = (dSin3 * (-d3) * dSin) + (dCos3 * d4 * dCos);
            double dTan = Math.tan((d13 - d8) / ((double) 2));
            double dSqrt = ((Math.sqrt((dTan * (((double) 3) * dTan)) + ((double) 4)) - ((double) 1)) * Math.sin(d13 - d8)) / ((double) 3);
            notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mPath.cubicTo(").append((float) ((d11 * dSqrt) + d5)).toString()).append("f, ").toString()).append((float) ((d12 * dSqrt) + d6)).toString()).append("f, ").toString()).append((float) (d14 - (dSqrt * d16))).toString()).append("f, ").toString()).append((float) (d15 - (dSqrt * d17))).toString()).append("f, ").toString()).append((float) d14).toString()).append("f, ").toString()).append((float) d15).toString()).append("f);").toString());
            i++;
            d8 = d13;
            d6 = d15;
            d5 = d14;
            d11 = d16;
            d12 = d17;
        }
    }

    private float cross(float f, float f2, float f3, float f4) {
        return (f * f4) - (f2 * f3);
    }

    private void drawArc(float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = ((((double) f) * dCos) + (((double) f2) * dSin)) / ((double) f5);
        double d4 = ((((double) (-f)) * dSin) + (((double) f2) * dCos)) / ((double) f6);
        double d5 = ((((double) f3) * dCos) + (((double) f4) * dSin)) / ((double) f5);
        double d6 = ((((double) (-f3)) * dSin) + (((double) f4) * dCos)) / ((double) f6);
        double d7 = d3 - d5;
        double d8 = d4 - d6;
        double d9 = (d3 + d5) / ((double) 2);
        double d10 = (d4 + d6) / ((double) 2);
        double d11 = (d7 * d7) + (d8 * d8);
        if (d11 == 0.0d) {
            return;
        }
        double d12 = (1.0d / d11) - 0.25d;
        if (d12 < 0.0d) {
            float fSqrt = (float) (Math.sqrt(d11) / 1.99999d);
            drawArc(f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d12);
        double d13 = d7 * dSqrt;
        double d14 = d8 * dSqrt;
        if (z ? z2 : !z2) {
            d = d9 - d14;
            d2 = d13 + d10;
        } else {
            d = d14 + d9;
            d2 = d10 - d13;
        }
        double dAtan2 = Math.atan2(d4 - d2, d3 - d);
        double dAtan3 = Math.atan2(d6 - d2, d5 - d) - dAtan2;
        if (z2 ? dAtan3 < 0 : dAtan3 >= 0) {
            dAtan3 = dAtan3 > ((double) 0) ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d15 = ((double) f5) * d;
        double d16 = d2 * ((double) f6);
        arcToBezier((d15 * dCos) - (d16 * dSin), (dSin * d15) + (d16 * dCos), f5, f6, f, f2, radians, dAtan2, dAtan3);
    }

    private void drawClipPath() {
        notifyResult("mRenderPath.addPath(mPath, mFinalPathMatrix);");
        notifyResult("canvas.clipPath(mRenderPath, Region.Op.REPLACE);");
    }

    private void drawPath(Path path, float f) {
        if (path.trimPathStart != 0.0f || path.trimPathEnd != 1.0f) {
            float f2 = path.trimPathStart;
            float f3 = path.trimPathOffset;
            float f4 = path.trimPathEnd;
            float f5 = path.trimPathOffset;
            notifyResult("if (mPathMeasure == null) {");
            notifyResult(new StringBuffer().append("    ").append("mPathMeasure = new PathMeasure();").toString());
            notifyResult("}");
            notifyResult("mPathMeasure.setPath(mPath, false);");
            notifyResult(new StringBuffer().append(new StringBuffer().append("float len").append(this.mCount).toString()).append(" = mPathMeasure.getLength();").toString());
            notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("float start").append(this.mCount).toString()).append(" = ").toString()).append((f2 + f3) % 1.0f).toString()).append(" * len").toString()).append(this.mCount).toString());
            notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("float end").append(this.mCount).toString()).append(" = ").toString()).append((f4 + f5) % 1.0f).toString()).append(" * len").toString()).append(this.mCount).toString());
            notifyResult("mPath.reset();");
            notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("if (start").append(this.mCount).toString()).append(" > end").toString()).append(this.mCount).toString()).append(") {").toString());
            notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("mPathMeasure.getSegment(start").toString()).append(this.mCount).toString()).append(", len").toString()).append(this.mCount).toString()).append(", path, true);").toString());
            notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("mPathMeasure.getSegment(0f, end").toString()).append(this.mCount).toString()).append(", path, true);").toString());
            notifyResult("} else {");
            notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("mPathMeasure.getSegment(start").toString()).append(this.mCount).toString()).append(", end").toString()).append(this.mCount).toString()).append(", path, true);").toString());
            notifyResult("}");
            notifyResult("mPath.rLineTo(0, 0);");
        }
        notifyResult("mRenderPath.addPath(mPath, mFinalPathMatrix);");
        String str = (String) null;
        if ("evenOdd".equals(path.fillType)) {
            str = "android.graphics.Path.FillType.EVEN_ODD";
        } else if ("nonZero".equals(path.fillType)) {
            str = "android.graphics.Path.FillType.WINDING";
        }
        if (str != null) {
            notifyResult(new StringBuffer().append(new StringBuffer().append("mRenderPath.setFillType(").append(str).toString()).append(");").toString());
        }
        if (path.fillColor != 0) {
            if (!this.isFillPaintInited) {
                this.isFillPaintInited = true;
                notifyResult("if (mFillPaint == null) {");
                notifyResult(new StringBuffer().append("    ").append("mFillPaint = new Paint();").toString());
                notifyResult(new StringBuffer().append("    ").append("mFillPaint.setStyle(Paint.Style.FILL);").toString());
                notifyResult(new StringBuffer().append("    ").append("mFillPaint.setAntiAlias(true);").toString());
                notifyResult("}");
            }
            notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mFillPaint.setColor(applyAlpha(").append(path.fillColor).toString()).append(", ").toString()).append(path.fillAlpha).toString()).append("f));").toString());
            notifyResult("mFillPaint.setColorFilter(filter);");
            notifyResult("canvas.drawPath(mRenderPath, mFillPaint);");
        }
        if (path.strokeColor != 0) {
            if (!this.isStrokePaintInited) {
                this.isStrokePaintInited = true;
                notifyResult("if (mStrokePaint == null) {");
                notifyResult(new StringBuffer().append("    ").append("mStrokePaint = new Paint();").toString());
                notifyResult(new StringBuffer().append("    ").append("mStrokePaint.setStyle(Paint.Style.STROKE);").toString());
                notifyResult(new StringBuffer().append("    ").append("mStrokePaint.setAntiAlias(true);").toString());
                notifyResult("}");
            }
            if (path.strokeLineJoin != null) {
                String str2 = (String) null;
                if ("bevel".equals(path.strokeLineJoin)) {
                    str2 = "Paint.Join.BEVEL";
                } else if ("miter".equals(path.strokeLineJoin)) {
                    str2 = "Paint.Join.MITER";
                } else if ("round".equals(path.strokeLineJoin)) {
                    str2 = "Paint.Join.ROUND";
                }
                notifyResult(new StringBuffer().append(new StringBuffer().append("mStrokePaint.setStrokeJoin(").append(str2).toString()).append(");").toString());
            }
            if (path.strokeLineCap != null) {
                String str3 = (String) null;
                if ("butt".equals(path.strokeLineCap)) {
                    str3 = "Paint.Cap.BUTT";
                } else if ("round".equals(path.strokeLineCap)) {
                    str3 = "Paint.Cap.ROUND";
                } else if ("square".equals(path.strokeLineCap)) {
                    str3 = "Paint.Cap.SQUARE";
                }
                notifyResult(new StringBuffer().append(new StringBuffer().append("mStrokePaint.setStrokeCap(").append(str3).toString()).append(");").toString());
            }
            notifyResult(new StringBuffer().append(new StringBuffer().append("mStrokePaint.setStrokeMiter(").append(path.strokeMiterLimit).toString()).append("f);").toString());
            notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mStrokePaint.setColor(applyAlpha(").append(path.strokeColor).toString()).append(", ").toString()).append(path.strokeAlpha).toString()).append("f));").toString());
            notifyResult("mStrokePaint.setColorFilter(filter);");
            notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mStrokePaint.setStrokeWidth(minScale * ").append(f).toString()).append("f * ").toString()).append(path.strokeWidth).toString()).append("f);").toString());
            notifyResult("canvas.drawPath(mRenderPath, mStrokePaint);");
        }
    }

    private void drawPathData(String str) {
        PathDataNode[] pathDataNodeArrCreateNodesFromPathData = PathDataNode.createNodesFromPathData(str);
        float[] fArr = new float[6];
        char c = 'm';
        for (int i = 0; i < pathDataNodeArrCreateNodesFromPathData.length; i++) {
            addCommand(fArr, c, pathDataNodeArrCreateNodesFromPathData[i].type, pathDataNodeArrCreateNodesFromPathData[i].params);
            c = pathDataNodeArrCreateNodesFromPathData[i].type;
        }
    }

    private float getMatrixScale(Matrix matrix) {
        float[] fArr = {0, 1, 1, 0};
        matrix.mapVectors(fArr);
        float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
        float fCross = cross(fArr[0], fArr[1], fArr[2], fArr[3]);
        float fMax = Math.max(fHypot, fHypot2);
        return fMax > ((float) 0) ? Math.abs(fCross) / fMax : 0;
    }

    private void initFinalPathMatrix(float[] fArr) {
        notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("mFinalPathMatrix.setValues(new float[]{").append(fArr[0]).toString()).append("f, ").toString()).append(fArr[1]).toString()).append("f, ").toString()).append(fArr[2]).toString()).append("f, ").toString()).append(fArr[3]).toString()).append("f, ").toString()).append(fArr[4]).toString()).append("f, ").toString()).append(fArr[5]).toString()).append("f, ").toString()).append(fArr[6]).toString()).append("f, ").toString()).append(fArr[7]).toString()).append("f, ").toString()).append(fArr[8]).toString()).append("f});").toString());
        notifyResult("mFinalPathMatrix.postScale(scaleX, scaleY);");
    }

    private void resetPaths() {
        notifyResult("mPath.reset();");
        notifyResult("mRenderPath.reset();");
    }

    @Override
    protected void notifyResult(String str) {
        super.notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("    ").toString()).append(str).toString()).append(IOUtils.LINE_SEPARATOR_UNIX).toString());
    }

    public void render(Path path) {
        super.render(path);
        if (path.fillColor == 0 && path.strokeColor == 0) {
            return;
        }
        float[] fArr = new float[9];
        Matrix matrix = path.parentGroup.getMatrix();
        matrix.getValues(fArr);
        float matrixScale = getMatrixScale(matrix);
        if (matrixScale != 0) {
            resetPaths();
            writeNewLine();
            initFinalPathMatrix(fArr);
            writeNewLine();
            drawPathData(path.pathData);
            writeNewLine();
            if (path instanceof ClipPath) {
                drawClipPath();
            } else {
                drawPath(path, matrixScale);
            }
        }
    }

    @Override
    public void render(Object obj) {
        render((Path) obj);
    }
}
