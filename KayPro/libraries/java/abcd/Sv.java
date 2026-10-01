package abcd;

class Sv extends java.lang.ThreadLocal<java.util.zip.Adler32> {
    Sv() {
    }

    @Override
    protected java.util.zip.Adler32 initialValue() {
        return initialValue2();
    }

    @Override
    protected java.util.zip.Adler32 initialValue2() {
        return new java.util.zip.Adler32();
    }
}
