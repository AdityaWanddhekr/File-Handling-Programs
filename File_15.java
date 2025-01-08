import java.io.*;
import java.util.*;

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

public class File_15 {
    // serialization.
    public static void main(String[] args) throws IOException {
        FileOutputStream fw = new FileOutputStream("D:\\Aditya\\Document.txt");
        ObjectOutputStream o = new ObjectOutputStream(fw);

        Employee e1 = new Employee(1, "Aditya", 90000);
        Employee e2 = new Employee(2, "Akash", 78900);
        Employee e3 = new Employee(3, "Vijay", 97655);
        Employee e4 = new Employee(4, "Amit", 30000);
        Employee e5 = new Employee(5, "Ram", 100000);

        o.writeObject(e1);
        o.writeObject(e2);
        o.writeObject(e3);
        o.writeObject(e4);
        o.writeObject(e5);

    }
}