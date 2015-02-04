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
    /**
     * Book class constructor
     *
     * Creates a book
     */
    public BookImpl(String title, String author) {
        this.title = title;
        this.author = author;
    }
    /**
     * The book title.
     *
     * @return book title
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * The book authors.
     *
     * @return String book authors.
     */
    public String getAuthor() {
        return this.author;
    }

}
