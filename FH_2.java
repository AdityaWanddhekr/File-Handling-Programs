import java.io.File;

public class FH_2 {
  // to create folder and also check th existance.
  public static void main(String[] args) throws Exception {
    File f = new File("C:\\Daya");
    boolean folder = f.exists();

    if (folder) {
      System.out.println("The folder is already exist!...");
    } else {
      if (f.mkdirs()) {
        System.out.println("The folder is created!...");
      }
    }
  }

}
