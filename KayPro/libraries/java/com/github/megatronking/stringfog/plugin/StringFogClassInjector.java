package com.github.megatronking.stringfog.plugin;

import com.github.megatronking.stringfog.IStringFog;
import com.github.megatronking.stringfog.StringFogWrapper;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public final class StringFogClassInjector {
    private String mFogClassName;
    private String[] mFogPackages;
    private String mKey;
    private StringFogMappingPrinter mMappingPrinter;
    private IStringFog mStringFogImpl;

    public StringFogClassInjector(String[] strArr, String str, String str2, String str3, StringFogMappingPrinter stringFogMappingPrinter) {
        this.mFogPackages = strArr;
        this.mKey = str;
        this.mStringFogImpl = new StringFogWrapper(str2);
        this.mFogClassName = str3;
        this.mMappingPrinter = stringFogMappingPrinter;
    }

    private void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
            }
        }
    }

    private void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    private void processClass(InputStream inputStream, OutputStream outputStream) throws IOException {
        ClassReader classReader = new ClassReader(inputStream);
        ClassWriter classWriter = new ClassWriter(0);
        classReader.accept(ClassVisitorFactory.create(this.mStringFogImpl, this.mMappingPrinter, this.mFogPackages, this.mKey, this.mFogClassName, classReader.getClassName(), classWriter), 0);
        outputStream.write(classWriter.toByteArray());
        outputStream.flush();
    }

    public void doFog2Class(File file, File file2) throws Throwable {
        InputStream bufferedInputStream;
        InputStream inputStream = (InputStream) null;
        Closeable closeable = (OutputStream) null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    processClass(bufferedInputStream, bufferedOutputStream);
                    closeQuietly(bufferedOutputStream);
                    closeQuietly(bufferedInputStream);
                } catch (Throwable th) {
                    th = th;
                    closeable = bufferedOutputStream;
                    closeQuietly(closeable);
                    closeQuietly(bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = inputStream;
        }
    }

    public void doFog2ClassInDir(File file) throws Throwable {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    doFog2ClassInDir(file2);
                } else if (file2.getName().endsWith(".class")) {
                    File file3 = new File(new StringBuffer().append(file2.getAbsolutePath()).append(".tmp").toString());
                    doFog2Class(file2, file3);
                    file2.delete();
                    file3.renameTo(file2);
                } else if (file2.getName().endsWith(".dex")) {
                    file2.delete();
                }
            }
        }
    }
}
