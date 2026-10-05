# طلب تعديل شامل لنظام المحرر — مواصفات تنفيذية مستوحاة من `abeed.zip`

## 0. الغرض من الطلب

يُستخدم هذا المستند كطلب تطوير لمحرر مشروع Android آخر. المطلوب ليس نسخ أسماء أو classes أو كود من المشروع المرجعي، بل تطبيق نفس الأفكار الهندسية التي تجعل المحرر خفيفًا وسريعًا:

- فصل المحرر عن التحليل والبناء.
- معالجة تدريجية لا تعيد تحليل المشروع كله.
- استعادة جلسة سريعة من metadata صغيرة.
- فتح الملف عبر viewport قبل اكتمال التحليل.
- تنقل رمزي عبر الفهارس بدل بحث نصي فقط.
- اقتراحات مقيدة بالسياق ومخزنة مؤقتًا.
- لوحة نتائج سفلية streaming وقابلة للسحب.
- تنفيذ البناء والفحص في خدمات/Workers منفصلة.

المشروع المرجعي يحتوي على مؤشرات واضحة لهذه المعمارية من خلال وجود خدمة لتحليل الكود، أنشطة مستقلة للتصميم والبناء والتشغيل، أدوات AAPT/AIDL داخل الأصول، دعم Android XML، وخدمات Git/Logcat/Runtime. وبسبب كون بعض الملفات مشوشة أو مجمعة، لا يمكن الجزم بالتنفيذ الداخلي لكل دالة؛ لذلك يحدد هذا التقرير تنفيذًا جديدًا واضح الأسماء وقابلًا للاختبار.

المصدر المدروس:

`https://github.com/alabedabbas123-max/Abbas/blob/main/abeed.zip`

الحزمة الجديدة المستهدفة:

```text
com.kayaide.studio
```

---

# 1. النتيجة المطلوبة

يجب أن يصبح المحرر قادرًا على:

1. فتح Java وKotlin وXML وManifest وSmali وJSON وGradle بسرعة.
2. فتح أول جزء مرئي من الملف فورًا، ثم إكمال القراءة والتحليل في الخلفية.
3. التنقل بين الملفات والرموز والمراجع دون بحث كامل متكرر.
4. اقتراح الكود خلال زمن منخفض حتى في المشاريع الكبيرة.
5. إظهار الأخطاء والتحذيرات أثناء الكتابة دون تجميد الشاشة.
6. حفظ الجلسة واستعادتها بعد إغلاق التطبيق أو توقف العملية.
7. إدارة عدة تبويبات مع حفظ موضع كل تبويب.
8. البحث داخل الملف أو المشروع مع إلغاء فوري ونتائج تدريجية.
9. فتح Definition وReferences عبر Workspace Index.
10. عرض نتائج البحث والبناء والأخطاء في نافذة Draw سفلية موحدة.
11. تنفيذ البناء والفهرسة بعيدًا عن Main Thread.
12. الحفاظ على الملف الأصلي وإتاحة التراجع والاستعادة.

---

# 2. التصميم العام للمحرر

```text
StudioApplication
└── MainActivity
    ├── ProjectDrawer
    ├── EditorWorkspace
    │   ├── EditorTabStrip
    │   ├── BreadcrumbBar
    │   ├── CodeViewport
    │   └── EditorStatusBar
    └── BottomDraw
        ├── ProblemsPanel
        ├── SearchPanel
        ├── ReferencesPanel
        ├── BuildOutputPanel
        ├── ChangesPanel
        └── LogsPanel
```

خارج واجهة المستخدم:

```text
EditorCore
├── DocumentStore
├── PieceTableBuffer
├── LineIndex
├── TokenCache
├── LayoutCache
├── UndoManager
├── NavigationHistory
└── EditorSessionStore

Background Engine
├── TokenizationScheduler
├── CompletionEngine
├── DiagnosticsEngine
├── SearchCoordinator
└── WorkspaceIndexer

External Workers
├── ProjectScanWorker
├── BuildWorker
├── ExportWorker
├── RecoveryWorker
└── CleanupWorker
```

---

# 3. الفئات الجديدة ووظيفة كل فئة

## 3.1 طبقة التطبيق

### `StudioApplication`

- إنشاء `ExecutorService` بعدد عمال مناسب للجهاز.
- تهيئة Room وSettings وWorkspaceStore.
- تهيئة `WorkspaceIndex`.
- تحميل إعدادات الأداء قبل فتح الواجهة.
- تسجيل `ProcessLifecycleOwner` للحفظ عند انتقال التطبيق للخلفية.

