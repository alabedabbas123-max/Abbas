package com.sun.tools.javac.util;

public class Names {
    public static final Context.C0723Key<Names> namesKey = new Context.C0723Key<>();
    public final Name ANNOTATION_TYPE;
    public final Name Annotation;
    public final Name AnnotationDefault;
    public final Name Array;
    public final Name Bound;
    public final Name Bridge;
    public final Name CLASS;
    public final Name CONSTRUCTOR;
    public final Name CharacterRangeTable;
    public final Name Code;
    public final Name CompilationID;
    public final Name ConstantValue;
    public final Name Deprecated;
    public final Name EnclosingMethod;
    public final Name Enum;
    public final Name Exceptions;
    public final Name FIELD;
    public final Name InnerClasses;
    public final Name LOCAL_VARIABLE;
    public final Name LineNumberTable;
    public final Name LocalVariableTable;
    public final Name LocalVariableTypeTable;
    public final Name METHOD;
    public final Name Method;
    public final Name PACKAGE;
    public final Name PARAMETER;
    public final Name RUNTIME;
    public final Name RuntimeInvisibleAnnotations;
    public final Name RuntimeInvisibleParameterAnnotations;
    public final Name RuntimeInvisibleTypeAnnotations;
    public final Name RuntimeVisibleAnnotations;
    public final Name RuntimeVisibleParameterAnnotations;
    public final Name RuntimeVisibleTypeAnnotations;
    public final Name SOURCE;
    public final Name Signature;
    public final Name SourceFile;
    public final Name SourceID;
    public final Name StackMap;
    public final Name StackMapTable;
    public final Name Synthetic;

    public final Name f573T;
    public final Name TYPE;
    public final Name TYPE_PARAMETER;
    public final Name TYPE_USE;
    public final Name Value;
    public final Name Varargs;
    public final Name _class;
    public final Name _default;
    public final Name _name;
    public final Name _super;
    public final Name _this;
    public final Name addSuppressed;

    public final Name f574any;
    public final Name append;
    public final Name asterisk;
    public final Name clinit;
    public final Name clone;
    public final Name close;
    public final Name comma;
    public final Name compareTo;
    public final Name deprecated;
    public final Name desiredAssertionStatus;
    public final Name empty;
    public final Name equals;
    public final Name error;

    public final Name f575ex;
    public final Name family;
    public final Name finalize;
    public final Name forName;
    public final Name getClass;
    public final Name getClassLoader;
    public final Name getComponentType;
    public final Name getDeclaringClass;
    public final Name getMessage;
    public final Name hasNext;
    public final Name hashCode;
    public final Name hyphen;
    public final Name init;
    public final Name initCause;
    public final Name iterator;
    public final Name java_io_Serializable;
    public final Name java_lang;
    public final Name java_lang_AutoCloseable;
    public final Name java_lang_Class;
    public final Name java_lang_Cloneable;
    public final Name java_lang_Enum;
    public final Name java_lang_Object;
    public final Name java_lang_invoke_MethodHandle;
    public final Name length;
    public final Name next;

    public final Name f576one;
    public final Name ordinal;
    public final Name package_info;
    public final Name period;
    public final Name semicolon;
    public final Name serialVersionUID;
    public final Name slash;
    public final Name slashequals;
    public final Name.Table table;
    public final Name toString;
    public final Name value;
    public final Name valueOf;
    public final Name values;

    public static Names instance(Context context) {
        Names instance = (Names) context.m501get(namesKey);
        if (instance == null) {
            Names instance2 = new Names(context);
            context.m504put(namesKey, instance2);
            return instance2;
        }
        return instance;
    }

