package com.almlkaide.kaypro.aide.builder.task;

import android.app.AlertDialog;
import android.content.Context;
import com.almlkaide.kaypro.util.Toasty;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;

public class UnInstallTask extends BaseDialogTask<String, String, Void> {
    @Override
    protected Object doInBackground(Object[] objArr) {
        return doInBackground((String[]) objArr);
    }

    @Override
    protected void onPostExecute(Object obj) {
        onPostExecute((Void) obj);
    }

    @Override
    protected void onProgressUpdate(Object[] objArr) {
        onProgressUpdate((String[]) objArr);
    }

    public UnInstallTask(Context context) {
        super(context);
    }

    protected Void doInBackground(String[] strArr) {
        delect(new File(strArr[0]));
        return (Void) null;
    }

    protected void onPostExecute(Void r2) {
        super.onPostExecute(r2);
        if (this.mDialog != null) {
            this.mDialog.dismiss();
        }
        Toasty.success(Utils.isCN() ? "卸载成功" : "Uninstall successful").show();
    }

    @Override
    protected void onBuildDialog(AlertDialog.Builder builder) {
        super.onBuildDialog(builder);
        builder.setTitle(Utils.isCN() ? "正在卸载中..." : "Uninstalling...");
        builder.setCancelable(false);
    }

    protected void onProgressUpdate(String[] strArr) {
        super.onProgressUpdate((Object[]) strArr);
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        setText(strArr[0]);
    }

    void delect(File file) {
        File[] fileArrListFiles;
        if (file != null) {
            if (file.isFile()) {
                file.delete();
                publishProgress(new String[]{file.getAbsolutePath()});
            } else {
                if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
                    return;
                }
                for (File file2 : fileArrListFiles) {
                    delect(file2);
                }
            }
        }
    }
}
