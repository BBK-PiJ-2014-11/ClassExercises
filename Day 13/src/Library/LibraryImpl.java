package Library;

import java.util.*;

/**
 * Created by Ehshan on 12/01/2015.
 */
public class LibraryImpl implements Library {

    private String libraryName;
    private int maxBooks;
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public LibraryImpl(String libraryName) {
        this.libraryName = libraryName;
        this.maxBooks = 0;
        this.books = new ArrayList<Book>();
        this.users = new ArrayList<User>();;
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
            return 1;// users.size()
        }
    }

    public boolean checkUserName(String name) {
        for (int i = 0; i < users.size(); i++) {
            User thisUser = users.get(i);
            if (thisUser.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    public int getMaxBooksPerUser(){
        return this.maxBooks;
    }

    public void setMaxBooksPerUser(int num){
        this.maxBooks = num;
    }

    public int getReaderCount() {
        return this.users.size();
    }

    public int getBookCount() {
        return this.books.size();
    }

    public int getBookBorrowedCount() {
        int count = 0;
        for (int i = 0; i< books.size(); i++) {
            Book thisBook  = books.get(i);
            if (thisBook.isTaken()){
                count++;
            }
        }
        return count;
    }

}
