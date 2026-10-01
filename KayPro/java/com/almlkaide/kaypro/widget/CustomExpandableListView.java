package com.almlkaide.kaypro.widget;

import android.content.Context;
import android.widget.ExpandableListView;

public class CustomExpandableListView extends ExpandableListView {
    public CustomExpandableListView(Context context) {
        super(context);
        setDividerHeight(0);
    }
}
