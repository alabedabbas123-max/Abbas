package sun.misc;

import java.io.File;
import java.io.FilePermission;
import java.io.IOException;
import java.net.URL;
import java.security.AccessController;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.PropertyPermission;
import sun.security.util.SecurityConstants;

class Launcher2 extends PermissionCollection {
    private static final long serialVersionUID = 8133287259134945693L;
    private File[] path;
    private Permissions perms = null;
    URL codeBase = null;

    Launcher2(File[] path) {
        this.path = path;
    }

    URL getCodeBase() {
        return this.codeBase;
    }

    @Override
    public void add(Permission permission) {
        throw new SecurityException("attempt to add a permission");
    }

    private synchronized void init() {
        if (this.perms != null) {
            return;
        }
        Permissions permissions = new Permissions();
        this.perms = permissions;
        permissions.add(SecurityConstants.CREATE_CLASSLOADER_PERMISSION);
        this.perms.add(new PropertyPermission("java.*", "read"));
        AccessController.doPrivileged(new PrivilegedAction() {
            @Override
            public Object run() {
                String path;
                for (int i = 0; i < Launcher2.this.path.length; i++) {
                    File f = Launcher2.this.path[i];
                    try {
                        path = f.getCanonicalPath();
                    } catch (IOException e) {
                        path = f.getAbsolutePath();
                    }
                    if (i == 0) {
                        Launcher2.this.codeBase = Launcher.getFileURL(new File(path));
                    }
                    if (f.isDirectory()) {
                        if (path.endsWith(File.separator)) {
                            Launcher2.this.perms.add(new FilePermission(path + "-", "read"));
                        } else {
                            Launcher2.this.perms.add(new FilePermission(path + File.separator + "-", "read"));
                        }
                    } else {
                        int endIndex = path.lastIndexOf(File.separatorChar);
                        if (endIndex != -1) {
                            Launcher2.this.perms.add(new FilePermission(path.substring(0, endIndex + 1) + "-", "read"));
                        }
                    }
                }
                return null;
            }
        });
    }

    @Override
    public boolean implies(Permission permission) {
        if (this.perms == null) {
            init();
        }
        return this.perms.implies(permission);
    }

    @Override
    public Enumeration elements() {
        Enumeration<Permission> enumerationElements;
        if (this.perms == null) {
            init();
        }
        synchronized (this.perms) {
            enumerationElements = this.perms.elements();
        }
        return enumerationElements;
    }

    public String toString() {
        if (this.perms == null) {
            init();
        }
        return this.perms.toString();
    }
}
