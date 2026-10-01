package com.github.megatronking.svg.generator.writer.impl;

import com.github.megatronking.svg.generator.writer.IBufferWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class SVGShapeXmlTemplateWriter implements IBufferWriter {
    @Override
    public void write(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.write("<!-- AUTO-GENERATED FILE.  DO NOT MODIFY. -->");
        bufferedWriter.newLine();
        bufferedWriter.write("<shape xmlns:android=\"http://schemas.android.com/apk/res/android\" />");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
