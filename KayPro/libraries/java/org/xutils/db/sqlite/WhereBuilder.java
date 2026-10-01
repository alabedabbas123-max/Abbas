package org.xutils.db.sqlite;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xutils.db.table.ColumnUtils;

public class WhereBuilder {
    private final List<String> whereItems = new ArrayList();

    private WhereBuilder() {
    }

    public static WhereBuilder m9067b() {
        return new WhereBuilder();
    }

    public static WhereBuilder m9068b(String str, String str2, Object obj) {
        WhereBuilder whereBuilder = new WhereBuilder();
        whereBuilder.appendCondition(null, str, str2, obj);
        return whereBuilder;
    }

    public WhereBuilder m9069and(String str, String str2, Object obj) {
        appendCondition(this.whereItems.size() == 0 ? null : "AND", str, str2, obj);
        return this;
    }

    public WhereBuilder m9070and(WhereBuilder whereBuilder) {
        return expr((this.whereItems.size() == 0 ? " " : "AND ") + "(" + whereBuilder.toString() + ")");
    }

    public WhereBuilder m9071or(String str, String str2, Object obj) {
        appendCondition(this.whereItems.size() == 0 ? null : "OR", str, str2, obj);
        return this;
    }

    public WhereBuilder m9072or(WhereBuilder whereBuilder) {
        return expr((this.whereItems.size() == 0 ? " " : "OR ") + "(" + whereBuilder.toString() + ")");
    }

    public WhereBuilder expr(String str) {
        this.whereItems.add(" " + str);
        return this;
    }

    public int getWhereItemSize() {
        return this.whereItems.size();
    }

    public String toString() {
        if (this.whereItems.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.whereItems.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    private void appendCondition(String str, String str2, String str3, Object obj) {
        Iterable iterable;
        Iterable iterable2;
        int i = 0;
        StringBuilder sb = new StringBuilder();
        if (this.whereItems.size() > 0) {
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str).append(" ");
        }
        sb.append("\"").append(str2).append("\"");
        if ("!=".equals(str3)) {
            str3 = "<>";
        } else if ("==".equals(str3)) {
            str3 = "=";
        }
        if (obj == null) {
            if ("=".equals(str3)) {
                sb.append(" IS NULL");
            } else if ("<>".equals(str3)) {
                sb.append(" IS NOT NULL");
            } else {
                sb.append(" ").append(str3).append(" NULL");
            }
        } else {
            sb.append(" ").append(str3).append(" ");
            if ("IN".equalsIgnoreCase(str3)) {
                if (obj instanceof Iterable) {
                    iterable2 = (Iterable) obj;
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    ArrayList arrayList = new ArrayList(length);
                    while (i < length) {
                        arrayList.add(Array.get(obj, i));
                        i++;
                    }
                    iterable2 = arrayList;
                } else {
                    iterable2 = null;
                }
                if (iterable2 != null) {
                    StringBuilder sb2 = new StringBuilder("(");
                    Iterator it = iterable2.iterator();
                    while (it.hasNext()) {
                        Object objConvert2DbValueIfNeeded = ColumnUtils.convert2DbValueIfNeeded(it.next());
                        if (ColumnUtils.isTextColumnDbType(objConvert2DbValueIfNeeded)) {
                            sb2.append("'").append(ColumnUtils.convert2SafeExpr(objConvert2DbValueIfNeeded)).append("'");
                        } else {
                            sb2.append(objConvert2DbValueIfNeeded);
                        }
                        sb2.append(",");
                    }
                    if (sb2.length() > 1) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    sb2.append(")");
                    sb.append(sb2.toString());
                } else {
                    throw new IllegalArgumentException("value must be an Array or an Iterable.");
                }
            } else if ("BETWEEN".equalsIgnoreCase(str3)) {
                if (obj instanceof Iterable) {
                    iterable = (Iterable) obj;
                } else if (obj.getClass().isArray()) {
                    int length2 = Array.getLength(obj);
                    ArrayList arrayList2 = new ArrayList(length2);
                    while (i < length2) {
                        arrayList2.add(Array.get(obj, i));
                        i++;
                    }
                    iterable = arrayList2;
                } else {
                    iterable = null;
                }
                if (iterable != null) {
                    Iterator it2 = iterable.iterator();
                    if (!it2.hasNext()) {
                        throw new IllegalArgumentException("value must contains tow items.");
                    }
                    Object next = it2.next();
                    if (!it2.hasNext()) {
                        throw new IllegalArgumentException("value must contains tow items.");
                    }
                    Object next2 = it2.next();
                    Object objConvert2DbValueIfNeeded2 = ColumnUtils.convert2DbValueIfNeeded(next);
                    Object objConvert2DbValueIfNeeded3 = ColumnUtils.convert2DbValueIfNeeded(next2);
                    if (ColumnUtils.isTextColumnDbType(objConvert2DbValueIfNeeded2)) {
                        String strConvert2SafeExpr = ColumnUtils.convert2SafeExpr(objConvert2DbValueIfNeeded2);
                        String strConvert2SafeExpr2 = ColumnUtils.convert2SafeExpr(objConvert2DbValueIfNeeded3);
                        sb.append("'").append(strConvert2SafeExpr).append("'");
                        sb.append(" AND ");
                        sb.append("'").append(strConvert2SafeExpr2).append("'");
                    } else {
                        sb.append(objConvert2DbValueIfNeeded2);
                        sb.append(" AND ");
                        sb.append(objConvert2DbValueIfNeeded3);
                    }
                } else {
                    throw new IllegalArgumentException("value must be an Array or an Iterable.");
                }
            } else {
                Object objConvert2DbValueIfNeeded4 = ColumnUtils.convert2DbValueIfNeeded(obj);
                if (ColumnUtils.isTextColumnDbType(objConvert2DbValueIfNeeded4)) {
                    sb.append("'").append(ColumnUtils.convert2SafeExpr(objConvert2DbValueIfNeeded4)).append("'");
                } else {
                    sb.append(objConvert2DbValueIfNeeded4);
                }
            }
        }
        this.whereItems.add(sb.toString());
    }
}
