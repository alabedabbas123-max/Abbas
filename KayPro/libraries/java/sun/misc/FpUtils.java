package sun.misc;

import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.jvm.ByteCodes;
import com.sun.tools.javac.util.Position;

public class FpUtils {
    static final boolean $assertionsDisabled = false;
    static double twoToTheDoubleScaleUp = powerOfTwoD(Flags.INTERFACE);
    static double twoToTheDoubleScaleDown = powerOfTwoD(-512);

    private FpUtils() {
    }

    public static int getExponent(double d) {
        return (int) (((Double.doubleToRawLongBits(d) & DoubleConsts.EXP_BIT_MASK) >> 52) - 1023);
    }

    public static int getExponent(float f) {
        return ((Float.floatToRawIntBits(f) & FloatConsts.EXP_BIT_MASK) >> 23) - 127;
    }

    static double powerOfTwoD(int n) {
        return Double.longBitsToDouble(((((long) n) + 1023) << 52) & DoubleConsts.EXP_BIT_MASK);
    }

    static float powerOfTwoF(int n) {
        return Float.intBitsToFloat(((n + 127) << 23) & FloatConsts.EXP_BIT_MASK);
    }

    public static double rawCopySign(double magnitude, double sign) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(sign) & Long.MIN_VALUE) | (Double.doubleToRawLongBits(magnitude) & Long.MAX_VALUE));
    }

    public static float rawCopySign(float magnitude, float sign) {
        return Float.intBitsToFloat((Float.floatToRawIntBits(sign) & FloatConsts.SIGN_BIT_MASK) | (Float.floatToRawIntBits(magnitude) & Position.MAXPOS));
    }

    public static boolean isFinite(double d) {
        return Math.abs(d) <= Double.MAX_VALUE;
    }

    public static boolean isFinite(float f) {
        return Math.abs(f) <= Float.MAX_VALUE;
    }

    public static boolean isInfinite(double d) {
        return Double.isInfinite(d);
    }

    public static boolean isInfinite(float f) {
        return Float.isInfinite(f);
    }

    public static boolean isNaN(double d) {
        return Double.isNaN(d);
    }

    public static boolean isNaN(float f) {
        return Float.isNaN(f);
    }

    public static boolean isUnordered(double arg1, double arg2) {
        return isNaN(arg1) || isNaN(arg2);
    }

    public static boolean isUnordered(float arg1, float arg2) {
        return isNaN(arg1) || isNaN(arg2);
    }

    public static int ilogb(double d) {
        int exponent = getExponent(d);
        if (exponent != -1023) {
            if (exponent == 1024) {
                if (isNaN(d)) {
                    return 1073741824;
                }
                return Flags.UNATTRIBUTED;
            }
            return exponent;
        }
        if (d == 0.0d) {
            return -268435456;
        }
        long transducer = Double.doubleToRawLongBits(d);
        long transducer2 = transducer & DoubleConsts.SIGNIF_BIT_MASK;
        while (transducer2 < 4503599627370496L) {
            transducer2 *= 2;
            exponent--;
        }
        return exponent + 1;
    }

    public static int ilogb(float f) {
        int exponent = getExponent(f);
        if (exponent != -127) {
            if (exponent == 128) {
                if (isNaN(f)) {
                    return 1073741824;
                }
                return Flags.UNATTRIBUTED;
            }
            return exponent;
        }
        if (f == 0.0f) {
            return -268435456;
        }
        int transducer = Float.floatToRawIntBits(f);
        int transducer2 = transducer & FloatConsts.SIGNIF_BIT_MASK;
        while (transducer2 < 8388608) {
            transducer2 *= 2;
            exponent--;
        }
        return exponent + 1;
    }

    public static double scalb(double d, int scale_factor) {
        int scale_factor2;
        int scale_increment;
        double exp_delta;
        if (scale_factor < 0) {
            scale_factor2 = Math.max(scale_factor, -2099);
            scale_increment = -512;
            exp_delta = twoToTheDoubleScaleDown;
        } else {
            scale_factor2 = Math.min(scale_factor, 2099);
            scale_increment = Flags.INTERFACE;
            exp_delta = twoToTheDoubleScaleUp;
        }
        int t = (scale_factor2 >> 8) >>> 23;
        int exp_adjust = ((scale_factor2 + t) & 511) - t;
        double d2 = d * powerOfTwoD(exp_adjust);
        for (int scale_factor3 = scale_factor2 - exp_adjust; scale_factor3 != 0; scale_factor3 -= scale_increment) {
            d2 *= exp_delta;
        }
        return d2;
    }

    public static float scalb(float f, int scale_factor) {
        double d = f;
        double dPowerOfTwoD = powerOfTwoD(Math.max(Math.min(scale_factor, 278), -278));
        Double.isNaN(d);
        return (float) (d * dPowerOfTwoD);
    }

    public static double nextAfter(double start, double direction) {
        long transducer;
        if (isNaN(start) || isNaN(direction)) {
            return start + direction;
        }
        if (start == direction) {
            return direction;
        }
        long transducer2 = Double.doubleToRawLongBits(0.0d + start);
        if (direction > start) {
            transducer = transducer2 + (transducer2 < 0 ? -1L : 1L);
        } else if (transducer2 > 0) {
            transducer = transducer2 - 1;
        } else if (transducer2 < 0) {
            transducer = transducer2 + 1;
        } else {
            transducer = -9223372036854775807L;
        }
        return Double.longBitsToDouble(transducer);
    }

    public static float nextAfter(float start, double direction) {
        int transducer;
        if (isNaN(start) || isNaN(direction)) {
            return ((float) direction) + start;
        }
        if (start == direction) {
            return (float) direction;
        }
        int transducer2 = Float.floatToRawIntBits(0.0f + start);
        if (direction > start) {
            transducer = transducer2 + (transducer2 < 0 ? -1 : 1);
        } else if (transducer2 > 0) {
            transducer = transducer2 - 1;
        } else if (transducer2 < 0) {
            transducer = transducer2 + 1;
        } else {
            transducer = -2147483647;
        }
        return Float.intBitsToFloat(transducer);
    }

    public static double nextUp(double d) {
        if (isNaN(d) || d == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d2 = d + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d2) + (d2 >= 0.0d ? 1L : -1L));
    }

    public static float nextUp(float f) {
        if (isNaN(f) || f == Float.POSITIVE_INFINITY) {
            return f;
        }
        float f2 = f + 0.0f;
        return Float.intBitsToFloat(Float.floatToRawIntBits(f2) + (f2 >= 0.0f ? 1 : -1));
    }

    public static double nextDown(double d) {
        if (isNaN(d) || d == Double.NEGATIVE_INFINITY) {
            return d;
        }
        if (d == 0.0d) {
            return -4.9E-324d;
        }
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d) + (d > 0.0d ? -1L : 1L));
    }

    public static double nextDown(float f) {
        if (isNaN(f) || f == Float.NEGATIVE_INFINITY) {
            return f;
        }
        if (f == 0.0f) {
            return -1.401298464324817E-45d;
        }
        return Float.intBitsToFloat(Float.floatToRawIntBits(f) + (f > 0.0f ? -1 : 1));
    }

    public static double copySign(double magnitude, double sign) {
        return rawCopySign(magnitude, isNaN(sign) ? 1.0d : sign);
    }

    public static float copySign(float magnitude, float sign) {
        return rawCopySign(magnitude, isNaN(sign) ? 1.0f : sign);
    }

    public static double m530ulp(double d) {
        int exp = getExponent(d);
        if (exp == -1023) {
            return Double.MIN_VALUE;
        }
        if (exp == 1024) {
            return Math.abs(d);
        }
        int exp2 = exp - 52;
        if (exp2 >= -1022) {
            return powerOfTwoD(exp2);
        }
        return Double.longBitsToDouble(1 << (exp2 + 1074));
    }

    public static float m531ulp(float f) {
        int exp = getExponent(f);
        if (exp == -127) {
            return Float.MIN_VALUE;
        }
        if (exp == 128) {
            return Math.abs(f);
        }
        int exp2 = exp - 23;
        if (exp2 >= -126) {
            return powerOfTwoF(exp2);
        }
        return Float.intBitsToFloat(1 << (exp2 + ByteCodes.fcmpl));
    }

    public static double signum(double d) {
        return (d == 0.0d || isNaN(d)) ? d : copySign(1.0d, d);
    }

    public static float signum(float f) {
        return (f == 0.0f || isNaN(f)) ? f : copySign(1.0f, f);
    }
}
