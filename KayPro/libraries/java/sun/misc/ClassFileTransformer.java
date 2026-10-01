package sun.misc;

import java.util.ArrayList;

public abstract class ClassFileTransformer {
    private static ArrayList transformerList = new ArrayList();
    private static Object[] transformers = new Object[0];

    public abstract byte[] transform(byte[] bArr, int i, int i2) throws ClassFormatError;

    public static void m523add(ClassFileTransformer t) {
        synchronized (transformerList) {
            transformerList.add(t);
            transformers = transformerList.toArray();
        }
    }

    public static Object[] getTransformers() {
        return transformers;
    }
}
