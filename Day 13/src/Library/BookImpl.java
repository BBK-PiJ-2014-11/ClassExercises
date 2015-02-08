package Library;

/**
 * Created by Ehshan on 12/01/2015.
 */
/**
 * Implementation of a Book
 */
public class BookImpl implements Book {

    private String title;
    private String author;
    private boolean taken;

    /**
     * Book class constructor
     *
     * Creates a book
     */
    public BookImpl(String title, String author) {
        this.title = title;
        this.author = author;
        this.taken = false;
    }
    /**
     * The book title
     *
     * @return book title
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * The book authors.
     *
     * @return String book authors
     */
    public String getAuthor() {
        return this.author;
    }
    /**
     * Checks book availability
     *
     * @return true if taken false if available
     */
    public boolean isTaken() {
        return this.taken;
    }
    /**
     *  Sets the book as taken or not taken
     *
     * @param taken if borrowed
     */
    public void setTaken(boolean taken) {
        this.taken = taken;
    }
}
