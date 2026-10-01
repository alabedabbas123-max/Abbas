# error-tolerant build

- run: 36802057632
- commit: f8338e98249ff6640a00186411c6569cdad2cc75
- gradle outcome: success
- APK: KayPro/build/outputs/apk/debug/KayPro-debug.apk

## ECJ
```
ECJ: compiling 6622 sources -> /home/runner/work/Abbas/Abbas/KayPro/build/intermediates/javac/debug/classes
ECJ: 41 classpath entries, log -> /home/runner/work/Abbas/Abbas/KayPro/ecj-compileDebugJavaWithJavac.log
ECJ: exit=255, produced 8742 class files
Type mismatch: cannot convert from new DialogInterface.OnClickListener(){} to ColorPickerPreference
----------
32887 problems (32865 errors, 22 warnings)
```

## failing gradle tasks
```
```
package: name='com.almlkaide.kaypro' versionCode='100' versionName='3.3' platformBuildVersionName='13' platformBuildVersionCode='33' compileSdkVersion='33' compileSdkVersionCodename='13'
sdkVersion:'21'
targetSdkVersion:'28'
uses-permission: name='android.permission.WRITE_EXTERNAL_STORAGE'
