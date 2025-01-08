import java.io.File;

public class FH_1 {
  // show all memory by file handling.
  public static void main(String[] args) throws Exception {
    File f[] = File.listRoots();

    for (int i = 0; i < f.length; i++) {
      long totalSpace = f[i].getTotalSpace();
      long freeSpace = f[i].getFreeSpace();

      System.out.println(f[i] + " : TotalSpace = " + totalSpace + " GB FreeSpace = " + freeSpace + " GB RemaingSpace = "
          + (totalSpace - freeSpace) + " GB");
    }
  }
}
