package o_thread;

// public class a_threads extends Thread
public class a_threads {
    public static void main(String[] args) {
        Thread t1 = new Thread("Ram");
        Thread t2 = new Thread("Sita");

        t1.start();
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}
