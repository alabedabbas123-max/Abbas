# error-tolerant build

- run: 36803043853
- commit: d254f666e743070d82d6a496af5e1d46d7b4986a
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
