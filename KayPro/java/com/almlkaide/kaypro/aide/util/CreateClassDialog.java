package com.almlkaide.kaypro.aide.util;

import abcd.Vl;
import abcd.gj;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.aide.common.ab;
import com.aide.ui.U;
import com.baidu.mobstat.Config;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.almlkaide.kaypro.assetsmanager.project.SelectOptionDialog;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.commons.io.IOUtils;

public class CreateClassDialog implements View.OnClickListener, DialogInterface.OnClickListener, AdapterView.OnItemSelectedListener {
    private final ab<String> mAbVar;
    private final Activity mActivity;
    private ArrayAdapter<Item> mAdapter;
    private Configuration mConfiguration = new Configuration(this);
    private final String mCreateInDir;
    private AlertDialog mDialog;
    private DialogView mDialogView;

    public static abstract class CreateClass {
        public abstract String makeCode(Configuration configuration);
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public static void showDialog(Activity activity, String str, ab<String> abVar) {
        new SelectOptionDialog(activity, str, abVar).showDialog();
    }

    public CreateClassDialog(Activity activity, String str, ab<String> abVar) {
        this.mActivity = activity;
        this.mCreateInDir = str;
        this.mAbVar = abVar;
    }

    public void showDialog() {
        initDialogView();
        ScrollView scrollView = new ScrollView(this.mActivity);
        this.mDialogView.setPadding(Utils.dp2px(24), 0, Utils.dp2px(24), 0);
        scrollView.addView(this.mDialogView, -1, -2);
        this.mDialog = new AlertDialog.Builder(this.mActivity).setTitle(Utils.isCN() ? "添加新类" : "Add New Class").setView(scrollView).setPositiveButton(Utils.isCN() ? "创建" : "Create", this).setNegativeButton(R.string.cancel, this).create();
        this.mDialog.show();
        this.mDialogView.input.post(new Runnable(this) {
            private final CreateClassDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void run() {
                KeyboardUtils.showSoftInput(this.this$0.mDialogView.input);
            }
        });
        this.mDialog.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
            private final CreateClassDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                InputMethodManager inputMethodManager = (InputMethodManager) Utils.getApp().getSystemService("input_method");
                if (KeyboardUtils.isSoftInputVisible(this.this$0.mActivity)) {
                    inputMethodManager.toggleSoftInput(1, 0);
                }
            }
        });
        Button button = this.mDialog.getButton(-1);
        button.setOnClickListener(this);
        this.mDialogView.input.addTextChangedListener(new TextWatcher(this, button) {
            private final CreateClassDialog this$0;
            private final Button val$btn;

            {
                this.this$0 = this;
                this.val$btn = button;
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.val$btn.setEnabled(charSequence.length() != 0);
            }
        });
        this.mDialogView.input.setText("");
        this.mDialogView.input.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            private final CreateClassDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6) {
                    this.this$0.onClick(this.this$0.mDialog.getButton(-1));
                }
                return this.this$0.mDialogView.input.getError() != null;
            }
        });
    }

    private void initDialogView() {
        this.mDialogView = new DialogView(this.mActivity);
        this.mAdapter = new ArrayAdapter<>(this.mActivity, R.layout.simple_list_item_1);
        addAdapterData(this.mAdapter);
        this.mDialogView.spinner.setAdapter((SpinnerAdapter) this.mAdapter);
        this.mDialogView.spinner.setOnItemSelectedListener(this);
    }

    private void addAdapterData(ArrayAdapter<Item> arrayAdapter) {
        ArrayList<Item> arrayList = new ArrayList();
        arrayList.add(new Item(this, "Class - 类", new CreateBasicClass(this)));
        arrayList.add(new Item(this, "Activity - 活动", new CreateActivity(this)));
        arrayList.add(new Item(this, "Interface - 接口", new CreateInterface(this)));
        arrayList.add(new Item(this, "Enum - 枚举", new CreateEnum(this)));
        arrayList.add(new Item(this, "Service - 服务", new CreateService(this)));
        arrayList.add(new Item(this, "BroadcastReceiver - 广播接收器", new CreateBroadcastReceiver(this)));
        if (!Utils.isCN()) {
            for (Item item : arrayList) {
                int iLastIndexOf = item.title.lastIndexOf(" - ");
                if (iLastIndexOf > 0) {
                    item.title = item.title.substring(0, iLastIndexOf).trim();
                }
            }
        }
        arrayAdapter.addAll(arrayList);
    }

    private String getSimpleName(String str) {
        if (str.toLowerCase(Locale.ENGLISH).endsWith(".java")) {
            return str.substring(0, str.length() - ".java".length());
        }
        return str;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == this.mDialog.getButton(-1).getId()) {
            String inputContent = this.mDialogView.getInputContent();
            if (inputContent.trim().length() == 0 || Character.isDigit(inputContent.charAt(0))) {
                this.mDialogView.input.setError(Utils.isCN() ? "无效类名" : "Invalid class name");
                return;
            }
            String simpleName = getSimpleName(inputContent);
            if (simpleName.trim().length() == 0) {
                this.mDialogView.input.setError(Utils.isCN() ? "无效类名" : "Invalid class name");
                return;
            }
            Item item = this.mAdapter.getItem(this.mDialogView.spinner.getSelectedItemPosition());
            upConfiguration();
            String strMakeCode = item.createClass.makeCode(this.mConfiguration);
            File file = new File(this.mCreateInDir, new StringBuffer().append(simpleName).append(".java").toString());
            if (file.getParentFile() != null) {
                file.getParentFile().mkdirs();
            }
            if (file.exists()) {
                this.mDialogView.input.setError(Utils.isCN() ? "文件已存在" : "file already exist");
                return;
            }
            try {
                if (file.createNewFile()) {
                    file.delete();
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(strMakeCode);
                Vl.j6(file.getAbsolutePath(), stringBuffer.toString());
                this.mAbVar.j6(file.getAbsolutePath());
                if (AIDEUtils.getCurrentEditorFile() != null) {
                    String absolutePath = AIDEUtils.getCurrentEditorFile().getParentFile().getAbsolutePath();
                    if (!absolutePath.equals(AIDEUtils.getFileBrowserCurrentDir())) {
                        AIDEUtils.setFileBrowserCurrentDir(absolutePath);
                    }
                }
                this.mDialog.dismiss();
                LogUtils.i(new Object[]{new StringBuffer().append("mAbVar = ").append(this.mAbVar).toString(), new StringBuffer().append("\nfile = ").append(file).toString(), new StringBuffer().append("\nsb = ").append((Object) stringBuffer).toString()});
            } catch (IOException e) {
                this.mDialogView.input.setError(Utils.isCN() ? "无法写入" : "Unable to write");
            }
        }
    }

    private void upConfiguration() {
        String strDW;
        String inputContent = this.mDialogView.getInputContent();
        if (inputContent.contains("/")) {
            strDW = gj.DW(U.vy().J8(), U.vy().tp(), new File(this.mCreateInDir, new File(inputContent).getParentFile().getAbsolutePath()).getAbsolutePath());
        } else {
            strDW = gj.DW(U.vy().J8(), U.vy().tp(), this.mCreateInDir);
        }
        this.mConfiguration.packageName = strDW;
        String simpleName = getSimpleName(this.mDialogView.getInputContent());
        int iLastIndexOf = simpleName.lastIndexOf("/");
        if (iLastIndexOf >= 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1, simpleName.length());
        }
        this.mConfiguration.className = simpleName;
        this.mConfiguration.isAddTag = this.mDialogView.cb_more.isChecked() && this.mDialogView.cb_addTag.isChecked();
        this.mConfiguration.abstractModifier = this.mDialogView.cb_more.isChecked() && this.mDialogView.cb_abstract.isChecked();
    }

    class Item {
        public final CreateClass createClass;
        private final CreateClassDialog this$0;
        public String title;

        public Item(CreateClassDialog createClassDialog, String str, CreateClass createClass) {
            this.this$0 = createClassDialog;
            this.title = str;
            this.createClass = createClass;
        }

        public String toString() {
            return this.title;
        }
    }

    class CreateBasicClass extends CreateClass {
        private final CreateClassDialog this$0;

        @Override
        public String makeCode(Configuration configuration) {
            StringBuffer stringBuffer = new StringBuffer();
            if (!TextUtils.isEmpty(configuration.packageName)) {
                stringBuffer.append(String.format("package %s;", configuration.packageName));
                stringBuffer.append("\n\n");
            }
            stringBuffer.append("public ");
            if (configuration.abstractModifier) {
                stringBuffer.append("abstract ");
            }
            stringBuffer.append("class ");
            stringBuffer.append(configuration.className);
            stringBuffer.append(" ");
            stringBuffer.append("{\n    \n    ");
            if (configuration.isAddTag) {
                stringBuffer.append(String.format("public static final String TAG = \"%s\";\n    \n    ", configuration.className));
            }
            stringBuffer.append("\n    \n}");
            return stringBuffer.toString();
        }

        public CreateBasicClass(CreateClassDialog createClassDialog) {
            this.this$0 = createClassDialog;
        }
    }

    class CreateActivity extends CreateClass {
        private final CreateClassDialog this$0;

        @Override
        public String makeCode(Configuration configuration) {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(!TextUtils.isEmpty(configuration.packageName) ? new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("package ").append(configuration.packageName).toString()).append(";").toString()).append("\n\n").toString() : "").append("import android.app.Activity;").toString()).append("\nimport android.os.Bundle;").toString()).append(IOUtils.LINE_SEPARATOR_UNIX).toString()).append("\npublic ").toString()).append(configuration.abstractModifier ? "abstract " : "").toString()).append("class ").toString()).append(configuration.className).toString()).append(" extends Activity {").toString()).append("\n    ").toString()).append(configuration.isAddTag ? new StringBuffer().append(new StringBuffer().append("\n    public static final String TAG = \"").append(configuration.className).toString()).append("\";\n    ").toString() : "").toString()).append("\n    @Override").toString()).append("\n    protected void onCreate(Bundle savedInstanceState) {").toString()).append("\n        super.onCreate(savedInstanceState);").toString()).append("\n        ").toString()).append("\n    }").toString()).append("\n    ").toString()).append("\n}").toString();
        }

        public CreateActivity(CreateClassDialog createClassDialog) {
            this.this$0 = createClassDialog;
        }
    }

    class CreateInterface extends CreateClass {
        private final CreateClassDialog this$0;

        @Override
        public String makeCode(Configuration configuration) {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(!TextUtils.isEmpty(configuration.packageName) ? new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("package ").append(configuration.packageName).toString()).append(";").toString()).append("\n\n").toString() : "").append("public ").toString()).append(configuration.abstractModifier ? "abstract " : "").toString()).append("interface ").toString()).append(configuration.className).toString()).append(" {").toString()).append("\n    ").toString()).append("\n    ").toString()).append(configuration.isAddTag ? new StringBuffer().append(new StringBuffer().append("public static final String TAG = \"").append(configuration.className).toString()).append("\";\n    \n    ").toString() : "").toString()).append("\n    ").toString()).append("\n}").toString();
        }

        public CreateInterface(CreateClassDialog createClassDialog) {
            this.this$0 = createClassDialog;
        }
    }

    class CreateEnum extends CreateClass {
        private final CreateClassDialog this$0;

        @Override
        public String makeCode(Configuration configuration) {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(!TextUtils.isEmpty(configuration.packageName) ? new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("package ").append(configuration.packageName).toString()).append(";").toString()).append("\n\n").toString() : "").append("public ").toString()).append(configuration.abstractModifier ? "abstract " : "").toString()).append("enum ").toString()).append(configuration.className).toString()).append(" {").toString()).append("\n    ").toString()).append("\n    \n    \n    ;\n    ").toString()).append(configuration.isAddTag ? new StringBuffer().append(new StringBuffer().append("\n    public static final String TAG = \"").append(configuration.className).toString()).append("\";\n    ").toString() : "").toString()).append("\n    \n    ").toString()).append("\n}").toString();
        }

        public CreateEnum(CreateClassDialog createClassDialog) {
            this.this$0 = createClassDialog;
        }
    }

    class CreateService extends CreateClass {
        private final CreateClassDialog this$0;

        @Override
        public String makeCode(Configuration configuration) {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(!TextUtils.isEmpty(configuration.packageName) ? new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("package ").append(configuration.packageName).toString()).append(";").toString()).append("\n\n").toString() : "").append("import android.app.Service;").toString()).append("\nimport android.content.Intent;").toString()).append("\nimport android.os.IBinder;").toString()).append(IOUtils.LINE_SEPARATOR_UNIX).toString()).append("\npublic ").toString()).append(configuration.abstractModifier ? "abstract " : "").toString()).append("class ").toString()).append(configuration.className).toString()).append(" extends Service {").toString()).append("\n    ").toString()).append(configuration.isAddTag ? new StringBuffer().append(new StringBuffer().append("\n    public static final String TAG = \"").append(configuration.className).toString()).append("\";\n    ").toString() : "").toString()).append("\n    @Override").toString()).append("\n    public IBinder onBind(Intent intent) {").toString()).append("\n        ").toString()).append("\n        return null;").toString()).append("\n    }").toString()).append("\n    ").toString()).append("\n}").toString();
        }

        public CreateService(CreateClassDialog createClassDialog) {
            this.this$0 = createClassDialog;
        }
    }

    class CreateBroadcastReceiver extends CreateClass {
        private final CreateClassDialog this$0;

        @Override
        public String makeCode(Configuration configuration) {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(!TextUtils.isEmpty(configuration.packageName) ? new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("package ").append(configuration.packageName).toString()).append(";").toString()).append("\n\n").toString() : "").append("import android.content.BroadcastReceiver;").toString()).append("\nimport android.content.Context;").toString()).append("\nimport android.content.Intent;").toString()).append(IOUtils.LINE_SEPARATOR_UNIX).toString()).append("\npublic ").toString()).append(configuration.abstractModifier ? "abstract " : "").toString()).append("class ").toString()).append(configuration.className).toString()).append(" extends BroadcastReceiver {").toString()).append("\n    ").toString()).append(configuration.isAddTag ? new StringBuffer().append(new StringBuffer().append("\n    public static final String TAG = \"").append(configuration.className).toString()).append("\";\n    ").toString() : "").toString()).append("\n    @Override").toString()).append("\n    public void onReceive(Context context, Intent intent) {").toString()).append("\n        ").toString()).append("\n    }").toString()).append("\n    ").toString()).append("\n}").toString();
        }

        public CreateBroadcastReceiver(CreateClassDialog createClassDialog) {
            this.this$0 = createClassDialog;
        }
    }

    class Configuration {
        public boolean abstractModifier;
        public boolean isAddTag;
        private final CreateClassDialog this$0;
        public String packageName = Config.INPUT_DEF_PKG;
        public String className = "clazz";

        public Configuration(CreateClassDialog createClassDialog) {
            this.this$0 = createClassDialog;
        }
    }

    static class DialogView extends LinearLayout {
        private CheckBox cb_abstract;
        private CheckBox cb_addTag;
        private CheckBox cb_more;
        private final EditText input;
        private final Spinner spinner;

        public DialogView(Context context) {
            super(context);
            setOrientation(1);
            this.input = new EditText(context);
            this.input.setHint(Utils.isCN() ? "类名.." : "Class Name...");
            this.input.setSingleLine(true);
            this.input.setInputType(1);
            this.input.setImeOptions(6);
            this.spinner = new Spinner(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            this.cb_abstract = new CheckBox(context);
            this.cb_abstract.setText(Utils.isCN() ? "Abstract - 抽象修饰" : "Abstract Modification");
            this.cb_addTag = new CheckBox(context);
            this.cb_addTag.setText(Utils.isCN() ? "添加TAG" : "add TAG");
            linearLayout.addView(this.cb_addTag);
            linearLayout.addView(this.cb_abstract);
            linearLayout.setVisibility(8);
            this.cb_more = new CheckBox(context);
            this.cb_more.setText(Utils.isCN() ? "更多选项" : "More option..");
            this.cb_more.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this, linearLayout) {
                private final DialogView this$0;
                private final LinearLayout val$ll_more;

                {
                    this.this$0 = this;
                    this.val$ll_more = linearLayout;
                }

                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.val$ll_more.setVisibility(z ? 0 : 8);
                }
            });
            addView(this.input);
            addView(this.spinner);
            addView(this.cb_more);
            addView(linearLayout);
        }

        public String getInputContent() {
            return this.input.getText().toString();
        }
    }
}
