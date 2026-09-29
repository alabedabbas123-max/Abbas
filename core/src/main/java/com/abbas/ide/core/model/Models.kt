package com.abbas.ide.core.model

import java.io.File

/**
 * A workspace project: a root directory on disk plus lightweight metadata.
 *
 * The IDE deliberately keeps no proprietary project format - a project is just
 * a folder, so anything created here stays usable by Gradle, Git and desktop IDEs.
 */
data class Project(
    val name: String,
    val root: File,
    val type: ProjectType,
    val lastOpenedAt: Long = System.currentTimeMillis(),
) {
    val path: String get() = root.absolutePath

    /** True when the folder still exists on disk. */
    fun isValid(): Boolean = root.isDirectory
}

enum class ProjectType(val id: String, val label: String) {
    ANDROID_APP("android_app", "Android App"),
    JAVA_CONSOLE("java_console", "Java Console"),
    KOTLIN_CONSOLE("kotlin_console", "Kotlin Console"),
    PLAIN_FOLDER("plain", "Folder");

    companion object {
        fun fromId(id: String?): ProjectType =
            entries.firstOrNull { it.id == id } ?: PLAIN_FOLDER
    }
}

/**
 * A node in the project explorer tree.
 *
 * [depth] is kept on the node so the tree can be flattened into a single
 * RecyclerView list without recursive view nesting.
 */
data class FileNode(
    val file: File,
    val depth: Int,
    val isDirectory: Boolean = file.isDirectory,
    var isExpanded: Boolean = false,
) {
    val name: String get() = file.name
    val key: String get() = file.absolutePath
}

/** An open editor buffer. */
data class EditorDocument(
    val file: File,
    val content: String,
    val isDirty: Boolean = false,
) {
    val name: String get() = file.name
    val extension: String get() = file.extension.lowercase()
}
