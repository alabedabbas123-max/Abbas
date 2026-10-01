# حالة البناء — KayPro

آخر تحديث: 2026-10-01 · الفرع `arena/01a0f4bf-abbas`

## ✅ مُنجَز

- حزمة التطبيق `com.almlkaide.kaypro` مطبَّقة ومؤكَّدة ببناء فعلي على CI
  (9,712 موضعًا في 806 ملفات).
- كل مراحل البناء قبل تجميع Java تنجح على CI:
  `processDebugMainManifest` · `mergeDebugResources` · `processDebugResources`
  (AAPT2 + R) · `mergeDebugAssets` · `checkDebugDuplicateClasses` ·
  `mergeDebugJniLibFolders` · `mergeDebugNativeLibs` · `validateSigningDebug` ·
  `processDebugManifestForPackage`.
- تعارض AndroidX مع Support Library مُصلَح (التوحيد على Support 26.1.0).
- **إصلاح مخرجات فكّ التجميع**: 1,903 ملفًا أُعيدت كتابتها آليًا.
  6,621 / 6,621 ملف Java صالح نحويًا الآن (كان 4,701 / 6,619).
  التفاصيل في [`docs/ENGINE_RECOVERY.md`](../docs/ENGINE_RECOVERY.md).

## 🔴 محجوب — لا يمكن إنتاج APK من هذا المصدر

`compileDebugJavaWithJavac` يفشل بـ **32,248 خطأ فحص أنواع**، سببها الجذري
عيبان لا يمكن إصلاحهما من داخل المستودع:

1. **73 صنفًا مستورَدًا لا ملف له** — أسماء تعارضت في حالة الأحرف
   (`abcd/Ca.java` مفقود بينما `CA/cA/ca` موجودة)، فدُهست عند التحزيم.
2. **15 تعارضًا بين اسم صنف واسم حزمة** (`a.b.c` صنف *و* حزمة) — قانوني في DEX
   وممنوع في لغة Java؛ يُفسد تحليل الأسماء في الشجرة `a.*` كلها (8,501 خطأ).

أي أن الأرشيف المُسلَّم **فكّ تجميع ناقص**، وليس شيفرة مصدرية كاملة.

## ▶️ المطلوب للمتابعة

- **APK الأصلي** → إعادة تسمية الحزمة على مستوى smali عبر `apktool` ثم إعادة
  البناء والتوقيع. هذا المسار يُنتج APK قابلًا للتثبيت فورًا.
- أو **JAR/AAR للمحرّك** (أو مصدره الأصلي) → تُحذف `libraries/java` ويُبنى
  المشروع من `java/` مقابل المحرّك الجاهز.

## سجلّات البناء

`ci-reports/assemble-debug.log` و`ci-reports/assemble-debug-report.md` يُحدَّثان
تلقائيًا من CI بعد كل محاولة بناء.
