package org.objectweb.asm;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttBootstrapMethods;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttDeprecated;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttEnclosingMethod;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttInnerClasses;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSignature;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceDebugExtension;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceFile;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSynthetic;
import com.almlkaide.kaypro.android.dx.io.Opcodes;
import org.apache.commons.io.FilenameUtils;

public class ClassWriter extends ClassVisitor {
    public static final int COMPUTE_FRAMES = 2;
    public static final int COMPUTE_MAXS = 1;

    static final byte[] f6447a;

    ByteVector f6448A;

    FieldWriter f6449B;

    FieldWriter f6450C;

    MethodWriter f6451D;

    MethodWriter f6452E;

    private short f6453G;

    Item[] f6454H;

    String f6455I;

    private boolean f6456J;

    private boolean f6457K;

    boolean f6458L;

    ClassReader f6459M;

    private AnnotationWriter f6460N;

    private AnnotationWriter f6461O;

    int f6462b;

    int f6463c;

    final ByteVector f6464d;

    Item[] f6465e;

    int f6466f;

    final Item f6467g;

    final Item f6468h;

    final Item f6469i;

    final Item f6470j;

    private int f6471k;

    private int f6472l;

    private int f6473m;

    private int f6474n;

    private int f6475o;

    private int[] f6476p;

    private int f6477q;

    private ByteVector f6478r;

    private int f6479s;

    private int f6480t;

    private AnnotationWriter f6481u;

    private AnnotationWriter f6482v;

    private Attribute f6483w;

    private int f6484x;

    private ByteVector f6485y;

    int f6486z;

