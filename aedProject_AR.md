# التقرير التنفيذي لبناء تطبيق Android Studio جديد مستقل وسريع

## 0. الهدف

### معرّف الحزمة المعتمد

يستخدم المشروع الجديد الحزمة الأساسية التالية:

```text
com.kayaide.studio
```

وتكون المسارات مثل:

```text
app/src/main/java/com/kayaide/studio/
app/src/main/res/
```

ويجب أن تتطابق القيم التالية في المشروع:

```gradle
namespace 'com.kayaide.studio'
applicationId 'com.kayaide.studio'
```

كما يجب أن يبدأ كل ملف Java تطبيقي بـ:

```java
package com.kayaide.studio;
```

أما الوحدات الفرعية فتستخدم مثلًا:

```java
package com.kayaide.studio.editor;
package com.kayaide.studio.project;
package com.kayaide.studio.index;
```

هذا التقرير لا يعيد استخدام أسماء classes المشوشة ولا ينسخ البنية الداخلية للمشروع المرجعي. الهدف هو بناء تطبيق جديد مستقل، يستفيد فقط من الأساليب العامة الظاهرة في المشروع المرجعي:

- فصل الواجهة عن التحليل والبناء.
- تشغيل المهام الثقيلة في Workers/Services.
- فهرسة تدريجية.
- محرر افتراضي لا يرسم الملف كاملًا.
- تخزين metadata بدل تحميل كل المشروع للذاكرة.
- استعادة الجلسة بسرعة.
- تدفق نتائج ومؤشرات تقدم.
- استخدام toolchain محلي مع تحقق وإلغاء.
- الحفاظ على stable resource IDs.

سيوفر التطبيق الجديد محرر Java/XML/Manifest/Smali ومشروعًا قادرًا على استخدام مجلد `res` جاهز، ثم إنشاء ملفات Java وربطها بالـ Manifest وGradle والموارد.

---

# 1. مبادئ المنتج

1. الواجهة لا تنتظر عمليات القراءة أو التحليل أو البناء.
2. كل عملية طويلة قابلة للإلغاء.
3. لا يتم تحميل المشروع كله في الذاكرة.
4. لا يتم تعديل المصدر مباشرة أثناء التحويل أو البناء.
5. كل تغيير قابل للمراجعة والتراجع.
6. الفهرسة incremental وليست full scan عند كل عملية.
7. الملفات المفتوحة لها جلسة مستقلة وموقع مؤشر مستقل.
8. resource variants تعامل كإصدارات منطقية لنفس المورد.
9. لا يعتمد الربط على Regex وحده؛ يستخدم tokenizers وفهارس رموز.
10. لا يتم تشغيل DEX أو كود مشروع غير موثوق داخل process الواجهة.

---

# 2. التقنية المقترحة

```text
Language: Java 17
UI: Android XML + Material Components
Architecture: MVVM + Repository + Use Cases
UI state: ViewModel + LiveData/StateFlow bridge أو Observable state
Async: WorkManager + ExecutorService + Future cancellation
Database: Room
Preferences: SharedPreferences/DataStore bridge حسب المشروع
Network: OkHttp
Parsing: tokenizers مخصصة + parsers بنيوية
Build: AAPT/AAPT2, AIDL, javac/kotlinc, D8/R8 عند الحاجة
Storage: Storage Access Framework + app-private workspace
Reports: CSV/JSON
```

استخدم نسخًا ثابتة للمكتبات ولا تستخدم Gradle dynamic versions.

---

# 3. هيكلة المشروع الجديد

```text
studio-new/
├── settings.gradle
├── build.gradle
├── gradle.properties
├── app/
│   ├── build.gradle
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/kayaide/studio/
│       │   ├── StudioApplication.java
│       │   ├── app/
│       │   ├── shell/
│       │   ├── project/
│       │   ├── editor/
│       │   ├── language/
│       │   ├── index/
│       │   ├── resources/
│       │   ├── manifest/
│       │   ├── dex/
│       │   ├── buildsystem/
│       │   ├── runtime/
│       │   ├── settings/
│       │   ├── workers/
│       │   ├── reporting/
│       │   └── common/
│       ├── res/
│       ├── assets/
│       └── jniLibs/
└── tools/
    ├── aapt/
    ├── aidl/
    └── android-api/
```

