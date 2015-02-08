package Library;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    Library testLibrary;

    @Before
    public void setUp() {
        testLibrary = new LibraryImpl("Test Library");
    }

    @After
    public void tearDown() {
        testLibrary = null;
    }

    @Test
    public void testGetLibraryName() {
        assertEquals(testLibrary.getLibraryName(), "Test Library");
    }

    @Test
    public void testGetID() {
        assertEquals(testLibrary.getID("Patrick Bateman"), 1);
    }

    @Test
    public void testCheckUserName() {
        assertEquals(testLibrary.checkUserName("Patrick Bateman"), true);
    }

    @Test
    public void testMaxBooksPerUser() {
        testLibrary.setMaxBooksPerUser(5);
        assertEquals(testLibrary.getMaxBooksPerUser(), 5);
    }

}