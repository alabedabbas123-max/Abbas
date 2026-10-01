# assembleDebug report

- run: 36799382715
- commit: 1e34fee2c2f240424d019cae213a79a993f2f771
- result: failure

## error summary
```
  14747 error: cannot find symbol
   1339 error: reference to jN is ambiguous
    874 error: method does not override or implement a method from a supertype
    449 error: reference to ClassB is ambiguous
    362 error: reference to ClassK is ambiguous
    362 error: cannot assign a value to final variable jN
    328 error: return outside method
    295 error: method mNnil in class List<A#N> cannot be applied to given types;
    291 error: anonymous class implements interface; cannot have arguments
    276 error: reference to ClassI is ambiguous
    276 error: reference to ClassG is ambiguous
    254 error: reference to ClassC is ambiguous
    248 error: call to super must be first statement in constructor
    246 error: reference to ClassE is ambiguous
    245 error: reference to ClassA is ambiguous
    229 error: reference to ClassO is ambiguous
    225 error: constructor ClassN in class ClassN cannot be applied to given types;
    215 error: cannot assign a value to final variable DW
    204 error: annotation type not applicable to this kind of declaration
    187 error: reference to ClassL is ambiguous
    164 error: reference to ClassH is ambiguous
    164 error: cannot infer type arguments for ArrayList<>
    163 error: reference to a is ambiguous
    151 error: cannot assign a value to final variable FH
    150 error: fNa has private access in ClassC
    132 error: method mNof in class List<A#N> cannot be applied to given types;
    122 error: reference to ClassD is ambiguous
    121 error: cannot assign a value to final variable Hw
    118 error: cannot infer type arguments for ListBuffer<>
    111 error: illegal forward reference
     92 error: reference to ClassF is ambiguous
     91 error: cannot assign a value to final variable vN
     90 error: reference to ClassQ is ambiguous
     90 error: package com.google.common.collect does not exist
     89 error: reference to ClassU is ambiguous
     82 error: incompatible types: k cannot be converted to c
     82 error: cannot infer type arguments for HashMap<>
     81 error: method asList in class Arrays cannot be applied to given types;
     80 error: reference to ClassJ is ambiguous
     75 error: cannot assign a value to final variable Zo
```

## files with most errors
```
    872 /KayPro/libraries/java/org/c/a/a/c/c/a/b/ClassA.java
    743 /KayPro/libraries/java/abcd/dd$a.java
    709 /KayPro/libraries/java/org/c/a/a/c/a/a/c/ClassC.java
    508 /KayPro/libraries/java/org/c/a/a/c/c/a/b/ClassI.java
    492 /KayPro/libraries/java/a/g/ClassM.java
    338 /KayPro/libraries/java/a/b/e/ClassB.java
    331 /KayPro/libraries/java/a/b/c/ar.java
    301 /KayPro/libraries/java/org/c/a/a/c/c/a/b/ClassC.java
    281 /KayPro/libraries/java/org/c/a/a/c/a/a/c/ag.java
    262 /KayPro/libraries/java/abcd/oq.java
    234 /KayPro/libraries/java/a/b/e/ClassE.java
    230 /KayPro/libraries/java/com/a/b/c/b/ClassO.java
    228 /KayPro/libraries/java/com/a/b/d/ClassB.java
    211 /KayPro/libraries/java/org/c/a/a/c/e/a/a/ClassA.java
    207 /KayPro/libraries/java/abcd/gs.java
    199 /KayPro/libraries/java/a/b/g/ClassP.java
    197 /KayPro/libraries/java/a/i/ClassI.java
    188 /KayPro/libraries/java/org/c/a/a/b/d/Abstracta.java
    178 /KayPro/libraries/java/abcd/L.java
    173 /KayPro/libraries/java/com/sun/tools/javac/comp/Lower.java
    168 /KayPro/libraries/java/com/google/googlejavaformat/java/JavaInputAstVisitor.java
    167 /KayPro/libraries/java/com/aide/ui/views/CodeEditText.java
    162 /KayPro/libraries/java/org/c/a/a/c/a/a/c/ClassR.java
    152 /KayPro/libraries/java/a/ClassX.java
    137 /KayPro/libraries/java/a/b/c/ClassH.java
```

