package com.github.megatronking.svg.generator.vector;

import com.github.megatronking.svg.generator.xml.SimpleImplementSAXReader;
import com.github.megatronking.svg.generator.vector.model.Vector;
import com.github.megatronking.svg.generator.vector.model.VectorConstants;
import com.github.megatronking.svg.generator.vector.parser.VectorParserImpl;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

public class VectorSAXReader extends SimpleImplementSAXReader<Vector> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    protected Vector parseDocument(Document document) throws DocumentException {
        Element rootElement = document.getRootElement();
        if (!VectorConstants.TAG_VECTOR.equals(rootElement.getName())) {
            throw new VectorParseException(new StringBuffer().append("The root element must be ").append("vector").toString());
        }
        List listElements = rootElement.elements();
        if (listElements == null || listElements.isEmpty()) {
            throw new VectorParseException("There is no child node in the vector");
        }
        Vector vector = new Vector();
        VectorParserImpl.VECTOR_ELEMENT_PARSER.parse(rootElement, vector);
        return vector;
    }

    @Override
    protected Vector parseDocument(Document document) throws DocumentException {
        return parseDocument(document);
    }
}
