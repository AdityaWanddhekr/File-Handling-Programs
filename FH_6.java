import java.io.FileReader;

public class FH_6 {
  // Read the data from the file.
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("C:\\Jethalal\\document.txt");

    int data;

    while ((data = fr.read()) != -1) {
      System.out.print((char) data);
      Thread.sleep(100);

    }
    System.out.print(data);
  }

}
