package abcd;

class IP implements abcd.InterfacevP {
    final abcd.JP DW;
    private abcd.JP.a j6;

    IP(abcd.JP r2, java.security.Signature r3) {
        this.DW = r2;
        this.j6 = new abcd.JP.a(r2, r3);
    }

    @Override
    public abcd.wN DW() {
        return abcd.JP.j6(this.DW);
    }

    @Override
    public byte[] FH() {
        return this.j6.j6();
    L4:
        e = move-exception;
        throw new abcd.EP("exception obtaining signature: " + e.getMessage(), e);
    }

    @Override
    public java.io.OutputStream j6() {
        return this.j6;
    }
}
