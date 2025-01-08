class A extends Thread {
    void Run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("First thread is " + i);
                Thread.sleep(10000);
            }
        } catch (Exception ex) {
            System.out.println("The exception is : " + ex);
        }
    }
}

class B extends Thread {
    void Run() {
        try {
            for (int i = 0; i <= 50; i++) {
                System.out.println("Second thread is : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println("The exception is : " + ex);
        }
    }
}

public class Muti_1 {
    public static void main(String[] args) throws InterruptedException {
        A a1 = new A();
        a1.start();
        B b1 = new B();
        b1.start();
    }
}
