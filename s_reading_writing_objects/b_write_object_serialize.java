package s_reading_writing_objects;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class b_write_object_serialize {
    public static void main(String[] args) {
        try {
            a_student s1 = new a_student(120, "Ram");
            FileOutputStream fos = new FileOutputStream("D:/M1_AJP/s_reading_writing_objects/student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);

            oos.close();
            fos.close();

            System.out.println("Object written to file successfully.");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
