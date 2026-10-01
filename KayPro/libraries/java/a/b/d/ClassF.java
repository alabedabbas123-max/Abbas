package a.b.d;

public class ClassF {
    public static byte m388a(char c) {
        switch (c) {
            case 'B':
                return (byte) 8;
            case 'C':
                return (byte) 5;
            case 'D':
                return (byte) 7;
            case 'F':
                return (byte) 6;
            case 'I':
                return (byte) 10;
            case 'J':
                return (byte) 11;
            case 'S':
                return (byte) 9;
            case 'Z':
                return (byte) 4;
            default:
                throw new IllegalArgumentException("Unknown primitive: " + c);
        }
    }

    public static char m389a(byte b) {
        switch (b) {
            case 4:
                return 'Z';
            case 5:
                return 'C';
            case 6:
                return 'F';
            case 7:
                return 'D';
            case 8:
                return 'B';
            case 9:
                return 'S';
            case 10:
                return 'I';
            case 11:
                return 'J';
            default:
                throw new IllegalArgumentException("Unknown array type [" + ((int) b) + "]");
        }
    }
}
