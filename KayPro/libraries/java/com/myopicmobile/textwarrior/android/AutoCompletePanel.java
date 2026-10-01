package com.myopicmobile.textwarrior.android;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListPopupWindow;
import android.widget.TextView;
import com.myopicmobile.textwarrior.common.Flag;
import com.myopicmobile.textwarrior.common.Language;
import com.myopicmobile.textwarrior.common.LanguageNonProg;
import java.util.ArrayList;

public class AutoCompletePanel {
    private static Language _globalLanguage = LanguageNonProg.getInstance();
    private MyAdapter _adapter;
    private ListPopupWindow _autoCompletePanel;
    private int _backgroundColor;
    private CharSequence _constraint;
    private Context _context;
    private Filter _filter;
    private int _height;
    private int _horizontal;
    private int _textColor;
    private FreeScrollingTextField _textField;
    private int _verticalOffset;

    private GradientDrawable f4827gd;

    class MyAdapter extends ArrayAdapter<String> implements Filterable {
        private Flag _abort;

        private int f4828_h;

        private DisplayMetrics f4829dm;
        private final AutoCompletePanel this$0;

        public MyAdapter(AutoCompletePanel autoCompletePanel, Context context, int i) {
            super(context, i);
            this.this$0 = autoCompletePanel;
            this._abort = new Flag();
            setNotifyOnChange(false);
            this.f4829dm = context.getResources().getDisplayMetrics();
        }

        private int m7092dp(float f) {
            return (int) TypedValue.applyDimension(1, f, this.f4829dm);
        }

        public void abort() {
            this._abort.m7096set();
        }

        @Override
        public Filter getFilter() {
            return new Filter(this) {
                private final MyAdapter this$0;

                {
                    this.this$0 = this;
                }

                @Override
                protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                    String str;
                    int i = 0;
                    ArrayList arrayList = new ArrayList();
                    String lowerCase = String.valueOf(charSequence).toLowerCase();
                    String[] strArrSplit = lowerCase.split("\\.");
                    if (strArrSplit.length == 2) {
                        String str2 = strArrSplit[0];
                        String str3 = strArrSplit[1];
                        if (AutoCompletePanel._globalLanguage.isBasePackage(str2)) {
                            String[] basePackage = AutoCompletePanel._globalLanguage.getBasePackage(str2);
                            while (i < basePackage.length) {
                                String str4 = basePackage[i];
                                if (str4.toLowerCase().startsWith(str3)) {
                                    arrayList.add(str4);
                                }
                                i++;
                            }
                        }
                        str = str3;
                    } else if (strArrSplit.length != 1) {
                        str = lowerCase;
                    } else if (lowerCase.charAt(lowerCase.length() - 1) == '.') {
                        String strSubstring = lowerCase.substring(0, lowerCase.length() - 1);
                        if (AutoCompletePanel._globalLanguage.isBasePackage(strSubstring)) {
                            String[] basePackage2 = AutoCompletePanel._globalLanguage.getBasePackage(strSubstring);
                            while (i < basePackage2.length) {
                                arrayList.add(basePackage2[i]);
                                i++;
                            }
                        }
                        str = "";
                    } else {
                        for (String str5 : AutoCompletePanel._globalLanguage.getUserWord()) {
                            if (str5.toLowerCase().startsWith(lowerCase)) {
                                arrayList.add(str5);
                            }
                        }
                        for (String str6 : AutoCompletePanel._globalLanguage.getKeywords()) {
                            if (str6.indexOf(lowerCase) == 0) {
                                arrayList.add(str6);
                            }
                        }
                        String[] names = AutoCompletePanel._globalLanguage.getNames();
                        while (i < names.length) {
                            String str7 = names[i];
                            if (str7.toLowerCase().startsWith(lowerCase)) {
                                arrayList.add(str7);
                            }
                            i++;
                        }
                        str = lowerCase;
                    }
                    this.this$0.this$0._constraint = str;
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    filterResults.values = arrayList;
                    filterResults.count = arrayList.size();
                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                    if (filterResults == null || filterResults.count <= 0 || this.this$0._abort.isSet()) {
                        this.this$0.notifyDataSetInvalidated();
                        return;
                    }
                    this.this$0.clear();
                    this.this$0.addAll((ArrayList) filterResults.values);
                    int caretY = (this.this$0.this$0._textField.getCaretY() + (this.this$0.this$0._textField.rowHeight() / 2)) - this.this$0.this$0._textField.getScrollY();
                    this.this$0.this$0.setHeight(this.this$0.getItemHeight() * Math.min(2, filterResults.count));
                    this.this$0.this$0.setHorizontalOffset(this.this$0.this$0._textField.getCaretX() - this.this$0.this$0._textField.getScrollX());
                    this.this$0.this$0.setVerticalOffset(caretY - this.this$0.this$0._textField.getHeight());
                    this.this$0.notifyDataSetChanged();
                    this.this$0.this$0.show();
                }
            };
        }

