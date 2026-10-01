package com.almlkaide.kaypro.manifesteditor;

import android.widget.CompoundButton;

public class ClassD implements CompoundButton.OnCheckedChangeListener {

    private ClassF f3627a;

    private DialogInterfaceOnClickListenerb f3628b;

    public ClassD(DialogInterfaceOnClickListenerb dialogInterfaceOnClickListenerC1330b, ClassF c1365f) {
        this.f3628b = dialogInterfaceOnClickListenerC1330b;
        this.f3627a = c1365f;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        compoundButton.setChecked(z);
        if (z) {
            this.f3628b.m5545a(this.f3627a);
        } else {
            this.f3628b.m5546b(this.f3627a);
        }
    }
}
