package com.baidu.mobstat;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class de implements Interfaceda {

    private byte[] f4477a;

    private TreeMap<String, String> f4478b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override
    public Iterator<String> mo6720b() {
        return Collections.unmodifiableSet(this.f4478b.keySet()).iterator();
    }

    @Override
    public String mo6719b(String str) {
        String str2 = this.f4478b.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override
    public byte[] mo6722c() {
        return this.f4477a;
    }

    @Override
    public void mo6715a(String str, String str2) {
        this.f4478b.put(str, str2);
    }

    @Override
    public boolean mo6721c(String str) {
        return this.f4478b.containsKey(str);
    }
}
