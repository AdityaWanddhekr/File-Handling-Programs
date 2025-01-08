import java.io.*;

public class File_1 {
    // all drive space
    public static void main(String[] args) throws Exception {
        File f[] = File.listRoots();

        for (int i = 1; i <= f.length; i++) {
            long totalSpace = f[i].getTotalSpace();
            long freeSpace = f[i].getFreeSpace();
            System.out.println(
                    f[i] + " = " + totalSpace + " GB\t " + freeSpace + " GB\t" + (totalSpace - freeSpace) + " GB ");
        }
    }
}
