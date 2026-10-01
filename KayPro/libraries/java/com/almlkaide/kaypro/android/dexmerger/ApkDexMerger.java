package com.almlkaide.kaypro.android.dexmerger;

import com.almlkaide.kaypro.android.dex.Dex;
import com.almlkaide.kaypro.android.dx.command.dexer.DxContext;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ApkDexMerger {
    private final File mApkFile;
    private final DxContext mContext;
    private final File mDecompressDir;
    private final File mWorkDir;

    public ApkDexMerger(File file) {
        this(new DxContext(), file);
    }

    public ApkDexMerger(DxContext dxContext, File file) {
        this.mContext = dxContext;
        this.mApkFile = file;
        this.mWorkDir = new File(file.getParentFile(), ".dexmerger");
        this.mDecompressDir = new File(this.mWorkDir, "decompress");
    }

    public void merger(File file) throws IOException {
        long jNanoTime = System.nanoTime();
        clearWorkDir();
        this.mContext.f5014out.println("正在解压...");
        try {
            ZipUtils.unzipFile(this.mApkFile, this.mDecompressDir);
            this.mContext.f5014out.println("获取Dex...");
            List listArray2List = array2List(this.mDecompressDir.listFiles(new DexFileFilter(this)));
            if (listArray2List == null) {
                throw new IOException("获取dex列表失败");
            }
            if (listArray2List.isEmpty()) {
                throw new IOException("无dex文件");
            }
            Collections.sort(listArray2List, new DexFileComparator(this));
            MultDexMerger.Builder builder = new MultDexMerger.Builder(this.mContext);
            builder.m7110add((File[]) listArray2List.toArray(new File[0]));
            for (int i = 0; i < listArray2List.size(); i++) {
                this.mContext.f5014out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("[").append(i).toString()).append("] ").toString()).append(((File) listArray2List.get(i)).getName()).toString());
            }
            this.mContext.f5014out.println("开始合并Dex...");
            try {
                List<Dex> listMerger = builder.create().merger();
                Iterator it = listArray2List.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                int i2 = 0;
                while (i2 < listMerger.size()) {
                    Dex c1679Dex = listMerger.get(i2);
                    Object[] objArr = new Object[1];
                    objArr[0] = i2 < 1 ? "" : String.valueOf(i2 + 1);
                    String str = String.format("classes%s.dex", objArr);
                    this.mContext.f5014out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("[").append(i2).toString()).append("] ").toString()).append(str).toString());
                    File file2 = this.mDecompressDir;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    c1679Dex.writeTo(new File(file2, str));
                    i2++;
                }
                File file3 = new File(this.mWorkDir, "build/apk");
                file3.getParentFile().mkdirs();
                this.mContext.f5014out.println("重新构建APK...");
                List listArray2List2 = array2List(this.mDecompressDir.listFiles());
                if (listArray2List2 == null || listArray2List2.isEmpty()) {
                    throw new IOException("获取文件列表失败");
                }
                try {
                    ZipUtils.zipFiles(listArray2List2, file3);
                    if (!file3.renameTo(file)) {
                        this.mContext.f5013err.println("APK导出失败");
                    }
                    this.mContext.f5014out.println("清除缓存...");
                    clearWorkDir();
                    this.mContext.f5014out.printf("完成/%.1fs", new Float((System.nanoTime() - jNanoTime) / 1.0E9f));
                } catch (IOException e) {
                    this.mContext.f5013err.println("APK构建失败");
                    throw e;
                }
            } catch (IOException e2) {
                this.mContext.f5013err.println("Dex合并失败");
                throw e2;
            }
        } catch (IOException e3) {
            this.mContext.f5013err.println("解压失败");
            throw e3;
        }
    }

    public void clearWorkDir() {
        delectAllFileInDir(this.mWorkDir);
    }

    public static List<String> getClassesDexPathsFormApk(File file) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (String str : ZipUtils.getFilesPath(file)) {
            if (!str.contains("/") && str.startsWith("classes") && str.endsWith(".dex")) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private static <T> List<T> array2List(T[] tArr) {
        if (tArr == null) {
            return (List) null;
        }
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    private static void delectAllFileInDir(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                for (int i = 0; fileArrListFiles != null && i < fileArrListFiles.length; i++) {
                    delectAllFileInDir(fileArrListFiles[i]);
                }
                file.delete();
                return;
            }
            file.delete();
        }
    }

    public boolean isDexFileByName(File file) {
        String name = file.getName();
        return file.isFile() && name.startsWith("classes") && name.endsWith(".dex");
    }

    private class DexFileFilter implements FileFilter {
        private final ApkDexMerger this$0;

        @Override
        public boolean accept(File file) {
            return this.this$0.isDexFileByName(file);
        }

        public DexFileFilter(ApkDexMerger apkDexMerger) {
            this.this$0 = apkDexMerger;
        }
    }

    private class DexFileComparator implements Comparator<File> {
        private final ApkDexMerger this$0;

        @Override
        public int compare(File file, File file2) {
            return compare2(file, file2);
        }

        public int compare2(File file, File file2) {
            return (this.this$0.isDexFileByName(file) && this.this$0.isDexFileByName(file2)) ? getDexFilePosByName(file, 1) - getDexFilePosByName(file2, 1) : file.compareTo(file2);
        }

        private int getDexFilePosByName(File file, int i) {
            if (this.this$0.isDexFileByName(file)) {
                String name = file.getName();
                try {
                    String strSubstring = name.substring("classes".length(), name.length() - ".dex".length());
                    if (strSubstring.trim().length() != 0) {
                        return Integer.parseInt(strSubstring);
                    }
                    return i;
                } catch (Throwable th) {
                    this.this$0.mContext.f5013err.println(th.toString());
                    return i;
                }
            }
            return i;
        }

        public DexFileComparator(ApkDexMerger apkDexMerger) {
            this.this$0 = apkDexMerger;
        }
    }
}
