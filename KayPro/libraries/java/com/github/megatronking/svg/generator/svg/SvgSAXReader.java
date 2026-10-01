package com.github.megatronking.svg.generator.svg;

import com.github.megatronking.svg.generator.svg.model.Svg;
import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.github.megatronking.svg.generator.svg.parser.SvgParserImpl;
import com.github.megatronking.svg.generator.xml.SimpleImplementSAXReader;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class SvgSAXReader extends SimpleImplementSAXReader<Svg> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    protected Svg parseDocument(Document document) throws DocumentException {
        Element rootElement = document.getRootElement();
        if (!SvgConstants.TAG_SVG.equals(rootElement.getName())) {
            throw new SvgParseException(new StringBuffer().append("The root element must be ").append("svg").toString());
        }
        List listElements = rootElement.elements();
        if (listElements == null || listElements.isEmpty()) {
            throw new SvgParseException("There is no child node in the svg");
        }
        Svg c1584Svg = new Svg();
        SvgParserImpl.SVG_ELEMENT_PARSER.parse(rootElement, c1584Svg);
        return c1584Svg;
    }

    @Override
    protected Svg parseDocument(Document document) throws DocumentException {
        return parseDocument(document);
    }
}