## last 150 log lines
```
                    j6().DW(th.getClass().getName() + ":" + th.getMessage());
                              ^
  symbol:   method getClass()
  location: variable th of type Throwable
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/GA.java:955: error: cannot find symbol
                    j6().DW(th.getClass().getName() + ":" + th.getMessage());
                              ^
  symbol:   method getClass()
  location: variable th of type Throwable
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/GA.java:985: error: cannot find symbol
                    j6().DW(th.getClass().getName() + ":" + th.getMessage());
                              ^
  symbol:   method getClass()
  location: variable th of type Throwable
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/GA.java:1008: error: cannot find symbol
                    j6().DW(th.getClass().getName() + ":" + th.getMessage());
                              ^
  symbol:   method getClass()
  location: variable th of type Throwable
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/xK.java:15: error: method does not override or implement a method from a supertype
    @Override
    ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/sr.java:18: error: reference to j6 is ambiguous
        j6(r3, r2);
        ^
  both method j6(_p,yr) in sr and method j6(Object,yr) in sr match
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/sr.java:28: error: reference to j6 is ambiguous
        j6(r1, (abcd._p) r2, r3, r4, r5);
        ^
  both method j6(hr.a,_p,int,int,yr) in sr and method j6(hr.a,Object,int,int,yr) in sr match
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/Xo.java:6: error: constructor AbstractGp in class AbstractGp cannot be applied to given types;
    public Xo(abcd.Wo r2) {
                          ^
  required: int,int
  found:    no arguments
  reason: actual and formal argument lists differ in length
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/Xo.java:12: error: call to super must be first statement in constructor
                    super(4, 4);
                         ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/Br.java:19: error: cannot assign a value to final variable j6
                    j6 = new byte[255];
                    ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/Br.java:120: error: return outside method
                    return;
                    ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/Br.java:123: error: return outside method
                    return;
                    ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/Vw.java:10: error: method does not override or implement a method from a supertype
    @Override
    ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/Vw.java:12: error: cannot find symbol
        org.apache.http.HttpEntity r7 = null;
                       ^
  symbol:   class HttpEntity
  location: package org.apache.http
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/Vw.java:13: error: cannot find symbol
        org.apache.http.Header r8 = null;
                       ^
  symbol:   class Header
  location: package org.apache.http
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/Vw.java:14: error: cannot find symbol
        org.apache.http.HeaderElement[] r9 = null;
                       ^
  symbol:   class HeaderElement
  location: package org.apache.http
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/abcd/Vw.java:38: error: d has private access in Ww
                    r5.setEntity(new abcd.Ww.d(r5.getEntity()));
                                            ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerDialog.java:51: error: anonymous class implements interface; cannot have arguments
        setButton(-1, getContext().getString(R.string.ok), new DialogInterface.OnClickListener(this) {
                                                                                               ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerDialog.java:55: error: incompatible types: <anonymous OnClickListener> cannot be converted to ColorPickerDialog
                this.this$0 = this;
                              ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerDialog.java:65: error: anonymous class implements interface; cannot have arguments
        setButton(-2, getContext().getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                                                                                                   ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerDialog.java:69: error: incompatible types: <anonymous OnClickListener> cannot be converted to ColorPickerDialog
                this.this$0 = this;
                              ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerDialog.java:89: error: anonymous class implements interface; cannot have arguments
        this.mHexVal.addTextChangedListener(new TextWatcher(this) {
                                                            ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerDialog.java:93: error: incompatible types: <anonymous TextWatcher> cannot be converted to ColorPickerDialog
                this.this$0 = this;
                              ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerDialog.java:125: error: anonymous class implements interface; cannot have arguments
        this.mHexVal.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                                                                                   ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerDialog.java:129: error: incompatible types: <anonymous OnEditorActionListener> cannot be converted to ColorPickerDialog
                this.this$0 = this;
                              ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerPreference.java:38: error: method does not override or implement a method from a supertype
            @Override
            ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerPreference.java:48: error: method does not override or implement a method from a supertype
            @Override
            ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerPreference.java:104: error: CUIDInfo is not public in DeviceId; cannot be accessed from outside package
            hexString = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString).toString();
                                                          ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerPreference.java:107: error: CUIDInfo is not public in DeviceId; cannot be accessed from outside package
            hexString2 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString2).toString();
                                                           ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerPreference.java:110: error: CUIDInfo is not public in DeviceId; cannot be accessed from outside package
            hexString3 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString3).toString();
                                                           ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerPreference.java:113: error: CUIDInfo is not public in DeviceId; cannot be accessed from outside package
            hexString4 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString4).toString();
                                                           ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerPreference.java:130: error: CUIDInfo is not public in DeviceId; cannot be accessed from outside package
            hexString = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString).toString();
                                                          ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerPreference.java:133: error: CUIDInfo is not public in DeviceId; cannot be accessed from outside package
            hexString2 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString2).toString();
                                                           ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerPreference.java:136: error: CUIDInfo is not public in DeviceId; cannot be accessed from outside package
            hexString3 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString3).toString();
                                                           ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerPreference.java:288: error: anonymous class implements interface; cannot have arguments
        this.mDialog.setButton(-3, "默认", new DialogInterface.OnClickListener(this) {
                                                                             ^
/home/runner/work/Abbas/Abbas/KayPro/libraries/java/net/margaritov/preference/colorpicker/ColorPickerPreference.java:292: error: incompatible types: <anonymous OnClickListener> cannot be converted to ColorPickerPreference
                this.this$0 = this;
                              ^
Note: Some input files use or override a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: Some input files use unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
32248 errors

> Task :compileDebugJavaWithJavac FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileDebugJavaWithJavac'.
> Compilation failed; see the compiler error output for details.

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 1m 16s
18 actionable tasks: 18 executed
```
