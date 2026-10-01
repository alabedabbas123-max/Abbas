package com.almlkaide.kaypro.manifesteditor.ndk;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.aide.ui.build.android.Q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.b.a.a.ClassC;
import org.b.a.a.ClassD;

public class InstallNdk extends AsyncTask {

    private final Activity f3715a;

    private ProgressDialog f3716b;

    static {
        System.loadLibrary("link");
    }

    public InstallNdk(Activity activity) {
        this.f3715a = activity;
    }

    public static void m5806a(Activity activity) {
        LinearLayout linearLayout = new LinearLayout(activity);
        EditText editText = new EditText(activity);
        editText.setHint("输入ndk压缩包路径");
        linearLayout.addView(editText);
        new AlertDialog.Builder(activity).setTitle("安装NDK").setView(linearLayout).setCancelable(false).setPositiveButton("安装", new DialogInterfaceOnClickListenera(activity, editText)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).show();
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        layoutParams.width = -1;
        editText.setLayoutParams(layoutParams);
    }

    private void m5808a(String str, File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
        ClassD c1806d = new ClassD(gZIPInputStream);
        try {
            file.mkdirs();
            byte[] bArr = new byte[4096];
            while (true) {
                ClassC c1805cM7544a = c1806d.m7544a();
                if (c1805cM7544a == null) {
                    new File(file, ".installed").createNewFile();
                    return;
                }
                publishProgress(c1805cM7544a.m7514a());
                File file2 = new File(file, c1805cM7544a.m7514a());
                if (c1805cM7544a.m7535j()) {
                    file2.mkdirs();
                } else if (c1805cM7544a.m7536k()) {
                    symlink(c1805cM7544a.m7520b(), file2.getAbsolutePath());
                } else if (c1805cM7544a.m7537l()) {
                    link(c1805cM7544a.m7520b(), file2.getAbsolutePath());
                } else {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    while (true) {
                        int i = c1806d.read(bArr);
                        if (i <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i);
                        }
                    }
                    fileOutputStream.close();
                    if ((c1805cM7544a.m7524c() & 292) > 0) {
                        file2.setExecutable(true);
                    }
                }
            }
        } finally {
            c1806d.close();
            gZIPInputStream.close();
            fileInputStream.close();
        }
    }

    public static void m5809b(Activity activity, String str) {
        new InstallNdk(activity).execute(str);
    }

    private static native void link(String str, String str2);

    private static native void symlink(String str, String str2);

    @Override
    public Boolean doInBackground(String... strArr) {
        try {
            m5808a(strArr[0], Q.Zo());
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public void onPostExecute(Boolean bool) {
        this.f3716b.dismiss();
        new AlertDialog.Builder(this.f3715a).setTitle("安装结束").setMessage(bool.booleanValue() ? "安装完成" : "安装失败").setPositiveButton("确定", (DialogInterface.OnClickListener) null).show();
    }

    @Override
    public void onProgressUpdate(CharSequence... charSequenceArr) {
        this.f3716b.setMessage(charSequenceArr[0]);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        this.f3716b = new ProgressDialog(this.f3715a);
        this.f3716b.setTitle("正在安装...");
        this.f3716b.setCancelable(false);
        this.f3716b.show();
    }
}
