package abcd;

class Rv implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    final abcd.Qv.d j6;

    Rv(abcd.Qv.d r1) {
        this.j6 = r1;
    }

    @Override
    public void onGlobalLayout() {
        abcd.Qv.d.j6(this.j6);
    }
}
