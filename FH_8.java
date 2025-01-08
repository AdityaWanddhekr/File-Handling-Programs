import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FH_8 {
  // read the img from folder and write to the another.
  public static void main(String[] args) throws Exception {
    FileInputStream fi = new FileInputStream("C:\\Jethalal\\jetha.jpg");
    FileOutputStream fo = new FileOutputStream("C:\\Daya\\jetha.jpg");

    int data;

    while ((data = fi.read()) != -1) {
      fo.write(data);
      Thread.sleep(100);
    }
    fi.close();
    fo.close();
  }
}
