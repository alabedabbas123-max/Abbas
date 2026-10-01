package sun.reflect.generics.parser;

import java.lang.reflect.GenericSignatureFormatError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sun.reflect.generics.tree.ArrayTypeSignature;
import sun.reflect.generics.tree.BaseType;
import sun.reflect.generics.tree.BooleanSignature;
import sun.reflect.generics.tree.BottomSignature;
import sun.reflect.generics.tree.ByteSignature;
import sun.reflect.generics.tree.CharSignature;
import sun.reflect.generics.tree.ClassSignature;
import sun.reflect.generics.tree.ClassTypeSignature;
import sun.reflect.generics.tree.DoubleSignature;
import sun.reflect.generics.tree.FieldTypeSignature;
import sun.reflect.generics.tree.FloatSignature;
import sun.reflect.generics.tree.FormalTypeParameter;
import sun.reflect.generics.tree.IntSignature;
import sun.reflect.generics.tree.LongSignature;
import sun.reflect.generics.tree.MethodTypeSignature;
import sun.reflect.generics.tree.ReturnType;
import sun.reflect.generics.tree.ShortSignature;
import sun.reflect.generics.tree.SimpleClassTypeSignature;
import sun.reflect.generics.tree.TypeArgument;
import sun.reflect.generics.tree.TypeSignature;
import sun.reflect.generics.tree.TypeVariableSignature;
import sun.reflect.generics.tree.VoidDescriptor;
import sun.reflect.generics.tree.Wildcard;

public class SignatureParser {
    static final boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;

    private static final char f638EOI = ':';
    private int index = 0;
    private char[] input;

    private SignatureParser() {
    }

    private char getNext() {
        try {
            char[] cArr = this.input;
            int i = this.index;
            this.index = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            return f638EOI;
        }
    }

