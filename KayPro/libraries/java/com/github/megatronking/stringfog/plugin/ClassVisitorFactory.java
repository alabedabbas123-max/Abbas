package com.github.megatronking.stringfog.plugin;

import com.github.megatronking.stringfog.IStringFog;
import com.github.megatronking.stringfog.plugin.utils.Log;
import com.github.megatronking.stringfog.plugin.utils.TextUtils;
import org.apache.commons.io.FilenameUtils;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public final class ClassVisitorFactory {
    ClassVisitorFactory() {
    }

    public static ClassVisitor create(IStringFog iStringFog, StringFogMappingPrinter stringFogMappingPrinter, String[] strArr, String str, String str2, String str3, ClassWriter classWriter) {
        if (WhiteLists.inWhiteList(str3) || !isInFogPackages(strArr, str3)) {
            Log.m7062v(new StringBuffer().append("StringFog ignore: ").append(str3).toString());
            return createEmpty(classWriter);
        }
        Log.m7062v(new StringBuffer().append("StringFog execute: ").append(str3).toString());
        return new StringFogClassVisitor(iStringFog, stringFogMappingPrinter, str2, str, classWriter);
    }

    private static ClassVisitor createEmpty(ClassWriter classWriter) {
        return new ClassVisitor(Opcodes.ASM5, classWriter) {
        };
    }

    private static boolean isInFogPackages(String[] strArr, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (strArr == null || strArr.length == 0) {
            return true;
        }
        for (String str2 : strArr) {
            if (str.replace('/', FilenameUtils.EXTENSION_SEPARATOR).startsWith(new StringBuffer().append(str2).append(".").toString())) {
                return true;
            }
        }
        return false;
    }
}
