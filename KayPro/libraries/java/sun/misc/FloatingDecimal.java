package sun.misc;

import com.sun.tools.javac.jvm.ByteCodes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FloatingDecimal {
    static final boolean $assertionsDisabled = false;

    private static FloatingDecimal2[] f590b5p = null;
    static final int bigDecimalExponent = 324;
    static final int expBias = 1023;
    static final long expMask = 9218868437227405312L;
    static final long expOne = 4607182418800017408L;
    static final int expShift = 52;
    static final long fractHOB = 4503599627370496L;
    static final long fractMask = 4503599627370495L;
    static final long highbit = Long.MIN_VALUE;
    static final long highbyte = -72057594037927936L;
    static final int intDecimalDigits = 9;
    static final long lowbytes = 72057594037927935L;
    static final int maxDecimalDigits = 15;
    static final int maxDecimalExponent = 308;
    static final int maxSmallBinExp = 62;
    private static final int maxSmallTen;
    static final int minDecimalExponent = -324;
    static final int minSmallBinExp = -21;
    static final long signMask = Long.MIN_VALUE;
    static final int singleExpBias = 127;
    static final int singleExpMask = 2139095040;
    static final int singleExpShift = 23;
    static final int singleFractHOB = 8388608;
    static final int singleFractMask = 8388607;
    static final int singleMaxDecimalDigits = 7;
    static final int singleMaxDecimalExponent = 38;
    private static final int singleMaxSmallTen;
    static final int singleMinDecimalExponent = -45;
    static final int singleSignMask = Integer.MIN_VALUE;
    private static final float[] singleSmall10pow;
    private static final double[] small10pow;
    int bigIntExp;
    int bigIntNBits;
    int decExponent;
    char[] digits;
    boolean isExceptional;
    boolean isNegative;
    int nDigits;
    private static ThreadLocal perThreadBuffer = new ThreadLocal() {
        @Override
        protected synchronized Object initialValue() {
            return new char[26];
        }
    };
    private static final double[] big10pow = {1.0E16d, 1.0E32d, 1.0E64d, 1.0E128d, 1.0E256d};
    private static final double[] tiny10pow = {1.0E-16d, 1.0E-32d, 1.0E-64d, 1.0E-128d, 1.0E-256d};
    private static final int[] small5pow = {1, 5, 25, ByteCodes.lushr, 625, 3125, 15625, 78125, 390625, 1953125, 9765625, 48828125, 244140625, 1220703125};
    private static final long[] long5pow = {1, 5, 25, 125, 625, 3125, 15625, 78125, 390625, 1953125, 9765625, 48828125, 244140625, 1220703125, 6103515625L, 30517578125L, 152587890625L, 762939453125L, 3814697265625L, 19073486328125L, 95367431640625L, 476837158203125L, 2384185791015625L, 11920928955078125L, 59604644775390625L, 298023223876953125L, 1490116119384765625L};
    private static final int[] n5bits = {0, 3, 5, 7, 10, 12, 14, 17, 19, 21, 24, 26, 28, 31, 33, 35, 38, 40, 42, 45, 47, 49, 52, 54, 56, 59, 61};
    private static final char[] infinity = {'I', 'n', 'f', 'i', 'n', 'i', 't', 'y'};
    private static final char[] notANumber = {'N', 'a', 'N'};
    private static final char[] zero = {'0', '0', '0', '0', '0', '0', '0', '0'};
    private static Pattern hexFloatPattern = Pattern.compile("([-+])?0[xX](((\\p{XDigit}+)\\.?)|((\\p{XDigit}*)\\.(\\p{XDigit}+)))[pP]([-+])?(\\p{Digit}+)[fFdD]?");
    boolean mustSetRoundDir = $assertionsDisabled;
    boolean fromHex = $assertionsDisabled;
    int roundDir = 0;

    static {
        double[] dArr = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
        small10pow = dArr;
        float[] fArr = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        singleSmall10pow = fArr;
        maxSmallTen = dArr.length - 1;
        singleMaxSmallTen = fArr.length - 1;
    }

    private FloatingDecimal(boolean negSign, int decExponent, char[] digits, int n, boolean e) {
        this.isNegative = negSign;
        this.isExceptional = e;
        this.decExponent = decExponent;
        this.digits = digits;
        this.nDigits = n;
    }

    private static int countBits(long v) {
        if (v == 0) {
            return 0;
        }
        while ((highbyte & v) == 0) {
            v <<= 8;
        }
        while (v > 0) {
            v <<= 1;
        }
        int n = 0;
        while ((lowbytes & v) != 0) {
            v <<= 8;
            n += 8;
        }
        while (v != 0) {
            v <<= 1;
            n++;
        }
        return n;
    }

    private static synchronized FloatingDecimal2 big5pow(int p) {
        if (f590b5p == null) {
            f590b5p = new FloatingDecimal2[p + 1];
        } else if (f590b5p.length <= p) {
            FloatingDecimal2[] t = new FloatingDecimal2[p + 1];
            System.arraycopy(f590b5p, 0, t, 0, f590b5p.length);
            f590b5p = t;
        }
        if (f590b5p[p] != null) {
            return f590b5p[p];
        }
        if (p < small5pow.length) {
            FloatingDecimal2[] floatingDecimal2Arr = f590b5p;
            FloatingDecimal2 floatingDecimal2 = new FloatingDecimal2(small5pow[p]);
            floatingDecimal2Arr[p] = floatingDecimal2;
            return floatingDecimal2;
        }
        if (p < long5pow.length) {
            FloatingDecimal2[] floatingDecimal2Arr2 = f590b5p;
            FloatingDecimal2 floatingDecimal3 = new FloatingDecimal2(long5pow[p]);
            floatingDecimal2Arr2[p] = floatingDecimal3;
            return floatingDecimal3;
        }
        int q = p >> 1;
        int r = p - q;
        FloatingDecimal2 bigq = f590b5p[q];
        if (bigq == null) {
            bigq = big5pow(q);
        }
        if (r < small5pow.length) {
            FloatingDecimal2[] floatingDecimal2Arr3 = f590b5p;
            FloatingDecimal2 floatingDecimal2Mult = bigq.mult(small5pow[r]);
            floatingDecimal2Arr3[p] = floatingDecimal2Mult;
            return floatingDecimal2Mult;
        }
        FloatingDecimal2 bigr = f590b5p[r];
        if (bigr == null) {
            bigr = big5pow(r);
        }
        FloatingDecimal2[] floatingDecimal2Arr4 = f590b5p;
        FloatingDecimal2 floatingDecimal2Mult2 = bigq.mult(bigr);
        floatingDecimal2Arr4[p] = floatingDecimal2Mult2;
        return floatingDecimal2Mult2;
    }

    private static FloatingDecimal2 multPow52(FloatingDecimal2 v, int p5, int p2) {
        if (p5 != 0) {
            int[] iArr = small5pow;
            if (p5 < iArr.length) {
                v = v.mult(iArr[p5]);
            } else {
                v = v.mult(big5pow(p5));
            }
        }
        if (p2 != 0) {
            v.lshiftMe(p2);
        }
        return v;
    }

    private static FloatingDecimal2 constructPow52(int p5, int p2) {
        FloatingDecimal2 v = new FloatingDecimal2(big5pow(p5));
        if (p2 != 0) {
            v.lshiftMe(p2);
        }
        return v;
    }

    private FloatingDecimal2 doubleToBigInt(double dval) {
        long lbits = Double.doubleToLongBits(dval) & Long.MAX_VALUE;
        int binexp = (int) (lbits >>> 52);
        long lbits2 = lbits & 4503599627370495L;
        if (binexp > 0) {
            lbits2 |= fractHOB;
        } else {
            binexp++;
            while ((lbits2 & fractHOB) == 0) {
                lbits2 <<= 1;
                binexp--;
            }
        }
        int nbits = countBits(lbits2);
        int lowOrderZeros = 53 - nbits;
        this.bigIntExp = ((binexp - 1023) + 1) - nbits;
        this.bigIntNBits = nbits;
        return new FloatingDecimal2(lbits2 >>> lowOrderZeros);
    }

    private static double m528ulp(double dval, boolean subtracting) {
        double ulpval;
        long lbits = Double.doubleToLongBits(dval) & Long.MAX_VALUE;
        int binexp = (int) (lbits >>> 52);
        if (subtracting && binexp >= 52 && (4503599627370495L & lbits) == 0) {
            binexp--;
        }
        if (binexp > 52) {
            ulpval = Double.longBitsToDouble(((long) (binexp - 52)) << 52);
        } else if (binexp == 0) {
            ulpval = Double.MIN_VALUE;
        } else {
            ulpval = Double.longBitsToDouble(1 << (binexp - 1));
        }
        return subtracting ? -ulpval : ulpval;
    }

    float stickyRound(double dval) {
        long lbits = Double.doubleToLongBits(dval);
        long binexp = lbits & 9218868437227405312L;
        if (binexp == 0 || binexp == 9218868437227405312L) {
            return (float) dval;
        }
        return (float) Double.longBitsToDouble(lbits + ((long) this.roundDir));
    }

    private void developLongDigits(int decExponent, long lvalue, long insignificant) {
        int ndigits;
        char[] digits;
        int digitno;
        int i = 0;
        while (insignificant >= 10) {
            insignificant /= 10;
            i++;
        }
        if (i != 0) {
            long pow10 = long5pow[i] << i;
            long residue = lvalue % pow10;
            lvalue /= pow10;
            decExponent += i;
            if (residue >= (pow10 >> 1)) {
                lvalue++;
            }
        }
        if (lvalue <= 2147483647L) {
            int ivalue = (int) lvalue;
            ndigits = 10;
            digits = (char[]) perThreadBuffer.get();
            digitno = 10 - 1;
            int c = ivalue % 10;
            int ivalue2 = ivalue / 10;
            while (c == 0) {
                decExponent++;
                c = ivalue2 % 10;
                ivalue2 /= 10;
            }
            while (ivalue2 != 0) {
                digits[digitno] = (char) (c + 48);
                decExponent++;
                c = ivalue2 % 10;
                ivalue2 /= 10;
                digitno--;
            }
            int digitno2 = c + 48;
            digits[digitno] = (char) digitno2;
        } else {
            char[] digits2 = (char[]) perThreadBuffer.get();
            int digitno3 = 20 - 1;
            int c2 = (int) (lvalue % 10);
            long lvalue2 = lvalue / 10;
            while (c2 == 0) {
                decExponent++;
                c2 = (int) (lvalue2 % 10);
                lvalue2 /= 10;
            }
            while (lvalue2 != 0) {
                digits2[digitno3] = (char) (c2 + 48);
                decExponent++;
                c2 = (int) (lvalue2 % 10);
                lvalue2 /= 10;
                digitno3--;
            }
            digits2[digitno3] = (char) (c2 + 48);
            ndigits = 20;
            digits = digits2;
            digitno = digitno3;
        }
        int ndigits2 = ndigits - digitno;
        char[] result = new char[ndigits2];
        System.arraycopy(digits, digitno, result, 0, ndigits2);
        this.digits = result;
        this.decExponent = decExponent + 1;
        this.nDigits = ndigits2;
    }

    private void roundup() {
        char[] cArr = this.digits;
        int i = this.nDigits - 1;
        int i2 = i;
        char c = cArr[i];
        if (c == '9') {
            while (c == '9' && i2 > 0) {
                char[] cArr2 = this.digits;
                cArr2[i2] = '0';
                i2--;
                c = cArr2[i2];
            }
            if (c == '9') {
                this.decExponent++;
                this.digits[0] = '1';
                return;
            }
        }
        this.digits[i2] = (char) (c + 1);
    }

    public FloatingDecimal(double d) {
        int nSignificantBits;
        long dBits = Double.doubleToLongBits(d);
        if ((dBits & Long.MIN_VALUE) != 0) {
            this.isNegative = true;
            dBits ^= Long.MIN_VALUE;
        } else {
            this.isNegative = $assertionsDisabled;
        }
        int binExp = (int) ((9218868437227405312L & dBits) >> 52);
        long fractBits = 4503599627370495L & dBits;
        if (binExp == 2047) {
            this.isExceptional = true;
            if (fractBits == 0) {
                this.digits = infinity;
            } else {
                this.digits = notANumber;
                this.isNegative = $assertionsDisabled;
            }
            this.nDigits = this.digits.length;
            return;
        }
        this.isExceptional = $assertionsDisabled;
        if (binExp != 0) {
            fractBits |= fractHOB;
            nSignificantBits = 53;
        } else if (fractBits == 0) {
            this.decExponent = 0;
            this.digits = zero;
            this.nDigits = 1;
            return;
        } else {
            while ((fractBits & fractHOB) == 0) {
                fractBits <<= 1;
                binExp--;
            }
            nSignificantBits = binExp + 52 + 1;
            binExp++;
        }
        dtoa(binExp - 1023, fractBits, nSignificantBits);
    }

    public FloatingDecimal(float f) {
        int nSignificantBits;
        int fBits = Float.floatToIntBits(f);
        if ((fBits & Integer.MIN_VALUE) != 0) {
            this.isNegative = true;
            fBits ^= Integer.MIN_VALUE;
        } else {
            this.isNegative = $assertionsDisabled;
        }
        int binExp = (2139095040 & fBits) >> 23;
        int fractBits = 8388607 & fBits;
        if (binExp == 255) {
            this.isExceptional = true;
            if (fractBits == 0) {
                this.digits = infinity;
            } else {
                this.digits = notANumber;
                this.isNegative = $assertionsDisabled;
            }
            this.nDigits = this.digits.length;
            return;
        }
        this.isExceptional = $assertionsDisabled;
        if (binExp == 0) {
            if (fractBits == 0) {
                this.decExponent = 0;
                this.digits = zero;
                this.nDigits = 1;
                return;
            } else {
                while ((fractBits & 8388608) == 0) {
                    fractBits <<= 1;
                    binExp--;
                }
                nSignificantBits = binExp + 23 + 1;
                binExp++;
            }
        } else {
            fractBits |= 8388608;
            nSignificantBits = 24;
        }
        dtoa(binExp - 127, ((long) fractBits) << 29, nSignificantBits);
    }

    private void dtoa(int binExp, long fractBits, int nSignificantBits) {
        int M2;
        boolean high;
        boolean low;
        int decExp;
        long lowDigitDifference;
        int M3;
        boolean low2;
        boolean z;
        boolean low3;
        boolean z2;
        long halfULP;
        long fractBits2;
        int nFractBits = countBits(fractBits);
        int nTinyBits = Math.max(0, (nFractBits - binExp) - 1);
        if (binExp <= 62 && binExp >= minSmallBinExp && nTinyBits < long5pow.length && n5bits[nTinyBits] + nFractBits < 64 && nTinyBits == 0) {
            if (binExp > nSignificantBits) {
                halfULP = 1 << ((binExp - nSignificantBits) - 1);
            } else {
                halfULP = 0;
            }
            if (binExp >= 52) {
                fractBits2 = fractBits << (binExp - 52);
            } else {
                fractBits2 = fractBits >>> (52 - binExp);
            }
            developLongDigits(0, fractBits2, halfULP);
            return;
        }
        double d2 = Double.longBitsToDouble(expOne | (fractBits & (-4503599627370497L)));
        double d = binExp;
        Double.isNaN(d);
        int decExp2 = (int) Math.floor(((d2 - 1.5d) * 0.289529654d) + 0.176091259d + (d * 0.301029995663981d));
        int B5 = Math.max(0, -decExp2);
        int B2 = B5 + nTinyBits + binExp;
        int S5 = Math.max(0, decExp2);
        int S2 = S5 + nTinyBits;
        int M4 = B2 - nSignificantBits;
        long fractBits3 = fractBits >>> (53 - nFractBits);
        int B3 = B2 - (nFractBits - 1);
        int common2factor = Math.min(B3, S2);
        int B4 = B3 - common2factor;
        int S3 = S2 - common2factor;
        int M5 = M4 - common2factor;
        if (nFractBits == 1) {
            M5--;
        }
        if (M5 >= 0) {
            M2 = M5;
        } else {
            B4 -= M5;
            S3 -= M5;
            M2 = 0;
        }
        char[] digits = new char[18];
        this.digits = digits;
        int i = nFractBits + B4;
        int[] iArr = n5bits;
        int Bbits = i + (B5 < iArr.length ? iArr[B5] : B5 * 3);
        int i2 = S3 + 1;
        int i3 = S5 + 1;
        int[] iArr2 = n5bits;
        int tenSbits = i2 + (i3 < iArr2.length ? iArr2[S5 + 1] : (S5 + 1) * 3);
        if (Bbits < 64 && tenSbits < 64) {
            if (Bbits < 32 && tenSbits < 32) {
                int[] iArr3 = small5pow;
                int b = (((int) fractBits3) * iArr3[B5]) << B4;
                int s = iArr3[S5] << S3;
                int m = iArr3[B5] << M2;
                int tens = s * 10;
                int ndigit = 0;
                int q = b / s;
                int b2 = (b % s) * 10;
                int m2 = m * 10;
                boolean low4 = b2 < m2 ? true : $assertionsDisabled;
                boolean high2 = b2 + m2 > tens ? true : $assertionsDisabled;
                if (q == 0 && !high2) {
                    decExp2--;
                } else {
                    int ndigit2 = 0 + 1;
                    int m3 = q + 48;
                    digits[0] = (char) m3;
                    ndigit = ndigit2;
                }
                if (decExp2 < -3 || decExp2 >= 8) {
                    low4 = false;
                    high2 = false;
                }
                while (!low4 && !high2) {
                    q = b2 / s;
                    b2 = (b2 % s) * 10;
                    m2 *= 10;
                    int decExp3 = decExp2;
                    if (m2 > 0) {
                        low3 = b2 < m2 ? true : $assertionsDisabled;
                        z2 = b2 + m2 > tens ? true : $assertionsDisabled;
                    } else {
                        low3 = true;
                        z2 = true;
                    }
                    low4 = low3;
                    high2 = z2;
                    digits[ndigit] = (char) (q + 48);
                    ndigit++;
                    decExp2 = decExp3;
                }
                decExp = decExp2;
                lowDigitDifference = (b2 << 1) - tens;
                low = low4;
                high = high2;
                M3 = ndigit;
            } else {
                long[] jArr = long5pow;
                long b3 = (jArr[B5] * fractBits3) << B4;
                long s2 = jArr[S5] << S3;
                long m4 = jArr[B5] << M2;
                long tens2 = s2 * 10;
                int ndigit3 = 0;
                int q2 = (int) (b3 / s2);
                long b4 = (b3 % s2) * 10;
                long m5 = m4 * 10;
                boolean low5 = b4 < m5 ? true : $assertionsDisabled;
                boolean high3 = b4 + m5 > tens2 ? true : $assertionsDisabled;
                if (q2 == 0 && !high3) {
                    decExp2--;
                } else {
                    int ndigit4 = 0 + 1;
                    digits[0] = (char) (q2 + 48);
                    ndigit3 = ndigit4;
                }
                if (decExp2 < -3 || decExp2 >= 8) {
                    high3 = false;
                    low5 = false;
                }
                while (!low5 && !high3) {
                    int q3 = (int) (b4 / s2);
                    b4 = (b4 % s2) * 10;
                    m5 *= 10;
                    if (m5 > 0) {
                        low2 = b4 < m5 ? true : $assertionsDisabled;
                        z = b4 + m5 > tens2 ? true : $assertionsDisabled;
                    } else {
                        low2 = true;
                        z = true;
                    }
                    low5 = low2;
                    high3 = z;
                    digits[ndigit3] = (char) (q3 + 48);
                    q2 = q3;
                    ndigit3++;
                }
                long lowDigitDifference2 = (b4 << 1) - tens2;
                decExp = decExp2;
                lowDigitDifference = lowDigitDifference2;
                low = low5;
                high = high3;
                M3 = ndigit3;
            }
        } else {
            FloatingDecimal2 Bval = multPow52(new FloatingDecimal2(fractBits3), B5, B4);
            FloatingDecimal2 Sval = constructPow52(S5, S3);
            FloatingDecimal2 Mval = constructPow52(B5, M2);
            int shiftBias = Sval.normalizeMe();
            Bval.lshiftMe(shiftBias);
            Mval.lshiftMe(shiftBias);
            FloatingDecimal2 tenSval = Sval.mult(10);
            int ndigit5 = 0;
            int q4 = Bval.quoRemIteration(Sval);
            FloatingDecimal2 Mval2 = Mval.mult(10);
            boolean low6 = Bval.m526cmp(Mval2) < 0 ? true : $assertionsDisabled;
            high = Bval.m525add(Mval2).m526cmp(tenSval) > 0 ? true : $assertionsDisabled;
            if (q4 == 0 && !high) {
                decExp2--;
            } else {
                int ndigit6 = 0 + 1;
                digits[0] = (char) (q4 + 48);
                ndigit5 = ndigit6;
            }
            if (decExp2 < -3 || decExp2 >= 8) {
                low = false;
                high = false;
            } else {
                low = low6;
            }
            while (!low && !high) {
                int q5 = Bval.quoRemIteration(Sval);
                Mval2 = Mval2.mult(10);
                low = Bval.m526cmp(Mval2) < 0 ? true : $assertionsDisabled;
                high = Bval.m525add(Mval2).m526cmp(tenSval) > 0 ? true : $assertionsDisabled;
                digits[ndigit5] = (char) (q5 + 48);
                ndigit5++;
            }
            if (high && low) {
                Bval.lshiftMe(1);
                decExp = decExp2;
                lowDigitDifference = Bval.m526cmp(tenSval);
                M3 = ndigit5;
            } else {
                decExp = decExp2;
                lowDigitDifference = 0;
                M3 = ndigit5;
            }
        }
        this.decExponent = decExp + 1;
        this.digits = digits;
        this.nDigits = M3;
        if (high) {
            if (!low) {
                roundup();
                return;
            }
            if (lowDigitDifference == 0) {
                if ((digits[M3 - 1] & 1) != 0) {
                    roundup();
                }
            } else if (lowDigitDifference > 0) {
                roundup();
            }
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer(this.nDigits + 8);
        if (this.isNegative) {
            result.append('-');
        }
        if (this.isExceptional) {
            result.append(this.digits, 0, this.nDigits);
        } else {
            result.append("0.");
            result.append(this.digits, 0, this.nDigits);
            result.append('e');
            result.append(this.decExponent);
        }
        return new String(result);
    }

    public String toJavaFormatString() {
        char[] result = (char[]) perThreadBuffer.get();
        int i = getChars(result);
        return new String(result, 0, i);
    }

    private int getChars(char[] result) {
        int i;
        int e;
        int i2 = 0;
        if (this.isNegative) {
            result[0] = '-';
            i2 = 1;
        }
        if (this.isExceptional) {
            System.arraycopy(this.digits, 0, result, i2, this.nDigits);
            return i2 + this.nDigits;
        }
        int i3 = this.decExponent;
        if (i3 > 0 && i3 < 8) {
            int charLength = Math.min(this.nDigits, i3);
            System.arraycopy(this.digits, 0, result, i2, charLength);
            int i4 = i2 + charLength;
            int i5 = this.decExponent;
            if (charLength < i5) {
                int charLength2 = i5 - charLength;
                System.arraycopy(zero, 0, result, i4, charLength2);
                int i6 = i4 + charLength2;
                int i7 = i6 + 1;
                result[i6] = '.';
                int i8 = i7 + 1;
                result[i7] = '0';
                return i8;
            }
            int charLength3 = i4 + 1;
            result[i4] = '.';
            int i9 = this.nDigits;
            if (charLength < i9) {
                int t = i9 - charLength;
                System.arraycopy(this.digits, charLength, result, charLength3, t);
                int i10 = charLength3 + t;
                return i10;
            }
            int i11 = charLength3 + 1;
            result[charLength3] = '0';
            return i11;
        }
        int i12 = this.decExponent;
        if (i12 <= 0 && i12 > -3) {
            int i13 = i2 + 1;
            result[i2] = '0';
            int i14 = i13 + 1;
            result[i13] = '.';
            if (i12 != 0) {
                System.arraycopy(zero, 0, result, i14, -i12);
                i14 -= this.decExponent;
            }
            System.arraycopy(this.digits, 0, result, i14, this.nDigits);
            return i14 + this.nDigits;
        }
        int i15 = i2 + 1;
        char[] cArr = this.digits;
        result[i2] = cArr[0];
        int i16 = i15 + 1;
        result[i15] = '.';
        int i17 = this.nDigits;
        if (i17 > 1) {
            System.arraycopy(cArr, 1, result, i16, i17 - 1);
            i = i16 + (this.nDigits - 1);
        } else {
            result[i16] = '0';
            i = i16 + 1;
        }
        int i18 = i + 1;
        result[i] = 'E';
        int e2 = this.decExponent;
        if (e2 <= 0) {
            result[i18] = '-';
            e = (-e2) + 1;
            i18++;
        } else {
            e = e2 - 1;
        }
        if (e <= 9) {
            int i19 = i18 + 1;
            result[i18] = (char) (e + 48);
            return i19;
        }
        if (e <= 99) {
            int i20 = i18 + 1;
            result[i18] = (char) ((e / 10) + 48);
            int i21 = i20 + 1;
            result[i20] = (char) ((e % 10) + 48);
            return i21;
        }
        int i22 = i18 + 1;
        result[i18] = (char) ((e / 100) + 48);
        int e3 = e % 100;
        int i23 = i22 + 1;
        result[i22] = (char) ((e3 / 10) + 48);
        int i24 = i23 + 1;
        result[i23] = (char) ((e3 % 10) + 48);
        return i24;
    }

    public void appendTo(Appendable buf) {
        char[] result = (char[]) perThreadBuffer.get();
        int i = getChars(result);
        if (buf instanceof StringBuilder) {
            ((StringBuilder) buf).append(result, 0, i);
        } else if (buf instanceof StringBuffer) {
            ((StringBuffer) buf).append(result, 0, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:146:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0092 A[Catch: StringIndexOutOfBoundsException -> 0x017b, TryCatch #0 {StringIndexOutOfBoundsException -> 0x017b, blocks: (B:5:0x0007, B:7:0x000d, B:13:0x0020, B:20:0x0032, B:22:0x0036, B:26:0x0044, B:28:0x0049, B:30:0x0059, B:31:0x005e, B:34:0x0064, B:35:0x006c, B:44:0x0085, B:37:0x0074, B:38:0x0077, B:42:0x007f, B:45:0x0088, B:46:0x008f, B:48:0x0092, B:54:0x00a1, B:57:0x00a8, B:61:0x00b5, B:72:0x00d2, B:73:0x00d9, B:74:0x00dc, B:75:0x00e0, B:76:0x00e8, B:80:0x00f1, B:87:0x0101, B:89:0x0105, B:91:0x010d, B:93:0x0115, B:95:0x011d, B:99:0x0127, B:81:0x00f6, B:67:0x00c9, B:55:0x00a4, B:103:0x013c, B:107:0x0145, B:109:0x0148, B:111:0x0150, B:113:0x0156, B:117:0x015d, B:118:0x0165, B:122:0x016e, B:104:0x0140, B:12:0x001d, B:125:0x0173, B:126:0x017a), top: B:134:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1 A[Catch: StringIndexOutOfBoundsException -> 0x017b, TryCatch #0 {StringIndexOutOfBoundsException -> 0x017b, blocks: (B:5:0x0007, B:7:0x000d, B:13:0x0020, B:20:0x0032, B:22:0x0036, B:26:0x0044, B:28:0x0049, B:30:0x0059, B:31:0x005e, B:34:0x0064, B:35:0x006c, B:44:0x0085, B:37:0x0074, B:38:0x0077, B:42:0x007f, B:45:0x0088, B:46:0x008f, B:48:0x0092, B:54:0x00a1, B:57:0x00a8, B:61:0x00b5, B:72:0x00d2, B:73:0x00d9, B:74:0x00dc, B:75:0x00e0, B:76:0x00e8, B:80:0x00f1, B:87:0x0101, B:89:0x0105, B:91:0x010d, B:93:0x0115, B:95:0x011d, B:99:0x0127, B:81:0x00f6, B:67:0x00c9, B:55:0x00a4, B:103:0x013c, B:107:0x0145, B:109:0x0148, B:111:0x0150, B:113:0x0156, B:117:0x015d, B:118:0x0165, B:122:0x016e, B:104:0x0140, B:12:0x001d, B:125:0x0173, B:126:0x017a), top: B:134:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4 A[Catch: StringIndexOutOfBoundsException -> 0x017b, TryCatch #0 {StringIndexOutOfBoundsException -> 0x017b, blocks: (B:5:0x0007, B:7:0x000d, B:13:0x0020, B:20:0x0032, B:22:0x0036, B:26:0x0044, B:28:0x0049, B:30:0x0059, B:31:0x005e, B:34:0x0064, B:35:0x006c, B:44:0x0085, B:37:0x0074, B:38:0x0077, B:42:0x007f, B:45:0x0088, B:46:0x008f, B:48:0x0092, B:54:0x00a1, B:57:0x00a8, B:61:0x00b5, B:72:0x00d2, B:73:0x00d9, B:74:0x00dc, B:75:0x00e0, B:76:0x00e8, B:80:0x00f1, B:87:0x0101, B:89:0x0105, B:91:0x010d, B:93:0x0115, B:95:0x011d, B:99:0x0127, B:81:0x00f6, B:67:0x00c9, B:55:0x00a4, B:103:0x013c, B:107:0x0145, B:109:0x0148, B:111:0x0150, B:113:0x0156, B:117:0x015d, B:118:0x0165, B:122:0x016e, B:104:0x0140, B:12:0x001d, B:125:0x0173, B:126:0x017a), top: B:134:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8 A[Catch: StringIndexOutOfBoundsException -> 0x017b, TryCatch #0 {StringIndexOutOfBoundsException -> 0x017b, blocks: (B:5:0x0007, B:7:0x000d, B:13:0x0020, B:20:0x0032, B:22:0x0036, B:26:0x0044, B:28:0x0049, B:30:0x0059, B:31:0x005e, B:34:0x0064, B:35:0x006c, B:44:0x0085, B:37:0x0074, B:38:0x0077, B:42:0x007f, B:45:0x0088, B:46:0x008f, B:48:0x0092, B:54:0x00a1, B:57:0x00a8, B:61:0x00b5, B:72:0x00d2, B:73:0x00d9, B:74:0x00dc, B:75:0x00e0, B:76:0x00e8, B:80:0x00f1, B:87:0x0101, B:89:0x0105, B:91:0x010d, B:93:0x0115, B:95:0x011d, B:99:0x0127, B:81:0x00f6, B:67:0x00c9, B:55:0x00a4, B:103:0x013c, B:107:0x0145, B:109:0x0148, B:111:0x0150, B:113:0x0156, B:117:0x015d, B:118:0x0165, B:122:0x016e, B:104:0x0140, B:12:0x001d, B:125:0x0173, B:126:0x017a), top: B:134:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9 A[Catch: StringIndexOutOfBoundsException -> 0x017b, PHI: r10
      0x00c9: PHI (r10v10 'expSign' int) = (r10v9 'expSign' int), (r10v12 'expSign' int) binds: [B:62:0x00c1, B:66:0x00c8] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {StringIndexOutOfBoundsException -> 0x017b, blocks: (B:5:0x0007, B:7:0x000d, B:13:0x0020, B:20:0x0032, B:22:0x0036, B:26:0x0044, B:28:0x0049, B:30:0x0059, B:31:0x005e, B:34:0x0064, B:35:0x006c, B:44:0x0085, B:37:0x0074, B:38:0x0077, B:42:0x007f, B:45:0x0088, B:46:0x008f, B:48:0x0092, B:54:0x00a1, B:57:0x00a8, B:61:0x00b5, B:72:0x00d2, B:73:0x00d9, B:74:0x00dc, B:75:0x00e0, B:76:0x00e8, B:80:0x00f1, B:87:0x0101, B:89:0x0105, B:91:0x010d, B:93:0x0115, B:95:0x011d, B:99:0x0127, B:81:0x00f6, B:67:0x00c9, B:55:0x00a4, B:103:0x013c, B:107:0x0145, B:109:0x0148, B:111:0x0150, B:113:0x0156, B:117:0x015d, B:118:0x0165, B:122:0x016e, B:104:0x0140, B:12:0x001d, B:125:0x0173, B:126:0x017a), top: B:134:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0 A[Catch: StringIndexOutOfBoundsException -> 0x017b, LOOP:2: B:69:0x00cc->B:75:0x00e0, LOOP_END, TryCatch #0 {StringIndexOutOfBoundsException -> 0x017b, blocks: (B:5:0x0007, B:7:0x000d, B:13:0x0020, B:20:0x0032, B:22:0x0036, B:26:0x0044, B:28:0x0049, B:30:0x0059, B:31:0x005e, B:34:0x0064, B:35:0x006c, B:44:0x0085, B:37:0x0074, B:38:0x0077, B:42:0x007f, B:45:0x0088, B:46:0x008f, B:48:0x0092, B:54:0x00a1, B:57:0x00a8, B:61:0x00b5, B:72:0x00d2, B:73:0x00d9, B:74:0x00dc, B:75:0x00e0, B:76:0x00e8, B:80:0x00f1, B:87:0x0101, B:89:0x0105, B:91:0x010d, B:93:0x0115, B:95:0x011d, B:99:0x0127, B:81:0x00f6, B:67:0x00c9, B:55:0x00a4, B:103:0x013c, B:107:0x0145, B:109:0x0148, B:111:0x0150, B:113:0x0156, B:117:0x015d, B:118:0x0165, B:122:0x016e, B:104:0x0140, B:12:0x001d, B:125:0x0173, B:126:0x017a), top: B:134:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6 A[Catch: StringIndexOutOfBoundsException -> 0x017b, TryCatch #0 {StringIndexOutOfBoundsException -> 0x017b, blocks: (B:5:0x0007, B:7:0x000d, B:13:0x0020, B:20:0x0032, B:22:0x0036, B:26:0x0044, B:28:0x0049, B:30:0x0059, B:31:0x005e, B:34:0x0064, B:35:0x006c, B:44:0x0085, B:37:0x0074, B:38:0x0077, B:42:0x007f, B:45:0x0088, B:46:0x008f, B:48:0x0092, B:54:0x00a1, B:57:0x00a8, B:61:0x00b5, B:72:0x00d2, B:73:0x00d9, B:74:0x00dc, B:75:0x00e0, B:76:0x00e8, B:80:0x00f1, B:87:0x0101, B:89:0x0105, B:91:0x010d, B:93:0x0115, B:95:0x011d, B:99:0x0127, B:81:0x00f6, B:67:0x00c9, B:55:0x00a4, B:103:0x013c, B:107:0x0145, B:109:0x0148, B:111:0x0150, B:113:0x0156, B:117:0x015d, B:118:0x0165, B:122:0x016e, B:104:0x0140, B:12:0x001d, B:125:0x0173, B:126:0x017a), top: B:134:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0101 A[Catch: StringIndexOutOfBoundsException -> 0x017b, TryCatch #0 {StringIndexOutOfBoundsException -> 0x017b, blocks: (B:5:0x0007, B:7:0x000d, B:13:0x0020, B:20:0x0032, B:22:0x0036, B:26:0x0044, B:28:0x0049, B:30:0x0059, B:31:0x005e, B:34:0x0064, B:35:0x006c, B:44:0x0085, B:37:0x0074, B:38:0x0077, B:42:0x007f, B:45:0x0088, B:46:0x008f, B:48:0x0092, B:54:0x00a1, B:57:0x00a8, B:61:0x00b5, B:72:0x00d2, B:73:0x00d9, B:74:0x00dc, B:75:0x00e0, B:76:0x00e8, B:80:0x00f1, B:87:0x0101, B:89:0x0105, B:91:0x010d, B:93:0x0115, B:95:0x011d, B:99:0x0127, B:81:0x00f6, B:67:0x00c9, B:55:0x00a4, B:103:0x013c, B:107:0x0145, B:109:0x0148, B:111:0x0150, B:113:0x0156, B:117:0x015d, B:118:0x0165, B:122:0x016e, B:104:0x0140, B:12:0x001d, B:125:0x0173, B:126:0x017a), top: B:134:0x0007 }] */
    public static FloatingDecimal readJavaFormatString(String in) throws NumberFormatException {
        String in2;
        char[] targetChars;
        double d;
        char[] digits;
        int nDigits;
        int decExp;
        int expAt;
        char c;
        int expSign;
        int expVal;
        boolean expOverflow;
        char cCharAt;
        int expAt2;
        int expLimit;
        int decExp2;
        int i;
        char c2;
        char[] digits2;
        char ch;
        boolean isNegative = $assertionsDisabled;
        boolean signSeen = $assertionsDisabled;
        try {
            in2 = in.trim();
            try {
                int l = in2.length();
                if (l == 0) {
                    throw new NumberFormatException("empty String");
                }
                int i2 = 0;
                char cCharAt2 = in2.charAt(0);
                if (cCharAt2 == '+') {
                    i2 = 0 + 1;
                    signSeen = true;
                } else if (cCharAt2 == '-') {
                    isNegative = true;
                    i2 = 0 + 1;
                    signSeen = true;
                }
                char c3 = in2.charAt(i2);
                if (c3 == 'N' || c3 == 'I') {
                    int decExp3 = 0;
                    if (c3 == 'N') {
                        targetChars = notANumber;
                        decExp3 = 1;
                    } else {
                        targetChars = infinity;
                    }
                    int j = 0;
                    while (i2 < l && j < targetChars.length) {
                        if (in2.charAt(i2) == targetChars[j]) {
                            i2++;
                            j++;
                        }
                    }
                    if (j == targetChars.length && i2 == l) {
                        if (decExp3 != 0) {
                            return new FloatingDecimal(Double.NaN);
                        }
                        if (isNegative) {
                            d = Double.NEGATIVE_INFINITY;
                        } else {
                            d = Double.POSITIVE_INFINITY;
                        }
                        return new FloatingDecimal(d);
                    }
                } else {
                    if (c3 == '0' && l > i2 + 1 && ((ch = in2.charAt(i2 + 1)) == 'x' || ch == 'X')) {
                        return parseHexString(in2);
                    }
                    char[] digits3 = new char[l];
                    int nDigits2 = 0;
                    boolean decSeen = false;
                    int decPt = 0;
                    int nLeadZero = 0;
                    int nTrailZero = 0;
                    while (i2 < l) {
                        char c4 = in2.charAt(i2);
                        switch (c4) {
                            case '.':
                                if (decSeen) {
                                    throw new NumberFormatException("multiple points");
                                }
                                int decPt2 = i2;
                                if (signSeen) {
                                    decPt2--;
                                }
                                decPt = decPt2;
                                decSeen = true;
                                i2++;
                                break;
                                break;
                            case '/':
                            default:
                                if (nDigits2 == 0) {
                                    digits = digits3;
                                    nDigits = nDigits2;
                                } else {
                                    digits2 = zero;
                                    if (nLeadZero != 0) {
                                        nDigits = 1;
                                    }
                                    break;
                                }
                                if (decSeen) {
                                    decExp = decPt - nLeadZero;
                                } else {
                                    decExp = nDigits + nTrailZero;
                                }
                                if (i2 < l) {
                                    digits = digits2;
                                    digits = digits2;
                                    digits = digits2;
                                    expAt = decExp;
                                    if (i2 < l) {
                                        break;
                                    }
                                    return new FloatingDecimal(isNegative, expAt, digits, nDigits, $assertionsDisabled);
                                }
                                digits = digits2;
                                c = in2.charAt(i2);
                                if (c == 'e' && c != 'E') {
                                    digits = digits2;
                                    digits = digits2;
                                    digits = digits2;
                                    expAt = decExp;
                                } else {
                                    digits = digits2;
                                    digits = digits2;
                                    expSign = 1;
                                    expVal = 0;
                                    expOverflow = $assertionsDisabled;
                                    i2++;
                                    cCharAt = in2.charAt(i2);
                                    if (cCharAt == '+') {
                                        i2++;
                                    } else if (cCharAt != '-') {
                                        expSign = -1;
                                        i2++;
                                    }
                                    expAt2 = i2;
                                    while (i2 < l) {
                                        if (expVal >= 214748364) {
                                            expOverflow = true;
                                        }
                                        i = i2 + 1;
                                        c2 = in2.charAt(i2);
                                        switch (c2) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                expVal = (expVal * 10) + (c2 - '0');
                                                i2 = i;
                                                break;
                                            default:
                                                i2 = i - 1;
                                                break;
                                        }
                                        int i3 = nDigits + bigDecimalExponent;
                                        expLimit = i3 + nTrailZero;
                                        if (!expOverflow || expVal > expLimit) {
                                            decExp2 = expSign * expLimit;
                                        } else {
                                            decExp2 = decExp + (expSign * expVal);
                                        }
                                        if (i2 != expAt2) {
                                            expAt = decExp2;
                                        }
                                        break;
                                    }
                                    int i4 = nDigits + bigDecimalExponent;
                                    expLimit = i4 + nTrailZero;
                                    if (!expOverflow) {
                                        decExp2 = expSign * expLimit;
                                    } else {
                                        decExp2 = expSign * expLimit;
                                    }
                                    if (i2 != expAt2) {
                                        expAt = decExp2;
                                    }
                                    break;
                                }
                                if (i2 < l && (i2 != l - 1 || (in2.charAt(i2) != 'f' && in2.charAt(i2) != 'F' && in2.charAt(i2) != 'd' && in2.charAt(i2) != 'D'))) {
                                    break;
                                }
                                return new FloatingDecimal(isNegative, expAt, digits, nDigits, $assertionsDisabled);
                            case '0':
                                if (nDigits2 > 0) {
                                    nTrailZero++;
                                } else {
                                    nLeadZero++;
                                }
                                i2++;
                                break;
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                while (nTrailZero > 0) {
                                    digits3[nDigits2] = '0';
                                    nTrailZero--;
                                    nDigits2++;
                                }
                                digits3[nDigits2] = c4;
                                nDigits2++;
                                i2++;
                                break;
                        }
                    }
                    if (nDigits2 == 0) {
                        digits = digits3;
                        nDigits = nDigits2;
                    } else {
                        digits2 = zero;
                        if (nLeadZero != 0) {
                            nDigits = 1;
                        }
                    }
                    if (decSeen) {
                        decExp = decPt - nLeadZero;
                    } else {
                        decExp = nDigits + nTrailZero;
                    }
                    if (i2 < l) {
                        digits = digits2;
                        digits = digits2;
                        digits = digits2;
                        expAt = decExp;
                        if (i2 < l) {
                        }
                        return new FloatingDecimal(isNegative, expAt, digits, nDigits, $assertionsDisabled);
                    }
                    digits = digits2;
                    c = in2.charAt(i2);
                    if (c == 'e') {
                    }
                    digits = digits2;
                    digits = digits2;
                    expSign = 1;
                    expVal = 0;
                    expOverflow = $assertionsDisabled;
                    i2++;
                    cCharAt = in2.charAt(i2);
                    if (cCharAt == '+') {
                        i2++;
                    } else if (cCharAt != '-') {
                        expSign = -1;
                        i2++;
                    }
                    expAt2 = i2;
                    while (i2 < l) {
                        if (expVal >= 214748364) {
                            expOverflow = true;
                        }
                        i = i2 + 1;
                        c2 = in2.charAt(i2);
                        switch (c2) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                expVal = (expVal * 10) + (c2 - '0');
                                i2 = i;
                                break;
                            default:
                                i2 = i - 1;
                                break;
                        }
                        int i5 = nDigits + bigDecimalExponent;
                        expLimit = i5 + nTrailZero;
                        if (!expOverflow) {
                            decExp2 = expSign * expLimit;
                        } else {
                            decExp2 = expSign * expLimit;
                        }
                        if (i2 != expAt2) {
                            expAt = decExp2;
                            if (i2 < l) {
                            }
                            return new FloatingDecimal(isNegative, expAt, digits, nDigits, $assertionsDisabled);
                        }
                    }
                    int i6 = nDigits + bigDecimalExponent;
                    expLimit = i6 + nTrailZero;
                    if (!expOverflow) {
                        decExp2 = expSign * expLimit;
                    } else {
                        decExp2 = expSign * expLimit;
                    }
                    if (i2 != expAt2) {
                        expAt = decExp2;
                        if (i2 < l) {
                        }
                        return new FloatingDecimal(isNegative, expAt, digits, nDigits, $assertionsDisabled);
                    }
                }
                throw new NumberFormatException("For input string: \"" + in2 + "\"");
            } catch (StringIndexOutOfBoundsException e) {
            }
        } catch (StringIndexOutOfBoundsException e2) {
            in2 = in;
        }
    }

    public double doubleValue() {
        double dValue;
        int exp;
        int B5;
        int D5;
        int D2;
        int B2;
        int hulpbias;
        FloatingDecimal2 bigD0;
        boolean overvalue;
        FloatingDecimal2 diff;
        int kDigits = Math.min(this.nDigits, 16);
        char[] cArr = this.digits;
        if (cArr == infinity || cArr == notANumber) {
            double d = Double.POSITIVE_INFINITY;
            if (this.digits == notANumber) {
                return Double.NaN;
            }
            if (this.isNegative) {
                return Double.NEGATIVE_INFINITY;
            }
            return d;
        }
        int Ulp2 = 0;
        if (this.mustSetRoundDir) {
            this.roundDir = 0;
        }
        int iValue = this.digits[0] - '0';
        int iDigits = Math.min(kDigits, 9);
        for (int i = 1; i < iDigits; i++) {
            iValue = ((iValue * 10) + this.digits[i]) - 48;
        }
        long lValue = iValue;
        long lValue2 = lValue;
        for (int i2 = iDigits; i2 < kDigits; i2++) {
            lValue2 = (10 * lValue2) + ((long) (this.digits[i2] - '0'));
        }
        double dValue2 = lValue2;
        int exp2 = this.decExponent - kDigits;
        if (this.nDigits <= 15) {
            if (exp2 == 0 || dValue2 == 0.0d) {
                if (!this.isNegative) {
                    return dValue2;
                }
                Double.isNaN(dValue2);
                return -dValue2;
            }
            if (exp2 >= 0) {
                int i3 = maxSmallTen;
                if (exp2 <= i3) {
                    double[] dArr = small10pow;
                    double d2 = dArr[exp2];
                    Double.isNaN(dValue2);
                    double rValue = d2 * dValue2;
                    if (this.mustSetRoundDir) {
                        double tValue = rValue / dArr[exp2];
                        if (tValue != dValue2) {
                            Ulp2 = tValue < dValue2 ? 1 : -1;
                        }
                        this.roundDir = Ulp2;
                    }
                    return this.isNegative ? -rValue : rValue;
                }
                int slop = 15 - kDigits;
                if (exp2 <= i3 + slop) {
                    double[] dArr2 = small10pow;
                    double d3 = dArr2[slop];
                    Double.isNaN(dValue2);
                    double dValue3 = dValue2 * d3;
                    double rValue2 = dArr2[exp2 - slop] * dValue3;
                    if (this.mustSetRoundDir) {
                        double tValue2 = rValue2 / dArr2[exp2 - slop];
                        if (tValue2 != dValue3) {
                            Ulp2 = tValue2 < dValue3 ? 1 : -1;
                        }
                        this.roundDir = Ulp2;
                    }
                    return this.isNegative ? -rValue2 : rValue2;
                }
            } else {
                int iValue2 = maxSmallTen;
                if (exp2 >= (-iValue2)) {
                    double[] dArr3 = small10pow;
                    double d4 = dArr3[-exp2];
                    Double.isNaN(dValue2);
                    double rValue3 = dValue2 / d4;
                    double tValue3 = dArr3[-exp2] * rValue3;
                    if (this.mustSetRoundDir) {
                        if (tValue3 != dValue2) {
                            Ulp2 = tValue3 < dValue2 ? 1 : -1;
                        }
                        this.roundDir = Ulp2;
                    }
                    return this.isNegative ? -rValue3 : rValue3;
                }
            }
        }
        if (exp2 > 0) {
            if (this.decExponent > 309) {
                return this.isNegative ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            }
            if ((exp2 & 15) != 0) {
                double d5 = small10pow[exp2 & 15];
                Double.isNaN(dValue2);
                dValue2 *= d5;
            }
            int i4 = exp2 >> 4;
            if (i4 == 0) {
                dValue = dValue2;
            } else {
                int j = 0;
                for (int exp3 = i4; exp3 > 1; exp3 >>= 1) {
                    if ((exp3 & 1) != 0) {
                        dValue2 *= big10pow[j];
                    }
                    j++;
                }
                double t = big10pow[j] * dValue2;
                if (Double.isInfinite(t)) {
                    if (Double.isInfinite((dValue2 / 2.0d) * big10pow[j])) {
                        return this.isNegative ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                    }
                    t = Double.MAX_VALUE;
                }
                dValue = t;
            }
        } else if (exp2 >= 0) {
            dValue = dValue2;
        } else {
            int exp4 = -exp2;
            if (this.decExponent < -325) {
                return this.isNegative ? -0.0d : 0.0d;
            }
            if ((exp4 & 15) != 0) {
                double d6 = small10pow[exp4 & 15];
                Double.isNaN(dValue2);
                dValue2 /= d6;
            }
            int exp5 = exp4 >> 4;
            if (exp5 == 0) {
                dValue = dValue2;
            } else {
                int exp6 = 0;
                while (exp > 1) {
                    if ((exp & 1) != 0) {
                        exp = exp5;
                        dValue2 *= tiny10pow[exp6];
                    } else {
                        exp = exp5;
                    }
                    exp6++;
                    exp >>= 1;
                }
                exp = exp5;
                double[] dArr4 = tiny10pow;
                double t2 = dArr4[exp6] * dValue2;
                if (t2 == 0.0d) {
                    if (2.0d * dValue2 * dArr4[exp6] == 0.0d) {
                        return this.isNegative ? -0.0d : 0.0d;
                    }
                    t2 = Double.MIN_VALUE;
                }
                dValue = t2;
            }
        }
        FloatingDecimal2 bigD1 = new FloatingDecimal2(lValue2, this.digits, kDigits, this.nDigits);
        int exp7 = this.decExponent - this.nDigits;
        double dValue4 = dValue;
        while (true) {
            FloatingDecimal2 bigB = doubleToBigInt(dValue4);
            if (exp7 >= 0) {
                B2 = Ulp2;
                B5 = Ulp2;
                D5 = exp7;
                D2 = exp7;
            } else {
                B5 = -exp7;
                D5 = Ulp2;
                D2 = Ulp2;
                B2 = B5;
            }
            int i5 = this.bigIntExp;
            if (i5 >= 0) {
                B5 += i5;
            } else {
                D2 -= i5;
            }
            int Ulp3 = B5;
            int i6 = this.bigIntExp;
            int kDigits2 = kDigits;
            int kDigits3 = this.bigIntNBits;
            int exp8 = exp7;
            int iDigits2 = iDigits;
            if (i6 + kDigits3 <= -1022) {
                hulpbias = i6 + 1023 + 52;
            } else {
                hulpbias = 54 - kDigits3;
            }
            int B3 = B5 + hulpbias;
            int D3 = D2 + hulpbias;
            int common2 = Math.min(B3, Math.min(D3, Ulp3));
            int Ulp4 = Ulp3 - common2;
            FloatingDecimal2 bigB2 = multPow52(bigB, B2, B3 - common2);
            FloatingDecimal2 bigD = multPow52(new FloatingDecimal2(bigD1), D5, D3 - common2);
            int cmpResult = bigB2.m526cmp(bigD);
            if (cmpResult > 0) {
                overvalue = true;
                diff = bigB2.m527sub(bigD);
                bigD0 = bigD1;
                if (this.bigIntNBits == 1 && this.bigIntExp > -1023 && (Ulp4 = Ulp4 - 1) < 0) {
                    Ulp4 = 0;
                    diff.lshiftMe(1);
                }
            } else {
                bigD0 = bigD1;
                if (cmpResult >= 0) {
                    break;
                }
                overvalue = $assertionsDisabled;
                diff = bigD.m527sub(bigB2);
            }
            FloatingDecimal2 halfUlp = constructPow52(B2, Ulp4);
            int cmpResult2 = diff.m526cmp(halfUlp);
            if (cmpResult2 < 0) {
                if (!this.mustSetRoundDir) {
                    break;
                }
                this.roundDir = overvalue ? -1 : 1;
                break;
            }
            if (cmpResult2 == 0) {
                dValue4 += m528ulp(dValue4, overvalue) * 0.5d;
                if (!this.mustSetRoundDir) {
                    break;
                }
                this.roundDir = overvalue ? -1 : 1;
                break;
            }
            dValue4 += m528ulp(dValue4, overvalue);
            if (dValue4 == 0.0d || dValue4 == Double.POSITIVE_INFINITY) {
                break;
            }
            exp7 = exp8;
            kDigits = kDigits2;
            iDigits = iDigits2;
            bigD1 = bigD0;
            Ulp2 = 0;
        }
        return this.isNegative ? -dValue4 : dValue4;
    }

    public float floatValue() {
        int i;
        int kDigits = Math.min(this.nDigits, 8);
        char[] cArr = this.digits;
        if (cArr == infinity || cArr == notANumber) {
            if (this.digits == notANumber) {
                return Float.NaN;
            }
            return this.isNegative ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
        }
        int iValue = cArr[0] - '0';
        for (int i2 = 1; i2 < kDigits; i2++) {
            iValue = ((iValue * 10) + this.digits[i2]) - 48;
        }
        float fValue = iValue;
        int i3 = this.decExponent;
        int exp = i3 - kDigits;
        int i4 = this.nDigits;
        if (i4 <= 7) {
            if (exp == 0 || fValue == 0.0f) {
                return this.isNegative ? -fValue : fValue;
            }
            if (exp >= 0) {
                int i5 = singleMaxSmallTen;
                if (exp <= i5) {
                    float fValue2 = fValue * singleSmall10pow[exp];
                    return this.isNegative ? -fValue2 : fValue2;
                }
                int slop = 7 - kDigits;
                if (exp <= i5 + slop) {
                    float[] fArr = singleSmall10pow;
                    float fValue3 = fValue * fArr[slop] * fArr[exp - slop];
                    return this.isNegative ? -fValue3 : fValue3;
                }
            } else if (exp >= (-singleMaxSmallTen)) {
                float fValue4 = fValue / singleSmall10pow[-exp];
                return this.isNegative ? -fValue4 : fValue4;
            }
        } else if (i3 >= i4 && i4 + i3 <= 15) {
            long lValue = iValue;
            int i6 = kDigits;
            while (true) {
                i = this.nDigits;
                if (i6 >= i) {
                    break;
                }
                lValue = (10 * lValue) + ((long) (this.digits[i6] - '0'));
                i6++;
            }
            double dValue = lValue;
            double d = small10pow[this.decExponent - i];
            Double.isNaN(dValue);
            float fValue5 = (float) (dValue * d);
            return this.isNegative ? -fValue5 : fValue5;
        }
        int exp2 = this.decExponent;
        if (exp2 > 39) {
            return this.isNegative ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
        }
        if (exp2 < -46) {
            return this.isNegative ? -0.0f : 0.0f;
        }
        this.mustSetRoundDir = !this.fromHex;
        return stickyRound(doubleValue());
    }

    static FloatingDecimal parseHexString(String s) {
        int leftDigits;
        String significandString;
        int exponentAdjust;
        long significand;
        int nextShift;
        long significand2;
        long significand3;
        Matcher m = hexFloatPattern.matcher(s);
        boolean validInput = m.matches();
        if (!validInput) {
            throw new NumberFormatException("For input string: \"" + s + "\"");
        }
        String group1 = m.group(1);
        double sign = (group1 == null || group1.equals("+")) ? 1.0d : -1.0d;
        int rightDigits = 0;
        String group4 = m.group(4);
        if (group4 != null) {
            significandString = stripLeadingZeros(group4);
            leftDigits = significandString.length();
        } else {
            String group6 = stripLeadingZeros(m.group(6));
            leftDigits = group6.length();
            String group7 = m.group(7);
            rightDigits = group7.length();
            StringBuilder sb = new StringBuilder();
            sb.append(group6 == null ? "" : group6);
            sb.append(group7);
            significandString = sb.toString();
        }
        String significandString2 = stripLeadingZeros(significandString);
        int signifLength = significandString2.length();
        if (leftDigits >= 1) {
            exponentAdjust = (leftDigits - 1) * 4;
        } else {
            int exponentAdjust2 = rightDigits - signifLength;
            exponentAdjust = (exponentAdjust2 + 1) * (-4);
        }
        if (signifLength == 0) {
            return new FloatingDecimal(0.0d * sign);
        }
        String group8 = m.group(8);
        boolean positiveExponent = (group8 == null || group8.equals("+")) ? true : $assertionsDisabled;
        try {
            long unsignedRawExponent = Integer.parseInt(m.group(9));
            long rawExponent = (positiveExponent ? 1L : -1L) * unsignedRawExponent;
            long exponent = rawExponent + ((long) exponentAdjust);
            boolean round = $assertionsDisabled;
            boolean sticky = $assertionsDisabled;
            long leadingDigit = getHexDigit(significandString2, 0);
            if (leadingDigit == 1) {
                significand = 0 | (leadingDigit << 52);
                nextShift = 48;
            } else if (leadingDigit <= 3) {
                significand = 0 | (leadingDigit << 51);
                nextShift = 47;
                exponent++;
            } else if (leadingDigit <= 7) {
                significand = 0 | (leadingDigit << 50);
                nextShift = 46;
                exponent += 2;
            } else {
                if (leadingDigit > 15) {
                    throw new AssertionError("Result from digit conversion too large!");
                }
                significand = 0 | (leadingDigit << 49);
                nextShift = 45;
                exponent += 3;
            }
            int nextShift2 = nextShift;
            int i = 1;
            while (i < signifLength && nextShift2 >= 0) {
                significand |= ((long) getHexDigit(significandString2, i)) << nextShift2;
                nextShift2 -= 4;
                i++;
                m = m;
                unsignedRawExponent = unsignedRawExponent;
            }
            if (i < signifLength) {
                long currentDigit = getHexDigit(significandString2, i);
                if (nextShift2 == -4) {
                    boolean round2 = (currentDigit & 8) != 0 ? true : $assertionsDisabled;
                    sticky = (currentDigit & 7) != 0 ? true : $assertionsDisabled;
                    round = round2;
                } else if (nextShift2 == -3) {
                    significand |= (currentDigit & 8) >> 3;
                    boolean round3 = (currentDigit & 4) != 0 ? true : $assertionsDisabled;
                    sticky = (currentDigit & 3) != 0 ? true : $assertionsDisabled;
                    round = round3;
                } else if (nextShift2 == -2) {
                    significand |= (currentDigit & 12) >> 2;
                    boolean round4 = (currentDigit & 2) != 0 ? true : $assertionsDisabled;
                    sticky = (currentDigit & 1) != 0 ? true : $assertionsDisabled;
                    round = round4;
                } else if (nextShift2 == -1) {
                    significand |= (currentDigit & 14) >> 1;
                    boolean round5 = (currentDigit & 1) != 0 ? true : $assertionsDisabled;
                    round = round5;
                } else {
                    throw new AssertionError("Unexpected shift distance remainder.");
                }
                for (int i2 = i + 1; i2 < signifLength && !sticky; i2++) {
                    sticky = (sticky || ((long) getHexDigit(significandString2, i2)) != 0) ? true : $assertionsDisabled;
                }
            }
            if (exponent > 1023) {
                return new FloatingDecimal(Double.POSITIVE_INFINITY * sign);
            }
            if (exponent <= 1023 && exponent >= -1022) {
                significand3 = (((1023 + exponent) << 52) & 9218868437227405312L) | (significand & 4503599627370495L);
                significand2 = 0;
            } else {
                if (exponent < -1075) {
                    return new FloatingDecimal(sign * 0.0d);
                }
                boolean sticky2 = (sticky || round) ? true : $assertionsDisabled;
                int bitsDiscarded = 53 - ((((int) exponent) + 1074) + 1);
                round = (significand & (1 << (bitsDiscarded + (-1)))) != 0 ? true : $assertionsDisabled;
                if (bitsDiscarded > 1) {
                    long mask = ((-1) << (bitsDiscarded - 1)) ^ (-1);
                    sticky = (sticky2 || (significand & mask) != 0) ? true : $assertionsDisabled;
                } else {
                    sticky = sticky2;
                }
                long j = (significand >> bitsDiscarded) & 4503599627370495L;
                significand2 = 0;
                long significand4 = j | 0;
                significand3 = significand4;
            }
            boolean incremented = $assertionsDisabled;
            boolean leastZero = (significand3 & 1) == significand2 ? true : $assertionsDisabled;
            if ((leastZero && round && sticky) || (!leastZero && round)) {
                incremented = true;
                significand3++;
            }
            FloatingDecimal fd = new FloatingDecimal(FpUtils.rawCopySign(Double.longBitsToDouble(significand3), sign));
            if (exponent >= -150 && exponent <= 127 && (268435455 & significand3) == 0 && (round || sticky)) {
                if (leastZero) {
                    if (round ^ sticky) {
                        fd.roundDir = 1;
                    }
                } else if (round) {
                    fd.roundDir = -1;
                }
            }
            fd.fromHex = true;
            return fd;
        } catch (NumberFormatException e) {
            return new FloatingDecimal((positiveExponent ? Double.POSITIVE_INFINITY : 0.0d) * sign);
        }
    }

    static String stripLeadingZeros(String s) {
        return s.replaceFirst("^0+", "");
    }

    static int getHexDigit(String s, int position) {
        int value = Character.digit(s.charAt(position), 16);
        if (value <= -1 || value >= 16) {
            throw new AssertionError("Unexpected failure of digit conversion of " + s.charAt(position));
        }
        return value;
    }
}
