package org.xutils.config;

import org.xutils.DbManager;
import org.xutils.common.util.LogUtil;
import org.xutils.ex.DbException;

public enum DbConfigs {
    HTTP(new DbManager.DaoConfig().setDbName("xUtils_http_cache.db").setDbVersion(2).setDbOpenListener(new DbManager.DbOpenListener() {
        @Override
        public void onDbOpened(DbManager dbManager) {
            dbManager.getDatabase().enableWriteAheadLogging();
        }
    }).setDbUpgradeListener(new DbManager.DbUpgradeListener() {
        @Override
        public void onUpgrade(DbManager dbManager, int i, int i2) {
            try {
                dbManager.dropDb();
            } catch (DbException e) {
                LogUtil.m9046e(e.getMessage(), e);
            }
        }
    })),
    COOKIE(new DbManager.DaoConfig().setDbName("xUtils_http_cookie.db").setDbVersion(1).setDbOpenListener(new DbManager.DbOpenListener() {
        @Override
        public void onDbOpened(DbManager dbManager) {
            dbManager.getDatabase().enableWriteAheadLogging();
        }
    }).setDbUpgradeListener(new DbManager.DbUpgradeListener() {
        @Override
        public void onUpgrade(DbManager dbManager, int i, int i2) {
            try {
                dbManager.dropDb();
            } catch (DbException e) {
                LogUtil.m9046e(e.getMessage(), e);
            }
        }
    }));

    private DbManager.DaoConfig config;

    DbConfigs(DbManager.DaoConfig daoConfig) {
        this.config = daoConfig;
    }

    public DbManager.DaoConfig getConfig() {
        return this.config;
    }
}
