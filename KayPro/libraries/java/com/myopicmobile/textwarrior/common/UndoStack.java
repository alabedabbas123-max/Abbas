package com.myopicmobile.textwarrior.common;

import java.util.LinkedList;

public class UndoStack {
    private TextBuffer _buf;
    private LinkedList<Command> _stack = new LinkedList<>();
    private boolean _isBatchEdit = false;
    private int _groupId = 0;
    private int _top = 0;
    long _lastEditTime = -1;

    private abstract class Command {
        public static final long MERGE_TIME = 1000000000;
        public String _data;
        public int _group;
        public int _length;
        public int _start;
        private final UndoStack this$0;

        public Command(UndoStack undoStack) {
            this.this$0 = undoStack;
        }

        public abstract int findRedoPosition();

        public abstract int findUndoPosition();

        public abstract boolean merge(int i, int i2, long j);

        public abstract void recordData();

        public abstract void redo();

        public abstract void undo();
    }

    private class DeleteCommand extends Command {
        private final UndoStack this$0;

        public DeleteCommand(UndoStack undoStack, int i, int i2, int i3) {
            super(undoStack);
            this.this$0 = undoStack;
            this._start = i;
            this._length = i2;
            this._group = i3;
        }

        @Override
        public int findRedoPosition() {
            return this._start;
        }

        @Override
        public int findUndoPosition() {
            return this._start + this._length;
        }

        @Override
        public boolean merge(int i, int i2, long j) {
            if (this.this$0._lastEditTime < 0 || j - this.this$0._lastEditTime >= Command.MERGE_TIME || i != ((this._start - this._length) - i2) + 1) {
                return false;
            }
            this._start = i;
            this._length += i2;
            this.this$0.trimStack();
            return true;
        }

        @Override
        public void recordData() {
            this._data = new String(this.this$0._buf.gapSubSequence(this._length));
        }

        @Override
        public void redo() {
            this.this$0._buf.delete(this._start, this._length, 0, false);
        }

        @Override
        public void undo() {
            if (this._data != null) {
                this.this$0._buf.insert(this._data.toCharArray(), this._start, 0, false);
            } else {
                recordData();
                this.this$0._buf.shiftGapStart(this._length);
            }
        }
    }

    private class InsertCommand extends Command {
        private final UndoStack this$0;

        public InsertCommand(UndoStack undoStack, int i, int i2, int i3) {
            super(undoStack);
            this.this$0 = undoStack;
            this._start = i;
            this._length = i2;
            this._group = i3;
        }

        @Override
        public int findRedoPosition() {
            return this._start + this._length;
        }

        @Override
        public int findUndoPosition() {
            return this._start;
        }

        @Override
        public boolean merge(int i, int i2, long j) {
            if (this.this$0._lastEditTime < 0 || j - this.this$0._lastEditTime >= Command.MERGE_TIME || i != this._start + this._length) {
                return false;
            }
            this._length += i2;
            this.this$0.trimStack();
            return true;
        }

        @Override
        public void recordData() {
            this._data = this.this$0._buf.subSequence(this._start, this._length).toString();
        }

        @Override
        public void redo() {
            this.this$0._buf.insert(this._data.toCharArray(), this._start, 0, false);
        }

        @Override
        public void undo() {
            if (this._data != null) {
                this.this$0._buf.delete(this._start, this._length, 0, false);
            } else {
                recordData();
                this.this$0._buf.shiftGapStart(-this._length);
            }
        }
    }

    public UndoStack(TextBuffer textBuffer) {
        this._buf = textBuffer;
    }

    private void push(Command command) {
        trimStack();
        this._top++;
        this._stack.add(command);
    }

    public void trimStack() {
        while (this._stack.size() > this._top) {
            this._stack.removeLast();
        }
    }

    public void beginBatchEdit() {
        this._isBatchEdit = true;
    }

    public final boolean canRedo() {
        return this._top < this._stack.size();
    }

    public final boolean canUndo() {
        return this._top > 0;
    }

    public void captureDelete(int i, int i2, long j) {
        boolean z;
        if (canUndo()) {
            Command command = this._stack.get(this._top - 1);
            if ((command instanceof DeleteCommand) && command.merge(i, i2, j)) {
                z = true;
            } else {
                command.recordData();
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            push(new DeleteCommand(this, i, i2, this._groupId));
            if (!this._isBatchEdit) {
                this._groupId++;
            }
        }
        this._lastEditTime = j;
    }

    public void captureInsert(int i, int i2, long j) {
        boolean z;
        if (canUndo()) {
            Command command = this._stack.get(this._top - 1);
            if ((command instanceof InsertCommand) && command.merge(i, i2, j)) {
                z = true;
            } else {
                command.recordData();
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            push(new InsertCommand(this, i, i2, this._groupId));
            if (!this._isBatchEdit) {
                this._groupId++;
            }
        }
        this._lastEditTime = j;
    }

    public void endBatchEdit() {
        this._isBatchEdit = false;
        this._groupId++;
    }

    public boolean isBatchEdit() {
        return this._isBatchEdit;
    }

    public int redo() {
        Command command;
        if (!canRedo()) {
            return -1;
        }
        Command command2 = this._stack.get(this._top);
        int i = command2._group;
        do {
            command = command2;
            command2 = this._stack.get(this._top);
            if (command2._group == i) {
                command2.redo();
                this._top++;
            }
            return command.findRedoPosition();
        } while (canRedo());
        command = command2;
        return command.findRedoPosition();
    }

    public int undo() {
        Command command;
        if (!canUndo()) {
            return -1;
        }
        Command command2 = this._stack.get(this._top - 1);
        int i = command2._group;
        do {
            command = command2;
            command2 = this._stack.get(this._top - 1);
            if (command2._group == i) {
                command2.undo();
                this._top--;
            }
            return command.findUndoPosition();
        } while (canUndo());
        command = command2;
        return command.findUndoPosition();
    }
}
