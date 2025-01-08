import java.io.File;

public class File_19 {

  // create folder.
  public static void main(String[] args) {
    File f = new File("D:\\RamSita");
    boolean mk = f.mkdirs();
    if (mk) {
      System.out.println("The folder is created!...");
    } else {
      System.out.println("some problem is here!...");
    }
  }
}
