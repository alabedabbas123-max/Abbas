package org.objectweb.asm.util;

import java.util.Map;

public interface ASMifiable {
    void asmify(StringBuffer stringBuffer, String str, Map map);
}