---

# 4. أسماء الكلاسات ووظائفها

## 4.1 App وShell

### `StudioApplication`

- تهيئة قاعدة البيانات.
- إنشاء thread pools.
- إنشاء `ProjectRepository` و`WorkspaceIndex`.
- تحميل إعدادات الأداء.
- تسجيل recovery handler.

### `MainActivity`

- استضافة الشاشة الرئيسية فقط.
- ربط Project Drawer والمحرر واللوحة السفلية.
- استقبال نتائج SAF.
- حفظ/restoration لحالة الواجهة.
- لا ينفذ parsing أو ZIP أو build.

### `SessionCoordinator`

- حفظ التبويبات المفتوحة.
- حفظ المشروع النشط.
- حفظ موقع المؤشر والتمرير.
- استعادة آخر جلسة بعد تشغيل سريع.

### `NavigationCoordinator`

- Go to Definition.
- Back/Forward.
- Recent locations.
- فتح الملف في tab مناسب.

### `CrashRecoveryManager`

- إنشاء recovery snapshots.
- اكتشاف جلسة غير مكتملة.
- عرض Restore أو Discard.
- تنظيف snapshots القديمة.

---

## 4.2 المشروع والملفات

### `ProjectRepository`

الواجهة الموحدة لكل العمليات:

- create/open/close project.
- إضافة ملفات.
- تحديث metadata.
- مراقبة حالة الفهرسة.
- جلب الملفات للشجرة.

### `WorkspaceStore`

- إنشاء مجلد عمل معزول.
- نسخ المصدر من URI.
- حماية canonical paths.
- snapshots وtemporary output.
- atomic commit.

### `ProjectScanner`

- اكتشاف module directories.
- اكتشاف Java وXML وres وManifest وassets وDEX.
- استخراج metadata فقط في الجولة الأولى.
- إرسال ملفات المحتوى إلى الفهرسة لاحقًا.

### `ProjectTreeModel`

- نموذج directory/file.
- lazy children.
- حالة expanded/selected.
- badges للأخطاء والتعديلات.

### `RecentProjectsStore`

- حفظ آخر المشاريع.
- ترتيب حسب الاستخدام.
- حذف broken entries.
- quick open.

### `FileTypeDetector`

يصنف الملفات إلى Java/XML/Manifest/Smali/DEX/JSON/Gradle/Binary، بناءً على الامتداد والمحتوى المحدود، دون قراءة الملف كله.

---

## 4.3 المحرر

### `EditorHostView`

- يحتوي viewport والتبويبات.
- يربط buffer بالرسم.
- يستقبل touch/keyboard.
- يحدث المؤشر والتحديد.

### `EditorTabController`

- فتح وإغلاق وتبديل tabs.
- dirty marker.
- read-only state.
- scroll/cursor state.
- حد اختياري للتبويبات.

### `DocumentBuffer`

واجهة القراءة والتعديل الجزئي:

```java
CharSequence read(long start, long end);
void insert(long offset, CharSequence text);
void delete(long start, long end);
int lineOf(long offset);
long offsetOfLine(int line);
```

### `PieceTableBuffer`

التنفيذ المناسب للتعديلات؛ يمنع نسخ String كامل عند كل حرف.

### `LineIndex`

- مواقع بدايات الأسطر.
- line-to-offset وoffset-to-line.
- تحديث الجزء المتأثر فقط.

### `ViewportRenderer`

- يرسم الأسطر المرئية فقط.
- overscan صغير.
- cache للـ text layouts.
- لا ينشئ View لكل سطر.

### `SelectionModel`

- cursor.
- selection.
- multi-selection اختياري.
- copy/cut/paste.

### `UndoRedoManager`

- Command Pattern.
- دمج الحروف في transaction قصيرة.
- Rename/Replace All في transaction واحدة.
- حد ذاكرة قابل للإعداد.

### `FoldingModel`

- اكتشاف class/method/XML blocks.
- طي وفك دون حذف النص.
- حفظ folding state لكل ملف.

### `EditorSessionStore`

يحفظ:

```text
file path
cursor line/column
scroll position
selection
folding state
encoding
line ending
```

---

## 4.4 اللغات والتحليل

### `TokenizationScheduler`

