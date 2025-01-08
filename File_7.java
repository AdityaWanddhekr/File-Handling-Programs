import java.io.*;

public class File_7 {
    // create new file
    public static void main(String[] args) throws IOException {
        File f = new File("D://Aditya//document.txt");
        if (f.createNewFile()) {
            System.out.println("File is created!...");
        }
    }
}
