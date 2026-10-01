package a.b.d;

import android.support.v4.provider.FontsContractCompat;
import com.github.megatronking.svg.generator.utils.KeywordColors;
import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;

public class ClassE {
    public static Abstractc m387a(byte[] bArr, int i) {
        byte b;
        boolean z;
        Abstractc c0052g;
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 == -60) {
            byte b3 = bArr[i2];
            i2++;
            b = b3;
            z = true;
        } else {
            b = b2;
            z = false;
        }
        switch (b) {
            case -128:
            case -127:
            case -126:
            case -125:
            case -123:
            case -122:
            case -121:
            case -120:
            case -119:
            case -118:
            case -117:
            case -116:
            case -115:
            case -114:
            case -113:
            case -112:
            case -111:
            case -110:
            case -109:
            case -108:
            case -107:
            case -106:
            case -105:
            case -104:
            case -84:
            case -83:
            case -82:
            case -81:
            case -80:
            case -79:
            case -68:
            case -66:
            case -65:
            case -62:
            case -61:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
                c0052g = new ClassH();
                break;
            case -124:
            case -87:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case ByteOps.ISTORE_3:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                c0052g = new ClassK(z);
                break;
            case -103:
            case -102:
            case -101:
            case -100:
            case -99:
            case -98:
            case -97:
            case -96:
            case -95:
            case -94:
            case -93:
            case -92:
            case -91:
            case -90:
            case -89:
            case -88:
            case -58:
            case -57:
            case -56:
            case -55:
                c0052g = new ClassA();
                break;
            case -86:
                c0052g = new ClassJ();
                break;
            case -85:
                c0052g = new ClassG();
                break;
            case -78:
            case -77:
            case -76:
            case -75:
            case -74:
            case -73:
            case -72:
            case -71:
            case -70:
            case -69:
            case -67:
            case -64:
            case -63:
            case -59:
            case 18:
            case 19:
            case 20:
                c0052g = new ClassB();
                break;
            case -60:
            case -54:
            case -53:
            case -52:
            case -51:
            case -50:
            case -49:
            case -48:
            case -47:
            case -46:
            case -45:
            case -44:
            case -43:
            case -42:
            case -41:
            case -40:
            case -39:
            case -38:
            case -37:
            case -36:
            case -35:
            case -34:
            case -33:
            case KeywordColors.lightyellow:
            case -31:
            case -30:
            case -29:
            case -28:
            case -27:
            case -26:
            case -25:
            case -24:
            case -23:
            case -22:
            case -21:
            case -20:
            case -19:
            case -18:
            case -17:
            case KeywordColors.ivory:
            case -15:
            case -14:
            case -13:
            case -12:
            case -11:
            case -10:
            case -9:
            case -8:
            case -7:
            case -6:
            case -5:
            case -4:
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR:
            case -2:
            case -1:
            default:
                throw new IllegalArgumentException("Unknown instruction opcode [" + ((int) b) + "] at offset " + i);
        }
        c0052g.f147c = b;
        c0052g.mo326b(bArr, i2);
        return c0052g;
    }
}
