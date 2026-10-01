package sun.misc;

import com.spartacusrex.spartacuside.helper.ParseUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public class ExtensionDependency {
    static final boolean DEBUG = false;
    private static Vector providers;

    public static synchronized void addExtensionInstallationProvider(ExtensionInstallationProvider eip) {
        if (providers == null) {
            providers = new Vector();
        }
        providers.add(eip);
    }

    public static synchronized void removeExtensionInstallationProvider(ExtensionInstallationProvider eip) {
        providers.remove(eip);
    }

    public static boolean checkExtensionsDependencies(JarFile jar) {
        if (providers == null) {
            return true;
        }
        try {
            ExtensionDependency extDep = new ExtensionDependency();
            return extDep.checkExtensions(jar);
        } catch (ExtensionInstallationException e) {
            debug(e.getMessage());
            return false;
        }
    }

    protected boolean checkExtensions(JarFile jar) throws ExtensionInstallationException {
        try {
            Manifest man = jar.getManifest();
            if (man == null) {
                return true;
            }
            boolean result = true;
            Attributes attr = man.getMainAttributes();
            if (attr != null) {
                String value = attr.getValue(Attributes.Name.EXTENSION_LIST);
                if (value != null) {
                    StringTokenizer st = new StringTokenizer(value);
                    while (st.hasMoreTokens()) {
                        String extensionName = st.nextToken();
                        debug("The file " + jar.getName() + " appears to depend on " + extensionName);
                        StringBuilder sb = new StringBuilder();
                        sb.append(extensionName);
                        sb.append("-");
                        sb.append(Attributes.Name.EXTENSION_NAME.toString());
                        String extName = sb.toString();
                        if (attr.getValue(extName) == null) {
                            debug("The jar file " + jar.getName() + " appers to depend on " + extensionName + " but does not define the " + extName + " attribute in its manifest ");
                        } else if (!checkExtension(extensionName, attr)) {
                            debug("Failed installing " + extensionName);
                            result = false;
                        }
                    }
                } else {
                    debug("No dependencies for " + jar.getName());
                }
            }
            return result;
        } catch (IOException e) {
            return false;
        }
    }

    protected synchronized boolean checkExtension(String extensionName, Attributes attr) throws ExtensionInstallationException {
        debug("Checking extension " + extensionName);
        if (checkExtensionAgainstInstalled(extensionName, attr)) {
            return true;
        }
        debug("Extension not currently installed ");
        ExtensionInfo reqInfo = new ExtensionInfo(extensionName, attr);
        return installExtension(reqInfo, null);
    }

    boolean checkExtensionAgainstInstalled(String extensionName, Attributes attr) throws ExtensionInstallationException {
        File fExtension = checkExtensionExists(extensionName);
        if (fExtension != null) {
            try {
                return checkExtensionAgainst(extensionName, attr, fExtension);
            } catch (FileNotFoundException e) {
                debugException(e);
            } catch (IOException e2) {
                debugException(e2);
            }
        } else {
            try {
                File[] installedExts = getInstalledExtensions();
                for (File file : installedExts) {
                    try {
                        if (checkExtensionAgainst(extensionName, attr, file)) {
                            return true;
                        }
                    } catch (FileNotFoundException e3) {
                        debugException(e3);
                    } catch (IOException e4) {
                        debugException(e4);
                    }
                }
                return false;
            } catch (IOException e5) {
                debugException(e5);
                return false;
            }
        }
    }

    protected boolean checkExtensionAgainst(String extensionName, Attributes attr, final File file) throws ExtensionInstallationException, IOException {
        Attributes instAttr;
        debug("Checking extension " + extensionName + " against " + file.getName());
        try {
            Manifest man = (Manifest) AccessController.doPrivileged(new PrivilegedExceptionAction() {
                @Override
                public Object run() throws IOException {
                    if (!file.exists()) {
                        throw new FileNotFoundException(file.getName());
                    }
                    JarFile jarFile = new JarFile(file);
                    return jarFile.getManifest();
                }
            });
            ExtensionInfo reqInfo = new ExtensionInfo(extensionName, attr);
            debug("Requested Extension : " + reqInfo);
            if (man == null || (instAttr = man.getMainAttributes()) == null) {
                return false;
            }
            ExtensionInfo instInfo = new ExtensionInfo(null, instAttr);
            debug("Extension Installed " + instInfo);
            int isCompatible = instInfo.isCompatibleWith(reqInfo);
            if (isCompatible == 0) {
                debug("Extensions are compatible");
                return true;
            }
            if (isCompatible == 4) {
                debug("Extensions are incompatible");
                return false;
            }
            debug("Extensions require an upgrade or vendor switch");
            return installExtension(reqInfo, instInfo);
        } catch (PrivilegedActionException e) {
            if (e.getException() instanceof FileNotFoundException) {
                throw ((FileNotFoundException) e.getException());
            }
            throw ((IOException) e.getException());
        }
    }

    protected boolean installExtension(ExtensionInfo reqInfo, ExtensionInfo instInfo) throws ExtensionInstallationException {
        Vector currentProviders;
        synchronized (providers) {
            currentProviders = (Vector) providers.clone();
        }
        Enumeration e = currentProviders.elements();
        while (e.hasMoreElements()) {
            ExtensionInstallationProvider eip = (ExtensionInstallationProvider) e.nextElement();
            if (eip != null && eip.installExtension(reqInfo, instInfo)) {
                debug(reqInfo.name + " installation successful");
                Launcher.ExtClassLoader cl = (Launcher.ExtClassLoader) Launcher.getLauncher().getClassLoader().getParent();
                addNewExtensionsToClassLoader(cl);
                return true;
            }
        }
        debug(reqInfo.name + " installation failed");
        return false;
    }

    private File checkExtensionExists(final String extensionName) {
        final String[] fileExt = {".jar", ".zip"};
        return (File) AccessController.doPrivileged(new PrivilegedAction() {
            @Override
            public Object run() {
                File fExtension;
                try {
                    File[] dirs = ExtensionDependency.getExtDirs();
                    for (int i = 0; i < dirs.length; i++) {
                        for (int j = 0; j < fileExt.length; j++) {
                            if (extensionName.toLowerCase().endsWith(fileExt[j])) {
                                fExtension = new File(dirs[i], extensionName);
                            } else {
                                fExtension = new File(dirs[i], extensionName + fileExt[j]);
                            }
                            ExtensionDependency.debug("checkExtensionExists:fileName " + fExtension.getName());
                            if (fExtension.exists()) {
                                return fExtension;
                            }
                        }
                    }
                    return null;
                } catch (Exception e) {
                    ExtensionDependency.this.debugException(e);
                    return null;
                }
            }
        });
    }

    public static File[] getExtDirs() {
        StringTokenizer st = new StringTokenizer("", File.pathSeparator);
        int count = st.countTokens();
        debug("getExtDirs count " + count);
        File[] dirs = new File[count];
        for (int i = 0; i < count; i++) {
            dirs[i] = new File(st.nextToken());
            debug("getExtDirs dirs[" + i + "] " + dirs[i]);
        }
        debug("getExtDirs dirs.length " + dirs.length);
        return dirs;
    }

    public static File[] getExtFiles(File[] dirs) throws IOException {
        Vector urls = new Vector();
        for (int i = 0; i < dirs.length; i++) {
            String[] files = dirs[i].list(new JarFilter());
            if (files != null) {
                debug("getExtFiles files.length " + files.length);
                for (int j = 0; j < files.length; j++) {
                    File f = new File(dirs[i], files[j]);
                    urls.add(f);
                    debug("getExtFiles f[" + j + "] " + f);
                }
            }
        }
        int i2 = urls.size();
        File[] ua = new File[i2];
        urls.copyInto(ua);
        debug("getExtFiles ua.length " + ua.length);
        return ua;
    }

    private File[] getInstalledExtensions() throws IOException {
        return (File[]) AccessController.doPrivileged(new PrivilegedAction() {
            @Override
            public Object run() {
                try {
                    return ExtensionDependency.getExtFiles(ExtensionDependency.getExtDirs());
                } catch (IOException e) {
                    ExtensionDependency.debug("Cannot get list of installed extensions");
                    ExtensionDependency.this.debugException(e);
                    return new URL[0];
                }
            }
        });
    }

    private Boolean addNewExtensionsToClassLoader(Launcher.ExtClassLoader cl) {
        try {
            File[] installedExts = getInstalledExtensions();
            for (final File instFile : installedExts) {
                URL instURL = (URL) AccessController.doPrivileged(new PrivilegedAction<URL>() {
                    @Override
                    public URL run() {
                        try {
                            return ParseUtil.fileToEncodedURL(instFile);
                        } catch (MalformedURLException e) {
                            ExtensionDependency.this.debugException(e);
                            return null;
                        }
                    }
                });
                if (instURL != null) {
                    URL[] urls = cl.getURLs();
                    boolean found = false;
                    for (int j = 0; j < urls.length; j++) {
                        debug("URL[" + j + "] is " + urls[j] + " looking for " + instURL);
                        if (urls[j].toString().compareToIgnoreCase(instURL.toString()) == 0) {
                            found = true;
                            debug("Found !");
                        }
                    }
                    if (!found) {
                        debug("Not Found ! adding to the classloader " + instURL);
                        cl.addExtURL(instURL);
                    }
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return Boolean.TRUE;
    }

    public static void debug(String s) {
    }

    public void debugException(Throwable e) {
    }
}
