package com.caverock.androidsvg;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import org.apache.commons.io.FileUtils;

class SVGAndroidRenderer {
    private static final float BEZIER_ARC_FACTOR = 0.5522848f;
    private static final String DEFAULT_FONT_FAMILY = "serif";
    public static final float LUMINANCE_TO_ALPHA_BLUE = 0.0722f;
    public static final float LUMINANCE_TO_ALPHA_GREEN = 0.7151f;
    public static final float LUMINANCE_TO_ALPHA_RED = 0.2127f;

    private static final String f4743TAG = "SVGAndroidRenderer";
    private static HashSet<String> supportedFeatures = (HashSet) null;
    private Canvas canvas;
    private SVG document;

    private float f4744dpi;
    private Stack<Matrix> matrixStack;
    private Stack<SVG.SvgContainer> parentStack;
    private CSSParser.RuleMatchContext ruleMatchContext = (CSSParser.RuleMatchContext) null;
    private RendererState state;
    private Stack<RendererState> stateStack;

    private class MarkerPositionCalculator implements SVG.PathInterface {
        private boolean closepathReAdjustPending;
        private float startX;
        private float startY;
        private final SVGAndroidRenderer this$0;
        private List<MarkerVector> markers = new ArrayList();
        private MarkerVector lastPos = (MarkerVector) null;
        private boolean startArc = false;
        private boolean normalCubic = true;
        private int subpathStartIndex = -1;

        MarkerPositionCalculator(SVGAndroidRenderer sVGAndroidRenderer, SVG.PathDefinition pathDefinition) {
            this.this$0 = sVGAndroidRenderer;
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.enumeratePath(this);
            if (this.closepathReAdjustPending) {
                this.lastPos.m7053add(this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            if (this.lastPos != null) {
                this.markers.add(this.lastPos);
            }
        }

        @Override
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.startArc = true;
            this.normalCubic = false;
            SVGAndroidRenderer.arcTo(this.lastPos.f4747x, this.lastPos.f4748y, f, f2, f3, z, z2, f4, f5, this);
            this.normalCubic = true;
            this.closepathReAdjustPending = false;
        }

        @Override
        public void close() {
            this.markers.add(this.lastPos);
            lineTo(this.startX, this.startY);
            this.closepathReAdjustPending = true;
        }

        @Override
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.normalCubic || this.startArc) {
                this.lastPos.m7052add(f, f2);
                this.markers.add(this.lastPos);
                this.startArc = false;
            }
            this.lastPos = new MarkerVector(this.this$0, f5, f6, f5 - f3, f6 - f4);
            this.closepathReAdjustPending = false;
        }

        List<MarkerVector> getMarkers() {
            return this.markers;
        }

        @Override
        public void lineTo(float f, float f2) {
            this.lastPos.m7052add(f, f2);
            this.markers.add(this.lastPos);
            this.lastPos = new MarkerVector(this.this$0, f, f2, f - this.lastPos.f4747x, f2 - this.lastPos.f4748y);
            this.closepathReAdjustPending = false;
        }

