package org.apache.commons.io.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class DeferredFileOutputStream extends ThresholdingOutputStream {
    private boolean closed;
    private OutputStream currentOutputStream;
    private final File directory;
    private ByteArrayOutputStream memoryOutputStream;
    private File outputFile;
    private final String prefix;
    private final String suffix;

    public DeferredFileOutputStream(int i, int i2, File file) {
        this(i, file, null, null, null, i2);
        if (i2 < 0) {
            throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }

    public DeferredFileOutputStream(int i, int i2, String str, String str2, File file) {
        this(i, null, str, str2, file, i2);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }

    public DeferredFileOutputStream(int i, File file) {
        this(i, file, null, null, null, 1024);
    }

    private DeferredFileOutputStream(int i, File file, String str, String str2, File file2, int i2) {
        super(i);
        this.closed = false;
        this.outputFile = file;
        this.prefix = str;
        this.suffix = str2;
        this.directory = file2;
        this.memoryOutputStream = new ByteArrayOutputStream(i2);
        this.currentOutputStream = this.memoryOutputStream;
    }

    public DeferredFileOutputStream(int i, String str, String str2, File file) {
        this(i, null, str, str2, file, 1024);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.closed = true;
    }

    public byte[] getData() {
        if (this.memoryOutputStream != null) {
            return this.memoryOutputStream.toByteArray();
        }
        return null;
    }

    public File getFile() {
        return this.outputFile;
    }

    @Override
    protected OutputStream getStream() throws IOException {
        return this.currentOutputStream;
    }

    public boolean isInMemory() {
        return !isThresholdExceeded();
    }

    @Override
    protected void thresholdReached() throws IOException {
        if (this.prefix != null) {
            this.outputFile = File.createTempFile(this.prefix, this.suffix, this.directory);
        }
        FileUtils.forceMkdirParent(this.outputFile);
        FileOutputStream fileOutputStream = new FileOutputStream(this.outputFile);
        try {
            this.memoryOutputStream.writeTo(fileOutputStream);
            this.currentOutputStream = fileOutputStream;
            this.memoryOutputStream = null;
        } catch (IOException e) {
            fileOutputStream.close();
            throw e;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (!this.closed) {
            throw new IOException("Stream not closed");
        }
        if (isInMemory()) {
            this.memoryOutputStream.writeTo(outputStream);
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(this.outputFile);
        Throwable th = null;
        try {
            IOUtils.copy(fileInputStream, outputStream);
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (Throwable th2) {
            if (fileInputStream != null) {
                if (0 != 0) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    fileInputStream.close();
                }
            }
            throw th2;
        }
    }
}
