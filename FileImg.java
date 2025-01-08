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

  String getNmae() {
    return name;
  }

  int getSal() {
    return sal;
  }

  public String toString() {
    return id + "," + name + "," + sal;
  }
}

public class FileImg {
  public static void main(String[] args) throws Exception {
    // FileOutputStream fi = new FileOutputStream("C://Aditya//Text.txt");
    // ObjectOutputStream oi = new ObjectOutputStream(fi);

    // Employee e = new Employee();
    // e.setId(1);
    // e.setName("Aditya");
    // e.setSal(900000);

    // oi.writeObject(e);

    FileInputStream fi = new FileInputStream("C://Aditya//Text.txt");
    ObjectInputStream oi = new ObjectInputStream(fi);

    Employee e = (Employee) oi.readObject();

    System.out.println(e.getId() + "," + e.getNmae() + "," + e.getSal());

  }
}