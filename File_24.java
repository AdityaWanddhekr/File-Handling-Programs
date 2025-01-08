import java.io.*;

public class File_24 {
  public static void main(String[] args) throws IOException {
    File f = new File("D:\\RamSita\\document.txt");
    boolean exist = f.exists();

    if (exist) {
      System.out.println("The file is exist!..");
    } else {
      if (f.createNewFile()) {
        System.out.println("The file is created!....");
      } else {
        System.out.println("Some problem is here!...");
      }
    }
  }
}
