package com.abbas.ide.ui.editor

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.abbas.ide.core.io.FileOperations
import com.abbas.ide.core.io.FileTree
import com.abbas.ide.core.model.EditorDocument
import com.abbas.ide.core.model.FileNode
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import java.io.File

/**
 * Holds the state of one open project: the explorer tree and the open buffers.
 */
class WorkspaceViewModel(application: Application) : AndroidViewModel(application) {

    private lateinit var tree: FileTree

    private val _nodes = MutableStateFlow<List<FileNode>>(emptyList())
    val nodes: StateFlow<List<FileNode>> = _nodes.asStateFlow()

    private val _openDocuments = MutableStateFlow<List<EditorDocument>>(emptyList())
    val openDocuments: StateFlow<List<EditorDocument>> = _openDocuments.asStateFlow()

    private val _activeIndex = MutableStateFlow(-1)
    val activeIndex: StateFlow<Int> = _activeIndex.asStateFlow()

    private val _messages = Channel<String>(Channel.BUFFERED)
    val messages = _messages.receiveAsFlow()

    var projectRoot: File? = null
        private set

    fun initialise(root: File) {
        if (projectRoot?.absolutePath == root.absolutePath) return
        projectRoot = root
        tree = FileTree(root)
        reloadTree()
    }

    fun reloadTree() {
        viewModelScope.launch {
            tree.reload()
            _nodes.value = tree.visibleNodes
        }
    }

    fun toggleNode(node: FileNode) {
        viewModelScope.launch {
            if (tree.toggle(node)) _nodes.value = tree.visibleNodes
        }
    }

    fun openFile(file: File) {
        val existing = _openDocuments.value.indexOfFirst { it.file.absolutePath == file.absolutePath }
        if (existing >= 0) {
            _activeIndex.value = existing
            return
        }

        if (!FileOperations.isProbablyText(file)) {
            viewModelScope.launch { _messages.send("Cannot open binary file ${file.name}") }
            return
        }

        viewModelScope.launch {
            FileOperations.readText(file)
                .onSuccess { content ->
                    _openDocuments.value = _openDocuments.value + EditorDocument(file, content)
                    _activeIndex.value = _openDocuments.value.lastIndex
                }
                .onFailure { _messages.send(it.message ?: "Could not open ${file.name}") }
        }
    }

    fun selectTab(index: Int) {
        if (index in _openDocuments.value.indices) _activeIndex.value = index
    }

    fun closeTab(index: Int) {
        val documents = _openDocuments.value.toMutableList()
        if (index !in documents.indices) return
        documents.removeAt(index)
        _openDocuments.value = documents
        _activeIndex.value = when {
            documents.isEmpty() -> -1
            index >= documents.size -> documents.lastIndex
            else -> index
        }
    }

    /** Records in-memory edits without touching the disk. */
    fun updateActiveContent(content: String) {
        val index = _activeIndex.value
        val documents = _openDocuments.value.toMutableList()
        if (index !in documents.indices) return
        val document = documents[index]
        if (document.content == content) return
        documents[index] = document.copy(content = content, isDirty = true)
        _openDocuments.value = documents
    }

    fun saveActive() {
        val index = _activeIndex.value
        val document = _openDocuments.value.getOrNull(index) ?: return
        if (!document.isDirty) {
            viewModelScope.launch { _messages.send("Nothing to save") }
            return
        }
        viewModelScope.launch {
            FileOperations.writeText(document.file, document.content)
                .onSuccess {
                    val documents = _openDocuments.value.toMutableList()
                    if (index in documents.indices) {
                        documents[index] = documents[index].copy(isDirty = false)
                        _openDocuments.value = documents
                    }
                    _messages.send("Saved ${document.name}")
                }
                .onFailure { _messages.send(it.message ?: "Could not save ${document.name}") }
        }
    }

    fun saveAll() {
        viewModelScope.launch {
            val documents = _openDocuments.value.toMutableList()
            var saved = 0
            documents.forEachIndexed { index, document ->
                if (!document.isDirty) return@forEachIndexed
                FileOperations.writeText(document.file, document.content)
                    .onSuccess {
                        documents[index] = document.copy(isDirty = false)
                        saved++
                    }
            }
            _openDocuments.value = documents
            _messages.send(if (saved == 0) "Nothing to save" else "Saved $saved file(s)")
        }
    }

    fun hasUnsavedChanges(): Boolean = _openDocuments.value.any { it.isDirty }

    fun createFile(parent: File, name: String) {
        viewModelScope.launch {
            FileOperations.createFile(parent, name)
                .onSuccess {
                    reloadTree()
                    openFile(it)
                }
                .onFailure { _messages.send(it.message ?: "Could not create $name") }
        }
    }

    fun createDirectory(parent: File, name: String) {
        viewModelScope.launch {
            FileOperations.createDirectory(parent, name)
                .onSuccess { reloadTree() }
                .onFailure { _messages.send(it.message ?: "Could not create $name") }
        }
    }

    fun delete(file: File) {
        viewModelScope.launch {
            FileOperations.delete(file)
                .onSuccess {
                    val remaining = _openDocuments.value.filterNot {
                        it.file.absolutePath.startsWith(file.absolutePath)
                    }
                    if (remaining.size != _openDocuments.value.size) {
                        _openDocuments.value = remaining
                        _activeIndex.value = remaining.lastIndex
                    }
                    reloadTree()
                    _messages.send("Deleted ${file.name}")
                }
                .onFailure { _messages.send(it.message ?: "Could not delete ${file.name}") }
        }
    }

    fun rename(file: File, newName: String) {
        viewModelScope.launch {
            FileOperations.rename(file, newName)
                .onSuccess {
                    reloadTree()
                    _messages.send("Renamed to $newName")
                }
                .onFailure { _messages.send(it.message ?: "Could not rename ${file.name}") }
        }
    }
}
