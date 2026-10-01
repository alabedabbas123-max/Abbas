package com.github.megatronking.svg.generator.writer;

import java.io.BufferedWriter;
import java.io.IOException;

public abstract class JavaClassWriter implements IBufferWriter {
    public static final String HEAD_SPACE = "    ";
    private String mClassExtends;
    private String[] mClassImplements;
    private String mClassModifiers = "public";
    protected String mClassSimpleName;
    private String[] mImports;
    private String mPackage;

    public void setClassModifiers(String str) {
        this.mClassModifiers = str;
    }

    public void setClassRelation(String str, String[] strArr) {
        this.mClassExtends = str;
        this.mClassImplements = strArr;
    }

    public void setClassSimpleName(String str) {
        this.mClassSimpleName = str;
    }

    public void setImports(String[] strArr) {
        this.mImports = strArr;
    }

    public void setPackage(String str) {
        this.mPackage = str;
    }

    @Override
    public void write(BufferedWriter bufferedWriter) throws IOException {
        writePackage(bufferedWriter);
        writeImports(bufferedWriter);
        writeClassComment(bufferedWriter);
        writeClass(bufferedWriter);
        writeFields(bufferedWriter);
        writeConstructMethods(bufferedWriter);
        writeMethods(bufferedWriter);
        writeInnerClasses(bufferedWriter);
        writeEnd(bufferedWriter);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    protected void writeClass(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.mClassModifiers).append(" class ").toString()).append(this.mClassSimpleName).toString()).append(" ").toString());
        if (this.mClassExtends != null && this.mClassExtends.length() != 0) {
            bufferedWriter.write(new StringBuffer().append("extends ").append(this.mClassExtends).toString());
        }
        if (this.mClassImplements != null && this.mClassImplements.length != 0) {
            bufferedWriter.write(" implements ");
            for (int i = 0; i < this.mClassImplements.length; i++) {
                bufferedWriter.write(this.mClassImplements[i]);
                if (i != this.mClassImplements.length - 1) {
                    bufferedWriter.write(", ");
                }
            }
        }
        bufferedWriter.write(" {");
        bufferedWriter.newLine();
    }

    protected void writeClassComment(BufferedWriter bufferedWriter) throws IOException {
    }

    protected abstract void writeConstructMethods(BufferedWriter bufferedWriter) throws IOException;

    protected void writeEnd(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write("}");
    }

    protected abstract void writeFields(BufferedWriter bufferedWriter) throws IOException;

    protected void writeImports(BufferedWriter bufferedWriter) throws IOException {
        if (this.mImports == null || this.mImports.length == 0) {
            return;
        }
        for (int i = 0; i < this.mImports.length; i++) {
            bufferedWriter.write(new StringBuffer().append(new StringBuffer().append("import ").append(this.mImports[i]).toString()).append(";").toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.newLine();
    }

    protected void writeInnerClasses(BufferedWriter bufferedWriter) throws IOException {
    }

    protected abstract void writeMethods(BufferedWriter bufferedWriter) throws IOException;

    protected void writePackage(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.write(new StringBuffer().append(new StringBuffer().append("package ").append(this.mPackage).toString()).append(";").toString());
        bufferedWriter.newLine();
        bufferedWriter.newLine();
    }
}
