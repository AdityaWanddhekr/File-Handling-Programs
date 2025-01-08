import java.io.File;

public class File_18 {
  public static void main(String[] args) throws Exception {

    File f[] = File.listRoots();

    for (int i = 0; i <= f.length; i++) {
      long totatSpace = f[i].getTotalSpace();
      long freeSpace = f[i].getFreeSpace();
      long remainingSpace = totatSpace - freeSpace;

      System.out.println(
          f[i] + ":" + totatSpace + " GB/n" + f[i] + ":" + freeSpace + " GB/n" + f[i] + ":" + remainingSpace + "GB");

    }
  }
}
