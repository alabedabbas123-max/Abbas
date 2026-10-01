package com.almlkaide.kaypro.aide.application.activity.androidr;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.almlkaide.kaypro.view.ColorBackgroundTextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class FragmentColor extends BaseRFragment {
    @Override
    public BaseRBaseAdapter onCreateAdapter(Bundle bundle) throws IllegalAccessException {
        ArrayList arrayList = new ArrayList();
        Field[] fields = getClazz().getFields();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < fields.length) {
                Field field = fields[i2];
                field.setAccessible(true);
                arrayList.add(new BaseRItem(field.getName(), field.getInt((Object) null)));
                i = i2 + 1;
            } else {
                return new AdapterColor(this, getActivity(), arrayList);
            }
        }
    }

    @Override
    public Class<?> getClazz() {
        try {
            return Class.forName("android.R$color");
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public class AdapterColor extends BaseRBaseAdapter {

        private Context f4938ctx;
        private List<BaseRItem> list;
        private List<BaseRItem> list_backup;
        private final FragmentColor this$0;

        public AdapterColor(FragmentColor fragmentColor, Context context, List<BaseRItem> list) {
            this.this$0 = fragmentColor;
            this.list = new ArrayList();
            this.list_backup = new ArrayList();
            this.list = list;
            this.list_backup = list;
            this.f4938ctx = context;
        }

        @Override
        public void setList(List<BaseRItem> list) {
            this.list = list;
        }

        @Override
        public List<BaseRItem> getListBackup() {
            return this.list_backup;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View itemView = view == null ? new ItemView(this, this.f4938ctx) : view;
            ViewHolder viewHolder = ((ItemView) itemView).holder;
            BaseRItem item = getItem(i);
            viewHolder.title.setText(new SpannableStringBuilder(new StringBuffer().append(i + 1).append(". ").toString()).append((CharSequence) getHighlightText(this.f4938ctx, item.name, item.hig_name)));
            viewHolder.subtitle.setColor(this.f4938ctx.getResources().getColor(item.f4936id));
            return itemView;
        }

        private class ViewHolder {
            public ColorBackgroundTextView subtitle;
            private final AdapterColor this$0;
            public TextView title;

            public ViewHolder(AdapterColor adapterColor) {
                this.this$0 = adapterColor;
            }
        }

        private class ItemView extends LinearLayout {
            public ViewHolder holder;
            private final AdapterColor this$0;

            public ItemView(AdapterColor adapterColor, Context context) {
                super(context);
                this.this$0 = adapterColor;
                this.holder = new ViewHolder(this.this$0);
                setOrientation(1);
                TextView textView = new TextView(context);
                textView.setTextAppearance(context, R.style.TextAppearance.Large);
                textView.setTextSize(15);
                textView.setTextSize(15);
                textView.setPadding(0, 0, 0, BaseRFragment.dp2px(5));
                ColorBackgroundTextView colorBackgroundTextView = new ColorBackgroundTextView(context);
                this.holder.title = textView;
                this.holder.subtitle = colorBackgroundTextView;
                addView(textView);
                addView(colorBackgroundTextView);
                setGravity(16);
                setPadding(BaseRFragment.dp2px(16), BaseRFragment.dp2px(10), BaseRFragment.dp2px(16), BaseRFragment.dp2px(10));
            }
        }

        @Override
        public int getCount() {
            return this.list.size();
        }

        @Override
        public BaseRItem getItem(int i) {
            return this.list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }
    }
}
