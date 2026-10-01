# استعادة محرّك KayPro من مخرجات فكّ التجميع

تاريخ: 2026-10-01 — الفرع: `arena/01a0f4bf-abbas`

هذا المستند يوثّق محاولة إعادة بناء الشيفرة المصدرية للمحرّك الموجودة في
`KayPro/libraries/java`، ونتيجتها النهائية.

---

## 1. نقطة البداية

`KayPro/libraries/java` ليست شيفرة مكتوبة بيد مبرمج، بل **مخرجات مُفكِّك تجميع
(JADX) في وضع fall-back**: حين يعجز المفكِّك عن إعادة بناء تدفّق التحكّم لدالّة
ما، فإنه يطبع تعليمات Dalvik كما هي داخل ملف `.java`.

من أصل **6,619** ملف Java، كان **1,920 ملفًا لا يمكن تحليله نحويًا أصلًا**:

| نوع العطب | المواضع |
|---|---|
| `goto Lnn;` و`Lnn:` (قفزات Dalvik) | 58,672 |
| `Lnn:` كمسمّيات كتل | 52,816 |
| `x = move-exception;` (مدخل معالج استثناء) | 7,558 |
| `monitor-enter(x)` / `monitor-exit(x)` | 342 |
| `enum X extends java.lang.Enum<X>` (غير قانوني) | 86 ملفًا |
| `?? r0 = ...` (نوع مجهول) | 17 ملفًا |
| `101(0x65, float:1.42E-43)` (تعليق رقمي من jadx) | 25 ملفًا |
| `static { }` داخل `interface` | 45 ملفًا |

`goto` كلمة محجوزة غير مستخدَمة في Java، و`move-exception` تعليمة Dalvik — أي أن
`javac` كان يرفض كل ملف من هذه الملفات قبل أن يصل إلى فحص الأنواع.

---

## 2. ما أُنجز: ثلاث أدوات إصلاح قابلة لإعادة التشغيل

جميعها في `tools/`، وتعمل على الشجرة مباشرةً وبالترتيب التالي:

### `tools/decompiler_prepass.py` — إصلاحات نصّية

- إزالة التعليقات الرقمية من jadx مع إعادة لاحقة `L` للأعداد الطويلة.
- `??` ← `java.lang.Object`.
- تحويل التعدادات المُسطَّحة: `abstract enum A extends java.lang.Enum<A>`
  ← `abstract class A extends EnumBase`، وأجسام الثوابت
  `enum B extends A` ← `class B extends A`، مع استبدال
  `java.lang.Enum.valueOf(A.class, s)` بـ `EnumBase.valueOf(A.values(), s)`.
- طيّ `static { }` داخل الواجهات إلى مُهيّئات حقول.
- دمج جُمل `extends` المكرّرة.

### `tools/decompiler_repair.py` — إعادة بناء تدفّق التحكّم

كل دالّة تحوي قفزات تُعاد كتابتها إلى **حلقة توزيع على الكتل الأساسية** — وهي
الصيغة البنيوية المكافئة تمامًا لمخطّط التدفّق، أي ما ينفّذه الجهاز فعليًا:

```java
int $pc0 = 4;
$sw0: while (true) {
    switch ($pc0) {
        case 4: { if (x == 0) { $pc0 = 6; continue $sw0; } ... }
        case 6: { ... return; }
        default: throw new IllegalStateException();
    }
}
```

تفاصيل مهمّة عولجت:

- **`// Catch: T -> Lnn`** تُعاد إلى `try { } catch (Throwable $t) { ... }` حقيقية،
  مع توزيع بـ `instanceof` بدل ترتيب جُمل `catch` (يتفادى أخطاء
  «النوع مُلتقَط مسبقًا» وتكرار الأنواع).
- **المتغيّرات المحلّية** تُرفَع إلى نطاق الدالّة لأنها تعبر حدود الكتل.
- **أهداف القفز المفقودة** (قفزة إلى مسمّى لم يطبعه jadx) تُجسَّد ككتلة نهاية فارغة.
- **ترتيب الكتل**: jadx يرفع معالجات الاستثناء قبل الشيفرة التي تحميها، لذا لا
  يجوز أن يكون معالِج هو خليفة السقوط (fall-through) للكتلة السابقة. كتلة
  البداية تُشتقّ من مجموعة الأضلاع، وإلا فأصغر مسمّى غير معالِج (المسمّيات هي
  عناوين bytecode).

### `tools/decompiler_monitors.py` — إعادة بناء `synchronized`

Dalvik يقفل كائنًا بتعليمتين منفصلتين، وJava لا تملك صيغة جُملة لأيٍّ منهما —
القفل الوحيد الممكن هو كتلة `synchronized` ذات نطاق لفظي. بعد تحويل الدالّة إلى
حلقة توزيع يصبح النصفان في `case` مختلفين، فتُرقّى الحماية إلى الدالّة كاملة:
يُحسَب تعبير القفل عند الدخول ويُنفَّذ الجسم داخل `synchronized` واحدة.

