package com.almlkaide.kaypro.util;

import abcd.gj;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ScrollView;
import com.aide.ui.U;
import com.blankj.utilcode.util.FileIOUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import java.io.File;

public class Json2Bean {
    public static void showDialog(Activity activity, String str) {
        DialogView dialogView = new DialogView(activity);
        Json2Java.Configurd configurd = new Json2Java.Configurd();
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle("Json2Bean").setView(dialogView.getView()).setPositiveButton(Utils.isCN() ? "生成" : "Generate", (DialogInterface.OnClickListener) null).setNegativeButton(Utils.isCN() ? "格式化" : "Format", (DialogInterface.OnClickListener) null).setNeutralButton(Utils.isCN() ? "配置" : "Configured", (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        if (str != null) {
            dialogView.input_json.setText(str);
        }
        File currentProject = ProjectUtils.getCurrentProject();
        File srcJavaPkg = ProjectUtils.getSrcJavaPkg(currentProject);
        try {
            dialogView.input_package.setText(gj.DW(U.vy().J8(), U.vy().tp(), AIDEUtils.getFileBrowserCurrentDir()));
        } catch (Throwable th) {
            if (ProjectUtils.getPackageName(currentProject) != null) {
                dialogView.input_package.setText(ProjectUtils.getPackageName(currentProject));
            }
        }
        Button button = alertDialogCreate.getButton(-1);
        Button button2 = alertDialogCreate.getButton(-2);
        Button button3 = alertDialogCreate.getButton(-3);
        button.setOnClickListener(new View.OnClickListener(dialogView, configurd, activity, srcJavaPkg, alertDialogCreate) {
            private final Activity val$activity;
            private final Json2Java.Configurd val$configurd;
            private final AlertDialog val$dialog;
            private final DialogView val$dialogView;
            private final File val$srcJavaPackageName;

            {
                this.val$dialogView = dialogView;
                this.val$configurd = configurd;
                this.val$activity = activity;
                this.val$srcJavaPackageName = srcJavaPkg;
                this.val$dialog = alertDialogCreate;
            }

            @Override
            public void onClick(View view) {
                String string = this.val$dialogView.input_json.getText().toString();
                String string2 = this.val$dialogView.input_package.getText().toString();
                String string3 = this.val$dialogView.input_className.getText().toString();
                Json2Java.Configurd configurd2 = this.val$configurd;
                if (string2.length() == 0) {
                    string2 = (String) null;
                }
                configurd2.setPackageName(string2);
                this.val$configurd.setClassName(string3.length() == 0 ? (String) null : string3);
                try {
                    String strCreateBean = Json2Java.createBean(string, this.val$configurd);
                    PopupMenu popupMenu = new PopupMenu(this.val$activity, view);
                    Menu menu = popupMenu.getMenu();
                    menu.add(Utils.isCN() ? "导出至java" : "Export to Java").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, this.val$activity, this.val$srcJavaPackageName, this.val$dialogView, strCreateBean, this.val$dialog) {
                        private final AnonymousClass100000009 this$0;
                        private final Activity val$activity;
                        private final AlertDialog val$dialog;
                        private final DialogView val$dialogView;
                        private final String val$result;
                        private final File val$srcJavaPackageName;

                        {
                            this.this$0 = this;
                            this.val$activity = activity;
                            this.val$srcJavaPackageName = file;
                            this.val$dialogView = dialogView;
                            this.val$result = strCreateBean;
                            this.val$dialog = alertDialog;
                        }

                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            LinearLayout linearLayout = new LinearLayout(this.val$activity);
                            linearLayout.setOrientation(1);
                            linearLayout.setPadding(Utils.dp2px(24), 0, Utils.dp2px(24), 0);
                            EditText editText = new EditText(this.val$activity);
                            EditText editText2 = new EditText(this.val$activity);
                            editText.setHint(Utils.isCN() ? "文件名.." : "file nane...");
                            editText2.setHint(Utils.isCN() ? "导出路径.." : "export path...");
                            linearLayout.addView(editText, -1, -2);
                            linearLayout.addView(editText2, -1, -2);
                            if (this.val$srcJavaPackageName != null) {
                                editText2.setText(this.val$srcJavaPackageName.getAbsolutePath());
                            } else {
                                editText2.setText(Environment.getExternalStorageDirectory().getAbsolutePath());
                            }
                            String string4 = this.val$dialogView.input_className.getText().toString();
                            if (!TextUtils.isEmpty(string4)) {
                                editText.setText(new StringBuffer().append(string4).append(".java").toString());
                            }
                            ScrollView scrollView = new ScrollView(this.val$activity);
                            scrollView.addView(linearLayout, -1, -1);
                            AlertDialog alertDialogCreate2 = new AlertDialog.Builder(this.val$activity).setTitle(menuItem.getTitle()).setView(scrollView).setPositiveButton(Utils.isCN() ? "导出" : "Export", (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setNeutralButton(Utils.isCN() ? "选择路径" : "Select path", (DialogInterface.OnClickListener) null).create();
                            alertDialogCreate2.show();
                            alertDialogCreate2.getButton(-1).setOnClickListener(new View.OnClickListener(this, editText, editText2, this.val$result, alertDialogCreate2) {
                                private final AnonymousClass100000004 this$0;
                                private final AlertDialog val$dialog2;
                                private final EditText val$input_fileName;
                                private final EditText val$input_outpath;
                                private final String val$result;

                                {
                                    this.this$0 = this;
                                    this.val$input_fileName = editText;
                                    this.val$input_outpath = editText2;
                                    this.val$result = str;
                                    this.val$dialog2 = alertDialogCreate2;
                                }

                                @Override
                                public void onClick(View view2) {
                                    try {
                                        String string5 = this.val$input_fileName.getText().toString();
                                        if (!string5.endsWith(".java")) {
                                            string5 = new StringBuffer().append(string5).append(".java").toString();
                                        }
                                        File file = new File(this.val$input_outpath.getText().toString(), string5);
                                        if (FileIOUtils.writeFileFromString(file, this.val$result)) {
                                            Utils.toast(new StringBuffer().append(Utils.isCN() ? "已导出到:" : "Exported to:").append(file.getAbsolutePath()).toString());
                                        } else {
                                            Utils.toast("output failed!");
                                        }
                                        this.val$dialog2.dismiss();
                                    } catch (Throwable th2) {
                                        Utils.toast(th2, true);
                                    }
                                }
                            });
                            alertDialogCreate2.getButton(-3).setOnClickListener(new View.OnClickListener(this, this.val$srcJavaPackageName, this.val$activity, editText2) {
                                private final AnonymousClass100000004 this$0;
                                private final Activity val$activity;
                                private final EditText val$input_outpath;
                                private final File val$srcJavaPackageName;

                                {
                                    this.this$0 = this;
                                    this.val$srcJavaPackageName = file;
                                    this.val$activity = activity;
                                    this.val$input_outpath = editText2;
                                }

                                @Override
                                public void onClick(View view2) {
                                    ChooseDir.showDialog(this.val$activity, this.val$srcJavaPackageName == null ? Environment.getExternalStorageDirectory() : this.val$srcJavaPackageName, new ChooseDir.ChooseListener(this, this.val$input_outpath) {
                                        private final AnonymousClass100000002 this$0;
                                        private final EditText val$input_outpath;

                                        {
                                            this.this$0 = this;
                                            this.val$input_outpath = editText;
                                        }

                                        @Override
                                        public void onChooseed(File file) {
                                            this.val$input_outpath.setText(file.getAbsolutePath());
                                        }
                                    });
                                }
                            });
                            this.val$dialog.hide();
                            alertDialogCreate2.setOnDismissListener(new DialogInterface.OnDismissListener(this, this.val$dialog) {
                                private final AnonymousClass100000004 this$0;
                                private final AlertDialog val$dialog;

                                {
                                    this.this$0 = this;
                                    this.val$dialog = alertDialog;
                                }

                                @Override
                                public void onDismiss(DialogInterface dialogInterface) {
                                    this.val$dialog.show();
                                }
                            });
                            return false;
                        }
                    });
                    menu.add(Utils.isCN() ? "添加到当前编辑框" : "Add to current edit box").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, strCreateBean) {
                        private final AnonymousClass100000009 this$0;
                        private final String val$result;

                        {
                            this.this$0 = this;
                            this.val$result = strCreateBean;
                        }

                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            AIDEUtils.addToEditor(this.val$result);
                            return false;
                        }
                    }).setVisible(AIDEUtils.getCurrentEditorFile() != null);
                    menu.add(Utils.isCN() ? "预览代码" : "Preview code").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, this.val$activity, strCreateBean, this.val$dialog) {
                        private final AnonymousClass100000009 this$0;
                        private final Activity val$activity;
                        private final AlertDialog val$dialog;
                        private final String val$result;

                        {
                            this.this$0 = this;
                            this.val$activity = activity;
                            this.val$result = strCreateBean;
                            this.val$dialog = alertDialog;
                        }

                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            AlertDialog alertDialogCreate2 = new AlertDialog.Builder(this.val$activity).setTitle(menuItem.getTitle()).setMessage(this.val$result).setPositiveButton(R.string.copy, new DialogInterface.OnClickListener(this, this.val$result) {
                                private final AnonymousClass100000008 this$0;
                                private final String val$result;

                                {
                                    this.this$0 = this;
                                    this.val$result = str;
                                }

                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Utils.copyToClipboard(this.val$result);
                                }
                            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
                            alertDialogCreate2.show();
                            this.val$dialog.hide();
                            alertDialogCreate2.setOnDismissListener(new DialogInterface.OnDismissListener(this, this.val$dialog) {
                                private final AnonymousClass100000008 this$0;
                                private final AlertDialog val$dialog;

                                {
                                    this.this$0 = this;
                                    this.val$dialog = alertDialog;
                                }

                                @Override
                                public void onDismiss(DialogInterface dialogInterface) {
                                    this.val$dialog.show();
                                }
                            });
                            return false;
                        }
                    });
                    popupMenu.show();
                } catch (Throwable th2) {
                    Utils.showExDialog(this.val$activity, th2);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener(dialogView, activity) {
            private final Activity val$activity;
            private final DialogView val$dialogView;

            {
                this.val$dialogView = dialogView;
                this.val$activity = activity;
            }

            @Override
            public void onClick(View view) {
                String string = this.val$dialogView.input_json.getText().toString();
                PopupMenu popupMenu = new PopupMenu(this.val$activity, view);
                Menu menu = popupMenu.getMenu();
                menu.add(Utils.isCN() ? "压缩" : "compress").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, string, this.val$dialogView, this.val$activity) {
                    private final AnonymousClass100000012 this$0;
                    private final Activity val$activity;
                    private final DialogView val$dialogView;
                    private final String val$jsonData;

                    {
                        this.this$0 = this;
                        this.val$jsonData = string;
                        this.val$dialogView = dialogView;
                        this.val$activity = activity;
                    }

                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        try {
                            String strCompressionJson = Json2Bean.compressionJson(this.val$jsonData);
                            if (strCompressionJson != null && !"null".equals(strCompressionJson)) {
                                this.val$dialogView.input_json.setText(strCompressionJson);
                                return false;
                            }
                            return false;
                        } catch (Exception e) {
                            Utils.showExDialog(this.val$activity, e);
                            return false;
                        }
                    }
                });
                menu.add(Utils.isCN() ? "格式化" : "format").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, string, this.val$dialogView, this.val$activity) {
                    private final AnonymousClass100000012 this$0;
                    private final Activity val$activity;
                    private final DialogView val$dialogView;
                    private final String val$jsonData;

                    {
                        this.this$0 = this;
                        this.val$jsonData = string;
                        this.val$dialogView = dialogView;
                        this.val$activity = activity;
                    }

                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        try {
                            String json = Json2Bean.formatJson(this.val$jsonData);
                            if (json != null && !"null".equals(json)) {
                                this.val$dialogView.input_json.setText(json);
                                return false;
                            }
                            return false;
                        } catch (Exception e) {
                            Utils.showExDialog(this.val$activity, e);
                            return false;
                        }
                    }
                });
                popupMenu.show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener(configurd, activity) {
            private final Activity val$activity;
            private final Json2Java.Configurd val$configurd;

            {
                this.val$configurd = configurd;
                this.val$activity = activity;
            }

            private String[] getItem() {
                return !Utils.isCN() ? new String[]{"Add set method", "Add get method", "Sorting set and get methods", "public field", "List<?> -> ?[]", "int -> Integer", "toString"} : new String[]{"添加set方法", "添加get方法", "排序 set、get方法", "public field", "List<?> -> ?[]", "int -> Integer", "toString"};
            }

            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(this.val$activity).setTitle(Utils.isCN() ? "配置" : "Configure").setMultiChoiceItems(getItem(), new boolean[]{this.val$configurd.isSetters(), this.val$configurd.isGetters(), this.val$configurd.isSortMethod(), this.val$configurd.isPublicField(), this.val$configurd.isUseArray(), this.val$configurd.isUseInteger(), this.val$configurd.isToString()}, new DialogInterface.OnMultiChoiceClickListener(this, this.val$configurd) {
                    private final AnonymousClass100000014 this$0;
                    private final Json2Java.Configurd val$configurd;

                    {
                        this.this$0 = this;
                        this.val$configurd = configurd;
                    }

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
                        switch (i) {
                            case 0:
                                this.val$configurd.setSetters(z);
                                break;
                            case 1:
                                this.val$configurd.setGetters(z);
                                break;
                            case 2:
                                this.val$configurd.setSortMethod(z);
                                break;
                            case 3:
                                this.val$configurd.setPublicField(z);
                                break;
                            case 4:
                                this.val$configurd.setUseArray(z);
                                break;
                            case 5:
                                this.val$configurd.setUseInteger(z);
                                break;
                            case 6:
                                this.val$configurd.setToString(z);
                                break;
                        }
                    }
                }).create().show();
            }
        });
    }

    private static class DialogView {
        private Context context;
        public EditText input_className;
        public EditText input_json;
        public EditText input_package;
        private ScrollView view;

        public DialogView(Context context) {
            this.context = context;
            this.view = new ScrollView(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(Utils.dp2px(24), 0, Utils.dp2px(24), 0);
            this.input_package = new EditText(context);
            this.input_package.setHint(Utils.isCN() ? "包名（可空）" : "Package name (can be empty)");
            this.input_className = new EditText(context);
            this.input_className.setHint(Utils.isCN() ? "类名（可空）" : "Class name (can be empty)");
            this.input_json = new EditText(context);
            this.input_json.setHint("json");
            linearLayout.addView(this.input_package, -1, -2);
            linearLayout.addView(this.input_className, -1, -2);
            linearLayout.addView(this.input_json, -1, -2);
            this.view.addView(linearLayout, -1, -1);
        }

        public View getView() {
            return this.view;
        }
    }

    public static String formatJson(String str) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(new JsonParser().parse(str));
    }

    public static String compressionJson(String str) {
        return new GsonBuilder().setLenient().create().toJson(new JsonParser().parse(str));
    }
}
