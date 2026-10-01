package com.almlkaide.kaypro.aide.application.activity.permission;

import android.R;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class SearchAdapter extends ManifestAdapter {
    private List<Permission> backuplist;
    Map<String, TextHighlight> highlight;
    private SearchTask mSearchTask;

    public SearchAdapter(Context context, List<Permission> list) {
        super(context, list);
        this.highlight = new HashMap();
        this.backuplist = list;
    }

    public void bind(EditText editText) {
        editText.addTextChangedListener(new TextWatcher(this) {
            private final SearchAdapter this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.this$0.search(charSequence.toString());
            }
        });
    }

    public void search(String str) {
        this.highlight.clear();
        if (this.mSearchTask != null) {
            this.mSearchTask.cancel();
        }
        this.mSearchTask = new SearchTask(this);
        this.mSearchTask.execute(str);
    }

    class SearchTask extends AsyncTask<String, Void, List<Permission>> {
        boolean cancel;
        private final SearchAdapter this$0;

        @Override
        protected List<Permission> doInBackground(String[] strArr) {
            return doInBackground2(strArr);
        }

        @Override
        protected void onPostExecute(List<Permission> list) {
            onPostExecute2(list);
        }

        void cancel() {
            this.cancel = true;
            cancel(true);
        }

        protected List<Permission> doInBackground2(String[] strArr) {
            int i = 0;
            String str = strArr[0];
            if (str == null || str.trim().length() == 0) {
                return this.this$0.backuplist;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i2 = i;
                if (i2 < this.this$0.backuplist.size() && !this.cancel) {
                    Permission permission = (Permission) this.this$0.backuplist.get(i2);
                    String lowerCase2 = permission.getLabel().toLowerCase(Locale.ENGLISH);
                    String lowerCase3 = permission.getName().toLowerCase(Locale.ENGLISH);
                    int iIndexOf = lowerCase2.indexOf(lowerCase);
                    int iIndexOf2 = lowerCase3.indexOf(lowerCase);
                    if (iIndexOf >= 0 || iIndexOf2 >= 0) {
                        arrayList.add(permission);
                        TextHighlight textHighlight = new TextHighlight(this.this$0);
                        textHighlight.title.start = iIndexOf;
                        textHighlight.title.f4952end = iIndexOf + lowerCase.length();
                        textHighlight.subtitle.start = iIndexOf2;
                        textHighlight.subtitle.f4952end = iIndexOf2 + lowerCase.length();
                        this.this$0.highlight.put(permission.getName(), textHighlight);
                    }
                    i = i2 + 1;
                }
                return arrayList;
            }
        }

        protected void onPostExecute2(List<Permission> list) {
            super.onPostExecute(list);
            if (!this.cancel) {
                this.this$0.setCurrentList(list);
                this.this$0.notifyDataSetChanged();
            }
        }

        public SearchTask(SearchAdapter searchAdapter) {
            this.this$0 = searchAdapter;
        }
    }

    @Override
    public CharSequence getItemTitle(int i) {
        Permission item = getItem(i);
        TextHighlight textHighlight = this.highlight.get(item.getName());
        return textHighlight == null ? item.getLabel() : makeHighlightText(item.getLabel(), textHighlight.title.start, textHighlight.title.f4952end);
    }

    @Override
    public CharSequence getItemSubTitle(int i) {
        String name = getItem(i).getName();
        TextHighlight textHighlight = this.highlight.get(name);
        return textHighlight == null ? name : makeHighlightText(name, textHighlight.subtitle.start, textHighlight.subtitle.f4952end);
    }

    private SpannableStringBuilder makeHighlightText(String str, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(str);
        if (i >= 0) {
            BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(getColorAccent(this.context));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-1);
            spannableString.setSpan(backgroundColorSpan, i, i2, 33);
            spannableString.setSpan(foregroundColorSpan, i, i2, 33);
        }
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public static int getColorAccent(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }

    public class Highlight {
        private final SearchAdapter this$0;
        public int start = -1;

        public int f4952end = -1;

        public Highlight(SearchAdapter searchAdapter) {
            this.this$0 = searchAdapter;
        }
    }

    public class TextHighlight {
        public Highlight subtitle;
        private final SearchAdapter this$0;
        public Highlight title;

        public TextHighlight(SearchAdapter searchAdapter) {
            this.this$0 = searchAdapter;
            this.title = new Highlight(this.this$0);
            this.subtitle = new Highlight(this.this$0);
        }
    }
}
