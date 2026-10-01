package sun.misc;

import java.io.File;
import java.io.FileDescriptor;
import java.security.ProtectionDomain;
import java.util.jar.JarFile;

public class SharedSecrets {
    private static JavaIOAccess javaIOAccess;
    private static JavaIODeleteOnExitAccess javaIODeleteOnExitAccess;
    private static JavaIOFileDescriptorAccess javaIOFileDescriptorAccess;
    private static JavaLangAccess javaLangAccess;
    private static JavaNetAccess javaNetAccess;
    private static JavaSecurityProtectionDomainAccess javaSecurityProtectionDomainAccess;
    private static JavaUtilJarAccess javaUtilJarAccess;
    private static final Unsafe unsafe = Unsafe.getUnsafe();

    public static JavaUtilJarAccess javaUtilJarAccess() {
        if (javaUtilJarAccess == null) {
            unsafe.ensureClassInitialized(JarFile.class);
        }
        return javaUtilJarAccess;
    }

    public static void setJavaUtilJarAccess(JavaUtilJarAccess access) {
        javaUtilJarAccess = access;
    }

    public static void setJavaLangAccess(JavaLangAccess jla) {
        javaLangAccess = jla;
    }

    public static JavaLangAccess getJavaLangAccess() {
        return javaLangAccess;
    }

    public static void setJavaNetAccess(JavaNetAccess jna) {
        javaNetAccess = jna;
    }

    public static JavaNetAccess getJavaNetAccess() {
        return javaNetAccess;
    }

    public static void setJavaIOAccess(JavaIOAccess jia) {
        javaIOAccess = jia;
    }

    public static JavaIOAccess getJavaIOAccess() {
        return javaIOAccess;
    }

    public static void setJavaIODeleteOnExitAccess(JavaIODeleteOnExitAccess jida) {
        javaIODeleteOnExitAccess = jida;
    }

    public static JavaIODeleteOnExitAccess getJavaIODeleteOnExitAccess() {
        if (javaIODeleteOnExitAccess == null) {
            unsafe.ensureClassInitialized(File.class);
        }
        return javaIODeleteOnExitAccess;
    }

    public static void setJavaIOFileDescriptorAccess(JavaIOFileDescriptorAccess jiofda) {
        javaIOFileDescriptorAccess = jiofda;
    }

    public static JavaIOFileDescriptorAccess getJavaIOFileDescriptorAccess() {
        if (javaIOFileDescriptorAccess == null) {
            unsafe.ensureClassInitialized(FileDescriptor.class);
        }
        return javaIOFileDescriptorAccess;
    }

    public static void setJavaSecurityProtectionDomainAccess(JavaSecurityProtectionDomainAccess jspda) {
        javaSecurityProtectionDomainAccess = jspda;
    }

    public static JavaSecurityProtectionDomainAccess getJavaSecurityProtectionDomainAccess() {
        if (javaSecurityProtectionDomainAccess == null) {
            unsafe.ensureClassInitialized(ProtectionDomain.class);
        }
        return javaSecurityProtectionDomainAccess;
    }
}
