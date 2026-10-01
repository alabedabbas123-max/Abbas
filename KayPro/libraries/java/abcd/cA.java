package abcd;

class cA implements abcd.InterfaceoA {
    cA() {
    }

    private abcd.Wz DW(org.json.JSONObject r10) {
        java.lang.String r2 = r10.getString("identifier");
        java.lang.String r3 = r10.getString("status");
        java.lang.String r4 = r10.getString("url");
        java.lang.String r5 = r10.getString("reports_url");
        java.lang.String r6 = r10.getString("ndk_reports_url");
        boolean r7 = r10.optBoolean("update_required", false);
        if (r10.has("icon") == true) goto L5;
    L7:
        abcd.Uz r11 = null;
    L9:
        return new abcd.Wz(r2, r3, r4, r5, r6, r7, r11);
    L5:
        if (r10.getJSONObject("icon").has("hash") == false) goto L7;
        r11 = v5(r10.getJSONObject("icon"));
        goto L9
    }

    private abcd.Yz FH(org.json.JSONObject r4) {
        return new abcd.Yz(r4.optString("update_endpoint", abcd.nA.j6), r4.optInt("update_suspend_duration", 3600));
    }

    private abcd.eA Hw(org.json.JSONObject r9) {
        return new abcd.eA(r9.optBoolean("prompt_enabled", false), r9.optBoolean("collect_logged_exceptions", true), r9.optBoolean("collect_reports", true), r9.optBoolean("collect_analytics", false), r9.optBoolean("firebase_crashlytics_enabled", false));
    }

    private abcd.hA VH(org.json.JSONObject r11) {
        return new abcd.hA(r11.optInt("log_buffer_size", 64000), r11.optInt("max_chained_exception_depth", 8), r11.optInt("max_custom_exception_events", 64), r11.optInt("max_custom_key_value_pairs", 64), r11.optInt("identifier_mask", 255), r11.optBoolean("send_session_without_crash", false), r11.optInt("max_complete_sessions_count", 4));
    }

    private abcd.gA Zo(org.json.JSONObject r11) {
        return new abcd.gA(r11.optString("title", "Send Crash Report?"), r11.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), r11.optString("send_button_title", "Send"), r11.optBoolean("show_cancel_button", true), r11.optString("cancel_button_title", "Don't Send"), r11.optBoolean("show_always_send_button", true), r11.optString("always_send_button_title", "Always Send"));
    }

    private long j6(io.fabric.sdk.android.services.common.k r5, long r6, org.json.JSONObject r8) {
        if (r8.has("expires_at") == true) goto L7;
        long r7 = r6 * 1000;
        return r7 + r5.j6();
    L7:
        return r8.getLong("expires_at");
    }

    private abcd.Tz j6(org.json.JSONObject r15) {
        return new abcd.Tz(r15.optString("url", "https://e.crashlytics.com/spi/v2/events"), r15.optInt("flush_interval_secs", 600), r15.optInt("max_byte_size_per_file", 8000), r15.optInt("max_file_count_per_send", 1), r15.optInt("max_pending_send_file_count", 100), r15.optBoolean("forward_to_google_analytics", false), r15.optBoolean("include_purchase_events_in_forwarded_events", false), r15.optBoolean("track_custom_events", true), r15.optBoolean("track_predefined_events", true), r15.optInt("sampling_rate", 1), r15.optBoolean("flush_on_background", true));
    }

    private abcd.Uz v5(org.json.JSONObject r4) {
        return new abcd.Uz(r4.getString("hash"), r4.getInt("width"), r4.getInt("height"));
    }

    @Override
    public abcd.mA j6(io.fabric.sdk.android.services.common.k r14, org.json.JSONObject r15) {
        int r11 = r15.optInt("settings_version", 0);
        int r12 = r15.optInt("cache_duration", 3600);
        return new abcd.mA(j6(r14, r12, r15), DW(r15.getJSONObject("app")), VH(r15.getJSONObject("session")), Zo(r15.getJSONObject("prompt")), Hw(r15.getJSONObject("features")), j6(r15.getJSONObject("analytics")), FH(r15.getJSONObject("beta")), r11, r12);
    }
}
