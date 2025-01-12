package altYapi.seleniumGauge.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Map;

public class JsonUtils {

    private static final String JSON_DIRECTORY = "src/test/resources/elementValues/";

    public static ElementLocator getElementLocator(String key) {
        File folder = new File(JSON_DIRECTORY);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".json"));

        if (files == null || files.length == 0) {
            throw new RuntimeException("JSON dosyaları bulunamadı: " + JSON_DIRECTORY);
        }

        for (File file : files) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                Map<String, ElementLocator> elements = mapper.readValue(
                        file, new com.fasterxml.jackson.core.type.TypeReference<Map<String, ElementLocator>>() {}
                );
                if (elements.containsKey(key)) {
                    return elements.get(key);
                }
            } catch (Exception e) {
                throw new RuntimeException("JSON dosyası okunamadı: " + file.getName(), e);
            }
        }

        throw new IllegalArgumentException("Element bulunamadı: " + key);
    }

    public static class ElementLocator {
        private String type;
        private String locator;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLocator() {
            return locator;
        }

        public void setLocator(String locator) {
            this.locator = locator;
        }
    }
}
