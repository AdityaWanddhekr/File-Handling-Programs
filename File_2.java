import java.io.*;

public class File_2 {
    // create folder
    public static void main(String[] args) {
        File f = new File("D:\\Aditya");
        boolean exist = f.exists();
        if (exist) {
            System.out.println("The folder is already exist!...");
        } else {
            boolean mk = f.mkdir();
            if (mk) {
                System.out.println("The folder is created!...");
            } else {
                System.out.println("some prolem is here!...");
            }
        }
    }
}
