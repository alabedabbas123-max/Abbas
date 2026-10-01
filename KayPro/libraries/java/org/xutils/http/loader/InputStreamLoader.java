package org.xutils.http.loader;

import java.io.InputStream;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.http.request.UriRequest;

class InputStreamLoader extends Loader<InputStream> {
    InputStreamLoader() {
    }

    @Override
    public Loader<InputStream> newInstance() {
        return new InputStreamLoader();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public InputStream load(UriRequest uriRequest) throws Throwable {
        uriRequest.sendRequest();
        return uriRequest.getInputStream();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public InputStream loadFromCache(DiskCacheEntity diskCacheEntity) throws Throwable {
        return null;
    }

    @Override
    public void save2Cache(UriRequest uriRequest) {
    }
}
