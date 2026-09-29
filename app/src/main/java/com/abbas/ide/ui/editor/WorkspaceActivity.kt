package com.abbas.ide.ui.editor

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.abbas.ide.R
import com.abbas.ide.core.model.EditorDocument
import com.abbas.ide.core.model.FileNode
import com.abbas.ide.data.EditorPreferences
import com.abbas.ide.databinding.ActivityWorkspaceBinding
import com.abbas.ide.databinding.DialogTextInputBinding
import com.abbas.ide.ui.common.showSnack
import com.google.android.material.tabs.TabLayout
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import java.io.File

/** The main IDE screen: project explorer on the side, tabbed editor in the middle. */
class WorkspaceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWorkspaceBinding
    private lateinit var preferences: EditorPreferences

    private val viewModel: WorkspaceViewModel by viewModels()

    private val treeAdapter = FileTreeAdapter(
        onClick = ::onNodeClicked,
        onLongClick = ::showNodeActions,
    )

    /** Guards against the editor echoing programmatic text updates back to the ViewModel. */
    private var isBindingDocument = false
    private var currentDocumentPath: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWorkspaceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preferences = EditorPreferences(this)

        val rootPath = intent.getStringExtra(EXTRA_PROJECT_PATH)
        val projectName = intent.getStringExtra(EXTRA_PROJECT_NAME).orEmpty()
        if (rootPath.isNullOrEmpty() || !File(rootPath).isDirectory) {
            finish()
            return
        }

        setupToolbar(projectName)
        setupExplorer()
        setupEditor()
        setupTabs()
        observeState()

        viewModel.initialise(File(rootPath))
        registerBackHandler()
    }

    override fun onResume() {
        super.onResume()
        applyEditorPreferences()
    }

    override fun onPause() {
        if (preferences.autoSave) viewModel.saveAll()
        super.onPause()
    }

    private fun setupToolbar(projectName: String) {
        binding.toolbar.title = projectName.ifEmpty { getString(R.string.app_name) }
        binding.toolbar.setNavigationOnClickListener {
            if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
                binding.drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                binding.drawerLayout.openDrawer(GravityCompat.START)
            }
        }
        binding.toolbar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.action_save -> {
                    viewModel.saveActive()
                    true
                }

                R.id.action_save_all -> {
                    viewModel.saveAll()
                    true
                }

                R.id.action_undo -> {
                    binding.codeEditor.undo()
                    true
                }

                R.id.action_redo -> {
                    binding.codeEditor.redo()
                    true
                }

                R.id.action_reload -> {
                    viewModel.reloadTree()
                    true
                }

                else -> false
            }
        }
    }

    private fun setupExplorer() {
        binding.fileTree.layoutManager = LinearLayoutManager(this)
        binding.fileTree.adapter = treeAdapter
        binding.newFileButton.setOnClickListener {
            val root = viewModel.projectRoot ?: return@setOnClickListener
            promptForName(R.string.new_file) { name -> viewModel.createFile(root, name) }
        }
        binding.newFolderButton.setOnClickListener {
            val root = viewModel.projectRoot ?: return@setOnClickListener
            promptForName(R.string.new_folder) { name -> viewModel.createDirectory(root, name) }
        }
    }

    private fun setupEditor() {
        binding.codeEditor.onContentChanged = {
            if (!isBindingDocument) {
                viewModel.updateActiveContent(binding.codeEditor.text?.toString().orEmpty())
                updateStatusBar()
            }
        }
        applyEditorPreferences()
        updateStatusBar()
    }

    private fun applyEditorPreferences() {
        with(binding.codeEditor) {
            theme = preferences.theme
            setFontSizeSp(preferences.fontSizeSp)
            showLineNumbers = preferences.showLineNumbers
            wordWrap = preferences.wordWrap
            autoIndent = preferences.autoIndent
            autoCloseBrackets = preferences.autoCloseBrackets
            tabSize = preferences.tabSize
        }
        binding.editorContainer.setBackgroundColor(preferences.theme.background)
    }

    private fun setupTabs() {
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewModel.selectTab(tab.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) = Unit

            override fun onTabReselected(tab: TabLayout.Tab) {
                showCloseTabDialog(tab.position)
            }
        })
    }

    private fun observeState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    viewModel.nodes.collectLatest { treeAdapter.submitList(it) }
                }
                launch {
                    viewModel.openDocuments.collectLatest { renderTabs(it) }
                }
                launch {
                    viewModel.activeIndex.collectLatest { index -> bindActiveDocument(index) }
                }
                launch {
                    viewModel.messages.collectLatest { binding.root.showSnack(it) }
                }
            }
        }
    }

    private fun renderTabs(documents: List<EditorDocument>) {
        val layout = binding.tabLayout
        val selected = layout.selectedTabPosition

        layout.removeAllTabs()
        documents.forEach { document ->
            val title = if (document.isDirty) "${document.name} •" else document.name
            layout.addTab(layout.newTab().setText(title), false)
        }

        val target = viewModel.activeIndex.value.takeIf { it in documents.indices }
            ?: selected.takeIf { it in documents.indices }
        if (target != null) layout.getTabAt(target)?.select()

        layout.visibility = if (documents.isEmpty()) View.GONE else View.VISIBLE
        binding.emptyEditorState.visibility = if (documents.isEmpty()) View.VISIBLE else View.GONE
        binding.codeEditor.visibility = if (documents.isEmpty()) View.GONE else View.VISIBLE
    }

    private fun bindActiveDocument(index: Int) {
        val document = viewModel.openDocuments.value.getOrNull(index)
        if (document == null) {
            currentDocumentPath = null
            isBindingDocument = true
            binding.codeEditor.setContent("", "")
            isBindingDocument = false
            updateStatusBar()
            return
        }

        // Only reload the buffer when the tab actually changed; otherwise every
        // keystroke would reset the caret to the top of the file.
        if (currentDocumentPath == document.file.absolutePath) {
            updateStatusBar()
            return
        }

        currentDocumentPath = document.file.absolutePath
        isBindingDocument = true
        binding.codeEditor.setContent(document.content, document.name)
        isBindingDocument = false
        updateStatusBar()
    }

    private fun updateStatusBar() {
        val document = viewModel.openDocuments.value.getOrNull(viewModel.activeIndex.value)
        binding.statusText.text = if (document == null) {
            getString(R.string.no_file_open)
        } else {
            getString(
                R.string.status_format,
                binding.codeEditor.currentLine(),
                binding.codeEditor.currentColumn(),
                document.extension.ifEmpty { "text" },
            )
        }
    }

    private fun onNodeClicked(node: FileNode) {
        if (node.isDirectory) {
            viewModel.toggleNode(node)
        } else {
            viewModel.openFile(node.file)
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }
    }

    private fun showNodeActions(node: FileNode) {
        val options = if (node.isDirectory) {
            arrayOf(
                getString(R.string.new_file),
                getString(R.string.new_folder),
                getString(R.string.rename),
                getString(R.string.delete),
            )
        } else {
            arrayOf(getString(R.string.rename), getString(R.string.delete))
        }

        AlertDialog.Builder(this)
            .setTitle(node.name)
            .setItems(options) { _, which ->
                when (options[which]) {
                    getString(R.string.new_file) ->
                        promptForName(R.string.new_file) { viewModel.createFile(node.file, it) }

                    getString(R.string.new_folder) ->
                        promptForName(R.string.new_folder) { viewModel.createDirectory(node.file, it) }

                    getString(R.string.rename) ->
                        promptForName(R.string.rename, node.name) { viewModel.rename(node.file, it) }

                    getString(R.string.delete) -> confirmDelete(node.file)
                }
            }
            .show()
    }

    private fun confirmDelete(file: File) {
        AlertDialog.Builder(this)
            .setTitle(R.string.delete)
            .setMessage(getString(R.string.delete_message, file.name))
            .setPositiveButton(R.string.delete) { _, _ -> viewModel.delete(file) }
            .setNegativeButton(R.string.cancel, null)
            .show()
    }

    private fun showCloseTabDialog(position: Int) {
        AlertDialog.Builder(this)
            .setMessage(R.string.close_tab_message)
            .setPositiveButton(R.string.close) { _, _ ->
                currentDocumentPath = null
                viewModel.closeTab(position)
            }
            .setNegativeButton(R.string.cancel, null)
            .show()
    }

    private fun promptForName(
        titleRes: Int,
        initialValue: String = "",
        onConfirm: (String) -> Unit,
    ) {
        val dialogBinding = DialogTextInputBinding.inflate(layoutInflater)
        dialogBinding.valueInput.setText(initialValue)

        AlertDialog.Builder(this)
            .setTitle(titleRes)
            .setView(dialogBinding.root)
            .setPositiveButton(R.string.ok) { _, _ ->
                val value = dialogBinding.valueInput.text?.toString().orEmpty().trim()
                if (value.isNotEmpty()) onConfirm(value)
            }
            .setNegativeButton(R.string.cancel, null)
            .show()
    }

    private fun registerBackHandler() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                    return
                }
                if (viewModel.hasUnsavedChanges()) {
                    AlertDialog.Builder(this@WorkspaceActivity)
                        .setMessage(R.string.unsaved_changes_message)
                        .setPositiveButton(R.string.save) { _, _ ->
                            viewModel.saveAll()
                            finish()
                        }
                        .setNegativeButton(R.string.discard) { _, _ -> finish() }
                        .setNeutralButton(R.string.cancel, null)
                        .show()
                    return
                }
                finish()
            }
        })
    }

    companion object {
        private const val EXTRA_PROJECT_PATH = "extra_project_path"
        private const val EXTRA_PROJECT_NAME = "extra_project_name"

        fun intent(context: Context, path: String, name: String): Intent =
            Intent(context, WorkspaceActivity::class.java).apply {
                putExtra(EXTRA_PROJECT_PATH, path)
                putExtra(EXTRA_PROJECT_NAME, name)
            }
    }
}
