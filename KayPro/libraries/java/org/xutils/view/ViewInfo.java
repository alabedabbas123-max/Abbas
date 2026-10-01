package org.xutils.view;

final class ViewInfo {
    public int parentId;
    public int value;

    ViewInfo() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) obj;
        return this.value == viewInfo.value && this.parentId == viewInfo.parentId;
    }

    public int hashCode() {
        return (this.value * 31) + this.parentId;
    }
}
