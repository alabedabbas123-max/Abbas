package com.almlkaide.kaypro.aide.util;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.blankj.utilcode.util.ReflectUtils;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.util.Utils;
import com.tencent.mm.util.TypedValue;
import java.util.Locale;

public class QuickKey {
    public static void quickKeyTextOnClick(Object obj, View view) {
        ReflectUtils.reflect(obj).method("onClick_", new Object[]{view});
    }

    public static void setQuickBarVisibility(Object obj, boolean z) {
        View view = (View) ReflectUtils.reflect(obj).field("Hw").get();
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(AideR.C1673id.quickKeyBarList);
            if (Utils.getSp().getBoolean("disable_quickkeybar", false) || viewGroup.getChildCount() == 0) {
                view.findViewById(AideR.C1673id.quickKeyBar).setVisibility(8);
            } else {
                view.findViewById(AideR.C1673id.quickKeyBar).setVisibility(z ? 0 : 8);
            }
        }
    }

    public static void showDialog(Activity activity) {
        String[] strArr = {".java", TypedValue.XML_FILE};
        new AlertDialog.Builder(activity).setTitle(Utils.isCN() ? "选择" : "Choose").setItems(strArr, new DialogInterface.OnClickListener(activity, strArr) {
            private final Activity val$activity;
            private final String[] val$keys;

            {
                this.val$activity = activity;
                this.val$keys = strArr;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                QuickKey.showModifyKeyDialog(this.val$activity, this.val$keys[i]);
            }
        }).create().show();
    }

    public static void showModifyKeyDialog(Activity activity, String str) {
        ScrollView scrollView = new ScrollView(activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(Utils.dp2px(24), Utils.dp2px(0), Utils.dp2px(24), Utils.dp2px(0));
        EditText editText = new EditText(activity);
        editText.setText(getKey(str));
        editText.setMinLines(5);
        linearLayout.addView(editText, -1, -2);
        scrollView.addView(linearLayout, -1, -2);
        new AlertDialog.Builder(activity).setTitle(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(Utils.isCN() ? "修改快捷键" : "Modify Quick key").append("(").toString()).append(str).toString()).append(")").toString()).setView(scrollView).setNeutralButton(Utils.isCN() ? "默认" : "Default", new DialogInterface.OnClickListener(str) {
            private final String val$key;

            {
                this.val$key = str;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Utils.getSp().edit().putString(this.val$key, QuickKey.getDefaultKey(this.val$key)).commit();
                AIDEUtils.initQuickKey();
            }
        }).setPositiveButton(Utils.isCN() ? "保存" : "Save", new DialogInterface.OnClickListener(str, editText) {
            private final EditText val$edit;
            private final String val$key;

            {
                this.val$key = str;
                this.val$edit = editText;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Utils.getSp().edit().putString(this.val$key, this.val$edit.getText().toString()).commit();
                AIDEUtils.initQuickKey();
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
    }

    public static String getKey(String str) {
        if (check(str, TypedValue.XML_FILE, ".htm", ".html")) {
            str = TypedValue.XML_FILE;
        }
        return Utils.getSp().getString(str, getDefaultKey(str));
    }

    public static String getDefaultKey(String str) {
        if (!check(str, ".java") && check(str, TypedValue.XML_FILE, ".htm", ".html")) {
            return "#sp\n<\n>\n/\n=\n\"\n:\n@\n+\n(\n)\n;\n,\n.\n?\n|\n\\\n&\n!\n[\n]\n{\n}\n_\n-";
        }
        return "#sp\n{\n}\n(\n)\n;\n=\n\"\n|\n&\n!\n[\n]\n<\n>\n+\n-\n/\n*\n?\n:\n_";
    }

    private static boolean check(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str.toLowerCase(Locale.ENGLISH).endsWith(str2.toLowerCase(Locale.ENGLISH))) {
                return true;
            }
        }
        return false;
    }
}
