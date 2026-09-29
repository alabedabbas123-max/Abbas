package com.abbas.ide.core.template

import com.abbas.ide.core.model.ProjectType

private const val DOLLAR = "$"

object AndroidAppTemplate : ProjectTemplate {
    override val type = ProjectType.ANDROID_APP
    override val displayName = "Android App"
    override val description = "Gradle + Kotlin app with a single activity"

    override fun files(name: String, packageName: String): Map<String, String> {
        val pkgPath = packageName.replace('.', '/')
        return mapOf(
            "settings.gradle.kts" to """
                pluginManagement {
                    repositories {
                        google()
                        mavenCentral()
                        gradlePluginPortal()
                    }
                }
                dependencyResolutionManagement {
                    repositories {
                        google()
                        mavenCentral()
                    }
                }
                rootProject.name = "$name"
                include(":app")
            """.trimIndent(),

            "build.gradle.kts" to """
                plugins {
                    id("com.android.application") version "8.5.2" apply false
                    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
                }
            """.trimIndent(),

            "gradle.properties" to """
                org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8
                android.useAndroidX=true
                android.nonTransitiveRClass=true
                kotlin.code.style=official
            """.trimIndent(),

            "app/build.gradle.kts" to """
                plugins {
                    id("com.android.application")
                    id("org.jetbrains.kotlin.android")
                }

                android {
                    namespace = "$packageName"
                    compileSdk = 34

                    defaultConfig {
                        applicationId = "$packageName"
                        minSdk = 24
                        targetSdk = 34
                        versionCode = 1
                        versionName = "1.0"
                    }

                    buildFeatures {
                        viewBinding = true
                    }

                    compileOptions {
                        sourceCompatibility = JavaVersion.VERSION_17
                        targetCompatibility = JavaVersion.VERSION_17
                    }

                    kotlinOptions {
                        jvmTarget = "17"
                    }
                }

                dependencies {
                    implementation("androidx.core:core-ktx:1.13.1")
                    implementation("androidx.appcompat:appcompat:1.7.0")
                    implementation("com.google.android.material:material:1.12.0")
                }
            """.trimIndent(),

            "app/src/main/AndroidManifest.xml" to """
                <?xml version="1.0" encoding="utf-8"?>
                <manifest xmlns:android="http://schemas.android.com/apk/res/android">

                    <application
                        android:allowBackup="true"
                        android:label="@string/app_name"
                        android:supportsRtl="true"
                        android:theme="@style/Theme.Material3.DayNight.NoActionBar">

                        <activity
                            android:name=".MainActivity"
                            android:exported="true">
                            <intent-filter>
                                <action android:name="android.intent.action.MAIN" />
                                <category android:name="android.intent.category.LAUNCHER" />
                            </intent-filter>
                        </activity>
                    </application>
                </manifest>
            """.trimIndent(),

            "app/src/main/java/$pkgPath/MainActivity.kt" to """
                package $packageName

                import android.os.Bundle
                import androidx.appcompat.app.AppCompatActivity

                class MainActivity : AppCompatActivity() {

                    override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContentView(R.layout.activity_main)
                    }
                }
            """.trimIndent(),

            "app/src/main/res/layout/activity_main.xml" to """
                <?xml version="1.0" encoding="utf-8"?>
                <FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent">

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_gravity="center"
                        android:text="@string/hello" />
                </FrameLayout>
            """.trimIndent(),

            "app/src/main/res/values/strings.xml" to """
                <?xml version="1.0" encoding="utf-8"?>
                <resources>
                    <string name="app_name">$name</string>
                    <string name="hello">Hello from $name</string>
                </resources>
            """.trimIndent(),

            ".gitignore" to defaultGitignore(),
        )
    }
}

object KotlinConsoleTemplate : ProjectTemplate {
    override val type = ProjectType.KOTLIN_CONSOLE
    override val displayName = "Kotlin Console"
    override val description = "Single-file Kotlin program with a main function"

    override fun files(name: String, packageName: String): Map<String, String> = mapOf(
        "src/Main.kt" to """
            fun main() {
                println("Hello from $name")

                val numbers = (1..5).map { it * it }
                numbers.forEach { value ->
                    println("square: $DOLLAR{value}")
                }
            }
        """.trimIndent(),
        "README.md" to "# $name\n\nA Kotlin console project.\n",
        ".gitignore" to defaultGitignore(),
    )
}

object JavaConsoleTemplate : ProjectTemplate {
    override val type = ProjectType.JAVA_CONSOLE
    override val displayName = "Java Console"
    override val description = "Single-file Java program with a main method"

    override fun files(name: String, packageName: String): Map<String, String> = mapOf(
        "src/Main.java" to """
            public class Main {

                public static void main(String[] args) {
                    System.out.println("Hello from $name");

                    for (int i = 1; i <= 5; i++) {
                        System.out.println("square: " + (i * i));
                    }
                }
            }
        """.trimIndent(),
        "README.md" to "# $name\n\nA Java console project.\n",
        ".gitignore" to defaultGitignore(),
    )
}

object EmptyFolderTemplate : ProjectTemplate {
    override val type = ProjectType.PLAIN_FOLDER
    override val displayName = "Empty Project"
    override val description = "Just a folder and a README"

    override fun files(name: String, packageName: String): Map<String, String> = mapOf(
        "README.md" to "# $name\n",
        ".gitignore" to defaultGitignore(),
    )
}

private fun defaultGitignore(): String = """
    .gradle/
    build/
    local.properties
    .idea/
    *.iml
    *.apk
""".trimIndent()
