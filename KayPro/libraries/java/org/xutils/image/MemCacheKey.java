package org.xutils.image;

final class MemCacheKey {
    public final ImageOptions options;

    public final String f6737url;

    public MemCacheKey(String str, ImageOptions imageOptions) {
        this.f6737url = str;
        this.options = imageOptions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemCacheKey memCacheKey = (MemCacheKey) obj;
        if (this.f6737url.equals(memCacheKey.f6737url)) {
            return this.options.equals(memCacheKey.options);
        }
        return false;
    }

    public int hashCode() {
        return (this.f6737url.hashCode() * 31) + this.options.hashCode();
    }

    public String toString() {
        return this.f6737url + this.options.toString();
    }
}
