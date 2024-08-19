package ru.borisov.datastoregrpcmicroservice.config;

import java.util.Objects;

public class KeyHelper {

    private static final String DEFAULT_PREFIX = "app";
    private static String prefix = null;

    public static void setPrefix(String keyPrefix) {
        prefix = keyPrefix;
    }

    public static String getKey(String key) {

        return getPrefix() + ":" + key;
    }

    private static String getPrefix() {

        return Objects.requireNonNullElse(prefix, DEFAULT_PREFIX);
    }

}
