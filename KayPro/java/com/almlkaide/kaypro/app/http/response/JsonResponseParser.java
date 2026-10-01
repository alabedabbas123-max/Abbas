package com.almlkaide.kaypro.app.http.response;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import org.xutils.http.app.ResponseParser;
import org.xutils.http.request.UriRequest;

public class JsonResponseParser implements ResponseParser<String> {
    @Override
    public void afterRequest(UriRequest uriRequest) throws Throwable {
    }

    @Override
    public void beforeRequest(UriRequest uriRequest) throws Throwable {
    }

    @Override
    public Object parse(Type type, Class cls, String str) throws Throwable {
        return parse2(type, (Class<?>) cls, str);
    }

    public Object parse2(Type type, Class<?> cls, String str) throws Throwable {
        return new Gson().fromJson(str, (Class) cls);
    }
}
