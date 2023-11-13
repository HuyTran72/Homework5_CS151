// com.database.Database
package com.database;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Database instance;
    private Map<String, String> data;

    private Database() {
        data = new HashMap<>();
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void put(String key, String value) {
        data.put(key, value);
    }

    public String get(String key) {
        return data.get(key);
    }
}
