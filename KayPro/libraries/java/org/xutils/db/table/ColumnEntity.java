package org.xutils.db.table;

import android.database.Cursor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.xutils.common.util.LogUtil;
import org.xutils.db.annotation.Column;
import org.xutils.db.converter.ColumnConverter;
import org.xutils.db.converter.ColumnConverterFactory;
import org.xutils.db.sqlite.ColumnDbType;

public final class ColumnEntity {
    protected final ColumnConverter columnConverter;
    protected final Field columnField;
    protected final Method getMethod;
    private final boolean isAutoId;
    private final boolean isId;
    protected final String name;
    private final String property;
    protected final Method setMethod;

    ColumnEntity(Class<?> cls, Field field, Column column) {
        field.setAccessible(true);
        this.columnField = field;
        this.name = column.name();
        this.property = column.property();
        this.isId = column.isId();
        Class<?> type = field.getType();
        this.isAutoId = this.isId && column.autoGen() && ColumnUtils.isAutoIdType(type);
        this.columnConverter = ColumnConverterFactory.getColumnConverter(type);
        this.getMethod = ColumnUtils.findGetMethod(cls, field);
        if (this.getMethod != null && !this.getMethod.isAccessible()) {
            this.getMethod.setAccessible(true);
        }
        this.setMethod = ColumnUtils.findSetMethod(cls, field);
        if (this.setMethod != null && !this.setMethod.isAccessible()) {
            this.setMethod.setAccessible(true);
        }
    }

    public void setValueFromCursor(Object obj, Cursor cursor, int i) {
        Object fieldValue = this.columnConverter.getFieldValue(cursor, i);
        if (fieldValue != null) {
            if (this.setMethod != null) {
                try {
                    this.setMethod.invoke(obj, fieldValue);
                    return;
                } catch (Throwable th) {
                    LogUtil.m9046e(th.getMessage(), th);
                    return;
                }
            }
            try {
                this.columnField.set(obj, fieldValue);
            } catch (Throwable th2) {
                LogUtil.m9046e(th2.getMessage(), th2);
            }
        }
    }

    public Object getColumnValue(Object obj) {
        Object fieldValue = getFieldValue(obj);
        if (this.isAutoId && (fieldValue.equals(0L) || fieldValue.equals(0))) {
            return null;
        }
        return this.columnConverter.fieldValue2DbValue(fieldValue);
    }

    public void setAutoIdValue(Object obj, long j) {
        Object objValueOf = Long.valueOf(j);
        if (ColumnUtils.isInteger(this.columnField.getType())) {
            objValueOf = Integer.valueOf((int) j);
        }
        if (this.setMethod != null) {
            try {
                this.setMethod.invoke(obj, objValueOf);
                return;
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
                return;
            }
        }
        try {
            this.columnField.set(obj, objValueOf);
        } catch (Throwable th2) {
            LogUtil.m9046e(th2.getMessage(), th2);
        }
    }

    public Object getFieldValue(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.getMethod != null) {
            try {
                return this.getMethod.invoke(obj, new Object[0]);
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
                return null;
            }
        }
        try {
            return this.columnField.get(obj);
        } catch (Throwable th2) {
            LogUtil.m9046e(th2.getMessage(), th2);
            return null;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getProperty() {
        return this.property;
    }

    public boolean isId() {
        return this.isId;
    }

    public boolean isAutoId() {
        return this.isAutoId;
    }

    public Field getColumnField() {
        return this.columnField;
    }

    public ColumnConverter getColumnConverter() {
        return this.columnConverter;
    }

    public ColumnDbType getColumnDbType() {
        return this.columnConverter.getColumnDbType();
    }

    public String toString() {
        return this.name;
    }
}
