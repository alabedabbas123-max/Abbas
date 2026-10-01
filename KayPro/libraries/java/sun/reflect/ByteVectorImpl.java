package sun.reflect;

class ByteVectorImpl implements ByteVector {
    private byte[] data;

    private int f632pos;

    public ByteVectorImpl() {
        this(100);
    }

    public ByteVectorImpl(int sz) {
        this.data = new byte[sz];
        this.f632pos = -1;
    }

    @Override
    public int getLength() {
        return this.f632pos + 1;
    }

    @Override
    public byte mo549get(int index) {
        if (index >= this.data.length) {
            resize(index);
            this.f632pos = index;
        }
        return this.data[index];
    }

    @Override
    public void mo550put(int index, byte value) {
        if (index >= this.data.length) {
            resize(index);
            this.f632pos = index;
        }
        this.data[index] = value;
    }

    @Override
    public void mo548add(byte value) {
        int i = this.f632pos + 1;
        this.f632pos = i;
        if (i >= this.data.length) {
            resize(i);
        }
        this.data[this.f632pos] = value;
    }

    @Override
    public void trim() {
        int i = this.f632pos;
        byte[] bArr = this.data;
        if (i != bArr.length - 1) {
            byte[] newData = new byte[i + 1];
            System.arraycopy(bArr, 0, newData, 0, i + 1);
            this.data = newData;
        }
    }

    @Override
    public byte[] getData() {
        return this.data;
    }

    private void resize(int minSize) {
        byte[] bArr = this.data;
        if (minSize <= bArr.length * 2) {
            minSize = bArr.length * 2;
        }
        byte[] newData = new byte[minSize];
        byte[] bArr2 = this.data;
        System.arraycopy(bArr2, 0, newData, 0, bArr2.length);
        this.data = newData;
    }
}
