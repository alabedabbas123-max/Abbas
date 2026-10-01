package org.xutils.http.body;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.io.IOUtils;
import org.xutils.common.Callback;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.KeyValue;
import org.xutils.http.BaseParams;
import org.xutils.http.ProgressHandler;

public class MultipartBody implements ProgressBody {
    private static byte[] BOUNDARY_PREFIX_BYTES = "--------7da3d81520810".getBytes();
    private static byte[] END_BYTES = IOUtils.LINE_SEPARATOR_WINDOWS.getBytes();
    private static byte[] TWO_DASHES_BYTES = "--".getBytes();
    private byte[] boundaryPostfixBytes;
    private ProgressHandler callBackHandler;
    private String charset;
    private String contentType;
    private long current = 0;
    private List<KeyValue> multipartParams;
    private long total;

    public MultipartBody(List<KeyValue> list, String str) {
        this.charset = "UTF-8";
        this.total = 0L;
        if (!TextUtils.isEmpty(str)) {
            this.charset = str;
        }
        this.multipartParams = list;
        generateContentType();
        CounterOutputStream counterOutputStream = new CounterOutputStream();
        try {
            writeTo(counterOutputStream);
            this.total = counterOutputStream.total.get();
        } catch (IOException e) {
            this.total = -1L;
        }
    }

    @Override
    public void setProgressHandler(ProgressHandler progressHandler) {
        this.callBackHandler = progressHandler;
    }

    private void generateContentType() {
        String hexString = Double.toHexString(Math.random() * 65535.0d);
        this.boundaryPostfixBytes = hexString.getBytes();
        this.contentType = "multipart/form-data; boundary=" + new String(BOUNDARY_PREFIX_BYTES) + hexString;
    }

    @Override
    public long getContentLength() {
        return this.total;
    }

