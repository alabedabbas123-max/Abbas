package abcd;

class RunnablefQ implements java.lang.Runnable {
    final abcd.gQ j6;

    RunnablefQ(abcd.gQ r1) {
        this.j6 = r1;
    }

    @Override
    public void run() {
        abcd.gQ.j6(this.j6).onCancel();
    }
}
