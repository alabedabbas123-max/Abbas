package com.almlkaide.kaypro.aide.application.activity.icons;

import android.R;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.caverock.androidsvg.SVGImageView;
import com.almlkaide.kaypro.util.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class IconAdapter extends BaseAdapter {
    private List<Icon> backup_list;
    private Context context;
    private List<Icon> list;
    private boolean searching;

    @Override
    public Object getItem(int i) {
        return getItem(i);
    }

    public IconAdapter(Context context, List<Icon> list) {
        this.list = new ArrayList();
        this.backup_list = new ArrayList();
        this.context = context;
        this.list = list;
        this.backup_list = list;
    }

    public void search(String str) {
        if (TextUtils.isEmpty(str)) {
            this.list = this.backup_list;
            this.searching = false;
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        for (Icon icon : this.backup_list) {
            int iIndexOf = icon.getFileNameNoExtension().toLowerCase(Locale.ENGLISH).indexOf(lowerCase);
            if (iIndexOf >= 0) {
                icon.f4943hig.title.start = iIndexOf;
                icon.f4943hig.title.f4945end = iIndexOf + lowerCase.length();
                arrayList.add(icon);
            }
        }
        this.list = arrayList;
        this.searching = true;
        if (arrayList.size() == 0) {
            notifyDataSetInvalidated();
        } else {
            notifyDataSetChanged();
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = getItemView();
            viewHolder = new ViewHolder(this, view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Icon item = getItem(i);
        viewHolder.title.setText(getHighlightText(this.context, item.getFileNameNoExtension(), item.f4943hig.title));
        try {
            viewHolder.icon.setSVG(item.getSvg());
            viewHolder.icon.setColorFilter(-1);
        } catch (Exception e) {
        }
        return view;
    }

    public SpannableStringBuilder getHighlightText(Context context, String str, Icon.Highlight highlight) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(str);
        if (this.searching && highlight.start >= 0) {
            BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Utils.getColorAccent(context));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-1);
            spannableString.setSpan(backgroundColorSpan, highlight.start, highlight.f4945end, 33);
            spannableString.setSpan(foregroundColorSpan, highlight.start, highlight.f4945end, 33);
        }
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public class ViewHolder {
        public SVGImageView icon;
        private final IconAdapter this$0;
        public TextView title;

        public ViewHolder(IconAdapter iconAdapter, View view) {
            this.this$0 = iconAdapter;
            this.icon = (SVGImageView) view.findViewById(R.id.icon);
            this.title = (TextView) view.findViewById(R.id.title);
        }
    }

    private View getItemView() {
        LinearLayout linearLayout = new LinearLayout(this.context);
        int iDp2px = Utils.dp2px(16);
        linearLayout.setPadding(iDp2px, 0, iDp2px, 0);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        SVGImageView sVGImageView = new SVGImageView(this.context);
        sVGImageView.setId(R.id.icon);
        TextView textView = new TextView(this.context);
        textView.setId(R.id.title);
        textView.setGravity(17);
        textView.setPadding(0, Utils.dp2px(10), 0, 0);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(13);
        linearLayout.addView(sVGImageView, Utils.dp2px(32), Utils.dp2px(32));
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(this.context);
        linearLayout2.addView(linearLayout, -1, Utils.dp2px(110));
        return linearLayout2;
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Icon getItem(int i) {
        return this.list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
}
