package com.almlkaide.kaypro.aide.dependencies;

import android.R;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class DependencieAdapter extends BaseAdapter {
    private List<Dependencie> backuplist;

    private Context f4957ctx;
    private List<Dependencie> list;
    OnSelectionListener onSelectionListener;
    private SearchTask searchTask;
    private List<Dependencie> selected = new ArrayList();
    Map<Dependencie, Boolean> selectedMap = new HashMap();
    Map<Dependencie, Highlight> highlightMap = new HashMap();

    interface OnSelectionListener {
        void onSelection(Dependencie dependencie, boolean z);
    }

    @Override
    public Object getItem(int i) {
        return getItem(i);
    }

    public List<Dependencie> getSelectedList() {
        return this.selected;
    }

    public void setOnSelectionListener(OnSelectionListener onSelectionListener) {
        this.onSelectionListener = onSelectionListener;
    }

    class Highlight {

        int f4958end;
        int start;
        private final DependencieAdapter this$0;

        public Highlight(DependencieAdapter dependencieAdapter, int i, int i2) {
            this.this$0 = dependencieAdapter;
            this.start = -1;
            this.f4958end = -1;
            this.start = i;
            this.f4958end = i2;
        }
    }

    public DependencieAdapter(Context context, List<Dependencie> list) {
        this.f4957ctx = context;
        this.list = list;
        this.backuplist = list;
    }

    public void setList(List<Dependencie> list) {
        this.list = list;
    }

    public List<Dependencie> getList() {
        return this.list;
    }

    public void setBackuplist(List<Dependencie> list) {
        this.backuplist = list;
    }

    public List<Dependencie> getBackuplist() {
        return this.backuplist;
    }

    void search(String str) {
        if (this.searchTask != null) {
            this.searchTask.cancel();
        }
        this.highlightMap.clear();
        this.searchTask = new SearchTask(this);
        this.searchTask.execute(str);
    }

    class SearchTask extends AsyncTask<String, Void, List<Dependencie>> {
        boolean cancel;
        private final DependencieAdapter this$0;

        @Override
        protected List<Dependencie> doInBackground(String[] strArr) {
            return doInBackground2(strArr);
        }

        @Override
        protected void onPostExecute(List<Dependencie> list) {
            onPostExecute2(list);
        }

        public void cancel() {
            this.cancel = true;
        }

        protected List<Dependencie> doInBackground2(String[] strArr) {
            String lowerCase = strArr[0].toLowerCase(Locale.ENGLISH);
            if (lowerCase.trim().length() == 0) {
                return this.this$0.getBackuplist();
            }
            ArrayList arrayList = new ArrayList();
            for (Dependencie dependencie : this.this$0.getBackuplist()) {
                if (this.cancel) {
                    return arrayList;
                }
                int iIndexOf = dependencie.getName().toLowerCase(Locale.ENGLISH).indexOf(lowerCase);
                if (iIndexOf >= 0) {
                    this.this$0.highlightMap.put(dependencie, new Highlight(this.this$0, iIndexOf, lowerCase.length() + iIndexOf));
                    arrayList.add(dependencie);
                }
            }
            return arrayList;
        }

        protected void onPostExecute2(List<Dependencie> list) {
            super.onPostExecute(list);
            if (!this.cancel) {
                this.this$0.setList(list);
                if (list.size() == 0) {
                    this.this$0.notifyDataSetInvalidated();
                } else {
                    this.this$0.notifyDataSetChanged();
                }
            }
        }

        public SearchTask(DependencieAdapter dependencieAdapter) {
            this.this$0 = dependencieAdapter;
        }
    }

    public static void remove(List<Dependencie> list, Dependencie dependencie) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).equals(dependencie)) {
                list.remove(size);
                return;
            }
        }
    }

    public static boolean hasAdded(List<Dependencie> list, Dependencie dependencie) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(dependencie)) {
                return true;
            }
        }
        return false;
    }

    public void setSelected(Dependencie dependencie, boolean z) {
        if (!z) {
            if (this.selectedMap.containsKey(dependencie)) {
                this.selectedMap.remove(dependencie);
            }
            if (hasAdded(getSelectedList(), dependencie)) {
                remove(getSelectedList(), dependencie);
            }
        } else {
            this.selectedMap.put(dependencie, new Boolean(z));
            if (!hasAdded(getSelectedList(), dependencie)) {
                getSelectedList().add(dependencie);
            }
        }
        if (this.onSelectionListener != null) {
            this.onSelectionListener.onSelection(dependencie, z);
        }
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Dependencie getItem(int i) {
        return this.list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    boolean isSelection(Dependencie dependencie) {
        if (this.selectedMap.containsKey(dependencie)) {
            return this.selectedMap.get(dependencie).booleanValue();
        }
        return false;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        CharSequence name;
        View itemView = view == null ? new ItemView(this.f4957ctx) : view;
        ItemView itemView2 = (ItemView) itemView;
        Dependencie item = getItem(i);
        itemView2.setChecked(isSelection(item));
        if (this.highlightMap.containsKey(item)) {
            Highlight highlight = this.highlightMap.get(item);
            name = makeHighlightText(item.getName(), highlight.start, highlight.f4958end);
        } else {
            name = item.getName();
        }
        itemView2.setText(new SpannableStringBuilder(String.format("%d. ", new Integer(i + 1))).append(name));
        return itemView;
    }

    private SpannableStringBuilder makeHighlightText(String str, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(str);
        if (i >= 0) {
            BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(getColorAccent(this.f4957ctx));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-1);
            spannableString.setSpan(backgroundColorSpan, i, i2, 33);
            spannableString.setSpan(foregroundColorSpan, i, i2, 33);
        }
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public static int getColorAccent(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            return -65536;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }
}
