package java;


import HashTable.type.HashTable;
import HashTable.methods.RepeatedWord;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    HashTable<Integer> hashTest = new HashTable<Integer>();
    HashTable<Integer> hashEdge = new HashTable<Integer>();
    RepeatedWord word = new RepeatedWord();
    String text = "By an outlived insisted procured improved am. Paid hill fine ten now love even leaf." +
            " Supplied " +
            "feelings mr of dissuade recurred no it offering honoured. " +
            "Am of of in collecting devonshire favourable excellence. " +
            "Her sixteen end ashamed cottage yet reached get hearing invited." +
            " Resources ourselves sweetness ye do no perfectly." +
            " Warmly warmth six one any wisdom. Family giving is pulled beauty chatty highly no." +
            " Blessing appetite domestic did mrs judgment rendered entirely. Highly indeed had garden not. ";
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



//    @Test
//    public void emptyWord(){
//       assertNotNull(text);
//    }
//
//    @Test
//    public void wordTest(){
//
//    }
}
