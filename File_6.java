import java.io.*;

public class File_6 {
    // list of all files only
    public static void main(String[] args) {
        File f = new File("C:\\");

        File l[] = f.listFiles();

        for (int i = 1; i < l.length; i++) {
            if (l[i].isFile()) {
                System.out.println(l[i]);
            }
        }
    }
}
