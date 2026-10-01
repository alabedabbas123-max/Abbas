package org.xutils.db;

import android.database.Cursor;
import com.baidu.mobstat.Config;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xutils.common.util.IOUtil;
import org.xutils.db.sqlite.WhereBuilder;
import org.xutils.db.table.DbModel;
import org.xutils.db.table.TableEntity;
import org.xutils.ex.DbException;

public final class Selector<T> {
    private int limit = 0;
    private int offset = 0;
    private List<OrderBy> orderByList;
    private final TableEntity<T> table;
    private WhereBuilder whereBuilder;

    private Selector(TableEntity<T> tableEntity) {
        this.table = tableEntity;
    }

    static <T> Selector<T> from(TableEntity<T> tableEntity) {
        return new Selector<>(tableEntity);
    }

    public Selector<T> where(WhereBuilder whereBuilder) {
        this.whereBuilder = whereBuilder;
        return this;
    }

    public Selector<T> where(String str, String str2, Object obj) {
        this.whereBuilder = WhereBuilder.m9068b(str, str2, obj);
        return this;
    }

    public Selector<T> m9063and(String str, String str2, Object obj) {
        this.whereBuilder.m9069and(str, str2, obj);
        return this;
    }

    public Selector<T> m9064and(WhereBuilder whereBuilder) {
        this.whereBuilder.m9070and(whereBuilder);
        return this;
    }

    public Selector<T> m9065or(String str, String str2, Object obj) {
        this.whereBuilder.m9071or(str, str2, obj);
        return this;
    }

    public Selector<T> m9066or(WhereBuilder whereBuilder) {
        this.whereBuilder.m9072or(whereBuilder);
        return this;
    }

    public Selector<T> expr(String str) {
        if (this.whereBuilder == null) {
            this.whereBuilder = WhereBuilder.m9067b();
        }
        this.whereBuilder.expr(str);
        return this;
    }

    public DbModelSelector groupBy(String str) {
        return new DbModelSelector((Selector<?>) this, str);
    }

    public DbModelSelector select(String... strArr) {
        return new DbModelSelector((Selector<?>) this, strArr);
    }

    public Selector<T> orderBy(String str) {
        if (this.orderByList == null) {
            this.orderByList = new ArrayList(5);
        }
        this.orderByList.add(new OrderBy(str));
        return this;
    }

    public Selector<T> orderBy(String str, boolean z) {
        if (this.orderByList == null) {
            this.orderByList = new ArrayList(5);
        }
        this.orderByList.add(new OrderBy(str, z));
        return this;
    }

    public Selector<T> limit(int i) {
        this.limit = i;
        return this;
    }

    public Selector<T> offset(int i) {
        this.offset = i;
        return this;
    }

    public TableEntity<T> getTable() {
        return this.table;
    }

    public WhereBuilder getWhereBuilder() {
        return this.whereBuilder;
    }

    public List<OrderBy> getOrderByList() {
        return this.orderByList;
    }

    public int getLimit() {
        return this.limit;
    }

    public int getOffset() {
        return this.offset;
    }

    public T findFirst() throws DbException {
        T t = null;
        if (this.table.tableIsExists()) {
            limit(1);
            Cursor cursorExecQuery = this.table.getDb().execQuery(toString());
            try {
                if (cursorExecQuery != null) {
                    try {
                        if (cursorExecQuery.moveToNext()) {
                            t = (T) CursorUtils.getEntity(this.table, cursorExecQuery);
                            IOUtil.closeQuietly(cursorExecQuery);
                        } else {
                            IOUtil.closeQuietly(cursorExecQuery);
                        }
                    } catch (Throwable th) {
                        throw new DbException(th);
                    }
                }
            } catch (Throwable th2) {
                IOUtil.closeQuietly(cursorExecQuery);
                throw th2;
            }
        }
        return t;
    }

    public List<T> findAll() throws DbException {
        Cursor cursorExecQuery;
        ArrayList arrayList = null;
        if (this.table.tableIsExists() && (cursorExecQuery = this.table.getDb().execQuery(toString())) != null) {
            try {
                try {
                    arrayList = new ArrayList();
                    while (cursorExecQuery.moveToNext()) {
                        arrayList.add(CursorUtils.getEntity(this.table, cursorExecQuery));
                    }
                    IOUtil.closeQuietly(cursorExecQuery);
                } catch (Throwable th) {
                    throw new DbException(th);
                }
            } catch (Throwable th2) {
                IOUtil.closeQuietly(cursorExecQuery);
                throw th2;
            }
        }
        return arrayList;
    }

    public long count() throws DbException {
        DbModel dbModelFindFirst;
        if (this.table.tableIsExists() && (dbModelFindFirst = select("count(\"" + this.table.getId().getName() + "\") as count").findFirst()) != null) {
            return dbModelFindFirst.getLong(Config.TRACE_VISIT_RECENT_COUNT, 0L);
        }
        return 0L;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append("*");
        sb.append(" FROM ").append("\"").append(this.table.getName()).append("\"");
        if (this.whereBuilder != null && this.whereBuilder.getWhereItemSize() > 0) {
            sb.append(" WHERE ").append(this.whereBuilder.toString());
        }
        if (this.orderByList != null && this.orderByList.size() > 0) {
            sb.append(" ORDER BY ");
            Iterator<OrderBy> it = this.orderByList.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString()).append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        if (this.limit > 0) {
            sb.append(" LIMIT ").append(this.limit);
            sb.append(" OFFSET ").append(this.offset);
        }
        return sb.toString();
    }

    public static class OrderBy {
        private String columnName;
        private boolean desc;

        public OrderBy(String str) {
            this.columnName = str;
        }

        public OrderBy(String str, boolean z) {
            this.columnName = str;
            this.desc = z;
        }

        public String toString() {
            return "\"" + this.columnName + "\"" + (this.desc ? " DESC" : " ASC");
        }
    }
}
