package com;

import com.aide.common.Xa;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.c.a.a.a.a.Interfacea;

class ClassC implements Interfacea {

    ZipFile f4673a;

    public ClassC(ZipFile zipFile) {
        this.f4673a = zipFile;
    }

    @Override
    public boolean mo7045a(String str) {
        return this.f4673a.getEntry(new StringBuilder(String.valueOf(str)).append(".class").toString()) != null;
    }

    @Override
    public byte[] mo7046b(String str) {
        ZipEntry entry = this.f4673a.getEntry(String.valueOf(str) + ".class");
        if (entry != null) {
            try {
                InputStream inputStream = this.f4673a.getInputStream(entry);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Xa.j6(inputStream, byteArrayOutputStream, false);
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
            }
        }
        return null;
    }
}
