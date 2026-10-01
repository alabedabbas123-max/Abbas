# تقرير الفحص الكامل لمشروع KayPro

تاريخ الفحص: 2026-09-30 — الفرع: `arena/01a0f4bf-abbas`

---

## 1. ماذا كان في المستودع

المستودع كان يحتوي على ملف واحد فقط:

```
Almlk-gradle-source.zip   (37.4 MB)
```

وبداخله مشروع Gradle باسم `Almlk-isolated-project` مكوّن من **7,244 ملفًا** بحجم **97 MB**
بعد فك الضغط.

## 2. ما هو التطبيق

بيئة تطوير أندرويد تعمل على الجهاز نفسه (On-device IDE) — مشتقة من **AIDE** عبر فك
التجميع (decompilation)، مع إضافات عربية مخصّصة:

- `com.almlkaide.kaypro.manifesteditor` — محرّر Manifest + ProGuard + Smali + ColorPicker.
- `com.almlkaide.kaypro.assetsmanager` — مدير ملفات assets.
- `com.almlkaide.kaypro.translate` — مترجم ويب مدمج.
- `com.almlkaide.kaypro.aide.*` — طبقة الواجهة والإعدادات والثيمات.

التطبيق يحزم داخل `assets/` أدوات بناء أندرويد كاملة لتعمل على الهاتف:
`aapt` و`aidl` لأربع معماريات، و`busybox`، و`android.jar.jet` (8.1 MB)،
و`api-versions.xml` (5.9 MB)، وقوالب مشاريع.

## 3. البنية

```
KayPro/
├── AndroidManifest.xml          18.6 KB — 40+ مكوّنًا، 12 صلاحية، 5 مزوّدي محتوى
├── build.gradle                 AGP 7.4.2 · compileSdk 33 · minSdk 16 · targetSdk 28
├── settings.gradle              google() + mavenCentral()
├── gradle/wrapper/              Gradle 7.6.4
├── java/                        2.1 MB — 187 ملف Java (كود المشروع)
├── libraries/java/              44 MB — 6,432 ملف Java (المحرّك والمكتبات)
├── res/                         4.0 MB — 240 ملف XML + صور · 38 مجلد موارد
├── assets/                      47 MB — أدوات البناء والقوالب والبيانات
└── jniLibs/                     632 KB — arm64-v8a · armeabi · x86
```

### الاعتماديات الخارجية

Support Library 26.1.0 (v4/appcompat/recyclerview) + AndroidX
(annotation, collection, core, fragment, lifecycle, versionedparcelable)
+ Play Install Referrer 2.2 + Play Services Ads 17.2.1 + Firebase Core/IID.

> ملاحظة توافق: المشروع يخلط بين Support Library القديمة وAndroidX في آنٍ واحد.
> يُنصح لاحقًا بترحيل كامل إلى AndroidX بعد حلّ مشكلة المحرّك.

## 4. تغيير حزمة التطبيق ✅ مُنجَز

تم ضبط التطبيق بالكامل على `com.almlkaide.kaypro` — **9,712 موضع استبدال في 806 ملفات**.
التفاصيل الكاملة والتحقق الآلي في [`KayPro/PACKAGE_RENAME.md`](../KayPro/PACKAGE_RENAME.md).

## 5. حالة البناء بعد التنفيذ الفعلي على CI

شُغّل البناء فعليًا على GitHub Actions (JDK 17 + Android SDK + شبكة كاملة).
النتيجة الحالية:

### ✅ ما ينجح الآن (كل شيء قبل تجميع Java)

```
> Task :processDebugMainManifest      ✅   package = com.almlkaide.kaypro
> Task :mergeDebugResources           ✅
> Task :processDebugResources         ✅   AAPT2 + توليد R
> Task :mergeDebugAssets              ✅   47 MB من assets
> Task :checkDebugDuplicateClasses    ✅   (بعد الإصلاح أدناه)
> Task :mergeDebugJniLibFolders       ✅   arm64-v8a · armeabi · x86
> Task :mergeDebugNativeLibs          ✅
> Task :validateSigningDebug          ✅
> Task :processDebugManifestForPackage ✅
```

أي أن **حزمة التطبيق الجديدة والموارد وManifest وassets وJNI سليمة تمامًا ومؤكَّدة بالبناء**.

### 🔧 عائق تم إصلاحه: تعارض AndroidX مع Support Library

فشل `checkDebugDuplicateClasses`:

```
Duplicate class android.support.v4.os.ResultReceiver found in modules
core-1.9.0-runtime (androidx.core:core:1.9.0) and
support-compat-26.1.0-runtime (com.android.support:support-compat:26.1.0)
```

المشروع كان يعلن عائلتَي مكتبات متعارضتين في آنٍ واحد. وبما أن الكود والموارد وManifest
تستخدم `android.support.*` في أكثر من 180 موضعًا (وصفر موضع androidx في `res/`
و`AndroidManifest.xml`)، جرى توحيد المشروع على Support Library:

