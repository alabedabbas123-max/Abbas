package abcd;

class EF extends java.lang.InheritableThreadLocal<abcd.FF> {
    EF() {
    }

    @Override
    protected abcd.FF initialValue() {
        return new abcd.FF(java.util.Locale.getDefault(), null);
    }

    @Override
    protected java.lang.Object initialValue() {
        return initialValue();
    }
}
