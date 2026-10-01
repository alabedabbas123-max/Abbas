package com.baidu.mobstat;

import android.text.TextUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONObject;

public class an {

    private String f4117a;

    private String f4118b;

    private String f4119c;

    private long f4120d;

    private long f4121e;

    private float f4122f;

    private float f4123g;

    private float f4124h;

    private float f4125i;

    private String f4126j;

    private boolean f4127k;

    private String f4128l;

    public an(String str, String str2, String str3, long j, long j2, float f, float f2, float f3, float f4, String str4, boolean z, String str5) {
        this.f4117a = str;
        this.f4118b = str2;
        this.f4119c = str3;
        this.f4120d = j;
        this.f4121e = j2;
        this.f4122f = f;
        this.f4123g = f2;
        this.f4124h = f3;
        this.f4125i = f4;
        this.f4126j = str4;
        this.f4127k = z;
        this.f4128l = str5;
    }

    public String m6077a() {
        return this.f4117a;
    }

    public String m6079b() {
        return this.f4126j;
    }

    public JSONObject m6078a(long j, String str, String str2) {
        if (TextUtils.isEmpty(this.f4128l)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("n", str);
            jSONObject.put("t", this.f4118b);
            jSONObject.put("d", this.f4120d);
            long j2 = this.f4121e - j;
            if (j2 <= 0) {
                j2 = 0;
            }
            jSONObject.put("ps", j2);
            jSONObject.put("at", 1);
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            jSONObject.put(Config.SESSTION_ACTIVITY_X_VIEW_HEIGHT, decimalFormat.format(this.f4122f));
            jSONObject.put(Config.SESSTION_ACTIVITY_Y_VIEW_HEIGHT, decimalFormat.format(this.f4123g));
            jSONObject.put(Config.SESSTION_ACTIVITY_X_TOTAL_HEIGHT, decimalFormat.format(this.f4124h));
            jSONObject.put(Config.SESSTION_ACTIVITY_Y_TOTAL_HEIGHT, decimalFormat.format(this.f4125i));
            jSONObject.put("h5", 0);
            jSONObject.put("sign", this.f4128l);
        } catch (Exception e) {
            jSONObject = null;
        }
        return jSONObject;
    }
}