### `MainActivity`

- إنشاء الهيكل المرئي فقط.
- ربط ViewModels وAdapters.
- استقبال نتائج `ActivityResultContracts`.
- إدارة WindowInsets وedge-to-edge.
- عدم تنفيذ القراءة أو parsing أو البناء داخلها.

### `EditorViewModel`

يمثل حالة المحرر:

```text
activeTab
openTabs
cursor
selection
visibleRange
diagnostics
completionItems
isSaving
isIndexing
bottomDrawState
```

ويستقبل أحداثًا مثل:

```text
OpenDocument
CloseTab
InsertText
DeleteText
SaveDocument
Find
GoToDefinition
ShowReferences
ToggleBottomDraw
```

### `SessionCoordinator`

- حفظ session صغيرة جدًا.
- استعادة المشروع قبل التبويبات عند بدء التشغيل.
- التحقق من hash قبل إعادة فتح الملف.
- حذف الجلسات التالفة أو القديمة.

---

## 3.2 نموذج الوثيقة

### `DocumentStore`

مسؤول عن ربط path بذاكرة الوثيقة وبالملف على القرص. لا يحفظ كل الملفات المفتوحة في الذاكرة بلا حدود.

### `PieceTableBuffer`

الاختيار الأساسي للملفات الكبيرة. يحتفظ بالمصدر الأصلي وإضافات المستخدم كمقاطع، ويطبق insert/delete دون نسخ النص كله.

### `LineIndex`

يحتفظ ببدايات الأسطر:

```text
[0, 28, 64, 97, ...]
```

ويحدث المنطقة المتأثرة فقط. يدعم:

```text
offset → line/column
line/column → offset
Go to line
render visible lines
```

### `ViewportModel`

يحدد:

```text
visibleStartLine
visibleEndLine
overscanStart
overscanEnd
scrollX
scrollY
```

### `UndoManager`

- Command Pattern.
- دمج الكتابة السريعة في عملية واحدة.
- Replace All وRename كمعاملة واحدة.
- حد ذاكرة قابل للضبط.
- حفظ checkpoints عند الحفظ.

---

# 4. فتح الملفات بأقل تأخير

## 4.1 التدفق المطلوب

```text
طلب فتح الملف
→ التحقق من metadata
→ إنشاء tab
→ عرض placeholder/أول viewport
→ قراءة chunk أولي
→ بناء LineIndex مبدئي
→ رسم النص
→ tokenize للمنطقة المرئية
→ فهرسة الباقي في الخلفية
```

لا ينتظر المحرر التحليل الكامل كي يعرض أول سطور.

## 4.2 Large File Mode

```text
Small: تحرير كامل + تحليل تدريجي
Medium: buffer كامل + viewport جزئي
Large: chunked buffer + تحرير محدود
Binary/DEX: viewer مخصص
```

عند تجاوز حد الملف:

- لا يستخدم TextView تقليديًا كاملًا.
- لا يطبق syntax highlighting على الملف كله.
- لا يشغل diagnostics كاملًا عند كل حرف.
- يعرض تنبيهًا بسيطًا ويتيح القراءة أو فتح جزء محدد.

## 4.3 File Cache

يستخدم `LruCache<String, DocumentSnapshot>` محدود الحجم. عند ضغط الذاكرة:

1. يحفظ dirty documents.
2. يزيل layouts وtokens القديمة.
3. يحتفظ بالموضع والحالة فقط.
4. يعيد تحميل المحتوى عند العودة.

---

# 5. رسم المحرر وسلاسة التمرير

## 5.1 لا تنشئ View لكل سطر

المطلوب `CodeEditorView` مخصص أو مكون داخلي يرسم Canvas للمنطقة المرئية. إنشاء آلاف TextViews يسبب:

- استهلاك ذاكرة.
- بطء layout.
- كثرة garbage collection.
- تقطع التمرير.

## 5.2 Rendering pipeline

```text
scroll/input
→ update cursor/viewport immediately
→ invalidate visible region
→ get cached layout if available
→ schedule tokenization/layout for missing lines
→ redraw only changed rectangle
```

## 5.3 Cache

### `TokenCache`

المفتاح:

```text
fileId + lineNumber + documentVersion
```

### `TextLayoutCache`

المفتاح:

```text
fileId + lineNumber + fontSize + theme + documentVersion
```

### `CompletionCache`

المفتاح:

```text
language + prefix + context + indexVersion
```

كل cache يستخدم LRU وحجمًا يحدده إعداد الأداء.

## 5.4 التمرير

