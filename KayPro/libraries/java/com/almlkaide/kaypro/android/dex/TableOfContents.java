package com.almlkaide.kaypro.android.dex;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public final class TableOfContents {
    public int apiLevel;
    public int checksum;
    public int dataOff;
    public int dataSize;
    public int fileSize;
    public int linkOff;
    public int linkSize;
    public final Section header = new Section(0);
    public final Section stringIds = new Section(1);
    public final Section typeIds = new Section(2);
    public final Section protoIds = new Section(3);
    public final Section fieldIds = new Section(4);
    public final Section methodIds = new Section(5);
    public final Section classDefs = new Section(6);
    public final Section callSiteIds = new Section(7);
    public final Section methodHandles = new Section(8);
    public final Section mapList = new Section(4096);
    public final Section typeLists = new Section(4097);
    public final Section annotationSetRefLists = new Section(4098);
    public final Section annotationSets = new Section(4099);
    public final Section classDatas = new Section(8192);
    public final Section codes = new Section(8193);
    public final Section stringDatas = new Section(8194);
    public final Section debugInfos = new Section(8195);
    public final Section annotations = new Section(8196);
    public final Section encodedArrays = new Section(8197);
    public final Section annotationsDirectories = new Section(8198);
    public final Section[] sections = {this.header, this.stringIds, this.typeIds, this.protoIds, this.fieldIds, this.methodIds, this.classDefs, this.mapList, this.callSiteIds, this.methodHandles, this.typeLists, this.annotationSetRefLists, this.annotationSets, this.classDatas, this.codes, this.stringDatas, this.debugInfos, this.annotations, this.encodedArrays, this.annotationsDirectories};
    public byte[] signature = new byte[20];

    public void readFrom(Dex c1679Dex) throws IOException {
        readHeader(c1679Dex.open(0));
        readMap(c1679Dex.open(this.mapList.f4980off));
        computeSizesFromOffsets();
    }

    private void readHeader(Dex.Section section) throws UnsupportedEncodingException {
        byte[] byteArray = section.readByteArray(8);
        if (!DexFormat.isSupportedDexMagic(byteArray)) {
            throw new DexException(String.format(new StringBuffer().append("Unexpected magic: [0x%02x, 0x%02x, 0x%02x, 0x%02x, ").append("0x%02x, 0x%02x, 0x%02x, 0x%02x]").toString(), new Byte(byteArray[0]), new Byte(byteArray[1]), new Byte(byteArray[2]), new Byte(byteArray[3]), new Byte(byteArray[4]), new Byte(byteArray[5]), new Byte(byteArray[6]), new Byte(byteArray[7])));
        }
        this.apiLevel = DexFormat.magicToApi(byteArray);
        this.checksum = section.readInt();
        this.signature = section.readByteArray(20);
        this.fileSize = section.readInt();
        int i = section.readInt();
        if (i != 112) {
            throw new DexException(new StringBuffer().append("Unexpected header: 0x").append(Integer.toHexString(i)).toString());
        }
        int i2 = section.readInt();
        if (i2 != 305419896) {
            throw new DexException(new StringBuffer().append("Unexpected endian tag: 0x").append(Integer.toHexString(i2)).toString());
        }
        this.linkSize = section.readInt();
        this.linkOff = section.readInt();
        this.mapList.f4980off = section.readInt();
        if (this.mapList.f4980off == 0) {
            throw new DexException("Cannot merge dex files that do not contain a map");
        }
        this.stringIds.size = section.readInt();
        this.stringIds.f4980off = section.readInt();
        this.typeIds.size = section.readInt();
        this.typeIds.f4980off = section.readInt();
        this.protoIds.size = section.readInt();
        this.protoIds.f4980off = section.readInt();
        this.fieldIds.size = section.readInt();
        this.fieldIds.f4980off = section.readInt();
        this.methodIds.size = section.readInt();
        this.methodIds.f4980off = section.readInt();
        this.classDefs.size = section.readInt();
        this.classDefs.f4980off = section.readInt();
        this.dataSize = section.readInt();
        this.dataOff = section.readInt();
    }

    private void readMap(Dex.Section section) throws IOException {
        int i = section.readInt();
        int i2 = 0;
        Section section2 = (Section) null;
        while (i2 < i) {
            short s = section.readShort();
            section.readShort();
            Section section3 = getSection(s);
            int i3 = section.readInt();
            int i4 = section.readInt();
            if ((section3.size != 0 && section3.size != i3) || (section3.f4980off != -1 && section3.f4980off != i4)) {
                throw new DexException(new StringBuffer().append("Unexpected map value for 0x").append(Integer.toHexString(s)).toString());
            }
            section3.size = i3;
            section3.f4980off = i4;
            if (section2 == null || section2.f4980off <= section3.f4980off) {
                i2++;
                section2 = section3;
            } else {
                throw new DexException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Map is unsorted at ").append(section2).toString()).append(", ").toString()).append(section3).toString());
            }
        }
        Arrays.sort(this.sections);
    }

    public void computeSizesFromOffsets() {
        int i = this.dataOff + this.dataSize;
        for (int length = this.sections.length - 1; length >= 0; length--) {
            Section section = this.sections[length];
            if (section.f4980off != -1) {
                if (section.f4980off > i) {
                    throw new DexException(new StringBuffer().append("Map is unsorted at ").append(section).toString());
                }
                section.byteCount = i - section.f4980off;
                i = section.f4980off;
            }
        }
    }

    private Section getSection(short s) {
        for (Section section : this.sections) {
            if (section.type == s) {
                return section;
            }
        }
        throw new IllegalArgumentException(new StringBuffer().append("No such map item: ").append((int) s).toString());
    }

    public void writeHeader(Dex.Section section, int i) throws IOException {
        section.write(DexFormat.apiToMagic(i).getBytes("UTF-8"));
        section.writeInt(this.checksum);
        section.write(this.signature);
        section.writeInt(this.fileSize);
        section.writeInt(112);
        section.writeInt(DexFormat.ENDIAN_TAG);
        section.writeInt(this.linkSize);
        section.writeInt(this.linkOff);
        section.writeInt(this.mapList.f4980off);
        section.writeInt(this.stringIds.size);
        section.writeInt(this.stringIds.f4980off);
        section.writeInt(this.typeIds.size);
        section.writeInt(this.typeIds.f4980off);
        section.writeInt(this.protoIds.size);
        section.writeInt(this.protoIds.f4980off);
        section.writeInt(this.fieldIds.size);
        section.writeInt(this.fieldIds.f4980off);
        section.writeInt(this.methodIds.size);
        section.writeInt(this.methodIds.f4980off);
        section.writeInt(this.classDefs.size);
        section.writeInt(this.classDefs.f4980off);
        section.writeInt(this.dataSize);
        section.writeInt(this.dataOff);
    }

    public void writeMap(Dex.Section section) throws IOException {
        int i = 0;
        for (Section section2 : this.sections) {
            if (section2.exists()) {
                i++;
            }
        }
        section.writeInt(i);
        for (Section section3 : this.sections) {
            if (section3.exists()) {
                section.writeShort(section3.type);
                section.writeShort((short) 0);
                section.writeInt(section3.size);
                section.writeInt(section3.f4980off);
            }
        }
    }

    public static class Section implements Comparable<Section> {
        public final short type;
        public int size = 0;

        public int f4980off = -1;
        public int byteCount = 0;

        @Override
        public int compareTo(Section section) {
            return compareTo2(section);
        }

        public Section(int i) {
            this.type = (short) i;
        }

        public boolean exists() {
            return this.size > 0;
        }

        public int compareTo2(Section section) {
            if (this.f4980off != section.f4980off) {
                return this.f4980off < section.f4980off ? -1 : 1;
            }
            return 0;
        }

        public String toString() {
            return String.format("Section[type=%#x,off=%#x,size=%#x]", new Short(this.type), new Integer(this.f4980off), new Integer(this.size));
        }
    }
}
