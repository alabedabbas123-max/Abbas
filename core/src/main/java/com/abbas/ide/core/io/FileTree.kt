package com.abbas.ide.core.io

import com.abbas.ide.core.model.FileNode
import java.io.File

/**
 * Keeps the flattened, expandable representation of the project explorer.
 *
 * The tree is stored as a flat list because a RecyclerView renders a flat list
 * far more cheaply than nested containers, and indentation is derived from
 * [FileNode.depth].
 */
class FileTree(private val root: File) {

    private val nodes = mutableListOf<FileNode>()
    private val expandedPaths = mutableSetOf<String>()

    /** Current visible nodes, in display order. */
    val visibleNodes: List<FileNode> get() = nodes.toList()

    suspend fun reload() {
        nodes.clear()
        nodes += FileNode(file = root, depth = 0, isExpanded = true)
        expandedPaths += root.absolutePath
        insertChildren(root, depth = 1, insertAt = 1)
    }

    /** Expands or collapses [node]; returns true when the tree changed. */
    suspend fun toggle(node: FileNode): Boolean {
        if (!node.isDirectory) return false
        val index = nodes.indexOfFirst { it.key == node.key }
        if (index < 0) return false

        return if (node.key in expandedPaths) {
            collapse(index, node)
            true
        } else {
            expandedPaths += node.key
            nodes[index] = node.copy(isExpanded = true)
            insertChildren(node.file, node.depth + 1, index + 1)
            true
        }
    }

    private fun collapse(index: Int, node: FileNode) {
        expandedPaths -= node.key
        nodes[index] = node.copy(isExpanded = false)

        // Remove every following node that is deeper than this one.
        var end = index + 1
        while (end < nodes.size && nodes[end].depth > node.depth) {
            expandedPaths -= nodes[end].key
            end++
        }
        if (end > index + 1) nodes.subList(index + 1, end).clear()
    }

    /**
     * Inserts the children of [dir] at [insertAt], restoring the expanded state
     * that was remembered in [expandedPaths].
     *
     * Children are added one by one so the insertion cursor stays correct while
     * nested expansions push nodes further down the list.
     */
    private suspend fun insertChildren(dir: File, depth: Int, insertAt: Int) {
        val children = FileOperations.listChildren(dir, depth).map { child ->
            if (child.isDirectory && child.key in expandedPaths) {
                child.copy(isExpanded = true)
            } else {
                child
            }
        }

        var cursor = insertAt
        for (child in children) {
            nodes.add(cursor, child)
            cursor++
            if (child.isDirectory && child.isExpanded) {
                val sizeBefore = nodes.size
                insertChildren(child.file, depth + 1, cursor)
                cursor += nodes.size - sizeBefore
            }
        }
    }
}
