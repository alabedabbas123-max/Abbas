package com.abbas.ide.ui.projects

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.abbas.ide.core.model.Project
import com.abbas.ide.databinding.ItemProjectBinding

class ProjectAdapter(
    private val onClick: (Project) -> Unit,
    private val onLongClick: (Project) -> Unit,
) : ListAdapter<Project, ProjectAdapter.ProjectViewHolder>(DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val binding = ItemProjectBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        )
        return ProjectViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ProjectViewHolder(
        private val binding: ItemProjectBinding,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(project: Project) {
            binding.projectName.text = project.name
            binding.projectPath.text = project.path
            binding.projectType.text = project.type.label

            binding.root.setOnClickListener { onClick(project) }
            binding.root.setOnLongClickListener {
                onLongClick(project)
                true
            }
        }
    }

    private companion object {
        val DIFF = object : DiffUtil.ItemCallback<Project>() {
            override fun areItemsTheSame(oldItem: Project, newItem: Project): Boolean =
                oldItem.path == newItem.path

            override fun areContentsTheSame(oldItem: Project, newItem: Project): Boolean =
                oldItem == newItem
        }
    }
}