نتيجة الحلّ على **298 دالّة**: 85 `this` · 28 `T.class` · 180 من تعريف السجلّ
الوحيد · 5 احتياطية. العتاد المستخدم هو مراقِب الكائن الحقيقي، لذا يبقى
`wait`/`notify` والتعامل مع `synchronized` في بقيّة التطبيق سليمًا؛ الفارق
الوحيد أن القفل قد يُمسَك لفترة أطول قليلًا.

### صنفان مساعدان

- `com.almlkaide.kaypro.internal.DecompileSupport.rethrow` — إعادة رمي أمينة دون
  توسيع جُمل `throws`.
- `com.almlkaide.kaypro.internal.EnumBase` — بديل `java.lang.Enum`
  (`name()`, `ordinal()`, `toString()`, المساواة بالهويّة، الترتيب بالـ ordinal).

---

## 3. النتيجة

| المقياس | قبل | بعد |
|---|---|---|
| ملفات Java صالحة نحويًا | 4,701 / 6,619 | **6,621 / 6,621** ✅ |
| ملفات معطوبة | 1,920 | **0** |
| `goto` / `move-exception` / `monitor-*` متبقّية | 66,572 | **0** |

`javac` يتجاوز الآن مرحلة التحليل النحوي بالكامل على الشجرة كلّها ويبدأ فحص
الأنواع — وهنا ظهرت الطبقة التالية.

---

## 4. العائق الحقيقي: الشيفرة المصدرية ناقصة وغير قابلة للتمثيل في Java

`javac` يُبلغ الآن عن **32,248 خطأ فحص أنواع**. الفحص أظهر أن جزءًا كبيرًا منها
ينبع من عيبين **بنيويين لا يمكن إصلاحهما من هذا المصدر**:

### أ-0. مكوّنات معلنة في الـ Manifest بلا شيفرة مصدرية

الدليل الأقطع: من بين 56 مكوّنًا يعلنها `AndroidManifest.xml`، هناك **عشرة
مكوّنات من التطبيق نفسه لا ملف مصدر لها إطلاقًا** (الباقي من مكتبات خارجية
تحلّها Gradle):

```
com.aide.ui.PromoNotificationAlarmReceiver
com.aide.ui.TrainerRuntimeReceiver
com.aide.ui.build.java.RunJavaActivity
com.aide.ui.build.java.RunTrainerJavaActivity
com.aide.ui.build.javascript.RunJavaScriptActivity
com.aide.ui.build.nativeexecutable.RunNativeExecutableActivity
com.aide.ui.build.packagingservice.ExternalPackagingService
com.aide.ui.preferences.PreferencesActivity
com.aide.ui.scm.ExternalGitService
com.aide.ui.trainer.TrainerNotificationAlarmReceiver
```

وكذلك `com.aide.ui.MainActivity` و`com.aide.ui.AIDEApplication` و
`com.aide.ui.AIDEEditor` و`com.aide.ui.browsers.BrowserPager` و
`com.aide.ui.views.editor.OEditor` — كلّها مُشار إليها من ملفات موجودة، ولا
وجود لملفاتها.

### أ. ملفات فُقدت بسبب تعارض حالة الأحرف

المُشوِّش (obfuscator) أنتج أسماء أصناف لا تختلف إلا في حالة الأحرف. حين حُزِمت
الشجرة أو فُكّت على نظام ملفات لا يفرّق بين الحالتين، دُهس أحد كل زوج متعارض:

```
abcd/CA.java  abcd/cA.java  abcd/ca.java   موجودة
abcd/Ca.java                               مفقودة  ← مستورَدة من ملفات أخرى
abcd/oa.java  abcd/qa.java                 مفقودة تمامًا (لا نسخة بأي حالة)
```

**73 صنفًا مستورَدًا لا وجود لملفه في الشجرة إطلاقًا** (325 مرجعًا). شيفرة هذه
الأصناف غير موجودة في المستودع، ولا يمكن استنتاجها.

### ب. تعارض اسم صنف مع اسم حزمة (15 موضعًا)

في DEX يجوز أن يوجد الصنف `La/b/a/a;` والحزمة `a/b/a/a/` معًا. في **لغة Java هذا
ممنوع**: لا يجوز أن يحمل نوع وحزمة الاسم المؤهَّل نفسه.

| الصنف | الحزمة بالاسم نفسه | ملفات داخلها |
|---|---|---|
| `a.a` | `a.a` | 4 |
| `a.b.a` | `a.b.a` | 105 |
| `a.b.a.a` | `a.b.a.a` | 38 |
| `a.b.a.a.a` | `a.b.a.a.a` | 14 |
| `a.b.a.a.a.a` | `a.b.a.a.a.a` | 2 |
| `a.b.a.a.b` | `a.b.a.a.b` | 5 |
| `a.b.a.b` | `a.b.a.b` | 11 |
| `a.b.a.b.a` | `a.b.a.b.a` | 4 |
| `a.b.a.c` | `a.b.a.c` | 21 |
| `a.b.a.c.a` | `a.b.a.c.a` | 2 |
| `a.b.a.d` | `a.b.a.d` | 10 |
| `a.b.b` | `a.b.b` | 24 |
| `a.b.b.a` | `a.b.b.a` | 5 |
| `a.b.c` | `a.b.c` | 56 |
| `a.f` | `a.f` | 29 |

