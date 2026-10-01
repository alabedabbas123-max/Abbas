package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import org.apache.commons.io.IOUtils;

public final class Statistics {
    private final HashMap<String, Data> dataMap = new HashMap<>(50);

    public void m7170add(Item item) {
        String strTypeName = item.typeName();
        Data data = this.dataMap.get(strTypeName);
        if (data == null) {
            this.dataMap.put(strTypeName, new Data(item, strTypeName));
        } else {
            data.m7171add(item);
        }
    }

    public void addAll(Section section) {
        Iterator<? extends Item> it = section.items().iterator();
        while (it.hasNext()) {
            m7170add(it.next());
        }
    }

    public final void writeAnnotation(AnnotatedOutput annotatedOutput) {
        if (this.dataMap.size() != 0) {
            annotatedOutput.annotate(0, "\nstatistics:\n");
            TreeMap treeMap = new TreeMap();
            for (Data data : this.dataMap.values()) {
                treeMap.put(data.name, data);
            }
            Iterator it = treeMap.values().iterator();
            while (it.hasNext()) {
                ((Data) it.next()).writeAnnotation(annotatedOutput);
            }
        }
    }

    public String toHuman() {
        StringBuilder sb = new StringBuilder();
        sb.append("Statistics:\n");
        TreeMap treeMap = new TreeMap();
        for (Data data : this.dataMap.values()) {
            treeMap.put(data.name, data);
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            sb.append(((Data) it.next()).toHuman());
        }
        return sb.toString();
    }

    private static class Data {
        private int count;
        private int largestSize;
        private final String name;
        private int smallestSize;
        private int totalSize;

        public Data(Item item, String str) {
            int iWriteSize = item.writeSize();
            this.name = str;
            this.count = 1;
            this.totalSize = iWriteSize;
            this.largestSize = iWriteSize;
            this.smallestSize = iWriteSize;
        }

        public void m7171add(Item item) {
            int iWriteSize = item.writeSize();
            this.count++;
            this.totalSize += iWriteSize;
            if (iWriteSize > this.largestSize) {
                this.largestSize = iWriteSize;
            }
            if (iWriteSize < this.smallestSize) {
                this.smallestSize = iWriteSize;
            }
        }

        public void writeAnnotation(AnnotatedOutput annotatedOutput) {
            annotatedOutput.annotate(toHuman());
        }

        public String toHuman() {
            StringBuilder sb = new StringBuilder();
            sb.append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("  ").append(this.name).toString()).append(": ").toString()).append(this.count).toString()).append(" item").toString()).append(this.count == 1 ? "" : "s").toString()).append("; ").toString()).append(this.totalSize).toString()).append(" bytes total\n").toString());
            if (this.smallestSize == this.largestSize) {
                sb.append(new StringBuffer().append(new StringBuffer().append("    ").append(this.smallestSize).toString()).append(" bytes/item\n").toString());
            } else {
                sb.append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append(this.smallestSize).toString()).append("..").toString()).append(this.largestSize).toString()).append(" bytes/item; average ").toString()).append(this.totalSize / this.count).toString()).append(IOUtils.LINE_SEPARATOR_UNIX).toString());
            }
            return sb.toString();
        }
    }
}
