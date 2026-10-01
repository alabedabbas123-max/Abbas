package org.xutils.http.request;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.xutils.common.util.IOUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.loader.FileLoader;

public class LocalFileRequest extends UriRequest {
    private InputStream inputStream;

    public LocalFileRequest(RequestParams requestParams, Type type) throws Throwable {
        super(requestParams, type);
    }

    @Override
    public void sendRequest() throws Throwable {
    }

    @Override
    public boolean isLoading() {
        return true;
    }

    @Override
    public String getCacheKey() {
        return this.queryUrl;
    }

    @Override
    public Object loadResult() throws Throwable {
        return this.loader instanceof FileLoader ? getFile() : this.loader.load(this);
    }

    @Override
    public Object loadResultFromCache() throws Throwable {
        return null;
    }

    @Override
    public void clearCacheHeader() {
    }

    @Override
    public void save2Cache() {
    }

    private File getFile() {
        String strSubstring;
        if (this.queryUrl.startsWith("file:")) {
            strSubstring = this.queryUrl.substring("file:".length());
        } else {
            strSubstring = this.queryUrl;
        }
        return new File(strSubstring);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        if (this.inputStream == null) {
            this.inputStream = new FileInputStream(getFile());
        }
        return this.inputStream;
    }

    @Override
    public void close() throws IOException {
        IOUtil.closeQuietly(this.inputStream);
        this.inputStream = null;
    }

    @Override
    public long getContentLength() {
        return getFile().length();
    }

    @Override
    public int getResponseCode() throws IOException {
        return getFile().exists() ? 200 : 404;
    }

    @Override
    public String getResponseMessage() throws IOException {
        return null;
    }

    @Override
    public long getExpiration() {
        return -1L;
    }

    @Override
    public long getLastModified() {
        return getFile().lastModified();
    }

    @Override
    public String getETag() {
        return null;
    }

    @Override
    public String getResponseHeader(String str) {
        return null;
    }

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        return null;
    }

    @Override
    public long getHeaderFieldDate(String str, long j) {
        return j;
    }
}
