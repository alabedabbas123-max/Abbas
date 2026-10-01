package org.xutils.db;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xutils.common.util.IOUtil;
import org.xutils.db.sqlite.WhereBuilder;
import org.xutils.db.table.DbModel;
import org.xutils.db.table.TableEntity;
import org.xutils.ex.DbException;

public final class DbModelSelector {
    private String[] columnExpressions;
    private String groupByColumnName;
    private WhereBuilder having;
    private Selector<?> selector;

    private DbModelSelector(TableEntity<?> tableEntity) {
        this.selector = Selector.from(tableEntity);
    }

    protected DbModelSelector(Selector<?> selector, String str) {
        this.selector = selector;
        this.groupByColumnName = str;
    }

    protected DbModelSelector(Selector<?> selector, String[] strArr) {
        this.selector = selector;
        this.columnExpressions = strArr;
    }

    static DbModelSelector from(TableEntity<?> tableEntity) {
        return new DbModelSelector(tableEntity);
    }

    public DbModelSelector where(WhereBuilder whereBuilder) {
        this.selector.where(whereBuilder);
        return this;
    }

    public DbModelSelector where(String str, String str2, Object obj) {
        this.selector.where(str, str2, obj);
        return this;
    }

    public DbModelSelector m9059and(String str, String str2, Object obj) {
        this.selector.m9063and(str, str2, obj);
        return this;
    }

    public DbModelSelector m9060and(WhereBuilder whereBuilder) {
        this.selector.m9064and(whereBuilder);
        return this;
    }

    public DbModelSelector m9061or(String str, String str2, Object obj) {
        this.selector.m9065or(str, str2, obj);
        return this;
    }

    public DbModelSelector m9062or(WhereBuilder whereBuilder) {
        this.selector.m9066or(whereBuilder);
        return this;
    }

    public DbModelSelector expr(String str) {
        this.selector.expr(str);
        return this;
    }

    public DbModelSelector groupBy(String str) {
        this.groupByColumnName = str;
        return this;
    }

    public DbModelSelector having(WhereBuilder whereBuilder) {
        this.having = whereBuilder;
        return this;
    }

    public DbModelSelector select(String... strArr) {
        this.columnExpressions = strArr;
        return this;
    }

    public DbModelSelector orderBy(String str) {
        this.selector.orderBy(str);
        return this;
    }

    public DbModelSelector orderBy(String str, boolean z) {
        this.selector.orderBy(str, z);
        return this;
    }

    public DbModelSelector limit(int i) {
        this.selector.limit(i);
        return this;
    }

    public DbModelSelector offset(int i) {
        this.selector.offset(i);
        return this;
    }

    public TableEntity<?> getTable() {
        return this.selector.getTable();
    }

    public DbModel findFirst() throws DbException {
        DbModel dbModel = null;
        TableEntity<?> table = this.selector.getTable();
        if (table.tableIsExists()) {
            limit(1);
            Cursor cursorExecQuery = table.getDb().execQuery(toString());
            try {
                if (cursorExecQuery != null) {
                    try {
                        if (cursorExecQuery.moveToNext()) {
                            dbModel = CursorUtils.getDbModel(cursorExecQuery);
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
        return dbModel;
    }

    public List<DbModel> findAll() throws DbException {
        Cursor cursorExecQuery;
        ArrayList arrayList = null;
        TableEntity<?> table = this.selector.getTable();
        if (table.tableIsExists() && (cursorExecQuery = table.getDb().execQuery(toString())) != null) {
            try {
                try {
                    arrayList = new ArrayList();
                    while (cursorExecQuery.moveToNext()) {
                        arrayList.add(CursorUtils.getDbModel(cursorExecQuery));
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        if (this.columnExpressions != null && this.columnExpressions.length > 0) {
            for (String str : this.columnExpressions) {
                sb.append(str);
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
        } else if (!TextUtils.isEmpty(this.groupByColumnName)) {
            sb.append(this.groupByColumnName);
        } else {
            sb.append("*");
        }
        sb.append(" FROM ").append("\"").append(this.selector.getTable().getName()).append("\"");
        WhereBuilder whereBuilder = this.selector.getWhereBuilder();
        if (whereBuilder != null && whereBuilder.getWhereItemSize() > 0) {
            sb.append(" WHERE ").append(whereBuilder.toString());
        }
        if (!TextUtils.isEmpty(this.groupByColumnName)) {
            sb.append(" GROUP BY ").append("\"").append(this.groupByColumnName).append("\"");
            if (this.having != null && this.having.getWhereItemSize() > 0) {
                sb.append(" HAVING ").append(this.having.toString());
            }
        }
        List<Selector.OrderBy> orderByList = this.selector.getOrderByList();
        if (orderByList != null && orderByList.size() > 0) {
            sb.append(" ORDER BY ");
            Iterator<Selector.OrderBy> it = orderByList.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString()).append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        if (this.selector.getLimit() > 0) {
            sb.append(" LIMIT ").append(this.selector.getLimit());
            sb.append(" OFFSET ").append(this.selector.getOffset());
        }
        return sb.toString();
    }
}
