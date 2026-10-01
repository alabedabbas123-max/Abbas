package org.b.a.b;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class Abstractf {

    static final Interfacee f5445a;

    private static final Map f5446b;

    private static final byte[] f5447c;

    static {
        HashMap map = new HashMap();
        ClassG c1815g = new ClassG(new char[]{199, 252, 233, 226, 228, 224, 229, 231, 234, 235, 232, 239, 238, 236, 196, 197, 201, 230, 198, 244, 246, 242, 251, 249, 255, 214, 220, 162, 163, 165, 8359, 402, 225, 237, 243, 250, 241, 209, 170, 186, 191, 8976, 172, 189, 188, 161, 171, 187, 9617, 9618, 9619, 9474, 9508, 9569, 9570, 9558, 9557, 9571, 9553, 9559, 9565, 9564, 9563, 9488, 9492, 9524, 9516, 9500, 9472, 9532, 9566, 9567, 9562, 9556, 9577, 9574, 9568, 9552, 9580, 9575, 9576, 9572, 9573, 9561, 9560, 9554, 9555, 9579, 9578, 9496, 9484, 9608, 9604, 9612, 9616, 9600, 945, 223, 915, 960, 931, 963, 181, 964, 934, 920, 937, 948, 8734, 966, 949, 8745, 8801, 177, 8805, 8804, 8992, 8993, 247, 8776, 176, 8729, 183, 8730, 8319, 178, 9632, 160});
        map.put("CP437", c1815g);
        map.put("Cp437", c1815g);
        map.put("cp437", c1815g);
        map.put("IBM437", c1815g);
        map.put("ibm437", c1815g);
        ClassG c1815g2 = new ClassG(new char[]{199, 252, 233, 226, 228, 224, 229, 231, 234, 235, 232, 239, 238, 236, 196, 197, 201, 230, 198, 244, 246, 242, 251, 249, 255, 214, 220, 248, 163, 216, 215, 402, 225, 237, 243, 250, 241, 209, 170, 186, 191, 174, 172, 189, 188, 161, 171, 187, 9617, 9618, 9619, 9474, 9508, 193, 194, 192, 169, 9571, 9553, 9559, 9565, 162, 165, 9488, 9492, 9524, 9516, 9500, 9472, 9532, 227, 195, 9562, 9556, 9577, 9574, 9568, 9552, 9580, 164, 240, 208, 202, 203, 200, 305, 205, 206, 207, 9496, 9484, 9608, 9604, 166, 204, 9600, 211, 223, 212, 210, 245, 213, 181, 254, 222, 218, 219, 217, 253, 221, 175, 180, 173, 177, 8215, 190, 182, 167, 247, 184, 176, 168, 183, 185, 179, 178, 9632, 160});
        map.put("CP850", c1815g2);
        map.put("Cp850", c1815g2);
        map.put("cp850", c1815g2);
        map.put("IBM850", c1815g2);
        map.put("ibm850", c1815g2);
        f5446b = Collections.unmodifiableMap(map);
        f5447c = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        f5445a = new ClassA("UTF8");
    }

    public static Interfacee m7557a(String str) {
        if (m7558b(str)) {
            return f5445a;
        }
        if (str == null) {
            return new ClassA();
        }
        ClassG c1815g = (ClassG) f5446b.get(str);
        if (c1815g != null) {
            return c1815g.m7559a();
        }
        try {
            return new ClassB(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            return new ClassA(str);
        }
    }

    static boolean m7558b(String str) {
        if (str == null) {
            str = System.getProperty("file.encoding");
        }
        return "UTF8".equalsIgnoreCase(str) || "utf-8".equalsIgnoreCase(str);
    }
}
