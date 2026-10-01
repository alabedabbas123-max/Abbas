package com.github.megatronking.svg.generator.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PathDataNode {
    private static final char INIT_TYPE = ' ';
    private static final Map<Character, Integer> commandStepMap = new HashMap();
    public float[] params;
    public char type;

    private static class EllipseSolver {
        private boolean mDirectionChanged;
        private Point mDstMajorAxisPoint;
        private Point mDstMiddlePoint;
        private Point mDstMinorAxisPoint;
        private Point mMajorAxisPoint;
        private Point mMiddlePoint;
        private Point mMinorAxisPoint;
        private float mMajorAxis = 0;
        private float mMinorAxis = 0;
        private float mRotationDegree = 0;

        EllipseSolver(AffineTransform affineTransform, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
            Point pointComputeOriginalCenter = computeOriginalCenter(f, f2, f3, f4, f5, f6 != ((float) 0), f7 != ((float) 0), f8, f9);
            computeControlPoints(f3, f4, f5, pointComputeOriginalCenter.f4810x, pointComputeOriginalCenter.f4811y);
            this.mDstMiddlePoint = affineTransform.transform(this.mMiddlePoint, (Point) null);
            this.mDstMajorAxisPoint = affineTransform.transform(this.mMajorAxisPoint, (Point) null);
            this.mDstMinorAxisPoint = affineTransform.transform(this.mMinorAxisPoint, (Point) null);
            Point pointTransform = affineTransform.transform(pointComputeOriginalCenter, (Point) null);
            float x = pointTransform.getX();
            float y = pointTransform.getY();
            float f10 = this.mDstMiddlePoint.f4810x;
            float f11 = this.mDstMiddlePoint.f4811y;
            float f12 = this.mDstMajorAxisPoint.f4810x;
            float f13 = this.mDstMajorAxisPoint.f4811y;
            float f14 = this.mDstMinorAxisPoint.f4810x;
            float f15 = this.mDstMinorAxisPoint.f4811y;
            this.mDirectionChanged = computeDirectionChange(this.mMiddlePoint, this.mMajorAxisPoint, this.mMinorAxisPoint, this.mDstMiddlePoint, this.mDstMajorAxisPoint, this.mDstMinorAxisPoint);
            computeABThetaFromControlPoints(f10 - x, f11 - y, f12 - x, f13 - y, f14 - x, f15 - y);
        }

        private void computeABThetaFromControlPoints(float f, float f2, float f3, float f4, float f5, float f6) {
            float f7 = f * f;
            float f8 = f * f2;
            float f9 = f2 * f2;
            float f10 = f3 * f3;
            float f11 = f3 * f4;
            float f12 = f4 * f4;
            float f13 = f5 * f5;
            float f14 = f5 * f6;
            float f15 = f6 * f6;
            float f16 = -(((((((f9 * f11) * f13) - ((f8 * f12) * f13)) - ((f9 * f10) * f14)) + ((f7 * f12) * f14)) + ((f8 * f10) * f15)) - ((f7 * f11) * f15));
            if (f16 == 0) {
                return;
            }
            float f17 = (((((((-f9) * f11) + (f8 * f12)) + (f9 * f14)) - (f12 * f14)) - (f8 * f15)) + (f11 * f15)) / f16;
            float f18 = ((((((f9 * f10) - (f7 * f12)) - (f9 * f13)) + (f12 * f13)) + (f7 * f15)) - (f10 * f15)) / f16;
            float f19 = ((((((f8 * f10) - (f7 * f11)) - (f8 * f13)) + (f11 * f13)) + (f7 * f14)) - (f10 * f14)) / (-f16);
            if (f17 - f19 == 0) {
                this.mMinorAxis = (float) Math.hypot(f3, f4);
                this.mMajorAxis = this.mMinorAxis;
                this.mRotationDegree = 0;
                return;
            }
            float fAtan = (float) Math.atan(f18 / (f17 - f19));
            float f20 = fAtan / 2;
            if (Math.sin(fAtan) == 0) {
                this.mMinorAxis = (float) Math.sqrt(1 / f19);
                this.mMajorAxis = (float) Math.sqrt(1 / f17);
                this.mRotationDegree = 0;
                return;
            }
            float fSin = ((f18 / ((float) Math.sin(fAtan))) + (f17 + f19)) / 2;
            float f21 = (f19 + f17) - fSin;
            if (fSin == 0 || f21 == 0) {
                return;
            }
            this.mMinorAxis = (float) Math.sqrt(1 / fSin);
            this.mMajorAxis = (float) Math.sqrt(1 / f21);
            this.mRotationDegree = (float) Math.toDegrees(1.5707963267948966d + ((double) f20));
        }

        private void computeControlPoints(float f, float f2, float f3, float f4, float f5) {
            this.mMajorAxisPoint = new Point(f, 0.0f);
            this.mMinorAxisPoint = new Point(0.0f, f2);
            this.mMajorAxisPoint = rotatePoint2D(this.mMajorAxisPoint, f3);
            this.mMinorAxisPoint = rotatePoint2D(this.mMinorAxisPoint, f3);
            this.mMajorAxisPoint.f4810x += f4;
            this.mMajorAxisPoint.f4811y += f5;
            this.mMinorAxisPoint.f4810x += f4;
            this.mMinorAxisPoint.f4811y += f5;
            float radians = (float) Math.toRadians(45);
            float fHypot = (f * f2) / ((float) Math.hypot(((float) Math.cos(radians)) * f2, ((float) Math.sin(radians)) * f));
            this.mMiddlePoint = new Point(((float) Math.cos(radians)) * fHypot, ((float) Math.sin(radians)) * fHypot);
            this.mMiddlePoint = rotatePoint2D(this.mMiddlePoint, f3);
            this.mMiddlePoint.f4810x += f4;
            this.mMiddlePoint.f4811y += f5;
        }

        private boolean computeDirectionChange(Point point, Point point2, Point point3, Point point4, Point point5, Point point6) {
            return getCrossProduct(point, point2, point3) * getCrossProduct(point4, point5, point6) < ((float) 0);
        }

        private Point computeOriginalCenter(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7) {
            Point point = new Point();
            float fCos = (float) Math.cos(f5);
            float fSin = (float) Math.sin(f5);
            float f8 = (f - f6) / 2;
            float f9 = (f2 - f7) / 2;
            float f10 = (fCos * f8) + (fSin * f9);
            float f11 = (f9 * fCos) + (f8 * (-fSin));
            float f12 = f3 * f3;
            float f13 = f4 * f4;
            float f14 = f10 * f10;
            float f15 = f11 * f11;
            float f16 = (((f12 * f13) - (f12 * f15)) - (f13 * f14)) / ((f12 * f15) + (f13 * f14));
            if (f16 < 0) {
                f16 = 0;
            }
            float fSqrt = (float) Math.sqrt(f16);
            if (z ? z2 : !z2) {
                fSqrt = -fSqrt;
            }
            float f17 = (f11 * (fSqrt * f3)) / f4;
            float f18 = (((-fSqrt) * f4) * f10) / f3;
            point.f4810x = ((f + f6) / 2) + ((fCos * f17) - (fSin * f18));
            point.f4811y = (f18 * fCos) + (fSin * f17) + ((f2 + f7) / 2);
            return point;
        }

        private float getCrossProduct(Point point, Point point2, Point point3) {
            return ((point2.f4810x - point.f4810x) * (point3.f4811y - point.f4811y)) - ((point2.f4811y - point.f4811y) * (point3.f4810x - point.f4810x));
        }

        public boolean getDirectionChanged() {
            return this.mDirectionChanged;
        }

        public float getMajorAxis() {
            return this.mMajorAxis;
        }

        public float getMinorAxis() {
            return this.mMinorAxis;
        }

        public float getRotationDegree() {
            return this.mRotationDegree;
        }

        private Point rotatePoint2D(Point point, float f) {
            Point point2 = new Point();
            float fCos = (float) Math.cos(f);
            float fSin = (float) Math.sin(f);
            point2.f4810x = (point.f4810x * fCos) - (point.f4811y * fSin);
            point2.f4811y = (fCos * point.f4811y) + (fSin * point.f4810x);
            return point2;
        }
    }

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;
    }

    static {
        commandStepMap.put(new Character('z'), new Integer(2));
        commandStepMap.put(new Character('Z'), new Integer(2));
        commandStepMap.put(new Character('m'), new Integer(2));
        commandStepMap.put(new Character('M'), new Integer(2));
        commandStepMap.put(new Character('l'), new Integer(2));
        commandStepMap.put(new Character('L'), new Integer(2));
        commandStepMap.put(new Character('t'), new Integer(2));
        commandStepMap.put(new Character('T'), new Integer(2));
        commandStepMap.put(new Character('h'), new Integer(1));
        commandStepMap.put(new Character('H'), new Integer(1));
        commandStepMap.put(new Character('v'), new Integer(1));
        commandStepMap.put(new Character('V'), new Integer(1));
        commandStepMap.put(new Character('c'), new Integer(6));
        commandStepMap.put(new Character('C'), new Integer(6));
        commandStepMap.put(new Character('s'), new Integer(4));
        commandStepMap.put(new Character('S'), new Integer(4));
        commandStepMap.put(new Character('q'), new Integer(4));
        commandStepMap.put(new Character('Q'), new Integer(4));
        commandStepMap.put(new Character('a'), new Integer(7));
        commandStepMap.put(new Character('A'), new Integer(7));
    }

    PathDataNode(char c, float[] fArr) {
        this.type = c;
        this.params = fArr;
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
        arrayList.add(new PathDataNode(c, fArr));
    }

    private static float[] copyOfRange(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return (PathDataNode[]) null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            int iNextStart = nextStart(str, i2);
            String strTrim = str.substring(i, iNextStart).trim();
            if (strTrim.length() > 0) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i2 = iNextStart + 1;
            i = iNextStart;
        }
        if (i2 - i == 1 && i < str.length()) {
            addNode(arrayList, str.charAt(i), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    private void deltaTransform(AffineTransform affineTransform, float[] fArr, int i, int i2) {
        float[] fArr2 = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr2[i3] = fArr[i3 + i];
        }
        affineTransform.deltaTransform(fArr2, 0, fArr2, 0, i2 / 2);
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4 + i] = fArr2[i4];
        }
    }

    private static void extract(String str, int i, ExtractFloatResult extractFloatResult) {
        extractFloatResult.mEndWithNegOrDot = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            switch (str.charAt(i2)) {
                case ' ':
                case ',':
                    z = true;
                    z3 = false;
                    break;
                case '-':
                    if (i2 != i && !z3) {
                        extractFloatResult.mEndWithNegOrDot = true;
                        z = true;
                    }
                    z3 = false;
                    break;
                case '.':
                    if (z2) {
                        extractFloatResult.mEndWithNegOrDot = true;
                        z = true;
                    } else {
                        z2 = true;
                    }
                    z3 = false;
                    break;
                case 'E':
                case 'e':
                    z3 = true;
                    break;
                default:
                    z3 = false;
                    break;
            }
            if (z) {
                extractFloatResult.mEndPosition = i2;
            }
        }
        extractFloatResult.mEndPosition = i2;
    }

    private static float[] getFloats(String str) {
        int i = 1;
        int i2 = 0;
        if ((str.charAt(0) == 'z') || (str.charAt(0) == 'Z')) {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            while (i < length) {
                extract(str, i, extractFloatResult);
                int i3 = extractFloatResult.mEndPosition;
                if (i < i3) {
                    i2++;
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                } else {
                    i2 = i2;
                }
                i = extractFloatResult.mEndWithNegOrDot ? i3 : i3 + 1;
            }
            return copyOfRange(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException(new StringBuffer().append(new StringBuffer().append("error in parsing \"").append(str).toString()).append("\"").toString(), e);
        }
    }

    public static boolean hasRelMoveAfterClose(PathDataNode[] pathDataNodeArr) {
        char c = INIT_TYPE;
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            if ((c == 'z' || c == 'Z') && pathDataNode.type == 'm') {
                return true;
            }
            c = pathDataNode.type;
        }
        return false;
    }

    private boolean isTranslationOnly(AffineTransform affineTransform) {
        int type = affineTransform.getType();
        return type == 0 || type == 1;
    }

    private static int nextStart(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    public static String nodeListToString(PathDataNode[] pathDataNodeArr) {
        StringBuilder sb = new StringBuilder();
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            sb.append(pathDataNode.type);
            int length = pathDataNode.params.length;
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append((i & 1) == 1 ? "," : " ");
                }
                sb.append(FloatUtils.format2String(pathDataNode.params[i]));
            }
        }
        return sb.toString();
    }

    public static void transform(float f, float f2, float f3, float f4, float f5, float f6, PathDataNode[] pathDataNodeArr) {
        Point point = new Point();
        Point point2 = new Point();
        AffineTransform affineTransform = new AffineTransform(f, f2, f3, f4, f5, f6);
        char c = INIT_TYPE;
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            pathDataNode.transform(affineTransform, point, point2, c);
            c = pathDataNode.type;
        }
    }

    public void transform(AffineTransform affineTransform, Point point, Point point2, char c) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = point.f4810x;
        float f8 = point.f4811y;
        float f9 = point2.f4810x;
        float f10 = point2.f4811y;
        int length = this.params.length;
        int iIntValue = commandStepMap.get(new Character(this.type)).intValue();
        float[] fArr = new float[length * 2];
        switch (this.type) {
            case 'A':
                int i = 0;
                f = f7;
                float f11 = f8;
                while (true) {
                    int i2 = i;
                    if (i2 >= length / iIntValue) {
                        f2 = f10;
                        f3 = f9;
                        f4 = f11;
                    } else {
                        float f12 = this.params[(i2 * iIntValue) + 5];
                        float f13 = this.params[(i2 * iIntValue) + 6];
                        if (!isTranslationOnly(affineTransform)) {
                            EllipseSolver ellipseSolver = new EllipseSolver(affineTransform, f, f11, this.params[i2 * iIntValue], this.params[(i2 * iIntValue) + 1], this.params[(i2 * iIntValue) + 2], this.params[(i2 * iIntValue) + 3], this.params[(i2 * iIntValue) + 4], f + this.params[(i2 * iIntValue) + 5], f11 + this.params[(i2 * iIntValue) + 6]);
                            deltaTransform(affineTransform, this.params, (i2 * iIntValue) + 5, 2);
                            this.params[i2 * iIntValue] = ellipseSolver.getMajorAxis();
                            this.params[(i2 * iIntValue) + 1] = ellipseSolver.getMinorAxis();
                            this.params[(i2 * iIntValue) + 2] = ellipseSolver.getRotationDegree();
                            if (ellipseSolver.getDirectionChanged()) {
                                this.params[(i2 * iIntValue) + 4] = 1 - this.params[(i2 * iIntValue) + 4];
                            }
                        }
                        i = i2 + 1;
                        f11 += f13;
                        f += f12;
                    }
                    break;
                }
                break;
            case 'C':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
                float f14 = this.params[length - 2];
                float f15 = this.params[length - 1];
                if (this.type == 'M') {
                    f6 = f15;
                    f3 = f14;
                } else {
                    f6 = f10;
                    f3 = f9;
                }
                affineTransform.transform(this.params, 0, this.params, 0, length / 2);
                f = f14;
                f2 = f6;
                f4 = f15;
                break;
            case 'H':
                this.type = (char) 76;
                for (int i3 = 0; i3 < length; i3++) {
                    fArr[i3 * 2] = this.params[i3];
                    fArr[(i3 * 2) + 1] = f8;
                    f7 = this.params[i3];
                }
                affineTransform.transform(fArr, 0, fArr, 0, length);
                this.params = fArr;
                f = f7;
                f2 = f10;
                f3 = f9;
                f4 = f8;
                break;
            case 'V':
                this.type = (char) 76;
                for (int i4 = 0; i4 < length; i4++) {
                    fArr[i4 * 2] = f7;
                    fArr[(i4 * 2) + 1] = this.params[i4];
                    f8 = this.params[i4];
                }
                affineTransform.transform(fArr, 0, fArr, 0, length);
                this.params = fArr;
                f = f7;
                f2 = f10;
                f3 = f9;
                f4 = f8;
                break;
            case 'Z':
            case 'z':
                f = f9;
                f2 = f10;
                f3 = f9;
                f4 = f10;
                break;
            case 'a':
                int i5 = 0;
                while (true) {
                    f = f7;
                    float f16 = f8;
                    int i6 = i5;
                    if (i6 >= length / iIntValue) {
                        f2 = f10;
                        f3 = f9;
                        f4 = f16;
                    } else {
                        if (!isTranslationOnly(affineTransform)) {
                            EllipseSolver ellipseSolver2 = new EllipseSolver(affineTransform, f, f16, this.params[i6 * iIntValue], this.params[(i6 * iIntValue) + 1], this.params[(i6 * iIntValue) + 2], this.params[(i6 * iIntValue) + 3], this.params[(i6 * iIntValue) + 4], this.params[(i6 * iIntValue) + 5], this.params[(i6 * iIntValue) + 6]);
                            this.params[i6 * iIntValue] = ellipseSolver2.getMajorAxis();
                            this.params[(i6 * iIntValue) + 1] = ellipseSolver2.getMinorAxis();
                            this.params[(i6 * iIntValue) + 2] = ellipseSolver2.getRotationDegree();
                            if (ellipseSolver2.getDirectionChanged()) {
                                this.params[(i6 * iIntValue) + 4] = 1 - this.params[(i6 * iIntValue) + 4];
                            }
                        }
                        f7 = this.params[(i6 * iIntValue) + 5];
                        f8 = this.params[(i6 * iIntValue) + 6];
                        affineTransform.transform(this.params, (i6 * iIntValue) + 5, this.params, (i6 * iIntValue) + 5, 1);
                        i5 = i6 + 1;
                    }
                    break;
                }
                break;
            case 'c':
            case 'l':
            case 'q':
            case 's':
            case 't':
                for (int i7 = 0; i7 < length / iIntValue; i7++) {
                    f7 += this.params[(i7 * iIntValue) + (iIntValue - 2)];
                    f8 += this.params[(i7 * iIntValue) + (iIntValue - 1)];
                }
                if (!isTranslationOnly(affineTransform)) {
                    deltaTransform(affineTransform, this.params, 0, length);
                }
                f = f7;
                f2 = f10;
                f3 = f9;
                f4 = f8;
                break;
            case 'h':
                for (int i8 = 0; i8 < length; i8++) {
                    fArr[i8 * 2] = this.params[i8];
                    f7 += this.params[i8];
                    fArr[(i8 * 2) + 1] = 0;
                }
                if (!isTranslationOnly(affineTransform)) {
                    this.type = (char) 108;
                    deltaTransform(affineTransform, fArr, 0, length * 2);
                    this.params = fArr;
                }
                f = f7;
                f2 = f10;
                f3 = f9;
                f4 = f8;
                break;
            case 'm':
                if (c == 'z' || c == 'Z') {
                    this.type = (char) 77;
                    float[] fArr2 = this.params;
                    fArr2[0] = fArr2[0] + f9;
                    float[] fArr3 = this.params;
                    fArr3[1] = fArr3[1] + f10;
                    float f17 = this.params[0];
                    float f18 = this.params[1];
                    for (int i9 = 1; i9 < length / iIntValue; i9++) {
                        float[] fArr4 = this.params;
                        int i10 = i9 * iIntValue;
                        fArr4[i10] = fArr4[i10] + this.params[(i9 - 1) * iIntValue];
                        float[] fArr5 = this.params;
                        int i11 = (i9 * iIntValue) + 1;
                        fArr5[i11] = fArr5[i11] + this.params[((i9 - 1) * iIntValue) + 1];
                    }
                    float f19 = this.params[length - 2];
                    float f20 = this.params[length - 1];
                    affineTransform.transform(this.params, 0, this.params, 0, length / 2);
                    f2 = f18;
                    f4 = f20;
                    f = f19;
                    f5 = f17;
                } else {
                    int i12 = 0;
                    if (c == ' ') {
                        float f21 = this.params[0];
                        float f22 = this.params[1];
                        affineTransform.transform(this.params, 0, this.params, 0, 1);
                        i12 = 1;
                        f2 = f22;
                        f5 = f21;
                        f4 = f22;
                        f = f21;
                    } else {
                        f2 = f10;
                        f5 = f9;
                        f4 = f8;
                        f = f7;
                    }
                    int i13 = i12;
                    while (i13 < length / iIntValue) {
                        f += this.params[(i13 * iIntValue) + (iIntValue - 2)];
                        float f23 = this.params[(i13 * iIntValue) + (iIntValue - 1)];
                        i13++;
                        f4 += f23;
                    }
                    if (!isTranslationOnly(affineTransform)) {
                        deltaTransform(affineTransform, this.params, i12 * 2, length - (i12 * 2));
                    }
                }
                f3 = f5;
                break;
            case 'v':
                for (int i14 = 0; i14 < length; i14++) {
                    fArr[i14 * 2] = 0;
                    fArr[(i14 * 2) + 1] = this.params[i14];
                    f8 += this.params[i14];
                }
                if (!isTranslationOnly(affineTransform)) {
                    this.type = (char) 108;
                    deltaTransform(affineTransform, fArr, 0, length * 2);
                    this.params = fArr;
                }
                f = f7;
                f2 = f10;
                f3 = f9;
                f4 = f8;
                break;
            default:
                f = f7;
                f2 = f10;
                f3 = f9;
                f4 = f8;
                break;
        }
        point.m7065set(f, f4);
        point2.m7065set(f3, f2);
    }
}