هذا يُفسد تحليل الأسماء في الشجرة الفرعية `a.*` بأكملها — ومنها وحدها **8,501
خطأ**، بما في ذلك عجز `javac` عن تحليل `Object` نفسه داخل تلك الملفات.

### ج. توزيع بقيّة الأخطاء

| الفئة | العدد | قابلة للإصلاح آليًا؟ |
|---|---|---|
| `cannot find symbol` | 14,747 | جزئيًا (الباقي ناتج عن أ و ب) |
| `reference to X is ambiguous` | ~3,500 | ✗ يحتاج استنتاج أنواع |
| `method does not override` | 874 | ✓ |
| `cannot assign a value to final variable` | ~940 | ✓ |
| `return outside method` | 328 | ✓ |
| `anonymous class … cannot have arguments` | 291 | ✗ |
| `call to super must be first statement` | 248 | ✗ |
| `annotation type not applicable` | 204 | ✓ |
| `package com.google.common.collect does not exist` | 90 | ✓ (إضافة Guava) |
| `org.apache.http` مفقودة | 42 | ✓ (`useLibrary 'org.apache.http.legacy'`) |

حتى لو أُصلحت **كل** الفئات القابلة للإصلاح الآلي (أقل من 10% من الأخطاء)، يبقى
العائقان (أ) و(ب) — والأول منهما يعني ببساطة أن **أجزاءً من الشيفرة غير موجودة**.

---

## 5. الخلاصة

- تحويل مخرجات فكّ التجميع إلى Java صالحة **اكتمل بنجاح** (0 ملف معطوب).
- إعادة تجميع هذا المصدر ليعود تطبيقًا عاملًا **غير ممكنة**: الأرشيف المُسلَّم
  فكّ تجميع **ناقص**، وبعض الأصناف فُقدت نهائيًا، وبنية أخرى فيه لا يمكن
  التعبير عنها بلغة Java أصلًا.

### الطريق الموصِل إلى APK — مُنفَّذ ومُختبَر

تغيير هوية تطبيق لا يستلزم إعادة ترجمته: معرّف التطبيق يعيش في مكان واحد هو
خاصيّة `package` في الـ Manifest، وهو **مستقلّ تمامًا** عن أسماء حزم Java
للأصناف داخل الـ DEX. لذا يمكن تغييره وإعادة تجميع نفس الـ DEX دون مساس —
فيبقى سلوك التطبيق كما شُحن بالضبط.

خطّ الأنابيب جاهز في المستودع:

| الملف | الدور |
|---|---|
| `tools/rewrite_manifest_package.py` | تعديل الـ Manifest بوعي بالعناصر |
| `tools/repackage_apk.sh` | فكّ · تعديل · مزامنة smali · بناء · محاذاة · توقيع |
| `.github/workflows/apk-repackage.yml` | تشغيل تلقائي عند وضع APK في `apk-input/` |

**ما يُعاد تسميته:** خاصيّة `package`، الأذونات المخصّصة، سلطات مزوّدي المحتوى
(authorities)، `taskAffinity`، وسلاسل النص داخل الـ DEX التي تساوي المعرّف
القديم تمامًا (مقارنات `getPackageName()`).

**ما يُحمى من إعادة التسمية:** أسماء أصناف المكوّنات (`android:name` على
activity/service/receiver/provider، و`backupAgent`، و`targetActivity`) — تُجعل
مطلقة مقابل المعرّف **القديم** أولًا كي تبقى مُشيرة إلى أصناف موجودة فعلًا في
الـ DEX. كذلك تُترك `action` و`category` و`meta-data` دون مساس لأن الـ DEX ما
زال يُصدر السلاسل القديمة.

تم التحقق من الخطّ كاملًا على تطبيق حقيقي غير تافه (F-Droid) في التشغيل
`36799517126`: فكّ ← تعديل الهوية ← إعادة بناء ← محاذاة ← توقيع ← تحقّق من
المعرّف بـ `aapt dump badging` — كل المراحل نجحت.

**ما يلزم منك:** ضع ملف الـ APK الأصلي في `apk-input/` (أو ضع رابط تنزيله في
`apk-input/SOURCE_URL.txt`) وادفعه إلى الفرع. الناتج يصل في إصدار `apk-latest`.

بديل ثانٍ: تزويدنا بـ **JAR/AAR مبني للمحرّك** (أو مصدره الأصلي غير المُفكَّك)،
فتُحذف `libraries/java` ويُبنى المشروع من `java/` مقابل المحرّك الجاهز.
