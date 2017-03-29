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

    @Test(expected = ExistenceException.class)
    public void testGetFail() throws ExistenceException{
        System.out.println("getFail");
        instance.get();
    }
    
    @Test(expected = ExistenceException.class)
    public void testShowFail() throws ExistenceException{
        System.out.println("showFail");
        instance.show();
    }
    
    @Test
    public void testShow() throws ExistenceException{
        System.out.println("show");
        int expResult = 10;
        instance.put(10);
        instance.put(20);
        instance.put(30);
        assertEquals(expResult, instance.show());
    }
    
    @Test
    public void testGet() throws ExistenceException{
        System.out.println("get");
        int expResult = 20;
        instance.put(10);
        instance.put(20);
        instance.put(30);
        instance.get();
        assertEquals(expResult, instance.show());
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
