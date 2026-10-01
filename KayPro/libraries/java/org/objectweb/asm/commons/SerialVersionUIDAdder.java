package org.objectweb.asm.commons;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.apache.commons.io.FilenameUtils;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class SerialVersionUIDAdder extends ClassVisitor {

    static Class f6670x37a7e0a2 = class$("org.objectweb.asm.commons.SerialVersionUIDAdder");
    private int access;
    private boolean computeSVUID;
    private boolean hasSVUID;
    private boolean hasStaticInitializer;
    private String[] interfaces;
    private String name;
    private Collection svuidConstructors;
    private Collection svuidFields;
    private Collection svuidMethods;

    class Item implements Comparable {
        final int access;
        final String desc;
        final String name;

        Item(String str, int i, String str2) {
            this.name = str;
            this.access = i;
            this.desc = str2;
        }

        @Override
        public int compareTo(Object obj) {
            return compareTo((Item) obj);
        }

        public int compareTo(Item item) {
            int iCompareTo = this.name.compareTo(item.name);
            return iCompareTo == 0 ? this.desc.compareTo(item.desc) : iCompareTo;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Item) && compareTo((Item) obj) == 0;
        }

        public int hashCode() {
            return new StringBuffer().append(this.name).append(this.desc).toString().hashCode();
        }
    }

    protected SerialVersionUIDAdder(int i, ClassVisitor classVisitor) {
        super(i, classVisitor);
        this.svuidFields = new ArrayList();
        this.svuidConstructors = new ArrayList();
        this.svuidMethods = new ArrayList();
    }

    public SerialVersionUIDAdder(ClassVisitor classVisitor) {
        this(Opcodes.ASM5, classVisitor);
        if (getClass() != f6670x37a7e0a2) {
            throw new IllegalStateException();
        }
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static void writeItems(Collection collection, DataOutput dataOutput, boolean z) throws IOException {
        int size = collection.size();
        Item[] itemArr = (Item[]) collection.toArray(new Item[size]);
        Arrays.sort(itemArr);
        for (int i = 0; i < size; i++) {
            dataOutput.writeUTF(itemArr[i].name);
            dataOutput.writeInt(itemArr[i].access);
            dataOutput.writeUTF(z ? itemArr[i].desc.replace('/', FilenameUtils.EXTENSION_SEPARATOR) : itemArr[i].desc);
        }
    }

    protected void addSVUID(long j) {
        FieldVisitor fieldVisitorVisitField = super.visitField(24, "serialVersionUID", "J", null, new Long(j));
        if (fieldVisitorVisitField != null) {
            fieldVisitorVisitField.visitEnd();
        }
    }

    protected byte[] computeSHAdigest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA").digest(bArr);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e.toString());
        }
    }

    protected long computeSVUID() throws Throwable {
        DataOutputStream dataOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeUTF(this.name.replace('/', FilenameUtils.EXTENSION_SEPARATOR));
                dataOutputStream.writeInt(this.access & 1553);
                Arrays.sort(this.interfaces);
                for (int i = 0; i < this.interfaces.length; i++) {
                    dataOutputStream.writeUTF(this.interfaces[i].replace('/', FilenameUtils.EXTENSION_SEPARATOR));
                }
                writeItems(this.svuidFields, dataOutputStream, false);
                if (this.hasStaticInitializer) {
                    dataOutputStream.writeUTF("<clinit>");
                    dataOutputStream.writeInt(8);
                    dataOutputStream.writeUTF("()V");
                }
                writeItems(this.svuidConstructors, dataOutputStream, true);
                writeItems(this.svuidMethods, dataOutputStream, true);
                dataOutputStream.flush();
                byte[] bArrComputeSHAdigest = computeSHAdigest(byteArrayOutputStream.toByteArray());
                long j = 0;
                for (int iMin = Math.min(bArrComputeSHAdigest.length, 8) - 1; iMin >= 0; iMin--) {
                    j = (j << 8) | ((long) (bArrComputeSHAdigest[iMin] & 255));
                }
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                return j;
            } catch (Throwable th) {
                th = th;
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
    }

    public boolean hasSVUID() {
        return this.hasSVUID;
    }

    @Override
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.computeSVUID = (i2 & 512) == 0;
        if (this.computeSVUID) {
            this.name = str;
            this.access = i2;
            this.interfaces = new String[strArr.length];
            System.arraycopy(strArr, 0, this.interfaces, 0, strArr.length);
        }
        super.visit(i, i2, str, str2, str3, strArr);
    }

    @Override
    public void visitEnd() {
        if (this.computeSVUID && !this.hasSVUID) {
            try {
                addSVUID(computeSVUID());
            } catch (Throwable th) {
                throw new RuntimeException(new StringBuffer().append("Error while computing SVUID for ").append(this.name).toString(), th);
            }
        }
        super.visitEnd();
    }

    @Override
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        if (this.computeSVUID) {
            if ("serialVersionUID".equals(str)) {
                this.computeSVUID = false;
                this.hasSVUID = true;
            }
            if ((i & 2) == 0 || (i & 136) == 0) {
                this.svuidFields.add(new Item(str, i & com.almlkaide.kaypro.android.dx.io.Opcodes.XOR_INT_LIT8, str2));
            }
        }
        return super.visitField(i, str, str2, str3, obj);
    }

    @Override
    public void visitInnerClass(String str, String str2, String str3, int i) {
        if (this.name != null && this.name.equals(str)) {
            this.access = i;
        }
        super.visitInnerClass(str, str2, str3, i);
    }

    @Override
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        if (this.computeSVUID) {
            if ("<clinit>".equals(str)) {
                this.hasStaticInitializer = true;
            }
            int i2 = i & 3391;
            if ((i & 2) == 0) {
                if ("<init>".equals(str)) {
                    this.svuidConstructors.add(new Item(str, i2, str2));
                } else if (!"<clinit>".equals(str)) {
                    this.svuidMethods.add(new Item(str, i2, str2));
                }
            }
        }
        return super.visitMethod(i, str, str2, str3, strArr);
    }
}
