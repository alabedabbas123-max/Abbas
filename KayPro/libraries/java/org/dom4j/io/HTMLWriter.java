package org.dom4j.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import org.apache.commons.io.IOUtils;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.xml.sax.SAXException;

public class HTMLWriter extends XMLWriter {
    protected static final OutputFormat DEFAULT_HTML_FORMAT;
    private Stack formatStack;
    private String lastText;
    private int newLineAfterNTags;
    private HashSet omitElementCloseSet;
    private HashSet preformattedTags;
    private int tagsOuput;
    private static String lineSeparator = System.getProperty("line.separator");
    protected static final HashSet DEFAULT_PREFORMATTED_TAGS = new HashSet();

    private class FormatState {
        private String indent;
        private boolean newlines;
        private final HTMLWriter this$0;
        private boolean trimText;

        public FormatState(HTMLWriter hTMLWriter, boolean z, boolean z2, String str) {
            this.this$0 = hTMLWriter;
            this.newlines = false;
            this.trimText = false;
            this.indent = "";
            this.newlines = z;
            this.trimText = z2;
            this.indent = str;
        }

        public String getIndent() {
            return this.indent;
        }

        public boolean isNewlines() {
            return this.newlines;
        }

        public boolean isTrimText() {
            return this.trimText;
        }
    }

    static {
        DEFAULT_PREFORMATTED_TAGS.add("PRE");
        DEFAULT_PREFORMATTED_TAGS.add("SCRIPT");
        DEFAULT_PREFORMATTED_TAGS.add("STYLE");
        DEFAULT_PREFORMATTED_TAGS.add("TEXTAREA");
        DEFAULT_HTML_FORMAT = new OutputFormat("  ", true);
        DEFAULT_HTML_FORMAT.setTrimText(true);
        DEFAULT_HTML_FORMAT.setSuppressDeclaration(true);
    }

    public HTMLWriter() throws UnsupportedEncodingException {
        super(DEFAULT_HTML_FORMAT);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }

    public HTMLWriter(OutputStream outputStream) throws UnsupportedEncodingException {
        super(outputStream, DEFAULT_HTML_FORMAT);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }

    public HTMLWriter(OutputStream outputStream, OutputFormat outputFormat) throws UnsupportedEncodingException {
        super(outputStream, outputFormat);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }

    public HTMLWriter(Writer writer) {
        super(writer, DEFAULT_HTML_FORMAT);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }

    public HTMLWriter(Writer writer, OutputFormat outputFormat) {
        super(writer, outputFormat);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }

    public HTMLWriter(OutputFormat outputFormat) throws UnsupportedEncodingException {
        super(outputFormat);
        this.formatStack = new Stack();
        this.lastText = "";
        this.tagsOuput = 0;
        this.newLineAfterNTags = -1;
        this.preformattedTags = DEFAULT_PREFORMATTED_TAGS;
    }

    private HashSet internalGetOmitElementCloseSet() {
        if (this.omitElementCloseSet == null) {
            this.omitElementCloseSet = new HashSet();
            loadOmitElementCloseSet(this.omitElementCloseSet);
        }
        return this.omitElementCloseSet;
    }

