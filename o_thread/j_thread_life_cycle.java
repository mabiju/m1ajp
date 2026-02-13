package o_thread;

public class j_thread_life_cycle extends Thread {
    public void run() {
        System.out.println("Thread is in RUNNABLE state (run() started)");
        try {
            System.out.println("Thread entering TIMED WAITING state (sleeping for 5 second)");
            Thread.sleep(5000); // Thread enters TIMED_WAITING state
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted during sleep");
        }
        System.out.println("Thread is RUNNING again after sleep");
        System.out.println("Thread is TERMINATED (run() completed)");
    }

    public static void main(String[] args) {
        j_thread_life_cycle t = new j_thread_life_cycle();
        System.out.println("Thread is in NEW state (object created)");
        t.start(); // Thread moves to RUNNABLE state
    }
}
