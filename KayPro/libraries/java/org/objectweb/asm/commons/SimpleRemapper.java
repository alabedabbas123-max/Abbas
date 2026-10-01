package org.objectweb.asm.commons;

import java.util.Collections;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;

public class SimpleRemapper extends Remapper {
    private final Map mapping;

    public SimpleRemapper(String str, String str2) {
        this.mapping = Collections.singletonMap(str, str2);
    }

    public SimpleRemapper(Map map) {
        this.mapping = map;
    }

    @Override
    public String mo9021map(String str) {
        return (String) this.mapping.get(str);
    }

    @Override
    public String mapFieldName(String str, String str2, String str3) {
        String strMo9021map = mo9021map(new StringBuffer().append(str).append(FilenameUtils.EXTENSION_SEPARATOR).append(str2).toString());
        return strMo9021map == null ? str2 : strMo9021map;
    }

    @Override
    public String mapInvokeDynamicMethodName(String str, String str2) {
        String strMo9021map = mo9021map(new StringBuffer().append(FilenameUtils.EXTENSION_SEPARATOR).append(str).append(str2).toString());
        return strMo9021map == null ? str : strMo9021map;
    }

    @Override
    public String mapMethodName(String str, String str2, String str3) {
        String strMo9021map = mo9021map(new StringBuffer().append(str).append(FilenameUtils.EXTENSION_SEPARATOR).append(str2).append(str3).toString());
        return strMo9021map == null ? str2 : strMo9021map;
    }
}
