# Keep line numbers for readable crash reports.
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# Views inflated from XML are referenced by name only.
-keep public class * extends android.view.View {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

# Preference screens are built reflectively from XML.
-keep class * extends androidx.preference.Preference { *; }
