package com.almlkaide.kaypro.manifesteditor;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ClassA;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassA extends BaseAdapter {

    private ManifestActivity f3526d;

    private List f3527e;

    public List f3524b = new ArrayList();

    public List f3525c = new ArrayList();

    public boolean f3523a = false;

    public ClassA(ManifestActivity manifestActivity) {
        this.f3526d = manifestActivity;
    }

    @Override
    public ClassG getItem(int i) {
        if (this.f3527e.size() == 0) {
            return null;
        }
        return (ClassG) this.f3527e.get(i);
    }

    public void m5535a() {
        this.f3524b.clear();
        this.f3525c.clear();
        for (ClassF c1365f : ManifestActivity.f3512a) {
            Iterator it = this.f3527e.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (((ClassG) it.next()).m5800a().equals(c1365f.f3710a)) {
                    this.f3524b.add(c1365f);
                    z = true;
                }
            }
            if (!z) {
                this.f3525c.add(c1365f);
            }
        }
    }

    public void m5536a(ClassG c1366g) {
        this.f3527e.remove(c1366g);
        m5535a();
        notifyDataSetChanged();
        this.f3523a = true;
        this.f3526d.invalidateOptionsMenu();
    }

    public void m5537a(List list) {
        this.f3527e = list;
        m5535a();
        notifyDataSetChanged();
    }

    public void m5538b() {
        this.f3526d.m5533a(this.f3527e, "uses-permission");
        this.f3523a = false;
        this.f3526d.invalidateOptionsMenu();
    }

    public void m5539b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClassF c1365f = (ClassF) it.next();
            ClassC c1342c = new ClassC();
            c1342c.f3558a = "android:name";
            c1342c.f3559b = c1365f.f3710a;
            ClassG c1366g = new ClassG("uses-permission");
            c1366g.m5802a(c1342c);
            this.f3527e.add(c1366g);
            this.f3524b.add(c1365f);
            this.f3525c.remove(c1365f);
        }
        notifyDataSetChanged();
        this.f3523a = true;
        this.f3526d.invalidateOptionsMenu();
    }

    @Override
    public int getCount() {
        if (this.f3527e.size() == 0) {
            return 1;
        }
        return this.f3527e.size();
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3526d.m5532a();
        }
        TextView textView = (TextView) view.findViewById(ClassA.f1731c);
        view.findViewById(ClassA.f1730b).setVisibility(8);
        view.findViewById(ClassA.f1732d).setVisibility(8);
        if (this.f3527e.size() == 0) {
            textView.setText("当前没有权限，请点击右上角来添加权限↗");
        } else {
            ((ClassG) this.f3527e.get(i)).m5801a(textView);
        }
        return view;
    }
}
