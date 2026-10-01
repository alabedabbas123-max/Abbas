package com.almlkaide.kaypro.translate;

import org.xutils.x;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;

public class YouDaoTranslation {

    public interface OnTranslationCallback {
        void onError(Throwable th);

        void onResult(YouDaoTransltionResponse youDaoTransltionResponse);

        void onStart();
    }

    public static void request(String str, OnTranslationCallback onTranslationCallback) {
        RequestParams requestParams = new RequestParams("http://fanyi.youdao.com/openapi.do?keyfrom=ucweb123&key=1077957012&type=data&doctype=json&version=1.1");
        requestParams.addQueryStringParameter("q", str);
        onTranslationCallback.onStart();
        ClassX.http().mo9034get(requestParams, new TranslationCallback(onTranslationCallback));
    }

    static class TranslationCallback implements Callback.CommonCallback<YouDaoTransltionResponse> {
        OnTranslationCallback mOnTranslationCallback;

        @Override
        public void onCancelled(Callback.CancelledException cancelledException) {
        }

        @Override
        public void onFinished() {
        }

        @Override
        public void onSuccess(YouDaoTransltionResponse youDaoTransltionResponse) {
            onSuccess2(youDaoTransltionResponse);
        }

        public TranslationCallback(OnTranslationCallback onTranslationCallback) {
            this.mOnTranslationCallback = onTranslationCallback;
        }

        public void onSuccess2(YouDaoTransltionResponse youDaoTransltionResponse) {
            this.mOnTranslationCallback.onResult(youDaoTransltionResponse);
        }

        @Override
        public void onError(Throwable th, boolean z) {
            this.mOnTranslationCallback.onError(th);
        }
    }
}
