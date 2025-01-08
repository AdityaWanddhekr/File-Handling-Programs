import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Employee implements Serializable {
  int id;
  String name;
  int sal;

  Employee(int id, String name, int sal) {
    this.id = id;
    this.name = name;
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
}

public class File_31 {
  public static void main(String[] args) throws Exception {
    FileInputStream fi = new FileInputStream("D:\\RamSita\\document.txt");
    ObjectInputStream o = new ObjectInputStream(fi);
    Employee e = (Employee) o.readObject();
    System.out.println("Id = " + e.getId() + "name = " + e.getName() + "sal = " + e.getSal());
    o.close();
  }
}
