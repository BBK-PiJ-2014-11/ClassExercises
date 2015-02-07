package Library;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    private User bateman;
    private Library library;

    @Before
    public void setUp() {
        bateman = new UserImpl("Patrick Bateman");
        library = new LibraryImpl("newLibrary");
    }

    @After
    public void killBateman() {
        bateman = null;
    }

    @Test
    public void testGetName() {
        assertEquals(bateman.getName(), "Patrick Bateman");
    }

    @Test
    public void testGetID() {
        bateman.setID(11);
        assertEquals( bateman.getID(), 11);

    }

    @Test
    public void testRegister(){
         bateman.register(library);
         assertEquals(bateman.getLibrary(), "newLibrary");
    }

}