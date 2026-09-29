package com.abbas.ide

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.PreferenceManager
import com.abbas.ide.core.project.ProjectRepository

class AbbasApplication : Application() {

    /** Single repository instance shared by every screen. */
    val projectRepository: ProjectRepository by lazy { ProjectRepository(this) }

    override fun onCreate() {
        super.onCreate()
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
    }
}
