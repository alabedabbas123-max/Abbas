package com.almlkaide.kaypro.aide.completion.translate;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ScrollView;
import android.widget.TextView;
import com.aide.engine.SourceEntity;
import com.aide.ui.MainActivity;
import com.aide.ui.views.CompletionListView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.blankj.utilcode.util.StringUtils;
import com.almlkaide.kaypro.aide.AdvancedSetting;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.translate.TUtil;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import org.apache.commons.io.IOUtils;
import org.xutils.x;
import org.xutils.DbManager;
import org.xutils.ex.DbException;

public class TranslateUtils {
    public static final int STATE_FAILED = -1;
    public static final int STATE_START = 0;
    public static final int STATE_SUCCESS = 1;
    private static String lang = "auto";
    private static String targetLang = "zh";

    public static DbManager f4956db = (DbManager) null;

    public static void setTargetLang(String str) {
        targetLang = str;
    }

    public static String getTargetLang() {
        return targetLang;
    }

    public static void setLang(String str) {
        lang = str;
    }

    public static String getLang() {
        return lang;
    }

    private static void requestTranslate(TextView textView, String str) {
        Translate.youdaoTranslate(str);
    }

    public static String wordSegmentation(String str) {
        int iLastIndexOf = str.lastIndexOf(" - ");
        if (iLastIndexOf >= 0) {
            str = str.substring(0, iLastIndexOf);
        }
        return TUtil.wordSegmentation(str);
    }

    public static DbManager getDb() {
        if (f4956db == null) {
            try {
                f4956db = ClassX.getDb(new DbManager.DaoConfig().setDbName(getDbFile().getName()).setDbDir(getDbFile().getParentFile()).setDbVersion(1).setDbOpenListener(new DbManager.DbOpenListener() {
                    @Override
                    public void onDbOpened(DbManager dbManager) {
                        dbManager.getDatabase().enableWriteAheadLogging();
                        LogUtils.iTag("DbOpen", new Object[]{dbManager});
                    }
                }).setDbUpgradeListener(new DbManager.DbUpgradeListener() {
                    @Override
                    public void onUpgrade(DbManager dbManager, int i, int i2) {
                    }
                }));
            } catch (Throwable th) {
                LogUtils.e(new Object[]{th});
            }
        }
        return f4956db;
    }

    public static File getDbFile() {
        String string = Utils.getSp().getString("translate_file", (String) null);
        if (!TextUtils.isEmpty(string)) {
            try {
                return new File(string);
            } catch (Throwable th) {
                LogUtils.eTag("GetDbFile Exception", new Object[]{th});
            }
        }
        return Utils.getSdDataFile("translate/translate.db");
    }

