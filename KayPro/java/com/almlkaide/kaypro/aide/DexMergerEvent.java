package com.almlkaide.kaypro.aide;

import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.almlkaide.kaypro.aide.api.SimpleIMainActivity;
import com.almlkaide.kaypro.android.dexmerger.ApkDexMerger;
import com.almlkaide.kaypro.android.dx.command.dexer.DxContext;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;

public class DexMergerEvent extends SimpleIMainActivity {
    @Override
    public void onBeforeSigningAPK(File file, Object obj) throws Throwable {
        int size;
        Throwable th;
        DxContext dxContext;
        LogUtils.i(new Object[]{file, obj});
        if (Utils.getSp().getBoolean("adset_use_dexmerger", true)) {
            LogUtils.i(new Object[]{"### dexMerger Start  ###"});
            try {
                size = ApkDexMerger.getClassesDexPathsFormApk(file).size();
            } catch (Throwable th2) {
                LogUtils.iTag("GetDexCountError", new Object[]{th2});
                size = 0;
            }
            LogUtils.iTag("DexCount", new Object[]{new Integer(size)});
            if (size > 1) {
                updateBuildDialog(obj, Utils.isCN() ? "重新合并Dex中" : "Mergeing Dex");
                DxContext dxContext2 = (DxContext) null;
                try {
                    dxContext = new DxContext();
                    try {
                        new ApkDexMerger(dxContext, file).merger(file);
                        dxContext2 = dxContext;
                    } catch (Throwable th3) {
                        th = th3;
                        if (dxContext != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                if (dxContext2 != null) {
                }
            }
            LogUtils.i(new Object[]{"### dexMerger End  ###"});
        }
    }

    protected void updateBuildDialog(Object obj, String str) {
        try {
            ReflectUtils.reflect(obj).method("j6", new Object[]{str, new Integer(60)});
        } catch (Throwable th) {
        }
    }
}
