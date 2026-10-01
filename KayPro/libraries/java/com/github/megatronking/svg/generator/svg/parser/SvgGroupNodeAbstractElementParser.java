package com.github.megatronking.svg.generator.svg.parser;

import com.github.megatronking.svg.generator.svg.model.G;
import com.github.megatronking.svg.generator.svg.model.Use;
import com.github.megatronking.svg.generator.svg.model.Circle;
import com.github.megatronking.svg.generator.svg.model.Defs;
import com.github.megatronking.svg.generator.svg.model.Ellipse;
import com.github.megatronking.svg.generator.svg.model.Line;
import com.github.megatronking.svg.generator.svg.model.Path;
import com.github.megatronking.svg.generator.svg.model.Polygon;
import com.github.megatronking.svg.generator.svg.model.Polyline;
import com.github.megatronking.svg.generator.svg.model.Rect;
import com.github.megatronking.svg.generator.svg.model.Style;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.github.megatronking.svg.generator.svg.model.SvgGroupNode;
import com.github.megatronking.svg.generator.svg.model.Symbol;
import com.github.megatronking.svg.generator.xml.ChildrenElementParser;
import com.github.megatronking.svg.generator.xml.IAttributeParser;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public abstract class SvgGroupNodeAbstractElementParser<T extends SvgGroupNode> extends ChildrenElementParser<T> {
    public SvgGroupNodeAbstractElementParser(IAttributeParser<T> iAttributeParser) {
        super(iAttributeParser);
    }

    protected void parseChild(Element element, T t) throws DocumentException {
        String text;
        if (SvgConstants.TAG_GROUP.equals(element.getName())) {
            G c1583g = new G();
            t.children.add(c1583g);
            SvgParserImpl.G_ELEMENT_PARSER.parse(element, c1583g);
        }
        if (SvgConstants.TAG_CIRCLE.equals(element.getName())) {
            Circle circle = new Circle();
            t.children.add(circle);
            SvgParserImpl.CIRCLE_ATTRIBUTE_PARSER.parse(element, circle);
        }
        if (SvgConstants.TAG_ELLIPSE.equals(element.getName())) {
            Ellipse ellipse = new Ellipse();
            t.children.add(ellipse);
            SvgParserImpl.ELLIPSE_ATTRIBUTE_PARSER.parse(element, ellipse);
        }
        if (SvgConstants.TAG_LINE.equals(element.getName())) {
            Line line = new Line();
            t.children.add(line);
            SvgParserImpl.LINE_ATTRIBUTE_PARSER.parse(element, line);
        }
        if (SvgConstants.TAG_RECT.equals(element.getName())) {
            Rect rect = new Rect();
            t.children.add(rect);
            SvgParserImpl.RECT_ATTRIBUTE_PARSER.parse(element, rect);
        }
        if (SvgConstants.TAG_POLYGON.equals(element.getName())) {
            Polygon polygon = new Polygon();
            t.children.add(polygon);
            SvgParserImpl.POLYGON_ATTRIBUTE_PARSER.parse(element, polygon);
        }
        if (SvgConstants.TAG_POLYLINE.equals(element.getName())) {
            Polyline polyline = new Polyline();
            t.children.add(polyline);
            SvgParserImpl.POLYLINE_ATTRIBUTE_PARSER.parse(element, polyline);
        }
        if (SvgConstants.TAG_PATH.equals(element.getName())) {
            Path path = new Path();
            t.children.add(path);
            SvgParserImpl.PATH_ATTRIBUTE_PARSER.parse(element, path);
        }
        if (SvgConstants.TAG_USE.equals(element.getName())) {
            Use c1585Use = new Use();
            t.children.add(c1585Use);
            SvgParserImpl.USE_ATTRIBUTE_PARSER.parse(element, c1585Use);
        }
        if (SvgConstants.TAG_STYLE.equals(element.getName()) && (text = element.getText()) != null && text.length() > 0) {
            Style style = new Style();
            style.cssStyle = text;
            t.children.add(style);
        }
        if (SvgConstants.TAG_DEFS.equals(element.getName())) {
            Defs defs = new Defs();
            t.children.add(defs);
            SvgParserImpl.DEFS_ELEMENT_PARSER.parse(element, defs);
        }
        if (SvgConstants.TAG_SYMBOL.equals(element.getName())) {
            Symbol symbol = new Symbol();
            t.children.add(symbol);
            SvgParserImpl.SYMBOL_ELEMENT_PARSER.parse(element, symbol);
        }
    }

    @Override
    protected void parseChild(Element element, Object obj) throws DocumentException {
        parseChild(element, (SvgGroupNode) obj);
    }
}
