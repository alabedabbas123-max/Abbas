package com.almlkaide.kaypro.aide;

import abcd.Pf;
import abcd.Vl;
import adrt.ADRTLogCatReader;
import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import com.aide.ui.AIDEEditor;
import com.aide.ui.MainActivity;
import com.baidu.android.common.util.DeviceId;
import com.baidu.mobstat.Config;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.bumptech.glide.GenericRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.ikimuhendis.ldrawer.ActionBarDrawerToggle;
import com.almlkaide.kaypro.aide.highlight.HighlightUtils;
import com.almlkaide.kaypro.aide.highlight.color.ColorDefault;
import com.almlkaide.kaypro.aide.api.ApiManager;
import com.almlkaide.kaypro.aide.api.IMainActivity;
import com.almlkaide.kaypro.aide.project.jsonbean.Project;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.aide.util.ConverProject;
import com.almlkaide.kaypro.aide.util.MenuCode;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import com.almlkaide.kaypro.aide.widget.CustomSwipeRefreshLayout;
import com.almlkaide.kaypro.graphics.drawable.DrawerArrowDrawable;
import com.almlkaide.kaypro.util.BatchReplace;
import com.almlkaide.kaypro.util.ClassUtils;
import com.almlkaide.kaypro.util.EscapeUtils;
import com.almlkaide.kaypro.util.JavaEscape;
import com.almlkaide.kaypro.util.Json2Bean;
import com.almlkaide.kaypro.util.Toasty;
import com.almlkaide.kaypro.util.Utils;
import com.almlkaide.kaypro.util.ViewUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class AideMainActivity extends MainActivity {
    protected static AideMainActivity sActivity;
    private static ActionBarDrawerToggle sDrawerToggle;
    private boolean isHandledIntent;
    private View mDrawOverlaysView;
    private DrawerLayout mDrawer;
    private DrawerArrowDrawable mDrawerArrow;
    private boolean mIsTrainerMode;
    protected Menu mOptionMenu;
    private SparseArray<View> mFindViewCaches = new SparseArray<>();
    private int fabBtnSize = -1;

    class OpenAssetsActivity implements MenuItem.OnMenuItemClickListener {
        private final Activity val$activity;

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                Utils.startActivity(this.val$activity, Class.forName("com.almlkaide.kaypro.assetsmanager.manage.assets.AssetsManagerActivity"));
                return false;
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        }

        OpenAssetsActivity(Activity activity) {
            this.val$activity = activity;
        }
    }

    protected static void addMainToolMenu(Activity activity, SubMenu subMenu) {
        subMenu.add("Icon Library").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(activity) {
            private final Activity val$activity;

            {
                this.val$activity = activity;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                try {
                    Utils.startActivity(this.val$activity, Class.forName("com.almlkaide.kaypro.aide.application.activity.icons.IconActivity"));
                    return false;
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
        });
        subMenu.add("Asset Manager").setOnMenuItemClickListener(new OpenAssetsActivity(activity));
        subMenu.add("Code highlight").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(activity) {
            private final Activity val$activity;

            {
                this.val$activity = activity;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                try {
                    Utils.startActivity(this.val$activity, new Intent(this.val$activity, Class.forName("com.almlkaide.kaypro.aide.highlight.HighlightActivity")).putExtra(Config.FEED_LIST_ITEM_TITLE, menuItem.getTitle()));
                    return false;
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
        });
        SubMenu subMenuAddSubMenu = subMenu.addSubMenu("Code escape");
        subMenuAddSubMenu.add("Java").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(activity) {
            private final Activity val$activity;

            {
                this.val$activity = activity;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                JavaEscape.showDialog(this.val$activity, (String) null);
                return false;
            }
        });
        subMenuAddSubMenu.add("XML").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(activity) {
            private final Activity val$activity;

            {
                this.val$activity = activity;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                EscapeUtils.showDialog(this.val$activity, (String) null, EscapeUtils.f5093XML);
                return false;
            }
        });
    }

    public IMainActivity getIMainActivity() {
        return ApiManager.getIMainActivity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends View> T findViewById(int i) {
        View viewFindViewById = this.mFindViewCaches.get(i);
        if (viewFindViewById == null && (viewFindViewById = super/*android.app.Activity*/.findViewById(i)) != null) {
            this.mFindViewCaches.put(i, viewFindViewById);
        }
        return (T) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends View> T findViewByIdSkipCache(int i) {
        return (T) super/*android.app.Activity*/.findViewById(i);
    }

    public void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        sActivity = this;
        Utils.setMainActivity(this);
        LogUtils.iTag("onCreate", new Object[]{this, bundle});
        HighlightUtils.init();
        try {
            try {
                ReflectUtils.reflect(Class.forName("com.aide.ui.views.editor.OConsole")).field("j6", AdvancedSetting.getEditorTypeface());
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        } catch (Throwable th) {
            LogUtils.eTag("Typeface", new Object[]{th});
        }
        checkAppProjectsNomedExistsAndWrite();
        this.mIsTrainerMode = AIDEUtils.isTrainerMode();
        Window window = getWindow();
        if (this.mIsTrainerMode || Utils.getSp().getBoolean("use_adjustPan", false)) {
            window.setSoftInputMode(35);
        } else {
            window.setSoftInputMode(19);
        }
        if (Build.VERSION.SDK_INT >= 23 && !PermissionUtils.isGranted(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            SharedPreferences openFileService = AIDEUtils.getOpenFileService();
            openFileService.edit().putString("CurrentFiles_", openFileService.getString("CurrentFiles", "")).commit();
            openFileService.edit().putString("CurrentFiles", "").commit();
        }
        super.onCreate(bundle);
        ActionBar actionBar = getActionBar();
        actionBar.setElevation(0.0f);
        if (this.mIsTrainerMode) {
            actionBar.setDisplayUseLogoEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        } else {
            actionBar.setDisplayUseLogoEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(false);
        }
        if (Build.VERSION.SDK_INT >= 23 && !PermissionUtils.isGranted(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            AIDEUtils.closeSplit(false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (AIDEUtils.getCurrentFiles().isEmpty()) {
                    setFileTabVisible(false);
                } else {
                    setFileTabVisible(true);
                }
            }
            showRequestWritePermissionDialog(this);
        }
        setFileTabVisible(AIDEUtils.getCurrentEditorFile() != null);
        if (!this.mIsTrainerMode) {
            checkOpenFile();
        }
        ReflectUtils.reflect(this).field("er").method("DW", new Object[]{new Boolean(true)});
        this.mDrawer = AIDEUtils.getMainDrawerLayout();
        if (this.mDrawer != null) {
            this.mDrawer.addDrawerListener(new DrawerLayout.DrawerListener(this) {
                private final AideMainActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onDrawerSlide(View view, float f) {
                }

                @Override
                public void onDrawerStateChanged(int i) {
                }

                @Override
                public void onDrawerClosed(View view) {
                    Utils.getSp().edit().putBoolean("split_view_open", false).commit();
                }

                @Override
                public void onDrawerOpened(View view) {
                    Utils.getSp().edit().putBoolean("split_view_open", true).commit();
                }
            });
            setNoOpenFileView();
            setFABVisible(Utils.getSp().getBoolean("enableMainMasterButton", false));
            initDrawerToggle();
            setDrawerToggleVisible(Utils.getSp().getBoolean("enableDrawerToggle", true));
            if (Utils.getSp().getBoolean("split_view_open", false)) {
                this.mDrawer.openDrawer(3, false);
                this.mDrawerArrow.setProgress(1.0f);
            } else {
                this.mDrawer.closeDrawer(3, false);
                this.mDrawerArrow.setProgress(0.0f);
            }
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) ViewUtil.findViewByTag((ViewGroup) AIDEUtils.getFileBrowser(), (Object) "SwipeRefreshLayout");
        if (customSwipeRefreshLayout != null) {
            customSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener(this, customSwipeRefreshLayout) {
                private final AideMainActivity this$0;
                private final CustomSwipeRefreshLayout val$mSwipeRefreshLayout;

                {
                    this.this$0 = this;
                    this.val$mSwipeRefreshLayout = customSwipeRefreshLayout;
                }

                @Override
                public void onRefresh() {
                    if (!PermissionUtils.isGranted(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
                        this.this$0.requestPermission();
                    } else {
                        AIDEUtils.reLoadFileBrowser();
                    }
                    this.val$mSwipeRefreshLayout.setRefreshing(false);
                }
            });
        }
        handlerIntent(getIntent());
        showDrawOverlays();
        getIMainActivity().onCreate(this, bundle);
    }

    private void adjutActionBar() {
        try {
            View viewFindViewById = getWindow().getDecorView().findViewById(getResources().getIdentifier("action_bar_container", "id", Project.ANDROID));
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(R.attr.actionBarStyle, typedValue, true);
            TypedArray typedArrayObtainStyledAttributes = getTheme().obtainStyledAttributes(typedValue.resourceId, new int[]{R.attr.background, R.attr.elevation});
            viewFindViewById.setBackgroundDrawable(typedArrayObtainStyledAttributes.getDrawable(0));
            viewFindViewById.setElevation(typedArrayObtainStyledAttributes.getDimension(1, 4.0f));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            LogUtils.e(new Object[]{th});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void showDrawOverlays() {
        if (Build.VERSION.SDK_INT >= 23 && !PermissionUtils.isGrantedDrawOverlays()) {
            new AlertDialog.Builder(this).setMessage(Utils.isCN() ? "建议你授予我悬浮窗覆盖权限，避免后台服务不被回收！👀" : "It is recommended to grant drawing overlay permission to avoid service not being recycled").setPositiveButton(R.string.ok, new AnonymousClass100000003(this)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
            return;
        }
        requestIgnoreBatteryOptimizations();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).width = 100;
        ((ViewGroup.LayoutParams) layoutParams).height = 100;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.packageName = getPackageName();
        layoutParams.flags = 24;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.verticalMargin = 0;
        layoutParams.horizontalMargin = 0;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        ImageView imageView = new ImageView(this);
        imageView.setFocusable(false);
        imageView.setFocusableInTouchMode(false);
        imageView.setClickable(false);
        layoutParams.windowAnimations = R.style.Animation.Toast;
        try {
            getWindowManager().addView(imageView, layoutParams);
            this.mDrawOverlaysView = imageView;
            LogUtils.i(new Object[]{"showDrawOverlays", new Boolean(true)});
        } catch (Throwable th) {
            LogUtils.eTag("addView error", new Object[]{th});
        }
    }

    class AnonymousClass100000003 implements DialogInterface.OnClickListener {
        private final AideMainActivity this$0;

        AnonymousClass100000003(AideMainActivity aideMainActivity) {
            this.this$0 = aideMainActivity;
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            PermissionUtils.requestDrawOverlays(new PermissionUtils.SimpleCallback(this) {
                private final AnonymousClass100000003 this$0;

                {
                    this.this$0 = this;
                }

                public void onDenied() {
                    this.this$0.this$0.requestIgnoreBatteryOptimizations();
                }

                public void onGranted() {
                    this.this$0.this$0.showDrawOverlays();
                    Toasty.success(Utils.isCN() ? "芜湖，起飞！✈️" : "ok👌").show();
                }
            });
        }
    }

    public void requestIgnoreBatteryOptimizations() {
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT < 23 || (powerManager = (PowerManager) getSystemService("power")) == null) {
            return;
        }
        boolean zIsIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(getPackageName());
        if (!zIsIgnoringBatteryOptimizations) {
            try {
                Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                intent.setData(Uri.parse(new StringBuffer().append("package:").append(getPackageName()).toString()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(intent, 10099);
                }
            } catch (Exception e) {
                LogUtils.e(new Object[]{e});
            }
        }
        LogUtils.iTag("isIgnoringBatteryOptimizations", new Object[]{new Boolean(zIsIgnoringBatteryOptimizations)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initDrawerToggle() {
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.mDrawerArrow = new DrawerArrowDrawable(this);
        DrawerLayout mainDrawerLayout = AIDEUtils.getMainDrawerLayout();
        if (mainDrawerLayout != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            sDrawerToggle = new ActionBarDrawerToggle(this, mainDrawerLayout, this.mDrawerArrow, R.string.ok, R.string.ok);
            sDrawerToggle.syncState();
            mainDrawerLayout.addDrawerListener(sDrawerToggle);
            this.mDrawerArrow.setProgress(0.0f);
            try {
                TypedValue typedValue = new TypedValue();
                getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                TypedArray typedArrayObtainStyledAttributes = getTheme().obtainStyledAttributes(typedValue.resourceId, new int[]{R.attr.colorControlNormal});
                int color = typedArrayObtainStyledAttributes.getColor(0, 0);
                if (color != 0) {
                    this.mDrawerArrow.setColor(color);
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                LogUtils.i(new Object[]{th});
            }
        }
    }

    public Menu getOptionMenu() {
        return this.mOptionMenu;
    }

    public static AideMainActivity getActivity() {
        return sActivity;
    }

    public void m7097DW(String str) {
        ActionBar actionBar = getActionBar();
        ActionBar.Tab text = actionBar.newTab().setText(Vl.tp(str));
        text.setTabListener(new FileTabListener(this, text, str));
        actionBar.addTab(text, false);
        ReflectUtils.reflect(this).method("jJ");
    }

    protected void onStop() {
        super.onStop();
    }

    protected void onDestroy() {
        AIDEUtils.appendOpenFile(AIDEUtils.getCurrentEditorFile(), 0);
        if (this.mDrawOverlaysView != null) {
            getWindowManager().removeViewImmediate(this.mDrawOverlaysView);
        }
        Toasty.cancel();
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onResume() {
        try {
            super.onResume();
            AIDEEditor currentEditor = AIDEUtils.getCurrentEditor();
            if (currentEditor != null) {
                currentEditor.setFocusable(true);
                currentEditor.setFocusableInTouchMode(true);
            }
        } catch (Throwable th) {
            if (th.toString().contains("java.util.List.iterator")) {
                Utils.showMsgDialog(this, (String) null, Utils.isCN() ? "找不到当前工程，可能已被删除。(｡•́︿•̀｡)" : "The current project cannot be found and may have been deleted. (｡•́︿•̀｡)");
                AIDEUtils.closeProjects();
            }
            LogUtils.eTag("onResume Exception", new Object[]{th});
            throw new RuntimeException("onResume Exception", th);
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        super.onSharedPreferenceChanged(sharedPreferences, str);
        if ("project_home".equals(str)) {
            checkAppProjectsNomedExistsAndWrite();
        }
    }

    private void checkAppProjectsNomedExistsAndWrite() {
        checkNomedExistsAndWrite(new File(ProjectUtils.getAppProjects(), ".nomedia"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressWarnings("all")
    public void setEditorBackground() {
        GenericRequestBuilder genericRequestBuilderLoad;
        ImageView imageView = (ImageView) findViewById(AideR.C1673id.edititBgView);
        try {
            String string = Utils.getSp().getString("advanced_setting_editor_bg", (String) null);
            if (FileUtils.isFile(string)) {
                RequestManager requestManagerWith = Glide.with((Activity) this);
                if (string.toLowerCase().endsWith(".gif")) {
                    genericRequestBuilderLoad = requestManagerWith.load(string).asGif();
                } else {
                    genericRequestBuilderLoad = requestManagerWith.load(string);
                }
                genericRequestBuilderLoad.diskCacheStrategy(DiskCacheStrategy.SOURCE);
                genericRequestBuilderLoad.into(imageView);
                return;
            }
        } catch (Throwable th) {
            LogUtils.e(new Object[]{th});
        }
        imageView.setImageDrawable(new ColorDrawable(HighlightUtils.getColorInt(new ColorDefault().BACKGROUND)));
    }

    private void checkNomedExistsAndWrite(File file) {
        if (file.exists()) {
            return;
        }
        FileIOUtils.writeFileFromString(file, DeviceId.CUIDInfo.I_EMPTY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void handlerIntent(Intent intent) {
        if (!this.isHandledIntent) {
            LogUtils.i(new Object[]{intent});
            this.isHandledIntent = true;
            String action = intent.getAction();
            if (action != null) {
                if ("action.new.project".equals(action)) {
                    MainListener.onShowCreateProjectDialog(this);
                } else if ("action.git".equals(action)) {
                    new Pf().run();
                }
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (AIDEUtils.getMainDrawerLayout() != null && AIDEUtils.isDrawerOpen()) {
                AIDEUtils.closeSplit(false);
                return true;
            }
        } else if (i == 82 && this.mDrawer != null) {
            this.mDrawer.openDrawer(3);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        View childAt;
        super.onConfigurationChanged(configuration);
        try {
            if (this.mDrawer != null && (childAt = this.mDrawer.getChildAt(this.mDrawer.getChildCount() - 1)) != null) {
                if (configuration.orientation != 1) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = ScreenUtils.getScreenWidth() / 2;
                    childAt.setLayoutParams(layoutParams);
                } else {
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    layoutParams2.width = (int) ((((double) ScreenUtils.getScreenWidth()) / 1.2d) + ((double) 0.5f));
                    childAt.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th) {
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getIMainActivity().onCreateOptionsMenu(menu);
        return handleCreateOptionsMenu(menu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean handleCreateOptionsMenu(Menu menu) {
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return handleOptionsItemSelected(menuItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleOptionsItemSelected(MenuItem menuItem) {
        if (getIMainActivity().onOptionsItemSelected(menuItem)) {
            return true;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 16908332 && !AIDEUtils.isTrainerMode() && sDrawerToggle != null) {
            sDrawerToggle.onOptionsItemSelected(menuItem);
            return true;
        }
        if (itemId == com.almlkaide.kaypro.R.id.mainMenuSettings) {
            try {
                Utils.startActivity((Context) this, new Intent((Context) this, Class.forName("com.almlkaide.kaypro.aide.application.activity.AidePreferencesActivity")).putExtra("from_main", true));
                return true;
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        }
        return superOnOptionsItemSelected(menuItem);
    }

    public boolean superOnOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return handleMenuOpened(i, menu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean handleMenuOpened(int i, Menu menu) {
        if (menu == null) {
            return false;
        }
        if (i == 8) {
            MenuItem menuItemFindItem = menu.findItem(AideR.C1673id.mainMenuForward);
            if (menuItemFindItem != null && !menuItemFindItem.isEnabled()) {
                menuItemFindItem.setVisible(false);
            }
            MenuItem menuItemFindItem2 = menu.findItem(AideR.C1673id.mainMenuAdMore);
            if (menuItemFindItem2 != null && menuItemFindItem2.getSubMenu().size() == 0) {
                SubMenu subMenu = menuItemFindItem2.getSubMenu();
                addMainToolMenu(this, subMenu);
                addOthorToolMenu(this, subMenu);
            }
        }
        getIMainActivity().onMenuOpened(i, menu);
        return super/*android.app.Activity*/.onMenuOpened(i, menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return handlePrepareOptionsMenu(menu);
    }

    private boolean handlePrepareOptionsMenu(Menu menu) {
        menu.clear();
        getActionBar().setDisplayShowTitleEnabled(true);
        if (!this.mIsTrainerMode) {
            setActionBarTitle();
            setMenuCode(menu);
        }
        if (hasTabView()) {
            if (AIDEUtils.getCurrentEditorFile() == null) {
                setFileTabVisible(false);
            } else {
                setFileTabVisible(true);
            }
        }
        boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(AideR.C1673id.mainMenuNavigateMode);
        MenuItem menuItemFindItem2 = menu.findItem(AideR.C1673id.mainMenuEditMode);
        if (menuItemFindItem != null && menuItemFindItem2 != null && (AIDEUtils.checkEditorFileNameSuffix(".java") || AIDEUtils.checkEditorFileNameSuffix(".class"))) {
            menuItemFindItem.setShowAsAction(2);
            menuItemFindItem2.setShowAsAction(2);
        }
        getIMainActivity().onPrepareOptionsMenu(menu);
        return zOnPrepareOptionsMenu;
    }

    private void setActionBarTitle() {
        File currentProject = ProjectUtils.getCurrentProject();
        String appName = AppUtils.getAppName();
        String appLabelFromProject = (currentProject == null || !currentProject.exists()) ? (String) null : ProjectUtils.getAppLabelFromProject(currentProject);
        SpannableString spannableString = new SpannableString(Utils.isCN() ? "当前项目" : "Project");
        CharSequence charSequence = (CharSequence) null;
        CharSequence charSequence2 = (CharSequence) null;
        if (hasTabView()) {
            if (appLabelFromProject == null) {
                charSequence = appName;
            } else {
                charSequence2 = appLabelFromProject;
                charSequence = spannableString;
            }
        } else if (AIDEUtils.isCurrentEditorIsNull()) {
            if (appLabelFromProject == null) {
                charSequence = appName;
            } else {
                charSequence2 = appLabelFromProject;
                charSequence = spannableString;
            }
        }
        ActionBar actionBar = getActionBar();
        actionBar.setTitle(charSequence);
        actionBar.setSubtitle(charSequence2);
    }

    private boolean hasTabView() {
        try {
            View viewFindViewById = getWindow().getDecorView().findViewById(getResources().getIdentifier("action_bar", "id", Project.ANDROID));
            if (viewFindViewById == null) {
                return false;
            }
            return !hasTabView(viewFindViewById);
        } catch (Throwable th) {
            return false;
        }
    }

    private boolean hasTabView(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (16908290 != childAt.getId() && hasTabView(childAt)) {
                    return true;
                }
            }
        }
        return view.getClass().getSimpleName().endsWith("ScrollingTabContainerView");
    }

    protected void checkOpenFile() {
        List<File> currentFiles;
        if (!PermissionUtils.isGranted(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}) || (currentFiles = AIDEUtils.getCurrentFiles()) == null) {
            return;
        }
        AIDEUtils.setCurrentFiles(currentFiles);
    }

    protected void addOthorToolMenu(Activity activity, SubMenu subMenu) {
        File currentProject = ProjectUtils.getCurrentProject();
        SubMenu subMenuAddSubMenu = subMenu.addSubMenu(Utils.isCN() ? "其他功能..." : "Other...");
        subMenuAddSubMenu.add(Utils.isCN() ? "批量替换" : "Batch replacement").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, currentProject, activity) {
            private final AideMainActivity this$0;
            private final Activity val$activity;
            private final File val$currentProject;

            {
                this.this$0 = this;
                this.val$currentProject = currentProject;
                this.val$activity = activity;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                File main = ProjectUtils.getMain(this.val$currentProject);
                BatchReplace.showDialog(this.val$activity, main == null ? (String) null : main.getAbsolutePath());
                return false;
            }
        });
        subMenuAddSubMenu.add("Json2Bean").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, activity) {
            private final AideMainActivity this$0;
            private final Activity val$activity;

            {
                this.this$0 = this;
                this.val$activity = activity;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Json2Bean.showDialog(this.val$activity, (String) null);
                return false;
            }
        });
        if (ProjectUtils.isGradleProject(currentProject)) {
            subMenuAddSubMenu.add(Utils.isCN() ? "转换工程" : "Conversion project").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, activity, currentProject) {
                private final AideMainActivity this$0;
                private final Activity val$activity;
                private final File val$currentProject;

                {
                    this.this$0 = this;
                    this.val$activity = activity;
                    this.val$currentProject = currentProject;
                }

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    ConverProject.showDialog(this.val$activity, this.val$currentProject);
                    return false;
                }
            });
        }
        subMenuAddSubMenu.add(Utils.isCN() ? "系统资源查看" : "View system resources").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, activity) {
            private final AideMainActivity this$0;
            private final Activity val$activity;

            {
                this.this$0 = this;
                this.val$activity = activity;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                try {
                    Utils.startActivity(this.val$activity, Class.forName("com.almlkaide.kaypro.aide.application.activity.androidr.AndroidRActivity"));
                    return false;
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
        });
        subMenuAddSubMenu.add(Utils.isCN() ? "指定类分析" : "Specify class analysis").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, activity) {
            private final AideMainActivity this$0;
            private final Activity val$activity;

            {
                this.this$0 = this;
                this.val$activity = activity;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                ClassUtils.showDialog(this.val$activity);
                return false;
            }
        });
        subMenuAddSubMenu.add(Utils.isCN() ? "跳转到目录" : "Goto to dir").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, activity) {
            private final AideMainActivity this$0;
            private final Activity val$activity;

            {
                this.this$0 = this;
                this.val$activity = activity;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                LinearLayout linearLayout = new LinearLayout(this.val$activity);
                linearLayout.setPadding(Utils.dp2px(24), Utils.dp2px(10), Utils.dp2px(24), 0);
                EditText editText = new EditText(this.val$activity);
                linearLayout.addView(editText, -1, -2);
                editText.setText(this.this$0.getFilesDir().getAbsolutePath());
                new AlertDialog.Builder(this.val$activity).setTitle(menuItem.getTitle()).setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(this, editText) {
                    private final AnonymousClass100000014 this$0;
                    private final EditText val$et;

                    {
                        this.this$0 = this;
                        this.val$et = editText;
                    }

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        AIDEUtils.setFileBrowserCurrentDir(this.val$et.getText().toString());
                    }
                }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
                return false;
            }
        });
    }

    protected void setMenuCode(Menu menu) {
        File currentEditorFile = AIDEUtils.getCurrentEditorFile();
        if (!AdvancedSetting.isEnableMenuCode() || currentEditorFile == null || AIDEUtils.checkEditorFileNameSuffix(".class")) {
            return;
        }
        InputStream inputStreamOpen = (InputStream) null;
        try {
            String string = Utils.getSp().getString("menucode_file", (String) null);
            if (!TextUtils.isEmpty(string) && new File(string).isFile()) {
                inputStreamOpen = new FileInputStream(string);
            }
        } catch (Throwable th) {
        }
        if (inputStreamOpen == null) {
            try {
                StringBuffer stringBuffer = new StringBuffer("menucode/");
                if (Utils.isCN()) {
                    stringBuffer.append("menu_code.xml");
                } else {
                    stringBuffer.append("menu_code.en.xml");
                }
                File sdDataFile = Utils.getSdDataFile(stringBuffer.toString());
                if (sdDataFile.exists() && sdDataFile.isFile()) {
                    inputStreamOpen = new FileInputStream(sdDataFile);
                } else {
                    String assetsDataFile = Utils.getAssetsDataFile(stringBuffer.toString());
                    ResourceUtils.copyFileFromAssets(assetsDataFile, sdDataFile.getAbsolutePath());
                    inputStreamOpen = getAssets().open(assetsDataFile);
                }
            } catch (Throwable th2) {
                return;
            }
        }
        MenuCode.m7104add(menu, inputStreamOpen, currentEditorFile.getAbsolutePath(), new MenuCode.OnMenuItemClickListener(this) {
            private final AideMainActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onMenuItemClick(MenuItem menuItem, String str) {
                AIDEUtils.addToEditor(str.trim());
            }
        });
    }

    public void setFABVisible(boolean z) {
        View viewFindViewById = findViewById(AideR.C1673id.mainMasterButton);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (this.fabBtnSize <= 0) {
                this.fabBtnSize = SizeUtils.getMeasuredWidth(viewFindViewById);
            }
            if (this.fabBtnSize <= 0) {
                this.fabBtnSize = SizeUtils.dp2px(50);
            }
            if (z) {
                layoutParams.width = this.fabBtnSize;
                layoutParams.height = this.fabBtnSize;
            } else {
                layoutParams.width = 0;
                layoutParams.height = 0;
            }
            viewFindViewById.setLayoutParams(layoutParams);
        }
    }

    private void showRequestWritePermissionDialog(Activity activity) {
        if (Utils.isCN()) {
            new AlertDialog.Builder(activity).setMessage("给👴权限！").setPositiveButton("给", new DialogInterface.OnClickListener(this) {
                private final AideMainActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    this.this$0.requestPermission();
                }
            }).setNegativeButton("不给", new DialogInterface.OnClickListener(this) {
                private final AideMainActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toasty.warning("建议您卸载呢..").show();
                }
            }).create().show();
        } else {
            new AlertDialog.Builder(activity).setMessage("Please give me storage permission").setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(this) {
                private final AideMainActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    this.this$0.requestPermission();
                }
            }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener(this) {
                private final AideMainActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).create().show();
        }
    }

    public void requestPermission() {
        if (PermissionUtils.isGranted(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            return;
        }
        PermissionUtils.permission(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).callback(new AnonymousClass100000021(this)).request();
    }

    class AnonymousClass100000021 implements PermissionUtils.FullCallback {
        private final AideMainActivity this$0;

        AnonymousClass100000021(AideMainActivity aideMainActivity) {
            this.this$0 = aideMainActivity;
        }

        public void onGranted(List<String> list) {
            SharedPreferences openFileService = AIDEUtils.getOpenFileService();
            if (openFileService.contains("CurrentFiles_")) {
                openFileService.edit().putString("CurrentFiles", openFileService.getString("CurrentFiles_", "")).commit();
                openFileService.edit().remove("CurrentFiles_").commit();
            }
            this.this$0.checkOpenFile();
            List<File> currentFiles = AIDEUtils.getCurrentFiles();
            File currentProject = ProjectUtils.getCurrentProject();
            if (currentProject != null) {
                AIDEUtils.openProject(currentProject.getAbsolutePath(), currentFiles);
                Toasty.info(new StringBuffer().append(Utils.isCN() ? "打开工程：" : "Open project: ").append(currentProject.getAbsolutePath()).toString(), 1).show();
            } else if (currentFiles != null) {
                AIDEUtils.openFile(currentFiles);
            }
            this.this$0.setFileTabVisible(AIDEUtils.getCurrentEditorFile() != null);
            AIDEUtils.reLoadFileBrowser();
            if (this.this$0.mDrawer != null) {
                AIDEUtils.openSplit(false);
            } else {
                AIDEUtils.closeSplit(false);
            }
        }

        public void onDenied(List<String> list, List<String> list2) {
            new AlertDialog.Builder(this.this$0).setMessage(Utils.isCN() ? "由于没有存储权限，软件无法正常使用！" : "Because there is no storage permission, the software can not be used properly!").setPositiveButton(Utils.isCN() ? "授权" : "Authorize", new DialogInterface.OnClickListener(this, list) {
                private final AnonymousClass100000021 this$0;
                private final List val$permissionsDeniedForever;

                {
                    this.this$0 = this;
                    this.val$permissionsDeniedForever = list;
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (this.val$permissionsDeniedForever.isEmpty()) {
                        this.this$0.this$0.requestPermission();
                    } else {
                        PermissionUtils.launchAppDetailsSettings();
                    }
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public void setFileTabVisible(boolean z) {
        if (hasTabView()) {
            ActionBar actionBar = Utils.getMainActivity().getActionBar();
            if (z) {
                actionBar.setNavigationMode(2);
            } else {
                actionBar.setNavigationMode(0);
            }
        }
    }

    private void setNoOpenFileView() {
        if (AIDEUtils.isLightTheme()) {
            return;
        }
        ((ViewGroup) findViewById(AideR.C1673id.mainNoOpenFilesView).getParent()).getChildAt(0).setAlpha(0.6f);
    }

    public void setDrawerToggleVisible(boolean z) {
        getActionBar().setDisplayHomeAsUpEnabled(z);
    }
}