    private char current() {
        try {
            return this.input[this.index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return f638EOI;
        }
    }

    private void advance() {
        this.index++;
    }

    private boolean matches(char c, char... set) {
        for (char e : set) {
            if (c == e) {
                return true;
            }
        }
        return false;
    }

    private Error error(String errorMsg) {
        return new GenericSignatureFormatError();
    }

    public static SignatureParser make() {
        return new SignatureParser();
    }

    public ClassSignature parseClassSig(String s) {
        this.input = s.toCharArray();
        return parseClassSignature();
    }

    public MethodTypeSignature parseMethodSig(String s) {
        this.input = s.toCharArray();
        return parseMethodTypeSignature();
    }

    public TypeSignature parseTypeSig(String s) {
        this.input = s.toCharArray();
        return parseTypeSignature();
    }

    private ClassSignature parseClassSignature() {
        return ClassSignature.make(parseZeroOrMoreFormalTypeParameters(), parseClassTypeSignature(), parseSuperInterfaces());
    }

    private FormalTypeParameter[] parseZeroOrMoreFormalTypeParameters() {
        return current() == '<' ? parseFormalTypeParameters() : new FormalTypeParameter[0];
    }

    private FormalTypeParameter[] parseFormalTypeParameters() {
        Collection<FormalTypeParameter> ftps = new ArrayList<>(3);
        if (current() != '<') {
            throw error("expected <");
        }
        advance();
        ftps.add(parseFormalTypeParameter());
        while (current() != '>') {
            ftps.add(parseFormalTypeParameter());
        }
        advance();
        FormalTypeParameter[] ftpa = new FormalTypeParameter[ftps.size()];
        return (FormalTypeParameter[]) ftps.toArray(ftpa);
    }

    private FormalTypeParameter parseFormalTypeParameter() {
        String id = parseIdentifier();
        FieldTypeSignature[] bs = parseZeroOrMoreBounds();
        return FormalTypeParameter.make(id, bs);
    }

    private String parseIdentifier() {
        StringBuilder result = new StringBuilder();
        while (!Character.isWhitespace(current())) {
            char c = current();
            if (c != '.' && c != '/' && c != '>' && c != '[') {
                switch (c) {
                    case ':':
                    case ';':
                    case '<':
                        break;
                    default:
                        result.append(c);
                        advance();
                        break;
                }
            }
            return result.toString();
        }
        return result.toString();
    }

    private FieldTypeSignature parseFieldTypeSignature() {
        char cCurrent = current();
        if (cCurrent == 'L') {
            return parseClassTypeSignature();
        }
        if (cCurrent == 'T') {
            return parseTypeVariableSignature();
        }
        if (cCurrent == '[') {
            return parseArrayTypeSignature();
        }
        throw error("Expected Field Type Signature");
    }

    private ClassTypeSignature parseClassTypeSignature() {
        if (current() != 'L') {
            throw error("expected a class type");
        }
        advance();
        List<SimpleClassTypeSignature> scts = new ArrayList<>(5);
        scts.add(parseSimpleClassTypeSignature(false));
        parseClassTypeSignatureSuffix(scts);
        if (current() != ';') {
            throw error("expected ';' got '" + current() + "'");
        }
        advance();
        return ClassTypeSignature.make(scts);
    }

    private SimpleClassTypeSignature parseSimpleClassTypeSignature(boolean dollar) {
        String id = parseIdentifier();
        char c = current();
        if (c == '/' || c == ';') {
            return SimpleClassTypeSignature.make(id, dollar, new TypeArgument[0]);
        }
        if (c == '<') {
            return SimpleClassTypeSignature.make(id, dollar, parseTypeArguments());
        }
        throw error("expected < or ; or /");
    }

    private void parseClassTypeSignatureSuffix(List<SimpleClassTypeSignature> scts) {
        while (true) {
            if (current() == '/' || current() == '.') {
                boolean dollar = current() == '.';
                advance();
                scts.add(parseSimpleClassTypeSignature(dollar));
            } else {
                return;
            }
        }
    }

    private TypeArgument[] parseTypeArgumentsOpt() {
        return current() == '<' ? parseTypeArguments() : new TypeArgument[0];
    }

    private TypeArgument[] parseTypeArguments() {
        Collection<TypeArgument> tas = new ArrayList<>(3);
        if (current() != '<') {
            throw error("expected <");
        }
        advance();
        tas.add(parseTypeArgument());
        while (current() != '>') {
            tas.add(parseTypeArgument());
        }
        advance();
        TypeArgument[] taa = new TypeArgument[tas.size()];
        return (TypeArgument[]) tas.toArray(taa);
    }

    private TypeArgument parseTypeArgument() {
        FieldTypeSignature[] ub = new FieldTypeSignature[1];
        FieldTypeSignature[] lb = new FieldTypeSignature[1];
        TypeArgument[] ta = new TypeArgument[0];
        char c = current();
        if (c == '*') {
            advance();
            ub[0] = SimpleClassTypeSignature.make("java.lang.Object", false, ta);
            lb[0] = BottomSignature.make();
            return Wildcard.make(ub, lb);
        }
        if (c == '+') {
            advance();
            ub[0] = parseFieldTypeSignature();
            lb[0] = BottomSignature.make();
            return Wildcard.make(ub, lb);
        }
        if (c == '-') {
            advance();
            lb[0] = parseFieldTypeSignature();
            ub[0] = SimpleClassTypeSignature.make("java.lang.Object", false, ta);
            return Wildcard.make(ub, lb);
        }
        return parseFieldTypeSignature();
    }

    private TypeVariableSignature parseTypeVariableSignature() {
        if (current() != 'T') {
            throw error("expected a type variable usage");
        }
        advance();
        TypeVariableSignature ts = TypeVariableSignature.make(parseIdentifier());
        if (current() != ';') {
            throw error("; expected in signature of type variable named" + ts.getIdentifier());
        }
        advance();
        return ts;
    }

    private ArrayTypeSignature parseArrayTypeSignature() {
        if (current() != '[') {
            throw error("expected array type signature");
        }
        advance();
        return ArrayTypeSignature.make(parseTypeSignature());
    }

    private TypeSignature parseTypeSignature() {
        char cCurrent = current();
        if (cCurrent != 'F' && cCurrent != 'S' && cCurrent != 'Z' && cCurrent != 'I' && cCurrent != 'J') {
            switch (cCurrent) {
                case 'B':
                case 'C':
                case 'D':
                    break;
                default:
                    return parseFieldTypeSignature();
            }
        }
        return parseBaseType();
    }

    private BaseType parseBaseType() {
        char cCurrent = current();
        if (cCurrent == 'F') {
            advance();
            return FloatSignature.make();
        }
        if (cCurrent == 'S') {
            advance();
            return ShortSignature.make();
        }
        if (cCurrent == 'Z') {
            advance();
            return BooleanSignature.make();
        }
        if (cCurrent == 'I') {
            advance();
            return IntSignature.make();
        }
        if (cCurrent != 'J') {
            switch (cCurrent) {
                case 'B':
                    advance();
                    return ByteSignature.make();
                case 'C':
                    advance();
                    return CharSignature.make();
                case 'D':
                    advance();
                    return DoubleSignature.make();
                default:
                    throw error("expected primitive type");
            }
        }
        advance();
        return LongSignature.make();
    }

    private FieldTypeSignature[] parseZeroOrMoreBounds() {
        Collection<FieldTypeSignature> fts = new ArrayList<>(3);
        if (current() == ':') {
            advance();
            if (current() != ':') {
                fts.add(parseFieldTypeSignature());
            }
            while (current() == ':') {
                advance();
                fts.add(parseFieldTypeSignature());
            }
        }
        FieldTypeSignature[] fta = new FieldTypeSignature[fts.size()];
        return (FieldTypeSignature[]) fts.toArray(fta);
    }

    private ClassTypeSignature[] parseSuperInterfaces() {
        Collection<ClassTypeSignature> cts = new ArrayList<>(5);
        while (current() == 'L') {
            cts.add(parseClassTypeSignature());
        }
        ClassTypeSignature[] cta = new ClassTypeSignature[cts.size()];
        return (ClassTypeSignature[]) cts.toArray(cta);
    }

    private MethodTypeSignature parseMethodTypeSignature() {
        return MethodTypeSignature.make(parseZeroOrMoreFormalTypeParameters(), parseFormalParameters(), parseReturnType(), parseZeroOrMoreThrowsSignatures());
    }

    private TypeSignature[] parseFormalParameters() {
        if (current() != '(') {
            throw error("expected (");
        }
        advance();
        TypeSignature[] pts = parseZeroOrMoreTypeSignatures();
        if (current() != ')') {
            throw error("expected )");
        }
        advance();
        return pts;
    }

    private TypeSignature[] parseZeroOrMoreTypeSignatures() {
        Collection<TypeSignature> ts = new ArrayList<>();
        boolean stop = false;
        while (!stop) {
            char cCurrent = current();
            if (cCurrent != 'F' && cCurrent != 'L' && cCurrent != 'I' && cCurrent != 'J' && cCurrent != 'S' && cCurrent != 'T' && cCurrent != 'Z' && cCurrent != '[') {
                switch (cCurrent) {
                    case 'B':
                    case 'C':
                    case 'D':
                        break;
                    default:
                        stop = true;
                        continue;
                }
            }
            ts.add(parseTypeSignature());
        }
        TypeSignature[] ta = new TypeSignature[ts.size()];
        return (TypeSignature[]) ts.toArray(ta);
    }

    private ReturnType parseReturnType() {
        if (current() == 'V') {
            advance();
            return VoidDescriptor.make();
        }
        return parseTypeSignature();
    }

    private FieldTypeSignature[] parseZeroOrMoreThrowsSignatures() {
        Collection<FieldTypeSignature> ets = new ArrayList<>(3);
        while (current() == '^') {
            ets.add(parseThrowsSignature());
        }
        FieldTypeSignature[] eta = new FieldTypeSignature[ets.size()];
        return (FieldTypeSignature[]) ets.toArray(eta);
    }

    private FieldTypeSignature parseThrowsSignature() {
        if (current() != '^') {
            throw error("expected throws signature");
        }
        advance();
        return parseFieldTypeSignature();
    }
}
