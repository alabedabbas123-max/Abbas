package com.github.megatronking.svg.generator.writer.impl;

import com.github.megatronking.svg.generator.render.VectorRenderer;
import com.github.megatronking.svg.generator.utils.Dimen;
import com.github.megatronking.svg.generator.vector.model.Vector;
import com.github.megatronking.svg.generator.writer.JavaClassWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class SVGRendererTemplateWriter extends JavaClassWriter {
    private static final int METHOD_RENDER_MAX_LINE = 1000;
    private List<SplitMethod> mRenderSplitMethods = new ArrayList();
    private VectorRenderer mRenderer;
    private Vector mVector;

    private static class SplitMethod {
        private int index;
        private String methodContent;

        SplitMethod(int i, String str) {
            this.index = i;
            this.methodContent = str;
        }
    }

    public SVGRendererTemplateWriter(VectorRenderer vectorRenderer, Vector vector) {
        this.mRenderer = vectorRenderer;
        this.mVector = vector;
        setClassRelation("SVGRenderer", (String[]) null);
    }

    private int calculateStringLineCount(String str) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i3 >= str.length()) {
                return i2;
            }
            if ('\n' == str.charAt(i3)) {
                i2++;
            }
            i = i3 + 1;
        }
    }

    private String getDimenSize(String str) {
        if (Dimen.isDip(str)) {
            return new StringBuffer().append(new StringBuffer().append("dip2px(").append(Dimen.convert(str)).toString()).append("f)").toString();
        }
        return Dimen.isPx(str) ? new StringBuffer().append(new StringBuffer().append("(int)").append(Dimen.convert(str)).toString()).append("f").toString() : "0f";
    }

    private String substringByLineCount(String str, int i, int i2) {
        String[] strArrSplit = str.split(IOUtils.LINE_SEPARATOR_UNIX);
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            if (i3 >= i && i3 < i2) {
                sb.append(strArrSplit[i3]).append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return sb.toString();
    }

    private void writeMethodRender(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append("    ").append("@Override").toString());
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append("    ").append("public void render(Canvas canvas, int w, int h, ColorFilter filter) {").toString());
        bufferedWriter.newLine();
        writeRendererContent(bufferedWriter);
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append("    ").append("}").toString());
        bufferedWriter.newLine();
        for (SplitMethod splitMethod : this.mRenderSplitMethods) {
            bufferedWriter.newLine();
            bufferedWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("private void renderSplitMethod").toString()).append(splitMethod.index).toString()).append("(Canvas canvas, ColorFilter filter, float scaleX, float scaleY) {").toString());
            bufferedWriter.newLine();
            bufferedWriter.write(splitMethod.methodContent);
            bufferedWriter.newLine();
            bufferedWriter.write(new StringBuffer().append("    ").append("}").toString());
            bufferedWriter.newLine();
        }
    }

    private void writeRendererContent(BufferedWriter bufferedWriter) throws IOException {
        String strRenderResult = this.mRenderer.renderResult();
        int iCalculateStringLineCount = calculateStringLineCount(strRenderResult);
        if (iCalculateStringLineCount <= 1000 || strRenderResult.contains("getSegment")) {
            bufferedWriter.write(strRenderResult);
            return;
        }
        bufferedWriter.write(substringByLineCount(strRenderResult, 0, 1000));
        bufferedWriter.newLine();
        for (int i = 1; i * 1000 < iCalculateStringLineCount; i++) {
            bufferedWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("    ").toString()).append("renderSplitMethod").toString()).append(i).toString()).append("(canvas, filter, scaleX, scaleY);").toString());
            bufferedWriter.newLine();
            this.mRenderSplitMethods.add(new SplitMethod(i, substringByLineCount(strRenderResult, i * 1000, Math.min((i + 1) * 1000, iCalculateStringLineCount))));
        }
    }

    @Override
    protected void writeClassComment(BufferedWriter bufferedWriter) throws IOException {
        super.writeClassComment(bufferedWriter);
        bufferedWriter.write("/**");
        bufferedWriter.newLine();
        bufferedWriter.write(" * AUTO-GENERATED FILE.  DO NOT MODIFY.");
        bufferedWriter.newLine();
        bufferedWriter.write(" * ");
        bufferedWriter.newLine();
        bufferedWriter.write(" * This class was automatically generated by the");
        bufferedWriter.newLine();
        bufferedWriter.write(" * SVG-Generator. It should not be modified by hand.");
        bufferedWriter.newLine();
        bufferedWriter.write(" */");
    }

    @Override
    protected void writeConstructMethods(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("public ").toString()).append(this.mClassSimpleName).toString()).append("(Context context) {").toString());
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append(new StringBuffer().append("    ").append("    ").toString()).append("super(context);").toString());
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("    ").toString()).append("mAlpha = ").toString()).append(this.mVector.alpha).toString()).append("f;").toString());
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("    ").toString()).append("mWidth = ").toString()).append(getDimenSize(this.mVector.width)).toString()).append(";").toString());
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("    ").toString()).append("mHeight = ").toString()).append(getDimenSize(this.mVector.height)).toString()).append(";").toString());
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append("    ").append("}").toString());
        bufferedWriter.newLine();
    }

    @Override
    protected void writeFields(BufferedWriter bufferedWriter) throws IOException {
    }

    @Override
    protected void writeImports(BufferedWriter bufferedWriter) throws IOException {
        super.writeImports(bufferedWriter);
        bufferedWriter.write("import android.content.Context;");
        bufferedWriter.newLine();
        bufferedWriter.write("import android.graphics.Canvas;");
        bufferedWriter.newLine();
        bufferedWriter.write("import android.graphics.ColorFilter;");
        bufferedWriter.newLine();
        bufferedWriter.write("import android.graphics.Paint;");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("import com.github.megatronking.svg.support.SVGRenderer;");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
    }

    @Override
    protected void writeMethods(BufferedWriter bufferedWriter) throws IOException {
        writeMethodRender(bufferedWriter);
    }
}
