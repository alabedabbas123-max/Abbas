package abcd;

class Tv extends java.lang.ThreadLocal<java.util.zip.CRC32> {
    Tv() {
    }

    @Override
    protected java.util.zip.CRC32 initialValue() {
        return initialValue2();
    }

    @Override
    protected java.util.zip.CRC32 initialValue2() {
        return new java.util.zip.CRC32();
    }
}
