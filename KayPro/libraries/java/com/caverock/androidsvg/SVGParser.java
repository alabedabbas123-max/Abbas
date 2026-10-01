package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import android.support.v4.media.session.PlaybackStateCompat;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.github.megatronking.svg.generator.utils.KeywordColors;
import com.github.megatronking.svg.generator.vector.model.VectorConstants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.apache.commons.io.FileUtils;
import org.objectweb.asm.signature.SignatureVisitor;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class SVGParser {
    private static final String CURRENTCOLOR = "currentColor";
    public static final int ENTITY_WATCH_BUFFER_SIZE = 4096;
    private static final String FEATURE_STRING_PREFIX = "http://www.w3.org/TR/SVG11/feature#";
    private static final String NONE = "none";
    private static final String SVG_NAMESPACE = "http://www.w3.org/2000/svg";

    private static final String f4757TAG = "SVGParser";
    private static final String VALID_DISPLAY_VALUES = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|";
    private static final String VALID_VISIBILITY_VALUES = "|visible|hidden|collapse|";
    private static final String XLINK_NAMESPACE = "http://www.w3.org/1999/xlink";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE = "alternate";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE_NO = "no";
    public static final String XML_STYLESHEET_ATTR_HREF = "href";
    public static final String XML_STYLESHEET_ATTR_MEDIA = "media";
    public static final String XML_STYLESHEET_ATTR_MEDIA_ALL = "all";
    public static final String XML_STYLESHEET_ATTR_TYPE = "type";
    private static final String XML_STYLESHEET_PROCESSING_INSTRUCTION = "xml-stylesheet";
    private int ignoreDepth;
    private SVG svgDocument = (SVG) null;
    private SVG.SvgContainer currentElement = (SVG.SvgContainer) null;
    private boolean ignoring = false;
    private boolean inMetadataElement = false;
    private SVGElem metadataTag = (SVGElem) null;
    private StringBuilder metadataElementContents = (StringBuilder) null;
    private boolean inStyleElement = false;
    private StringBuilder styleElementContents = (StringBuilder) null;

    private static class AspectRatioKeywords {
        private static final Map<String, PreserveAspectRatio.Alignment> aspectRatioKeywords = new HashMap(10);

        static {
            aspectRatioKeywords.put("none", PreserveAspectRatio.Alignment.none);
            aspectRatioKeywords.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            aspectRatioKeywords.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            aspectRatioKeywords.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            aspectRatioKeywords.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            aspectRatioKeywords.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            aspectRatioKeywords.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            aspectRatioKeywords.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            aspectRatioKeywords.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            aspectRatioKeywords.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }

        static PreserveAspectRatio.Alignment m7057get(String str) {
            return aspectRatioKeywords.get(str);
        }
    }

    private static class ColourKeywords {
        private static final Map<String, Integer> colourKeywords = new HashMap(47);

        static {
            colourKeywords.put("aliceblue", new Integer(KeywordColors.aliceblue));
            colourKeywords.put("antiquewhite", new Integer(KeywordColors.antiquewhite));
            colourKeywords.put("aqua", new Integer(-16711681));
            colourKeywords.put("aquamarine", new Integer(KeywordColors.aquamarine));
            colourKeywords.put("azure", new Integer(KeywordColors.azure));
            colourKeywords.put("beige", new Integer(KeywordColors.beige));
            colourKeywords.put("bisque", new Integer(KeywordColors.bisque));
            colourKeywords.put("black", new Integer(-16777216));
            colourKeywords.put("blanchedalmond", new Integer(KeywordColors.blanchedalmond));
            colourKeywords.put("blue", new Integer(-16776961));
            colourKeywords.put("blueviolet", new Integer(KeywordColors.blueviolet));
            colourKeywords.put("brown", new Integer(KeywordColors.brown));
            colourKeywords.put("burlywood", new Integer(KeywordColors.burlywood));
            colourKeywords.put("cadetblue", new Integer(KeywordColors.cadetblue));
            colourKeywords.put("chartreuse", new Integer(KeywordColors.chartreuse));
            colourKeywords.put("chocolate", new Integer(KeywordColors.chocolate));
            colourKeywords.put("coral", new Integer(KeywordColors.coral));
            colourKeywords.put("cornflowerblue", new Integer(KeywordColors.cornflowerblue));
            colourKeywords.put("cornsilk", new Integer(KeywordColors.cornsilk));
            colourKeywords.put("crimson", new Integer(KeywordColors.crimson));
            colourKeywords.put("cyan", new Integer(-16711681));
            colourKeywords.put("darkblue", new Integer(KeywordColors.darkblue));
            colourKeywords.put("darkcyan", new Integer(KeywordColors.darkcyan));
            colourKeywords.put("darkgoldenrod", new Integer(KeywordColors.darkgoldenrod));
            colourKeywords.put("darkgray", new Integer(-5658199));
            colourKeywords.put("darkgreen", new Integer(KeywordColors.darkgreen));
            colourKeywords.put("darkgrey", new Integer(-5658199));
            colourKeywords.put("darkkhaki", new Integer(KeywordColors.darkkhaki));
            colourKeywords.put("darkmagenta", new Integer(KeywordColors.darkmagenta));
            colourKeywords.put("darkolivegreen", new Integer(KeywordColors.darkolivegreen));
            colourKeywords.put("darkorange", new Integer(KeywordColors.darkorange));
            colourKeywords.put("darkorchid", new Integer(KeywordColors.darkorchid));
            colourKeywords.put("darkred", new Integer(KeywordColors.darkred));
            colourKeywords.put("darksalmon", new Integer(KeywordColors.darksalmon));
            colourKeywords.put("darkseagreen", new Integer(KeywordColors.darkseagreen));
            colourKeywords.put("darkslateblue", new Integer(KeywordColors.darkslateblue));
            colourKeywords.put("darkslategray", new Integer(-13676721));
            colourKeywords.put("darkslategrey", new Integer(-13676721));
            colourKeywords.put("darkturquoise", new Integer(KeywordColors.darkturquoise));
            colourKeywords.put("darkviolet", new Integer(KeywordColors.darkviolet));
            colourKeywords.put("deeppink", new Integer(KeywordColors.deeppink));
            colourKeywords.put("deepskyblue", new Integer(KeywordColors.deepskyblue));
            colourKeywords.put("dimgray", new Integer(-9868951));
            colourKeywords.put("dimgrey", new Integer(-9868951));
            colourKeywords.put("dodgerblue", new Integer(KeywordColors.dodgerblue));
            colourKeywords.put("firebrick", new Integer(KeywordColors.firebrick));
            colourKeywords.put("floralwhite", new Integer(KeywordColors.floralwhite));
            colourKeywords.put("forestgreen", new Integer(KeywordColors.forestgreen));
            colourKeywords.put("fuchsia", new Integer(-65281));
            colourKeywords.put("gainsboro", new Integer(KeywordColors.gainsboro));
            colourKeywords.put("ghostwhite", new Integer(KeywordColors.ghostwhite));
            colourKeywords.put("gold", new Integer(KeywordColors.gold));
            colourKeywords.put("goldenrod", new Integer(KeywordColors.goldenrod));
            colourKeywords.put("gray", new Integer(-8355712));
            colourKeywords.put("green", new Integer(KeywordColors.green));
            colourKeywords.put("greenyellow", new Integer(KeywordColors.greenyellow));
            colourKeywords.put("grey", new Integer(-8355712));
            colourKeywords.put("honeydew", new Integer(KeywordColors.honeydew));
            colourKeywords.put("hotpink", new Integer(KeywordColors.hotpink));
            colourKeywords.put("indianred", new Integer(KeywordColors.indianred));
            colourKeywords.put("indigo", new Integer(KeywordColors.indigo));
            colourKeywords.put("ivory", new Integer(-16));
            colourKeywords.put("khaki", new Integer(KeywordColors.khaki));
            colourKeywords.put("lavender", new Integer(KeywordColors.lavender));
            colourKeywords.put("lavenderblush", new Integer(KeywordColors.lavenderblush));
            colourKeywords.put("lawngreen", new Integer(KeywordColors.lawngreen));
            colourKeywords.put("lemonchiffon", new Integer(KeywordColors.lemonchiffon));
            colourKeywords.put("lightblue", new Integer(KeywordColors.lightblue));
            colourKeywords.put("lightcoral", new Integer(KeywordColors.lightcoral));
            colourKeywords.put("lightcyan", new Integer(KeywordColors.lightcyan));
            colourKeywords.put("lightgoldenrodyellow", new Integer(KeywordColors.lightgoldenrodyellow));
            colourKeywords.put("lightgray", new Integer(-2894893));
            colourKeywords.put("lightgreen", new Integer(KeywordColors.lightgreen));
            colourKeywords.put("lightgrey", new Integer(-2894893));
            colourKeywords.put("lightpink", new Integer(KeywordColors.lightpink));
            colourKeywords.put("lightsalmon", new Integer(KeywordColors.lightsalmon));
            colourKeywords.put("lightseagreen", new Integer(KeywordColors.lightseagreen));
            colourKeywords.put("lightskyblue", new Integer(KeywordColors.lightskyblue));
            colourKeywords.put("lightslategray", new Integer(-8943463));
            colourKeywords.put("lightslategrey", new Integer(-8943463));
            colourKeywords.put("lightsteelblue", new Integer(KeywordColors.lightsteelblue));
            colourKeywords.put("lightyellow", new Integer(-32));
            colourKeywords.put("lime", new Integer(-16711936));
            colourKeywords.put("limegreen", new Integer(KeywordColors.limegreen));
            colourKeywords.put("linen", new Integer(KeywordColors.linen));
            colourKeywords.put("magenta", new Integer(-65281));
            colourKeywords.put("maroon", new Integer(KeywordColors.maroon));
            colourKeywords.put("mediumaquamarine", new Integer(KeywordColors.mediumaquamarine));
            colourKeywords.put("mediumblue", new Integer(KeywordColors.mediumblue));
            colourKeywords.put("mediumorchid", new Integer(KeywordColors.mediumorchid));
            colourKeywords.put("mediumpurple", new Integer(KeywordColors.mediumpurple));
            colourKeywords.put("mediumseagreen", new Integer(KeywordColors.mediumseagreen));
            colourKeywords.put("mediumslateblue", new Integer(KeywordColors.mediumslateblue));
            colourKeywords.put("mediumspringgreen", new Integer(KeywordColors.mediumspringgreen));
            colourKeywords.put("mediumturquoise", new Integer(KeywordColors.mediumturquoise));
            colourKeywords.put("mediumvioletred", new Integer(KeywordColors.mediumvioletred));
            colourKeywords.put("midnightblue", new Integer(KeywordColors.midnightblue));
            colourKeywords.put("mintcream", new Integer(KeywordColors.mintcream));
            colourKeywords.put("mistyrose", new Integer(KeywordColors.mistyrose));
            colourKeywords.put("moccasin", new Integer(KeywordColors.moccasin));
            colourKeywords.put("navajowhite", new Integer(KeywordColors.navajowhite));
            colourKeywords.put("navy", new Integer(KeywordColors.navy));
            colourKeywords.put("oldlace", new Integer(KeywordColors.oldlace));
            colourKeywords.put("olive", new Integer(KeywordColors.olive));
            colourKeywords.put("olivedrab", new Integer(KeywordColors.olivedrab));
            colourKeywords.put("orange", new Integer(KeywordColors.orange));
            colourKeywords.put("orangered", new Integer(KeywordColors.orangered));
            colourKeywords.put("orchid", new Integer(KeywordColors.orchid));
            colourKeywords.put("palegoldenrod", new Integer(KeywordColors.palegoldenrod));
            colourKeywords.put("palegreen", new Integer(KeywordColors.palegreen));
            colourKeywords.put("paleturquoise", new Integer(KeywordColors.paleturquoise));
            colourKeywords.put("palevioletred", new Integer(KeywordColors.palevioletred));
            colourKeywords.put("papayawhip", new Integer(KeywordColors.papayawhip));
            colourKeywords.put("peachpuff", new Integer(KeywordColors.peachpuff));
            colourKeywords.put("peru", new Integer(KeywordColors.peru));
            colourKeywords.put("pink", new Integer(KeywordColors.pink));
            colourKeywords.put("plum", new Integer(KeywordColors.plum));
            colourKeywords.put("powderblue", new Integer(KeywordColors.powderblue));
            colourKeywords.put("purple", new Integer(KeywordColors.purple));
            colourKeywords.put("rebeccapurple", new Integer(-10079335));
            colourKeywords.put("red", new Integer(-65536));
            colourKeywords.put("rosybrown", new Integer(KeywordColors.rosybrown));
            colourKeywords.put("royalblue", new Integer(KeywordColors.royalblue));
            colourKeywords.put("saddlebrown", new Integer(KeywordColors.saddlebrown));
            colourKeywords.put("salmon", new Integer(KeywordColors.salmon));
            colourKeywords.put("sandybrown", new Integer(KeywordColors.sandybrown));
            colourKeywords.put("seagreen", new Integer(KeywordColors.seagreen));
            colourKeywords.put("seashell", new Integer(KeywordColors.seashell));
            colourKeywords.put("sienna", new Integer(KeywordColors.sienna));
            colourKeywords.put("silver", new Integer(KeywordColors.silver));
            colourKeywords.put("skyblue", new Integer(KeywordColors.skyblue));
            colourKeywords.put("slateblue", new Integer(KeywordColors.slateblue));
            colourKeywords.put("slategray", new Integer(-9404272));
            colourKeywords.put("slategrey", new Integer(-9404272));
            colourKeywords.put("snow", new Integer(-1286));
            colourKeywords.put("springgreen", new Integer(-16711809));
            colourKeywords.put("steelblue", new Integer(KeywordColors.springgreen));
            colourKeywords.put("tan", new Integer(KeywordColors.steelblue));
            colourKeywords.put("teal", new Integer(KeywordColors.teal));
            colourKeywords.put("thistle", new Integer(KeywordColors.thistle));
            colourKeywords.put("tomato", new Integer(KeywordColors.tomato));
            colourKeywords.put("turquoise", new Integer(KeywordColors.turquoise));
            colourKeywords.put("violet", new Integer(KeywordColors.violet));
            colourKeywords.put("wheat", new Integer(KeywordColors.wheat));
            colourKeywords.put("white", new Integer(-1));
            colourKeywords.put("whitesmoke", new Integer(KeywordColors.whitesmoke));
            colourKeywords.put("yellow", new Integer(-256));
            colourKeywords.put("yellowgreen", new Integer(KeywordColors.yellowgreen));
            colourKeywords.put("transparent", new Integer(0));
        }

        static Integer m7058get(String str) {
            return colourKeywords.get(str);
        }
    }

    private static class FontSizeKeywords {
        private static final Map<String, SVG.Length> fontSizeKeywords = new HashMap(9);

        static {
            fontSizeKeywords.put("xx-small", new SVG.Length(0.694f, SVG.Unit.pt));
            fontSizeKeywords.put("x-small", new SVG.Length(0.833f, SVG.Unit.pt));
            fontSizeKeywords.put("small", new SVG.Length(10.0f, SVG.Unit.pt));
            fontSizeKeywords.put("medium", new SVG.Length(12.0f, SVG.Unit.pt));
            fontSizeKeywords.put("large", new SVG.Length(14.4f, SVG.Unit.pt));
            fontSizeKeywords.put("x-large", new SVG.Length(17.3f, SVG.Unit.pt));
            fontSizeKeywords.put("xx-large", new SVG.Length(20.7f, SVG.Unit.pt));
            fontSizeKeywords.put("smaller", new SVG.Length(83.33f, SVG.Unit.percent));
            fontSizeKeywords.put("larger", new SVG.Length(120.0f, SVG.Unit.percent));
        }

        static SVG.Length m7059get(String str) {
            return fontSizeKeywords.get(str);
        }
    }

    private static class FontWeightKeywords {
        private static final Map<String, Integer> fontWeightKeywords = new HashMap(13);

        static {
            fontWeightKeywords.put("normal", new Integer(400));
            fontWeightKeywords.put("bold", new Integer(700));
            fontWeightKeywords.put("bolder", new Integer(1));
            fontWeightKeywords.put("lighter", new Integer(-1));
            fontWeightKeywords.put("100", new Integer(100));
            fontWeightKeywords.put("200", new Integer(200));
            fontWeightKeywords.put("300", new Integer(300));
            fontWeightKeywords.put("400", new Integer(400));
            fontWeightKeywords.put("500", new Integer(500));
            fontWeightKeywords.put("600", new Integer(600));
            fontWeightKeywords.put("700", new Integer(700));
            fontWeightKeywords.put("800", new Integer(800));
            fontWeightKeywords.put("900", new Integer(900));
        }

        static Integer m7060get(String str) {
            return fontWeightKeywords.get(str);
        }
    }

    private class SAXHandler extends DefaultHandler2 {
        private final SVGParser this$0;

        public SAXHandler(SVGParser sVGParser) {
            this.this$0 = sVGParser;
        }

        @Override
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            this.this$0.text(new String(cArr, i, i2));
        }

        @Override
        public void endDocument() throws SAXException {
            this.this$0.endDocument();
        }

        @Override
        public void endElement(String str, String str2, String str3) throws SAXException {
            this.this$0.endElement(str, str2, str3);
        }

        @Override
        public void processingInstruction(String str, String str2) throws SAXException {
            this.this$0.handleProcessingInstruction(str, this.this$0.parseProcessingInstructionAttributes(new TextScanner(str2)));
        }

        @Override
        public void startDocument() throws SAXException {
            this.this$0.startDocument();
        }

        @Override
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            this.this$0.startElement(str, str2, str3, attributes);
        }
    }

    private enum SVGAttr {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final Map<String, SVGAttr> cache = new HashMap();

        static {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    cache.put(SvgConstants.ATTR_CLASS, sVGAttr);
                } else if (sVGAttr != UNSUPPORTED) {
                    cache.put(sVGAttr.name().replace('_', SignatureVisitor.SUPER), sVGAttr);
                }
            }
        }

        public static SVGAttr fromString(String str) {
            SVGAttr sVGAttr = cache.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
        }

        public static SVGAttr valueOf(String str) {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr.name().equals(str)) {
                    return sVGAttr;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    private enum SVGElem {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map<String, SVGElem> cache = new HashMap();

        static {
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    cache.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    cache.put(sVGElem.name(), sVGElem);
                }
            }
        }

        public static SVGElem fromString(String str) {
            SVGElem sVGElem = cache.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }

        public static SVGElem valueOf(String str) {
            for (SVGElem sVGElem : values()) {
                if (sVGElem.name().equals(str)) {
                    return sVGElem;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    static class TextScanner {
        String input;
        int inputLength;
        int position = 0;
        private NumberParser numberParser = new NumberParser();

        TextScanner(String str) {
            this.inputLength = 0;
            this.input = str.trim();
            this.inputLength = this.input.length();
        }

        int advanceChar() {
            if (this.position == this.inputLength) {
                return -1;
            }
            this.position++;
            if (this.position < this.inputLength) {
                return this.input.charAt(this.position);
            }
            return -1;
        }

        String ahead() {
            int i = this.position;
            while (!empty() && !isWhitespace(this.input.charAt(this.position))) {
                this.position++;
            }
            String strSubstring = this.input.substring(i, this.position);
            this.position = i;
            return strSubstring;
        }

        Boolean checkedNextFlag(Object obj) {
            if (obj == null) {
                return (Boolean) null;
            }
            skipCommaWhitespace();
            return nextFlag();
        }

        float checkedNextFloat(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            skipCommaWhitespace();
            return nextFloat();
        }

        float checkedNextFloat(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            skipCommaWhitespace();
            return nextFloat();
        }

        boolean consume(char c) {
            boolean z = this.position < this.inputLength && this.input.charAt(this.position) == c;
            if (z) {
                this.position++;
            }
            return z;
        }

        boolean consume(String str) {
            int length = str.length();
            boolean z = this.position <= this.inputLength - length && this.input.substring(this.position, this.position + length).equals(str);
            if (z) {
                this.position = length + this.position;
            }
            return z;
        }

        boolean empty() {
            return this.position == this.inputLength;
        }

        boolean hasLetter() {
            if (this.position == this.inputLength) {
                return false;
            }
            char cCharAt = this.input.charAt(this.position);
            return (cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z');
        }

        boolean isEOL(int i) {
            return i == 10 || i == 13;
        }

        boolean isWhitespace(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        Integer nextChar() {
            if (this.position == this.inputLength) {
                return (Integer) null;
            }
            String str = this.input;
            int i = this.position;
            this.position = i + 1;
            return new Integer(str.charAt(i));
        }

        Boolean nextFlag() {
            if (this.position == this.inputLength) {
                return (Boolean) null;
            }
            char cCharAt = this.input.charAt(this.position);
            if (cCharAt != '0' && cCharAt != '1') {
                return (Boolean) null;
            }
            this.position++;
            return new Boolean(cCharAt == '1');
        }

        float nextFloat() {
            float number = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
            if (!Float.isNaN(number)) {
                this.position = this.numberParser.getEndPos();
            }
            return number;
        }

        String nextFunction() {
            if (empty()) {
                return (String) null;
            }
            int i = this.position;
            int iCharAt = this.input.charAt(this.position);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = advanceChar();
            }
            int i2 = this.position;
            while (isWhitespace(iCharAt)) {
                iCharAt = advanceChar();
            }
            if (iCharAt == 40) {
                this.position++;
                return this.input.substring(i, i2);
            }
            this.position = i;
            return (String) null;
        }

        SVG.Length nextLength() {
            float fNextFloat = nextFloat();
            if (Float.isNaN(fNextFloat)) {
                return (SVG.Length) null;
            }
            SVG.Unit unitNextUnit = nextUnit();
            return unitNextUnit == null ? new SVG.Length(fNextFloat, SVG.Unit.px) : new SVG.Length(fNextFloat, unitNextUnit);
        }

        String nextQuotedString() {
            if (empty()) {
                return (String) null;
            }
            int i = this.position;
            char cCharAt = this.input.charAt(this.position);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return (String) null;
            }
            int iAdvanceChar = advanceChar();
            while (iAdvanceChar != -1 && iAdvanceChar != cCharAt) {
                iAdvanceChar = advanceChar();
            }
            if (iAdvanceChar == -1) {
                this.position = i;
                return (String) null;
            }
            this.position++;
            return this.input.substring(i + 1, this.position - 1);
        }

        String nextToken() {
            return nextToken(' ', false);
        }

        String nextToken(char c) {
            return nextToken(c, false);
        }

        String nextToken(char c, boolean z) {
            if (empty()) {
                return (String) null;
            }
            char cCharAt = this.input.charAt(this.position);
            if ((!z && isWhitespace(cCharAt)) || cCharAt == c) {
                return (String) null;
            }
            int i = this.position;
            int iAdvanceChar = advanceChar();
            while (iAdvanceChar != -1 && iAdvanceChar != c && (z || !isWhitespace(iAdvanceChar))) {
                iAdvanceChar = advanceChar();
            }
            return this.input.substring(i, this.position);
        }

        String nextTokenWithWhitespace(char c) {
            return nextToken(c, true);
        }

        SVG.Unit nextUnit() {
            if (empty()) {
                return (SVG.Unit) null;
            }
            if (this.input.charAt(this.position) == '%') {
                this.position++;
                return SVG.Unit.percent;
            }
            if (this.position > this.inputLength - 2) {
                return (SVG.Unit) null;
            }
            try {
                SVG.Unit unitValueOf = SVG.Unit.valueOf(this.input.substring(this.position, this.position + 2).toLowerCase(Locale.US));
                this.position += 2;
                return unitValueOf;
            } catch (IllegalArgumentException e) {
                return (SVG.Unit) null;
            }
        }

        String nextWord() {
            if (empty()) {
                return (String) null;
            }
            int i = this.position;
            char cCharAt = this.input.charAt(this.position);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.position = i;
                return (String) null;
            }
            int iAdvanceChar = advanceChar();
            while (true) {
                if ((iAdvanceChar < 65 || iAdvanceChar > 90) && (iAdvanceChar < 97 || iAdvanceChar > 122)) {
                    break;
                }
                iAdvanceChar = advanceChar();
            }
            return this.input.substring(i, this.position);
        }

        float possibleNextFloat() {
            skipCommaWhitespace();
            float number = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
            if (!Float.isNaN(number)) {
                this.position = this.numberParser.getEndPos();
            }
            return number;
        }

        String restOfText() {
            if (empty()) {
                return (String) null;
            }
            int i = this.position;
            this.position = this.inputLength;
            return this.input.substring(i);
        }

        boolean skipCommaWhitespace() {
            skipWhitespace();
            if (this.position == this.inputLength || this.input.charAt(this.position) != ',') {
                return false;
            }
            this.position++;
            skipWhitespace();
            return true;
        }

        void skipWhitespace() {
            while (this.position < this.inputLength && isWhitespace(this.input.charAt(this.position))) {
                this.position++;
            }
        }
    }

    private class XPPAttributesWrapper implements Attributes {
        private XmlPullParser parser;
        private final SVGParser this$0;

        public XPPAttributesWrapper(SVGParser sVGParser, XmlPullParser xmlPullParser) {
            this.this$0 = sVGParser;
            this.parser = xmlPullParser;
        }

        @Override
        public int getIndex(String str) {
            return -1;
        }

        @Override
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override
        public int getLength() {
            return this.parser.getAttributeCount();
        }

        @Override
        public String getLocalName(int i) {
            return this.parser.getAttributeName(i);
        }

        @Override
        public String getQName(int i) {
            String attributeName = this.parser.getAttributeName(i);
            return this.parser.getAttributePrefix(i) != null ? new StringBuffer().append(new StringBuffer().append(this.parser.getAttributePrefix(i)).append(':').toString()).append(attributeName).toString() : attributeName;
        }

        @Override
        public String getType(int i) {
            return (String) null;
        }

        @Override
        public String getType(String str) {
            return (String) null;
        }

        @Override
        public String getType(String str, String str2) {
            return (String) null;
        }

        @Override
        public String getURI(int i) {
            return this.parser.getAttributeNamespace(i);
        }

        @Override
        public String getValue(int i) {
            return this.parser.getAttributeValue(i);
        }

        @Override
        public String getValue(String str) {
            return (String) null;
        }

        @Override
        public String getValue(String str, String str2) {
            return (String) null;
        }
    }

    private void appendToTextContainer(String str) throws SVGParseException {
        SVG.SvgConditionalContainer svgConditionalContainer = (SVG.SvgConditionalContainer) this.currentElement;
        int size = svgConditionalContainer.children.size();
        SVG.SvgObject svgObject = size == 0 ? (SVG.SvgObject) null : svgConditionalContainer.children.get(size - 1);
        if (!(svgObject instanceof SVG.TextSequence)) {
            this.currentElement.addChild(new SVG.TextSequence(str));
        } else {
            SVG.TextSequence textSequence = (SVG.TextSequence) svgObject;
            textSequence.text = new StringBuffer().append(textSequence.text).append(str).toString();
        }
    }

    private void circle(Attributes attributes) throws SVGParseException {
        debug("<circle>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Circle circle = new SVG.Circle();
        circle.document = this.svgDocument;
        circle.parent = this.currentElement;
        parseAttributesCore(circle, attributes);
        parseAttributesStyle(circle, attributes);
        parseAttributesTransform(circle, attributes);
        parseAttributesConditional(circle, attributes);
        parseAttributesCircle(circle, attributes);
        this.currentElement.addChild(circle);
    }

    private static int clamp255(float f) {
        if (f < 0) {
            return 0;
        }
        if (f <= 255) {
            return Math.round(f);
        }
        return 255;
    }

    private void clipPath(Attributes attributes) throws SVGParseException {
        debug("<clipPath>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.ClipPath clipPath = new SVG.ClipPath();
        clipPath.document = this.svgDocument;
        clipPath.parent = this.currentElement;
        parseAttributesCore(clipPath, attributes);
        parseAttributesStyle(clipPath, attributes);
        parseAttributesTransform(clipPath, attributes);
        parseAttributesConditional(clipPath, attributes);
        parseAttributesClipPath(clipPath, attributes);
        this.currentElement.addChild(clipPath);
        this.currentElement = clipPath;
    }

    private void debug(String str, Object... objArr) {
    }

    private void defs(Attributes attributes) throws SVGParseException {
        debug("<defs>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Defs defs = new SVG.Defs();
        defs.document = this.svgDocument;
        defs.parent = this.currentElement;
        parseAttributesCore(defs, attributes);
        parseAttributesStyle(defs, attributes);
        parseAttributesTransform(defs, attributes);
        this.currentElement.addChild(defs);
        this.currentElement = defs;
    }

    private void dumpNode(SVG.SvgObject svgObject, String str) {
        Log.d(f4757TAG, new StringBuffer().append(str).append(svgObject).toString());
        if (svgObject instanceof SVG.SvgConditionalContainer) {
            String string = new StringBuffer().append(str).append("  ").toString();
            Iterator<SVG.SvgObject> it = ((SVG.SvgConditionalContainer) svgObject).children.iterator();
            while (it.hasNext()) {
                dumpNode(it.next(), string);
            }
        }
    }

    private void ellipse(Attributes attributes) throws SVGParseException {
        debug("<ellipse>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Ellipse ellipse = new SVG.Ellipse();
        ellipse.document = this.svgDocument;
        ellipse.parent = this.currentElement;
        parseAttributesCore(ellipse, attributes);
        parseAttributesStyle(ellipse, attributes);
        parseAttributesTransform(ellipse, attributes);
        parseAttributesConditional(ellipse, attributes);
        parseAttributesEllipse(ellipse, attributes);
        this.currentElement.addChild(ellipse);
    }

    public void endDocument() {
    }

    public void endElement(String str, String str2, String str3) throws SVGParseException {
        if (this.ignoring) {
            int i = this.ignoreDepth - 1;
            this.ignoreDepth = i;
            if (i == 0) {
                this.ignoring = false;
                return;
            }
        }
        if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() > 0) {
                str3 = str2;
            }
            SVGElem sVGElemFromString = SVGElem.fromString(str3);
            if (sVGElemFromString == SVGElem.title || sVGElemFromString == SVGElem.desc) {
                this.inMetadataElement = false;
                if (this.metadataElementContents != null) {
                    if (this.metadataTag == SVGElem.title) {
                        this.svgDocument.setTitle(this.metadataElementContents.toString());
                    } else if (this.metadataTag == SVGElem.desc) {
                        this.svgDocument.setDesc(this.metadataElementContents.toString());
                    }
                    this.metadataElementContents.setLength(0);
                    return;
                }
                return;
            }
            if (sVGElemFromString == SVGElem.style) {
                if (this.styleElementContents != null) {
                    this.inStyleElement = false;
                    parseCSSStyleSheet(this.styleElementContents.toString());
                    this.styleElementContents.setLength(0);
                    return;
                }
                return;
            }
            if (sVGElemFromString == SVGElem.svg || sVGElemFromString == SVGElem.defs || sVGElemFromString == SVGElem.g || sVGElemFromString == SVGElem.use || sVGElemFromString == SVGElem.image || sVGElemFromString == SVGElem.text || sVGElemFromString == SVGElem.tspan || sVGElemFromString == SVGElem.SWITCH || sVGElemFromString == SVGElem.symbol || sVGElemFromString == SVGElem.marker || sVGElemFromString == SVGElem.linearGradient || sVGElemFromString == SVGElem.radialGradient || sVGElemFromString == SVGElem.stop || sVGElemFromString == SVGElem.clipPath || sVGElemFromString == SVGElem.textPath || sVGElemFromString == SVGElem.pattern || sVGElemFromString == SVGElem.view || sVGElemFromString == SVGElem.mask || sVGElemFromString == SVGElem.solidColor) {
                this.currentElement = ((SVG.SvgObject) this.currentElement).parent;
            }
        }
    }

    private void m7054g(Attributes attributes) throws SVGParseException {
        debug("<g>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Group group = new SVG.Group();
        group.document = this.svgDocument;
        group.parent = this.currentElement;
        parseAttributesCore(group, attributes);
        parseAttributesStyle(group, attributes);
        parseAttributesTransform(group, attributes);
        parseAttributesConditional(group, attributes);
        this.currentElement.addChild(group);
        this.currentElement = group;
    }

    public void handleProcessingInstruction(String str, Map<String, String> map) {
        String str2;
        String strResolveCSSStyleSheet;
        if (!str.equals(XML_STYLESHEET_PROCESSING_INSTRUCTION) || SVG.getFileResolver() == null) {
            return;
        }
        if (map.get("type") == null || CSSParser.CSS_MIME_TYPE.equals(map.get("type"))) {
            if ((map.get(XML_STYLESHEET_ATTR_ALTERNATE) != null && !XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(map.get(XML_STYLESHEET_ATTR_ALTERNATE))) || (str2 = map.get("href")) == null || (strResolveCSSStyleSheet = SVG.getFileResolver().resolveCSSStyleSheet(str2)) == null) {
                return;
            }
            String str3 = map.get(XML_STYLESHEET_ATTR_MEDIA);
            parseCSSStyleSheet((str3 == null || XML_STYLESHEET_ATTR_MEDIA_ALL.equals(str3.trim())) ? strResolveCSSStyleSheet : new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("@media ").append(str3).toString()).append(" { ").toString()).append(strResolveCSSStyleSheet).toString()).append("}").toString());
        }
    }

    private static int hslToRgb(float f, float f2, float f3) {
        float f4 = (f >= 0.0f ? f % 360.0f : (f % 360.0f) + 360.0f) / 60.0f;
        float f5 = f2 / 100;
        float f6 = f3 / 100;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        } else if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f7 = f6 <= 0.5f ? (f5 + 1.0f) * f6 : (f6 + f5) - (f6 * f5);
        float f8 = (f6 * 2.0f) - f7;
        return clamp255(hueToRgb(f8, f7, f4 - 2.0f) * 256.0f) | (clamp255(hueToRgb(f8, f7, f4 + 2.0f) * 256.0f) << 16) | (clamp255(hueToRgb(f8, f7, f4) * 256.0f) << 8);
    }

    private static float hueToRgb(float f, float f2, float f3) {
        float f4 = f3 < 0.0f ? f3 + 6.0f : f3;
        if (f4 >= 6.0f) {
            f4 -= 6.0f;
        }
        if (f4 < 1) {
            return f + (f4 * (f2 - f));
        }
        if (f4 >= 3.0f) {
            return f4 < 4.0f ? f + ((4.0f - f4) * (f2 - f)) : f;
        }
        return f2;
    }

    private void image(Attributes attributes) throws SVGParseException {
        debug("<image>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Image image = new SVG.Image();
        image.document = this.svgDocument;
        image.parent = this.currentElement;
        parseAttributesCore(image, attributes);
        parseAttributesStyle(image, attributes);
        parseAttributesTransform(image, attributes);
        parseAttributesConditional(image, attributes);
        parseAttributesImage(image, attributes);
        this.currentElement.addChild(image);
        this.currentElement = image;
    }

    private void line(Attributes attributes) throws SVGParseException {
        debug("<line>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Line line = new SVG.Line();
        line.document = this.svgDocument;
        line.parent = this.currentElement;
        parseAttributesCore(line, attributes);
        parseAttributesStyle(line, attributes);
        parseAttributesTransform(line, attributes);
        parseAttributesConditional(line, attributes);
        parseAttributesLine(line, attributes);
        this.currentElement.addChild(line);
    }

    private void linearGradient(Attributes attributes) throws SVGParseException {
        debug("<linearGradient>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.SvgLinearGradient svgLinearGradient = new SVG.SvgLinearGradient();
        svgLinearGradient.document = this.svgDocument;
        svgLinearGradient.parent = this.currentElement;
        parseAttributesCore(svgLinearGradient, attributes);
        parseAttributesStyle(svgLinearGradient, attributes);
        parseAttributesGradient(svgLinearGradient, attributes);
        parseAttributesLinearGradient(svgLinearGradient, attributes);
        this.currentElement.addChild(svgLinearGradient);
        this.currentElement = svgLinearGradient;
    }

    private void marker(Attributes attributes) throws SVGParseException {
        debug("<marker>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Marker marker = new SVG.Marker();
        marker.document = this.svgDocument;
        marker.parent = this.currentElement;
        parseAttributesCore(marker, attributes);
        parseAttributesStyle(marker, attributes);
        parseAttributesConditional(marker, attributes);
        parseAttributesViewBox(marker, attributes);
        parseAttributesMarker(marker, attributes);
        this.currentElement.addChild(marker);
        this.currentElement = marker;
    }

    private void mask(Attributes attributes) throws SVGParseException {
        debug("<mask>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Mask mask = new SVG.Mask();
        mask.document = this.svgDocument;
        mask.parent = this.currentElement;
        parseAttributesCore(mask, attributes);
        parseAttributesStyle(mask, attributes);
        parseAttributesConditional(mask, attributes);
        parseAttributesMask(mask, attributes);
        this.currentElement.addChild(mask);
        this.currentElement = mask;
    }

    private void parseAttributesCircle(SVG.Circle circle, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.cx) {
                circle.f4691cx = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.cy) {
                circle.f4692cy = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.r) {
                circle.f4693r = parseLength(strTrim);
                if (circle.f4693r.isNegative()) {
                    throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                }
            } else {
                continue;
            }
        }
    }

    private void parseAttributesClipPath(SVG.ClipPath clipPath, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.clipPathUnits) {
                if ("objectBoundingBox".equals(strTrim)) {
                    clipPath.clipPathUnitsAreUser = new Boolean(false);
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute clipPathUnits");
                    }
                    clipPath.clipPathUnitsAreUser = new Boolean(true);
                }
            }
        }
    }

    private void parseAttributesConditional(SVG.SvgConditional svgConditional, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.requiredFeatures) {
                svgConditional.setRequiredFeatures(parseRequiredFeatures(strTrim));
            } else if (sVGAttrFromString == SVGAttr.requiredExtensions) {
                svgConditional.setRequiredExtensions(strTrim);
            } else if (sVGAttrFromString == SVGAttr.systemLanguage) {
                svgConditional.setSystemLanguage(parseSystemLanguage(strTrim));
            } else if (sVGAttrFromString == SVGAttr.requiredFormats) {
                svgConditional.setRequiredFormats(parseRequiredFormats(strTrim));
            } else if (sVGAttrFromString == SVGAttr.requiredFonts) {
                List<String> fontFamily = parseFontFamily(strTrim);
                svgConditional.setRequiredFonts(fontFamily != null ? new HashSet(fontFamily) : new HashSet(0));
            }
        }
    }

    private void parseAttributesCore(SVG.SvgElementBase svgElementBase, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                svgElementBase.f4719id = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    svgElementBase.spacePreserve = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new SVGParseException(new StringBuffer().append("Invalid value for \"xml:space\" attribute: ").append(strTrim).toString());
                    }
                    svgElementBase.spacePreserve = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    private void parseAttributesEllipse(SVG.Ellipse ellipse, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.cx) {
                ellipse.f4694cx = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.cy) {
                ellipse.f4695cy = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.rx) {
                ellipse.f4696rx = parseLength(strTrim);
                if (ellipse.f4696rx.isNegative()) {
                    throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.ry) {
                ellipse.f4697ry = parseLength(strTrim);
                if (ellipse.f4697ry.isNegative()) {
                    throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                }
            } else {
                continue;
            }
        }
    }

    private void parseAttributesGradient(SVG.GradientElement gradientElement, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.gradientUnits) {
                if ("objectBoundingBox".equals(strTrim)) {
                    gradientElement.gradientUnitsAreUser = new Boolean(false);
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute gradientUnits");
                    }
                    gradientElement.gradientUnitsAreUser = new Boolean(true);
                }
            } else if (sVGAttrFromString == SVGAttr.gradientTransform) {
                gradientElement.gradientTransform = parseTransformList(strTrim);
            } else if (sVGAttrFromString == SVGAttr.spreadMethod) {
                try {
                    gradientElement.spreadMethod = SVG.GradientSpread.valueOf(strTrim);
                } catch (IllegalArgumentException e) {
                    throw new SVGParseException(new StringBuffer().append(new StringBuffer().append("Invalid spreadMethod attribute. \"").append(strTrim).toString()).append("\" is not a valid value.").toString());
                }
            } else if (sVGAttrFromString == SVGAttr.href && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                gradientElement.href = strTrim;
            }
        }
    }

    private void parseAttributesImage(SVG.Image image, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.x) {
                image.f4699x = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.y) {
                image.f4700y = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.width) {
                image.width = parseLength(strTrim);
                if (image.width.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.height) {
                image.height = parseLength(strTrim);
                if (image.height.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.href) {
                if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                    image.href = strTrim;
                }
            } else if (sVGAttrFromString == SVGAttr.preserveAspectRatio) {
                parsePreserveAspectRatio(image, strTrim);
            }
        }
    }

    private void parseAttributesLine(SVG.Line line, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.x1) {
                line.f4701x1 = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.y1) {
                line.f4703y1 = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.x2) {
                line.f4702x2 = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.y2) {
                line.f4704y2 = parseLength(strTrim);
            }
        }
    }

    private void parseAttributesLinearGradient(SVG.SvgLinearGradient svgLinearGradient, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.x1) {
                svgLinearGradient.f4720x1 = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.y1) {
                svgLinearGradient.f4722y1 = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.x2) {
                svgLinearGradient.f4721x2 = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.y2) {
                svgLinearGradient.f4723y2 = parseLength(strTrim);
            }
        }
    }

    private void parseAttributesMarker(SVG.Marker marker, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.refX) {
                marker.refX = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.refY) {
                marker.refY = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.markerWidth) {
                marker.markerWidth = parseLength(strTrim);
                if (marker.markerWidth.isNegative()) {
                    throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.markerHeight) {
                marker.markerHeight = parseLength(strTrim);
                if (marker.markerHeight.isNegative()) {
                    throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.markerUnits) {
                if (VectorConstants.ATTR_STROKE_WIDTH.equals(strTrim)) {
                    marker.markerUnitsAreUser = false;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute markerUnits");
                    }
                    marker.markerUnitsAreUser = true;
                }
            } else if (sVGAttrFromString == SVGAttr.orient) {
                if ("auto".equals(strTrim)) {
                    marker.orient = new Float(Float.NaN);
                } else {
                    marker.orient = new Float(parseFloat(strTrim));
                }
            }
        }
    }

    private void parseAttributesMask(SVG.Mask mask, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.maskUnits) {
                if ("objectBoundingBox".equals(strTrim)) {
                    mask.maskUnitsAreUser = new Boolean(false);
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute maskUnits");
                    }
                    mask.maskUnitsAreUser = new Boolean(true);
                }
            } else if (sVGAttrFromString == SVGAttr.maskContentUnits) {
                if ("objectBoundingBox".equals(strTrim)) {
                    mask.maskContentUnitsAreUser = new Boolean(false);
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute maskContentUnits");
                    }
                    mask.maskContentUnitsAreUser = new Boolean(true);
                }
            } else if (sVGAttrFromString == SVGAttr.x) {
                mask.f4705x = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.y) {
                mask.f4706y = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.width) {
                mask.width = parseLength(strTrim);
                if (mask.width.isNegative()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.height) {
                mask.height = parseLength(strTrim);
                if (mask.height.isNegative()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else {
                continue;
            }
        }
    }

    private void parseAttributesPath(SVG.Path path, Attributes attributes) throws SVGParseException {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= attributes.getLength()) {
                return;
            }
            String strTrim = attributes.getValue(i2).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i2));
            if (sVGAttrFromString == SVGAttr.d) {
                path.f4707d = parsePath(strTrim);
            } else if (sVGAttrFromString == SVGAttr.pathLength) {
                path.pathLength = new Float(parseFloat(strTrim));
                if (path.pathLength.floatValue() < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            } else {
                continue;
            }
            i = i2 + 1;
        }
    }

    private void parseAttributesPattern(SVG.Pattern pattern, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.patternUnits) {
                if ("objectBoundingBox".equals(strTrim)) {
                    pattern.patternUnitsAreUser = new Boolean(false);
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute patternUnits");
                    }
                    pattern.patternUnitsAreUser = new Boolean(true);
                }
            } else if (sVGAttrFromString == SVGAttr.patternContentUnits) {
                if ("objectBoundingBox".equals(strTrim)) {
                    pattern.patternContentUnitsAreUser = new Boolean(false);
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute patternContentUnits");
                    }
                    pattern.patternContentUnitsAreUser = new Boolean(true);
                }
            } else if (sVGAttrFromString == SVGAttr.patternTransform) {
                pattern.patternTransform = parseTransformList(strTrim);
            } else if (sVGAttrFromString == SVGAttr.x) {
                pattern.f4708x = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.y) {
                pattern.f4709y = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.width) {
                pattern.width = parseLength(strTrim);
                if (pattern.width.isNegative()) {
                    throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.height) {
                pattern.height = parseLength(strTrim);
                if (pattern.height.isNegative()) {
                    throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.href && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                pattern.href = strTrim;
            }
        }
    }

    private void parseAttributesPolyLine(SVG.PolyLine polyLine, Attributes attributes, String str) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                TextScanner textScanner = new TextScanner(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                textScanner.skipWhitespace();
                while (!textScanner.empty()) {
                    float fNextFloat = textScanner.nextFloat();
                    if (Float.isNaN(fNextFloat)) {
                        throw new SVGParseException(new StringBuffer().append(new StringBuffer().append("Invalid <").append(str).toString()).append("> points attribute. Non-coordinate content found in list.").toString());
                    }
                    textScanner.skipCommaWhitespace();
                    float fNextFloat2 = textScanner.nextFloat();
                    if (Float.isNaN(fNextFloat2)) {
                        throw new SVGParseException(new StringBuffer().append(new StringBuffer().append("Invalid <").append(str).toString()).append("> points attribute. There should be an even number of coordinates.").toString());
                    }
                    textScanner.skipCommaWhitespace();
                    arrayList.add(new Float(fNextFloat));
                    arrayList.add(new Float(fNextFloat2));
                }
                polyLine.points = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    polyLine.points[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    private void parseAttributesRadialGradient(SVG.SvgRadialGradient svgRadialGradient, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.cx) {
                svgRadialGradient.f4724cx = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.cy) {
                svgRadialGradient.f4725cy = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.r) {
                svgRadialGradient.f4728r = parseLength(strTrim);
                if (svgRadialGradient.f4728r.isNegative()) {
                    throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.fx) {
                svgRadialGradient.f4726fx = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.fy) {
                svgRadialGradient.f4727fy = parseLength(strTrim);
            }
        }
    }

    private void parseAttributesRect(SVG.Rect rect, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.x) {
                rect.f4712x = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.y) {
                rect.f4713y = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.width) {
                rect.width = parseLength(strTrim);
                if (rect.width.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.height) {
                rect.height = parseLength(strTrim);
                if (rect.height.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.rx) {
                rect.f4710rx = parseLength(strTrim);
                if (rect.f4710rx.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.ry) {
                rect.f4711ry = parseLength(strTrim);
                if (rect.f4711ry.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            } else {
                continue;
            }
        }
    }

    private void parseAttributesSVG(SVG.Svg svg, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.x) {
                svg.f4717x = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.y) {
                svg.f4718y = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.width) {
                svg.width = parseLength(strTrim);
                if (svg.width.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.height) {
                svg.height = parseLength(strTrim);
                if (svg.height.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.version) {
                svg.version = strTrim;
            }
        }
    }

    private void parseAttributesStop(SVG.Stop stop, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.offset) {
                stop.offset = parseGradientOffset(strTrim);
            }
        }
    }

    private void parseAttributesStyle(SVG.SvgElementBase svgElementBase, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
                if (sVGAttrFromString == SVGAttr.style) {
                    parseStyle(svgElementBase, strTrim);
                } else if (sVGAttrFromString == SVGAttr.CLASS) {
                    svgElementBase.classNames = CSSParser.parseClassAttribute(strTrim);
                } else {
                    if (svgElementBase.baseStyle == null) {
                        svgElementBase.baseStyle = new SVG.Style();
                    }
                    processStyleProperty(svgElementBase.baseStyle, attributes.getLocalName(i), attributes.getValue(i).trim());
                }
            }
        }
    }

    private void parseAttributesTRef(SVG.TRef tRef, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.href && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                tRef.href = strTrim;
            }
        }
    }

    private void parseAttributesTextPath(SVG.TextPath textPath, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.href) {
                if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                    textPath.href = strTrim;
                }
            } else if (sVGAttrFromString == SVGAttr.startOffset) {
                textPath.startOffset = parseLength(strTrim);
            }
        }
    }

    private void parseAttributesTextPosition(SVG.TextPositionedContainer textPositionedContainer, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.x) {
                textPositionedContainer.f4731x = parseLengthList(strTrim);
            } else if (sVGAttrFromString == SVGAttr.y) {
                textPositionedContainer.f4732y = parseLengthList(strTrim);
            } else if (sVGAttrFromString == SVGAttr.dx) {
                textPositionedContainer.f4729dx = parseLengthList(strTrim);
            } else if (sVGAttrFromString == SVGAttr.dy) {
                textPositionedContainer.f4730dy = parseLengthList(strTrim);
            }
        }
    }

    private void parseAttributesTransform(SVG.HasTransform hasTransform, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                hasTransform.setTransform(parseTransformList(attributes.getValue(i)));
            }
        }
    }

    private void parseAttributesUse(SVG.Use use, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.x) {
                use.f4741x = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.y) {
                use.f4742y = parseLength(strTrim);
            } else if (sVGAttrFromString == SVGAttr.width) {
                use.width = parseLength(strTrim);
                if (use.width.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.height) {
                use.height = parseLength(strTrim);
                if (use.height.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (sVGAttrFromString == SVGAttr.href && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                use.href = strTrim;
            }
        }
    }

    private void parseAttributesViewBox(SVG.SvgViewBoxContainer svgViewBoxContainer, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i));
            if (sVGAttrFromString == SVGAttr.viewBox) {
                svgViewBoxContainer.viewBox = parseViewBox(strTrim);
            } else if (sVGAttrFromString == SVGAttr.preserveAspectRatio) {
                parsePreserveAspectRatio(svgViewBoxContainer, strTrim);
            }
        }
    }

    private void parseCSSStyleSheet(String str) {
        this.svgDocument.addCSSRules(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document).parse(str));
    }

    private static SVG.CSSClipRect parseClip(String str) {
        if (!"auto".equals(str) && str.startsWith("rect(")) {
            TextScanner textScanner = new TextScanner(str.substring(5));
            textScanner.skipWhitespace();
            SVG.Length lengthOrAuto = parseLengthOrAuto(textScanner);
            textScanner.skipCommaWhitespace();
            SVG.Length lengthOrAuto2 = parseLengthOrAuto(textScanner);
            textScanner.skipCommaWhitespace();
            SVG.Length lengthOrAuto3 = parseLengthOrAuto(textScanner);
            textScanner.skipCommaWhitespace();
            SVG.Length lengthOrAuto4 = parseLengthOrAuto(textScanner);
            textScanner.skipWhitespace();
            return (textScanner.consume(')') || textScanner.empty()) ? new SVG.CSSClipRect(lengthOrAuto, lengthOrAuto2, lengthOrAuto3, lengthOrAuto4) : (SVG.CSSClipRect) null;
        }
        return (SVG.CSSClipRect) null;
    }

    private static SVG.Colour parseColour(String str) throws SVGParseException {
        if (str.charAt(0) == '#') {
            IntegerParser hex = IntegerParser.parseHex(str, 1, str.length());
            if (hex == null) {
                throw new SVGParseException(new StringBuffer().append("Bad hex colour value: ").append(str).toString());
            }
            switch (hex.getEndPos()) {
                case 4:
                    int iValue = hex.value();
                    int i = iValue & 3840;
                    int i2 = iValue & 240;
                    int i3 = iValue & 15;
                    return new SVG.Colour((i << 12) | (-16777216) | (i << 8) | (i2 << 8) | (i2 << 4) | (i3 << 4) | i3);
                case 5:
                    int iValue2 = hex.value();
                    int i4 = 61440 & iValue2;
                    int i5 = iValue2 & 3840;
                    int i6 = iValue2 & 240;
                    int i7 = iValue2 & 15;
                    return new SVG.Colour((i4 << 8) | (i7 << 28) | (i7 << 24) | (i4 << 4) | (i5 << 4) | i5 | i6 | (i6 >> 4));
                case 6:
                case 8:
                default:
                    throw new SVGParseException(new StringBuffer().append("Bad hex colour value: ").append(str).toString());
                case 7:
                    return new SVG.Colour(hex.value() | (-16777216));
                case 9:
                    return new SVG.Colour((hex.value() >>> 8) | (hex.value() << 24));
            }
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            TextScanner textScanner = new TextScanner(str.substring(zStartsWith ? 5 : 4));
            textScanner.skipWhitespace();
            float fNextFloat = textScanner.nextFloat();
            if (!Float.isNaN(fNextFloat) && textScanner.consume('%')) {
                fNextFloat = (fNextFloat * 256) / 100;
            }
            float fCheckedNextFloat = textScanner.checkedNextFloat(fNextFloat);
            if (!Float.isNaN(fCheckedNextFloat) && textScanner.consume('%')) {
                fCheckedNextFloat = (fCheckedNextFloat * 256) / 100;
            }
            float fCheckedNextFloat2 = textScanner.checkedNextFloat(fCheckedNextFloat);
            float f = (Float.isNaN(fCheckedNextFloat2) || !textScanner.consume('%')) ? fCheckedNextFloat2 : (fCheckedNextFloat2 * 256) / 100;
            if (!zStartsWith) {
                textScanner.skipWhitespace();
                if (Float.isNaN(f) || !textScanner.consume(')')) {
                    throw new SVGParseException(new StringBuffer().append("Bad rgb() colour value: ").append(str).toString());
                }
                return new SVG.Colour((clamp255(fNextFloat) << 16) | (-16777216) | (clamp255(fCheckedNextFloat) << 8) | clamp255(f));
            }
            float fCheckedNextFloat3 = textScanner.checkedNextFloat(f);
            textScanner.skipWhitespace();
            if (Float.isNaN(fCheckedNextFloat3) || !textScanner.consume(')')) {
                throw new SVGParseException(new StringBuffer().append("Bad rgba() colour value: ").append(str).toString());
            }
            return new SVG.Colour((clamp255(fNextFloat) << 16) | (clamp255(fCheckedNextFloat3 * 256) << 24) | (clamp255(fCheckedNextFloat) << 8) | clamp255(f));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            return parseColourKeyword(lowerCase);
        }
        TextScanner textScanner2 = new TextScanner(str.substring(zStartsWith2 ? 5 : 4));
        textScanner2.skipWhitespace();
        float fNextFloat2 = textScanner2.nextFloat();
        float fCheckedNextFloat4 = textScanner2.checkedNextFloat(fNextFloat2);
        if (!Float.isNaN(fCheckedNextFloat4)) {
            textScanner2.consume('%');
        }
        float fCheckedNextFloat5 = textScanner2.checkedNextFloat(fCheckedNextFloat4);
        if (!Float.isNaN(fCheckedNextFloat5)) {
            textScanner2.consume('%');
        }
        if (!zStartsWith2) {
            textScanner2.skipWhitespace();
            if (Float.isNaN(fCheckedNextFloat5) || !textScanner2.consume(')')) {
                throw new SVGParseException(new StringBuffer().append("Bad hsl() colour value: ").append(str).toString());
            }
            return new SVG.Colour(hslToRgb(fNextFloat2, fCheckedNextFloat4, fCheckedNextFloat5) | (-16777216));
        }
        float fCheckedNextFloat6 = textScanner2.checkedNextFloat(fCheckedNextFloat5);
        textScanner2.skipWhitespace();
        if (Float.isNaN(fCheckedNextFloat6) || !textScanner2.consume(')')) {
            throw new SVGParseException(new StringBuffer().append("Bad hsla() colour value: ").append(str).toString());
        }
        return new SVG.Colour((clamp255(fCheckedNextFloat6 * 256) << 24) | hslToRgb(fNextFloat2, fCheckedNextFloat4, fCheckedNextFloat5));
    }

    private static SVG.Colour parseColourKeyword(String str) throws SVGParseException {
        Integer numM7058get = ColourKeywords.m7058get(str);
        if (numM7058get == null) {
            throw new SVGParseException(new StringBuffer().append("Invalid colour keyword: ").append(str).toString());
        }
        return new SVG.Colour(numM7058get.intValue());
    }

    private static SVG.SvgPaint parseColourSpecifer(String str) {
        if (str.equals("none")) {
            return SVG.Colour.TRANSPARENT;
        }
        if (str.equals(CURRENTCOLOR)) {
            return SVG.CurrentColor.getInstance();
        }
        try {
            return parseColour(str);
        } catch (SVGParseException e) {
            return (SVG.SvgPaint) null;
        }
    }

    private static SVG.Style.FillRule parseFillRule(String str) {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        return "evenodd".equals(str) ? SVG.Style.FillRule.EvenOdd : (SVG.Style.FillRule) null;
    }

    private static float parseFloat(String str) throws SVGParseException {
        int length = str.length();
        if (length == 0) {
            throw new SVGParseException("Invalid float value (empty string)");
        }
        return parseFloat(str, 0, length);
    }

    private static float parseFloat(String str, int i, int i2) throws SVGParseException {
        float number = new NumberParser().parseNumber(str, i, i2);
        if (Float.isNaN(number)) {
            throw new SVGParseException(new StringBuffer().append("Invalid float value: ").append(str).toString());
        }
        return number;
    }

    private static void parseFont(SVG.Style style, String str) {
        String strNextToken;
        SVG.Style.FontStyle fontStyle;
        Integer numM7060get = (Integer) null;
        SVG.Style.FontStyle fontStyle2 = (SVG.Style.FontStyle) null;
        String str2 = (String) null;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains(new StringBuffer().append(new StringBuffer().append('|').append(str).toString()).append('|').toString())) {
            TextScanner textScanner = new TextScanner(str);
            SVG.Style.FontStyle fontStyle3 = fontStyle2;
            while (true) {
                strNextToken = textScanner.nextToken('/');
                textScanner.skipWhitespace();
                if (strNextToken == null) {
                    return;
                }
                if (numM7060get != null && fontStyle3 != null) {
                    fontStyle = fontStyle3;
                    break;
                }
                if (!strNextToken.equals("normal") && (numM7060get != null || (numM7060get = FontWeightKeywords.m7060get(strNextToken)) == null)) {
                    if (fontStyle3 != null || (fontStyle3 = parseFontStyle(strNextToken)) == null) {
                        if (str2 != null || !strNextToken.equals("small-caps")) {
                            fontStyle = fontStyle3;
                            break;
                        }
                        str2 = strNextToken;
                    }
                }
            }
            SVG.Length fontSize = parseFontSize(strNextToken);
            if (textScanner.consume('/')) {
                textScanner.skipWhitespace();
                String strNextToken2 = textScanner.nextToken();
                if (strNextToken2 != null) {
                    try {
                        parseLength(strNextToken2);
                    } catch (SVGParseException e) {
                        return;
                    }
                }
                textScanner.skipWhitespace();
            }
            style.fontFamily = parseFontFamily(textScanner.restOfText());
            style.fontSize = fontSize;
            style.fontWeight = new Integer(numM7060get == null ? 400 : numM7060get.intValue());
            style.fontStyle = fontStyle == null ? SVG.Style.FontStyle.Normal : fontStyle;
            style.specifiedFlags |= 122880;
        }
    }

    private static List<String> parseFontFamily(String str) {
        List<String> arrayList = (List) null;
        TextScanner textScanner = new TextScanner(str);
        do {
            String strNextQuotedString = textScanner.nextQuotedString();
            if (strNextQuotedString == null) {
                strNextQuotedString = textScanner.nextTokenWithWhitespace(',');
            }
            if (strNextQuotedString == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(strNextQuotedString);
            textScanner.skipCommaWhitespace();
        } while (!textScanner.empty());
        return arrayList;
    }

    private static SVG.Length parseFontSize(String str) {
        try {
            SVG.Length lengthM7059get = FontSizeKeywords.m7059get(str);
            return lengthM7059get == null ? parseLength(str) : lengthM7059get;
        } catch (SVGParseException e) {
            return (SVG.Length) null;
        }
    }

    private static SVG.Style.FontStyle parseFontStyle(String str) {
        if (str.equals("italic")) {
            return SVG.Style.FontStyle.Italic;
        }
        if (str.equals("normal")) {
            return SVG.Style.FontStyle.Normal;
        }
        return str.equals("oblique") ? SVG.Style.FontStyle.Oblique : (SVG.Style.FontStyle) null;
    }

    private static Integer parseFontWeight(String str) {
        return FontWeightKeywords.m7060get(str);
    }

    private static String parseFunctionalIRI(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return (String) null;
    }

    private Float parseGradientOffset(String str) throws SVGParseException {
        boolean z;
        int i;
        if (str.length() == 0) {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        if (str.charAt(str.length() - 1) == '%') {
            i = length - 1;
            z = true;
        } else {
            z = false;
            i = length;
        }
        try {
            float f = parseFloat(str, 0, i);
            if (z) {
                f /= 100.0f;
            }
            if (f < 0) {
                f = 0;
            } else if (f > 100) {
                f = 100;
            }
            return new Float(f);
        } catch (NumberFormatException e) {
            throw new SVGParseException(new StringBuffer().append("Invalid offset value in <stop>: ").append(str).toString(), e);
        }
    }

    static SVG.Length parseLength(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        SVG.Unit unitValueOf = SVG.Unit.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            unitValueOf = SVG.Unit.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                unitValueOf = SVG.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException e) {
                throw new SVGParseException(new StringBuffer().append("Invalid length unit specifier: ").append(str).toString());
            }
        }
        try {
            return new SVG.Length(parseFloat(str, 0, length), unitValueOf);
        } catch (NumberFormatException e2) {
            throw new SVGParseException(new StringBuffer().append("Invalid length value: ").append(str).toString(), e2);
        }
    }

    private static List<SVG.Length> parseLengthList(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            float fNextFloat = textScanner.nextFloat();
            if (Float.isNaN(fNextFloat)) {
                throw new SVGParseException(new StringBuffer().append("Invalid length list value: ").append(textScanner.ahead()).toString());
            }
            SVG.Unit unitNextUnit = textScanner.nextUnit();
            if (unitNextUnit == null) {
                unitNextUnit = SVG.Unit.px;
            }
            arrayList.add(new SVG.Length(fNextFloat, unitNextUnit));
            textScanner.skipCommaWhitespace();
        }
        return arrayList;
    }

    private static SVG.Length parseLengthOrAuto(TextScanner textScanner) {
        return textScanner.consume("auto") ? new SVG.Length(0.0f) : textScanner.nextLength();
    }

    private static Float parseOpacity(String str) {
        try {
            float f = parseFloat(str);
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            return new Float(f);
        } catch (SVGParseException e) {
            return (Float) null;
        }
    }

    private static Boolean parseOverflow(String str) {
        if (str.equals("visible") || str.equals("auto")) {
            return Boolean.TRUE;
        }
        return (str.equals("hidden") || str.equals("scroll")) ? Boolean.FALSE : (Boolean) null;
    }

    private static SVG.SvgPaint parsePaintSpecifier(String str) {
        if (!str.startsWith("url(")) {
            return parseColourSpecifer(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new SVG.PaintReference(str.substring(4).trim(), (SVG.SvgPaint) null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        SVG.SvgPaint colourSpecifer = (SVG.SvgPaint) null;
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            colourSpecifer = parseColourSpecifer(strTrim2);
        }
        return new SVG.PaintReference(strTrim, colourSpecifer);
    }

    private static SVG.PathDefinition parsePath(String str) {
        int iIntValue;
        TextScanner textScanner = new TextScanner(str);
        float fCheckedNextFloat = 0.0f;
        float f = 0.0f;
        float fNextFloat = 0.0f;
        float fCheckedNextFloat2 = 0.0f;
        SVG.PathDefinition pathDefinition = new SVG.PathDefinition();
        if (!textScanner.empty() && ((iIntValue = textScanner.nextChar().intValue()) == 77 || iIntValue == 109)) {
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (true) {
                float f4 = f3;
                float f5 = f2;
                float f6 = fCheckedNextFloat2;
                float f7 = fNextFloat;
                float f8 = fCheckedNextFloat;
                textScanner.skipWhitespace();
                switch (iIntValue) {
                    case 65:
                    case 97:
                        float fNextFloat2 = textScanner.nextFloat();
                        float fCheckedNextFloat3 = textScanner.checkedNextFloat(fNextFloat2);
                        float fCheckedNextFloat4 = textScanner.checkedNextFloat(fCheckedNextFloat3);
                        Boolean boolCheckedNextFlag = textScanner.checkedNextFlag(new Float(fCheckedNextFloat4));
                        Boolean boolCheckedNextFlag2 = textScanner.checkedNextFlag(boolCheckedNextFlag);
                        float fCheckedNextFloat5 = textScanner.checkedNextFloat(boolCheckedNextFlag2);
                        float fCheckedNextFloat6 = textScanner.checkedNextFloat(fCheckedNextFloat5);
                        if (!Float.isNaN(fCheckedNextFloat6) && fNextFloat2 >= 0 && fCheckedNextFloat3 >= 0) {
                            if (iIntValue == 97) {
                                fCheckedNextFloat6 += f;
                                fCheckedNextFloat5 += f8;
                            }
                            pathDefinition.arcTo(fNextFloat2, fCheckedNextFloat3, fCheckedNextFloat4, boolCheckedNextFlag.booleanValue(), boolCheckedNextFlag2.booleanValue(), fCheckedNextFloat5, fCheckedNextFloat6);
                            fNextFloat = fCheckedNextFloat5;
                            fCheckedNextFloat2 = fCheckedNextFloat6;
                            fCheckedNextFloat = fCheckedNextFloat5;
                            f2 = f5;
                            f = fCheckedNextFloat6;
                            f3 = f4;
                        } else {
                            Log.e(f4757TAG, new StringBuffer().append(new StringBuffer().append("Bad path coords for ").append((char) iIntValue).toString()).append(" path segment").toString());
                        }
                        break;
                    case 67:
                    case 99:
                        float fNextFloat3 = textScanner.nextFloat();
                        float fCheckedNextFloat7 = textScanner.checkedNextFloat(fNextFloat3);
                        fNextFloat = textScanner.checkedNextFloat(fCheckedNextFloat7);
                        fCheckedNextFloat2 = textScanner.checkedNextFloat(fNextFloat);
                        fCheckedNextFloat = textScanner.checkedNextFloat(fCheckedNextFloat2);
                        float fCheckedNextFloat8 = textScanner.checkedNextFloat(fCheckedNextFloat);
                        if (!Float.isNaN(fCheckedNextFloat8)) {
                            if (iIntValue == 99) {
                                fCheckedNextFloat += f8;
                                fNextFloat3 += f8;
                                fCheckedNextFloat7 += f;
                                fNextFloat += f8;
                                fCheckedNextFloat2 += f;
                                fCheckedNextFloat8 += f;
                            }
                            pathDefinition.cubicTo(fNextFloat3, fCheckedNextFloat7, fNextFloat, fCheckedNextFloat2, fCheckedNextFloat, fCheckedNextFloat8);
                            f2 = f5;
                            f = fCheckedNextFloat8;
                            f3 = f4;
                        } else {
                            Log.e(f4757TAG, new StringBuffer().append(new StringBuffer().append("Bad path coords for ").append((char) iIntValue).toString()).append(" path segment").toString());
                        }
                        break;
                    case 72:
                    case 104:
                        float fNextFloat4 = textScanner.nextFloat();
                        if (!Float.isNaN(fNextFloat4)) {
                            if (iIntValue == 104) {
                                fNextFloat4 += f8;
                            }
                            pathDefinition.lineTo(fNextFloat4, f);
                            fNextFloat = fNextFloat4;
                            fCheckedNextFloat2 = f6;
                            fCheckedNextFloat = fNextFloat4;
                            f2 = f5;
                            f3 = f4;
                        } else {
                            Log.e(f4757TAG, new StringBuffer().append(new StringBuffer().append("Bad path coords for ").append((char) iIntValue).toString()).append(" path segment").toString());
                        }
                        break;
                    case 76:
                    case 108:
                        float fNextFloat5 = textScanner.nextFloat();
                        float fCheckedNextFloat9 = textScanner.checkedNextFloat(fNextFloat5);
                        if (!Float.isNaN(fCheckedNextFloat9)) {
                            if (iIntValue == 108) {
                                fCheckedNextFloat9 += f;
                                fNextFloat5 += f8;
                            }
                            pathDefinition.lineTo(fNextFloat5, fCheckedNextFloat9);
                            fNextFloat = fNextFloat5;
                            fCheckedNextFloat2 = fCheckedNextFloat9;
                            fCheckedNextFloat = fNextFloat5;
                            f2 = f5;
                            f = fCheckedNextFloat9;
                            f3 = f4;
                        } else {
                            Log.e(f4757TAG, new StringBuffer().append(new StringBuffer().append("Bad path coords for ").append((char) iIntValue).toString()).append(" path segment").toString());
                        }
                        break;
                    case 77:
                    case 109:
                        float fNextFloat6 = textScanner.nextFloat();
                        float fCheckedNextFloat10 = textScanner.checkedNextFloat(fNextFloat6);
                        if (!Float.isNaN(fCheckedNextFloat10)) {
                            if (iIntValue == 109 && !pathDefinition.isEmpty()) {
                                fCheckedNextFloat10 += f;
                                fNextFloat6 += f8;
                            }
                            pathDefinition.moveTo(fNextFloat6, fCheckedNextFloat10);
                            fNextFloat = fNextFloat6;
                            fCheckedNextFloat2 = fCheckedNextFloat10;
                            fCheckedNextFloat = fNextFloat6;
                            f2 = fCheckedNextFloat10;
                            iIntValue = iIntValue == 109 ? 108 : 76;
                            f = fCheckedNextFloat10;
                            f3 = fNextFloat6;
                        } else {
                            Log.e(f4757TAG, new StringBuffer().append(new StringBuffer().append("Bad path coords for ").append((char) iIntValue).toString()).append(" path segment").toString());
                        }
                        break;
                    case 81:
                    case 113:
                        fNextFloat = textScanner.nextFloat();
                        fCheckedNextFloat2 = textScanner.checkedNextFloat(fNextFloat);
                        float fCheckedNextFloat11 = textScanner.checkedNextFloat(fCheckedNextFloat2);
                        float fCheckedNextFloat12 = textScanner.checkedNextFloat(fCheckedNextFloat11);
                        if (!Float.isNaN(fCheckedNextFloat12)) {
                            if (iIntValue == 113) {
                                fCheckedNextFloat11 += f8;
                                fCheckedNextFloat12 += f;
                                fNextFloat += f8;
                                fCheckedNextFloat2 += f;
                            }
                            pathDefinition.quadTo(fNextFloat, fCheckedNextFloat2, fCheckedNextFloat11, fCheckedNextFloat12);
                            fCheckedNextFloat = fCheckedNextFloat11;
                            f2 = f5;
                            f = fCheckedNextFloat12;
                            f3 = f4;
                        } else {
                            Log.e(f4757TAG, new StringBuffer().append(new StringBuffer().append("Bad path coords for ").append((char) iIntValue).toString()).append(" path segment").toString());
                        }
                        break;
                    case 83:
                    case 115:
                        float f9 = 2;
                        float f10 = 2;
                        fNextFloat = textScanner.nextFloat();
                        fCheckedNextFloat2 = textScanner.checkedNextFloat(fNextFloat);
                        fCheckedNextFloat = textScanner.checkedNextFloat(fCheckedNextFloat2);
                        float fCheckedNextFloat13 = textScanner.checkedNextFloat(fCheckedNextFloat);
                        if (!Float.isNaN(fCheckedNextFloat13)) {
                            if (iIntValue == 115) {
                                fCheckedNextFloat += f8;
                                fNextFloat += f8;
                                fCheckedNextFloat2 += f;
                                fCheckedNextFloat13 += f;
                            }
                            pathDefinition.cubicTo((f9 * f8) - f7, (f10 * f) - f6, fNextFloat, fCheckedNextFloat2, fCheckedNextFloat, fCheckedNextFloat13);
                            f2 = f5;
                            f = fCheckedNextFloat13;
                            f3 = f4;
                        } else {
                            Log.e(f4757TAG, new StringBuffer().append(new StringBuffer().append("Bad path coords for ").append((char) iIntValue).toString()).append(" path segment").toString());
                        }
                        break;
                    case 84:
                    case 116:
                        fNextFloat = (2 * f8) - f7;
                        fCheckedNextFloat2 = (2 * f) - f6;
                        float fNextFloat7 = textScanner.nextFloat();
                        float fCheckedNextFloat14 = textScanner.checkedNextFloat(fNextFloat7);
                        if (!Float.isNaN(fCheckedNextFloat14)) {
                            if (iIntValue == 116) {
                                fCheckedNextFloat14 += f;
                                fNextFloat7 += f8;
                            }
                            pathDefinition.quadTo(fNextFloat, fCheckedNextFloat2, fNextFloat7, fCheckedNextFloat14);
                            fCheckedNextFloat = fNextFloat7;
                            f2 = f5;
                            f = fCheckedNextFloat14;
                            f3 = f4;
                        } else {
                            Log.e(f4757TAG, new StringBuffer().append(new StringBuffer().append("Bad path coords for ").append((char) iIntValue).toString()).append(" path segment").toString());
                        }
                        break;
                    case 86:
                    case 118:
                        float fNextFloat8 = textScanner.nextFloat();
                        if (!Float.isNaN(fNextFloat8)) {
                            if (iIntValue == 118) {
                                fNextFloat8 += f;
                            }
                            pathDefinition.lineTo(f8, fNextFloat8);
                            fNextFloat = f7;
                            fCheckedNextFloat2 = fNextFloat8;
                            fCheckedNextFloat = f8;
                            f2 = f5;
                            f = fNextFloat8;
                            f3 = f4;
                        } else {
                            Log.e(f4757TAG, new StringBuffer().append(new StringBuffer().append("Bad path coords for ").append((char) iIntValue).toString()).append(" path segment").toString());
                        }
                        break;
                    case 90:
                    case 122:
                        pathDefinition.close();
                        fNextFloat = f4;
                        fCheckedNextFloat2 = f5;
                        fCheckedNextFloat = f4;
                        f2 = f5;
                        f = f5;
                        f3 = f4;
                        break;
                    default:
                        break;
                }
                textScanner.skipCommaWhitespace();
                if (!textScanner.empty()) {
                    if (textScanner.hasLetter()) {
                        iIntValue = textScanner.nextChar().intValue();
                    }
                }
            }
        }
        return pathDefinition;
    }

    static PreserveAspectRatio parsePreserveAspectRatio(String str) throws SVGParseException {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        String strNextToken = textScanner.nextToken();
        if ("defer".equals(strNextToken)) {
            textScanner.skipWhitespace();
            strNextToken = textScanner.nextToken();
        }
        PreserveAspectRatio.Alignment alignmentM7057get = AspectRatioKeywords.m7057get(strNextToken);
        PreserveAspectRatio.Scale scale = (PreserveAspectRatio.Scale) null;
        textScanner.skipWhitespace();
        if (!textScanner.empty()) {
            String strNextToken2 = textScanner.nextToken();
            if (strNextToken2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.meet;
            } else {
                if (!strNextToken2.equals("slice")) {
                    throw new SVGParseException(new StringBuffer().append("Invalid preserveAspectRatio definition: ").append(str).toString());
                }
                scale = PreserveAspectRatio.Scale.slice;
            }
        }
        return new PreserveAspectRatio(alignmentM7057get, scale);
    }

    private static void parsePreserveAspectRatio(SVG.SvgPreserveAspectRatioContainer svgPreserveAspectRatioContainer, String str) throws SVGParseException {
        svgPreserveAspectRatioContainer.preserveAspectRatio = parsePreserveAspectRatio(str);
    }

    public Map<String, String> parseProcessingInstructionAttributes(TextScanner textScanner) {
        HashMap map = new HashMap();
        textScanner.skipWhitespace();
        String strNextToken = textScanner.nextToken(SignatureVisitor.INSTANCEOF);
        while (strNextToken != null) {
            textScanner.consume(SignatureVisitor.INSTANCEOF);
            map.put(strNextToken, textScanner.nextQuotedString());
            textScanner.skipWhitespace();
            strNextToken = textScanner.nextToken(SignatureVisitor.INSTANCEOF);
        }
        return map;
    }

    private static SVG.Style.RenderQuality parseRenderQuality(String str) {
        if (str.equals("auto")) {
            return SVG.Style.RenderQuality.auto;
        }
        if (str.equals("optimizeQuality")) {
            return SVG.Style.RenderQuality.optimizeQuality;
        }
        return str.equals("optimizeSpeed") ? SVG.Style.RenderQuality.optimizeSpeed : (SVG.Style.RenderQuality) null;
    }

    private static Set<String> parseRequiredFeatures(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String strNextToken = textScanner.nextToken();
            if (strNextToken.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strNextToken.substring(FEATURE_STRING_PREFIX.length()));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static Set<String> parseRequiredFormats(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            hashSet.add(textScanner.nextToken());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static SVG.Length[] parseStrokeDashArray(String str) {
        SVG.Length lengthNextLength;
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (!textScanner.empty() && (lengthNextLength = textScanner.nextLength()) != null && !lengthNextLength.isNegative()) {
            float fFloatValue = lengthNextLength.floatValue();
            ArrayList arrayList = new ArrayList();
            arrayList.add(lengthNextLength);
            while (!textScanner.empty()) {
                textScanner.skipCommaWhitespace();
                SVG.Length lengthNextLength2 = textScanner.nextLength();
                if (lengthNextLength2 != null && !lengthNextLength2.isNegative()) {
                    arrayList.add(lengthNextLength2);
                    fFloatValue += lengthNextLength2.floatValue();
                }
                return (SVG.Length[]) null;
            }
            return fFloatValue == 0.0f ? (SVG.Length[]) null : (SVG.Length[]) arrayList.toArray(new SVG.Length[arrayList.size()]);
        }
        return (SVG.Length[]) null;
    }

    private static SVG.Style.LineCap parseStrokeLineCap(String str) {
        if ("butt".equals(str)) {
            return SVG.Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineCap.Round;
        }
        return "square".equals(str) ? SVG.Style.LineCap.Square : (SVG.Style.LineCap) null;
    }

    private static SVG.Style.LineJoin parseStrokeLineJoin(String str) {
        if ("miter".equals(str)) {
            return SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineJoin.Round;
        }
        return "bevel".equals(str) ? SVG.Style.LineJoin.Bevel : (SVG.Style.LineJoin) null;
    }

    private static void parseStyle(SVG.SvgElementBase svgElementBase, String str) {
        TextScanner textScanner = new TextScanner(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strNextToken = textScanner.nextToken(':');
            textScanner.skipWhitespace();
            if (!textScanner.consume(':')) {
                return;
            }
            textScanner.skipWhitespace();
            String strNextTokenWithWhitespace = textScanner.nextTokenWithWhitespace(';');
            if (strNextTokenWithWhitespace == null) {
                return;
            }
            textScanner.skipWhitespace();
            if (textScanner.empty() || textScanner.consume(';')) {
                if (svgElementBase.style == null) {
                    svgElementBase.style = new SVG.Style();
                }
                processStyleProperty(svgElementBase.style, strNextToken, strNextTokenWithWhitespace);
                textScanner.skipWhitespace();
            }
        }
    }

    private static Set<String> parseSystemLanguage(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String strNextToken = textScanner.nextToken();
            int iIndexOf = strNextToken.indexOf(45);
            if (iIndexOf != -1) {
                strNextToken = strNextToken.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strNextToken, "", "").getLanguage());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static SVG.Style.TextAnchor parseTextAnchor(String str) {
        if (str.equals("start")) {
            return SVG.Style.TextAnchor.Start;
        }
        if (str.equals("middle")) {
            return SVG.Style.TextAnchor.Middle;
        }
        return str.equals("end") ? SVG.Style.TextAnchor.End : (SVG.Style.TextAnchor) null;
    }

    private static SVG.Style.TextDecoration parseTextDecoration(String str) {
        if (str.equals("none")) {
            return SVG.Style.TextDecoration.None;
        }
        if (str.equals("underline")) {
            return SVG.Style.TextDecoration.Underline;
        }
        if (str.equals("overline")) {
            return SVG.Style.TextDecoration.Overline;
        }
        if (str.equals("line-through")) {
            return SVG.Style.TextDecoration.LineThrough;
        }
        return str.equals("blink") ? SVG.Style.TextDecoration.Blink : (SVG.Style.TextDecoration) null;
    }

    private static SVG.Style.TextDirection parseTextDirection(String str) {
        if (str.equals("ltr")) {
            return SVG.Style.TextDirection.LTR;
        }
        return str.equals("rtl") ? SVG.Style.TextDirection.RTL : (SVG.Style.TextDirection) null;
    }

    private Matrix parseTransformList(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            String strNextFunction = textScanner.nextFunction();
            if (strNextFunction != null) {
                if (strNextFunction.equals("matrix")) {
                    textScanner.skipWhitespace();
                    float fNextFloat = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat2 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat3 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat4 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat5 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float fNextFloat6 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat6) || !textScanner.consume(')')) {
                        throw new SVGParseException(new StringBuffer().append("Invalid transform list: ").append(str).toString());
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fNextFloat, fNextFloat3, fNextFloat5, fNextFloat2, fNextFloat4, fNextFloat6, 0, 0, 1});
                    matrix.preConcat(matrix2);
                } else if (strNextFunction.equals("translate")) {
                    textScanner.skipWhitespace();
                    float fNextFloat7 = textScanner.nextFloat();
                    float fPossibleNextFloat = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat7) || !textScanner.consume(')')) {
                        throw new SVGParseException(new StringBuffer().append("Invalid transform list: ").append(str).toString());
                    }
                    if (Float.isNaN(fPossibleNextFloat)) {
                        matrix.preTranslate(fNextFloat7, 0.0f);
                    } else {
                        matrix.preTranslate(fNextFloat7, fPossibleNextFloat);
                    }
                } else if (strNextFunction.equals("scale")) {
                    textScanner.skipWhitespace();
                    float fNextFloat8 = textScanner.nextFloat();
                    float fPossibleNextFloat2 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat8) || !textScanner.consume(')')) {
                        throw new SVGParseException(new StringBuffer().append("Invalid transform list: ").append(str).toString());
                    }
                    if (Float.isNaN(fPossibleNextFloat2)) {
                        matrix.preScale(fNextFloat8, fNextFloat8);
                    } else {
                        matrix.preScale(fNextFloat8, fPossibleNextFloat2);
                    }
                } else if (strNextFunction.equals("rotate")) {
                    textScanner.skipWhitespace();
                    float fNextFloat9 = textScanner.nextFloat();
                    float fPossibleNextFloat3 = textScanner.possibleNextFloat();
                    float fPossibleNextFloat4 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat9) || !textScanner.consume(')')) {
                        throw new SVGParseException(new StringBuffer().append("Invalid transform list: ").append(str).toString());
                    }
                    if (Float.isNaN(fPossibleNextFloat3)) {
                        matrix.preRotate(fNextFloat9);
                    } else {
                        if (Float.isNaN(fPossibleNextFloat4)) {
                            throw new SVGParseException(new StringBuffer().append("Invalid transform list: ").append(str).toString());
                        }
                        matrix.preRotate(fNextFloat9, fPossibleNextFloat3, fPossibleNextFloat4);
                    }
                } else if (strNextFunction.equals("skewX")) {
                    textScanner.skipWhitespace();
                    float fNextFloat10 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat10) || !textScanner.consume(')')) {
                        throw new SVGParseException(new StringBuffer().append("Invalid transform list: ").append(str).toString());
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fNextFloat10)), 0.0f);
                } else {
                    if (!strNextFunction.equals("skewY")) {
                        throw new SVGParseException(new StringBuffer().append(new StringBuffer().append("Invalid transform list fn: ").append(strNextFunction).toString()).append(")").toString());
                    }
                    textScanner.skipWhitespace();
                    float fNextFloat11 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(fNextFloat11) || !textScanner.consume(')')) {
                        throw new SVGParseException(new StringBuffer().append("Invalid transform list: ").append(str).toString());
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fNextFloat11)));
                }
                if (textScanner.empty()) {
                    break;
                }
                textScanner.skipCommaWhitespace();
            } else {
                throw new SVGParseException(new StringBuffer().append("Bad transform function encountered in transform list: ").append(str).toString());
            }
        }
        return matrix;
    }

    private void parseUsingSAX(InputStream inputStream) throws SVGParseException {
        Log.d(f4757TAG, "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            SAXHandler sAXHandler = new SAXHandler(this);
            xMLReader.setContentHandler(sAXHandler);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", sAXHandler);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new SVGParseException("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new SVGParseException("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new SVGParseException("SVG parse error", e3);
        }
    }

    private void parseUsingXmlPullParser(InputStream inputStream, boolean z) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                XPPAttributesWrapper xPPAttributesWrapper = new XPPAttributesWrapper(this, xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, (String) null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    switch (eventType) {
                        case 0:
                            startDocument();
                            break;
                        case 2:
                            String name = xmlPullParserNewPullParser.getName();
                            if (xmlPullParserNewPullParser.getPrefix() != null) {
                                name = new StringBuffer().append(new StringBuffer().append(xmlPullParserNewPullParser.getPrefix()).append(':').toString()).append(name).toString();
                            }
                            startElement(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, xPPAttributesWrapper);
                            break;
                        case 3:
                            String name2 = xmlPullParserNewPullParser.getName();
                            if (xmlPullParserNewPullParser.getPrefix() != null) {
                                name2 = new StringBuffer().append(new StringBuffer().append(xmlPullParserNewPullParser.getPrefix()).append(':').toString()).append(name2).toString();
                            }
                            endElement(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                            break;
                        case 4:
                            int[] iArr = new int[2];
                            text(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                            break;
                        case 5:
                            text(xmlPullParserNewPullParser.getText());
                            break;
                        case 8:
                            Log.d(f4757TAG, new StringBuffer().append("PROC INSTR: ").append(xmlPullParserNewPullParser.getText()).toString());
                            TextScanner textScanner = new TextScanner(xmlPullParserNewPullParser.getText());
                            handleProcessingInstruction(textScanner.nextToken(), parseProcessingInstructionAttributes(textScanner));
                            break;
                        case 10:
                            if (!z || this.svgDocument.getRootElement() != null || !xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                                break;
                            } else {
                                try {
                                    Log.d(f4757TAG, "Switching to SAX parser to process entities");
                                    inputStream.reset();
                                    parseUsingSAX(inputStream);
                                    return;
                                } catch (IOException e) {
                                    Log.w(f4757TAG, "Detected internal entity definitions, but could not parse them.");
                                    return;
                                }
                            }
                            break;
                    }
                }
                endDocument();
            } catch (IOException e2) {
                throw new SVGParseException("Stream error", e2);
            }
        } catch (XmlPullParserException e3) {
            throw new SVGParseException("XML parser problem", e3);
        }
    }

    private static SVG.Style.VectorEffect parseVectorEffect(String str) {
        if (str.equals("none")) {
            return SVG.Style.VectorEffect.None;
        }
        return str.equals("non-scaling-stroke") ? SVG.Style.VectorEffect.NonScalingStroke : (SVG.Style.VectorEffect) null;
    }

    private static SVG.Box parseViewBox(String str) throws SVGParseException {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        float fNextFloat = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float fNextFloat2 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float fNextFloat3 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float fNextFloat4 = textScanner.nextFloat();
        if (Float.isNaN(fNextFloat) || Float.isNaN(fNextFloat2) || Float.isNaN(fNextFloat3) || Float.isNaN(fNextFloat4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (fNextFloat3 < 0) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (fNextFloat4 < 0) {
            throw new SVGParseException("Invalid viewBox. height cannot be negative");
        }
        return new SVG.Box(fNextFloat, fNextFloat2, fNextFloat3, fNextFloat4);
    }

    private void path(Attributes attributes) throws SVGParseException {
        debug("<path>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Path path = new SVG.Path();
        path.document = this.svgDocument;
        path.parent = this.currentElement;
        parseAttributesCore(path, attributes);
        parseAttributesStyle(path, attributes);
        parseAttributesTransform(path, attributes);
        parseAttributesConditional(path, attributes);
        parseAttributesPath(path, attributes);
        this.currentElement.addChild(path);
    }

    private void pattern(Attributes attributes) throws SVGParseException {
        debug("<pattern>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Pattern pattern = new SVG.Pattern();
        pattern.document = this.svgDocument;
        pattern.parent = this.currentElement;
        parseAttributesCore(pattern, attributes);
        parseAttributesStyle(pattern, attributes);
        parseAttributesConditional(pattern, attributes);
        parseAttributesViewBox(pattern, attributes);
        parseAttributesPattern(pattern, attributes);
        this.currentElement.addChild(pattern);
        this.currentElement = pattern;
    }

    private void polygon(Attributes attributes) throws SVGParseException {
        debug("<polygon>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.PolyLine polygon = new SVG.Polygon();
        polygon.document = this.svgDocument;
        polygon.parent = this.currentElement;
        parseAttributesCore(polygon, attributes);
        parseAttributesStyle(polygon, attributes);
        parseAttributesTransform(polygon, attributes);
        parseAttributesConditional(polygon, attributes);
        parseAttributesPolyLine(polygon, attributes, "polygon");
        this.currentElement.addChild(polygon);
    }

    private void polyline(Attributes attributes) throws SVGParseException {
        debug("<polyline>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.PolyLine polyLine = new SVG.PolyLine();
        polyLine.document = this.svgDocument;
        polyLine.parent = this.currentElement;
        parseAttributesCore(polyLine, attributes);
        parseAttributesStyle(polyLine, attributes);
        parseAttributesTransform(polyLine, attributes);
        parseAttributesConditional(polyLine, attributes);
        parseAttributesPolyLine(polyLine, attributes, "polyline");
        this.currentElement.addChild(polyLine);
    }

    static void processStyleProperty(SVG.Style style, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        SVGAttr sVGAttrFromString = SVGAttr.fromString(str);
        if (sVGAttrFromString == SVGAttr.fill) {
            style.fill = parsePaintSpecifier(str2);
            if (style.fill != null) {
                style.specifiedFlags |= 1;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.fill_rule) {
            style.fillRule = parseFillRule(str2);
            if (style.fillRule != null) {
                style.specifiedFlags |= 2;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.fill_opacity) {
            style.fillOpacity = parseOpacity(str2);
            if (style.fillOpacity != null) {
                style.specifiedFlags |= 4;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.stroke) {
            style.stroke = parsePaintSpecifier(str2);
            if (style.stroke != null) {
                style.specifiedFlags |= 8;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.stroke_opacity) {
            style.strokeOpacity = parseOpacity(str2);
            if (style.strokeOpacity != null) {
                style.specifiedFlags |= 16;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.stroke_width) {
            try {
                style.strokeWidth = parseLength(str2);
                style.specifiedFlags |= 32;
                return;
            } catch (SVGParseException e) {
                return;
            }
        }
        if (sVGAttrFromString == SVGAttr.stroke_linecap) {
            style.strokeLineCap = parseStrokeLineCap(str2);
            if (style.strokeLineCap != null) {
                style.specifiedFlags |= 64;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.stroke_linejoin) {
            style.strokeLineJoin = parseStrokeLineJoin(str2);
            if (style.strokeLineJoin != null) {
                style.specifiedFlags |= 128;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.stroke_miterlimit) {
            try {
                style.strokeMiterLimit = new Float(parseFloat(str2));
                style.specifiedFlags |= 256;
                return;
            } catch (SVGParseException e2) {
                return;
            }
        }
        if (sVGAttrFromString == SVGAttr.stroke_dasharray) {
            if (NONE.equals(str2)) {
                style.strokeDashArray = (SVG.Length[]) null;
                style.specifiedFlags |= 512;
                return;
            } else {
                style.strokeDashArray = parseStrokeDashArray(str2);
                if (style.strokeDashArray != null) {
                    style.specifiedFlags |= 512;
                    return;
                }
                return;
            }
        }
        if (sVGAttrFromString == SVGAttr.stroke_dashoffset) {
            try {
                style.strokeDashOffset = parseLength(str2);
                style.specifiedFlags |= 1024;
                return;
            } catch (SVGParseException e3) {
                return;
            }
        }
        if (sVGAttrFromString == SVGAttr.opacity) {
            style.opacity = parseOpacity(str2);
            style.specifiedFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            return;
        }
        if (sVGAttrFromString == SVGAttr.color) {
            try {
                style.color = parseColour(str2);
                style.specifiedFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                return;
            } catch (SVGParseException e4) {
                return;
            }
        }
        if (sVGAttrFromString == SVGAttr.font) {
            parseFont(style, str2);
            return;
        }
        if (sVGAttrFromString == SVGAttr.font_family) {
            style.fontFamily = parseFontFamily(str2);
            if (style.fontFamily != null) {
                style.specifiedFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.font_size) {
            style.fontSize = parseFontSize(str2);
            if (style.fontSize != null) {
                style.specifiedFlags |= PlaybackStateCompat.ACTION_PREPARE;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.font_weight) {
            style.fontWeight = parseFontWeight(str2);
            if (style.fontWeight != null) {
                style.specifiedFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.font_style) {
            style.fontStyle = parseFontStyle(str2);
            if (style.fontStyle != null) {
                style.specifiedFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.text_decoration) {
            style.textDecoration = parseTextDecoration(str2);
            if (style.textDecoration != null) {
                style.specifiedFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.direction) {
            style.direction = parseTextDirection(str2);
            if (style.direction != null) {
                style.specifiedFlags |= 68719476736L;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.text_anchor) {
            style.textAnchor = parseTextAnchor(str2);
            if (style.textAnchor != null) {
                style.specifiedFlags |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.overflow) {
            style.overflow = parseOverflow(str2);
            if (style.overflow != null) {
                style.specifiedFlags |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.marker) {
            style.markerStart = parseFunctionalIRI(str2, str);
            style.markerMid = style.markerStart;
            style.markerEnd = style.markerStart;
            style.specifiedFlags |= 14680064;
            return;
        }
        if (sVGAttrFromString == SVGAttr.marker_start) {
            style.markerStart = parseFunctionalIRI(str2, str);
            style.specifiedFlags |= 2097152;
            return;
        }
        if (sVGAttrFromString == SVGAttr.marker_mid) {
            style.markerMid = parseFunctionalIRI(str2, str);
            style.specifiedFlags |= 4194304;
            return;
        }
        if (sVGAttrFromString == SVGAttr.marker_end) {
            style.markerEnd = parseFunctionalIRI(str2, str);
            style.specifiedFlags |= 8388608;
            return;
        }
        if (sVGAttrFromString == SVGAttr.display) {
            if (str2.indexOf(124) >= 0 || !VALID_DISPLAY_VALUES.contains(new StringBuffer().append(new StringBuffer().append('|').append(str2).toString()).append('|').toString())) {
                return;
            }
            style.display = new Boolean(!str2.equals("none"));
            style.specifiedFlags |= 16777216;
            return;
        }
        if (sVGAttrFromString == SVGAttr.visibility) {
            if (str2.indexOf(124) >= 0 || !VALID_VISIBILITY_VALUES.contains(new StringBuffer().append(new StringBuffer().append('|').append(str2).toString()).append('|').toString())) {
                return;
            }
            style.visibility = new Boolean(str2.equals("visible"));
            style.specifiedFlags |= 33554432;
            return;
        }
        if (sVGAttrFromString == SVGAttr.stop_color) {
            if (str2.equals(CURRENTCOLOR)) {
                style.stopColor = SVG.CurrentColor.getInstance();
            } else {
                try {
                    style.stopColor = parseColour(str2);
                } catch (SVGParseException e5) {
                    Log.w(f4757TAG, e5.getMessage());
                    return;
                }
            }
            style.specifiedFlags |= 67108864;
            return;
        }
        if (sVGAttrFromString == SVGAttr.stop_opacity) {
            style.stopOpacity = parseOpacity(str2);
            style.specifiedFlags |= 134217728;
            return;
        }
        if (sVGAttrFromString == SVGAttr.clip) {
            style.clip = parseClip(str2);
            if (style.clip != null) {
                style.specifiedFlags |= 1048576;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.clip_path) {
            style.clipPath = parseFunctionalIRI(str2, str);
            style.specifiedFlags |= 268435456;
            return;
        }
        if (sVGAttrFromString == SVGAttr.clip_rule) {
            style.clipRule = parseFillRule(str2);
            style.specifiedFlags |= 536870912;
            return;
        }
        if (sVGAttrFromString == SVGAttr.mask) {
            style.mask = parseFunctionalIRI(str2, str);
            style.specifiedFlags |= FileUtils.ONE_GB;
            return;
        }
        if (sVGAttrFromString == SVGAttr.solid_color) {
            if (str2.equals(CURRENTCOLOR)) {
                style.solidColor = SVG.CurrentColor.getInstance();
            } else {
                try {
                    style.solidColor = parseColour(str2);
                } catch (SVGParseException e6) {
                    Log.w(f4757TAG, e6.getMessage());
                    return;
                }
            }
            style.specifiedFlags |= 2147483648L;
            return;
        }
        if (sVGAttrFromString == SVGAttr.solid_opacity) {
            style.solidOpacity = parseOpacity(str2);
            style.specifiedFlags |= 4294967296L;
            return;
        }
        if (sVGAttrFromString == SVGAttr.viewport_fill) {
            if (str2.equals(CURRENTCOLOR)) {
                style.viewportFill = SVG.CurrentColor.getInstance();
            } else {
                try {
                    style.viewportFill = parseColour(str2);
                } catch (SVGParseException e7) {
                    Log.w(f4757TAG, e7.getMessage());
                    return;
                }
            }
            style.specifiedFlags |= 8589934592L;
            return;
        }
        if (sVGAttrFromString == SVGAttr.viewport_fill_opacity) {
            style.viewportFillOpacity = parseOpacity(str2);
            style.specifiedFlags |= 17179869184L;
            return;
        }
        if (sVGAttrFromString == SVGAttr.vector_effect) {
            style.vectorEffect = parseVectorEffect(str2);
            if (style.vectorEffect != null) {
                style.specifiedFlags |= 34359738368L;
                return;
            }
            return;
        }
        if (sVGAttrFromString == SVGAttr.image_rendering) {
            style.imageRendering = parseRenderQuality(str2);
            if (style.imageRendering != null) {
                style.specifiedFlags |= 137438953472L;
            }
        }
    }

    private void radialGradient(Attributes attributes) throws SVGParseException {
        debug("<radialGradient>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.SvgRadialGradient svgRadialGradient = new SVG.SvgRadialGradient();
        svgRadialGradient.document = this.svgDocument;
        svgRadialGradient.parent = this.currentElement;
        parseAttributesCore(svgRadialGradient, attributes);
        parseAttributesStyle(svgRadialGradient, attributes);
        parseAttributesGradient(svgRadialGradient, attributes);
        parseAttributesRadialGradient(svgRadialGradient, attributes);
        this.currentElement.addChild(svgRadialGradient);
        this.currentElement = svgRadialGradient;
    }

    private void rect(Attributes attributes) throws SVGParseException {
        debug("<rect>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Rect rect = new SVG.Rect();
        rect.document = this.svgDocument;
        rect.parent = this.currentElement;
        parseAttributesCore(rect, attributes);
        parseAttributesStyle(rect, attributes);
        parseAttributesTransform(rect, attributes);
        parseAttributesConditional(rect, attributes);
        parseAttributesRect(rect, attributes);
        this.currentElement.addChild(rect);
    }

    private void solidColor(Attributes attributes) throws SVGParseException {
        debug("<solidColor>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.SolidColor solidColor = new SVG.SolidColor();
        solidColor.document = this.svgDocument;
        solidColor.parent = this.currentElement;
        parseAttributesCore(solidColor, attributes);
        parseAttributesStyle(solidColor, attributes);
        this.currentElement.addChild(solidColor);
        this.currentElement = solidColor;
    }

    public void startDocument() {
        this.svgDocument = new SVG();
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.ignoring) {
            this.ignoreDepth++;
            return;
        }
        if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() > 0) {
                str3 = str2;
            }
            SVGElem sVGElemFromString = SVGElem.fromString(str3);
            if (sVGElemFromString == SVGElem.svg) {
                m7055svg(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.g || sVGElemFromString == SVGElem.a) {
                m7054g(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.defs) {
                defs(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.use) {
                m7056use(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.path) {
                path(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.rect) {
                rect(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.circle) {
                circle(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.ellipse) {
                ellipse(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.line) {
                line(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.polyline) {
                polyline(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.polygon) {
                polygon(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.text) {
                text(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.tspan) {
                tspan(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.tref) {
                tref(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.SWITCH) {
                zwitch(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.symbol) {
                symbol(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.marker) {
                marker(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.linearGradient) {
                linearGradient(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.radialGradient) {
                radialGradient(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.stop) {
                stop(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.title || sVGElemFromString == SVGElem.desc) {
                this.inMetadataElement = true;
                this.metadataTag = sVGElemFromString;
                return;
            }
            if (sVGElemFromString == SVGElem.clipPath) {
                clipPath(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.textPath) {
                textPath(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.pattern) {
                pattern(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.image) {
                image(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.view) {
                view(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.mask) {
                mask(attributes);
                return;
            }
            if (sVGElemFromString == SVGElem.style) {
                style(attributes);
            } else if (sVGElemFromString == SVGElem.solidColor) {
                solidColor(attributes);
            } else {
                this.ignoring = true;
                this.ignoreDepth = 1;
            }
        }
    }

    private void stop(Attributes attributes) throws SVGParseException {
        debug("<stop>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(this.currentElement instanceof SVG.GradientElement)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        SVG.Stop stop = new SVG.Stop();
        stop.document = this.svgDocument;
        stop.parent = this.currentElement;
        parseAttributesCore(stop, attributes);
        parseAttributesStyle(stop, attributes);
        parseAttributesStop(stop, attributes);
        this.currentElement.addChild(stop);
        this.currentElement = stop;
    }

    private void style(Attributes attributes) throws SVGParseException {
        int i = 0;
        debug("<style>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        while (true) {
            int i2 = i;
            if (i2 >= attributes.getLength()) {
                break;
            }
            String strTrim = attributes.getValue(i2).trim();
            SVGAttr sVGAttrFromString = SVGAttr.fromString(attributes.getLocalName(i2));
            if (sVGAttrFromString == SVGAttr.type) {
                zEquals = strTrim.equals("text/css");
            } else if (sVGAttrFromString == SVGAttr.media) {
                str = strTrim;
            }
            i = i2 + 1;
        }
        if (zEquals && CSSParser.mediaMatches(str, CSSParser.MediaType.screen)) {
            this.inStyleElement = true;
        } else {
            this.ignoring = true;
            this.ignoreDepth = 1;
        }
    }

    private void m7055svg(Attributes attributes) throws SVGParseException {
        debug("<svg>", new Object[0]);
        SVG.Svg svg = new SVG.Svg();
        svg.document = this.svgDocument;
        svg.parent = this.currentElement;
        parseAttributesCore(svg, attributes);
        parseAttributesStyle(svg, attributes);
        parseAttributesConditional(svg, attributes);
        parseAttributesViewBox(svg, attributes);
        parseAttributesSVG(svg, attributes);
        if (this.currentElement == null) {
            this.svgDocument.setRootElement(svg);
        } else {
            this.currentElement.addChild(svg);
        }
        this.currentElement = svg;
    }

    private void symbol(Attributes attributes) throws SVGParseException {
        debug("<symbol>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.SvgViewBoxContainer symbol = new SVG.Symbol();
        symbol.document = this.svgDocument;
        symbol.parent = this.currentElement;
        parseAttributesCore(symbol, attributes);
        parseAttributesStyle(symbol, attributes);
        parseAttributesConditional(symbol, attributes);
        parseAttributesViewBox(symbol, attributes);
        this.currentElement.addChild(symbol);
        this.currentElement = symbol;
    }

    public void text(String str) throws SVGParseException {
        if (this.ignoring) {
            return;
        }
        if (this.inMetadataElement) {
            if (this.metadataElementContents == null) {
                this.metadataElementContents = new StringBuilder(str.length());
            }
            this.metadataElementContents.append(str);
        } else if (this.inStyleElement) {
            if (this.styleElementContents == null) {
                this.styleElementContents = new StringBuilder(str.length());
            }
            this.styleElementContents.append(str);
        } else if (this.currentElement instanceof SVG.TextContainer) {
            appendToTextContainer(str);
        }
    }

    private void text(Attributes attributes) throws SVGParseException {
        debug("<text>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Text text = new SVG.Text();
        text.document = this.svgDocument;
        text.parent = this.currentElement;
        parseAttributesCore(text, attributes);
        parseAttributesStyle(text, attributes);
        parseAttributesTransform(text, attributes);
        parseAttributesConditional(text, attributes);
        parseAttributesTextPosition(text, attributes);
        this.currentElement.addChild(text);
        this.currentElement = text;
    }

    private void text(char[] cArr, int i, int i2) throws SVGParseException {
        if (this.ignoring) {
            return;
        }
        if (this.inMetadataElement) {
            if (this.metadataElementContents == null) {
                this.metadataElementContents = new StringBuilder(i2);
            }
            this.metadataElementContents.append(cArr, i, i2);
        } else if (this.inStyleElement) {
            if (this.styleElementContents == null) {
                this.styleElementContents = new StringBuilder(i2);
            }
            this.styleElementContents.append(cArr, i, i2);
        } else if (this.currentElement instanceof SVG.TextContainer) {
            appendToTextContainer(new String(cArr, i, i2));
        }
    }

    private void textPath(Attributes attributes) throws SVGParseException {
        debug("<textPath>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.TextPath textPath = new SVG.TextPath();
        textPath.document = this.svgDocument;
        textPath.parent = this.currentElement;
        parseAttributesCore(textPath, attributes);
        parseAttributesStyle(textPath, attributes);
        parseAttributesConditional(textPath, attributes);
        parseAttributesTextPath(textPath, attributes);
        this.currentElement.addChild(textPath);
        this.currentElement = textPath;
        if (textPath.parent instanceof SVG.TextRoot) {
            textPath.setTextRoot((SVG.TextRoot) textPath.parent);
        } else {
            textPath.setTextRoot(((SVG.TextChild) textPath.parent).getTextRoot());
        }
    }

    private void tref(Attributes attributes) throws SVGParseException {
        debug("<tref>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(this.currentElement instanceof SVG.TextContainer)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        SVG.TRef tRef = new SVG.TRef();
        tRef.document = this.svgDocument;
        tRef.parent = this.currentElement;
        parseAttributesCore(tRef, attributes);
        parseAttributesStyle(tRef, attributes);
        parseAttributesConditional(tRef, attributes);
        parseAttributesTRef(tRef, attributes);
        this.currentElement.addChild(tRef);
        if (tRef.parent instanceof SVG.TextRoot) {
            tRef.setTextRoot((SVG.TextRoot) tRef.parent);
        } else {
            tRef.setTextRoot(((SVG.TextChild) tRef.parent).getTextRoot());
        }
    }

    private void tspan(Attributes attributes) throws SVGParseException {
        debug("<tspan>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(this.currentElement instanceof SVG.TextContainer)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        SVG.TSpan tSpan = new SVG.TSpan();
        tSpan.document = this.svgDocument;
        tSpan.parent = this.currentElement;
        parseAttributesCore(tSpan, attributes);
        parseAttributesStyle(tSpan, attributes);
        parseAttributesConditional(tSpan, attributes);
        parseAttributesTextPosition(tSpan, attributes);
        this.currentElement.addChild(tSpan);
        this.currentElement = tSpan;
        if (tSpan.parent instanceof SVG.TextRoot) {
            tSpan.setTextRoot((SVG.TextRoot) tSpan.parent);
        } else {
            tSpan.setTextRoot(((SVG.TextChild) tSpan.parent).getTextRoot());
        }
    }

    private void m7056use(Attributes attributes) throws SVGParseException {
        debug("<use>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Use use = new SVG.Use();
        use.document = this.svgDocument;
        use.parent = this.currentElement;
        parseAttributesCore(use, attributes);
        parseAttributesStyle(use, attributes);
        parseAttributesTransform(use, attributes);
        parseAttributesConditional(use, attributes);
        parseAttributesUse(use, attributes);
        this.currentElement.addChild(use);
        this.currentElement = use;
    }

    private void view(Attributes attributes) throws SVGParseException {
        debug("<view>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.SvgViewBoxContainer view = new SVG.View();
        view.document = this.svgDocument;
        view.parent = this.currentElement;
        parseAttributesCore(view, attributes);
        parseAttributesConditional(view, attributes);
        parseAttributesViewBox(view, attributes);
        this.currentElement.addChild(view);
        this.currentElement = view;
    }

    private void zwitch(Attributes attributes) throws SVGParseException {
        debug("<switch>", new Object[0]);
        if (this.currentElement == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.Switch r0 = new SVG.Switch();
        r0.document = this.svgDocument;
        r0.parent = this.currentElement;
        parseAttributesCore(r0, attributes);
        parseAttributesStyle(r0, attributes);
        parseAttributesTransform(r0, attributes);
        parseAttributesConditional(r0, attributes);
        this.currentElement.addChild(r0);
        this.currentElement = r0;
    }

    SVG parse(InputStream inputStream, boolean z) throws SVGParseException {
        InputStream bufferedInputStream = !inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream;
        try {
            bufferedInputStream.mark(3);
            int i = bufferedInputStream.read();
            int i2 = bufferedInputStream.read();
            bufferedInputStream.reset();
            if (i + (i2 << 8) == 35615) {
                bufferedInputStream = new BufferedInputStream(new GZIPInputStream(bufferedInputStream));
            }
        } catch (IOException e) {
        }
        try {
            bufferedInputStream.mark(4096);
            parseUsingXmlPullParser(bufferedInputStream, z);
            return this.svgDocument;
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e2) {
                Log.e(f4757TAG, "Exception thrown closing input stream");
            }
        }
    }
}
