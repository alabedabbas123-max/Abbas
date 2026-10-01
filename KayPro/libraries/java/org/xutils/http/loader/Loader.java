package org.xutils.http.loader;

import android.text.TextUtils;
import java.util.Date;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.cache.LruDiskCache;
import org.xutils.http.ProgressHandler;
import org.xutils.http.RequestParams;
import org.xutils.http.request.UriRequest;

public abstract class Loader<T> {
    protected ProgressHandler progressHandler;

    public abstract T load(UriRequest uriRequest) throws Throwable;

    public abstract T loadFromCache(DiskCacheEntity diskCacheEntity) throws Throwable;

    public abstract Loader<T> newInstance();

    public abstract void save2Cache(UriRequest uriRequest);

    public void setParams(RequestParams requestParams) {
    }

    public void setProgressHandler(ProgressHandler progressHandler) {
        this.progressHandler = progressHandler;
    }

    protected void saveStringCache(UriRequest uriRequest, String str) {
        saveCacheInternal(uriRequest, str, null);
    }

    protected void saveByteArrayCache(UriRequest uriRequest, byte[] bArr) {
        saveCacheInternal(uriRequest, null, bArr);
    }

    private void saveCacheInternal(UriRequest uriRequest, String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) || (bArr != null && bArr.length > 0)) {
            DiskCacheEntity diskCacheEntity = new DiskCacheEntity();
            diskCacheEntity.setKey(uriRequest.getCacheKey());
            diskCacheEntity.setLastAccess(System.currentTimeMillis());
            diskCacheEntity.setEtag(uriRequest.getETag());
            diskCacheEntity.setExpires(uriRequest.getExpiration());
            diskCacheEntity.setLastModify(new Date(uriRequest.getLastModified()));
            diskCacheEntity.setTextContent(str);
            diskCacheEntity.setBytesContent(bArr);
            LruDiskCache.getDiskCache(uriRequest.getParams().getCacheDirName()).m9038put(diskCacheEntity);
        }
    }
}
