import java.io.FileOutputStream;
import java.io.FileInputStream;

public class File_29 {
  public static void main(String[] args) throws Exception {
    FileOutputStream fo = new FileOutputStream("D:\\RadhaKrushna\\img.jpg");
    FileInputStream fi = new FileInputStream("D:\\RamSita\\img.jpg");
    int data;

    while ((data = fi.read()) != -1) {
      fo.write(data);
    }

    fo.close();
    fi.close();
  }
}
