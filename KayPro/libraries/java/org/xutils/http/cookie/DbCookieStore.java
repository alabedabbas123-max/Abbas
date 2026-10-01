package org.xutils.http.cookie;

import android.text.TextUtils;
import com.baidu.mobstat.Config;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.xutils.x;
import org.xutils.DbManager;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.common.util.LogUtil;
import org.xutils.config.DbConfigs;
import org.xutils.db.Selector;
import org.xutils.db.sqlite.WhereBuilder;
import org.xutils.db.table.DbModel;

public enum DbCookieStore implements CookieStore {
    INSTANCE;

    private static final int LIMIT_COUNT = 5000;
    private static final long TRIM_TIME_SPAN = 1000;

    private DbManager f6734db;
    private final Executor trimExecutor = new PriorityExecutor(1, true);
    private long lastTrimTime = 0;

    DbCookieStore() {
        ClassX.task().mo9039run(new Runnable() {
            @Override
            public void run() {
                DbCookieStore.this.tryInit();
            }
        });
    }

    public void tryInit() {
        if (this.f6734db == null) {
            synchronized (this) {
                if (this.f6734db == null) {
                    try {
                        this.f6734db = ClassX.getDb(DbConfigs.COOKIE.getConfig());
                        this.f6734db.delete(CookieEntity.class, WhereBuilder.m9068b("expiry", "=", -1L));
                    } catch (Throwable th) {
                        LogUtil.m9046e(th.getMessage(), th);
                    }
                }
            }
        }
    }

    @Override
    public void add(URI uri, HttpCookie httpCookie) {
        if (httpCookie != null) {
            tryInit();
            try {
                this.f6734db.replace(new CookieEntity(getEffectiveURI(uri), httpCookie));
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
            }
            trimSize();
        }
    }

    @Override
    public List<HttpCookie> get(URI uri) {
        if (uri == null) {
            throw new NullPointerException("uri is null");
        }
        tryInit();
        URI effectiveURI = getEffectiveURI(uri);
        ArrayList arrayList = new ArrayList();
        try {
            Selector selector = this.f6734db.selector(CookieEntity.class);
            WhereBuilder whereBuilderM9067b = WhereBuilder.m9067b();
            String host = effectiveURI.getHost();
            if (!TextUtils.isEmpty(host)) {
                WhereBuilder whereBuilderM9071or = WhereBuilder.m9068b("domain", "=", host).m9071or("domain", "=", "." + host);
                int iIndexOf = host.indexOf(".");
                int iLastIndexOf = host.lastIndexOf(".");
                if (iIndexOf > 0 && iLastIndexOf > iIndexOf) {
                    String strSubstring = host.substring(iIndexOf, host.length());
                    if (!TextUtils.isEmpty(strSubstring)) {
                        whereBuilderM9071or.m9071or("domain", "=", strSubstring);
                    }
                }
                whereBuilderM9067b.m9070and(whereBuilderM9071or);
            }
            String path = effectiveURI.getPath();
            if (!TextUtils.isEmpty(path)) {
                WhereBuilder whereBuilderM9071or2 = WhereBuilder.m9068b(Config.FEED_LIST_ITEM_PATH, "=", path).m9071or(Config.FEED_LIST_ITEM_PATH, "=", "/").m9071or(Config.FEED_LIST_ITEM_PATH, "=", null);
                int iLastIndexOf2 = path.lastIndexOf("/");
                while (iLastIndexOf2 > 0) {
                    path = path.substring(0, iLastIndexOf2);
                    whereBuilderM9071or2.m9071or(Config.FEED_LIST_ITEM_PATH, "=", path);
                    iLastIndexOf2 = path.lastIndexOf("/");
                }
                whereBuilderM9067b.m9070and(whereBuilderM9071or2);
            }
            whereBuilderM9067b.m9071or("uri", "=", effectiveURI.toString());
            List<CookieEntity> listFindAll = selector.where(whereBuilderM9067b).findAll();
            if (listFindAll != null) {
                for (CookieEntity cookieEntity : listFindAll) {
                    if (!cookieEntity.isExpired()) {
                        arrayList.add(cookieEntity.toHttpCookie());
                    }
                }
            }
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
        }
        return arrayList;
    }

