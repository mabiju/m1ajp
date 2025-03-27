package D_Array;

public class i_arrary_sin_dim_string {
    public static void main(String[] args) {
        String[] names = {"Ram", "Sita", "Hari", "Gita", "Nita", "Mina", "Tina"};
        System.out.println(names[4]); // Nita

        /* for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        } */

        for (String name : names) {
            System.out.println(name);
        }
    }
}
