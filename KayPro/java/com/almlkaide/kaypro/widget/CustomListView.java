package com.almlkaide.kaypro.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ListView;

public class CustomListView extends ListView {
    public CustomListView(Context context) {
        super(context);
        setDivider((Drawable) null);
    }
}
