package org.xutils;

import android.app.Application;
import android.content.Context;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import org.xutils.common.TaskController;
import org.xutils.common.task.TaskControllerImpl;
import org.xutils.http.HttpManagerImpl;
import org.xutils.image.ImageManagerImpl;
import org.xutils.db.DbManagerImpl;
import org.xutils.ex.DbException;
import org.xutils.view.ViewInjectorImpl;

public final class x {
    private x() {
    }

    public static boolean isDebug() {
        return Ext.debug;
    }

    public static Application m9074app() {
        if (Ext.f6739app == null) {
            try {
                Application unused = Ext.f6739app = new MockApplication((Context) Class.forName("com.android.layoutlib.bridge.impl.RenderAction").getDeclaredMethod("getCurrentContext", new Class[0]).invoke(null, new Object[0]));
            } catch (Throwable th) {
                throw new RuntimeException("please invoke x.Ext.init(app) on Application#onCreate() and register your Application in manifest.");
            }
        }
        return Ext.f6739app;
    }

    public static TaskController task() {
        return Ext.taskController;
    }

    public static HttpManager http() {
        if (Ext.httpManager == null) {
            HttpManagerImpl.registerInstance();
        }
        return Ext.httpManager;
    }

    public static ImageManager image() {
        if (Ext.imageManager == null) {
            ImageManagerImpl.registerInstance();
        }
        return Ext.imageManager;
    }

    public static ViewInjector view() {
        if (Ext.viewInjector == null) {
            ViewInjectorImpl.registerInstance();
        }
        return Ext.viewInjector;
    }

    public static DbManager getDb(DbManager.DaoConfig daoConfig) throws DbException {
        return DbManagerImpl.getInstance(daoConfig);
    }

    public static class Ext {

        private static Application f6739app;
        private static boolean debug;
        private static HttpManager httpManager;
        private static ImageManager imageManager;
        private static TaskController taskController;
        private static ViewInjector viewInjector;

        private Ext() {
        }

        public static void init(Application application) {
            TaskControllerImpl.registerInstance();
            if (f6739app == null) {
                f6739app = application;
            }
        }

        public static void setDebug(boolean z) {
            debug = z;
        }

        public static void setTaskController(TaskController taskController2) {
            if (taskController == null) {
                taskController = taskController2;
            }
        }

        public static void setHttpManager(HttpManager httpManager2) {
            httpManager = httpManager2;
        }

        public static void setImageManager(ImageManager imageManager2) {
            imageManager = imageManager2;
        }

        public static void setViewInjector(ViewInjector viewInjector2) {
            viewInjector = viewInjector2;
        }

        public static void setDefaultHostnameVerifier(HostnameVerifier hostnameVerifier) {
            HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
        }
    }

    private static class MockApplication extends Application {
        public MockApplication(Context context) {
            attachBaseContext(context);
        }
    }
}
