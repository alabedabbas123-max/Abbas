# الاعتماديات الرسمية الخارجية

تُجلب الاعتماديات التالية من `google()` و`mavenCentral()` عبر `build.gradle` بدل تضمين مصادرها داخل المشروع:

- Android Support v4 `26.1.0`
- AppCompat v7 `26.1.0`
- RecyclerView v7 `26.1.0`
- AndroidX Annotation
- AndroidX Collection
- AndroidX Core
- AndroidX Fragment
- AndroidX Lifecycle Runtime
- AndroidX VersionedParcelable
- Google Play Install Referrer `2.2`
- Google Play Services Ads `17.2.1`
- Firebase Core `16.0.9`
- Firebase Instance ID `17.1.2`

احتُفظ بملفي واجهة Google Play Licensing IPC الصغيرين داخل `com.android.vending.licensing` لأنهما عقود Binder مطلوبة من المحرك القديم ولا توفرهما الاعتماديات المستخدمة بواجهة متوافقة مع هذا المصدر.

أما Crashlytics/Fabric وBaidu وxUtils وغيرها فهي ليست أجزاء من Android SDK الرسمي، لذلك لم تُحذف عشوائيًا في هذه المرحلة، خصوصًا أن المحرك المفكك يعتمد عليها مباشرة.
