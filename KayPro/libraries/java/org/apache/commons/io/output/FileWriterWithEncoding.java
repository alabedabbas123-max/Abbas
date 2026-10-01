package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.io.FileUtils;

public class FileWriterWithEncoding extends Writer {

    private final Writer f5394out;

    public FileWriterWithEncoding(File file, String str) throws IOException {
        this(file, str, false);
    }

    public FileWriterWithEncoding(File file, String str, boolean z) throws IOException {
        this.f5394out = initWriter(file, str, z);
    }

    public FileWriterWithEncoding(File file, Charset charset) throws IOException {
        this(file, charset, false);
    }

    public FileWriterWithEncoding(File file, Charset charset, boolean z) throws IOException {
        this.f5394out = initWriter(file, charset, z);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this.f5394out = initWriter(file, charsetEncoder, z);
    }

    public FileWriterWithEncoding(String str, String str2) throws IOException {
        this(new File(str), str2, false);
    }

    public FileWriterWithEncoding(String str, String str2, boolean z) throws IOException {
        this(new File(str), str2, z);
    }

    public FileWriterWithEncoding(String str, Charset charset) throws IOException {
        this(new File(str), charset, false);
    }

    public FileWriterWithEncoding(String str, Charset charset, boolean z) throws IOException {
        this(new File(str), charset, z);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder) throws IOException {
        this(new File(str), charsetEncoder, false);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this(new File(str), charsetEncoder, z);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static Writer initWriter(File file, Object obj, boolean z) throws Exception {
        FileOutputStream fileOutputStream;
        if (file == null) {
            throw new NullPointerException("File is missing");
        }
        if (obj == null) {
            throw new NullPointerException("Encoding is missing");
        }
        boolean zExists = file.exists();
        try {
            fileOutputStream = new FileOutputStream(file, z);
            try {
                if (obj instanceof Charset) {
                    return new OutputStreamWriter(fileOutputStream, (Charset) obj);
                }
                return obj instanceof CharsetEncoder ? new OutputStreamWriter(fileOutputStream, (CharsetEncoder) obj) : new OutputStreamWriter(fileOutputStream, (String) obj);
            } catch (IOException e) {
                e = e;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e.addSuppressed(e2);
                    }
                }
                if (!zExists) {
                    FileUtils.deleteQuietly(file);
                }
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (!zExists) {
                    FileUtils.deleteQuietly(file);
                }
                throw e;
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream = null;
        } catch (RuntimeException e5) {
            e = e5;
            fileOutputStream = null;
        }
    }

    @Override
    public void close() throws IOException {
        this.f5394out.close();
    }

    @Override
    public void flush() throws IOException {
        this.f5394out.flush();
    }

    @Override
    public void write(int i) throws IOException {
        this.f5394out.write(i);
    }

    @Override
    public void write(String str) throws IOException {
        this.f5394out.write(str);
    }

    @Override
    public void write(String str, int i, int i2) throws IOException {
        this.f5394out.write(str, i, i2);
    }

    @Override
    public void write(char[] cArr) throws IOException {
        this.f5394out.write(cArr);
    }

    @Override
    public void write(char[] cArr, int i, int i2) throws IOException {
        this.f5394out.write(cArr, i, i2);
    }
}
