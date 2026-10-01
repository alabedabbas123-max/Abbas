# Abbas — مستودع مشروع KayPro

تطبيق أندرويد (بيئة تطوير متكاملة على الجهاز، مشتق من مصدر `Almlk` المستخرج).

**حزمة التطبيق المطلوبة: `com.almlkaide.kaypro`**

---

## ⚡ للحصول على APK قابل للتثبيت — خطوة واحدة

ضع **APK الأصلي** في مجلد `apk-input/` وادفعه إلى الفرع
`arena/01a0f4bf-abbas` (أو ارفعه من واجهة GitHub عبر *Add file → Upload files*).

> لا تريد رفع ملف كبير؟ ضع رابط تنزيل مباشر داخل `apk-input/SOURCE_URL.txt` بدلًا منه.

يعمل سير العمل [`apk-repackage.yml`](.github/workflows/apk-repackage.yml) تلقائيًا
فيغيّر هوية التطبيق إلى `com.almlkaide.kaypro` على مستوى الـ bytecode دون إعادة
ترجمة، ثم يُعيد البناء والتوقيع، وينشر الناتج في إصدار **`apk-latest`** جاهزًا
للتنزيل والتثبيت.

خطّ الأنابيب **مُختبَر ويعمل**: جُرّب كاملًا على تطبيق حقيقي (F-Droid) ونجحت كل
مراحله — فكّ، تعديل الهوية، إعادة بناء، محاذاة، توقيع، والتحقق من المعرّف بـ `aapt`.

### لماذا لا يُبنى من المصدر؟

`KayPro/` ليس شيفرة مصدرية كاملة بل **فكّ تجميع ناقص**. عشرة مكوّنات معلنة في
الـ Manifest — ومنها `MainActivity` و`PreferencesActivity` وعائلة `Run*Activity`
و`ExternalGitService` — **لا ملف مصدر لها إطلاقًا** في الأرشيف، إضافة إلى 15
تعارضًا بين اسم صنف واسم حزمة (قانوني في DEX، ممنوع في لغة Java).
التفاصيل والأدلّة في [`docs/ENGINE_RECOVERY.md`](docs/ENGINE_RECOVERY.md).

---

## بنية المستودع

| المسار | الوصف |
|---|---|
| `Almlk-gradle-source.zip` | **النسخة الاحتياطية الأصلية** — لا تُعدَّل إطلاقًا. |
| `backup/…sha256` | بصمة SHA-256 للتحقق من سلامة النسخة الاحتياطية. |
| `KayPro/` | **نسخة العمل** — مشروع Gradle، الحزمة مضبوطة على `com.almlkaide.kaypro`. |
| `apk-input/` | ضع هنا الـ APK الأصلي (أو رابطه) لإعادة التحزيم. |
| `tools/` | أدوات إصلاح مخرجات فكّ التجميع، وأداة إعادة تحزيم الـ APK. |
| `docs/AUDIT_REPORT.md` | تقرير الفحص الكامل للمشروع. |
| `docs/ENGINE_RECOVERY.md` | استعادة المحرّك: ما أُصلح، وما ثبت أنه مفقود. |
| `ci-reports/` | سجلّ آخر محاولة بناء، يُحدَّث تلقائيًا من CI. |

## الأدوات

| الأداة | الوظيفة |
|---|---|
| `tools/decompiler_prepass.py` | إصلاحات نصّية لمخرجات jadx (تعدادات، أنواع مجهولة، تعليقات رقمية…). |
| `tools/decompiler_repair.py` | إعادة بناء تدفّق التحكّم: `goto`/`Lnn:` ← حلقة توزيع على الكتل الأساسية. |
| `tools/decompiler_monitors.py` | `monitor-enter/exit` ← كتل `synchronized` حقيقية. |
| `tools/rewrite_manifest_package.py` | تغيير معرّف التطبيق في Manifest مع حماية أسماء الأصناف. |
| `tools/repackage_apk.sh` | إعادة تحزيم APK بهوية جديدة دون إعادة ترجمة. |

نتيجة الأدوات الثلاث الأولى: **6,621 / 6,621** ملف Java صالح نحويًا (كانت 4,701 / 6,619).

## حالة البناء من المصدر

- ✅ كل مراحل البناء قبل تجميع Java تنجح على CI (Manifest، الموارد، AAPT2،
  الأصول، المكتبات الأصلية، التوقيع).
- 🔴 `compileDebugJavaWithJavac` لا يمكن أن ينجح — المصدر ناقص. انظر
  [`KayPro/BUILD_STATUS.md`](KayPro/BUILD_STATUS.md).

## استعادة النسخة الاحتياطية

```bash
rm -rf KayPro
unzip Almlk-gradle-source.zip -d /tmp/restore
mv /tmp/restore/Almlk-isolated-project KayPro
```
