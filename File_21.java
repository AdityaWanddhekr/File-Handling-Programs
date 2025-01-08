import java.io.File;

public class File_21 {
  // list of all files.
  public static void main(String[] args) {
    File f = new File("D:");
    File file[] = f.listFiles();
    for (int i = 0; i < file.length; i++) {
      System.out.println(file[i]);
    }
  }
}
