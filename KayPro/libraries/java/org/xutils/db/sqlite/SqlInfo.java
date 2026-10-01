package org.xutils.db.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import org.xutils.common.util.KeyValue;
import org.xutils.db.converter.ColumnConverterFactory;
import org.xutils.db.table.ColumnUtils;

public final class SqlInfo {
    private List<KeyValue> bindArgs;

    private String f6725sql;

    public SqlInfo() {
    }

    public SqlInfo(String str) {
        this.f6725sql = str;
    }

    public String getSql() {
        return this.f6725sql;
    }

    public void setSql(String str) {
        this.f6725sql = str;
    }

    public void addBindArg(KeyValue keyValue) {
        if (this.bindArgs == null) {
            this.bindArgs = new ArrayList();
        }
        this.bindArgs.add(keyValue);
    }

    public void addBindArgs(List<KeyValue> list) {
        if (this.bindArgs == null) {
            this.bindArgs = list;
        } else {
            this.bindArgs.addAll(list);
        }
    }

    public SQLiteStatement buildStatement(SQLiteDatabase sQLiteDatabase) {
        SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement(this.f6725sql);
        if (this.bindArgs != null) {
            int i = 1;
            while (true) {
                int i2 = i;
                if (i2 < this.bindArgs.size() + 1) {
                    KeyValue keyValue = this.bindArgs.get(i2 - 1);
                    if (keyValue.value == null) {
                        sQLiteStatementCompileStatement.bindNull(i2);
                    } else {
                        Object objFieldValue2DbValue = ColumnConverterFactory.getColumnConverter(keyValue.value.getClass()).fieldValue2DbValue(keyValue.value);
                        switch (r3.getColumnDbType()) {
                            case INTEGER:
                                sQLiteStatementCompileStatement.bindLong(i2, ((Number) objFieldValue2DbValue).longValue());
                                break;
                            case REAL:
                                sQLiteStatementCompileStatement.bindDouble(i2, ((Number) objFieldValue2DbValue).doubleValue());
                                break;
                            case TEXT:
                                sQLiteStatementCompileStatement.bindString(i2, objFieldValue2DbValue.toString());
                                break;
                            case BLOB:
                                sQLiteStatementCompileStatement.bindBlob(i2, (byte[]) objFieldValue2DbValue);
                                break;
                            default:
                                sQLiteStatementCompileStatement.bindNull(i2);
                                break;
                        }
                    }
                    i = i2 + 1;
                }
            }
        }
        return sQLiteStatementCompileStatement;
    }

    public Object[] getBindArgs() {
        if (this.bindArgs == null) {
            return null;
        }
        Object[] objArr = new Object[this.bindArgs.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.bindArgs.size()) {
                return objArr;
            }
            objArr[i2] = ColumnUtils.convert2DbValueIfNeeded(this.bindArgs.get(i2).value);
            i = i2 + 1;
        }
    }

    public String[] getBindArgsAsStrArray() {
        if (this.bindArgs == null) {
            return null;
        }
        String[] strArr = new String[this.bindArgs.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.bindArgs.size()) {
                return strArr;
            }
            Object objConvert2DbValueIfNeeded = ColumnUtils.convert2DbValueIfNeeded(this.bindArgs.get(i2).value);
            strArr[i2] = objConvert2DbValueIfNeeded == null ? null : objConvert2DbValueIfNeeded.toString();
            i = i2 + 1;
        }
    }
}
