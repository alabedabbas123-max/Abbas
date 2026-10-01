package com.github.megatronking.svg.generator.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public abstract class SimpleImplementSAXReader<T> implements ObjectXmlSAXReader {
    private SAXReader mReader = new SAXReader();

    public SimpleImplementSAXReader() {
        this.mReader.setEntityResolver(new IgnoreDTDEntityResolver());
    }

    protected abstract T parseDocument(Document document) throws DocumentException;

    @Override
    public T read(File file) throws DocumentException, IOException {
        return read(new FileInputStream(file));
    }

    @Override
    public T read(InputStream inputStream) throws DocumentException, IOException {
        return parseDocument(this.mReader.read(inputStream));
    }

    @Override
    public T read(String str) throws DocumentException, IOException {
        return read(new File(str));
    }
}
