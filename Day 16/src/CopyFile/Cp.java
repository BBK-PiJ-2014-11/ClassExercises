package CopyFile;

/**
 * Created by Ehshan on 02/02/2015.
 */
import java.io.*;
import java.util.Scanner;

public class Cp {

    public static void main(String[] args){
        Cp newCopier = new Cp();
        newCopier.copy();
    }

    public void copy(){
        Scanner scanner = new Scanner(System.in);
        File oldFile = null;
        File newFile  = null;
        BufferedReader in = null;
        BufferedReader br = null;
        PrintWriter out = null;
        try {
             oldFile = new File(getInput(scanner));
             newFile  = new File(getInput(scanner));
            if (oldFile.exists()) {
                 /*
                in = new BufferedReader(new FileReader(oldFile));
                out = new PrintWriter(newFile);
                String line;
                */
                FileInputStream fStream = new FileInputStream(newFile);
                //br = new BufferedReader(new InputStreamReader(fStream));
                FileWriter fw= new FileWriter(oldFile, true);
                BufferedWriter output = new BufferedWriter(fw);
                String line;
                while ((line = in.readLine()) != null) {
                    output.write(line);
                    output.newLine();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + oldFile + " not found.");
        } catch (IOException ex){
            ex.printStackTrace();
        } catch(NullPointerException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("File " + oldFile + " has been copied");
            closeReader(in);
        }
    }

    public String getInput(Scanner scanner){
        System.out.println("Which file are you looking for?");
        String s = scanner.nextLine();
        return s;
    }

    public boolean writeChecker(File oldFile, File newFile){
        System.out.println("File " + newFile + " already exists. Would you like to overwrite? Yes or No");
        String input = System.console().readLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            //System.out.println("Are you sure you want to overwrite" + newFile);//not necessary
            return true;
        } else if (input.equals("n") || input.equals("N")){
            return false;
        } else {
            System.out.println("Invalid Input...try again");
            writeChecker(oldFile, newFile);
        }
        return false;
    }

    public void closeReader(Reader reader){
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}

