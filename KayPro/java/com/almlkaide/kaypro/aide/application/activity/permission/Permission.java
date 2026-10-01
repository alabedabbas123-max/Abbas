package com.almlkaide.kaypro.aide.application.activity.permission;

import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import com.almlkaide.kaypro.util.Utils;

public class Permission implements Comparable<Permission> {
    private String describe;
    private PermissionInfo info;
    private String label;
    private String name;

    private PackageManager f4951pm;

    @Override
    public int compareTo(Permission permission) {
        return compareTo2(permission);
    }

    public Permission(PackageManager packageManager, String str) {
        this.f4951pm = packageManager;
        this.name = str;
        try {
            this.info = packageManager.getPermissionInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String getLabel() {
        CharSequence charSequenceLoadLabel;
        if (this.label != null) {
            return this.label;
        }
        if (this.info != null && (charSequenceLoadLabel = this.info.loadLabel(this.f4951pm)) != null && !charSequenceLoadLabel.toString().equals(getName())) {
            String string = charSequenceLoadLabel.toString();
            this.label = string;
            return string;
        }
        int iLastIndexOf = this.name.lastIndexOf(".");
        if (iLastIndexOf >= 0) {
            String strSubstring = this.name.substring(iLastIndexOf + 1);
            this.label = strSubstring;
            return strSubstring;
        }
        String str = this.name;
        this.label = str;
        return str;
    }

    public String getName() {
        return this.name;
    }

    public void setDescribe(String str) {
        this.describe = str;
    }

    public String getDescribe() {
        CharSequence charSequenceLoadDescription;
        if (this.describe != null) {
            return this.describe;
        }
        if (this.info != null && (charSequenceLoadDescription = this.info.loadDescription(this.f4951pm)) != null) {
            String string = charSequenceLoadDescription.toString();
            this.describe = string;
            return string;
        }
        String str = Utils.isCN() ? "没有描述" : "No description";
        this.describe = str;
        return str;
    }

    public int compareTo2(Permission permission) {
        return permission.getLabel().compareTo(getLabel());
    }
}
