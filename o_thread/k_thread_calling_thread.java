package o_thread;

public class k_thread_calling_thread {
    public void call(String msg)
    {
        System.out.print("The messege is : [" + msg);
        try {
            System.out.println("]");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrrupted...");
        }
    }
    public static void main(String[] args) {
        k_thread_calling_thread obj = new k_thread_calling_thread();
        obj.call("Hello Sanothimi");
        System.out.print("This runs after executing thread and function.");
    }
}
