package com.almlkaide.kaypro.translate;

import com.almlkaide.kaypro.app.http.response.JsonResponseParser;
import java.util.List;
import org.xutils.http.annotation.HttpResponse;

@HttpResponse(parser = JsonResponseParser.class)
public class YouDaoTransltionResponse {
    private int errorCode;
    private String query;
    private List<String> translation;

    public void setTranslation(List<String> list) {
        this.translation = list;
    }

    public List<String> getTranslation() {
        return this.translation;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public String getQuery() {
        return this.query;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