    public Names(Context context) {
        Options options = Options.instance(context);
        this.table = createTable(options);
        this.slash = fromString("/");
        this.hyphen = fromString("-");
        this.f573T = fromString("T");
        this.slashequals = fromString("/=");
        this.deprecated = fromString("deprecated");
        this.init = fromString("<init>");
        this.clinit = fromString("<clinit>");
        this.error = fromString("<error>");
        this.f574any = fromString("<any>");
        this.empty = fromString("");
        this.f576one = fromString("1");
        this.period = fromString(".");
        this.comma = fromString(",");
        this.semicolon = fromString(";");
        this.asterisk = fromString("*");
        this._this = fromString("this");
        this._super = fromString("super");
        this._default = fromString("default");
        this._class = fromString("class");
        this.java_lang = fromString("java.lang");
        this.java_lang_Object = fromString("java.lang.Object");
        this.java_lang_Class = fromString("java.lang.Class");
        this.java_lang_Cloneable = fromString("java.lang.Cloneable");
        this.java_io_Serializable = fromString("java.io.Serializable");
        this.java_lang_Enum = fromString("java.lang.Enum");
        this.java_lang_invoke_MethodHandle = fromString("java.lang.invoke.MethodHandle");
        this.package_info = fromString("package-info");
        this.serialVersionUID = fromString("serialVersionUID");
        this.ConstantValue = fromString("ConstantValue");
        this.LineNumberTable = fromString("LineNumberTable");
        this.LocalVariableTable = fromString("LocalVariableTable");
        this.LocalVariableTypeTable = fromString("LocalVariableTypeTable");
        this.CharacterRangeTable = fromString("CharacterRangeTable");
        this.StackMap = fromString("StackMap");
        this.StackMapTable = fromString("StackMapTable");
        this.SourceID = fromString("SourceID");
        this.CompilationID = fromString("CompilationID");
        this.Code = fromString("Code");
        this.Exceptions = fromString("Exceptions");
        this.SourceFile = fromString("SourceFile");
        this.InnerClasses = fromString("InnerClasses");
        this.Synthetic = fromString("Synthetic");
        this.Bridge = fromString("Bridge");
        this.Deprecated = fromString("Deprecated");
        this.Enum = fromString("Enum");
        this._name = fromString("name");
        this.Signature = fromString("Signature");
        this.Varargs = fromString("Varargs");
        this.Annotation = fromString("Annotation");
        this.RuntimeVisibleAnnotations = fromString("RuntimeVisibleAnnotations");
        this.RuntimeInvisibleAnnotations = fromString("RuntimeInvisibleAnnotations");
        this.RuntimeVisibleTypeAnnotations = fromString("RuntimeVisibleTypeAnnotations");
        this.RuntimeInvisibleTypeAnnotations = fromString("RuntimeInvisibleTypeAnnotations");
        this.RuntimeVisibleParameterAnnotations = fromString("RuntimeVisibleParameterAnnotations");
        this.RuntimeInvisibleParameterAnnotations = fromString("RuntimeInvisibleParameterAnnotations");
        this.Value = fromString("Value");
        this.EnclosingMethod = fromString("EnclosingMethod");
        this.desiredAssertionStatus = fromString("desiredAssertionStatus");
        this.append = fromString("append");
        this.family = fromString("family");
        this.forName = fromString("forName");
        this.toString = fromString("toString");
        this.length = fromString("length");
        this.valueOf = fromString("valueOf");
        this.value = fromString("value");
        this.getMessage = fromString("getMessage");
        this.getClass = fromString("getClass");
        this.TYPE = fromString("TYPE");
        this.TYPE_USE = fromString("TYPE_USE");
        this.TYPE_PARAMETER = fromString("TYPE_PARAMETER");
        this.FIELD = fromString("FIELD");
        this.METHOD = fromString("METHOD");
        this.PARAMETER = fromString("PARAMETER");
        this.CONSTRUCTOR = fromString("CONSTRUCTOR");
        this.LOCAL_VARIABLE = fromString("LOCAL_VARIABLE");
        this.ANNOTATION_TYPE = fromString("ANNOTATION_TYPE");
        this.PACKAGE = fromString("PACKAGE");
        this.SOURCE = fromString("SOURCE");
        this.CLASS = fromString("CLASS");
        this.RUNTIME = fromString("RUNTIME");
        this.Array = fromString("Array");
        this.Method = fromString("Method");
        this.Bound = fromString("Bound");
        this.clone = fromString("clone");
        this.getComponentType = fromString("getComponentType");
        this.getClassLoader = fromString("getClassLoader");
        this.initCause = fromString("initCause");
        this.values = fromString("values");
        this.iterator = fromString("iterator");
        this.hasNext = fromString("hasNext");
        this.next = fromString("next");
        this.AnnotationDefault = fromString("AnnotationDefault");
        this.ordinal = fromString("ordinal");
        this.equals = fromString("equals");
        this.hashCode = fromString("hashCode");
        this.compareTo = fromString("compareTo");
        this.getDeclaringClass = fromString("getDeclaringClass");
        this.f575ex = fromString("ex");
        this.finalize = fromString("finalize");
        this.java_lang_AutoCloseable = fromString("java.lang.AutoCloseable");
        this.close = fromString("close");
        this.addSuppressed = fromString("addSuppressed");
    }

    protected Name.Table createTable(Options options) {
        boolean useUnsharedTable = options.isSet("useUnsharedTable");
        if (useUnsharedTable) {
            return new UnsharedNameTable(this);
        }
        return new SharedNameTable(this);
    }

    public void dispose() {
        this.table.dispose();
    }

    public Name fromChars(char[] cs, int start, int len) {
        return this.table.fromChars(cs, start, len);
    }

    public Name fromString(String s) {
        return this.table.fromString(s);
    }

    public Name fromUtf(byte[] cs) {
        return this.table.fromUtf(cs);
    }

    public Name fromUtf(byte[] cs, int start, int len) {
        return this.table.fromUtf(cs, start, len);
    }
}
