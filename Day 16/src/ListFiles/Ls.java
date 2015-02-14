package ListFiles;
/**
 * Created by Ehshan on 02/02/2015.
 */
import java.io.*;
public class Ls {
    public static void main(String[] args){
        File handle = new File("C:/Users/Ehshan/Dropbox/_CS/PIJ/ClassExercises/Day16");
        if (handle.isDirectory()) {
            for (int i = 0; i < handle.list().length; i++) {
                String[] list = handle.list();
                for (int j = 0; j < list.length; j++){
                    String s = list[j];
                    System.out.println(s);
                }
                return;
            }
        }else{
            System.out.println("Directory does not exist");
        }
    }
}
