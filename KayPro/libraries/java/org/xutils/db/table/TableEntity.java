package org.xutils.db.table;

import android.database.Cursor;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import org.xutils.DbManager;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.db.annotation.Table;
import org.xutils.db.sqlite.SqlInfoBuilder;
import org.xutils.ex.DbException;

public final class TableEntity<T> {
    private final LinkedHashMap<String, ColumnEntity> columnMap;
    private final Constructor<T> constructor;

    private final DbManager f6726db;
    private final Class<T> entityType;

    private ColumnEntity f6727id;
    private final String name;
    private final String onCreated;
    private volatile Boolean tableCheckedStatus;

    TableEntity(DbManager dbManager, Class<T> cls) throws Throwable {
        this.f6726db = dbManager;
        this.entityType = cls;
        Table table = (Table) cls.getAnnotation(Table.class);
        if (table == null) {
            throw new DbException("missing @Table on " + cls.getName());
        }
        this.name = table.name();
        this.onCreated = table.onCreated();
        try {
            this.constructor = cls.getConstructor(new Class[0]);
            this.constructor.setAccessible(true);
            this.columnMap = TableUtils.findColumnMap(cls);
            for (ColumnEntity columnEntity : this.columnMap.values()) {
                if (columnEntity.isId()) {
                    this.f6727id = columnEntity;
                    return;
                }
            }
        } catch (Throwable th) {
            throw new DbException("missing no-argument constructor for the table: " + this.name);
        }
    }

    public T createEntity() throws Throwable {
        return this.constructor.newInstance(new Object[0]);
    }

    public boolean tableIsExists() throws DbException {
        return tableIsExists(false);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean tableIsExists(boolean z) throws DbException {
        if (this.tableCheckedStatus != null && (this.tableCheckedStatus.booleanValue() || !z)) {
            return this.tableCheckedStatus.booleanValue();
        }
        Cursor cursorExecQuery = this.f6726db.execQuery("SELECT COUNT(*) AS c FROM sqlite_master WHERE type='table' AND name='" + this.name + "'");
        if (cursorExecQuery != null) {
            try {
                if (cursorExecQuery.moveToNext() && cursorExecQuery.getInt(0) > 0) {
                    this.tableCheckedStatus = true;
                    boolean zBooleanValue = this.tableCheckedStatus.booleanValue();
                    IOUtil.closeQuietly(cursorExecQuery);
                    return zBooleanValue;
                }
                IOUtil.closeQuietly(cursorExecQuery);
            } catch (Throwable th) {
                throw new DbException(th);
            }
            IOUtil.closeQuietly(cursorExecQuery);
            throw th;
        }
        this.tableCheckedStatus = false;
        return this.tableCheckedStatus.booleanValue();
    }

    public void createTableIfNotExists() throws DbException {
        if (this.tableCheckedStatus == null || !this.tableCheckedStatus.booleanValue()) {
            synchronized (this.entityType) {
                if (!tableIsExists(true)) {
                    this.f6726db.execNonQuery(SqlInfoBuilder.buildCreateTableSqlInfo(this));
                    this.tableCheckedStatus = true;
                    if (!TextUtils.isEmpty(this.onCreated)) {
                        this.f6726db.execNonQuery(this.onCreated);
                    }
                    DbManager.TableCreateListener tableCreateListener = this.f6726db.getDaoConfig().getTableCreateListener();
                    if (tableCreateListener != null) {
                        try {
                            tableCreateListener.onTableCreated(this.f6726db, this);
                        } catch (Throwable th) {
                            LogUtil.m9046e(th.getMessage(), th);
                        }
                    }
                }
            }
        }
    }

    public DbManager getDb() {
        return this.f6726db;
    }

    public String getName() {
        return this.name;
    }

    public Class<T> getEntityType() {
        return this.entityType;
    }

    public String getOnCreated() {
        return this.onCreated;
    }

    public ColumnEntity getId() {
        return this.f6727id;
    }

    public LinkedHashMap<String, ColumnEntity> getColumnMap() {
        return this.columnMap;
    }

    void setTableCheckedStatus(boolean z) {
        this.tableCheckedStatus = Boolean.valueOf(z);
    }

    public String toString() {
        return this.name;
    }
}
