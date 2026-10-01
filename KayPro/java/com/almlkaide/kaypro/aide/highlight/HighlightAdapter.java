package com.almlkaide.kaypro.aide.highlight;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.almlkaide.kaypro.util.Utils;
import com.almlkaide.kaypro.view.ColorBackgroundTextView;
import java.util.ArrayList;
import java.util.List;

public class HighlightAdapter extends BaseAdapter {
    private Context context;
    private boolean isLight;
    private List<Item> list;

    @Override
    public Object getItem(int i) {
        return getItem(i);
    }

    public HighlightAdapter(Context context, List<Item> list) {
        this.list = new ArrayList();
        this.context = context;
        this.list = list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }

    public List<Item> getList() {
        return this.list;
    }

    public void setIsLight(boolean z) {
        this.isLight = z;
    }

    public boolean isLight() {
        return this.isLight;
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
        Item item = getItem(i);
        viewHolder.title.setText(item.getTitle());
        try {
            viewHolder.subtitle.setColor(Color.parseColor(item.getColor(this.isLight)));
        } catch (Throwable th) {
        }
        return view;
    }

    private class ViewHolder {
        public View rootView;
        public ColorBackgroundTextView subtitle;
        private final HighlightAdapter this$0;
        public TextView title;

        public ViewHolder(HighlightAdapter highlightAdapter, View view) {
            this.this$0 = highlightAdapter;
            this.rootView = view;
            this.title = (TextView) view.findViewById(R.id.text1);
            this.subtitle = (ColorBackgroundTextView) view.findViewById(R.id.text2);
        }
    }

    public View getItemView() {
        LinearLayout linearLayout = new LinearLayout(this.context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        linearLayout.setPadding(Utils.dp2px(16), Utils.dp2px(14), Utils.dp2px(16), Utils.dp2px(14));
        TextView textView = new TextView(this.context);
        textView.setId(R.id.text1);
        textView.setTextAppearance(this.context, R.style.TextAppearance.Large);
        textView.setTextSize(16);
        textView.setPadding(0, 0, 0, Utils.dp2px(5));
        ColorBackgroundTextView colorBackgroundTextView = new ColorBackgroundTextView(this.context);
        colorBackgroundTextView.setId(R.id.text2);
        colorBackgroundTextView.setTextSize(14);
        linearLayout.addView(textView);
        linearLayout.addView(colorBackgroundTextView, -1, -2);
        return linearLayout;
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Item getItem(int i) {
        return this.list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
}
