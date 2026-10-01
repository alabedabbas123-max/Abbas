package com.github.megatronking.svg.generator.svg;

import com.github.megatronking.svg.generator.svg.model.Svg;
import com.github.megatronking.svg.generator.writer.impl.Svg2VectorTemplateWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import org.dom4j.DocumentException;

public class Svg2Vector {
    public static String parseSvgToXml(File file, File file2, int i, int i2) {
        if (file == null || file2 == null) {
            return "Invalid input params!";
        }
        if (!file.exists() || file.length() == 0 || file.isDirectory()) {
            return new StringBuffer().append("Invalid svg file: ").append(file.getName()).toString();
        }
        try {
            Svg c1584Svg = new SvgSAXReader().read(file);
            if (i > 0) {
                c1584Svg.f4796w = i;
            }
            if (i2 > 0) {
                c1584Svg.f4795h = i2;
            }
            new Svg2VectorTemplateWriter(c1584Svg).write(new BufferedWriter(new FileWriter(file2)));
            return (String) null;
        } catch (IOException | DocumentException e) {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Exception in parsing ").append(file.getName()).toString()).append(":\n").toString()).append(e.getMessage()).toString();
        }
    }

    public static String parseSvgToXml(File file, OutputStream outputStream, int i, int i2) {
        if (file == null || outputStream == null) {
            return "Invalid input params!";
        }
        if (!file.exists() || file.length() == 0 || file.isDirectory()) {
            return new StringBuffer().append("Invalid svg file: ").append(file.getName()).toString();
        }
        try {
            Svg c1584Svg = new SvgSAXReader().read(file);
            if (i > 0) {
                c1584Svg.f4796w = i;
            }
            if (i2 > 0) {
                c1584Svg.f4795h = i2;
            }
            new Svg2VectorTemplateWriter(c1584Svg).write(new BufferedWriter(new OutputStreamWriter(outputStream)));
            return (String) null;
        } catch (IOException | DocumentException e) {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Exception in parsing ").append(file.getName()).toString()).append(":\n").toString()).append(e.getMessage()).toString();
        }
    }

    public static String parseSvgToXml(InputStream inputStream, OutputStream outputStream, int i, int i2) {
        if (inputStream == null || outputStream == null) {
            return "Invalid input params!";
        }
        try {
            Svg c1584Svg = new SvgSAXReader().read(inputStream);
            if (i > 0) {
                c1584Svg.f4796w = i;
            }
            if (i2 > 0) {
                c1584Svg.f4795h = i2;
            }
            new Svg2VectorTemplateWriter(c1584Svg).write(new BufferedWriter(new OutputStreamWriter(outputStream)));
            return (String) null;
        } catch (IOException | DocumentException e) {
            return new StringBuffer().append("Exception when parsing :\n").append(e.getMessage()).toString();
        }
    }
}
