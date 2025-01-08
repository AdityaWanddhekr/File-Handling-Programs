class A extends Thread {
    void Run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("First thread is : " + i);
                Thread.sleep(10000);
            }
        } catch (Exception ex) {
            System.out.println("The eception is : " + ex);
        }
    }
}

class B extends Thread {
    void Run() {
        try {
            for (int i = 1; i <= 50; i++) {
                System.out.println("The second thread is : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println("Exception is : " + ex);
        }
    }
}

public class Muti_2 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.start();
        a.join();
        B b = new B();
        b.start();
    }
}
