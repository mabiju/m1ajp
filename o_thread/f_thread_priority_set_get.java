package o_thread;

public class f_thread_priority_set_get {
    public static void main(String[] args) {
        Thread t = new Thread("Hello");
        System.out.println("Thread Name = " + t.getName());
        System.out.println("Thread Priority = " + t.getPriority()); // why 5? because 5 is the default priority of a thread
    }
}

