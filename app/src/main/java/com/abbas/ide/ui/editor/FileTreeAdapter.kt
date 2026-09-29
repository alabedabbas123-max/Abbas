package com.abbas.ide.ui.editor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.abbas.ide.R
import com.abbas.ide.core.model.FileNode
import com.abbas.ide.databinding.ItemFileNodeBinding

class FileTreeAdapter(
    private val onClick: (FileNode) -> Unit,
    private val onLongClick: (FileNode) -> Unit,
) : ListAdapter<FileNode, FileTreeAdapter.NodeViewHolder>(DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NodeViewHolder {
        val binding = ItemFileNodeBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        )
        return NodeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NodeViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class NodeViewHolder(
        private val binding: ItemFileNodeBinding,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(node: FileNode) {
            binding.nodeName.text = node.name

            val density = binding.root.resources.displayMetrics.density
            binding.nodeIndent.layoutParams = binding.nodeIndent.layoutParams.apply {
                width = (node.depth * INDENT_DP * density).toInt()
            }

            binding.nodeIcon.setImageResource(
                when {
                    node.isDirectory && node.isExpanded -> R.drawable.ic_folder_open
                    node.isDirectory -> R.drawable.ic_folder
                    else -> R.drawable.ic_file
                }
            )

            binding.nodeExpand.visibility = if (node.isDirectory) View.VISIBLE else View.INVISIBLE
            binding.nodeExpand.rotation = if (node.isExpanded) 90f else 0f

            binding.root.setOnClickListener { onClick(node) }
            binding.root.setOnLongClickListener {
                onLongClick(node)
                true
            }
        }
    }

    private companion object {
        const val INDENT_DP = 14

        val DIFF = object : DiffUtil.ItemCallback<FileNode>() {
            override fun areItemsTheSame(oldItem: FileNode, newItem: FileNode): Boolean =
                oldItem.key == newItem.key

            override fun areContentsTheSame(oldItem: FileNode, newItem: FileNode): Boolean =
                oldItem.key == newItem.key &&
                    oldItem.isExpanded == newItem.isExpanded &&
                    oldItem.depth == newItem.depth
        }
    }
}
