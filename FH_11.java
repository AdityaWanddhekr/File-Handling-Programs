import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
  int id;
  String name;
  int sal;

  void setId(int id) {
    this.id = id;
  }

  void setName(String name) {
    this.name = name;
  }

  void setSal(int sal) {
    this.sal = sal;
  }

  int getId() {
    return id;
  }

  String getName() {
    return name;
  }

  int getSal() {
    return sal;

  }

  public String toString() {
    return id + "," + name + "," + sal;
  }
}

public class FH_11 {
  public static void main(String[] args) throws Exception {
    File f = new File("C:\\Popatlal\\document.txt");
    if (f.createNewFile()) {
      System.out.print("File is created!...");
    }

    FileInputStream fo = new FileInputStream("C:\\Popatlal\\document.txt");
    ObjectInputStream oo = new ObjectInputStream(fo);

    Employee e = (Employee) oo.readObject();
    System.out.println(e.getId() + "," + e.getName() + "," + e.getSal());
  }
}