- debounce بعد الإدخال.
- إلغاء الطلب السابق.
- إرسال المنطقة المعدلة فقط.

### `JavaTokenizer`

يحدد keywords وclasses وmethods وstrings وcomments وresource references.

### `XmlTokenizer`

يحدد tags وattributes وnamespaces وresource references.

### `ManifestTokenizer`

نسخة XML إضافية تعطي أولوية للـ components وpermissions وintent-filters.

### `SmaliTokenizer`

يدعم directives وopcodes وregisters وlabels وdescriptors.

### `CompletionEngine`

مصادره:

- كلمات اللغة.
- Android API index.
- Project symbols.
- resources.
- imports.
- XML tags/attributes.
- Smali opcodes/registers.
- snippets.

### `DiagnosticsEngine`

- فحص syntax.
- unresolved symbol.
- resource missing.
- class missing من Manifest.
- XML malformed.
- duplicate IDs.
- descriptor/reference problems.

### `FormatterService`

- تنسيق XML.
- indentation Java/Smali.
- لا يغير الملف كاملًا دون preview.
- يحافظ على line ending وencoding.

---

## 4.5 الفهارس والروابط

### `WorkspaceIndex`

واجهة عامة للبحث والتنقل:

```text
findDefinition
findReferences
searchSymbols
searchResources
updateFile
removeFile
```

### `JavaSymbolIndex`

يفهرس package/class/method/field/annotations وlocations.

### `ResourceIndex`

يفهرس resource type/name/qualifier/location.

### `ManifestIndex`

يفهرس Activities وServices وProviders وReceivers وpermissions وmetadata.

### `DexSymbolIndex`

يفهرس classes/methods/fields والـ descriptors عبر كل DEX.

### `ReferenceGraph`

يربط:

```text
Java → res
XML → res
Manifest → Java/res
Smali → Java/res
res → res
```

### `VariantResolver`

يختار النسخة المناسبة حسب:

```text
language
night mode
orientation
API
screen density
```

ولا يحذف النسخ الأخرى.

---

# 5. فتح المشاريع بسرعة

## المرحلة السريعة

```text
فتح URI
→ إنشاء project session
→ عرض root والشجرة الأولى
→ استعادة tabs
→ فتح أول ملف
```

## المرحلة الخلفية

```text
scan metadata
→ hash changed files
→ index symbols
→ parse resources
→ parse manifest
→ update diagnostics
```

يظهر المشروع قبل اكتمال التحليل، مع progress منفصل لكل مرحلة.

## التحسينات

- إعادة استخدام فهرس سابق إذا لم يتغير hash.
- فحص timestamps قبل SHA-256 عند المشاريع الكبيرة.
- قراءة metadata من ZIP دون فك كل المحتوى.
- فك الملفات المطلوبة فقط عند فتحها، مع خيار extract all.
- حد workers حسب RAM.

---

# 6. الاقتراحات السريعة

## التدفق

```text
key event
→ detect context
→ cancel previous completion
→ lookup prefix in Trie/Fuzzy index
→ rank results
→ render popup
```

## تحسينات الأداء

- لا يبدأ البحث العالمي قبل حرفين.
- cache حسب `prefix + documentVersion + context`.
- النتائج الأولى محلية، ثم نتائج المشروع.
- popup محدود 30–50 عنصرًا.
- عرض النتيجة فورًا ثم استكمال التفاصيل لاحقًا.

## ترتيب الاقتراح

```text
same method
→ same class
→ same package
→ project
→ Android API
→ alphabetical fallback
```

---

# 7. فتح الملفات بسرعة

- قراءة أول chunk فقط.
- اكتشاف النوع من header/extension.
- فتح viewport قبل tokenization الكامل.
- تحميل بقية الملف في الخلفية.
- cache للملفات المفتوحة.
- تفريغ tab غير النشط عند ضغط الذاكرة مع بقاء الحالة.
- منع فتح binary كبير داخل محرر النص.
- viewer خاص لـ DEX/images/archives.

زمن مستهدف:

```text
إظهار اسم الملف: فوري تقريبًا
إظهار أول viewport: أقل من 250ms للملف المتوسط
الإكمال: أقل من 100ms من cache
```

هذه أهداف قياس وليست ضمانًا لكل جهاز.

---

