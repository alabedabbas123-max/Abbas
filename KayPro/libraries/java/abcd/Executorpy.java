package abcd;

final class Executorpy implements java.util.concurrent.Executor {
    Executorpy() {
    }

    @Override
    public final void execute(java.lang.Runnable r1) {
        r1.run();
    }
}
