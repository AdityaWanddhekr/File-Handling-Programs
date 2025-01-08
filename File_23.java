import java.io.File;

import java.io.IOException;

public class File_23 {
  public static void main(String[] args) throws IOException {
    File f = new File("D:\\RamSita\\document.txt");

    if (f.createNewFile()) {
      System.out.println("The file is created!..");
    }
  }
}
