import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
  int roll;
  String name;
  int mark;

  void setRoll(int roll) {
    this.roll = roll;
  }

  void setName(String name) {
    this.name = name;
  }

  void setMark(int mark) {
    this.mark = mark;
  }

  int getRoll() {
    return roll;
  }

  String getName() {
    return name;
  }

  int getMark() {
    return mark;
  }

  public String toString() {
    return roll + "," + name + "," + mark;
  }
}

public class FH_9 {
  // file write of userdefile object.
  public static void main(String[] args) throws Exception {
    FileInputStream fi = new FileInputStream("C:\\Jethalal\\document.txt");
    ObjectInputStream os = new ObjectInputStream(fi);

    Student e = (Student) os.readObject();
    System.out.println(e.getRoll() + "," + e.getName() + "," + e.getMark());
    os.close();
  }
}
