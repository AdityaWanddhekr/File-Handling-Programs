import java.util.*;

class Table {
    synchronized void showTable(int val) {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "X" + val + "=" + i * val);
                if (i == 5) {
                    wait();
                }
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println("The exception is : " + ex);
        }
    }

    synchronized void rejoin() {
        try {
            notifyAll();
        } catch (Exception ex) {
            System.out.println("Exception is : " + ex);
        }
    }
}

class Table1 extends Thread {
    Table table;

    void setTable(Table t) {
        table = t;
    }

    public void Run() {
        table.showTable(2);
    }
}

class Table2 extends Thread {
    Table table;

    void setTable(Table t) {
        table = t;
    }

    public void Run() {
        table.showTable(3);
    }
}

public class Muti_5 {
    public static void main(String x[]) {
        Table t = new Table();
        Table1 t1 = new Table1();
        t1.setTable(t);
        t.showTable(2);
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);

        Table2 t2 = new Table2();
        t2.setTable(t);
        t.showTable(3);
        t2.start();
        t2.setPriority(Thread.MIN_PRIORITY);

        do {
            System.out.println("Enter the msg : ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            if (str == "rejoin") {
                t.rejoin();
            }
        } while (true);
    }
}
