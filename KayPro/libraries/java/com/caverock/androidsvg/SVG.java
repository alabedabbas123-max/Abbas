package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.Log;
import com.baidu.mobstat.Config;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;

public class SVG {
    private static final int DEFAULT_PICTURE_HEIGHT = 512;
    private static final int DEFAULT_PICTURE_WIDTH = 512;
    private static final long SPECIFIED_ALL = -1;
    static final long SPECIFIED_CLIP = 1048576;
    static final long SPECIFIED_CLIP_PATH = 268435456;
    static final long SPECIFIED_CLIP_RULE = 536870912;
    static final long SPECIFIED_COLOR = 4096;
    static final long SPECIFIED_DIRECTION = 68719476736L;
    static final long SPECIFIED_DISPLAY = 16777216;
    static final long SPECIFIED_FILL = 1;
    static final long SPECIFIED_FILL_OPACITY = 4;
    static final long SPECIFIED_FILL_RULE = 2;
    static final long SPECIFIED_FONT_FAMILY = 8192;
    static final long SPECIFIED_FONT_SIZE = 16384;
    static final long SPECIFIED_FONT_STYLE = 65536;
    static final long SPECIFIED_FONT_WEIGHT = 32768;
    static final long SPECIFIED_IMAGE_RENDERING = 137438953472L;
    static final long SPECIFIED_MARKER_END = 8388608;
    static final long SPECIFIED_MARKER_MID = 4194304;
    static final long SPECIFIED_MARKER_START = 2097152;
    static final long SPECIFIED_MASK = 1073741824;
    static final long SPECIFIED_OPACITY = 2048;
    static final long SPECIFIED_OVERFLOW = 524288;
    static final long SPECIFIED_SOLID_COLOR = 2147483648L;
    static final long SPECIFIED_SOLID_OPACITY = 4294967296L;
    static final long SPECIFIED_STOP_COLOR = 67108864;
    static final long SPECIFIED_STOP_OPACITY = 134217728;
    static final long SPECIFIED_STROKE = 8;
    static final long SPECIFIED_STROKE_DASHARRAY = 512;
    static final long SPECIFIED_STROKE_DASHOFFSET = 1024;
    static final long SPECIFIED_STROKE_LINECAP = 64;
    static final long SPECIFIED_STROKE_LINEJOIN = 128;
    static final long SPECIFIED_STROKE_MITERLIMIT = 256;
    static final long SPECIFIED_STROKE_OPACITY = 16;
    static final long SPECIFIED_STROKE_WIDTH = 32;
    static final long SPECIFIED_TEXT_ANCHOR = 262144;
    static final long SPECIFIED_TEXT_DECORATION = 131072;
    static final long SPECIFIED_VECTOR_EFFECT = 34359738368L;
    static final long SPECIFIED_VIEWPORT_FILL = 8589934592L;
    static final long SPECIFIED_VIEWPORT_FILL_OPACITY = 17179869184L;
    static final long SPECIFIED_VISIBILITY = 33554432;
    private static final double SQRT2 = 1.414213562373095d;
    private static final String VERSION = "1.4";
    private static SVGExternalFileResolver externalFileResolver = (SVGExternalFileResolver) null;
    private static boolean enableInternalEntities = true;
    private Svg rootElement = (Svg) null;
    private String title = "";
    private String desc = "";
    private float renderDPI = 96.0f;
    private CSSParser.Ruleset cssRules = new CSSParser.Ruleset();
    private Map<String, SvgElementBase> idToElementMap = new HashMap();

    static class Box {
        float height;
        float minX;
        float minY;
        float width;

        Box(float f, float f2, float f3, float f4) {
            this.minX = f;
            this.minY = f2;
            this.width = f3;
            this.height = f4;
        }

        Box(Box box) {
            this.minX = box.minX;
            this.minY = box.minY;
            this.width = box.width;
            this.height = box.height;
        }

        static Box fromLimits(float f, float f2, float f3, float f4) {
            return new Box(f, f2, f3 - f, f4 - f2);
        }

        float maxX() {
            return this.minX + this.width;
        }

        float maxY() {
            return this.minY + this.height;
        }

        RectF toRectF() {
            return new RectF(this.minX, this.minY, maxX(), maxY());
        }