- لا تعيد قياس الملف كله.
- استخدم line height ثابتًا قدر الإمكان.
- احسب الأسطر المرئية من `scrollY / lineHeight`.
- استخدم overscan محدودًا.
- عند fling سريع، خفف تفاصيل syntax مؤقتًا ثم أعدها عند توقف التمرير.
- احتفظ بآخر viewport لكل تبويب.

---

# 6. التنقل الاحترافي

## 6.1 `NavigationHistory`

كل انتقال يحفظ:

```text
projectId
fileId
line
column
scrollX
scrollY
selectionStart
selectionEnd
symbolId
```

تتم إزالة العناصر المتطابقة المتتالية، ويعمل Back/Forward مثل محررات سطح المكتب.

## 6.2 تحديد عنصر في المحرر

عند لمس أو تحديد token:

```text
identify token range
→ classify symbol
→ show subtle highlight
→ enable context actions
```

قائمة الإجراءات:

```text
Go to Definition
Find References
Copy Symbol
Copy Descriptor
Rename Preview
Search Text
Open Resource
```

## 6.3 Go to Definition

```text
token
→ language resolver
→ local file symbols
→ project index
→ Android API index
→ resource/manifest index
→ open location
```

الأولوية:

1. تعريف داخل الملف.
2. نفس الوحدة.
3. نفس المشروع.
4. المكتبات المفهرسة.
5. Android API.

لا يعرض نتيجة مؤكدة عند وجود Dynamic/Reflection إلا مع علامة ثقة.

## 6.4 Go to Symbol

Popup خفيف يقرأ من الفهرس، ويبدأ بالبحث بعد كتابة prefix. يتم عرض النوع والمسار والسطر، ويمكن استخدام اختصار لوحة المفاتيح أو زر التنقل.

## 6.5 Find References

لا يقرأ المشروع كاملًا في كل مرة. يبحث في `CrossReferenceGraph`، ثم يجري scan نصيًا فقط للملفات التي لا يملك الفهرس معلومات عنها.

---

# 7. الاقتراحات السريعة

## 7.1 تحليل السياق

قبل البحث يحدد المحرر:

```text
Java: import/class/method/field/resource
XML: tag/attribute/namespace/resource
Manifest: component/permission/resource
Smali: directive/opcode/register/type
Gradle: plugin/dependency/property
```

## 7.2 مرحلتان للنتائج

### المرحلة الأولى: نتائج فورية

- كلمات الملف الحالي.
- registers أو labels المحلية.
- snippets.
- cache prefix.

### المرحلة الثانية: نتائج الفهرس

- classes.
- methods.
- resources.
- Android API.
- الرموز المستخدمة في المشروع.

تظهر المرحلة الأولى فورًا، وتضاف الثانية دون إغلاق popup.

## 7.3 إلغاء الطلبات

كل طلب completion يحمل `requestId` و`CancellationSignal`. إذا كتب المستخدم حرفًا جديدًا:

```text
cancel old request
increment requestId
start new request
ignore late result
```

## 7.4 ترتيب الاقتراحات

```text
exact prefix
same scope
same file
same module
same project
Android API
fuzzy fallback
```

## 7.5 عدم الإزعاج

- لا يفتح popup عند المسافة العادية إلا في سياق مفيد.
- لا يعرض نتائج غير مرتبطة.
- يدعم إغلاق popup بـ Escape/back.
- يضع cursor بعد النص المدخل بشكل صحيح.
- لا يعيد layout للمحرر كله عند تغيير الاقتراح.

---

# 8. البحث والاستبدال

## 8.1 `SearchCoordinator`

يدير البحث كعملية قابلة للإلغاء:

```text
normalize query
→ select candidate files
→ read chunks
→ scan
→ emit batches
→ update Bottom Draw
```

## 8.2 خصائص البحث

- current document.
- open documents.
- current module.
- whole project.
- file type filter.
- include/exclude folders.
- case sensitivity.
- whole word.
- regex.
- result preview.
- Next/Previous.
- Replace one.
- Replace all.

## 8.3 Replace All الآمن

```text
collect matches
→ preview changes
→ create undo transaction
→ write temp files
→ validate
→ commit atomically
```

لا يبدأ Replace All قبل عرض العدد والملفات المتأثرة.

---

# 9. Draw/Bottom Sheet كواجهة تنقل موحدة

## 9.1 السلوك

تنفذ كـ `BottomSheetBehavior` مع حالات:

```text
Collapsed
Half Expanded
Expanded
Hidden
```

وتستخدم `WindowInsetsCompat` حتى لا تتداخل مع لوحة المفاتيح أو navigation bar.