# 8. الحفظ واستعادة الجلسة

## Auto-save

```text
edit
→ 750ms idle debounce
→ recovery snapshot
→ temp write
→ flush
→ atomic rename
→ update index
```

## Session save

يحفظ فقط metadata الصغيرة:

```json
{
  "project": "project-id",
  "tabs": [
    {"path":"app/src/main/java/MainActivity.java","line":120,"column":8}
  ],
  "activeTab": 0,
  "drawerWidth": 280,
  "bottomPanelHeight": 240,
  "theme": "dark"
}
```

لا يحفظ نص الملف في session؛ النص يبقى في المشروع وrecovery عند الحاجة.

## Crash recovery

- snapshot لكل dirty document.
- manifest للجلسة.
- استعادة آخر نسخة سليمة.
- مقارنة timestamp/hash.
- خيار Keep Local أو Reload.

---

# 9. القوائم والأوامر

## File Menu

```text
New Project
Open Project
Open File
Save
Save As
Save All
Close Tab
Close Others
Export Project
Exit
```

## Edit Menu

```text
Undo
Redo
Cut
Copy
Paste
Select All
Find
Replace
Replace All
Format Selection
```

## Navigate Menu

```text
Go to Line
Go to Symbol
Go to Definition
Find References
Back
Forward
Recent Locations
Open File by Name
```

## Project Menu

```text
Scan Project
Re-index
Build
Clean
Validate
Show Dependencies
Show Resource Variants
```

## Analyze Menu

```text
Analyze Current File
Analyze Project
Show Problems
Show Callers
Show Callees
Generate Report
```

## View Menu

```text
Toggle Project Drawer
Toggle Bottom Draw
Toggle Problems
Toggle Search
Toggle Minimap
Toggle Line Numbers
Toggle Dark Mode
```

## Tools Menu

```text
Command Palette
Resource Explorer
Manifest Inspector
XML Layout Inspector
DEX/Smali Explorer
Settings
Clear Cache
Diagnostics
```

كل أمر يملك:

```text
commandId
shortcut
enabled predicate
progress state
cancellation
undo behavior
```

---

# 10. Bottom Draw

لوحة سفلية قابلة للسحب، لا تفتح Activity جديدة لكل نتيجة.

## Problems

- Error/Warning/Info.
- grouping حسب الملف.
- quick fix.
- click-to-location.

## Search

- نتائج streaming.
- pagination.
- regex.
- replace preview.
- cancel.

## References

- definition.
- callers.
- callees.
- resource variants.

## Build Output

- stdout/stderr.
- مرحلة التنفيذ.
- progress.
- cancel.
- copy logs.

## Changes

- before/after.
- old/new name.
- reason.
- confidence.
- Apply/Revert.

## Logs

- filter.
- clear.
- export.
- severity.

---

# 11. الإعدادات

## Editor

- font family/size.
- line numbers.
- current line.
- word wrap.
- horizontal scroll.
- tab width.
- spaces/tabs.
- auto-indent.
- bracket/tag matching.
- folding.
- minimap.
- completion delay.
- diagnostics delay.
- smooth scrolling.

## Project

- restore session.
- open last project.
- follow active file.
- show hidden/build files.
- auto-index.
- file size thresholds.

## Performance

- workers count.
- cache size.
- max open documents.
- update interval.
- background analysis.
- low-memory mode.

## Build

- debug/release profile.
- tool paths.
- stable IDs.
- parallel tasks.
- output directory.
- clean before build.
- validate after build.

## Safety

- read-only external files.
- confirm destructive actions.
- clear workspace.
- network access policy.
- no execution of untrusted code.
- permission audit.

---

# 12. البناء والتقارير

## Build Orchestrator

يدير مراحل:

```text
validate
→ resources
→ aidl
→ Java/Kotlin
→ dex
→ package
→ sign optional
→ verify
```

كل مرحلة process أو Worker مستقل وتعيد:

```text
state
progress
stdout
stderr
artifacts
```

## stable resources

يستخدم `StableResourceIdStore` لمنع تغير IDs بشكل غير متوقع أثناء البناء. لا يتم نسخ `stable-ids.txt` إلا إذا كان المستخدم يملك المشروع ويتطلب استقرار الموارد.

## Reports

```text
build-report.json
problems.csv
changes.csv
index-summary.json
```

