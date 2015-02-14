package MakeDir;

/**
 * Created by Ehshan on 02/02/2015.
 */
import java.io.*;
public class Mkdir {
    public static void main(String[] args){
        File handle = new File ("C:/Users/Ehshan/Dropbox/_CS/PIJ/ClassExercises/Day16");
        if (handle.isDirectory()) {
            System.out.println("Enter new directory name");
            //String fileName = System.console().readLine();
            //args[0] = "text";
            File dir = new File(handle+args[0]);
            dir.mkdir();
        }else{
            System.out.println("Directory does not exist");
        }
        /* IGNORE THIS
        for(int i = 0; i<args.length; i++){
            System.out.println("args strings");
            System.out.println(args[i]);
        }
        */
    }
}
