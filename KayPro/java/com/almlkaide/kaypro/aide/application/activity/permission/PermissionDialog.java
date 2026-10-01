package com.almlkaide.kaypro.aide.application.activity.permission;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.blankj.utilcode.util.LogUtils;
import com.almlkaide.kaypro.util.Utils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermissionDialog {
    private static List<Permission> sPermissionList = new ArrayList();
    private Activity activity;
    private SearchAdapter adapter;
    private AlertDialog dialog;
    private ManifestView mManifestView;
    private EditText searchView;
    private List<Permission> selectedList;

    public interface Listener {
        void onAdd(List<Permission> list);
    }

    public void updateDialogTitle() {
        this.dialog.setTitle(String.format(Utils.isCN() ? "添加权限 （已选%d项）" : "Add permission (%d selected items)", new Integer(this.adapter.getSelected().size())));
    }

    public void show(Activity activity, List<Permission> list, Listener listener) {
        int i;
        int i2 = -1;
        this.activity = activity;
        this.selectedList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.selectedList.add(list.get(i3));
        }
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        this.searchView = new EditText(activity);
        this.searchView.setHint(Utils.isCN() ? "输入搜索内容..." : "input search content...");
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setPadding(Utils.dp2px(16), 0, Utils.dp2px(16), 0);
        linearLayout2.addView(this.searchView, -1, -2);
        linearLayout.addView(linearLayout2, -1, -2);
        this.mManifestView = new ManifestView(activity);
        this.mManifestView.setFastScrollEnabled(true);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        linearLayout3.addView(this.mManifestView, -1, -2);
        View view = new View(activity);
        View view2 = new View(activity);
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(new int[]{R.attr.dividerHorizontal});
        view.setBackgroundDrawable(typedArrayObtainStyledAttributes.getDrawable(0));
        view2.setBackgroundDrawable(typedArrayObtainStyledAttributes.getDrawable(0));
        typedArrayObtainStyledAttributes.recycle();
        linearLayout3.addView(view, new LinearLayout.LayoutParams(-1, Utils.dp2px(1)));
        linearLayout3.addView(view2, new LinearLayout.LayoutParams(-1, Utils.dp2px(1)));
        view.setVisibility(8);
        view2.setVisibility(8);
        linearLayout.addView(linearLayout3, -1, -2);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.dialog = new AlertDialog.Builder(activity).setTitle(Utils.isCN() ? "添加权限" : "Add permission").setView(linearLayout).setPositiveButton(Utils.isCN() ? "添加" : "Add", new DialogInterface.OnClickListener(this, listener) {
            private final PermissionDialog this$0;
            private final Listener val$listener;

            {
                this.this$0 = this;
                this.val$listener = listener;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i4) {
                this.val$listener.onAdd(this.this$0.selectedList);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        this.dialog.show();
        if (sPermissionList == null || sPermissionList.isEmpty()) {
            sPermissionList = loadPermissions();
        }
        this.adapter = new SearchAdapter(activity, sPermissionList);
        this.adapter.bind(this.searchView);
        this.adapter.setListener(new ManifestAdapter.Listener(this) {
            private final PermissionDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onDataSetChanged() {
            }

            @Override
            public void onSelection(Permission permission, boolean z) {
                this.this$0.updateDialogTitle();
            }
        });
        this.adapter.setSelectMode(true);
        this.mManifestView.setAdapter((ListAdapter) this.adapter);
        this.mManifestView.setOnItemClickListener(new AdapterView.OnItemClickListener(this) {
            private final PermissionDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view3, int i4, long j) {
                Permission item = this.this$0.adapter.getItem(i4);
                boolean zInvertSelection = ((ManifestAdapter.ItemView) view3).holder.invertSelection();
                this.this$0.adapter.setSelected(item, zInvertSelection);
                if (zInvertSelection) {
                    this.this$0.selectedList.add(item);
                } else {
                    ManifestAdapter.remove((List<Permission>) this.this$0.selectedList, item);
                }
                this.this$0.adapter.notifyDataSetChanged();
            }
        });
        this.mManifestView.setOnItemLongClickListener(new AnonymousClass100000004(this, activity));
        int i4 = 0;
        while (true) {
            i = i2;
            if (i4 >= sPermissionList.size()) {
                break;
            }
            i2 = i;
            for (int i5 = 0; i5 < list.size(); i5++) {
                if (sPermissionList.get(i4).getName().equals(list.get(i5).getName())) {
                    this.adapter.setSelected(sPermissionList.get(i4), true);
                    if (i2 < 0) {
                        i2 = i4;
                    }
                }
            }
            i4++;
        }
        this.adapter.notifyDataSetChanged();
        if (i > 0) {
            this.mManifestView.setSelection(i);
        }
        updateDialogTitle();
    }

    class AnonymousClass100000004 implements AdapterView.OnItemLongClickListener {
        private final PermissionDialog this$0;
        private final Activity val$activity;

        AnonymousClass100000004(PermissionDialog permissionDialog, Activity activity) {
            this.this$0 = permissionDialog;
            this.val$activity = activity;
        }

        @Override
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            Permission item = this.this$0.adapter.getItem(i);
            AlertDialog.Builder message = new AlertDialog.Builder(this.val$activity).setTitle(item.getLabel()).setMessage(item.getDescribe());
            if (this.this$0.adapter.isSelected(item.getName())) {
                str = Utils.isCN() ? "取消选择" : "cancel select";
            } else {
                str = Utils.isCN() ? "选择" : "select";
            }
            message.setPositiveButton(str, new DialogInterface.OnClickListener(this, i, view) {
                private final AnonymousClass100000004 this$0;
                private final int val$position;
                private final View val$view;

                {
                    this.this$0 = this;
                    this.val$position = i;
                    this.val$view = view;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i2) {
                    Permission item2 = this.this$0.this$0.adapter.getItem(this.val$position);
                    boolean zInvertSelection = ((ManifestAdapter.ItemView) this.val$view).holder.invertSelection();
                    this.this$0.this$0.adapter.setSelected(item2, zInvertSelection);
                    if (zInvertSelection) {
                        this.this$0.this$0.selectedList.add(item2);
                    } else {
                        ManifestAdapter.remove((List<Permission>) this.this$0.this$0.selectedList, item2);
                    }
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
            return true;
        }
    }

    private ArrayList<Permission> loadPermissions() {
        Class<?> cls;
        ArrayList<Permission> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT > 30) {
            try {
                cls = Class.forName("android.Manifest$permission");
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        } else {
            try {
                cls = Class.forName("com.almlkaide.kaypro.aide.application.activity.permission.Manifest_R$permission");
            } catch (ClassNotFoundException e2) {
                throw new NoClassDefFoundError(e2.getMessage());
            }
        }
        Field[] declaredFields = cls.getDeclaredFields();
        Object[] objArr = new Object[1];
        objArr[0] = new Integer(declaredFields == null ? -1 : declaredFields.length);
        LogUtils.iTag("declaredFields Count", objArr);
        for (int i = 0; declaredFields != null && i < declaredFields.length; i++) {
            try {
                Field field = declaredFields[i];
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (obj != null && (obj instanceof String)) {
                    arrayList.add(new Permission(this.activity.getPackageManager(), (String) obj));
                }
            } catch (Throwable th) {
                LogUtils.eTag("", new Object[]{th});
            }
        }
        Collections.sort(sPermissionList);
        Object[] objArr2 = new Object[1];
        objArr2[0] = new Integer(arrayList != null ? arrayList.size() : -1);
        LogUtils.iTag("permissionList Count", objArr2);
        return arrayList;
    }
}