---

# 13. التصميم البصري

## Theme

- Light.
- Dark.
- AMOLED اختياري.
- ألوان syntax مستقلة عن theme.
- contrast accessibility.

## Layout

```text
TopBar: 48–56dp
Drawer: 260–340dp قابل للتغيير
Editor: المساحة الأكبر
Bottom Draw: 220–360dp قابل للسحب
```

على الأجهزة الصغيرة تتحول الشجرة واللوحة السفلية إلى Bottom Sheets أو شاشات مؤقتة.

---

# 14. ما يؤخذ من الأسلوب المرجعي وما لا يؤخذ

## يؤخذ كمبدأ

- services منفصلة للتحليل.
- assets/toolchain محلية بعد تحقق.
- stable resource IDs.
- build output مستقل.
- editor virtualization.
- session persistence.
- settings متعددة.
- XML/Java/Manifest integration.
- separate runtime/debug process.

## لا يؤخذ

- أسماء classes المشوشة.
- نسخ package names.
- نسخ صلاحيات غير ضرورية.
- أسرار أو مفاتيح أو معرفات خدمات.
- أي telemetry أو SDK إعلاني غير مطلوب.
- أي code obfuscation كجزء من الهيكلة.
- أي behavior غير موثق أو غير ضروري.

---

# 15. مراحل بناء التطبيق

## المرحلة 1: الأساس

Gradle، Java 17، Manifest، themes، application، settings.

## المرحلة 2: Workspace

SAF، projects، tree، Room، recent sessions.

## المرحلة 3: Editor

buffer، line index، tabs، viewport، undo/save.

## المرحلة 4: Languages

Java/XML/Manifest/Smali tokenizers وcompletion.

## المرحلة 5: Indexing

Java/Resource/Manifest/Dex indexes وcross references.

## المرحلة 6: Panels

Problems/Search/References/Build/Changes/Logs.

## المرحلة 7: Build

aapt/aapt2، aidl، compiler، dexer، packager، validator.

## المرحلة 8: Advanced

designer، Git، runtime console، reports، DEX workflows.

## المرحلة 9: Performance

benchmarks، memory، cancellation، low-memory mode.

## المرحلة 10: Release

permissions review، signing، APK، device matrix، crash monitoring opt-in.

---

# 16. معايير قبول

- فتح مشروع كبير دون تجميد.
- إظهار الشجرة قبل اكتمال الفهرسة.
- فتح أول ملف بسرعة.
- تمرير سلس مع 50,000 سطر اختبار.
- إكمال خلال زمن مستهدف أقل من 100ms من cache.
- فحص تدريجي لا يعيد تحليل المشروع كاملًا.
- حفظ ذري واستعادة بعد قتل التطبيق.
- فتح Java والانتقال إلى res وManifest.
- البحث وإظهار النتائج في Bottom Draw.
- بناء مع progress وقابلية cancel.
- عدم فقدان الملف عند فشل الحفظ أو البناء.
- احتفاظ resource IDs عند تفعيل stable IDs.
- فصل الكود الجديد عن المشروع المرجعي.

---

# الخلاصة

التطبيق الجديد يجب أن يكون مستقلًا في الأسماء والطبقات والكود، لكنه يستفيد من الأساليب العامة التي تجعل بيئة التطوير سريعة:

```text
Fast startup
+ lazy tree
+ indexed navigation
+ virtualized editor
+ incremental parsing
+ cached completion
+ debounced autosave
+ atomic storage
+ background analysis
+ isolated build process
+ session recovery
+ bottom draw panels
+ stable resource IDs
+ measurable performance
```

هذه الهيكلة مناسبة لبناء تطبيق جديد يعتمد على مجلد `res` جاهز، ثم ينشئ ملفات Java وManifest وGradle ويربطها عبر فهارس ومراجع دقيقة، دون نسخ أسماء أو ملفات مشوشة من المشروع المرجعي.

---

# 17. مواصفات المحرر والتنقل وواجهة Draw والإعدادات

## 17.1 تصميم المحرر

المحرر هو مركز التطبيق، ويجب أن يعمل كـ `EditorHost` واحد يستضيف عدة وثائق بدل إنشاء Activity جديدة لكل ملف. يتكون من:

