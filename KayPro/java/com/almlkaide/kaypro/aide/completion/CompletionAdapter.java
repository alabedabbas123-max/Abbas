package com.almlkaide.kaypro.aide.completion;

import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.aide.engine.SourceEntity;
import com.aide.ui.j;
import com.aide.ui.views.CompletionListView;
import com.blankj.utilcode.util.ReflectUtils;
import com.blankj.utilcode.util.StringUtils;
import com.almlkaide.kaypro.aide.AdvancedSetting;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.aide.completion.apiversion.AVUtils;
import com.almlkaide.kaypro.aide.completion.apiversion.ApiInfo;
import com.almlkaide.kaypro.aide.completion.apiversion.ApiVersion;
import com.almlkaide.kaypro.aide.completion.translate.TranslateUtils;
import com.almlkaide.kaypro.util.Utils;

public class CompletionAdapter {
    private static IDHolder sIDHolder;

    public static IDHolder getIDHolder() {
        if (sIDHolder == null) {
            sIDHolder = new IDHolder();
        }
        return sIDHolder;
    }

    static class IDHolder {
        final int apiInfo;
        final int apiInfoView;
        final int translation;

        public IDHolder() {
            Context applicationContext = Utils.getApp().getApplicationContext();
            Resources resources = applicationContext.getResources();
            this.translation = resources.getIdentifier("translation", "id", applicationContext.getPackageName());
            this.apiInfo = resources.getIdentifier("apiInfo", "id", applicationContext.getPackageName());
            this.apiInfoView = resources.getIdentifier("apiInfoView", "id", applicationContext.getPackageName());
        }
    }

    public static void setView(Object obj, int i, View view) {
        view.getContext();
        ArrayAdapter arrayAdapter = (ArrayAdapter) obj;
        Object item = arrayAdapter.getItem(i);
        TextView textView = (TextView) view.findViewById(AideR.C1673id.completionEntryName);
        ReflectUtils reflectUtilsReflect = ReflectUtils.reflect(arrayAdapter);
        SourceEntity sourceEntity = item instanceof SourceEntity ? (SourceEntity) item : (SourceEntity) null;
        try {
            String str = (String) ReflectUtils.reflect((j) reflectUtilsReflect.field("FH").get()).field("VH").get();
            if (!StringUtils.isTrimEmpty(str)) {
                SpannableString spannableString = new SpannableString(textView.getText());
                spannableString.setSpan(new ForegroundColorSpan(Utils.getColorAccent(textView.getContext())), 0, str.length(), 33);
                textView.setText(spannableString);
            }
        } catch (Throwable th) {
        }
        TextView textView2 = (TextView) view.findViewById(getIDHolder().translation);
        textView2.setText((CharSequence) null);
        textView2.setVisibility(8);
        String string = textView.getText().toString();
        if (isEnableTranslate()) {
            TranslateUtils.translate(textView2, string, textView, string);
        }
        String strVH = sourceEntity.VH();
        String strName = sourceEntity.EQ().name();
        String strValueOf = String.valueOf(new StringBuffer().append(new StringBuffer().append("").append(strVH).toString()).append(strName).toString().hashCode());
        View viewFindViewById = view.findViewById(getIDHolder().apiInfoView);
        TextView textView3 = (TextView) view.findViewById(getIDHolder().apiInfo);
        viewFindViewById.setVisibility(8);
        textView3.setText((CharSequence) null);
        textView3.setTag(AideR.C1673id.action0, strValueOf);
        if (sourceEntity == null || !Utils.getSp().getBoolean("completion_show_api_info", true)) {
            return;
        }
        new ApiVersionTask(strVH, strName, textView3, strValueOf, viewFindViewById).run();
    }

    private static boolean isEnableTranslate() {
        return AdvancedSetting.isEnableTranslate() && Utils.isCN();
    }

    public static void onItemLongClick(Object obj, View view, int i) {
        CompletionListView completionListView = (CompletionListView) ReflectUtils.reflect(obj).field("FH").get();
        Object itemAtPosition = completionListView.getItemAtPosition(i);
        TranslateUtils.onItemLongClick(completionListView, itemAtPosition instanceof SourceEntity ? (SourceEntity) itemAtPosition : (SourceEntity) null, view, i);
    }

    private static class ApiVersionTask extends AsyncTask<Void, Void, ApiInfo> implements Runnable {
        TextView apiInfoTv;
        View apiInfoView;

        final Object f4953tag;
        String type;

        String f4954url;

        @Override
        protected ApiInfo doInBackground(Void[] voidArr) {
            return doInBackground2(voidArr);
        }

        @Override
        protected void onPostExecute(ApiInfo apiInfo) {
            onPostExecute2(apiInfo);
        }

        public ApiVersionTask(String str, String str2, TextView textView, Object obj, View view) {
            this.f4954url = str;
            this.type = str2;
            this.apiInfoTv = textView;
            this.f4953tag = obj;
            this.apiInfoView = view;
        }

        @Override
        public void run() {
            if (this.f4954url == null || this.type == null) {
                finished((ApiInfo) null);
            } else {
                execute(new Void[0]);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x001e, code lost:
        
            r0 = (com.almlkaide.kaypro.aide.completion.apiversion.ApiInfo) null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected ApiInfo doInBackground2(Void[] voidArr) {
            ApiInfo apiInfoFindApi;
            try {
                String str = this.type;
                if (str.equals("Class")) {
                    apiInfoFindApi = ApiVersion.findClass(this.f4954url.substring(0, this.f4954url.indexOf(".html")));
                } else if (str.equals("Field")) {
                    apiInfoFindApi = ApiVersion.findApi(this.f4954url.substring(0, this.f4954url.indexOf(".html#")), this.f4954url.substring(this.f4954url.indexOf("#") + 1));
                } else {
                    apiInfoFindApi = str.equals("Method") ? ApiVersion.findApi(this.f4954url.substring(0, this.f4954url.indexOf(".html#")), AVUtils.methodsParamToSmali(this.f4954url.substring(this.f4954url.indexOf("#") + 1))) : (ApiInfo) null;
                }
            } catch (Throwable th) {
            }
            return apiInfoFindApi;
        }

        protected void onPostExecute2(ApiInfo apiInfo) {
            super.onPostExecute(apiInfo);
            finished(apiInfo);
        }

        private void finished(ApiInfo apiInfo) {
            if (apiInfo == null || !this.f4953tag.equals(this.apiInfoTv.getTag(AideR.C1673id.action0))) {
                return;
            }
            String string = apiInfo.toString();
            if (string.trim().length() > 0) {
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(new ForegroundColorSpan(-5592406), 0, spannableString.length(), 33);
                this.apiInfoTv.setText(spannableString);
                if (this.apiInfoView.getVisibility() != 0) {
                    this.apiInfoView.setVisibility(0);
                }
            }
        }
    }
}
