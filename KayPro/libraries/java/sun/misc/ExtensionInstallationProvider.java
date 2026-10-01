package sun.misc;

public interface ExtensionInstallationProvider {
    boolean installExtension(ExtensionInfo extensionInfo, ExtensionInfo extensionInfo2) throws ExtensionInstallationException;
}
