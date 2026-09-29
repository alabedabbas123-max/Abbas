package com.abbas.ide.core

import com.abbas.ide.core.project.ProjectCreator
import com.abbas.ide.core.template.TemplateRegistry
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test

class ProjectCreatorTest {

    @Test
    fun `accepts a normal project name`() {
        assertNull(ProjectCreator.validateName("My App 1"))
    }

    @Test
    fun `rejects an empty name`() {
        assertNotNull(ProjectCreator.validateName("   "))
    }

    @Test
    fun `rejects a name with a path separator`() {
        assertNotNull(ProjectCreator.validateName("bad/name"))
    }

    @Test
    fun `rejects a hidden name`() {
        assertNotNull(ProjectCreator.validateName(".hidden"))
    }

    @Test
    fun `derives a valid package name`() {
        assertEquals("com.example.my_app", ProjectCreator.defaultPackageName("My App"))
    }

    @Test
    fun `package segment never starts with a digit`() {
        assertEquals("app2", TemplateRegistry.sanitizePackageSegment("1App2"))
    }
}
