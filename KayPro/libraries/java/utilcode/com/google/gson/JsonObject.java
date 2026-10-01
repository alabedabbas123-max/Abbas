package utilcode.com.google.gson;

import java.util.Map;
import java.util.Set;
import utilcode.com.google.gson.internal.LinkedTreeMap;

public final class JsonObject extends JsonElement {
    private final LinkedTreeMap<String, JsonElement> members = new LinkedTreeMap<>();

    private JsonElement createJsonElement(Object obj) {
        return obj == null ? JsonNull.INSTANCE : new JsonPrimitive(obj);
    }

    public void m563add(String str, JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.members.put(str, jsonElement);
    }

    public void addProperty(String str, Boolean bool) {
        m563add(str, createJsonElement(bool));
    }

    public void addProperty(String str, Character ch) {
        m563add(str, createJsonElement(ch));
    }

    public void addProperty(String str, Number number) {
        m563add(str, createJsonElement(number));
    }

    public void addProperty(String str, String str2) {
        m563add(str, createJsonElement(str2));
    }

    @Override
    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<String, JsonElement> entry : this.members.entrySet()) {
            jsonObject.m563add(entry.getKey(), entry.getValue().deepCopy());
        }
        return jsonObject;
    }

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.members.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonObject) && ((JsonObject) obj).members.equals(this.members));
    }

    public JsonElement m564get(String str) {
        return this.members.get(str);
    }

    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) this.members.get(str);
    }

    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) this.members.get(str);
    }

    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) this.members.get(str);
    }

    public boolean m565has(String str) {
        return this.members.containsKey(str);
    }

    public int hashCode() {
        return this.members.hashCode();
    }

    public Set<String> keySet() {
        return this.members.keySet();
    }

    public JsonElement remove(String str) {
        return this.members.remove(str);
    }

    public int size() {
        return this.members.size();
    }
}
