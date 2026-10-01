package com.almlkaide.kaypro.aide.application.activity.androidr;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.almlkaide.kaypro.util.Utils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FragmentString extends BaseRFragment {
    private AdapterString adapter;

    @Override
    public void onViewCreated(BaseRFragment.ViewHolder viewHolder, Bundle bundle) {
        super.onViewCreated(viewHolder, bundle);
        ArrayList arrayList = new ArrayList();
        Field[] fields = getClazz().getFields();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < fields.length) {
                try {
                    Field field = fields[i2];
                    field.setAccessible(true);
                    String name = field.getName();
                    int i3 = field.getInt((Object) null);
                    TwoLineItem twoLineItem = new TwoLineItem(name, i3);
                    twoLineItem.subname = getString(i3);
                    arrayList.add(twoLineItem);
                } catch (IllegalAccessException e) {
                } catch (IllegalArgumentException e2) {
                }
                i = i2 + 1;
            } else {
                this.adapter = new AdapterString(this, getActivity(), arrayList);
                viewHolder.mListView.setAdapter((ListAdapter) this.adapter);
                viewHolder.mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(this) {
                    private final FragmentString this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j) {
                        this.this$0.showDialog(this.this$0.adapter.getItem(i4));
                    }
                });
                viewHolder.mSearchView.addTextChangedListener(new TextWatcher(this) {
                    private final FragmentString this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                        this.this$0.adapter.search(charSequence.toString());
                    }
                });
                return;
            }
        }
    }

    @Override
    public Class<?> getClazz() {
        try {
            return Class.forName("android.R$string");
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public class AdapterString extends BaseAdapter {

        private Context f4940ctx;
        private List<TwoLineItem> list;
        private List<TwoLineItem> list_backup;
        private boolean searching;
        private final FragmentString this$0;

        @Override
        public Object getItem(int i) {
            return getItem(i);
        }

        public AdapterString(FragmentString fragmentString, Context context, List<TwoLineItem> list) {
            this.this$0 = fragmentString;
            this.list = new ArrayList();
            this.list_backup = new ArrayList();
            this.list = list;
            this.list_backup = list;
            this.f4940ctx = context;
        }

        public void search(String str) {
            this.searching = true;
            if (str == null || str.trim().length() == 0) {
                this.list = this.list_backup;
                this.searching = false;
            } else {
                ArrayList arrayList = new ArrayList();
                String lowerCase = str.toLowerCase(Locale.ENGLISH);
                for (TwoLineItem twoLineItem : this.list_backup) {
                    int iIndexOf = twoLineItem.name.toLowerCase(Locale.ENGLISH).indexOf(lowerCase);
                    int iIndexOf2 = twoLineItem.subname.toLowerCase(Locale.ENGLISH).indexOf(lowerCase);
                    if (iIndexOf != -1 || iIndexOf2 != -1) {
                        twoLineItem.hig_name.start = iIndexOf;
                        twoLineItem.hig_name.f4937end = iIndexOf + lowerCase.length();
                        twoLineItem.hig_subName.start = iIndexOf2;
                        twoLineItem.hig_subName.f4937end = iIndexOf2 + lowerCase.length();
                        arrayList.add(twoLineItem);
                    }
                }
                this.list = arrayList;
            }
            notifyDataSetChanged();
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(this.f4940ctx).inflate(R.layout.two_line_list_item, viewGroup, false);
                view.setPadding(BaseRFragment.dp2px(16), BaseRFragment.dp2px(10), BaseRFragment.dp2px(16), BaseRFragment.dp2px(10));
                viewHolder = new ViewHolder(this, view);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            TwoLineItem item = getItem(i);
            viewHolder.title.setText(new SpannableStringBuilder(new StringBuffer().append(i + 1).append(". ").toString()).append((CharSequence) getHighlightText(item.name, item.hig_name)));
            viewHolder.subtitle.setText(getHighlightText(item.subname, item.hig_subName));
            return view;
        }

        private SpannableStringBuilder getHighlightText(String str, BaseRItem.Highlight highlight) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(str);
            if (this.searching && highlight.start >= 0) {
                BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Utils.getColorAccent(this.f4940ctx));
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-1);
                spannableString.setSpan(backgroundColorSpan, highlight.start, highlight.f4937end, 33);
                spannableString.setSpan(foregroundColorSpan, highlight.start, highlight.f4937end, 33);
            }
            spannableStringBuilder.append((CharSequence) spannableString);
            return spannableStringBuilder;
        }

        private class ViewHolder {
            public TextView subtitle;
            private final AdapterString this$0;
            public TextView title;

            public ViewHolder(AdapterString adapterString, View view) {
                this.this$0 = adapterString;
                this.title = (TextView) view.findViewById(R.id.text1);
                this.subtitle = (TextView) view.findViewById(R.id.text2);
                this.title.setTextAppearance(view.getContext(), R.style.TextAppearance.Large);
                this.subtitle.setTextAppearance(view.getContext(), R.style.TextAppearance.Small);
                this.title.setTextSize(15);
                this.subtitle.setTextSize(14);
            }
        }

        @Override
        public int getCount() {
            return this.list.size();
        }

        @Override
        public TwoLineItem getItem(int i) {
            return this.list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }
    }
}
