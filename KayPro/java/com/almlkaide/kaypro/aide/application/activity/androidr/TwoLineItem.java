package com.almlkaide.kaypro.aide.application.activity.androidr;

public class TwoLineItem extends BaseRItem {
    public BaseRItem.Highlight hig_subName;
    public String subname;

    public TwoLineItem() {
        this.hig_subName = new BaseRItem.Highlight(this);
    }

    public TwoLineItem(String str, int i) {
        super(str, i);
        this.hig_subName = new BaseRItem.Highlight(this);
    }
}
