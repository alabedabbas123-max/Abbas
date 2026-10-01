package javax.tools;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public enum StandardLocation implements JavaFileManager.Location {
    CLASS_OUTPUT,
    SOURCE_OUTPUT,
    CLASS_PATH,
    SOURCE_PATH,
    ANNOTATION_PROCESSOR_PATH,
    PLATFORM_CLASS_PATH;

    private static ConcurrentMap<String, JavaFileManager.Location> locations = new ConcurrentHashMap();

    public static JavaFileManager.Location locationFor(final String name) {
        if (locations.isEmpty()) {
            for (JavaFileManager.Location location : values()) {
                locations.putIfAbsent(location.getName(), location);
            }
        }
        locations.putIfAbsent(name.toString(), new JavaFileManager.Location() {
            @Override
            public String getName() {
                return name;
            }

            @Override
            public boolean isOutputLocation() {
                return name.endsWith("_OUTPUT");
            }
        });
        return locations.get(name);
    }

    @Override
    public String getName() {
        return name();
    }

    @Override
    public boolean isOutputLocation() {
        return this == CLASS_OUTPUT || this == SOURCE_OUTPUT;
    }
}
