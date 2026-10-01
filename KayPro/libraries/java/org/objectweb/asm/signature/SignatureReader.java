package org.objectweb.asm.signature;

import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;

public class SignatureReader {

    private final String f6671a;

    public SignatureReader(String str) {
        this.f6671a = str;
    }

    private static int m9022a(String str, int i, SignatureVisitor signatureVisitor) {
        boolean z;
        int i2 = i + 1;
        char cCharAt = str.charAt(i);
        switch (cCharAt) {
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'I':
            case 'J':
            case 'S':
            case 'V':
            case 'Z':
                signatureVisitor.visitBaseType(cCharAt);
                return i2;
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'U':
            case 'W':
            case 'X':
            case 'Y':
            default:
                int i3 = i2;
                boolean z2 = false;
                boolean z3 = false;
                int i4 = i2;
                while (true) {
                    int iM9022a = i3 + 1;
                    char cCharAt2 = str.charAt(i3);
                    switch (cCharAt2) {
                        case '.':
                        case ';':
                            if (!z3) {
                                String strSubstring = str.substring(i4, iM9022a - 1);
                                if (z2) {
                                    signatureVisitor.visitInnerClassType(strSubstring);
                                } else {
                                    signatureVisitor.visitClassType(strSubstring);
                                }
                            }
                            if (cCharAt2 == ';') {
                                signatureVisitor.visitEnd();
                                return iM9022a;
                            }
                            z = true;
                            i4 = iM9022a;
                            z3 = false;
                            break;
                        case '<':
                            String strSubstring2 = str.substring(i4, iM9022a - 1);
                            if (z2) {
                                signatureVisitor.visitInnerClassType(strSubstring2);
                            } else {
                                signatureVisitor.visitClassType(strSubstring2);
                            }
                            while (true) {
                                char cCharAt3 = str.charAt(iM9022a);
                                switch (cCharAt3) {
                                    case '*':
                                        iM9022a++;
                                        signatureVisitor.visitTypeArgument();
                                        break;
                                    case '+':
                                    case '-':
                                        iM9022a = m9022a(str, iM9022a + 1, signatureVisitor.visitTypeArgument(cCharAt3));
                                        break;
                                    case ByteOps.ISTORE_3:
                                        z = z2;
                                        z3 = true;
                                        continue;
                                    default:
                                        iM9022a = m9022a(str, iM9022a, signatureVisitor.visitTypeArgument(SignatureVisitor.INSTANCEOF));
                                        break;
                                }
                            }
                            break;
                        default:
                            z = z2;
                            break;
                    }
                    i3 = iM9022a;
                    z2 = z;
                }
                break;
            case 'T':
                int iIndexOf = str.indexOf(59, i2);
                signatureVisitor.visitTypeVariable(str.substring(i2, iIndexOf));
                return iIndexOf + 1;
            case '[':
                return m9022a(str, i2, signatureVisitor.visitArrayType());
        }
    }

    public void accept(SignatureVisitor signatureVisitor) {
        char cCharAt;
        int i = 0;
        String str = this.f6671a;
        int length = str.length();
        if (str.charAt(0) == '<') {
            i = 2;
            do {
                int iIndexOf = str.indexOf(58, i);
                signatureVisitor.visitFormalTypeParameter(str.substring(i - 1, iIndexOf));
                int iM9022a = iIndexOf + 1;
                char cCharAt2 = str.charAt(iM9022a);
                if (cCharAt2 == 'L' || cCharAt2 == '[' || cCharAt2 == 'T') {
                    iM9022a = m9022a(str, iM9022a, signatureVisitor.visitClassBound());
                }
                while (true) {
                    int i2 = iM9022a;
                    i = i2 + 1;
                    cCharAt = str.charAt(i2);
                    if (cCharAt != ':') {
                        break;
                    } else {
                        iM9022a = m9022a(str, i, signatureVisitor.visitInterfaceBound());
                    }
                }
            } while (cCharAt != '>');
        }
        if (str.charAt(i) != '(') {
            int iM9022a2 = m9022a(str, i, signatureVisitor.visitSuperclass());
            while (iM9022a2 < length) {
                iM9022a2 = m9022a(str, iM9022a2, signatureVisitor.visitInterface());
            }
        } else {
            int iM9022a3 = i + 1;
            while (str.charAt(iM9022a3) != ')') {
                iM9022a3 = m9022a(str, iM9022a3, signatureVisitor.visitParameterType());
            }
            int iM9022a4 = m9022a(str, iM9022a3 + 1, signatureVisitor.visitReturnType());
            while (iM9022a4 < length) {
                iM9022a4 = m9022a(str, iM9022a4 + 1, signatureVisitor.visitExceptionType());
            }
        }
    }

    public void acceptType(SignatureVisitor signatureVisitor) {
        m9022a(this.f6671a, 0, signatureVisitor);
    }
}