    @Override
    public void setContentType(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.contentType = "multipart/" + str + this.contentType.substring(this.contentType.indexOf(";"));
        }
    }

    @Override
    public String getContentType() {
        return this.contentType;
    }

    @Override
    public void writeTo(OutputStream outputStream) throws IOException {
        if (this.callBackHandler != null && !this.callBackHandler.updateProgress(this.total, this.current, true)) {
            throw new Callback.CancelledException("upload stopped!");
        }
        Iterator<KeyValue> it = this.multipartParams.iterator();
        while (it.hasNext()) {
            writeEntry(outputStream, it.next());
        }
        writeLine(outputStream, TWO_DASHES_BYTES, BOUNDARY_PREFIX_BYTES, this.boundaryPostfixBytes, TWO_DASHES_BYTES);
        outputStream.flush();
        if (this.callBackHandler != null) {
            this.callBackHandler.updateProgress(this.total, this.current, true);
        }
    }

    private void writeEntry(OutputStream outputStream, KeyValue keyValue) throws IOException {
        String fileContentType;
        byte[] bytes;
        String str = keyValue.f6724key;
        Object obj = keyValue.value;
        if (!TextUtils.isEmpty(str) && obj != null) {
            writeLine(outputStream, TWO_DASHES_BYTES, BOUNDARY_PREFIX_BYTES, this.boundaryPostfixBytes);
            String name = "";
            if (!(keyValue instanceof BaseParams.BodyItemWrapper)) {
                fileContentType = null;
            } else {
                BaseParams.BodyItemWrapper bodyItemWrapper = (BaseParams.BodyItemWrapper) keyValue;
                name = bodyItemWrapper.fileName;
                fileContentType = bodyItemWrapper.contentType;
            }
            if (obj instanceof File) {
                File file = (File) obj;
                if (TextUtils.isEmpty(name)) {
                    name = file.getName();
                }
                if (TextUtils.isEmpty(fileContentType)) {
                    fileContentType = FileBody.getFileContentType(file);
                }
                writeLine(outputStream, buildContentDisposition(str, name, this.charset));
                writeLine(outputStream, buildContentType(obj, fileContentType, this.charset));
                writeLine(outputStream, new byte[0][]);
                writeFile(outputStream, file);
                writeLine(outputStream, new byte[0][]);
                return;
            }
            writeLine(outputStream, buildContentDisposition(str, name, this.charset));
            writeLine(outputStream, buildContentType(obj, fileContentType, this.charset));
            writeLine(outputStream, new byte[0][]);
            if (obj instanceof InputStream) {
                writeStreamAndCloseIn(outputStream, (InputStream) obj);
                writeLine(outputStream, new byte[0][]);
                return;
            }
            if (obj instanceof byte[]) {
                bytes = (byte[]) obj;
            } else {
                bytes = keyValue.getValueStrOrEmpty().getBytes(this.charset);
            }
            writeLine(outputStream, bytes);
            this.current = ((long) bytes.length) + this.current;
            if (this.callBackHandler != null && !this.callBackHandler.updateProgress(this.total, this.current, false)) {
                throw new Callback.CancelledException("upload stopped!");
            }
        }
    }

    private void writeLine(OutputStream outputStream, byte[]... bArr) throws IOException {
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                outputStream.write(bArr2);
            }
        }
        outputStream.write(END_BYTES);
    }

    private void writeFile(OutputStream outputStream, File file) throws IOException {
        if (outputStream instanceof CounterOutputStream) {
            ((CounterOutputStream) outputStream).addFile(file);
        } else {
            writeStreamAndCloseIn(outputStream, new FileInputStream(file));
        }
    }

    private void writeStreamAndCloseIn(OutputStream outputStream, InputStream inputStream) throws IOException {
        if (outputStream instanceof CounterOutputStream) {
            ((CounterOutputStream) outputStream).addStream(inputStream);
            return;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStream.read(bArr);
                if (i >= 0) {
                    outputStream.write(bArr, 0, i);
                    this.current += (long) i;
                    if (this.callBackHandler != null && !this.callBackHandler.updateProgress(this.total, this.current, false)) {
                        throw new Callback.CancelledException("upload stopped!");
                    }
                } else {
                    return;
                }
            }
        } finally {
            IOUtil.closeQuietly(inputStream);
        }
    }

    private static byte[] buildContentDisposition(String str, String str2, String str3) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder("Content-Disposition: form-data");
        sb.append("; name=\"").append(str.replace("\"", "\\\"")).append("\"");
        if (!TextUtils.isEmpty(str2)) {
            sb.append("; filename=\"").append(str2.replace("\"", "\\\"")).append("\"");
        }
        return sb.toString().getBytes(str3);
    }

    private static byte[] buildContentType(Object obj, String str, String str2) throws UnsupportedEncodingException {
        String strReplaceFirst;
        StringBuilder sb = new StringBuilder("Content-Type: ");
        if (TextUtils.isEmpty(str)) {
            if (obj instanceof String) {
                strReplaceFirst = "text/plain; charset=" + str2;
            } else {
                strReplaceFirst = "application/octet-stream";
            }
        } else {
            strReplaceFirst = str.replaceFirst("\\/jpg$", "/jpeg");
        }
        sb.append(strReplaceFirst);
        return sb.toString().getBytes(str2);
    }

    private class CounterOutputStream extends OutputStream {
        final AtomicLong total = new AtomicLong(0);

        public CounterOutputStream() {
        }

        public void addFile(File file) {
            if (this.total.get() != -1) {
                this.total.addAndGet(file.length());
            }
        }

        public void addStream(InputStream inputStream) {
            if (this.total.get() != -1) {
                long inputStreamLength = InputStreamBody.getInputStreamLength(inputStream);
                if (inputStreamLength > 0) {
                    this.total.addAndGet(inputStreamLength);
                } else {
                    this.total.set(-1L);
                }
            }
        }

        @Override
        public void write(int i) throws IOException {
            if (this.total.get() != -1) {
                this.total.incrementAndGet();
            }
        }

        @Override
        public void write(byte[] bArr) throws IOException {
            if (this.total.get() != -1) {
                this.total.addAndGet(bArr.length);
            }
        }

        @Override
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.total.get() != -1) {
                this.total.addAndGet(i2);
            }
        }
    }
}
