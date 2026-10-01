package com.almlkaide.kaypro.android.multidex;

import com.almlkaide.kaypro.android.dx.cf.direct.DirectClassFile;
import com.almlkaide.kaypro.android.dx.cf.direct.StdAttributeFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

class Path {
    private static boolean $assertionsDisabled;
    private final String definition;
    List<ClassPathElement> elements = new ArrayList();
    private final ByteArrayOutputStream baos = new ByteArrayOutputStream(40960);
    private final byte[] readBuffer = new byte[20480];

    static {
        try {
            $assertionsDisabled = !Class.forName("com.almlkaide.kaypro.android.multidex.Path").desiredAssertionStatus();
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    static ClassPathElement getClassPathElement(File file) throws IOException {
        if (file.isDirectory()) {
            return new FolderPathElement(file);
        }
        if (file.isFile()) {
            return new ArchivePathElement(new ZipFile(file));
        }
        if (file.exists()) {
            throw new IOException(new StringBuffer().append(new StringBuffer().append("\"").append(file.getPath()).toString()).append("\" is not a directory neither a zip file").toString());
        }
        throw new FileNotFoundException(new StringBuffer().append(new StringBuffer().append("File \"").append(file.getPath()).toString()).append("\" not found").toString());
    }

    Path(String str) throws IOException {
        this.definition = str;
        for (String str2 : str.split(Pattern.quote(File.pathSeparator))) {
            try {
                addElement(getClassPathElement(new File(str2)));
            } catch (IOException e) {
                throw new IOException(new StringBuffer().append("Wrong classpath: ").append(e.getMessage()).toString(), e);
            }
        }
    }

    private static byte[] readStream(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) throws IOException {
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i >= 0) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    inputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        }
    }

    public String toString() {
        return this.definition;
    }

    Iterable<ClassPathElement> getElements() {
        return this.elements;
    }

    private void addElement(ClassPathElement classPathElement) {
        if (!$assertionsDisabled && classPathElement == null) {
            throw new AssertionError();
        }
        this.elements.add(classPathElement);
    }

    synchronized DirectClassFile getClass(String str) throws FileNotFoundException {
        DirectClassFile directClassFile;
        Iterator<ClassPathElement> it = this.elements.iterator();
        DirectClassFile directClassFile2 = (DirectClassFile) null;
        while (true) {
            if (!it.hasNext()) {
                directClassFile = directClassFile2;
                break;
            }
            try {
                InputStream inputStreamOpen = it.next().open(str);
                try {
                    byte[] stream = readStream(inputStreamOpen, this.baos, this.readBuffer);
                    this.baos.reset();
                    directClassFile = new DirectClassFile(stream, str, false);
                    try {
                        directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
                        inputStreamOpen.close();
                        break;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            inputStreamOpen.close();
                            throw th;
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    directClassFile = directClassFile2;
                }
            } catch (IOException e2) {
                directClassFile = directClassFile2;
            }
            directClassFile2 = directClassFile;
        }
        if (directClassFile == null) {
            throw new FileNotFoundException(new StringBuffer().append(new StringBuffer().append("File \"").append(str).toString()).append("\" not found").toString());
        }
        return directClassFile;
    }
}
