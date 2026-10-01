# بنية مشروع KayPro

## حزمة التطبيق

- حزمة التطبيق: `com.almlkaide.kaypro`
- مسار ملفات التطبيق: `java/com/almlkaide/kaypro`
- تم تحديث Manifest وJava وXML وملفات الإعداد النصية إلى المسار الجديد.

## فصل ملفات المشروع عن المكتبات

### ملفات المشروع — `java/`

يحتوي هذا المصدر على 187 ملف Java موزعة إلى:

- `com.almlkaide.kaypro`: التطبيق والميزات المخصصة.
- `com.almlkaide.kaypro.manifesteditor`: محرر Manifest والأدوات التابعة له.
- `com.almlkaide.kaypro.assetsmanager`: مدير ملفات assets.

تمت تسمية حزم محرر Manifest المموهة بأسماء واضحة مثل:

- `parser`
- `scanner`
- `proguard`
- `smali`
- `version`
- `colorpicker.widgets`

### المكتبات — `libraries/java/`

يحتوي هذا المصدر الآن على 6,432 ملف Java تابعًا للمحرك الأساسي والمكتبات غير المتاحة بعد كاعتماديات جاهزة. أزيلت مصادر Android Support وArchitecture Components وInstall Referrer وGoogle Ads المضمّنة، وأصبحت تُجلب رسميًا بواسطة Gradle.

يعتمد ملف البناء المسارين الآتيين كمصدري Java:

```text
java
libraries/java
```

## ملفات Android المرفقة

- `AndroidManifest.xml`
- `res/`
- `assets/`
- `jniLibs/`

لم تُحذف المكتبات المرتبطة، وإنما عُزلت عن كود المشروع للحفاظ على جميع المراجع والاعتماديات.

## التحقق

- جميع ملفات XML قابلة للتحليل.
- مسار كل ملف Java يطابق تعريف `package` بالنسبة إلى مصدره.
- لا توجد أسماء أو مسارات الحزمة السابقة في الملفات النصية.
- لا توجد رموز تمويه من نمط `GenClass`.
- لا توجد مجلدات حزم رقمية مولدة بواسطة JADX.
- تمت استعادة ملف `AdvancedSettingsActivity.java` المفقود ليتوافق مكوّن الإعدادات مع تعريفه في Manifest.

يوضح `source-sets.json` جذور المصادر والحزم الحالية بصورة قابلة للقراءة آليًا.
