package org.xutils.db.table;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.xutils.common.util.LogUtil;
import org.xutils.db.annotation.Column;
import org.xutils.db.converter.ColumnConverterFactory;

final class TableUtils {
    private TableUtils() {
    }

    static LinkedHashMap<String, ColumnEntity> findColumnMap(Class<?> cls) {
        LinkedHashMap<String, ColumnEntity> linkedHashMap = new LinkedHashMap<>();
        addColumns2Map(cls, linkedHashMap);
        return linkedHashMap;
    }

    private static void addColumns2Map(Class<?> cls, HashMap<String, ColumnEntity> map) {
        Column column;
        if (!Object.class.equals(cls)) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (column = (Column) field.getAnnotation(Column.class)) != null && ColumnConverterFactory.isSupportColumnConverter(field.getType())) {
                        ColumnEntity columnEntity = new ColumnEntity(cls, field, column);
                        if (!map.containsKey(columnEntity.getName())) {
                            map.put(columnEntity.getName(), columnEntity);
                        }
                    }
                }
                addColumns2Map(cls.getSuperclass(), map);
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
            }
        }
    }
}
