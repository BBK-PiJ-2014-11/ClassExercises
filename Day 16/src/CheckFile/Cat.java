package CheckFile;

/**
 * Created by Ehshan on 02/02/2015.
 */
import java.io.*;
import java.util.Scanner;

public class Cat {

    public static void main(String[] args){
        Cat newReader = new Cat();
        newReader.getFile();
    }

    public void getFile() {
        File handle = new File("." + File.separator + getInput());
        if(handle.exists()) {
            BufferedReader reader= null;
            try {
                reader = new BufferedReader(new FileReader(handle));
                String line;
                while((line = reader.readLine())!= null) {
                    System.out.println(line);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if(reader!=null) {
                        reader.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            System.out.println("That file does not exist");
        }
    }

    public String getInput(){
        System.out.println("Which file are you looking for?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }


}