    private String justSpaces(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            switch (cCharAt) {
                case '\n':
                case '\r':
                    break;
                case 11:
                case '\f':
                default:
                    stringBuffer.append(cCharAt);
                    break;
            }
        }
        return stringBuffer.toString();
    }

    private void lazyInitNewLinesAfterNTags() {
        if (getOutputFormat().isNewlines()) {
            this.newLineAfterNTags = 0;
        } else {
            this.newLineAfterNTags = getOutputFormat().getNewLineAfterNTags();
        }
    }

    public static String prettyPrintHTML(String str) throws DocumentException, IOException {
        return prettyPrintHTML(str, true, true, false, true);
    }

    public static String prettyPrintHTML(String str, boolean z, boolean z2, boolean z3, boolean z4) throws DocumentException, IOException {
        StringWriter stringWriter = new StringWriter();
        OutputFormat outputFormatCreatePrettyPrint = OutputFormat.createPrettyPrint();
        outputFormatCreatePrettyPrint.setNewlines(z);
        outputFormatCreatePrettyPrint.setTrimText(z2);
        outputFormatCreatePrettyPrint.setXHTML(z3);
        outputFormatCreatePrettyPrint.setExpandEmptyElements(z4);
        HTMLWriter hTMLWriter = new HTMLWriter(stringWriter, outputFormatCreatePrettyPrint);
        hTMLWriter.write(DocumentHelper.parseText(str));
        hTMLWriter.flush();
        return stringWriter.toString();
    }

    public static String prettyPrintXHTML(String str) throws DocumentException, IOException {
        return prettyPrintHTML(str, true, true, true, false);
    }

    @Override
    public void endCDATA() throws SAXException {
    }

    public Set getOmitElementCloseSet() {
        return (Set) internalGetOmitElementCloseSet().clone();
    }

    public Set getPreformattedTags() {
        return (Set) this.preformattedTags.clone();
    }

    public boolean isPreformattedTag(String str) {
        return this.preformattedTags != null && this.preformattedTags.contains(str.toUpperCase());
    }

    protected void loadOmitElementCloseSet(Set set) {
        set.add("AREA");
        set.add("BASE");
        set.add("BR");
        set.add("COL");
        set.add("HR");
        set.add("IMG");
        set.add("INPUT");
        set.add("LINK");
        set.add("META");
        set.add("P");
        set.add("PARAM");
    }

    protected boolean omitElementClose(String str) {
        return internalGetOmitElementCloseSet().contains(str.toUpperCase());
    }

    public void setOmitElementCloseSet(Set set) {
        this.omitElementCloseSet = new HashSet();
        if (set != null) {
            this.omitElementCloseSet = new HashSet();
            for (Object obj : set) {
                if (obj != null) {
                    this.omitElementCloseSet.add(obj.toString().toUpperCase());
                }
            }
        }
    }

    public void setPreformattedTags(Set set) {
        this.preformattedTags = new HashSet();
        if (set != null) {
            for (Object obj : set) {
                if (obj != null) {
                    this.preformattedTags.add(obj.toString().toUpperCase());
                }
            }
        }
    }

    @Override
    public void startCDATA() throws SAXException {
    }

    @Override
    protected void writeCDATA(String str) throws IOException {
        if (getOutputFormat().isXHTML()) {
            super.writeCDATA(str);
        } else {
            this.writer.write(str);
        }
        this.lastOutputNodeType = 4;
    }

    @Override
    protected void writeClose(String str) throws IOException {
        if (omitElementClose(str)) {
            return;
        }
        super.writeClose(str);
    }

    @Override
    protected void writeDeclaration() throws IOException {
    }

    @Override
    protected void writeElement(Element element) throws IOException {
        if (this.newLineAfterNTags == -1) {
            lazyInitNewLinesAfterNTags();
        }
        if (this.newLineAfterNTags > 0 && this.tagsOuput > 0 && this.tagsOuput % this.newLineAfterNTags == 0) {
            this.writer.write(lineSeparator);
        }
        this.tagsOuput++;
        String qualifiedName = element.getQualifiedName();
        String str = this.lastText;
        element.nodeCount();
        if (!isPreformattedTag(qualifiedName)) {
            super.writeElement(element);
            return;
        }
        OutputFormat outputFormat = getOutputFormat();
        boolean zIsNewlines = outputFormat.isNewlines();
        boolean zIsTrimText = outputFormat.isTrimText();
        String indent = outputFormat.getIndent();
        this.formatStack.push(new FormatState(this, zIsNewlines, zIsTrimText, indent));
        try {
            super.writePrintln();
            if (str.trim().length() == 0 && indent != null && indent.length() > 0) {
                this.writer.write(justSpaces(str));
            }
            outputFormat.setNewlines(false);
            outputFormat.setTrimText(false);
            outputFormat.setIndent("");
            super.writeElement(element);
        } finally {
            FormatState formatState = (FormatState) this.formatStack.pop();
            outputFormat.setNewlines(formatState.isNewlines());
            outputFormat.setTrimText(formatState.isTrimText());
            outputFormat.setIndent(formatState.getIndent());
        }
    }

    @Override
    protected void writeEmptyElementClose(String str) throws IOException {
        if (getOutputFormat().isXHTML()) {
            if (omitElementClose(str)) {
                this.writer.write(" />");
                return;
            } else {
                super.writeEmptyElementClose(str);
                return;
            }
        }
        if (omitElementClose(str)) {
            this.writer.write(">");
        } else {
            super.writeEmptyElementClose(str);
        }
    }

    @Override
    protected void writeEntity(Entity entity) throws IOException {
        this.writer.write(entity.getText());
        this.lastOutputNodeType = 5;
    }

    @Override
    protected void writeString(String str) throws IOException {
        if (str.equals(IOUtils.LINE_SEPARATOR_UNIX)) {
            if (this.formatStack.empty()) {
                return;
            }
            super.writeString(lineSeparator);
        } else {
            this.lastText = str;
            if (this.formatStack.empty()) {
                super.writeString(str.trim());
            } else {
                super.writeString(str);
            }
        }
    }
}
