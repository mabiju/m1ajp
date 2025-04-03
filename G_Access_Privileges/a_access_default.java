package G_Access_Privileges;

class Nums {
    // there is not any access specifiers keywords used, i.e. default
    int a = 89;
}

public class a_access_default {
    public static void main(String[] args) {
        Nums obj = new Nums();
        System.out.println("The value = " + obj.a);
    }
}
