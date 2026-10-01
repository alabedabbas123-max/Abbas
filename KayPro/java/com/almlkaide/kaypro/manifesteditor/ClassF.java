package com.almlkaide.kaypro.manifesteditor;

import com.aide.perm;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public class ClassF implements Comparable {

    public String f3710a;

    public String f3711b;

    public static void m5796a(List list) {
        for (Field field : perm.class.getFields()) {
            try {
                m5797a(list, field);
            } catch (IllegalAccessException e) {
            } catch (IllegalArgumentException e2) {
            }
        }
        Collections.sort(list);
    }

    private static void m5797a(List list, Field field) {
        ClassF c1365f = new ClassF();
        c1365f.f3711b = field.getName();
        c1365f.f3710a = (String) field.get(null);
        list.add(c1365f);
    }

    @Override
    public int compareTo(ClassF c1365f) {
        return this.f3711b.compareTo(c1365f.f3711b);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.f3711b);
        stringBuffer.append("\n(").append(this.f3710a).append(")");
        return stringBuffer.toString();
    }
}
