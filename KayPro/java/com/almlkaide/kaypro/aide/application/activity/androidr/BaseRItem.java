package com.almlkaide.kaypro.aide.application.activity.androidr;

public class BaseRItem {
    public Highlight hig_name = new Highlight(this);

    public int f4936id;
    public String name;

    public BaseRItem() {
    }

    public BaseRItem(String str, int i) {
        this.name = str;
        this.f4936id = i;
    }

    public class Highlight {
        private final BaseRItem this$0;
        public int start = -1;

        public int f4937end = -1;

        public Highlight(BaseRItem baseRItem) {
            this.this$0 = baseRItem;
        }
    }
}
