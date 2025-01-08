import java.io.*;
import java.util.*;

public class File_11 {
    public static void main(String[] args) throws IOException {
        File f = new File("c:\\Aditya\\document.txt");

        Scanner sc = new Scanner(f);
        String line = "";
        if (sc.hasNextLine()) {
            line = sc.nextLine();
        }
        System.out.println(line);

        FileWriter file = new FileWriter("c:\\Aditya\\document.txt");
        file.write(line + "and in the document file.");
        file.close();
        sc.close();
    }
}
