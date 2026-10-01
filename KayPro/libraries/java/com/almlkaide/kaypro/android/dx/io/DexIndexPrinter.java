package com.almlkaide.kaypro.android.dx.io;

import com.almlkaide.kaypro.android.dex.Dex;
import com.almlkaide.kaypro.android.dex.ClassDef;
import com.almlkaide.kaypro.android.dex.FieldId;
import com.almlkaide.kaypro.android.dex.MethodId;
import com.almlkaide.kaypro.android.dex.ProtoId;
import com.almlkaide.kaypro.android.dex.TableOfContents;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public final class DexIndexPrinter {

    private final Dex f5032dex;
    private final TableOfContents tableOfContents;

    public DexIndexPrinter(File file) throws IOException {
        this.f5032dex = new Dex(file);
        this.tableOfContents = this.f5032dex.getTableOfContents();
    }

    private void printMap() {
        for (TableOfContents.Section section : this.tableOfContents.sections) {
            if (section.f4980off != -1) {
                System.out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("section ").append(Integer.toHexString(section.type)).toString()).append(" off=").toString()).append(Integer.toHexString(section.f4980off)).toString()).append(" size=").toString()).append(Integer.toHexString(section.size)).toString()).append(" byteCount=").toString()).append(Integer.toHexString(section.byteCount)).toString());
            }
        }
    }

    private void printStrings() throws IOException {
        int i = 0;
        Iterator<String> it = this.f5032dex.strings().iterator();
        while (it.hasNext()) {
            System.out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("string ").append(i).toString()).append(": ").toString()).append(it.next()).toString());
            i++;
        }
    }

    private void printTypeIds() throws IOException {
        int i = 0;
        Iterator<Integer> it = this.f5032dex.typeIds().iterator();
        while (it.hasNext()) {
            System.out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("type ").append(i).toString()).append(": ").toString()).append(this.f5032dex.strings().get(it.next().intValue())).toString());
            i++;
        }
    }

    private void printProtoIds() throws IOException {
        int i = 0;
        Iterator<ProtoId> it = this.f5032dex.protoIds().iterator();
        while (it.hasNext()) {
            System.out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("proto ").append(i).toString()).append(": ").toString()).append(it.next()).toString());
            i++;
        }
    }

    private void printFieldIds() throws IOException {
        int i = 0;
        Iterator<FieldId> it = this.f5032dex.fieldIds().iterator();
        while (it.hasNext()) {
            System.out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("field ").append(i).toString()).append(": ").toString()).append(it.next()).toString());
            i++;
        }
    }

    private void printMethodIds() throws IOException {
        int i = 0;
        Iterator<MethodId> it = this.f5032dex.methodIds().iterator();
        while (it.hasNext()) {
            System.out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("methodId ").append(i).toString()).append(": ").toString()).append(it.next()).toString());
            i++;
        }
    }

    private void printTypeLists() throws IOException {
        if (this.tableOfContents.typeLists.f4980off == -1) {
            System.out.println("No type lists");
            return;
        }
        Dex.Section sectionOpen = this.f5032dex.open(this.tableOfContents.typeLists.f4980off);
        for (int i = 0; i < this.tableOfContents.typeLists.size; i++) {
            int i2 = sectionOpen.readInt();
            System.out.print(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Type list i=").append(i).toString()).append(", size=").toString()).append(i2).toString()).append(", elements=").toString());
            for (int i3 = 0; i3 < i2; i3++) {
                System.out.print(new StringBuffer().append(" ").append(this.f5032dex.typeNames().get(sectionOpen.readShort())).toString());
            }
            if (i2 % 2 == 1) {
                sectionOpen.readShort();
            }
            System.out.println();
        }
    }

    private void printClassDefs() {
        int i = 0;
        Iterator<ClassDef> it = this.f5032dex.classDefs().iterator();
        while (it.hasNext()) {
            System.out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("class def ").append(i).toString()).append(": ").toString()).append(it.next()).toString());
            i++;
        }
    }

    public static void main(String[] strArr) throws IOException {
        DexIndexPrinter dexIndexPrinter = new DexIndexPrinter(new File(strArr[0]));
        dexIndexPrinter.printMap();
        dexIndexPrinter.printStrings();
        dexIndexPrinter.printTypeIds();
        dexIndexPrinter.printProtoIds();
        dexIndexPrinter.printFieldIds();
        dexIndexPrinter.printMethodIds();
        dexIndexPrinter.printTypeLists();
        dexIndexPrinter.printClassDefs();
    }
}
