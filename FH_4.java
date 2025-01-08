import java.io.File;

public class FH_4 {
  // create the file in the folder.
  public static void main(String[] args) throws Exception {
    File f = new File("C:\\Jethalal\\document.txt");
    if (f.exists()) {
      System.out.println("The file is already exist!...");
    } else {
      if (f.createNewFile()) {
        System.out.println("The file is created!...");
      }
    }
  }
}
