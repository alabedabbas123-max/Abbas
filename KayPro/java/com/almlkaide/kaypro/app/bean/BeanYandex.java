package com.almlkaide.kaypro.app.bean;

import com.almlkaide.kaypro.app.http.response.JsonResponseParser;
import java.util.List;
import org.xutils.http.annotation.HttpResponse;

@HttpResponse(parser = JsonResponseParser.class)
public class BeanYandex {
    private int code;
    private String lang;
    private String message;
    private List<String> text;

    public void setCode(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public String getLang() {
        return this.lang;
    }

    public void setText(List<String> list) {
        this.text = list;
    }

    public List<String> getText() {
        return this.text;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessage(int i) {
        if (i == 401) {
            return "无效的API密钥";
        }
        if (i == 402) {
            return "封锁的API密钥";
        }
        if (i == 404) {
            return "超出每日翻译量限制";
        }
        if (i == 413) {
            return "超过最大文字大小";
        }
        if (i == 422) {
            return "文字无法翻译";
        }
        if (i == 501) {
            return "不支持指定的翻译方向";
        }
        return this.message;
    }

    public boolean isSuccess() {
        return 200 == getCode();
    }

    public String getErrorMessage() {
        return getMessage(getCode());
    }
}
