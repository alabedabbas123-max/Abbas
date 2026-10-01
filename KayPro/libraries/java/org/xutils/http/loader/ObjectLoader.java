package org.xutils.http.loader;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.common.util.ParameterizedTypeUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpResponse;
import org.xutils.http.app.ResponseParser;
import org.xutils.http.request.UriRequest;

class ObjectLoader extends Loader<Object> {
    private final Loader<?> innerLoader;
    private final Class<?> objectClass;
    private final Type objectType;
    private final ResponseParser parser;

    public ObjectLoader(Type type) {
        HttpResponse httpResponse;
        Type parameterizedType;
        Class cls;
        this.objectType = type;
        if (type instanceof ParameterizedType) {
            this.objectClass = (Class) ((ParameterizedType) type).getRawType();
        } else {
            if (type instanceof TypeVariable) {
                throw new IllegalArgumentException("not support callback type " + type.toString());
            }
            this.objectClass = (Class) type;
        }
        if (List.class.equals(this.objectClass)) {
            parameterizedType = ParameterizedTypeUtil.getParameterizedType(this.objectType, List.class, 0);
            if (parameterizedType instanceof ParameterizedType) {
                cls = (Class) ((ParameterizedType) parameterizedType).getRawType();
            } else {
                if (parameterizedType instanceof TypeVariable) {
                    throw new IllegalArgumentException("not support callback type " + parameterizedType.toString());
                }
                cls = (Class) parameterizedType;
            }
            httpResponse = (HttpResponse) cls.getAnnotation(HttpResponse.class);
        } else {
            httpResponse = (HttpResponse) this.objectClass.getAnnotation(HttpResponse.class);
            parameterizedType = type;
        }
        if (httpResponse != null) {
            try {
                Class<? extends ResponseParser> rVar = httpResponse.parser();
                this.parser = rVar.newInstance();
                this.innerLoader = LoaderFactory.getLoader(ParameterizedTypeUtil.getParameterizedType(rVar, ResponseParser.class, 0));
                if (this.innerLoader instanceof ObjectLoader) {
                    throw new IllegalArgumentException("not support callback type " + parameterizedType);
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("create parser error", th);
            }
        }
        throw new IllegalArgumentException("not found @HttpResponse from " + parameterizedType);
    }

    @Override
    public Loader<Object> newInstance() {
        throw new IllegalAccessError("use constructor create ObjectLoader.");
    }

    @Override
    public void setParams(RequestParams requestParams) {
        this.innerLoader.setParams(requestParams);
    }

    @Override
    public Object load(UriRequest uriRequest) throws Throwable {
        uriRequest.setResponseParser(this.parser);
        return this.parser.parse(this.objectType, this.objectClass, this.innerLoader.load(uriRequest));
    }

    @Override
    public Object loadFromCache(DiskCacheEntity diskCacheEntity) throws Throwable {
        return this.parser.parse(this.objectType, this.objectClass, this.innerLoader.loadFromCache(diskCacheEntity));
    }

    @Override
    public void save2Cache(UriRequest uriRequest) {
        this.innerLoader.save2Cache(uriRequest);
    }
}
