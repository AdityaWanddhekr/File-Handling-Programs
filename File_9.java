import java.io.*;
import java.util.*;

public class File_9 {
    // Read a file
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Aditya\\Document.txt");
        BufferedReader br = new BufferedReader(fr);
        String data;
        while ((data = br.readLine()) != null) {
            System.out.println(data);

        }
        System.out.println(data);

    }
}
