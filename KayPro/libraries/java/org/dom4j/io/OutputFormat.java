package org.dom4j.io;

import org.apache.commons.io.IOUtils;

public class OutputFormat implements Cloneable {
    protected static final String STANDARD_INDENT = "  ";
    private char attributeQuoteChar;
    private boolean doXHTML;
    private String encoding;
    private boolean expandEmptyElements;
    private String indent;
    private String lineSeparator;
    private boolean newLineAfterDeclaration;
    private int newLineAfterNTags;
    private boolean newlines;
    private boolean omitEncoding;
    private boolean padText;
    private boolean suppressDeclaration;
    private boolean trimText;

    public OutputFormat() {
        this.suppressDeclaration = false;
        this.newLineAfterDeclaration = true;
        this.encoding = "UTF-8";
        this.omitEncoding = false;
        this.indent = null;
        this.expandEmptyElements = false;
        this.newlines = false;
        this.lineSeparator = IOUtils.LINE_SEPARATOR_UNIX;
        this.trimText = false;
        this.padText = false;
        this.doXHTML = false;
        this.newLineAfterNTags = 0;
        this.attributeQuoteChar = '\"';
    }

    public OutputFormat(String str) {
        this.suppressDeclaration = false;
        this.newLineAfterDeclaration = true;
        this.encoding = "UTF-8";
        this.omitEncoding = false;
        this.indent = null;
        this.expandEmptyElements = false;
        this.newlines = false;
        this.lineSeparator = IOUtils.LINE_SEPARATOR_UNIX;
        this.trimText = false;
        this.padText = false;
        this.doXHTML = false;
        this.newLineAfterNTags = 0;
        this.attributeQuoteChar = '\"';
        this.indent = str;
    }

    public OutputFormat(String str, boolean z) {
        this.suppressDeclaration = false;
        this.newLineAfterDeclaration = true;
        this.encoding = "UTF-8";
        this.omitEncoding = false;
        this.indent = null;
        this.expandEmptyElements = false;
        this.newlines = false;
        this.lineSeparator = IOUtils.LINE_SEPARATOR_UNIX;
        this.trimText = false;
        this.padText = false;
        this.doXHTML = false;
        this.newLineAfterNTags = 0;
        this.attributeQuoteChar = '\"';
        this.indent = str;
        this.newlines = z;
    }

    public OutputFormat(String str, boolean z, String str2) {
        this.suppressDeclaration = false;
        this.newLineAfterDeclaration = true;
        this.encoding = "UTF-8";
        this.omitEncoding = false;
        this.indent = null;
        this.expandEmptyElements = false;
        this.newlines = false;
        this.lineSeparator = IOUtils.LINE_SEPARATOR_UNIX;
        this.trimText = false;
        this.padText = false;
        this.doXHTML = false;
        this.newLineAfterNTags = 0;
        this.attributeQuoteChar = '\"';
        this.indent = str;
        this.newlines = z;
        this.encoding = str2;
    }

    public static OutputFormat createCompactFormat() {
        OutputFormat outputFormat = new OutputFormat();
        outputFormat.setIndent(false);
        outputFormat.setNewlines(false);
        outputFormat.setTrimText(true);
        return outputFormat;
    }

    public static OutputFormat createPrettyPrint() {
        OutputFormat outputFormat = new OutputFormat();
        outputFormat.setIndentSize(2);
        outputFormat.setNewlines(true);
        outputFormat.setTrimText(true);
        outputFormat.setPadText(true);
        return outputFormat;
    }

    public char getAttributeQuoteCharacter() {
        return this.attributeQuoteChar;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public String getIndent() {
        return this.indent;
    }

    public String getLineSeparator() {
        return this.lineSeparator;
    }

    public int getNewLineAfterNTags() {
        return this.newLineAfterNTags;
    }

    public boolean isExpandEmptyElements() {
        return this.expandEmptyElements;
    }

    public boolean isNewLineAfterDeclaration() {
        return this.newLineAfterDeclaration;
    }

    public boolean isNewlines() {
        return this.newlines;
    }

    public boolean isOmitEncoding() {
        return this.omitEncoding;
    }

    public boolean isPadText() {
        return this.padText;
    }

    public boolean isSuppressDeclaration() {
        return this.suppressDeclaration;
    }

    public boolean isTrimText() {
        return this.trimText;
    }

    public boolean isXHTML() {
        return this.doXHTML;
    }

    public int parseOptions(String[] strArr, int i) {
        int length = strArr.length;
        int i2 = i;
        while (i2 < length) {
            if (!strArr[i2].equals("-suppressDeclaration")) {
                if (!strArr[i2].equals("-omitEncoding")) {
                    if (!strArr[i2].equals("-indent")) {
                        if (!strArr[i2].equals("-indentSize")) {
                            if (!strArr[i2].startsWith("-expandEmpty")) {
                                if (!strArr[i2].equals("-encoding")) {
                                    if (!strArr[i2].equals("-newlines")) {
                                        if (!strArr[i2].equals("-lineSeparator")) {
                                            if (!strArr[i2].equals("-trimText")) {
                                                if (!strArr[i2].equals("-padText")) {
                                                    if (!strArr[i2].startsWith("-xhtml")) {
                                                        break;
                                                    }
                                                    setXHTML(true);
                                                } else {
                                                    setPadText(true);
                                                }
                                            } else {
                                                setTrimText(true);
                                            }
                                        } else {
                                            i2++;
                                            setLineSeparator(strArr[i2]);
                                        }
                                    } else {
                                        setNewlines(true);
                                    }
                                } else {
                                    i2++;
                                    setEncoding(strArr[i2]);
                                }
                            } else {
                                setExpandEmptyElements(true);
                            }
                        } else {
                            i2++;
                            setIndentSize(Integer.parseInt(strArr[i2]));
                        }
                    } else {
                        i2++;
                        setIndent(strArr[i2]);
                    }
                } else {
                    setOmitEncoding(true);
                }
            } else {
                setSuppressDeclaration(true);
            }
            i2++;
        }
        return i2;
    }

    public void setAttributeQuoteCharacter(char c) {
        if (c != '\'' && c != '\"') {
            throw new IllegalArgumentException(new StringBuffer().append("Invalid attribute quote character (").append(c).append(")").toString());
        }
        this.attributeQuoteChar = c;
    }

    public void setEncoding(String str) {
        if (str != null) {
            this.encoding = str;
        }
    }

    public void setExpandEmptyElements(boolean z) {
        this.expandEmptyElements = z;
    }

    public void setIndent(String str) {
        if (str != null && str.length() <= 0) {
            str = null;
        }
        this.indent = str;
    }

    public void setIndent(boolean z) {
        if (z) {
            this.indent = STANDARD_INDENT;
        } else {
            this.indent = null;
        }
    }

    public void setIndentSize(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(" ");
        }
        this.indent = stringBuffer.toString();
    }

    public void setLineSeparator(String str) {
        this.lineSeparator = str;
    }

    public void setNewLineAfterDeclaration(boolean z) {
        this.newLineAfterDeclaration = z;
    }

    public void setNewLineAfterNTags(int i) {
        this.newLineAfterNTags = i;
    }

    public void setNewlines(boolean z) {
        this.newlines = z;
    }

    public void setOmitEncoding(boolean z) {
        this.omitEncoding = z;
    }

    public void setPadText(boolean z) {
        this.padText = z;
    }

    public void setSuppressDeclaration(boolean z) {
        this.suppressDeclaration = z;
    }

    public void setTrimText(boolean z) {
        this.trimText = z;
    }

    public void setXHTML(boolean z) {
        this.doXHTML = z;
    }
}
