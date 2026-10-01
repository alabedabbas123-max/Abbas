package com.almlkaide.kaypro.aide.application.activity;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.androlua.LuaEditor;
import com.baidu.mobstat.Config;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.UriUtils;
import com.almlkaide.kaypro.aide.AdvancedSetting;
import com.almlkaide.kaypro.aide.AideMainActivity;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.aide.GradleBuilEvent;
import com.almlkaide.kaypro.aide.application.AppTheme;
import com.almlkaide.kaypro.aide.completion.translate.TranslateUtils;
import com.almlkaide.kaypro.aide.api.ApiManager;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.aide.util.AndResGuard;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import com.almlkaide.kaypro.aide.util.QuickKey;
import com.almlkaide.kaypro.app.base.BaseActivity;
import com.almlkaide.kaypro.translate.web.WebTranslateActivity;
import com.almlkaide.kaypro.util.Toasty;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import org.xutils.DbManager;

public class AdvancedSettingsFragment extends PreferenceFragment {
    Dialog currentPreferenceScreen;

    public AdvancedSettingsFragment() {
        WebTranslateActivity.initDefaultapi();
        String string = Utils.getSp().getString("project_home", (String) null);
        if (string == null || !string.startsWith("/")) {
            Utils.getSp().edit().putString("project_home", ProjectUtils.getDefaultAppProjects().getAbsolutePath()).commit();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(AideR.C1675xml.preferences_advanced_setting);
        init();
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        TypedArray typedArrayObtainStyledAttributes = getActivity().getTheme().obtainStyledAttributes(new int[]{R.attr.windowBackground});
        viewOnCreateView.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        return viewOnCreateView;
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AppTheme.customList((ListView) view.findViewById(R.id.list));
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1) {
            File fileUri2File = UriUtils.uri2File(intent.getData());
            if (fileUri2File == null) {
                Toasty.error("file == null").show();
                return;
            }
            Utils.getSp().edit().putString("advanced_setting_editor_bg", fileUri2File.getAbsolutePath()).commit();
            Toasty.success(new StringBuffer().append(Utils.isCN() ? "设置成功：" : "Set success:").append(fileUri2File.getAbsolutePath()).toString()).show();
            AIDEUtils.getMainActivity().setEditorBackground();
        }
    }

