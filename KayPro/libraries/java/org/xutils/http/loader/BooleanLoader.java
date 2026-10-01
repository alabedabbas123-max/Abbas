package org.xutils.http.loader;

import org.xutils.cache.DiskCacheEntity;
import org.xutils.http.request.UriRequest;

class BooleanLoader extends Loader<Boolean> {
    BooleanLoader() {
    }

    @Override
    public Loader<Boolean> newInstance() {
        return new BooleanLoader();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Boolean load(UriRequest uriRequest) throws Throwable {
        uriRequest.sendRequest();
        return Boolean.valueOf(uriRequest.getResponseCode() < 300);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Boolean loadFromCache(DiskCacheEntity diskCacheEntity) throws Throwable {
        return null;
    }

    @Override
    public void save2Cache(UriRequest uriRequest) {
    }
}
