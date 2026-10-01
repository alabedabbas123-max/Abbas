package org.xutils.db.table;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Iterator;
import org.xutils.DbManager;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.ex.DbException;

public abstract class DbBase implements DbManager {
    private final HashMap<Class<?>, TableEntity<?>> tableMap = new HashMap<>();

    @Override
    public <T> TableEntity<T> getTable(Class<T> cls) throws DbException {
        TableEntity<T> tableEntity;
        synchronized (this.tableMap) {
            tableEntity = (TableEntity) this.tableMap.get(cls);
            if (tableEntity == null) {
                try {
                    tableEntity = new TableEntity<>(this, cls);
                    this.tableMap.put(cls, tableEntity);
                } catch (DbException e) {
                    throw e;
                } catch (Throwable th) {
                    throw new DbException(th);
                }
            }
        }
        return tableEntity;
    }

    @Override
    public void dropTable(Class<?> cls) throws DbException {
        TableEntity table = getTable(cls);
        if (table.tableIsExists()) {
            execNonQuery("DROP TABLE \"" + table.getName() + "\"");
            table.setTableCheckedStatus(false);
            removeTable(cls);
        }
    }

    @Override
    public void dropDb() throws DbException {
        Cursor cursorExecQuery = execQuery("SELECT name FROM sqlite_master WHERE type='table' AND name<>'sqlite_sequence'");
        if (cursorExecQuery != null) {
            while (cursorExecQuery.moveToNext()) {
                try {
                    try {
                        try {
                            execNonQuery("DROP TABLE " + cursorExecQuery.getString(0));
                        } catch (Throwable th) {
                            LogUtil.m9046e(th.getMessage(), th);
                        }
                    } catch (Throwable th2) {
                        throw new DbException(th2);
                    }
                } catch (Throwable th3) {
                    IOUtil.closeQuietly(cursorExecQuery);
                    throw th3;
                }
            }
            synchronized (this.tableMap) {
                try {
                    Iterator<TableEntity<?>> it = this.tableMap.values().iterator();
                    while (it.hasNext()) {
                        it.next().setTableCheckedStatus(false);
                    }
                    this.tableMap.clear();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            IOUtil.closeQuietly(cursorExecQuery);
        }
    }

    @Override
    public void addColumn(Class<?> cls, String str) throws DbException {
        TableEntity table = getTable(cls);
        ColumnEntity columnEntity = table.getColumnMap().get(str);
        if (columnEntity != null) {
            if (table.tableIsExists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("ALTER TABLE ").append("\"").append(table.getName()).append("\"").append(" ADD COLUMN ").append("\"").append(columnEntity.getName()).append("\"").append(" ").append(columnEntity.getColumnDbType()).append(" ").append(columnEntity.getProperty());
                execNonQuery(sb.toString());
                return;
            }
            return;
        }
        throw new DbException("the column(" + str + ") is not defined in table: " + table.getName());
    }

    protected void removeTable(Class<?> cls) {
        synchronized (this.tableMap) {
            this.tableMap.remove(cls);
        }
    }
}
