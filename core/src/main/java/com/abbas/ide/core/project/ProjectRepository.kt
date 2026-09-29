package com.abbas.ide.core.project

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.abbas.ide.core.model.Project
import com.abbas.ide.core.model.ProjectType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.io.File

/**
 * Stores the list of known projects.
 *
 * Metadata lives in SharedPreferences as JSON; the source of truth for content
 * is always the folder on disk, so deleting the app never corrupts user code.
 */
class ProjectRepository(context: Context) {

    private val prefs: SharedPreferences =
        context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    private val workspaceRoot: File =
        File(context.applicationContext.getExternalFilesDir(null) ?: context.filesDir, "projects")

    fun workspaceDirectory(): File = workspaceRoot.apply { mkdirs() }

    suspend fun loadProjects(): List<Project> = withContext(Dispatchers.IO) {
        val raw = prefs.getString(KEY_PROJECTS, null) ?: return@withContext emptyList()
        val parsed = runCatching { JSONArray(raw) }.getOrNull() ?: return@withContext emptyList()

        buildList {
            for (i in 0 until parsed.length()) {
                val obj = parsed.optJSONObject(i) ?: continue
                val path = obj.optString(FIELD_PATH).takeIf { it.isNotEmpty() } ?: continue
                val dir = File(path)
                if (!dir.isDirectory) continue // silently drop projects the user deleted
                add(
                    Project(
                        name = obj.optString(FIELD_NAME, dir.name),
                        root = dir,
                        type = ProjectType.fromId(obj.optString(FIELD_TYPE)),
                        lastOpenedAt = obj.optLong(FIELD_LAST_OPENED, 0L),
                    )
                )
            }
        }.sortedByDescending { it.lastOpenedAt }
    }

    suspend fun saveProject(project: Project) {
        val current = loadProjects().filterNot { it.path == project.path }
        persist(listOf(project) + current)
    }

    suspend fun removeProject(project: Project) {
        persist(loadProjects().filterNot { it.path == project.path })
    }

    suspend fun touch(project: Project) {
        saveProject(project.copy(lastOpenedAt = System.currentTimeMillis()))
    }

    private suspend fun persist(projects: List<Project>) = withContext(Dispatchers.IO) {
        val array = JSONArray()
        projects.forEach { project ->
            array.put(
                JSONObject().apply {
                    put(FIELD_NAME, project.name)
                    put(FIELD_PATH, project.path)
                    put(FIELD_TYPE, project.type.id)
                    put(FIELD_LAST_OPENED, project.lastOpenedAt)
                }
            )
        }
        prefs.edit { putString(KEY_PROJECTS, array.toString()) }
    }

    private companion object {
        const val PREFS_NAME = "abbas_projects"
        const val KEY_PROJECTS = "projects"
        const val FIELD_NAME = "name"
        const val FIELD_PATH = "path"
        const val FIELD_TYPE = "type"
        const val FIELD_LAST_OPENED = "lastOpened"
    }
}