    public static void onItemLongClick(CompletionListView completionListView, SourceEntity sourceEntity, View view, int i) {
        BaseAdapter baseAdapter = (BaseAdapter) completionListView.getAdapter();
        MainActivity mainActivity = AIDEUtils.getMainActivity();
        PopupMenu popupMenu = new PopupMenu(mainActivity, view);
        Menu menu = popupMenu.getMenu();
        if (AdvancedSetting.isEnableTranslate()) {
            TextView textView = (TextView) view.findViewById(AideR.C1673id.completionEntryName);
            String strSubString = Utils.subString(textView.getText().toString(), (String) null, IOUtils.LINE_SEPARATOR_UNIX);
            String string = strSubString == null ? textView.getText().toString() : strSubString;
            TranslateTable translateTableQuery = query(string);
            menu.add((translateTableQuery == null || translateTableQuery.getState() != 1) ? "翻译内容" : "修正翻译").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(mainActivity, translateTableQuery, string, baseAdapter) {
                private final BaseAdapter val$adapter;
                private final Context val$context;
                private final TranslateTable val$items;
                private final String val$source;

                {
                    this.val$context = mainActivity;
                    this.val$items = translateTableQuery;
                    this.val$source = string;
                    this.val$adapter = baseAdapter;
                }

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    ScrollView scrollView = new ScrollView(this.val$context);
                    LinearLayout linearLayout = new LinearLayout(this.val$context);
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(Utils.dp2px(24), Utils.dp2px(10), Utils.dp2px(24), 0);
                    EditText editText = new EditText(this.val$context);
                    editText.setText(this.val$items == null ? this.val$source : this.val$items.getSource());
                    editText.setMaxLines(2);
                    editText.setEllipsize(TextUtils.TruncateAt.END);
                    TextView textView2 = new TextView(this.val$context);
                    textView2.setText("翻译后：");
                    textView2.setPadding(0, Utils.dp2px(16), 0, Utils.dp2px(5));
                    EditText editText2 = new EditText(this.val$context);
                    if (this.val$items != null && this.val$items.getState() == 1) {
                        editText2.setText(this.val$items.getTranslation());
                    }
                    linearLayout.addView(editText);
                    linearLayout.addView(textView2);
                    linearLayout.addView(editText2);
                    scrollView.addView(linearLayout, -1, -1);
                    scrollView.setFillViewport(true);
                    new AlertDialog.Builder(AIDEUtils.getMainActivity()).setTitle(menuItem.getTitle()).setView(scrollView).setPositiveButton("保存", new DialogInterface.OnClickListener(this, editText2, this.val$source, this.val$adapter) {
                        private final AnonymousClass100000004 this$0;
                        private final BaseAdapter val$adapter;
                        private final EditText val$editor;
                        private final String val$source;

                        {
                            this.this$0 = this;
                            this.val$editor = editText2;
                            this.val$source = str;
                            this.val$adapter = baseAdapter;
                        }

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i2) {
                            String string2 = this.val$editor.getText().toString();
                            TranslateTable translateTableQuery2 = TranslateUtils.query(this.val$source);
                            if (translateTableQuery2 == null) {
                                try {
                                    TranslateTable translateTable = new TranslateTable();
                                    translateTable.setSource(this.val$source);
                                    translateTable.setTranslation(string2);
                                    translateTable.setState(1);
                                    TranslateUtils.getDb().saveBindingId(translateTable);
                                    this.val$adapter.notifyDataSetChanged();
                                    return;
                                } catch (Exception e) {
                                    Utils.toast(e.toString());
                                    return;
                                }
                            }
                            translateTableQuery2.setTranslation(string2);
                            translateTableQuery2.setState(1);
                            TranslateUtils.update(translateTableQuery2);
                            this.val$adapter.notifyDataSetChanged();
                        }
                    }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
                    editText2.selectAll();
                    editText2.requestFocus();
                    editText2.post(new Runnable(this, editText2) {
                        private final AnonymousClass100000004 this$0;
                        private final EditText val$editor;

                        {
                            this.this$0 = this;
                            this.val$editor = editText2;
                        }

                        @Override
                        public void run() {
                            KeyboardUtils.showSoftInput(this.val$editor);
                        }
                    });
                    return false;
                }
            });
            if (translateTableQuery != null) {
                menu.add("删除翻译").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(translateTableQuery, baseAdapter) {
                    private final BaseAdapter val$adapter;
                    private final TranslateTable val$items;

                    {
                        this.val$items = translateTableQuery;
                        this.val$adapter = baseAdapter;
                    }

                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        try {
                            TranslateUtils.getDb().delete(this.val$items);
                            this.val$adapter.notifyDataSetChanged();
                        } catch (DbException e) {
                            LogUtils.eTag("Delete DbException", new Object[]{e});
                        }
                        return false;
                    }
                });
            }
        }
        menu.add(Utils.isCN() ? "查看文档" : "View Document").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(mainActivity, sourceEntity) {
            private final Context val$context;
            private final SourceEntity val$sourceEntity;

            {
                this.val$context = mainActivity;
                this.val$sourceEntity = sourceEntity;
            }

            private void openBrowser(String str, String str2) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str2));
                this.val$context.startActivity(Intent.createChooser(intent, str));
                LogUtils.i(new Object[]{str2});
            }

            private void viewDoc(String str, String str2) {
                openBrowser(str, new StringBuffer().append("https://developer.android.com/reference/").append(str2).toString());
            }

            public void viewChineseDoc(String str, String str2) {
                openBrowser(str, new StringBuffer().append("https://developer.android.google.cn/reference/").append(str2).toString());
            }

            public void viewChineseDoc2(String str, String str2) {
                openBrowser(str, new StringBuffer().append("http://www.android-doc.com/reference/").append(str2).toString());
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String str = (String) ReflectUtils.reflect(this.val$sourceEntity).field("BT").get();
                if (Utils.isCN()) {
                    new AlertDialog.Builder(this.val$context).setTitle(menuItem.getTitle()).setItems(new String[]{"Android Api", "Android Api (国内)"}, new DialogInterface.OnClickListener(this, menuItem, str) {
                        private final AnonymousClass100000007 this$0;
                        private final MenuItem val$p1;
                        private final String val$path;

                        {
                            this.this$0 = this;
                            this.val$p1 = menuItem;
                            this.val$path = str;
                        }

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i2) {
                            switch (i2) {
                                case 0:
                                    viewChineseDoc(this.val$p1.getTitle().toString(), this.val$path);
                                    break;
                                case 1:
                                    viewChineseDoc2(this.val$p1.getTitle().toString(), this.val$path);
                                    break;
                            }
                        }
                    }).create().show();
                } else {
                    viewDoc(menuItem.getTitle().toString(), str);
                }
                return false;
            }
        }).setVisible(sourceEntity != null);
        popupMenu.show();
    }

    public static void translate(TextView textView, String str, TextView textView2, Object obj) {
        try {
            TranslateTable translateTableQuery = query(str);
            if (Utils.getSp().getBoolean("not_translate", false)) {
                if (translateTableQuery != null && translateTableQuery.getState() == 1) {
                    appendText(textView, translateTableQuery.getTranslation(), textView2, obj);
                    return;
                }
                return;
            }
            if (translateTableQuery == null) {
                TranslateTable translateTable = new TranslateTable();
                translateTable.setSource(str);
                translateTable.setTranslation("");
                translateTable.setState(0);
                getDb().saveBindingId(translateTable);
                appendText(textView, "已写入数据，请滑动列表进行翻译。", textView2, obj);
                requestTranslate(textView, str);
                return;
            }
            if (translateTableQuery.getState() == 1) {
                appendText(textView, translateTableQuery.getTranslation(), textView2, obj);
                return;
            }
            if (translateTableQuery.getState() == 0) {
                appendText(textView, "正在翻译中...", textView2, obj);
                requestTranslate(textView, str);
            } else if (translateTableQuery.getState() == -1) {
                String translation = translateTableQuery.getTranslation();
                if (TextUtils.isEmpty(translation)) {
                    appendText(textView, "翻译失败", textView2, obj);
                } else {
                    appendText(textView, translation, textView2, obj);
                }
                requestTranslate(textView, str);
            }
        } catch (Throwable th) {
            LogUtils.eTag("Translate DbException", new Object[]{th});
        }
    }

    public static void update(TranslateTable translateTable) {
        try {
            getDb().update(translateTable, new String[0]);
        } catch (DbException e) {
            LogUtils.eTag("Update DbException", new Object[]{e});
        }
    }

    public static TranslateTable query(String str) {
        try {
            try {
                return (TranslateTable) getDb().selector(Class.forName("com.almlkaide.kaypro.aide.completion.translate.TranslateTable")).where("source", "=", str).findFirst();
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        } catch (Throwable th) {
            LogUtils.eTag("Query DbException", new Object[]{th});
            return (TranslateTable) null;
        }
    }

    private static void appendText(TextView textView, String str, TextView textView2, Object obj) {
        if (!StringUtils.isTrimEmpty(str)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(-5592406), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            textView.setText(spannableStringBuilder);
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
            }
        }
    }
}
