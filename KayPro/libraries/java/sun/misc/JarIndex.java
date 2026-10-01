package sun.misc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class JarIndex {
    public static final String INDEX_NAME = "META-INF/INDEX.LIST";
    private HashMap indexMap;
    private String[] jarFiles;
    private HashMap jarMap;

    public JarIndex() {
        this.indexMap = new HashMap();
        this.jarMap = new HashMap();
    }

    public JarIndex(InputStream is) throws IOException {
        this();
        read(is);
    }

    public JarIndex(String[] files) throws IOException {
        this();
        this.jarFiles = files;
        parseJars(files);
    }

    public static JarIndex getJarIndex(JarFile jar, MetaIndex metaIndex) throws IOException {
        JarEntry e;
        if ((metaIndex != null && !metaIndex.mayContain(INDEX_NAME)) || (e = jar.getJarEntry(INDEX_NAME)) == null) {
            return null;
        }
        JarIndex index = new JarIndex(jar.getInputStream(e));
        return index;
    }

    public String[] getJarFiles() {
        return this.jarFiles;
    }

    private void addToList(String key, String value, HashMap t) {
        LinkedList list = (LinkedList) t.get(key);
        if (list == null) {
            LinkedList list2 = new LinkedList();
            list2.add(value);
            t.put(key, list2);
        } else if (!list.contains(value)) {
            list.add(value);
        }
    }

    public LinkedList m533get(String fileName) {
        int pos;
        LinkedList jarFiles = (LinkedList) this.indexMap.get(fileName);
        return (jarFiles != null || (pos = fileName.lastIndexOf("/")) == -1) ? jarFiles : (LinkedList) this.indexMap.get(fileName.substring(0, pos));
    }

    public void m532add(String fileName, String jarName) {
        String packageName;
        int pos = fileName.lastIndexOf("/");
        if (pos != -1) {
            packageName = fileName.substring(0, pos);
        } else {
            packageName = fileName;
        }
        addToList(packageName, jarName, this.indexMap);
        addToList(jarName, packageName, this.jarMap);
    }

    private void parseJars(String[] files) throws IOException {
        if (files == null) {
            return;
        }
        for (String currentJar : files) {
            ZipFile zrf = new ZipFile(currentJar.replace('/', File.separatorChar));
            Enumeration<? extends ZipEntry> enumerationEntries = zrf.entries();
            while (enumerationEntries.hasMoreElements()) {
                String fileName = enumerationEntries.nextElement().getName();
                if (!fileName.startsWith("META-INF/") || (!fileName.equals("META-INF/") && !fileName.equals(INDEX_NAME) && !fileName.equals("META-INF/MANIFEST.MF"))) {
                    m532add(fileName, currentJar);
                }
            }
            zrf.close();
        }
    }

    public void write(OutputStream out) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out, "UTF8"));
        bw.write("JarIndex-Version: 1.0\n\n");
        if (this.jarFiles != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.jarFiles;
                if (i < strArr.length) {
                    String jar = strArr[i];
                    bw.write(jar + "\n");
                    LinkedList jarlist = (LinkedList) this.jarMap.get(jar);
                    if (jarlist != null) {
                        Iterator listitr = jarlist.iterator();
                        while (listitr.hasNext()) {
                            bw.write(((String) listitr.next()) + "\n");
                        }
                    }
                    bw.write("\n");
                    i++;
                } else {
                    bw.flush();
                    return;
                }
            }
        }
    }

    public void read(InputStream is) throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF8"));
        String currentJar = null;
        Vector jars = new Vector();
        do {
            String line2 = br.readLine();
            line = line2;
            if (line2 == null) {
                break;
            }
        } while (!line.endsWith(".jar"));
        while (line != null) {
            if (line.length() != 0) {
                if (line.endsWith(".jar")) {
                    currentJar = line;
                    jars.add(currentJar);
                } else {
                    String name = line;
                    addToList(name, currentJar, this.indexMap);
                    addToList(currentJar, name, this.jarMap);
                }
            }
            line = br.readLine();
        }
        this.jarFiles = (String[]) jars.toArray(new String[jars.size()]);
    }

    public void merge(JarIndex toIndex, String path) {
        for (Map.Entry e : this.indexMap.entrySet()) {
            String packageName = (String) e.getKey();
            LinkedList<String> from_list = (LinkedList) e.getValue();
            for (String jarName : from_list) {
                if (path != null) {
                    jarName = path.concat(jarName);
                }
                toIndex.m532add(packageName, jarName);
            }
        }
    }
}
