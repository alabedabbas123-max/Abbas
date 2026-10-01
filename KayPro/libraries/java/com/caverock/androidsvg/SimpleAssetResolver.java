package com.caverock.androidsvg;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

public class SimpleAssetResolver extends SVGExternalFileResolver {

    private static final String f4778TAG = "SimpleAssetResolver";
    private static final Set<String> supportedFormats = new HashSet(8);
    private AssetManager assetManager;

    static {
        supportedFormats.add("image/svg+xml");
        supportedFormats.add("image/jpeg");
        supportedFormats.add("image/png");
        supportedFormats.add("image/pjpeg");
        supportedFormats.add("image/gif");
        supportedFormats.add("image/bmp");
        supportedFormats.add("image/x-windows-bmp");
        if (Build.VERSION.SDK_INT >= 14) {
            supportedFormats.add("image/webp");
        }
    }

    public SimpleAssetResolver(AssetManager assetManager) {
        this.assetManager = assetManager;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private String getAssetAsString(String str) throws Throwable {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        InputStream inputStream3 = (InputStream) null;
        try {
            InputStream inputStreamOpen = this.assetManager.open(str);
            try {
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen, Charset.forName("UTF-8"));
                    char[] cArr = new char[4096];
                    StringBuilder sb = new StringBuilder();
                    for (int i = inputStreamReader.read(cArr); i > 0; i = inputStreamReader.read(cArr)) {
                        sb.append(cArr, 0, i);
                    }
                    String string = sb.toString();
                    if (inputStreamOpen == null) {
                        return string;
                    }
                    try {
                        inputStreamOpen.close();
                        return string;
                    } catch (IOException e) {
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStreamOpen;
                    inputStream3 = inputStream2;
                    th = th;
                    if (inputStream3 != null) {
                        try {
                            inputStream3.close();
                        } catch (IOException e2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                inputStream = inputStreamOpen;
                try {
                    String str2 = (String) null;
                    if (inputStream == null) {
                        return str2;
                    }
                    try {
                        inputStream.close();
                        return str2;
                    } catch (IOException e4) {
                        return str2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream2 = inputStream;
                    inputStream3 = inputStream2;
                    th = th;
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    throw th;
                }
            }
        } catch (IOException e5) {
            inputStream = inputStream3;
        } catch (Throwable th4) {
            th = th4;
            if (inputStream3 != null) {
                inputStream3.close();
            }
            throw th;
        }
    }

    @Override
    public boolean isFormatSupported(String str) {
        return supportedFormats.contains(str);
    }

    @Override
    public String resolveCSSStyleSheet(String str) {
        Log.i(f4778TAG, new StringBuffer().append(new StringBuffer().append("resolveCSSStyleSheet(").append(str).toString()).append(")").toString());
        return getAssetAsString(str);
    }

    @Override
    public Typeface resolveFont(String str, int i, String str2) {
        Log.i(f4778TAG, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("resolveFont(").append(str).toString()).append(",").toString()).append(i).toString()).append(",").toString()).append(str2).toString()).append(")").toString());
        try {
            return Typeface.createFromAsset(this.assetManager, new StringBuffer().append(str).append(".ttf").toString());
        } catch (RuntimeException e) {
            try {
                return Typeface.createFromAsset(this.assetManager, new StringBuffer().append(str).append(".otf").toString());
            } catch (RuntimeException e2) {
                return (Typeface) null;
            }
        }
    }

    @Override
    public Bitmap resolveImage(String str) {
        Log.i(f4778TAG, new StringBuffer().append(new StringBuffer().append("resolveImage(").append(str).toString()).append(")").toString());
        try {
            return BitmapFactory.decodeStream(this.assetManager.open(str));
        } catch (IOException e) {
            return (Bitmap) null;
        }
    }
}
