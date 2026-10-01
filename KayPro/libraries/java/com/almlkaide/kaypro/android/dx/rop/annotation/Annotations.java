package com.almlkaide.kaypro.android.dx.rop.annotation;

import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.util.MutabilityControl;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public final class Annotations extends MutabilityControl implements Comparable<Annotations> {
    public static final Annotations EMPTY = new Annotations();
    private final TreeMap<CstType, Annotation> annotations = new TreeMap<>();

    @Override
    public int compareTo(Annotations annotations) {
        return compareTo2(annotations);
    }

    static {
        EMPTY.setImmutable();
    }

    public static Annotations combine(Annotations annotations, Annotations annotations2) {
        Annotations annotations3 = new Annotations();
        annotations3.addAll(annotations);
        annotations3.addAll(annotations2);
        annotations3.setImmutable();
        return annotations3;
    }

    public static Annotations combine(Annotations annotations, Annotation annotation) {
        Annotations annotations2 = new Annotations();
        annotations2.addAll(annotations);
        annotations2.m7178add(annotation);
        annotations2.setImmutable();
        return annotations2;
    }

    public int hashCode() {
        return this.annotations.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Annotations)) {
            return false;
        }
        return this.annotations.equals(((Annotations) obj).annotations);
    }

    public int compareTo2(Annotations annotations) {
        Iterator<Annotation> it = this.annotations.values().iterator();
        Iterator<Annotation> it2 = annotations.annotations.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo2 = it.next().compareTo2(it2.next());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        if (it2.hasNext()) {
            return -1;
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        sb.append("annotations{");
        for (Annotation annotation : this.annotations.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(annotation.toHuman());
        }
        sb.append("}");
        return sb.toString();
    }

    public int size() {
        return this.annotations.size();
    }

    public void m7178add(Annotation annotation) {
        throwIfImmutable();
        if (annotation == null) {
            throw new NullPointerException("annotation == null");
        }
        CstType type = annotation.getType();
        if (this.annotations.containsKey(type)) {
            throw new IllegalArgumentException(new StringBuffer().append("duplicate type: ").append(type.toHuman()).toString());
        }
        this.annotations.put(type, annotation);
    }

    public void addAll(Annotations annotations) {
        throwIfImmutable();
        if (annotations == null) {
            throw new NullPointerException("toAdd == null");
        }
        Iterator<Annotation> it = annotations.annotations.values().iterator();
        while (it.hasNext()) {
            m7178add(it.next());
        }
    }

    public Collection<Annotation> getAnnotations() {
        return Collections.unmodifiableCollection(this.annotations.values());
    }
}
