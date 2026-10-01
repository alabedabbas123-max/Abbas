package com.github.megatronking.svg.generator.vector;

import org.dom4j.DocumentException;

public class VectorParseException extends DocumentException {
    public VectorParseException() {
        super("Error occurred in read vector xml.");
    }

    public VectorParseException(String str) {
        super(str);
    }
}
