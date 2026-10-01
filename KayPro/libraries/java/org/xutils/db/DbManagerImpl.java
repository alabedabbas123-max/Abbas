package org.xutils.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xutils.x;
import org.xutils.DbManager;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.KeyValue;
import org.xutils.common.util.LogUtil;
import org.xutils.db.sqlite.SqlInfo;
import org.xutils.db.sqlite.SqlInfoBuilder;
import org.xutils.db.sqlite.WhereBuilder;
import org.xutils.db.table.ColumnEntity;
import org.xutils.db.table.DbBase;
import org.xutils.db.table.DbModel;
import org.xutils.db.table.TableEntity;
import org.xutils.ex.DbException;

public final class DbManagerImpl extends DbBase {
    private static final HashMap<DbManager.DaoConfig, DbManagerImpl> DAO_MAP = new HashMap<>();
    private boolean allowTransaction;
    private DbManager.DaoConfig daoConfig;
    private SQLiteDatabase database;

    private DbManagerImpl(DbManager.DaoConfig daoConfig) throws DbException {
        if (daoConfig == null) {
            throw new IllegalArgumentException("daoConfig may not be null");
        }
        this.daoConfig = daoConfig;
        this.allowTransaction = daoConfig.isAllowTransaction();
        try {
            this.database = openOrCreateDatabase(daoConfig);
            DbManager.DbOpenListener dbOpenListener = daoConfig.getDbOpenListener();
            if (dbOpenListener != null) {
                dbOpenListener.onDbOpened(this);
            }
        } catch (DbException e) {
            IOUtil.closeQuietly(this.database);
            throw e;
        } catch (Throwable th) {
            IOUtil.closeQuietly(this.database);
            throw new DbException(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0014, B:9:0x001e, B:12:0x002c, B:14:0x0032, B:23:0x0040, B:15:0x0035, B:18:0x003a), top: B:25:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0032 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0014, B:9:0x001e, B:12:0x002c, B:14:0x0032, B:23:0x0040, B:15:0x0035, B:18:0x003a), top: B:25:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x003a A[Catch: all -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0014, B:9:0x001e, B:12:0x002c, B:14:0x0032, B:23:0x0040, B:15:0x0035, B:18:0x003a), top: B:25:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040 A[Catch: all -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0014, B:9:0x001e, B:12:0x002c, B:14:0x0032, B:23:0x0040, B:15:0x0035, B:18:0x003a), top: B:25:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0014, B:9:0x001e, B:12:0x002c, B:14:0x0032, B:23:0x0040, B:15:0x0035, B:18:0x003a), top: B:25:0x0005 }] */
    public static synchronized DbManager getInstance(DbManager.DaoConfig daoConfig) throws DbException {
        DbManagerImpl dbManagerImpl;
        SQLiteDatabase sQLiteDatabase;
        int version;
        int dbVersion;
        DbManager.DbUpgradeListener dbUpgradeListener;
        if (daoConfig == null) {
            daoConfig = new DbManager.DaoConfig();
            dbManagerImpl = DAO_MAP.get(daoConfig);
            if (dbManagerImpl == null) {
                dbManagerImpl = new DbManagerImpl(daoConfig);
                DAO_MAP.put(daoConfig, dbManagerImpl);
            } else {
                dbManagerImpl.daoConfig = daoConfig;
            }
            sQLiteDatabase = dbManagerImpl.database;
            version = sQLiteDatabase.getVersion();
            dbVersion = daoConfig.getDbVersion();
            if (version != dbVersion) {
                if (version != 0) {
                    dbUpgradeListener = daoConfig.getDbUpgradeListener();
                    if (dbUpgradeListener != null) {
                        dbUpgradeListener.onUpgrade(dbManagerImpl, version, dbVersion);
                    } else {
                        dbManagerImpl.dropDb();
                    }
                }
                sQLiteDatabase.setVersion(dbVersion);
            }
        } else {
            dbManagerImpl = DAO_MAP.get(daoConfig);
            if (dbManagerImpl == null) {
                dbManagerImpl = new DbManagerImpl(daoConfig);
                DAO_MAP.put(daoConfig, dbManagerImpl);
            } else {
                dbManagerImpl.daoConfig = daoConfig;
            }
            sQLiteDatabase = dbManagerImpl.database;
            version = sQLiteDatabase.getVersion();
            dbVersion = daoConfig.getDbVersion();
            if (version != dbVersion) {
                if (version != 0) {
                    dbUpgradeListener = daoConfig.getDbUpgradeListener();
                    if (dbUpgradeListener != null) {
                        dbUpgradeListener.onUpgrade(dbManagerImpl, version, dbVersion);
                    } else {
                        dbManagerImpl.dropDb();
                    }
                }
                sQLiteDatabase.setVersion(dbVersion);
            }
        }
        throw th;
        return dbManagerImpl;
    }

    @Override
    public SQLiteDatabase getDatabase() {
        return this.database;
    }

    @Override
    public DbManager.DaoConfig getDaoConfig() {
        return this.daoConfig;
    }

    @Override
    public void saveOrUpdate(Object obj) throws DbException {
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                if (!list.isEmpty()) {
                    TableEntity<?> table = getTable(list.get(0).getClass());
                    table.createTableIfNotExists();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        saveOrUpdateWithoutTransaction(table, it.next());
                    }
                } else {
                    return;
                }
            } else {
                TableEntity<?> table2 = getTable(obj.getClass());
                table2.createTableIfNotExists();
                saveOrUpdateWithoutTransaction(table2, obj);
            }
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override
    public void replace(Object obj) throws DbException {
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                if (!list.isEmpty()) {
                    TableEntity table = getTable(list.get(0).getClass());
                    table.createTableIfNotExists();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        execNonQuery(SqlInfoBuilder.buildReplaceSqlInfo(table, it.next()));
                    }
                } else {
                    return;
                }
            } else {
                TableEntity table2 = getTable(obj.getClass());
                table2.createTableIfNotExists();
                execNonQuery(SqlInfoBuilder.buildReplaceSqlInfo(table2, obj));
            }
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override
    public void save(Object obj) throws DbException {
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                if (!list.isEmpty()) {
                    TableEntity table = getTable(list.get(0).getClass());
                    table.createTableIfNotExists();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(table, it.next()));
                    }
                } else {
                    return;
                }
            } else {
                TableEntity table2 = getTable(obj.getClass());
                table2.createTableIfNotExists();
                execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(table2, obj));
            }
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override
    public boolean saveBindingId(Object obj) throws DbException {
        boolean zSaveBindingIdWithoutTransaction = false;
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                if (!list.isEmpty()) {
                    TableEntity<?> table = getTable(list.get(0).getClass());
                    table.createTableIfNotExists();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!saveBindingIdWithoutTransaction(table, it.next())) {
                            throw new DbException("saveBindingId error, transaction will not commit!");
                        }
                    }
                } else {
                    endTransaction();
                }
                return zSaveBindingIdWithoutTransaction;
            }
            TableEntity<?> table2 = getTable(obj.getClass());
            table2.createTableIfNotExists();
            zSaveBindingIdWithoutTransaction = saveBindingIdWithoutTransaction(table2, obj);
            setTransactionSuccessful();
            endTransaction();
            return zSaveBindingIdWithoutTransaction;
        } catch (Throwable th) {
            endTransaction();
            throw th;
        }
    }

    @Override
    public void deleteById(Class<?> cls, Object obj) throws DbException {
        TableEntity table = getTable(cls);
        if (table.tableIsExists()) {
            try {
                beginTransaction();
                execNonQuery(SqlInfoBuilder.buildDeleteSqlInfoById(table, obj));
                setTransactionSuccessful();
            } finally {
                endTransaction();
            }
        }
    }

    @Override
    public void delete(Object obj) throws DbException {
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                TableEntity table = getTable(list.get(0).getClass());
                if (!table.tableIsExists()) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    execNonQuery(SqlInfoBuilder.buildDeleteSqlInfo((TableEntity<?>) table, it.next()));
                }
            } else {
                TableEntity table2 = getTable(obj.getClass());
                if (!table2.tableIsExists()) {
                    return;
                } else {
                    execNonQuery(SqlInfoBuilder.buildDeleteSqlInfo((TableEntity<?>) table2, obj));
                }
            }
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override
    public void delete(Class<?> cls) throws DbException {
        delete(cls, null);
    }

    @Override
    public int delete(Class<?> cls, WhereBuilder whereBuilder) throws DbException {
        TableEntity table = getTable(cls);
        if (!table.tableIsExists()) {
            return 0;
        }
        try {
            beginTransaction();
            int iExecuteUpdateDelete = executeUpdateDelete(SqlInfoBuilder.buildDeleteSqlInfo((TableEntity<?>) table, whereBuilder));
            setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            endTransaction();
        }
    }

    @Override
    public void update(Object obj, String... strArr) throws DbException {
        try {
            beginTransaction();
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                TableEntity table = getTable(list.get(0).getClass());
                if (!table.tableIsExists()) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    execNonQuery(SqlInfoBuilder.buildUpdateSqlInfo((TableEntity<?>) table, it.next(), strArr));
                }
            } else {
                TableEntity table2 = getTable(obj.getClass());
                if (!table2.tableIsExists()) {
                    return;
                } else {
                    execNonQuery(SqlInfoBuilder.buildUpdateSqlInfo((TableEntity<?>) table2, obj, strArr));
                }
            }
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Override
    public int update(Class<?> cls, WhereBuilder whereBuilder, KeyValue... keyValueArr) throws DbException {
        TableEntity table = getTable(cls);
        if (!table.tableIsExists()) {
            return 0;
        }
        try {
            beginTransaction();
            int iExecuteUpdateDelete = executeUpdateDelete(SqlInfoBuilder.buildUpdateSqlInfo((TableEntity<?>) table, whereBuilder, keyValueArr));
            setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            endTransaction();
        }
    }

    @Override
    public <T> T findById(Class<T> cls, Object obj) throws DbException {
        Cursor cursorExecQuery;
        T t = null;
        TableEntity<T> table = getTable(cls);
        if (table.tableIsExists() && (cursorExecQuery = execQuery(Selector.from(table).where(table.getId().getName(), "=", obj).limit(1).toString())) != null) {
            try {
                try {
                    if (cursorExecQuery.moveToNext()) {
                        t = (T) CursorUtils.getEntity(table, cursorExecQuery);
                        IOUtil.closeQuietly(cursorExecQuery);
                    } else {
                        IOUtil.closeQuietly(cursorExecQuery);
                    }
                } catch (Throwable th) {
                    throw new DbException(th);
                }
            } catch (Throwable th2) {
                IOUtil.closeQuietly(cursorExecQuery);
                throw th2;
            }
        }
        return t;
    }

    @Override
    public <T> T findFirst(Class<T> cls) throws DbException {
        return selector(cls).findFirst();
    }

    @Override
    public <T> List<T> findAll(Class<T> cls) throws DbException {
        return selector(cls).findAll();
    }

    @Override
    public <T> Selector<T> selector(Class<T> cls) throws DbException {
        return Selector.from(getTable(cls));
    }

    @Override
    public DbModel findDbModelFirst(SqlInfo sqlInfo) throws DbException {
        Cursor cursorExecQuery = execQuery(sqlInfo);
        try {
            if (cursorExecQuery != null) {
                try {
                    if (cursorExecQuery.moveToNext()) {
                        DbModel dbModel = CursorUtils.getDbModel(cursorExecQuery);
                        IOUtil.closeQuietly(cursorExecQuery);
                        return dbModel;
                    }
                    IOUtil.closeQuietly(cursorExecQuery);
                } catch (Throwable th) {
                    throw new DbException(th);
                }
            }
            return null;
        } catch (Throwable th2) {
            IOUtil.closeQuietly(cursorExecQuery);
            throw th2;
        }
    }

    @Override
    public List<DbModel> findDbModelAll(SqlInfo sqlInfo) throws DbException {
        ArrayList arrayList = new ArrayList();
        Cursor cursorExecQuery = execQuery(sqlInfo);
        if (cursorExecQuery != null) {
            while (cursorExecQuery.moveToNext()) {
                try {
                    try {
                        arrayList.add(CursorUtils.getDbModel(cursorExecQuery));
                    } catch (Throwable th) {
                        throw new DbException(th);
                    }
                } catch (Throwable th2) {
                    IOUtil.closeQuietly(cursorExecQuery);
                    throw th2;
                }
            }
            IOUtil.closeQuietly(cursorExecQuery);
        }
        return arrayList;
    }

    private SQLiteDatabase openOrCreateDatabase(DbManager.DaoConfig daoConfig) {
        File dbDir = daoConfig.getDbDir();
        if (dbDir != null && (dbDir.exists() || dbDir.mkdirs())) {
            return SQLiteDatabase.openOrCreateDatabase(new File(dbDir, daoConfig.getDbName()), (SQLiteDatabase.CursorFactory) null);
        }
        return ClassX.m9074app().openOrCreateDatabase(daoConfig.getDbName(), 0, null);
    }

    private void saveOrUpdateWithoutTransaction(TableEntity<?> tableEntity, Object obj) throws DbException {
        ColumnEntity id = tableEntity.getId();
        if (id.isAutoId()) {
            if (id.getColumnValue(obj) != null) {
                execNonQuery(SqlInfoBuilder.buildUpdateSqlInfo(tableEntity, obj, new String[0]));
                return;
            } else {
                saveBindingIdWithoutTransaction(tableEntity, obj);
                return;
            }
        }
        execNonQuery(SqlInfoBuilder.buildReplaceSqlInfo(tableEntity, obj));
    }

    private boolean saveBindingIdWithoutTransaction(TableEntity<?> tableEntity, Object obj) throws DbException {
        ColumnEntity id = tableEntity.getId();
        if (id.isAutoId()) {
            execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(tableEntity, obj));
            long lastAutoIncrementId = getLastAutoIncrementId(tableEntity.getName());
            if (lastAutoIncrementId == -1) {
                return false;
            }
            id.setAutoIdValue(obj, lastAutoIncrementId);
            return true;
        }
        execNonQuery(SqlInfoBuilder.buildInsertSqlInfo(tableEntity, obj));
        return true;
    }

    private long getLastAutoIncrementId(String str) throws DbException {
        long j = -1;
        Cursor cursorExecQuery = execQuery("SELECT seq FROM sqlite_sequence WHERE name='" + str + "' LIMIT 1");
        try {
            if (cursorExecQuery != null) {
                try {
                    if (cursorExecQuery.moveToNext()) {
                        j = cursorExecQuery.getLong(0);
                    }
                    IOUtil.closeQuietly(cursorExecQuery);
                } catch (Throwable th) {
                    throw new DbException(th);
                }
            }
            return j;
        } catch (Throwable th2) {
            IOUtil.closeQuietly(cursorExecQuery);
            throw th2;
        }
    }

    @Override
    public void close() throws IOException {
        if (DAO_MAP.containsKey(this.daoConfig)) {
            DAO_MAP.remove(this.daoConfig);
            this.database.close();
        }
    }

    private void beginTransaction() {
        if (this.allowTransaction) {
            if (Build.VERSION.SDK_INT >= 16 && this.database.isWriteAheadLoggingEnabled()) {
                this.database.beginTransactionNonExclusive();
            } else {
                this.database.beginTransaction();
            }
        }
    }

    private void setTransactionSuccessful() {
        if (this.allowTransaction) {
            this.database.setTransactionSuccessful();
        }
    }

    private void endTransaction() {
        if (this.allowTransaction) {
            this.database.endTransaction();
        }
    }

    @Override
    public int executeUpdateDelete(SqlInfo sqlInfo) throws DbException {
        SQLiteStatement sQLiteStatementBuildStatement = null;
        try {
            try {
                sQLiteStatementBuildStatement = sqlInfo.buildStatement(this.database);
                int iExecuteUpdateDelete = sQLiteStatementBuildStatement.executeUpdateDelete();
                if (sQLiteStatementBuildStatement != null) {
                    try {
                        sQLiteStatementBuildStatement.releaseReference();
                    } catch (Throwable th) {
                        LogUtil.m9046e(th.getMessage(), th);
                    }
                }
                return iExecuteUpdateDelete;
            } catch (Throwable th2) {
                throw new DbException(th2);
            }
        } catch (Throwable th3) {
            if (sQLiteStatementBuildStatement != null) {
                try {
                    sQLiteStatementBuildStatement.releaseReference();
                } catch (Throwable th4) {
                    LogUtil.m9046e(th4.getMessage(), th4);
                }
            }
            throw th3;
        }
    }

    @Override
    public int executeUpdateDelete(String str) throws DbException {
        SQLiteStatement sQLiteStatementCompileStatement = null;
        try {
            try {
                sQLiteStatementCompileStatement = this.database.compileStatement(str);
                int iExecuteUpdateDelete = sQLiteStatementCompileStatement.executeUpdateDelete();
                if (sQLiteStatementCompileStatement != null) {
                    try {
                        sQLiteStatementCompileStatement.releaseReference();
                    } catch (Throwable th) {
                        LogUtil.m9046e(th.getMessage(), th);
                    }
                }
                return iExecuteUpdateDelete;
            } catch (Throwable th2) {
                throw new DbException(th2);
            }
        } catch (Throwable th3) {
            if (sQLiteStatementCompileStatement != null) {
                try {
                    sQLiteStatementCompileStatement.releaseReference();
                } catch (Throwable th4) {
                    LogUtil.m9046e(th4.getMessage(), th4);
                }
            }
            throw th3;
        }
    }

    @Override
    public void execNonQuery(SqlInfo sqlInfo) throws DbException {
        SQLiteStatement sQLiteStatementBuildStatement = null;
        try {
            try {
                sQLiteStatementBuildStatement = sqlInfo.buildStatement(this.database);
                sQLiteStatementBuildStatement.execute();
                if (sQLiteStatementBuildStatement != null) {
                    try {
                        sQLiteStatementBuildStatement.releaseReference();
                    } catch (Throwable th) {
                        LogUtil.m9046e(th.getMessage(), th);
                    }
                }
            } catch (Throwable th2) {
                if (sQLiteStatementBuildStatement != null) {
                    try {
                        sQLiteStatementBuildStatement.releaseReference();
                    } catch (Throwable th3) {
                        LogUtil.m9046e(th3.getMessage(), th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            throw new DbException(th4);
        }
    }

    @Override
    public void execNonQuery(String str) throws DbException {
        try {
            this.database.execSQL(str);
        } catch (Throwable th) {
            throw new DbException(th);
        }
    }

    @Override
    public Cursor execQuery(SqlInfo sqlInfo) throws DbException {
        try {
            return this.database.rawQuery(sqlInfo.getSql(), sqlInfo.getBindArgsAsStrArray());
        } catch (Throwable th) {
            throw new DbException(th);
        }
    }

    @Override
    public Cursor execQuery(String str) throws DbException {
        try {
            return this.database.rawQuery(str, null);
        } catch (Throwable th) {
            throw new DbException(th);
        }
    }
}
