package m_final_modifiers;

public class a_final_variable {

    final int a = 89;

    public void displayData() {
        System.out.println("The value = " + a);
    }

    public static void main(String[] args) {
        a_final_variable obj = new a_final_variable();
        obj.displayData();
    
    }
}
