# Abbas — مستودع مشروع KayPro

تطبيق أندرويد (بيئة تطوير متكاملة على الجهاز، مشتق من مصدر `Almlk` المستخرج).

## بنية المستودع

| المسار | الوصف |
|---|---|
| `Almlk-gradle-source.zip` | **النسخة الاحتياطية الأصلية** — لا تُعدَّل إطلاقًا. المصدر كما وصل قبل أي تغيير. |
| `backup/Almlk-gradle-source.zip.sha256` | بصمة SHA-256 للتحقق من سلامة النسخة الاحتياطية. |
| `KayPro/` | **نسخة العمل** — مشروع Gradle الذي يجري عليه التعديل والتطوير. |
| `docs/AUDIT_REPORT.md` | تقرير الفحص الكامل للمشروع وحالة البناء. |
| `.github/workflows/android-build.yml` | خط بناء APK على GitHub Actions. |

## حزمة التطبيق

```
com.almlkaide.kaypro
```

ضُبطت على: `namespace` و`applicationId` و`AndroidManifest.xml` وجميع حزم Java وملفات الموارد
وأسماء مزوّدي المحتوى والأذونات. التفاصيل في `KayPro/PACKAGE_RENAME.md`.

## استعادة النسخة الاحتياطية

```bash
rm -rf KayPro
unzip Almlk-gradle-source.zip -d /tmp/restore
mv /tmp/restore/Almlk-isolated-project KayPro
```

## البناء

```bash
cd KayPro
./gradlew assembleDebug
```

> ⚠️ راجع `docs/AUDIT_REPORT.md` — توجد عوائق معروفة في مصادر المحرك المفكوكة تمنع
> اكتمال `compileDebugJavaWithJavac` حتى الآن.
