// com.Main
package com.database;

import com.database.Database;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();

        database.put("user1", "password123");
        database.put("user2", "securePassword");

        System.out.println("Password for user1: " + database.get("user1"));
        System.out.println("Password for user2: " + database.get("user2"));
    }
}
