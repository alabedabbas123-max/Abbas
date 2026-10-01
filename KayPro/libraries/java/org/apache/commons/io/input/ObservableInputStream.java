package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObservableInputStream extends ProxyInputStream {
    private final List<Observer> observers;

    public static abstract class Observer {
        void closed() throws IOException {
        }

        void data(int i) throws IOException {
        }

        void data(byte[] bArr, int i, int i2) throws IOException {
        }

        void error(IOException iOException) throws IOException {
            throw iOException;
        }

        void finished() throws IOException {
        }
    }

    public ObservableInputStream(InputStream inputStream) {
        super(inputStream);
        this.observers = new ArrayList();
    }

    public void m7500add(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void close() throws IOException {
        IOException e = null;
        try {
            super.close();
        } catch (IOException e2) {
            e = e2;
        }
        if (e == null) {
            noteClosed();
        } else {
            noteError(e);
        }
    }

    public void consume() throws IOException {
        while (read(new byte[8192]) != -1) {
        }
    }

    protected List<Observer> getObservers() {
        return this.observers;
    }

    protected void noteClosed() throws IOException {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().closed();
        }
    }

    protected void noteDataByte(int i) throws IOException {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().data(i);
        }
    }

    protected void noteDataBytes(byte[] bArr, int i, int i2) throws IOException {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().data(bArr, i, i2);
        }
    }

    protected void noteError(IOException iOException) throws IOException {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().error(iOException);
        }
    }

    protected void noteFinished() throws IOException {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().finished();
        }
    }

    @Override
    public int read() throws IOException {
        int i = 0;
        IOException e = null;
        try {
            i = super.read();
        } catch (IOException e2) {
            e = e2;
        }
        if (e != null) {
            noteError(e);
        } else if (i == -1) {
            noteFinished();
        } else {
            noteDataByte(i);
        }
        return i;
    }

    @Override
    public int read(byte[] bArr) throws IOException {
        int i;
        IOException e = null;
        try {
            i = super.read(bArr);
        } catch (IOException e2) {
            e = e2;
            i = 0;
        }
        if (e != null) {
            noteError(e);
        } else if (i == -1) {
            noteFinished();
        } else if (i > 0) {
            noteDataBytes(bArr, 0, i);
        }
        return i;
    }

    @Override
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        IOException e = null;
        try {
            i3 = super.read(bArr, i, i2);
        } catch (IOException e2) {
            e = e2;
        }
        if (e != null) {
            noteError(e);
        } else if (i3 == -1) {
            noteFinished();
        } else if (i3 > 0) {
            noteDataBytes(bArr, i, i3);
        }
        return i3;
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public void removeAllObservers() {
        this.observers.clear();
    }
}
