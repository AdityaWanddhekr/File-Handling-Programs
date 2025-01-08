import java.io.BufferedReader;
import java.io.FileReader;

public class File_28 {
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("D:\\RamSita\\document.txt");
    BufferedReader br = new BufferedReader(fr);
    String line = "";

    while ((line = br.readLine()) != null) {
      System.out.println(line);
      Thread.sleep(100);
    }
    System.out.println(line);
    br.close();
  }
}
