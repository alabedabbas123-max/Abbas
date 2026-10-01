package com.github.megatronking.stringfog.plugin;

import com.github.megatronking.stringfog.plugin.utils.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

final class WhiteLists {
    private static final List<String> CLASS_WHITE_LIST = new ArrayList();

    static {
        addWhiteList("BuildConfig");
        addWhiteList("R");
        addWhiteList("R2");
        addWhiteList("StringFog");
    }

    WhiteLists() {
    }

    private static void addWhiteList(String str) {
        CLASS_WHITE_LIST.add(str);
    }

    private static boolean checkClass(String str) {
        Iterator<String> it = CLASS_WHITE_LIST.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    static boolean inWhiteList(String str) {
        return !TextUtils.isEmpty(str) && checkClass(shortClassName(str));
    }

    private static String shortClassName(String str) {
        String[] strArrSplit = trueClassName(str).split("[.]");
        return strArrSplit[strArrSplit.length - 1];
    }

    private static String trueClassName(String str) {
        return str.replace('/', FilenameUtils.EXTENSION_SEPARATOR);
    }
}
