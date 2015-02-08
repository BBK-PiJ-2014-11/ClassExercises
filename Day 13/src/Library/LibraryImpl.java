package Library;

/**
 * Created by Ehshan on 12/01/2015.
 */
public class LibraryImpl implements Library {

    private String libraryName;
    private User newUser;
    private User firstUser;
    private int maxBooks;


    public LibraryImpl(String libraryName) {
        this.libraryName = libraryName;
        newUser = new UserImpl(libraryName);
        firstUser = new UserImpl(libraryName);
        maxBooks = 0;
    }

    public String getLibraryName() {
        return this.libraryName;
    }

    public int getID(String name) {
        if (name == null) {
            return 0;
        }else if(!checkUserName(name)){
            return 0;
        }else{
            return 1;
        }
    }

    public boolean checkUserName(String name){
        if(firstUser.getName() == name){
            return false;
        }else{
            return true;
        }
    }

    public int getMaxBooksPerUser(){
        return this.maxBooks;
    }

    public void setMaxBooksPerUser(int num){
        this.maxBooks = num;
    }

}
