package com.almlkaide.kaypro.aide.application.activity.androidr;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class FragmentDrawable extends BaseRFragment {
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
                return new AdapterDrawable(this, getActivity(), arrayList);
            }
        }
    }

    @Override
    public Class<?> getClazz() {
        try {
            return Class.forName("android.R$drawable");
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public class AdapterDrawable extends BaseRBaseAdapter {

        private Context f4939ctx;
        private List<BaseRItem> list;
        private List<BaseRItem> list_backup;
        private final FragmentDrawable this$0;

        public AdapterDrawable(FragmentDrawable fragmentDrawable, Context context, List<BaseRItem> list) {
            this.this$0 = fragmentDrawable;
            this.list = new ArrayList();
            this.list_backup = new ArrayList();
            this.list = list;
            this.list_backup = list;
            this.f4939ctx = context;
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
            View itemView = view == null ? new ItemView(this, this.f4939ctx) : view;
            ViewHolder viewHolder = ((ItemView) itemView).holder;
            BaseRItem item = getItem(i);
            viewHolder.title.setText(new SpannableStringBuilder(new StringBuffer().append(i + 1).append(". ").toString()).append((CharSequence) getHighlightText(this.f4939ctx, item.name, item.hig_name)));
            viewHolder.icon.setImageResource(item.f4936id);
            return itemView;
        }

        private class ItemView extends LinearLayout {
            public ViewHolder holder;
            private final AdapterDrawable this$0;

            public ItemView(AdapterDrawable adapterDrawable, Context context) {
                super(context);
                this.this$0 = adapterDrawable;
                this.holder = new ViewHolder(this.this$0);
                ImageView imageView = new ImageView(context);
                TextView textView = new TextView(context);
                textView.setPadding(BaseRFragment.dp2px(16), 0, 0, 0);
                textView.setTextAppearance(context, R.style.TextAppearance.Large);
                textView.setTextSize(15);
                this.holder.icon = imageView;
                this.holder.title = textView;
                addView(imageView, BaseRFragment.dp2px(36), BaseRFragment.dp2px(36));
                addView(textView);
                setGravity(16);
                setPadding(BaseRFragment.dp2px(16), BaseRFragment.dp2px(10), BaseRFragment.dp2px(16), BaseRFragment.dp2px(10));
            }
        }

        private class ViewHolder {
            public ImageView icon;
            private final AdapterDrawable this$0;
            public TextView title;

            public ViewHolder(AdapterDrawable adapterDrawable) {
                this.this$0 = adapterDrawable;
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
