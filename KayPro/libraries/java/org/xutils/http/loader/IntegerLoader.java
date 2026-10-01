package org.xutils.http.loader;

import org.xutils.cache.DiskCacheEntity;
import org.xutils.http.request.UriRequest;

class IntegerLoader extends Loader<Integer> {
    IntegerLoader() {
    }

    @Override
    public Loader<Integer> newInstance() {
        return new IntegerLoader();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Integer load(UriRequest uriRequest) throws Throwable {
        uriRequest.sendRequest();
        return Integer.valueOf(uriRequest.getResponseCode());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public Integer loadFromCache(DiskCacheEntity diskCacheEntity) throws Throwable {
        return null;
    }

    @Override
    public void save2Cache(UriRequest uriRequest) {
    }
}
