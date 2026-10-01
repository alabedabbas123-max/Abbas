package com.github.megatronking.svg.generator.svg.utils;

import com.baidu.mobstat.Config;
import com.github.megatronking.svg.generator.svg.css.CSSParser;
import com.github.megatronking.svg.generator.svg.css.CSSParserCallback;
import com.github.megatronking.svg.generator.utils.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class StyleUtils {

    private static class CSSParserCallbackImpl implements CSSParserCallback {
        private boolean isInRule;

        private Map<String, Map<String, String>> f4800map;
        private String propertySave;
        private Map<String, String> styleMap;

        CSSParserCallbackImpl(Map<String, Map<String, String>> map) {
            this.f4800map = map;
        }

        @Override
        public void endRule() {
            this.isInRule = false;
            this.styleMap = (Map) null;
            this.propertySave = (String) null;
        }

        @Override
        public void handleImport(String str) {
        }

        @Override
        public void handleProperty(String str) {
            if (TextUtils.isEmpty(str) || !this.isInRule || this.styleMap == null || this.propertySave != null) {
                return;
            }
            this.propertySave = str.trim();
        }

        @Override
        public void handleSelector(String str) {
            if (TextUtils.isEmpty(str) || this.isInRule) {
                this.styleMap = (Map) null;
            } else {
                this.styleMap = new HashMap();
                this.f4800map.put(str, this.styleMap);
            }
            this.propertySave = (String) null;
        }

        @Override
        public void handleValue(String str) {
            if (TextUtils.isEmpty(str) || !this.isInRule || this.styleMap == null || this.propertySave == null) {
                return;
            }
            this.styleMap.put(this.propertySave, str.trim());
            this.propertySave = (String) null;
        }

        @Override
        public void startRule() {
            this.isInRule = true;
            this.propertySave = (String) null;
        }
    }

    public static Map<String, String> convertStyleString2Map(String str) {
        if (TextUtils.isEmpty(str)) {
            return (Map) null;
        }
        HashMap map = new HashMap();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.split(Config.TRACE_TODAY_VISIT_SPLIT);
            if (strArrSplit.length == 2) {
                map.put(strArrSplit[0].trim(), strArrSplit[1].trim());
            }
        }
        return map;
    }

    public static void fill2Map(String str, Map<String, Map<String, String>> map) {
        if (TextUtils.isEmpty(str) || map == null) {
            return;
        }
        try {
            new CSSParser().parse(str, new CSSParserCallbackImpl(map), false);
        } catch (Exception e) {
        }
    }
}
