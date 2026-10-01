package com.sun.tools.javac.code;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.lang.model.element.Modifier;

public class Flags {
    public static final int ABSTRACT = 1024;
    public static final int ACC_BRIDGE = 64;
    public static final int ACC_SUPER = 32;
    public static final int ACC_VARARGS = 128;
    public static final int ACYCLIC = 1073741824;
    public static final long ACYCLIC_ANN = 34359738368L;
    public static final int ANNOTATION = 8192;
    public static final int ANONCONSTR = 536870912;
    public static final int AccessFlags = 7;
    public static final int BLOCK = 1048576;
    public static final long BRIDGE = 2147483648L;
    public static final long CLASH = 8796093022208L;
    public static final int CLASS_SEEN = 33554432;
    public static final int COMPOUND = 16777216;
    public static final int ClassFlags = 32273;
    public static final int ConstructorFlags = 7;
    public static final int DEPRECATED = 131072;
    public static final long EFFECTIVELY_FINAL = 4398046511104L;
    public static final int ENUM = 16384;
    public static final int EXISTS = 8388608;
    public static final int FINAL = 16;
    public static final long GENERATEDCONSTR = 68719476736L;
    public static final int HASINIT = 262144;
    public static final long HYPOTHETICAL = 137438953472L;
    public static final int INTERFACE = 512;
    public static final int IPROXY = 2097152;
    public static final int InterfaceMethodFlags = 1025;
    public static final int InterfaceVarFlags = 25;
    public static final int LOCKED = 134217728;
    public static final int LocalClassFlags = 23568;
    public static final long LocalVarFlags = 8589934608L;
    public static final int MemberClassFlags = 24087;
    public static final int MethodFlags = 3391;
    public static final int ModifierFlags = 3583;
    public static final int NATIVE = 256;
    public static final int NOOUTERTHIS = 4194304;
    public static final long OVERRIDE_BRIDGE = 2199023255552L;
    public static final long PARAMETER = 8589934592L;
    public static final long POLYMORPHIC_SIGNATURE = 1099511627776L;
    public static final int PRIVATE = 2;
    public static final long PROPRIETARY = 274877906944L;
    public static final int PROTECTED = 4;
    public static final int PUBLIC = 1;
    public static final int SOURCE_SEEN = 67108864;
    public static final int STATIC = 8;
    public static final int STRICTFP = 2048;
    public static final int SYNCHRONIZED = 32;
    public static final int SYNTHETIC = 4096;
    public static final int StandardFlags = 4095;
    public static final int TRANSIENT = 128;
    public static final int UNATTRIBUTED = 268435456;
    public static final long UNION = 549755813888L;
    public static final long VARARGS = 17179869184L;
    public static final int VOLATILE = 64;
    public static final int VarFlags = 16607;
    private static Map<Long, Set<Modifier>> modifierSets = new ConcurrentHashMap(64);

    private Flags() {
    }

    public static String toString(long flags) {
        StringBuilder buf = new StringBuilder();
        String sep = "";
        for (Flag s : asFlagSet(flags)) {
            buf.append(sep);
            buf.append(s);
            sep = " ";
        }
        return buf.toString();
    }

