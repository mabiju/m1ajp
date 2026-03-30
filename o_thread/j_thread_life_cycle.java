package o_thread;

class ThreadLife extends Thread {
    private String threadName;

    ThreadLife(String name) {
        threadName = name;
        System.out.println("Thread: " + threadName + " is in NEW state.");
    }

    @Override
    public void run() {
        System.out.println("Thread: " + threadName + " is in RUNNING state.");
        try {
            for (int i = 3; i > 0; i--) {
                System.out.println("Thread: " + threadName + " is performing task " + i);
                System.out.println("Thread: " + threadName + " is in WAITING state.");
                Thread.sleep(1000); // Simulates waiting state
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + threadName + " was interrupted.");
        }
        System.out.println("Thread: " + threadName + " is in TERMINATED state.");
    }

    @Override
    public void start() {
        System.out.println("Thread: " + threadName + " is in RUNNABLE state.");
        super.start();
    }
}

public class j_thread_life_cycle {
    public static void main(String[] args) {
        ThreadLife t1 = new ThreadLife("Thread-1");
        ThreadLife t2 = new ThreadLife("Thread-2");

        t1.start();
        t2.start();
    }
}