    static {
        _clinit_();
        byte[] bArr = new byte[Opcodes.REM_INT_LIT8];
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) ("AAAAAAAAAAAAAAAABCLMMDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAJJJJJJJJJJJJJJJJDOPAAAAAAGGGGGGGHIFBFAAFFAARQJJKKJJJJJJJJJJJJJJJJJJ".charAt(i) - 'A');
        }
        f6447a = bArr;
    }

    public ClassWriter(int i) {
        super(Opcodes.ASM5);
        this.f6463c = 1;
        this.f6464d = new ByteVector();
        this.f6465e = new Item[256];
        this.f6466f = (int) (0.75d * ((double) this.f6465e.length));
        this.f6467g = new Item();
        this.f6468h = new Item();
        this.f6469i = new Item();
        this.f6470j = new Item();
        this.f6457K = (i & 1) != 0;
        this.f6456J = (i & 2) != 0;
    }

    public ClassWriter(ClassReader classReader, int i) {
        this(i);
        classReader.m8916a(this);
        this.f6459M = classReader;
    }

    static void _clinit_() {
    }

    private Item m8917a(Item item) {
        Item item2 = this.f6465e[item.f6549j % this.f6465e.length];
        while (item2 != null && (item2.f6543b != item.f6543b || !item.m8962a(item2))) {
            item2 = item2.f6550k;
        }
        return item2;
    }

    private void m8918a(int i, int i2, int i3) {
        this.f6464d.m8898b(i, i2).putShort(i3);
    }

    private Item m8919b(String str) {
        this.f6468h.m8959a(8, str, null, null);
        Item itemM8917a = m8917a(this.f6468h);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        this.f6464d.m8898b(8, newUTF8(str));
        int i = this.f6463c;
        this.f6463c = i + 1;
        Item item = new Item(i, this.f6468h);
        m8921b(item);
        return item;
    }

    private void m8920b(int i, int i2, int i3) {
        this.f6464d.m8897a(i, i2).putShort(i3);
    }

    private void m8921b(Item item) {
        if (this.f6463c + this.f6453G > this.f6466f) {
            int length = this.f6465e.length;
            int i = (length * 2) + 1;
            Item[] itemArr = new Item[i];
            for (int i2 = length - 1; i2 >= 0; i2--) {
                Item item2 = this.f6465e[i2];
                while (item2 != null) {
                    int length2 = item2.f6549j % itemArr.length;
                    Item item3 = item2.f6550k;
                    item2.f6550k = itemArr[length2];
                    itemArr[length2] = item2;
                    item2 = item3;
                }
            }
            this.f6465e = itemArr;
            this.f6466f = (int) (((double) i) * 0.75d);
        }
        int length3 = item.f6549j % this.f6465e.length;
        item.f6550k = this.f6465e[length3];
        this.f6465e[length3] = item;
    }

    private Item m8922c(Item item) {
        this.f6453G = (short) (this.f6453G + 1);
        Item item2 = new Item(this.f6453G, this.f6467g);
        m8921b(item2);
        if (this.f6454H == null) {
            this.f6454H = new Item[16];
        }
        if (this.f6453G == this.f6454H.length) {
            Item[] itemArr = new Item[this.f6454H.length * 2];
            System.arraycopy(this.f6454H, 0, itemArr, 0, this.f6454H.length);
            this.f6454H = itemArr;
        }
        this.f6454H[this.f6453G] = item2;
        return item2;
    }

    int m8923a(int i, int i2) {
        this.f6468h.f6543b = 32;
        this.f6468h.f6545d = ((long) i) | (((long) i2) << 32);
        this.f6468h.f6549j = Integer.MAX_VALUE & (i + 32 + i2);
        Item itemM8917a = m8917a(this.f6468h);
        if (itemM8917a == null) {
            String str = this.f6454H[i].f6546g;
            String str2 = this.f6454H[i2].f6546g;
            this.f6468h.f6544c = m8936c(getCommonSuperClass(str, str2));
            itemM8917a = new Item(0, this.f6468h);
            m8921b(itemM8917a);
        }
        return itemM8917a.f6544c;
    }

    int m8924a(String str, int i) {
        this.f6467g.f6543b = 31;
        this.f6467g.f6544c = i;
        this.f6467g.f6546g = str;
        this.f6467g.f6549j = Integer.MAX_VALUE & (str.hashCode() + 31 + i);
        Item itemM8917a = m8917a(this.f6467g);
        if (itemM8917a == null) {
            itemM8917a = m8922c(this.f6467g);
        }
        return itemM8917a.f6542a;
    }

    Item m8925a(double d) {
        this.f6467g.m8955a(d);
        Item itemM8917a = m8917a(this.f6467g);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        this.f6464d.putByte(6).putLong(this.f6467g.f6545d);
        Item item = new Item(this.f6463c, this.f6467g);
        this.f6463c += 2;
        m8921b(item);
        return item;
    }

    Item m8926a(float f) {
        this.f6467g.m8956a(f);
        Item itemM8917a = m8917a(this.f6467g);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        this.f6464d.putByte(4).putInt(this.f6467g.f6544c);
        int i = this.f6463c;
        this.f6463c = i + 1;
        Item item = new Item(i, this.f6467g);
        m8921b(item);
        return item;
    }

    Item m8927a(int i) {
        this.f6467g.m8957a(i);
        Item itemM8917a = m8917a(this.f6467g);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        this.f6464d.putByte(3).putInt(i);
        int i2 = this.f6463c;
        this.f6463c = i2 + 1;
        Item item = new Item(i2, this.f6467g);
        m8921b(item);
        return item;
    }

    Item m8928a(int i, String str, String str2, String str3) {
        this.f6470j.m8959a(i + 20, str, str2, str3);
        Item itemM8917a = m8917a(this.f6470j);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        if (i <= 4) {
            m8920b(15, i, newField(str, str2, str3));
        } else {
            m8920b(15, i, newMethod(str, str2, str3, i == 9));
        }
        int i2 = this.f6463c;
        this.f6463c = i2 + 1;
        Item item = new Item(i2, this.f6470j);
        m8921b(item);
        return item;
    }

    Item m8929a(long j) {
        this.f6467g.m8960a(j);
        Item itemM8917a = m8917a(this.f6467g);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        this.f6464d.putByte(5).putLong(j);
        Item item = new Item(this.f6463c, this.f6467g);
        this.f6463c += 2;
        m8921b(item);
        return item;
    }

    Item m8930a(Object obj) {
        if (obj instanceof Integer) {
            return m8927a(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m8927a(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m8927a((int) ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m8927a(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m8927a(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m8926a(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return m8929a(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m8925a(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return m8919b((String) obj);
        }
        if (!(obj instanceof Type)) {
            if (!(obj instanceof Handle)) {
                throw new IllegalArgumentException(new StringBuffer().append("value ").append(obj).toString());
            }
            Handle handle = (Handle) obj;
            return m8928a(handle.f6532a, handle.f6533b, handle.f6534c, handle.f6535d);
        }
        Type type = (Type) obj;
        int sort = type.getSort();
        if (sort == 10) {
            return m8931a(type.getInternalName());
        }
        return sort == 11 ? m8937c(type.getDescriptor()) : m8931a(type.getDescriptor());
    }

    Item m8931a(String str) {
        this.f6468h.m8959a(7, str, null, null);
        Item itemM8917a = m8917a(this.f6468h);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        this.f6464d.m8898b(7, newUTF8(str));
        int i = this.f6463c;
        this.f6463c = i + 1;
        Item item = new Item(i, this.f6468h);
        m8921b(item);
        return item;
    }

    Item m8932a(String str, String str2) {
        this.f6468h.m8959a(12, str, str2, null);
        Item itemM8917a = m8917a(this.f6468h);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        m8918a(12, newUTF8(str), newUTF8(str2));
        int i = this.f6463c;
        this.f6463c = i + 1;
        Item item = new Item(i, this.f6468h);
        m8921b(item);
        return item;
    }

    Item m8933a(String str, String str2, String str3) {
        this.f6469i.m8959a(9, str, str2, str3);
        Item itemM8917a = m8917a(this.f6469i);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        m8918a(9, newClass(str), newNameType(str2, str3));
        int i = this.f6463c;
        this.f6463c = i + 1;
        Item item = new Item(i, this.f6469i);
        m8921b(item);
        return item;
    }

    Item m8934a(String str, String str2, String str3, boolean z) {
        int i = z ? 11 : 10;
        this.f6469i.m8959a(i, str, str2, str3);
        Item itemM8917a = m8917a(this.f6469i);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        m8918a(i, newClass(str), newNameType(str2, str3));
        int i2 = this.f6463c;
        this.f6463c = i2 + 1;
        Item item = new Item(i2, this.f6469i);
        m8921b(item);
        return item;
    }

    Item m8935a(String str, String str2, Handle handle, Object... objArr) {
        int i;
        ByteVector byteVector = this.f6448A;
        if (byteVector == null) {
            byteVector = new ByteVector();
            this.f6448A = byteVector;
        }
        int i2 = byteVector.f6440b;
        int iHashCode = handle.hashCode();
        byteVector.putShort(newHandle(handle.f6532a, handle.f6533b, handle.f6534c, handle.f6535d));
        int length = objArr.length;
        byteVector.putShort(length);
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
            byteVector.putShort(newConst(obj));
        }
        byte[] bArr = byteVector.f6439a;
        int i3 = iHashCode & Integer.MAX_VALUE;
        Item item = this.f6465e[i3 % this.f6465e.length];
        loop1: while (item != null) {
            if (item.f6543b == 33 && item.f6549j == i3) {
                int i4 = item.f6544c;
                int i5 = 0;
                while (true) {
                    if (i5 >= ((length + 2) << 1)) {
                        break loop1;
                    }
                    if (bArr[i2 + i5] != bArr[i4 + i5]) {
                        item = item.f6550k;
                        break;
                    }
                    i5++;
                }
            } else {
                item = item.f6550k;
            }
        }
        if (item != null) {
            int i6 = item.f6542a;
            byteVector.f6440b = i2;
            i = i6;
        } else {
            i = this.f6486z;
            this.f6486z = i + 1;
            Item item2 = new Item(i);
            item2.m8958a(i2, i3);
            m8921b(item2);
        }
        this.f6469i.m8961a(str, str2, i);
        Item itemM8917a = m8917a(this.f6469i);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        m8918a(18, i, newNameType(str, str2));
        int i7 = this.f6463c;
        this.f6463c = i7 + 1;
        Item item3 = new Item(i7, this.f6469i);
        m8921b(item3);
        return item3;
    }

    int m8936c(String str) {
        this.f6467g.m8959a(30, str, null, null);
        Item itemM8917a = m8917a(this.f6467g);
        if (itemM8917a == null) {
            itemM8917a = m8922c(this.f6467g);
        }
        return itemM8917a.f6542a;
    }

    Item m8937c(String str) {
        this.f6468h.m8959a(16, str, null, null);
        Item itemM8917a = m8917a(this.f6468h);
        if (itemM8917a != null) {
            return itemM8917a;
        }
        this.f6464d.m8898b(16, newUTF8(str));
        int i = this.f6463c;
        this.f6463c = i + 1;
        Item item = new Item(i, this.f6468h);
        m8921b(item);
        return item;
    }

    protected String getCommonSuperClass(String str, String str2) {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            Class<?> cls = Class.forName(str.replace('/', FilenameUtils.EXTENSION_SEPARATOR), false, classLoader);
            Class<?> cls2 = Class.forName(str2.replace('/', FilenameUtils.EXTENSION_SEPARATOR), false, classLoader);
            if (cls.isAssignableFrom(cls2)) {
                return str;
            }
            if (cls2.isAssignableFrom(cls)) {
                return str2;
            }
            if (cls.isInterface() || cls2.isInterface()) {
                return "java/lang/Object";
            }
            do {
                cls = cls.getSuperclass();
            } while (!cls.isAssignableFrom(cls2));
            return cls.getName().replace(FilenameUtils.EXTENSION_SEPARATOR, '/');
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }

    public int newClass(String str) {
        return m8931a(str).f6542a;
    }

    public int newConst(Object obj) {
        return m8930a(obj).f6542a;
    }

    public int newField(String str, String str2, String str3) {
        return m8933a(str, str2, str3).f6542a;
    }

    public int newHandle(int i, String str, String str2, String str3) {
        return m8928a(i, str, str2, str3).f6542a;
    }

    public int newInvokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        return m8935a(str, str2, handle, objArr).f6542a;
    }

    public int newMethod(String str, String str2, String str3, boolean z) {
        return m8934a(str, str2, str3, z).f6542a;
    }

    public int newMethodType(String str) {
        return m8937c(str).f6542a;
    }

    public int newNameType(String str, String str2) {
        return m8932a(str, str2).f6542a;
    }

    public int newUTF8(String str) {
        this.f6467g.m8959a(1, str, null, null);
        Item itemM8917a = m8917a(this.f6467g);
        if (itemM8917a == null) {
            this.f6464d.putByte(1).putUTF8(str);
            int i = this.f6463c;
            this.f6463c = i + 1;
            itemM8917a = new Item(i, this.f6467g);
            m8921b(itemM8917a);
        }
        return itemM8917a.f6542a;
    }

    public byte[] toByteArray() {
        int i;
        int iM8894a;
        int i2;
        if (this.f6463c > 65535) {
            throw new RuntimeException("Class file too large!");
        }
        int iM8891a = (this.f6475o * 2) + 24;
        FieldWriter fieldWriter = this.f6449B;
        int i3 = 0;
        while (fieldWriter != null) {
            iM8891a += fieldWriter.m8938a();
            fieldWriter = (FieldWriter) fieldWriter.f6511fv;
            i3++;
        }
        MethodWriter methodWriter = this.f6451D;
        int i4 = 0;
        while (methodWriter != null) {
            iM8891a += methodWriter.m8988a();
            methodWriter = (MethodWriter) methodWriter.f6563mv;
            i4++;
        }
        if (this.f6448A != null) {
            i = 1;
            iM8891a += this.f6448A.f6440b + 8;
            newUTF8(AttBootstrapMethods.ATTRIBUTE_NAME);
        } else {
            i = 0;
        }
        if (this.f6473m != 0) {
            i++;
            iM8891a += 8;
            newUTF8(AttSignature.ATTRIBUTE_NAME);
        }
        if (this.f6477q != 0) {
            i++;
            iM8891a += 8;
            newUTF8(AttSourceFile.ATTRIBUTE_NAME);
        }
        if (this.f6478r != null) {
            i++;
            iM8891a += this.f6478r.f6440b + 6;
            newUTF8(AttSourceDebugExtension.ATTRIBUTE_NAME);
        }
        if (this.f6479s != 0) {
            i++;
            iM8891a += 10;
            newUTF8(AttEnclosingMethod.ATTRIBUTE_NAME);
        }
        if ((this.f6471k & 131072) != 0) {
            i++;
            iM8891a += 6;
            newUTF8(AttDeprecated.ATTRIBUTE_NAME);
        }
        if ((this.f6471k & 4096) != 0 && ((this.f6462b & 65535) < 49 || (this.f6471k & 262144) != 0)) {
            i++;
            iM8891a += 6;
            newUTF8(AttSynthetic.ATTRIBUTE_NAME);
        }
        if (this.f6485y != null) {
            i++;
            iM8891a += this.f6485y.f6440b + 8;
            newUTF8(AttInnerClasses.ATTRIBUTE_NAME);
        }
        if (this.f6481u != null) {
            i++;
            iM8891a += this.f6481u.m8891a() + 8;
            newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
        }
        if (this.f6482v != null) {
            i++;
            iM8891a += this.f6482v.m8891a() + 8;
            newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
        }
        if (this.f6460N != null) {
            i++;
            iM8891a += this.f6460N.m8891a() + 8;
            newUTF8("RuntimeVisibleTypeAnnotations");
        }
        if (this.f6461O != null) {
            i++;
            iM8891a += this.f6461O.m8891a() + 8;
            newUTF8("RuntimeInvisibleTypeAnnotations");
        }
        int i5 = iM8891a;
        if (this.f6483w != null) {
            int iM8893a = i + this.f6483w.m8893a();
            iM8894a = i5 + this.f6483w.m8894a(this, null, 0, -1, -1);
            i2 = iM8893a;
        } else {
            iM8894a = i5;
            i2 = i;
        }
        ByteVector byteVector = new ByteVector(this.f6464d.f6440b + iM8894a);
        byteVector.putInt(-889275714).putInt(this.f6462b);
        byteVector.putShort(this.f6463c).putByteArray(this.f6464d.f6439a, 0, this.f6464d.f6440b);
        byteVector.putShort(((((this.f6471k & 262144) / 64) | 393216) ^ (-1)) & this.f6471k).putShort(this.f6472l).putShort(this.f6474n);
        byteVector.putShort(this.f6475o);
        for (int i6 = 0; i6 < this.f6475o; i6++) {
            byteVector.putShort(this.f6476p[i6]);
        }
        byteVector.putShort(i3);
        for (FieldWriter fieldWriter2 = this.f6449B; fieldWriter2 != null; fieldWriter2 = (FieldWriter) fieldWriter2.f6511fv) {
            fieldWriter2.m8939a(byteVector);
        }
        byteVector.putShort(i4);
        for (MethodWriter methodWriter2 = this.f6451D; methodWriter2 != null; methodWriter2 = (MethodWriter) methodWriter2.f6563mv) {
            methodWriter2.m8989a(byteVector);
        }
        byteVector.putShort(i2);
        if (this.f6448A != null) {
            byteVector.putShort(newUTF8(AttBootstrapMethods.ATTRIBUTE_NAME));
            byteVector.putInt(this.f6448A.f6440b + 2).putShort(this.f6486z);
            byteVector.putByteArray(this.f6448A.f6439a, 0, this.f6448A.f6440b);
        }
        if (this.f6473m != 0) {
            byteVector.putShort(newUTF8(AttSignature.ATTRIBUTE_NAME)).putInt(2).putShort(this.f6473m);
        }
        if (this.f6477q != 0) {
            byteVector.putShort(newUTF8(AttSourceFile.ATTRIBUTE_NAME)).putInt(2).putShort(this.f6477q);
        }
        if (this.f6478r != null) {
            int i7 = this.f6478r.f6440b;
            byteVector.putShort(newUTF8(AttSourceDebugExtension.ATTRIBUTE_NAME)).putInt(i7);
            byteVector.putByteArray(this.f6478r.f6439a, 0, i7);
        }
        if (this.f6479s != 0) {
            byteVector.putShort(newUTF8(AttEnclosingMethod.ATTRIBUTE_NAME)).putInt(4);
            byteVector.putShort(this.f6479s).putShort(this.f6480t);
        }
        if ((this.f6471k & 131072) != 0) {
            byteVector.putShort(newUTF8(AttDeprecated.ATTRIBUTE_NAME)).putInt(0);
        }
        if ((this.f6471k & 4096) != 0 && ((this.f6462b & 65535) < 49 || (this.f6471k & 262144) != 0)) {
            byteVector.putShort(newUTF8(AttSynthetic.ATTRIBUTE_NAME)).putInt(0);
        }
        if (this.f6485y != null) {
            byteVector.putShort(newUTF8(AttInnerClasses.ATTRIBUTE_NAME));
            byteVector.putInt(this.f6485y.f6440b + 2).putShort(this.f6484x);
            byteVector.putByteArray(this.f6485y.f6439a, 0, this.f6485y.f6440b);
        }
        if (this.f6481u != null) {
            byteVector.putShort(newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME));
            this.f6481u.m8892a(byteVector);
        }
        if (this.f6482v != null) {
            byteVector.putShort(newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME));
            this.f6482v.m8892a(byteVector);
        }
        if (this.f6460N != null) {
            byteVector.putShort(newUTF8("RuntimeVisibleTypeAnnotations"));
            this.f6460N.m8892a(byteVector);
        }
        if (this.f6461O != null) {
            byteVector.putShort(newUTF8("RuntimeInvisibleTypeAnnotations"));
            this.f6461O.m8892a(byteVector);
        }
        if (this.f6483w != null) {
            this.f6483w.m8895a(this, null, 0, -1, -1, byteVector);
        }
        if (!this.f6458L) {
            return byteVector.f6439a;
        }
        this.f6481u = null;
        this.f6482v = null;
        this.f6483w = null;
        this.f6484x = 0;
        this.f6485y = null;
        this.f6486z = 0;
        this.f6448A = null;
        this.f6449B = null;
        this.f6450C = null;
        this.f6451D = null;
        this.f6452E = null;
        this.f6457K = false;
        this.f6456J = true;
        this.f6458L = false;
        new ClassReader(byteVector.f6439a).accept(this, 4);
        return toByteArray();
    }

    @Override
    public final void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f6462b = i;
        this.f6471k = i2;
        this.f6472l = newClass(str);
        this.f6455I = str;
        if (str2 != null) {
            this.f6473m = newUTF8(str2);
        }
        this.f6474n = str3 == null ? 0 : newClass(str3);
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f6475o = strArr.length;
        this.f6476p = new int[this.f6475o];
        for (int i3 = 0; i3 < this.f6475o; i3++) {
            this.f6476p[i3] = newClass(strArr[i3]);
        }
    }

    @Override
    public final AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.f6435g = this.f6481u;
            this.f6481u = annotationWriter;
        } else {
            annotationWriter.f6435g = this.f6482v;
            this.f6482v = annotationWriter;
        }
        return annotationWriter;
    }

    @Override
    public final void visitAttribute(Attribute attribute) {
        attribute.f6437a = this.f6483w;
        this.f6483w = attribute;
    }

    @Override
    public final void visitEnd() {
    }

    @Override
    public final FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        return new FieldWriter(this, i, str, str2, str3, obj);
    }

    @Override
    public final void visitInnerClass(String str, String str2, String str3, int i) {
        if (this.f6485y == null) {
            this.f6485y = new ByteVector();
        }
        Item itemM8931a = m8931a(str);
        if (itemM8931a.f6544c == 0) {
            this.f6484x++;
            this.f6485y.putShort(itemM8931a.f6542a);
            this.f6485y.putShort(str2 == null ? 0 : newClass(str2));
            this.f6485y.putShort(str3 != null ? newUTF8(str3) : 0);
            this.f6485y.putShort(i);
            itemM8931a.f6544c = this.f6484x;
        }
    }

    @Override
    public final MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        return new MethodWriter(this, i, str, str2, str3, strArr, this.f6457K, this.f6456J);
    }

    @Override
    public final void visitOuterClass(String str, String str2, String str3) {
        this.f6479s = newClass(str);
        if (str2 == null || str3 == null) {
            return;
        }
        this.f6480t = newNameType(str2, str3);
    }

    @Override
    public final void visitSource(String str, String str2) {
        if (str != null) {
            this.f6477q = newUTF8(str);
        }
        if (str2 != null) {
            this.f6478r = new ByteVector().m8899c(str2, 0, Integer.MAX_VALUE);
        }
    }

    @Override
    public final AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.m8889a(i, typePath, byteVector);
        byteVector.putShort(newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this, true, byteVector, byteVector, byteVector.f6440b - 2);
        if (z) {
            annotationWriter.f6435g = this.f6460N;
            this.f6460N = annotationWriter;
        } else {
            annotationWriter.f6435g = this.f6461O;
            this.f6461O = annotationWriter;
        }
        return annotationWriter;
    }
}
