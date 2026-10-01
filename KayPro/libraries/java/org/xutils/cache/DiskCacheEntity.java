package org.xutils.cache;

import com.baidu.mobstat.Config;
import java.util.Date;
import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "disk_cache")
public final class DiskCacheEntity {

    @Column(name = "bytesContent")
    private byte[] bytesContent;

    @Column(name = "etag")
    private String etag;

    @Column(name = "expires")
    private long expires = Long.MAX_VALUE;

    @Column(name = "hits")
    private long hits;

    @Column(isId = true, name = "id")
    private long f6720id;

    @Column(name = "key", property = "UNIQUE")
    private String f6721key;

    @Column(name = "lastAccess")
    private long lastAccess;

    @Column(name = "lastModify")
    private Date lastModify;

    @Column(name = Config.FEED_LIST_ITEM_PATH)
    private String path;

    @Column(name = "textContent")
    private String textContent;

    public long getId() {
        return this.f6720id;
    }

    public void setId(long j) {
        this.f6720id = j;
    }

    public String getKey() {
        return this.f6721key;
    }

    public void setKey(String str) {
        this.f6721key = str;
    }

    String getPath() {
        return this.path;
    }

    void setPath(String str) {
        this.path = str;
    }

    public String getTextContent() {
        return this.textContent;
    }

    public void setTextContent(String str) {
        this.textContent = str;
    }

    public byte[] getBytesContent() {
        return this.bytesContent;
    }

    public void setBytesContent(byte[] bArr) {
        this.bytesContent = bArr;
    }

    public long getExpires() {
        return this.expires;
    }

    public void setExpires(long j) {
        this.expires = j;
    }

    public String getEtag() {
        return this.etag;
    }

    public void setEtag(String str) {
        this.etag = str;
    }

    public long getHits() {
        return this.hits;
    }

    public void setHits(long j) {
        this.hits = j;
    }

    public Date getLastModify() {
        return this.lastModify;
    }

    public void setLastModify(Date date) {
        this.lastModify = date;
    }

    public long getLastAccess() {
        return this.lastAccess == 0 ? System.currentTimeMillis() : this.lastAccess;
    }

    public void setLastAccess(long j) {
        this.lastAccess = j;
    }
}
