package com.almlkaide.kaypro.aide.util;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.almlkaide.kaypro.util.Toasty;
import com.almlkaide.kaypro.util.Utils;
import com.tencent.mm.util.TypedValue;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class ConverProject {
    private File project;

    public interface Listener {
        void onFinish(String str);

        void onStart();
    }

    public static void showDialog(Activity activity, File file) {
        if (file == null) {
            Toasty.error("project == null").show();
            return;
        }
        String[] strArr = {"转换为AppCompat工程", "转换为AndroidX工程"};
        if (!Utils.isCN()) {
            strArr = new String[]{"Convert to appcompat project", "Convert to AndroidX project"};
        }
        new AlertDialog.Builder(activity).setItems(strArr, new DialogInterface.OnClickListener(file, activity) {
            private final Activity val$act;
            private final File val$project;

            {
                this.val$project = file;
                this.val$act = activity;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ConverProject converProject = new ConverProject(this.val$project);
                Listener listener = new Listener(this, this.val$act) {

                    private ProgressDialog f4970pg;
                    private final AnonymousClass100000001 this$0;
                    private final Activity val$act;

                    {
                        this.this$0 = this;
                        this.val$act = activity;
                    }

                    @Override
                    public void onStart() {
                        this.f4970pg = ProgressDialog.show(this.val$act, (CharSequence) null, Utils.isCN() ? "正在转换..." : "Converting...", true, false);
                    }

                    @Override
                    public void onFinish(String str) {
                        if (this.f4970pg != null && this.f4970pg.isShowing()) {
                            this.f4970pg.dismiss();
                        }
                        new AlertDialog.Builder(this.val$act).setTitle(Utils.isCN() ? "转换完成" : "accomplish").setMessage(str).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
                    }
                };
                switch (i) {
                    case 0:
                        converProject.converToAppCompat(listener);
                        break;
                    case 1:
                        converProject.converToAndroidX(listener);
                        break;
                }
            }
        }).create().show();
    }

    public ConverProject(File file) {
        this.project = file;
    }

    public void converToAppCompat(Listener listener) {
        new ConverProjectTask(this, this.project, 0, listener).execute(new Void[0]);
    }

    public void converToAndroidX(Listener listener) {
        new ConverProjectTask(this, this.project, 1, listener).execute(new Void[0]);
    }

    private class ConverProjectTask extends AsyncTask<Void, Void, Void> {
        HashMap<String, String> artifact_map = new HashMap<>();
        HashMap<String, String> class_map = new HashMap<>();
        private int code;
        private Listener listener;
        private File project;
        long startTime;
        private final ConverProject this$0;

        @Override
        protected Void doInBackground(Void[] voidArr) {
            return doInBackground2(voidArr);
        }

        @Override
        protected void onPostExecute(Void r1) {
            onPostExecute2(r1);
        }

        public ConverProjectTask(ConverProject converProject, File file, int i, Listener listener) {
            this.this$0 = converProject;
            this.startTime = 0L;
            this.project = file;
            this.code = i;
            this.listener = listener;
            this.startTime = System.currentTimeMillis();
            listener.onStart();
        }

        protected Void doInBackground2(Void[] voidArr) throws Throwable {
            initMapping(this.artifact_map, Utils.getAssetsDataFile("androidx/androidx-artifact-mapping.csv"));
            initMapping(this.class_map, Utils.getAssetsDataFile("androidx/androidx-class-mapping.csv"));
            replaces(this.project, new FileFilter(this) {
                private final ConverProjectTask this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public boolean accept(File file) {
                    if (file.isDirectory()) {
                        if ("build".equals(file.getName()) && new File(file.getParentFile(), "build.gradle").exists()) {
                            LogUtils.i(new Object[]{"continue", file.getName()});
                            return false;
                        }
                        if (!"bin".equals(file.getName()) || !new File(file.getParentFile(), "AndroidManifest.xml").exists()) {
                            return true;
                        }
                        LogUtils.i(new Object[]{"continue", file.getName()});
                        return false;
                    }
                    if (file.getName().endsWith(".java") || file.getName().endsWith(TypedValue.XML_FILE) || file.getName().endsWith(".gradle") || file.getName().endsWith(".pro") || file.getName().endsWith(".json")) {
                        return true;
                    }
                    return FileUtils.isUtf8(file);
                }
            });
            return (Void) null;
        }

        protected void onPostExecute2(Void r7) {
            super.onPostExecute(r7);
            String string = new StringBuffer().append(System.currentTimeMillis() - this.startTime).append("ms").toString();
            StringBuffer stringBuffer = new StringBuffer();
            if (Utils.isCN()) {
                stringBuffer.append(new StringBuffer().append("请退出AIDE或者重新打开工程\n\n秏时：").append(string).toString());
            } else {
                stringBuffer.append(new StringBuffer().append("Please exit aide or reopen the project\n\ntime：").append(string).toString());
            }
            this.listener.onFinish(stringBuffer.toString());
        }

        private void replaces(File file, FileFilter fileFilter) {
            File[] fileArrListFiles = file.listFiles(fileFilter);
            if (fileArrListFiles == null) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= fileArrListFiles.length) {
                    return;
                }
                File file2 = fileArrListFiles[i2];
                if (file2.isDirectory()) {
                    replaces(file2, fileFilter);
                } else {
                    String file2String = FileIOUtils.readFile2String(file2);
                    if (file2String != null) {
                        String strReplace = file2String;
                        for (String str : this.class_map.keySet()) {
                            if (strReplace.contains(str)) {
                                strReplace = strReplace.replace(str, this.class_map.get(str));
                            }
                        }
                        for (String str2 : this.artifact_map.keySet()) {
                            if (strReplace.contains(str2)) {
                                strReplace = strReplace.replace(str2, this.artifact_map.get(str2));
                            }
                        }
                        FileIOUtils.writeFileFromString(file2, strReplace);
                    }
                }
                i = i2 + 1;
            }
        }

        private void initMapping(HashMap<String, String> map, String str) throws Throwable {
            InputStream inputStreamOpen;
            Throwable th;
            Scanner scanner;
            InputStream inputStream;
            Scanner scanner2;
            InputStream inputStream2 = (InputStream) null;
            Scanner scanner3 = (Scanner) null;
            try {
                inputStreamOpen = Utils.getApp().getAssets().open(str);
                try {
                    scanner2 = new Scanner(inputStreamOpen, "utf-8");
                    try {
                        scanner2.nextLine();
                        while (scanner2.hasNextLine()) {
                            String[] strArrSplit = scanner2.nextLine().split(",");
                            if (strArrSplit.length >= 2) {
                                String str2 = strArrSplit[0];
                                String str3 = strArrSplit[1];
                                if (this.code == 0) {
                                    map.put(str3, str2);
                                } else {
                                    map.put(str2, str3);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        scanner = scanner2;
                        inputStream = inputStreamOpen;
                        try {
                            inputStream.close();
                            scanner.close();
                            throw th;
                        } catch (Throwable th3) {
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                }
            } catch (Throwable th5) {
                inputStreamOpen = inputStream2;
            }
            try {
                inputStreamOpen.close();
                scanner2.close();
            } catch (Throwable th6) {
            }
        }
    }
}