    @Override
    public List<HttpCookie> getCookies() {
        tryInit();
        ArrayList arrayList = new ArrayList();
        try {
            List<CookieEntity> listFindAll = this.f6734db.findAll(CookieEntity.class);
            if (listFindAll != null) {
                for (CookieEntity cookieEntity : listFindAll) {
                    if (!cookieEntity.isExpired()) {
                        arrayList.add(cookieEntity.toHttpCookie());
                    }
                }
            }
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
        }
        return arrayList;
    }

    @Override
    public List<URI> getURIs() {
        tryInit();
        ArrayList arrayList = new ArrayList();
        try {
            List<DbModel> listFindAll = this.f6734db.selector(CookieEntity.class).select("uri").findAll();
            if (listFindAll != null) {
                Iterator<DbModel> it = listFindAll.iterator();
                while (it.hasNext()) {
                    String string = it.next().getString("uri");
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            arrayList.add(new URI(string));
                        } catch (Throwable th) {
                            LogUtil.m9046e(th.getMessage(), th);
                            try {
                                this.f6734db.delete(CookieEntity.class, WhereBuilder.m9068b("uri", "=", string));
                            } catch (Throwable th2) {
                                LogUtil.m9046e(th2.getMessage(), th2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            LogUtil.m9046e(th3.getMessage(), th3);
        }
        return arrayList;
    }

    @Override
    public boolean remove(URI uri, HttpCookie httpCookie) {
        if (httpCookie == null) {
            return true;
        }
        tryInit();
        try {
            WhereBuilder whereBuilderM9068b = WhereBuilder.m9068b("name", "=", httpCookie.getName());
            String domain = httpCookie.getDomain();
            if (!TextUtils.isEmpty(domain)) {
                whereBuilderM9068b.m9069and("domain", "=", domain);
            }
            String path = httpCookie.getPath();
            if (!TextUtils.isEmpty(path)) {
                if (path.length() > 1 && path.endsWith("/")) {
                    path = path.substring(0, path.length() - 1);
                }
                whereBuilderM9068b.m9069and(Config.FEED_LIST_ITEM_PATH, "=", path);
            }
            this.f6734db.delete(CookieEntity.class, whereBuilderM9068b);
            return true;
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
            return false;
        }
    }

    @Override
    public boolean removeAll() {
        tryInit();
        try {
            this.f6734db.delete(CookieEntity.class);
            return true;
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
            return true;
        }
    }

    private void trimSize() {
        this.trimExecutor.execute(new Runnable() {
            @Override
            public void run() {
                List listFindAll;
                DbCookieStore.this.tryInit();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - DbCookieStore.this.lastTrimTime >= DbCookieStore.TRIM_TIME_SPAN) {
                    DbCookieStore.this.lastTrimTime = jCurrentTimeMillis;
                    try {
                        DbCookieStore.this.f6734db.delete(CookieEntity.class, WhereBuilder.m9068b("expiry", "<", Long.valueOf(System.currentTimeMillis())).m9069and("expiry", "!=", -1L));
                    } catch (Throwable th) {
                        LogUtil.m9046e(th.getMessage(), th);
                    }
                    try {
                        int iCount = (int) DbCookieStore.this.f6734db.selector(CookieEntity.class).count();
                        if (iCount > 5010 && (listFindAll = DbCookieStore.this.f6734db.selector(CookieEntity.class).where("expiry", "!=", -1L).orderBy("expiry").limit(iCount - 5000).findAll()) != null) {
                            DbCookieStore.this.f6734db.delete(listFindAll);
                        }
                    } catch (Throwable th2) {
                        LogUtil.m9046e(th2.getMessage(), th2);
                    }
                }
            }
        });
    }

    private URI getEffectiveURI(URI uri) {
        try {
            return new URI("http", uri.getHost(), uri.getPath(), null, null);
        } catch (Throwable th) {
            LogUtil.m9052w(th.getMessage(), th);
            return uri;
        }
    }
}