    public static EnumSet<Flag> asFlagSet(long mask) {
        EnumSet<Flag> flags = EnumSet.noneOf(Flag.class);
        if ((1 & mask) != 0) {
            flags.add(Flag.PUBLIC);
        }
        if ((2 & mask) != 0) {
            flags.add(Flag.PRIVATE);
        }
        if ((4 & mask) != 0) {
            flags.add(Flag.PROTECTED);
        }
        if ((8 & mask) != 0) {
            flags.add(Flag.STATIC);
        }
        if ((16 & mask) != 0) {
            flags.add(Flag.FINAL);
        }
        if ((32 & mask) != 0) {
            flags.add(Flag.SYNCHRONIZED);
        }
        if ((64 & mask) != 0) {
            flags.add(Flag.VOLATILE);
        }
        if ((128 & mask) != 0) {
            flags.add(Flag.TRANSIENT);
        }
        if ((256 & mask) != 0) {
            flags.add(Flag.NATIVE);
        }
        if ((512 & mask) != 0) {
            flags.add(Flag.INTERFACE);
        }
        if ((1024 & mask) != 0) {
            flags.add(Flag.ABSTRACT);
        }
        if ((2048 & mask) != 0) {
            flags.add(Flag.STRICTFP);
        }
        if ((BRIDGE & mask) != 0) {
            flags.add(Flag.BRIDGE);
        }
        if ((4096 & mask) != 0) {
            flags.add(Flag.SYNTHETIC);
        }
        if ((131072 & mask) != 0) {
            flags.add(Flag.DEPRECATED);
        }
        if ((262144 & mask) != 0) {
            flags.add(Flag.HASINIT);
        }
        if ((16384 & mask) != 0) {
            flags.add(Flag.ENUM);
        }
        if ((2097152 & mask) != 0) {
            flags.add(Flag.IPROXY);
        }
        if ((4194304 & mask) != 0) {
            flags.add(Flag.NOOUTERTHIS);
        }
        if ((8388608 & mask) != 0) {
            flags.add(Flag.EXISTS);
        }
        if ((16777216 & mask) != 0) {
            flags.add(Flag.COMPOUND);
        }
        if ((33554432 & mask) != 0) {
            flags.add(Flag.CLASS_SEEN);
        }
        if ((67108864 & mask) != 0) {
            flags.add(Flag.SOURCE_SEEN);
        }
        if ((134217728 & mask) != 0) {
            flags.add(Flag.LOCKED);
        }
        if ((268435456 & mask) != 0) {
            flags.add(Flag.UNATTRIBUTED);
        }
        if ((536870912 & mask) != 0) {
            flags.add(Flag.ANONCONSTR);
        }
        if ((1073741824 & mask) != 0) {
            flags.add(Flag.ACYCLIC);
        }
        if ((PARAMETER & mask) != 0) {
            flags.add(Flag.PARAMETER);
        }
        if ((VARARGS & mask) != 0) {
            flags.add(Flag.VARARGS);
        }
        return flags;
    }

    public static Set<Modifier> asModifierSet(long flags) {
        Set<Modifier> modifiers = modifierSets.get(Long.valueOf(flags));
        if (modifiers == null) {
            Set<Modifier> modifiers2 = EnumSet.noneOf(Modifier.class);
            if (0 != (1 & flags)) {
                modifiers2.add(Modifier.PUBLIC);
            }
            if (0 != (4 & flags)) {
                modifiers2.add(Modifier.PROTECTED);
            }
            if (0 != (2 & flags)) {
                modifiers2.add(Modifier.PRIVATE);
            }
            if (0 != (1024 & flags)) {
                modifiers2.add(Modifier.ABSTRACT);
            }
            if (0 != (8 & flags)) {
                modifiers2.add(Modifier.STATIC);
            }
            if (0 != (16 & flags)) {
                modifiers2.add(Modifier.FINAL);
            }
            if (0 != (128 & flags)) {
                modifiers2.add(Modifier.TRANSIENT);
            }
            if (0 != (64 & flags)) {
                modifiers2.add(Modifier.VOLATILE);
            }
            if (0 != (32 & flags)) {
                modifiers2.add(Modifier.SYNCHRONIZED);
            }
            if (0 != (256 & flags)) {
                modifiers2.add(Modifier.NATIVE);
            }
            if (0 != (2048 & flags)) {
                modifiers2.add(Modifier.STRICTFP);
            }
            Set<Modifier> modifiers3 = Collections.unmodifiableSet(modifiers2);
            modifierSets.put(Long.valueOf(flags), modifiers3);
            return modifiers3;
        }
        return modifiers;
    }

    public static boolean isStatic(Symbol symbol) {
        return (symbol.flags() & 8) != 0;
    }

    public static boolean isEnum(Symbol symbol) {
        return (symbol.flags() & 16384) != 0;
    }

    public static boolean isConstant(Symbol.VarSymbol symbol) {
        return symbol.getConstValue() != null;
    }

    public enum Flag {
        PUBLIC("public"),
        PRIVATE("private"),
        PROTECTED("protected"),
        STATIC("static"),
        FINAL("final"),
        SYNCHRONIZED("synchronized"),
        VOLATILE("volatile"),
        TRANSIENT("transient"),
        NATIVE("native"),
        INTERFACE("interface"),
        ABSTRACT("abstract"),
        STRICTFP("strictfp"),
        BRIDGE("bridge"),
        SYNTHETIC("synthetic"),
        DEPRECATED("deprecated"),
        HASINIT("hasinit"),
        ENUM("enum"),
        IPROXY("iproxy"),
        NOOUTERTHIS("noouterthis"),
        EXISTS("exists"),
        COMPOUND("compound"),
        CLASS_SEEN("class_seen"),
        SOURCE_SEEN("source_seen"),
        LOCKED("locked"),
        UNATTRIBUTED("unattributed"),
        ANONCONSTR("anonconstr"),
        ACYCLIC("acyclic"),
        PARAMETER("parameter"),
        VARARGS("varargs"),
        PACKAGE("package");

        String name;

        Flag(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}
