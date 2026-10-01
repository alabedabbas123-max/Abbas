package org.xutils.http.loader;

import android.text.TextUtils;
import org.json.JSONArray;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.common.util.IOUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.request.UriRequest;

class JSONArrayLoader extends Loader<JSONArray> {
    private String charset = "UTF-8";
    private String resultStr = null;

    JSONArrayLoader() {
    }

    @Override
    public Loader<JSONArray> newInstance() {
        return new JSONArrayLoader();
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
    public JSONArray load(UriRequest uriRequest) throws Throwable {
        uriRequest.sendRequest();
        this.resultStr = IOUtil.readStr(uriRequest.getInputStream(), this.charset);
        return new JSONArray(this.resultStr);
    }

    @Override
    public JSONArray loadFromCache(DiskCacheEntity diskCacheEntity) throws Throwable {
        if (diskCacheEntity != null) {
            String textContent = diskCacheEntity.getTextContent();
            if (!TextUtils.isEmpty(textContent)) {
                return new JSONArray(textContent);
            }
        }
        return null;
    }

    @Override
    public void save2Cache(UriRequest uriRequest) {
        saveStringCache(uriRequest, this.resultStr);
    }
}
