package com.caverock.androidsvg;

import android.content.Context;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

@SuppressWarnings("JavaDoc")
public class SVGImageView extends ImageView {
    private static Method setLayerTypeMethod;
    private RenderOptions renderOptions;

    private SVG f4756svg;

    private class LoadResourceTask extends AsyncTask<Integer, Integer, SVG> {
        private Context context;
        private int resourceId;
        private final SVGImageView this$0;

        LoadResourceTask(SVGImageView sVGImageView, Context context, int i) {
            this.this$0 = sVGImageView;
            this.context = context;
            this.resourceId = i;
        }

        protected SVG doInBackground2(Integer... numArr) {
            try {
                return SVG.getFromResource(this.context, this.resourceId);
            } catch (SVGParseException e) {
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", new Integer(this.resourceId), e.getMessage()));
                return (SVG) null;
            }
        }

        @Override
        protected SVG doInBackground(Integer[] numArr) {
            return doInBackground2(numArr);
        }

        protected void onPostExecute2(SVG c1580svg) {
            this.this$0.f4756svg = c1580svg;
            this.this$0.doRender();
        }

        @Override
        protected void onPostExecute(SVG c1580svg) {
            onPostExecute2(c1580svg);
        }
    }

    private class LoadURITask extends AsyncTask<InputStream, Integer, SVG> {
        private final SVGImageView this$0;

        public LoadURITask(SVGImageView sVGImageView) {
            this.this$0 = sVGImageView;
        }

        protected SVG doInBackground2(InputStream... inputStreamArr) {
            SVG fromInputStream;
            try {
                try {
                    fromInputStream = SVG.getFromInputStream(inputStreamArr[0]);
                    try {
                        inputStreamArr[0].close();
                    } catch (IOException e) {
                    }
                } catch (Throwable th) {
                    try {
                        inputStreamArr[0].close();
                    } catch (IOException e2) {
                    }
                    throw th;
                }
            } catch (SVGParseException e3) {
                Log.e("SVGImageView", new StringBuffer().append("Parse error loading URI: ").append(e3.getMessage()).toString());
                try {
                    inputStreamArr[0].close();
                } catch (IOException e4) {
                }
                fromInputStream = (SVG) null;
            }
            return fromInputStream;
        }

        @Override
        protected SVG doInBackground(InputStream[] inputStreamArr) {
            return doInBackground2(inputStreamArr);
        }

        protected void onPostExecute2(SVG c1580svg) {
            this.this$0.f4756svg = c1580svg;
            this.this$0.doRender();
        }

        @Override
        protected void onPostExecute(SVG c1580svg) {
            onPostExecute2(c1580svg);
        }
    }

    static {
        setLayerTypeMethod = (Method) null;
        try {
            try {
                try {
                    setLayerTypeMethod = Class.forName("android.view.View").getMethod("setLayerType", Integer.TYPE, Class.forName("android.graphics.Paint"));
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            } catch (ClassNotFoundException e2) {
                throw new NoClassDefFoundError(e2.getMessage());
            }
        } catch (NoSuchMethodException e3) {
        }
    }

    public SVGImageView(Context context) {
        super(context);
        this.f4756svg = (SVG) null;
        this.renderOptions = new RenderOptions();
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4756svg = (SVG) null;
        this.renderOptions = new RenderOptions();
        init(attributeSet, 0);
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4756svg = (SVG) null;
        this.renderOptions = new RenderOptions();
        init(attributeSet, i);
    }

    private void init(AttributeSet attributeSet, int i) {
    }

    private boolean internalSetImageAsset(String str) {
        try {
            new LoadURITask(this).execute(getContext().getAssets().open(str));
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private boolean internalSetImageURI(Uri uri) {
        try {
            new LoadURITask(this).execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    private void setFromString(String str) {
        try {
            this.f4756svg = SVG.getFromString(str);
            doRender();
        } catch (SVGParseException e) {
            Log.e("SVGImageView", new StringBuffer().append("Could not find SVG at: ").append(str).toString());
        }
    }

    private void setSoftwareLayerType() {
        if (setLayerTypeMethod == null) {
            return;
        }
        try {
            try {
                setLayerTypeMethod.invoke(this, new Integer(Class.forName("android.view.View").getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), (Object) null);
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        } catch (Exception e2) {
            Log.w("SVGImageView", "Unexpected failure calling setLayerType", e2);
        }
    }

    public void doRender() {
        if (this.f4756svg == null) {
            return;
        }
        Picture pictureRenderToPicture = this.f4756svg.renderToPicture(this.renderOptions);
        setSoftwareLayerType();
        setImageDrawable(new PictureDrawable(pictureRenderToPicture));
    }

    public void setCSS(String str) {
        this.renderOptions.m7051css(str);
        doRender();
    }

    public void setImageAsset(String str) {
        if (internalSetImageAsset(str)) {
            return;
        }
        Log.e("SVGImageView", new StringBuffer().append("File not found: ").append(str).toString());
    }

    @Override
    public void setImageResource(int i) {
        new LoadResourceTask(this, getContext(), i).execute(new Integer[0]);
    }

    @Override
    public void setImageURI(Uri uri) {
        if (internalSetImageURI(uri)) {
            return;
        }
        Log.e("SVGImageView", new StringBuffer().append("File not found: ").append(uri).toString());
    }

    public void setSVG(SVG c1580svg) {
        if (c1580svg == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        }
        this.f4756svg = c1580svg;
        doRender();
    }

    public void setSVG(SVG c1580svg, String str) {
        if (c1580svg == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        }
        this.f4756svg = c1580svg;
        this.renderOptions.m7051css(str);
        doRender();
    }
}
