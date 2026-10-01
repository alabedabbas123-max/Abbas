package com.almlkaide.kaypro.aide.filebrowser;

import abcd.Pf;
import abcd.pf;
import android.os.Handler;
import android.support.annotation.Keep;
import android.view.View;
import android.widget.AdapterView;
import com.aide.ui.browsers.FileBrowser;
import com.aide.ui.views.CustomKeysListView;
import com.blankj.utilcode.util.ReflectUtils;
import com.almlkaide.kaypro.aide.project.ProjectDialog;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class FileBrowserListener {
    @Keep
    public static List<String> sortList(FileBrowser fileBrowser, List<String> list) {
        if (list != null && !list.isEmpty()) {
            File file = new File(list.get(0));
            while (true) {
                file = file.getParentFile();
                if (file != null) {
                    if (file.isFile() && (file.getName().endsWith(".zip") || file.getName().endsWith(".jar"))) {
                        break;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (String str : list) {
                        File file2 = new File(str);
                        if (file2.isDirectory()) {
                            if (file2.isHidden()) {
                                arrayList3.add(str);
                            } else if (isSpecialDir(file2)) {
                                arrayList2.add(str);
                            } else {
                                arrayList.add(str);
                            }
                        } else if (file2.isHidden()) {
                            arrayList5.add(str);
                        } else {
                            arrayList4.add(str);
                        }
                    }
                    Collections.sort(arrayList, new FileComparator(arrayList, 1));
                    Collections.sort(arrayList2, new FileComparator(arrayList2, 2));
                    Collections.sort(arrayList3, new FileComparator(arrayList3, 3));
                    Collections.sort(arrayList4, new FileComparator(arrayList4, 4));
                    Collections.sort(arrayList5, new FileComparator(arrayList5, 5));
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.addAll(arrayList);
                    arrayList6.addAll(arrayList2);
                    arrayList6.addAll(arrayList3);
                    arrayList6.addAll(arrayList4);
                    arrayList6.addAll(arrayList5);
                    return arrayList6;
                }
            }
            ReflectUtils.reflect(fileBrowser).method("j6", new Object[]{list});
            return list;
        }
        return list;
    }

    private static boolean isSpecialDir(File file) {
        String name = file.getName();
        return "bin".equals(name) || "build".equals(name) || "obj".equals(name);
    }

    private static class FileComparator implements Comparator<String> {
        final List<String> list;
        final int type;

        @Override
        public int compare(String str, String str2) {
            return compare2(str, str2);
        }

        public FileComparator(List<String> list, int i) {
            this.list = list;
            this.type = i;
        }

        private String getFileName(String str) {
            int iLastIndexOf = str.lastIndexOf("/");
            return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
        }

        public int compare2(String str, String str2) {
            return getFileName(str).toLowerCase(Locale.ENGLISH).compareTo(getFileName(str2).toLowerCase(Locale.ENGLISH));
        }

        private String getFirstText(String str) {
            if (str.startsWith(".") && str.length() > 1) {
                str = str.substring(1);
            }
            return String.valueOf(str.charAt(0));
        }
    }

    @Keep
    public static void onFileBrowserItemClick(Object obj, AdapterView<?> adapterView, View view, int i, long j) {
        CustomKeysListView customKeysListView = (CustomKeysListView) ReflectUtils.reflect(obj).field("FH").get();
        customKeysListView.getContext();
        FileBrowser.b bVar = (FileBrowser.b) customKeysListView.getItemAtPosition(i);
        FileBrowserAdapter.ItemView itemView = (FileBrowserAdapter.ItemView) view;
        FileBrowserAdapter.ViewHolder viewHolder = itemView.viewHolder;
        switch (itemView.getItemType()) {
            case 1:
            case 2:
                new pf().run();
                break;
            case 3:
                ProjectDialog.showCreateDialog(Utils.getMainActivity());
                break;
            case 4:
                new Pf().run();
                break;
            default:
                if (bVar.Hw) {
                    if (!openableFile(new File(bVar.v5))) {
                        if (AIDEUtils.getMainDrawerLayout() != null) {
                            AIDEUtils.closeSplit(false);
                        }
                        new Handler().postDelayed(new Runnable(obj, adapterView, view, i, j) {
                            private final AdapterView val$adapterView;
                            private final long val$itemid;
                            private final Object val$j;
                            private final int val$position;
                            private final View val$view;

                            {
                                this.val$j = obj;
                                this.val$adapterView = adapterView;
                                this.val$view = view;
                                this.val$position = i;
                                this.val$itemid = j;
                            }

                            @Override
                            public void run() {
                                FileBrowserListener.onFileBrowserItemClick2(this.val$j, this.val$adapterView, this.val$view, this.val$position, this.val$itemid);
                                if (AIDEUtils.getCurrentEditorFile() != null) {
                                    AIDEUtils.appendOpenFile(AIDEUtils.getCurrentEditorFile(), 0);
                                    AIDEUtils.getMainActivity().setFileTabVisible(true);
                                }
                                FileBrowserAdapter.notifyDataSetChanged();
                            }
                        }, AIDEUtils.getMainDrawerLayout() == null ? 0 : 200);
                        break;
                    }
                } else {
                    onFileBrowserItemClick2(obj, adapterView, view, i, j);
                    break;
                }
                break;
        }
    }

    @Keep
    public static void onFileBrowserItemClick2(Object obj, AdapterView<?> adapterView, View view, int i, long j) {
        try {
            ReflectUtils.reflect(obj).method("onItemClick_SOURCE", new Object[]{adapterView, view, new Integer(i), new Long(j)});
        } catch (Throwable th) {
            Utils.toast(th, true);
        }
    }

    private static boolean openableFile(File file) {
        String name = file.getName();
        if (name.endsWith(".apk")) {
            FileOptions.showApkInfoDialog(Utils.getMainActivity(), file);
            return true;
        }
        if (name.endsWith(".png") || name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".gif")) {
            FileOptions.openImage(Utils.getMainActivity(), file);
            return true;
        }
        return false;
    }
}
