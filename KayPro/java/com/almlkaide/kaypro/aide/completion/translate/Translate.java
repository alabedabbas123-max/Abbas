package com.almlkaide.kaypro.aide.completion.translate;

import com.almlkaide.kaypro.translate.YouDaoTranslation;
import com.almlkaide.kaypro.translate.YouDaoTransltionResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Translate {
    private static final Map<String, Integer> STATUS = new ConcurrentHashMap();
    static final int STATUS_TRANSLATEING = 1;
    static final int STATUS_TRANSLATE_FINISH = 2;

    public static void youdaoTranslate(String str) {
        if (!STATUS.containsKey(str) || STATUS.get(str).intValue() != 1) {
            YouDaoTranslation.request(TranslateUtils.wordSegmentation(str), new YouDaoTranslation.OnTranslationCallback(str) {
                private final String val$content;

                {
                    this.val$content = str;
                }

                @Override
                public void onStart() {
                    Translate.STATUS.put(this.val$content, new Integer(1));
                }

                @Override
                public void onResult(YouDaoTransltionResponse youDaoTransltionResponse) {
                    if (youDaoTransltionResponse == null) {
                        onError(new IllegalArgumentException("response == null"));
                        return;
                    }
                    Translate.STATUS.remove(this.val$content);
                    TranslateTable translateTableQuery = TranslateUtils.query(this.val$content);
                    if (translateTableQuery != null && translateTableQuery.getState() != 1) {
                        List<String> translation = youDaoTransltionResponse.getTranslation();
                        if (translation == null || translation.isEmpty()) {
                            translateTableQuery.setState(-1);
                        } else {
                            translateTableQuery.setTranslation(translation.get(0));
                            translateTableQuery.setState(1);
                        }
                        TranslateUtils.update(translateTableQuery);
                    }
                }

                @Override
                public void onError(Throwable th) {
                    Translate.STATUS.remove(this.val$content);
                    TranslateTable translateTableQuery = TranslateUtils.query(this.val$content);
                    if (translateTableQuery != null && translateTableQuery.getState() != 1) {
                        translateTableQuery.setState(-1);
                        TranslateUtils.update(translateTableQuery);
                    }
                }
            });
        }
    }
}
