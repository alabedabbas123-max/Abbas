package com.github.megatronking.svg.generator.writer.impl;

import com.github.megatronking.svg.generator.svg.model.Svg;
import com.github.megatronking.svg.generator.svg.model.SvgGroupNode;
import com.github.megatronking.svg.generator.svg.model.SvgNode;
import com.github.megatronking.svg.generator.utils.FloatUtils;
import com.github.megatronking.svg.generator.writer.IBufferWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;

public class Svg2VectorTemplateWriter implements IBufferWriter {
    private static final String HEAD_INDENT = "    ";
    private Svg mSvg;

    public Svg2VectorTemplateWriter(Svg c1584Svg) {
        this.mSvg = c1584Svg;
    }

    private void writeSvgNodes(BufferedWriter bufferedWriter, SvgNode svgNode, int i) throws IOException {
        if (svgNode.isValid()) {
            if (svgNode instanceof SvgGroupNode) {
                Iterator<SvgNode> it = ((SvgGroupNode) svgNode).children.iterator();
                while (it.hasNext()) {
                    writeSvgNodes(bufferedWriter, it.next(), i);
                }
                return;
            }
            String string = "";
            for (int i2 = 0; i2 < i; i2++) {
                string = new StringBuffer().append(string).append("    ").toString();
            }
            bufferedWriter.write(string);
            bufferedWriter.write(svgNode.convert2VectorXml(string));
            bufferedWriter.newLine();
        }
    }

    @Override
    public void write(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        bufferedWriter.newLine();
        bufferedWriter.write("<vector xmlns:android=\"http://schemas.android.com/apk/res/android\"");
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("android:width=\"").toString()).append(FloatUtils.format2String(this.mSvg.f4796w)).toString()).append("dp\"").toString());
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("android:height=\"").toString()).append(FloatUtils.format2String(this.mSvg.f4795h)).toString()).append("dp\"").toString());
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("android:viewportHeight=\"").toString()).append(FloatUtils.format2String(this.mSvg.viewBox[3])).toString()).append("\"").toString());
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("android:viewportWidth=\"").toString()).append(FloatUtils.format2String(this.mSvg.viewBox[2])).toString()).append("\">").toString());
        bufferedWriter.newLine();
        Iterator<SvgNode> it = this.mSvg.children.iterator();
        while (it.hasNext()) {
            writeSvgNodes(bufferedWriter, it.next(), 1);
        }
        bufferedWriter.write("</vector>");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
