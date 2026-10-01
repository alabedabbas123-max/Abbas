package sun.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class Reflection {
    private static volatile Map<Class, String[]> fieldFilterMap;
    private static volatile Map<Class, String[]> methodFilterMap;

    public static native Class getCallerClass(int i);

    private static native int getClassAccessFlags(Class cls);

    static {
        Map<Class, String[]> map = new HashMap<>();
        map.put(Reflection.class, new String[]{"fieldFilterMap", "methodFilterMap"});
        map.put(System.class, new String[]{"com/security"});
        fieldFilterMap = map;
        methodFilterMap = new HashMap();
    }

    public static boolean quickCheckMemberAccess(Class memberClass, int modifiers) {
        return Modifier.isPublic(getClassAccessFlags(memberClass) & modifiers);
    }

    public static void ensureMemberAccess(Class currentClass, Class memberClass, Object target, int modifiers) throws IllegalAccessException {
        if (currentClass == null || memberClass == null) {
            throw new InternalError();
        }
        if (!verifyMemberAccess(currentClass, memberClass, target, modifiers)) {
            throw new IllegalAccessException("Class " + currentClass.getName() + " can not access a member of class " + memberClass.getName() + " with modifiers \"" + Modifier.toString(modifiers) + "\"");
        }
    }

    public static boolean verifyMemberAccess(Class currentClass, Class memberClass, Object target, int modifiers) {
        boolean gotIsSameClassPackage = false;
        boolean isSameClassPackage = false;
        if (currentClass == memberClass) {
            return true;
        }
        if (!Modifier.isPublic(getClassAccessFlags(memberClass))) {
            isSameClassPackage = isSameClassPackage(currentClass, memberClass);
            gotIsSameClassPackage = true;
            if (!isSameClassPackage) {
                return false;
            }
        }
        if (Modifier.isPublic(modifiers)) {
            return true;
        }
        boolean successSoFar = false;
        if (Modifier.isProtected(modifiers) && isSubclassOf(currentClass, memberClass)) {
            successSoFar = true;
        }
        if (!successSoFar && !Modifier.isPrivate(modifiers)) {
            if (!gotIsSameClassPackage) {
                isSameClassPackage = isSameClassPackage(currentClass, memberClass);
                gotIsSameClassPackage = true;
            }
            if (isSameClassPackage) {
                successSoFar = true;
            }
        }
        if (!successSoFar) {
            return false;
        }
        if (Modifier.isProtected(modifiers)) {
            Class targetClass = target == null ? memberClass : target.getClass();
            if (targetClass != currentClass) {
                if (!gotIsSameClassPackage) {
                    isSameClassPackage = isSameClassPackage(currentClass, memberClass);
                }
                if (!isSameClassPackage && !isSubclassOf(targetClass, currentClass)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSameClassPackage(Class c1, Class c2) {
        return isSameClassPackage(c1.getClassLoader(), c1.getName(), c2.getClassLoader(), c2.getName());
    }

    private static boolean isSameClassPackage(ClassLoader loader1, String name1, ClassLoader loader2, String name2) {
        int idx1;
        int idx2;
        if (loader1 != loader2) {
            return false;
        }
        int lastDot1 = name1.lastIndexOf(46);
        int lastDot2 = name2.lastIndexOf(46);
        if (lastDot1 == -1 || lastDot2 == -1) {
            return lastDot1 == lastDot2;
        }
        int idx3 = 0;
        int idx4 = 0;
        if (name1.charAt(0) != '[') {
            idx1 = 0;
        } else {
            do {
                idx3++;
            } while (name1.charAt(idx3) == '[');
            if (name1.charAt(idx3) != 'L') {
                throw new InternalError("Illegal class name " + name1);
            }
            idx1 = idx3;
        }
        int idx5 = name2.charAt(0);
        if (idx5 != 91) {
            idx2 = 0;
        } else {
            do {
                idx4++;
            } while (name2.charAt(idx4) == '[');
            if (name2.charAt(idx4) != 'L') {
                throw new InternalError("Illegal class name " + name2);
            }
            idx2 = idx4;
        }
        int length1 = lastDot1 - idx1;
        int length2 = lastDot2 - idx2;
        if (length1 != length2) {
            return false;
        }
        return name1.regionMatches(false, idx1, name2, idx2, length1);
    }

    static boolean isSubclassOf(Class queryClass, Class ofClass) {
        while (queryClass != null) {
            if (queryClass == ofClass) {
                return true;
            }
            queryClass = queryClass.getSuperclass();
        }
        return false;
    }

    public static synchronized void registerFieldsToFilter(Class containingClass, String... fieldNames) {
        fieldFilterMap = registerFilter(fieldFilterMap, containingClass, fieldNames);
    }

    public static synchronized void registerMethodsToFilter(Class containingClass, String... methodNames) {
        methodFilterMap = registerFilter(methodFilterMap, containingClass, methodNames);
    }

    private static Map<Class, String[]> registerFilter(Map<Class, String[]> map, Class containingClass, String... names) {
        if (map.get(containingClass) != null) {
            throw new IllegalArgumentException("Filter already registered: " + containingClass);
        }
        Map<Class, String[]> map2 = new HashMap<>(map);
        map2.put(containingClass, names);
        return map2;
    }

    public static Field[] filterFields(Class containingClass, Field[] fields) {
        if (fieldFilterMap == null) {
            return fields;
        }
        return (Field[]) filter(fields, fieldFilterMap.get(containingClass));
    }

    public static Method[] filterMethods(Class containingClass, Method[] methods) {
        if (methodFilterMap == null) {
            return methods;
        }
        return (Method[]) filter(methods, methodFilterMap.get(containingClass));
    }

    private static Member[] filter(Member[] members, String[] filteredNames) {
        if (filteredNames == null || members.length == 0) {
            return members;
        }
        int numNewMembers = 0;
        for (Member member : members) {
            boolean shouldSkip = false;
            for (String filteredName : filteredNames) {
                if (member.getName() == filteredName) {
                    shouldSkip = true;
                    break;
                }
            }
            if (!shouldSkip) {
                numNewMembers++;
            }
        }
        Member[] newMembers = (Member[]) Array.newInstance(members[0].getClass(), numNewMembers);
        int destIdx = 0;
        for (Member member2 : members) {
            boolean shouldSkip2 = false;
            for (String filteredName2 : filteredNames) {
                if (member2.getName() == filteredName2) {
                    shouldSkip2 = true;
                    break;
                }
            }
            if (!shouldSkip2) {
                newMembers[destIdx] = member2;
                destIdx++;
            }
        }
        return newMembers;
    }
}
