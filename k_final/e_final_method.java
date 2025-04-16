package k_final;

class Teacher {
    // public final void teach() {
    public void teach() {
        System.out.println("Teacher is teaching");
    }
}

public class e_final_method extends Teacher {
    @Override
    public void teach() {
        System.out.println("Teacher is studying");
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new e_final_method();
        e_final_method obj = new e_final_method();
        t1.teach(); // teacher is teaching
        t2.teach(); // teacher is studying
        obj.teach(); // teacher is studying
    }
}