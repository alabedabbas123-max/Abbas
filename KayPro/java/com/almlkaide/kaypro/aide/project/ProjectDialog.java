package com.almlkaide.kaypro.aide.project;

import abcd.Pf;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.google.gson.Gson;
import com.almlkaide.kaypro.aide.AdvancedSetting;
import com.almlkaide.kaypro.aide.project.adapter.TemplateAdapter;
import com.almlkaide.kaypro.aide.project.jsonbean.Category;
import com.almlkaide.kaypro.aide.project.jsonbean.CategoryList;
import com.almlkaide.kaypro.aide.project.jsonbean.Project;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import com.almlkaide.kaypro.util.Toasty;
import com.almlkaide.kaypro.util.Utils;
import com.almlkaide.kaypro.widget.CustomExpandableListView;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;

public class ProjectDialog {
    public static void showCreateDialog(Activity activity) {
        CustomExpandableListView customExpandableListView = new CustomExpandableListView(activity);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(Utils.isCN() ? "新建项目" : "Create New Project").setView(customExpandableListView).setPositiveButton(Utils.isCN() ? "更多" : "More", new DialogInterface.OnClickListener(activity) {
            private final Activity val$activity;

            {
                this.val$activity = activity;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ReflectUtils.reflect("com.aide.ui.ib").method("EQ_SOURCE", new Object[]{this.val$activity});
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setNeutralButton("Git", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                new Pf().run();
            }
        }).create();
        alertDialogCreate.show();
        try {
            try {
                TemplateAdapter templateAdapter = new TemplateAdapter(activity, ((CategoryList) new Gson().fromJson((Reader) new InputStreamReader(activity.getAssets().open(PUtils.getAssetsFile(Utils.isCN() ? "template.zh.json" : "template.json"))), (Class) Class.forName("com.almlkaide.kaypro.aide.project.jsonbean.CategoryList"))).getCategory());
                customExpandableListView.setAdapter(templateAdapter);
                customExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener(templateAdapter, activity, alertDialogCreate) {
                    private final Activity val$activity;
                    private final TemplateAdapter val$adapter;
                    private final AlertDialog val$dialog;

                    {
                        this.val$adapter = templateAdapter;
                        this.val$activity = activity;
                        this.val$dialog = alertDialogCreate;
                    }

                    @Override
                    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                        ProjectDialog.createProject(this.val$activity, this.val$adapter.getChild(i, i2));
                        this.val$dialog.dismiss();
                        return false;
                    }
                });
                if (templateAdapter.getGroupCount() > 0) {
                    customExpandableListView.expandGroup(0, false);
                }
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        } catch (Throwable th) {
            Utils.showExDialog(activity, th);
        }
        customExpandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener(customExpandableListView) {
            private final ExpandableListView val$expandableListView;

            {
                this.val$expandableListView = customExpandableListView;
            }

            @Override
            public void onGroupExpand(int i) {
                ExpandableListAdapter expandableListAdapter = this.val$expandableListView.getExpandableListAdapter();
                for (int i2 = 0; i2 < expandableListAdapter.getGroupCount(); i2++) {
                    if (i2 != i && this.val$expandableListView.isGroupExpanded(i2)) {
                        this.val$expandableListView.collapseGroup(i2);
                    }
                }
            }
        });
    }

    private static File getCreateLocation(File file, String str, int i) {
        File file2 = new File(file, i > 1 ? new StringBuffer().append(str).append(i).toString() : str);
        return !file2.exists() ? file2 : getCreateLocation(file, str, i + 1);
    }

    public static void createProject(Activity activity, Category.Templates templates) {
        Project project = templates.getProject();
        CreateProjectView createProjectView = new CreateProjectView(activity);
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setCancelable(true).setTitle(templates.getTitle()).setView(createProjectView).setPositiveButton(Utils.isCN() ? "创建" : "Create", (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        Bitmap icon = PUtils.getIcon(activity, templates.getIcon());
        if (icon != null) {
            negativeButton.setIcon(new BitmapDrawable(icon));
        }
        AlertDialog alertDialogCreate = negativeButton.create();
        alertDialogCreate.show();
        EditText editText = createProjectView.input_projectName.getEditText();
        EditText editText2 = createProjectView.input_packageName.getEditText();
        if (project.isNoPkg()) {
            editText2.setEnabled(false);
            createProjectView.input_packageName.setVisibility(8);
        }
        String fileBrowserCurrentDir = AIDEUtils.getFileBrowserCurrentDir();
        File file = fileBrowserCurrentDir != null ? new File(fileBrowserCurrentDir) : ProjectUtils.getAppProjects();
        Button button = alertDialogCreate.getButton(-1);
        TextWatcher textWatcher = new TextWatcher(editText, file, button, editText2) {
            private final Button val$button1;
            private final File val$createLocation;
            private final EditText val$input_packageName;
            private final EditText val$input_projectName;

            {
                this.val$input_projectName = editText;
                this.val$createLocation = file;
                this.val$button1 = button;
                this.val$input_packageName = editText2;
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (this.val$input_projectName.getText().toString().trim().length() == 0 || new File(this.val$createLocation, this.val$input_projectName.getText().toString()).exists()) {
                    this.val$button1.setEnabled(false);
                } else if (this.val$input_packageName.isEnabled() && this.val$input_packageName.getText().toString().trim().length() == 0) {
                    this.val$button1.setEnabled(false);
                } else {
                    this.val$button1.setEnabled(true);
                }
            }
        };
        editText.addTextChangedListener(textWatcher);
        editText2.addTextChangedListener(textWatcher);
        editText.setText(getCreateLocation(file, "Application", 1).getName());
        editText2.setText(AdvancedSetting.getPackagePrefix(editText.getText().toString()));
        editText.selectAll();
        editText.post(new Runnable(editText) {
            private final EditText val$input_projectName;

            {
                this.val$input_projectName = editText;
            }

            @Override
            public void run() {
                KeyboardUtils.showSoftInput(this.val$input_projectName);
            }
        });
        button.setOnClickListener(new View.OnClickListener(editText, editText2, templates, alertDialogCreate, activity, file) {
            private String packageName;
            private String packageNameJNI;
            private Project projectInfo;
            private String projectName;
            private final Activity val$act;
            private final File val$createLocation;
            private final AlertDialog val$dialog;
            private final EditText val$input_packageName;
            private final EditText val$input_projectName;
            private final Category.Templates val$templates;

            {
                this.val$input_projectName = editText;
                this.val$input_packageName = editText2;
                this.val$templates = templates;
                this.val$dialog = alertDialogCreate;
                this.val$act = activity;
                this.val$createLocation = file;
            }

            @Override
            public void onClick(View view) {
                this.projectName = this.val$input_projectName.getText().toString();
                this.packageName = this.val$input_packageName.getText().toString();
                this.packageNameJNI = this.packageName.replace(".", "_");
                this.projectInfo = this.val$templates.getProject();
                this.val$dialog.dismiss();
                new CreateTask(this, this.val$act, this.val$createLocation).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }

            private boolean canWrite(File file2) {
                File file3 = new File(file2, UUID.randomUUID().toString().replace("/", "_"));
                LogUtils.iTag("testCanWrite", new Object[]{file3.getAbsolutePath()});
                if (file3.getParentFile() != null) {
                    file3.getParentFile().mkdirs();
                }
                try {
                    try {
                        if (file3.createNewFile()) {
                            return true;
                        }
                    } catch (Throwable th) {
                        LogUtils.eTag("testCanWrite", new Object[]{th});
                    }
                    return false;
                } finally {
                    FileUtils.delete(file3);
                }
            }

            class CreateTask extends AsyncTask<Void, Void, Void> {
                private File dest;

                IOException f4966ex;

                private ProgressDialog f4967pd;
                private final AnonymousClass100000007 this$0;
                private final Activity val$act;
                private final File val$createLocation;

                @Override
                protected Void doInBackground(Void[] voidArr) {
                    return doInBackground2(voidArr);
                }

                @Override
                protected void onPostExecute(Void r1) {
                    onPostExecute2(r1);
                }

                public CreateTask(AnonymousClass100000007 anonymousClass100000007, Activity activity, File file) {
                    this.this$0 = anonymousClass100000007;
                    this.val$act = activity;
                    this.val$createLocation = file;
                    this.f4967pd = ProgressDialog.show(this.val$act, (CharSequence) null, Utils.isCN() ? "正在创建工程中..." : "Createing Project...", true, false);
                }

                protected Void doInBackground2(Void[] voidArr) {
                    try {
                        File file = new File(this.val$act.getCacheDir(), "templates_temp.zip");
                        ResourceUtils.copyFileFromAssets(PUtils.getAssetsFile(this.this$0.projectInfo.getTemplate()), file.getAbsolutePath());
                        this.dest = new File(this.val$createLocation, this.this$0.projectName);
                        ZipUtils.unzipFile(file, this.dest);
                        file.delete();
                        replaces(this.dest);
                    } catch (IOException e) {
                        this.f4966ex = e;
                    }
                    return (Void) null;
                }

                protected void onPostExecute2(Void r9) {
                    super.onPostExecute(r9);
                    try {
                        if (this.f4966ex != null) {
                            Utils.showExDialog(this.val$act, this.f4966ex);
                            return;
                        }
                        try {
                            File file = !TextUtils.isEmpty(this.this$0.projectInfo.getMain()) ? new File(this.dest, this.this$0.projectInfo.getMain()) : this.dest;
                            ArrayList arrayList = new ArrayList();
                            for (String str : this.this$0.projectInfo.getOpenFile()) {
                                if (str.trim().length() != 0) {
                                    File file2 = new File(file, str.replace("$package_name$", this.this$0.packageName.replace(".", "/")));
                                    if (file2.exists() && file2.isFile()) {
                                        arrayList.add(file2);
                                    }
                                }
                            }
                            AIDEUtils.openProject(file.getAbsolutePath(), arrayList);
                        } catch (Throwable th) {
                            Toasty.error(Utils.getStackTrace(th)).show();
                        }
                    } finally {
                        this.f4967pd.dismiss();
                    }
                }
            }

            public void replaces(File file2) {
                File file3;
                File[] fileArrListFiles = file2.listFiles(new FileFilter(this) {
                    private final AnonymousClass100000007 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public boolean accept(File file4) {
                        if (file4.isDirectory()) {
                            return true;
                        }
                        Iterator<String> it = this.this$0.projectInfo.getReplaces().iterator();
                        while (it.hasNext()) {
                            if (Pattern.matches(it.next(), file4.getAbsolutePath())) {
                                return true;
                            }
                        }
                        return false;
                    }
                });
                if (fileArrListFiles == null) {
                    return;
                }
                for (File file4 : fileArrListFiles) {
                    if (file4.getName().contains("$package_name$")) {
                        file3 = new File(file4.getParentFile(), file4.getName().replace("$package_name$", file4.isDirectory() ? this.packageName.replace(".", "/") : this.packageName));
                        if (file3.isDirectory()) {
                            file3.mkdirs();
                        } else {
                            file3.getParentFile().mkdirs();
                        }
                        file4.renameTo(file3);
                    } else {
                        file3 = file4;
                    }
                    if (file3.isFile()) {
                        String file2String = FileIOUtils.readFile2String(file3);
                        if (!StringUtils.isTrimEmpty(file2String)) {
                            FileIOUtils.writeFileFromString(file3, file2String.replace("$package_name$", this.packageName).replace("$project_name$", this.projectName).replace("$package_name_jni$", this.packageNameJNI));
                        }
                    } else {
                        replaces(file3);
                    }
                }
            }
        });
        alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                dialogInterface.dismiss();
                return true;
            }
        });
    }

    private static class CreateProjectView extends LinearLayout {
        private TitleEditText input_packageName;
        private TitleEditText input_projectName;

        public CreateProjectView(Context context) {
            super(context);
            this.input_projectName = new TitleEditText(context, Utils.isCN() ? "应用名：" : "App Name:");
            this.input_packageName = new TitleEditText(context, Utils.isCN() ? "包名：" : "Package Name:");
            setOrientation(1);
            addView(this.input_projectName);
            addView(this.input_packageName);
            setPadding(PUtils.dp2px(24), PUtils.dp2px(10), PUtils.dp2px(24), 0);
        }
    }

    private static class TitleEditText extends LinearLayout {
        private EditText editText;

        public TitleEditText(Context context, CharSequence charSequence) {
            super(context);
            this.editText = new EditText(context);
            setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(charSequence);
            textView.setTextSize(17);
            addView(textView);
            addView(this.editText, -1, -2);
        }

        public EditText getEditText() {
            return this.editText;
        }
    }
}
