package com.github.megatronking.svg.generator.svg.parser;

import com.github.megatronking.svg.generator.svg.parser.attribute.CircleAttributeParser;
import com.github.megatronking.svg.generator.svg.parser.attribute.EllipseAttributeParser;
import com.github.megatronking.svg.generator.svg.parser.attribute.GAttributeParser;
import com.github.megatronking.svg.generator.svg.parser.attribute.LineAttributeParser;
import com.github.megatronking.svg.generator.svg.parser.attribute.PathAttributeParser;
import com.github.megatronking.svg.generator.svg.parser.attribute.PolygonAttributeParser;
import com.github.megatronking.svg.generator.svg.parser.attribute.PolylineAttributeParser;
import com.github.megatronking.svg.generator.svg.parser.attribute.RectAttributeParser;
import com.github.megatronking.svg.generator.svg.parser.attribute.SvgAttributeParser;
import com.github.megatronking.svg.generator.svg.parser.attribute.UseAttributeParser;
import com.github.megatronking.svg.generator.svg.parser.element.DefsElementParser;
import com.github.megatronking.svg.generator.svg.parser.element.GElementParser;
import com.github.megatronking.svg.generator.svg.parser.element.SvgElementParser;
import com.github.megatronking.svg.generator.svg.parser.element.SymbolElementParser;

public interface SvgParserImpl {
    public static final SvgAttributeParser SVG_ATTRIBUTE_PARSER = new SvgAttributeParser();
    public static final GAttributeParser G_ATTRIBUTE_PARSER = new GAttributeParser();
    public static final CircleAttributeParser CIRCLE_ATTRIBUTE_PARSER = new CircleAttributeParser();
    public static final EllipseAttributeParser ELLIPSE_ATTRIBUTE_PARSER = new EllipseAttributeParser();
    public static final LineAttributeParser LINE_ATTRIBUTE_PARSER = new LineAttributeParser();
    public static final PolylineAttributeParser POLYLINE_ATTRIBUTE_PARSER = new PolylineAttributeParser();
    public static final PolygonAttributeParser POLYGON_ATTRIBUTE_PARSER = new PolygonAttributeParser();
    public static final RectAttributeParser RECT_ATTRIBUTE_PARSER = new RectAttributeParser();
    public static final PathAttributeParser PATH_ATTRIBUTE_PARSER = new PathAttributeParser();
    public static final UseAttributeParser USE_ATTRIBUTE_PARSER = new UseAttributeParser();
    public static final SvgElementParser SVG_ELEMENT_PARSER = new SvgElementParser();
    public static final GElementParser G_ELEMENT_PARSER = new GElementParser();
    public static final DefsElementParser DEFS_ELEMENT_PARSER = new DefsElementParser();
    public static final SymbolElementParser SYMBOL_ELEMENT_PARSER = new SymbolElementParser();
}
