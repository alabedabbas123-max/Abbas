package com.almlkaide.kaypro.aide;

import abcd.gj;
import abcd.nf;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.annotation.Keep;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v4.widget.DrawerLayout;
import com.aide.common.ab;
import com.aide.ui.MainActivity;
import com.aide.ui.views.SplitView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.almlkaide.kaypro.aide.dependencies.DependencieDialog;
import com.almlkaide.kaypro.aide.project.ProjectDialog;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.aide.util.CreateClassDialog;
import com.almlkaide.kaypro.aide.util.CreateXMLDialog;
import com.almlkaide.kaypro.translate.web.WebTranslateActivity;
import com.almlkaide.kaypro.util.Utils;
import com.almlkaide.kaypro.util.View2Java;
import com.almlkaide.kaypro.util.View2Style;
import com.tencent.mm.util.TypedValue;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

@Keep
public class MainListener {
    public static void onShowSelectModeDialog(Activity activity) {
    }

    public static Dialog onCnommonEditTextDialogShow(Object obj, Activity activity) {
        ReflectUtils reflectUtilsReflect = ReflectUtils.reflect(obj);
        TextView textView = new TextView(activity);
        String str = (String) reflectUtilsReflect.field("u7").get();
        textView.setText(str);
        textView.setPadding(0, 0, 0, Utils.dp2px(16));
        textView.setTextSize(15);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        }
        EditText editText = new EditText(activity);
        editText.setText((String) reflectUtilsReflect.field("J8").get());
        editText.setSingleLine(true);
        String string = editText.getText().toString();
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(Utils.dp2px(24), Utils.dp2px(16), Utils.dp2px(24), 0);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(editText, -1, -2);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        String str2 = (String) reflectUtilsReflect.field("we").get();
        builder.setTitle(str2);
        builder.setView(linearLayout);
        builder.setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) ReflectUtils.reflect("com.aide.common.C").newInstance(new Object[]{obj, activity, editText}).get());
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        String str3 = (String) reflectUtilsReflect.field("tp").get();
        if (str3 != null) {
            builder.setNeutralButton("none".equals(str3.toLowerCase(Locale.ENGLISH)) ? activity.getResources().getString(AideR.string.dialog_bt_none) : str3, (DialogInterface.OnClickListener) ReflectUtils.reflect("com.aide.common.D").newInstance(new Object[]{obj, activity, editText}).get());
        }
        builder.setOnCancelListener((DialogInterface.OnCancelListener) ReflectUtils.reflect("com.aide.common.E").newInstance(new Object[]{obj}).get());
        LogUtils.iTag("implements", new Object[]{reflectUtilsReflect.field("gn").get().toString()});
        LogUtils.iTag("dialogTitle/Message", new Object[]{new StringBuffer().append(new StringBuffer().append(str2).append("/").toString()).append(str).toString()});
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener(editText, activity, str2, str, alertDialogCreate, string) {
            private final Activity val$activity;
            private final AlertDialog val$dialog;
            private final String val$dialogMessage;
            private final String val$dialogTitle;
            private final EditText val$input;
            private final String val$input_text;

            {
                this.val$input = editText;
                this.val$activity = activity;
                this.val$dialogTitle = str2;
                this.val$dialogMessage = str;
                this.val$dialog = alertDialogCreate;
                this.val$input_text = string;
            }

            @Override
            public void onShow(DialogInterface dialogInterface) {
                KeyboardUtils.showSoftInput(this.val$input);
                Resources resources = this.val$activity.getResources();
                if (resources.getString(AideR.string.dialog_rename_title).equals(this.val$dialogTitle) && resources.getString(AideR.string.dialog_rename_message).equals(this.val$dialogMessage)) {
                    handlerRenameDialog();
                    return;
                }
                if (resources.getString(AideR.string.command_files_create_new_file).equals(this.val$dialogTitle) && resources.getString(AideR.string.dialog_create_message).equals(this.val$dialogMessage)) {
                    handlerNewFileDialog();
                } else if (resources.getString(AideR.string.command_files_create_new_folder).equals(this.val$dialogTitle) && resources.getString(AideR.string.dialog_create_message).equals(this.val$dialogMessage)) {
                    handlerNewFolderDialog();
                } else {
                    this.val$input.selectAll();
                }
            }

            private void handlerNewFolderDialog() {
                Button button = this.val$dialog.getButton(-1);
                button.setEnabled(false);
                button.setOnClickListener(new View.OnClickListener(this, this.val$input, this.val$dialog) {
                    private final AnonymousClass100000005 this$0;
                    private final AlertDialog val$dialog;
                    private final EditText val$input;

                    {
                        this.this$0 = this;
                        this.val$input = editText;
                        this.val$dialog = alertDialog;
                    }

                    @Override
                    public void onClick(View view) {
                        File file = new File(AIDEUtils.getFileBrowserCurrentDir(), this.val$input.getText().toString());
                        if (file.exists()) {
                            this.val$input.setError(Utils.isCN() ? "文件夹已存在" : "folder already exist");
                        } else if (!file.mkdirs()) {
                            this.val$input.setError(Utils.isCN() ? "无法写入" : "Unable to write");
                        } else {
                            AIDEUtils.reLoadFileBrowser();
                            this.val$dialog.dismiss();
                        }
                    }
                });
                this.val$input.addTextChangedListener(new TextWatcher(this, button) {
                    private final AnonymousClass100000005 this$0;
                    private final Button val$BUTTON_POSITIVE;

                    {
                        this.this$0 = this;
                        this.val$BUTTON_POSITIVE = button;
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        if (charSequence.length() == 0) {
                            this.val$BUTTON_POSITIVE.setEnabled(false);
                        } else {
                            this.val$BUTTON_POSITIVE.setEnabled(true);
                        }
                    }
                });
            }

            private void handlerNewFileDialog() {
                Button button = this.val$dialog.getButton(-1);
                button.setEnabled(false);
                button.setOnClickListener(new View.OnClickListener(this, this.val$input, this.val$dialog) {
                    private final AnonymousClass100000005 this$0;
                    private final AlertDialog val$dialog;
                    private final EditText val$input;

                    {
                        this.this$0 = this;
                        this.val$input = editText;
                        this.val$dialog = alertDialog;
                    }

                    @Override
                    public void onClick(View view) {
                        File file = new File(AIDEUtils.getFileBrowserCurrentDir(), this.val$input.getText().toString());
                        if (file.exists()) {
                            this.val$input.setError(Utils.isCN() ? "文件已存在" : "file already exist");
                            return;
                        }
                        file.getParentFile().mkdirs();
                        try {
                            file.createNewFile();
                            AIDEUtils.openFile(file);
                            AIDEUtils.setFileBrowserCurrentDir(file.getParentFile().getAbsolutePath());
                            this.val$dialog.dismiss();
                        } catch (IOException e) {
                            this.val$input.setError(Utils.isCN() ? "无法写入" : "Unable to write");
                        }
                    }
                });
                this.val$input.addTextChangedListener(new TextWatcher(this, button) {
                    private final AnonymousClass100000005 this$0;
                    private final Button val$BUTTON_POSITIVE;

                    {
                        this.this$0 = this;
                        this.val$BUTTON_POSITIVE = button;
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        if (charSequence.length() == 0) {
                            this.val$BUTTON_POSITIVE.setEnabled(false);
                        } else {
                            this.val$BUTTON_POSITIVE.setEnabled(true);
                        }
                    }
                });
            }

            private void handlerRenameDialog() {
                Button button = this.val$dialog.getButton(-1);
                button.setEnabled(false);
                new File(AIDEUtils.getFileBrowserCurrentDir(), this.val$input.getText().toString());
                this.val$input.addTextChangedListener(new TextWatcher(this, button, this.val$input_text) {
                    private final AnonymousClass100000005 this$0;
                    private final Button val$BUTTON_POSITIVE;
                    private final String val$input_text;

                    {
                        this.this$0 = this;
                        this.val$BUTTON_POSITIVE = button;
                        this.val$input_text = str;
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        if (charSequence.length() == 0) {
                            this.val$BUTTON_POSITIVE.setEnabled(false);
                        } else if (charSequence.toString().equals(this.val$input_text)) {
                            this.val$BUTTON_POSITIVE.setEnabled(false);
                        } else {
                            this.val$BUTTON_POSITIVE.setEnabled(true);
                        }
                    }
                });
                String string2 = this.val$input.getText().toString();
                if (!TextUtils.isEmpty(string2)) {
                    if (string2.length() == 1) {
                        this.val$input.selectAll();
                        return;
                    }
                    File file = new File(AIDEUtils.getFileBrowserCurrentDir(), string2);
                    if (file.exists()) {
                        if (file.isFile()) {
                            int iLastIndexOf = string2.lastIndexOf(".");
                            if (iLastIndexOf != -1 && string2.substring(0, iLastIndexOf).length() != 0) {
                                this.val$input.setSelection(0, iLastIndexOf);
                                return;
                            } else {
                                this.val$input.selectAll();
                                return;
                            }
                        }
                        this.val$input.selectAll();
                        return;
                    }
                    this.val$input.selectAll();
                }
            }
        });
        alertDialogCreate.setCanceledOnTouchOutside(true);
        return alertDialogCreate;
    }

    public static void onAddToProject() {
        Resources resources = Utils.getMainActivity().getResources();
        String[] strArr = new String[5];
        strArr[0] = resources.getString(AideR.string.dialog_add_to_project_existing_jar_file);
        strArr[1] = resources.getString(AideR.string.dialog_add_to_project_existing_library_project);
        strArr[2] = resources.getString(AideR.string.dialog_add_to_project_new_library_project);
        strArr[3] = resources.getString(AideR.string.dialog_add_to_project_new_product_flavor);
        strArr[4] = Utils.isCN() ? "添加依赖" : "Add Dependency";
        new AlertDialog.Builder(Utils.getMainActivity()).setTitle(AideR.string.command_files_add_to_project).setItems(strArr, new DialogInterface.OnClickListener(strArr) {
            private final String[] val$items;

            {
                this.val$items = strArr;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String str = this.val$items[i];
                if (i == this.val$items.length - 1) {
                    DependencieDialog.showDialog(Utils.getMainActivity());
                } else {
                    new gj().j6(AIDEUtils.getFileBrowserCurrentDir(), str);
                }
            }
        }).create().show();
    }

    public static void onShowCreateDialog(nf nfVar) {
        ProjectDialog.showCreateDialog(Utils.getMainActivity());
    }

    public static void onCreateClass(String str, ab<String> abVar) {
        if (((Boolean) ReflectUtils.reflect("abcd.Zi").method("Hw", new Object[]{str}).get()).booleanValue()) {
            CreateXMLDialog.showDialog(Utils.getMainActivity(), str, abVar);
        } else {
            CreateClassDialog.showDialog(Utils.getMainActivity(), str, abVar);
        }
    }

    public static void onShowCreateProjectDialog(Activity activity) {
        ProjectDialog.showCreateDialog(activity);
    }

    public static void onSplitViewCloseSplit(SplitView splitView, boolean z, Runnable runnable) {
        DrawerLayout mainDrawerLayout = AIDEUtils.getMainDrawerLayout();
        if (mainDrawerLayout != null) {
            ReflectUtils.reflect(mainDrawerLayout).method("closeDrawer", new Object[]{new Integer(3)});
        } else {
            Utils.getSp().edit().putBoolean("split_view_open", false).commit();
        }
        ReflectUtils.reflect(splitView).method("closeSplit_SOURCE", new Object[]{new Boolean(z), runnable});
    }

    public static void onSplitViewOpenSplit(SplitView splitView, boolean z, boolean z2) {
        DrawerLayout mainDrawerLayout = AIDEUtils.getMainDrawerLayout();
        if (mainDrawerLayout != null) {
            ReflectUtils.reflect(mainDrawerLayout).method("openDrawer", new Object[]{new Integer(3)});
        } else {
            ReflectUtils.reflect(splitView).method("openSplit_SOURCE", new Object[]{new Boolean(z), new Boolean(z2)});
            Utils.getSp().edit().putBoolean("split_view_open", true).commit();
        }
    }

    public static void setContentView(int i) {
        AideMainActivity mainActivity = AIDEUtils.getMainActivity();
        if (AdvancedSetting.isEnableDrawer() && !AIDEUtils.isTrainerMode()) {
            mainActivity.setContentView(AideR.layout.main_drawer);
        } else {
            mainActivity.setContentView(i);
        }
        mainActivity.setEditorBackground();
    }

    public static void onCreateActionMode(ActionMode actionMode, Menu menu) {
        AideMainActivity mainActivity = AIDEUtils.getMainActivity();
        actionMode.setTitle(Utils.isCN() ? "选择操作" : "Select actions");
        if (menu.size() != 0 && menu.getItem(0).getItemId() != com.almlkaide.kaypro.R.id.logcatMenuCopy) {
            MenuItem menuItemFindItem = menu.findItem(AideR.C1673id.editorMenuFix);
            MenuItem menuItemFindItem2 = menu.findItem(AideR.C1673id.editorMenuExpandSelection);
            MenuItem menuItemFindItem3 = menu.findItem(AideR.C1673id.editorMenuCut);
            MenuItem menuItemFindItem4 = menu.findItem(AideR.C1673id.editorMenuCopy);
            MenuItem menuItemFindItem5 = menu.findItem(AideR.C1673id.editorMenuPaste);
            if (menuItemFindItem.isVisible()) {
                menuItemFindItem.setShowAsAction(2);
            } else if (TextUtils.isEmpty(getSelectionContent())) {
                menuItemFindItem2.setShowAsAction(2);
                menuItemFindItem3.setShowAsAction(0);
                menuItemFindItem4.setShowAsAction(0);
                menuItemFindItem5.setShowAsAction(2);
            } else {
                menuItemFindItem2.setShowAsAction(2);
                menuItemFindItem3.setShowAsAction(2);
                menuItemFindItem4.setShowAsAction(2);
                menuItemFindItem5.setShowAsAction(2);
            }
            MenuItem menuItemFindItem6 = menu.findItem(AideR.C1673id.editorMenuAdTool);
            if (menuItemFindItem6 != null) {
                SubMenu subMenu = menuItemFindItem6.getSubMenu();
                if (Utils.isCN()) {
                    subMenu.add("翻译内容").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(mainActivity, actionMode) {
                        private final ActionMode val$actionMode;
                        private final MainActivity val$activity;

                        {
                            this.val$activity = mainActivity;
                            this.val$actionMode = actionMode;
                        }

                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            WebTranslateActivity.translate(this.val$activity, MainListener.getSelectionContent());
                            this.val$actionMode.finish();
                            return false;
                        }
                    });
                }
                if (AIDEUtils.checkEditorFileParentName("layout") && AIDEUtils.checkEditorFileNameSuffix(TypedValue.XML_FILE)) {
                    SubMenu subMenuAddSubMenu = subMenu.addSubMenu(Utils.isCN() ? "视图工具" : "View tools");
                    MenuItem menuItemAdd = subMenuAddSubMenu.add("View2Java");
                    MenuItem menuItemAdd2 = subMenuAddSubMenu.add("View2Style");
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(mainActivity, actionMode) {
                        private final ActionMode val$actionMode;
                        private final MainActivity val$activity;

                        {
                            this.val$activity = mainActivity;
                            this.val$actionMode = actionMode;
                        }

                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            View2Java.showDialog(this.val$activity, MainListener.getSelectionContent());
                            this.val$actionMode.finish();
                            return false;
                        }
                    });
                    menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(mainActivity, actionMode) {
                        private final ActionMode val$actionMode;
                        private final MainActivity val$activity;

                        {
                            this.val$activity = mainActivity;
                            this.val$actionMode = actionMode;
                        }

                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            View2Style.showDialog(this.val$activity, MainListener.getSelectionContent());
                            this.val$actionMode.finish();
                            return false;
                        }
                    });
                }
                if (subMenu.size() == 0) {
                    subMenu.getItem().setVisible(false);
                }
            }
        }
    }

    public static void onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        AIDEUtils.getMainActivity();
        menuItem.getItemId();
    }

    public static String getSelectionContent() {
        return AIDEUtils.getAIDEEditorPager().getSelectionContent();
    }
}
