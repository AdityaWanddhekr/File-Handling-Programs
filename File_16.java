
import java.io.*;

public class File_16 {
    // Write a Java program to read file contents and display on console.
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("C:\\Radhe\\Text.txt");
        BufferedReader b = new BufferedReader(file);
        String line = "";

        while ((line = b.readLine()) != null) {
            System.out.println(line);
            Thread.sleep(1000);
        }
        System.out.println(line);

        b.close();
    }
}