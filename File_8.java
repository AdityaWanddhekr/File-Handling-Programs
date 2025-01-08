import java.io.*;
import java.util.*;

public class File_8 {
    // Write a file.
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("D://Aditya//Document.txt", true);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content : ");
        String str = sc.nextLine();
        fw.write(str);
        fw.close();
        sc.close();
    }
}
