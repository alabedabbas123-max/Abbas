package com.almlkaide.kaypro.aide.filebrowser;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.support.v4.view.ViewCompat;
import com.aide.ui.browsers.FileBrowser;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.CloseUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.blankj.utilcode.util.StringUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.caverock.androidsvg.SVG;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.aide.project.jsonbean.Project;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileBrowserAdapter {
    private static BaseAdapter sAdapter;
    private static FileBrowser sFileBrowser;
    private static ListView sListView;

    public static class ItemType {
        public static final int TYPE_GIT_REPOSITORY = 4;
        public static final int TYPE_NEW_ADD_CLASS = 1;
        public static final int TYPE_NEW_ADD_XML = 2;
        public static final int TYPE_NEW_PROJECT = 3;
    }

    public static class ViewHolder {
        public View bar_left;

        public View f4964bg;
        public ImageView icon;
        public ImageView smallicon;
        public TextView subtitle;
        public TextView title;
    }

    @Keep
    public static void OnNotifyDataSetChanged(Object obj) {
        checkAdapterAndUp(obj);
        ReflectUtils.reflect((BaseAdapter) obj).method("notifyDataSetChanged_");
    }

    private static void checkAdapterAndUp(Object obj) {
        if (sAdapter == null || sAdapter != obj) {
            sAdapter = (BaseAdapter) obj;
            sListView = (ListView) null;
            sFileBrowser = (FileBrowser) null;
        }
        if (sFileBrowser == null) {
            sFileBrowser = (FileBrowser) ReflectUtils.reflect(obj).field("Zo").get();
        }
        if (sListView == null) {
            sListView = (ListView) ReflectUtils.reflect(sFileBrowser).method("getListView").get();
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:58:0x0165  */
    /* JADX WARN: Code duplicated, block: B:60:0x016d  */
    /* JADX WARN: Code duplicated, block: B:64:0x017f A[Catch: all -> 0x0241, Throwable -> 0x0246, TRY_LEAVE, TryCatch #6 {all -> 0x0241, Throwable -> 0x0246, blocks: (B:62:0x0175, B:64:0x017f), top: B:107:0x0175 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c9  */
    @Keep
    public static View getView(Object obj, int i, View view, ViewGroup viewGroup) throws Throwable {
        File currentEditorFile;
        String name;
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        Picture pictureRenderToPicture;
        checkAdapterAndUp(obj);
        Context context = viewGroup.getContext();
        View itemView = view == null ? new ItemView(context) : view;
        FileBrowser.b bVar = (FileBrowser.b) ReflectUtils.reflect(obj).method("j6", new Object[]{new Integer(i)}).get();
        ItemView itemView2 = (ItemView) itemView;
        ViewHolder viewHolder = itemView2.viewHolder;
        viewHolder.smallicon.setVisibility(8);
        viewHolder.subtitle.setVisibility(8);
        itemView2.selected(false);
        int i2 = bVar.VH;
        String str = bVar.FH;
        Resources resources = context.getResources();
        itemView2.setItemType(0);
        if (com.almlkaide.kaypro.R.drawable.file_new == i2 && resources.getString(AideR.string.command_files_add_new_class).equals(str)) {
            itemView2.setItemType(1);
        } else if (com.almlkaide.kaypro.R.drawable.file_new == i2 && resources.getString(AideR.string.command_files_add_new_xml).equals(str)) {
            itemView2.setItemType(2);
        } else if (com.almlkaide.kaypro.R.drawable.project_new == i2 && resources.getString(AideR.string.command_files_create_new_project).equals(str)) {
            itemView2.setItemType(3);
        } else if (com.almlkaide.kaypro.R.drawable.browser_git == i2 && resources.getString(AideR.string.command_files_clone_git_repository).equals(str)) {
            itemView2.setItemType(4);
        }
        if (bVar.v5 != null && i2 != com.almlkaide.kaypro.R.drawable.folder_open) {
            File file = new File(bVar.v5);
            viewHolder.title.setText(file.getName());
            viewHolder.icon.setImageResource(i2);
            if (bVar.v5 != null) {
                File file2 = new File(file.getAbsolutePath());
                while (true) {
                    file2 = file2.getParentFile();
                    if (file2 == null) {
                        break;
                    }
                    if (file2.isFile() && (file2.getName().endsWith(".zip") || file2.getName().endsWith(".jar"))) {
                        File currentEditorFile2 = AIDEUtils.getCurrentEditorFile();
                        if (currentEditorFile2 != null) {
                            itemView2.selected(file.getAbsolutePath().equals(currentEditorFile2.getAbsolutePath()));
                        }
                    }
                }
                if (file.isDirectory()) {
                    viewHolder.smallicon.setVisibility(0);
                    viewHolder.smallicon.setImageDrawable((Drawable) null);
                    LoadIconTask.setIcon(viewHolder.smallicon, file);
                } else if (file.isFile()) {
                    currentEditorFile = AIDEUtils.getCurrentEditorFile();
                    if (currentEditorFile != null) {
                        itemView2.selected(file.getAbsolutePath().equals(currentEditorFile.getAbsolutePath()));
                    }
                    name = file.getName();
                    if (name.endsWith(".apk")) {
                        try {
                            viewHolder.icon.setImageDrawable(AppUtils.getApkInfo(file).getIcon());
                        } catch (Throwable th2) {
                            viewHolder.icon.setImageResource(i2);
                        }
                    } else if (name.endsWith(".svg")) {
                        fileInputStream = (FileInputStream) null;
                        try {
                            fileInputStream3 = new FileInputStream(file);
                            try {
                                pictureRenderToPicture = SVG.getFromInputStream(fileInputStream3).renderToPicture();
                                if (pictureRenderToPicture != null) {
                                    viewHolder.icon.setImageDrawable(new PictureDrawable(pictureRenderToPicture));
                                }
                                fileInputStream = fileInputStream3;
                            } catch (Throwable th3) {
                                fileInputStream = fileInputStream3;
                                try {
                                    viewHolder.icon.setImageResource(i2);
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileInputStream2 = fileInputStream;
                                    CloseUtils.closeIOQuietly(fileInputStream2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileInputStream2 = fileInputStream;
                        }
                        CloseUtils.closeIOQuietly(fileInputStream);
                    } else if (!name.endsWith(".png") || name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".webp")) {
                        Glide.with(context).load(file).crossFade(0).into(viewHolder.icon);
                    } else if (name.endsWith(".gif")) {
                        Glide.with(context).load(file).asGif().diskCacheStrategy(DiskCacheStrategy.SOURCE).crossFade(0).into(viewHolder.icon);
                    } else if (name.endsWith(".zip") || name.endsWith(".tar") || name.endsWith(".tar.xz") || name.endsWith(".jar")) {
                        viewHolder.icon.setImageResource(ResourceUtils.getDrawableIdByName("file_type_zip"));
                    }
                }
            } else if (file.isDirectory()) {
                viewHolder.smallicon.setVisibility(0);
                viewHolder.smallicon.setImageDrawable((Drawable) null);
                LoadIconTask.setIcon(viewHolder.smallicon, file);
            } else if (file.isFile()) {
                currentEditorFile = AIDEUtils.getCurrentEditorFile();
                if (currentEditorFile != null) {
                    itemView2.selected(file.getAbsolutePath().equals(currentEditorFile.getAbsolutePath()));
                }
                name = file.getName();
                if (name.endsWith(".apk")) {
                    viewHolder.icon.setImageDrawable(AppUtils.getApkInfo(file).getIcon());
                } else if (name.endsWith(".svg")) {
                    fileInputStream = (FileInputStream) null;
                    fileInputStream3 = new FileInputStream(file);
                    pictureRenderToPicture = SVG.getFromInputStream(fileInputStream3).renderToPicture();
                    if (pictureRenderToPicture != null) {
                        viewHolder.icon.setImageDrawable(new PictureDrawable(pictureRenderToPicture));
                    }
                    fileInputStream = fileInputStream3;
                    CloseUtils.closeIOQuietly(fileInputStream);
                } else if (!name.endsWith(".png")) {
                    Glide.with(context).load(file).crossFade(0).into(viewHolder.icon);
                } else {
                    Glide.with(context).load(file).crossFade(0).into(viewHolder.icon);
                }
            }
        } else {
            viewHolder.icon.setImageResource(i2);
            viewHolder.title.setText(str);
        }
        return itemView;
    }

    public static BaseAdapter getAdapter() {
        return sAdapter;
    }

    public static ListView getListView() {
        return sListView;
    }

    public static void notifyDataSetChanged() {
        if (sAdapter != null) {
            sAdapter.notifyDataSetChanged();
        }
    }

    private static class LoadIconTask extends AsyncTask<Void, Void, Drawable> {
        private static Map<String, Drawable> iconMaps = new ConcurrentHashMap();
        final File file;

        final ImageView f4963img;

        @Override
        protected Drawable doInBackground(Void[] voidArr) {
            return doInBackground2(voidArr);
        }

        @Override
        protected void onPostExecute(Drawable drawable) {
            onPostExecute2(drawable);
        }

        public LoadIconTask(ImageView imageView, File file) {
            this.f4963img = imageView;
            this.file = file;
        }

        public static void setIcon(ImageView imageView, File file) {
            Context context = imageView.getContext();
            if (file.getAbsolutePath().equals(ProjectUtils.getAppProjects().getAbsolutePath()) || file.getAbsolutePath().equals(new File(Environment.getExternalStorageDirectory(), ".aide").getAbsolutePath())) {
                imageView.setImageDrawable(context.getResources().getDrawable(AideR.drawable.ic_androidstudio_anglemark));
                return;
            }
            Drawable drawable = iconMaps.get(file.getAbsolutePath());
            if (drawable == null) {
                new LoadIconTask(imageView, file).execute(new Void[0]);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        private Drawable getAppIcon(String str) {
            try {
                return AppUtils.getAppIcon(str);
            } catch (Throwable th) {
                return (Drawable) null;
            }
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            this.f4963img.setTag(this.file.getAbsolutePath());
        }

        protected Drawable doInBackground2(Void[] voidArr) {
            Drawable appIcon;
            if (!this.file.isDirectory() || this.file.getName().indexOf(".") == -1 || this.file.getName().length() < 3 || (appIcon = getAppIcon(this.file.getName())) == null) {
                File parentFile = this.file.getParentFile();
                if ((parentFile != null && parentFile.isDirectory() && parentFile.getAbsolutePath().equals(Environment.getExternalStorageDirectory().getAbsolutePath())) || "/sdcard".equals(parentFile.getAbsolutePath()) || "/mnt/sdcard".equals(parentFile.getAbsolutePath())) {
                    for (String[] strArr : new String[][]{new String[]{".aide", this.f4963img.getContext().getPackageName()}, new String[]{".estrongs", "com.estrongs.android.pop"}, new String[]{"360", "com.qihoo360.mobilesafe"}, new String[]{"360LiteBrowser", "com.qihoo.contents"}, new String[]{"ADM", "com.dv.adm", "com.dv.adm.pay"}, new String[]{"Android", Project.ANDROID}, new String[]{"AndroLua", "com.androlua"}, new String[]{"alipay", "com.eg.android.AlipayGphone"}, new String[]{"BaiduNetdisk", "com.baidu.netdisk"}, new String[]{"DCIM", "com.android.camera"}, new String[]{"Download", "com.android.providers.downloads.ui"}, new String[]{"Documents", "com.google.android.documentsui"}, new String[]{"douban", "com.douban.frodo"}, new String[]{"Pictures", "com.miui.gallery"}, new String[]{"Music", "com.miui.player"}, new String[]{"tencent", "com.tencent.mobileqq", "com.tencent.qqlite", "com.tencent.tim"}, new String[]{"huluxia", "com.huati"}, new String[]{"huluxia", "com.huluxia.gametools"}, new String[]{"iFlyIME", "com.iflytek.inputmethod"}, new String[]{"NP", "player.normal.np"}, new String[]{"MT2", "bin.mt.plus"}, new String[]{"MiMarket", "com.xiaomi.market"}, new String[]{"sjly", "cn.com.shouji.market"}, new String[]{"sogou", "com.sohu.inputmethod.sogou", "com.sohu.inputmethod.sogou.xiaomi", "sogou.mobile.explorer"}, new String[]{"netease", "com.netease.cloudmusic"}, new String[]{"mangshedown", "com.msdown.lbspms"}, new String[]{"iApp", "com.iapp.app"}, new String[]{"Quark", "com.quark.browser"}, new String[]{"QQBrowser", "com.tencent.mtt"}, new String[]{"kugou", "com.kugou.android"}, new String[]{"TomVPN", "me.xhss.tomvpn"}, new String[]{"WoodenLetter", "com.One.WoodenLetter"}, new String[]{"FusionApp", "cn.coldsong.fusionapp"}, new String[]{"VMOSfiletransferstation", "com.vmos.app"}, new String[]{"TaoKDao", "tiiehenry.taokdao"}, new String[]{"JavaNIDE", "com.duy.compiler.javanide"}, new String[]{"自动精灵", "com.zdanjian.zdanjian"}}) {
                        if (strArr.length >= 2 && strArr[0].equals(this.file.getName())) {
                            for (int i = 1; i < strArr.length; i++) {
                                Drawable appIcon2 = getAppIcon(strArr[i]);
                                if (appIcon2 != null) {
                                    return appIcon2;
                                }
                            }
                        }
                    }
                }
                if (this.file.isDirectory()) {
                    Drawable projectAppIcon = getProjectAppIcon();
                    if (projectAppIcon != null) {
                        return projectAppIcon;
                    }
                } else if (this.file.isFile()) {
                }
                return (Drawable) null;
            }
            return appIcon;
        }

        private Drawable getProjectAppIcon() {
            String strGroup;
            File androidManifest;
            if (ProjectUtils.isEclipseProject(this.file)) {
                return ProjectUtils.getAppIconFromManifest(new File(this.file, "AndroidManifest.xml"));
            }
            if (ProjectUtils.isJavaProject(this.file)) {
                try {
                    return new BitmapDrawable(ImageUtils.getBitmap(Utils.getApp().getAssets().open(Utils.getAssetsDataFile("java_project.png"))));
                } catch (IOException e) {
                    return (Drawable) null;
                }
            }
            File file = new File(this.file, "AndroidManifest.xml");
            if (file.exists() && new File(this.file, "apktool.json").exists()) {
                return ProjectUtils.getAppIconFromManifest(file);
            }
            File file2 = new File(this.file, "settings.gradle");
            if (file2.exists() && new File(this.file, "build.gradle").exists()) {
                List file2List = FileIOUtils.readFile2List(file2);
                LogUtils.iTag("content", new Object[]{file2List});
                if (file2List == null || file2List.isEmpty()) {
                    strGroup = "app";
                    break;
                }
                Iterator it = file2List.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        strGroup = "app";
                        break;
                    }
                    String str = (String) it.next();
                    if (str.trim().startsWith("include")) {
                        Matcher matcher = Pattern.compile("(?<=':).*(?=')|(?<=\":).*(?=\")").matcher(str);
                        if (matcher.find()) {
                            strGroup = matcher.group();
                            if (!StringUtils.isEmpty(strGroup)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                File file3 = new File(this.file, strGroup);
                if (file3.exists() && (androidManifest = ProjectUtils.getAndroidManifest(file3)) != null && androidManifest.exists() && androidManifest.isFile()) {
                    return ProjectUtils.getAppIconFromManifest(androidManifest);
                }
            }
            return (Drawable) null;
        }

        protected void onPostExecute2(Drawable drawable) {
            ImageView imageView;
            super.onPostExecute(drawable);
            if (drawable == null || FileBrowserAdapter.getListView() == null || (imageView = (ImageView) FileBrowserAdapter.getListView().findViewWithTag(this.file.getAbsolutePath())) == null) {
                return;
            }
            iconMaps.put(this.file.getAbsolutePath(), drawable);
            imageView.setImageDrawable(drawable);
            ViewCompat.setAlpha(imageView, 0.0f);
            ViewCompat.animate(imageView).alpha(1.0f).setDuration(100).start();
        }
    }

    public static class ItemView extends RelativeLayout {

        private Context f4962ctx;
        private int itemType;
        final ItemView itemView;
        public ViewHolder viewHolder;

        public void setItemType(int i) {
            this.itemType = i;
        }

        public int getItemType() {
            return this.itemType;
        }

        int getColorAccent() {
            return Utils.getColorAccent(this.f4962ctx);
        }

        public void selected(boolean z) {
            if (z) {
                this.viewHolder.bar_left.setVisibility(0);
                this.viewHolder.f4964bg.setVisibility(0);
            } else {
                this.viewHolder.bar_left.setVisibility(8);
                this.viewHolder.f4964bg.setVisibility(8);
            }
            this.itemView.post(new Runnable(this) {
                private final ItemView this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void run() {
                }
            });
        }

        class C1677ggg extends ColorDrawable {
            private final ItemView this$0;

            public C1677ggg(ItemView itemView) {
                super(0);
                this.this$0 = itemView;
            }

            @Override
            public void draw(Canvas canvas) {
                super.draw(canvas);
                int width = canvas.getWidth();
                int height = canvas.getHeight();
                ViewGroup.LayoutParams layoutParams = this.this$0.itemView.viewHolder.f4964bg.getLayoutParams();
                layoutParams.width = width;
                layoutParams.height = height;
                this.this$0.itemView.viewHolder.f4964bg.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = this.this$0.itemView.viewHolder.bar_left.getLayoutParams();
                layoutParams2.height = height;
                this.this$0.itemView.viewHolder.bar_left.setLayoutParams(layoutParams2);
            }
        }

        public ItemView(Context context) {
            super(context);
            this.f4962ctx = context;
            this.itemView = this;
            setBackgroundDrawable(new C1677ggg(this));
            View view = new View(context);
            ColorDrawable colorDrawable = new ColorDrawable(getColorAccent());
            colorDrawable.setAlpha(60);
            view.setBackgroundDrawable(colorDrawable);
            addView(view, new RelativeLayout.LayoutParams(-1, -1));
            View view2 = new View(context);
            view2.setAlpha(0.26f);
            addView(view2, -1, -1);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(Utils.dp2px(20), Utils.dp2px(4), Utils.dp2px(10), Utils.dp2px(4));
            linearLayout.setGravity(16);
            ImageView imageView = new ImageView(context);
            imageView.setId(AideR.C1673id.filebrowserEntryFileImage);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            RelativeLayout relativeLayout = new RelativeLayout(context);
            int iDp2px = Utils.dp2px(34);
            relativeLayout.addView(imageView, iDp2px, iDp2px);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Utils.dp2px(16), Utils.dp2px(16));
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iDp2px / 2;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iDp2px / 2;
            relativeLayout.addView(imageView2, layoutParams);
            linearLayout.addView(relativeLayout, iDp2px, iDp2px);
            TextView textView = new TextView(context);
            textView.setId(AideR.C1673id.filebrowserEntryName);
            textView.setTextAppearance(context, R.style.TextAppearance.Large);
            textView.setTextSize(16);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            TextView textView2 = new TextView(context);
            textView2.setTextAppearance(context, R.style.TextAppearance.Small);
            textView2.setTextSize(12);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setPadding(Utils.dp2px(6), 0, 0, 0);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(textView, -1, -2);
            linearLayout2.addView(textView2, -1, -2);
            linearLayout.addView(linearLayout2, -1, -2);
            View view3 = new View(context);
            view3.setBackgroundColor(getColorAccent());
            addView(linearLayout, -1, -2);
            addView(view3, Utils.dp2px(4), 0);
            this.viewHolder = new ViewHolder();
            this.viewHolder.bar_left = view3;
            this.viewHolder.f4964bg = view;
            this.viewHolder.icon = imageView;
            this.viewHolder.smallicon = imageView2;
            this.viewHolder.title = textView;
            this.viewHolder.subtitle = textView2;
            setGravity(19);
        }
    }
}
