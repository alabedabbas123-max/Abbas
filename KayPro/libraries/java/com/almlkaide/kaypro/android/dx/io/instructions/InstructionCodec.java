package com.almlkaide.kaypro.android.dx.io.instructions;

import com.almlkaide.kaypro.android.dex.DexException;
import com.almlkaide.kaypro.android.dx.io.IndexType;
import com.almlkaide.kaypro.android.dx.io.OpcodeInfo;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.io.EOFException;
import java.util.Arrays;

public enum InstructionCodec {
    FORMAT_00X {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, i, 0, (IndexType) null, 0, 0L);
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit());
        }
    },
    FORMAT_10X {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit());
        }
    },
    FORMAT_12X {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, 0L, InstructionCodec.nibble2(i), InstructionCodec.nibble3(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcodeUnit(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())));
        }
    },
    FORMAT_11N {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, (InstructionCodec.nibble3(i) << 28) >> 28, InstructionCodec.nibble2(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcodeUnit(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getLiteralNibble())));
        }
    },
    FORMAT_11X {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, 0L, InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()));
        }
    },
    FORMAT_10T {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, ((byte) InstructionCodec.byte1(i)) + (codeInput.cursor() - 1), 0L);
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getTargetByte(codeOutput.cursor())));
        }
    },
    FORMAT_20T {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, ((short) codeInput.read()) + (codeInput.cursor() - 1), InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit(), decodedInstruction.getTargetUnit(codeOutput.cursor()));
        }
    },
    FORMAT_20BC {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i), codeInput.read(), IndexType.VARIES, 0, InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getLiteralByte()), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_22X {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, 0L, InstructionCodec.byte1(i), codeInput.read());
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getBUnit());
        }
    },
    FORMAT_21T {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, ((short) codeInput.read()) + (codeInput.cursor() - 1), 0L, InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getTargetUnit(codeOutput.cursor()));
        }
    },
    FORMAT_21S {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, (short) codeInput.read(), InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getLiteralUnit());
        }
    },
    FORMAT_21H {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int iByte0 = InstructionCodec.byte0(i);
            return new OneRegisterDecodedInstruction(this, iByte0, 0, (IndexType) null, 0, ((long) ((short) codeInput.read())) << (iByte0 == 21 ? (char) 16 : '0'), InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int opcode = decodedInstruction.getOpcode();
            codeOutput.write(InstructionCodec.codeUnit(opcode, decodedInstruction.getA()), (short) (decodedInstruction.getLiteral() >> (opcode == 21 ? (char) 16 : '0')));
        }
    },
    FORMAT_21C {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int iByte0 = InstructionCodec.byte0(i);
            return new OneRegisterDecodedInstruction(this, iByte0, codeInput.read(), OpcodeInfo.getIndexType(iByte0), 0, 0L, InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_23X {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int iByte0 = InstructionCodec.byte0(i);
            int iByte1 = InstructionCodec.byte1(i);
            int i2 = codeInput.read();
            return new ThreeRegisterDecodedInstruction(this, iByte0, 0, (IndexType) null, 0, 0L, iByte1, InstructionCodec.byte0(i2), InstructionCodec.byte1(i2));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.codeUnit(decodedInstruction.getB(), decodedInstruction.getC()));
        }
    },
    FORMAT_22B {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int iByte0 = InstructionCodec.byte0(i);
            int iByte1 = InstructionCodec.byte1(i);
            int i2 = codeInput.read();
            return new TwoRegisterDecodedInstruction(this, iByte0, 0, (IndexType) null, 0, (byte) InstructionCodec.byte1(i2), iByte1, InstructionCodec.byte0(i2));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.codeUnit(decodedInstruction.getB(), decodedInstruction.getLiteralByte()));
        }
    },
    FORMAT_22T {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, ((short) codeInput.read()) + (codeInput.cursor() - 1), 0L, InstructionCodec.nibble2(i), InstructionCodec.nibble3(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getTargetUnit(codeOutput.cursor()));
        }
    },
    FORMAT_22S {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, (short) codeInput.read(), InstructionCodec.nibble2(i), InstructionCodec.nibble3(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getLiteralUnit());
        }
    },
    FORMAT_22C {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int iByte0 = InstructionCodec.byte0(i);
            return new TwoRegisterDecodedInstruction(this, iByte0, codeInput.read(), OpcodeInfo.getIndexType(iByte0), 0, 0L, InstructionCodec.nibble2(i), InstructionCodec.nibble3(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_22CS {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), codeInput.read(), IndexType.FIELD_OFFSET, 0, 0L, InstructionCodec.nibble2(i), InstructionCodec.nibble3(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), InstructionCodec.makeByte(decodedInstruction.getA(), decodedInstruction.getB())), decodedInstruction.getIndexUnit());
        }
    },
    FORMAT_30T {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new ZeroRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, codeInput.readInt() + (codeInput.cursor() - 1), InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int target = decodedInstruction.getTarget(codeOutput.cursor());
            codeOutput.write(decodedInstruction.getOpcodeUnit(), InstructionCodec.unit0(target), InstructionCodec.unit1(target));
        }
    },
    FORMAT_32X {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new TwoRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, InstructionCodec.byte1(i), codeInput.read(), codeInput.read());
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(decodedInstruction.getOpcodeUnit(), decodedInstruction.getAUnit(), decodedInstruction.getBUnit());
        }
    },
    FORMAT_31I {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, codeInput.readInt(), InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int literalInt = decodedInstruction.getLiteralInt();
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(literalInt), InstructionCodec.unit1(literalInt));
        }
    },
    FORMAT_31T {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int iCursor = codeInput.cursor() - 1;
            int iByte0 = InstructionCodec.byte0(i);
            int iByte1 = InstructionCodec.byte1(i);
            int i2 = iCursor + codeInput.readInt();
            switch (iByte0) {
                case 43:
                case 44:
                    codeInput.setBaseAddress(i2, iCursor);
                    break;
            }
            return new OneRegisterDecodedInstruction(this, iByte0, 0, (IndexType) null, i2, 0L, iByte1);
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int target = decodedInstruction.getTarget(codeOutput.cursor());
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(target), InstructionCodec.unit1(target));
        }
    },
    FORMAT_31C {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int iByte0 = InstructionCodec.byte0(i);
            return new OneRegisterDecodedInstruction(this, iByte0, codeInput.readInt(), OpcodeInfo.getIndexType(iByte0), 0, 0L, InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            int index = decodedInstruction.getIndex();
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(index), InstructionCodec.unit1(index));
        }
    },
    FORMAT_35C {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterList(this, i, codeInput);
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterList(decodedInstruction, codeOutput);
        }
    },
    FORMAT_35MS {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterList(this, i, codeInput);
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterList(decodedInstruction, codeOutput);
        }
    },
    FORMAT_35MI {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterList(this, i, codeInput);
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterList(decodedInstruction, codeOutput);
        }
    },
    FORMAT_3RC {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterRange(this, i, codeInput);
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterRange(decodedInstruction, codeOutput);
        }
    },
    FORMAT_3RMS {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterRange(this, i, codeInput);
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterRange(decodedInstruction, codeOutput);
        }
    },
    FORMAT_3RMI {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return InstructionCodec.decodeRegisterRange(this, i, codeInput);
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InstructionCodec.encodeRegisterRange(decodedInstruction, codeOutput);
        }
    },
    FORMAT_51L {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            return new OneRegisterDecodedInstruction(this, InstructionCodec.byte0(i), 0, (IndexType) null, 0, codeInput.readLong(), InstructionCodec.byte1(i));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            long literal = decodedInstruction.getLiteral();
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getA()), InstructionCodec.unit0(literal), InstructionCodec.unit1(literal), InstructionCodec.unit2(literal), InstructionCodec.unit3(literal));
        }
    },
    FORMAT_45CC {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int iByte0 = InstructionCodec.byte0(i);
            if (iByte0 != 250) {
                throw new UnsupportedOperationException(String.valueOf(iByte0));
            }
            int iNibble2 = InstructionCodec.nibble2(i);
            int iNibble3 = InstructionCodec.nibble3(i);
            int i2 = codeInput.read();
            int i3 = codeInput.read();
            int iNibble0 = InstructionCodec.nibble0(i3);
            int iNibble1 = InstructionCodec.nibble1(i3);
            int iNibble4 = InstructionCodec.nibble2(i3);
            int iNibble5 = InstructionCodec.nibble3(i3);
            int i4 = codeInput.read();
            IndexType indexType = OpcodeInfo.getIndexType(iByte0);
            if (iNibble3 < 1 || iNibble3 > 5) {
                throw new DexException(new StringBuffer().append("bogus registerCount: ").append(Hex.uNibble(iNibble3)).toString());
            }
            return new InvokePolymorphicDecodedInstruction(this, iByte0, i2, indexType, i4, Arrays.copyOfRange(new int[]{iNibble0, iNibble1, iNibble4, iNibble5, iNibble2}, 0, iNibble3));
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            InvokePolymorphicDecodedInstruction invokePolymorphicDecodedInstruction = (InvokePolymorphicDecodedInstruction) decodedInstruction;
            codeOutput.write(InstructionCodec.codeUnit(invokePolymorphicDecodedInstruction.getOpcode(), InstructionCodec.makeByte(invokePolymorphicDecodedInstruction.getG(), invokePolymorphicDecodedInstruction.getRegisterCount())), invokePolymorphicDecodedInstruction.getIndexUnit(), InstructionCodec.codeUnit(invokePolymorphicDecodedInstruction.getC(), invokePolymorphicDecodedInstruction.getD(), invokePolymorphicDecodedInstruction.getE(), invokePolymorphicDecodedInstruction.getF()), invokePolymorphicDecodedInstruction.getProtoIndex());
        }
    },
    FORMAT_4RCC {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int iByte0 = InstructionCodec.byte0(i);
            if (iByte0 != 251) {
                throw new UnsupportedOperationException(String.valueOf(iByte0));
            }
            int iByte1 = InstructionCodec.byte1(i);
            return new InvokePolymorphicRangeDecodedInstruction(this, iByte0, codeInput.read(), OpcodeInfo.getIndexType(iByte0), codeInput.read(), iByte1, codeInput.read());
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            codeOutput.write(InstructionCodec.codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getRegisterCount()), decodedInstruction.getIndexUnit(), decodedInstruction.getCUnit(), decodedInstruction.getProtoIndex());
        }
    },
    FORMAT_PACKED_SWITCH_PAYLOAD {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int iBaseAddressForCursor = codeInput.baseAddressForCursor() - 1;
            int i2 = codeInput.read();
            int i3 = codeInput.readInt();
            int[] iArr = new int[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                iArr[i4] = codeInput.readInt() + iBaseAddressForCursor;
            }
            return new PackedSwitchPayloadDecodedInstruction(this, i, i3, iArr);
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            PackedSwitchPayloadDecodedInstruction packedSwitchPayloadDecodedInstruction = (PackedSwitchPayloadDecodedInstruction) decodedInstruction;
            int[] targets = packedSwitchPayloadDecodedInstruction.getTargets();
            int iBaseAddressForCursor = codeOutput.baseAddressForCursor();
            codeOutput.write(packedSwitchPayloadDecodedInstruction.getOpcodeUnit());
            codeOutput.write(InstructionCodec.asUnsignedUnit(targets.length));
            codeOutput.writeInt(packedSwitchPayloadDecodedInstruction.getFirstKey());
            for (int i : targets) {
                codeOutput.writeInt(i - iBaseAddressForCursor);
            }
        }
    },
    FORMAT_SPARSE_SWITCH_PAYLOAD {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int iBaseAddressForCursor = codeInput.baseAddressForCursor() - 1;
            int i2 = codeInput.read();
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = codeInput.readInt();
            }
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = codeInput.readInt() + iBaseAddressForCursor;
            }
            return new SparseSwitchPayloadDecodedInstruction(this, i, iArr, iArr2);
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            SparseSwitchPayloadDecodedInstruction sparseSwitchPayloadDecodedInstruction = (SparseSwitchPayloadDecodedInstruction) decodedInstruction;
            int[] keys = sparseSwitchPayloadDecodedInstruction.getKeys();
            int[] targets = sparseSwitchPayloadDecodedInstruction.getTargets();
            int iBaseAddressForCursor = codeOutput.baseAddressForCursor();
            codeOutput.write(sparseSwitchPayloadDecodedInstruction.getOpcodeUnit());
            codeOutput.write(InstructionCodec.asUnsignedUnit(targets.length));
            for (int i : keys) {
                codeOutput.writeInt(i);
            }
            for (int i2 : targets) {
                codeOutput.writeInt(i2 - iBaseAddressForCursor);
            }
        }
    },
    FORMAT_FILL_ARRAY_DATA_PAYLOAD {
        @Override
        public DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException {
            int i2 = 0;
            int i3 = codeInput.read();
            int i4 = codeInput.readInt();
            switch (i3) {
                case 1:
                    byte[] bArr = new byte[i4];
                    int i5 = 0;
                    int i6 = 0;
                    boolean z = true;
                    while (i6 < i4) {
                        if (z) {
                            i5 = codeInput.read();
                        }
                        bArr[i6] = (byte) (i5 & 255);
                        i5 >>= 8;
                        i6++;
                        z = !z;
                    }
                    return new FillArrayDataPayloadDecodedInstruction((InstructionCodec) this, i, bArr);
                case 2:
                    short[] sArr = new short[i4];
                    while (i2 < i4) {
                        sArr[i2] = (short) codeInput.read();
                        i2++;
                    }
                    return new FillArrayDataPayloadDecodedInstruction((InstructionCodec) this, i, sArr);
                case 3:
                case 5:
                case 6:
                case 7:
                default:
                    throw new DexException(new StringBuffer().append("bogus element_width: ").append(Hex.m7225u2(i3)).toString());
                case 4:
                    int[] iArr = new int[i4];
                    while (i2 < i4) {
                        iArr[i2] = codeInput.readInt();
                        i2++;
                    }
                    return new FillArrayDataPayloadDecodedInstruction((InstructionCodec) this, i, iArr);
                case 8:
                    long[] jArr = new long[i4];
                    while (i2 < i4) {
                        jArr[i2] = codeInput.readLong();
                        i2++;
                    }
                    return new FillArrayDataPayloadDecodedInstruction(this, i, jArr);
            }
        }

        @Override
        public void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
            FillArrayDataPayloadDecodedInstruction fillArrayDataPayloadDecodedInstruction = (FillArrayDataPayloadDecodedInstruction) decodedInstruction;
            short elementWidthUnit = fillArrayDataPayloadDecodedInstruction.getElementWidthUnit();
            Object data = fillArrayDataPayloadDecodedInstruction.getData();
            codeOutput.write(fillArrayDataPayloadDecodedInstruction.getOpcodeUnit());
            codeOutput.write(elementWidthUnit);
            codeOutput.writeInt(fillArrayDataPayloadDecodedInstruction.getSize());
            switch (elementWidthUnit) {
                case 1:
                    codeOutput.write((byte[]) data);
                    return;
                case 2:
                    codeOutput.write((short[]) data);
                    return;
                case 3:
                case 5:
                case 6:
                case 7:
                default:
                    throw new DexException(new StringBuffer().append("bogus element_width: ").append(Hex.m7225u2(elementWidthUnit)).toString());
                case 4:
                    codeOutput.write((int[]) data);
                    return;
                case 8:
                    codeOutput.write((long[]) data);
                    return;
            }
        }
    };

    public abstract DecodedInstruction decode(int i, CodeInput codeInput) throws EOFException;

    public abstract void encode(DecodedInstruction decodedInstruction, CodeOutput codeOutput);

    public static InstructionCodec valueOf(String str) {
        for (InstructionCodec instructionCodec : values()) {
            if (instructionCodec.name().equals(str)) {
                return instructionCodec;
            }
        }
        throw new IllegalArgumentException();
    }

    public static DecodedInstruction decodeRegisterList(InstructionCodec instructionCodec, int i, CodeInput codeInput) throws EOFException {
        int iByte0 = byte0(i);
        int iNibble2 = nibble2(i);
        int iNibble3 = nibble3(i);
        int i2 = codeInput.read();
        int i3 = codeInput.read();
        int iNibble0 = nibble0(i3);
        int iNibble1 = nibble1(i3);
        int iNibble4 = nibble2(i3);
        int iNibble5 = nibble3(i3);
        IndexType indexType = OpcodeInfo.getIndexType(iByte0);
        switch (iNibble3) {
            case 0:
                return new ZeroRegisterDecodedInstruction(instructionCodec, iByte0, i2, indexType, 0, 0L);
            case 1:
                return new OneRegisterDecodedInstruction(instructionCodec, iByte0, i2, indexType, 0, 0L, iNibble0);
            case 2:
                return new TwoRegisterDecodedInstruction(instructionCodec, iByte0, i2, indexType, 0, 0L, iNibble0, iNibble1);
            case 3:
                return new ThreeRegisterDecodedInstruction(instructionCodec, iByte0, i2, indexType, 0, 0L, iNibble0, iNibble1, iNibble4);
            case 4:
                return new FourRegisterDecodedInstruction(instructionCodec, iByte0, i2, indexType, 0, 0L, iNibble0, iNibble1, iNibble4, iNibble5);
            case 5:
                return new FiveRegisterDecodedInstruction(instructionCodec, iByte0, i2, indexType, 0, 0L, iNibble0, iNibble1, iNibble4, iNibble5, iNibble2);
            default:
                throw new DexException(new StringBuffer().append("bogus registerCount: ").append(Hex.uNibble(iNibble3)).toString());
        }
    }

    public static void encodeRegisterList(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
        codeOutput.write(codeUnit(decodedInstruction.getOpcode(), makeByte(decodedInstruction.getE(), decodedInstruction.getRegisterCount())), decodedInstruction.getIndexUnit(), codeUnit(decodedInstruction.getA(), decodedInstruction.getB(), decodedInstruction.getC(), decodedInstruction.getD()));
    }

    public static DecodedInstruction decodeRegisterRange(InstructionCodec instructionCodec, int i, CodeInput codeInput) throws EOFException {
        int iByte0 = byte0(i);
        int iByte1 = byte1(i);
        return new RegisterRangeDecodedInstruction(instructionCodec, iByte0, codeInput.read(), OpcodeInfo.getIndexType(iByte0), 0, 0L, codeInput.read(), iByte1);
    }

    public static void encodeRegisterRange(DecodedInstruction decodedInstruction, CodeOutput codeOutput) {
        codeOutput.write(codeUnit(decodedInstruction.getOpcode(), decodedInstruction.getRegisterCount()), decodedInstruction.getIndexUnit(), decodedInstruction.getAUnit());
    }

    public static short codeUnit(int i, int i2) {
        if ((i & (-256)) != 0) {
            throw new IllegalArgumentException("bogus lowByte");
        }
        if ((i2 & (-256)) != 0) {
            throw new IllegalArgumentException("bogus highByte");
        }
        return (short) ((i2 << 8) | i);
    }

    public static short codeUnit(int i, int i2, int i3, int i4) {
        if ((i & (-16)) != 0) {
            throw new IllegalArgumentException("bogus nibble0");
        }
        if ((i2 & (-16)) != 0) {
            throw new IllegalArgumentException("bogus nibble1");
        }
        if ((i3 & (-16)) != 0) {
            throw new IllegalArgumentException("bogus nibble2");
        }
        if ((i4 & (-16)) != 0) {
            throw new IllegalArgumentException("bogus nibble3");
        }
        return (short) ((i2 << 4) | i | (i3 << 8) | (i4 << 12));
    }

    public static int makeByte(int i, int i2) {
        if ((i & (-16)) != 0) {
            throw new IllegalArgumentException("bogus lowNibble");
        }
        if ((i2 & (-16)) != 0) {
            throw new IllegalArgumentException("bogus highNibble");
        }
        return (i2 << 4) | i;
    }

    public static short asUnsignedUnit(int i) {
        if (((-65536) & i) != 0) {
            throw new IllegalArgumentException("bogus unsigned code unit");
        }
        return (short) i;
    }

    public static short unit0(int i) {
        return (short) i;
    }

    public static short unit1(int i) {
        return (short) (i >> 16);
    }

    public static short unit0(long j) {
        return (short) j;
    }

    public static short unit1(long j) {
        return (short) (j >> 16);
    }

    public static short unit2(long j) {
        return (short) (j >> 32);
    }

    public static short unit3(long j) {
        return (short) (j >> 48);
    }

    public static int byte0(int i) {
        return i & 255;
    }

    public static int byte1(int i) {
        return (i >> 8) & 255;
    }

    private static int byte2(int i) {
        return (i >> 16) & 255;
    }

    private static int byte3(int i) {
        return i >>> 24;
    }

    public static int nibble0(int i) {
        return i & 15;
    }

    public static int nibble1(int i) {
        return (i >> 4) & 15;
    }

    public static int nibble2(int i) {
        return (i >> 8) & 15;
    }

    public static int nibble3(int i) {
        return (i >> 12) & 15;
    }
}
