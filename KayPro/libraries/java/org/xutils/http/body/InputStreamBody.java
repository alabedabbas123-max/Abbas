package org.xutils.http.body;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.xutils.common.Callback;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.http.ProgressHandler;

public class InputStreamBody implements ProgressBody {
    private ProgressHandler callBackHandler;
    private InputStream content;
    private String contentType;
    private long current;
    private final long total;

    public InputStreamBody(InputStream inputStream) {
        this(inputStream, null);
    }

    public InputStreamBody(InputStream inputStream, String str) {
        this.current = 0L;
        this.content = inputStream;
        this.contentType = str;
        this.total = getInputStreamLength(inputStream);
    }

    @Override
    public void setProgressHandler(ProgressHandler progressHandler) {
        this.callBackHandler = progressHandler;
    }

    @Override
    public long getContentLength() {
        return this.total;
    }

    @Override
    public void setContentType(String str) {
        this.contentType = str;
    }

    @Override
    public String getContentType() {
        return TextUtils.isEmpty(this.contentType) ? "application/octet-stream" : this.contentType;
    }

    @Override
    public void writeTo(OutputStream outputStream) throws IOException {
        if (this.callBackHandler != null && !this.callBackHandler.updateProgress(this.total, this.current, true)) {
            throw new Callback.CancelledException("upload stopped!");
        }
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int i = this.content.read(bArr);
                if (i != -1) {
                    outputStream.write(bArr, 0, i);
                    this.current += (long) i;
                    if (this.callBackHandler != null && !this.callBackHandler.updateProgress(this.total, this.current, false)) {
                        throw new Callback.CancelledException("upload stopped!");
                    }
                } else {
                    outputStream.flush();
                    if (this.callBackHandler != null) {
                        this.callBackHandler.updateProgress(this.total, this.current, true);
                    }
                    IOUtil.closeQuietly(this.content);
                    return;
                }
            } catch (Throwable th) {
                IOUtil.closeQuietly(this.content);
                throw th;
            }
        }
    }

    public static long getInputStreamLength(InputStream inputStream) {
        try {
            if ((inputStream instanceof FileInputStream) || (inputStream instanceof ByteArrayInputStream)) {
                return inputStream.available();
            }
        } catch (Throwable th) {
            LogUtil.m9052w(th.getMessage(), th);
        }
        return -1L;
    }
}
