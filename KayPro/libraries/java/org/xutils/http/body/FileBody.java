package org.xutils.http.body;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.xutils.common.util.LogUtil;

public class FileBody extends InputStreamBody {
    private String contentType;
    private File file;

    public FileBody(File file) throws IOException {
        this(file, null);
    }

    public FileBody(File file, String str) throws IOException {
        super(new FileInputStream(file));
        this.file = file;
        this.contentType = str;
    }

    @Override
    public void setContentType(String str) {
        this.contentType = str;
    }

    @Override
    public String getContentType() {
        if (TextUtils.isEmpty(this.contentType)) {
            this.contentType = getFileContentType(this.file);
        }
        return this.contentType;
    }

    public static String getFileContentType(File file) {
        String strGuessContentTypeFromName = null;
        try {
            strGuessContentTypeFromName = HttpURLConnection.guessContentTypeFromName(Uri.encode(file.getName(), "-![.:/,?&=]"));
        } catch (Exception e) {
            LogUtil.m9045e(e.toString());
        }
        if (TextUtils.isEmpty(strGuessContentTypeFromName)) {
            return "application/octet-stream";
        }
        return strGuessContentTypeFromName.replaceFirst("\\/jpg$", "/jpeg");
    }
}
