import java.io.*;

public class File_5 {
    // list of all folders only
    public static void main(String[] args) {
        File f = new File("D:\\");

        File l[] = f.listFiles();

        for (int i = 1; i < l.length; i++) {
            if (l[i].isDirectory()) {
                System.out.println(l[i]);
            }
        }
    }

}
