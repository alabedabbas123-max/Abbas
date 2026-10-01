package com.a.b.e.d;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class ClassA implements Comparable {

    private static final ConcurrentMap f3195a = new ConcurrentHashMap(10000, 0.75f);

    private final String f3196b;

    private final ClassC f3197c;

    private final ClassB f3198d;

    private ClassB f3199e;

    private ClassA(String str, ClassC c1236c, ClassB c1235b) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (c1236c == null) {
            throw new NullPointerException("returnType == null");
        }
        if (c1235b == null) {
            throw new NullPointerException("parameterTypes == null");
        }
        this.f3196b = str;
        this.f3197c = c1236c;
        this.f3198d = c1235b;
        this.f3199e = null;
    }

    public static ClassA m5032a(ClassC c1236c, int i) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('(');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('I');
        }
        sb.append(')');
        sb.append(c1236c.m5064h());
        return m5033a(sb.toString());
    }

    public static ClassA m5033a(String str) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        ClassA c1234a = (ClassA) f3195a.get(str);
        return c1234a != null ? c1234a : m5035b(m5036b(str));
    }

    public static ClassA m5034a(String str, ClassC c1236c, boolean z, boolean z2) {
        ClassA c1234aM5033a = m5033a(str);
        if (z) {
            return c1234aM5033a;
        }
        if (z2) {
            c1236c = c1236c.m5062a(Integer.MAX_VALUE);
        }
        return c1234aM5033a.m5039a(c1236c);
    }

    private static ClassA m5035b(ClassA c1234a) {
        ClassA c1234a2 = (ClassA) f3195a.putIfAbsent(c1234a.m5040a(), c1234a);
        return c1234a2 != null ? c1234a2 : c1234a;
    }

    public static ClassA m5036b(String str) {
        int i;
        ClassA c1234a = (ClassA) f3195a.get(str);
        if (c1234a != null) {
            return c1234a;
        }
        ClassC[] c1236cArrM5037c = m5037c(str);
        int i2 = 1;
        int i3 = 0;
        while (true) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ')') {
                ClassC c1236cM5058b = ClassC.m5058b(str.substring(i2 + 1));
                ClassB c1235b = new ClassB(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    c1235b.m5052a(i4, c1236cArrM5037c[i4]);
                }
                return new ClassA(str, c1236cM5058b, c1235b);
            }
            int i5 = i2;
            while (cCharAt == '[') {
                i5++;
                cCharAt = str.charAt(i5);
            }
            if (cCharAt == 'L') {
                int iIndexOf = str.indexOf(59, i5);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("bad descriptor");
                }
                i = iIndexOf + 1;
            } else {
                i = i5 + 1;
            }
            c1236cArrM5037c[i3] = ClassC.m5056a(str.substring(i2, i));
            i3++;
            i2 = i;
        }
    }

    private static ClassC[] m5037c(String str) {
        int length = str.length();
        if (str.charAt(0) != '(') {
            throw new IllegalArgumentException("bad descriptor");
        }
        int i = 1;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = 0;
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i2++;
            }
            i++;
        }
        if (i == 0 || i == length - 1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        if (str.indexOf(41, i + 1) != -1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        return new ClassC[i2];
    }

    @Override
    public int compareTo(ClassA c1234a) {
        if (this == c1234a) {
            return 0;
        }
        int iM5061a = this.f3197c.compareTo(c1234a.f3197c);
        if (iM5061a != 0) {
            return iM5061a;
        }
        int iD_ = this.f3198d.m5476d_();
        int iD_2 = c1234a.f3198d.m5476d_();
        int iMin = Math.min(iD_, iD_2);
        for (int i = 0; i < iMin; i++) {
            int iM5061a2 = this.f3198d.m5053b(i).compareTo(c1234a.f3198d.m5053b(i));
            if (iM5061a2 != 0) {
                return iM5061a2;
            }
        }
        if (iD_ < iD_2) {
            return -1;
        }
        return iD_ > iD_2 ? 1 : 0;
    }

    public ClassA m5039a(ClassC c1236c) {
        String str = "(" + c1236c.m5064h() + this.f3196b.substring(1);
        ClassB c1235bM5054c = this.f3198d.m5054c(c1236c);
        c1235bM5054c.mo3944c_();
        return m5035b(new ClassA(str, this.f3197c, c1235bM5054c));
    }

    public String m5040a() {
        return this.f3196b;
    }

    public ClassC m5041b() {
        return this.f3197c;
    }

    public ClassB m5042c() {
        return this.f3198d;
    }

    public ClassB m5043d() {
        if (this.f3199e == null) {
            int iD_ = this.f3198d.m5476d_();
            ClassB c1235b = new ClassB(iD_);
            boolean z = false;
            for (int i = 0; i < iD_; i++) {
                ClassC c1236cM5053b = this.f3198d.m5053b(i);
                if (c1236cM5053b.m5069m()) {
                    z = true;
                    c1236cM5053b = ClassC.f3255f;
                }
                c1235b.m5052a(i, c1236cM5053b);
            }
            this.f3199e = z ? c1235b : this.f3198d;
        }
        return this.f3199e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClassA) {
            return this.f3196b.equals(((ClassA) obj).f3196b);
        }
        return false;
    }

    public int hashCode() {
        return this.f3196b.hashCode();
    }

    public String toString() {
        return this.f3196b;
    }
}
