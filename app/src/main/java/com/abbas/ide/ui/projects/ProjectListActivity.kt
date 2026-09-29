package com.abbas.ide.ui.projects

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.abbas.ide.R
import com.abbas.ide.core.model.Project
import com.abbas.ide.core.model.ProjectType
import com.abbas.ide.core.template.TemplateRegistry
import com.abbas.ide.databinding.ActivityProjectListBinding
import com.abbas.ide.databinding.DialogNewProjectBinding
import com.abbas.ide.ui.common.showSnack
import com.abbas.ide.ui.editor.WorkspaceActivity
import com.abbas.ide.ui.settings.SettingsActivity
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/** Landing screen: the list of known projects plus project creation. */
class ProjectListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProjectListBinding
    private val viewModel: ProjectListViewModel by viewModels()

    private val adapter = ProjectAdapter(
        onClick = ::openProject,
        onLongClick = ::confirmRemove,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // The toolbar is used directly (not as the support action bar) so the
        // menu declared in XML stays under this activity's control.
        binding.toolbar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.action_settings -> {
                    startActivity(Intent(this, SettingsActivity::class.java))
                    true
                }

                R.id.action_refresh -> {
                    viewModel.refresh()
                    true
                }

                else -> false
            }
        }

        binding.projectList.layoutManager = LinearLayoutManager(this)
        binding.projectList.adapter = adapter
        binding.newProjectButton.setOnClickListener { showNewProjectDialog() }
        binding.swipeRefresh.setOnRefreshListener { viewModel.refresh() }

        observeState()
    }

    override fun onResume() {
        super.onResume()
        viewModel.refresh()
    }

    private fun observeState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    viewModel.projects.collectLatest { projects ->
                        adapter.submitList(projects)
                        binding.emptyState.visibility =
                            if (projects.isEmpty()) View.VISIBLE else View.GONE
                    }
                }
                launch {
                    viewModel.isLoading.collectLatest { loading ->
                        binding.swipeRefresh.isRefreshing = loading
                    }
                }
                launch {
                    viewModel.messages.collectLatest { binding.root.showSnack(it) }
                }
            }
        }
    }

    private fun openProject(project: Project) {
        if (!project.isValid()) {
            binding.root.showSnack(getString(R.string.project_folder_missing))
            viewModel.refresh()
            return
        }
        viewModel.openProject(project)
        startActivity(WorkspaceActivity.intent(this, project.root.absolutePath, project.name))
    }

    private fun confirmRemove(project: Project) {
        AlertDialog.Builder(this)
            .setTitle(project.name)
            .setMessage(R.string.remove_project_message)
            .setPositiveButton(R.string.remove) { _, _ -> viewModel.removeFromList(project) }
            .setNegativeButton(R.string.cancel, null)
            .show()
    }

    private fun showNewProjectDialog() {
        val dialogBinding = DialogNewProjectBinding.inflate(layoutInflater)
        val templates = TemplateRegistry.templates

        dialogBinding.templateSpinner.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            templates.map { it.displayName },
        )

        val dialog = AlertDialog.Builder(this)
            .setTitle(R.string.new_project)
            .setView(dialogBinding.root)
            .setPositiveButton(R.string.create, null)
            .setNegativeButton(R.string.cancel, null)
            .create()

        dialog.setOnShowListener {
            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
                val name = dialogBinding.projectNameInput.text?.toString().orEmpty().trim()
                val error = viewModel.validateName(name)
                if (error != null) {
                    dialogBinding.projectNameLayout.error = error
                    return@setOnClickListener
                }
                dialogBinding.projectNameLayout.error = null

                val selected = dialogBinding.templateSpinner.selectedItemPosition
                val type = templates.getOrNull(selected)?.type ?: ProjectType.PLAIN_FOLDER
                viewModel.createProject(name, type)
                dialog.dismiss()
            }
        }

        dialog.show()
    }
}
