import java.io.*;
import java.util.*;

public class File_25 {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("D:\\RamSita\\document.txt",true);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the line : ");
    String line = sc.nextLine();
    fw.write(line);
    sc.close();
    fw.close();
  }
}
