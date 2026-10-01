package com.almlkaide.kaypro.aide.builder;

public interface OnBuildListener {
    void onBuildCancel();

    void onBuildFailed();

    void onBuildSuccessful();
}
