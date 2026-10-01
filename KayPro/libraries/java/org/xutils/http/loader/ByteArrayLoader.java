package org.xutils.http.loader;

import org.xutils.cache.DiskCacheEntity;
import org.xutils.common.util.IOUtil;
import org.xutils.http.request.UriRequest;

class ByteArrayLoader extends Loader<byte[]> {
    private byte[] resultData;

    ByteArrayLoader() {
    }

    @Override
    public Loader<byte[]> newInstance() {
        return new ByteArrayLoader();
    }

    @Override
    public byte[] load(UriRequest uriRequest) throws Throwable {
        uriRequest.sendRequest();
        this.resultData = IOUtil.readBytes(uriRequest.getInputStream());
        return this.resultData;
    }

    @Override
    public byte[] loadFromCache(DiskCacheEntity diskCacheEntity) throws Throwable {
        byte[] bytesContent;
        if (diskCacheEntity == null || (bytesContent = diskCacheEntity.getBytesContent()) == null || bytesContent.length <= 0) {
            return null;
        }
        return bytesContent;
    }

    @Override
    public void save2Cache(UriRequest uriRequest) {
        saveByteArrayCache(uriRequest, this.resultData);
    }
}