## 9.2 `BottomDrawController`

- فتح وإغلاق اللوحة.
- تغيير tab.
- حفظ الارتفاع.
- ربط النتائج بالمحرر.
- إرسال focus إلى Search أو Problems.
- منع فتح أكثر من لوحة متعارضة.

## 9.3 `ProblemsPanel`

- قائمة نتائج باستخدام `ListAdapter + DiffUtil`.
- grouping حسب الملف.
- فلترة severity.
- click-to-location.
- quick fix.
- تحديث دفعي.

## 9.4 `SearchPanel`

- استقبال batches.
- عرض progress وعدد النتائج.
- إلغاء البحث.
- فتح الملف والسطر.
- replace preview.

## 9.5 `ReferencesPanel`

- definition.
- usage.
- callers/callees.
- resource variant.
- confidence indicator.

## 9.6 `BuildOutputPanel`

- مراحل build.
- stdout/stderr.
- progress.
- زر إلغاء.
- زر نسخ السجل.
- parsing للرسائل وتحويلها إلى روابط للملفات.

## 9.7 `ChangesPanel`

يعرض قبل/بعد لكل تعديل:

```text
file
line
old value
new value
reason
confidence
status
```

## 9.8 تحسين سلاسة Draw

- لا تستبدل adapter كاملًا لكل نتيجة.
- استخدم DiffUtil.
- لا تفتح Activity جديدة لكل error.
- عند الضغط على النتيجة، يصغر Draw بدل إغلاقه إجباريًا.
- احفظ آخر tab والارتفاع في session.

---

# 10. حفظ الجلسة والاستعادة

## 10.1 Session metadata

```json
{
  "schema": 1,
  "projectId": "...",
  "activeTab": 0,
  "tabs": [
    {
      "path": "app/src/main/java/MainActivity.java",
      "line": 120,
      "column": 14,
      "scrollX": 0,
      "scrollY": 2180,
      "selectionStart": 100,
      "selectionEnd": 100,
      "folds": []
    }
  ],
  "drawerWidth": 300,
  "bottomPanelHeight": 260,
  "bottomPanelTab": "Problems",
  "theme": "system"
}
```

## 10.2 استعادة سريعة

```text
load tiny session metadata
→ show project shell
→ restore tabs as lightweight handles
→ open active tab viewport
→ restore remaining tabs lazily
→ validate file hashes
```

## 10.3 Crash recovery

كل dirty document له snapshot منفصل. لا تحفظ النص في JSON الرئيسي. عند التشغيل:

```text
detect incomplete marker
→ compare source/recovery hashes
→ show Restore/Discard/Diff
```

## 10.4 lifecycle

- `onPause`: جدولة save خفيف.
- `onStop`: كتابة session.
- `onTrimMemory`: إخلاء layout/token caches.
- `onSaveInstanceState`: حفظ identifiers فقط.
- process death: recovery من disk.

---

# 11. فتح المشاريع والملفات

## فتح المشروع

```text
create projectId
→ copy/attach URI
→ show root tree
→ scan metadata
→ restore session
→ index in background
```

## فتح الملف

```text
detect type
→ choose editor
→ read first chunk
→ render viewport
→ tokenize visible lines
→ schedule full symbol extraction
```

## فتح resource أو symbol من الشجرة

- فتح tab موجود إن كان مفتوحًا.
- عدم إنشاء نسخة tab ثانية.
- تغيير focus للرمز.
- حفظ نقطة الرجوع.
- إبقاء Draw اختياريًا ظاهرًا.

---

# 12. الأدوات الداخلية

## أدوات Android الحديثة

استخدم أحدث نسخ مستقرة متاحة وقت البناء من:

```text
AndroidX Activity
AndroidX Fragment
AndroidX Lifecycle
AndroidX AppCompat
Material Components
Room
WorkManager
WindowInsetsCompat
Activity Result API
```

يحدد `compileSdk` و`targetSdk` بأحدث إصدار مثبت في بيئة البناء، بينما يحدد `minSdk` بعد اختبار الأجهزة.

## أدوات المحرر

- Custom View/Canvas للـ viewport.
- `ListAdapter + DiffUtil` للنتائج.
- `RecyclerView` للشجرة واللوحات، مع عدم استخدام عنصر لكل سطر كود.
- `SavedStateHandle` للحالة الخفيفة.
- Room للفهرس والـ metadata.
- ExecutorService للمهام القصيرة.
- WorkManager للمهام التي يجب أن تستمر.
- OkHttp فقط للعمليات الشبكية المصرح بها.

## أدوات البناء

