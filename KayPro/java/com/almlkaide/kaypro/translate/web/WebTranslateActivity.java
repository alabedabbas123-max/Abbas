package com.almlkaide.kaypro.translate.web;

import adrt.ADRTLogCatReader;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.almlkaide.kaypro.translate.TUtil;
import com.almlkaide.kaypro.util.Utils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class WebTranslateActivity extends Activity {
    public static final String default_api = "https://dictweb.translator.qq.com/eduTranslate?sentence=%s&channel=tencent";
    public static final String pref_key = "api_web_translation";
    private LinearLayout progressView;
    private WebTranslateActivity thisActivity;
    private WebView webView;

    public static void initDefaultapi() {
        getApi();
    }

    public static String getApi() {
        SharedPreferences sp = Utils.getSp();
        String string = sp.getString(pref_key, "");
        if (string.trim().length() == 0) {
            sp.edit().putString(pref_key, default_api).commit();
            return default_api;
        }
        return string;
    }

    public static void translate(Activity activity, CharSequence charSequence) {
        if (charSequence == null || charSequence.toString().trim().length() == 0) {
            Utils.toast("请先选择一段内容");
            return;
        }
        try {
            Intent intent = new Intent(activity, Class.forName("com.almlkaide.kaypro.translate.web.WebTranslateActivity"));
            intent.putExtra("android.intent.extra.PROCESS_TEXT", charSequence.toString().replace(" _ ", "").replace("_", " "));
            activity.startActivity(intent);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        try {
            super.onCreate(bundle);
            this.thisActivity = this;
            initView();
            initWindows();
            this.webView.loadUrl(String.format(getApi(), TUtil.wordSegmentation(getIntent().getCharSequenceExtra("android.intent.extra.PROCESS_TEXT").toString().replace(" _ ", " "))));
        } catch (Throwable th) {
            Utils.toast(th, true);
            finish();
        }
    }

    private void initView() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new View(this), -1, dp2px(64));
        this.progressView = new LinearLayout(this);
        int iDp2px = dp2px(24);
        this.progressView.setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
        this.progressView.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText("正在翻译中...");
        textView.setTextSize(15);
        textView.setPadding(dp2px(16), 0, 0, 0);
        this.progressView.addView(new ProgressBar(this));
        this.progressView.addView(textView);
        this.webView = new WebView(this);
        relativeLayout.addView(this.progressView);
        relativeLayout.addView(this.webView);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Utils.getColorAccent(this));
        linearLayout.setPadding(0, dp2px(0), 0, 0);
        linearLayout.addView(relativeLayout);
        setContentView(linearLayout);
        initWebSetting(this.webView);
    }

    private void initWindows() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        ((ViewGroup.LayoutParams) attributes).width = getWindowManager().getDefaultDisplay().getWidth();
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
    }

    private void initWebSetting(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(true);
        settings.setTextSize(WebSettings.TextSize.SMALLER);
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        webView.setWebChromeClient(new WebChromeClient(this) {
            private final WebTranslateActivity this$0;

            {
                this.this$0 = this;
            }
        });
        webView.setWebViewClient(new AnonymousClass100000002(this));
        webView.setDownloadListener(new AnonymousClass100000004(this));
    }

    class AnonymousClass100000002 extends WebViewClient {
        private final WebTranslateActivity this$0;

        AnonymousClass100000002(WebTranslateActivity webTranslateActivity) {
            this.this$0 = webTranslateActivity;
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("file://")) {
                webView.loadUrl(str);
                return true;
            }
            PackageManager packageManager = this.this$0.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
                if (listQueryIntentActivities.size() == 1) {
                    String str3 = (String) null;
                    try {
                        str2 = String.format("网页“%s”请求打开其它应用", new URL(str).getHost());
                    } catch (MalformedURLException e) {
                        str2 = str3;
                    }
                    new AlertDialog.Builder(this.this$0.thisActivity).setTitle(str2).setMessage(String.format("将打开“%s”", listQueryIntentActivities.get(0).activityInfo.loadLabel(packageManager))).setPositiveButton("确定", new DialogInterface.OnClickListener(this, str) {
                        private final AnonymousClass100000002 this$0;
                        private final String val$url;

                        {
                            this.this$0 = this;
                            this.val$url = str;
                        }

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(this.val$url));
                            intent2.addFlags(268435456);
                            this.this$0.this$0.startActivity(intent2);
                        }
                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create().show();
                } else {
                    intent.addFlags(268435456);
                    this.this$0.startActivity(Intent.createChooser(intent, "Choose"));
                }
            }
            return false;
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            this.this$0.progressView.setVisibility(8);
        }
    }

    class AnonymousClass100000004 implements DownloadListener {
        private final WebTranslateActivity this$0;

        AnonymousClass100000004(WebTranslateActivity webTranslateActivity) {
            this.this$0 = webTranslateActivity;
        }

        @Override
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            String str5 = (String) null;
            try {
                str5 = String.format("网页“%s”请求下载", new URL(str).getHost());
            } catch (MalformedURLException e) {
            }
            new AlertDialog.Builder(this.this$0).setTitle(str5).setMessage(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("大小：").append(Formatter.formatFileSize(this.this$0.thisActivity, j)).toString()).append("\nmimetype=").toString()).append(str4).toString()).append("\nuserAgent=").toString()).append(str2).toString()).append("\ncontentDisposition=").toString()).append(str3).toString()).append("\nurl=").toString()).append(str).toString()).setPositiveButton("浏览器下载", new DialogInterface.OnClickListener(this, str) {
                private final AnonymousClass100000004 this$0;
                private final String val$url;

                {
                    this.this$0 = this;
                    this.val$url = str;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.val$url));
                    intent.addFlags(268435456);
                    this.this$0.this$0.startActivity(intent);
                }
            }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    private int dp2px(float f) {
        return (int) ((getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    @Override
    protected void onDestroy() {
        this.webView.stopLoading();
        this.webView.destroy();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        if (this.webView.canGoBack()) {
            this.webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