        @Override
        public void moveTo(float f, float f2) {
            if (this.closepathReAdjustPending) {
                this.lastPos.m7053add(this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            if (this.lastPos != null) {
                this.markers.add(this.lastPos);
            }
            this.startX = f;
            this.startY = f2;
            this.lastPos = new MarkerVector(this.this$0, f, f2, 0, 0);
            this.subpathStartIndex = this.markers.size();
        }

        @Override
        public void quadTo(float f, float f2, float f3, float f4) {
            this.lastPos.m7052add(f, f2);
            this.markers.add(this.lastPos);
            this.lastPos = new MarkerVector(this.this$0, f3, f4, f3 - f, f4 - f2);
            this.closepathReAdjustPending = false;
        }
    }

    private class MarkerVector {

        float f4745dx;

        float f4746dy;
        boolean isAmbiguous = false;
        private final SVGAndroidRenderer this$0;

        float f4747x;

        float f4748y;

        MarkerVector(SVGAndroidRenderer sVGAndroidRenderer, float f, float f2, float f3, float f4) {
            this.this$0 = sVGAndroidRenderer;
            this.f4745dx = 0.0f;
            this.f4746dy = 0.0f;
            this.f4747x = f;
            this.f4748y = f2;
            double dSqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (dSqrt != 0) {
                this.f4745dx = (float) (((double) f3) / dSqrt);
                this.f4746dy = (float) (((double) f4) / dSqrt);
            }
        }

        void m7052add(float f, float f2) {
            float f3 = f - this.f4747x;
            float f4 = f2 - this.f4748y;
            double dSqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (dSqrt != 0) {
                f3 = (float) (((double) f3) / dSqrt);
                f4 = (float) (((double) f4) / dSqrt);
            }
            if (f3 != (-this.f4745dx) || f4 != (-this.f4746dy)) {
                this.f4745dx = f3 + this.f4745dx;
                this.f4746dy = f4 + this.f4746dy;
            } else {
                this.isAmbiguous = true;
                this.f4745dx = -f4;
                this.f4746dy = f3;
            }
        }

        void m7053add(MarkerVector markerVector) {
            if (markerVector.f4745dx != (-this.f4745dx) || markerVector.f4746dy != (-this.f4746dy)) {
                this.f4745dx += markerVector.f4745dx;
                this.f4746dy += markerVector.f4746dy;
            } else {
                this.isAmbiguous = true;
                this.f4745dx = -markerVector.f4746dy;
                this.f4746dy = markerVector.f4745dx;
            }
        }

        public String toString() {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("(").append(this.f4747x).toString()).append(",").toString()).append(this.f4748y).toString()).append(" ").toString()).append(this.f4745dx).toString()).append(",").toString()).append(this.f4746dy).toString()).append(")").toString();
        }
    }

    private class PathConverter implements SVG.PathInterface {
        float lastX;
        float lastY;
        Path path = new Path();
        private final SVGAndroidRenderer this$0;

        PathConverter(SVGAndroidRenderer sVGAndroidRenderer, SVG.PathDefinition pathDefinition) {
            this.this$0 = sVGAndroidRenderer;
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.enumeratePath(this);
        }

        @Override
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            SVGAndroidRenderer.arcTo(this.lastX, this.lastY, f, f2, f3, z, z2, f4, f5, this);
            this.lastX = f4;
            this.lastY = f5;
        }

        @Override
        public void close() {
            this.path.close();
        }

        @Override
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.path.cubicTo(f, f2, f3, f4, f5, f6);
            this.lastX = f5;
            this.lastY = f6;
        }

        Path getPath() {
            return this.path;
        }

        @Override
        public void lineTo(float f, float f2) {
            this.path.lineTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        @Override
        public void moveTo(float f, float f2) {
            this.path.moveTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        @Override
        public void quadTo(float f, float f2, float f3, float f4) {
            this.path.quadTo(f, f2, f3, f4);
            this.lastX = f3;
            this.lastY = f4;
        }
    }

    private class PathTextDrawer extends PlainTextDrawer {
        private Path path;
        private final SVGAndroidRenderer this$0;

        PathTextDrawer(SVGAndroidRenderer sVGAndroidRenderer, Path path, float f, float f2) {
            super(sVGAndroidRenderer, f, f2);
            this.this$0 = sVGAndroidRenderer;
            this.path = path;
        }

        @Override
        public void processText(String str) {
            if (this.this$0.visible()) {
                if (this.this$0.state.hasFill) {
                    this.this$0.canvas.drawTextOnPath(str, this.path, this.f4749x, this.f4750y, this.this$0.state.fillPaint);
                }
                if (this.this$0.state.hasStroke) {
                    this.this$0.canvas.drawTextOnPath(str, this.path, this.f4749x, this.f4750y, this.this$0.state.strokePaint);
                }
            }
            this.f4749x += this.this$0.state.fillPaint.measureText(str);
        }
    }

    private class PlainTextDrawer extends TextProcessor {
        private final SVGAndroidRenderer this$0;

        float f4749x;

        float f4750y;

        PlainTextDrawer(SVGAndroidRenderer sVGAndroidRenderer, float f, float f2) {
            super(sVGAndroidRenderer);
            this.this$0 = sVGAndroidRenderer;
            this.f4749x = f;
            this.f4750y = f2;
        }

        @Override
        public void processText(String str) {
            SVGAndroidRenderer.debug("TextSequence render", new Object[0]);
            if (this.this$0.visible()) {
                if (this.this$0.state.hasFill) {
                    this.this$0.canvas.drawText(str, this.f4749x, this.f4750y, this.this$0.state.fillPaint);
                }
                if (this.this$0.state.hasStroke) {
                    this.this$0.canvas.drawText(str, this.f4749x, this.f4750y, this.this$0.state.strokePaint);
                }
            }
            this.f4749x += this.this$0.state.fillPaint.measureText(str);
        }
    }

    private class PlainTextToPath extends TextProcessor {
        Path textAsPath;
        private final SVGAndroidRenderer this$0;

        float f4751x;

        float f4752y;

        PlainTextToPath(SVGAndroidRenderer sVGAndroidRenderer, float f, float f2, Path path) {
            super(sVGAndroidRenderer);
            this.this$0 = sVGAndroidRenderer;
            this.f4751x = f;
            this.f4752y = f2;
            this.textAsPath = path;
        }

        @Override
        public boolean doTextContainer(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVGAndroidRenderer.warn("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override
        public void processText(String str) {
            if (this.this$0.visible()) {
                Path path = new Path();
                this.this$0.state.fillPaint.getTextPath(str, 0, str.length(), this.f4751x, this.f4752y, path);
                this.textAsPath.addPath(path);
            }
            this.f4751x += this.this$0.state.fillPaint.measureText(str);
        }
    }

    private class RendererState {
        Paint fillPaint;
        boolean hasFill;
        boolean hasStroke;
        boolean spacePreserve;
        Paint strokePaint;
        SVG.Style style;
        private final SVGAndroidRenderer this$0;
        SVG.Box viewBox;
        SVG.Box viewPort;

        RendererState(SVGAndroidRenderer sVGAndroidRenderer) {
            this.this$0 = sVGAndroidRenderer;
            this.fillPaint = new Paint();
            this.fillPaint.setFlags(385);
            this.fillPaint.setStyle(Paint.Style.FILL);
            this.fillPaint.setTypeface(Typeface.DEFAULT);
            this.strokePaint = new Paint();
            this.strokePaint.setFlags(385);
            this.strokePaint.setStyle(Paint.Style.STROKE);
            this.strokePaint.setTypeface(Typeface.DEFAULT);
            this.style = SVG.Style.getDefaultStyle();
        }

        RendererState(SVGAndroidRenderer sVGAndroidRenderer, RendererState rendererState) {
            this.this$0 = sVGAndroidRenderer;
            this.hasFill = rendererState.hasFill;
            this.hasStroke = rendererState.hasStroke;
            this.fillPaint = new Paint(rendererState.fillPaint);
            this.strokePaint = new Paint(rendererState.strokePaint);
            if (rendererState.viewPort != null) {
                this.viewPort = new SVG.Box(rendererState.viewPort);
            }
            if (rendererState.viewBox != null) {
                this.viewBox = new SVG.Box(rendererState.viewBox);
            }
            this.spacePreserve = rendererState.spacePreserve;
            try {
                this.style = (SVG.Style) rendererState.style.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.style = SVG.Style.getDefaultStyle();
            }
        }
    }

    private class TextBoundsCalculator extends TextProcessor {
        RectF bbox;
        private final SVGAndroidRenderer this$0;

        float f4753x;

        float f4754y;

        TextBoundsCalculator(SVGAndroidRenderer sVGAndroidRenderer, float f, float f2) {
            super(sVGAndroidRenderer);
            this.this$0 = sVGAndroidRenderer;
            this.bbox = new RectF();
            this.f4753x = f;
            this.f4754y = f2;
        }

        @Override
        public boolean doTextContainer(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVG.TextPath textPath = (SVG.TextPath) textContainer;
            SVG.SvgObject svgObjectResolveIRI = textContainer.document.resolveIRI(textPath.href);
            if (svgObjectResolveIRI == null) {
                SVGAndroidRenderer.error("TextPath path reference '%s' not found", textPath.href);
                return false;
            }
            SVG.Path path = (SVG.Path) svgObjectResolveIRI;
            Path path2 = new PathConverter(this.this$0, path.f4707d).getPath();
            if (path.transform != null) {
                path2.transform(path.transform);
            }
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            this.bbox.union(rectF);
            return false;
        }

        @Override
        public void processText(String str) {
            if (this.this$0.visible()) {
                Rect rect = new Rect();
                this.this$0.state.fillPaint.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f4753x, this.f4754y);
                this.bbox.union(rectF);
            }
            this.f4753x += this.this$0.state.fillPaint.measureText(str);
        }
    }

    private abstract class TextProcessor {
        private final SVGAndroidRenderer this$0;

        public TextProcessor(SVGAndroidRenderer sVGAndroidRenderer) {
            this.this$0 = sVGAndroidRenderer;
        }

        public boolean doTextContainer(SVG.TextContainer textContainer) {
            return true;
        }

        public abstract void processText(String str);
    }

    private class TextWidthCalculator extends TextProcessor {
        private final SVGAndroidRenderer this$0;

        float f4755x;

        public TextWidthCalculator(SVGAndroidRenderer sVGAndroidRenderer) {
            super(sVGAndroidRenderer);
            this.this$0 = sVGAndroidRenderer;
            this.f4755x = 0;
        }

        @Override
        public void processText(String str) {
            this.f4755x += this.this$0.state.fillPaint.measureText(str);
        }
    }

    SVGAndroidRenderer(Canvas canvas, float f) {
        this.canvas = canvas;
        this.f4744dpi = f;
    }

    private void addObjectToClip(SVG.GraphicsElement graphicsElement, Path path, Matrix matrix) {
        Path pathMakePathAndBoundingBox;
        updateStyleForElement(this.state, graphicsElement);
        if (display() && visible()) {
            if (graphicsElement.transform != null) {
                matrix.preConcat(graphicsElement.transform);
            }
            if (graphicsElement instanceof SVG.Rect) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.Rect) graphicsElement);
            } else if (graphicsElement instanceof SVG.Circle) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.Circle) graphicsElement);
            } else if (graphicsElement instanceof SVG.Ellipse) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.Ellipse) graphicsElement);
            } else if (!(graphicsElement instanceof SVG.PolyLine)) {
                return;
            } else {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.PolyLine) graphicsElement);
            }
            checkForClipPath(graphicsElement);
            path.setFillType(getClipRuleFromState());
            path.addPath(pathMakePathAndBoundingBox, matrix);
        }
    }

    private void addObjectToClip(SVG.Path path, Path path2, Matrix matrix) {
        updateStyleForElement(this.state, path);
        if (display() && visible()) {
            if (path.transform != null) {
                matrix.preConcat(path.transform);
            }
            Path path3 = new PathConverter(this, path.f4707d).getPath();
            if (path.boundingBox == null) {
                path.boundingBox = calculatePathBounds(path3);
            }
            checkForClipPath(path);
            path2.setFillType(getClipRuleFromState());
            path2.addPath(path3, matrix);
        }
    }

    private void addObjectToClip(SVG.SvgObject svgObject, boolean z, Path path, Matrix matrix) {
        if (display()) {
            clipStatePush();
            if (svgObject instanceof SVG.Use) {
                if (z) {
                    addObjectToClip((SVG.Use) svgObject, path, matrix);
                } else {
                    error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (svgObject instanceof SVG.Path) {
                addObjectToClip((SVG.Path) svgObject, path, matrix);
            } else if (svgObject instanceof SVG.Text) {
                addObjectToClip((SVG.Text) svgObject, path, matrix);
            } else if (svgObject instanceof SVG.GraphicsElement) {
                addObjectToClip((SVG.GraphicsElement) svgObject, path, matrix);
            } else {
                error("Invalid %s element found in clipPath definition", svgObject.toString());
            }
            clipStatePop();
        }
    }

    private void addObjectToClip(SVG.Text text, Path path, Matrix matrix) {
        float fFloatValueY = 0.0f;
        updateStyleForElement(this.state, text);
        if (display()) {
            if (text.transform != null) {
                matrix.preConcat(text.transform);
            }
            float fFloatValueX = (text.f4731x == null || text.f4731x.size() == 0) ? 0.0f : text.f4731x.get(0).floatValueX(this);
            float fFloatValueY2 = (text.f4732y == null || text.f4732y.size() == 0) ? 0.0f : text.f4732y.get(0).floatValueY(this);
            float fFloatValueX2 = (text.f4729dx == null || text.f4729dx.size() == 0) ? 0.0f : text.f4729dx.get(0).floatValueX(this);
            if (text.f4730dy != null && text.f4730dy.size() != 0) {
                fFloatValueY = text.f4730dy.get(0).floatValueY(this);
            }
            if (this.state.style.textAnchor != SVG.Style.TextAnchor.Start) {
                float fCalculateTextWidth = calculateTextWidth(text);
                fFloatValueX = this.state.style.textAnchor == SVG.Style.TextAnchor.Middle ? fFloatValueX - (fCalculateTextWidth / 2) : fFloatValueX - fCalculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(this, fFloatValueX, fFloatValueY2);
                enumerateTextSpans(text, textBoundsCalculator);
                text.boundingBox = new SVG.Box(textBoundsCalculator.bbox.left, textBoundsCalculator.bbox.top, textBoundsCalculator.bbox.width(), textBoundsCalculator.bbox.height());
            }
            checkForClipPath(text);
            Path path2 = new Path();
            enumerateTextSpans(text, new PlainTextToPath(this, fFloatValueX + fFloatValueX2, fFloatValueY + fFloatValueY2, path2));
            path.setFillType(getClipRuleFromState());
            path.addPath(path2, matrix);
        }
    }

    private void addObjectToClip(SVG.Use use, Path path, Matrix matrix) {
        updateStyleForElement(this.state, use);
        if (display() && visible()) {
            if (use.transform != null) {
                matrix.preConcat(use.transform);
            }
            SVG.SvgObject svgObjectResolveIRI = use.document.resolveIRI(use.href);
            if (svgObjectResolveIRI == null) {
                error("Use reference '%s' not found", use.href);
            } else {
                checkForClipPath(use);
                addObjectToClip(svgObjectResolveIRI, false, path, matrix);
            }
        }
    }

    public static void arcTo(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.PathInterface pathInterface) {
        double d;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0 || f4 == 0) {
            pathInterface.lineTo(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(((double) f5) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d2 = ((double) (f - f6)) / 2.0d;
        double d3 = ((double) (f2 - f7)) / 2.0d;
        double d4 = (dCos * d2) + (dSin * d3);
        double d5 = (d2 * (-dSin)) + (d3 * dCos);
        double d6 = fAbs * fAbs;
        double d7 = fAbs2 * fAbs2;
        double d8 = d4 * d4;
        double d9 = d5 * d5;
        double d10 = (d8 / d6) + (d9 / d7);
        if (d10 > 0.99999d) {
            double dSqrt = Math.sqrt(d10) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d7 = fAbs2 * fAbs2;
            d = fAbs * fAbs;
        } else {
            d = d6;
        }
        double d11 = (z ? z2 : !z2) ? -1 : 1;
        double d12 = (((d * d7) - (d * d9)) - (d7 * d8)) / ((d * d9) + (d7 * d8));
        if (d12 < 0) {
            d12 = 0;
        }
        double dSqrt2 = Math.sqrt(d12) * d11;
        double d13 = ((((double) fAbs) * d5) / ((double) fAbs2)) * dSqrt2;
        double d14 = dSqrt2 * (-((((double) fAbs2) * d4) / ((double) fAbs)));
        double d15 = ((double) (f + f6)) / 2.0d;
        double d16 = ((double) (f2 + f7)) / 2.0d;
        double d17 = (d4 - d13) / ((double) fAbs);
        double d18 = (d5 - d14) / ((double) fAbs2);
        double d19 = ((-d4) - d13) / ((double) fAbs);
        double d20 = ((-d5) - d14) / ((double) fAbs2);
        double dSqrt3 = Math.sqrt((d17 * d17) + (d18 * d18));
        double d21 = d18 < ((double) 0) ? -1.0d : 1.0d;
        double dAcos = Math.acos(d17 / dSqrt3);
        double dCheckedArcCos = ((double) ((d17 * d20) - (d19 * d18) < ((double) 0) ? -1.0f : 1.0f)) * checkedArcCos(((d19 * d17) + (d20 * d18)) / Math.sqrt(((d17 * d17) + (d18 * d18)) * ((d19 * d19) + (d20 * d20))));
        if (!z2 && dCheckedArcCos > 0) {
            dCheckedArcCos -= 6.283185307179586d;
        } else if (z2 && dCheckedArcCos < 0) {
            dCheckedArcCos += 6.283185307179586d;
        }
        float[] fArrArcToBeziers = arcToBeziers((d21 * dAcos) % 6.283185307179586d, dCheckedArcCos % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) (((dCos * d13) - (dSin * d14)) + d15), (float) ((dCos * d14) + (d13 * dSin) + d16));
        matrix.mapPoints(fArrArcToBeziers);
        fArrArcToBeziers[fArrArcToBeziers.length - 2] = f6;
        fArrArcToBeziers[fArrArcToBeziers.length - 1] = f7;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= fArrArcToBeziers.length) {
                return;
            }
            pathInterface.cubicTo(fArrArcToBeziers[i2], fArrArcToBeziers[i2 + 1], fArrArcToBeziers[i2 + 2], fArrArcToBeziers[i2 + 3], fArrArcToBeziers[i2 + 4], fArrArcToBeziers[i2 + 5]);
            i = i2 + 6;
        }
    }

    private static float[] arcToBeziers(double d, double d2) {
        int iCeil = (int) Math.ceil((Math.abs(d2) * 2.0d) / 3.141592653589793d);
        double d3 = d2 / ((double) iCeil);
        double dSin = (1.3333333333333333d * Math.sin(d3 / 2.0d)) / (1.0d + Math.cos(d3 / 2.0d));
        float[] fArr = new float[iCeil * 6];
        int i = 0;
        for (int i2 = 0; i2 < iCeil; i2++) {
            double d4 = (((double) i2) * d3) + d;
            double dCos = Math.cos(d4);
            double dSin2 = Math.sin(d4);
            int i3 = i + 1;
            fArr[i] = (float) (dCos - (dSin * dSin2));
            int i4 = i3 + 1;
            fArr[i3] = (float) ((dCos * dSin) + dSin2);
            double d5 = d4 + d3;
            double dCos2 = Math.cos(d5);
            double dSin3 = Math.sin(d5);
            int i5 = i4 + 1;
            fArr[i4] = (float) ((dSin * dSin3) + dCos2);
            int i6 = i5 + 1;
            fArr[i5] = (float) (dSin3 - (dSin * dCos2));
            int i7 = i6 + 1;
            fArr[i6] = (float) dCos2;
            i = i7 + 1;
            fArr[i7] = (float) dSin3;
        }
        return fArr;
    }

    @TargetApi(19)
    private Path calculateClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        Path pathObjectToPath;
        SVG.SvgObject svgObjectResolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        if (svgObjectResolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return (Path) null;
        }
        SVG.ClipPath clipPath = (SVG.ClipPath) svgObjectResolveIRI;
        this.stateStack.push(this.state);
        this.state = findInheritFromAncestorState(clipPath);
        boolean z = clipPath.clipPathUnitsAreUser == null || clipPath.clipPathUnitsAreUser.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        if (clipPath.transform != null) {
            matrix.preConcat(clipPath.transform);
        }
        Path path = new Path();
        for (SVG.SvgObject svgObject : clipPath.children) {
            if ((svgObject instanceof SVG.SvgElement) && (pathObjectToPath = objectToPath((SVG.SvgElement) svgObject, true)) != null) {
                path.op(pathObjectToPath, Path.Op.UNION);
            }
        }
        if (this.state.style.clipPath != null) {
            if (clipPath.boundingBox == null) {
                clipPath.boundingBox = calculatePathBounds(path);
            }
            Path pathCalculateClipPath = calculateClipPath(clipPath, clipPath.boundingBox);
            if (pathCalculateClipPath != null) {
                path.op(pathCalculateClipPath, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.state = this.stateStack.pop();
        return path;
    }

    private List<MarkerVector> calculateMarkerPositions(SVG.Line line) {
        float fFloatValueX = line.f4701x1 != null ? line.f4701x1.floatValueX(this) : 0.0f;
        float fFloatValueY = line.f4703y1 != null ? line.f4703y1.floatValueY(this) : 0.0f;
        float fFloatValueX2 = line.f4702x2 != null ? line.f4702x2.floatValueX(this) : 0.0f;
        float fFloatValueY2 = line.f4704y2 != null ? line.f4704y2.floatValueY(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new MarkerVector(this, fFloatValueX, fFloatValueY, fFloatValueX2 - fFloatValueX, fFloatValueY2 - fFloatValueY));
        arrayList.add(new MarkerVector(this, fFloatValueX2, fFloatValueY2, fFloatValueX2 - fFloatValueX, fFloatValueY2 - fFloatValueY));
        return arrayList;
    }

    private List<MarkerVector> calculateMarkerPositions(SVG.PolyLine polyLine) {
        int length = polyLine.points.length;
        if (length < 2) {
            return (List) null;
        }
        ArrayList arrayList = new ArrayList();
        float f = 0;
        float f2 = 0;
        MarkerVector markerVector = new MarkerVector(this, polyLine.points[0], polyLine.points[1], 0, 0);
        for (int i = 2; i < length; i += 2) {
            f = polyLine.points[i];
            f2 = polyLine.points[i + 1];
            markerVector.m7052add(f, f2);
            arrayList.add(markerVector);
            markerVector = new MarkerVector(this, f, f2, f - markerVector.f4747x, f2 - markerVector.f4748y);
        }
        if (!(polyLine instanceof SVG.Polygon)) {
            arrayList.add(markerVector);
        } else if (f != polyLine.points[0] && f2 != polyLine.points[1]) {
            float f3 = polyLine.points[0];
            float f4 = polyLine.points[1];
            markerVector.m7052add(f3, f4);
            arrayList.add(markerVector);
            MarkerVector markerVector2 = new MarkerVector(this, f3, f4, f3 - markerVector.f4747x, f4 - markerVector.f4748y);
            markerVector2.m7053add((MarkerVector) arrayList.get(0));
            arrayList.add(markerVector2);
            arrayList.set(0, markerVector2);
        }
        return arrayList;
    }

    private SVG.Box calculatePathBounds(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.Box(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private float calculateTextWidth(SVG.TextContainer textContainer) {
        TextWidthCalculator textWidthCalculator = new TextWidthCalculator(this);
        enumerateTextSpans(textContainer, textWidthCalculator);
        return textWidthCalculator.f4755x;
    }

    private Matrix calculateViewBoxTransform(SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        Matrix matrix = new Matrix();
        if (preserveAspectRatio != null && preserveAspectRatio.getAlignment() != null) {
            float f = box.width / box2.width;
            float f2 = box.height / box2.height;
            float f3 = -box2.minX;
            float f4 = -box2.minY;
            if (preserveAspectRatio.equals(PreserveAspectRatio.STRETCH)) {
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(f, f2);
                matrix.preTranslate(f3, f4);
            } else {
                float fMax = preserveAspectRatio.getScale() == PreserveAspectRatio.Scale.slice ? Math.max(f, f2) : Math.min(f, f2);
                float f5 = box.width / fMax;
                float f6 = box.height / fMax;
                PreserveAspectRatio.Alignment alignment = preserveAspectRatio.getAlignment();
                if (alignment == PreserveAspectRatio.Alignment.xMidYMin || alignment == PreserveAspectRatio.Alignment.xMidYMid || alignment == PreserveAspectRatio.Alignment.xMidYMax) {
                    f3 -= (box2.width - f5) / 2;
                } else if (alignment == PreserveAspectRatio.Alignment.xMaxYMin || alignment == PreserveAspectRatio.Alignment.xMaxYMid || alignment == PreserveAspectRatio.Alignment.xMaxYMax) {
                    f3 -= box2.width - f5;
                }
                PreserveAspectRatio.Alignment alignment2 = preserveAspectRatio.getAlignment();
                if (alignment2 == PreserveAspectRatio.Alignment.xMinYMid || alignment2 == PreserveAspectRatio.Alignment.xMidYMid || alignment2 == PreserveAspectRatio.Alignment.xMaxYMid) {
                    f4 -= (box2.height - f6) / 2;
                } else if (alignment2 == PreserveAspectRatio.Alignment.xMinYMax || alignment2 == PreserveAspectRatio.Alignment.xMidYMax || alignment2 == PreserveAspectRatio.Alignment.xMaxYMax) {
                    f4 -= box2.height - f6;
                }
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(fMax, fMax);
                matrix.preTranslate(f3, f4);
            }
        }
        return matrix;
    }

    private void checkForClipPath(SVG.SvgElement svgElement) {
        checkForClipPath(svgElement, svgElement.boundingBox);
    }

    private void checkForClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        if (this.state.style.clipPath == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            checkForClipPath_OldStyle(svgElement, box);
            return;
        }
        Path pathCalculateClipPath = calculateClipPath(svgElement, box);
        if (pathCalculateClipPath != null) {
            this.canvas.clipPath(pathCalculateClipPath);
        }
    }

    private void checkForClipPath_OldStyle(SVG.SvgElement svgElement, SVG.Box box) {
        SVG.SvgObject svgObjectResolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        if (svgObjectResolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return;
        }
        SVG.ClipPath clipPath = (SVG.ClipPath) svgObjectResolveIRI;
        if (clipPath.children.isEmpty()) {
            this.canvas.clipRect(0, 0, 0, 0);
            return;
        }
        boolean z = clipPath.clipPathUnitsAreUser == null || clipPath.clipPathUnitsAreUser.booleanValue();
        if ((svgElement instanceof SVG.Group) && !z) {
            warn("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", svgElement.getNodeName());
            return;
        }
        clipStatePush();
        if (!z) {
            Matrix matrix = new Matrix();
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
            this.canvas.concat(matrix);
        }
        if (clipPath.transform != null) {
            this.canvas.concat(clipPath.transform);
        }
        this.state = findInheritFromAncestorState(clipPath);
        checkForClipPath(clipPath);
        Path path = new Path();
        Iterator<SVG.SvgObject> it = clipPath.children.iterator();
        while (it.hasNext()) {
            addObjectToClip(it.next(), true, path, new Matrix());
        }
        this.canvas.clipPath(path);
        clipStatePop();
    }

    private void checkForGradientsAndPatterns(SVG.SvgElement svgElement) {
        if (this.state.style.fill instanceof SVG.PaintReference) {
            decodePaintReference(true, svgElement.boundingBox, (SVG.PaintReference) this.state.style.fill);
        }
        if (this.state.style.stroke instanceof SVG.PaintReference) {
            decodePaintReference(false, svgElement.boundingBox, (SVG.PaintReference) this.state.style.stroke);
        }
    }

    private Bitmap checkForImageDataURL(String str) {
        if (str.startsWith("data:") && str.length() >= 14) {
            int iIndexOf = str.indexOf(44);
            if (iIndexOf == -1 || iIndexOf < 12) {
                return (Bitmap) null;
            }
            if (!";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                return (Bitmap) null;
            }
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        }
        return (Bitmap) null;
    }

    private Typeface checkGenericFont(String str, Integer num, SVG.Style.FontStyle fontStyle) {
        int i = 0;
        Typeface typeface = (Typeface) null;
        boolean z = fontStyle == SVG.Style.FontStyle.Italic;
        if (num.intValue() > 500) {
            i = z ? 3 : 1;
        } else if (z) {
            i = 2;
        }
        if (str.equals(DEFAULT_FONT_FAMILY)) {
            return Typeface.create(Typeface.SERIF, i);
        }
        if (str.equals("sans-serif")) {
            return Typeface.create(Typeface.SANS_SERIF, i);
        }
        if (str.equals("monospace")) {
            return Typeface.create(Typeface.MONOSPACE, i);
        }
        return (str.equals("cursive") || str.equals("fantasy")) ? Typeface.create(Typeface.SANS_SERIF, i) : typeface;
    }

    private void checkXMLSpaceAttribute(SVG.SvgObject svgObject) {
        if (svgObject instanceof SVG.SvgElementBase) {
            SVG.SvgElementBase svgElementBase = (SVG.SvgElementBase) svgObject;
            if (svgElementBase.spacePreserve != null) {
                this.state.spacePreserve = svgElementBase.spacePreserve.booleanValue();
            }
        }
    }

    private static double checkedArcCos(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        return d > 1.0d ? 0 : Math.acos(d);
    }

    private static int clamp255(float f) {
        int i = (int) (256.0f * f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    private void clipStatePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    private void clipStatePush() {
        CanvasLegacy.save(this.canvas, CanvasLegacy.MATRIX_SAVE_FLAG);
        this.stateStack.push(this.state);
        this.state = new RendererState(this, this.state);
    }

    private static int colourWithOpacity(int i, float f) {
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            iRound = 0;
        } else if (iRound > 255) {
            iRound = 255;
        }
        return (iRound << 24) | (16777215 & i);
    }

    public static void debug(String str, Object... objArr) {
    }

    private void decodePaintReference(boolean z, SVG.Box box, SVG.PaintReference paintReference) {
        SVG.SvgObject svgObjectResolveIRI = this.document.resolveIRI(paintReference.href);
        if (svgObjectResolveIRI == null) {
            error("%s reference '%s' not found", z ? "Fill" : "Stroke", paintReference.href);
            if (paintReference.fallback != null) {
                setPaintColour(this.state, z, paintReference.fallback);
                return;
            } else if (z) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        if (svgObjectResolveIRI instanceof SVG.SvgLinearGradient) {
            makeLinearGradient(z, box, (SVG.SvgLinearGradient) svgObjectResolveIRI);
        } else if (svgObjectResolveIRI instanceof SVG.SvgRadialGradient) {
            makeRadialGradient(z, box, (SVG.SvgRadialGradient) svgObjectResolveIRI);
        } else if (svgObjectResolveIRI instanceof SVG.SolidColor) {
            setSolidColor(z, (SVG.SolidColor) svgObjectResolveIRI);
        }
    }

    private boolean display() {
        if (this.state.style.display != null) {
            return this.state.style.display.booleanValue();
        }
        return true;
    }

    private void doFilledPath(SVG.SvgElement svgElement, Path path) {
        if (this.state.style.fill instanceof SVG.PaintReference) {
            SVG.SvgObject svgObjectResolveIRI = this.document.resolveIRI(((SVG.PaintReference) this.state.style.fill).href);
            if (svgObjectResolveIRI instanceof SVG.Pattern) {
                fillWithPattern(svgElement, path, (SVG.Pattern) svgObjectResolveIRI);
                return;
            }
        }
        this.canvas.drawPath(path, this.state.fillPaint);
    }

    @SuppressWarnings("deprecation")
    private void doStroke(Path path) {
        if (this.state.style.vectorEffect != SVG.Style.VectorEffect.NonScalingStroke) {
            this.canvas.drawPath(path, this.state.strokePaint);
            return;
        }
        Matrix matrix = this.canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.canvas.setMatrix(new Matrix());
        Shader shader = this.state.strokePaint.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.canvas.drawPath(path2, this.state.strokePaint);
        this.canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private float dotProduct(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    private void enumerateTextSpans(SVG.TextContainer textContainer, TextProcessor textProcessor) {
        if (display()) {
            Iterator<SVG.SvgObject> it = textContainer.children.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVG.SvgObject next = it.next();
                if (next instanceof SVG.TextSequence) {
                    textProcessor.processText(textXMLSpaceTransform(((SVG.TextSequence) next).text, z, !it.hasNext()));
                } else {
                    processTextChild(next, textProcessor);
                }
                z = false;
            }
        }
    }

    public static void error(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void extractRawText(SVG.TextContainer textContainer, StringBuilder sb) {
        Iterator<SVG.SvgObject> it = textContainer.children.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.SvgObject next = it.next();
            if (next instanceof SVG.TextContainer) {
                extractRawText((SVG.TextContainer) next, sb);
            } else if (next instanceof SVG.TextSequence) {
                sb.append(textXMLSpaceTransform(((SVG.TextSequence) next).text, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private void fillInChainedGradientFields(SVG.GradientElement gradientElement, String str) {
        SVG.SvgObject svgObjectResolveIRI = gradientElement.document.resolveIRI(str);
        if (svgObjectResolveIRI == null) {
            warn("Gradient reference '%s' not found", str);
            return;
        }
        if (!(svgObjectResolveIRI instanceof SVG.GradientElement)) {
            error("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (svgObjectResolveIRI == gradientElement) {
            error("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.GradientElement gradientElement2 = (SVG.GradientElement) svgObjectResolveIRI;
        if (gradientElement.gradientUnitsAreUser == null) {
            gradientElement.gradientUnitsAreUser = gradientElement2.gradientUnitsAreUser;
        }
        if (gradientElement.gradientTransform == null) {
            gradientElement.gradientTransform = gradientElement2.gradientTransform;
        }
        if (gradientElement.spreadMethod == null) {
            gradientElement.spreadMethod = gradientElement2.spreadMethod;
        }
        if (gradientElement.children.isEmpty()) {
            gradientElement.children = gradientElement2.children;
        }
        try {
            if (gradientElement instanceof SVG.SvgLinearGradient) {
                fillInChainedGradientFields((SVG.SvgLinearGradient) gradientElement, (SVG.SvgLinearGradient) svgObjectResolveIRI);
            } else {
                fillInChainedGradientFields((SVG.SvgRadialGradient) gradientElement, (SVG.SvgRadialGradient) svgObjectResolveIRI);
            }
        } catch (ClassCastException e) {
        }
        if (gradientElement2.href != null) {
            fillInChainedGradientFields(gradientElement, gradientElement2.href);
        }
    }

    private void fillInChainedGradientFields(SVG.SvgLinearGradient svgLinearGradient, SVG.SvgLinearGradient svgLinearGradient2) {
        if (svgLinearGradient.f4720x1 == null) {
            svgLinearGradient.f4720x1 = svgLinearGradient2.f4720x1;
        }
        if (svgLinearGradient.f4722y1 == null) {
            svgLinearGradient.f4722y1 = svgLinearGradient2.f4722y1;
        }
        if (svgLinearGradient.f4721x2 == null) {
            svgLinearGradient.f4721x2 = svgLinearGradient2.f4721x2;
        }
        if (svgLinearGradient.f4723y2 == null) {
            svgLinearGradient.f4723y2 = svgLinearGradient2.f4723y2;
        }
    }

    private void fillInChainedGradientFields(SVG.SvgRadialGradient svgRadialGradient, SVG.SvgRadialGradient svgRadialGradient2) {
        if (svgRadialGradient.f4724cx == null) {
            svgRadialGradient.f4724cx = svgRadialGradient2.f4724cx;
        }
        if (svgRadialGradient.f4725cy == null) {
            svgRadialGradient.f4725cy = svgRadialGradient2.f4725cy;
        }
        if (svgRadialGradient.f4728r == null) {
            svgRadialGradient.f4728r = svgRadialGradient2.f4728r;
        }
        if (svgRadialGradient.f4726fx == null) {
            svgRadialGradient.f4726fx = svgRadialGradient2.f4726fx;
        }
        if (svgRadialGradient.f4727fy == null) {
            svgRadialGradient.f4727fy = svgRadialGradient2.f4727fy;
        }
    }

    private void fillInChainedPatternFields(SVG.Pattern pattern, String str) {
        SVG.SvgObject svgObjectResolveIRI = pattern.document.resolveIRI(str);
        if (svgObjectResolveIRI == null) {
            warn("Pattern reference '%s' not found", str);
            return;
        }
        if (!(svgObjectResolveIRI instanceof SVG.Pattern)) {
            error("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (svgObjectResolveIRI == pattern) {
            error("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.Pattern pattern2 = (SVG.Pattern) svgObjectResolveIRI;
        if (pattern.patternUnitsAreUser == null) {
            pattern.patternUnitsAreUser = pattern2.patternUnitsAreUser;
        }
        if (pattern.patternContentUnitsAreUser == null) {
            pattern.patternContentUnitsAreUser = pattern2.patternContentUnitsAreUser;
        }
        if (pattern.patternTransform == null) {
            pattern.patternTransform = pattern2.patternTransform;
        }
        if (pattern.f4708x == null) {
            pattern.f4708x = pattern2.f4708x;
        }
        if (pattern.f4709y == null) {
            pattern.f4709y = pattern2.f4709y;
        }
        if (pattern.width == null) {
            pattern.width = pattern2.width;
        }
        if (pattern.height == null) {
            pattern.height = pattern2.height;
        }
        if (pattern.children.isEmpty()) {
            pattern.children = pattern2.children;
        }
        if (pattern.viewBox == null) {
            pattern.viewBox = pattern2.viewBox;
        }
        if (pattern.preserveAspectRatio == null) {
            pattern.preserveAspectRatio = pattern2.preserveAspectRatio;
        }
        if (pattern2.href != null) {
            fillInChainedPatternFields(pattern, pattern2.href);
        }
    }

    private void fillWithPattern(SVG.SvgElement svgElement, Path path, SVG.Pattern pattern) {
        float f;
        float fFloatValueY;
        float f2;
        float f3;
        boolean z = pattern.patternUnitsAreUser != null && pattern.patternUnitsAreUser.booleanValue();
        if (pattern.href != null) {
            fillInChainedPatternFields(pattern, pattern.href);
        }
        if (z) {
            float fFloatValueX = pattern.f4708x != null ? pattern.f4708x.floatValueX(this) : 0.0f;
            float fFloatValueY2 = pattern.f4709y != null ? pattern.f4709y.floatValueY(this) : 0.0f;
            float fFloatValueX2 = pattern.width != null ? pattern.width.floatValueX(this) : 0.0f;
            f = fFloatValueY2;
            fFloatValueY = pattern.height != null ? pattern.height.floatValueY(this) : 0.0f;
            f2 = fFloatValueX2;
            f3 = fFloatValueX;
        } else {
            float fFloatValue = pattern.f4708x != null ? pattern.f4708x.floatValue(this, 1.0f) : 0.0f;
            float fFloatValue2 = pattern.f4709y != null ? pattern.f4709y.floatValue(this, 1.0f) : 0.0f;
            float fFloatValue3 = pattern.width != null ? pattern.width.floatValue(this, 1.0f) : 0.0f;
            float fFloatValue4 = pattern.height != null ? pattern.height.floatValue(this, 1.0f) : 0.0f;
            float f4 = svgElement.boundingBox.minX;
            float f5 = svgElement.boundingBox.width;
            float f6 = svgElement.boundingBox.minY;
            float f7 = svgElement.boundingBox.height;
            float f8 = svgElement.boundingBox.width;
            float f9 = (fFloatValue * f5) + f4;
            f = (fFloatValue2 * f7) + f6;
            fFloatValueY = fFloatValue4 * svgElement.boundingBox.height;
            f2 = fFloatValue3 * f8;
            f3 = f9;
        }
        if (f2 == 0 || fFloatValueY == 0) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = pattern.preserveAspectRatio != null ? pattern.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
        statePush();
        this.canvas.clipPath(path);
        RendererState rendererState = new RendererState(this);
        updateStyle(rendererState, SVG.Style.getDefaultStyle());
        rendererState.style.overflow = new Boolean(false);
        this.state = findInheritFromAncestorState(pattern, rendererState);
        SVG.Box box = svgElement.boundingBox;
        if (pattern.patternTransform != null) {
            this.canvas.concat(pattern.patternTransform);
            Matrix matrix = new Matrix();
            if (pattern.patternTransform.invert(matrix)) {
                float[] fArr = {svgElement.boundingBox.minX, svgElement.boundingBox.minY, svgElement.boundingBox.maxX(), svgElement.boundingBox.minY, svgElement.boundingBox.maxX(), svgElement.boundingBox.maxY(), svgElement.boundingBox.minX, svgElement.boundingBox.maxY()};
                matrix.mapPoints(fArr);
                RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                for (int i = 2; i <= 6; i += 2) {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    if (fArr[i + 1] < rectF.top) {
                        rectF.top = fArr[i + 1];
                    }
                    if (fArr[i + 1] > rectF.bottom) {
                        rectF.bottom = fArr[i + 1];
                    }
                }
                box = new SVG.Box(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
            }
        }
        float fFloor = (float) Math.floor((box.minX - f3) / f2);
        float fFloor2 = (float) Math.floor((box.minY - f) / fFloatValueY);
        float fMaxX = box.maxX();
        float fMaxY = box.maxY();
        SVG.Box box2 = new SVG.Box(0, 0, f2, fFloatValueY);
        boolean zPushLayer = pushLayer();
        float f10 = (fFloor2 * fFloatValueY) + f;
        while (true) {
            float f11 = f10;
            if (f11 >= fMaxY) {
                break;
            }
            float f12 = (fFloor * f2) + f3;
            while (true) {
                float f13 = f12;
                if (f13 >= fMaxX) {
                    break;
                }
                box2.minX = f13;
                box2.minY = f11;
                statePush();
                if (!this.state.style.overflow.booleanValue()) {
                    setClipRect(box2.minX, box2.minY, box2.width, box2.height);
                }
                if (pattern.viewBox != null) {
                    this.canvas.concat(calculateViewBoxTransform(box2, pattern.viewBox, preserveAspectRatio));
                } else {
                    boolean z2 = pattern.patternContentUnitsAreUser == null || pattern.patternContentUnitsAreUser.booleanValue();
                    this.canvas.translate(f13, f11);
                    if (!z2) {
                        this.canvas.scale(svgElement.boundingBox.width, svgElement.boundingBox.height);
                    }
                }
                Iterator<SVG.SvgObject> it = pattern.children.iterator();
                while (it.hasNext()) {
                    render(it.next());
                }
                statePop();
                f12 = f13 + f2;
            }
            f10 = f11 + fFloatValueY;
        }
        if (zPushLayer) {
            popLayer(pattern);
        }
        statePop();
    }

    private RendererState findInheritFromAncestorState(SVG.SvgObject svgObject) {
        RendererState rendererState = new RendererState(this);
        updateStyle(rendererState, SVG.Style.getDefaultStyle());
        return findInheritFromAncestorState(svgObject, rendererState);
    }

    private RendererState findInheritFromAncestorState(SVG.SvgObject svgObject, RendererState rendererState) {
        ArrayList arrayList = new ArrayList();
        SVG.SvgObject svgObject2 = svgObject;
        while (true) {
            if (svgObject2 instanceof SVG.SvgElementBase) {
                arrayList.add(0, (SVG.SvgElementBase) svgObject2);
            }
            if (svgObject2.parent == null) {
                break;
            }
            svgObject2 = (SVG.SvgObject) svgObject2.parent;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            updateStyleForElement(rendererState, (SVG.SvgElementBase) it.next());
        }
        rendererState.viewBox = this.state.viewBox;
        rendererState.viewPort = this.state.viewPort;
        return rendererState;
    }

    private SVG.Style.TextAnchor getAnchorPosition() {
        if (this.state.style.direction == SVG.Style.TextDirection.LTR || this.state.style.textAnchor == SVG.Style.TextAnchor.Middle) {
            return this.state.style.textAnchor;
        }
        return this.state.style.textAnchor == SVG.Style.TextAnchor.Start ? SVG.Style.TextAnchor.End : SVG.Style.TextAnchor.Start;
    }

    private Path.FillType getClipRuleFromState() {
        return (this.state.style.clipRule == null || this.state.style.clipRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private Path.FillType getFillTypeFromState() {
        return (this.state.style.fillRule == null || this.state.style.fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private static void initialiseSupportedFeaturesMap() {
        synchronized (SVGAndroidRenderer.class) {
            try {
                supportedFeatures = new HashSet<>();
                supportedFeatures.add("Structure");
                supportedFeatures.add("BasicStructure");
                supportedFeatures.add("ConditionalProcessing");
                supportedFeatures.add("Image");
                supportedFeatures.add("Style");
                supportedFeatures.add("ViewportAttribute");
                supportedFeatures.add("Shape");
                supportedFeatures.add("BasicText");
                supportedFeatures.add("PaintAttribute");
                supportedFeatures.add("BasicPaintAttribute");
                supportedFeatures.add("OpacityAttribute");
                supportedFeatures.add("BasicGraphicsAttribute");
                supportedFeatures.add("Marker");
                supportedFeatures.add("Gradient");
                supportedFeatures.add("Pattern");
                supportedFeatures.add("Clip");
                supportedFeatures.add("BasicClip");
                supportedFeatures.add("Mask");
                supportedFeatures.add("View");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean isSpecified(SVG.Style style, long j) {
        return (style.specifiedFlags & j) != ((long) 0);
    }

    private void makeLinearGradient(boolean z, SVG.Box box, SVG.SvgLinearGradient svgLinearGradient) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float f;
        if (svgLinearGradient.href != null) {
            fillInChainedGradientFields(svgLinearGradient, svgLinearGradient.href);
        }
        boolean z2 = svgLinearGradient.gradientUnitsAreUser != null && svgLinearGradient.gradientUnitsAreUser.booleanValue();
        Paint paint = z ? this.state.fillPaint : this.state.strokePaint;
        if (z2) {
            SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
            float fFloatValueX = svgLinearGradient.f4720x1 != null ? svgLinearGradient.f4720x1.floatValueX(this) : 0.0f;
            fFloatValue = svgLinearGradient.f4722y1 != null ? svgLinearGradient.f4722y1.floatValueY(this) : 0.0f;
            fFloatValue2 = svgLinearGradient.f4721x2 != null ? svgLinearGradient.f4721x2.floatValueX(this) : currentViewPortInUserUnits.width;
            fFloatValue3 = svgLinearGradient.f4723y2 != null ? svgLinearGradient.f4723y2.floatValueY(this) : 0.0f;
            f = fFloatValueX;
        } else {
            float fFloatValue4 = svgLinearGradient.f4720x1 != null ? svgLinearGradient.f4720x1.floatValue(this, 1.0f) : 0.0f;
            fFloatValue = svgLinearGradient.f4722y1 != null ? svgLinearGradient.f4722y1.floatValue(this, 1.0f) : 0.0f;
            fFloatValue2 = svgLinearGradient.f4721x2 != null ? svgLinearGradient.f4721x2.floatValue(this, 1.0f) : 1.0f;
            fFloatValue3 = svgLinearGradient.f4723y2 != null ? svgLinearGradient.f4723y2.floatValue(this, 1.0f) : 0.0f;
            f = fFloatValue4;
        }
        statePush();
        this.state = findInheritFromAncestorState(svgLinearGradient);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        if (svgLinearGradient.gradientTransform != null) {
            matrix.preConcat(svgLinearGradient.gradientTransform);
        }
        int size = svgLinearGradient.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        float f2 = -1;
        Iterator<SVG.SvgObject> it = svgLinearGradient.children.iterator();
        int i = 0;
        while (it.hasNext()) {
            SVG.Stop stop = (SVG.Stop) it.next();
            float fFloatValue5 = stop.offset != null ? stop.offset.floatValue() : 0.0f;
            if (i == 0 || fFloatValue5 >= f2) {
                fArr[i] = fFloatValue5;
                f2 = fFloatValue5;
            } else {
                fArr[i] = f2;
            }
            statePush();
            updateStyleForElement(this.state, stop);
            SVG.Colour colour = (SVG.Colour) this.state.style.stopColor;
            if (colour == null) {
                colour = SVG.Colour.BLACK;
            }
            iArr[i] = colourWithOpacity(colour.colour, this.state.style.stopOpacity.floatValue());
            statePop();
            i++;
        }
        if ((f == fFloatValue2 && fFloatValue == fFloatValue3) || size == 1) {
            statePop();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        if (svgLinearGradient.spreadMethod != null) {
            if (svgLinearGradient.spreadMethod == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (svgLinearGradient.spreadMethod == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        statePop();
        LinearGradient linearGradient = new LinearGradient(f, fFloatValue, fFloatValue2, fFloatValue3, iArr, fArr, tileMode);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
    }

    private Path makePathAndBoundingBox(SVG.Circle circle) {
        float fFloatValueX = circle.f4691cx != null ? circle.f4691cx.floatValueX(this) : 0.0f;
        float fFloatValueY = circle.f4692cy != null ? circle.f4692cy.floatValueY(this) : 0.0f;
        float fFloatValue = circle.f4693r.floatValue(this);
        float f = fFloatValueX - fFloatValue;
        float f2 = fFloatValueY - fFloatValue;
        float f3 = fFloatValueX + fFloatValue;
        float f4 = fFloatValueY + fFloatValue;
        if (circle.boundingBox == null) {
            circle.boundingBox = new SVG.Box(f, f2, 2 * fFloatValue, 2 * fFloatValue);
        }
        float f5 = fFloatValue * BEZIER_ARC_FACTOR;
        Path path = new Path();
        path.moveTo(fFloatValueX, f2);
        path.cubicTo(fFloatValueX + f5, f2, f3, fFloatValueY - f5, f3, fFloatValueY);
        path.cubicTo(f3, fFloatValueY + f5, fFloatValueX + f5, f4, fFloatValueX, f4);
        path.cubicTo(fFloatValueX - f5, f4, f, fFloatValueY + f5, f, fFloatValueY);
        path.cubicTo(f, fFloatValueY - f5, fFloatValueX - f5, f2, fFloatValueX, f2);
        path.close();
        return path;
    }

    private Path makePathAndBoundingBox(SVG.Ellipse ellipse) {
        float fFloatValueX = ellipse.f4694cx != null ? ellipse.f4694cx.floatValueX(this) : 0.0f;
        float fFloatValueY = ellipse.f4695cy != null ? ellipse.f4695cy.floatValueY(this) : 0.0f;
        float fFloatValueX2 = ellipse.f4696rx.floatValueX(this);
        float fFloatValueY2 = ellipse.f4697ry.floatValueY(this);
        float f = fFloatValueX - fFloatValueX2;
        float f2 = fFloatValueY - fFloatValueY2;
        float f3 = fFloatValueX + fFloatValueX2;
        float f4 = fFloatValueY + fFloatValueY2;
        if (ellipse.boundingBox == null) {
            ellipse.boundingBox = new SVG.Box(f, f2, 2 * fFloatValueX2, 2 * fFloatValueY2);
        }
        float f5 = fFloatValueX2 * BEZIER_ARC_FACTOR;
        float f6 = fFloatValueY2 * BEZIER_ARC_FACTOR;
        Path path = new Path();
        path.moveTo(fFloatValueX, f2);
        path.cubicTo(fFloatValueX + f5, f2, f3, fFloatValueY - f6, f3, fFloatValueY);
        path.cubicTo(f3, fFloatValueY + f6, fFloatValueX + f5, f4, fFloatValueX, f4);
        path.cubicTo(fFloatValueX - f5, f4, f, fFloatValueY + f6, f, fFloatValueY);
        path.cubicTo(f, fFloatValueY - f6, fFloatValueX - f5, f2, fFloatValueX, f2);
        path.close();
        return path;
    }

    private Path makePathAndBoundingBox(SVG.Line line) {
        float fFloatValueX = line.f4701x1 == null ? 0 : line.f4701x1.floatValueX(this);
        float fFloatValueY = line.f4703y1 == null ? 0 : line.f4703y1.floatValueY(this);
        float fFloatValueX2 = line.f4702x2 == null ? 0 : line.f4702x2.floatValueX(this);
        float fFloatValueY2 = line.f4704y2 == null ? 0 : line.f4704y2.floatValueY(this);
        if (line.boundingBox == null) {
            line.boundingBox = new SVG.Box(Math.min(fFloatValueX, fFloatValueX2), Math.min(fFloatValueY, fFloatValueY2), Math.abs(fFloatValueX2 - fFloatValueX), Math.abs(fFloatValueY2 - fFloatValueY));
        }
        Path path = new Path();
        path.moveTo(fFloatValueX, fFloatValueY);
        path.lineTo(fFloatValueX2, fFloatValueY2);
        return path;
    }

    private Path makePathAndBoundingBox(SVG.PolyLine polyLine) {
        Path path = new Path();
        path.moveTo(polyLine.points[0], polyLine.points[1]);
        for (int i = 2; i < polyLine.points.length; i += 2) {
            path.lineTo(polyLine.points[i], polyLine.points[i + 1]);
        }
        if (polyLine instanceof SVG.Polygon) {
            path.close();
        }
        if (polyLine.boundingBox == null) {
            polyLine.boundingBox = calculatePathBounds(path);
        }
        return path;
    }

    private Path makePathAndBoundingBox(SVG.Rect rect) {
        float fFloatValueY;
        float f;
        if (rect.f4710rx == null && rect.f4711ry == null) {
            fFloatValueY = 0;
            f = 0;
        } else if (rect.f4710rx == null) {
            float fFloatValueY2 = rect.f4711ry.floatValueY(this);
            fFloatValueY = fFloatValueY2;
            f = fFloatValueY2;
        } else if (rect.f4711ry == null) {
            float fFloatValueX = rect.f4710rx.floatValueX(this);
            fFloatValueY = fFloatValueX;
            f = fFloatValueX;
        } else {
            float fFloatValueX2 = rect.f4710rx.floatValueX(this);
            fFloatValueY = rect.f4711ry.floatValueY(this);
            f = fFloatValueX2;
        }
        float fMin = Math.min(f, rect.width.floatValueX(this) / 2.0f);
        float fMin2 = Math.min(fFloatValueY, rect.height.floatValueY(this) / 2.0f);
        float fFloatValueX3 = rect.f4712x != null ? rect.f4712x.floatValueX(this) : 0.0f;
        float fFloatValueY3 = rect.f4713y != null ? rect.f4713y.floatValueY(this) : 0.0f;
        float fFloatValueX4 = rect.width.floatValueX(this);
        float fFloatValueY4 = rect.height.floatValueY(this);
        if (rect.boundingBox == null) {
            rect.boundingBox = new SVG.Box(fFloatValueX3, fFloatValueY3, fFloatValueX4, fFloatValueY4);
        }
        float f2 = fFloatValueX3 + fFloatValueX4;
        float f3 = fFloatValueY3 + fFloatValueY4;
        Path path = new Path();
        if (fMin == 0 || fMin2 == 0) {
            path.moveTo(fFloatValueX3, fFloatValueY3);
            path.lineTo(f2, fFloatValueY3);
            path.lineTo(f2, f3);
            path.lineTo(fFloatValueX3, f3);
            path.lineTo(fFloatValueX3, fFloatValueY3);
        } else {
            float f4 = fMin * BEZIER_ARC_FACTOR;
            float f5 = fMin2 * BEZIER_ARC_FACTOR;
            path.moveTo(fFloatValueX3, fFloatValueY3 + fMin2);
            path.cubicTo(fFloatValueX3, (fFloatValueY3 + fMin2) - f5, (fFloatValueX3 + fMin) - f4, fFloatValueY3, fFloatValueX3 + fMin, fFloatValueY3);
            path.lineTo(f2 - fMin, fFloatValueY3);
            path.cubicTo((f2 - fMin) + f4, fFloatValueY3, f2, (fFloatValueY3 + fMin2) - f5, f2, fFloatValueY3 + fMin2);
            path.lineTo(f2, f3 - fMin2);
            path.cubicTo(f2, (f3 - fMin2) + f5, (f2 - fMin) + f4, f3, f2 - fMin, f3);
            path.lineTo(fFloatValueX3 + fMin, f3);
            path.cubicTo((fFloatValueX3 + fMin) - f4, f3, fFloatValueX3, (f3 - fMin2) + f5, fFloatValueX3, f3 - fMin2);
            path.lineTo(fFloatValueX3, fFloatValueY3 + fMin2);
        }
        path.close();
        return path;
    }

    private Path makePathAndBoundingBox(SVG.Text text) {
        float fFloatValueY = 0.0f;
        float fFloatValueX = (text.f4731x == null || text.f4731x.size() == 0) ? 0.0f : text.f4731x.get(0).floatValueX(this);
        float fFloatValueY2 = (text.f4732y == null || text.f4732y.size() == 0) ? 0.0f : text.f4732y.get(0).floatValueY(this);
        float fFloatValueX2 = (text.f4729dx == null || text.f4729dx.size() == 0) ? 0.0f : text.f4729dx.get(0).floatValueX(this);
        if (text.f4730dy != null && text.f4730dy.size() != 0) {
            fFloatValueY = text.f4730dy.get(0).floatValueY(this);
        }
        if (this.state.style.textAnchor != SVG.Style.TextAnchor.Start) {
            float fCalculateTextWidth = calculateTextWidth(text);
            fFloatValueX = this.state.style.textAnchor == SVG.Style.TextAnchor.Middle ? fFloatValueX - (fCalculateTextWidth / 2) : fFloatValueX - fCalculateTextWidth;
        }
        if (text.boundingBox == null) {
            TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(this, fFloatValueX, fFloatValueY2);
            enumerateTextSpans(text, textBoundsCalculator);
            text.boundingBox = new SVG.Box(textBoundsCalculator.bbox.left, textBoundsCalculator.bbox.top, textBoundsCalculator.bbox.width(), textBoundsCalculator.bbox.height());
        }
        Path path = new Path();
        enumerateTextSpans(text, new PlainTextToPath(this, fFloatValueX + fFloatValueX2, fFloatValueY + fFloatValueY2, path));
        return path;
    }

    private void makeRadialGradient(boolean z, SVG.Box box, SVG.SvgRadialGradient svgRadialGradient) {
        float fFloatValue;
        float fFloatValue2;
        float f;
        if (svgRadialGradient.href != null) {
            fillInChainedGradientFields(svgRadialGradient, svgRadialGradient.href);
        }
        boolean z2 = svgRadialGradient.gradientUnitsAreUser != null && svgRadialGradient.gradientUnitsAreUser.booleanValue();
        Paint paint = z ? this.state.fillPaint : this.state.strokePaint;
        if (z2) {
            SVG.Length length = new SVG.Length(50.0f, SVG.Unit.percent);
            float fFloatValueX = svgRadialGradient.f4724cx != null ? svgRadialGradient.f4724cx.floatValueX(this) : length.floatValueX(this);
            fFloatValue = svgRadialGradient.f4725cy != null ? svgRadialGradient.f4725cy.floatValueY(this) : length.floatValueY(this);
            fFloatValue2 = svgRadialGradient.f4728r != null ? svgRadialGradient.f4728r.floatValue(this) : length.floatValue(this);
            f = fFloatValueX;
        } else {
            float fFloatValue3 = svgRadialGradient.f4724cx != null ? svgRadialGradient.f4724cx.floatValue(this, 1.0f) : 0.5f;
            fFloatValue = svgRadialGradient.f4725cy != null ? svgRadialGradient.f4725cy.floatValue(this, 1.0f) : 0.5f;
            fFloatValue2 = svgRadialGradient.f4728r != null ? svgRadialGradient.f4728r.floatValue(this, 1.0f) : 0.5f;
            f = fFloatValue3;
        }
        statePush();
        this.state = findInheritFromAncestorState(svgRadialGradient);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        if (svgRadialGradient.gradientTransform != null) {
            matrix.preConcat(svgRadialGradient.gradientTransform);
        }
        int size = svgRadialGradient.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        float f2 = -1;
        Iterator<SVG.SvgObject> it = svgRadialGradient.children.iterator();
        int i = 0;
        while (it.hasNext()) {
            SVG.Stop stop = (SVG.Stop) it.next();
            float fFloatValue4 = stop.offset != null ? stop.offset.floatValue() : 0.0f;
            if (i == 0 || fFloatValue4 >= f2) {
                fArr[i] = fFloatValue4;
                f2 = fFloatValue4;
            } else {
                fArr[i] = f2;
            }
            statePush();
            updateStyleForElement(this.state, stop);
            SVG.Colour colour = (SVG.Colour) this.state.style.stopColor;
            if (colour == null) {
                colour = SVG.Colour.BLACK;
            }
            iArr[i] = colourWithOpacity(colour.colour, this.state.style.stopOpacity.floatValue());
            statePop();
            i++;
        }
        if (fFloatValue2 == 0 || size == 1) {
            statePop();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        if (svgRadialGradient.spreadMethod != null) {
            if (svgRadialGradient.spreadMethod == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (svgRadialGradient.spreadMethod == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        statePop();
        RadialGradient radialGradient = new RadialGradient(f, fFloatValue, fFloatValue2, iArr, fArr, tileMode);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
    }

    private SVG.Box makeViewPort(SVG.Length length, SVG.Length length2, SVG.Length length3, SVG.Length length4) {
        float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
        float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
        return new SVG.Box(fFloatValueX, fFloatValueY, length3 != null ? length3.floatValueX(this) : currentViewPortInUserUnits.width, length4 != null ? length4.floatValueY(this) : currentViewPortInUserUnits.height);
    }

    @TargetApi(19)
    private Path objectToPath(SVG.SvgElement svgElement, boolean z) {
        Path path;
        Path pathCalculateClipPath;
        this.stateStack.push(this.state);
        this.state = new RendererState(this, this.state);
        updateStyleForElement(this.state, svgElement);
        if (!display() || !visible()) {
            this.state = this.stateStack.pop();
            return (Path) null;
        }
        Path pathMakePathAndBoundingBox = (Path) null;
        if (svgElement instanceof SVG.Use) {
            if (!z) {
                error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.Use use = (SVG.Use) svgElement;
            SVG.SvgObject svgObjectResolveIRI = svgElement.document.resolveIRI(use.href);
            if (svgObjectResolveIRI == null) {
                error("Use reference '%s' not found", use.href);
                this.state = this.stateStack.pop();
                return (Path) null;
            }
            if (!(svgObjectResolveIRI instanceof SVG.SvgElement)) {
                this.state = this.stateStack.pop();
                return (Path) null;
            }
            Path pathObjectToPath = objectToPath((SVG.SvgElement) svgObjectResolveIRI, false);
            if (pathObjectToPath == null) {
                return (Path) null;
            }
            if (use.boundingBox == null) {
                use.boundingBox = calculatePathBounds(pathObjectToPath);
            }
            if (use.transform != null) {
                pathObjectToPath.transform(use.transform);
            }
            path = pathObjectToPath;
        } else if (svgElement instanceof SVG.GraphicsElement) {
            SVG.GraphicsElement graphicsElement = (SVG.GraphicsElement) svgElement;
            if (svgElement instanceof SVG.Path) {
                pathMakePathAndBoundingBox = new PathConverter(this, ((SVG.Path) svgElement).f4707d).getPath();
                if (svgElement.boundingBox == null) {
                    svgElement.boundingBox = calculatePathBounds(pathMakePathAndBoundingBox);
                }
            } else if (svgElement instanceof SVG.Rect) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.Rect) svgElement);
            } else if (svgElement instanceof SVG.Circle) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.Circle) svgElement);
            } else if (svgElement instanceof SVG.Ellipse) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.Ellipse) svgElement);
            } else if (svgElement instanceof SVG.PolyLine) {
                pathMakePathAndBoundingBox = makePathAndBoundingBox((SVG.PolyLine) svgElement);
            }
            if (pathMakePathAndBoundingBox == null) {
                return (Path) null;
            }
            if (graphicsElement.boundingBox == null) {
                graphicsElement.boundingBox = calculatePathBounds(pathMakePathAndBoundingBox);
            }
            if (graphicsElement.transform != null) {
                pathMakePathAndBoundingBox.transform(graphicsElement.transform);
            }
            pathMakePathAndBoundingBox.setFillType(getClipRuleFromState());
            path = pathMakePathAndBoundingBox;
        } else {
            if (!(svgElement instanceof SVG.Text)) {
                error("Invalid %s element found in clipPath definition", svgElement.getNodeName());
                return (Path) null;
            }
            SVG.Text text = (SVG.Text) svgElement;
            Path pathMakePathAndBoundingBox2 = makePathAndBoundingBox(text);
            if (pathMakePathAndBoundingBox2 == null) {
                return (Path) null;
            }
            if (text.transform != null) {
                pathMakePathAndBoundingBox2.transform(text.transform);
            }
            pathMakePathAndBoundingBox2.setFillType(getClipRuleFromState());
            path = pathMakePathAndBoundingBox2;
        }
        if (this.state.style.clipPath != null && (pathCalculateClipPath = calculateClipPath(svgElement, svgElement.boundingBox)) != null) {
            path.op(pathCalculateClipPath, Path.Op.INTERSECT);
        }
        this.state = this.stateStack.pop();
        return path;
    }

    private void parentPop() {
        this.parentStack.pop();
        this.matrixStack.pop();
    }

    @SuppressWarnings("deprecation")
    private void parentPush(SVG.SvgContainer svgContainer) {
        this.parentStack.push(svgContainer);
        this.matrixStack.push(this.canvas.getMatrix());
    }

    private void popLayer(SVG.SvgElement svgElement) {
        popLayer(svgElement, svgElement.boundingBox);
    }

    private void popLayer(SVG.SvgElement svgElement, SVG.Box box) {
        if (this.state.style.mask != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.canvas.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.2127f, 0.7151f, 0.0722f, 0, 0})));
            this.canvas.saveLayer((RectF) null, paint2, 31);
            SVG.SvgObject svgObjectResolveIRI = this.document.resolveIRI(this.state.style.mask);
            renderMask((SVG.Mask) svgObjectResolveIRI, svgElement, box);
            this.canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.canvas.saveLayer((RectF) null, paint3, 31);
            renderMask((SVG.Mask) svgObjectResolveIRI, svgElement, box);
            this.canvas.restore();
            this.canvas.restore();
        }
        statePop();
    }

    private void processTextChild(SVG.SvgObject svgObject, TextProcessor textProcessor) {
        float f;
        float f2;
        SVG.Style.TextAnchor anchorPosition;
        float fFloatValueY = 0.0f;
        if (textProcessor.doTextContainer((SVG.TextContainer) svgObject)) {
            if (svgObject instanceof SVG.TextPath) {
                statePush();
                renderTextPath((SVG.TextPath) svgObject);
                statePop();
                return;
            }
            if (!(svgObject instanceof SVG.TSpan)) {
                if (svgObject instanceof SVG.TRef) {
                    statePush();
                    SVG.TRef tRef = (SVG.TRef) svgObject;
                    updateStyleForElement(this.state, tRef);
                    if (display()) {
                        checkForGradientsAndPatterns((SVG.SvgElement) tRef.getTextRoot());
                        SVG.SvgObject svgObjectResolveIRI = svgObject.document.resolveIRI(tRef.href);
                        if (svgObjectResolveIRI == null || !(svgObjectResolveIRI instanceof SVG.TextContainer)) {
                            error("Tref reference '%s' not found", tRef.href);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            extractRawText((SVG.TextContainer) svgObjectResolveIRI, sb);
                            if (sb.length() > 0) {
                                textProcessor.processText(sb.toString());
                            }
                        }
                    }
                    statePop();
                    return;
                }
                return;
            }
            debug("TSpan render", new Object[0]);
            statePush();
            SVG.TSpan tSpan = (SVG.TSpan) svgObject;
            updateStyleForElement(this.state, tSpan);
            if (display()) {
                float f3 = 0;
                float f4 = 0;
                float fFloatValueX = 0;
                float f5 = 0;
                boolean z = tSpan.f4731x != null && tSpan.f4731x.size() > 0;
                if (textProcessor instanceof PlainTextDrawer) {
                    float fFloatValueX2 = !z ? ((PlainTextDrawer) textProcessor).f4749x : tSpan.f4731x.get(0).floatValueX(this);
                    float fFloatValueY2 = (tSpan.f4732y == null || tSpan.f4732y.size() == 0) ? ((PlainTextDrawer) textProcessor).f4750y : tSpan.f4732y.get(0).floatValueY(this);
                    fFloatValueX = (tSpan.f4729dx == null || tSpan.f4729dx.size() == 0) ? 0.0f : tSpan.f4729dx.get(0).floatValueX(this);
                    if (tSpan.f4730dy == null || tSpan.f4730dy.size() == 0) {
                        f = fFloatValueY2;
                        f3 = fFloatValueX2;
                    } else {
                        fFloatValueY = tSpan.f4730dy.get(0).floatValueY(this);
                        f = fFloatValueY2;
                        f3 = fFloatValueX2;
                    }
                } else {
                    fFloatValueY = f5;
                    f = f4;
                }
                if (!z || (anchorPosition = getAnchorPosition()) == SVG.Style.TextAnchor.Start) {
                    f2 = f3;
                } else {
                    float fCalculateTextWidth = calculateTextWidth(tSpan);
                    f2 = anchorPosition == SVG.Style.TextAnchor.Middle ? f3 - (fCalculateTextWidth / 2) : f3 - fCalculateTextWidth;
                }
                checkForGradientsAndPatterns((SVG.SvgElement) tSpan.getTextRoot());
                if (textProcessor instanceof PlainTextDrawer) {
                    ((PlainTextDrawer) textProcessor).f4749x = f2 + fFloatValueX;
                    ((PlainTextDrawer) textProcessor).f4750y = f + fFloatValueY;
                }
                boolean zPushLayer = pushLayer();
                enumerateTextSpans(tSpan, textProcessor);
                if (zPushLayer) {
                    popLayer(tSpan);
                }
            }
            statePop();
        }
    }

    private boolean pushLayer() {
        SVG.SvgObject svgObjectResolveIRI;
        if (!requiresCompositing()) {
            return false;
        }
        this.canvas.saveLayerAlpha((RectF) null, clamp255(this.state.style.opacity.floatValue()), 31);
        this.stateStack.push(this.state);
        this.state = new RendererState(this, this.state);
        if (this.state.style.mask == null || ((svgObjectResolveIRI = this.document.resolveIRI(this.state.style.mask)) != null && (svgObjectResolveIRI instanceof SVG.Mask))) {
            return true;
        }
        error("Mask reference '%s' not found", this.state.style.mask);
        this.state.style.mask = (String) null;
        return true;
    }

    private MarkerVector realignMarkerMid(MarkerVector markerVector, MarkerVector markerVector2, MarkerVector markerVector3) {
        float fDotProduct = dotProduct(markerVector2.f4745dx, markerVector2.f4746dy, markerVector2.f4747x - markerVector.f4747x, markerVector2.f4748y - markerVector.f4748y);
        if (fDotProduct == 0.0f) {
            fDotProduct = dotProduct(markerVector2.f4745dx, markerVector2.f4746dy, markerVector3.f4747x - markerVector2.f4747x, markerVector3.f4748y - markerVector2.f4748y);
        }
        if (fDotProduct <= 0 && (fDotProduct != 0.0f || (markerVector2.f4745dx <= 0.0f && markerVector2.f4746dy < 0))) {
            markerVector2.f4745dx = -markerVector2.f4745dx;
            markerVector2.f4746dy = -markerVector2.f4746dy;
        }
        return markerVector2;
    }

    private void render(SVG.Circle circle) {
        debug("Circle render", new Object[0]);
        if (circle.f4693r == null || circle.f4693r.isZero()) {
            return;
        }
        updateStyleForElement(this.state, circle);
        if (display() && visible()) {
            if (circle.transform != null) {
                this.canvas.concat(circle.transform);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(circle);
            updateParentBoundingBox(circle);
            checkForGradientsAndPatterns(circle);
            checkForClipPath(circle);
            boolean zPushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(circle, pathMakePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(pathMakePathAndBoundingBox);
            }
            if (zPushLayer) {
                popLayer(circle);
            }
        }
    }

    private void render(SVG.Ellipse ellipse) {
        debug("Ellipse render", new Object[0]);
        if (ellipse.f4696rx == null || ellipse.f4697ry == null || ellipse.f4696rx.isZero() || ellipse.f4697ry.isZero()) {
            return;
        }
        updateStyleForElement(this.state, ellipse);
        if (display() && visible()) {
            if (ellipse.transform != null) {
                this.canvas.concat(ellipse.transform);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(ellipse);
            updateParentBoundingBox(ellipse);
            checkForGradientsAndPatterns(ellipse);
            checkForClipPath(ellipse);
            boolean zPushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(ellipse, pathMakePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(pathMakePathAndBoundingBox);
            }
            if (zPushLayer) {
                popLayer(ellipse);
            }
        }
    }

    private void render(SVG.Group group) {
        debug("Group render", new Object[0]);
        updateStyleForElement(this.state, group);
        if (display()) {
            if (group.transform != null) {
                this.canvas.concat(group.transform);
            }
            checkForClipPath(group);
            boolean zPushLayer = pushLayer();
            renderChildren(group, true);
            if (zPushLayer) {
                popLayer(group);
            }
            updateParentBoundingBox(group);
        }
    }

    private void render(SVG.Image image) {
        Bitmap bitmapResolveImage;
        debug("Image render", new Object[0]);
        if (image.width == null || image.width.isZero() || image.height == null || image.height.isZero() || image.href == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = image.preserveAspectRatio != null ? image.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
        Bitmap bitmapCheckForImageDataURL = checkForImageDataURL(image.href);
        if (bitmapCheckForImageDataURL == null) {
            SVGExternalFileResolver fileResolver = SVG.getFileResolver();
            if (fileResolver == null) {
                return;
            } else {
                bitmapResolveImage = fileResolver.resolveImage(image.href);
            }
        } else {
            bitmapResolveImage = bitmapCheckForImageDataURL;
        }
        if (bitmapResolveImage == null) {
            error("Could not locate image '%s'", image.href);
            return;
        }
        SVG.Box box = new SVG.Box(0, 0, bitmapResolveImage.getWidth(), bitmapResolveImage.getHeight());
        updateStyleForElement(this.state, image);
        if (display() && visible()) {
            if (image.transform != null) {
                this.canvas.concat(image.transform);
            }
            this.state.viewPort = new SVG.Box(image.f4699x != null ? image.f4699x.floatValueX(this) : 0.0f, image.f4700y != null ? image.f4700y.floatValueY(this) : 0.0f, image.width.floatValueX(this), image.height.floatValueX(this));
            if (!this.state.style.overflow.booleanValue()) {
                setClipRect(this.state.viewPort.minX, this.state.viewPort.minY, this.state.viewPort.width, this.state.viewPort.height);
            }
            image.boundingBox = this.state.viewPort;
            updateParentBoundingBox(image);
            checkForClipPath(image);
            boolean zPushLayer = pushLayer();
            viewportFill();
            this.canvas.save();
            this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box, preserveAspectRatio));
            this.canvas.drawBitmap(bitmapResolveImage, 0, 0, new Paint(this.state.style.imageRendering == SVG.Style.RenderQuality.optimizeSpeed ? 0 : 2));
            this.canvas.restore();
            if (zPushLayer) {
                popLayer(image);
            }
        }
    }

    private void render(SVG.Line line) {
        debug("Line render", new Object[0]);
        updateStyleForElement(this.state, line);
        if (display() && visible() && this.state.hasStroke) {
            if (line.transform != null) {
                this.canvas.concat(line.transform);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(line);
            updateParentBoundingBox(line);
            checkForGradientsAndPatterns(line);
            checkForClipPath(line);
            boolean zPushLayer = pushLayer();
            doStroke(pathMakePathAndBoundingBox);
            renderMarkers(line);
            if (zPushLayer) {
                popLayer(line);
            }
        }
    }

    private void render(SVG.Path path) {
        debug("Path render", new Object[0]);
        if (path.f4707d == null) {
            return;
        }
        updateStyleForElement(this.state, path);
        if (display() && visible()) {
            if (this.state.hasStroke || this.state.hasFill) {
                if (path.transform != null) {
                    this.canvas.concat(path.transform);
                }
                Path path2 = new PathConverter(this, path.f4707d).getPath();
                if (path.boundingBox == null) {
                    path.boundingBox = calculatePathBounds(path2);
                }
                updateParentBoundingBox(path);
                checkForGradientsAndPatterns(path);
                checkForClipPath(path);
                boolean zPushLayer = pushLayer();
                if (this.state.hasFill) {
                    path2.setFillType(getFillTypeFromState());
                    doFilledPath(path, path2);
                }
                if (this.state.hasStroke) {
                    doStroke(path2);
                }
                renderMarkers(path);
                if (zPushLayer) {
                    popLayer(path);
                }
            }
        }
    }

    private void render(SVG.PolyLine polyLine) {
        debug("PolyLine render", new Object[0]);
        updateStyleForElement(this.state, polyLine);
        if (display() && visible()) {
            if (this.state.hasStroke || this.state.hasFill) {
                if (polyLine.transform != null) {
                    this.canvas.concat(polyLine.transform);
                }
                if (polyLine.points.length >= 2) {
                    Path pathMakePathAndBoundingBox = makePathAndBoundingBox(polyLine);
                    updateParentBoundingBox(polyLine);
                    pathMakePathAndBoundingBox.setFillType(getFillTypeFromState());
                    checkForGradientsAndPatterns(polyLine);
                    checkForClipPath(polyLine);
                    boolean zPushLayer = pushLayer();
                    if (this.state.hasFill) {
                        doFilledPath(polyLine, pathMakePathAndBoundingBox);
                    }
                    if (this.state.hasStroke) {
                        doStroke(pathMakePathAndBoundingBox);
                    }
                    renderMarkers(polyLine);
                    if (zPushLayer) {
                        popLayer(polyLine);
                    }
                }
            }
        }
    }

    private void render(SVG.Polygon polygon) {
        debug("Polygon render", new Object[0]);
        updateStyleForElement(this.state, polygon);
        if (display() && visible()) {
            if (this.state.hasStroke || this.state.hasFill) {
                if (polygon.transform != null) {
                    this.canvas.concat(polygon.transform);
                }
                if (polygon.points.length >= 2) {
                    Path pathMakePathAndBoundingBox = makePathAndBoundingBox(polygon);
                    updateParentBoundingBox(polygon);
                    checkForGradientsAndPatterns(polygon);
                    checkForClipPath(polygon);
                    boolean zPushLayer = pushLayer();
                    if (this.state.hasFill) {
                        doFilledPath(polygon, pathMakePathAndBoundingBox);
                    }
                    if (this.state.hasStroke) {
                        doStroke(pathMakePathAndBoundingBox);
                    }
                    renderMarkers(polygon);
                    if (zPushLayer) {
                        popLayer(polygon);
                    }
                }
            }
        }
    }

    private void render(SVG.Rect rect) {
        debug("Rect render", new Object[0]);
        if (rect.width == null || rect.height == null || rect.width.isZero() || rect.height.isZero()) {
            return;
        }
        updateStyleForElement(this.state, rect);
        if (display() && visible()) {
            if (rect.transform != null) {
                this.canvas.concat(rect.transform);
            }
            Path pathMakePathAndBoundingBox = makePathAndBoundingBox(rect);
            updateParentBoundingBox(rect);
            checkForGradientsAndPatterns(rect);
            checkForClipPath(rect);
            boolean zPushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(rect, pathMakePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(pathMakePathAndBoundingBox);
            }
            if (zPushLayer) {
                popLayer(rect);
            }
        }
    }

    private void render(SVG.Svg svg) {
        render(svg, makeViewPort(svg.f4717x, svg.f4718y, svg.width, svg.height), svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVG.Svg svg, SVG.Box box) {
        render(svg, box, svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVG.Svg svg, SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        debug("Svg render", new Object[0]);
        if (box.width == 0.0f || box.height == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null) {
            preserveAspectRatio = svg.preserveAspectRatio != null ? svg.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
        }
        updateStyleForElement(this.state, svg);
        if (display()) {
            this.state.viewPort = box;
            if (!this.state.style.overflow.booleanValue()) {
                setClipRect(this.state.viewPort.minX, this.state.viewPort.minY, this.state.viewPort.width, this.state.viewPort.height);
            }
            checkForClipPath(svg, this.state.viewPort);
            if (box2 != null) {
                this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box2, preserveAspectRatio));
                this.state.viewBox = svg.viewBox;
            } else {
                this.canvas.translate(this.state.viewPort.minX, this.state.viewPort.minY);
            }
            boolean zPushLayer = pushLayer();
            viewportFill();
            renderChildren(svg, true);
            if (zPushLayer) {
                popLayer(svg);
            }
            updateParentBoundingBox(svg);
        }
    }

    private void render(SVG.SvgObject svgObject) {
        if (svgObject instanceof SVG.NotDirectlyRendered) {
            return;
        }
        statePush();
        checkXMLSpaceAttribute(svgObject);
        if (svgObject instanceof SVG.Svg) {
            render((SVG.Svg) svgObject);
        } else if (svgObject instanceof SVG.Use) {
            render((SVG.Use) svgObject);
        } else if (svgObject instanceof SVG.Switch) {
            render((SVG.Switch) svgObject);
        } else if (svgObject instanceof SVG.Group) {
            render((SVG.Group) svgObject);
        } else if (svgObject instanceof SVG.Image) {
            render((SVG.Image) svgObject);
        } else if (svgObject instanceof SVG.Path) {
            render((SVG.Path) svgObject);
        } else if (svgObject instanceof SVG.Rect) {
            render((SVG.Rect) svgObject);
        } else if (svgObject instanceof SVG.Circle) {
            render((SVG.Circle) svgObject);
        } else if (svgObject instanceof SVG.Ellipse) {
            render((SVG.Ellipse) svgObject);
        } else if (svgObject instanceof SVG.Line) {
            render((SVG.Line) svgObject);
        } else if (svgObject instanceof SVG.Polygon) {
            render((SVG.Polygon) svgObject);
        } else if (svgObject instanceof SVG.PolyLine) {
            render((SVG.PolyLine) svgObject);
        } else if (svgObject instanceof SVG.Text) {
            render((SVG.Text) svgObject);
        }
        statePop();
    }

    private void render(SVG.Switch r3) {
        debug("Switch render", new Object[0]);
        updateStyleForElement(this.state, r3);
        if (display()) {
            if (r3.transform != null) {
                this.canvas.concat(r3.transform);
            }
            checkForClipPath(r3);
            boolean zPushLayer = pushLayer();
            renderSwitchChild(r3);
            if (zPushLayer) {
                popLayer(r3);
            }
            updateParentBoundingBox(r3);
        }
    }

    private void render(SVG.Symbol symbol, SVG.Box box) {
        debug("Symbol render", new Object[0]);
        if (box.width == 0.0f || box.height == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = symbol.preserveAspectRatio != null ? symbol.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
        updateStyleForElement(this.state, symbol);
        this.state.viewPort = box;
        if (!this.state.style.overflow.booleanValue()) {
            setClipRect(this.state.viewPort.minX, this.state.viewPort.minY, this.state.viewPort.width, this.state.viewPort.height);
        }
        if (symbol.viewBox != null) {
            this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, symbol.viewBox, preserveAspectRatio));
            this.state.viewBox = symbol.viewBox;
        } else {
            this.canvas.translate(this.state.viewPort.minX, this.state.viewPort.minY);
        }
        boolean zPushLayer = pushLayer();
        renderChildren(symbol, true);
        if (zPushLayer) {
            popLayer(symbol);
        }
        updateParentBoundingBox(symbol);
    }

    private void render(SVG.Text text) {
        float fFloatValueY = 0.0f;
        debug("Text render", new Object[0]);
        updateStyleForElement(this.state, text);
        if (display()) {
            if (text.transform != null) {
                this.canvas.concat(text.transform);
            }
            float fFloatValueX = (text.f4731x == null || text.f4731x.size() == 0) ? 0.0f : text.f4731x.get(0).floatValueX(this);
            float fFloatValueY2 = (text.f4732y == null || text.f4732y.size() == 0) ? 0.0f : text.f4732y.get(0).floatValueY(this);
            float fFloatValueX2 = (text.f4729dx == null || text.f4729dx.size() == 0) ? 0.0f : text.f4729dx.get(0).floatValueX(this);
            if (text.f4730dy != null && text.f4730dy.size() != 0) {
                fFloatValueY = text.f4730dy.get(0).floatValueY(this);
            }
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float fCalculateTextWidth = calculateTextWidth(text);
                fFloatValueX = anchorPosition == SVG.Style.TextAnchor.Middle ? fFloatValueX - (fCalculateTextWidth / 2) : fFloatValueX - fCalculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(this, fFloatValueX, fFloatValueY2);
                enumerateTextSpans(text, textBoundsCalculator);
                text.boundingBox = new SVG.Box(textBoundsCalculator.bbox.left, textBoundsCalculator.bbox.top, textBoundsCalculator.bbox.width(), textBoundsCalculator.bbox.height());
            }
            updateParentBoundingBox(text);
            checkForGradientsAndPatterns(text);
            checkForClipPath(text);
            boolean zPushLayer = pushLayer();
            enumerateTextSpans(text, new PlainTextDrawer(this, fFloatValueX + fFloatValueX2, fFloatValueY + fFloatValueY2));
            if (zPushLayer) {
                popLayer(text);
            }
        }
    }

    private void render(SVG.Use use) {
        debug("Use render", new Object[0]);
        if (use.width == null || !use.width.isZero()) {
            if (use.height == null || !use.height.isZero()) {
                updateStyleForElement(this.state, use);
                if (display()) {
                    SVG.SvgObject svgObjectResolveIRI = use.document.resolveIRI(use.href);
                    if (svgObjectResolveIRI == null) {
                        error("Use reference '%s' not found", use.href);
                        return;
                    }
                    if (use.transform != null) {
                        this.canvas.concat(use.transform);
                    }
                    this.canvas.translate(use.f4741x != null ? use.f4741x.floatValueX(this) : 0.0f, use.f4742y != null ? use.f4742y.floatValueY(this) : 0.0f);
                    checkForClipPath(use);
                    boolean zPushLayer = pushLayer();
                    parentPush(use);
                    if (svgObjectResolveIRI instanceof SVG.Svg) {
                        SVG.Box boxMakeViewPort = makeViewPort((SVG.Length) null, (SVG.Length) null, use.width, use.height);
                        statePush();
                        render((SVG.Svg) svgObjectResolveIRI, boxMakeViewPort);
                        statePop();
                    } else if (svgObjectResolveIRI instanceof SVG.Symbol) {
                        SVG.Box boxMakeViewPort2 = makeViewPort((SVG.Length) null, (SVG.Length) null, use.width != null ? use.width : new SVG.Length(100, SVG.Unit.percent), use.height != null ? use.height : new SVG.Length(100, SVG.Unit.percent));
                        statePush();
                        render((SVG.Symbol) svgObjectResolveIRI, boxMakeViewPort2);
                        statePop();
                    } else {
                        render(svgObjectResolveIRI);
                    }
                    parentPop();
                    if (zPushLayer) {
                        popLayer(use);
                    }
                    updateParentBoundingBox(use);
                }
            }
        }
    }

    private void renderChildren(SVG.SvgContainer svgContainer, boolean z) {
        if (z) {
            parentPush(svgContainer);
        }
        Iterator<SVG.SvgObject> it = svgContainer.getChildren().iterator();
        while (it.hasNext()) {
            render(it.next());
        }
        if (z) {
            parentPop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x018b  */
    private void renderMarker(SVG.Marker marker, MarkerVector markerVector) {
        float fFloatValue;
        float f;
        float f2;
        float f3 = 0.0f;
        statePush();
        if (marker.orient == null) {
            fFloatValue = 0.0f;
        } else if (!Float.isNaN(marker.orient.floatValue())) {
            fFloatValue = marker.orient.floatValue();
        } else if (markerVector.f4745dx == 0 && markerVector.f4746dy == 0) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = (float) Math.toDegrees(Math.atan2(markerVector.f4746dy, markerVector.f4745dx));
        }
        float fFloatValue2 = marker.markerUnitsAreUser ? 1.0f : this.state.style.strokeWidth.floatValue(this.f4744dpi);
        this.state = findInheritFromAncestorState(marker);
        Matrix matrix = new Matrix();
        matrix.preTranslate(markerVector.f4747x, markerVector.f4748y);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fFloatValue2, fFloatValue2);
        float fFloatValueX = marker.refX != null ? marker.refX.floatValueX(this) : 0.0f;
        float fFloatValueY = marker.refY != null ? marker.refY.floatValueY(this) : 0.0f;
        float fFloatValueX2 = marker.markerWidth != null ? marker.markerWidth.floatValueX(this) : 3.0f;
        float fFloatValueY2 = marker.markerHeight != null ? marker.markerHeight.floatValueY(this) : 3.0f;
        if (marker.viewBox != null) {
            float f4 = fFloatValueX2 / marker.viewBox.width;
            float f5 = fFloatValueY2 / marker.viewBox.height;
            PreserveAspectRatio preserveAspectRatio = marker.preserveAspectRatio != null ? marker.preserveAspectRatio : PreserveAspectRatio.LETTERBOX;
            if (preserveAspectRatio.equals(PreserveAspectRatio.STRETCH)) {
                f = f5;
            } else {
                float fMax = preserveAspectRatio.getScale() == PreserveAspectRatio.Scale.slice ? Math.max(f4, f5) : Math.min(f4, f5);
                f = fMax;
                f4 = fMax;
            }
            matrix.preTranslate((-fFloatValueX) * f4, (-fFloatValueY) * f);
            this.canvas.concat(matrix);
            float f6 = marker.viewBox.width * f4;
            float f7 = marker.viewBox.height * f;
            PreserveAspectRatio.Alignment alignment = preserveAspectRatio.getAlignment();
            if (alignment == PreserveAspectRatio.Alignment.xMidYMin || alignment == PreserveAspectRatio.Alignment.xMidYMid || alignment == PreserveAspectRatio.Alignment.xMidYMax) {
                f2 = 0.0f - ((fFloatValueX2 - f6) / 2);
            } else {
                f2 = (alignment == PreserveAspectRatio.Alignment.xMaxYMin || alignment == PreserveAspectRatio.Alignment.xMaxYMid || alignment == PreserveAspectRatio.Alignment.xMaxYMax) ? 0.0f - (fFloatValueX2 - f6) : 0.0f;
            }
            PreserveAspectRatio.Alignment alignment2 = preserveAspectRatio.getAlignment();
            if (alignment2 == PreserveAspectRatio.Alignment.xMinYMid || alignment2 == PreserveAspectRatio.Alignment.xMidYMid || alignment2 == PreserveAspectRatio.Alignment.xMaxYMid) {
                f3 = 0.0f - ((fFloatValueY2 - f7) / 2);
            } else if (alignment2 == PreserveAspectRatio.Alignment.xMinYMax || alignment2 == PreserveAspectRatio.Alignment.xMidYMax || alignment2 == PreserveAspectRatio.Alignment.xMaxYMax) {
                f3 = 0.0f - (fFloatValueY2 - f7);
            }
            if (!this.state.style.overflow.booleanValue()) {
                setClipRect(f2, f3, fFloatValueX2, fFloatValueY2);
            }
            matrix.reset();
            matrix.preScale(f4, f);
            this.canvas.concat(matrix);
        } else {
            matrix.preTranslate(-fFloatValueX, -fFloatValueY);
            this.canvas.concat(matrix);
            if (!this.state.style.overflow.booleanValue()) {
                setClipRect(0, 0, fFloatValueX2, fFloatValueY2);
            }
        }
        boolean zPushLayer = pushLayer();
        renderChildren(marker, false);
        if (zPushLayer) {
            popLayer(marker);
        }
        statePop();
    }

    private void renderMarkers(SVG.GraphicsElement graphicsElement) {
        SVG.Marker marker;
        List<MarkerVector> listCalculateMarkerPositions;
        int size;
        int i = 1;
        if (this.state.style.markerStart == null && this.state.style.markerMid == null && this.state.style.markerEnd == null) {
            return;
        }
        SVG.Marker marker2 = (SVG.Marker) null;
        SVG.Marker marker3 = (SVG.Marker) null;
        SVG.Marker marker4 = (SVG.Marker) null;
        if (this.state.style.markerStart == null) {
            marker = marker2;
        } else {
            SVG.SvgObject svgObjectResolveIRI = graphicsElement.document.resolveIRI(this.state.style.markerStart);
            if (svgObjectResolveIRI != null) {
                marker = (SVG.Marker) svgObjectResolveIRI;
            } else {
                error("Marker reference '%s' not found", this.state.style.markerStart);
                marker = marker2;
            }
        }
        if (this.state.style.markerMid != null) {
            SVG.SvgObject svgObjectResolveIRI2 = graphicsElement.document.resolveIRI(this.state.style.markerMid);
            if (svgObjectResolveIRI2 != null) {
                marker3 = (SVG.Marker) svgObjectResolveIRI2;
            } else {
                error("Marker reference '%s' not found", this.state.style.markerMid);
            }
        }
        if (this.state.style.markerEnd != null) {
            SVG.SvgObject svgObjectResolveIRI3 = graphicsElement.document.resolveIRI(this.state.style.markerEnd);
            if (svgObjectResolveIRI3 != null) {
                marker4 = (SVG.Marker) svgObjectResolveIRI3;
            } else {
                error("Marker reference '%s' not found", this.state.style.markerEnd);
            }
        }
        if (graphicsElement instanceof SVG.Path) {
            listCalculateMarkerPositions = new MarkerPositionCalculator(this, ((SVG.Path) graphicsElement).f4707d).getMarkers();
        } else {
            listCalculateMarkerPositions = graphicsElement instanceof SVG.Line ? calculateMarkerPositions((SVG.Line) graphicsElement) : calculateMarkerPositions((SVG.PolyLine) graphicsElement);
        }
        if (listCalculateMarkerPositions == null || (size = listCalculateMarkerPositions.size()) == 0) {
            return;
        }
        SVG.Style style = this.state.style;
        SVG.Style style2 = this.state.style;
        String str = (String) null;
        this.state.style.markerEnd = str;
        style2.markerMid = str;
        style.markerStart = str;
        if (marker != null) {
            renderMarker(marker, listCalculateMarkerPositions.get(0));
        }
        if (marker3 != null && listCalculateMarkerPositions.size() > 2) {
            MarkerVector markerVector = listCalculateMarkerPositions.get(0);
            MarkerVector markerVector2 = listCalculateMarkerPositions.get(1);
            while (i < size - 1) {
                MarkerVector markerVector3 = listCalculateMarkerPositions.get(i + 1);
                MarkerVector markerVectorRealignMarkerMid = markerVector2.isAmbiguous ? realignMarkerMid(markerVector, markerVector2, markerVector3) : markerVector2;
                renderMarker(marker3, markerVectorRealignMarkerMid);
                i++;
                markerVector = markerVectorRealignMarkerMid;
                markerVector2 = markerVector3;
            }
        }
        if (marker4 != null) {
            renderMarker(marker4, listCalculateMarkerPositions.get(size - 1));
        }
    }

    private void renderMask(SVG.Mask mask, SVG.SvgElement svgElement, SVG.Box box) {
        float fFloatValueX;
        float fFloatValueY;
        debug("Mask render", new Object[0]);
        if (mask.maskUnitsAreUser != null && mask.maskUnitsAreUser.booleanValue()) {
            fFloatValueX = mask.width != null ? mask.width.floatValueX(this) : box.width;
            fFloatValueY = mask.height != null ? mask.height.floatValueY(this) : box.height;
        } else {
            float fFloatValue = mask.width != null ? mask.width.floatValue(this, 1.0f) : 1.2f;
            float fFloatValue2 = mask.height != null ? mask.height.floatValue(this, 1.0f) : 1.2f;
            fFloatValueX = fFloatValue * box.width;
            fFloatValueY = fFloatValue2 * box.height;
        }
        if (fFloatValueX == 0 || fFloatValueY == 0) {
            return;
        }
        statePush();
        this.state = findInheritFromAncestorState(mask);
        this.state.style.opacity = new Float(1.0f);
        boolean zPushLayer = pushLayer();
        this.canvas.save();
        if (!(mask.maskContentUnitsAreUser == null || mask.maskContentUnitsAreUser.booleanValue())) {
            this.canvas.translate(box.minX, box.minY);
            this.canvas.scale(box.width, box.height);
        }
        renderChildren(mask, false);
        this.canvas.restore();
        if (zPushLayer) {
            popLayer(svgElement, box);
        }
        statePop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void renderSwitchChild(SVG.Switch r9) {
        Set<String> systemLanguage;
        String language = Locale.getDefault().getLanguage();
        SVGExternalFileResolver fileResolver = SVG.getFileResolver();
        for (SVG.SvgObject svgObject : r9.getChildren()) {
            if (svgObject instanceof SVG.SvgConditional) {
                SVG.SvgConditional svgConditional = (SVG.SvgConditional) svgObject;
                if (svgConditional.getRequiredExtensions() == null && ((systemLanguage = svgConditional.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                    Set<String> requiredFeatures = svgConditional.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (supportedFeatures == null) {
                            initialiseSupportedFeaturesMap();
                        }
                        if (requiredFeatures.isEmpty() || !supportedFeatures.containsAll(requiredFeatures)) {
                        }
                    }
                    Set<String> requiredFormats = svgConditional.getRequiredFormats();
                    if (requiredFormats != null) {
                        if (!requiredFormats.isEmpty() && fileResolver != null) {
                            Iterator<String> it = requiredFormats.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!fileResolver.isFormatSupported(it.next())) {
                                    }
                                }
                            }
                        }
                    }
                    Set<String> requiredFonts = svgConditional.getRequiredFonts();
                    if (requiredFonts != null) {
                        if (!requiredFonts.isEmpty() && fileResolver != null) {
                            Iterator<String> it2 = requiredFonts.iterator();
                            do {
                                if (!it2.hasNext()) {
                                }
                            } while (fileResolver.resolveFont(it2.next(), this.state.style.fontWeight.intValue(), String.valueOf(this.state.style.fontStyle)) != null);
                        }
                    }
                    render(svgObject);
                    return;
                }
            }
        }
    }

    private void renderTextPath(SVG.TextPath textPath) {
        float f;
        debug("TextPath render", new Object[0]);
        updateStyleForElement(this.state, textPath);
        if (display() && visible()) {
            SVG.SvgObject svgObjectResolveIRI = textPath.document.resolveIRI(textPath.href);
            if (svgObjectResolveIRI == null) {
                error("TextPath reference '%s' not found", textPath.href);
                return;
            }
            SVG.Path path = (SVG.Path) svgObjectResolveIRI;
            Path path2 = new PathConverter(this, path.f4707d).getPath();
            if (path.transform != null) {
                path2.transform(path.transform);
            }
            float fFloatValue = textPath.startOffset != null ? textPath.startOffset.floatValue(this, new PathMeasure(path2, false).getLength()) : 0.0f;
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float fCalculateTextWidth = calculateTextWidth(textPath);
                f = anchorPosition == SVG.Style.TextAnchor.Middle ? fFloatValue - (fCalculateTextWidth / 2) : fFloatValue - fCalculateTextWidth;
            } else {
                f = fFloatValue;
            }
            checkForGradientsAndPatterns((SVG.SvgElement) textPath.getTextRoot());
            boolean zPushLayer = pushLayer();
            enumerateTextSpans(textPath, new PathTextDrawer(this, path2, f, 0.0f));
            if (zPushLayer) {
                popLayer(textPath);
            }
        }
    }

    private boolean requiresCompositing() {
        return this.state.style.opacity.floatValue() < 1.0f || this.state.style.mask != null;
    }

    private void resetState() {
        this.state = new RendererState(this);
        this.stateStack = new Stack<>();
        updateStyle(this.state, SVG.Style.getDefaultStyle());
        this.state.viewPort = (SVG.Box) null;
        this.state.spacePreserve = false;
        this.stateStack.push(new RendererState(this, this.state));
        this.matrixStack = new Stack<>();
        this.parentStack = new Stack<>();
    }

    private void setClipRect(float f, float f2, float f3, float f4) {
        float fFloatValueX = f + f3;
        float fFloatValueY = f2 + f4;
        if (this.state.style.clip != null) {
            f += this.state.style.clip.left.floatValueX(this);
            f2 += this.state.style.clip.f4690top.floatValueY(this);
            fFloatValueX -= this.state.style.clip.right.floatValueX(this);
            fFloatValueY -= this.state.style.clip.bottom.floatValueY(this);
        }
        this.canvas.clipRect(f, f2, fFloatValueX, fFloatValueY);
    }

    private void setPaintColour(RendererState rendererState, boolean z, SVG.SvgPaint svgPaint) {
        int i;
        float fFloatValue = (z ? rendererState.style.fillOpacity : rendererState.style.strokeOpacity).floatValue();
        if (svgPaint instanceof SVG.Colour) {
            i = ((SVG.Colour) svgPaint).colour;
        } else if (!(svgPaint instanceof SVG.CurrentColor)) {
            return;
        } else {
            i = rendererState.style.color.colour;
        }
        int iColourWithOpacity = colourWithOpacity(i, fFloatValue);
        if (z) {
            rendererState.fillPaint.setColor(iColourWithOpacity);
        } else {
            rendererState.strokePaint.setColor(iColourWithOpacity);
        }
    }

    private void setSolidColor(boolean z, SVG.SolidColor solidColor) {
        if (z) {
            if (isSpecified(solidColor.baseStyle, 2147483648L)) {
                this.state.style.fill = solidColor.baseStyle.solidColor;
                this.state.hasFill = solidColor.baseStyle.solidColor != null;
            }
            if (isSpecified(solidColor.baseStyle, 4294967296L)) {
                this.state.style.fillOpacity = solidColor.baseStyle.solidOpacity;
            }
            if (isSpecified(solidColor.baseStyle, 6442450944L)) {
                setPaintColour(this.state, z, this.state.style.fill);
                return;
            }
            return;
        }
        if (isSpecified(solidColor.baseStyle, 2147483648L)) {
            this.state.style.stroke = solidColor.baseStyle.solidColor;
            this.state.hasStroke = solidColor.baseStyle.solidColor != null;
        }
        if (isSpecified(solidColor.baseStyle, 4294967296L)) {
            this.state.style.strokeOpacity = solidColor.baseStyle.solidOpacity;
        }
        if (isSpecified(solidColor.baseStyle, 6442450944L)) {
            setPaintColour(this.state, z, this.state.style.stroke);
        }
    }

    private void statePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    private void statePush() {
        this.canvas.save();
        this.stateStack.push(this.state);
        this.state = new RendererState(this, this.state);
    }

    private String textXMLSpaceTransform(String str, boolean z, boolean z2) {
        if (this.state.spacePreserve) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    @SuppressWarnings("deprecation")
    private void updateParentBoundingBox(SVG.SvgElement svgElement) {
        if (svgElement.parent == null || svgElement.boundingBox == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.matrixStack.peek().invert(matrix)) {
            float[] fArr = {svgElement.boundingBox.minX, svgElement.boundingBox.minY, svgElement.boundingBox.maxX(), svgElement.boundingBox.minY, svgElement.boundingBox.maxX(), svgElement.boundingBox.maxY(), svgElement.boundingBox.minX, svgElement.boundingBox.maxY()};
            matrix.preConcat(this.canvas.getMatrix());
            matrix.mapPoints(fArr);
            RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
            for (int i = 2; i <= 6; i += 2) {
                if (fArr[i] < rectF.left) {
                    rectF.left = fArr[i];
                }
                if (fArr[i] > rectF.right) {
                    rectF.right = fArr[i];
                }
                if (fArr[i + 1] < rectF.top) {
                    rectF.top = fArr[i + 1];
                }
                if (fArr[i + 1] > rectF.bottom) {
                    rectF.bottom = fArr[i + 1];
                }
            }
            SVG.SvgElement svgElement2 = (SVG.SvgElement) ((SVG.SvgContainer) this.parentStack.peek());
            if (svgElement2.boundingBox == null) {
                svgElement2.boundingBox = SVG.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                svgElement2.boundingBox.union(SVG.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private void updateStyle(RendererState rendererState, SVG.Style style) {
        Typeface typefaceCheckGenericFont;
        if (isSpecified(style, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            rendererState.style.color = style.color;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            rendererState.style.opacity = style.opacity;
        }
        if (isSpecified(style, 1L)) {
            rendererState.style.fill = style.fill;
            rendererState.hasFill = (style.fill == null || style.fill == SVG.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 4L)) {
            rendererState.style.fillOpacity = style.fillOpacity;
        }
        if (isSpecified(style, 6149L)) {
            setPaintColour(rendererState, true, rendererState.style.fill);
        }
        if (isSpecified(style, 2L)) {
            rendererState.style.fillRule = style.fillRule;
        }
        if (isSpecified(style, 8L)) {
            rendererState.style.stroke = style.stroke;
            rendererState.hasStroke = (style.stroke == null || style.stroke == SVG.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 16L)) {
            rendererState.style.strokeOpacity = style.strokeOpacity;
        }
        if (isSpecified(style, 6168L)) {
            setPaintColour(rendererState, false, rendererState.style.stroke);
        }
        if (isSpecified(style, 34359738368L)) {
            rendererState.style.vectorEffect = style.vectorEffect;
        }
        if (isSpecified(style, 32L)) {
            rendererState.style.strokeWidth = style.strokeWidth;
            rendererState.strokePaint.setStrokeWidth(rendererState.style.strokeWidth.floatValue(this));
        }
        if (isSpecified(style, 64L)) {
            rendererState.style.strokeLineCap = style.strokeLineCap;
            SVG.Style.LineCap lineCap = style.strokeLineCap;
            if (lineCap == SVG.Style.LineCap.Butt) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.BUTT);
            } else if (lineCap == SVG.Style.LineCap.Round) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.ROUND);
            } else if (lineCap == SVG.Style.LineCap.Square) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (isSpecified(style, 128L)) {
            rendererState.style.strokeLineJoin = style.strokeLineJoin;
            SVG.Style.LineJoin lineJoin = style.strokeLineJoin;
            if (lineJoin == SVG.Style.LineJoin.Miter) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.MITER);
            } else if (lineJoin == SVG.Style.LineJoin.Round) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.ROUND);
            } else if (lineJoin == SVG.Style.LineJoin.Bevel) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (isSpecified(style, 256L)) {
            rendererState.style.strokeMiterLimit = style.strokeMiterLimit;
            rendererState.strokePaint.setStrokeMiter(style.strokeMiterLimit.floatValue());
        }
        if (isSpecified(style, 512L)) {
            rendererState.style.strokeDashArray = style.strokeDashArray;
        }
        if (isSpecified(style, 1024L)) {
            rendererState.style.strokeDashOffset = style.strokeDashOffset;
        }
        if (isSpecified(style, 1536L)) {
            if (rendererState.style.strokeDashArray == null) {
                rendererState.strokePaint.setPathEffect((PathEffect) null);
            } else {
                int length = rendererState.style.strokeDashArray.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    fArr[i2] = rendererState.style.strokeDashArray[i2 % length].floatValue(this);
                    f += fArr[i2];
                }
                if (f == 0.0f) {
                    rendererState.strokePaint.setPathEffect((PathEffect) null);
                } else {
                    float fFloatValue = rendererState.style.strokeDashOffset.floatValue(this);
                    if (fFloatValue < 0) {
                        fFloatValue = (fFloatValue % f) + f;
                    }
                    rendererState.strokePaint.setPathEffect(new DashPathEffect(fArr, fFloatValue));
                }
            }
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PREPARE)) {
            float currentFontSize = getCurrentFontSize();
            rendererState.style.fontSize = style.fontSize;
            rendererState.fillPaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
            rendererState.strokePaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            rendererState.style.fontFamily = style.fontFamily;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (style.fontWeight.intValue() == -1 && rendererState.style.fontWeight.intValue() > 100) {
                SVG.Style style2 = rendererState.style;
                style2.fontWeight = new Integer(style2.fontWeight.intValue() - 100);
            } else if (style.fontWeight.intValue() != 1 || rendererState.style.fontWeight.intValue() >= 900) {
                rendererState.style.fontWeight = style.fontWeight;
            } else {
                SVG.Style style3 = rendererState.style;
                style3.fontWeight = new Integer(style3.fontWeight.intValue() + 100);
            }
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            rendererState.style.fontStyle = style.fontStyle;
        }
        if (isSpecified(style, 106496L)) {
            Typeface typefaceCheckGenericFont2 = (Typeface) null;
            if (rendererState.style.fontFamily == null || this.document == null) {
                typefaceCheckGenericFont = typefaceCheckGenericFont2;
                break;
            }
            SVGExternalFileResolver fileResolver = SVG.getFileResolver();
            Iterator<String> it = rendererState.style.fontFamily.iterator();
            while (true) {
                if (!it.hasNext()) {
                    typefaceCheckGenericFont = typefaceCheckGenericFont2;
                    break;
                }
                String next = it.next();
                typefaceCheckGenericFont2 = checkGenericFont(next, rendererState.style.fontWeight, rendererState.style.fontStyle);
                if (typefaceCheckGenericFont2 == null && fileResolver != null) {
                    typefaceCheckGenericFont2 = fileResolver.resolveFont(next, rendererState.style.fontWeight.intValue(), String.valueOf(rendererState.style.fontStyle));
                }
                if (typefaceCheckGenericFont2 != null) {
                    typefaceCheckGenericFont = typefaceCheckGenericFont2;
                    break;
                }
            }
            if (typefaceCheckGenericFont == null) {
                typefaceCheckGenericFont = checkGenericFont(DEFAULT_FONT_FAMILY, rendererState.style.fontWeight, rendererState.style.fontStyle);
            }
            rendererState.fillPaint.setTypeface(typefaceCheckGenericFont);
            rendererState.strokePaint.setTypeface(typefaceCheckGenericFont);
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            rendererState.style.textDecoration = style.textDecoration;
            rendererState.fillPaint.setStrikeThruText(style.textDecoration == SVG.Style.TextDecoration.LineThrough);
            rendererState.fillPaint.setUnderlineText(style.textDecoration == SVG.Style.TextDecoration.Underline);
            if (Build.VERSION.SDK_INT >= 17) {
                rendererState.strokePaint.setStrikeThruText(style.textDecoration == SVG.Style.TextDecoration.LineThrough);
                rendererState.strokePaint.setUnderlineText(style.textDecoration == SVG.Style.TextDecoration.Underline);
            }
        }
        if (isSpecified(style, 68719476736L)) {
            rendererState.style.direction = style.direction;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            rendererState.style.textAnchor = style.textAnchor;
        }
        if (isSpecified(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            rendererState.style.overflow = style.overflow;
        }
        if (isSpecified(style, 2097152L)) {
            rendererState.style.markerStart = style.markerStart;
        }
        if (isSpecified(style, 4194304L)) {
            rendererState.style.markerMid = style.markerMid;
        }
        if (isSpecified(style, 8388608L)) {
            rendererState.style.markerEnd = style.markerEnd;
        }
        if (isSpecified(style, 16777216L)) {
            rendererState.style.display = style.display;
        }
        if (isSpecified(style, 33554432L)) {
            rendererState.style.visibility = style.visibility;
        }
        if (isSpecified(style, 1048576L)) {
            rendererState.style.clip = style.clip;
        }
        if (isSpecified(style, 268435456L)) {
            rendererState.style.clipPath = style.clipPath;
        }
        if (isSpecified(style, 536870912L)) {
            rendererState.style.clipRule = style.clipRule;
        }
        if (isSpecified(style, FileUtils.ONE_GB)) {
            rendererState.style.mask = style.mask;
        }
        if (isSpecified(style, 67108864L)) {
            rendererState.style.stopColor = style.stopColor;
        }
        if (isSpecified(style, 134217728L)) {
            rendererState.style.stopOpacity = style.stopOpacity;
        }
        if (isSpecified(style, 8589934592L)) {
            rendererState.style.viewportFill = style.viewportFill;
        }
        if (isSpecified(style, 17179869184L)) {
            rendererState.style.viewportFillOpacity = style.viewportFillOpacity;
        }
        if (isSpecified(style, 137438953472L)) {
            rendererState.style.imageRendering = style.imageRendering;
        }
    }

    private void updateStyleForElement(RendererState rendererState, SVG.SvgElementBase svgElementBase) {
        rendererState.style.resetNonInheritingProperties(svgElementBase.parent == null);
        if (svgElementBase.baseStyle != null) {
            updateStyle(rendererState, svgElementBase.baseStyle);
        }
        if (this.document.hasCSSRules()) {
            for (CSSParser.Rule rule : this.document.getCSSRules()) {
                if (CSSParser.ruleMatch(this.ruleMatchContext, rule.selector, svgElementBase)) {
                    updateStyle(rendererState, rule.style);
                }
            }
        }
        if (svgElementBase.style != null) {
            updateStyle(rendererState, svgElementBase.style);
        }
    }

    private void viewportFill() {
        int iColourWithOpacity;
        if (this.state.style.viewportFill instanceof SVG.Colour) {
            iColourWithOpacity = ((SVG.Colour) this.state.style.viewportFill).colour;
        } else if (!(this.state.style.viewportFill instanceof SVG.CurrentColor)) {
            return;
        } else {
            iColourWithOpacity = this.state.style.color.colour;
        }
        if (this.state.style.viewportFillOpacity != null) {
            iColourWithOpacity = colourWithOpacity(iColourWithOpacity, this.state.style.viewportFillOpacity.floatValue());
        }
        this.canvas.drawColor(iColourWithOpacity);
    }

    public boolean visible() {
        if (this.state.style.visibility != null) {
            return this.state.style.visibility.booleanValue();
        }
        return true;
    }

    public static void warn(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    float getCurrentFontSize() {
        return this.state.fillPaint.getTextSize();
    }

    float getCurrentFontXHeight() {
        return this.state.fillPaint.getTextSize() / 2.0f;
    }

    SVG.Box getCurrentViewPortInUserUnits() {
        return this.state.viewBox != null ? this.state.viewBox : this.state.viewPort;
    }

    float getDPI() {
        return this.f4744dpi;
    }

    void renderDocument(SVG c1580svg, RenderOptions renderOptions) {
        SVG.Box box;
        PreserveAspectRatio preserveAspectRatio;
        if (renderOptions == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.document = c1580svg;
        SVG.Svg rootElement = c1580svg.getRootElement();
        if (rootElement == null) {
            warn("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (renderOptions.hasView()) {
            SVG.SvgElementBase elementById = this.document.getElementById(renderOptions.viewId);
            if (elementById == null || !(elementById instanceof SVG.View)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", renderOptions.viewId));
                return;
            }
            SVG.View view = (SVG.View) elementById;
            if (view.viewBox == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", renderOptions.viewId));
                return;
            } else {
                SVG.Box box2 = view.viewBox;
                preserveAspectRatio = view.preserveAspectRatio;
                box = box2;
            }
        } else {
            box = renderOptions.hasViewBox() ? renderOptions.viewBox : rootElement.viewBox;
            preserveAspectRatio = renderOptions.hasPreserveAspectRatio() ? renderOptions.preserveAspectRatio : rootElement.preserveAspectRatio;
        }
        if (renderOptions.hasCss()) {
            c1580svg.addCSSRules(renderOptions.f4689css);
        }
        if (renderOptions.hasTarget()) {
            this.ruleMatchContext = new CSSParser.RuleMatchContext();
            this.ruleMatchContext.targetElement = c1580svg.getElementById(renderOptions.targetId);
        }
        resetState();
        checkXMLSpaceAttribute(rootElement);
        statePush();
        SVG.Box box3 = new SVG.Box(renderOptions.viewPort);
        if (rootElement.width != null) {
            box3.width = rootElement.width.floatValue(this, box3.width);
        }
        if (rootElement.height != null) {
            box3.height = rootElement.height.floatValue(this, box3.height);
        }
        render(rootElement, box3, box, preserveAspectRatio);
        statePop();
        if (renderOptions.hasCss()) {
            c1580svg.clearRenderCSSRules();
        }
    }
}