- تحويل 42 مرجع `androidx.*` إلى مقابلها في Support (في 34 ملفًا).
- حذف اعتماديات `androidx.core` و`androidx.fragment` و`androidx.collection`
  و`androidx.lifecycle` و`androidx.annotation` و`androidx.versionedparcelable`.
- إضافة `android.arch.lifecycle:runtime:1.1.1` + `common:1.1.1` بدل `androidx.lifecycle`.
- `android.useAndroidX=false` و`android.enableJetifier=false`.

✅ المرحلة تمرّ الآن بنجاح.

### 🔴 العائق المتبقي: `compileDebugJavaWithJavac`

```
> Task :compileDebugJavaWithJavac FAILED
100 errors   (javac يتوقف عند 100 خطأ افتراضيًا — العدد الحقيقي أكبر بكثير)
```

السبب ليس Gradle ولا الحزمة ولا الموارد، بل أن `libraries/java` ناتج فكّ تجميع DEX
لم يُترجَم إلى Java صالحة. الفحص الآلي لكل الملفات:

| نوع العطب | الملفات | المواضع |
|---|---|---|
| `goto Lxx;` و`Lxx:` (تعليمات Dalvik) | 1,885 | 58,672 |
| `move-exception` | 1,102 | 7,558 |
| تعليقات انهيار JADX داخل الكود | 32 | 624 |
| النوع المجهول `??` | 17 | 44 |
| **إجمالي الملفات المعطوبة** | **1,913** | — |
| ملفات المشروع `java/` المعطوبة | **0** ✅ | — |

نموذج من `libraries/java/a/aa.java`:

```java
public boolean equals(java.lang.Object r4) {
    if (r4 != null) goto L5;
    return false;
L5:
    if (getClass() != r4.getClass()) goto L31;
}
```

`goto` كلمة محجوزة غير مستخدمة في Java، و`move-exception` تعليمة Dalvik، و`??` علامة
«نوع مجهول» من JADX. تحويل هذا آليًا إلى Java هيكلية يعني إعادة بناء منطق 1,913 ملفًا
مع نطاقات `try/catch` وتصريحات المتغيرات — أي كتابة خلفية decompiler كاملة.

## 6. ما يلزم للحصول على APK قابل للاختبار

يجب توفير **أحد** الآتي:

| # | الخيار | الجهد | النتيجة |
|---|---|---|---|
| **أ** | **ملف APK الأصلي** لتطبيق Almlk / AIDE Pro | منخفض ✅ | إعادة تسمية الحزمة على مستوى smali عبر apktool + إعادة توقيع ← APK يعمل فورًا بحزمة `com.almlkaide.kaypro` |
| **ب** | **JAR/AAR سليم لمحرّك AIDE** | متوسط | حذف `libraries/java` المعطوبة وربط المكتبة من Gradle |
| **ج** | **المصدر الأصلي القابل للترجمة** للمحرّك | متوسط | بناء كامل من المصدر |
| **د** | إعادة كتابة منطق 1,913 ملفًا يدويًا | غير واقعي ❌ | — |

**التوصية: الخيار (أ).** ارفع ملف الـ APK الأصلي إلى المستودع، وسأنفّذ إعادة التسمية
الكاملة على مستوى الـ DEX وأعيد التوقيع وأسلّم APK جاهزًا للتثبيت والاختبار.

### بيئة التنفيذ المحلية (لماذا يُبنى على CI)

| المتطلّب | الحالة محليًا |
|---|---|
| JDK · Android SDK | ❌ غير مثبّتين |
| `dl.google.com` · `maven.google.com` · `repo1.maven.org` · `services.gradle.org` | ❌ محجوبة |
| `deb.debian.org` / `archive.ubuntu.com` | ❌ محجوبة (لا `apt install`) |
| `github.com` · `pypi.org` · `registry.npmjs.org` | ✅ متاحة |

لذلك البناء يجري على GitHub Actions عبر `.github/workflows/android-build.yml`، وسجلّ
كل بناء يُحفظ تلقائيًا في `ci-reports/`.

## 7. حالة العمل

| المهمة | الحالة |
|---|---|
| فحص المشروع كاملًا | ✅ |
| نسخة احتياطية + بصمة SHA-256 | ✅ |
| العمل على نسخة منفصلة (`KayPro/`) | ✅ |
| تغيير حزمة التطبيق إلى `com.almlkaide.kaypro` | ✅ |
| ضبط كل الملفات على الحزمة الجديدة + تحقق آلي | ✅ |
| خط بناء APK على CI + حفظ السجل في المستودع | ✅ |
| تجاوز Manifest / الموارد / AAPT / assets / JNI / التوقيع | ✅ مؤكَّد ببناء فعلي |
| إصلاح تعارض AndroidX ↔ Support (`checkDuplicateClasses`) | ✅ |
| `compileDebugJavaWithJavac` | 🔴 1,913 ملف decompiler غير صالح |
| إنتاج APK قابل للاختبار | 🔴 محجوب — يحتاج المدخل في القسم 6 |
