# حالة بناء التطبيق

> حزمة التطبيق الحالية: **`com.almlkaide.kaypro`** — راجع `PACKAGE_RENAME.md`.
> التقرير الكامل: `../docs/AUDIT_REPORT.md`.

## ما تم إنجازه

- مشروع Gradle باستخدام Android Gradle Plugin `7.4.2` وGradle Wrapper `7.6.4`.
- `compileSdk 33` · `minSdk 16` · `targetSdk 28` · `multiDexEnabled true`.
- ربط جذري المصدر `java` و`libraries/java` وملفات Manifest والموارد وassets وJNI.
- إزالة 519 ملف Java مضمّنًا تابعًا لمكتبات Android/Google الرسمية واستبدالها باعتماديات Gradle.
- إزالة 83 ملف مورد و355 تعريف مورد مكرّرًا، وإصلاح أسماء الموارد غير الصالحة.
- تحويل Install Referrer إلى واجهة Google الرسمية.
- **ضبط كامل لهوية الحزمة على `com.almlkaide.kaypro`** (9,712 موضعًا في 806 ملفات)
  مع تحقق آلي: 6,619 ملف Java مطابق لمساره، وكل XML صالح، وصفر بقايا للحزم القديمة.
- نجاح مراحل Manifest ودمج الموارد وAAPT وربط الموارد بالكامل.

المهام التالية تنجح على CI:

```bash
./gradlew processDebugResources mergeDebugJavaResource \
              mergeDebugAssets mergeDebugNativeLibs checkDebugDuplicateClasses
```

## توحيد المكتبات على Support Library ✅

فشل `checkDebugDuplicateClasses` بسبب وجود `androidx.core:core:1.9.0` مع
`com.android.support:support-compat:26.1.0` (كلاهما يحوي `android.support.v4.os.ResultReceiver`
و`INotificationSideChannel` و`IResultReceiver`).

وُحّد المشروع على Support Library لأن الكود والموارد وManifest تستخدمها في 180+ موضعًا:

- تحويل 42 مرجع `androidx.*` إلى مقابلها في Support (34 ملفًا).
- حذف كل اعتماديات AndroidX، وإضافة `android.arch.lifecycle:runtime/common:1.1.1`.
- `android.useAndroidX=false` · `android.enableJetifier=false`.

## نتيجة `assembleDebug` 🔴

يصل البناء إلى `compileDebugJavaWithJavac` ثم يتوقف — والسبب في مصادر المحرّك المفكوكة،
وليس في Gradle أو Manifest أو XML أو الاعتماديات الرسمية.

| نوع العطب | الملفات | المواضع |
|---|---|---|
| `goto Lxx;` · `Lxx:` | 1,885 | 58,672 |
| `move-exception` | 1,102 | 7,558 |
| تعليقات انهيار JADX | 32 | 624 |
| النوع المجهول `??` | 17 | 44 |
| **إجمالي الملفات المعطوبة في `libraries/java`** | **1,913** | — |
| ملفات معطوبة في `java/` (كود المشروع) | **0** ✅ | — |

مثال فعلي من `libraries/java/a/aa.java`:

```java
if (r4 != null) goto L5;
return false;
L5:
if (getClass() != r4.getClass()) goto L31;
```

## المطلوب للحصول على APK

واحد من الآتي:

1. **ملف APK الأصلي** → إعادة تسمية الحزمة على مستوى smali عبر apktool + إعادة توقيع.
   (الأسرع والأضمن للحصول على APK يعمل.)
2. **JAR/AAR سليم لمحرّك AIDE** → حذف المصادر المفكوكة وربط المكتبة من Gradle.
3. **المصدر الأصلي القابل للترجمة** للمحرّك.

لا يمكن تحويل تعليمات `goto` الناتجة عن فكّ DEX إلى Java سليمة آليًا بصورة موثوقة دون
إعادة بناء منطق نحو ألفي ملف، لذلك لم تُستبدل بدوال وهمية قد تكسر التطبيق.

## ملاحظة توافق

المشروع يجمع بين استدعاءات Android Support القديمة وإضافات AndroidX حديثة، والاعتماديات
مضبوطة لتوفير المجموعتين مؤقتًا. بعد استعادة مصدر المحرّك يُفضَّل ترحيل كامل إلى AndroidX.
