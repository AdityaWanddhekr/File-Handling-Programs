import java.io.*;

public class File_13 {
    // read data by read fun.
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\Aditya\\Document.txt");
        int data;

        while ((data = fr.read()) != -1) {
            System.out.print((char) data);
            Thread.sleep(100);
        }
        System.out.println(data);
    }
}
