package org.xutils.http.loader;

import android.text.TextUtils;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.common.util.IOUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.request.UriRequest;

class StringLoader extends Loader<String> {
    private String charset = "UTF-8";
    private String resultStr = null;

    StringLoader() {
    }

    @Override
    public Loader<String> newInstance() {
        return new StringLoader();
    }

    @Override
    public void setParams(RequestParams requestParams) {
        if (requestParams != null) {
            String charset = requestParams.getCharset();
            if (!TextUtils.isEmpty(charset)) {
                this.charset = charset;
            }
        }
    }

    @Override
    public String load(UriRequest uriRequest) throws Throwable {
        uriRequest.sendRequest();
        this.resultStr = IOUtil.readStr(uriRequest.getInputStream(), this.charset);
        return this.resultStr;
    }

    @Override
    public String loadFromCache(DiskCacheEntity diskCacheEntity) throws Throwable {
        if (diskCacheEntity != null) {
            return diskCacheEntity.getTextContent();
        }
        return null;
    }

    @Override
    public void save2Cache(UriRequest uriRequest) {
        saveStringCache(uriRequest, this.resultStr);
    }
}
