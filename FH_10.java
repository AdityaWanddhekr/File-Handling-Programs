import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FH_10 {
  public static void main(String[] args) throws Exception {
    FileInputStream fi = new FileInputStream("C:\\Jethalal\\download.png");
    FileOutputStream fo = new FileOutputStream("C:\\Popatlal\\download.png");

    int data;

    while ((data = fi.read()) != -1) {
      fo.write(data);
    }
    fi.close();
    fo.close();
  }
}
