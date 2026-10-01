package org.xutils.http.loader;

import android.text.TextUtils;
import org.json.JSONObject;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.common.util.IOUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.request.UriRequest;

class JSONObjectLoader extends Loader<JSONObject> {
    private String charset = "UTF-8";
    private String resultStr = null;

    JSONObjectLoader() {
    }

    @Override
    public Loader<JSONObject> newInstance() {
        return new JSONObjectLoader();
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
    public JSONObject load(UriRequest uriRequest) throws Throwable {
        uriRequest.sendRequest();
        this.resultStr = IOUtil.readStr(uriRequest.getInputStream(), this.charset);
        return new JSONObject(this.resultStr);
    }

    @Override
    public JSONObject loadFromCache(DiskCacheEntity diskCacheEntity) throws Throwable {
        if (diskCacheEntity != null) {
            String textContent = diskCacheEntity.getTextContent();
            if (!TextUtils.isEmpty(textContent)) {
                return new JSONObject(textContent);
            }
        }
        return null;
    }

    @Override
    public void save2Cache(UriRequest uriRequest) {
        saveStringCache(uriRequest, this.resultStr);
    }
}
