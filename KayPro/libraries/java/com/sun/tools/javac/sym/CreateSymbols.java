package com.sun.tools.javac.sym;

import com.sun.tools.javac.Main;
import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.api.JavacTaskImpl;
import com.sun.tools.javac.jvm.ClassReader;
import com.sun.tools.javac.jvm.ClassWriter;
import com.sun.tools.javac.jvm.Pool;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedOptions;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

@SupportedOptions({"com.sun.tools.javac.sym.Jar", "com.sun.tools.javac.sym.Dest"})
@SupportedAnnotationTypes({"*"})
public class CreateSymbols extends AbstractProcessor {
    static Set<String> getLegacyPackages() {
        ResourceBundle legacyBundle = ResourceBundle.getBundle("com.sun.tools.javac.resources.legacy");
        Set<String> keys = new HashSet<>();
        Enumeration<String> e = legacyBundle.getKeys();
        while (e.hasMoreElements()) {
            keys.add(e.nextElement());
        }
        return keys;
    }

    public static void main(String... args) {
        String rt_jar = args[0];
        String dest = args[1];
        Main.compile(new String[]{"-Xbootclasspath:" + rt_jar, "-XDprocess.packages", "-proc:only", "-processor", "com.sun.tools.javac.sym.CreateSymbols", "-Acom.sun.tools.javac.sym.Jar=" + rt_jar, "-Acom.sun.tools.javac.sym.Dest=" + dest, "java.applet", "java.awt", "java.awt.color", "java.awt.datatransfer", "java.awt.dnd", "java.awt.event", "java.awt.font", "java.awt.geom", "java.awt.im", "java.awt.im.spi", "java.awt.image", "java.awt.image.renderable", "java.awt.print", "java.beans", "java.beans.beancontext", "java.io", "java.lang", "java.lang.annotation", "java.lang.instrument", "java.lang.management", "java.lang.ref", "java.lang.reflect", "java.math", "java.net", "java.nio", "java.nio.channels", "java.nio.channels.spi", "java.nio.charset", "java.nio.charset.spi", "java.rmi", "java.rmi.activation", "java.rmi.dgc", "java.rmi.registry", "java.rmi.server", "java.security", "java.security.acl", "java.security.cert", "java.security.interfaces", "java.security.spec", "java.sql", "java.text", "java.text.spi", "java.util", "java.util.concurrent", "java.util.concurrent.atomic", "java.util.concurrent.locks", "java.util.jar", "java.util.logging", "java.util.prefs", "java.util.regex", "java.util.spi", "java.util.zip", "javax.accessibility", "javax.activation", "javax.activity", "javax.annotation", "javax.annotation.processing", "javax.crypto", "javax.crypto.interfaces", "javax.crypto.spec", "javax.imageio", "javax.imageio.event", "javax.imageio.metadata", "javax.imageio.plugins.jpeg", "javax.imageio.plugins.bmp", "javax.imageio.spi", "javax.imageio.stream", "javax.jws", "javax.jws.soap", "javax.lang.model", "javax.lang.model.element", "javax.lang.model.type", "javax.lang.model.util", "javax.management", "javax.management.loading", "javax.management.monitor", "javax.management.relation", "javax.management.openmbean", "javax.management.timer", "javax.management.modelmbean", "javax.management.remote", "javax.management.remote.rmi", "javax.naming", "javax.naming.directory", "javax.naming.event", "javax.naming.ldap", "javax.naming.spi", "javax.net", "javax.net.ssl", "javax.print", "javax.print.attribute", "javax.print.attribute.standard", "javax.print.event", "javax.rmi", "javax.rmi.CORBA", "javax.rmi.ssl", "javax.script", "javax.security.auth", "javax.security.auth.callback", "javax.security.auth.kerberos", "javax.security.auth.login", "javax.security.auth.spi", "javax.security.auth.x500", "javax.security.cert", "javax.security.sasl", "javax.sound.sampled", "javax.sound.sampled.spi", "javax.sound.midi", "javax.sound.midi.spi", "javax.sql", "javax.sql.rowset", "javax.sql.rowset.serial", "javax.sql.rowset.spi", "javax.swing", "javax.swing.border", "javax.swing.colorchooser", "javax.swing.filechooser", "javax.swing.event", "javax.swing.table", "javax.swing.text", "javax.swing.text.html", "javax.swing.text.html.parser", "javax.swing.text.rtf", "javax.swing.tree", "javax.swing.undo", "javax.swing.plaf", "javax.swing.plaf.basic", "javax.swing.plaf.metal", "javax.swing.plaf.multi", "javax.swing.plaf.synth", "javax.tools", "javax.transaction", "javax.transaction.xa", "javax.xml.parsers", "javax.xml.bind", "javax.xml.bind.annotation", "javax.xml.bind.annotation.adapters", "javax.xml.bind.attachment", "javax.xml.bind.helpers", "javax.xml.bind.util", "javax.xml.soap", "javax.xml.ws", "javax.xml.ws.handler", "javax.xml.ws.handler.soap", "javax.xml.ws.http", "javax.xml.ws.soap", "javax.xml.ws.spi", "javax.xml.transform", "javax.xml.transform.sax", "javax.xml.transform.dom", "javax.xml.transform.stax", "javax.xml.transform.stream", "javax.xml", "javax.xml.crypto", "javax.xml.crypto.dom", "javax.xml.crypto.dsig", "javax.xml.crypto.dsig.dom", "javax.xml.crypto.dsig.keyinfo", "javax.xml.crypto.dsig.spec", "javax.xml.datatype", "javax.xml.validation", "javax.xml.namespace", "javax.xml.xpath", "javax.xml.stream", "javax.xml.stream.events", "javax.xml.stream.util", "org.ietf.jgss", "org.omg.CORBA", "org.omg.CORBA.DynAnyPackage", "org.omg.CORBA.ORBPackage", "org.omg.CORBA.TypeCodePackage", "org.omg.stub.java.rmi", "org.omg.CORBA.portable", "org.omg.CORBA_2_3", "org.omg.CORBA_2_3.portable", "org.omg.CosNaming", "org.omg.CosNaming.NamingContextExtPackage", "org.omg.CosNaming.NamingContextPackage", "org.omg.SendingContext", "org.omg.PortableServer", "org.omg.PortableServer.CurrentPackage", "org.omg.PortableServer.POAPackage", "org.omg.PortableServer.POAManagerPackage", "org.omg.PortableServer.ServantLocatorPackage", "org.omg.PortableServer.portable", "org.omg.PortableInterceptor", "org.omg.PortableInterceptor.ORBInitInfoPackage", "org.omg.Messaging", "org.omg.IOP", "org.omg.IOP.CodecFactoryPackage", "org.omg.IOP.CodecPackage", "org.omg.Dynamic", "org.omg.DynamicAny", "org.omg.DynamicAny.DynAnyPackage", "org.omg.DynamicAny.DynAnyFactoryPackage", "org.w3c.dom", "org.w3c.dom.events", "org.w3c.dom.bootstrap", "org.w3c.dom.ls", "org.xml.sax", "org.xml.sax.ext", "org.xml.sax.helpers", "com.sun.java.browser.dom", "org.w3c.dom", "org.w3c.dom.bootstrap", "org.w3c.dom.ls", "org.w3c.dom.ranges", "org.w3c.dom.traversal", "org.w3c.dom.html", "org.w3c.dom.stylesheets", "org.w3c.dom.css", "org.w3c.dom.events", "org.w3c.dom.views", "com.sun.management", "com.sun.security.auth", "com.sun.security.auth.callback", "com.sun.security.auth.login", "com.sun.security.auth.module", "com.sun.security.jgss", "com.sun.net.httpserver", "com.sun.net.httpserver.spi", "javax.smartcardio"});
    }

