package org.objectweb.asm;

final class Item {

    int f6542a;

    int f6543b;

    int f6544c;

    long f6545d;

    String f6546g;

    String f6547h;

    String f6548i;

    int f6549j;

    Item f6550k;

    Item() {
    }

    Item(int i) {
        this.f6542a = i;
    }

    Item(int i, Item item) {
        this.f6542a = i;
        this.f6543b = item.f6543b;
        this.f6544c = item.f6544c;
        this.f6545d = item.f6545d;
        this.f6546g = item.f6546g;
        this.f6547h = item.f6547h;
        this.f6548i = item.f6548i;
        this.f6549j = item.f6549j;
    }

    void m8955a(double d) {
        this.f6543b = 6;
        this.f6545d = Double.doubleToRawLongBits(d);
        this.f6549j = Integer.MAX_VALUE & (this.f6543b + ((int) d));
    }

    void m8956a(float f) {
        this.f6543b = 4;
        this.f6544c = Float.floatToRawIntBits(f);
        this.f6549j = Integer.MAX_VALUE & (this.f6543b + ((int) f));
    }

    void m8957a(int i) {
        this.f6543b = 3;
        this.f6544c = i;
        this.f6549j = Integer.MAX_VALUE & (this.f6543b + i);
    }

    void m8958a(int i, int i2) {
        this.f6543b = 33;
        this.f6544c = i;
        this.f6549j = i2;
    }

    void m8959a(int i, String str, String str2, String str3) {
        this.f6543b = i;
        this.f6546g = str;
        this.f6547h = str2;
        this.f6548i = str3;
        switch (i) {
            case 1:
            case 8:
            case 16:
            case 30:
                break;
            case 7:
                this.f6544c = 0;
                break;
            case 12:
                this.f6549j = ((str.hashCode() * str2.hashCode()) + i) & Integer.MAX_VALUE;
                return;
            default:
                this.f6549j = ((str.hashCode() * str2.hashCode() * str3.hashCode()) + i) & Integer.MAX_VALUE;
                return;
        }
        this.f6549j = (str.hashCode() + i) & Integer.MAX_VALUE;
    }

    void m8960a(long j) {
        this.f6543b = 5;
        this.f6545d = j;
        this.f6549j = Integer.MAX_VALUE & (this.f6543b + ((int) j));
    }

    void m8961a(String str, String str2, int i) {
        this.f6543b = 18;
        this.f6545d = i;
        this.f6546g = str;
        this.f6547h = str2;
        this.f6549j = Integer.MAX_VALUE & ((this.f6546g.hashCode() * i * this.f6547h.hashCode()) + 18);
    }

    boolean m8962a(Item item) {
        switch (this.f6543b) {
            case 1:
            case 7:
            case 8:
            case 16:
            case 30:
                return item.f6546g.equals(this.f6546g);
            case 3:
            case 4:
                return item.f6544c == this.f6544c;
            case 5:
            case 6:
            case 32:
                return item.f6545d == this.f6545d;
            case 12:
                return item.f6546g.equals(this.f6546g) && item.f6547h.equals(this.f6547h);
            case 18:
                return item.f6545d == this.f6545d && item.f6546g.equals(this.f6546g) && item.f6547h.equals(this.f6547h);
            case 31:
                return item.f6544c == this.f6544c && item.f6546g.equals(this.f6546g);
            default:
                return item.f6546g.equals(this.f6546g) && item.f6547h.equals(this.f6547h) && item.f6548i.equals(this.f6548i);
        }
    }
}