```text
AAPT/AAPT2
AIDL
Java compiler
Kotlin compiler عند الحاجة
D8/R8 حسب profile
packager/signer
```

تعمل في `BuildWorker` أو process مستقل مع output قابل للعرض والإلغاء.

---

# 13. الأداء والقياس

## أهداف قابلة للقياس

```text
إظهار أول viewport: < 250ms للملف المتوسط
cursor feedback: < 16–32ms
cached completion: < 100ms
فتح/طي Draw: < 100ms
إلغاء البحث: < 200ms
استعادة session metadata: < 300ms قبل القراءة الثقيلة
```

الأرقام أهداف benchmark وليست ضمانًا لكل جهاز.

## مؤشرات يجب تسجيلها محليًا

- first contentful viewport.
- editor input latency.
- scroll jank/FPS.
- completion latency.
- diagnostics latency.
- search first-result latency.
- session restore time.
- index duration.
- peak memory.
- cache hit rate.
- build cancel time.

## اختبارات الأداء

1. ملف 5,000 سطر.
2. ملف 50,000 سطر.
3. مشروع 10,000 ملف metadata.
4. 50 تبويبًا.
5. 10,000 نتيجة بحث.
6. 5,000 اقتراح رمز.
7. kill أثناء الحفظ.
8. low-memory callback.
9. تدوير الشاشة.
10. فتح مشروع من URI بطيء.

---

# 14. التعديل المطلوب في المشروع الآخر

ينفذ فريق التطوير الخطوات التالية:

1. استبدال محرر النص الحالي بـ `EditorHostView` مع viewport افتراضي.
2. نقل النص من String كامل إلى Piece Table أو Rope.
3. إضافة `LineIndex` مستقل.
4. إضافة token/layout caches بإصدارات وثيقة.
5. فصل completion والdiagnostics عن UI.
6. إنشاء `WorkspaceIndex` و`NavigationHistory`.
7. إضافة `SearchCoordinator` بنتائج streaming.
8. استبدال نافذة النتائج الحالية بـ Bottom Draw متعدد التبويبات.
9. إضافة session metadata وrecovery snapshots.
10. تشغيل الفهرسة والبناء عبر Workers/Services.
11. ربط Go to Definition وFind References بالفهرس.
12. إضافة DiffUtil للنتائج بدل إعادة رسم القوائم بالكامل.
13. إضافة قياسات benchmark ومراقبة الذاكرة.
14. اختبار دورة حياة Android وprocess death.
15. التأكد من أن package الجديد هو `com.kayaide.studio` وعدم نسخ package أو أسماء من المشروع المرجعي.

---

# 15. معايير القبول

يقبل التعديل عندما:

- يفتح الملف ويظهر viewport قبل اكتمال الفهرسة.
- يبقى الإدخال سلسًا أثناء tokenization.
- لا يعاد رسم الملف كاملًا عند تحريك المؤشر.
- يظهر الإكمال من النتائج المحلية بسرعة ثم يضيف نتائج الفهرس.
- يمكن إلغاء البحث والبناء فورًا تقريبًا.
- يفتح Go to Definition في نفس tab أو tab واحد غير مكرر.
- يعمل Back/Forward مع موضع المؤشر والتمرير.
- تعرض Draw النتائج على دفعات دون تقطيع.
- تحفظ session بعد إغلاق عادي أو process death.
- لا تضيع التعديلات بعد crash.
- لا ينفذ parsing أو I/O أو build على Main Thread.
- يعمل المشروع في low-memory mode مع تقليل caches.
- تظهر benchmark results قبل اعتماد الإصدار.

---

# 16. خلاصة الطلب

طبّق في المشروع الآخر محررًا مستقلًا بالحزمة:

```text
com.kayaide.studio
```

باستخدام الأساليب التالية:

```text
Piece Table/Rope
+ Line Index
+ Virtualized Code View
+ Incremental Tokenization
+ Contextual Completion
+ Workspace Symbol Index
+ Navigation History
+ Streaming Search
+ Bottom Draw Panels
+ DiffUtil Updates
+ Debounced Atomic Save
+ Recovery Snapshots
+ Session Metadata
+ Background Analysis
+ Isolated Build Worker
+ Room Metadata Cache
+ LRU Token/Layout Cache
+ Android Lifecycle Recovery
```

النتيجة المطلوبة ليست نسخ التطبيق المرجعي، بل محرر جديد مستقل يستفيد من حلول الأداء نفسها، بأسماء واضحة، واختبارات، وإعدادات قابلة للضبط، وسلوك آمن عند الفشل أو انخفاض الذاكرة.
