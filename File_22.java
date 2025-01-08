import java.io.File;

public class File_22 {
  public static void main(String args[]) {
    File f = new File("D:\\");

    File l[] = f.listFiles();
    for (int i = 0; i < l.length; i++) {
      if (l[i].isFile()) {
        System.out.println(l[i]);
      }
    }
  }
}