        public String toString() {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("[").append(this.minX).toString()).append(" ").toString()).append(this.minY).toString()).append(" ").toString()).append(this.width).toString()).append(" ").toString()).append(this.height).toString()).append("]").toString();
        }

        void union(Box box) {
            if (box.minX < this.minX) {
                this.minX = box.minX;
            }
            if (box.minY < this.minY) {
                this.minY = box.minY;
            }
            if (box.maxX() > maxX()) {
                this.width = box.maxX() - this.minX;
            }
            if (box.maxY() > maxY()) {
                this.height = box.maxY() - this.minY;
            }
        }
    }

    static class CSSClipRect {
        Length bottom;
        Length left;
        Length right;

        Length f4690top;

        CSSClipRect(Length length, Length length2, Length length3, Length length4) {
            this.f4690top = length;
            this.right = length2;
            this.bottom = length3;
            this.left = length4;
        }
    }

    static class Circle extends GraphicsElement {

        Length f4691cx;

        Length f4692cy;

        Length f4693r;

        @Override
        String getNodeName() {
            return Config.TRACE_CIRCLE;
        }
    }

    static class ClipPath extends Group implements NotDirectlyRendered {
        Boolean clipPathUnitsAreUser;

        @Override
        String getNodeName() {
            return "clipPath";
        }
    }

    static class Colour extends SvgPaint {
        static final Colour BLACK = new Colour(-16777216);
        static final Colour TRANSPARENT = new Colour(0);
        int colour;

        Colour(int i) {
            this.colour = i;
        }

        public String toString() {
            return String.format("#%08x", new Integer(this.colour));
        }
    }

    static class CurrentColor extends SvgPaint {
        private static CurrentColor instance = new CurrentColor();

        CurrentColor() {
        }

        static CurrentColor getInstance() {
            return instance;
        }
    }

    static class Defs extends Group implements NotDirectlyRendered {
        @Override
        String getNodeName() {
            return "defs";
        }
    }

    static class Ellipse extends GraphicsElement {

        Length f4694cx;

        Length f4695cy;

        Length f4696rx;

        Length f4697ry;

        @Override
        String getNodeName() {
            return "ellipse";
        }
    }

    static abstract class GradientElement extends SvgElementBase implements SvgContainer {
        List<SvgObject> children = new ArrayList();
        Matrix gradientTransform;
        Boolean gradientUnitsAreUser;
        String href;
        GradientSpread spreadMethod;

        @Override
        public void addChild(SvgObject svgObject) throws SVGParseException {
            if (!(svgObject instanceof Stop)) {
                throw new SVGParseException(new StringBuffer().append(new StringBuffer().append("Gradient elements cannot contain ").append(svgObject).toString()).append(" elements.").toString());
            }
            this.children.add(svgObject);
        }

        @Override
        public List<SvgObject> getChildren() {
            return this.children;
        }
    }

    @SuppressWarnings("unused")
    enum GradientSpread {
        pad,
        reflect,
        repeat;

        public static GradientSpread valueOf(String str) {
            for (GradientSpread gradientSpread : values()) {
                if (gradientSpread.name().equals(str)) {
                    return gradientSpread;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    static abstract class GraphicsElement extends SvgConditionalElement implements HasTransform {
        Matrix transform;

        @Override
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    static class Group extends SvgConditionalContainer implements HasTransform {
        Matrix transform;

        @Override
        String getNodeName() {
            return "group";
        }

        @Override
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    interface HasTransform {
        void setTransform(Matrix matrix);
    }

    static class Image extends SvgPreserveAspectRatioContainer implements HasTransform {
        Length height;
        String href;
        Matrix transform;
        Length width;

        Length f4699x;

        Length f4700y;

        @Override
        String getNodeName() {
            return "image";
        }

        @Override
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    static class Length implements Cloneable {
        Unit unit;
        float value;

        Length(float f) {
            this.value = f;
            this.unit = Unit.px;
        }

        Length(float f, Unit unit) {
            this.value = f;
            this.unit = unit;
        }

        float floatValue() {
            return this.value;
        }

        float floatValue(float f) {
            Unit unit = this.unit;
            if (unit == Unit.px) {
                return this.value;
            }
            if (unit == Unit.in) {
                return this.value * f;
            }
            if (unit == Unit.cm) {
                return (this.value * f) / 2.54f;
            }
            if (unit == Unit.mm) {
                return (this.value * f) / 25.4f;
            }
            if (unit == Unit.pt) {
                return (this.value * f) / 72.0f;
            }
            if (unit == Unit.pc) {
                return (this.value * f) / 6.0f;
            }
            if (unit != Unit.em && unit != Unit.ex && unit == Unit.percent) {
            }
            return this.value;
        }

        float floatValue(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.unit != Unit.percent) {
                return floatValueX(sVGAndroidRenderer);
            }
            Box currentViewPortInUserUnits = sVGAndroidRenderer.getCurrentViewPortInUserUnits();
            if (currentViewPortInUserUnits == null) {
                return this.value;
            }
            float f = currentViewPortInUserUnits.width;
            float f2 = currentViewPortInUserUnits.height;
            return f == f2 ? (this.value * f) / 100.0f : (((float) (Math.sqrt((f2 * f2) + (f * f)) / 1.414213562373095d)) * this.value) / 100.0f;
        }

        float floatValue(SVGAndroidRenderer sVGAndroidRenderer, float f) {
            return this.unit == Unit.percent ? (this.value * f) / 100.0f : floatValueX(sVGAndroidRenderer);
        }

        float floatValueX(SVGAndroidRenderer sVGAndroidRenderer) {
            Box currentViewPortInUserUnits;
            Unit unit = this.unit;
            if (unit == Unit.px) {
                return this.value;
            }
            if (unit == Unit.em) {
                return this.value * sVGAndroidRenderer.getCurrentFontSize();
            }
            if (unit == Unit.ex) {
                return this.value * sVGAndroidRenderer.getCurrentFontXHeight();
            }
            if (unit == Unit.in) {
                return this.value * sVGAndroidRenderer.getDPI();
            }
            if (unit == Unit.cm) {
                return (this.value * sVGAndroidRenderer.getDPI()) / 2.54f;
            }
            if (unit == Unit.mm) {
                return (this.value * sVGAndroidRenderer.getDPI()) / 25.4f;
            }
            if (unit == Unit.pt) {
                return (this.value * sVGAndroidRenderer.getDPI()) / 72.0f;
            }
            if (unit == Unit.pc) {
                return (this.value * sVGAndroidRenderer.getDPI()) / 6.0f;
            }
            if (unit == Unit.percent && (currentViewPortInUserUnits = sVGAndroidRenderer.getCurrentViewPortInUserUnits()) != null) {
                return (currentViewPortInUserUnits.width * this.value) / 100.0f;
            }
            return this.value;
        }

        float floatValueY(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.unit != Unit.percent) {
                return floatValueX(sVGAndroidRenderer);
            }
            Box currentViewPortInUserUnits = sVGAndroidRenderer.getCurrentViewPortInUserUnits();
            if (currentViewPortInUserUnits == null) {
                return this.value;
            }
            return (currentViewPortInUserUnits.height * this.value) / 100.0f;
        }

        boolean isNegative() {
            return this.value < 0.0f;
        }

        boolean isZero() {
            return this.value == 0.0f;
        }

        public String toString() {
            return new StringBuffer().append(String.valueOf(this.value)).append(this.unit).toString();
        }
    }

    static class Line extends GraphicsElement {

        Length f4701x1;

        Length f4702x2;

        Length f4703y1;

        Length f4704y2;

        @Override
        String getNodeName() {
            return "line";
        }
    }

    static class Marker extends SvgViewBoxContainer implements NotDirectlyRendered {
        Length markerHeight;
        boolean markerUnitsAreUser;
        Length markerWidth;
        Float orient;
        Length refX;
        Length refY;

        @Override
        String getNodeName() {
            return "marker";
        }
    }

    static class Mask extends SvgConditionalContainer implements NotDirectlyRendered {
        Length height;
        Boolean maskContentUnitsAreUser;
        Boolean maskUnitsAreUser;
        Length width;

        Length f4705x;

        Length f4706y;

        @Override
        String getNodeName() {
            return "mask";
        }
    }

    interface NotDirectlyRendered {
    }

    static class PaintReference extends SvgPaint {
        SvgPaint fallback;
        String href;

        PaintReference(String str, SvgPaint svgPaint) {
            this.href = str;
            this.fallback = svgPaint;
        }

        public String toString() {
            return new StringBuffer().append(new StringBuffer().append(this.href).append(" ").toString()).append(this.fallback).toString();
        }
    }

    static class Path extends GraphicsElement {

        PathDefinition f4707d;
        Float pathLength;

        @Override
        String getNodeName() {
            return Config.FEED_LIST_ITEM_PATH;
        }
    }

    static class PathDefinition implements PathInterface {
        private static final byte ARCTO = 4;
        private static final byte CLOSE = 8;
        private static final byte CUBICTO = 2;
        private static final byte LINETO = 1;
        private static final byte MOVETO = 0;
        private static final byte QUADTO = 3;
        private int commandsLength = 0;
        private int coordsLength = 0;
        private byte[] commands = new byte[8];
        private float[] coords = new float[16];

        PathDefinition() {
        }

        private void addCommand(byte b) {
            if (this.commandsLength == this.commands.length) {
                byte[] bArr = new byte[this.commands.length * 2];
                System.arraycopy(this.commands, 0, bArr, 0, this.commands.length);
                this.commands = bArr;
            }
            byte[] bArr2 = this.commands;
            int i = this.commandsLength;
            this.commandsLength = i + 1;
            bArr2[i] = b;
        }

        private void coordsEnsure(int i) {
            if (this.coords.length < this.coordsLength + i) {
                float[] fArr = new float[this.coords.length * 2];
                System.arraycopy(this.coords, 0, fArr, 0, this.coords.length);
                this.coords = fArr;
            }
        }

        @Override
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            addCommand((byte) ((z2 ? 1 : 0) | (z ? 2 : 0) | 4));
            coordsEnsure(5);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            this.coordsLength = i + 1;
            fArr[i] = f;
            float[] fArr2 = this.coords;
            int i2 = this.coordsLength;
            this.coordsLength = i2 + 1;
            fArr2[i2] = f2;
            float[] fArr3 = this.coords;
            int i3 = this.coordsLength;
            this.coordsLength = i3 + 1;
            fArr3[i3] = f3;
            float[] fArr4 = this.coords;
            int i4 = this.coordsLength;
            this.coordsLength = i4 + 1;
            fArr4[i4] = f4;
            float[] fArr5 = this.coords;
            int i5 = this.coordsLength;
            this.coordsLength = i5 + 1;
            fArr5[i5] = f5;
        }

        @Override
        public void close() {
            addCommand(CLOSE);
        }

        @Override
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            addCommand(CUBICTO);
            coordsEnsure(6);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            this.coordsLength = i + 1;
            fArr[i] = f;
            float[] fArr2 = this.coords;
            int i2 = this.coordsLength;
            this.coordsLength = i2 + 1;
            fArr2[i2] = f2;
            float[] fArr3 = this.coords;
            int i3 = this.coordsLength;
            this.coordsLength = i3 + 1;
            fArr3[i3] = f3;
            float[] fArr4 = this.coords;
            int i4 = this.coordsLength;
            this.coordsLength = i4 + 1;
            fArr4[i4] = f4;
            float[] fArr5 = this.coords;
            int i5 = this.coordsLength;
            this.coordsLength = i5 + 1;
            fArr5[i5] = f5;
            float[] fArr6 = this.coords;
            int i6 = this.coordsLength;
            this.coordsLength = i6 + 1;
            fArr6[i6] = f6;
        }

        void enumeratePath(PathInterface pathInterface) {
            int i = 0;
            for (int i2 = 0; i2 < this.commandsLength; i2++) {
                byte b = this.commands[i2];
                switch (b) {
                    case 0:
                        int i3 = i + 1;
                        float f = this.coords[i];
                        i = i3 + 1;
                        pathInterface.moveTo(f, this.coords[i3]);
                        break;
                    case 1:
                        int i4 = i + 1;
                        float f2 = this.coords[i];
                        i = i4 + 1;
                        pathInterface.lineTo(f2, this.coords[i4]);
                        break;
                    case 2:
                        int i5 = i + 1;
                        int i6 = i5 + 1;
                        int i7 = i6 + 1;
                        int i8 = i7 + 1;
                        int i9 = i8 + 1;
                        pathInterface.cubicTo(this.coords[i], this.coords[i5], this.coords[i6], this.coords[i7], this.coords[i8], this.coords[i9]);
                        i = i9 + 1;
                        break;
                    case 3:
                        int i10 = i + 1;
                        int i11 = i10 + 1;
                        int i12 = i11 + 1;
                        i = i12 + 1;
                        pathInterface.quadTo(this.coords[i], this.coords[i10], this.coords[i11], this.coords[i12]);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    default:
                        int i13 = i + 1;
                        int i14 = i13 + 1;
                        int i15 = i14 + 1;
                        int i16 = i15 + 1;
                        pathInterface.arcTo(this.coords[i], this.coords[i13], this.coords[i14], (b & CUBICTO) != 0, (b & LINETO) != 0, this.coords[i15], this.coords[i16]);
                        i = i16 + 1;
                        break;
                    case 8:
                        pathInterface.close();
                        break;
                }
            }
        }

        boolean isEmpty() {
            return this.commandsLength == 0;
        }

        @Override
        public void lineTo(float f, float f2) {
            addCommand(LINETO);
            coordsEnsure(2);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            this.coordsLength = i + 1;
            fArr[i] = f;
            float[] fArr2 = this.coords;
            int i2 = this.coordsLength;
            this.coordsLength = i2 + 1;
            fArr2[i2] = f2;
        }

        @Override
        public void moveTo(float f, float f2) {
            addCommand(MOVETO);
            coordsEnsure(2);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            this.coordsLength = i + 1;
            fArr[i] = f;
            float[] fArr2 = this.coords;
            int i2 = this.coordsLength;
            this.coordsLength = i2 + 1;
            fArr2[i2] = f2;
        }

        @Override
        public void quadTo(float f, float f2, float f3, float f4) {
            addCommand(QUADTO);
            coordsEnsure(4);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            this.coordsLength = i + 1;
            fArr[i] = f;
            float[] fArr2 = this.coords;
            int i2 = this.coordsLength;
            this.coordsLength = i2 + 1;
            fArr2[i2] = f2;
            float[] fArr3 = this.coords;
            int i3 = this.coordsLength;
            this.coordsLength = i3 + 1;
            fArr3[i3] = f3;
            float[] fArr4 = this.coords;
            int i4 = this.coordsLength;
            this.coordsLength = i4 + 1;
            fArr4[i4] = f4;
        }
    }

    interface PathInterface {
        void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

        void lineTo(float f, float f2);

        void moveTo(float f, float f2);

        void quadTo(float f, float f2, float f3, float f4);
    }

    static class Pattern extends SvgViewBoxContainer implements NotDirectlyRendered {
        Length height;
        String href;
        Boolean patternContentUnitsAreUser;
        Matrix patternTransform;
        Boolean patternUnitsAreUser;
        Length width;

        Length f4708x;

        Length f4709y;

        @Override
        String getNodeName() {
            return "pattern";
        }
    }

    static class PolyLine extends GraphicsElement {
        float[] points;

        @Override
        String getNodeName() {
            return "polyline";
        }
    }

    static class Polygon extends PolyLine {
        @Override
        String getNodeName() {
            return "polygon";
        }
    }

    static class Rect extends GraphicsElement {
        Length height;

        Length f4710rx;

        Length f4711ry;
        Length width;

        Length f4712x;

        Length f4713y;

        @Override
        String getNodeName() {
            return "rect";
        }
    }

    static class SolidColor extends SvgElementBase implements SvgContainer {
        @Override
        public void addChild(SvgObject svgObject) {
        }

        @Override
        public List<SvgObject> getChildren() {
            return Collections.emptyList();
        }

        @Override
        String getNodeName() {
            return "solidColor";
        }
    }

    static class Stop extends SvgElementBase implements SvgContainer {
        Float offset;

        @Override
        public void addChild(SvgObject svgObject) {
        }

        @Override
        public List<SvgObject> getChildren() {
            return Collections.emptyList();
        }

        @Override
        String getNodeName() {
            return "stop";
        }
    }

    static class Style implements Cloneable {
        static final int FONT_WEIGHT_BOLD = 700;
        static final int FONT_WEIGHT_BOLDER = 1;
        static final int FONT_WEIGHT_LIGHTER = -1;
        static final int FONT_WEIGHT_NORMAL = 400;
        CSSClipRect clip;
        String clipPath;
        FillRule clipRule;
        Colour color;
        TextDirection direction;
        Boolean display;
        SvgPaint fill;
        Float fillOpacity;
        FillRule fillRule;
        List<String> fontFamily;
        Length fontSize;
        FontStyle fontStyle;
        Integer fontWeight;
        RenderQuality imageRendering;
        String markerEnd;
        String markerMid;
        String markerStart;
        String mask;
        Float opacity;
        Boolean overflow;
        SvgPaint solidColor;
        Float solidOpacity;
        long specifiedFlags = 0;
        SvgPaint stopColor;
        Float stopOpacity;
        SvgPaint stroke;
        Length[] strokeDashArray;
        Length strokeDashOffset;
        LineCap strokeLineCap;
        LineJoin strokeLineJoin;
        Float strokeMiterLimit;
        Float strokeOpacity;
        Length strokeWidth;
        TextAnchor textAnchor;
        TextDecoration textDecoration;
        VectorEffect vectorEffect;
        SvgPaint viewportFill;
        Float viewportFillOpacity;
        Boolean visibility;

        public enum FillRule {
            NonZero,
            EvenOdd;

            public static FillRule valueOf(String str) {
                for (FillRule fillRule : values()) {
                    if (fillRule.name().equals(str)) {
                        return fillRule;
                    }
                }
                throw new IllegalArgumentException();
            }
        }

        public enum FontStyle {
            Normal,
            Italic,
            Oblique;

            public static FontStyle valueOf(String str) {
                for (FontStyle fontStyle : values()) {
                    if (fontStyle.name().equals(str)) {
                        return fontStyle;
                    }
                }
                throw new IllegalArgumentException();
            }
        }

        public enum LineCap {
            Butt,
            Round,
            Square;

            public static LineCap valueOf(String str) {
                for (LineCap lineCap : values()) {
                    if (lineCap.name().equals(str)) {
                        return lineCap;
                    }
                }
                throw new IllegalArgumentException();
            }
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel;

            public static LineJoin valueOf(String str) {
                for (LineJoin lineJoin : values()) {
                    if (lineJoin.name().equals(str)) {
                        return lineJoin;
                    }
                }
                throw new IllegalArgumentException();
            }
        }

        public enum RenderQuality {
            auto,
            optimizeQuality,
            optimizeSpeed;

            public static RenderQuality valueOf(String str) {
                for (RenderQuality renderQuality : values()) {
                    if (renderQuality.name().equals(str)) {
                        return renderQuality;
                    }
                }
                throw new IllegalArgumentException();
            }
        }

        public enum TextAnchor {
            Start,
            Middle,
            End;

            public static TextAnchor valueOf(String str) {
                for (TextAnchor textAnchor : values()) {
                    if (textAnchor.name().equals(str)) {
                        return textAnchor;
                    }
                }
                throw new IllegalArgumentException();
            }
        }

        public enum TextDecoration {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink;

            public static TextDecoration valueOf(String str) {
                for (TextDecoration textDecoration : values()) {
                    if (textDecoration.name().equals(str)) {
                        return textDecoration;
                    }
                }
                throw new IllegalArgumentException();
            }
        }

        public enum TextDirection {
            LTR,
            RTL;

            public static TextDirection valueOf(String str) {
                for (TextDirection textDirection : values()) {
                    if (textDirection.name().equals(str)) {
                        return textDirection;
                    }
                }
                throw new IllegalArgumentException();
            }
        }

        public enum VectorEffect {
            None,
            NonScalingStroke;

            public static VectorEffect valueOf(String str) {
                for (VectorEffect vectorEffect : values()) {
                    if (vectorEffect.name().equals(str)) {
                        return vectorEffect;
                    }
                }
                throw new IllegalArgumentException();
            }
        }

        static Style getDefaultStyle() {
            Style style = new Style();
            style.specifiedFlags = -1L;
            style.fill = Colour.BLACK;
            style.fillRule = FillRule.NonZero;
            style.fillOpacity = new Float(1.0f);
            style.stroke = (SvgPaint) null;
            style.strokeOpacity = new Float(1.0f);
            style.strokeWidth = new Length(1.0f);
            style.strokeLineCap = LineCap.Butt;
            style.strokeLineJoin = LineJoin.Miter;
            style.strokeMiterLimit = new Float(4.0f);
            style.strokeDashArray = (Length[]) null;
            style.strokeDashOffset = new Length(0.0f);
            style.opacity = new Float(1.0f);
            style.color = Colour.BLACK;
            style.fontFamily = (List) null;
            style.fontSize = new Length(12, Unit.pt);
            style.fontWeight = new Integer(FONT_WEIGHT_NORMAL);
            style.fontStyle = FontStyle.Normal;
            style.textDecoration = TextDecoration.None;
            style.direction = TextDirection.LTR;
            style.textAnchor = TextAnchor.Start;
            style.overflow = new Boolean(true);
            style.clip = (CSSClipRect) null;
            style.markerStart = (String) null;
            style.markerMid = (String) null;
            style.markerEnd = (String) null;
            style.display = Boolean.TRUE;
            style.visibility = Boolean.TRUE;
            style.stopColor = Colour.BLACK;
            style.stopOpacity = new Float(1.0f);
            style.clipPath = (String) null;
            style.clipRule = FillRule.NonZero;
            style.mask = (String) null;
            style.solidColor = (SvgPaint) null;
            style.solidOpacity = new Float(1.0f);
            style.viewportFill = (SvgPaint) null;
            style.viewportFillOpacity = new Float(1.0f);
            style.vectorEffect = VectorEffect.None;
            style.imageRendering = RenderQuality.auto;
            return style;
        }

        protected Object clone() throws CloneNotSupportedException {
            Style style = (Style) super.clone();
            if (this.strokeDashArray != null) {
                style.strokeDashArray = (Length[]) this.strokeDashArray.clone();
            }
            return style;
        }

        void resetNonInheritingProperties(boolean z) {
            this.display = Boolean.TRUE;
            this.overflow = z ? Boolean.TRUE : Boolean.FALSE;
            this.clip = (CSSClipRect) null;
            this.clipPath = (String) null;
            this.opacity = new Float(1.0f);
            this.stopColor = Colour.BLACK;
            this.stopOpacity = new Float(1.0f);
            this.mask = (String) null;
            this.solidColor = (SvgPaint) null;
            this.solidOpacity = new Float(1.0f);
            this.viewportFill = (SvgPaint) null;
            this.viewportFillOpacity = new Float(1.0f);
            this.vectorEffect = VectorEffect.None;
        }
    }

    static class Svg extends SvgViewBoxContainer {
        Length height;
        public String version;
        Length width;

        Length f4717x;

        Length f4718y;

        @Override
        String getNodeName() {
            return "svg";
        }
    }

    interface SvgConditional {
        String getRequiredExtensions();

        Set<String> getRequiredFeatures();

        Set<String> getRequiredFonts();

        Set<String> getRequiredFormats();

        Set<String> getSystemLanguage();

        void setRequiredExtensions(String str);

        void setRequiredFeatures(Set<String> set);

        void setRequiredFonts(Set<String> set);

        void setRequiredFormats(Set<String> set);

        void setSystemLanguage(Set<String> set);
    }

    static abstract class SvgConditionalContainer extends SvgElement implements SvgContainer, SvgConditional {
        List<SvgObject> children = new ArrayList();
        Set<String> requiredFeatures = (Set) null;
        String requiredExtensions = (String) null;
        Set<String> systemLanguage = (Set) null;
        Set<String> requiredFormats = (Set) null;
        Set<String> requiredFonts = (Set) null;

        @Override
        public void addChild(SvgObject svgObject) throws SVGParseException {
            this.children.add(svgObject);
        }

        @Override
        public List<SvgObject> getChildren() {
            return this.children;
        }

        @Override
        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override
        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override
        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override
        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override
        public Set<String> getSystemLanguage() {
            return (Set) null;
        }

        @Override
        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        @Override
        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        @Override
        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        @Override
        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        @Override
        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }
    }

    static abstract class SvgConditionalElement extends SvgElement implements SvgConditional {
        Set<String> requiredFeatures = (Set) null;
        String requiredExtensions = (String) null;
        Set<String> systemLanguage = (Set) null;
        Set<String> requiredFormats = (Set) null;
        Set<String> requiredFonts = (Set) null;

        @Override
        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override
        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override
        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override
        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override
        public Set<String> getSystemLanguage() {
            return this.systemLanguage;
        }

        @Override
        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        @Override
        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        @Override
        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        @Override
        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        @Override
        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }
    }

    interface SvgContainer {
        void addChild(SvgObject svgObject) throws SVGParseException;

        List<SvgObject> getChildren();
    }

    static abstract class SvgElement extends SvgElementBase {
        Box boundingBox = (Box) null;
    }

    static abstract class SvgElementBase extends SvgObject {

        String f4719id = (String) null;
        Boolean spacePreserve = (Boolean) null;
        Style baseStyle = (Style) null;
        Style style = (Style) null;
        List<String> classNames = (List) null;

        public String toString() {
            return getNodeName();
        }
    }

    static class SvgLinearGradient extends GradientElement {

        Length f4720x1;

        Length f4721x2;

        Length f4722y1;

        Length f4723y2;

        @Override
        String getNodeName() {
            return "linearGradient";
        }
    }

    static class SvgObject {
        SVG document;
        SvgContainer parent;

        String getNodeName() {
            return "";
        }
    }

    static abstract class SvgPaint implements Cloneable {
    }

    static abstract class SvgPreserveAspectRatioContainer extends SvgConditionalContainer {
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) null;
    }

    static class SvgRadialGradient extends GradientElement {

        Length f4724cx;

        Length f4725cy;

        Length f4726fx;

        Length f4727fy;

        Length f4728r;

        @Override
        String getNodeName() {
            return "radialGradient";
        }
    }

    static abstract class SvgViewBoxContainer extends SvgPreserveAspectRatioContainer {
        Box viewBox;
    }

    static class Switch extends Group {
        @Override
        String getNodeName() {
            return "switch";
        }
    }

    static class Symbol extends SvgViewBoxContainer implements NotDirectlyRendered {
        @Override
        String getNodeName() {
            return "symbol";
        }
    }

    static class TRef extends TextContainer implements TextChild {
        String href;
        private TextRoot textRoot;

        @Override
        String getNodeName() {
            return "tref";
        }

        @Override
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    static class TSpan extends TextPositionedContainer implements TextChild {
        private TextRoot textRoot;

        @Override
        String getNodeName() {
            return "tspan";
        }

        @Override
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    static class Text extends TextPositionedContainer implements TextRoot, HasTransform {
        Matrix transform;

        @Override
        String getNodeName() {
            return "text";
        }

        @Override
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    interface TextChild {
        TextRoot getTextRoot();

        void setTextRoot(TextRoot textRoot);
    }

    static abstract class TextContainer extends SvgConditionalContainer {
        @Override
        public void addChild(SvgObject svgObject) throws SVGParseException {
            if (!(svgObject instanceof TextChild)) {
                throw new SVGParseException(new StringBuffer().append(new StringBuffer().append("Text content elements cannot contain ").append(svgObject).toString()).append(" elements.").toString());
            }
            this.children.add(svgObject);
        }
    }

    static class TextPath extends TextContainer implements TextChild {
        String href;
        Length startOffset;
        private TextRoot textRoot;

        @Override
        String getNodeName() {
            return "textPath";
        }

        @Override
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    static abstract class TextPositionedContainer extends TextContainer {

        List<Length> f4729dx;

        List<Length> f4730dy;

        List<Length> f4731x;

        List<Length> f4732y;
    }

    interface TextRoot {
    }

    static class TextSequence extends SvgObject implements TextChild {
        String text;
        private TextRoot textRoot;

        TextSequence(String str) {
            this.text = str;
        }

        @Override
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }

        public String toString() {
            return new StringBuffer().append(new StringBuffer().append("TextChild: '").append(this.text).toString()).append("'").toString();
        }
    }

    enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent;

        public static Unit valueOf(String str) {
            for (Unit unit : values()) {
                if (unit.name().equals(str)) {
                    return unit;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    static class Use extends Group {
        Length height;
        String href;
        Length width;

        Length f4741x;

        Length f4742y;

        @Override
        String getNodeName() {
            return "use";
        }
    }

    static class View extends SvgViewBoxContainer implements NotDirectlyRendered {
        static final String NODE_NAME = "view";

        @Override
        String getNodeName() {
            return NODE_NAME;
        }
    }

    SVG() {
    }

    private String cssQuotedString(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", IOUtils.LINE_SEPARATOR_UNIX);
    }

    @SuppressWarnings("unused")
    public static void deregisterExternalFileResolver() {
        externalFileResolver = (SVGExternalFileResolver) null;
    }

    private Box getDocumentDimensions(float f) {
        float fFloatValue;
        Length length = this.rootElement.width;
        Length length2 = this.rootElement.height;
        if (length == null || length.isZero() || length.unit == Unit.percent || length.unit == Unit.em || length.unit == Unit.ex) {
            return new Box(-1, -1, -1, -1);
        }
        float fFloatValue2 = length.floatValue(f);
        if (length2 == null) {
            fFloatValue = this.rootElement.viewBox != null ? (this.rootElement.viewBox.height * fFloatValue2) / this.rootElement.viewBox.width : fFloatValue2;
        } else {
            if (length2.isZero() || length2.unit == Unit.percent || length2.unit == Unit.em || length2.unit == Unit.ex) {
                return new Box(-1, -1, -1, -1);
            }
            fFloatValue = length2.floatValue(f);
        }
        return new Box(0, 0, fFloatValue2, fFloatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SvgElementBase getElementById(SvgContainer svgContainer, String str) {
        SvgElementBase elementById;
        SvgElementBase svgElementBase = (SvgElementBase) svgContainer;
        if (str.equals(svgElementBase.f4719id)) {
            return svgElementBase;
        }
        for (Object obj : svgContainer.getChildren()) {
            if (obj instanceof SvgElementBase) {
                SvgElementBase svgElementBase2 = (SvgElementBase) obj;
                if (str.equals(svgElementBase2.f4719id)) {
                    return svgElementBase2;
                }
                if ((obj instanceof SvgContainer) && (elementById = getElementById((SvgContainer) obj, str)) != null) {
                    return elementById;
                }
            }
        }
        return (SvgElementBase) null;
    }

    @SuppressWarnings("rawtypes")
    private List<SvgObject> getElementsByTagName(String str) {
        ArrayList arrayList = new ArrayList();
        getElementsByTagName(arrayList, this.rootElement, str);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressWarnings("rawtypes")
    private void getElementsByTagName(List<SvgObject> list, SvgObject svgObject, String str) {
        if (svgObject.getNodeName().equals(str)) {
            list.add(svgObject);
        }
        if (svgObject instanceof SvgContainer) {
            Iterator<SvgObject> it = ((SvgContainer) svgObject).getChildren().iterator();
            while (it.hasNext()) {
                getElementsByTagName(list, it.next(), str);
            }
        }
    }

    static SVGExternalFileResolver getFileResolver() {
        return externalFileResolver;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public static SVG getFromAsset(AssetManager assetManager, String str) throws IOException, SVGParseException {
        SVGParser sVGParser = new SVGParser();
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            SVG c1580svg = sVGParser.parse(inputStreamOpen, enableInternalEntities);
            try {
                inputStreamOpen.close();
            } catch (IOException e) {
            }
            return c1580svg;
        } catch (Throwable th) {
            try {
                inputStreamOpen.close();
            } catch (IOException e2) {
            }
            throw th;
        }
    }

    @SuppressWarnings("WeakerAccess")
    public static SVG getFromInputStream(InputStream inputStream) throws SVGParseException {
        return new SVGParser().parse(inputStream, enableInternalEntities);
    }

    @SuppressWarnings("WeakerAccess")
    public static SVG getFromResource(Context context, int i) throws SVGParseException {
        return getFromResource(context.getResources(), i);
    }

    @SuppressWarnings("WeakerAccess")
    public static SVG getFromResource(Resources resources, int i) throws SVGParseException {
        SVGParser sVGParser = new SVGParser();
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        try {
            SVG c1580svg = sVGParser.parse(inputStreamOpenRawResource, enableInternalEntities);
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException e) {
            }
            return c1580svg;
        } catch (Throwable th) {
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException e2) {
            }
            throw th;
        }
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public static SVG getFromString(String str) throws SVGParseException {
        return new SVGParser().parse(new ByteArrayInputStream(str.getBytes()), enableInternalEntities);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public static String getVersion() {
        return VERSION;
    }

    @SuppressWarnings("unused")
    public static boolean isInternalEntitiesEnabled() {
        return enableInternalEntities;
    }

    @SuppressWarnings("unused")
    public static void registerExternalFileResolver(SVGExternalFileResolver sVGExternalFileResolver) {
        externalFileResolver = sVGExternalFileResolver;
    }

    @SuppressWarnings("unused")
    public static void setInternalEntitiesEnabled(boolean z) {
        enableInternalEntities = z;
    }

    void addCSSRules(CSSParser.Ruleset ruleset) {
        this.cssRules.addAll(ruleset);
    }

    void clearRenderCSSRules() {
        this.cssRules.removeFromSource(CSSParser.Source.RenderOptions);
    }

    List<CSSParser.Rule> getCSSRules() {
        return this.cssRules.getRules();
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public float getDocumentAspectRatio() {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        Length length = this.rootElement.width;
        Length length2 = this.rootElement.height;
        if (length != null && length2 != null && length.unit != Unit.percent && length2.unit != Unit.percent) {
            if (length.isZero() || length2.isZero()) {
                return -1.0f;
            }
            return length.floatValue(this.renderDPI) / length2.floatValue(this.renderDPI);
        }
        if (this.rootElement.viewBox == null || this.rootElement.viewBox.width == 0.0f || this.rootElement.viewBox.height == 0.0f) {
            return -1.0f;
        }
        return this.rootElement.viewBox.width / this.rootElement.viewBox.height;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public String getDocumentDescription() {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return this.desc;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public float getDocumentHeight() {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return getDocumentDimensions(this.renderDPI).height;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public PreserveAspectRatio getDocumentPreserveAspectRatio() {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return this.rootElement.preserveAspectRatio == null ? (PreserveAspectRatio) null : this.rootElement.preserveAspectRatio;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public String getDocumentSVGVersion() {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return this.rootElement.version;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public String getDocumentTitle() {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return this.title;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public RectF getDocumentViewBox() {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return this.rootElement.viewBox == null ? (RectF) null : this.rootElement.viewBox.toRectF();
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public float getDocumentWidth() {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return getDocumentDimensions(this.renderDPI).width;
    }

    SvgElementBase getElementById(String str) {
        if (str == null || str.length() == 0) {
            return (SvgElementBase) null;
        }
        if (str.equals(this.rootElement.f4719id)) {
            return this.rootElement;
        }
        if (this.idToElementMap.containsKey(str)) {
            return this.idToElementMap.get(str);
        }
        SvgElementBase elementById = getElementById(this.rootElement, str);
        this.idToElementMap.put(str, elementById);
        return elementById;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public float getRenderDPI() {
        return this.renderDPI;
    }

    Svg getRootElement() {
        return this.rootElement;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public Set<String> getViewList() {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        List<SvgObject> elementsByTagName = getElementsByTagName("view");
        HashSet hashSet = new HashSet(elementsByTagName.size());
        Iterator<SvgObject> it = elementsByTagName.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view.f4719id != null) {
                hashSet.add(view.f4719id);
            } else {
                Log.w("AndroidSVG", "getViewList(): found a <view> without an id attribute");
            }
        }
        return hashSet;
    }

    boolean hasCSSRules() {
        return !this.cssRules.isEmpty();
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void renderToCanvas(Canvas canvas) {
        renderToCanvas(canvas, (RenderOptions) null);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void renderToCanvas(Canvas canvas, RectF rectF) {
        RenderOptions renderOptions = new RenderOptions();
        if (rectF != null) {
            renderOptions.viewPort(rectF.left, rectF.top, rectF.width(), rectF.height());
        } else {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new SVGAndroidRenderer(canvas, this.renderDPI).renderDocument(this, renderOptions);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void renderToCanvas(Canvas canvas, RenderOptions renderOptions) {
        if (renderOptions == null) {
            renderOptions = new RenderOptions();
        }
        if (!renderOptions.hasViewPort()) {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new SVGAndroidRenderer(canvas, this.renderDPI).renderDocument(this, renderOptions);
    }

    @SuppressWarnings("WeakerAccess")
    public Picture renderToPicture() {
        return renderToPicture((RenderOptions) null);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public Picture renderToPicture(int i, int i2) {
        return renderToPicture(i, i2, (RenderOptions) null);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public Picture renderToPicture(int i, int i2, RenderOptions renderOptions) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        if (renderOptions == null || renderOptions.viewPort == null) {
            RenderOptions renderOptions2 = renderOptions == null ? new RenderOptions() : new RenderOptions(renderOptions);
            renderOptions2.viewPort(0.0f, 0.0f, i, i2);
            renderOptions = renderOptions2;
        }
        new SVGAndroidRenderer(canvasBeginRecording, this.renderDPI).renderDocument(this, renderOptions);
        picture.endRecording();
        return picture;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public Picture renderToPicture(RenderOptions renderOptions) {
        Box box = (renderOptions == null || !renderOptions.hasViewBox()) ? this.rootElement.viewBox : renderOptions.viewBox;
        if (renderOptions != null && renderOptions.hasViewPort()) {
            return renderToPicture((int) Math.ceil(renderOptions.viewPort.maxX()), (int) Math.ceil(renderOptions.viewPort.maxY()), renderOptions);
        }
        if (this.rootElement.width != null && this.rootElement.width.unit != Unit.percent && this.rootElement.height != null && this.rootElement.height.unit != Unit.percent) {
            return renderToPicture((int) Math.ceil(this.rootElement.width.floatValue(this.renderDPI)), (int) Math.ceil(this.rootElement.height.floatValue(this.renderDPI)), renderOptions);
        }
        if (this.rootElement.width != null && box != null) {
            float fFloatValue = this.rootElement.width.floatValue(this.renderDPI);
            return renderToPicture((int) Math.ceil(fFloatValue), (int) Math.ceil((box.height * fFloatValue) / box.width), renderOptions);
        }
        if (this.rootElement.height == null || box == null) {
            return renderToPicture(512, 512, renderOptions);
        }
        float fFloatValue2 = this.rootElement.height.floatValue(this.renderDPI);
        return renderToPicture((int) Math.ceil((box.width * fFloatValue2) / box.height), (int) Math.ceil(fFloatValue2), renderOptions);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void renderViewToCanvas(String str, Canvas canvas) {
        renderToCanvas(canvas, RenderOptions.create().view(str));
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void renderViewToCanvas(String str, Canvas canvas, RectF rectF) {
        RenderOptions renderOptionsView = RenderOptions.create().view(str);
        if (rectF != null) {
            renderOptionsView.viewPort(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
        renderToCanvas(canvas, renderOptionsView);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public Picture renderViewToPicture(String str, int i, int i2) {
        RenderOptions renderOptions = new RenderOptions();
        renderOptions.view(str).viewPort(0.0f, 0.0f, i, i2);
        Picture picture = new Picture();
        new SVGAndroidRenderer(picture.beginRecording(i, i2), this.renderDPI).renderDocument(this, renderOptions);
        picture.endRecording();
        return picture;
    }

    SvgObject resolveIRI(String str) {
        if (str == null) {
            return (SvgObject) null;
        }
        String strCssQuotedString = cssQuotedString(str);
        return (strCssQuotedString.length() <= 1 || !strCssQuotedString.startsWith("#")) ? (SvgObject) null : getElementById(strCssQuotedString.substring(1));
    }

    void setDesc(String str) {
        this.desc = str;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void setDocumentHeight(float f) {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        this.rootElement.height = new Length(f);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void setDocumentHeight(String str) throws SVGParseException {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        this.rootElement.height = SVGParser.parseLength(str);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void setDocumentPreserveAspectRatio(PreserveAspectRatio preserveAspectRatio) {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        this.rootElement.preserveAspectRatio = preserveAspectRatio;
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void setDocumentViewBox(float f, float f2, float f3, float f4) {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        this.rootElement.viewBox = new Box(f, f2, f3, f4);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void setDocumentWidth(float f) {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        this.rootElement.width = new Length(f);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void setDocumentWidth(String str) throws SVGParseException {
        if (this.rootElement == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        this.rootElement.width = SVGParser.parseLength(str);
    }

    @SuppressWarnings({"WeakerAccess", "unused"})
    public void setRenderDPI(float f) {
        this.renderDPI = f;
    }

    void setRootElement(Svg svg) {
        this.rootElement = svg;
    }

    void setTitle(String str) {
        this.title = str;
    }
}
