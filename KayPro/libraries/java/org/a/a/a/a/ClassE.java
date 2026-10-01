package org.a.a.a.a;

import com.almlkaide.kaypro.android.dx.io.Opcodes;
import org.a.a.a.c.Abstracta;

public final class ClassE extends Abstracta {

    public static final ClassE f5197a = new ClassE();

    private ClassE() {
    }

    @Override
    public int mo7320a(ClassB c1712b) {
        return ((((c1712b.f5165a.f5221c + Opcodes.RSUB_INT_LIT8) * 31) + c1712b.f5166b) * 31) + c1712b.f5169e.hashCode();
    }

    @Override
    public boolean mo7322a(ClassB c1712b, ClassB c1712b2) {
        if (c1712b == c1712b2) {
            return true;
        }
        if (c1712b == null || c1712b2 == null) {
            return false;
        }
        return c1712b.f5165a.f5221c == c1712b2.f5165a.f5221c && c1712b.f5166b == c1712b2.f5166b && c1712b.f5169e.equals(c1712b2.f5169e);
    }
}
