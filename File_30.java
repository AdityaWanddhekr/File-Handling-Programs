import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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

public class File_30 {
  public static void main(String[] args) throws Exception {
    FileOutputStream fo = new FileOutputStream("D:\\RamSita\\document.txt");
    ObjectOutputStream os = new ObjectOutputStream(fo);
    Employee e1 = new Employee(1, "Aditya", 9000000);
    os.writeObject(e1);
    os.close();
  }
}
