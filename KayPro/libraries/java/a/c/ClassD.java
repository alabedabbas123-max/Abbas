package a.c;

import a.b.b.b;
import a.b.c;
import a.b.c.ae;
import a.b.c.ar;
import com.blankj.utilcode.constant.MemoryConstants;
import a.b.d.Abstractc;
import a.b.f.ClassI;
import a.g.c.ClassK;
import a.g.c.ClassN;

public class ClassD {

    private static String f455c = ClassI.m760b(Runnablea.class.getName());

    public final Abstractc[][][] f456a;

    public final b[] f457b;

    private final ClassN f458d = ClassK.m2735a();

    private final ClassN f459e = ClassK.m2735a();

    private final ClassN f460f = ClassK.m2735a();

    private final ClassN f461g;

    private final ClassN f462h;

    private final ClassN f463i;

    private final ClassN f464j;

    private final ClassN f465k;

    private final ClassN f466l;

    public ClassD(a.b.b bVar, a.b.b bVar2) {
        ar arVar = new ar(bVar, bVar2);
        ae aeVarA = arVar.a();
        this.f461g = ClassK.m2736a(this.f458d.m2754g(), this.f459e.m2754g(), aeVarA.a("java/lang/ClassNotFoundException", (c) null));
        this.f462h = ClassK.m2736a(this.f458d.m2754g(), this.f459e.m2754g(), aeVarA.a("java/lang/NoSuchMethodException", (c) null));
        this.f463i = ClassK.m2736a(this.f458d.m2754g(), this.f459e.m2754g(), aeVarA.a("java/lang/NoSuchFieldException", (c) null));
        this.f464j = ClassK.m2736a(this.f458d.m2754g(), this.f459e.m2754g(), aeVarA.a("java/io/IOException", (c) null));
        this.f465k = ClassK.m2736a(this.f458d.m2754g(), this.f459e.m2754g(), aeVarA.a("java/lang/RuntimeException", (c) null));
        this.f466l = ClassK.m2736a(this.f458d.m2754g(), this.f459e.m2754g(), aeVarA.a("java/lang/UnsatisfiedLinkError", (c) null));
        this.f456a = new Abstractc[][][]{new Abstractc[][]{arVar.d("java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;").b(), arVar.D().s(805306369).a(this.f458d).d("java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;").a(this.f459e).H(this.f460f.m2754g()).b(this.f461g).h(805306368).n(805306369).d(f455c, "logForName", "(Ljava/lang/String;Ljava/lang/String;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.d("java/lang/Class", "forName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;").b(), arVar.F().B().F().B().F().s(805306369).a(this.f458d).d("java/lang/Class", "forName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;").a(this.f459e).H(this.f460f.m2754g()).b(this.f461g).h(805306368).n(805306369).d(f455c, "logForName", "(Ljava/lang/String;Ljava/lang/String;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.b("java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;").b(), arVar.D().s(805306369).a(this.f458d).b("java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;").a(this.f459e).H(this.f460f.m2754g()).b(this.f461g).h(805306368).n(805306369).d(f455c, "logLoadClass", "(Ljava/lang/String;Ljava/lang/String;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getDeclaredConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;").b(), arVar.E().s(805306370).E().s(805306369).a(this.f458d).b("java/lang/Class", "getDeclaredConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;").a(this.f459e).H(this.f460f.m2754g()).b(this.f462h).h(805306368).n(805306369).n(805306370).d(f455c, "logGetDeclaredConstructor", "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;").b(), arVar.E().s(805306370).E().s(805306369).a(this.f458d).b("java/lang/Class", "getConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;").a(this.f459e).H(this.f460f.m2754g()).b(this.f462h).h(805306368).n(805306369).n(805306370).d(f455c, "logGetConstructor", "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getDeclaredConstructors", "()[Ljava/lang/reflect/Constructor;").b(), arVar.D().h(805306368).I().d(f455c, "logGetDeclaredConstructors", "(Ljava/lang/String;Ljava/lang/Class;)V").b("java/lang/Class", "getDeclaredConstructors", "()[Ljava/lang/reflect/Constructor;").b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getConstructors", "()[Ljava/lang/reflect/Constructor;").b(), arVar.D().h(805306368).I().d(f455c, "logGetConstructors", "(Ljava/lang/String;Ljava/lang/Class;)V").b("java/lang/Class", "getConstructors", "()[Ljava/lang/reflect/Constructor;").b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;").b(), arVar.F().s(805306371).F().s(805306370).F().s(805306369).a(this.f458d).b("java/lang/Class", "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;").a(this.f459e).H(this.f460f.m2754g()).b(this.f462h).h(805306368).n(805306369).n(805306370).n(805306371).d(f455c, "logGetDeclaredMethod", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;").b(), arVar.F().s(805306371).F().s(805306370).F().s(805306369).a(this.f458d).b("java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;").a(this.f459e).H(this.f460f.m2754g()).b(this.f462h).h(805306368).n(805306369).n(805306370).n(805306371).d(f455c, "logGetMethod", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getDeclaredMethods", "()[Ljava/lang/reflect/Method;").b(), arVar.D().h(805306368).I().d(f455c, "logGetDeclaredMethods", "(Ljava/lang/String;Ljava/lang/Class;)V").b("java/lang/Class", "getDeclaredMethods", "()[Ljava/lang/reflect/Method;").b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getMethods", "()[Ljava/lang/reflect/Method;").b(), arVar.D().h(805306368).I().d(f455c, "logGetMethods", "(Ljava/lang/String;Ljava/lang/Class;)V").b("java/lang/Class", "getMethods", "()[Ljava/lang/reflect/Method;").b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getDeclaredField", "(Ljava/lang/String;)Ljava/lang/reflect/Field;").b(), arVar.E().s(805306370).E().s(805306369).a(this.f458d).b("java/lang/Class", "getDeclaredField", "(Ljava/lang/String;)Ljava/lang/reflect/Field;").a(this.f459e).H(this.f460f.m2754g()).b(this.f463i).h(805306368).n(805306369).n(805306370).d(f455c, "logGetDeclaredField", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getField", "(Ljava/lang/String;)Ljava/lang/reflect/Field;").b(), arVar.E().s(805306370).E().s(805306369).a(this.f458d).b("java/lang/Class", "getField", "(Ljava/lang/String;)Ljava/lang/reflect/Field;").a(this.f459e).H(this.f460f.m2754g()).b(this.f463i).h(805306368).n(805306369).n(805306370).d(f455c, "logGetField", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getDeclaredFields", "()[Ljava/lang/reflect/Field;").b(), arVar.D().h(805306368).I().d(f455c, "logGetDeclaredFields", "(Ljava/lang/String;Ljava/lang/Class;)V").b("java/lang/Class", "getDeclaredFields", "()[Ljava/lang/reflect/Field;").b()}, new Abstractc[][]{arVar.b("java/lang/Class", "getFields", "()[Ljava/lang/reflect/Field;").b(), arVar.D().h(805306368).I().d(f455c, "logGetFields", "(Ljava/lang/String;Ljava/lang/Class;)V").b("java/lang/Class", "getFields", "()[Ljava/lang/reflect/Field;").b()}, new Abstractc[][]{arVar.h(MemoryConstants.f4579GB).d("java/lang/System", "loadLibrary", "(Ljava/lang/String;)V").b(), arVar.h(MemoryConstants.f4579GB).a(this.f458d).d("java/lang/System", "loadLibrary", "(Ljava/lang/String;)V").a(this.f459e).H(this.f460f.m2754g()).b(this.f466l).h(805306368).h(MemoryConstants.f4579GB).d(f455c, "logLoadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.d("java/lang/System", "loadLibrary", "(Ljava/lang/String;)V").b(), arVar.D().s(805306369).a(this.f458d).d("java/lang/System", "loadLibrary", "(Ljava/lang/String;)V").a(this.f459e).H(this.f460f.m2754g()).b(this.f466l).h(805306368).n(805306369).d(f455c, "logLoadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.h(MemoryConstants.f4579GB).d("java/lang/System", "load", "(Ljava/lang/String;)V").b(), arVar.h(MemoryConstants.f4579GB).a(this.f458d).d("java/lang/System", "load", "(Ljava/lang/String;)V").a(this.f459e).H(this.f460f.m2754g()).b(this.f466l).h(805306368).h(MemoryConstants.f4579GB).d(f455c, "logLoad", "(Ljava/lang/String;Ljava/lang/String;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.d("java/lang/System", "load", "(Ljava/lang/String;)V").b(), arVar.D().s(805306369).a(this.f458d).d("java/lang/System", "load", "(Ljava/lang/String;)V").a(this.f459e).H(this.f460f.m2754g()).b(this.f466l).h(805306368).n(805306369).d(f455c, "logLoad", "(Ljava/lang/String;Ljava/lang/String;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.h(MemoryConstants.f4579GB).d("java/lang/Runtime", "loadLibrary", "(Ljava/lang/String;)V").b(), arVar.h(MemoryConstants.f4579GB).a(this.f458d).d("java/lang/Runtime", "loadLibrary", "(Ljava/lang/String;)V").a(this.f459e).H(this.f460f.m2754g()).b(this.f466l).h(805306368).h(MemoryConstants.f4579GB).d(f455c, "logLoadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V").aG().a(this.f460f).b()}, new Abstractc[][]{arVar.d("java/lang/Runtime", "loadLibrary", "(Ljava/lang/String;)V").b(), arVar.D().s(805306369).a(this.f458d).d("java/lang/Runtime", "loadLibrary", "(Ljava/lang/String;)V").a(this.f459e).H(this.f460f.m2754g()).b(this.f466l).h(805306368).n(805306369).d(f455c, "logLoadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V").aG().a(this.f460f).b()}};
        this.f457b = arVar.d();
    }
}
