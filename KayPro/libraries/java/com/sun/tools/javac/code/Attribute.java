package com.sun.tools.javac.code;

import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Constants;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.AnnotationValueVisitor;
import javax.lang.model.type.DeclaredType;

public abstract class Attribute implements AnnotationValue {
    public Type type;

    public interface Visitor {
        void visitArray(Array array);

        void visitClass(Class r1);

        void visitCompound(Compound compound);

        void visitConstant(Constant constant);

        void visitEnum(Enum r1);

        void visitError(Error error);
    }

    public abstract void accept(Visitor visitor);

    public Attribute(Type type) {
        this.type = type;
    }

    @Override
    public Object getValue() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <R, P> R accept(AnnotationValueVisitor<R, P> v, P p) {
        throw new UnsupportedOperationException();
    }

    public static class Constant extends Attribute {
        public final Object value;

        @Override
        public void accept(Visitor v) {
            v.visitConstant(this);
        }

        public Constant(Type type, Object value) {
            super(type);
            this.value = value;
        }

        @Override
        public String toString() {
            return Constants.format(this.value, this.type);
        }

        @Override
        public Object getValue() {
            return Constants.decode(this.value, this.type);
        }

        @Override
        public <R, P> R accept(AnnotationValueVisitor<R, P> v, P p) {
            Object obj = this.value;
            if (obj instanceof String) {
                return v.visitString((String) obj, p);
            }
            if (obj instanceof Integer) {
                int i = ((Integer) obj).intValue();
                int i2 = this.type.f344tag;
                if (i2 == 1) {
                    return v.visitByte((byte) i, p);
                }
                if (i2 == 2) {
                    return v.visitChar((char) i, p);
                }
                if (i2 == 3) {
                    return v.visitShort((short) i, p);
                }
                if (i2 == 4) {
                    return v.visitInt(i, p);
                }
                if (i2 == 8) {
                    return v.visitBoolean(i != 0, p);
                }
            }
            int i3 = this.type.f344tag;
            if (i3 == 5) {
                return v.visitLong(((Long) this.value).longValue(), p);
            }
            if (i3 == 6) {
                return v.visitFloat(((Float) this.value).floatValue(), p);
            }
            if (i3 == 7) {
                return v.visitDouble(((Double) this.value).doubleValue(), p);
            }
            throw new AssertionError("Bad annotation element value: " + this.value);
        }
    }

    public static class Class extends Attribute {
        public final Type type;

        @Override
        public void accept(Visitor v) {
            v.visitClass(this);
        }

        public Class(Types types, Type type) {
            super(makeClassType(types, type));
            this.type = type;
        }

        static Type makeClassType(Types types, Type type) {
            Type arg;
            if (type.isPrimitive()) {
                arg = types.boxedClass(type).type;
            } else {
                arg = types.erasure(type);
            }
            return new Type.ClassType(types.syms.classType.getEnclosingType(), List.m508of(arg), types.syms.classType.tsym);
        }

        @Override
        public String toString() {
            return this.type + ".class";
        }

        @Override
        public Type getValue() {
            return this.type;
        }

        @Override
        public <R, P> R accept(AnnotationValueVisitor<R, P> v, P p) {
            return v.visitType(this.type, p);
        }
    }

    public static class Compound extends Attribute implements AnnotationMirror {
        public final List<Pair<Symbol.MethodSymbol, Attribute>> values;

        public Compound(Type type, List<Pair<Symbol.MethodSymbol, Attribute>> values) {
            super(type);
            this.values = values;
        }

        @Override
        public void accept(Visitor v) {
            v.visitCompound(this);
        }

        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder();
            buf.append("@");
            buf.append(this.type);
            int len = this.values.length();
            if (len > 0) {
                buf.append('(');
                boolean first = true;
                for (Pair<Symbol.MethodSymbol, Attribute> value : this.values) {
                    if (!first) {
                        buf.append(", ");
                    }
                    first = false;
                    Name name = value.f577fst.name;
                    if (len > 1 || name != name.table.names.value) {
                        buf.append((CharSequence) name);
                        buf.append('=');
                    }
                    buf.append(value.f578snd);
                }
                buf.append(')');
            }
            return buf.toString();
        }

        public Attribute member(Name member) {
            for (Pair<Symbol.MethodSymbol, Attribute> pair : this.values) {
                if (pair.f577fst.name == member) {
                    return pair.f578snd;
                }
            }
            return null;
        }

        @Override
        public Compound getValue() {
            return this;
        }

        @Override
        public <R, P> R accept(AnnotationValueVisitor<R, P> v, P p) {
            return v.visitAnnotation(this, p);
        }

        @Override
        public DeclaredType getAnnotationType() {
            return (DeclaredType) this.type;
        }

        @Override
        public Map<Symbol.MethodSymbol, Attribute> getElementValues() {
            Map<Symbol.MethodSymbol, Attribute> valmap = new LinkedHashMap<>();
            for (Pair<Symbol.MethodSymbol, Attribute> value : this.values) {
                valmap.put(value.f577fst, value.f578snd);
            }
            return valmap;
        }
    }

    public static class Array extends Attribute {
        public final Attribute[] values;

        public Array(Type type, Attribute[] values) {
            super(type);
            this.values = values;
        }

        @Override
        public void accept(Visitor v) {
            v.visitArray(this);
        }

        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder();
            buf.append('{');
            boolean first = true;
            for (Attribute value : this.values) {
                if (!first) {
                    buf.append(", ");
                }
                first = false;
                buf.append(value);
            }
            buf.append('}');
            return buf.toString();
        }

        @Override
        public List<Attribute> getValue() {
            return List.from(this.values);
        }

        @Override
        public <R, P> R accept(AnnotationValueVisitor<R, P> v, P p) {
            return v.visitArray(getValue(), p);
        }
    }

    public static class Enum extends Attribute {
        public Symbol.VarSymbol value;

        public Enum(Type type, Symbol.VarSymbol value) {
            super(type);
            this.value = (Symbol.VarSymbol) Assert.checkNonNull(value);
        }

        @Override
        public void accept(Visitor v) {
            v.visitEnum(this);
        }

        @Override
        public String toString() {
            return this.value.enclClass() + "." + this.value;
        }

        @Override
        public Symbol.VarSymbol getValue() {
            return this.value;
        }

        @Override
        public <R, P> R accept(AnnotationValueVisitor<R, P> v, P p) {
            return v.visitEnumConstant(this.value, p);
        }
    }

    public static class Error extends Attribute {
        public Error(Type type) {
            super(type);
        }

        @Override
        public void accept(Visitor v) {
            v.visitError(this);
        }

        @Override
        public String toString() {
            return "<error>";
        }

        @Override
        public String getValue() {
            return toString();
        }

        @Override
        public <R, P> R accept(AnnotationValueVisitor<R, P> v, P p) {
            return v.visitString(toString(), p);
        }
    }
}
