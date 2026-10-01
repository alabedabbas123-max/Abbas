package sun.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

public class ConstantPool {
    private Object constantPoolOop;

    private native Class getClassAt0(Object obj, int i);

    private native Class getClassAtIfLoaded0(Object obj, int i);

    private native double getDoubleAt0(Object obj, int i);

    private native Field getFieldAt0(Object obj, int i);

    private native Field getFieldAtIfLoaded0(Object obj, int i);

    private native float getFloatAt0(Object obj, int i);

    private native int getIntAt0(Object obj, int i);

    private native long getLongAt0(Object obj, int i);

    private native String[] getMemberRefInfoAt0(Object obj, int i);

    private native Member getMethodAt0(Object obj, int i);

    private native Member getMethodAtIfLoaded0(Object obj, int i);

    private native int getSize0(Object obj);

    private native String getStringAt0(Object obj, int i);

    private native String getUTF8At0(Object obj, int i);

    public int getSize() {
        return getSize0(this.constantPoolOop);
    }

    public Class getClassAt(int index) {
        return getClassAt0(this.constantPoolOop, index);
    }

    public Class getClassAtIfLoaded(int index) {
        return getClassAtIfLoaded0(this.constantPoolOop, index);
    }

    public Member getMethodAt(int index) {
        return getMethodAt0(this.constantPoolOop, index);
    }

    public Member getMethodAtIfLoaded(int index) {
        return getMethodAtIfLoaded0(this.constantPoolOop, index);
    }

    public Field getFieldAt(int index) {
        return getFieldAt0(this.constantPoolOop, index);
    }

    public Field getFieldAtIfLoaded(int index) {
        return getFieldAtIfLoaded0(this.constantPoolOop, index);
    }

    public String[] getMemberRefInfoAt(int index) {
        return getMemberRefInfoAt0(this.constantPoolOop, index);
    }

    public int getIntAt(int index) {
        return getIntAt0(this.constantPoolOop, index);
    }

    public long getLongAt(int index) {
        return getLongAt0(this.constantPoolOop, index);
    }

    public float getFloatAt(int index) {
        return getFloatAt0(this.constantPoolOop, index);
    }

    public double getDoubleAt(int index) {
        return getDoubleAt0(this.constantPoolOop, index);
    }

    public String getStringAt(int index) {
        return getStringAt0(this.constantPoolOop, index);
    }

    public String getUTF8At(int index) {
        return getUTF8At0(this.constantPoolOop, index);
    }

    static {
        Reflection.registerFieldsToFilter(ConstantPool.class, "constantPoolOop");
    }
}
