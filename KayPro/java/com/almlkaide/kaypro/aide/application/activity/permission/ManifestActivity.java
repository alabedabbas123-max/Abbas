package com.almlkaide.kaypro.aide.application.activity.permission;

import adrt.ADRTLogCatReader;
import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.app.base.BaseActivity;
import com.almlkaide.kaypro.util.Toasty;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ManifestActivity extends BaseActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, ActionMode.Callback, ManifestAdapter.Listener {
    private ActionMode actionMode;
    private boolean dataChange;
    private TextView emptyView;
    private MenuItem item_save;
    private ManifestAdapter mainAdapter;
    private File manifestFile;
    private ManifestView manifestView;

    public void setDataChange(boolean z) {
        this.dataChange = z;
        if (this.item_save != null) {
            this.item_save.setEnabled(z);
        }
    }

    public boolean isDataChange() {
        return this.dataChange;
    }

    @Override
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        super.onCreate(bundle);
        setContentView(getContentView());
        getActionBar().setTitle(Utils.isCN() ? "权限编辑" : "Permission Edit");
    }

    private void load() {
        try {
            if (getIntent().hasExtra(Config.FEED_LIST_ITEM_PATH)) {
                this.manifestFile = new File(getIntent().getStringExtra(Config.FEED_LIST_ITEM_PATH));
            }
            this.mainAdapter = new ManifestAdapter(this, this.manifestView.load(this.manifestFile));
            this.mainAdapter.setListener(this);
            this.manifestView.setAdapter((ListAdapter) this.mainAdapter);
            onDataSetChanged();
            getActionBar().setDisplayHomeAsUpEnabled(true);
            this.manifestView.setOnItemClickListener(this);
            this.manifestView.setOnItemLongClickListener(this);
        } catch (Throwable th) {
            Toast.makeText(this, th.getMessage(), 0).show();
            finish();
        }
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(this);
        this.manifestView = new ManifestView(this);
        frameLayout.addView(this.manifestView);
        this.emptyView = new TextView(this);
        this.emptyView.setGravity(17);
        this.emptyView.setText(Utils.isCN() ? "没有权限" : "No Permission");
        this.emptyView.setTextAppearance(this, R.style.TextAppearance.Large);
        this.emptyView.setTextSize(18);
        this.emptyView.setVisibility(8);
        frameLayout.addView(this.emptyView, -1, -1);
        return frameLayout;
    }

    @Override
    public void onDataSetChanged() {
        if (this.mainAdapter.getCount() == 0) {
            this.emptyView.setVisibility(0);
        } else {
            this.emptyView.setVisibility(8);
        }
    }

    @Override
    public void onSelection(Permission permission, boolean z) {
        if (this.actionMode != null) {
            this.actionMode.setSubtitle(String.format(Utils.isCN() ? "已选 %d 项" : "%d selected items", new Integer(this.mainAdapter.getSelected().size())));
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Permission item = this.mainAdapter.getItem(i);
        if (this.mainAdapter.isSelectMode()) {
            this.mainAdapter.setSelected(item, ((ManifestAdapter.ItemView) view).holder.invertSelection());
            this.mainAdapter.notifyDataSetChanged();
        } else {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setTitle(item.getLabel()).setMessage(item.getDescribe()).setPositiveButton(Utils.isCN() ? "删除" : "Delect", new DialogInterface.OnClickListener(this, item) {
                private final ManifestActivity this$0;
                private final Permission val$item;

                {
                    this.this$0 = this;
                    this.val$item = item;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i2) {
                    ManifestAdapter.remove(this.this$0.mainAdapter.getCurrentList(), this.val$item);
                    this.this$0.mainAdapter.notifyDataSetChanged();
                    this.this$0.setDataChange(true);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
            alertDialogCreate.show();
            alertDialogCreate.getButton(-1).setTextColor(-65536);
        }
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.mainAdapter.isSelectMode()) {
            return false;
        }
        multipleMode();
        ManifestAdapter.ViewHolder viewHolder = ((ManifestAdapter.ItemView) view).holder;
        Permission item = this.mainAdapter.getItem(i);
        viewHolder.setSelection(true);
        this.mainAdapter.setSelected(item, true);
        this.mainAdapter.notifyDataSetChanged();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.item_save = menu.add(Utils.isCN() ? "保存" : "Sava").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final ManifestActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) throws Throwable {
                this.this$0.save(false);
                return false;
            }
        }).setEnabled(false);
        this.item_save.setShowAsAction(2);
        menu.add(Utils.isCN() ? "添加" : "Add").setOnMenuItemClickListener(new AnonymousClass100000003(this)).setShowAsAction(2);
        menu.add(Utils.isCN() ? "自动注释权限" : "Comment permission").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final ManifestActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                menuItem.setChecked(!menuItem.isChecked());
                return this.this$0.getSp().edit().putBoolean("annotation_permission", menuItem.isChecked()).commit();
            }
        }).setCheckable(true).setChecked(isAnnotationPermission());
        menu.add(Utils.isCN() ? "多选操作" : "Multi select").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final ManifestActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                this.this$0.multipleMode();
                return false;
            }
        });
        load();
        return super.onCreateOptionsMenu(menu);
    }

    class AnonymousClass100000003 implements MenuItem.OnMenuItemClickListener {
        private final ManifestActivity this$0;

        AnonymousClass100000003(ManifestActivity manifestActivity) {
            this.this$0 = manifestActivity;
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            new PermissionDialog().show(this.this$0, this.this$0.mainAdapter.getCurrentList(), new PermissionDialog.Listener(this) {
                private final AnonymousClass100000003 this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onAdd(List<Permission> list) {
                    this.this$0.this$0.mainAdapter.setCurrentList(list);
                    this.this$0.this$0.mainAdapter.getSelected().clear();
                    this.this$0.this$0.mainAdapter.notifyDataSetChanged();
                    this.this$0.this$0.setDataChange(true);
                }
            });
            return false;
        }
    }

    public void multipleMode() {
        this.actionMode = startActionMode(this);
        this.actionMode.setTitle(Utils.isCN() ? "多选操作" : "Multi select");
        this.actionMode.setSubtitle((CharSequence) null);
    }

    @Override
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.mainAdapter.setSelectMode(true);
        this.mainAdapter.notifyDataSetChanged();
        menu.add(Utils.isCN() ? "删除" : "Delect").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, actionMode) {
            private final ManifestActivity this$0;
            private final ActionMode val$p1;

            {
                this.this$0 = this;
                this.val$p1 = actionMode;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Iterator<String> it = this.this$0.mainAdapter.getSelected().keySet().iterator();
                while (it.hasNext()) {
                    ManifestAdapter.remove(this.this$0.mainAdapter.getCurrentList(), it.next());
                }
                this.this$0.setDataChange(true);
                this.this$0.mainAdapter.notifyDataSetChanged();
                this.val$p1.finish();
                return false;
            }
        }).setShowAsAction(2);
        menu.add(R.string.selectAll).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final ManifestActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Map<String, Boolean> selected = this.this$0.mainAdapter.getSelected();
                for (int i = 0; i < this.this$0.mainAdapter.getCount(); i++) {
                    selected.put(this.this$0.mainAdapter.getItem(i).getName(), new Boolean(true));
                }
                this.this$0.mainAdapter.notifyDataSetChanged();
                return false;
            }
        }).setShowAsAction(0);
        menu.add(Utils.isCN() ? "全不选" : "Unselect all").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final ManifestActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                this.this$0.mainAdapter.getSelected().clear();
                this.this$0.mainAdapter.notifyDataSetChanged();
                return false;
            }
        }).setShowAsAction(0);
        menu.add(Utils.isCN() ? "反选" : "Invert Select").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final ManifestActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Map<String, Boolean> selected = this.this$0.mainAdapter.getSelected();
                for (int i = 0; i < this.this$0.mainAdapter.getCount(); i++) {
                    String name = this.this$0.mainAdapter.getItem(i).getName();
                    if (this.this$0.mainAdapter.isSelected(name)) {
                        selected.remove(name);
                    } else {
                        selected.put(name, new Boolean(true));
                    }
                }
                this.this$0.mainAdapter.notifyDataSetChanged();
                return false;
            }
        }).setShowAsAction(0);
        return true;
    }

    @Override
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return true;
    }

    @Override
    public void onDestroyActionMode(ActionMode actionMode) {
        this.mainAdapter.setSelectMode(false);
        this.mainAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    boolean isAnnotationPermission() {
        return getSp().getBoolean("annotation_permission", true);
    }

    SharedPreferences getSp() {
        return getSharedPreferences("PermissionEditor", 0);
    }

    @Override
    public void onBackPressed() {
        if (isDataChange()) {
            new AlertDialog.Builder(this).setTitle(Utils.isCN() ? "保存修改" : "Save modified").setMessage(Utils.isCN() ? "数据已发生变化，是否保存？" : "Data has changed, do you want to save?").setPositiveButton(Utils.isCN() ? "保存" : "Save", new DialogInterface.OnClickListener(this) {
                private final ManifestActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i) throws Throwable {
                    this.this$0.save(true);
                }
            }).setNegativeButton(Utils.isCN() ? "不保存" : "No save", new DialogInterface.OnClickListener(this) {
                private final ManifestActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    this.this$0.finish();
                }
            }).create().show();
        } else {
            super.onBackPressed();
        }
    }

    public void save(boolean z) throws Throwable {
        FileWriter fileWriter;
        FileWriter fileWriter2 = (FileWriter) null;
        try {
            String strSave = ManifestUtils.save(this.mainAdapter.getCurrentList(), DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(this.manifestFile), isAnnotationPermission());
            fileWriter = new FileWriter(this.manifestFile);
            try {
                try {
                    fileWriter.write(strSave);
                    setDataChange(false);
                    Toast toastSuccess = Toasty.success(Utils.isCN() ? "保存成功" : "Saved success");
                    toastSuccess.setGravity(17, 0, 0);
                    toastSuccess.show();
                    if (z) {
                        finish();
                    }
                } catch (Throwable th) {
                    th = th;
                    Utils.showExDialog(this, th);
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    fileWriter.flush();
                } catch (Throwable th3) {
                }
                try {
                    fileWriter.close();
                    throw th;
                } catch (Throwable th4) {
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            fileWriter = fileWriter2;
        }
        try {
            fileWriter.flush();
        } catch (Throwable th6) {
        }
        try {
            fileWriter.close();
        } catch (Throwable th7) {
        }
    }

    public static class ManifestUtils {
        private static int indent = 4;
        private boolean isAnnotation;
        private List<Permission> permission;

        private StringBuffer f4947sb = new StringBuffer();
        private boolean isAdded = false;

        public ManifestUtils(List<Permission> list, Document document, boolean z) {
            this.permission = list;
            this.isAnnotation = z;
            this.f4947sb.append("<?xml version='1.0' encoding='utf-8'?>");
            loadNodeList(this.f4947sb, document.getChildNodes(), (Node) null, 0);
        }

        public static String save(List<Permission> list, Document document, boolean z) {
            return new ManifestUtils(list, document, z).result();
        }

        private void loadNodeList(StringBuffer stringBuffer, NodeList nodeList, Node node, int i) {
            int length = nodeList.getLength();
            for (int i2 = 0; i2 < length; i2++) {
                Node nodeItem = nodeList.item(i2);
                String nodeName = nodeItem.getNodeName();
                NamedNodeMap attributes = nodeItem.getAttributes();
                if (!nodeName.startsWith("#") && (this.isAdded || ((node != null && !"manifest".equals(node.getNodeName())) || !"uses-permission".equals(nodeName) || attributes.getLength() > 1))) {
                    NodeList childNodes = nodeItem.getChildNodes();
                    String space = getSpace(i);
                    String space2 = getSpace(indent + i);
                    if (i > 0) {
                        stringBuffer.append("\n\n");
                    } else {
                        stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                    if (this.permission.size() != 0 && !this.isAdded && node != null && "manifest".equals(node.getNodeName())) {
                        for (Permission permission : this.permission) {
                            if (this.isAnnotation) {
                                stringBuffer.append(space);
                                stringBuffer.append("<!-- ");
                                stringBuffer.append(permission.getLabel());
                                stringBuffer.append(" -->\n");
                            }
                            stringBuffer.append(space);
                            stringBuffer.append("<uses-permission android:name=\"");
                            stringBuffer.append(permission.getName());
                            stringBuffer.append("\"/>");
                            stringBuffer.append("\n\n");
                        }
                        this.isAdded = true;
                    }
                    if (i > 0) {
                        stringBuffer.append(space);
                    }
                    stringBuffer.append("<");
                    stringBuffer.append(nodeName);
                    loadNodeAttributes(stringBuffer, attributes, space2);
                    if (childNodes.getLength() == 0) {
                        stringBuffer.append("/>");
                    } else {
                        stringBuffer.append(">");
                        loadNodeList(stringBuffer, childNodes, nodeItem, indent + i);
                        stringBuffer.append("\n\n");
                        if (i > 0) {
                            stringBuffer.append(space);
                        }
                        stringBuffer.append("</");
                        stringBuffer.append(nodeName);
                        stringBuffer.append(">");
                    }
                }
            }
        }

        private void loadNodeAttributes(StringBuffer stringBuffer, NamedNodeMap namedNodeMap, String str) {
            if (namedNodeMap != null) {
                int length = namedNodeMap.getLength();
                for (int i = 0; i < length; i++) {
                    Node nodeItem = namedNodeMap.item(i);
                    String nodeName = nodeItem.getNodeName();
                    String nodeValue = nodeItem.getNodeValue();
                    if (length > 1) {
                        stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
                        stringBuffer.append(str);
                    } else if (length > 0) {
                        stringBuffer.append(" ");
                    }
                    stringBuffer.append(nodeName);
                    stringBuffer.append("=\"");
                    stringBuffer.append(nodeValue);
                    stringBuffer.append("\"");
                }
            }
        }

        private String getSpace(int i) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < i; i2++) {
                stringBuffer.append(" ");
            }
            return stringBuffer.toString();
        }

        public String result() {
            return this.f4947sb.toString();
        }
    }
}
