package abcd;

class ThreadFactorycE implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.ThreadFactory j6;

    ThreadFactorycE() {
        this.j6 = java.util.concurrent.Executors.defaultThreadFactory();
    }

    @Override
    public java.lang.Thread newThread(java.lang.Runnable r2) {
        java.lang.Thread r3 = this.j6.newThread(r2);
        r3.setName("JGit-AlarmQueue");
        r3.setDaemon(true);
        return r3;
    }
}
