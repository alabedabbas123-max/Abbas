package sun.misc;

public class CR6 {
    public int value = 0;

    public void update(byte aByte) {
        int a = aByte;
        for (int count = 7; count >= 0; count--) {
            a <<= 1;
            int b = (a >>> 8) & 1;
            int i = this.value;
            if ((32768 & i) != 0) {
                this.value = ((i << 1) + b) ^ 4129;
            } else {
                this.value = (i << 1) + b;
            }
        }
        int count2 = this.value;
        this.value = count2 & 65535;
    }

    public void reset() {
        this.value = 0;
    }
}
