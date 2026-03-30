package o_thread;

class ThreadDemo extends Thread {
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}
public class g_thread_priority_set_get {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        ThreadDemo t3 = new ThreadDemo();


        t1.setName("Thread One : High Priority Thread");
        t2.setName("Thread Two : Low Priority Thread");
        t3.setName("Thread Three : Normal Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
        t3.start();
    }
}

/* Java provides three constant values in the Thread class:
Thread.MIN_PRIORITY (1): Lowest possible priority for a thread.
Thread.NORM_PRIORITY (5): Default priority assigned to a thread.
Thread.MAX_PRIORITY (10): Highest possible priority for a thread.
 */
