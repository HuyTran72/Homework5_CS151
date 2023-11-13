package com.database;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DatabaseTest {

    @Test
    public void testGetInstance() {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();

        assertNotNull(database1);
        assertNotNull(database2);
        assertEquals(database1, database2);
    }

    @Test
    public void testPutAndGet() {
        Database database = Database.getInstance();
        database.put("testUser", "testPassword");

        assertEquals("testPassword", database.get("testUser"));
    }
}
