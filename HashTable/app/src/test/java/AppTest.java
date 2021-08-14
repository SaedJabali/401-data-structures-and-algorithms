package java;


import HashTable.type.HashTable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    HashTable<Integer> hashTest = new HashTable<Integer>();
    HashTable<Integer> hashEdge = new HashTable<Integer>();

    @Before
    public void stop() {
        hashTest.add("1", 1);
        hashTest.add("2", 2);
        hashTest.add("3", 3);
    }

    @Test
    public void hashTest() {
        assertEquals(Integer.valueOf(1), hashTest.get("1"));
    }

    @Test
    public void nullKey() {
        assertEquals(Integer.valueOf(1), hashTest.get("1"));
        assertEquals(Integer.valueOf(1), hashTest.remove("1"));
        assertNull(hashTest.get("1"));
    }

    @Test
    public void isEmpty() {
        assertFalse(hashTest.isEmpty());
        assertTrue(hashEdge.isEmpty());
    }

    @Test
    public void size() {
        assertEquals(3, hashTest.getSize());
    }

    @Test
    public void edgeCase() {
        assertEquals(0, hashEdge.getSize());
    }
}
