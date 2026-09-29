package com.abbas.ide.core.io

import com.abbas.ide.core.model.FileNode
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.IOException

/**
 * All blocking file access funnels through here so the UI layer never touches
 * the disk on the main thread.
 */
object FileOperations {

    /** Files larger than this are refused by the editor to avoid OOM on low-end devices. */
    const val MAX_EDITABLE_SIZE_BYTES: Long = 4L * 1024 * 1024

    private val TEXT_EXTENSIONS = setOf(
        "txt", "md", "markdown", "java", "kt", "kts", "xml", "json", "gradle",
        "properties", "pro", "yml", "yaml", "gitignore", "cfg", "ini", "toml",
        "html", "htm", "css", "js", "ts", "c", "cpp", "h", "hpp", "py", "rb",
        "sh", "bat", "sql", "csv", "log", "lua", "go", "rs", "php", "swift",
    )

    fun isProbablyText(file: File): Boolean {
        if (file.extension.isEmpty()) return file.name.startsWith(".")
        return file.extension.lowercase() in TEXT_EXTENSIONS
    }

    suspend fun readText(file: File): Result<String> = withContext(Dispatchers.IO) {
        runCatching {
            if (!file.isFile) throw IOException("Not a file: ${file.absolutePath}")
            if (file.length() > MAX_EDITABLE_SIZE_BYTES) {
                throw IOException("File is too large to open (${file.length()} bytes)")
            }
            file.readText()
        }
    }

    suspend fun writeText(file: File, text: String): Result<Unit> = withContext(Dispatchers.IO) {
        runCatching {
            file.parentFile?.mkdirs()
            // Write to a temp file first so an interrupted save cannot truncate
            // the user's source file.
            val temp = File(file.parentFile, "${file.name}.tmp")
            temp.writeText(text)
            if (!temp.renameTo(file)) {
                file.writeText(text)
                temp.delete()
            }
            Unit
        }
    }

    suspend fun createFile(parent: File, name: String): Result<File> = withContext(Dispatchers.IO) {
        runCatching {
            val target = File(parent, name)
            if (target.exists()) throw IOException("Already exists: $name")
            target.parentFile?.mkdirs()
            if (!target.createNewFile()) throw IOException("Could not create $name")
            target
        }
    }

    suspend fun createDirectory(parent: File, name: String): Result<File> =
        withContext(Dispatchers.IO) {
            runCatching {
                val target = File(parent, name)
                if (target.exists()) throw IOException("Already exists: $name")
                if (!target.mkdirs()) throw IOException("Could not create folder $name")
                target
            }
        }

    suspend fun delete(file: File): Result<Unit> = withContext(Dispatchers.IO) {
        runCatching {
            val ok = if (file.isDirectory) file.deleteRecursively() else file.delete()
            if (!ok) throw IOException("Could not delete ${file.name}")
            Unit
        }
    }

    suspend fun rename(file: File, newName: String): Result<File> = withContext(Dispatchers.IO) {
        runCatching {
            val target = File(file.parentFile, newName)
            if (target.exists()) throw IOException("Already exists: $newName")
            if (!file.renameTo(target)) throw IOException("Could not rename ${file.name}")
            target
        }
    }

    /** Lists one directory level, folders first then files, both alphabetically. */
    suspend fun listChildren(dir: File, depth: Int): List<FileNode> = withContext(Dispatchers.IO) {
        val children = dir.listFiles().orEmpty()
        children
            .sortedWith(compareBy({ !it.isDirectory }, { it.name.lowercase() }))
            .map { FileNode(file = it, depth = depth) }
    }
}
