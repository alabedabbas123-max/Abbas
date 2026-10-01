package com.almlkaide.kaypro.aide.util;

import com.blankj.utilcode.util.ResourceUtils;
import com.github.megatronking.stringfog.plugin.StringFogClassInjector;
import com.github.megatronking.stringfog.plugin.StringFogMappingPrinter;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import java.io.IOException;

public class StringFog {
    public static void doFog(File file) throws Throwable {
        File bin = ProjectUtils.getBin(file);
        File binClassesRelease = ProjectUtils.getBinClassesRelease(file);
        StringFogMappingPrinter stringFogMappingPrinter = new StringFogMappingPrinter(new File(bin.getAbsolutePath(), "stringFogMapping.txt"));
        StringFogClassInjector stringFogClassInjector = new StringFogClassInjector(new String[0], "UTF-8", "com.github.megatronking.stringfog.xor.StringFogImpl", "com.github.megatronking.stringfog.xor.StringFogImpl", stringFogMappingPrinter);
        stringFogMappingPrinter.startMappingOutput();
        stringFogMappingPrinter.ouputInfo("UTF-8", "com.github.megatronking.stringfog.xor.StringFogImpl");
        stringFogClassInjector.doFog2ClassInDir(binClassesRelease);
        if (!ResourceUtils.copyFileFromAssets(Utils.getAssetsDataFile("stringfog"), binClassesRelease.getAbsolutePath())) {
            throw new IOException();
        }
    }
}
