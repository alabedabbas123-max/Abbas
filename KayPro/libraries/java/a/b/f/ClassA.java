package a.b.f;

public class ClassA {
    public static int m678a(int i) {
        switch (i & 7) {
            case 1:
                return 3;
            case 2:
                return 0;
            case 3:
            default:
                return 1;
            case 4:
                return 2;
        }
    }

    public static int m679a(int i, int i2) {
        if (i2 == 2) {
            i &= -17;
        }
        return (i & (-8)) | (i2 & 7);
    }

    public static int m680b(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            default:
                return 0;
            case 2:
                return 4;
            case 3:
                return 1;
        }
    }
}
