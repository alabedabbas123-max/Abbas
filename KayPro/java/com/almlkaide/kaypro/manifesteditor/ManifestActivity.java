package com.almlkaide.kaypro.manifesteditor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.core.provider.FontsContractCompat;
import com.ClassA;
import com.aide.ui.ThemedActionbarActivity;
import com.baidu.mobstat.Config;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class ManifestActivity extends ThemedActionbarActivity implements DialogInterface.OnClickListener, AdapterView.OnItemClickListener {

    public static final List f3512a;

    private static XmlPullParserFactory f3513e;

    private static int[] f3514k;

    Enume f3515b;

    boolean f3516c;

    ClassG f3517d;

    private ListView f3518f;

    private ClassG f3519g;

    private ClassA f3520h;

    private String f3521i;

    private EditText f3522j;

    static {
        try {
            f3513e = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            f3513e = null;
        }
        f3512a = new ArrayList();
        ClassF.m5796a(f3512a);
    }

    static int[] m5529b() {
        int[] iArr = f3514k;
        if (iArr == null) {
            iArr = new int[Enume.valuesCustom().length];
            try {
                iArr[Enume.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Enume.READ.ordinal()] = 3;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Enume.SAVE.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Enume.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            f3514k = iArr;
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void m5530c() {
        try {
            this.f3516c = false;
            FileInputStream fileInputStream = new FileInputStream(this.f3521i);
            XmlPullParser xmlPullParserNewPullParser = f3513e.newPullParser();
            xmlPullParserNewPullParser.setInput(fileInputStream, "utf-8");
            this.f3519g = new ClassG(null);
            this.f3519g.m5805a(xmlPullParserNewPullParser, xmlPullParserNewPullParser.getEventType());
            fileInputStream.close();
            ArrayList arrayList = new ArrayList();
            this.f3519g.m5804a(arrayList, "manifest", "uses-permission");
            this.f3520h.m5537a(arrayList);
            this.f3518f.setAdapter((ListAdapter) this.f3520h);
        } catch (Exception e) {
            StringBuffer stringBuffer = new StringBuffer(e.getMessage());
            stringBuffer.append(":\n");
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.toString());
            }
            new AlertDialog.Builder(this).setTitle("错误").setMessage(stringBuffer.toString()).setPositiveButton("确定", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void m5531d() {
        LinearLayout linearLayout = new LinearLayout(this);
        EditText editText = new EditText(this);
        ListView listView = new ListView(this);
        editText.setHint("输入搜索内容，如'WRITE_EXTERNAL_STORAGE'");
        linearLayout.setOrientation(1);
        linearLayout.addView(editText);
        linearLayout.addView(listView);
        DialogInterfaceOnClickListenerb dialogInterfaceOnClickListenerC1330b = new DialogInterfaceOnClickListenerb(this.f3520h, this);
        listView.setAdapter((ListAdapter) dialogInterfaceOnClickListenerC1330b);
        editText.addTextChangedListener(dialogInterfaceOnClickListenerC1330b);
        new AlertDialog.Builder(this).setTitle("添加权限").setView(linearLayout).setPositiveButton("确定", dialogInterfaceOnClickListenerC1330b).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create().show();
    }

    public View m5532a() {
        return getLayoutInflater().inflate(ClassA.f1729a, (ViewGroup) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m5533a(List list, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f3521i);
            StringBuffer stringBuffer = new StringBuffer("<?xml version='1.0' encoding='utf-8'?>");
            this.f3519g.m5803a(stringBuffer, list, str, 0);
            fileOutputStream.write(stringBuffer.toString().getBytes("utf-8"));
            fileOutputStream.close();
            Toast toastMakeText = Toast.makeText((Context) this, (CharSequence) "保存成功", 0);
            toastMakeText.setGravity(17, 0, 0);
            toastMakeText.show();
        } catch (Exception e) {
            StringBuffer stringBuffer2 = new StringBuffer(e.getMessage());
            stringBuffer2.append(":\n");
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer2.append(stackTraceElement.toString()).append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            new AlertDialog.Builder(this).setTitle("错误").setMessage(stringBuffer2.toString()).setPositiveButton("确定", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        if (!this.f3520h.f3523a) {
            finish();
        } else {
            this.f3515b = Enume.SAVE;
            new AlertDialog.Builder(this).setTitle("是否保存").setMessage("权限已修改，是否保存？").setPositiveButton("保存", this).setNeutralButton("不保存", this).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        switch (m5529b()[this.f3515b.ordinal()]) {
            case 1:
                switch (i) {
                    case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR:
                        finish();
                        break;
                    case -1:
                        this.f3520h.m5538b();
                        finish();
                        break;
                }
                break;
            case 2:
                this.f3520h.m5536a(this.f3517d);
                break;
            case 3:
                switch (i) {
                    case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR:
                    case -2:
                        finish();
                        break;
                    case -1:
                        this.f3521i = this.f3522j.getText().toString();
                        m5530c();
                        break;
                }
                break;
        }
        this.f3515b = Enume.UNKNOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (f3513e == null) {
            return;
        }
        this.f3515b = Enume.UNKNOWN;
        Intent intent = getIntent();
        this.f3520h = new ClassA(this);
        this.f3518f = new ListView(this);
        this.f3518f.setOnItemClickListener(this);
        setContentView(this.f3518f);
        if (intent.hasExtra(Config.FEED_LIST_ITEM_PATH)) {
            this.f3521i = intent.getStringExtra(Config.FEED_LIST_ITEM_PATH);
            m5530c();
        } else {
            this.f3522j = new EditText(this);
            this.f3515b = Enume.READ;
            this.f3522j.setHint("输入AndroidManifest.xml文件路径");
            new AlertDialog.Builder(this).setTitle("输入路径").setView(this.f3522j).setPositiveButton("确定", this).setCancelable(false).setNegativeButton("取消", this).create().show();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 1, "保存");
        menu.add(0, 1, 2, "添加");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f3517d = this.f3520h.getItem(i);
        if (this.f3517d == null) {
            return;
        }
        this.f3515b = Enume.DELETE;
        new AlertDialog.Builder(this).setTitle("删除权限").setMessage("是否删除权限：\n" + this.f3517d.m5800a()).setPositiveButton("确定", this).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create().show();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 0:
                this.f3520h.m5538b();
                break;
            case 1:
                m5531d();
                break;
        }
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.getItem(0).setShowAsAction(2);
        menu.getItem(0).setEnabled(this.f3520h.f3523a);
        menu.getItem(1).setShowAsAction(2);
        return true;
    }
}
