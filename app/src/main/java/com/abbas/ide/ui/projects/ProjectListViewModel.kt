package com.abbas.ide.ui.projects

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.abbas.ide.AbbasApplication
import com.abbas.ide.core.model.Project
import com.abbas.ide.core.model.ProjectType
import com.abbas.ide.core.project.ProjectCreator
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class ProjectListViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = (application as AbbasApplication).projectRepository

    private val _projects = MutableStateFlow<List<Project>>(emptyList())
    val projects: StateFlow<List<Project>> = _projects.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private val _messages = Channel<String>(Channel.BUFFERED)
    val messages = _messages.receiveAsFlow()

    init {
        refresh()
    }

    fun refresh() {
        viewModelScope.launch {
            _isLoading.value = true
            _projects.value = repository.loadProjects()
            _isLoading.value = false
        }
    }

    fun createProject(name: String, type: ProjectType) {
        viewModelScope.launch {
            ProjectCreator.create(
                workspace = repository.workspaceDirectory(),
                name = name,
                type = type,
            ).onSuccess { project ->
                repository.saveProject(project)
                refresh()
                _messages.send("Created ${project.name}")
            }.onFailure { error ->
                _messages.send(error.message ?: "Could not create the project")
            }
        }
    }

    fun openProject(project: Project) {
        viewModelScope.launch { repository.touch(project) }
    }

    fun removeFromList(project: Project) {
        viewModelScope.launch {
            repository.removeProject(project)
            refresh()
            _messages.send("Removed ${project.name} from the list")
        }
    }

    fun validateName(name: String): String? = ProjectCreator.validateName(name)
}
