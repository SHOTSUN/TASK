package by.BNTU.FITR.RAINSUN.model.entity.collsections;

import by.BNTU.FITR.RAINSUN.model.exceptions.ExistenceException;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class QueueOfListTest {
    
    private  QueueOfList instance;

    @Before
    public void init() {
        instance = new  QueueOfList();
        System.out.println("INIT");
    }

    @After
    public void clear() {
        instance = null;
        System.out.println("CLEARED");
    }

    @Test
    public void testPut() {
        System.out.println("put");
        int expResult = 10;
        instance.put(10);
        try {
            assertEquals(expResult, instance.show());
        } catch (ExistenceException e) {
        }
        
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "\n10\t";
        instance.put(10);
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testToEmptyString() {
        System.out.println("toString");
        String expResult = "QUEUE HAS NO ELEMENTS";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
