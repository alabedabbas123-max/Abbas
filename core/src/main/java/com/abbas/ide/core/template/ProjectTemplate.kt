package com.abbas.ide.core.template

import com.abbas.ide.core.model.ProjectType

/**
 * A project scaffold: a set of relative paths mapped to their file contents.
 *
 * Templates are plain data so new ones can be added without touching the
 * creation logic in [ProjectCreator].
 */
interface ProjectTemplate {
    val type: ProjectType
    val displayName: String
    val description: String

    /** Returns relative-path -> file-content for a project called [name]. */
    fun files(name: String, packageName: String): Map<String, String>
}

object TemplateRegistry {

    val templates: List<ProjectTemplate> = listOf(
        AndroidAppTemplate,
        KotlinConsoleTemplate,
        JavaConsoleTemplate,
        EmptyFolderTemplate,
    )

    fun byType(type: ProjectType): ProjectTemplate =
        templates.firstOrNull { it.type == type } ?: EmptyFolderTemplate

    /**
     * Turns a human project name into a valid Java/Kotlin package suffix.
     * Falls back to "app" when nothing usable is left.
     */
    fun sanitizePackageSegment(name: String): String {
        val cleaned = name.lowercase()
            .map { if (it.isLetterOrDigit()) it else '_' }
            .joinToString("")
            .trim('_')
        val withoutLeadingDigit = cleaned.dropWhile { it.isDigit() }
        return withoutLeadingDigit.ifEmpty { "app" }
    }
}
