package com.almlkaide.kaypro.assetsmanager.util;

public class CodeGenerator {
    public static String getBasicActivityCode(String str, String str2) {
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("package ").append(str).toString()).append(";").toString()).append("\n ").toString()).append("\nimport android.app.Activity;").toString()).append("\nimport android.os.Bundle;").toString()).append("\n").toString()).append("\npublic class ").toString()).append(str2).toString()).append(" extends Activity { ").toString()).append("\n     ").toString()).append("\n    @Override").toString()).append("\n    protected void onCreate(Bundle savedInstanceState) {").toString()).append("\n        super.onCreate(savedInstanceState);").toString()).append("\n        setContentView(R.layout.activity_main);").toString()).append("\n        ").toString()).append("\n    }").toString()).append("\n\t").toString()).append("\n} ").toString()).append("\n").toString();
    }

    public static String getBasicXMLCode() {
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("&lt;LinearLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;").append("\nandroid:layout_width=&quot;match_parent&quot;").toString()).append("\nandroid:layout_height=&quot;match_parent&quot;&gt;").toString()).append("\n&lt;/LinearLayout&gt;").toString();
    }
}
