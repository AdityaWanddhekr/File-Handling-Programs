import java.io.File;

public class File_20 {
  public static void main(String[] args) {
    File f = new File("D:\\RadhaKrushna");
    boolean exist = f.exists();
    if (exist) {
      System.out.println("the folder is already exist!...");
    } else {
      if (f.mkdirs()) {
        System.out.println("The folder is created!...");
      } else {
        System.out.println("Some problem is here!...");
      }
    }
  }
}
