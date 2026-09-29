# Abbas IDE

A clean-room, on-device code editor for Android — written from scratch in Kotlin.

The goal is the same class of tool as a mobile IDE: browse a project, edit source
files with syntax highlighting, and keep everything in plain folders that Gradle,
Git and desktop IDEs can read.

> **Origin note.** This repository previously contained `Abbasid.zip`, a decompiled
> APK of a third-party commercial application. That archive has been removed. None
> of the code here derives from it — every file is original work. Features were
> designed from functional goals, which are not subject to copyright.

---

## Features

| Area | What works |
|---|---|
| **Projects** | Recent-projects list, create from template, remove, open |
| **Templates** | Android App (Gradle + Kotlin), Kotlin Console, Java Console, Empty |
| **Explorer** | Lazy expandable file tree, create / rename / delete files and folders |
| **Editor** | Multi-tab buffers, dirty markers, save / save-all, auto-save on leave |
| **Highlighting** | Java, Kotlin, XML, JSON, Gradle, `.properties` / `.toml` |
| **Editing aids** | Line-number gutter, current-line highlight, undo/redo, auto-indent, bracket completion |
| **Settings** | Dark/light editor theme, font size, indent width, wrap, toggles |
| **i18n** | Full English and Arabic strings, RTL-aware layouts |

---

## Module layout

```
Abbas/
├── app/      Android application: screens, adapters, ViewModels, resources
├── core/     Pure domain logic: project model, file IO, templates  (no UI)
└── editor/   Reusable CodeEditor view, highlighters, themes, undo stack
```

Dependencies flow one way only: `app → editor → core`. `core` has no Android UI
dependency, so its logic is unit-testable on the JVM.

### Key types

| Type | Module | Responsibility |
|---|---|---|
| `Project`, `FileNode`, `EditorDocument` | core | Immutable domain models |
| `FileOperations` | core | All blocking disk IO, always off the main thread |
| `FileTree` | core | Flattened expand/collapse tree for the explorer |
| `ProjectRepository` | core | Persists the project list as JSON |
| `ProjectCreator` + `TemplateRegistry` | core | Scaffolds new projects |
| `CodeEditor` | editor | `AppCompatEditText` subclass: gutter, spans, indent |
| `RegexSyntaxHighlighter` | editor | Ordered, non-overlapping regex tokenizer |
| `UndoManager` | editor | Bounded history with keystroke coalescing |
| `WorkspaceViewModel` | app | Single source of truth for one open project |

---

## Building

Requirements: **JDK 17**, **Android SDK with platform 34**.

The Gradle wrapper JAR is intentionally not committed (binaries are kept out of
Git). Generate it once, then use `./gradlew` as usual:

```bash
gradle wrapper --gradle-version 8.7
./gradlew assembleDebug
```

If you have Gradle 8.x installed you can also skip the wrapper entirely:

```bash
gradle assembleDebug        # debug APK -> app/build/outputs/apk/debug/
gradle testDebugUnitTest    # unit tests
gradle lintDebug            # Android lint
```

Opening the folder in Android Studio (Koala or newer) works out of the box — it
creates the wrapper and `local.properties` for you.

### Version matrix

| Component | Version |
|---|---|
| Android Gradle Plugin | 8.5.2 |
| Gradle | 8.7 |
| Kotlin | 1.9.24 |
| compileSdk / targetSdk | 34 |
| minSdk | 24 (Android 7.0) |
| Java / JVM target | 17 |

All dependency versions live in [`gradle/libs.versions.toml`](gradle/libs.versions.toml)
so there is exactly one place to bump them.

---

## Design decisions

**Why extend `AppCompatEditText` instead of drawing text manually?**
The platform text engine already handles the IME, selection handles, RTL, magnifier
and accessibility correctly. Re-implementing that is where most hand-rolled Android
editors break. `CodeEditor` adds only the code-specific layer on top: a gutter drawn
in `onDraw`, colour spans applied on a debounced pass, and an undo stack.

**Why regex highlighting instead of a real parser?**
It is predictable, allocation-light and easy to extend — add a `Rule` and you have a
new language. Rule order encodes precedence, so a keyword inside a comment stays a
comment. A file over 200 KB skips highlighting so typing never stutters.

**Why no proprietary project format?**
A project is just a directory. Nothing here locks your code into this app.

---

## Testing

```bash
gradle testDebugUnitTest
```

Unit tests cover project-name validation, package-name derivation, highlighter
resolution, and the tokenizer's ordering / non-overlap guarantees.

## Roadmap

- [ ] Find and replace, with regex
- [ ] Storage Access Framework support for projects outside app storage
- [ ] Git status column in the explorer
- [ ] Code completion for open buffers
- [ ] Editor-level split view for large screens

## License

See [`LICENSE`](LICENSE).
