package com.almlkaide.kaypro.manifesteditor;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import java.util.ArrayList;
import java.util.List;

public class DialogInterfaceOnClickListenerb extends BaseAdapter implements DialogInterface.OnClickListener, TextWatcher {

    ManifestActivity f3540c;

    ClassA f3541d;

    List f3539b = new ArrayList();

    List f3538a = new ArrayList();

    public DialogInterfaceOnClickListenerb(ClassA c1328a, ManifestActivity manifestActivity) {
        this.f3541d = c1328a;
        this.f3540c = manifestActivity;
        this.f3539b.addAll(c1328a.f3525c);
    }

    public void m5545a(ClassF c1365f) {
        this.f3538a.add(c1365f);
    }

    @Override
    public void afterTextChanged(Editable editable) {
        this.f3539b.clear();
        String upperCase = editable.toString().toUpperCase();
        for (ClassF c1365f : this.f3541d.f3525c) {
            if (c1365f.f3711b.contains(upperCase)) {
                this.f3539b.add(c1365f);
            }
        }
        notifyDataSetChanged();
    }

    public void m5546b(ClassF c1365f) {
        this.f3538a.remove(c1365f);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public int getCount() {
        return this.f3539b.size();
    }

    @Override
    public Object getItem(int i) {
        return this.f3539b.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        CheckBox checkBox;
        if (view == null) {
            CheckBox checkBox2 = new CheckBox(this.f3540c);
            checkBox = checkBox2;
            view = checkBox2;
        } else {
            checkBox = (CheckBox) view;
        }
        ClassF c1365f = (ClassF) this.f3539b.get(i);
        checkBox.setText(c1365f.toString());
        checkBox.setOnCheckedChangeListener(new ClassD(this, c1365f));
        return view;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f3538a.size() > 0) {
            this.f3541d.m5539b(this.f3538a);
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
