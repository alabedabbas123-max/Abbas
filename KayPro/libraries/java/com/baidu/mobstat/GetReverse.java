package com.baidu.mobstat;

import android.content.Context;

public class GetReverse {

    private static ICooperService f3920a;

    private GetReverse() {
    }

    public static ICooperService getCooperService(Context context) {
        if (f3920a == null) {
            f3920a = CooperService.instance();
        }
        return f3920a;
    }
}
