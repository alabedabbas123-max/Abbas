package com.almlkaide.kaypro.aide.application.activity.androidr;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class FragmentTheme extends BaseRFragment {
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
                String name = field.getName();
                if (name.startsWith("Theme")) {
                    arrayList.add(new BaseRItem(name, field.getInt((Object) null)));
                }
                i = i2 + 1;
            } else {
                return new AdapterStyle(this, getActivity(), arrayList);
            }
        }
    }

    @Override
    public Class<?> getClazz() {
        try {
            return Class.forName("android.R$style");
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public class AdapterStyle extends BaseRBaseAdapter {

        private Context f4942ctx;
        private List<BaseRItem> list;
        private List<BaseRItem> list_backup;
        private final FragmentTheme this$0;

        public AdapterStyle(FragmentTheme fragmentTheme, Context context, List<BaseRItem> list) {
            this.this$0 = fragmentTheme;
            this.list = new ArrayList();
            this.list_backup = new ArrayList();
            this.list = list;
            this.list_backup = list;
            this.f4942ctx = context;
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
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(this.f4942ctx).inflate(R.layout.simple_list_item_1, viewGroup, false);
                view.setPadding(BaseRFragment.dp2px(16), BaseRFragment.dp2px(10), BaseRFragment.dp2px(16), BaseRFragment.dp2px(10));
                viewHolder = new ViewHolder(this, view);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            BaseRItem item = getItem(i);
            viewHolder.title.setText(new SpannableStringBuilder(new StringBuffer().append(i + 1).append(". ").toString()).append((CharSequence) getHighlightText(this.f4942ctx, item.name, item.hig_name)));
            viewHolder.title.setTextAppearance(this.f4942ctx, item.f4936id);
            viewHolder.title.setTextSize(15);
            return view;
        }

        private class ViewHolder {
            private final AdapterStyle this$0;
            public TextView title;

            public ViewHolder(AdapterStyle adapterStyle, View view) {
                this.this$0 = adapterStyle;
                this.title = (TextView) view.findViewById(R.id.text1);
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
