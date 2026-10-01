package com.appfour.backbone.api.define;

@android.support.annotation.Keep
public interface DefineHookRuntime {
    <C> com.appfour.backbone.api.define.DefineHook onEnter(long r1, long r3, com.appfour.backbone.api.closures.OnEnterClosure0<C> r5);

    <C, T0> com.appfour.backbone.api.define.DefineHook onEnter(long r1, long r3, com.appfour.backbone.api.closures.OnEnterClosure1<C, T0> r5);

    <C, T0, T1> com.appfour.backbone.api.define.DefineHook onEnter(long r1, long r3, com.appfour.backbone.api.closures.OnEnterClosure2<C, T0, T1> r5);

    <C, T0, T1, T2> com.appfour.backbone.api.define.DefineHook onEnter(long r1, long r3, com.appfour.backbone.api.closures.OnEnterClosure3<C, T0, T1, T2> r5);

    <C, T0, T1, T2, T3> com.appfour.backbone.api.define.DefineHook onEnter(long r1, long r3, com.appfour.backbone.api.closures.OnEnterClosure4<C, T0, T1, T2, T3> r5);

    <C, T0, T1, T2, T3, T4> com.appfour.backbone.api.define.DefineHook onEnter(long r1, long r3, com.appfour.backbone.api.closures.OnEnterClosure5<C, T0, T1, T2, T3, T4> r5);

    <C, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(long r1, long r3, java.lang.Class<E> r5, long r6, com.appfour.backbone.api.closures.OnExceptionClosure0<C, E> r8);

    <C, T0, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(long r1, long r3, java.lang.Class<E> r5, long r6, com.appfour.backbone.api.closures.OnExceptionClosure1<C, E, T0> r8);

    <C, T0, T1, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(long r1, long r3, java.lang.Class<E> r5, long r6, com.appfour.backbone.api.closures.OnExceptionClosure2<C, E, T0, T1> r8);

    <C, T0, T1, T2, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(long r1, long r3, java.lang.Class<E> r5, long r6, com.appfour.backbone.api.closures.OnExceptionClosure3<C, E, T0, T1, T2> r8);

    <C, T0, T1, T2, T3, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(long r1, long r3, java.lang.Class<E> r5, long r6, com.appfour.backbone.api.closures.OnExceptionClosure4<C, E, T0, T1, T2, T3> r8);

    <C, T0, T1, T2, T3, T4, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(long r1, long r3, java.lang.Class<E> r5, long r6, com.appfour.backbone.api.closures.OnExceptionClosure5<C, E, T0, T1, T2, T3, T4> r8);
}
