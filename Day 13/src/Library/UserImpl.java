package Library;

/**
 * Created by Ehshan on 12/01/2015.
 */
public class UserImpl implements User {

    private String name;
    private Library library;
    /**
     * User class constructor
     *
     * Creates a User
     */
    public UserImpl(String name) {
        this.name = name;
        library = null;
    }
    /**
     * The Users name.
     *
     * @return Name as string
     */
    public String getName() {
        return name;
    }
    /**
     * The Users ID.
     *
     * @return User ID as string
     */
    public int getID() {
        return library.getID(name);
    }
    /**
     * Set the user id.
     *
     * @return true if the ID is correctly assigned, false otherwise (i.e. the username is already used)
     */
    public boolean setID(Library library) {
        if (library.checkUserName(name)){
            return false;
        } else {
            library.getID(name);
            return true;
        }
    }
    /**
     * Register user at a library
     *
     * @return true if the ID is correctly assigned, false otherwise (i.e. the username is already used)
     */
    public void register(Library library) {
            this.library = library;
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