```text
EditorHost
├── TabStrip
├── BreadcrumbBar
├── CodeViewport
├── Gutter
├── HorizontalScrollLayer
├── CompletionPopup
├── QuickFixPopup
└── StatusBar
```

### TabStrip

كل تبويب يحتفظ بـ:

- اسم الملف وأيقونة نوعه.
- المسار المختصر.
- علامة التعديل غير المحفوظ `*`.
- حالة read-only.
- حالة الخطأ أو التحليل.
- زر إغلاق.
- موضع المؤشر والتمرير.

عند إغلاق تبويب معدل، يظهر تأكيد يحتوي على Save وDiscard وCancel. لا يتم فقدان محتوى الذاكرة عند الانتقال بين التبويبات.

### BreadcrumbBar

يعرض:

```text
project > module > package > class > method
```

ويتيح الضغط على أي مستوى للانتقال السريع إلى الملف أو الرمز.

### CodeViewport

لا يرسم كل الملف. يحسب نطاق الأسطر المرئي، ثم يرسمه مع هامش صغير أعلى وأسفل الشاشة. عند التمرير السريع يتم استخدام placeholder قصير، ثم توضع النصوص الملونة عند اكتمال layout.

هذه الطريقة تمنع إنشاء آلاف Views وتقلل استهلاك الذاكرة وإعادة الرسم.

### Gutter

يحتوي على:

- أرقام الأسطر.
- علامات الأخطاء والتحذيرات.
- breakpoints إن تم تفعيل التشغيل.
- علامات bookmarks.
- أسهم code folding.
- علامة السطر النشط.

النقر على رقم السطر يحدد السطر، والضغط المطول يفتح أوامر السطر.

## 17.2 التنقل داخل الكود

### Go to Line

يفتح مربعًا صغيرًا مع debounce للبحث. يقبل:

```text
120
120:8
+25
-10
```

ويحرك المؤشر دون إعادة تحميل الملف.

### Go to Symbol

يبحث في رموز الملف الحالي أولًا، ثم في WorkspaceIndex. النتائج مرتبة حسب:

1. التطابق الكامل.
2. prefix.
3. الرموز القريبة من موضع المؤشر.
4. الرموز المستخدمة حديثًا.

### Go to Definition

عند الضغط على class أو method أو field أو resource reference:

```text
resolve token
→ query WorkspaceIndex
→ open target document
→ restore/create tab
→ move cursor
→ push current location to history
```

إذا كانت النتيجة غير مؤكدة بسبب Reflection أو dynamic lookup، يظهر تنبيه بدل فتح نتيجة خاطئة.

### Find References

يعرض لوحة في Bottom Draw تحتوي على:

```text
file
line
column
reference type
context preview
```

ويتم تحميل النتائج على دفعات، حتى لا تتوقف الواجهة عند وجود آلاف المراجع.

### Back/Forward

يستخدم `NavigationHistory` مع إزالة التكرارات المتتالية. كل عنصر يحفظ:

```text
file
line
column
scrollX
scrollY
selection
```

### Quick Open وCommand Palette

Quick Open يبحث عن الملفات والرموز، بينما Command Palette يبحث عن الأوامر. كلاهما يستخدم نفس popup خفيف، مع fuzzy matching ونتائج محدودة.

## 17.3 البحث داخل الملف والمشروع

### البحث داخل الملف

- تحديث النتائج بعد فترة خمول قصيرة.
- تمييز كل التطابقات.
- Next/Previous.
- Case sensitive.
- Whole word.
- Regex اختياري.
- تحديد النتيجة الحالية.
- Replace وReplace All.

### البحث في المشروع

يستخدم `SearchCoordinator`:

```text
collect candidate files
→ scan in chunks
→ emit result batches
→ render first batch
→ continue in background
```

المزايا:

- إلغاء فوري.
- عدم تحميل كل الملفات في الذاكرة.
- استثناء build/cache/generated folders.
- فلترة حسب نوع الملف.
- بحث في Java/XML/Manifest/Smali/JSON.
- معاينة قبل الاستبدال.
- Replace All كـ transaction واحدة قابلة للتراجع.

### فهرس البحث

للمشاريع الكبيرة، يخزن التطبيق فهرسًا نصيًا وsymbol index. إذا تغير hash الملف يعاد فهرسته فقط، وإذا لم يتغير يستخدم الفهرس القديم.

