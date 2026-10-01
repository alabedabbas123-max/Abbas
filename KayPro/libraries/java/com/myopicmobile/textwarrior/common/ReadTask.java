package com.myopicmobile.textwarrior.common;

import android.R;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import com.androlua.LuaEditor;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadTask extends AsyncTask {
    private static int _total = 0;
    protected final Document _buf;
    private ProgressDialog _dlg;
    private LuaEditor _edit;
    private File _file;
    private long _len;

    public ReadTask(LuaEditor luaEditor, File file) {
        this._file = file;
        this._len = this._file.length();
        this._edit = luaEditor;
        this._buf = new Document(luaEditor);
        this._dlg = new ProgressDialog(luaEditor.getContext());
        this._dlg.setProgressStyle(1);
        this._dlg.setTitle("正在打开");
        this._dlg.setIcon(R.drawable.ic_dialog_info);
        this._dlg.setMax((int) this._len);
    }

    public ReadTask(LuaEditor luaEditor, String str) {
        this(luaEditor, new File(str));
    }

    private byte[] readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        byte[] bArr = new byte[4096];
        _total = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            _total += i;
            publishProgress(new Object[0]);
        }
    }

    @Override
    protected Object doInBackground(Object[] objArr) {
        try {
            return new String(readAll(new FileInputStream(this._file)));
        } catch (Exception e) {
            this._dlg.setMessage(e.getMessage());
            return "";
        }
    }

    public int getCurrent() {
        return _total;
    }

    public int getMax() {
        return (int) this._len;
    }

    public int getMin() {
        return 0;
    }

    @Override
    protected void onPostExecute(Object obj) {
        super.onPostExecute(obj);
        this._edit.setText((String) obj);
        this._dlg.dismiss();
    }

    @Override
    protected void onProgressUpdate(Object[] objArr) {
        this._dlg.setProgress(_total);
        super.onProgressUpdate(objArr);
    }

    public void start() {
        execute(new Object[0]);
        this._dlg.show();
    }
}
