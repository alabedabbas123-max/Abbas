package org.xutils.http.body;

import android.text.TextUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import org.xutils.common.util.KeyValue;
import org.xutils.common.util.LogUtil;

public class UrlEncodedBody implements RequestBody {
    private String charset;
    private byte[] content;

    public UrlEncodedBody(List<KeyValue> list, String str) throws IOException {
        this.charset = "UTF-8";
        if (!TextUtils.isEmpty(str)) {
            this.charset = str;
        }
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            for (KeyValue keyValue : list) {
                String str2 = keyValue.f6724key;
                String valueStrOrNull = keyValue.getValueStrOrNull();
                if (!TextUtils.isEmpty(str2) && valueStrOrNull != null) {
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode(str2, this.charset).replaceAll("\\+", "%20")).append("=").append(URLEncoder.encode(valueStrOrNull, this.charset).replaceAll("\\+", "%20"));
                }
            }
        }
        this.content = sb.toString().getBytes(this.charset);
    }

    @Override
    public long getContentLength() {
        return this.content.length;
    }

    @Override
    public void setContentType(String str) {
        if (!TextUtils.isEmpty(str)) {
            LogUtil.m9051w("ignored Content-Type: " + str);
        }
    }

    @Override
    public String getContentType() {
        return "application/x-www-form-urlencoded;charset=" + this.charset;
    }

    @Override
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content);
        outputStream.flush();
    }
}
