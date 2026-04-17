package s_reading_writing_objects;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class c_reading_object_deserialize {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/M1_AJP/s_reading_writing_objects/student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            a_student s = (a_student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
