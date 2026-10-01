package com.almlkaide.kaypro.aide.project.jsonbean;

import java.util.List;

public class Category {
    private String describes;
    private String icon;
    private List<Templates> templates;
    private String title;

    public void setIcon(String str) {
        this.icon = str;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescribes(String str) {
        this.describes = str;
    }

    public String getDescribes() {
        return this.describes;
    }

    public void setTemplates(List<Templates> list) {
        this.templates = list;
    }

    public List<Templates> getTemplates() {
        return this.templates;
    }

    public static class Templates {
        private String describes;
        private String icon;
        private Project project;
        private String title;

        public void setIcon(String str) {
            this.icon = str;
        }

        public String getIcon() {
            return this.icon;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String getTitle() {
            return this.title;
        }

        public void setDescribes(String str) {
            this.describes = str;
        }

        public String getDescribes() {
            return this.describes;
        }

        public void setProject(Project project) {
            this.project = project;
        }

        public Project getProject() {
            return this.project;
        }
    }
}
