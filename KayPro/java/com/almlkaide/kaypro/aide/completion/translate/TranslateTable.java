package com.almlkaide.kaypro.aide.completion.translate;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "zh")
public class TranslateTable {

    @Column(isId = true, name = "id")
    private int f4955id;

    @Column(name = "source")
    private String source;

    @Column(name = "state")
    private int state;

    @Column(name = "translation")
    private String translation;

    public void setId(int i) {
        this.f4955id = i;
    }

    public int getId() {
        return this.f4955id;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public String getSource() {
        return this.source;
    }

    public void setTranslation(String str) {
        this.translation = str;
    }

    public String getTranslation() {
        return this.translation;
    }

    public void setState(int i) {
        this.state = i;
    }

    public int getState() {
        return this.state;
    }
}
