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

## 5. حالة البناء — العائق الحقيقي 🔴

### 5.1 مصادر المحرّك غير صالحة كلغة Java

`libraries/java` يحتوي على ناتج فكّ تجميع DEX لم يُترجَم إلى Java صحيحة.
فحص آلي لكل الملفات أعطى:

| القياس | القيمة |
|---|---|
| ملفات المكتبات المعطوبة | **1,892 ملفًا** |
| التعليمات غير الصالحة داخلها | **66,230 تعليمة** |
| ملفات المشروع (`java/`) المعطوبة | **0** ✅ |

نموذج حقيقي من `libraries/java/a/aa.java`:

```java
public boolean equals(java.lang.Object r4) {
    if (r4 != null) goto L5;
    return false;
L5:
    if (getClass() != r4.getClass()) goto L31;
    ...
}
```

`goto` كلمة محجوزة غير مستخدمة في Java، و`move-exception` تعليمة Dalvik.
`javac` يرفض كل ملف من هذه الملفات. هذا يعني أن **`compileDebugJavaWithJavac` لا يمكن
أن ينجح** مهما ضُبطت إعدادات Gradle.

تحويل `goto` آليًا إلى Java هيكلية ممكن نظريًا (آلة حالات بـ `while/switch`) لكنه يتطلّب
إعادة توليد منطق 1,892 ملفًا مع معالجة نطاقات `try/catch` وتصريحات المتغيّرات المحلية —
وهو عمليًا كتابة خلفية decompiler كاملة، ولا يمكن التحقق من صحتها دون مترجم.

### 5.2 بيئة التنفيذ هنا لا تسمح بالبناء

فحص بيئة التشغيل:

| المتطلّب | الحالة |
|---|---|
| JDK | ❌ غير مثبّت |
| Android SDK / build-tools | ❌ غير موجود |
| `dl.google.com` · `maven.google.com` | ❌ محجوب (كود 000) |
| `repo1.maven.org` | ❌ محجوب |
| `services.gradle.org` (توزيعة Gradle) | ❌ محجوب |
| `deb.debian.org` / `archive.ubuntu.com` | ❌ محجوب (لا `apt install`) |
| `github.com` · `api.github.com` · `pypi.org` · `registry.npmjs.org` | ✅ متاح |

لذلك لا يمكن تنزيل JDK ولا Android SDK ولا أي اعتمادية Gradle داخل هذه البيئة.

### 5.3 المسار المتاح للبناء

أُضيف خط بناء على GitHub Actions في `.github/workflows/android-build.yml`.
منصّة GitHub توفّر JDK 17 وAndroid SDK وشبكة كاملة، والخط يتضمّن:

1. **`validate`** — يشغّل `processDebugResources` + `mergeDebugJavaResource`.
   هذه المرحلة تتحقق من **صحة Manifest والموارد وحزمة التطبيق الجديدة** بشكل مستقل
   عن كود المحرّك، وهي **متوقَّع لها النجاح**.
2. **`assemble`** — يشغّل `assembleDebug` ويرفع APK كـ artifact.
   **متوقَّع لها الفشل** عند `compileDebugJavaWithJavac` للسبب في 5.1، والسجل يُرفع
   كـ artifact للمراجعة.

## 6. ما يلزم للحصول على APK قابل للاختبار

يجب توفير **أحد** الآتي (لا مفرّ):

| # | الخيار | الجهد |
|---|---|---|
| **أ** | **ملف APK الأصلي** لتطبيق Almlk/AIDE Pro. عندها نعيد تسمية الحزمة على مستوى smali عبر apktool ونعيد التوقيع — وهي الطريقة القياسية لإعادة علامة تطبيق مغلق المصدر، وتنتج APK يعمل فورًا. | منخفض ✅ |
| **ب** | **JAR/AAR سليم لمحرّك AIDE**، ثم حذف `libraries/java` المعطوبة وربط المكتبة من Gradle. | متوسط |
| **ج** | **المصدر الأصلي القابل للترجمة** للمحرّك بدل ناتج فكّ التجميع. | متوسط |
| **د** | إعادة كتابة منطق 1,892 ملفًا يدويًا. | غير واقعي ❌ |

**التوصية: الخيار (أ).** ارفع ملف الـ APK الأصلي إلى المستودع أو أرفقه، وسأنفّذ إعادة
التسمية الكاملة على مستوى الـ DEX وأعيد التوقيع وأسلّم APK جاهزًا للتثبيت والاختبار.

## 7. حالة العمل

| المهمة | الحالة |
|---|---|
| فحص المشروع كاملًا | ✅ |
| نسخة احتياطية + بصمة SHA-256 | ✅ |
| العمل على نسخة منفصلة (`KayPro/`) | ✅ |
| تغيير حزمة التطبيق إلى `com.almlkaide.kaypro` | ✅ |
| ضبط كل الملفات على الحزمة الجديدة + تحقق آلي | ✅ |
| خط بناء APK | ✅ مُضاف على CI |
| إنتاج APK قابل للاختبار | 🔴 محجوب — يحتاج المدخل في القسم 6 |
