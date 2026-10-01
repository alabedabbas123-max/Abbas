package com.almlkaide.kaypro.aide.completion.apiversion;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClassApi extends ApiInfo {
    public Map<String, ApiInfo> apiInfos = new HashMap();
    public Map<String, ApiInfo> apiInfosCache = new ConcurrentHashMap();

    public ClassApi() {
        this.type = ApiInfo.Type.CLASS;
    }

    public ApiInfo findApi(String str) {
        ApiInfo apiInfo = this.apiInfosCache.get(str);
        if (apiInfo == null && (apiInfo = this.apiInfos.get(str)) != null) {
            this.apiInfosCache.put(str, apiInfo);
        }
        return apiInfo;
    }
}
