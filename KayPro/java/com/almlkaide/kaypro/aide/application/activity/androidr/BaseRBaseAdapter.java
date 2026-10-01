package com.almlkaide.kaypro.aide.application.activity.androidr;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.BaseAdapter;
import com.almlkaide.kaypro.util.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class BaseRBaseAdapter extends BaseAdapter {
    public boolean searching;

    @Override
    public abstract BaseRItem getItem(int i);

    @Override
    public Object getItem(int i) {
        return getItem(i);
    }

    public abstract List<BaseRItem> getListBackup();

    public abstract void setList(List<BaseRItem> list);

    public void search(String str) {
        this.searching = true;
        List<BaseRItem> listBackup = getListBackup();
        if (str == null || str.trim().length() == 0) {
            setList(listBackup);
            this.searching = false;
        } else {
            ArrayList arrayList = new ArrayList();
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            for (BaseRItem baseRItem : listBackup) {
                int iIndexOf = baseRItem.name.toLowerCase(Locale.ENGLISH).indexOf(lowerCase);
                if (iIndexOf != -1) {
                    baseRItem.hig_name.start = iIndexOf;
                    baseRItem.hig_name.f4937end = iIndexOf + lowerCase.length();
                    arrayList.add(baseRItem);
                }
            }
            setList(arrayList);
        }
        notifyDataSetChanged();
    }

    public SpannableStringBuilder getHighlightText(Context context, String str, BaseRItem.Highlight highlight) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(str);
        if (this.searching && highlight.start >= 0) {
            BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Utils.getColorAccent(context));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-1);
            spannableString.setSpan(backgroundColorSpan, highlight.start, highlight.f4937end, 33);
            spannableString.setSpan(foregroundColorSpan, highlight.start, highlight.f4937end, 33);
        }
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }
}
