package org.xutils.http.body;

import android.text.TextUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class StringBody implements RequestBody {
    private String charset;
    private byte[] content;
    private String contentType;

    public StringBody(String str, String str2) throws UnsupportedEncodingException {
        this.charset = "UTF-8";
        if (!TextUtils.isEmpty(str2)) {
            this.charset = str2;
        }
        this.content = str.getBytes(this.charset);
    }

    @Override
    public long getContentLength() {
        return this.content.length;
    }

    @Override
    public void setContentType(String str) {
        this.contentType = str;
    }

    @Override
    public String getContentType() {
        return TextUtils.isEmpty(this.contentType) ? "application/json;charset=" + this.charset : this.contentType;
    }

    @Override
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content);
        outputStream.flush();
    }
}