## 17.4 اقتراحات الكتابة

يبدأ `CompletionEngine` بتحليل السياق:

```text
Java method/class/import/resource
XML tag/attribute/resource
Manifest component/permission
Smali opcode/register/descriptor
```

ثم يبحث في cache محلي، ثم الفهرس العام. عند كتابة حرف جديد يتم إلغاء Future السابق حتى لا تصل نتيجة قديمة بعد النتيجة الجديدة.

كل عنصر اقتراح يحتوي على:

```text
label
detail
documentation
type
target location
insert text
```

ويجب ألا يعرض popup أكثر من 30–50 عنصرًا في وقت واحد.

## 17.5 الأخطاء والإصلاح السريع

يعمل `DiagnosticsEngine` على ثلاث درجات:

```text
syntax range
→ current method/block
→ project-wide validation
```

لكل Diagnostic:

```text
severity
code
message
file
line
column
related locations
quick fix
```

لا يظهر Quick Fix إلا إذا كان التعديل قابلًا للإثبات، ويجب عرضه في Change Review قبل تطبيقه.

## 17.6 واجهة Draw كدرج تنقل

يتم تنفيذها كـ `BottomSheetBehavior` أو `BottomSheetDialog` مخصص، وليس كنافذة Activity ثقيلة. لها ثلاث حالات:

```text
Collapsed: شريط صغير يعرض عدد الأخطاء وحالة البناء
Half: تغطي الجزء السفلي وتترك المحرر ظاهرًا
Expanded: تغطي معظم الشاشة للبحث والسجلات
```

### تبويبات Draw

#### Problems

- Error/Warning/Info.
- grouping حسب الملف أو النوع.
- filter.
- click-to-location.
- quick fix.
- clear resolved.

#### Search

- نتائج incremental.
- preview للسطر.
- مسار الملف.
- رقم السطر.
- Replace/Replace All.
- إلغاء العملية.

#### References

- Definition.
- References.
- Callers.
- Callees.
- Resource variants.

#### Build Output

- المرحلة الحالية.
- progress.
- stdout/stderr.
- زر Copy.
- زر Save Log.
- Cancel.
- فتح الخطأ في الملف.

#### Changes

- before/after.
- نوع التعديل.
- confidence.
- السبب.
- Apply/Revert.

#### Logs

- مستويات log.
- بحث داخل السجل.
- تنظيف.
- تصدير.
- pause/resume للـ streaming.

### سلاسة Draw

- لا يعاد تحميل كل النتائج عند وصول نتيجة واحدة.
- تستخدم `ListAdapter` وDiffUtil.
- ترسل النتائج كدفعات.
- يحفظ آخر tab وارتفاع اللوحة.
- عند النقر على نتيجة، تبقى اللوحة قابلة للتصغير مع بقاء موضعها.
- يستخدم `WindowInsets` وedge-to-edge بدل قياسات ثابتة.

## 17.7 إعدادات المحرر

تقسم Settings إلى شاشات واضحة باستخدام `PreferenceFragmentCompat` أو شاشة Material مخصصة:

### Appearance

- Light/Dark/AMOLED/System.
- حجم الخط.
- نوع الخط.
- تباعد الأسطر.
- تباين الألوان.
- لون التحديد.
- إظهار السطر الحالي.
- إظهار minimap اختياريًا.

### Editing

- tab width.
- استخدام spaces أو tabs.
- auto-indent.
- auto-close brackets/quotes.
- code folding.
- word wrap.
- horizontal scrolling.
- format on save.
- حفظ line endings.
- encoding.

### Completion

- تفعيل الإكمال التلقائي.
- زمن debounce.
- إظهار documentation.
- إكمال الكلمات المحلية قبل العالمية.
- snippets.
- حجم popup.

### Diagnostics

- parse on type.
- parse on save.
- فحص current file.
- فحص المشروع.
- مستوى التحليل.
- ظهور warnings.
- حد الملف الكبير.

### Project and Session

- فتح آخر مشروع.
- استعادة التبويبات.
- استعادة موضع التمرير.
- حفظ تلقائي.
- recovery snapshots.
- عدد النسخ الاحتياطية.
- متابعة الملف النشط في الشجرة.

