import java.io.*;
import java.util.*;

public class File_26 {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("D:\\RamSita\\document.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the line: ");
    String line = sc.nextLine();
    bw.write(line);
    sc.close();
    bw.close();
  }
}
