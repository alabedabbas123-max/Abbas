package com.almlkaide.kaypro.aide.application.activity.androidr;

import android.R;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.widget.CustomListView;
import java.util.ArrayList;
import java.util.List;

public class FragmentMain extends Fragment {
    private FragmentAdapter fragmentAdapter;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new CustomListView(getActivity());
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ListView listView = (ListView) view;
        this.fragmentAdapter = new FragmentAdapter(this);
        this.fragmentAdapter.m7098add("String", "FragmentString");
        this.fragmentAdapter.m7098add("Color", "FragmentColor");
        this.fragmentAdapter.m7098add("Theme", "FragmentTheme");
        this.fragmentAdapter.m7098add("Drawable", "FragmentDrawable");
        this.fragmentAdapter.m7098add("TextAppearance", "FragmentTextAppearance");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), R.layout.simple_list_item_1, R.id.text1);
        for (int i = 0; i < this.fragmentAdapter.getCount(); i++) {
            arrayAdapter.add(this.fragmentAdapter.getTitle(i));
        }
        listView.setAdapter((ListAdapter) arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(this) {
            private final FragmentMain this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view2, int i2, long j) {
                try {
                    this.this$0.startActivity(new Intent(this.this$0.getActivity(), Class.forName("com.almlkaide.kaypro.aide.application.activity.androidr.AndroidRActivity")).putExtra("tag", this.this$0.fragmentAdapter.getTag(i2)).putExtra(Config.FEED_LIST_ITEM_TITLE, this.this$0.fragmentAdapter.getTitle(i2)));
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
        });
    }

    private class FragmentAdapter {
        private final FragmentMain this$0;
        private List<String> fragmentTitleList = new ArrayList();
        private List<String> fragmentTagList = new ArrayList();

        public int getCount() {
            return this.fragmentTitleList.size();
        }

        public void m7098add(String str, String str2) {
            this.fragmentTitleList.add(str);
            this.fragmentTagList.add(str2);
        }

        public String getTitle(int i) {
            return this.fragmentTitleList.get(i);
        }

        public String getTag(int i) {
            return this.fragmentTagList.get(i);
        }

        public FragmentAdapter(FragmentMain fragmentMain) {
            this.this$0 = fragmentMain;
        }
    }
}
