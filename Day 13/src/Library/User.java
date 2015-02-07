package Library;

/**
 * Created by Ehshan on 12/01/2015.
 /**
 * Interface for Library Users
 *
 * Users are assigned a unique ID number when registering at a library
 */
public interface User {
    /**
     * Gets the name of the user
     *
     * @return the name of the user.
     */
    public String getName();
    /**
     * Gets the users library id
     *
     * @return the id of reinvent user
     */
    public int getID();
    /**
     * Sets the library-ID of a given user
     *
     * @param num the number to be assigned
     */
    public void setID(int num);
    /**
     * Registers the user at a library.
     *
     * @param library the library
     */
    public void register(Library library);
    /**
     * Gets the name of the Library being used for registration.
     *
     * @return the library
     */
    public String getLibrary();
}