    @Override
    public boolean process(Set<? extends TypeElement> tes, RoundEnvironment renv) {
        try {
            if (renv.processingOver()) {
                createSymbols();
                return true;
            }
            return true;
        } catch (IOException e) {
            this.processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, e.getLocalizedMessage());
            return true;
        } catch (Throwable t) {
            Throwable cause = t.getCause();
            if (cause == null) {
                cause = t;
            }
            this.processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, cause.getLocalizedMessage());
            return true;
        }
    }

    void createSymbols() throws IOException {
        Set<String> legacy;
        Set<String> legacy2;
        List<Attribute.Compound> listPrepend;
        Set<String> hiddenPackages = getLegacyPackages();
        Set<String> legacyProprietary = getLegacyPackages();
        Set<String> documented = new HashSet<>();
        Set<Symbol.PackageSymbol> packages = ((JavacProcessingEnvironment) this.processingEnv).getSpecifiedPackages();
        String jarName = this.processingEnv.getOptions().get("com.sun.tools.javac.sym.Jar");
        if (jarName == null) {
            throw new RuntimeException("Must use -Acom.sun.tools.javac.sym.Jar=LOCATION_OF_JAR");
        }
        String destName = this.processingEnv.getOptions().get("com.sun.tools.javac.sym.Dest");
        if (destName == null) {
            throw new RuntimeException("Must use -Acom.sun.tools.javac.sym.Dest=LOCATION_OF_JAR");
        }
        for (Symbol.PackageSymbol psym : packages) {
            String name = psym.getQualifiedName().toString();
            legacyProprietary.remove(name);
            documented.add(name);
        }
        JavaCompiler tool = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fm = tool.getStandardFileManager(null, null, null);
        JavaFileManager.Location jarLocation = StandardLocation.locationFor(jarName);
        File jarFile = new File(jarName);
        fm.setLocation(jarLocation, List.m508of(jarFile));
        fm.setLocation(StandardLocation.CLASS_PATH, List.m507nil());
        fm.setLocation(StandardLocation.SOURCE_PATH, List.m507nil());
        ArrayList<File> bootClassPath = new ArrayList<>();
        bootClassPath.add(jarFile);
        for (File path : fm.getLocation(StandardLocation.PLATFORM_CLASS_PATH)) {
            Set<Symbol.PackageSymbol> packages2 = packages;
            if (!new File(path.getName()).equals(new File("rt.jar"))) {
                bootClassPath.add(path);
            }
            packages = packages2;
        }
        System.err.println("Using boot class path = " + bootClassPath);
        fm.setLocation(StandardLocation.PLATFORM_CLASS_PATH, bootClassPath);
        File destDir = new File(destName);
        if (!destDir.exists() && !destDir.mkdirs()) {
            throw new RuntimeException("Could not create " + destDir);
        }
        fm.setLocation(StandardLocation.CLASS_OUTPUT, List.m508of(destDir));
        Set<String> hiddenPackages2 = new HashSet<>();
        Set<String> crisp = new HashSet<>();
        List<String> options = List.m508of("-XDdev");
        Set<String> legacyProprietary2 = crisp;
        JavacTaskImpl task = (JavacTaskImpl) tool.getTask(null, fm, null, options, null, null);
        com.sun.tools.javac.main.JavaCompiler compiler = com.sun.tools.javac.main.JavaCompiler.instance(task.getContext());
        ClassReader.instance(task.getContext());
        ClassWriter writer = ClassWriter.instance(task.getContext());
        Symtab syms = Symtab.instance(task.getContext());
        Attribute.Compound proprietary = new Attribute.Compound(syms.proprietaryType, List.m507nil());
        Type.moreInfo = true;
        Pool pool = new Pool();
        String str = "";
        Iterator<JavaFileObject> it = fm.list(jarLocation, "", EnumSet.of(JavaFileObject.Kind.CLASS), true).iterator();
        while (it.hasNext()) {
            JavaFileObject file = it.next();
            it = it;
            String className = fm.inferBinaryName(jarLocation, file);
            int index = className.lastIndexOf(46);
            str = str;
            String pckName = index == -1 ? str : className.substring(0, index);
            boolean addLegacyAnnotation = false;
            if (documented.contains(pckName)) {
                if (hiddenPackages.contains(pckName)) {
                    legacy = hiddenPackages;
                    legacy2 = legacyProprietary2;
                } else {
                    legacy = hiddenPackages;
                    legacy2 = legacyProprietary2;
                    legacy2.add(pckName);
                }
            } else {
                legacy = hiddenPackages;
                legacy2 = legacyProprietary2;
                if (legacyProprietary.contains(pckName)) {
                    addLegacyAnnotation = true;
                } else {
                    hiddenPackages2.add(pckName);
                    hiddenPackages = legacy;
                    legacyProprietary2 = legacy2;
                }
            }
            Set<String> crisp2 = legacy2;
            Symbol.TypeSymbol sym = (Symbol.TypeSymbol) compiler.resolveIdent(className);
            Set<String> legacyProprietary3 = legacyProprietary;
            Set<String> documented2 = documented;
            if (sym.kind != 2) {
                if (className.indexOf(36) < 0) {
                    System.err.println("Ignoring (other) " + className + " : " + sym);
                    System.err.println("   " + sym.getClass().getSimpleName() + " " + sym.type);
                    legacyProprietary = legacyProprietary3;
                    hiddenPackages = legacy;
                    legacyProprietary2 = crisp2;
                    documented = documented2;
                } else {
                    legacyProprietary = legacyProprietary3;
                    hiddenPackages = legacy;
                    legacyProprietary2 = crisp2;
                    documented = documented2;
                }
            } else {
                sym.complete();
                if (sym.getEnclosingElement().getKind() != ElementKind.PACKAGE) {
                    System.err.println("Ignoring (bad) " + ((Object) sym.getQualifiedName()));
                    legacyProprietary = legacyProprietary3;
                    hiddenPackages = legacy;
                    legacyProprietary2 = crisp2;
                    documented = documented2;
                } else {
                    Symbol.ClassSymbol cs = (Symbol.ClassSymbol) sym;
                    if (addLegacyAnnotation) {
                        if (cs.attributes_field == null) {
                            listPrepend = List.m508of(proprietary);
                        } else {
                            listPrepend = cs.attributes_field.prepend(proprietary);
                        }
                        cs.attributes_field = listPrepend;
                    }
                    writeClass(pool, cs, writer);
                    legacyProprietary = legacyProprietary3;
                    hiddenPackages = legacy;
                    legacyProprietary2 = crisp2;
                    documented = documented2;
                }
            }
        }
    }

    void writeClass(Pool pool, Symbol.ClassSymbol cs, ClassWriter writer) throws IOException {
        try {
            pool.reset();
            cs.pool = pool;
            writer.writeClass(cs);
            for (Scope.Entry e = cs.members().elems; e != null; e = e.sibling) {
                if (e.f338sym.kind == 2) {
                    Symbol.ClassSymbol nestedClass = (Symbol.ClassSymbol) e.f338sym;
                    nestedClass.complete();
                    writeClass(pool, nestedClass, writer);
                }
            }
        } catch (ClassWriter.PoolOverflow ex) {
            throw new RuntimeException(ex);
        } catch (ClassWriter.StringOverflow ex2) {
            throw new RuntimeException(ex2);
        }
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}
