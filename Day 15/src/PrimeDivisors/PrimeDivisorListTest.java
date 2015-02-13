package PrimeDivisors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PrimeDivisorListTest {

    private PrimeDivisorList list;

    public  PrimeDivisorListTest(){
        list = new PrimeDivisorListImpl();
    }

    @Before
    public void setUp() throws Exception {
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
    }

    @After
    public void tearDown() throws Exception {
        list = null;
    }

    @Test
    public void testAddNull(){
        list.add(null);
    }

    @Test
    public void testAdd()  {
        list.add(4);
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("[ 2 * 3 * 5 * 7 = 210 ]", list.toString());
    }
}