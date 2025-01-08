class A extends Thread {
    void Run() {
        try {
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    stop();
                }
                System.out.println("The first thread : " + i);
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
            for (int i = 0; i < 5; i++) {
                System.out.println("Second thread is : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println("The exception is : " + ex);
        }
    }
}

public class Muti_3 {
    public static void main(String[] args) {
        A a = new A();
        a.start();

        System.out.println("The thread is aLive : " + a.isAlive());
        B b = new B();
        b.start();
    }
}
