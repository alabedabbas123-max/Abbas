package sun.misc;

import java.security.PermissionCollection;
import java.security.ProtectionDomain;

public interface JavaSecurityProtectionDomainAccess {

    public interface ProtectionDomainCache {
        PermissionCollection m536get(ProtectionDomain protectionDomain);

        void m537put(ProtectionDomain protectionDomain, PermissionCollection permissionCollection);
    }

    ProtectionDomainCache getProtectionDomainCache();
}
