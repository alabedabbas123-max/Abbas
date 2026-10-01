package com.github.megatronking.svg.generator.svg;

import org.dom4j.DocumentException;

public class SvgParseException extends DocumentException {
    public SvgParseException() {
        super("Error occurred in read svg xml.");
    }

    public SvgParseException(String str) {
        super(str);
    }
}
