package abcd;

class fB implements java.util.Comparator<abcd.ME> {
    final abcd.gB j6;

    fB(abcd.gB r1) {
        this.j6 = r1;
    }

    @Override
    public int compare(abcd.ME r1, abcd.ME r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.ME r1, abcd.ME r2) {
        return r1.getName().compareTo(r2.getName());
    }
}
