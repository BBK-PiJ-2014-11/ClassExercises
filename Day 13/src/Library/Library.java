package Library;

/**
 * Created by Ehshan on 12/01/2015.
 */
/**
 * Interface for a Library.
 */
public interface Library {
    /**
     * Identifier of the Library
     *
     * @return Library name.
     */
    public String getLibraryName();
    /**
     * Gets the unigue user id. If No name exits, generates a new unique user ID
     *
     * @param userName the name of the user given at registration
     *
     * @return the ID number as a integer
     */
    public int getID(String userName);
    /**
     * Checks if the given username is already taken
     *
     * @param name the name of the user
     * @return true if the name is available, false if unavailable
     */
    public boolean checkUserName(String name);
    /**
     * Gets for the maximum number of books a given user can check out
     *
     * @return the number as integer
     */
    public int getMaxBooksPerUser();
    /**
     * Sets the maximum number of books a user can check out
     *
     * @param num the number as an integer
     */
    public void setMaxBooksPerUser(int num);
}
