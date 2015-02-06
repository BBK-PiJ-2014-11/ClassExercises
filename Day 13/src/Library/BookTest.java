package Library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    private Book newBook;

    @Before
    public void setUp(){
        newBook = new BookImpl("American Psycho", "Bret Easton Ellis");
    }

    @After
    public void tearDown(){
        newBook = null;
    }

    @Test
    public void testGetTitle(){
        assertEquals(newBook.getTitle(), "American Psycho");
    }

    @Test
    public void testGetAuthor(){
        assertEquals(newBook.getAuthor(), "Bret Easton Ellis");
    }
}
