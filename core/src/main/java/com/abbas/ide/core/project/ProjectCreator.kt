package com.abbas.ide.core.project

import com.abbas.ide.core.model.Project
import com.abbas.ide.core.model.ProjectType
import com.abbas.ide.core.template.TemplateRegistry
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.IOException

/** Materialises a [com.abbas.ide.core.template.ProjectTemplate] onto disk. */
object ProjectCreator {

    private val VALID_NAME = Regex("[A-Za-z0-9 _.\\-]{1,64}")

    fun validateName(name: String): String? = when {
        name.isBlank() -> "Name cannot be empty"
        !VALID_NAME.matches(name) -> "Use letters, digits, spaces, dot, dash or underscore"
        name.startsWith(".") -> "Name cannot start with a dot"
        else -> null
    }

    suspend fun create(
        workspace: File,
        name: String,
        type: ProjectType,
        packageName: String = defaultPackageName(name),
    ): Result<Project> = withContext(Dispatchers.IO) {
        runCatching {
            validateName(name)?.let { throw IOException(it) }

            val root = File(workspace, name.trim())
            if (root.exists()) throw IOException("A project named '$name' already exists")
            if (!root.mkdirs()) throw IOException("Could not create ${root.absolutePath}")

            val template = TemplateRegistry.byType(type)
            template.files(name.trim(), packageName).forEach { (relativePath, content) ->
                val target = File(root, relativePath)
                target.parentFile?.mkdirs()
                target.writeText(content.trimEnd() + "\n")
            }

            Project(name = name.trim(), root = root, type = type)
        }.onFailure {
            // Do not leave a half-written folder behind on failure.
            val root = File(workspace, name.trim())
            if (root.isDirectory && root.listFiles().isNullOrEmpty()) root.delete()
        }
    }

    fun defaultPackageName(projectName: String): String =
        "com.example." + TemplateRegistry.sanitizePackageSegment(projectName)
}
