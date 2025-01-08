import java.io.*;

public class File_4 {
    // list of all folder and files.
    public static void main(String[] args) {
        File f = new File("D:\\");
        File file[] = f.listFiles();
        for (int i = 1; i <= file.length; i++) {
            System.out.println(file[i]);
        }
    }
}
