package com.almlkaide.kaypro.assetsmanager.manage.assets;

import adrt.ADRTLogCatReader;
import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.almlkaide.kaypro.assetsmanager.util.FileUtil;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import com.almlkaide.kaypro.app.base.BaseActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class AssetsManagerActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    private String assets_path;
    private long firstBackTime;
    private ListView list_view;
    private double postion = 0;
    private String file = "";
    private String last_folder = "";
    private double index = 0;
    private String my_path = "";
    private ArrayList<String> string_list = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> file_list = new ArrayList<>();
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<String> folderList = new ArrayList<>();
    private ArrayList<String> fileList = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> files = new ArrayList<>();

    public void importFile() {
    }

    public void newFile() {
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        super.onCreate(bundle);
        setContentView(getContentView());
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setTitle("Assets");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getContentView() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setGravity(17);
        linearLayout2.setBackgroundColor(-1);
        TextView textView = new TextView(this);
        textView.setAlpha(0.8f);
        textView.setGravity(17);
        linearLayout2.addView(textView, -2, -2);
        linearLayout.addView(linearLayout2, -1, -1);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setGravity(17);
        linearLayout3.setBackgroundColor(-1);
        this.list_view = new ListView(this);
        check(linearLayout2, linearLayout3);
        getFiles(this.assets_path);
        this.list_view.setOnItemClickListener(new AdapterView.OnItemClickListener(this) {
            private final AssetsManagerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (FileUtil.isDirectory(((HashMap) this.this$0.files.get(i)).get("path").toString())) {
                    this.this$0.my_path = ((HashMap) this.this$0.files.get(i)).get("path").toString();
                    this.this$0.getFiles(((HashMap) this.this$0.files.get(i)).get("path").toString());
                }
            }
        });
        this.list_view.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(this) {
            private final AssetsManagerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.this$0.file = ((HashMap) this.this$0.files.get(i)).get("path").toString();
                String[] strArrSplit = this.this$0.file.split("/assets/");
                if (FileUtil.isDirectory(((HashMap) this.this$0.files.get(i)).get("path").toString())) {
                    AssetsManagerActivity assetsManagerActivity = this.this$0;
                    this.this$0.getApplicationContext();
                    ((ClipboardManager) assetsManagerActivity.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "file:///android_asset/".concat(strArrSplit[1]).concat("/")));
                    Toast.makeText(this.this$0.getApplication(), "Built-in file' path copied", 0).show();
                } else {
                    AssetsManagerActivity assetsManagerActivity2 = this.this$0;
                    this.this$0.getApplicationContext();
                    ((ClipboardManager) assetsManagerActivity2.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "file:///android_asset/".concat(strArrSplit[1])));
                    Toast.makeText(this.this$0.getApplication(), "Built-in file' path copied", 0).show();
                }
                return true;
            }
        });
        this.list_view.setChoiceMode(0);
        linearLayout3.addView(this.list_view, -1, -1);
        linearLayout.addView(linearLayout3, -1, -1);
        return linearLayout;
    }

    public void getFiles(String str) {
        this.list.clear();
        this.files.clear();
        this.folderList.clear();
        this.fileList.clear();
        FileUtil.listDir(str, this.list);
        Collections.sort(this.list, String.CASE_INSENSITIVE_ORDER);
        this.index = 0;
        for (int i = 0; i < this.list.size(); i++) {
            if (FileUtil.isDirectory(this.list.get((int) this.index))) {
                this.folderList.add(this.list.get((int) this.index));
            } else {
                this.fileList.add(this.list.get((int) this.index));
            }
            this.index += 1.0d;
        }
        this.index = 0;
        for (int i2 = 0; i2 < this.folderList.size(); i2++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("path", this.folderList.get((int) this.index));
            this.files.add(map);
            this.index += 1.0d;
        }
        this.index = 0;
        for (int i3 = 0; i3 < this.fileList.size(); i3++) {
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("path", this.fileList.get((int) this.index));
            this.files.add(map2);
            this.index += 1.0d;
        }
        this.list_view.setAdapter((ListAdapter) new Assets(this, this.files));
        ((BaseAdapter) this.list_view.getAdapter()).notifyDataSetChanged();
    }

    private void check(LinearLayout linearLayout, LinearLayout linearLayout2) {
        if (ProjectUtils.getCurrentProject() == null) {
            Toast.makeText(getApplication(), "Open a project first.", 0).show();
            finish();
            return;
        }
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(0);
        this.assets_path = new StringBuffer().append(ProjectUtils.getCurrentProject().toString()).append("/src/main/assets/").toString();
        if (!FileUtil.isDirectory(this.assets_path)) {
            FileUtil.makeDir(this.assets_path);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, "New").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final AssetsManagerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                this.this$0.newFile();
                return false;
            }
        });
        menu.add(0, 1, 0, "Import").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final AssetsManagerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                this.this$0.importFile();
                return false;
            }
        });
        menu.add(0, 1, 0, "Refresh").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final AssetsManagerActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                this.this$0.getContentView();
                return false;
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.home:
                finish();
                break;
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    public void onBackPressed() {
        if (this.my_path.equals(this.assets_path)) {
            finish();
        } else {
            this.my_path = new File(this.my_path).getParent();
            getFiles(this.my_path);
        }
    }

    public class Assets extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;
        private final AssetsManagerActivity this$0;

        @Override
        public Object getItem(int i) {
            return getItem(i);
        }

        public Assets(AssetsManagerActivity assetsManagerActivity, ArrayList<HashMap<String, Object>> arrayList) {
            this.this$0 = assetsManagerActivity;
            this._data = arrayList;
        }

        @Override
        public int getCount() {
            return this._data.size();
        }

        @Override
        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LinearLayout linearLayout = new LinearLayout(this.this$0);
            linearLayout.setOrientation(0);
            linearLayout.setBackgroundColor(-1);
            linearLayout.setGravity(16);
            linearLayout.setPadding(7, 7, 7, 7);
            ImageView imageView = new ImageView(this.this$0);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            linearLayout.addView(imageView, 55, 55);
            TextView textView = new TextView(this.this$0);
            textView.setPadding(10, 0, 0, 0);
            textView.setTextSize(20.0f);
            linearLayout.addView(textView, -1, -2);
            textView.setText(Uri.parse(((HashMap) this.this$0.files.get(i)).get("path").toString().toString()).getLastPathSegment());
            if (FileUtil.isDirectory(((HashMap) this.this$0.files.get(i)).get("path").toString())) {
                imageView.setImageResource(com.almlkaide.kaypro.R.drawable.folder);
            } else {
                imageView.setImageResource(com.almlkaide.kaypro.R.drawable.file_type_unknown);
            }
            return linearLayout;
        }
    }
}
