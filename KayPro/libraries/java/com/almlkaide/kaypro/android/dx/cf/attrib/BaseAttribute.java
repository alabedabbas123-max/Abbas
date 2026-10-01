package com.almlkaide.kaypro.android.dx.cf.attrib;

import com.almlkaide.kaypro.android.dx.cf.iface.Attribute;

public abstract class BaseAttribute implements Attribute {
    private final String name;

    public BaseAttribute(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        this.name = str;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
