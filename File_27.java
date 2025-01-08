
import java.io.FileReader;

public class File_27 {
  // Read data from file chracterwise.
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("D:\\RamSita\\document.txt");

    int data;

    while ((data = fr.read()) != -1) {
      System.out.print((char) data);
      Thread.sleep(100);
    }
    System.out.println(data);

    fr.close();
  }
}
