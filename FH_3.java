import java.io.File;

public class FH_3 {
  // The list of all files and folders in the drive.
  public static void main(String[] args) throws Exception {
    File f = new File("C:\\");
    File l[] = f.listFiles();// isFile() or isDirectory().
    for (int i = 0; i < l.length; i++) {
      if (l[i].isFile()) {
        System.out.println(l[i]);
      }
    }
  }
}
