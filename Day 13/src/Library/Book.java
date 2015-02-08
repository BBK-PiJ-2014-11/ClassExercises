package Library;

/**
 * Created by Ehshan on 12/01/2015.
 */
/**
 * Interface for Books.
 */
public interface Book {
    /**
     * Gets title of the Book
     *
     * @return	the book's title as a String
     */
    public String getTitle();
    /**
     * Gets the author of the Book
     *
     * @return the author's name as a String
     */
    public String getAuthor();
    /**
     * Checks is the book has been taken
     *
     * @return true if taken false if available
     */
    boolean isTaken();
    /**
     * Sets the book as taken
     */
    void setTaken(boolean taken);
}