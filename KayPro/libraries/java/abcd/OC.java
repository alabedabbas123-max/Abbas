package abcd;

class OC implements java.util.Comparator<abcd.PC.b> {
    OC() {
    }

    @Override
    public int compare(abcd.PC.b r1, abcd.PC.b r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.PC.b r3, abcd.PC.b r4) {
        byte[] r5 = r3.j6;
        byte[] r6 = r4.j6;
        return abcd.KC.j6(r5, r5.length, r6, r6.length);
    }
}
