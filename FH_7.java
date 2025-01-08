import java.io.BufferedReader;
import java.io.FileReader;

public class FH_7 {
  // Read the file using buffered reader.
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("C:\\Jethalal\\document.txt");
    BufferedReader br = new BufferedReader(fr);
    String data;

    while ((data = br.readLine()) != null) {
      System.out.println(data);
      Thread.sleep(100);
    }
    System.out.println(data);
  }
}
