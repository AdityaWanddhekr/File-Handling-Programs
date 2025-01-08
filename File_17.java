import java.io.*;

public class File_17 {
    // Write a Java program to read numbers from a file and write even,
    // odd and prime numbers to separate file.
    public static void main(String[] args) throws Exception {
        // create separate files.
        File e = new File("C:\\Radhe\\Even.txt");
        File o = new File("C:\\Radhe\\Odd.txt");
        File p = new File("C:\\Radhe\\Prime.txt");
        e.createNewFile();
        o.createNewFile();
        p.createNewFile();
        // read the number file.
        FileReader fr = new FileReader("C:\\Radhe\\Text.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = "";

        while ((line = br.readLine()) != null) {
            System.out.println(line);
            Thread.sleep(1000);
            // getting string in string array.
            String ch[] = line.split(",");
            int a[] = new int[ch.length];
            for (int i = 0; i < ch.length; i++) {

                a[i] = Integer.parseInt(ch[i]);
                if (a[i] % 2 == 0) {
                    FileWriter fw = new FileWriter("C:\\Radhe\\Even.txt", true);
                    fw.write((int) a[i]);
                    fw.close();
                } else if (a[i] % 2 != 0) {
                    FileWriter fw = new FileWriter("C:\\Radhe\\Odd.txt", true);
                    fw.write((int) a[i]);
                    fw.close();
                }

            }

        }
        System.out.println(line);

        br.close();

    }
}
