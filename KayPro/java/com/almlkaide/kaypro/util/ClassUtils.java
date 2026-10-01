package com.almlkaide.kaypro.util;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.apache.commons.io.IOUtils;

public class ClassUtils {
    public static void showDialog(Activity activity) {
        LinearLayout linearLayout = new LinearLayout(activity);
        EditText editText = new EditText(activity);
        try {
            editText.setText(Class.forName("android.app.Activity").getCanonicalName());
            editText.setHint(Utils.isCN() ? "类名" : "Class name");
            linearLayout.addView(editText, -1, -2);
            linearLayout.setPadding(Utils.dp2px(24), 0, Utils.dp2px(24), 0);
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(Utils.isCN() ? "指定类分析" : "Specify class analysis").setView(linearLayout).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
            alertDialogCreate.show();
            alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener(editText, activity) {
                private final Activity val$activity;
                private final EditText val$input;

                {
                    this.val$input = editText;
                    this.val$activity = activity;
                }

                @Override
                public void onClick(View view) {
                    try {
                        Class<?> cls = Class.forName(this.val$input.getText().toString());
                        StringBuffer stringBuffer = new StringBuffer();
                        if (Utils.isCN()) {
                            stringBuffer.append(new StringBuffer().append("类路径：").append(cls.getCanonicalName()).toString());
                            stringBuffer.append(new StringBuffer().append("\n字段数：").append(ClassUtils.getDeclaredFieldCount(cls)).toString());
                            stringBuffer.append(new StringBuffer().append("\n字段数(包含父类)：").append(ClassUtils.getFieldCount(cls)).toString());
                            stringBuffer.append(new StringBuffer().append("\n方法数：").append(ClassUtils.getDeclaredMethodCount(cls)).toString());
                            stringBuffer.append(new StringBuffer().append("\n方法数(包含父类)：").append(ClassUtils.getMethodCount(cls)).toString());
                            stringBuffer.append(new StringBuffer().append("\n\n所有父类：\n").append(ClassUtils.getSuperClassName(cls)).toString());
                        } else {
                            stringBuffer.append(new StringBuffer().append("Class path：").append(cls.getCanonicalName()).toString());
                            stringBuffer.append(new StringBuffer().append("\nNumber of fields: ").append(ClassUtils.getDeclaredFieldCount(cls)).toString());
                            stringBuffer.append(new StringBuffer().append("\nN number of fields (including parent class): ").append(ClassUtils.getFieldCount(cls)).toString());
                            stringBuffer.append(new StringBuffer().append("\nNumber of methods:").append(ClassUtils.getDeclaredMethodCount(cls)).toString());
                            stringBuffer.append(new StringBuffer().append("\nNumber of methods (including parent class): ").append(ClassUtils.getMethodCount(cls)).toString());
                            stringBuffer.append(new StringBuffer().append("\n\nAll parent classes:\n").append(ClassUtils.getSuperClassName(cls)).toString());
                        }
                        AlertDialog alertDialogCreate2 = new AlertDialog.Builder(this.val$activity).setTitle(cls.getSimpleName()).setMessage(stringBuffer.toString()).setPositiveButton(R.string.copy, new DialogInterface.OnClickListener(this, stringBuffer) {
                            private final AnonymousClass100000001 this$0;
                            private final StringBuffer val$sb;

                            {
                                this.this$0 = this;
                                this.val$sb = stringBuffer;
                            }

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Utils.copyToClipboard(this.val$sb.toString());
                            }
                        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
                        alertDialogCreate2.show();
                        Utils.setMessageIsSelectable(alertDialogCreate2);
                    } catch (Throwable th) {
                        Utils.showExDialog(this.val$activity, th);
                    }
                }
            });
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static String getSuperClassName(Class<?> cls) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cls.getCanonicalName());
        while (true) {
            cls = cls.getSuperclass();
            if (cls != null) {
                stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
                stringBuffer.append(cls.getCanonicalName());
            } else {
                return stringBuffer.toString();
            }
        }
    }

    public static int getMethodCount(Class<?> cls) {
        Method[] methods = cls.getMethods();
        if (methods == null) {
            return -1;
        }
        return methods.length;
    }

    public static int getDeclaredMethodCount(Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (declaredMethods == null) {
            return -1;
        }
        return declaredMethods.length;
    }

    public static int getFieldCount(Class<?> cls) {
        Field[] fields = cls.getFields();
        if (fields == null) {
            return -1;
        }
        return fields.length;
    }

    public static int getDeclaredFieldCount(Class<?> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        if (declaredFields == null) {
            return -1;
        }
        return declaredFields.length;
    }
}
