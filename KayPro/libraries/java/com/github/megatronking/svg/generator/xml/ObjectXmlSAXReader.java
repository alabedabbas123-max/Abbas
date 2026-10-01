package com.github.megatronking.svg.generator.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.dom4j.DocumentException;

public interface ObjectXmlSAXReader<T> {
    T read(File file) throws DocumentException, IOException;

    T read(InputStream inputStream) throws DocumentException, IOException;

    T read(String str) throws DocumentException, IOException;
}