### Performance

- عدد background workers.
- حجم token cache.
- حجم document cache.
- معدل تحديث progress.
- low-memory mode.
- تعطيل minimap للمشاريع الكبيرة.
- تعطيل full scan التلقائي.

### Build and Tools

- build variant.
- debug/release.
- مسارات الأدوات.
- stable resource IDs.
- parallel build.
- validate after build.
- الاحتفاظ بملفات build logs.

### Privacy and Safety

- الشبكة موقوفة افتراضيًا للتحليل المحلي.
- السماح بالرابط HTTP(S) عند الطلب فقط.
- تنظيف workspace.
- إظهار الصلاحيات.
- عدم تنفيذ كود المشروع داخل process الواجهة.
- طلب أقل صلاحية ممكنة من Android.

## 17.8 أحدث أسلوب Android للواجهة

للمشروع الجديد استخدم:

```text
compileSdk حديث متاح عند البناء
targetSdk حديث
minSdk يحدد بعد اختبار الأجهزة
AndroidX حديث
Material Components حديث
WindowInsetsCompat
Activity Result API
ViewModel + SavedStateHandle
Room
WorkManager
```

ويفضل تصميم الواجهة باستخدام XML Views إذا كان الهدف دعم محرر نصي كثيف وتخصيص الرسم، مع Material Components و`BottomSheetBehavior`. يمكن استخدام Compose للشاشات الثانوية مثل Settings، لكن لا يخلط المشروع بين نماذج حالة متعددة دون طبقة state موحدة.

يجب دعم:

- edge-to-edge.
- dynamic color عند توفره.
- dark mode من النظام.
- large screens وtablets.
- keyboard shortcuts.
- accessibility labels.
- font scaling.
- rotation دون فقدان الجلسة.
- predictive back عند توفره.

## 17.9 حفظ الحالة عند دورة حياة Android

```text
onStop
→ schedule session save

onTrimMemory
→ release token/layout caches

onSaveInstanceState
→ save lightweight UI state فقط

process death recovery
→ load project session
→ verify file hashes
→ restore tabs and positions
```

لا تستخدم `onSaveInstanceState` لتخزين نصوص ضخمة؛ استخدم workspace recovery على القرص.

## 17.10 معايير أداء المحرر

تستخدم Benchmark tests بدل وصف الأداء بشكل مطلق:

```text
first visible viewport: target < 250ms للملف المتوسط
cursor/input feedback: target < 16–32ms
cached completion: target < 100ms
panel open/close: target < 100ms
cancel search: target < 200ms
```

وتقاس أيضًا:

- FPS أثناء التمرير.
- memory peak عند الفهرسة.
- cache hit ratio.
- زمن استعادة الجلسة.
- زمن ظهور أول نتيجة بحث.
- زمن إلغاء البناء.

---

# 18. تحديث خطة التنفيذ

بعد مرحلة المحرر الأساسية، تنفذ هذه المراحل:

1. `EditorHost` وtabs وdocument buffer.
2. line index وviewport renderer.
3. tokenizers والتمييز اللغوي.
4. navigation history وGo to Definition.
5. SearchCoordinator وBottom Draw.
6. CompletionEngine وDiagnosticsEngine.
7. SessionCoordinator وCrashRecoveryManager.
8. Settings باستخدام PreferenceFragmentCompat وMaterial components.
9. benchmark/performance tests.
10. تكامل Resource/Manifest/Java/Dex index.

---

# 19. الخلاصة المحدثة

المحرر السريع لا يعتمد على واجهة جميلة فقط، بل على سلسلة كاملة:

```text
Piece Table/Rope
+ Line Index
+ Virtualized Viewport
+ Incremental Tokenization
+ Indexed Completion
+ Navigation History
+ Streaming Search
+ BottomSheet Draw
+ DiffUtil panels
+ Debounced Atomic Save
+ Session Recovery
+ Background Diagnostics
+ Isolated Build Worker
```

هذه الإضافات تكمل مواصفات المشروع الجديد ذي الحزمة:

```text
com.kayaide.studio
```

وتحدد بالتفصيل محرر الكود، التنقل، البحث، الاقتراحات، لوحة Draw، الإعدادات، استعادة الجلسة، ودعم إصدارات Android الحديثة.