        public int getItemHeight() {
            if (this.f4828_h != 0) {
                return this.f4828_h;
            }
            TextView textView = (TextView) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.simple_list_item_1, (ViewGroup) null);
            textView.measure(0, 0);
            this.f4828_h = textView.getMeasuredHeight();
            return this.f4828_h;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView = (TextView) super.getView(i, view, viewGroup);
            textView.setTextColor(this.this$0._textColor);
            return textView;
        }

        public void restart() {
            this._abort.clear();
        }
    }

    public AutoCompletePanel(FreeScrollingTextField freeScrollingTextField) {
        this._textField = freeScrollingTextField;
        this._context = freeScrollingTextField.getContext();
        initAutoCompletePanel();
    }

    public static synchronized Language getLanguage() {
        return _globalLanguage;
    }

    private void initAutoCompletePanel() {
        this._autoCompletePanel = new ListPopupWindow(this._context);
        this._autoCompletePanel.setAnchorView(this._textField);
        this._adapter = new MyAdapter(this, this._context, R.layout.simple_list_item_1);
        this._autoCompletePanel.setAdapter(this._adapter);
        this._filter = this._adapter.getFilter();
        setHeight(300);
        TypedArray typedArrayObtainStyledAttributes = this._context.getTheme().obtainStyledAttributes(new int[]{R.attr.colorBackground, R.attr.textColorPrimary});
        int color = typedArrayObtainStyledAttributes.getColor(0, 16711935);
        int color2 = typedArrayObtainStyledAttributes.getColor(1, 16711935);
        typedArrayObtainStyledAttributes.recycle();
        this.f4827gd = new GradientDrawable();
        this.f4827gd.setColor(color);
        this.f4827gd.setCornerRadius(4);
        this.f4827gd.setStroke(1, color2);
        setTextColor(color2);
        this._autoCompletePanel.setBackgroundDrawable(this.f4827gd);
        this._autoCompletePanel.setOnItemClickListener(new AdapterView.OnItemClickListener(this) {
            private final AutoCompletePanel this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.this$0._textField.replaceText(this.this$0._textField.getCaretPosition() - this.this$0._constraint.length(), this.this$0._constraint.length(), ((TextView) view).getText().toString());
                this.this$0._adapter.abort();
                this.this$0.dismiss();
            }
        });
    }

    public void setHeight(int i) {
        if (this._height != i) {
            this._height = i;
            this._autoCompletePanel.setHeight(i);
        }
    }

    public void setHorizontalOffset(int i) {
        int iMin = Math.min(i, this._textField.getWidth() / 2);
        if (this._horizontal != iMin) {
            this._horizontal = iMin;
            this._autoCompletePanel.setHorizontalOffset(iMin);
        }
    }

    public static synchronized void setLanguage(Language language) {
        _globalLanguage = language;
    }

    public void setVerticalOffset(int i) {
        int height = 0 - this._autoCompletePanel.getHeight();
        if (i > height) {
            this._textField.scrollBy(0, i - height);
            i = height;
        }
        if (this._verticalOffset != i) {
            this._verticalOffset = i;
            this._autoCompletePanel.setVerticalOffset(i);
        }
    }

    public void dismiss() {
        if (this._autoCompletePanel.isShowing()) {
            this._autoCompletePanel.dismiss();
        }
    }

    public void setBackground(Drawable drawable) {
        this._autoCompletePanel.setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        this._backgroundColor = i;
        this.f4827gd.setColor(i);
        this._autoCompletePanel.setBackgroundDrawable(this.f4827gd);
    }

    public void setTextColor(int i) {
        this._textColor = i;
        this.f4827gd.setStroke(1, i);
        this._autoCompletePanel.setBackgroundDrawable(this.f4827gd);
    }

    public void setWidth(int i) {
        this._autoCompletePanel.setWidth(i);
    }

    public void show() {
        if (!this._autoCompletePanel.isShowing()) {
            this._autoCompletePanel.show();
        }
        this._autoCompletePanel.getListView().setFadingEdgeLength(0);
    }

    public void update(CharSequence charSequence) {
        this._adapter.restart();
        this._filter.filter(charSequence);
    }
}
