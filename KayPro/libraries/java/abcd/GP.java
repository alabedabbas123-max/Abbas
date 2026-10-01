package abcd;

public class GP implements abcd.AP {

    private class a extends java.io.OutputStream {
        final abcd.GP DW;
        private abcd.InterfacesO j6;

        a(abcd.GP r1, abcd.InterfacesO r2) {
            this.DW = r1;
            this.j6 = r2;
        }

        byte[] j6() {
            byte[] r0 = new byte[this.j6.DW()];
            this.j6.j6(r0, 0);
            return r0;
        }

        @Override
        public void write(int r2) {
            this.j6.j6((byte) r2);
        }

        @Override
        public void write(byte[] r4) {
            this.j6.update(r4, 0, r4.length);
        }

        @Override
        public void write(byte[] r2, int r3, int r4) {
            this.j6.update(r2, r3, r4);
        }
    }

    public GP() {
    }

    @Override
    public abcd.InterfacezP j6(abcd.wN r3) {
        return new abcd.FP(this, r3, new abcd.GP.a(this, abcd.HP.j6(r3)));
    }
}