    private void init() {
        initPreferenceScreenClickListener("preference_screen");
        initGradle();
        setOnPreferenceClickListener("gradle_comple", new Preference.OnPreferenceClickListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceClick(Preference preference) {
                File gradleCompleFile = AdvancedSetting.getGradleCompleFile();
                File defGradleCompleFile = (gradleCompleFile == null || !gradleCompleFile.exists()) ? AdvancedSetting.getDefGradleCompleFile() : gradleCompleFile;
                LuaEditor luaEditor = new LuaEditor(this.this$0.getActivity());
                AlertDialog alertDialogCreate = new AlertDialog.Builder(this.this$0.getActivity()).setTitle(preference.getTitle()).setView(luaEditor).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(this, defGradleCompleFile, luaEditor) {
                    private final AnonymousClass100000001 this$0;
                    private final File val$gradleCompleFile;
                    private final LuaEditor val$luaedit;

                    {
                        this.this$0 = this;
                        this.val$gradleCompleFile = defGradleCompleFile;
                        this.val$luaedit = luaEditor;
                    }

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (FileIOUtils.writeFileFromString(this.val$gradleCompleFile, this.val$luaedit.getText().toString())) {
                            return;
                        }
                        Toasty.success("failed").show();
                    }
                }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
                alertDialogCreate.show();
                luaEditor.setDark(!AIDEUtils.isLightTheme());
                luaEditor.scrollTo(0, 0);
                Window window = alertDialogCreate.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                window.setAttributes(attributes);
                String file2String = FileIOUtils.readFile2String(defGradleCompleFile);
                if (file2String == null) {
                    file2String = "";
                }
                luaEditor.setText(file2String);
                return false;
            }
        });
        setOnPreferenceChangeListener("dark_statusbar", new Preference.OnPreferenceChangeListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceChange(Preference preference, Object obj) {
                preference.getEditor().putBoolean("dark_statusbar", ((Boolean) obj).booleanValue()).commit();
                BaseActivity.setStatusBar(this.this$0.getActivity());
                if (this.this$0.currentPreferenceScreen != null && this.this$0.currentPreferenceScreen.isShowing()) {
                    BaseActivity.setStatusBar(this.this$0.currentPreferenceScreen.getWindow());
                    return true;
                }
                return true;
            }
        });
        setOnPreferenceChangeListener("enableMainMasterButton", new Preference.OnPreferenceChangeListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceChange(Preference preference, Object obj) {
                AIDEUtils.getMainActivity().setFABVisible(((Boolean) obj).booleanValue());
                return true;
            }
        });
        setOnPreferenceChangeListener("enableDrawerToggle", new Preference.OnPreferenceChangeListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceChange(Preference preference, Object obj) {
                AideMainActivity.getActivity().setDrawerToggleVisible(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference("advanced_setting_editor_bg").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceChange(Preference preference, Object obj) {
                Utils.getSp().edit().putString("advanced_setting_editor_bg", obj.toString()).commit();
                AIDEUtils.getMainActivity().setEditorBackground();
                return false;
            }
        });
        setOnPreferenceClickListener("choose_bg_image", new Preference.OnPreferenceClickListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceClick(Preference preference) {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("image/*");
                intent.addCategory("android.intent.category.OPENABLE");
                try {
                    this.this$0.startActivityForResult(Intent.createChooser(intent, "choose"), 100);
                    return false;
                } catch (ActivityNotFoundException e) {
                    Toasty.error(e.getMessage()).show();
                    return false;
                }
            }
        });
        setOnPreferenceChangeListener("advanced_setting_editor_font", new Preference.OnPreferenceChangeListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceChange(Preference preference, Object obj) {
                AIDEUtils.notifyThemeChanged();
                return true;
            }
        });
        setOnPreferenceChangeListener("use_adjustPan", new Preference.OnPreferenceChangeListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceChange(Preference preference, Object obj) {
                AIDEUtils.notifyThemeChanged();
                return true;
            }
        });
        setOnPreferenceChangeListener("advanced_setting_enable_drawer", new Preference.OnPreferenceChangeListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceChange(Preference preference, Object obj) {
                AIDEUtils.notifyThemeChanged();
                return true;
            }
        });
        setOnPreferenceChangeListener("translate_file", new Preference.OnPreferenceChangeListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceChange(Preference preference, Object obj) {
                TranslateUtils.f4956db = (DbManager) null;
                return true;
            }
        });
        setOnPreferenceClickListener("preference_stringfog", new Preference.OnPreferenceClickListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceClick(Preference preference) {
                AlertDialog alertDialogCreate = new AlertDialog.Builder(this.this$0.getActivity()).setTitle(preference.getTitle()).setMessage(Utils.fromHtml(Utils.isCN() ? "编译时加密Class中的字符串，防止直接暴露。支持使用@StringFogIgnore()注解来忽视某个类。<br>暂不支持加密项目导入的jar<br><a href=\"https://github.com/MegatronKing/StringFog\">@Github</a>" : "Encrypt strings in class at compile time to prevent direct exposure. Support @StringFogIgnore() annotation to ignore a class.<br>The jar imported by encrypted project is not supported temporarily<br><a href=\"https://github.com/MegatronKing/StringFog\">@Github</a>")).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).create();
                alertDialogCreate.show();
                Utils.setAlertDialogMovementMethod(alertDialogCreate);
                return false;
            }
        });
        setOnPreferenceClickListener("add_proguard_config", new Preference.OnPreferenceClickListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceClick(Preference preference) {
                File currentProject = ProjectUtils.getCurrentProject();
                if (currentProject == null) {
                    Toasty.error(Utils.isCN() ? "获取当前工程路径失败" : "Failed to get the current project path").show();
                } else {
                    new AlertDialog.Builder(this.this$0.getActivity()).setTitle(Utils.isCN() ? "将添加到" : "Add to").setMessage(currentProject.getAbsolutePath()).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(this, currentProject) {
                        private final AnonymousClass100000013 this$0;
                        private final File val$project;

                        {
                            this.this$0 = this;
                            this.val$project = currentProject;
                        }

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (ResourceUtils.copyFileFromAssets(Utils.getAssetsDataFile("resguard"), this.val$project.getAbsolutePath())) {
                                Toasty.success(new StringBuffer().append(Utils.isCN() ? "已添加到：" : "Added to:").append(this.val$project.getAbsolutePath()).toString()).show();
                            } else {
                                Toasty.error("failed").show();
                            }
                        }
                    }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
                }
                return false;
            }
        });
        setOnPreferenceClickListener("advanced_setting_enable_resguard", new Preference.OnPreferenceClickListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceClick(Preference preference) {
                AndResGuard.delectResourcesAps();
                return false;
            }
        });
        setOnPreferenceClickListener("preference_highlight", new Preference.OnPreferenceClickListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceClick(Preference preference) {
                try {
                    this.this$0.startActivity(new Intent(this.this$0.getActivity(), Class.forName("com.almlkaide.kaypro.aide.highlight.HighlightActivity")).putExtra(Config.FEED_LIST_ITEM_TITLE, preference.getTitle()));
                    this.this$0.getActivity().overridePendingTransition(0, 0);
                    return false;
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
        });
        setOnPreferenceClickListener("clear_translate", new Preference.OnPreferenceClickListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceClick(Preference preference) {
                new AlertDialog.Builder(this.this$0.getActivity()).setTitle(preference.getTitle()).setMessage(Utils.isCN() ? "是否清除？" : "Clear?").setPositiveButton(R.string.yes, new DialogInterface.OnClickListener(this) {
                    private final AnonymousClass100000017 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        try {
                            TranslateUtils.getDb().dropDb();
                            Toasty.success(Utils.isCN() ? "已清除翻译文件" : "Translation file cleared").show();
                        } catch (Throwable th) {
                            Utils.toast(th.getMessage());
                        }
                    }
                }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
                return false;
            }
        });
        setOnPreferenceClickListener("preference_quick_key", new Preference.OnPreferenceClickListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceClick(Preference preference) {
                QuickKey.showDialog(this.this$0.getActivity());
                return false;
            }
        });
    }

    private void initGradle() {
        findPreference("advanced_setting_pref_gradle_config").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onPreferenceClick(Preference preference) {
                this.this$0.showGradleConfigListDialog(preference.getTitle());
                return false;
            }
        });
    }

    public void showGradleConfigListDialog(CharSequence charSequence) {
        CharSequence[] charSequenceArr;
        if (Utils.isCN()) {
            charSequenceArr = new CharSequence[]{"安装", "卸载"};
        } else {
            charSequenceArr = new CharSequence[]{"Install", "Uninstall"};
        }
        new AlertDialog.Builder(getActivity()).setTitle(charSequence).setItems(charSequenceArr, new DialogInterface.OnClickListener(this) {
            private final AdvancedSettingsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    this.this$0.showInstallBackendDialog();
                } else {
                    this.this$0.showUninstallBackendDialog();
                }
            }
        }).create().show();
    }

    public void showInstallBackendDialog() {
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(SizeUtils.dp2px(24), SizeUtils.dp2px(10), SizeUtils.dp2px(24), SizeUtils.dp2px(16));
        EditText editText = new EditText(getActivity());
        linearLayout.addView(editText, -1, -2);
        TextView textView = new TextView(getActivity());
        textView.setText(Utils.isCN() ? "输入目录或单个文件路径" : "Enter a directory or a single file path");
        textView.setPadding(0, SizeUtils.dp2px(10), 0, 0);
        linearLayout.addView(textView, -1, -2);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getActivity()).setTitle(Utils.isCN() ? "安装Gradle" : "Install gradle").setView(linearLayout).setPositiveButton(Utils.isCN() ? "安装" : "Install", (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener(this, editText, alertDialogCreate) {
            private final AdvancedSettingsFragment this$0;
            private final AlertDialog val$dialog;
            private final EditText val$input;

            {
                this.this$0 = this;
                this.val$input = editText;
                this.val$dialog = alertDialogCreate;
            }

            @Override
            public void onClick(View view) {
                File fileByPath = FileUtils.getFileByPath(this.val$input.getText().toString());
                if (fileByPath != null && fileByPath.exists()) {
                    this.this$0.installBackend(fileByPath);
                    this.val$dialog.dismiss();
                } else {
                    Toasty.warning(Utils.isCN() ? "无效路径" : "Invalid path", 0).show();
                }
            }
        });
        editText.addTextChangedListener(new TextWatcher(this, alertDialogCreate, editText) {
            private final AdvancedSettingsFragment this$0;
            private final AlertDialog val$dialog;
            private final EditText val$input;

            {
                this.this$0 = this;
                this.val$dialog = alertDialogCreate;
                this.val$input = editText;
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.val$dialog.getButton(-1).setEnabled(!StringUtils.isTrimEmpty(this.val$input.getText().toString()));
            }
        });
        editText.setText(editText.getText().toString());
        editText.post(new Runnable(this, editText) {
            private final AdvancedSettingsFragment this$0;
            private final EditText val$input;

            {
                this.this$0 = this;
                this.val$input = editText;
            }

            @Override
            public void run() {
                KeyboardUtils.showSoftInput(this.val$input);
            }
        });
    }

    public void installBackend(File file) {
        String string;
        try {
            GradleBuilEvent gradleBuilEvent = (GradleBuilEvent) ApiManager.getIMainActivity().find(Class.forName("com.almlkaide.kaypro.aide.GradleBuilEvent"));
            if (gradleBuilEvent != null) {
                gradleBuilEvent.getGradleBuilder().install(getActivity(), file.getAbsolutePath());
                return;
            }
            if (Utils.isCN()) {
                try {
                    string = new StringBuffer().append("找不到").append(Class.forName("com.almlkaide.kaypro.aide.GradleBuilEvent").getName()).toString();
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            } else {
                try {
                    string = new StringBuffer().append(Class.forName("com.almlkaide.kaypro.aide.GradleBuilEvent").getName()).append(" not found").toString();
                } catch (ClassNotFoundException e2) {
                    throw new NoClassDefFoundError(e2.getMessage());
                }
            }
            Utils.toastError(string);
        } catch (ClassNotFoundException e3) {
            throw new NoClassDefFoundError(e3.getMessage());
        }
    }

    public void showUninstallBackendDialog() {
        uninstallBackend();
    }

    private void uninstallBackend() {
        String string;
        try {
            GradleBuilEvent gradleBuilEvent = (GradleBuilEvent) ApiManager.getIMainActivity().find(Class.forName("com.almlkaide.kaypro.aide.GradleBuilEvent"));
            if (gradleBuilEvent != null) {
                gradleBuilEvent.getGradleBuilder().uninstall(getActivity());
                return;
            }
            if (Utils.isCN()) {
                try {
                    string = new StringBuffer().append("找不到").append(Class.forName("com.almlkaide.kaypro.aide.GradleBuilEvent").getName()).toString();
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            } else {
                try {
                    string = new StringBuffer().append(Class.forName("com.almlkaide.kaypro.aide.GradleBuilEvent").getName()).append(" not found").toString();
                } catch (ClassNotFoundException e2) {
                    throw new NoClassDefFoundError(e2.getMessage());
                }
            }
            Utils.toastError(string);
        } catch (ClassNotFoundException e3) {
            throw new NoClassDefFoundError(e3.getMessage());
        }
    }

    private void initPreferenceScreenClickListener(String str) {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference(str);
        if (preferenceScreen == null) {
            return;
        }
        initPreferenceScreenClickListener(preferenceScreen);
    }

    private void initPreferenceScreenClickListener(PreferenceScreen preferenceScreen) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= preferenceScreen.getPreferenceCount()) {
                return;
            }
            Preference preference = preferenceScreen.getPreference(i2);
            if (preference instanceof PreferenceScreen) {
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) preference;
                initPreferenceScreenClickListener(preferenceScreen2);
                preferenceScreen2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(this) {
                    private final AdvancedSettingsFragment this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public boolean onPreferenceClick(Preference preference2) {
                        PreferenceScreen preferenceScreen3 = (PreferenceScreen) preference2;
                        Dialog dialog = preferenceScreen3.getDialog();
                        this.this$0.currentPreferenceScreen = dialog;
                        if (dialog != null) {
                            customWindow(preferenceScreen3, dialog);
                        }
                        AppTheme.customList((ListView) ReflectUtils.reflect(preferenceScreen3).field("mListView").get());
                        return false;
                    }

                    private void customWindow(PreferenceScreen preferenceScreen3, Dialog dialog) {
                        Window window = dialog.getWindow();
                        if (AIDEUtils.isLightTheme()) {
                            BarUtils.setStatusBarLightMode(window, true);
                        }
                        BaseActivity.setStatusBar(window);
                    }
                });
            }
            i = i2 + 1;
        }
    }

    private void setOnPreferenceClickListener(String str, Preference.OnPreferenceClickListener onPreferenceClickListener) {
        Preference preferenceFindPreference = findPreference(str);
        if (preferenceFindPreference != null) {
            preferenceFindPreference.setOnPreferenceClickListener(onPreferenceClickListener);
        }
    }

    private void setOnPreferenceChangeListener(String str, Preference.OnPreferenceChangeListener onPreferenceChangeListener) {
        Preference preferenceFindPreference = findPreference(str);
        if (preferenceFindPreference != null) {
            preferenceFindPreference.setOnPreferenceChangeListener(onPreferenceChangeListener);
        }
    }
}
