package com.appfour.backbone.api.define;

@android.support.annotation.Keep
public interface DefineHook {
    com.appfour.backbone.api.define.DefineHook onActivityCreate(com.appfour.backbone.api.closures.OnActivityClosure r1);

    com.appfour.backbone.api.define.DefineHook onActivityStart(com.appfour.backbone.api.closures.OnActivityClosure r1);

    com.appfour.backbone.api.define.DefineHook onActivityStop(com.appfour.backbone.api.closures.OnActivityClosure r1);

    com.appfour.backbone.api.define.DefineHook onApplicationCreate(com.appfour.backbone.api.closures.OnApplicationClosure r1);

    <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onClick(java.lang.Class<A> r1, int r2, com.appfour.backbone.api.closures.OnClickClosure<A> r3);

    com.appfour.backbone.api.define.DefineHook onCrash(com.appfour.backbone.api.closures.OnCrashClosure r1);

    <C> com.appfour.backbone.api.define.DefineHook onEnter(java.lang.Class<C> r1, java.lang.String r2, com.appfour.backbone.api.closures.OnEnterClosure0<C> r3);

    <C, T0> com.appfour.backbone.api.define.DefineHook onEnter(java.lang.Class<C> r1, java.lang.String r2, java.lang.Class<T0> r3, com.appfour.backbone.api.closures.OnEnterClosure1<C, T0> r4);

    <C, T0, T1> com.appfour.backbone.api.define.DefineHook onEnter(java.lang.Class<C> r1, java.lang.String r2, java.lang.Class<T0> r3, java.lang.Class<T1> r4, com.appfour.backbone.api.closures.OnEnterClosure2<C, T0, T1> r5);

    <C, T0, T1, T2> com.appfour.backbone.api.define.DefineHook onEnter(java.lang.Class<C> r1, java.lang.String r2, java.lang.Class<T0> r3, java.lang.Class<T1> r4, java.lang.Class<T2> r5, com.appfour.backbone.api.closures.OnEnterClosure3<C, T0, T1, T2> r6);

    <C, T0, T1, T2, T3> com.appfour.backbone.api.define.DefineHook onEnter(java.lang.Class<C> r1, java.lang.String r2, java.lang.Class<T0> r3, java.lang.Class<T1> r4, java.lang.Class<T2> r5, java.lang.Class<T3> r6, com.appfour.backbone.api.closures.OnEnterClosure4<C, T0, T1, T2, T3> r7);

    <C, T0, T1, T2, T3, T4> com.appfour.backbone.api.define.DefineHook onEnter(java.lang.Class<C> r1, java.lang.String r2, java.lang.Class<T0> r3, java.lang.Class<T1> r4, java.lang.Class<T2> r5, java.lang.Class<T3> r6, java.lang.Class<T4> r7, com.appfour.backbone.api.closures.OnEnterClosure5<C, T0, T1, T2, T3, T4> r8);

    <C, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(java.lang.Class<C> r1, java.lang.String r2, java.lang.Class<E> r3, com.appfour.backbone.api.closures.OnExceptionClosure0<C, E> r4);

    <C, T0, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(java.lang.Class<C> r1, java.lang.String r2, java.lang.Class<T0> r3, java.lang.Class<E> r4, com.appfour.backbone.api.closures.OnExceptionClosure1<C, E, T0> r5);

    <C, T0, T1, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(java.lang.Class<C> r1, java.lang.String r2, java.lang.Class<T0> r3, java.lang.Class<T1> r4, java.lang.Class<E> r5, com.appfour.backbone.api.closures.OnExceptionClosure2<C, E, T0, T1> r6);

    <C, T0, T1, T2, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(java.lang.Class<C> r1, java.lang.String r2, java.lang.Class<T0> r3, java.lang.Class<T1> r4, java.lang.Class<T2> r5, java.lang.Class<E> r6, com.appfour.backbone.api.closures.OnExceptionClosure3<C, E, T0, T1, T2> r7);

    <C, T0, T1, T2, T3, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(java.lang.Class<C> r1, java.lang.String r2, java.lang.Class<T0> r3, java.lang.Class<T1> r4, java.lang.Class<T2> r5, java.lang.Class<T3> r6, java.lang.Class<E> r7, com.appfour.backbone.api.closures.OnExceptionClosure4<C, E, T0, T1, T2, T3> r8);

    <C, T0, T1, T2, T3, T4, E extends java.lang.Throwable> com.appfour.backbone.api.define.DefineHook onExceptionIn(java.lang.Class<C> r1, java.lang.String r2, java.lang.Class<T0> r3, java.lang.Class<T1> r4, java.lang.Class<T2> r5, java.lang.Class<T3> r6, java.lang.Class<T4> r7, java.lang.Class<E> r8, com.appfour.backbone.api.closures.OnExceptionClosure5<C, E, T0, T1, T2, T3, T4> r9);

    com.appfour.backbone.api.define.DefineHook onInAppProductImpression(com.appfour.backbone.api.closures.OnInAppProductClosure r1);

    com.appfour.backbone.api.define.DefineHook onInAppProductPurchase(com.appfour.backbone.api.closures.OnInAppProductClosure r1);

    com.appfour.backbone.api.define.DefineHook onInput(com.appfour.backbone.api.closures.OnInputClosure r1);

    com.appfour.backbone.api.define.DefineHook onInstall(com.appfour.backbone.api.closures.OnMarketClosure r1);

    <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onItemClick(java.lang.Class<A> r1, int r2, com.appfour.backbone.api.closures.OnItemClickClosure<A> r3);

    <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onItemLongPress(java.lang.Class<A> r1, int r2, com.appfour.backbone.api.closures.OnItemClickClosure<A> r3);

    com.appfour.backbone.api.define.DefineHook onLaunch(com.appfour.backbone.api.closures.OnLaunchClosure r1);

    <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onLongPress(java.lang.Class<A> r1, int r2, com.appfour.backbone.api.closures.OnClickClosure<A> r3);

    <A extends android.app.Activity> com.appfour.backbone.api.define.DefineHook onMenuItemSelected(java.lang.Class<A> r1, int r2, com.appfour.backbone.api.closures.OnMenuItemSelectedClosure<A> r3);

    com.appfour.backbone.api.define.DefineHook onNewVersion(com.appfour.backbone.api.closures.OnVoidClosure r1);

    com.appfour.backbone.api.define.DefineHook onNotificationAction(com.appfour.backbone.api.closures.OnNotificationActionClosure r1);

    com.appfour.backbone.api.define.DefineHook onNotificationShown(com.appfour.backbone.api.closures.OnNotificationClosure r1);

    com.appfour.backbone.api.define.DefineHook onReferrerMarketClick(com.appfour.backbone.api.closures.OnMarketClosure r1);

    com.appfour.backbone.api.define.DefineHook onReferrerMarketImpression(com.appfour.backbone.api.closures.OnMarketImpressionClosure r1);

    com.appfour.backbone.api.define.DefineHook onTouch(com.appfour.backbone.api.closures.OnTouchClosure r1);

    com.appfour.backbone.api.define.DefineHook onUpdate(com.appfour.backbone.api.closures.OnVoidClosure r1);

    com.appfour.backbone.api.define.DefineHook onWindowHidden(com.appfour.backbone.api.closures.OnWindowClosure r1);

    com.appfour.backbone.api.define.DefineHook onWindowShown(com.appfour.backbone.api.closures.OnWindowClosure r1);
}
