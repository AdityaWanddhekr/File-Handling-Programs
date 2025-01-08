import javafx.scene.control.Tab;

class Table {
    void showTable(int val) {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "X" + val + "=" + i * val);
                Thread.sleep(10000);
            }
        } catch (Exception ex) {
            System.out.println("The exception is : " + ex);
        }
    }
}

class Table1 extends Thread {
    Table t;

    void setTable(Table t) {
        this.t = t;
    }

    public void Run() {
        t.showTable(2);
    }

}

class Table2 extends Thread {
    Table t;

    void setTable(Table t) {
        this.t = t;
    }

    public void Run() {
        t.showTable(3);
    }
}

public class Muti_4 {
    public static void main(String[] args) {
        Table t = new Table();

        Table1 t1 = new Table1();
        t1.setTable(t);
        t1.start();

        Table2 t2 = new Table2();
        t2.setTable(t);
        t2.start();
    }
}
