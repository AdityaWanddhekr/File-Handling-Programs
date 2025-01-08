import java.io.*;

public class File_14 {

    public static void main(String[] args) throws Exception {
        FileInputStream fr = new FileInputStream("D:\\Aditya\\shiva.jpg");
        FileOutputStream fw = new FileOutputStream("D:\\Akash\\shiva.jpg");

        int data;
        while ((data = fr.read()) != -1) {
            fw.write(data);
        }
        fw.close();
        fr.close();
    }
}
