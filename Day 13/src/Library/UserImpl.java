package Library;

/**
 * Created by Ehshan on 12/01/2015.
 */
public class UserImpl implements User {

    private String name;
    private int ID;
    private Library library;
    /**
     * User class constructor
     *
     * Creates a User
     */
    public UserImpl(String name) {
        this.name = name;
        ID = 0;
        library = null;
    }
    /**
     * The Users name.
     *
     * @return Name as string
     */
    public String getName() {
        return this.name;
    }
    /**
     * The Users ID.
     *
     * @return User ID as string
     */
    public int getID() {
        return this.ID;
    }
    /**
     * Set the user id.
     *
     */
    public void setID(int num) {
        this.ID = num;
    }
    /**
     * Register user at a library
     *
     * @return true if the ID is correctly assigned, false otherwise (i.e. the username is already used)
     */
    public void register(Library library) {
            this.library = library;
            this.ID = library.getID(name);
    }
    /**
     * Gets the Library name for this user.
     */
    public String getLibrary() {
        if(library == null) {
            return null;
        } else {
            return library.getLibraryName();
        }
    }
}
