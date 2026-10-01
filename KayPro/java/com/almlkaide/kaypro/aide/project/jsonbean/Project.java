package com.almlkaide.kaypro.aide.project.jsonbean;

import java.util.List;

public class Project {
    public static final String ANDROID = "android";
    private String main;
    private boolean noPkg;
    private List<String> openFile;
    private List<String> replaces;
    private String template;
    private String type;

    public void setReplaces(List<String> list) {
        this.replaces = list;
    }

    public List<String> getReplaces() {
        return this.replaces;
    }

    public void setNoPkg(boolean z) {
        this.noPkg = z;
    }

    public boolean isNoPkg() {
        return this.noPkg;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }

    public void setMain(String str) {
        this.main = str;
    }

    public String getMain() {
        return this.main;
    }

    public void setTemplate(String str) {
        this.template = str;
    }

    public String getTemplate() {
        return this.template;
    }

    public void setOpenFile(List<String> list) {
        this.openFile = list;
    }

    public List<String> getOpenFile() {
        return this.openFile;
    }
}
