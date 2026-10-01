package com.almlkaide.kaypro.aide.dependencies;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import com.blankj.utilcode.util.ReflectUtils;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.util.Toasty;
import com.almlkaide.kaypro.util.Utils;
import com.almlkaide.kaypro.widget.CustomListView;
import java.util.ArrayList;
import java.util.List;

public class DependencieDialog implements DialogInterface.OnClickListener, AdapterView.OnItemClickListener, DependencieAdapter.OnSelectionListener {
    static final int FLAG_SHOW_ANDROIDX = 2;
    static final int FLAG_SHOW_APPCOMPAT = 1;
    final Activity activity;
    private DependencieAdapter adapter;
    int currentShow = 1;
    private AlertDialog dialog;
    private DialogView dialogView;
    static List<Dependencie> list_appcompat = new ArrayList();
    static List<Dependencie> list_androidx = new ArrayList();

    static {
        for (int i = 0; i < ArtifactMapping.DATAS.length; i++) {
            list_appcompat.add(new Dependencie(ArtifactMapping.DATAS[i][0]));
            list_androidx.add(new Dependencie(ArtifactMapping.DATAS[i][1], true));
        }
    }

    public DependencieDialog(Activity activity) {
        this.activity = activity;
    }

    public static void showDialog(Activity activity) {
        new DependencieDialog(activity).show();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Dependencie item = this.adapter.getItem(i);
        ItemView itemView = (ItemView) view;
        boolean z = !this.adapter.isSelection(item);
        itemView.setChecked(z);
        this.adapter.setSelected(item, z);
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
        }
    }

    @Override
    public void onSelection(Dependencie dependencie, boolean z) {
        updateDialogTitle();
    }

    void updateDialogTitle() {
        this.dialog.setTitle(String.format(Utils.isCN() ? "添加依赖 （已选%d项)" : "Add Dependency (%d items selected)", new Integer(this.adapter.selectedMap.size())));
    }

    void show() {
        this.dialogView = new DialogView(this.activity);
        this.dialog = new AlertDialog.Builder(this.activity).setTitle(Utils.isCN() ? "添加依赖" : "Add Dependency").setView(this.dialogView).setPositiveButton(Utils.isCN() ? "添加" : "Add", this).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setNeutralButton(Utils.isCN() ? "更多" : "More", (DialogInterface.OnClickListener) null).create();
        this.dialog.show();
        this.dialog.getButton(-1).setOnClickListener(new View.OnClickListener(this) {
            private final DependencieDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onClick(View view) {
                List<Dependencie> selectedList = this.this$0.adapter.getSelectedList();
                if (selectedList.size() != 0) {
                    String fileBrowserCurrentDir = AIDEUtils.getFileBrowserCurrentDir();
                    ReflectUtils reflectUtilsReflect = ReflectUtils.reflect("abcd.Vi");
                    if (((Boolean) reflectUtilsReflect.method("BT", new Object[]{fileBrowserCurrentDir}).get()).booleanValue()) {
                        String str = (String) reflectUtilsReflect.method("v5", new Object[]{fileBrowserCurrentDir}).get();
                        for (int i = 0; i < selectedList.size(); i++) {
                            ReflectUtils.reflect("abcd.Be").newInstance().method("j6", new Object[]{str}).method("Hw", new Object[]{selectedList.get(i).toString()});
                        }
                        ReflectUtils.reflect("com.aide.ui.U").method("vy").method("yS");
                        Toasty.success(Utils.isCN() ? "已添加到项目" : "Added to project").show();
                        this.this$0.dialog.dismiss();
                        return;
                    }
                    return;
                }
                Toasty.warning(Utils.isCN() ? "未选择依赖" : "No dependency selected").show();
            }
        });
        this.dialog.getButton(-3).setOnClickListener(new AnonymousClass100000003(this));
        this.dialogView.getListView().setOnItemClickListener(this);
        this.dialogView.getSearchView().addTextChangedListener(new TextWatcher(this) {
            private final DependencieDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.this$0.adapter.search(charSequence.toString());
            }
        });
        this.adapter = new DependencieAdapter(this.activity, this.currentShow == 2 ? getAndroidXList() : getAppCompatList());
        this.adapter.setOnSelectionListener(this);
        this.dialogView.setAdapter(this.adapter);
        updateDialogTitle();
    }

    class AnonymousClass100000003 implements View.OnClickListener {
        private final DependencieDialog this$0;

        AnonymousClass100000003(DependencieDialog dependencieDialog) {
            this.this$0 = dependencieDialog;
        }

        public void toggleList(int i, List<Dependencie> list) {
            this.this$0.currentShow = i;
            this.this$0.adapter.setBackuplist(list);
            this.this$0.adapter.setList(list);
            this.this$0.adapter.notifyDataSetChanged();
            String string = this.this$0.dialogView.searchView.getText().toString();
            if (string.trim().length() != 0) {
                this.this$0.adapter.search(string);
            }
        }

        @Override
        public void onClick(View view) {
            PopupMenu popupMenu = new PopupMenu(this.this$0.activity, view);
            Menu menu = popupMenu.getMenu();
            menu.add(1, 0, 0, "AppCompat").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
                private final AnonymousClass100000003 this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    this.this$0.toggleList(1, this.this$0.this$0.getAppCompatList());
                    return false;
                }
            });
            menu.add(1, 0, 0, "AndroidX").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
                private final AnonymousClass100000003 this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    this.this$0.toggleList(2, this.this$0.this$0.getAndroidXList());
                    return false;
                }
            });
            menu.setGroupCheckable(1, true, true);
            popupMenu.show();
            if (this.this$0.currentShow == 1) {
                menu.getItem(0).setChecked(true);
            } else if (this.this$0.currentShow == 2) {
                menu.getItem(1).setChecked(true);
            }
        }
    }

    List<Dependencie> getAppCompatList() {
        return list_appcompat;
    }

    List<Dependencie> getAndroidXList() {
        return list_androidx;
    }

    List<Dependencie> getList(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(new Dependencie(str));
        }
        return arrayList;
    }

    static class DialogView extends LinearLayout {

        Context f4959ctx;
        private CustomListView listView;
        private EditText searchView;

        public DialogView(Context context) {
            super(context);
            this.f4959ctx = context;
            setOrientation(1);
            this.searchView = new EditText(context);
            this.searchView.setHint(Utils.isCN() ? "输入搜索内容.." : "input search content..");
            this.searchView.setSingleLine(true);
            this.listView = new CustomListView(context);
            this.listView.setFastScrollEnabled(true);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(Utils.dp2px(16), 0, Utils.dp2px(16), 0);
            linearLayout.addView(this.searchView, -1, -2);
            addView(linearLayout, -1, -2);
            addView(this.listView, -1, -2);
        }

        void setAdapter(ListAdapter listAdapter) {
            this.listView.setAdapter(listAdapter);
        }

        public EditText getSearchView() {
            return this.searchView;
        }

        public ListView getListView() {
            return this.listView;
        }
    }
}
