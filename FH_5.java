import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

public class FH_5 {
  // Write the file.
  public static void main(String[] args) throws Exception {
    // FileWriter f = new FileWriter("C:\\Jethalal\\document.txt");
    // Scanner sc = new Scanner(System.in);
    // String line = sc.nextLine();
    // f.write(line);
    // sc.close();
    // f.close();

    FileWriter fw = new FileWriter("C:\\Jethalal\\document.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    System.out.println("Enter the line : ");
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    bw.write(line);
    sc.close();
    bw.close();
  }
}
