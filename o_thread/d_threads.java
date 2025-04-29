package o_thread;

class MyClass extends Thread {
    public void run() {
        System.out.println("My thread is running.");
    }
}

public class d_threads {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Thread t = new Thread(obj);

        t.start();
    }
}
