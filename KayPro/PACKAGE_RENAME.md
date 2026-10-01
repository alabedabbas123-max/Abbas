# تغيير حزمة التطبيق إلى `com.almlkaide.kaypro`

تاريخ التنفيذ: 2026-09-30

## الحزم قبل وبعد

| قبل | بعد | النوع |
|---|---|---|
| `com.aide.pro` | `com.almlkaide.kaypro` | معرّف التطبيق / `namespace` / `package` في Manifest |
| `almlk.almlkid` | `com.almlkaide.kaypro` | حزمة كود التطبيق (Java) |
| `almlk.manifesteditor` | `com.almlkaide.kaypro.manifesteditor` | ميزة محرر Manifest |
| `almlk.assetsmanager` | `com.almlkaide.kaypro.assetsmanager` | ميزة مدير assets |

## ما تم تعديله فعليًا

### 1. ملفات الإعداد

- `build.gradle`: `namespace 'com.almlkaide.kaypro'` و`applicationId 'com.almlkaide.kaypro'`.
- `settings.gradle`: `rootProject.name = "KayPro"`.
- `source-sets.json`: `applicationPackage` والوحدات.

### 2. AndroidManifest.xml

- `package="com.almlkaide.kaypro"`.
- جميع `android:name` لمكوّنات التطبيق (Application / Activities / Services / Receivers).
- الإذن المخصّص: `com.aide.pro.permission.C2D_MESSAGE` ← `com.almlkaide.kaypro.permission.C2D_MESSAGE`
  (في `<permission>` و`<uses-permission>` معًا).
- جميع `android:authorities` لمزوّدي المحتوى:
  - `com.almlkaide.kaypro.fileprovider`
  - `com.almlkaide.kaypro.firebaseinitprovider`
  - `com.almlkaide.kaypro.crashlyticsinitprovider`
  - `com.almlkaide.kaypro.mobileadsinitprovider`
  - `com.almlkaide.kaypro.utilcode.provider`
- **حُذف** `android:sharedUserId="com.aide"` — كان يربط التطبيق بهوية ومُوقِّع AIDE الأصلي،
  وهو مُهمَل منذ API 29 ولا معنى له بعد تغيير الحزمة.

### 3. شجرة مصادر Java

```
java/almlk/almlkid         →  java/com/almlkaide/kaypro
java/almlk/manifesteditor  →  java/com/almlkaide/kaypro/manifesteditor
java/almlk/assetsmanager   →  java/com/almlkaide/kaypro/assetsmanager
libraries/java/almlk/almlkid → libraries/java/com/almlkaide/kaypro
```

تم تحديث تعريف `package` و`import` داخل الملفات بما يطابق المسارات الجديدة.

### 4. الموارد `res/`

- أسماء الـ Views المخصّصة داخل ملفات التخطيط (`com.almlkaide.kaypro.view.*`,
  `com.almlkaide.kaypro.aide.widget.*`).
- `res/xml/shortcuts.xml` و`res/xml-v22/shortcuts.xml`: `android:targetPackage` من
  `com.aide.ui` إلى `com.almlkaide.kaypro` (كانت الاختصارات تستهدف حزمة أجنبية ولا تعمل).

### 5. مراجع `R`

كل `com.aide.pro.R.*` أصبحت `com.almlkaide.kaypro.R.*` — بما فيها ملف `AideR.java`
الذي يحوي وحده 3,574 مرجعًا.

### 6. أصول `assets/`

- `assets/crashlytics-build.properties`: `package_name=com.almlkaide.kaypro`، `app_name=KayPro`.
- استدعاءات `ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro")` (13 موضعًا).

## إحصاءات الاستبدال

| النمط | عدد المواضع |
|---|---|
| `com.aide.pro` | 6,759 |
| `almlk.almlkid` | 2,874 |
| `almlk.manifesteditor` | 53 |
| `almlk.assetsmanager` | 14 |
| `almlk/almlkid` (مسارات داخل نصوص) | 12 |
| **الإجمالي** | **9,712** |

عدد الملفات النصية المعدَّلة: **806** من أصل 6,891 ملفًا نصيًا مفحوصًا.

## ما لم يُعدَّل عمدًا

هذه ليست «حزمة التطبيق»، وتغييرها يكسر السلوك:

1. **حزم محرّك AIDE** (`com.aide.ui.*`, `com.aide.engine.*`, `com.aide.common.*`,
   `com.aide.uidesigner.*`): أسماء أصناف مكتبة داخل `libraries/java`، وليست هوية التطبيق.
2. **واصفات AIDL / Binder** مثل `"com.aide.engine.service.IEngineListener"` و
   `"com.aide.ui.scm.IExternalGitService"`: عقود Binder، وتغيير الواصف يكسر الاتصال
   بين عمليات التطبيق (`:PackagingService`, `:GitService` …).
3. **مراجع لتطبيقات AIDE الخارجية** على Google Play
   (`"com.aide.ui"`, `"com.aide.web"`, `"com.aide.phonegap"`, `"com.aide.premium.key"`):
   تخصّ فحص التوقيع وقوائم التسويق وروابط المتجر لتطبيقات طرف آخر.
4. **`taskAffinity`** مثل `com.aide.trainer` و`com.aide.ui.javaconsole`: قيم داخلية حرة
   لتجميع المهام، ولا تؤثر على هوية الحزمة.
5. **`android:label="AIDE Pro"`**: اسم العرض لم يُطلب تغييره؛ يمكن تبديله بسهولة عند الطلب.

## التحقق الآلي بعد التعديل

| الفحص | النتيجة |
|---|---|
| تطابق تعريف `package` مع مسار كل ملف Java | ✅ 6,619 / 6,619 ملف بلا اختلاف |
| صلاحية تحليل ملفات XML في `res/` و`AndroidManifest.xml` | ✅ جميعها صالحة |
| بقايا `com.aide.pro` في المشروع | ✅ صفر |
| بقايا `almlk.` (غير `almlkaide`) | ✅ صفر |
