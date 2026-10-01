package com.almlkaide.kaypro.android.dx.merge;

import com.almlkaide.kaypro.android.dex.Annotation;
import com.almlkaide.kaypro.android.dex.Dex;
import com.almlkaide.kaypro.android.dex.CallSiteId;
import com.almlkaide.kaypro.android.dex.ClassData;
import com.almlkaide.kaypro.android.dex.ClassDef;
import com.almlkaide.kaypro.android.dex.Code;
import com.almlkaide.kaypro.android.dex.DexException;
import com.almlkaide.kaypro.android.dex.DexIndexOverflowException;
import com.almlkaide.kaypro.android.dex.FieldId;
import com.almlkaide.kaypro.android.dex.MethodHandle;
import com.almlkaide.kaypro.android.dex.MethodId;
import com.almlkaide.kaypro.android.dex.ProtoId;
import com.almlkaide.kaypro.android.dex.TableOfContents;
import com.almlkaide.kaypro.android.dex.TypeList;
import com.almlkaide.kaypro.android.dx.command.dexer.DxContext;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class DexMerger {
    private static final byte DBG_ADVANCE_LINE = 2;
    private static final byte DBG_ADVANCE_PC = 1;
    private static final byte DBG_END_LOCAL = 5;
    private static final byte DBG_END_SEQUENCE = 0;
    private static final byte DBG_RESTART_LOCAL = 6;
    private static final byte DBG_SET_EPILOGUE_BEGIN = 8;
    private static final byte DBG_SET_FILE = 9;
    private static final byte DBG_SET_PROLOGUE_END = 7;
    private static final byte DBG_START_LOCAL = 3;
    private static final byte DBG_START_LOCAL_EXTENDED = 4;
    private final Dex.Section annotationOut;
    private final Dex.Section annotationSetOut;
    private final Dex.Section annotationSetRefListOut;
    private final Dex.Section annotationsDirectoryOut;
    private final Dex.Section classDataOut;
    private final Dex.Section codeOut;
    private final CollisionPolicy collisionPolicy;
    private int compactWasteThreshold;
    private final TableOfContents contentsOut;
    private final DxContext context;
    private final Dex.Section debugInfoOut;
    private final Dex dexOut;
    private final Dex[] dexes;
    private final Dex.Section encodedArrayOut;
    private final Dex.Section headerOut;
    private final Dex.Section idsDefsOut;
    private final IndexMap[] indexMaps;
    private final InstructionTransformer instructionTransformer;
    private final Dex.Section mapListOut;
    private final Dex.Section stringDataOut;
    private final Dex.Section typeListOut;
    private final WriterSizes writerSizes;

    public DexMerger(Dex[] c1679DexArr, CollisionPolicy collisionPolicy, DxContext dxContext) throws IOException {
        this(c1679DexArr, collisionPolicy, dxContext, new WriterSizes(c1679DexArr));
    }

    DexMerger(Dex[] c1679DexArr, CollisionPolicy collisionPolicy, DxContext dxContext, WriterSizes writerSizes) throws IOException {
        this.compactWasteThreshold = 1048576;
        this.dexes = c1679DexArr;
        this.collisionPolicy = collisionPolicy;
        this.context = dxContext;
        this.writerSizes = writerSizes;
        this.dexOut = new Dex(writerSizes.size());
        this.indexMaps = new IndexMap[c1679DexArr.length];
        for (int i = 0; i < c1679DexArr.length; i++) {
            this.indexMaps[i] = new IndexMap(this.dexOut, c1679DexArr[i].getTableOfContents());
        }
        this.instructionTransformer = new InstructionTransformer();
        this.headerOut = this.dexOut.appendSection(writerSizes.header, "header");
        this.idsDefsOut = this.dexOut.appendSection(writerSizes.idsDefs, "ids defs");
        this.contentsOut = this.dexOut.getTableOfContents();
        this.contentsOut.dataOff = this.dexOut.getNextSectionStart();
        this.contentsOut.mapList.f4980off = this.dexOut.getNextSectionStart();
        this.contentsOut.mapList.size = 1;
        this.mapListOut = this.dexOut.appendSection(writerSizes.mapList, "map list");
        this.contentsOut.typeLists.f4980off = this.dexOut.getNextSectionStart();
        this.typeListOut = this.dexOut.appendSection(writerSizes.typeList, "type list");
        this.contentsOut.annotationSetRefLists.f4980off = this.dexOut.getNextSectionStart();
        this.annotationSetRefListOut = this.dexOut.appendSection(writerSizes.annotationsSetRefList, "annotation set ref list");
        this.contentsOut.annotationSets.f4980off = this.dexOut.getNextSectionStart();
        this.annotationSetOut = this.dexOut.appendSection(writerSizes.annotationsSet, "annotation sets");
        this.contentsOut.classDatas.f4980off = this.dexOut.getNextSectionStart();
        this.classDataOut = this.dexOut.appendSection(writerSizes.classData, "class data");
        this.contentsOut.codes.f4980off = this.dexOut.getNextSectionStart();
        this.codeOut = this.dexOut.appendSection(writerSizes.code, "code");
        this.contentsOut.stringDatas.f4980off = this.dexOut.getNextSectionStart();
        this.stringDataOut = this.dexOut.appendSection(writerSizes.stringData, "string data");
        this.contentsOut.debugInfos.f4980off = this.dexOut.getNextSectionStart();
        this.debugInfoOut = this.dexOut.appendSection(writerSizes.debugInfo, "debug info");
        this.contentsOut.annotations.f4980off = this.dexOut.getNextSectionStart();
        this.annotationOut = this.dexOut.appendSection(writerSizes.annotation, "annotation");
        this.contentsOut.encodedArrays.f4980off = this.dexOut.getNextSectionStart();
        this.encodedArrayOut = this.dexOut.appendSection(writerSizes.encodedArray, "encoded array");
        this.contentsOut.annotationsDirectories.f4980off = this.dexOut.getNextSectionStart();
        this.annotationsDirectoryOut = this.dexOut.appendSection(writerSizes.annotationsDirectory, "annotations directory");
        this.contentsOut.dataSize = this.dexOut.getNextSectionStart() - this.contentsOut.dataOff;
    }

    public void setCompactWasteThreshold(int i) {
        this.compactWasteThreshold = i;
    }

    private Dex mergeDexes() throws IOException {
        mergeStringIds();
        mergeTypeIds();
        mergeTypeLists();
        mergeProtoIds();
        mergeFieldIds();
        mergeMethodIds();
        mergeMethodHandles();
        mergeAnnotations();
        unionAnnotationSetsAndDirectories();
        mergeCallSiteIds();
        mergeClassDefs();
        Arrays.sort(this.contentsOut.sections);
        this.contentsOut.header.f4980off = 0;
        this.contentsOut.header.size = 1;
        this.contentsOut.fileSize = this.dexOut.getLength();
        this.contentsOut.computeSizesFromOffsets();
        this.contentsOut.writeHeader(this.headerOut, mergeApiLevels());
        this.contentsOut.writeMap(this.mapListOut);
        this.dexOut.writeHashes();
        return this.dexOut;
    }

    public Dex merge() throws IOException {
        if (this.dexes.length == 1) {
            return this.dexes[0];
        }
        if (this.dexes.length == 0) {
            return (Dex) null;
        }
        long jNanoTime = System.nanoTime();
        Dex c1679DexMergeDexes = mergeDexes();
        WriterSizes writerSizes = new WriterSizes(this);
        int size = this.writerSizes.size() - writerSizes.size();
        if (size > this.compactWasteThreshold) {
            c1679DexMergeDexes = new DexMerger(new Dex[]{this.dexOut, new Dex(0)}, CollisionPolicy.FAIL, this.context, writerSizes).mergeDexes();
            this.context.f5014out.printf("Result compacted from %.1fKiB to %.1fKiB to save %.1fKiB%n", new Float(this.dexOut.getLength() / 1024.0f), new Float(c1679DexMergeDexes.getLength() / 1024.0f), new Float(size / 1024.0f));
        }
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        for (int i = 0; i < this.dexes.length; i++) {
            this.context.f5014out.printf("Merged dex #%d (%d defs/%.1fKiB)%n", new Integer(i + 1), new Integer(this.dexes[i].getTableOfContents().classDefs.size), new Float(this.dexes[i].getLength() / 1024.0f));
        }
        this.context.f5014out.printf("Result is %d defs/%.1fKiB. Took %.1fs%n", new Integer(c1679DexMergeDexes.getTableOfContents().classDefs.size), new Float(c1679DexMergeDexes.getLength() / 1024.0f), new Float(jNanoTime2 / 1.0E9f));
        return c1679DexMergeDexes;
    }

    abstract class IdMerger<T extends Comparable<T>> {

        private final Dex.Section f5053out;
        private final DexMerger this$0;

        abstract TableOfContents.Section getSection(TableOfContents tableOfContents);

        abstract T read(Dex.Section section, IndexMap indexMap, int i);

        abstract void updateIndex(int i, IndexMap indexMap, int i2, int i3);

        abstract void write(T t);

        protected IdMerger(DexMerger dexMerger, Dex.Section section) {
            this.this$0 = dexMerger;
            this.f5053out = section;
        }

        public final void mergeSorted() {
            int i = 0;
            TableOfContents.Section[] sectionArr = new TableOfContents.Section[this.this$0.dexes.length];
            Dex.Section[] sectionArr2 = new Dex.Section[this.this$0.dexes.length];
            int[] iArr = new int[this.this$0.dexes.length];
            int[] iArr2 = new int[this.this$0.dexes.length];
            TreeMap<T, List<Integer>> treeMap = new TreeMap<>();
            for (int i2 = 0; i2 < this.this$0.dexes.length; i2++) {
                sectionArr[i2] = getSection(this.this$0.dexes[i2].getTableOfContents());
                sectionArr2[i2] = sectionArr[i2].exists() ? this.this$0.dexes[i2].open(sectionArr[i2].f4980off) : (Dex.Section) null;
                iArr[i2] = readIntoMap(sectionArr2[i2], sectionArr[i2], this.this$0.indexMaps[i2], iArr2[i2], treeMap, i2);
            }
            if (treeMap.isEmpty()) {
                getSection(this.this$0.contentsOut).f4980off = 0;
                getSection(this.this$0.contentsOut).size = 0;
                return;
            }
            getSection(this.this$0.contentsOut).f4980off = this.f5053out.getPosition();
            while (!treeMap.isEmpty()) {
                Map.Entry<T, List<Integer>> entryPollFirstEntry = treeMap.pollFirstEntry();
                Iterator<Integer> it = entryPollFirstEntry.getValue().iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    int i3 = iArr[iIntValue];
                    IndexMap indexMap = this.this$0.indexMaps[iIntValue];
                    int i4 = iArr2[iIntValue];
                    iArr2[iIntValue] = i4 + 1;
                    updateIndex(i3, indexMap, i4, i);
                    iArr[iIntValue] = readIntoMap(sectionArr2[iIntValue], sectionArr[iIntValue], this.this$0.indexMaps[iIntValue], iArr2[iIntValue], treeMap, iIntValue);
                }
                write(entryPollFirstEntry.getKey());
                i++;
            }
            getSection(this.this$0.contentsOut).size = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int readIntoMap(Dex.Section section, TableOfContents.Section section2, IndexMap indexMap, int i, TreeMap<T, List<Integer>> treeMap, int i2) {
            int position = section != null ? section.getPosition() : -1;
            if (i < section2.size) {
                Comparable comparable = read(section, indexMap, i);
                List arrayList = (List) treeMap.get(comparable);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    treeMap.put(comparable, arrayList);
                }
                arrayList.add(new Integer(i2));
            }
            return position;
        }

        public final void mergeUnsorted() {
            int i = 0;
            getSection(this.this$0.contentsOut).f4980off = this.f5053out.getPosition();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.this$0.dexes.length; i2++) {
                arrayList.addAll(readUnsortedValues(this.this$0.dexes[i2], this.this$0.indexMaps[i2]));
            }
            if (arrayList.isEmpty()) {
                getSection(this.this$0.contentsOut).f4980off = 0;
                getSection(this.this$0.contentsOut).size = 0;
                return;
            }
            Collections.sort(arrayList);
            int i3 = 0;
            while (true) {
                int i4 = i;
                if (i3 < arrayList.size()) {
                    int i5 = i3 + 1;
                    UnsortedValue unsortedValue = (UnsortedValue) arrayList.get(i3);
                    updateIndex(unsortedValue.offset, unsortedValue.indexMap, unsortedValue.index, i4 - 1);
                    while (i5 < arrayList.size() && unsortedValue.compareTo((UnsortedValue) arrayList.get(i5)) == 0) {
                        UnsortedValue unsortedValue2 = (UnsortedValue) arrayList.get(i5);
                        updateIndex(unsortedValue2.offset, unsortedValue2.indexMap, unsortedValue2.index, i4 - 1);
                        i5++;
                    }
                    write(unsortedValue.value);
                    i = i4 + 1;
                    i3 = i5;
                } else {
                    getSection(this.this$0.contentsOut).size = i4;
                    return;
                }
            }
        }

        /* JADX WARN: Failed to parse method signature: (Lcom/almlkaide/kaypro/android/dex/Dex;Lcom/almlkaide/kaypro/android/dx/merge/IndexMap;)Ljava/util/List<Lcom/almlkaide/kaypro/android/dx/merge/DexMerger;.Lcom/almlkaide/kaypro/android/dx/merge/DexMerger$IdMerger<TT;>;.Lcom/almlkaide/kaypro/android/dx/merge/DexMerger$IdMerger$UnsortedValue;>;
        jadx.core.utils.exceptions.JadxRuntimeException: Unknown type char: '.' (0x2e)
        	at jadx.core.dex.instructions.args.ArgType.parse(ArgType.java:784)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:163)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeGenericArgs(SignatureParser.java:262)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeObjectType(SignatureParser.java:220)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:137)
        	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:188)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:40)
         */
        private List readUnsortedValues(Dex c1679Dex, IndexMap indexMap) {
            TableOfContents.Section section = getSection(c1679Dex.getTableOfContents());
            if (!section.exists()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Dex.Section sectionOpen = c1679Dex.open(section.f4980off);
            for (int i = 0; i < section.size; i++) {
                arrayList.add(new UnsortedValue(this, c1679Dex, indexMap, read(sectionOpen, indexMap, 0), i, sectionOpen.getPosition()));
            }
            return arrayList;
        }

        /* JADX WARN: Failed to parse class signature: Ljava/lang/Object;Ljava/lang/Comparable<Lcom/almlkaide/kaypro/android/dx/merge/DexMerger;.Lcom/almlkaide/kaypro/android/dx/merge/DexMerger$IdMerger<TT;>;.Lcom/almlkaide/kaypro/android/dx/merge/DexMerger$IdMerger$UnsortedValue;>;
        jadx.core.utils.exceptions.JadxRuntimeException: Unknown type char: '.' (0x2e)
        	at jadx.core.dex.instructions.args.ArgType.parse(ArgType.java:784)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:163)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeGenericArgs(SignatureParser.java:262)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeObjectType(SignatureParser.java:220)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:137)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeTypeList(SignatureParser.java:175)
        	at jadx.core.dex.visitors.SignatureProcessor.parseClassSignature(SignatureProcessor.java:53)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:35)
         */
        class UnsortedValue implements Comparable {
            final int index;
            final IndexMap indexMap;
            final int offset;
            final Dex source;
            private final IdMerger this$0;
            final T value;

            @Override
            public int compareTo(Object obj) {
                return compareTo((UnsortedValue) obj);
            }

            UnsortedValue(IdMerger idMerger, Dex c1679Dex, IndexMap indexMap, T t, int i, int i2) {
                this.this$0 = idMerger;
                this.source = c1679Dex;
                this.indexMap = indexMap;
                this.value = t;
                this.index = i;
                this.offset = i2;
            }

            /* JADX WARN: Failed to parse method signature: (Lcom/almlkaide/kaypro/android/dx/merge/DexMerger;.Lcom/almlkaide/kaypro/android/dx/merge/DexMerger$IdMerger<TT;>;.Lcom/almlkaide/kaypro/android/dx/merge/DexMerger$IdMerger$UnsortedValue;)I
            jadx.core.utils.exceptions.JadxRuntimeException: Unknown type char: '.' (0x2e)
            	at jadx.core.dex.instructions.args.ArgType.parse(ArgType.java:784)
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:163)
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:336)
            	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:187)
            	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:40)
             */
            public int compareTo(UnsortedValue unsortedValue) {
                return this.value.compareTo(unsortedValue.value);
            }
        }
    }

    private int mergeApiLevels() {
        int i = -1;
        for (int i2 = 0; i2 < this.dexes.length; i2++) {
            int i3 = this.dexes[i2].getTableOfContents().apiLevel;
            if (i < i3) {
                i = i3;
            }
        }
        return i;
    }

    private void mergeStringIds() {
        new IdMerger(this, this, this.idsDefsOut) {
            private final DexMerger this$0;

            {
                this.this$0 = this;
            }

            @Override
            Comparable read(Dex.Section section, IndexMap indexMap, int i) {
                return read(section, indexMap, i);
            }

            @Override
            void write(Comparable comparable) {
                write((String) comparable);
            }

            @Override
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.stringIds;
            }

            @Override
            String read(Dex.Section section, IndexMap indexMap, int i) {
                return section.readString();
            }

            @Override
            void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.stringIds[i2] = i3;
            }

            void write(String str) {
                this.this$0.contentsOut.stringDatas.size++;
                this.this$0.idsDefsOut.writeInt(this.this$0.stringDataOut.getPosition());
                this.this$0.stringDataOut.writeStringData(str);
            }
        }.mergeSorted();
    }

    private void mergeTypeIds() {
        new IdMerger(this, this, this.idsDefsOut) {
            private final DexMerger this$0;

            {
                this.this$0 = this;
            }

            @Override
            Comparable read(Dex.Section section, IndexMap indexMap, int i) {
                return read(section, indexMap, i);
            }

            @Override
            void write(Comparable comparable) {
                write((Integer) comparable);
            }

            @Override
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.typeIds;
            }

            @Override
            Integer read(Dex.Section section, IndexMap indexMap, int i) {
                return new Integer(indexMap.adjustString(section.readInt()));
            }

            @Override
            void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(new StringBuffer().append("type ID not in [0, 0xffff]: ").append(i3).toString());
                }
                indexMap.typeIds[i2] = (short) i3;
            }

            void write(Integer num) {
                this.this$0.idsDefsOut.writeInt(num.intValue());
            }
        }.mergeSorted();
    }

    private void mergeTypeLists() {
        new IdMerger(this, this, this.typeListOut) {
            private final DexMerger this$0;

            {
                this.this$0 = this;
            }

            @Override
            Comparable read(Dex.Section section, IndexMap indexMap, int i) {
                return read(section, indexMap, i);
            }

            @Override
            void write(Comparable comparable) {
                write((TypeList) comparable);
            }

            @Override
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.typeLists;
            }

            @Override
            TypeList read(Dex.Section section, IndexMap indexMap, int i) {
                return indexMap.adjustTypeList(section.readTypeList());
            }

            @Override
            void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.putTypeListOffset(i, this.this$0.typeListOut.getPosition());
            }

            void write(TypeList typeList) {
                this.this$0.typeListOut.writeTypeList(typeList);
            }
        }.mergeUnsorted();
    }

    private void mergeProtoIds() {
        new IdMerger(this, this, this.idsDefsOut) {
            private final DexMerger this$0;

            {
                this.this$0 = this;
            }

            @Override
            Comparable read(Dex.Section section, IndexMap indexMap, int i) {
                return read(section, indexMap, i);
            }

            @Override
            void write(Comparable comparable) {
                write((ProtoId) comparable);
            }

            @Override
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.protoIds;
            }

            @Override
            ProtoId read(Dex.Section section, IndexMap indexMap, int i) {
                return indexMap.adjust(section.readProtoId());
            }

            @Override
            void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(new StringBuffer().append("proto ID not in [0, 0xffff]: ").append(i3).toString());
                }
                indexMap.protoIds[i2] = (short) i3;
            }

            void write(ProtoId protoId) {
                protoId.writeTo(this.this$0.idsDefsOut);
            }
        }.mergeSorted();
    }

    private void mergeCallSiteIds() {
        new IdMerger(this, this, this.idsDefsOut) {
            private final DexMerger this$0;

            {
                this.this$0 = this;
            }

            @Override
            Comparable read(Dex.Section section, IndexMap indexMap, int i) {
                return read(section, indexMap, i);
            }

            @Override
            void write(Comparable comparable) {
                write((CallSiteId) comparable);
            }

            @Override
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.callSiteIds;
            }

            @Override
            CallSiteId read(Dex.Section section, IndexMap indexMap, int i) {
                return indexMap.adjust(section.readCallSiteId());
            }

            @Override
            void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.callSiteIds[i2] = i3;
            }

            void write(CallSiteId callSiteId) {
                callSiteId.writeTo(this.this$0.idsDefsOut);
            }
        }.mergeSorted();
    }

    private void mergeMethodHandles() {
        new IdMerger(this, this, this.idsDefsOut) {
            private final DexMerger this$0;

            {
                this.this$0 = this;
            }

            @Override
            Comparable read(Dex.Section section, IndexMap indexMap, int i) {
                return read(section, indexMap, i);
            }

            @Override
            void write(Comparable comparable) {
                write((MethodHandle) comparable);
            }

            @Override
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.methodHandles;
            }

            @Override
            MethodHandle read(Dex.Section section, IndexMap indexMap, int i) {
                return indexMap.adjust(section.readMethodHandle());
            }

            @Override
            void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.methodHandleIds.put(new Integer(i2), new Integer(indexMap.methodHandleIds.size()));
            }

            void write(MethodHandle methodHandle) {
                methodHandle.writeTo(this.this$0.idsDefsOut);
            }
        }.mergeUnsorted();
    }

    private void mergeFieldIds() {
        new IdMerger(this, this, this.idsDefsOut) {
            private final DexMerger this$0;

            {
                this.this$0 = this;
            }

            @Override
            Comparable read(Dex.Section section, IndexMap indexMap, int i) {
                return read(section, indexMap, i);
            }

            @Override
            void write(Comparable comparable) {
                write((FieldId) comparable);
            }

            @Override
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.fieldIds;
            }

            @Override
            FieldId read(Dex.Section section, IndexMap indexMap, int i) {
                return indexMap.adjust(section.readFieldId());
            }

            @Override
            void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(new StringBuffer().append("field ID not in [0, 0xffff]: ").append(i3).toString());
                }
                indexMap.fieldIds[i2] = (short) i3;
            }

            void write(FieldId fieldId) {
                fieldId.writeTo(this.this$0.idsDefsOut);
            }
        }.mergeSorted();
    }

    private void mergeMethodIds() {
        new IdMerger(this, this, this.idsDefsOut) {
            private final DexMerger this$0;

            {
                this.this$0 = this;
            }

            @Override
            Comparable read(Dex.Section section, IndexMap indexMap, int i) {
                return read(section, indexMap, i);
            }

            @Override
            void write(Comparable comparable) {
                write((MethodId) comparable);
            }

            @Override
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.methodIds;
            }

            @Override
            MethodId read(Dex.Section section, IndexMap indexMap, int i) {
                return indexMap.adjust(section.readMethodId());
            }

            @Override
            void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                if (i3 < 0 || i3 > 65535) {
                    throw new DexIndexOverflowException(new StringBuffer().append("method ID not in [0, 0xffff]: ").append(i3).toString());
                }
                indexMap.methodIds[i2] = (short) i3;
            }

            void write(MethodId methodId) {
                methodId.writeTo(this.this$0.idsDefsOut);
            }
        }.mergeSorted();
    }

    private void mergeAnnotations() {
        new IdMerger(this, this, this.annotationOut) {
            private final DexMerger this$0;

            {
                this.this$0 = this;
            }

            @Override
            Comparable read(Dex.Section section, IndexMap indexMap, int i) {
                return read(section, indexMap, i);
            }

            @Override
            void write(Comparable comparable) {
                write((Annotation) comparable);
            }

            @Override
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.annotations;
            }

            @Override
            Annotation read(Dex.Section section, IndexMap indexMap, int i) {
                return indexMap.adjust(section.readAnnotation());
            }

            @Override
            void updateIndex(int i, IndexMap indexMap, int i2, int i3) {
                indexMap.putAnnotationOffset(i, this.this$0.annotationOut.getPosition());
            }

            void write(Annotation annotation) {
                annotation.writeTo(this.this$0.annotationOut);
            }
        }.mergeUnsorted();
    }

    private void mergeClassDefs() {
        SortableType[] sortedTypes = getSortedTypes();
        this.contentsOut.classDefs.f4980off = this.idsDefsOut.getPosition();
        this.contentsOut.classDefs.size = sortedTypes.length;
        for (SortableType sortableType : sortedTypes) {
            transformClassDef(sortableType.getDex(), sortableType.getClassDef(), sortableType.getIndexMap());
        }
    }

    private SortableType[] getSortedTypes() {
        boolean zTryAssignDepth;
        SortableType[] sortableTypeArr = new SortableType[this.contentsOut.typeIds.size];
        for (int i = 0; i < this.dexes.length; i++) {
            readSortableTypes(sortableTypeArr, this.dexes[i], this.indexMaps[i]);
        }
        do {
            zTryAssignDepth = true;
            for (SortableType sortableType : sortableTypeArr) {
                if (sortableType != null && !sortableType.isDepthAssigned()) {
                    zTryAssignDepth &= sortableType.tryAssignDepth(sortableTypeArr);
                }
            }
        } while (!zTryAssignDepth);
        Arrays.sort(sortableTypeArr, SortableType.NULLS_LAST_ORDER);
        int iIndexOf = Arrays.asList(sortableTypeArr).indexOf((Object) null);
        return iIndexOf != -1 ? (SortableType[]) Arrays.copyOfRange(sortableTypeArr, 0, iIndexOf) : sortableTypeArr;
    }

    private void readSortableTypes(SortableType[] sortableTypeArr, Dex c1679Dex, IndexMap indexMap) {
        for (ClassDef classDef : c1679Dex.classDefs()) {
            SortableType sortableTypeAdjust = indexMap.adjust(new SortableType(c1679Dex, indexMap, classDef));
            int typeIndex = sortableTypeAdjust.getTypeIndex();
            if (sortableTypeArr[typeIndex] == null) {
                sortableTypeArr[typeIndex] = sortableTypeAdjust;
            } else if (this.collisionPolicy != CollisionPolicy.KEEP_FIRST) {
                throw new DexException(new StringBuffer().append("Multiple dex files define ").append(c1679Dex.typeNames().get(classDef.getTypeIndex())).toString());
            }
        }
    }

    private void unionAnnotationSetsAndDirectories() {
        for (int i = 0; i < this.dexes.length; i++) {
            transformAnnotationSets(this.dexes[i], this.indexMaps[i]);
        }
        for (int i2 = 0; i2 < this.dexes.length; i2++) {
            transformAnnotationSetRefLists(this.dexes[i2], this.indexMaps[i2]);
        }
        for (int i3 = 0; i3 < this.dexes.length; i3++) {
            transformAnnotationDirectories(this.dexes[i3], this.indexMaps[i3]);
        }
        for (int i4 = 0; i4 < this.dexes.length; i4++) {
            transformStaticValues(this.dexes[i4], this.indexMaps[i4]);
        }
    }

    private void transformAnnotationSets(Dex c1679Dex, IndexMap indexMap) {
        TableOfContents.Section section = c1679Dex.getTableOfContents().annotationSets;
        if (section.exists()) {
            Dex.Section sectionOpen = c1679Dex.open(section.f4980off);
            for (int i = 0; i < section.size; i++) {
                transformAnnotationSet(indexMap, sectionOpen);
            }
        }
    }

    private void transformAnnotationSetRefLists(Dex c1679Dex, IndexMap indexMap) {
        TableOfContents.Section section = c1679Dex.getTableOfContents().annotationSetRefLists;
        if (section.exists()) {
            Dex.Section sectionOpen = c1679Dex.open(section.f4980off);
            for (int i = 0; i < section.size; i++) {
                transformAnnotationSetRefList(indexMap, sectionOpen);
            }
        }
    }

    private void transformAnnotationDirectories(Dex c1679Dex, IndexMap indexMap) {
        TableOfContents.Section section = c1679Dex.getTableOfContents().annotationsDirectories;
        if (section.exists()) {
            Dex.Section sectionOpen = c1679Dex.open(section.f4980off);
            for (int i = 0; i < section.size; i++) {
                transformAnnotationDirectory(sectionOpen, indexMap);
            }
        }
    }

    private void transformStaticValues(Dex c1679Dex, IndexMap indexMap) {
        TableOfContents.Section section = c1679Dex.getTableOfContents().encodedArrays;
        if (section.exists()) {
            Dex.Section sectionOpen = c1679Dex.open(section.f4980off);
            for (int i = 0; i < section.size; i++) {
                transformStaticValues(sectionOpen, indexMap);
            }
        }
    }

    private void transformClassDef(Dex c1679Dex, ClassDef classDef, IndexMap indexMap) {
        this.idsDefsOut.assertFourByteAligned();
        this.idsDefsOut.writeInt(classDef.getTypeIndex());
        this.idsDefsOut.writeInt(classDef.getAccessFlags());
        this.idsDefsOut.writeInt(classDef.getSupertypeIndex());
        this.idsDefsOut.writeInt(classDef.getInterfacesOffset());
        this.idsDefsOut.writeInt(indexMap.adjustString(classDef.getSourceFileIndex()));
        this.idsDefsOut.writeInt(indexMap.adjustAnnotationDirectory(classDef.getAnnotationsOffset()));
        if (classDef.getClassDataOffset() == 0) {
            this.idsDefsOut.writeInt(0);
        } else {
            this.idsDefsOut.writeInt(this.classDataOut.getPosition());
            transformClassData(c1679Dex, c1679Dex.readClassData(classDef), indexMap);
        }
        this.idsDefsOut.writeInt(indexMap.adjustEncodedArray(classDef.getStaticValuesOffset()));
    }

    private void transformAnnotationDirectory(Dex.Section section, IndexMap indexMap) {
        this.contentsOut.annotationsDirectories.size++;
        this.annotationsDirectoryOut.assertFourByteAligned();
        indexMap.putAnnotationDirectoryOffset(section.getPosition(), this.annotationsDirectoryOut.getPosition());
        this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSet(section.readInt()));
        int i = section.readInt();
        this.annotationsDirectoryOut.writeInt(i);
        int i2 = section.readInt();
        this.annotationsDirectoryOut.writeInt(i2);
        int i3 = section.readInt();
        this.annotationsDirectoryOut.writeInt(i3);
        for (int i4 = 0; i4 < i; i4++) {
            this.annotationsDirectoryOut.writeInt(indexMap.adjustField(section.readInt()));
            this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSet(section.readInt()));
        }
        for (int i5 = 0; i5 < i2; i5++) {
            this.annotationsDirectoryOut.writeInt(indexMap.adjustMethod(section.readInt()));
            this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSet(section.readInt()));
        }
        for (int i6 = 0; i6 < i3; i6++) {
            this.annotationsDirectoryOut.writeInt(indexMap.adjustMethod(section.readInt()));
            this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSetRefList(section.readInt()));
        }
    }

    private void transformAnnotationSet(IndexMap indexMap, Dex.Section section) {
        this.contentsOut.annotationSets.size++;
        this.annotationSetOut.assertFourByteAligned();
        indexMap.putAnnotationSetOffset(section.getPosition(), this.annotationSetOut.getPosition());
        int i = section.readInt();
        this.annotationSetOut.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.annotationSetOut.writeInt(indexMap.adjustAnnotation(section.readInt()));
        }
    }

    private void transformAnnotationSetRefList(IndexMap indexMap, Dex.Section section) {
        this.contentsOut.annotationSetRefLists.size++;
        this.annotationSetRefListOut.assertFourByteAligned();
        indexMap.putAnnotationSetRefListOffset(section.getPosition(), this.annotationSetRefListOut.getPosition());
        int i = section.readInt();
        this.annotationSetRefListOut.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.annotationSetRefListOut.writeInt(indexMap.adjustAnnotationSet(section.readInt()));
        }
    }

    private void transformClassData(Dex c1679Dex, ClassData classData, IndexMap indexMap) {
        this.contentsOut.classDatas.size++;
        ClassData.Field[] staticFields = classData.getStaticFields();
        ClassData.Field[] instanceFields = classData.getInstanceFields();
        ClassData.Method[] directMethods = classData.getDirectMethods();
        ClassData.Method[] virtualMethods = classData.getVirtualMethods();
        this.classDataOut.writeUleb128(staticFields.length);
        this.classDataOut.writeUleb128(instanceFields.length);
        this.classDataOut.writeUleb128(directMethods.length);
        this.classDataOut.writeUleb128(virtualMethods.length);
        transformFields(indexMap, staticFields);
        transformFields(indexMap, instanceFields);
        transformMethods(c1679Dex, indexMap, directMethods);
        transformMethods(c1679Dex, indexMap, virtualMethods);
    }

    private void transformFields(IndexMap indexMap, ClassData.Field[] fieldArr) {
        int iAdjustField = 0;
        int i = 0;
        while (true) {
            int i2 = iAdjustField;
            if (i >= fieldArr.length) {
                return;
            }
            ClassData.Field field = fieldArr[i];
            iAdjustField = indexMap.adjustField(field.getFieldIndex());
            this.classDataOut.writeUleb128(iAdjustField - i2);
            this.classDataOut.writeUleb128(field.getAccessFlags());
            i++;
        }
    }

    private void transformMethods(Dex c1679Dex, IndexMap indexMap, ClassData.Method[] methodArr) {
        int i = 0;
        int i2 = 0;
        while (i < methodArr.length) {
            ClassData.Method method = methodArr[i];
            int iAdjustMethod = indexMap.adjustMethod(method.getMethodIndex());
            this.classDataOut.writeUleb128(iAdjustMethod - i2);
            this.classDataOut.writeUleb128(method.getAccessFlags());
            if (method.getCodeOffset() == 0) {
                this.classDataOut.writeUleb128(0);
            } else {
                this.codeOut.alignToFourBytesWithZeroFill();
                this.classDataOut.writeUleb128(this.codeOut.getPosition());
                transformCode(c1679Dex, c1679Dex.readCode(method), indexMap);
            }
            i++;
            i2 = iAdjustMethod;
        }
    }

    private void transformCode(Dex c1679Dex, Code code, IndexMap indexMap) {
        this.contentsOut.codes.size++;
        this.codeOut.assertFourByteAligned();
        this.codeOut.writeUnsignedShort(code.getRegistersSize());
        this.codeOut.writeUnsignedShort(code.getInsSize());
        this.codeOut.writeUnsignedShort(code.getOutsSize());
        Code.C1678Try[] tries = code.getTries();
        Code.CatchHandler[] catchHandlers = code.getCatchHandlers();
        this.codeOut.writeUnsignedShort(tries.length);
        int debugInfoOffset = code.getDebugInfoOffset();
        if (debugInfoOffset != 0) {
            this.codeOut.writeInt(this.debugInfoOut.getPosition());
            transformDebugInfoItem(c1679Dex.open(debugInfoOffset), indexMap);
        } else {
            this.codeOut.writeInt(0);
        }
        short[] sArrTransform = this.instructionTransformer.transform(indexMap, code.getInstructions());
        this.codeOut.writeInt(sArrTransform.length);
        this.codeOut.write(sArrTransform);
        if (tries.length > 0) {
            if (sArrTransform.length % 2 == 1) {
                this.codeOut.writeShort((short) 0);
            }
            Dex.Section sectionOpen = this.dexOut.open(this.codeOut.getPosition());
            this.codeOut.skip(tries.length * 8);
            transformTries(sectionOpen, tries, transformCatchHandlers(indexMap, catchHandlers));
        }
    }

    private int[] transformCatchHandlers(IndexMap indexMap, Code.CatchHandler[] catchHandlerArr) {
        int position = this.codeOut.getPosition();
        this.codeOut.writeUleb128(catchHandlerArr.length);
        int[] iArr = new int[catchHandlerArr.length];
        for (int i = 0; i < catchHandlerArr.length; i++) {
            iArr[i] = this.codeOut.getPosition() - position;
            transformEncodedCatchHandler(catchHandlerArr[i], indexMap);
        }
        return iArr;
    }

    private void transformTries(Dex.Section section, Code.C1678Try[] c1678TryArr, int[] iArr) {
        for (Code.C1678Try c1678Try : c1678TryArr) {
            section.writeInt(c1678Try.getStartAddress());
            section.writeUnsignedShort(c1678Try.getInstructionCount());
            section.writeUnsignedShort(iArr[c1678Try.getCatchHandlerIndex()]);
        }
    }

    private void transformDebugInfoItem(Dex.Section section, IndexMap indexMap) {
        this.contentsOut.debugInfos.size++;
        this.debugInfoOut.writeUleb128(section.readUleb128());
        int uleb128 = section.readUleb128();
        this.debugInfoOut.writeUleb128(uleb128);
        for (int i = 0; i < uleb128; i++) {
            this.debugInfoOut.writeUleb128p1(indexMap.adjustString(section.readUleb128p1()));
        }
        while (true) {
            byte b = section.readByte();
            this.debugInfoOut.writeByte(b);
            switch (b) {
                case 0:
                    return;
                case 1:
                    this.debugInfoOut.writeUleb128(section.readUleb128());
                    break;
                case 2:
                    this.debugInfoOut.writeSleb128(section.readSleb128());
                    break;
                case 3:
                case 4:
                    this.debugInfoOut.writeUleb128(section.readUleb128());
                    this.debugInfoOut.writeUleb128p1(indexMap.adjustString(section.readUleb128p1()));
                    this.debugInfoOut.writeUleb128p1(indexMap.adjustType(section.readUleb128p1()));
                    if (b == 4) {
                        this.debugInfoOut.writeUleb128p1(indexMap.adjustString(section.readUleb128p1()));
                    }
                    break;
                case 5:
                case 6:
                    this.debugInfoOut.writeUleb128(section.readUleb128());
                    break;
                case 9:
                    this.debugInfoOut.writeUleb128p1(indexMap.adjustString(section.readUleb128p1()));
                    break;
            }
        }
    }

    private void transformEncodedCatchHandler(Code.CatchHandler catchHandler, IndexMap indexMap) {
        int catchAllAddress = catchHandler.getCatchAllAddress();
        int[] typeIndexes = catchHandler.getTypeIndexes();
        int[] addresses = catchHandler.getAddresses();
        if (catchAllAddress != -1) {
            this.codeOut.writeSleb128(-typeIndexes.length);
        } else {
            this.codeOut.writeSleb128(typeIndexes.length);
        }
        for (int i = 0; i < typeIndexes.length; i++) {
            this.codeOut.writeUleb128(indexMap.adjustType(typeIndexes[i]));
            this.codeOut.writeUleb128(addresses[i]);
        }
        if (catchAllAddress != -1) {
            this.codeOut.writeUleb128(catchAllAddress);
        }
    }

    private void transformStaticValues(Dex.Section section, IndexMap indexMap) {
        this.contentsOut.encodedArrays.size++;
        indexMap.putEncodedArrayValueOffset(section.getPosition(), this.encodedArrayOut.getPosition());
        indexMap.adjustEncodedArray(section.readEncodedArray()).writeTo(this.encodedArrayOut);
    }

    private static class WriterSizes {
        private int annotation;
        private int annotationsDirectory;
        private int annotationsSet;
        private int annotationsSetRefList;
        private int classData;
        private int code;
        private int debugInfo;
        private int encodedArray;
        private int header;
        private int idsDefs;
        private int mapList;
        private int stringData;
        private int typeList;

        public WriterSizes(Dex[] c1679DexArr) {
            this.header = 112;
            for (Dex c1679Dex : c1679DexArr) {
                plus(c1679Dex.getTableOfContents(), false);
            }
            fourByteAlign();
        }

        public WriterSizes(DexMerger dexMerger) {
            this.header = 112;
            this.header = dexMerger.headerOut.used();
            this.idsDefs = dexMerger.idsDefsOut.used();
            this.mapList = dexMerger.mapListOut.used();
            this.typeList = dexMerger.typeListOut.used();
            this.classData = dexMerger.classDataOut.used();
            this.code = dexMerger.codeOut.used();
            this.stringData = dexMerger.stringDataOut.used();
            this.debugInfo = dexMerger.debugInfoOut.used();
            this.encodedArray = dexMerger.encodedArrayOut.used();
            this.annotationsDirectory = dexMerger.annotationsDirectoryOut.used();
            this.annotationsSet = dexMerger.annotationSetOut.used();
            this.annotationsSetRefList = dexMerger.annotationSetRefListOut.used();
            this.annotation = dexMerger.annotationOut.used();
            fourByteAlign();
        }

        private void plus(TableOfContents tableOfContents, boolean z) {
            this.idsDefs += (tableOfContents.stringIds.size * 4) + (tableOfContents.typeIds.size * 4) + (tableOfContents.protoIds.size * 12) + (tableOfContents.fieldIds.size * 8) + (tableOfContents.methodIds.size * 8) + (tableOfContents.classDefs.size * 32);
            this.mapList = (tableOfContents.sections.length * 12) + 4;
            this.typeList += fourByteAlign(tableOfContents.typeLists.byteCount);
            this.stringData += tableOfContents.stringDatas.byteCount;
            this.annotationsDirectory += tableOfContents.annotationsDirectories.byteCount;
            this.annotationsSet += tableOfContents.annotationSets.byteCount;
            this.annotationsSetRefList += tableOfContents.annotationSetRefLists.byteCount;
            if (z) {
                this.code += tableOfContents.codes.byteCount;
                this.classData += tableOfContents.classDatas.byteCount;
                this.encodedArray += tableOfContents.encodedArrays.byteCount;
                this.annotation += tableOfContents.annotations.byteCount;
                this.debugInfo += tableOfContents.debugInfos.byteCount;
                return;
            }
            this.code += (int) Math.ceil(((double) tableOfContents.codes.byteCount) * 1.25d);
            this.classData += (int) Math.ceil(((double) tableOfContents.classDatas.byteCount) * 1.67d);
            this.encodedArray += tableOfContents.encodedArrays.byteCount * 2;
            this.annotation += (int) Math.ceil(tableOfContents.annotations.byteCount * 2);
            this.debugInfo += (tableOfContents.debugInfos.byteCount * 2) + 8;
        }

        private void fourByteAlign() {
            this.header = fourByteAlign(this.header);
            this.idsDefs = fourByteAlign(this.idsDefs);
            this.mapList = fourByteAlign(this.mapList);
            this.typeList = fourByteAlign(this.typeList);
            this.classData = fourByteAlign(this.classData);
            this.code = fourByteAlign(this.code);
            this.stringData = fourByteAlign(this.stringData);
            this.debugInfo = fourByteAlign(this.debugInfo);
            this.encodedArray = fourByteAlign(this.encodedArray);
            this.annotationsDirectory = fourByteAlign(this.annotationsDirectory);
            this.annotationsSet = fourByteAlign(this.annotationsSet);
            this.annotationsSetRefList = fourByteAlign(this.annotationsSetRefList);
            this.annotation = fourByteAlign(this.annotation);
        }

        private static int fourByteAlign(int i) {
            return (i + 3) & (-4);
        }

        public int size() {
            return this.header + this.idsDefs + this.mapList + this.typeList + this.classData + this.code + this.stringData + this.debugInfo + this.encodedArray + this.annotationsDirectory + this.annotationsSet + this.annotationsSetRefList + this.annotation;
        }
    }

    public static void main(String[] strArr) throws IOException {
        if (strArr.length < 2) {
            printUsage();
            return;
        }
        Dex[] c1679DexArr = new Dex[strArr.length - 1];
        for (int i = 1; i < strArr.length; i++) {
            c1679DexArr[i - 1] = new Dex(new File(strArr[i]));
        }
        new DexMerger(c1679DexArr, CollisionPolicy.KEEP_FIRST, new DxContext()).merge().writeTo(new File(strArr[0]));
    }

    private static void printUsage() {
        System.out.println("Usage: DexMerger <out.dex> <a.dex> <b.dex> ...");
        System.out.println();
        System.out.println("If a class is defined in several dex, the class found in the first dex will be used.");
    }
}
