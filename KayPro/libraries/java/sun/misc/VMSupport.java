package sun.misc;

import com.sun.tools.javac.code.Flags;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public class VMSupport {
    private static Properties agentProps = null;

    private static native Properties initAgentProperties(Properties properties);

    public static synchronized Properties getAgentProperties() {
        if (agentProps == null) {
            Properties properties = new Properties();
            agentProps = properties;
            initAgentProperties(properties);
        }
        return agentProps;
    }

    private static byte[] serializePropertiesToByteArray(Properties p) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream(Flags.SYNTHETIC);
        Properties props = new Properties();
        props.store(out, (String) null);
        return out.toByteArray();
    }

    public static byte[] serializePropertiesToByteArray() throws IOException {
        return serializePropertiesToByteArray(System.getProperties());
    }

    public static byte[] serializeAgentPropertiesToByteArray() throws IOException {
        return serializePropertiesToByteArray(getAgentProperties());
    }

    public static boolean isClassPathAttributePresent(String path) {
        try {
            Manifest man = new JarFile(path).getManifest();
            if (man != null && man.getMainAttributes().getValue(Attributes.Name.CLASS_PATH) != null) {
                return true;
            }
            return false;
        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }
    }
}
