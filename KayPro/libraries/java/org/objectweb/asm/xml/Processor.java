package org.objectweb.asm.xml;

import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import com.tencent.mm.util.TypedValue;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamSource;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class Processor {
    public static final int BYTECODE = 1;
    public static final int MULTI_XML = 2;
    public static final int SINGLE_XML = 3;
    private static final String SINGLE_XML_NAME = "classes.xml";
    private final int inRepresentation;
    private final InputStream input;

    private int f6707n = 0;
    private final int outRepresentation;
    private final OutputStream output;
    private final Source xslt;

    final class ASMContentHandlerFactory implements ContentHandlerFactory {

        final OutputStream f6708os;

        ASMContentHandlerFactory(OutputStream outputStream) {
            this.f6708os = outputStream;
        }

        @Override
        public final ContentHandler createContentHandler() {
            ClassWriter classWriter = new ClassWriter(1);
            return new ASMContentHandler(this, classWriter, classWriter) {
                final ASMContentHandlerFactory this$0;
                final ClassWriter val$cw;

                {
                    this.this$0 = this;
                    this.val$cw = classWriter;
                }

                @Override
                public void endDocument() throws SAXException {
                    try {
                        this.this$0.f6708os.write(this.val$cw.toByteArray());
                    } catch (IOException e) {
                        throw new SAXException(e);
                    }
                }
            };
        }
    }

    interface ContentHandlerFactory {
        ContentHandler createContentHandler();
    }

    interface EntryElement {
        void closeEntry() throws IOException;

        OutputStream openEntry(String str) throws IOException;
    }

    final class InputSlicingHandler extends DefaultHandler {
        private final ContentHandler rootHandler;
        private boolean subdocument = false;
        private ContentHandler subdocumentHandler;
        private ContentHandlerFactory subdocumentHandlerFactory;
        private String subdocumentRoot;

        InputSlicingHandler(String str, ContentHandler contentHandler, ContentHandlerFactory contentHandlerFactory) {
            this.subdocumentRoot = str;
            this.rootHandler = contentHandler;
            this.subdocumentHandlerFactory = contentHandlerFactory;
        }

        @Override
        public final void characters(char[] cArr, int i, int i2) throws SAXException {
            if (this.subdocument) {
                this.subdocumentHandler.characters(cArr, i, i2);
            } else if (this.rootHandler != null) {
                this.rootHandler.characters(cArr, i, i2);
            }
        }

        @Override
        public final void endDocument() throws SAXException {
            if (this.rootHandler != null) {
                this.rootHandler.endDocument();
            }
        }

        @Override
        public final void endElement(String str, String str2, String str3) throws SAXException {
            if (!this.subdocument) {
                if (this.rootHandler != null) {
                    this.rootHandler.endElement(str, str2, str3);
                }
            } else {
                this.subdocumentHandler.endElement(str, str2, str3);
                if (str2.equals(this.subdocumentRoot)) {
                    this.subdocumentHandler.endDocument();
                    this.subdocument = false;
                }
            }
        }

        @Override
        public final void startDocument() throws SAXException {
            if (this.rootHandler != null) {
                this.rootHandler.startDocument();
            }
        }

        @Override
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            if (this.subdocument) {
                this.subdocumentHandler.startElement(str, str2, str3, attributes);
                return;
            }
            if (!str2.equals(this.subdocumentRoot)) {
                if (this.rootHandler != null) {
                    this.rootHandler.startElement(str, str2, str3, attributes);
                }
            } else {
                this.subdocumentHandler = this.subdocumentHandlerFactory.createContentHandler();
                this.subdocumentHandler.startDocument();
                this.subdocumentHandler.startElement(str, str2, str3, attributes);
                this.subdocument = true;
            }
        }
    }

    final class OutputSlicingHandler extends DefaultHandler {
        private final EntryElement entryElement;
        private boolean isXml;
        private ContentHandler subdocumentHandler;
        private ContentHandlerFactory subdocumentHandlerFactory;
        private boolean subdocument = false;
        private final String subdocumentRoot = SvgConstants.ATTR_CLASS;

        OutputSlicingHandler(ContentHandlerFactory contentHandlerFactory, EntryElement entryElement, boolean z) {
            this.subdocumentHandlerFactory = contentHandlerFactory;
            this.entryElement = entryElement;
            this.isXml = z;
        }

        @Override
        public final void characters(char[] cArr, int i, int i2) throws SAXException {
            if (this.subdocument) {
                this.subdocumentHandler.characters(cArr, i, i2);
            }
        }

        @Override
        public final void endDocument() throws SAXException {
        }

        @Override
        public final void endElement(String str, String str2, String str3) throws SAXException {
            if (this.subdocument) {
                this.subdocumentHandler.endElement(str, str2, str3);
                if (str2.equals(this.subdocumentRoot)) {
                    this.subdocumentHandler.endDocument();
                    this.subdocument = false;
                    try {
                        this.entryElement.closeEntry();
                    } catch (IOException e) {
                        throw new SAXException(e.toString(), e);
                    }
                }
            }
        }

        @Override
        public final void startDocument() throws SAXException {
        }

        @Override
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            if (this.subdocument) {
                this.subdocumentHandler.startElement(str, str2, str3, attributes);
                return;
            }
            if (str2.equals(this.subdocumentRoot)) {
                String value = attributes.getValue("name");
                if (value == null || value.length() == 0) {
                    throw new SAXException("Class element without name attribute.");
                }
                try {
                    this.entryElement.openEntry(this.isXml ? new StringBuffer().append(value).append(".class.xml").toString() : new StringBuffer().append(value).append(".class").toString());
                    this.subdocumentHandler = this.subdocumentHandlerFactory.createContentHandler();
                    this.subdocumentHandler.startDocument();
                    this.subdocumentHandler.startElement(str, str2, str3, attributes);
                    this.subdocument = true;
                } catch (IOException e) {
                    throw new SAXException(e.toString(), e);
                }
            }
        }
    }

    final class ProtectedInputStream extends InputStream {

        private final InputStream f6709is;

        ProtectedInputStream(InputStream inputStream) {
            this.f6709is = inputStream;
        }

        @Override
        public final int available() throws IOException {
            return this.f6709is.available();
        }

        @Override
        public final void close() throws IOException {
        }

        @Override
        public final int read() throws IOException {
            return this.f6709is.read();
        }

        @Override
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            return this.f6709is.read(bArr, i, i2);
        }
    }

    final class SAXWriter extends DefaultHandler implements LexicalHandler {

        private static final char[] f6710OFF;
        private final boolean optimizeEmptyElements;

        private Writer f6711w;
        private boolean openElement = false;
        private int ident = 0;

        static {
            _clinit_();
            f6710OFF = "                                                                                                        ".toCharArray();
        }

        SAXWriter(Writer writer, boolean z) {
            this.f6711w = writer;
            this.optimizeEmptyElements = z;
        }

        static void _clinit_() {
        }

        private final void closeElement() throws IOException {
            if (this.openElement) {
                this.f6711w.write(">\n");
            }
            this.openElement = false;
        }

        private static final String m9033esc(String str) {
            StringBuffer stringBuffer = new StringBuffer(str.length());
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                switch (cCharAt) {
                    case '\"':
                        stringBuffer.append("&quot;");
                        break;
                    case '&':
                        stringBuffer.append("&amp;");
                        break;
                    case '<':
                        stringBuffer.append("&lt;");
                        break;
                    case ByteOps.ISTORE_3:
                        stringBuffer.append("&gt;");
                        break;
                    default:
                        if (cCharAt > 127) {
                            stringBuffer.append("&#").append(Integer.toString(cCharAt)).append(';');
                        } else {
                            stringBuffer.append(cCharAt);
                        }
                        break;
                }
            }
            return stringBuffer.toString();
        }

        private final void writeAttributes(Attributes attributes) throws IOException {
            StringBuffer stringBuffer = new StringBuffer();
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                stringBuffer.append(' ').append(attributes.getLocalName(i)).append("=\"").append(m9033esc(attributes.getValue(i))).append('\"');
            }
            this.f6711w.write(stringBuffer.toString());
        }

        private final void writeIdent() throws IOException {
            int length = this.ident;
            while (length > 0) {
                if (length > f6710OFF.length) {
                    this.f6711w.write(f6710OFF);
                    length -= f6710OFF.length;
                } else {
                    this.f6711w.write(f6710OFF, 0, length);
                    length = 0;
                }
            }
        }

        @Override
        public final void comment(char[] cArr, int i, int i2) throws SAXException {
            try {
                closeElement();
                writeIdent();
                this.f6711w.write("<!-- ");
                this.f6711w.write(cArr, i, i2);
                this.f6711w.write(" -->\n");
            } catch (IOException e) {
                throw new SAXException(e);
            }
        }

        @Override
        public final void endCDATA() throws SAXException {
        }

        @Override
        public final void endDTD() throws SAXException {
        }

        @Override
        public final void endDocument() throws SAXException {
            try {
                this.f6711w.flush();
            } catch (IOException e) {
                throw new SAXException(e);
            }
        }

        @Override
        public final void endElement(String str, String str2, String str3) throws SAXException {
            this.ident -= 2;
            try {
                if (this.openElement) {
                    this.f6711w.write("/>\n");
                    this.openElement = false;
                } else {
                    writeIdent();
                    this.f6711w.write(new StringBuffer().append("</").append(str3).append(">\n").toString());
                }
            } catch (IOException e) {
                throw new SAXException(e);
            }
        }

        @Override
        public final void endEntity(String str) throws SAXException {
        }

        @Override
        public final void startCDATA() throws SAXException {
        }

        @Override
        public final void startDTD(String str, String str2, String str3) throws SAXException {
        }

        @Override
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                closeElement();
                writeIdent();
                this.f6711w.write(new StringBuffer().append('<').append(str3).toString());
                if (attributes != null && attributes.getLength() > 0) {
                    writeAttributes(attributes);
                }
                if (this.optimizeEmptyElements) {
                    this.openElement = true;
                } else {
                    this.f6711w.write(">\n");
                }
                this.ident += 2;
            } catch (IOException e) {
                throw new SAXException(e);
            }
        }

        @Override
        public final void startEntity(String str) throws SAXException {
        }
    }

    final class SAXWriterFactory implements ContentHandlerFactory {
        private final boolean optimizeEmptyElements;

        private final Writer f6712w;

        SAXWriterFactory(Writer writer, boolean z) {
            this.f6712w = writer;
            this.optimizeEmptyElements = z;
        }

        @Override
        public final ContentHandler createContentHandler() {
            return new SAXWriter(this.f6712w, this.optimizeEmptyElements);
        }
    }

    final class SingleDocElement implements EntryElement {

        private final OutputStream f6713os;

        SingleDocElement(OutputStream outputStream) {
            this.f6713os = outputStream;
        }

        @Override
        public void closeEntry() throws IOException {
            this.f6713os.flush();
        }

        @Override
        public OutputStream openEntry(String str) throws IOException {
            return this.f6713os;
        }
    }

    final class SubdocumentHandlerFactory implements ContentHandlerFactory {
        private final ContentHandler subdocumentHandler;

        SubdocumentHandlerFactory(ContentHandler contentHandler) {
            this.subdocumentHandler = contentHandler;
        }

        @Override
        public final ContentHandler createContentHandler() {
            return this.subdocumentHandler;
        }
    }

    final class TransformerHandlerFactory implements ContentHandlerFactory {
        private ContentHandler outputHandler;
        private SAXTransformerFactory saxtf;
        private final Templates templates;

        TransformerHandlerFactory(SAXTransformerFactory sAXTransformerFactory, Templates templates, ContentHandler contentHandler) {
            this.saxtf = sAXTransformerFactory;
            this.templates = templates;
            this.outputHandler = contentHandler;
        }

        @Override
        public final ContentHandler createContentHandler() {
            try {
                TransformerHandler transformerHandlerNewTransformerHandler = this.saxtf.newTransformerHandler(this.templates);
                transformerHandlerNewTransformerHandler.setResult(new SAXResult(this.outputHandler));
                return transformerHandlerNewTransformerHandler;
            } catch (TransformerConfigurationException e) {
                throw new RuntimeException(e.toString());
            }
        }
    }

    final class ZipEntryElement implements EntryElement {

        private ZipOutputStream f6714zos;

        ZipEntryElement(ZipOutputStream zipOutputStream) {
            this.f6714zos = zipOutputStream;
        }

        @Override
        public void closeEntry() throws IOException {
            this.f6714zos.flush();
            this.f6714zos.closeEntry();
        }

        @Override
        public OutputStream openEntry(String str) throws IOException {
            this.f6714zos.putNextEntry(new ZipEntry(str));
            return this.f6714zos;
        }
    }

    public Processor(int i, int i2, InputStream inputStream, OutputStream outputStream, Source source) {
        this.inRepresentation = i;
        this.outRepresentation = i2;
        this.input = inputStream;
        this.output = outputStream;
        this.xslt = source;
    }

    private void copyEntry(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (this.outRepresentation == 3) {
            return;
        }
        byte[] bArr = new byte[2048];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    private EntryElement getEntryElement(ZipOutputStream zipOutputStream) {
        return this.outRepresentation == 3 ? new SingleDocElement(zipOutputStream) : new ZipEntryElement(zipOutputStream);
    }

    private String getName(ZipEntry zipEntry) {
        String name = zipEntry.getName();
        if (!isClassEntry(zipEntry)) {
            return name;
        }
        if (this.inRepresentation == 1 || this.outRepresentation != 1) {
            return (this.inRepresentation != 1 || this.outRepresentation == 1) ? name : new StringBuffer().append(name).append(TypedValue.XML_FILE).toString();
        }
        return name.substring(0, name.length() - 4);
    }

    private static int getRepresentation(String str) {
        if ("code".equals(str)) {
            return 1;
        }
        if ("xml".equals(str)) {
            return 2;
        }
        return "singlexml".equals(str) ? 3 : 0;
    }

    private boolean isClassEntry(ZipEntry zipEntry) {
        String name = zipEntry.getName();
        return (this.inRepresentation == 3 && name.equals(SINGLE_XML_NAME)) || name.endsWith(".class") || name.endsWith(".class.xml");
    }

    public static void main(String[] strArr) throws Exception {
        int i;
        int i2 = 2;
        if (strArr.length < 2) {
            showUsage();
            return;
        }
        int representation = getRepresentation(strArr[0]);
        int representation2 = getRepresentation(strArr[1]);
        InputStream fileInputStream = System.in;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(System.out);
        StreamSource streamSource = null;
        while (i2 < strArr.length) {
            if ("-in".equals(strArr[i2])) {
                i = i2 + 1;
                fileInputStream = new FileInputStream(strArr[i]);
            } else if ("-out".equals(strArr[i2])) {
                i = i2 + 1;
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(strArr[i]));
            } else if (!"-xslt".equals(strArr[i2])) {
                showUsage();
                return;
            } else {
                i = i2 + 1;
                streamSource = new StreamSource(new FileInputStream(strArr[i]));
            }
            i2 = i + 1;
        }
        if (representation == 0 || representation2 == 0) {
            showUsage();
            return;
        }
        Processor processor = new Processor(representation, representation2, fileInputStream, bufferedOutputStream, streamSource);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iProcess = processor.process();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        System.err.println(iProcess);
        System.err.println(new StringBuffer().append(jCurrentTimeMillis2 - jCurrentTimeMillis).append("ms  ").append((iProcess * 1000.0f) / (jCurrentTimeMillis2 - jCurrentTimeMillis)).append(" resources/sec").toString());
    }

    private void processEntry(ZipInputStream zipInputStream, ZipEntry zipEntry, ContentHandlerFactory contentHandlerFactory) {
        ContentHandler contentHandlerCreateContentHandler = contentHandlerFactory.createContentHandler();
        try {
            boolean z = this.inRepresentation == 3;
            if (this.inRepresentation == 1) {
                new ClassReader(readEntry(zipInputStream, zipEntry)).accept(new SAXClassAdapter(contentHandlerCreateContentHandler, z), 0);
                return;
            }
            XMLReader xMLReaderCreateXMLReader = XMLReaderFactory.createXMLReader();
            xMLReaderCreateXMLReader.setContentHandler(contentHandlerCreateContentHandler);
            xMLReaderCreateXMLReader.parse(new InputSource(z ? new ProtectedInputStream(zipInputStream) : new ByteArrayInputStream(readEntry(zipInputStream, zipEntry))));
        } catch (Exception e) {
            update(zipEntry.getName(), 0);
            update(e, 0);
        }
    }

    private static byte[] readEntry(InputStream inputStream, ZipEntry zipEntry) throws IOException {
        int i = 0;
        long size = zipEntry.getSize();
        if (size > -1) {
            byte[] bArr = new byte[(int) size];
            while (true) {
                int i2 = inputStream.read(bArr, i, bArr.length - i);
                if (i2 <= 0) {
                    return bArr;
                }
                i += i2;
            }
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[4096];
            while (true) {
                int i3 = inputStream.read(bArr2);
                if (i3 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i3);
            }
        }
    }

    private static void showUsage() {
        System.err.println("Usage: Main <in format> <out format> [-in <input jar>] [-out <output jar>] [-xslt <xslt fiel>]");
        System.err.println("  when -in or -out is omitted sysin and sysout would be used");
        System.err.println("  <in format> and <out format> - code | xml | singlexml");
    }

    public int process() throws TransformerException, SAXException, IOException {
        ContentHandler sAXWriter;
        ZipInputStream zipInputStream = new ZipInputStream(this.input);
        ZipOutputStream zipOutputStream = new ZipOutputStream(this.output);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(zipOutputStream);
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
        TransformerFactory transformerFactoryNewInstance = TransformerFactory.newInstance();
        if (!transformerFactoryNewInstance.getFeature("http://javax.xml.transform.sax.SAXSource/feature") || !transformerFactoryNewInstance.getFeature("http://javax.xml.transform.sax.SAXResult/feature")) {
            return 0;
        }
        SAXTransformerFactory sAXTransformerFactory = (SAXTransformerFactory) transformerFactoryNewInstance;
        Templates templatesNewTemplates = this.xslt != null ? sAXTransformerFactory.newTemplates(this.xslt) : null;
        EntryElement entryElement = getEntryElement(zipOutputStream);
        switch (this.outRepresentation) {
            case 1:
                sAXWriter = new OutputSlicingHandler(new ASMContentHandlerFactory(zipOutputStream), entryElement, false);
                break;
            case 2:
                sAXWriter = new OutputSlicingHandler(new SAXWriterFactory(outputStreamWriter, true), entryElement, true);
                break;
            case 3:
                zipOutputStream.putNextEntry(new ZipEntry(SINGLE_XML_NAME));
                sAXWriter = new SAXWriter(outputStreamWriter, false);
                break;
            default:
                sAXWriter = null;
                break;
        }
        ContentHandler inputSlicingHandler = templatesNewTemplates == null ? sAXWriter : new InputSlicingHandler(SvgConstants.ATTR_CLASS, sAXWriter, new TransformerHandlerFactory(sAXTransformerFactory, templatesNewTemplates, sAXWriter));
        ContentHandlerFactory subdocumentHandlerFactory = new SubdocumentHandlerFactory(inputSlicingHandler);
        if (inputSlicingHandler != null && this.inRepresentation != 3) {
            inputSlicingHandler.startDocument();
            inputSlicingHandler.startElement("", "classes", "classes", new AttributesImpl());
        }
        int i = 0;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                if (inputSlicingHandler != null && this.inRepresentation != 3) {
                    inputSlicingHandler.endElement("", "classes", "classes");
                    inputSlicingHandler.endDocument();
                }
                if (this.outRepresentation == 3) {
                    zipOutputStream.closeEntry();
                }
                zipOutputStream.flush();
                zipOutputStream.close();
                return i;
            }
            Object name = nextEntry.getName();
            int i2 = this.f6707n;
            this.f6707n = i2 + 1;
            update(name, i2);
            if (isClassEntry(nextEntry)) {
                processEntry(zipInputStream, nextEntry, subdocumentHandlerFactory);
            } else {
                copyEntry(zipInputStream, entryElement.openEntry(getName(nextEntry)));
                entryElement.closeEntry();
            }
            i++;
        }
    }

    protected void update(Object obj, int i) {
        if (obj instanceof Throwable) {
            ((Throwable) obj).printStackTrace();
        } else if (i % 100 == 0) {
            System.err.println(new StringBuffer().append(i).append(" ").append(obj).toString());
        }
    }
}
